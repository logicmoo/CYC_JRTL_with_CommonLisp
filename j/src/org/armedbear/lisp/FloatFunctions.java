/*
 * FloatFunctions.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: FloatFunctions.java,v 1.2 2005-03-17 14:45:50 piso Exp $
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

public final class FloatFunctions extends Lisp
{
    // ### integer-decode-float
    // integer-decode-float float => significand, exponent, integer-sign
    private static final Primitive INTEGER_DECODE_FLOAT =
        new Primitive("integer-decode-float", "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat) {
                LispObject[] values = new LispObject[3];
                int bits =
                    Float.floatToRawIntBits(((SingleFloat)arg).value);
                int s = ((bits >> 31) == 0) ? 1 : -1;
                int e = (int) ((bits >> 23) & 0xffL);
                int m;
                if (e == 0)
                    m = (bits & 0x7fffff) << 1;
                else
                    m = (bits & 0x7fffff) | 0x800000;
                LispObject significand = number(m);
                Fixnum exponent = new Fixnum(e - 150);
                Fixnum sign = new Fixnum(s);
                return LispThread.currentThread().setValues(significand,
                                                            exponent,
                                                            sign);
            }
            if (arg instanceof DoubleFloat) {
                LispObject[] values = new LispObject[3];
                long bits =
                    Double.doubleToRawLongBits((double)((DoubleFloat)arg).value);
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

    // ### rational
    private static final Primitive RATIONAL =
        new Primitive("rational", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat)
                return ((SingleFloat)arg).rational();
            if (arg instanceof DoubleFloat)
                return ((DoubleFloat)arg).rational();
            if (arg.rationalp())
                return arg;
            return signal(new TypeError(arg, Symbol.REAL));
        }
    };

    // ### float-radix
    // float-radix float => float-radix
    private static final Primitive FLOAT_RADIX =
        new Primitive("float-radix", "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat || arg instanceof DoubleFloat)
                return Fixnum.TWO;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    private static final Fixnum FIXNUM_24 = new Fixnum(24);
    private static final Fixnum FIXNUM_53 = new Fixnum(53);

    // ### float-digits
    // float-digits float => float-digits
    private static final Primitive FLOAT_DIGITS =
        new Primitive("float-digits", "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat)
                return FIXNUM_24;
            if (arg instanceof DoubleFloat)
                return FIXNUM_53;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### scale-float float integer => scaled-float
    private static final Primitive SCALE_FLOAT =
        new Primitive("scale-float", "float integer")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof SingleFloat) {
                float f = ((SingleFloat)first).value;
                int n = Fixnum.getValue(second);
                return new SingleFloat(f * (float) Math.pow(2, n));
            }
            if (first instanceof DoubleFloat) {
                double d = ((DoubleFloat)first).value;
                int n = Fixnum.getValue(second);
                return new DoubleFloat(d * Math.pow(2, n));
            }
            return signal(new TypeError(first, Symbol.FLOAT));
        }
    };

    // ### coerce-to-single-float
    private static final Primitive COERCE_TO_SINGLE_FLOAT =
        new Primitive("coerce-to-single-float", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return SingleFloat.coerceToFloat(arg);
        }
    };

    // ### coerce-to-double-float
    private static final Primitive COERCE_TO_DOUBLE_FLOAT =
        new Primitive("coerce-to-double-float", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return DoubleFloat.coerceToFloat(arg);
        }
    };

    // ### float
    // float number &optional prototype => float
    private static final Primitive FLOAT =
        new Primitive("float", "number &optional prototype")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat || arg instanceof DoubleFloat)
                return arg;
            return SingleFloat.coerceToFloat(arg);
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (second instanceof SingleFloat)
                return SingleFloat.coerceToFloat(first);
            if (second instanceof DoubleFloat)
                return DoubleFloat.coerceToFloat(first);
            return signal(new TypeError(second, Symbol.FLOAT));
        }
    };

    // ### floatp
    // floatp object => generalized-boolean
    private static final Primitive FLOATP = new Primitive("floatp", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat)
                return T;
            if (arg instanceof DoubleFloat)
                return T;
            return NIL;
        }
    };

    // ### double-float-high-bits
    private static final Primitive DOUBLE_FLOAT_HIGH_BITS =
        new Primitive("double-float-high-bits", PACKAGE_SYS, false, "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof DoubleFloat) {
                DoubleFloat f = (DoubleFloat) arg;
                return number(Double.doubleToLongBits(f.value) >>> 32);
            }
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    // ### double-float-low-bits
    private static final Primitive DOUBLE_FLOAT_LOW_BITS =
        new Primitive("double-float-low-bits", PACKAGE_SYS, false, "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof DoubleFloat) {
                DoubleFloat f = (DoubleFloat) arg;
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
                return new DoubleFloat(Double.longBitsToDouble(bits));
            }
            if (arg instanceof Bignum) {
                long bits = ((Bignum)arg).value.longValue();
                return new DoubleFloat(Double.longBitsToDouble(bits));
            }
            return signal(new TypeError());
        }
    };

    private static final Primitive FLOAT_INFINITY_P =
        new Primitive("float-infinity-p", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SingleFloat)
                return Float.isInfinite(((SingleFloat)arg).value) ? T : NIL;
            if (arg instanceof DoubleFloat)
                return Double.isInfinite(((DoubleFloat)arg).value) ? T : NIL;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    private static final Primitive FLOAT_NAN_P =
        new Primitive("float-nan-p", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SingleFloat)
                return Float.isNaN(((SingleFloat)arg).value) ? T : NIL;
            if (arg instanceof DoubleFloat)
                return Double.isNaN(((DoubleFloat)arg).value) ? T : NIL;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    private static final Primitive FLOAT_STRING =
        new Primitive("float-string", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof SingleFloat) {
                String s1 = String.valueOf(((SingleFloat)arg).value);
                String s2 = s1.replace('E', 'f');
                if (s1 != s2 || _PRINT_READABLY_.symbolValue() == NIL)
                    return new SimpleString(s2);
                return new SimpleString(s2.concat("f0"));
            }
            if (arg instanceof DoubleFloat) {
                String s1 = String.valueOf(((DoubleFloat)arg).value);
                String s2 = s1.replace('E', 'd');
                if (s1 != s2 || _PRINT_READABLY_.symbolValue() == NIL)
                    return new SimpleString(s2);
                return new SimpleString(s2.concat("d0"));
            }
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };
}
