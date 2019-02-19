package SxxMachine.pterm;

import SxxMachine.Prog;
import SxxMachine.Term;
import SxxMachine.Undoable;
import SxxMachine.Var;

abstract public class Sink extends AFluent implements Undoable, Var {

    @Override
    public boolean unbound() {
        return true;
    }

    public Sink(Prog p) {
        super(p);
    }

    abstract public int putElement(Term T);

    public Term collect() {
        return null;
    }
}
