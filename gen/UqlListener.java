// Generated from D:/szko³a/4rok/Kompilator/java\Uql.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UqlParser}.
 */
public interface UqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UqlParser#queries}.
	 * @param ctx the parse tree
	 */
	void enterQueries(UqlParser.QueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#queries}.
	 * @param ctx the parse tree
	 */
	void exitQueries(UqlParser.QueriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#returnquery}.
	 * @param ctx the parse tree
	 */
	void enterReturnquery(UqlParser.ReturnqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#returnquery}.
	 * @param ctx the parse tree
	 */
	void exitReturnquery(UqlParser.ReturnqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#tablearray}.
	 * @param ctx the parse tree
	 */
	void enterTablearray(UqlParser.TablearrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#tablearray}.
	 * @param ctx the parse tree
	 */
	void exitTablearray(UqlParser.TablearrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#numericarray}.
	 * @param ctx the parse tree
	 */
	void enterNumericarray(UqlParser.NumericarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#numericarray}.
	 * @param ctx the parse tree
	 */
	void exitNumericarray(UqlParser.NumericarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#stringarray}.
	 * @param ctx the parse tree
	 */
	void enterStringarray(UqlParser.StringarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#stringarray}.
	 * @param ctx the parse tree
	 */
	void exitStringarray(UqlParser.StringarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UqlParser#sortexpression}.
	 * @param ctx the parse tree
	 */
	void enterSortexpression(UqlParser.SortexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UqlParser#sortexpression}.
	 * @param ctx the parse tree
	 */
	void exitSortexpression(UqlParser.SortexpressionContext ctx);
}