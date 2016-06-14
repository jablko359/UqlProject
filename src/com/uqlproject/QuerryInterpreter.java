package com.uqlproject;

/**
 * Created by Igor on 2016-05-27.
 */

import gen.UqlListener;
import gen.UqlParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class QuerryInterpreter implements UqlListener {

    private StringBuilder querryBuilder;
    private StringBuilder selectBuilder;

    private static final String SELECT_QUERY = "SELECT";
    private static final String JOIN_QUERY =
            "LEFT JOIN \"MediaType\" ON \"Track\".\"MediaTypeId\" = \"MediaType\".\"MediaTypeId\"\n" +
            "LEFT JOIN \"Genre\" ON \"Track\".\"GenreId\" = \"Genre\".\"GenreId\"\n" +
            "LEFT JOIN \"Album\" ON \"Track\".\"AlbumId\" = \"Album\".\"AlbumId\"\n" +
            "LEFT JOIN \"Artist\" ON \"Album\".\"ArtistId\" = \"Artist\".\"ArtistId\"";
    private static final String BASE_TABLE = "FROM \"Track\"";
    private static final String ASCENDING_UQL_TEXT = "ascending";
    private static final String DESCENDING_UQL_TEXT = "descending";
    private static final String ASCENDING_SQL_TEXT = "ASC";
    private static final String DESCENDING_SQL_TEXT = "DESC";

    private static final String ORDER_SQL_TEXT = " ORDER BY";

    private ColumnHelper columnHelper = new ColumnHelper();

    private List<String> queries;

    public QuerryInterpreter(){

    }

    @Override
    public void enterQueries(UqlParser.QueriesContext ctx) {
        queries = new ArrayList<>();
    }

    @Override
    public void exitQueries(UqlParser.QueriesContext ctx) {

    }

    @Override
    public void enterReturnquery(UqlParser.ReturnqueryContext ctx) {
       querryBuilder = new StringBuilder();
       selectBuilder = new StringBuilder();
       selectBuilder.append(SELECT_QUERY);
       selectBuilder.append(' ');
    }

    @Override
    public void exitReturnquery(UqlParser.ReturnqueryContext ctx) {
        selectBuilder.append(' ');
        querryBuilder.append(ctx.ENDTOKEN().getText());
        queries.add(selectBuilder.toString() + JOIN_QUERY + " WHERE " + querryBuilder.toString());
    }

    @Override
    public void enterQuery(UqlParser.QueryContext ctx) {
        if(ctx.LEFTBRACKET() != null){
            querryBuilder.append(ctx.LEFTBRACKET().getText());
        }
    }

    @Override
    public void exitQuery(UqlParser.QueryContext ctx) {
        if(ctx.RIGHTBRACKET() != null){
            querryBuilder.append(ctx.RIGHTBRACKET().getText());
        }
    }

    @Override
    public void enterLogic(UqlParser.LogicContext ctx) {
        if(ctx.LOGIC() != null){
            querryBuilder.append(' ');
            querryBuilder.append(ctx.LOGIC().getText());
            querryBuilder.append(' ');
        }
    }

    @Override
    public void exitLogic(UqlParser.LogicContext ctx) {

    }

    @Override
    public void enterExpression(UqlParser.ExpressionContext ctx) {


        if(ctx.STRINGKEYWORD() != null){
            querryBuilder.append(columnHelper.getColumn(ctx.STRINGKEYWORD().getText()));
        }
        else if(ctx.NUMERICKEYWORD() != null){
            querryBuilder.append(columnHelper.getColumn(ctx.NUMERICKEYWORD().getText()));
        }
        querryBuilder.append(' ');
        if(ctx.EQUALS() != null){
            querryBuilder.append(ctx.EQUALS().getText());
        }
        else if(ctx.STRINGOPERATOR() != null){
            querryBuilder.append(ctx.STRINGOPERATOR().getText());
        }
        else if(ctx.NUMERICKEYWORD() != null){
            querryBuilder.append(ctx.NUMERICKEYWORD().getText());
        }
        else if(ctx.ARRAYOPERATOR() != null){
            querryBuilder.append(ctx.ARRAYOPERATOR().getText());
        }
        querryBuilder.append(' ');
        if(ctx.STRING() != null){
            querryBuilder.append(ctx.STRING().getText());
        }
        else if(ctx.NUMBER() != null){
            querryBuilder.append(ctx.NUMBER().getText());
        }
    }

    @Override
    public void exitExpression(UqlParser.ExpressionContext ctx) {

    }

    @Override
    public void enterTablearray(UqlParser.TablearrayContext ctx) {
        if(ctx.ALLSELECTOR() != null){
            List<String> columns = columnHelper.getAllColumnsWithLabels();
            for (int i = 0; i < columns.size(); i++){
                selectBuilder.append(columns.get(i));
                if(i != columns.size() - 1){
                    selectBuilder.append(',');
                }
            }
        }
        else {
            for(int i = 0; i < ctx.STRINGKEYWORD().size();i++ ){
                selectBuilder.append(columnHelper.getColumnWithLabel(ctx.STRINGKEYWORD(i).getText()));
                if(i != ctx.STRINGKEYWORD().size() - 1){
                    selectBuilder.append(',');
                }
            }
        }
        selectBuilder.append(' ');
        selectBuilder.append(BASE_TABLE);
    }

    @Override
    public void exitTablearray(UqlParser.TablearrayContext ctx) {

    }

    @Override
    public void enterNumericarray(UqlParser.NumericarrayContext ctx) {
        querryBuilder.append('(');
        for(int i = 0; i < ctx.NUMBER().size();i++){
            querryBuilder.append(ctx.NUMBER(i));
            if(i != ctx.NUMBER().size() - 1){
                querryBuilder.append(',');
            }
        }
        querryBuilder.append(')');
    }

    @Override
    public void exitNumericarray(UqlParser.NumericarrayContext ctx) {

    }

    @Override
    public void enterStringarray(UqlParser.StringarrayContext ctx) {
        querryBuilder.append('(');
        for(int i = 0; i < ctx.STRING().size();i++){
            querryBuilder.append(ctx.STRING(i));
            if(i != ctx.STRING().size() - 1){
                querryBuilder.append(',');
            }
        }
        querryBuilder.append(')');
    }

    @Override
    public void exitStringarray(UqlParser.StringarrayContext ctx) {

    }

    @Override
    public void enterSortexpression(UqlParser.SortexpressionContext ctx) {

        querryBuilder.append(ORDER_SQL_TEXT);
        querryBuilder.append(' ');
        String column = "";
        if(ctx.NUMERICKEYWORD() != null){
            column = ctx.NUMERICKEYWORD().getText();
        }
        else if(ctx.STRINGKEYWORD() != null){
            column = ctx.STRINGKEYWORD().getText();
        }
        querryBuilder.append(columnHelper.getColumn(column));
        querryBuilder.append(' ');
        String direction = ctx.SORTDIRECTION().getText();
        if(direction.equals(ASCENDING_UQL_TEXT)){
            querryBuilder.append(ASCENDING_SQL_TEXT);
        }
        else if(direction.equals(DESCENDING_UQL_TEXT)){
            querryBuilder.append(DESCENDING_SQL_TEXT);
        }

    }

    @Override
    public void exitSortexpression(UqlParser.SortexpressionContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    public List<String> getSqlQueries(){
        return queries;
    }

    public String getSql(){
        StringBuilder queriesBuidler = new StringBuilder();
        for (String query : queries){
            queriesBuidler.append(query + "\n");
        }
        String sql = queriesBuidler.toString();
        return sql;
    }
}
