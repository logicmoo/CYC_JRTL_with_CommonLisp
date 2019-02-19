package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;

import SxxMachine.Compound;
import SxxMachine.IllegalTypeException;
import SxxMachine.KPTrail;
import SxxMachine.Nonvar;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.Term;

/**
 * Part of the Prolog Term hierarchy
 *
 * @see Term
 */
public abstract class ANonvar extends PTerm implements Nonvar {

    public boolean isFunctor(String string) throws IllegalTypeException {
        String fname = fname();
        return fname.equals(string);
    }

    // public boolean equalsTerm(Term ano2) {
    // return this==ano2;
    // }
    /* (non-Javadoc)
     * @see SxxMachine.pterm.INonVar#isNonvar()
     */
    @Override
    public boolean isNonvar() {
        return true;
    }

    @Override
    public Term ArgDeRef(int i) {
        return ArgNoDeRef(i).dref();
    }

    @Override
    public Term ArgNoDeRef(int i) {
        return arg0(i);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.INonVar#unifyArg(int, SxxMachine.Term, SxxMachine.Prog)
     */
    @Override
    public int unifyArg(int i, Term a, Prog p) {
        a = a.dref();
        return ArgDeRef(i).Unify_TO(a.dref(), p.getTrail()) ? 1 : 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.INonVar#getIntArg(int)
     */
    @Override
    public int getIntArg(int i) {
        return (int) TermData.asInt(ArgDeRef(i)).doubleValue();
    }

    @Override
    public String fname() {
        oopsy("unknown fname");
        return null;
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        if (getClass() == that.getClass())
            return true;
        // oopsy();
        return false;
    }

    @Override
    public boolean Unify_TO(Term that, KPTrail trail) {
        if (bind(that, trail))
            return true;
        else
            return that.bind(this, trail);
    }

    /**
     * returns a list representation of the object
     */
    @Override
    public Compound listify() {
        return CONS(this, Prolog.Nil);
    }
}
