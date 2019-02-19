package SxxMachine;

import java.io.IOException;
import java.io.Writer;

import SxxMachine.pterm.Sink;
import SxxMachine.pterm.TermData;

/**
 * Writer
 */
public class CharWriter extends Sink {
    protected Writer writer;

    public CharWriter(String f, Prog p) {
        super(p);
        this.writer = IO.toFileWriter(f);
    }

    public CharWriter(Prog p) {
        super(p);
        this.writer = IO.output;
    }

    @Override
    public int putElement(Term t) {
        if (null == writer)
            return 0;
        try {
            char c = (char) TermData.asInt(t).intValue();
            writer.write(c);
        } catch (IOException e) {
            return 0;
        }
        return 1;
    }

    @Override
    public void stop() {
        if (null != writer && IO.output != writer) {
            try {
                writer.close();
            } catch (IOException e) {
            }
            writer = null;
        }
    }

}
