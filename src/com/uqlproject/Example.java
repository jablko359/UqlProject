package com.uqlproject;


import gen.UqlLexer;
import gen.UqlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.BitSet;


public class Example {

    public static void main(String[] args) throws IOException {
        // write your code here
//        String test = "Track in ['df','fdsf'] and (Size = 32 or Genre = 'aaa') return Track sort ascending by Track;\n" +
//                "Genre in ['df','fdsf'] and (Size = 32 or Genre = 'aaa') return Size sort ascending by Track;";
        String test = "dasdasd;";
        CharStream stream = new ANTLRInputStream(test);
        UqlLexer lex = new UqlLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        UqlParser parser = new UqlParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                throw new ParseCancellationException("line " + i + ":" + i1 + " " + s);
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

            }
        });
        UqlParser.QueriesContext context = null;
        try {
            context = parser.queries();
        } catch (ParseCancellationException re) {
            System.out.print(re.getMessage());
        }

        ParseTreeWalker walker = new ParseTreeWalker();
        QuerryInterpreter listener = new QuerryInterpreter();
        walker.walk(listener,context);
        System.out.print(listener.getSql());
    }
}
