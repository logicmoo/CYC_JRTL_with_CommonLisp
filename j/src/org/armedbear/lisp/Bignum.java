/*
 * Bignum.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Bignum.java,v 1.54 2004-03-13 17:55:25 piso Exp $
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

public final class Bignum extends LispObject
{
    public final BigInteger value;

    public Bignum(long l)
    {
        value = BigInteger.valueOf(l);
    }

    public Bignum(BigInteger n)
    {
        value = n;
    }

    public LispObject typeOf()
    {
        return Symbol.BIGNUM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.BIGNUM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.BIGNUM)
            return T;
        if (type == BuiltInClass.BIGNUM)
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
            return value.signum() >= 0 ? T : NIL;
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
        if (obj instanceof Bignum) {
            if (value.equals(((Bignum)obj).value))
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Bignum) {
            if (value.equals(((Bignum)obj).value))
                return true;
        }
        return false;
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Bignum)
            return value.equals(((Bignum)obj).value);
        if (obj instanceof LispFloat)
            return floatValue() == ((LispFloat)obj).getValue();
        return false;
    }

    public LispObject ABS()
    {
        if (value.signum() >= 0)
            return this;
        return new Bignum(value.negate());
    }

    public LispObject NUMERATOR()
    {
        return this;
    }

    public LispObject DENOMINATOR()
    {
        return Fixnum.ONE;
    }

    public boolean evenp() throws ConditionThrowable
    {
        return !value.testBit(0);
    }

    public boolean oddp() throws ConditionThrowable
    {
        return value.testBit(0);
    }

    public boolean plusp()
    {
        return value.signum() > 0;
    }

    public boolean minusp()
    {
        return value.signum() < 0;
    }

    public boolean zerop()
    {
        return false;
    }

    public double floatValue() throws ConditionThrowable
    {
        double d = value.doubleValue();
        if (Double.isInfinite(d))
            signal(new TypeError(toString() +
                                 " is too large to be converted to a float"));
        return d;
    }

    public static BigInteger getValue(LispObject obj) throws ConditionThrowable
    {
        try {
            return ((Bignum)obj).value;
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, "bignum"));
            // Not reached.
            return null;
        }
    }

    public final BigInteger getValue()
    {
        return value;
    }

    public final LispObject incr()
    {
        return number(value.add(BigInteger.ONE));
    }

    public final LispObject decr()
    {
        return number(value.subtract(BigInteger.ONE));
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return number(value.add(Fixnum.getBigInteger(obj)));
        if (obj instanceof Bignum)
            return number(value.add(((Bignum)obj).value));
        if (obj instanceof Ratio) {
            BigInteger numerator = ((Ratio)obj).numerator();
            BigInteger denominator = ((Ratio)obj).denominator();
            return number(value.multiply(denominator).add(numerator),
                denominator);
        }
        if (obj instanceof LispFloat)
            return new LispFloat(floatValue() + ((LispFloat)obj).getValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(add(c.getRealPart()), c.getImaginaryPart());
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return number(value.subtract(Fixnum.getBigInteger(obj)));
        if (obj instanceof Bignum)
            return number(value.subtract(((Bignum)obj).value));
        if (obj instanceof Ratio) {
            BigInteger numerator = ((Ratio)obj).numerator();
            BigInteger denominator = ((Ratio)obj).denominator();
            return number(value.multiply(denominator).subtract(numerator),
                denominator);
        }
        if (obj instanceof LispFloat)
            return new LispFloat(floatValue() - ((LispFloat)obj).getValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(subtract(c.getRealPart()),
                                       Fixnum.ZERO.subtract(c.getImaginaryPart()));
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            int n = ((Fixnum)obj).value;
            if (n == 0)
                return Fixnum.ZERO;
            if (n == 1)
                return this;
            return new Bignum(value.multiply(BigInteger.valueOf(n)));
        }
        if (obj instanceof Bignum)
            return new Bignum(value.multiply(((Bignum)obj).value));
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator();
            return number(n.multiply(value), ((Ratio)obj).denominator());
        }
        if (obj instanceof LispFloat)
            return new LispFloat(floatValue() * ((LispFloat)obj).getValue());
        return signal(new TypeError(obj, "number"));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return number(value, Fixnum.getBigInteger(obj));
        if (obj instanceof Bignum)
            return number(value, ((Bignum)obj).value);
        if (obj instanceof Ratio) {
            BigInteger d = ((Ratio)obj).denominator();
            return number(d.multiply(value), ((Ratio)obj).numerator());
        }
        if (obj instanceof LispFloat)
            return new LispFloat(floatValue() / ((LispFloat)obj).getValue());
        return signal(new TypeError(obj, "number"));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Bignum)
            return value.equals(((Bignum)obj).value);
        if (obj instanceof LispFloat)
            return floatValue() == ((LispFloat)obj).getValue();
        if (obj.numberp())
            return false;
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Bignum)
            return !value.equals(((Bignum)obj).value);
        if (obj instanceof LispFloat)
            return floatValue() != ((LispFloat)obj).getValue();
        if (obj.numberp())
            return true;
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isLessThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) < 0;
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) < 0;
        if (obj instanceof Ratio) {
            BigInteger n = value.multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) < 0;
        }
        if (obj instanceof LispFloat)
            return floatValue() < ((LispFloat)obj).getValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) > 0;
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) > 0;
        if (obj instanceof Ratio) {
            BigInteger n = value.multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) > 0;
        }
        if (obj instanceof LispFloat)
            return floatValue() > ((LispFloat)obj).getValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) <= 0;
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) <= 0;
        if (obj instanceof Ratio) {
            BigInteger n = value.multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) <= 0;
        }
        if (obj instanceof LispFloat)
            return floatValue() <= ((LispFloat)obj).getValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) >= 0;
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) >= 0;
        if (obj instanceof Ratio) {
            BigInteger n = value.multiply(((Ratio)obj).denominator());
            return n.compareTo(((Ratio)obj).numerator()) >= 0;
        }
        if (obj instanceof LispFloat)
            return floatValue() >= ((LispFloat)obj).getValue();
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject value1, value2;
	try {
            if (obj instanceof Ratio) {
                Ratio divisor = (Ratio) obj;
                LispObject quotient =
                    multiplyBy(divisor.DENOMINATOR()).truncate(divisor.NUMERATOR());
                LispObject remainder =
                    subtract(quotient.multiplyBy(divisor));
                value1 = quotient;
                value2 = remainder;
            } else if (obj instanceof Fixnum) {
                BigInteger divisor = ((Fixnum)obj).getBigInteger();
                BigInteger[] results = value.divideAndRemainder(divisor);
                BigInteger quotient = results[0];
                BigInteger remainder = results[1];
                value1 = number(quotient);
                value2 = (remainder.signum() == 0) ? Fixnum.ZERO : number(remainder);
            } else if (obj instanceof Bignum) {
                BigInteger divisor = ((Bignum)obj).value;
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
                return signal(new LispError("Bignum.truncate(): not implemented: " + obj.typeOf()));
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
        BigInteger n = value;
        if (obj instanceof Fixnum) {
            int count = ((Fixnum)obj).value;
            if (count == 0)
                return this;
            // BigInteger.shiftLeft() succumbs to a stack overflow if count
            // is Integer.MIN_VALUE, so...
            if (count == Integer.MIN_VALUE)
                return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            return number(n.shiftLeft(count));
        }
        if (obj instanceof Bignum) {
            BigInteger count = ((Bignum)obj).value;
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
        return value.hashCode();
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
        String s = value.toString(base).toUpperCase();
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
