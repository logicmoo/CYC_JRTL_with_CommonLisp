package SxxMachine;

import static SxxMachine.pterm.TermData.S;

import java.io.IOException;
import java.io.Reader;

import SxxMachine.pterm.Clause;
import SxxMachine.pterm.Parser;

/**
 * Builds Fluents from Java Streams
 */
public class ClauseReader extends CharReader {
    protected Parser parser;

    public ClauseReader(Reader reader, Prog p) {
        super(reader, p);
        make_parser("from shared reader");
    }

    public ClauseReader(String f, Prog p) {
        super(f, p);
        make_parser(f);
    }

    public ClauseReader(Prog p) {
        super(p);
        make_parser("standard input");
    }

    /**
     * parses from a string representation of a term
     */
    public ClauseReader(Term t, Prog p) {
        super(t, p);
        make_parser("string parser");
    }

    void make_parser(String f) {
        if (null != reader)
            try {
                this.parser = new Parser(reader);
            } catch (IOException e) {
                IO.errmes("unable to build parser for: " + f);
            }
        else
            this.parser = null;
    }

    @Override
    public Term getElement() {
        Clause C = null;
        if (// IO.peer!=null &&
        reader.equals(IO.input)) {
            String s = IO.promptln(">:");
            if (null == s || 0 == s.length())
                C = null;
            else
                C = new Clause(s);
        } else if (null != parser) {
            if (parser.atEOF()) {
                C = null;
                stop();
            } else
                C = parser.readClause();
            if (C != null && C.getHead().equalsTerm(Prolog.anEof)) {
                C = null;
                stop();
            }
        }
        return extract_info(C);
    }

    static Term extract_info(Clause C) {
        if (null == C)
            return null;
        Term Vs = C.varsOf();
        Clause SuperC = new Clause(Vs, C);
        SuperC.dict = C.dict;
        Clause NamedSuperC = SuperC.cnumbervars(false);
        Term Ns = NamedSuperC.getHead();
        Term NamedC = NamedSuperC.getBody();
        return S("clause", C, Vs, NamedC, Ns);
    }

    @Override
    public void stop() {
        super.stop();
        parser = null;
    }
}
