/*
 * Fixnum.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Fixnum.java,v 1.85 2004-03-13 17:54:18 piso Exp $
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

import java.math.BigInteger;

public final class Fixnum extends LispObject
{
    public static final Fixnum ZERO      = new Fixnum(0);
    public static final Fixnum ONE       = new Fixnum(1);
    public static final Fixnum TWO       = new Fixnum(2);
    public static final Fixnum MINUS_ONE = new Fixnum(-1);

    public final int value;

    public Fixnum(int value)
    {
        this.value = value;
    }

    public Object javaInstance()
    {
        return new Integer(value);
    }

    public Object javaInstance(Class c)
    {
        String cn = c.getName();
        if (cn.equals("java.lang.Byte") || cn.equals("byte"))
            return new Byte(((Integer)javaInstance()).byteValue());
        if (cn.equals("java.lang.Short") || cn.equals("short"))
            return new Short(((Integer)javaInstance()).shortValue());
        if (cn.equals("java.lang.Long") || cn.equals("long"))
            return new Long(((Integer)javaInstance()).longValue());
        return javaInstance();
    }

    public static Fixnum getInstance(int value)
    {
        return new Fixnum(value);
    }

    public LispObject typeOf()
    {
        if (value == 0 || value == 1)
            return Symbol.BIT;
        else
            return Symbol.FIXNUM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.FIXNUM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.FIXNUM)
            return T;
        if (type == BuiltInClass.FIXNUM)
            return T;
        if (type == Symbol.INTEGER)
            return T;
        if (type == BuiltInClass.INTEGER)
            return T;
        if (type == Symbol.RATIONAL)
            return T;
        if (type == BuiltInClass.RATIONAL)
            return T;
        if (type == Symbol.REAL)
            return T;
        if (type == BuiltInClass.REAL)
            return T;
        if (type == Symbol.NUMBER)
            return T;
        if (type == BuiltInClass.NUMBER)
            return T;
        if (type == Symbol.SIGNED_BYTE)
            return T;
        if (type == Symbol.UNSIGNED_BYTE)
            return value >= 0 ? T : NIL;
        if (type == Symbol.BIT)
            return (value == 0 || value == 1) ? T : NIL;
        return super.typep(type);
    }

    public LispObject NUMBERP()
    {
        return T;
    }

    public boolean numberp()
    {
        return true;
    }

    public boolean integerp()
    {
        return true;
    }

    public boolean rationalp()
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
        if (obj instanceof Fixnum) {
            if (value == ((Fixnum)obj).value)
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Fixnum) {
            if (value == ((Fixnum)obj).value)
                return true;
        }
        return false;
    }

    public boolean equalp(LispObject obj)
    {
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).value;
        if (obj instanceof LispFloat)
            return (float) value == ((LispFloat)obj).getValue();
        return false;
    }

    public LispObject ABS()
    {
        if (value >= 0)
            return this;
        return number(-((long)value));
    }

    public LispObject NUMERATOR()
    {
        return this;
    }

    public LispObject DENOMINATOR()
    {
        return ONE;
    }

    public boolean evenp() throws ConditionThrowable
    {
        return (value & 0x01) == 0;
    }

    public boolean oddp() throws ConditionThrowable
    {
        return (value & 0x01) != 0;
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

    public static int getValue(LispObject obj) throws ConditionThrowable
    {
        try {
            return ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, "fixnum"));
            // Not reached.
            return 0;
        }
    }

    public static int getInt(LispObject obj) throws ConditionThrowable
    {
        try {
            return (int) ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, "fixnum"));
            // Not reached.
            return 0;
        }
    }

    public static BigInteger getBigInteger(LispObject obj) throws ConditionThrowable
    {
        try {
            return BigInteger.valueOf(((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, "fixnum"));
            // Not reached.
            return null;
        }
    }

    public static float getFloat(LispObject obj) throws ConditionThrowable
    {
        try {
            return (float) ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, "fixnum"));
            return 0;
        }
    }

    public final int getValue()
    {
        return value;
    }

    public final BigInteger getBigInteger()
    {
        return BigInteger.valueOf(value);
    }

    public final LispObject incr()
    {
        if (value < Integer.MAX_VALUE)
            return new Fixnum(value + 1);
        return new Bignum((long) value + 1);
    }

    public final LispObject decr()
    {
        if (value > Integer.MIN_VALUE)
            return new Fixnum(value - 1);
        return new Bignum((long) value - 1);
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return number((long) value + ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return number(getBigInteger().add(Bignum.getValue(obj)));
        if (obj instanceof Ratio) {
            BigInteger numerator = ((Ratio)obj).numerator();
            BigInteger denominator = ((Ratio)obj).denominator();
            return number(
                getBigInteger().multiply(denominator).add(numerator),
                denominator);
        }
        if (obj instanceof LispFloat)
            return new LispFloat(value + LispFloat.getValue(obj));
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(add(c.getRealPart()), c.getImaginaryPart());
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return number((long) value - ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return number(getBigInteger().subtract(Bignum.getValue(obj)));
        if (obj instanceof Ratio) {
            BigInteger numerator = ((Ratio)obj).numerator();
            BigInteger denominator = ((Ratio)obj).denominator();
            return number(
                getBigInteger().multiply(denominator).subtract(numerator),
                denominator);
        }
        if (obj instanceof LispFloat)
            return new LispFloat(value - LispFloat.getValue(obj));
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(subtract(c.getRealPart()),
                                       ZERO.subtract(c.getImaginaryPart()));
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return number((long) value * ((Fixnum)obj).value);
        if (obj instanceof Bignum)
            return number(getBigInteger().multiply(((Bignum)obj).value));
        if (obj instanceof Ratio) {
            BigInteger numerator = ((Ratio)obj).numerator();
            BigInteger denominator = ((Ratio)obj).denominator();
            return number(
                getBigInteger().multiply(numerator),
                denominator);
        }
        if (obj instanceof LispFloat)
            return new LispFloat(value * LispFloat.getValue(obj));
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(multiplyBy(c.getRealPart()),
                                       multiplyBy(c.getImaginaryPart()));
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        try {
            if (obj instanceof Fixnum) {
                final int divisor = ((Fixnum)obj).value;
                if (value % divisor == 0)
                    return new Fixnum(value / divisor);
                return number(BigInteger.valueOf(value),
                              BigInteger.valueOf(divisor));
            }
            if (obj instanceof Bignum)
                return number(getBigInteger(), ((Bignum)obj).getValue());
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(getBigInteger().multiply(denominator),
                              numerator);
            }
            if (obj instanceof LispFloat)
                return new LispFloat(value / LispFloat.getValue(obj));
            if (obj instanceof Complex) {
                Complex c = (Complex) obj;
                LispObject realPart = c.getRealPart();
                LispObject imagPart = c.getImaginaryPart();
                LispObject denominator =
                    realPart.multiplyBy(realPart).add(imagPart.multiplyBy(imagPart));
                return Complex.getInstance(multiplyBy(realPart).divideBy(denominator),
                                           Fixnum.ZERO.subtract(multiplyBy(imagPart).divideBy(denominator)));
            }
            return signal(new TypeError(obj, "number"));
        }
        catch (ArithmeticException e) {
            if (obj.zerop())
                return signal(new DivisionByZero());
            return signal(new ArithmeticError(e.getMessage()));
        }
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).value;
        if (obj instanceof LispFloat)
            return (float) value == LispFloat.getValue(obj);
        if (obj instanceof Complex)
            return obj.isEqualTo(this);
        if (obj.numberp())
            return false;
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value != ((Fixnum)obj).value;
            // obj is not a fixnum.
        if (obj instanceof LispFloat)
            return (float) value != LispFloat.getValue(obj);
        if (obj instanceof Complex)
            return obj.isNotEqualTo(this);
        if (obj.numberp())
            return true;
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isLessThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value < ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return getBigInteger().compareTo(Bignum.getValue(obj)) < 0;
        if (obj instanceof Ratio) {
            BigInteger n =
                getBigInteger().multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) < 0;
        }
        if (obj instanceof LispFloat)
            return (float) value < LispFloat.getValue(obj);
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value > ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return getBigInteger().compareTo(Bignum.getValue(obj)) > 0;
        if (obj instanceof Ratio) {
            BigInteger n =
                getBigInteger().multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) > 0;
        }
        if (obj instanceof LispFloat)
            return (float) value > LispFloat.getValue(obj);
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value <= ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return getBigInteger().compareTo(Bignum.getValue(obj)) <= 0;
        if (obj instanceof Ratio) {
            BigInteger n =
                getBigInteger().multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) <= 0;
        }
        if (obj instanceof LispFloat)
            return (float) value <= LispFloat.getValue(obj);
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value >= ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return getBigInteger().compareTo(Bignum.getValue(obj)) >= 0;
        if (obj instanceof Ratio) {
            BigInteger n =
                getBigInteger().multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) >= 0;
        }
        if (obj instanceof LispFloat)
            return (float) value >= LispFloat.getValue(obj);
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        final LispObject value1, value2;
	try {
            if (obj instanceof Fixnum) {
                long divisor = ((Fixnum)obj).value;
                long quotient = value / divisor;
                long remainder = value % divisor;
                value1 = number(quotient);
                value2 = remainder == 0 ? Fixnum.ZERO : number(remainder);
            } else if (obj instanceof Bignum) {
                BigInteger value = getBigInteger();
                BigInteger divisor = ((Bignum)obj).getValue();
                BigInteger[] results = value.divideAndRemainder(divisor);
                BigInteger quotient = results[0];
                BigInteger remainder = results[1];
                value1 = number(quotient);
                value2 = (remainder.signum() == 0) ? Fixnum.ZERO : number(remainder);
            } else if (obj instanceof Ratio) {
                Ratio divisor = (Ratio) obj;
                LispObject quotient =
                    multiplyBy(divisor.DENOMINATOR()).truncate(divisor.NUMERATOR());
                LispObject remainder =
                    subtract(quotient.multiplyBy(divisor));
                value1 = quotient;
                value2 = remainder;
            } else
                return signal(new LispError("Fixnum.truncate(): not implemented: " + obj.typeOf()));
        }
        catch (ArithmeticException e) {
            if (obj.zerop())
                return signal(new DivisionByZero());
            else
                return signal(new ArithmeticError(e.getMessage()));
        }
        return thread.setValues(value1, value2);
    }

    public LispObject ash(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            int count = ((Fixnum)obj).value;
            if (count == 0)
                return this;
            long n = value;
            if (n == 0)
                return this;
            if (count < -32) {
                // Right shift.
                return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            }
            if (count <= 32)
                return number(count > 0 ? (n << count) : (n >> -count));
            // BigInteger.shiftLeft() succumbs to a stack overflow if count
            // is Integer.MIN_VALUE, so...
            if (count == Integer.MIN_VALUE)
                return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            return number(BigInteger.valueOf(value).shiftLeft(count));
        }
        if (obj instanceof Bignum) {
            BigInteger n = BigInteger.valueOf(value);
            BigInteger count = ((Bignum)obj).getValue();
            if (count.signum() > 0)
                return signal(new LispError("Can't represent result of left shift."));
            if (count.signum() < 0)
                return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            Debug.bug(); // Shouldn't happen.
        }
        return signal(new TypeError(obj, Symbol.INTEGER));
    }

    public int hashCode()
    {
        return value;
    }

    public String toString()
    {
        final LispThread thread = LispThread.currentThread();
        int base;
        try {
            base = Fixnum.getValue(_PRINT_BASE_.symbolValueNoThrow(thread));
        }
        catch (Throwable t) {
            Debug.trace(t);
            base = 10;
        }
        String s = Integer.toString(value, base).toUpperCase();
        if (_PRINT_RADIX_.symbolValueNoThrow(thread) != NIL) {
            StringBuffer sb = new StringBuffer();
            switch (base) {
                case 2:
                    sb.append("#b");
                    sb.append(s);
                    break;
                case 8:
                    sb.append("#o");
                    sb.append(s);
                    break;
                case 10:
                    sb.append(s);
                    sb.append('.');
                    break;
                case 16:
                    sb.append("#x");
                    sb.append(s);
                    break;
                default:
                    sb.append('#');
                    sb.append(String.valueOf(base));
                    sb.append('r');
                    sb.append(s);
                    break;
            }
            s = sb.toString();
        }
        return s;
    }
}
