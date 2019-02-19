package SxxMachine.pterm;

import SxxMachine.NumberTerm;

/**
 * The superclass of classes for integers and floating point numbers.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
abstract class ANumberTerm extends AtomicConst implements NumberTerm {

    final Number nvalue;

    public ANumberTerm(Number n) {
        nvalue = n;
    }

    @Override
    public Class getIntendedClass() {
        return value().getClass();
    }

    @Override
    public String getString() {
        return value().toString();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#value()
     */
    @Override
    final public Number value() {
        return nvalue;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#toClone()
     */
    @Override
    public NumberTerm toClone() {
        return this;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#isFloat()
     */
    @Override
    abstract public boolean isFloat();

    //    /* (non-Javadoc)
    //     * @see SxxMachine.pterm.NumberTerm#fname()
    //     */
    //    @Override
    //    abstract public String getString();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#arityOrType()
     */
    @Override
    abstract public int arityOrType();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#termHashCodeImpl()
     */
    @Override
    public int termHashCodeImpl() {
        return value().hashCode();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#functor()
     */
    @Override
    public NumberTerm functor() {
        return this;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#pprint()
     */
    @Override
    abstract public String pprint();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#toStringImpl(int, java.lang.StringBuilder)
     */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(pprint());
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#isNumber()
     */
    @Override
    public boolean isNumber() {
        return true;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#isNonvar()
     */
    @Override
    public boolean isNonvar() {
        return true;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#intValue()
     */
    @Override
    abstract public int intValue();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#longValue()
     */
    @Override
    abstract public long longValue();

    /**
     * Returns the numeric value represented by this object after conversion to type
     * <code>double</code>.
     */
    // abstract public double doubleValue();
    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#arithCompareTo(SxxMachine.NumberTerm)
     */
    @Override
    abstract public int arithCompareTo(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#abs()
     */
    @Override
    abstract public NumberTerm abs();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#acos()
     */
    @Override
    abstract public NumberTerm acos();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#add(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm add(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#and(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm and(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#asin()
     */
    @Override
    abstract public NumberTerm asin();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#atan()
     */
    @Override
    abstract public NumberTerm atan();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#ceil()
     */
    @Override
    abstract public NumberTerm ceil();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#cos()
     */
    @Override
    abstract public NumberTerm cos();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#divide(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm divide(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#exp()
     */
    @Override
    abstract public NumberTerm exp();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#floatIntPart()
     */
    @Override
    abstract public NumberTerm floatIntPart();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#floatFractPart()
     */
    @Override
    abstract public NumberTerm floatFractPart();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#floor()
     */
    @Override
    abstract public NumberTerm floor();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#intDivide(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm intDivide(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#log()
     */
    @Override
    abstract public NumberTerm log();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#max(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm max(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#min(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm min(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#mod(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm mod(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#multiply(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm multiply(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#negate()
     */
    @Override
    abstract public NumberTerm negate();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#not()
     */
    @Override
    abstract public NumberTerm not();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#or(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm or(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#pow(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm pow(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#rint()
     */
    @Override
    abstract public NumberTerm rint();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#round()
     */
    @Override
    abstract public NumberTerm round();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#shiftLeft(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm shiftLeft(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#shiftRight(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm shiftRight(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#signum()
     */
    @Override
    abstract public NumberTerm signum();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#sin()
     */
    @Override
    abstract public NumberTerm sin();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#sqrt()
     */
    @Override
    abstract public NumberTerm sqrt();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#subtract(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm subtract(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#tan()
     */
    @Override
    abstract public NumberTerm tan();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#toDegrees()
     */
    @Override
    abstract public NumberTerm toDegrees();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#toFloat()
     */
    @Override
    abstract public NumberTerm toFloat();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#toRadians()
     */
    @Override
    abstract public NumberTerm toRadians();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#truncate()
     */
    @Override
    abstract public NumberTerm truncate();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#xor(SxxMachine.NumberTerm)
     */
    @Override
    abstract public NumberTerm xor(NumberTerm t);

    /* (non-Javadoc)
     * @see SxxMachine.pterm.NumberTerm#isImmutable()
     */
    @Override
    public final boolean isImmutable() {
        return true;
    }
}
