package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.Float;

import SxxMachine.EvaluationException;
import SxxMachine.IllegalTypeException;
import SxxMachine.NumberTerm;
import SxxMachine.OpVisitor;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * Integer.<br>
 * The class <code>IntegerTerm</code> wraps a value of primitive type
 * <code>int</code>.
 *
 * <pre>
 * Term t = new IntegerTerm(100);
 * int i = t.asIntegerlTerm().intValue();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class IntegerTerm extends LongTerm {
    /**
     * Holds an <code>int</code> value that this <code>IntegerTerm</code>
     * represents.
     */
    // protected final int intValue();
    @Override
    public boolean isInteger() {
        return true;
    }

    @Override
    public boolean isLong() {
        return false;
    }

    @Override
    public boolean unifyInt(int i, Trail trail) {
        return intValue() == i;
    }

    /**
     * Constructs a new Prolog integer that represents the specified
     * <code>int</code> value.
     */
    public IntegerTerm(int i) {
        super(i);
        if (!(nvalue instanceof Integer)) {
            long v = (int) nvalue;
            v++;
        }
    }

    /* Term */
    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        return (t.isVar()) ? t.asVariableTerm().bind(this, trail)
                : (((t.isInteger()) && this.intValue() == t.asIntegerTerm().intValue())
                        || ((t.isLong()) && (this.intValue()) == t.asLongTerm().longValue()));
    }

    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(Integer.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    @Override
    public boolean convertible(Class type) {
        return convertible(Integer.class, type);
    }

    /**
     * Returns a <code>java.lang.Integer</code> corresponds to this
     * <code>IntegerTerm</code> according to <em>Prolog Cafe interoperability with
     * Java</em>.
     *
     * @return a <code>java.lang.Integer</code> object equivalent to this
     *         <code>IntegerTerm</code>.
     */
    @Override
    public Object toJava() {
        return Integer.valueOf(this.intValue());
    }

    /** Returns a quoted string representation of this <code>IntegerTerm</code>. */
    @Override // Overridden for performance
    public String pprint() {
        return Integer.toString(this.intValue());
    }

    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(this.intValue());
    }

    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>IntegerTerm</code> and
     * has the same <code>int</code> value as this object.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog integer
     *         equivalent to this <code>IntegerTerm</code>, false otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return obj.isInteger() && this.intValue() == obj.intValue();
    }

    @Override
    public int termHashCodeImpl() {
        return this.intValue();
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
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
        if (((anotherTerm.isVar()) || anotherTerm.isDouble()))
            return AFTER;
        if (!(anotherTerm.isInteger()))
            return BEFORE;
        int v = anotherTerm.asIntegerTerm().intValue();
        if (this.intValue() == v)
            return EQUAL;
        if (this.intValue() > v)
            return AFTER;
        return BEFORE;
    }

    /* NumberTerm */
    // @Override
    // public int intValue() { return this.intValue(); }
    // @Override
    // public long longValue() { return (this.intValue()); }
    // @Override
    // public double doubleValue() { return (this.intValue()); }
    // @Override
    @Override
    public int arithCompareTo(NumberTerm t) {
        if ((t.isDouble()))
            return -(t.arithCompareTo(this));
        if ((t.isLong())) {
            return -(t.arithCompareTo(this));
        }
        int v = t.intValue();
        if (this.intValue() == v)
            return EQUAL;
        if (this.intValue() > v)
            return AFTER;
        return BEFORE;
    }

    @Override
    public NumberTerm abs() {
        return Integer(Math.abs(this.intValue()));
    }

    @Override
    public NumberTerm acos() {
        return Float(Math.acos(intValue()));
    }

    @Override
    public NumberTerm add(NumberTerm t) {
        return (t.isDouble()) ? t.add(this) : Integer(this.intValue() + t.intValue());
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     */
    @Override
    public NumberTerm and(NumberTerm t) {
        must_be_int(t);
        return Integer(this.intValue() & t.intValue());
    }

    @Override
    public NumberTerm asin() {
        return Float(Math.asin(intValue()));
    }

    @Override
    public NumberTerm atan() {
        return Float(Math.atan(intValue()));
    }

    @Override
    public NumberTerm ceil() {
        return this;
    }

    @Override
    public NumberTerm cos() {
        return Float(Math.cos(intValue()));
    }

    /**
     * @exception EvaluationException
     *                if the given argument <code>NumberTerm</code> represents
     *                <coe>0</code>.
     */
    @Override
    public NumberTerm divide(NumberTerm t) {
        if (t.doubleValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Float(intValue() / t.doubleValue());
    }

    @Override
    public NumberTerm exp() {
        return Float(Math.exp(intValue()));
    }

    @Override
    public NumberTerm floatIntPart() {
        throw new IllegalTypeException("float", this);
    }

    @Override
    public NumberTerm floatFractPart() {
        throw new IllegalTypeException("float", this);
    }

    @Override
    public NumberTerm floor() {
        return this;
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     * @exception EvaluationException
     *                if the given argument <code>NumberTerm</code> represents
     *                <coe>0</code>.
     */
    @Override
    public NumberTerm intDivide(NumberTerm t) throws EvaluationException {
        must_be_int(t);
        if (t.intValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Integer(this.intValue() / t.intValue());
    }

    /**
     * @exception EvaluationException
     *                if this object represents <coe>0</code>.
     */
    @Override
    public NumberTerm log() throws EvaluationException {
        if (this.intValue() == 0)
            throw new EvaluationException("undefined");
        return Float(Math.log(intValue()));
    }

    @Override
    public NumberTerm max(NumberTerm t) {
        if ((t.isDouble()))
            return t.max(this);
        return Integer(Math.max(this.intValue(), t.intValue()));
    }

    @Override
    public NumberTerm min(NumberTerm t) {
        if ((t.isDouble()))
            return t.min(this);
        return Integer(Math.min(this.intValue(), t.intValue()));
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     * @exception EvaluationException
     *                if the given argument <code>NumberTerm</code> represents
     *                <coe>0</code>.
     */
    @Override
    public NumberTerm mod(NumberTerm t) {
        must_be_int(t);
        if (t.intValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Integer(this.intValue() % t.intValue());
    }

    @Override
    public NumberTerm multiply(NumberTerm t) {
        if ((t.isDouble()))
            return t.multiply(this);
        if ((t.isLong())) {
            return t.multiply(this);
        }
        return Integer(this.intValue() * t.intValue());
    }

    @Override
    public NumberTerm negate() {
        return Integer(-this.intValue());
    }

    @Override
    public NumberTerm not() {
        return Integer(~this.intValue());
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     */
    @Override
    public NumberTerm or(NumberTerm t) {
        must_be_int(t);
        return Integer(this.intValue() | t.intValue());
    }

    @Override
    public NumberTerm pow(NumberTerm t) {
        return Float(Math.pow(intValue(), t.doubleValue()));
    }

    @Override
    public NumberTerm rint() {
        return Float(intValue());
    }

    @Override
    public NumberTerm round() {
        return this;
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     */
    @Override
    public NumberTerm shiftLeft(NumberTerm t) {
        must_be_int(t);
        return Integer(this.intValue() << t.intValue());
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     */
    @Override
    public NumberTerm shiftRight(NumberTerm t) {
        must_be_int(t);
        return Integer(this.intValue() >> t.intValue());
    }

    @Override
    public NumberTerm signum() {
        return Integer((int) Math.signum((double) this.intValue()));
    }

    @Override
    public NumberTerm sin() {
        return Float(Math.sin(intValue()));
    }

    /**
     * @exception EvaluationException
     *                if this object represents an integer less than <coe>0</code>.
     */
    @Override
    public NumberTerm sqrt() {
        if (this.intValue() < 0)
            throw new EvaluationException("undefined");
        return Float(Math.sqrt(intValue()));
    }

    @Override
    public NumberTerm subtract(NumberTerm t) {
        if ((t.isDouble()))
            return Float(intValue() - t.doubleValue());
        return Integer(this.intValue() - t.intValue());
    }

    @Override
    public NumberTerm tan() {
        return Float(Math.tan(intValue()));
    }

    @Override
    public NumberTerm toDegrees() {
        return Float(Math.toDegrees(intValue()));
    }

    @Override
    public NumberTerm toFloat() {
        return Float(this.intValue());
    }

    @Override
    public NumberTerm toRadians() {
        return Float(Math.toRadians(intValue()));
    }

    @Override
    public NumberTerm truncate() {
        return this;
    }

    /**
     * @exception IllegalTypeException
     *                if the given argument <code>NumberTerm</code> is a floating
     *                point number.
     */
    @Override
    public NumberTerm xor(NumberTerm t) {
        must_be_int(t);
        return Integer(this.intValue() ^ t.intValue());
    }

    private void must_be_int(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);

    }

    // public NumberTerm Float(double n) {
    // return new DoubleTerm(n);
    // }
    public NumberTerm Integer(long n) {
        return TermData.Long(n);
    }

    @Override
    public int type() {
        return TYPE_INTEGER;
    }
}
