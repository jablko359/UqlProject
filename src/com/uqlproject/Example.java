package com.uqlproject;


import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.IOException;


public class Example {

    public static void main(String[] args) throws IOException {
        // write your code here
        String test = "Track in ['df','fdsf'] and (Size = 32 or Genre = 'aaa') return Track sort ascending by Track; \n" +
                "Genre in ['df','fdsf'] and (Size = 32 or Genre = 'aaa') return Size sort ascending by Track;";
        CharStream stream = new ANTLRInputStream(test);
        UqlLexer lex = new UqlLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        UqlParser parser = new UqlParser(tokens);
        UqlParser.QueriesContext context = parser.queries();

        ParseTreeWalker walker = new ParseTreeWalker();
        QuerryInterpreter listener = new QuerryInterpreter();
        walker.walk(listener,context);
        System.out.print(listener.getSql());
    }
}
