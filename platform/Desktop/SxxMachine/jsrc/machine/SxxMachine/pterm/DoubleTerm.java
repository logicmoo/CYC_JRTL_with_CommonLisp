package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.Float;

import SxxMachine.EvaluationException;
import SxxMachine.IllegalTypeException;
import SxxMachine.KPTrail;
import SxxMachine.NumberTerm;
import SxxMachine.OpVisitor;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * Floating point number. The class <code>DoubleTerm</code> wraps a value of
 * primitive type <code>double</code>.
 *
 * <pre>
 * Term t = Float(3.3333);
 * double d = (t).doubleValue();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class DoubleTerm extends ANumberTerm {

    @Override
    public double doubleValue() {
        return nvalue.doubleValue();
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        return super.bind(that, trail) && doubleValue() == (((NumberTerm) that).doubleValue());
    }

    // public double dvalue;

    @Override
    public int arityOrType() {
        return Term.FLOAT;
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    /**
     * Holds a <code>double</code> value that this <code>DoubleTerm</code>
     * represents.
     */
    // protected final double value;
    /**
     * Constructs a new Prolog floating point number that represents the specified
     * <code>double</code> value.
     */
    protected DoubleTerm(Number i) {
        super(i);
    }

    @Override
    public int type() {
        return TYPE_DOUBLE_OR_CONST;
    }

    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        return (t.isVar()) ? t.unify(this, trail) : ((t.isDouble()) && doubleValue() == t.doubleValue());
    }

    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(Double.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */

    @Override
    public boolean convertible(Class type) {
        return convertible(Double.class, type);
    }

    /**
     * Returns a <code>java.lang.Double</code> corresponds to this
     * <code>DoubleTerm</code> according to <em>Prolog Cafe interoperability with
     * Java</em>.
     *
     * @return a <code>java.lang.Double</code> object equivalent to this
     *         <code>DoubleTerm</code>.
     */
    @Override
    public Object toJava() {
        return nvalue;
    }

    /* Object */
    @Override // Overridden for performance
    public String pprint() {
        return nvalue.toString();
    }

    /** Returns a unqupted string representation of this <code>DoubleTerm</code>. */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(pprint());
    }

    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>DoubleTerm</code> and has
     * the same <code>double</code> value as this object.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog floating
     *         point number equivalent to this <code>DoubleTerm</code>, false
     *         otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return obj.isDouble() && Double.doubleToLongBits(doubleValue()) == Double.doubleToLongBits((obj).doubleValue());
    }

    @Override
    public int termHashCodeImpl() {
        long bits = Double.doubleToLongBits(doubleValue());
        return (int) (bits ^ (bits >>> 32));
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
        if ((anotherTerm.isVar()))
            return AFTER;
        if (!(anotherTerm.isDouble()))
            return BEFORE;
        return Double.compare(doubleValue(), anotherTerm.doubleValue());
    }

    /* NumberTerm */
    @Override
    public int intValue() {
        return nvalue.intValue();
    }

    @Override
    public long longValue() {
        return nvalue.longValue();
    }

    // @Override
    // public double doubleValue() { return this.value; }

    @Override
    public int arithCompareTo(NumberTerm t) {
        return Double.compare(doubleValue(), t.doubleValue());
    }

    @Override
    public NumberTerm abs() {
        return Float(Math.abs(doubleValue()));
    }

    @Override
    public NumberTerm acos() {
        return Float(Math.acos(doubleValue()));
    }

    @Override
    public NumberTerm add(NumberTerm t) {
        return Float(doubleValue() + t.doubleValue());
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm and(NumberTerm t) {
        throw mustInt();
    }
    // public NumberTerm and(NumberTerm t) { return new IntegerTerm(this.intValue()
    // & t.intValue()); }

    @Override
    public NumberTerm asin() {
        return Float(Math.asin(doubleValue()));
    }

    @Override
    public NumberTerm atan() {
        return Float(Math.atan(doubleValue()));
    }

    @Override
    public NumberTerm ceil() {
        return Integer((long) Math.ceil(doubleValue()));
    }

    @Override
    public NumberTerm cos() {
        return Float(Math.cos(doubleValue()));
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
        return Float(doubleValue() / t.doubleValue());
    }

    @Override
    public NumberTerm exp() {
        return Float(Math.exp(doubleValue()));
    }

    @Override
    public NumberTerm floatIntPart() {
        return Float(Math.signum(doubleValue()) * Math.floor(Math.abs(doubleValue())));
    }

    @Override
    public NumberTerm floatFractPart() {
        return Float(doubleValue() - Math.signum(doubleValue()) * Math.floor(Math.abs(doubleValue())));
    }

    @Override
    public NumberTerm floor() {
        return Integer((long) Math.floor(doubleValue()));
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm intDivide(NumberTerm t) {
        throw mustInt();
    }

    // public NumberTerm intDivide(NumberTerm t) { return new
    // IntegerTerm((int)(this.intValue() / t.intValue())); }
    /**
     * @exception EvaluationException
     *                if this object represents <coe>0</code>.
     */
    @Override
    public NumberTerm log() {
        if (doubleValue() == 0)
            throw new EvaluationException("undefined");
        return Float(Math.log(doubleValue()));
    }

    @Override
    public NumberTerm max(NumberTerm t) {
        return Float(Math.max(doubleValue(), t.doubleValue()));
    }

    @Override
    public NumberTerm min(NumberTerm t) {
        return Float(Math.min(doubleValue(), t.doubleValue()));
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm mod(NumberTerm t) {
        throw mustInt();
    }
    // public NumberTerm mod(NumberTerm t) { return new IntegerTerm(this.intValue()
    // % t.intValue()); }

    @Override
    public NumberTerm multiply(NumberTerm t) {
        return Float(doubleValue() * t.doubleValue());
    }

    @Override
    public NumberTerm negate() {
        return Float(-doubleValue());
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm not() {
        throw mustInt();
    }

    // public NumberTerm not() { return new IntegerTerm(~ this.intValue()); }
    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm or(NumberTerm t) {
        throw mustInt();
    }
    // public NumberTerm or(NumberTerm t) { return new IntegerTerm(this.intValue() |
    // t.intValue()); }

    @Override
    public NumberTerm pow(NumberTerm t) {
        return Float(Math.pow(doubleValue(), t.doubleValue()));
    }

    @Override
    public NumberTerm rint() {
        return Float(Math.rint(doubleValue()));
    }

    @Override
    public NumberTerm round() {
        return Integer(Math.round(doubleValue()));
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm shiftLeft(NumberTerm t) {
        throw mustInt();
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm shiftRight(NumberTerm t) {
        throw mustInt();
    }

    @Override
    public NumberTerm signum() {
        return Float(Math.signum(doubleValue()));
    }

    @Override
    public NumberTerm sin() {
        return Float(Math.sin(doubleValue()));
    }

    /**
     * @exception EvaluationException
     *                if this object represents a floating point number less than
     *                <coe>0</code>.
     */
    @Override
    public NumberTerm sqrt() {
        if (doubleValue() < 0)
            throw new EvaluationException("undefined");
        return Float(Math.sqrt(doubleValue()));
    }

    @Override
    public NumberTerm subtract(NumberTerm t) {
        return Float(doubleValue() - t.doubleValue());
    }

    @Override
    public NumberTerm tan() {
        return Float(Math.tan(doubleValue()));
    }

    @Override
    public NumberTerm toDegrees() {
        return Float(Math.toDegrees(doubleValue()));
    }

    @Override
    public NumberTerm toFloat() {
        return this;
    }

    @Override
    public NumberTerm toRadians() {
        return Float(Math.toRadians(doubleValue()));
    }

    // public NumberTerm Float(double n) {
    // return new DoubleTerm(n);
    // }

    @Override
    public NumberTerm truncate() {
        if (doubleValue() >= 0)
            return Integer((long) Math.floor(doubleValue()));
        else
            return Integer((long) (-1 * Math.floor(Math.abs(doubleValue()))));
    }

    /**
     * Throws a <code>type_error</code>.
     *
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm xor(NumberTerm t) {
        throw mustInt();
    }

    private IllegalTypeException mustInt() {
        return new IllegalTypeException("integer", this);
    }

    private LongTerm Integer(long round) {
        int i = (int) round;
        if ((i) == round) {
            return TermData.Integer(i);
        }
        return TermData.Long(round);
    }

    @Override
    public boolean isFloat() {
        return true;
    }
}
