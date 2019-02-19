package SxxMachine.pterm;

import SxxMachine.OpVisitor;
import SxxMachine.Predicate;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * Closure.<br>
 * The class <code>ClosureTerm</code> represents a closure structure.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class ClosureTerm extends SystemObject {
    /** Holds a <code>Predicate</code> object that represents a Prolog goal. */
    protected final Predicate code;

    @Override
    public boolean isClosure() {
        return true;
    }

    /** Constructs a new closure structure for the given Prolog goal. */
    public ClosureTerm(Predicate _code) {
        this.code = _code;
    }

    /** Returns the Prolog goal of this <code>ClosureTerm</code>. */
    public Predicate getCode() {
        return this.code;
    }

    @Override
    public int type() {
        return TYPE_CLOSURE;
    }

    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        if ((t.isVar()))
            return t.asVariableTerm().unify(this, trail);
        return (t.isClosure()) && this.code.equals(t.asClosureTerm().code);
    }

    @Override
    public final String pprint() {
        StringBuilder sb = new StringBuilder();
        toStringImpl(1, sb);
        return sb.toString();
    }

    /* Object */
    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>ClosureTerm</code>, and
     * the pairs of goals in the two closures are <em>equal</em>.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a closure equivalent
     *         to this <code>ClosureTerm</code>, false otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) { // obj must be dereferenced
        return obj.isClosure() && this.code.equals(obj.asClosureTerm().code);
    }

    @Override
    public int termHashCodeImpl() {
        return this.code.hashCode();
    }

    /**
     * Adds a string representation of this <code>ClosureTerm</code> to given
     * StringBuilder instance
     */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append("closure[");
        this.code.toString(sb);
        sb.append("]");
    }

    /* Comparable */
    /**
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     *
     * @param anotherTerm
     *            the term to compared with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; a value less
     *         than <code>0</code> if this term is <em>before</em> the
     *         <code>anotherTerm</code>; and a value greater than <code>0</code> if
     *         this term is <em>after</em> the <code>anotherTerm</code>.
     */
    @Override
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced
        if (!(anotherTerm.isClosure()))
            return AFTER;
        if (this.code.equals(anotherTerm.asClosureTerm().code))
            return EQUAL;
        return this.code.hashCode() - anotherTerm.asClosureTerm().code.hashCode(); // ???
    }

    @Override
    public final boolean isImmutable() {
        return true;
    }
}
