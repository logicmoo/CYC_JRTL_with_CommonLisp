package SxxMachine;

import java.util.ArrayList;

import SxxMachine.pterm.Sink;

/**
 * Builds Fluents from Java Streams
 */
public class TermCollector extends Sink {
    protected ArrayList buffer;

    private Prog p;

    public TermCollector(Prog p) {
        super(p);
        this.p = p;
        this.buffer = new ArrayList();
    }

    @Override
    public int putElement(Term T) {
        buffer.add(T);
        return 1;
    }

    @Override
    public void stop() {
        buffer = null;
    }

    @Override
    public Term collect() {
        return new IterableSource(buffer, p);
    }
}
