/*
 * LispFloat.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispFloat.java,v 1.25 2003-08-22 13:59:12 piso Exp $
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

    private final float value;

    public LispFloat(float value)
    {
        this.value = value;
    }

    public int getType()
    {
        return TYPE_FLOAT;
    }

    public LispObject typeOf()
    {
        return Symbol.SINGLE_FLOAT;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.SINGLE_FLOAT)
            return T;
        if (typeSpecifier == Symbol.DOUBLE_FLOAT)
            return T;
        if (typeSpecifier == Symbol.SHORT_FLOAT)
            return T;
        if (typeSpecifier == Symbol.LONG_FLOAT)
            return T;
        if (typeSpecifier == Symbol.FLOAT)
            return T;
        if (typeSpecifier == Symbol.REAL)
            return T;
        if (typeSpecifier == Symbol.NUMBER)
            return T;
        return super.typep(typeSpecifier);
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

    public boolean equalp(LispObject obj)
    {
        if (obj instanceof LispFloat)
            return value == ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value == ((Bignum)obj).getValue().floatValue();
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

    public LispObject ZEROP()
    {
        return value == 0 ? T : NIL;
    }

    public static float getValue(LispObject obj) throws LispError
    {
        try {
            return ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "float");
        }
    }

    public final float getValue()
    {
        return value;
    }

    public LispObject add(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value + ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value + ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value + ((Bignum)obj).getValue().floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value + ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(add(c.getRealPart()), c.getImaginaryPart());
        }
        throw new TypeError(obj, "number");
    }

    public LispObject subtract(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value - ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value - ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value - ((Bignum)obj).getValue().floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value - ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(subtract(c.getRealPart()),
                                       ZERO.subtract(c.getImaginaryPart()));
        }
        throw new TypeError(obj, "number");
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value * ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value * ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value * ((Bignum)obj).getValue().floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value * ((Ratio)obj).floatValue());
        throw new TypeError(obj, "number");
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return new LispFloat(value / ((LispFloat)obj).value);
        if (obj instanceof Fixnum)
            return new LispFloat(value / ((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(value / ((Bignum)obj).getValue().floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(value / ((Ratio)obj).floatValue());
        throw new TypeError(obj, "number");
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return value == ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value == ((Bignum)obj).getValue().floatValue();
        if (obj instanceof Ratio)
            return value == ((Ratio)obj).floatValue();
        if (obj instanceof Complex)
            return obj.isEqualTo(this);
        throw new TypeError(obj, "number");
    }

    public boolean isNotEqualTo(LispObject obj) throws LispError
    {
        return !isEqualTo(obj);
    }

    public boolean isLessThan(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return value < ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value < ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value < ((Bignum)obj).getValue().floatValue();
        if (obj instanceof Ratio)
            return value < ((Ratio)obj).floatValue();
        throw new TypeError(obj, "real");
    }

    public boolean isGreaterThan(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return value > ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value > ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value > ((Bignum)obj).getValue().floatValue();
        if (obj instanceof Ratio)
            return value > ((Ratio)obj).floatValue();
        throw new TypeError(obj, "real");
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return value <= ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value <= ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value <= ((Bignum)obj).getValue().floatValue();
        if (obj instanceof Ratio)
            return value <= ((Ratio)obj).floatValue();
        throw new TypeError(obj, "real");
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof LispFloat)
            return value >= ((LispFloat)obj).value;
        if (obj instanceof Fixnum)
            return value >= ((Fixnum)obj).getValue();
        if (obj instanceof Bignum)
            return value >= ((Bignum)obj).getValue().floatValue();
        if (obj instanceof Ratio)
            return value >= ((Ratio)obj).floatValue();
        throw new TypeError(obj, "real");
    }

    public LispObject truncate(LispObject obj) throws Condition
    {
        final LispThread thread = LispThread.currentThread();
        LispObject[] values = new LispObject[2];
        if (obj instanceof Fixnum) {
            long divisor = ((Fixnum)obj).getValue();
            float quotient = value / divisor;
            float remainder = value % divisor;
            if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
                values[0] = new Fixnum((int)quotient);
                values[1] = new LispFloat(remainder);
                thread.setValues(values);
                return values[0];
            }
        }
        if (obj instanceof LispFloat) {
            float divisor = ((LispFloat)obj).getValue();
            float quotient = value / divisor;
            if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
                int q = (int) quotient;
                values[0] = new Fixnum(q);
                values[1] = new LispFloat(value - q * divisor);
                thread.setValues(values);
                return values[0];
            }
            // We need to convert the quotient to a bignum.
            int bits = Float.floatToRawIntBits(quotient);
            Fixnum significand = new Fixnum((bits & 0x007fffff) | 0x800000);
            Fixnum exponent = new Fixnum(((bits >> 23) & 0xff) - 150);
            Fixnum sign = ((bits & 0x80000000) != 0) ? new Fixnum(-1) : Fixnum.ONE;
            LispObject result = significand;
            result =
                result.multiplyBy(Primitives.EXPT.execute(new Fixnum(2), exponent));
            result = result.multiplyBy(sign);
            // Calculate remainder.
            LispObject product = result.multiplyBy(obj);
            LispObject remainder = subtract(product);
            values[0] = result;
            values[1] = remainder;
            thread.setValues(values);
            return values[0];
        }
        throw new LispError("LispFloat.truncate(): not implemented: " + obj.typeOf());
    }

    public int hashCode()
    {
        return Float.floatToIntBits(value);
    }

    public String toString()
    {
        return String.valueOf(value);
    }

    // ### integer-decode-float
    // integer-decode-float float => significand, exponent, integer-sign
    private static final Primitive1 INTEGER_DECODE_FLOAT =
        new Primitive1("integer-decode-float") {
        public LispObject execute(LispObject arg) throws LispError
        {
            if (arg instanceof LispFloat) {
                int bits = Float.floatToRawIntBits(((LispFloat)arg).getValue());
                Fixnum significand = new Fixnum((bits & 0x007fffff) | 0x800000);
                Fixnum exponent = new Fixnum(((bits >> 23) & 0xff) - 150);
                Fixnum sign = ((bits & 0x80000000) != 0) ? new Fixnum(-1) : Fixnum.ONE;
                LispObject[] values = new LispObject[3];
                values[0] = significand;
                values[1] = exponent;
                values[2] = sign;
                LispThread.currentThread().setValues(values);
                return values[0];
            }
            throw new TypeError(arg, "float");
        }
    };

    // ### float-radix
    // float-radix float => float-radix
    private static final Primitive1 FLOAT_RADIX =
        new Primitive1("float-radix") {
        public LispObject execute(LispObject arg) throws LispError
        {
            if (arg instanceof LispFloat)
                return Fixnum.TWO;
            throw new TypeError(arg, "float");
        }
    };

    public static LispFloat coerceToFloat(LispObject obj) throws TypeError
    {
        if (obj instanceof LispFloat)
            return (LispFloat) obj;
        if (obj instanceof Fixnum)
            return new LispFloat(((Fixnum)obj).getValue());
        if (obj instanceof Bignum)
            return new LispFloat(((Bignum)obj).getValue().floatValue());
        if (obj instanceof Ratio)
            return new LispFloat(((Ratio)obj).floatValue());
        throw new TypeError(obj, "real number");
    }

    // ### float
    // float number &optional prototype => float
    private static final Primitive FLOAT = new Primitive("float") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            final int length = args.length;
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            // FIXME Ignore prototype (args[1] if present).
            return coerceToFloat(args[0]);
        }
    };
}
