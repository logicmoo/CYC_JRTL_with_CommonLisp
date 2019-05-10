package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.Long;
import static SxxMachine.pterm.TermData.Number;

import java.math.BigInteger;

import SxxMachine.EvaluationException;
import SxxMachine.IllegalTypeException;
import SxxMachine.KPTrail;
import SxxMachine.NumberTerm;
import SxxMachine.OpVisitor;
import SxxMachine.PrologException;
import SxxMachine.Term;
import SxxMachine.Trail;

class LongTerm extends ANumberTerm {
    @Override
    public boolean isLong() {
        return true;
    }

    @Override
    public boolean isInteger() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isFloat() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    // protected final long value;
    protected LongTerm(Number value) {
        super(value);
        checkNValue();
        // longValue() = value;
    }

    private void checkNValue() {
        if (!(nvalue instanceof Long)) {
            if (!(nvalue instanceof Integer)) {
                try {
                    long v = (long) nvalue;
                } catch (java.lang.ClassCastException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                    throw e;
                }
            }
        }
    }
    //
    //    public LongTerm(long bigInteger) {
    //        super(bigInteger);
    //    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        return super.bind(that, trail) && ((double) longValue() == (double) TermData.asInt(that).longValue());
        // unbelievable but true: converting
        // to double is the only way to convince
        // Microsoft's jview that 1==1
        // $$ casting to double to be removed
        // once they get it right
    }

    @Override
    public final int arityOrType() {
        return Term.INT;
    }

    @Override
    public int compareTo(Term anotherTerm) {
        if (((anotherTerm.isVar()) || anotherTerm.isDouble()))
            return AFTER;
        if (!(anotherTerm.isLong()))
            return BEFORE;
        long v = anotherTerm.longValue();
        if (longValue() == v)
            return EQUAL;
        if (longValue() > v)
            return AFTER;
        return BEFORE;
    }

    @Override
    public int intValue() {
        return (int) longValue();
    }

    @Override
    public long longValue() {
        try {
            checkNValue();
            return nvalue.longValue();
        } catch (java.lang.ClassCastException e) {
            // TODO: handle exception
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public double doubleValue() {
        return longValue();
    }

    @Override
    public int arithCompareTo(NumberTerm t) {
        return Long.compare(longValue(), t.longValue());
    }

    @Override
    public NumberTerm abs() {
        return Long(Math.abs(longValue()));
    }

    @Override
    public NumberTerm acos() {
        return Number(Math.acos(longValue()));
    }

    @Override
    public NumberTerm add(NumberTerm t) {
        if ((t.isDouble())) {
            return t.add(this);
        }
        return Long(longValue() + t.longValue());
    }

    @Override
    public NumberTerm and(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        return Long(longValue() & t.longValue());
    }

    @Override
    public NumberTerm asin() {
        return Number(Math.asin(longValue()));
    }

    @Override
    public NumberTerm atan() {
        return Number(Math.atan(longValue()));
    }

    @Override
    public NumberTerm ceil() {
        return this;
    }

    @Override
    public NumberTerm cos() {
        return Number(Math.cos(longValue()));
    }

    @Override
    public NumberTerm divide(NumberTerm t) {
        if (t.doubleValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Number(longValue() / t.doubleValue());
    }

    @Override
    public NumberTerm exp() {
        return Number(Math.exp(longValue()));
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

    @Override
    public NumberTerm intDivide(NumberTerm t) throws PrologException {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        if (t.intValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Long((longValue() / t.longValue()));
    }

    @Override
    public NumberTerm log() throws EvaluationException {
        if (longValue() == 0L)
            throw new EvaluationException("undefined");
        return Number(Math.log(longValue()));
    }

    @Override
    public NumberTerm max(NumberTerm t) {
        if ((t.isDouble()))
            return t.max(this);
        return Long(Math.max(longValue(), t.longValue()));
    }

    @Override
    public NumberTerm min(NumberTerm t) {
        if ((t.isDouble()))
            return t.min(this);
        return Long(Math.min(longValue(), t.longValue()));
    }

    @Override
    public NumberTerm mod(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        if (t.intValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Long(longValue() % t.longValue());
    }

    @Override
    public NumberTerm multiply(NumberTerm t) {
        if ((t.isDouble()))
            return t.multiply(this);
        return Long(longValue() * t.longValue());
    }

    @Override
    public NumberTerm negate() {
        return Long(-longValue());
    }

    @Override
    public NumberTerm not() {
        return Long(~longValue());
    }

    @Override
    public NumberTerm or(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        return Long(longValue() | t.longValue());
    }

    @Override
    public NumberTerm pow(NumberTerm t) {
        return Number(Math.pow(longValue(), t.doubleValue()));
    }

    @Override
    public NumberTerm rint() {
        return TermData.Number(longValue());
    }

    @Override
    public NumberTerm round() {
        return this;
    }

    @Override
    public NumberTerm shiftLeft(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        return Long(longValue() << t.intValue());
    }

    @Override
    public NumberTerm shiftRight(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        return Long(longValue() >> t.intValue());
    }

    @Override
    public NumberTerm signum() {
        return TermData.Integer((int) Math.signum(doubleValue()));
    }

    @Override
    public NumberTerm sin() {
        return Number(Math.sin(doubleValue()));
    }

    @Override
    public NumberTerm sqrt() {
        if (longValue() < 0)
            throw new EvaluationException("undefined");
        return Number(Math.sqrt(doubleValue()));
    }

    @Override
    public NumberTerm subtract(NumberTerm t) {
        if ((t.isDouble()))
            return Number(doubleValue() - t.doubleValue());
        return Long(longValue() - t.longValue());
    }

    @Override
    public NumberTerm tan() {
        return Number(Math.tan(doubleValue()));
    }

    @Override
    public NumberTerm toDegrees() {
        return Number(Math.toDegrees(doubleValue()));
    }

    @Override
    public NumberTerm toFloat() {
        return Number(doubleValue());
    }

    @Override
    public NumberTerm toRadians() {
        return Number(Math.toRadians(doubleValue()));
    }

    @Override
    public NumberTerm truncate() {
        return this;
    }

    @Override
    public NumberTerm xor(NumberTerm t) {
        if ((t.isDouble()))
            throw new IllegalTypeException("integer", t);
        return Long(longValue() ^ t.longValue());
    }

    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        return (t.isVar()) ? t.asVariableTerm().bind(this, trail)
                : (((t.isLong()) && longValue() == t.asLongTerm().longValue())
                        || ((t.isInteger()) && longValue() == t.asIntegerTerm().longValue()));
    }

    @Override
    public boolean convertible(Class type) {
        return convertible(Long.class, type);
    }

    @Override
    public Object toJava() {
        return Long.valueOf(longValue());
    }

    @Override // Overridden for performance
    public String pprint() {
        return Long.toString(longValue());
    }

    @Override
    public void toStringImpl(int printingFlags, StringBuilder sb) {
        sb.append(longValue());
    }

    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        if (!(obj.isLong()))
            return false;
        return longValue() == obj.asLongTerm().longValue();
    }

    @Override
    public int termHashCodeImpl() {
        long n = longValue();
        return (int) (n ^ n >>> 32);
        // return Long.hashCode(longValue());
    }

    @Override
    public int type() {
        return TYPE_INTEGER;
    }
}
