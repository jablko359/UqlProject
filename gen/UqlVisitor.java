// Generated from D:/szko³a/4rok/Kompilator/java\Uql.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UqlParser#queries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueries(UqlParser.QueriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#returnquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnquery(UqlParser.ReturnqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#tablearray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablearray(UqlParser.TablearrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#numericarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericarray(UqlParser.NumericarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#stringarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringarray(UqlParser.StringarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link UqlParser#sortexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortexpression(UqlParser.SortexpressionContext ctx);
}