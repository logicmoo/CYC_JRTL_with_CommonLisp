package SxxMachine;

public interface NumberTerm extends Atomic {

    Object value();

    @Override
    NumberTerm toClone();

    boolean isFloat();

    @Override
    String getString();

    @Override
    int arityOrType();

    int termHashCodeImpl();

    @Override
    NumberTerm functor();

    @Override
    String pprint();

    @Override
    void toStringImpl(int printFlags, StringBuilder sb);

    @Override
    boolean isNumber();

    @Override
    boolean isNonvar();

    /**
     * Returns the numeric value represented by this object after conversion to type
     * <code>int</code>.
     */
    @Override
    int intValue();

    /**
     * Returns the numeric value represented by this object after conversion to type
     * <code>long</code>.
     */
    @Override
    long longValue();

    /**
     * Returns the numeric value represented by this object after conversion to type
     * <code>double</code>.
     */
    // abstract public double doubleValue();
    /**
     * Compares two <code>NumberTerm</code> objects numerically.
     *
     * @param t
     *            the <code>NumberTerm</code> to compare with.
     * @return the value <code>0</code> if this object is numerically equal to the
     *         argument <code>NumberTerm</code>; a value less than <code>0</code> if
     *         this object is numerically less than the argument
     *         <code>NumberTerm</code>; and a value greater than <code>0</code> if
     *         this object is numerically greater than the argument
     *         <code>NumberTerm</code>.
     */
    int arithCompareTo(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>abs(this)</code>. */
    NumberTerm abs();

    /** Returns a <code>NumberTerm</code> whose value is <code>acos(this)</code>. */
    NumberTerm acos();

    /** Returns a <code>NumberTerm</code> whose value is <code>(this + t)</code>. */
    NumberTerm add(NumberTerm t);

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>(this &amp; t)</code>.
     */
    NumberTerm and(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>asin(this)</code>. */
    NumberTerm asin();

    /** Returns a <code>NumberTerm</code> whose value is <code>tan(this)</code>. */
    NumberTerm atan();

    /** Returns a <code>NumberTerm</code> whose value is <code>ceil(this)</code>. */
    NumberTerm ceil();

    /** Returns a <code>NumberTerm</code> whose value is <code>cos(this)</code>. */
    NumberTerm cos();

    /** Returns a <code>NumberTerm</code> whose value is <code>(this / t)</code>. */
    NumberTerm divide(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>exp(this)</code>. */
    NumberTerm exp();

    /**
     * Returns a <code>NumberTerm</code> whose value is the float-integer-part of
     * <code>this</code>.
     */
    NumberTerm floatIntPart();

    /**
     * Returns a <code>NumberTerm</code> whose value is the float-fractional-part of
     * <code>this</code>.
     */
    NumberTerm floatFractPart();

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>floor(this)</code>.
     */
    NumberTerm floor();

    /**
     * Returns a <code>NumberTerm</code> whose value is
     * <code>(int)(this / t)</code>.
     */
    NumberTerm intDivide(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>log(this)</code>. */
    NumberTerm log();

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>max(this, t)</code>.
     */
    NumberTerm max(NumberTerm t);

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>min(this, t)</code>.
     */
    NumberTerm min(NumberTerm t);

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>(this mod t)</code>.
     */
    NumberTerm mod(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>(this * t)</code>. */
    NumberTerm multiply(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>(- this)</code>. */
    NumberTerm negate();

    /** Returns a <code>NumberTerm</code> whose value is <code>(~ this)</code>. */
    NumberTerm not();

    /** Returns a <code>NumberTerm</code> whose value is <code>(this | t)</code>. */
    NumberTerm or(NumberTerm t);

    /**
     * Returns a <code>NumberTerm</code> whose value is
     * <code>(this<sup>t</sup>)</code>.
     */
    NumberTerm pow(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>rint(this)</code>. */
    NumberTerm rint();

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>round(this)</code>.
     */
    NumberTerm round();

    /**
     * Returns a <code>NumberTerm</code> whose value is
     * <code>(this &lt;&lt; t)</code>.
     */
    NumberTerm shiftLeft(NumberTerm t);

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>(this >> t)</code>.
     */
    NumberTerm shiftRight(NumberTerm t);

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>signum(this)</code>.
     */
    NumberTerm signum();

    /** Returns a <code>NumberTerm</code> whose value is <code>sin(this)</code>. */
    NumberTerm sin();

    /** Returns a <code>NumberTerm</code> whose value is <code>sqrt(this)</code>. */
    NumberTerm sqrt();

    /** Returns a <code>NumberTerm</code> whose value is <code>(this - t)</code>. */
    NumberTerm subtract(NumberTerm t);

    /** Returns a <code>NumberTerm</code> whose value is <code>tan(this)</code>. */
    NumberTerm tan();

    /**
     * Returns a <code>NumberTerm</code> whose value is
     * <code>toDegrees(this)</code>.
     */
    NumberTerm toDegrees();

    /**
     * Returns a <code>NumberTerm</code> whose value is <code>(double)(this)</code>.
     */
    NumberTerm toFloat();

    /**
     * Returns a <code>NumberTerm</code> whose value is
     * <code>toRadians(this)</code>.
     */
    NumberTerm toRadians();

    /**
     * Returns a <code>NumberTerm</code> whose value is the truncate of
     * <code>this</code>.
     */
    NumberTerm truncate();

    /** Returns a <code>NumberTerm</code> whose value is <code>(this ^ t)</code>. */
    NumberTerm xor(NumberTerm t);

    @Override
    boolean isImmutable();

}