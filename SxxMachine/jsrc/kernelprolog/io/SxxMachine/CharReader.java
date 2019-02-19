package SxxMachine;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import SxxMachine.pterm.Source;
import SxxMachine.pterm.TermData;

/**
 * Builds Fluents from Java Streams
 */
public class CharReader extends Source {

    @Override
    public CharReader toValue() {
        return this;
    }

    @Override
    public boolean isCharReader() {
        return true;
    }

    public Reader reader;

    public CharReader(Reader reader, Prog p) {
        super(p);
        this.reader = reader;
    }

    public CharReader(String f, Prog p) {
        super(p);
        makeReader(f);
    }

    public CharReader(Term t, Prog p) {
        super(p);
        this.reader = new StringReader(t.pprint());
    }

    public CharReader(Prog p) {
        this(IO.input, p);
    }

    protected void makeReader(String f) {
        this.reader = IO.url_or_file(f);
    }

    @Override
    public Term getElement() {
        if (IO.input == reader) {
            String s = IO.promptln(">:");
            if (null == s || s.length() == 0)
                return null;
            return TermData.SYM(s);
        }

        if (null == reader)
            return null;
        int c = -1;
        try {
            c = reader.read();
        } catch (IOException e) {
        }
        if (-1 == c) {
            stop();
            return null;
        } else
            return TermData.Long(c);
    }

    @Override
    public void stop() {
        if (null != reader && IO.input != reader) {
            try {
                reader.close();
            } catch (IOException e) {
            }
            reader = null;
        }
    }

}
