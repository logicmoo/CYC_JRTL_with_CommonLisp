/*
 * LispFloat.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: LispFloat.java,v 1.63 2004-06-04 16:17:09 piso Exp $
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
    public static final LispFloat PI   = new LispFloat((double)3.141592653589793);

    public final double value;

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
            signal(new TypeError(obj, Symbol.FLOAT));
            // Not reached.
            return 0;
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

    public Object javaInstance(Class c)
    {
        String cn = c.getName();
        if (cn.equals("java.lang.Float") || cn.equals("float"))
            return new Float(value);
        return javaInstance();
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
            return new LispFloat(value + ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return new LispFloat(value + ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value + ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(add(c.getRealPart()), c.getImaginaryPart());
        }
        return signal(new TypeError(obj, Symbol.NUMBER));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value - ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value - ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return new LispFloat(value - ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value - ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(subtract(c.getRealPart()),
                                       ZERO.subtract(c.getImaginaryPart()));
        }
        return signal(new TypeError(obj, Symbol.NUMBER));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value * ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value * ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return new LispFloat(value * ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value * ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(multiplyBy(c.getRealPart()),
                                       multiplyBy(c.getImaginaryPart()));
        }
        return signal(new TypeError(obj, Symbol.NUMBER));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        if (obj.zerop())
            return signal(new DivisionByZero());
        if (obj instanceof LispFloat)
            return new LispFloat(value / ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value / ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return new LispFloat(value / ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value / ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            LispObject re = c.getRealPart();
            LispObject im = c.getImaginaryPart();
            LispObject denom = re.multiplyBy(re).add(im.multiplyBy(im));
            LispObject resX = multiplyBy(re).divideBy(denom);
            LispObject resY =
                multiplyBy(Fixnum.MINUS_ONE).multiplyBy(im).divideBy(denom);
            return Complex.getInstance(resX, resY);
        }
        return signal(new TypeError(obj, Symbol.NUMBER));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value == ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return value == ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value == ((Ratio)obj).floatValue();
        if (obj instanceof Complex)
            return obj.isEqualTo(this);
        signal(new TypeError(obj, Symbol.NUMBER));
        // Not reached.
        return false;
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
            return value < ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return value < ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value < ((Ratio)obj).floatValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value > ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value > ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return value > ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value > ((Ratio)obj).floatValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value <= ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value <= ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return value <= ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value <= ((Ratio)obj).floatValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return value >= ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value >= ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return value >= ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value >= ((Ratio)obj).floatValue();
        signal(new TypeError(obj, Symbol.REAL));
        // Not reached.
        return false;
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        if (obj instanceof Fixnum) {
            long divisor = ((Fixnum)obj).value;
            double quotient = value / divisor;
            double remainder = value % divisor;
            return thread.setValues(number((long)quotient),
                                    new LispFloat(remainder));
        }
        if (obj instanceof LispFloat) {
            double divisor = ((LispFloat)obj).value;
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
        return signal(new LispError("LispFloat.truncate(): not implemented: " + obj.typeOf()));
    }

    public int hashCode()
    {
        long bits = Double.doubleToLongBits(value);
        return (int) (bits ^ (bits >>> 32));
    }

    public int psxhash() throws ConditionThrowable
    {
        if ((value % 1) == 0)
            return (((int)value) & 0x7fffffff);
        else
            return (hashCode() & 0x7fffffff);
    }

    public String toString()
    {
        return String.valueOf(value);
    }

    // ### integer-decode-float
    // integer-decode-float float => significand, exponent, integer-sign
    private static final Primitive1 INTEGER_DECODE_FLOAT =
        new Primitive1("integer-decode-float", "float")
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
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### float-radix
    // float-radix float => float-radix
    private static final Primitive1 FLOAT_RADIX =
        new Primitive1("float-radix", "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
                return Fixnum.TWO;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### float-digits
    // float-digits float => float-digits
    private static final Primitive1 FLOAT_DIGITS =
        new Primitive1("float-digits", "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
                return new Fixnum(52);
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### scale-float float integer => scaled-float
    private static final Primitive2 SCALE_FLOAT =
        new Primitive2("scale-float", "float integer")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            double f = getValue(first);
            int n = Fixnum.getValue(second);
            return new LispFloat(f * Math.pow(2, n));
        }
    };

    public static LispFloat coerceToFloat(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof LispFloat)
            return (LispFloat) obj;
        if (obj instanceof Fixnum)
            return new LispFloat(((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return new LispFloat(((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(((Ratio)obj).floatValue());
        signal(new TypeError(obj.writeToString() +
                             " cannot be converted to type FLOAT."));
        // Not reached.
        return null;
    }

    // ### coerce-to-float
    private static final Primitive1 COERCE_TO_FLOAT =
        new Primitive1("coerce-to-float", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToFloat(arg);
        }
    };

    // ### float
    // float number &optional prototype => float
    private static final Primitive FLOAT =
        new Primitive("float", "number &optional prototype")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            if (length < 1 || length > 2)
                return signal(new WrongNumberOfArgumentsException(this));
            // FIXME Ignore prototype (args[1] if present).
            return coerceToFloat(args[0]);
        }
    };

    // ### floatp
    // floatp object => generalized-boolean
    private static final Primitive1 FLOATP = new Primitive1("floatp", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof LispFloat ? T : NIL;
        }
    };

    // ### double-float-high-bits
    private static final Primitive1 DOUBLE_FLOAT_HIGH_BITS =
        new Primitive1("double-float-high-bits", PACKAGE_SYS, false, "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat) {
                LispFloat f = (LispFloat) arg;
                return number(Double.doubleToLongBits(f.value) >>> 32);
            }
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### double-float-low-bits
    private static final Primitive1 DOUBLE_FLOAT_LOW_BITS =
        new Primitive1("double-float-low-bits", PACKAGE_SYS, false, "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat) {
                LispFloat f = (LispFloat) arg;
                return number(Double.doubleToLongBits(f.value) & 0xffffffffL);
            }
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### make-double-float bits => float
    private static final Primitive MAKE_DOUBLE_FLOAT =
        new Primitive("make-double-float", PACKAGE_SYS, false, "bits")
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof Fixnum) {
                long bits = (long) ((Fixnum)arg).value;
                return new LispFloat(Double.longBitsToDouble(bits));
            }
            if (arg instanceof Bignum) {
                long bits = ((Bignum)arg).value.longValue();
                return new LispFloat(Double.longBitsToDouble(bits));
            }
            return signal(new TypeError());
        }
    };
}
