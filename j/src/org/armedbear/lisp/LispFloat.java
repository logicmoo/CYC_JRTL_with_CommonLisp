/*
 * LispFloat.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispFloat.java,v 1.52 2003-12-09 20:26:22 asimon Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

public final class LispFloat extends LispObject
{
    public static final LispFloat ZERO = new LispFloat(0);
    public static final LispFloat ONE  = new LispFloat(1);

    private final double value;

    public LispFloat(double value)
    {
        this.value = value;
    }

    public LispObject typeOf()
    {
        return Symbol.FLOAT;
    }

    public LispClass classOf()
    {
        return BuiltInClass.FLOAT;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.FLOAT)
            return T;
        if (typeSpecifier == BuiltInClass.FLOAT)
            return T;
        if (typeSpecifier == Symbol.REAL)
            return T;
        if (typeSpecifier == Symbol.NUMBER)
            return T;
        if (typeSpecifier == Symbol.SINGLE_FLOAT)
            return T;
        if (typeSpecifier == Symbol.DOUBLE_FLOAT)
            return T;
        if (typeSpecifier == Symbol.SHORT_FLOAT)
            return T;
        if (typeSpecifier == Symbol.LONG_FLOAT)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject NUMBERP()
    {
        return T;
    }

    public boolean numberp()
    {
        return true;
    }

    public boolean realp()
    {
        return true;
    }

    public boolean eql(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispFloat) {
            if (value == ((LispFloat)obj).value)
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispFloat) {
            if (value == ((LispFloat)obj).value)
                return true;
        }
        return false;
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value == ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value == ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value == ((Ratio)obj).floatValue();
        return false;
    }

    public LispObject ABS()
    {
        if (value >= 0)
            return this;
        return new LispFloat(- value);
    }

    public boolean plusp()
    {
        return value > 0;
    }

    public boolean minusp()
    {
        return value < 0;
    }

    public boolean zerop()
    {
        return value == 0;
    }

    public LispObject FLOATP()
    {
        return T;
    }

    public boolean floatp()
    {
        return true;
    }

    public static double getValue(LispObject obj) throws ConditionThrowable
    {
        try {
            return ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new ConditionThrowable(new TypeError(obj, "float"));
        }
    }

    public final double getValue()
    {
        return value;
    }

    public Object javaInstance()
    {
        return new Double(value);
    }

    public final LispObject incr()
    {
        return new LispFloat(value + 1);
    }

    public final LispObject decr()
    {
        return new LispFloat(value - 1);
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value + ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value + ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value + ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value + ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(add(c.getRealPart()), c.getImaginaryPart());
        }
        throw new ConditionThrowable(new TypeError(obj, "number"));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value - ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value - ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value - ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value - ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(subtract(c.getRealPart()),
                                       ZERO.subtract(c.getImaginaryPart()));
        }
        throw new ConditionThrowable(new TypeError(obj, "number"));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value * ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value * ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value * ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value * ((Ratio)obj).floatValue());
        throw new ConditionThrowable(new TypeError(obj, "number"));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        if (obj.zerop())
            throw new ConditionThrowable(new DivisionByZero());
        if (obj instanceof LispFloat)
            return new LispFloat(value / ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value / ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value / ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value / ((Ratio)obj).floatValue());
        throw new ConditionThrowable(new TypeError(obj, "number"));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value == ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value == ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value == ((Ratio)obj).floatValue();
        if (obj instanceof Complex)
            return obj.isEqualTo(this);
        throw new ConditionThrowable(new TypeError(obj, "number"));
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        return !isEqualTo(obj);
    }

    public boolean isLessThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value < ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value < ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value < ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value < ((Ratio)obj).floatValue();
        throw new ConditionThrowable(new TypeError(obj, "real"));
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value > ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value > ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value > ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value > ((Ratio)obj).floatValue();
        throw new ConditionThrowable(new TypeError(obj, "real"));
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value <= ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value <= ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value <= ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value <= ((Ratio)obj).floatValue();
        throw new ConditionThrowable(new TypeError(obj, "real"));
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value >= ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value >= ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value >= ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value >= ((Ratio)obj).floatValue();
        throw new ConditionThrowable(new TypeError(obj, "real"));
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        if (obj instanceof Fixnum) {
            long divisor = ((Fixnum)obj).getValue();
            double quotient = value / divisor;
            double remainder = value % divisor;
            if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE)
                return thread.setValues(new Fixnum((int)quotient),
                                        new LispFloat(remainder));
        }
        if (obj instanceof LispFloat) {
            double divisor = ((LispFloat)obj).getValue();
            double quotient = value / divisor;
            if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
                int q = (int) quotient;
                return thread.setValues(new Fixnum(q),
                                        new LispFloat(value - q * divisor));
            }
            // We need to convert the quotient to a bignum.
            long bits = Double.doubleToRawLongBits((double)quotient);
            int s = ((bits >> 63) == 0) ? 1 : -1;
            int e = (int) ((bits >> 52) & 0x7ffL);
            long m;
            if (e == 0)
                m = (bits & 0xfffffffffffffL) << 1;
            else
                m = (bits & 0xfffffffffffffL) | 0x10000000000000L;
            LispObject significand = number(m);
            Fixnum exponent = new Fixnum(e - 1075);
            Fixnum sign = new Fixnum(s);
            LispObject result = significand;
            result =
                result.multiplyBy(Primitives.EXPT.execute(Fixnum.TWO, exponent));
            result = result.multiplyBy(sign);
            // Calculate remainder.
            LispObject product = result.multiplyBy(obj);
            LispObject remainder = subtract(product);
            return thread.setValues(result, remainder);
        }
        throw new ConditionThrowable(new LispError("LispFloat.truncate(): not implemented: " + obj.typeOf()));
    }

    public int hashCode()
    {
        long bits = Double.doubleToLongBits(value);
        return (int) (bits ^ (bits >>> 32));
    }

    public String toString()
    {
        return String.valueOf(value);
    }

    // ### integer-decode-float
    // integer-decode-float float => significand, exponent, integer-sign
    private static final Primitive1 INTEGER_DECODE_FLOAT =
        new Primitive1("integer-decode-float","float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat) {
                LispObject[] values = new LispObject[3];
                long bits =
                    Double.doubleToRawLongBits((double)((LispFloat)arg).getValue());
                int s = ((bits >> 63) == 0) ? 1 : -1;
                int e = (int) ((bits >> 52) & 0x7ffL);
                long m;
                if (e == 0)
                    m = (bits & 0xfffffffffffffL) << 1;
                else
                    m = (bits & 0xfffffffffffffL) | 0x10000000000000L;
                LispObject significand = number(m);
                Fixnum exponent = new Fixnum(e - 1075);
                Fixnum sign = new Fixnum(s);
                return LispThread.currentThread().setValues(significand,
                                                            exponent,
                                                            sign);
            }
            throw new ConditionThrowable(new TypeError(arg, "float"));
        }
    };

    // ### float-radix
    // float-radix float => float-radix
    private static final Primitive1 FLOAT_RADIX =
        new Primitive1("float-radix","float") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
                return Fixnum.TWO;
            throw new ConditionThrowable(new TypeError(arg, "float"));
        }
    };

    // ### float-digits
    // float-digits float => float-digits
    private static final Primitive1 FLOAT_DIGITS =
        new Primitive1("float-digits","float") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
                return new Fixnum(52);
            throw new ConditionThrowable(new TypeError(arg, "float"));
        }
    };

    public static LispFloat coerceToFloat(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return (LispFloat) obj;
        if (obj instanceof Fixnum)
            return new LispFloat(((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(((Ratio)obj).floatValue());
        throw new ConditionThrowable(new TypeError(obj, "real number"));
    }

    // ### float
    // float number &optional prototype => float
    private static final Primitive FLOAT = new Primitive("float","number &optional prototype") {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            if (length < 1 || length > 2)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            // FIXME Ignore prototype (args[1] if present).
            return coerceToFloat(args[0]);
        }
    };

    // ### floatp
    // floatp object => generalized-boolean
    private static final Primitive1 FLOATP = new Primitive1("floatp","object") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.FLOATP();
        }
    };
}
