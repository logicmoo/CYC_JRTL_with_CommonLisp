package SxxMachine.pterm;

import SxxMachine.OpVisitor;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * A SystemObject is a Nonvar with system assigned name
 *
 */
abstract public class SystemObject extends ANonvar {
    @Override
    public int type() {
        return TYPE_JAVA_OBJECT;
    }

    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        if ((t.isVar()))
            return t.asVariableTerm().unify(this, trail);
        return equalsTerm(t);
    }

    /**
     * Adds a string representation of this <code>SystemObject</code> to given
     * StringBuilder instance
     */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(pprint());
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
        if (this.type() != anotherTerm.type())
            return AFTER;
        return this.termHashCode() - anotherTerm.hashCode(); // ???
    }

    @Override
    public boolean isImmutable() {
        return true;
    }

    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>SystemObject</code>, and
     * the pairs of goals in the two closures are <em>equal</em>.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a closure equivalent
     *         to this <code>SystemObject</code>, false otherwise.
     * @see #compareTo
     */

    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return equalsIdentical(obj);
    }

    @Override
    public Term toClone() {
        oopsy("unknown toClone");
        return this;
    }

    @Override
    public int termHashCodeImpl() {
        return (int) ordinal;
    }

    @Override
    public boolean isSystemObject() {
        return true;
    }

    static long ctrSO = 0;

    private long ordinal;

    public SystemObject() {
        ordinal = ++ctrSO;
    }

    @Override
    public String getString() {
        oopsy("unknown getString");
        return "object(" + getClass().getName() + "." + ordinal + ")";
    }

    public String qname() {
        return "object('" + getClass().getName() + "'." + ordinal + ")";
    }

    @Override
    public boolean bind(Term that, Trail trail) {
        return super.bind(that, trail) && ordinal == ((SystemObject) that).ordinal;
    }

    @Override
    public String pprint() {
        return getString();
    }

    @Override
    public final int arityOrType() {
        return Term.JAVA;
    }
}
