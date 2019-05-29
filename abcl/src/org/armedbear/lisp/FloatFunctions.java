/*
 * FloatFunctions.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id$
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

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

import java.math.BigInteger;
import java.util.Arrays;

public final class FloatFunctions
{
    // ### set-floating-point-modes &key traps => <no values>
    private static final Primitive SET_FLOATING_POINT_MODES =
        new Primitive("set-floating-point-modes", PACKAGE_EXT, true,
                      "&key traps")
    {
        @Override
        public LispObject execute(LispObject[] args)
        {
            if (args.length % 2 != 0)
                program_error("Odd number of keyword arguments.");
            for (int i = 0; i < args.length; i += 2) {
                LispObject key = checkSymbol(args[i]);
                LispObject value = args[i+1];
                if (key == Keyword.TRAPS) {
                    boolean trap_overflow  = false;
                    boolean trap_underflow = false;
                    while (value != NIL) {
                        LispObject car = value.car();
                        if (car == Keyword.OVERFLOW)
                            trap_overflow = true;
                        else if (car == Keyword.UNDERFLOW)
                            trap_underflow = true;
                        else
                            error(new LispError("Unsupported floating point trap: " +
                                                 car.princToString()));
                        value = value.cdr();
                    }
                    TRAP_OVERFLOW  = trap_overflow;
                    TRAP_UNDERFLOW = trap_underflow;
                } else
                    error(new LispError("Unrecognized keyword: " + key.princToString()));
            }
            return LispThread.currentThread().nothing();
        }
    };

    // ### get-floating-point-modes => modes
    private static final Primitive GET_FLOATING_POINT_MODES =
        new Primitive("get-floating-point-modes", PACKAGE_EXT, true, "")
    {
        @Override
        public LispObject execute()
        {
            LispObject traps = NIL;
            if (TRAP_UNDERFLOW)
                traps = traps.push(Keyword.UNDERFLOW);
            if (TRAP_OVERFLOW)
                traps = traps.push(Keyword.OVERFLOW);
            return list(Keyword.TRAPS, traps);
        }
    };

    // ### integer-decode-float float => significand, exponent, integer-sign
    private static final Primitive INTEGER_DECODE_FLOAT =
        new Primitive("integer-decode-float", "float")
    {
//         (defun sane-integer-decode-float (float)
//           (multiple-value-bind (mantissa exp sign)
//               (integer-decode-float float)
//             (let ((fixup (- (integer-length mantissa) (float-precision float))))
//                   (values (ash mantissa (- fixup))
//                           (+ exp fixup)
//                           sign))))

        // See also: http://paste.lisp.org/display/10847

        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat) {
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
                Fixnum exponent = Fixnum.makeFixnum(e - 150);
                Fixnum sign = Fixnum.makeFixnum(s);
                return LispThread.currentThread().setValues(significand,
                                                            exponent,
                                                            sign);
            }
            if (arg instanceof DoubleFloat) {
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
                Fixnum exponent = Fixnum.makeFixnum(e - 1075);
                Fixnum sign = Fixnum.makeFixnum(s);
                return LispThread.currentThread().setValues(significand,
                                                            exponent,
                                                            sign);
            }
            return type_error(arg, Symbol.FLOAT);
        }
    };

    // ### %float-bits float => integer
    private static final Primitive _FLOAT_BITS =
        new Primitive("%float-bits", PACKAGE_SYS, true, "integer")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat) {
                int bits = Float.floatToIntBits(((SingleFloat)arg).value);
                BigInteger big = BigInteger.valueOf(bits >> 1);
                return Bignum.getInstance(big.shiftLeft(1).add(((bits & 1) == 1) ? BigInteger.ONE : BigInteger.ZERO));
            }
            if (arg instanceof DoubleFloat) {
                long bits = Double.doubleToLongBits(((DoubleFloat)arg).value);
                BigInteger big = BigInteger.valueOf(bits >> 1);
                return Bignum.getInstance(big.shiftLeft(1).add(((bits & 1) == 1) ? BigInteger.ONE : BigInteger.ZERO));
            }
            return type_error(arg, Symbol.FLOAT);
        }
    };

    // ### rational
    private static final Primitive RATIONAL =
        new Primitive("rational", "number")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat)
                return ((SingleFloat)arg).rational();
            if (arg instanceof DoubleFloat)
                return ((DoubleFloat)arg).rational();
            if (arg.rationalp())
                return arg;
            return type_error(arg, Symbol.REAL);
        }
    };

    // ### float-radix
    // float-radix float => float-radix
    private static final Primitive FLOAT_RADIX =
        new Primitive("float-radix", "float")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat || arg instanceof DoubleFloat)
                return Fixnum.TWO;
            return type_error(arg, Symbol.FLOAT);
        }
    };

    static final Fixnum FIXNUM_24 = Fixnum.makeFixnum(24);
    static final Fixnum FIXNUM_53 = Fixnum.makeFixnum(53);

    // ### float-digits
    // float-digits float => float-digits
    private static final Primitive FLOAT_DIGITS =
        new Primitive("float-digits", "float")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat)
                return FIXNUM_24;
            if (arg instanceof DoubleFloat)
                return FIXNUM_53;
            return type_error(arg, Symbol.FLOAT);
        }
    };

    // ### scale-float float integer => scaled-float
    private static final Primitive SCALE_FLOAT =
        new Primitive("scale-float", "float integer")
    {
        @Override
        public LispObject execute(LispObject first, LispObject second)

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
            return type_error(first, Symbol.FLOAT);
        }
    };

    // ### coerce-to-single-float
    private static final Primitive COERCE_TO_SINGLE_FLOAT =
        new Primitive("coerce-to-single-float", PACKAGE_SYS, false)
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            return SingleFloat.coerceToFloat(arg);
        }
    };

    // ### coerce-to-double-float
    private static final Primitive COERCE_TO_DOUBLE_FLOAT =
        new Primitive("coerce-to-double-float", PACKAGE_SYS, false)
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            return DoubleFloat.coerceToFloat(arg);
        }
    };

    // ### float
    // float number &optional prototype => float
    private static final Primitive FLOAT =
        new Primitive("float", "number &optional prototype")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat || arg instanceof DoubleFloat)
                return arg;
            return SingleFloat.coerceToFloat(arg);
        }
        @Override
        public LispObject execute(LispObject first, LispObject second)

        {
            if (second instanceof SingleFloat)
                return SingleFloat.coerceToFloat(first);
            if (second instanceof DoubleFloat)
                return DoubleFloat.coerceToFloat(first);
            return type_error(second, Symbol.FLOAT);
        }
    };

    // ### floatp
    // floatp object => generalized-boolean
    private static final Primitive FLOATP = new Primitive("floatp", "object")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat)
                return T;
            if (arg instanceof DoubleFloat)
                return T;
            return NIL;
        }
    };

    // ### single-float-bits
    private static final Primitive SINGLE_FLOAT_BITS =
        new Primitive("single-float-bits", PACKAGE_SYS, true, "float")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SingleFloat) {
                SingleFloat f = (SingleFloat) arg;
                return Fixnum.makeFixnum(Float.floatToIntBits(f.value));
            }
            return type_error(arg, Symbol.FLOAT);
        }
    };

    // ### double-float-high-bits
    private static final Primitive DOUBLE_FLOAT_HIGH_BITS =
        new Primitive("double-float-high-bits", PACKAGE_SYS, true, "float")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof DoubleFloat) {
                DoubleFloat f = (DoubleFloat) arg;
                return number(Double.doubleToLongBits(f.value) >>> 32);
            }
            return type_error(arg, Symbol.DOUBLE_FLOAT);
        }
    };

    // ### double-float-low-bits
    private static final Primitive DOUBLE_FLOAT_LOW_BITS =
        new Primitive("double-float-low-bits", PACKAGE_SYS, true, "float")
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof DoubleFloat) {
                DoubleFloat f = (DoubleFloat) arg;
                return number(Double.doubleToLongBits(f.value) & 0xffffffffL);
            }
            return type_error(arg, Symbol.DOUBLE_FLOAT);
        }
    };

    // ### make-single-float bits => float
    private static final Primitive MAKE_SINGLE_FLOAT =
        new Primitive("make-single-float", PACKAGE_SYS, true, "bits")
    {
        @Override
        public LispObject execute(LispObject arg)

        {
            if (arg instanceof Fixnum) {
                int bits = ((Fixnum)arg).value;
                return new SingleFloat(Float.intBitsToFloat(bits));
            }
            if (arg instanceof Bignum) {
                long bits = ((Bignum)arg).value.longValue();
                return new SingleFloat(Float.intBitsToFloat((int)bits));
            }
            return type_error(arg, Symbol.INTEGER);
        }
    };

    // ### make-double-float bits => float
    private static final Primitive MAKE_DOUBLE_FLOAT =
        new Primitive("make-double-float", PACKAGE_SYS, true, "bits")
    {
        @Override
        public LispObject execute(LispObject arg)

        {
            if (arg instanceof Fixnum) {
                long bits = (long) ((Fixnum)arg).value;
                return new DoubleFloat(Double.longBitsToDouble(bits));
            }
            if (arg instanceof Bignum) {
                long bits = ((Bignum)arg).value.longValue();
                return new DoubleFloat(Double.longBitsToDouble(bits));
            }
            return type_error(arg, Symbol.INTEGER);
        }
    };

    // ### float-infinity-p
    private static final Primitive FLOAT_INFINITY_P =
        new Primitive("float-infinity-p", PACKAGE_SYS, true)
    {
        @Override
        public LispObject execute(LispObject arg)

        {
            if (arg instanceof SingleFloat)
                return Float.isInfinite(((SingleFloat)arg).value) ? T : NIL;
            if (arg instanceof DoubleFloat)
                return Double.isInfinite(((DoubleFloat)arg).value) ? T : NIL;
            return type_error(arg, Symbol.FLOAT);
        }
    };

    // ### float-nan-p
    private static final Primitive FLOAT_NAN_P =
        new Primitive("float-nan-p", PACKAGE_SYS, true)
    {
        @Override
        public LispObject execute(LispObject arg)

        {
            if (arg instanceof SingleFloat)
                return Float.isNaN(((SingleFloat)arg).value) ? T : NIL;
            if (arg instanceof DoubleFloat)
                return Double.isNaN(((DoubleFloat)arg).value) ? T : NIL;
            return type_error(arg, Symbol.FLOAT);
        }
    };

    // ### float-string
    private static final Primitive FLOAT_STRING =
        new Primitive("float-string", PACKAGE_SYS, true)
    {
        @Override
        public LispObject execute(LispObject arg)
        {
            final String s1;
            if (arg instanceof SingleFloat)
                s1 = String.valueOf(((SingleFloat)arg).value);
            else if (arg instanceof DoubleFloat)
                s1 = String.valueOf(((DoubleFloat)arg).value);
            else
                return type_error(arg, Symbol.FLOAT);
            int i = s1.indexOf('E');
            if (i < 0)
                return new SimpleString(s1);
            String s2 = s1.substring(0, i);
            int exponent = Integer.parseInt(s1.substring(i + 1));
            if (exponent == 0)
                return new SimpleString(s2);
            int index = s2.indexOf('.');
            if (index < 0)
                return new SimpleString(s2);
            StringBuffer sb = new StringBuffer(s2);
            if (index >= 0)
                sb.deleteCharAt(index);
            // Now we've got just the digits in the StringBuffer.
            if (exponent > 0) {
                int newIndex = index + exponent;
                if (newIndex < sb.length())
                    sb.insert(newIndex, '.');
                else if (newIndex == sb.length())
                    sb.append('.');
                else {
                    // We need to add some zeros.
                    while (newIndex > sb.length())
                        sb.append('0');
                    sb.append('.');
                }
            } else {
                Debug.assertTrue(exponent < 0);
                int newIndex = index + exponent;
                while (newIndex < 0) {
                    sb.insert(0, '0');
                    ++newIndex;
                }
                sb.insert(0, '.');
            }
            return new SimpleString(sb.toString());
        }
    };

	static final LispInteger INT__2 = Fixnum.constants[2];
	static final LispInteger INT__0 = Fixnum.constants[0];
	static final LispInteger INT__1 = Fixnum.constants[1];
	static final Symbol SYM22891;
	static final Symbol SYM22890;
	static final Symbol SYM22861;
	static final LispCharacter CHR22824;
	static final Symbol SYM22820;
	static final Symbol SYM22809;
	static final Symbol SYM22808;
	static final Symbol SYM22805;
	static final Symbol SYM22804;
	static final LispInteger INT22797;
	static final Symbol SYM22790;
	static final Symbol SYM22785;
	static final LispCharacter CHR22784;
	static final Symbol SYM22783;
	static final Symbol SYM22782;
	static final LispInteger INT22781;
	static final AbstractString STR22780;
	static final LispInteger INT22777;
	static final LispInteger INT22776;
	static final AbstractString STR22775;

	private static final Symbol s_FLONUM_TO_STRING = Lisp.internInPackage("FLONUM-TO-STRING", "SYSTEM");
	static {
		new F_FLONUM_TO_STRING();
	}

	public static class F_FLONUM_TO_STRING extends CompiledPrimitive {
		public F_FLONUM_TO_STRING() {
			super(s_FLONUM_TO_STRING, Lisp.readObjectFromString("(x &optional width fdigits (scale 0) (fmin 0))"));
			s_FLONUM_TO_STRING.setSymbolFunction(this);
		}

		@Override
		public final LispObject execute(LispObject[] var1) {
			LispThread thread = LispThread.currentThread();
			LispObject number = getRequired(var1, 0);
			LispObject maxlen = getOptional(var1, 1, NIL);
			LispObject fdigits = getOptional(var1, 2, NIL);
			LispObject scale = getOptional(var1, 3, INT__0);
			LispObject slimit = getOptional(var1, 4, INT__0);
			LispObject var8;
			if (number.zerop()) {
				if (fdigits == Lisp.NIL) {
					return thread.execute(Symbol.VALUES, STR22775, INT22776, Lisp.T, Lisp.NIL, INT22777);
				} else if (fdigits.zerop()) {
					return thread.execute(Symbol.VALUES, STR22780, INT22776, Lisp.NIL, Lisp.T, INT22781);
				} else {
					var8 = thread.execute(SYM22782, fdigits.incr(), SYM22783, CHR22784);
					((AbstractString) var8).setCharAt(0, '.');
					return thread.execute(Symbol.VALUES, var8, thread.execute(SYM22785, var8), Lisp.T, Lisp.NIL,
							INT22777);
				}
			} else {
				//System.err.println("IN:" + Arrays.toString(var1));
				thread._values = null;
				if (scale == NIL)
					scale = INT__0;
				if (slimit == NIL)
					slimit = INT__0;

				String s = Double.toString(number.doubleValue());
				int e_at = s.toUpperCase().indexOf('E');
				int left_len = s.indexOf('.');
				int len = s.length();
				int whole_len = left_len + 1;
				int fdig = len - left_len - 1;

				if (maxlen == NIL) {
					maxlen = Fixnum.getInstance(len);
				} else {
					
					int fmaxlen = maxlen.intValue();

					if (fmaxlen < len) {
						if (fmaxlen <= whole_len) {
							fdigits = INT__1;
							number = new DoubleFloat(Math.round(number.doubleValue()));
						}
						maxlen = Fixnum.getInstance(whole_len);
					}
				}

				String wPart = s.substring(0, left_len);
				if (wPart.equals("0")) {

				}
				if (fdigits == NIL) {
					fdigits = Fixnum.getInstance(fdig);

					if (fdigits.intValue() > maxlen.intValue()) {
						fdigits = Fixnum.getInstance(maxlen.intValue() - 1);
						if (fdigits.intValue() < 0) {
							fdigits = Fixnum.getInstance(0);
						}
					}
				} else {
					if (fdigits.intValue() > maxlen.intValue()) {
						fdigits = Fixnum.getInstance(maxlen.intValue() - 1);
						if (fdigits.intValue() < 0) {
							fdigits = Fixnum.getInstance(0);
						}
					}
				}

				LispObject[] varN = new LispObject[] { number, maxlen, fdigits, scale, slimit };
				//System.err.println("MID:" + Arrays.toString(varN));
				LispObject res = Lisp.internInPackage("FLONUM-TO-STRING-OLD", "SYSTEM").execute(varN);

				return res;
			}
		}

		/**
		 * @param var1
		 * @param i
		 * @param nil
		 * @return
		 */
		private LispObject getOptional(LispObject[] var1, int i, LispObject nil) {
			if (var1.length > i)
				return var1[i];
			return nil;
		}

		/**
		 * @param var1
		 * @param i
		 * @return
		 */
		private LispObject getRequired(LispObject[] var1, int i) {
			if (var1.length > i)
				return var1[i];
			return program_error("not enough args");
		}

	}

	static {
		STR22775 = new SimpleString(".0");
		INT22776 = Fixnum.constants[2];
		INT22777 = Fixnum.constants[0];
		STR22780 = new SimpleString("0.");
		INT22781 = Fixnum.constants[1];
		SYM22782 = Symbol.MAKE_STRING;
		SYM22783 = Keyword.INITIAL_ELEMENT;
		CHR22784 = LispCharacter.makeCharacter('0');
		SYM22785 = Symbol.LENGTH;
		SYM22790 = Lisp.internInPackage("FLOAT-TO-DIGITS*", "SYSTEM");
		INT22797 = Fixnum.makeFixnum(-1);
		SYM22804 = Symbol.VALUES_LIST;
		SYM22805 = Symbol.MAKE_STRING_OUTPUT_STREAM;
		SYM22808 = Symbol.WRITE_STRING;
		SYM22809 = Keyword.END;
		SYM22820 = Symbol.WRITE_CHAR;
		CHR22824 = LispCharacter.makeCharacter('.');
		SYM22861 = Keyword.START;
		SYM22890 = Symbol.GET_OUTPUT_STREAM_STRING;
		SYM22891 = Symbol.POSITION;
	}

}
