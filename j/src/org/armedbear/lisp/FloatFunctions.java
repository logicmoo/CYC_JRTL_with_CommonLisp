/*
 * FloatFunctions.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: FloatFunctions.java,v 1.1 2005-03-15 17:32:04 piso Exp $
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
            if (arg instanceof LispFloat) {
                LispObject[] values = new LispObject[3];
                long bits =
                    Double.doubleToRawLongBits((double)((LispFloat)arg).value);
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
            if (arg instanceof LispFloat)
                return ((LispFloat)arg).rational();
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
            if (arg instanceof LispFloat)
                return Fixnum.TWO;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    private static final Fixnum FIXNUM_53 = new Fixnum(53);

    // ### float-digits
    // float-digits float => float-digits
    private static final Primitive FLOAT_DIGITS =
        new Primitive("float-digits", "float")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
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
            double f = LispFloat.getValue(first);
            int n = Fixnum.getValue(second);
            return new LispFloat(f * Math.pow(2, n));
        }
    };

    // ### coerce-to-float
    private static final Primitive COERCE_TO_FLOAT =
        new Primitive("coerce-to-float", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return LispFloat.coerceToFloat(arg);
        }
    };

    // ### float
    // float number &optional prototype => float
    private static final Primitive FLOAT =
        new Primitive("float", "number &optional prototype")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return LispFloat.coerceToFloat(arg);
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            // FIXME Ignore prototype.
            return LispFloat.coerceToFloat(first);
        }
    };

    // ### floatp
    // floatp object => generalized-boolean
    private static final Primitive FLOATP = new Primitive("floatp", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof LispFloat ? T : NIL;
        }
    };

    // ### double-float-high-bits
    private static final Primitive DOUBLE_FLOAT_HIGH_BITS =
        new Primitive("double-float-high-bits", PACKAGE_SYS, false, "float")
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
    private static final Primitive DOUBLE_FLOAT_LOW_BITS =
        new Primitive("double-float-low-bits", PACKAGE_SYS, false, "float")
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

    private static final Primitive FLOAT_INFINITY_P =
        new Primitive("float-infinity-p", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
                return Double.isInfinite(((LispFloat)arg).value) ? T : NIL;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };

    private static final Primitive FLOAT_NAN_P =
        new Primitive("float-nan-p", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof LispFloat)
                return Double.isNaN(((LispFloat)arg).value) ? T : NIL;
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    };
}
