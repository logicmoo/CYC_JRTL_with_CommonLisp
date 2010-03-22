/*
 * SingleFloat.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: SingleFloat.java 12535 2010-03-14 19:17:37Z ehuelsmann $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class SingleFloat extends LispFloat
{
    public static final SingleFloat ZERO       = new SingleFloat(0);
    public static final SingleFloat MINUS_ZERO = new SingleFloat(-0.0f);
    public static final SingleFloat ONE        = new SingleFloat(1);
    public static final SingleFloat MINUS_ONE  = new SingleFloat(-1);

    public static final SingleFloat SINGLE_FLOAT_POSITIVE_INFINITY =
        makeSingle(Float.POSITIVE_INFINITY);

    public static final SingleFloat SINGLE_FLOAT_NEGATIVE_INFINITY =
        makeSingle(Float.NEGATIVE_INFINITY);

    static {
        LispSymbols.SINGLE_FLOAT_POSITIVE_INFINITY.initializeConstant(SINGLE_FLOAT_POSITIVE_INFINITY);
        LispSymbols.SINGLE_FLOAT_NEGATIVE_INFINITY.initializeConstant(SINGLE_FLOAT_NEGATIVE_INFINITY);
    }

    public static SingleFloat makeFloat(float f) {
        if (f == 0) {
            int bits = Float.floatToRawIntBits(f);
            if (bits < 0)
                return MINUS_ZERO;
            else
                return ZERO;
        }
      else if (f == 1)
          return ONE;
      else if (f == -1)
          return MINUS_ONE;
      else
          return new SingleFloat(f);
  }

    public final float value;

    public SingleFloat(float value)
    {
        this.value = value;
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.SINGLE_FLOAT;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.SINGLE_FLOAT;
    }

    @Override
    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.FLOAT)
            return T;
        if (typeSpecifier == LispSymbols.REAL)
            return T;
        if (typeSpecifier == LispSymbols.NUMBER)
            return T;
        if (typeSpecifier == LispSymbols.SINGLE_FLOAT)
            return T;
        if (typeSpecifier == LispSymbols.SHORT_FLOAT)
            return T;
        if (typeSpecifier == BuiltInClass.FLOAT)
            return T;
        if (typeSpecifier == BuiltInClass.SINGLE_FLOAT)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
    public boolean isNumber()
    {
        return true;
    }

    @Override
    public boolean realp()
    {
        return true;
    }

    @Override
    public boolean eql(SubLObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof SingleFloat) {
            if (value == 0) {
                // "If an implementation supports positive and negative zeros
                // as distinct values, then (EQL 0.0 -0.0) returns false."
                float f = ((SingleFloat)obj).value;
                int bits = Float.floatToRawIntBits(f);
                return bits == Float.floatToRawIntBits(value);
            }
            if (value == ((SingleFloat)obj).value)
                return true;
        }
        return false;
    }

    @Override
    public boolean equal(SubLObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof SingleFloat) {
            if (value == 0) {
                // same as EQL
                float f = ((SingleFloat)obj).value;
                int bits = Float.floatToRawIntBits(f);
                return bits == Float.floatToRawIntBits(value);
            }
            if (value == ((SingleFloat)obj).value)
                return true;
        }
        return false;
    }

    @Override
    public boolean equalp(int n)
    {
        // "If two numbers are the same under =."
        return value == n;
    }

    @Override
    public boolean equalp(SubLObject obj)
    {
        if (obj instanceof SingleFloat)
            return value == ((SingleFloat)obj).value;
        if (obj instanceof DoubleFloat)
            return value == ((DoubleFloat)obj).value;
        if (obj instanceof Fixnum)
            return value == ((Fixnum)obj).value;
        if (obj instanceof Bignum)
            return value == ((Bignum)obj).floatValue();
        if (obj instanceof Ratio)
            return value == ((Ratio)obj).floatValue();
        return false;
    }

    @Override
    public SubLObject ABS()
    {
        if (value > 0)
            return this;
        if (value == 0) // 0.0 or -0.0
            return ZERO;
        return makeSingle(- value);
    }

    @Override
    public boolean isPositive()
    {
        return value > 0;
    }

    @Override
    public boolean isNegative()
    {
        return value < 0;
    }

    @Override
    public boolean isZero()
    {
        return value == 0;
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }

//    public static double getValue(LispObject obj)
//    {
//        if (obj instanceof SingleFloat)
//            return ((SingleFloat)obj).value;
//        type_error(obj, LispSymbols.FLOAT);
//        // not reached
//        return 0.0D;
//    }
//
//    public final float getValue()
//    {
//        return value;
//    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public Object javaInstance()
    {
        return Float.valueOf(value);
    }

    @Override
    public Object javaInstance(Class c)
    {
        String cn = c.getName();
        if (cn.equals("java.lang.Float") || cn.equals("float"))
            return Float.valueOf(value);
        return javaInstance();
    }

    @Override
    public final SubLObject inc()
    {
        return makeSingle(value + 1);
    }

    @Override
    public final SubLObject dec()
    {
        return makeSingle(value - 1);
    }

    @Override
    public SubLObject add(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return makeSingle(value + ((Fixnum)obj).value);
        if (obj instanceof SingleFloat)
            return makeSingle(value + ((SingleFloat)obj).value);
        if (obj instanceof DoubleFloat)
            return makeDouble(value + ((DoubleFloat)obj).value);
        if (obj instanceof Bignum)
            return makeSingle(value + ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return makeSingle(value + ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return LispObjectFactory.makeComplex(add(c.getRealPart()), c.getImaginaryPart());
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public SubLObject negate()
    {
        if (value == 0) {
            int bits = Float.floatToRawIntBits(value);
            return (bits < 0) ? ZERO : MINUS_ZERO;
        }
        return makeSingle(-value);
    }

    @Override
    public SubLObject sub(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return makeSingle(value - ((Fixnum)obj).value);
        if (obj instanceof SingleFloat)
            return makeSingle(value - ((SingleFloat)obj).value);
        if (obj instanceof DoubleFloat)
            return makeDouble(value - ((DoubleFloat)obj).value);
        if (obj instanceof Bignum)
            return makeSingle(value - ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return makeSingle(value - ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return LispObjectFactory.makeComplex(sub(c.getRealPart()),
                                       ZERO.sub(c.getImaginaryPart()));
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public SubLObject mult(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return makeSingle(value * ((Fixnum)obj).value);
        if (obj instanceof SingleFloat)
            return makeSingle(value * ((SingleFloat)obj).value);
        if (obj instanceof DoubleFloat)
            return makeDouble(value * ((DoubleFloat)obj).value);
        if (obj instanceof Bignum)
            return makeSingle(value * ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return makeSingle(value * ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return LispObjectFactory.makeComplex(mult(c.getRealPart()),
                                       mult(c.getImaginaryPart()));
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public SubLObject divideBy(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return makeSingle(value / ((Fixnum)obj).value);
        if (obj instanceof SingleFloat)
            return makeSingle(value / ((SingleFloat)obj).value);
        if (obj instanceof DoubleFloat)
            return makeDouble(value / ((DoubleFloat)obj).value);
        if (obj instanceof Bignum)
            return makeSingle(value / ((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return makeSingle(value / ((Ratio)obj).floatValue());
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            SubLObject re = c.getRealPart();
            SubLObject im = c.getImaginaryPart();
            SubLObject denom = re.mult(re).add(im.mult(im));
            SubLObject resX = mult(re).divideBy(denom);
            SubLObject resY =
                mult(Fixnum.MINUS_ONE).mult(im).divideBy(denom);
            return LispObjectFactory.makeComplex(resX, resY);
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public boolean numE(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return rational().numE(obj);
        if (obj instanceof SingleFloat)
            return value == ((SingleFloat)obj).value;
        if (obj instanceof DoubleFloat)
            return value == ((DoubleFloat)obj).value;
        if (obj instanceof Bignum)
            return rational().numE(obj);
        if (obj instanceof Ratio)
            return rational().numE(obj);
        if (obj instanceof Complex)
            return obj.numE(this);
        error(new TypeError(obj, LispSymbols.NUMBER));
        // Not reached.
        return false;
    }

    @Override
    public boolean isNotEqualTo(SubLObject obj)
    {
        return !numE(obj);
    }

    @Override
    public boolean numL(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return rational().numL(obj);
        if (obj instanceof SingleFloat)
            return value < ((SingleFloat)obj).value;
        if (obj instanceof DoubleFloat)
            return value < ((DoubleFloat)obj).value;
        if (obj instanceof Bignum)
            return rational().numL(obj);
        if (obj instanceof Ratio)
            return rational().numL(obj);
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public boolean numG(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return rational().numG(obj);
        if (obj instanceof SingleFloat)
            return value > ((SingleFloat)obj).value;
        if (obj instanceof DoubleFloat)
            return value > ((DoubleFloat)obj).value;
        if (obj instanceof Bignum)
            return rational().numG(obj);
        if (obj instanceof Ratio)
            return rational().numG(obj);
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public boolean numLE(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return rational().numLE(obj);
        if (obj instanceof SingleFloat)
            return value <= ((SingleFloat)obj).value;
        if (obj instanceof DoubleFloat)
            return value <= ((DoubleFloat)obj).value;
        if (obj instanceof Bignum)
            return rational().numLE(obj);
        if (obj instanceof Ratio)
            return rational().numLE(obj);
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public boolean numGE(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return rational().numGE(obj);
        if (obj instanceof SingleFloat)
            return value >= ((SingleFloat)obj).value;
        if (obj instanceof DoubleFloat)
            return value >= ((DoubleFloat)obj).value;
        if (obj instanceof Bignum)
            return rational().numGE(obj);
        if (obj instanceof Ratio)
            return rational().numGE(obj);
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public SubLObject truncate(SubLObject obj)
    {
        // "When rationals and floats are combined by a numerical function,
        // the rational is first converted to a float of the same format."
        // 12.1.4.1
        if (obj instanceof Fixnum) {
            return truncate(makeSingle(((Fixnum)obj).value));
        }
        if (obj instanceof Bignum) {
            return truncate(makeSingle(((Bignum)obj).floatValue()));
        }
        if (obj instanceof Ratio) {
            return truncate(makeSingle(((Ratio)obj).floatValue()));
        }
        if (obj instanceof SingleFloat) {
            final LispThread thread = LispThread.currentThread();
            float divisor = ((SingleFloat)obj).value;
            float quotient = value / divisor;
            if (value != 0)
                MathFunctions.OverUnderFlowCheck(quotient);
            if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
                int q = (int) quotient;
                return thread.setValues(LispObjectFactory.makeInteger(q),
                                        makeSingle(value - q * divisor));
            }
            // We need to convert the quotient to a bignum.
            int bits = Float.floatToRawIntBits(quotient);
            int s = ((bits >> 31) == 0) ? 1 : -1;
            int e = (int) ((bits >> 23) & 0xff);
            long m;
            if (e == 0)
                m = (bits & 0x7fffff) << 1;
            else
                m = (bits & 0x7fffff) | 0x800000;
            SubLObject significand = number(m);
            Fixnum exponent = LispObjectFactory.makeInteger(e - 150);
            Fixnum sign = LispObjectFactory.makeInteger(s);
            SubLObject result = significand;
            result =
                result.mult(MathFunctions.EXPT.execute(Fixnum.TWO, exponent));
            result = result.mult(sign);
            // Calculate remainder.
            SubLObject product = result.mult(obj);
            SubLObject remainder = sub(product);
            return thread.setValues(result, remainder);
        }
        if (obj instanceof DoubleFloat) {
            final LispThread thread = LispThread.currentThread();
            double divisor = ((DoubleFloat)obj).value;
            double quotient = value / divisor;
            if (value != 0)
                MathFunctions.OverUnderFlowCheck(quotient);
            if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
                int q = (int) quotient;
                return thread.setValues(LispObjectFactory.makeInteger(q),
                                        makeDouble(value - q * divisor));
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
            SubLObject significand = number(m);
            Fixnum exponent = LispObjectFactory.makeInteger(e - 1075);
            Fixnum sign = LispObjectFactory.makeInteger(s);
            SubLObject result = significand;
            result =
                result.mult(MathFunctions.EXPT.execute(Fixnum.TWO, exponent));
            result = result.mult(sign);
            // Calculate remainder.
            SubLObject product = result.mult(obj);
            SubLObject remainder = sub(product);
            return thread.setValues(result, remainder);
        }
        return error(new TypeError(obj, LispSymbols.REAL));
    }

    @Override
    public int hashCodeLisp()
    {
        return Float.floatToIntBits(value);
    }

    @Override
    public int psxhash()
    {
        if ((value % 1) == 0)
            return (((int)value) & 0x7fffffff);
        else
            return (hashCodeLisp() & 0x7fffffff);
    }

    @Override
    public String writeToString()
    {
        if (value == Float.POSITIVE_INFINITY) {
            StringBuffer sb = new StringBuffer("#.");
            sb.append(LispSymbols.SINGLE_FLOAT_POSITIVE_INFINITY.writeToString());
            return sb.toString();
        }
        if (value == Float.NEGATIVE_INFINITY) {
            StringBuffer sb = new StringBuffer("#.");
            sb.append(LispSymbols.SINGLE_FLOAT_NEGATIVE_INFINITY.writeToString());
            return sb.toString();
        }

        LispThread thread = LispThread.currentThread();
        boolean printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread) != NIL;

        if (/*value != value ||*/ Float.isNaN(value)) {
            if (printReadably)
                return "#.(progn \"Comment: create a NaN.\" (/ 0.0s0 0.0s0))";
            else
                return "#<SINGLE-FLOAT NaN>";
        }
        String s1 = String.valueOf(value);
        if (printReadably ||
            !memq(LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue(thread),
                  list(LispSymbols.SINGLE_FLOAT, LispSymbols.SHORT_FLOAT)))
        {
            if (s1.indexOf('E') >= 0)
                return s1.replace('E', 'f');
            else
                return s1.concat("f0");
        } else
            return s1;
    }

    public SubLObject rational()
    {
        final int bits = Float.floatToRawIntBits(value);
        int sign = ((bits >> 31) == 0) ? 1 : -1;
        int storedExponent = ((bits >> 23) & 0xff);
        long mantissa;
        if (storedExponent == 0)
            mantissa = (bits & 0x7fffff) << 1;
        else
            mantissa = (bits & 0x7fffff) | 0x800000;
        if (mantissa == 0)
            return Fixnum.ZERO;
        if (sign < 0)
            mantissa = -mantissa;
        // Subtract bias.
        final int exponent = storedExponent - 127;
        BigInteger numerator, denominator;
        if (exponent < 0) {
            numerator = BigInteger.valueOf(mantissa);
            denominator = BigInteger.valueOf(1).shiftLeft(23 - exponent);
        } else {
            numerator = BigInteger.valueOf(mantissa).shiftLeft(exponent);
            denominator = BigInteger.valueOf(0x800000); // (ash 1 23)
        }
        return number(numerator, denominator);
    }

    public static SingleFloat coerceToFloat(SubLObject obj)
    {
        if (obj instanceof Fixnum)
            return makeSingle(((Fixnum)obj).value);
        if (obj instanceof SingleFloat)
            return (SingleFloat) obj;
        if (obj instanceof DoubleFloat)
            return makeSingle((float)((DoubleFloat)obj).value);
        if (obj instanceof Bignum)
            return makeSingle(((Bignum)obj).floatValue());
        if (obj instanceof Ratio)
            return makeSingle(((Ratio)obj).floatValue());
        error(new TypeError("The value " + obj.writeToString() +
                             " cannot be converted to type SINGLE-FLOAT."));
        // Not reached.
        return null;
    }
}
