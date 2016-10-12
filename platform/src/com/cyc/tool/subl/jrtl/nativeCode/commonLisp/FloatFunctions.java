/*
 * FloatFunctions.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: FloatFunctions.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class FloatFunctions {
	// ### set-floating-point-modes &key traps => <no values>
	private static Primitive SET_FLOATING_POINT_MODES = new JavaPrimitive("set-floating-point-modes", Lisp.PACKAGE_EXT,
			true, "&key traps") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length % 2 != 0)
				Lisp.error(new ProgramError("Odd number of keyword arguments."));
			for (int i = 0; i < args.length; i += 2) {
				SubLObject key = Lisp.checkSymbol(args[i]);
				SubLObject value = args[i + 1];
				if (key == Keyword.TRAPS) {
					boolean trap_overflow = false;
					boolean trap_underflow = false;
					while (value != Lisp.NIL) {
						SubLObject car = value.first();
						if (car == Keyword.OVERFLOW)
							trap_overflow = true;
						else if (car == Keyword.UNDERFLOW)
							trap_underflow = true;
						else
							Lisp.error(new LispError("Unsupported floating point trap: " + car.writeToString()));
						value = value.rest();
					}
					Lisp.TRAP_OVERFLOW = trap_overflow;
					Lisp.TRAP_UNDERFLOW = trap_underflow;
				} else
					Lisp.error(new LispError("Unrecognized keyword: " + key.writeToString()));
			}
			return LispThread.currentThread().nothing();
		}
	};

	// ### get-floating-point-modes => modes
	private static Primitive GET_FLOATING_POINT_MODES = new JavaPrimitive("get-floating-point-modes", Lisp.PACKAGE_EXT,
			true, "") {

		public SubLObject execute() {
			SubLObject traps = Lisp.NIL;
			if (Lisp.TRAP_UNDERFLOW)
				traps = traps.push(Keyword.UNDERFLOW);
			if (Lisp.TRAP_OVERFLOW)
				traps = traps.push(Keyword.OVERFLOW);
			return Lisp.list(Keyword.TRAPS, traps);
		}
	};

	// ### integer-decode-float float => significand, exponent, integer-sign
	private static Primitive INTEGER_DECODE_FLOAT = new JavaPrimitive("integer-decode-float", "float") {
		// (defun sane-integer-decode-float (float)
		// (multiple-value-bind (mantissa exp sign)
		// (integer-decode-float float)
		// (let ((fixup (- (integer-length mantissa) (float-precision float))))
		// (values (ash mantissa (- fixup))
		// (+ exp fixup)
		// sign))))

		// See also: http://paste.lisp.org/display/10847

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat) {
				int bits = Float.floatToRawIntBits(((SingleFloat) arg).value);
				int s = bits >> 31 == 0 ? 1 : -1;
				int e = (int) (bits >> 23 & 0xffL);
				int m;
				if (e == 0)
					m = (bits & 0x7fffff) << 1;
				else
					m = bits & 0x7fffff | 0x800000;
				SubLObject significand = Lisp.number(m);
				Fixnum exponent = LispObjectFactory.makeInteger(e - 150);
				Fixnum sign = LispObjectFactory.makeInteger(s);
				return LispThread.currentThread().setValues(significand, exponent, sign);
			}
			if (arg instanceof DoubleFloat) {
				long bits = Double.doubleToRawLongBits(((DoubleFloat) arg).value);
				int s = bits >> 63 == 0 ? 1 : -1;
				int e = (int) (bits >> 52 & 0x7ffL);
				long m;
				if (e == 0)
					m = (bits & 0xfffffffffffffL) << 1;
				else
					m = bits & 0xfffffffffffffL | 0x10000000000000L;
				SubLObject significand = Lisp.number(m);
				Fixnum exponent = LispObjectFactory.makeInteger(e - 1075);
				Fixnum sign = LispObjectFactory.makeInteger(s);
				return LispThread.currentThread().setValues(significand, exponent, sign);
			}
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	// ### %float-bits float => integer
	private static Primitive _FLOAT_BITS = new JavaPrimitive("%float-bits", Lisp.PACKAGE_SYS, true, "integer") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat) {
				int bits = Float.floatToIntBits(((SingleFloat) arg).value);
				BigInteger big = BigInteger.valueOf(bits >> 1);
				return LispObjectFactory
						.makeInteger(big.shiftLeft(1).add((bits & 1) == 1 ? BigInteger.ONE : BigInteger.ZERO));
			}
			if (arg instanceof DoubleFloat) {
				long bits = Double.doubleToLongBits(((DoubleFloat) arg).value);
				BigInteger big = BigInteger.valueOf(bits >> 1);
				return LispObjectFactory
						.makeInteger(big.shiftLeft(1).add((bits & 1) == 1 ? BigInteger.ONE : BigInteger.ZERO));
			}
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	// ### rational
	private static Primitive RATIONAL = new JavaPrimitive("rational", "number") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat)
				return ((SingleFloat) arg).rational();
			if (arg instanceof DoubleFloat)
				return ((DoubleFloat) arg).rational();
			if (arg.rationalp())
				return arg;
			return Lisp.type_error(arg, LispSymbols.REAL);
		}
	};

	// ### float-radix
	// float-radix float => float-radix
	private static Primitive FLOAT_RADIX = new JavaPrimitive("float-radix", "float") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat || arg instanceof DoubleFloat)
				return Fixnum.TWO;
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	static Fixnum FIXNUM_24 = LispObjectFactory.makeInteger(24);
	static Fixnum FIXNUM_53 = LispObjectFactory.makeInteger(53);

	// ### float-digits
	// float-digits float => float-digits
	private static Primitive FLOAT_DIGITS = new JavaPrimitive("float-digits", "float") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat)
				return FloatFunctions.FIXNUM_24;
			if (arg instanceof DoubleFloat)
				return FloatFunctions.FIXNUM_53;
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	// ### scale-float float integer => scaled-float
	private static Primitive SCALE_FLOAT = new JavaPrimitive("scale-float", "float integer") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof SingleFloat) {
				float f = ((SingleFloat) first).value;
				int n = second.intValue();
				return LispObjectFactory.makeSingle(f * (float) Math.pow(2, n));
			}
			if (first instanceof DoubleFloat) {
				double d = ((DoubleFloat) first).value;
				int n = second.intValue();
				return LispObjectFactory.makeDouble(d * Math.pow(2, n));
			}
			return Lisp.type_error(first, LispSymbols.FLOAT);
		}
	};

	// ### coerce-to-single-float
	private static Primitive COERCE_TO_SINGLE_FLOAT = new JavaPrimitive("coerce-to-single-float", Lisp.PACKAGE_SYS,
			false) {

		public SubLObject execute(SubLObject arg) {
			return SingleFloat.coerceToFloat(arg);
		}
	};

	// ### coerce-to-double-float
	private static Primitive COERCE_TO_DOUBLE_FLOAT = new JavaPrimitive("coerce-to-double-float", Lisp.PACKAGE_SYS,
			false) {

		public SubLObject execute(SubLObject arg) {
			return DoubleFloat.coerceToFloat(arg);
		}
	};

	// ### float
	// float number &optional prototype => float
	private static Primitive FLOAT = new JavaPrimitive("float", "number &optional prototype") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat || arg instanceof DoubleFloat)
				return arg;
			return SingleFloat.coerceToFloat(arg);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (second instanceof SingleFloat)
				return SingleFloat.coerceToFloat(first);
			if (second instanceof DoubleFloat)
				return DoubleFloat.coerceToFloat(first);
			return Lisp.type_error(second, LispSymbols.FLOAT);
		}
	};

	// ### floatp
	// floatp object => generalized-boolean
	private static Primitive FLOATP = new JavaPrimitive("floatp", "object") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat)
				return Lisp.T;
			if (arg instanceof DoubleFloat)
				return Lisp.T;
			return Lisp.NIL;
		}
	};

	// ### single-float-bits
	private static Primitive SINGLE_FLOAT_BITS = new JavaPrimitive("single-float-bits", Lisp.PACKAGE_SYS, true,
			"float") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat) {
				SingleFloat f = (SingleFloat) arg;
				return LispObjectFactory.makeInteger(Float.floatToIntBits(f.value));
			}
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	// ### double-float-high-bits
	private static Primitive DOUBLE_FLOAT_HIGH_BITS = new JavaPrimitive("double-float-high-bits", Lisp.PACKAGE_SYS,
			true, "float") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof DoubleFloat) {
				DoubleFloat f = (DoubleFloat) arg;
				return Lisp.number(Double.doubleToLongBits(f.value) >>> 32);
			}
			return Lisp.type_error(arg, LispSymbols.DOUBLE_FLOAT);
		}
	};

	// ### double-float-low-bits
	private static Primitive DOUBLE_FLOAT_LOW_BITS = new JavaPrimitive("double-float-low-bits", Lisp.PACKAGE_SYS, true,
			"float") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof DoubleFloat) {
				DoubleFloat f = (DoubleFloat) arg;
				return Lisp.number(Double.doubleToLongBits(f.value) & 0xffffffffL);
			}
			return Lisp.type_error(arg, LispSymbols.DOUBLE_FLOAT);
		}
	};

	// ### make-single-float bits => float
	private static Primitive MAKE_SINGLE_FLOAT = new JavaPrimitive("make-single-float", Lisp.PACKAGE_SYS, true,
			"bits") {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof Fixnum) {
				int bits = ((Fixnum) arg).value;
				return LispObjectFactory.makeSingle(Float.intBitsToFloat(bits));
			}
			if (arg instanceof Bignum) {
				long bits = ((Bignum) arg).bigIntegerValue().longValue();
				return LispObjectFactory.makeSingle(Float.intBitsToFloat((int) bits));
			}
			return Lisp.type_error(arg, LispSymbols.INTEGER);
		}
	};

	// ### make-double-float bits => float
	private static Primitive MAKE_DOUBLE_FLOAT = new JavaPrimitive("make-double-float", Lisp.PACKAGE_SYS, true,
			"bits") {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof Fixnum) {
				long bits = ((Fixnum) arg).value;
				return LispObjectFactory.makeDouble(Double.longBitsToDouble(bits));
			}
			if (arg instanceof Bignum) {
				long bits = ((Bignum) arg).longValue();
				return LispObjectFactory.makeDouble(Double.longBitsToDouble(bits));
			}
			return Lisp.type_error(arg, LispSymbols.INTEGER);
		}
	};

	// ### float-infinity-p
	private static Primitive FLOAT_INFINITY_P = new JavaPrimitive("float-infinity-p", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof SingleFloat)
				return Float.isInfinite(((SingleFloat) arg).value) ? Lisp.T : Lisp.NIL;
			if (arg instanceof DoubleFloat)
				return Double.isInfinite(((DoubleFloat) arg).value) ? Lisp.T : Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	// ### float-nan-p
	private static Primitive FLOAT_NAN_P = new JavaPrimitive("float-nan-p", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof SingleFloat)
				return Float.isNaN(((SingleFloat) arg).value) ? Lisp.T : Lisp.NIL;
			if (arg instanceof DoubleFloat)
				return Double.isNaN(((DoubleFloat) arg).value) ? Lisp.T : Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}
	};

	// ### float-string
	private static Primitive FLOAT_STRING = new JavaPrimitive("float-string", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			String s1;
			if (arg instanceof SingleFloat)
				s1 = String.valueOf(((SingleFloat) arg).value);
			else if (arg instanceof DoubleFloat)
				s1 = String.valueOf(((DoubleFloat) arg).value);
			else
				return Lisp.type_error(arg, LispSymbols.FLOAT);
			int i = s1.indexOf('E');
			if (i < 0)
				return LispObjectFactory.makeString(s1);
			String s2 = s1.substring(0, i);
			int exponent = Integer.parseInt(s1.substring(i + 1));
			if (exponent == 0)
				return LispObjectFactory.makeString(s2);
			int index = s2.indexOf('.');
			if (index < 0)
				return LispObjectFactory.makeString(s2);
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
			return LispObjectFactory.makeString(sb.toString());
		}
	};
}
