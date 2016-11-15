/*
 * MathFunctions.java
 *
 * Copyright (C) 2004-2006 Peter Graves
 * $Id: MathFunctions.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class MathFunctions {
	static public class ash extends JavaPrimitive {
		public ash() {
			super("ash", "integer count");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return first.ash(second);
		}

	}

	static public class ceiling extends JavaPrimitive {
		public ceiling() {
			super("ceiling", "number &optional divisor");
		}

		public SubLObject execute(SubLObject arg) {
			return this.execute(arg, Fixnum.ONE);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			SubLObject quotient = first.truncate(second);
			LispThread thread = LispThread.currentThread();
			SubLObject remainder = thread._values[1];
			if (remainder.isZero())
				return quotient;
			if (second.isNegative()) {
				if (first.isPositive())
					return quotient;
			} else if (first.isNegative())
				return quotient;
			quotient = quotient.inc();
			thread._values[0] = quotient;
			thread._values[1] = remainder.sub(second);
			return quotient;
		}

	}

	static public class float_sign extends JavaPrimitive {
		public float_sign() {
			super("float-sign", "float-1 &optional float-2");
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat) {
				float f = ((SingleFloat) arg).value;
				int bits = Float.floatToRawIntBits(f);
				return bits < 0 ? SingleFloat.MINUS_ONE : SingleFloat.ONE;
			}
			if (arg instanceof DoubleFloat) {
				double d = ((DoubleFloat) arg).value;
				long bits = Double.doubleToRawLongBits(d);
				return bits < 0 ? DoubleFloat.MINUS_ONE : DoubleFloat.ONE;
			}
			return Lisp.type_error(arg, LispSymbols.FLOAT);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (!first.isDouble())
				return Lisp.type_error(first, LispSymbols.FLOAT);
			if (!second.isDouble())
				return Lisp.type_error(second, LispSymbols.FLOAT);
			if (first.isNegative()) {
				if (second.isNegative())
					return second;
				else
					return Fixnum.ZERO.sub(second);
			} else
				return second.ABS();
		}

	}

	static public class floor extends JavaPrimitive {
		public floor() {
			super("floor", "number &optional divisor");
		}

		public SubLObject execute(SubLObject number)

		{
			SubLObject quotient = number.truncate(Fixnum.ONE);
			LispThread thread = LispThread.currentThread();
			SubLObject remainder = thread._values[1];
			if (!remainder.isZero())
				if (number.isNegative()) {
					quotient = quotient.dec();
					remainder = remainder.inc();
					thread._values[0] = quotient;
					thread._values[1] = remainder;
				}
			return quotient;
		}

		public SubLObject execute(SubLObject number, SubLObject divisor)

		{
			SubLObject quotient = number.truncate(divisor);
			LispThread thread = LispThread.currentThread();
			SubLObject remainder = thread._values[1];
			boolean adjust = false;
			if (!remainder.isZero())
				if (divisor.isNegative()) {
					if (number.isPositive())
						adjust = true;
				} else if (number.isNegative())
					adjust = true;
			if (adjust) {
				quotient = quotient.dec();
				remainder = remainder.add(divisor);
				thread._values[0] = quotient;
				thread._values[1] = remainder;
			}
			return quotient;
		}

	}

	static public class ftruncate extends JavaPrimitive {
		public ftruncate() {
			super("ftruncate", "number &optional divisor");
		}

		public SubLObject execute(SubLObject arg) {
			LispThread thread = LispThread.currentThread();
			if (arg.isZero()) {
				SubLObject q = arg;
				SubLObject r;
				if (arg instanceof DoubleFloat)
					r = DoubleFloat.ZERO;
				else
					r = SingleFloat.ZERO;
				return thread.setValues(q, r);
			}
			if (arg instanceof DoubleFloat) {
				double d = ((DoubleFloat) arg).value;
				if (Double.isInfinite(d) || Double.isNaN(d))
					return thread.setValues(arg, LispObjectFactory.makeDouble(Double.NaN));
			} else if (arg instanceof SingleFloat) {
				float f = ((SingleFloat) arg).value;
				if (Float.isInfinite(f) || Float.isNaN(f))
					return thread.setValues(arg, LispObjectFactory.makeSingle(Float.NaN));
			}
			SubLObject q = arg.truncate(Fixnum.ONE); // an integer
			if (arg instanceof DoubleFloat) {
				if (q.isZero()) {
					if (arg.isNegative())
						q = LispObjectFactory.makeDouble(-0.0);
					else
						q = LispObjectFactory.makeDouble(0.0);
				} else if (q instanceof Fixnum)
					q = LispObjectFactory.makeDouble(((Fixnum) q).value);
				else
					q = LispObjectFactory.makeDouble(((Bignum) q).doubleValue());
			} else if (q.isZero()) {
				if (arg.isNegative())
					q = LispObjectFactory.makeSingle(-0.0f);
				else
					q = LispObjectFactory.makeSingle(0.0f);
			} else if (q instanceof Fixnum)
				q = LispObjectFactory.makeSingle(((Fixnum) q).value);
			else
				q = LispObjectFactory.makeSingle(((Bignum) q).floatValue());
			thread._values[0] = q;
			return q;
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispThread thread = LispThread.currentThread();
			if (first.isZero()) {
				SubLObject q = first;
				SubLObject r;
				if (first instanceof DoubleFloat)
					r = DoubleFloat.ZERO;
				else
					r = SingleFloat.ZERO;
				return thread.setValues(q, r);
			}
			if (first instanceof DoubleFloat) {
				double d1 = ((DoubleFloat) first).value;
				if (Double.isInfinite(d1) || Double.isNaN(d1))
					return thread.setValues(first, LispObjectFactory.makeDouble(Double.NaN));
			} else if (first instanceof SingleFloat) {
				float f1 = ((SingleFloat) first).value;
				if (Float.isInfinite(f1) || Float.isNaN(f1))
					return thread.setValues(first, LispObjectFactory.makeSingle(Float.NaN));
			}
			SubLObject q = first.truncate(second); // an integer
			if (first instanceof DoubleFloat || second instanceof DoubleFloat) {
				if (q.isZero()) {
					if (first.isNegative()) {
						if (second.isNegative())
							q = LispObjectFactory.makeDouble(0.0);
						else
							q = LispObjectFactory.makeDouble(-0.0);
					} else if (second.isNegative())
						q = LispObjectFactory.makeDouble(-0.0);
					else
						q = LispObjectFactory.makeDouble(0.0);
				} else if (q instanceof Fixnum)
					q = LispObjectFactory.makeDouble(((Fixnum) q).value);
				else
					q = LispObjectFactory.makeDouble(((Bignum) q).doubleValue());
			} else if (q.isZero()) {
				if (first.isNegative()) {
					if (second.isNegative())
						q = LispObjectFactory.makeSingle(0.0f);
					else
						q = LispObjectFactory.makeSingle(-0.0f);
				} else if (second.isNegative())
					q = LispObjectFactory.makeSingle(-0.0f);
				else
					q = LispObjectFactory.makeSingle(0.0f);
			} else if (q instanceof Fixnum)
				q = LispObjectFactory.makeSingle(((Fixnum) q).value);
			else
				q = LispObjectFactory.makeSingle(((Bignum) q).floatValue());
			thread._values[0] = q;
			return q;
		}

	}

	static public class logand extends JavaPrimitive {
		public logand() {
			super("logand", "&rest integers");
		}

		public SubLObject execute() {
			return Fixnum.MINUS_ONE;
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof Fixnum || arg instanceof Bignum)
				return arg;
			return Lisp.type_error(arg, LispSymbols.INTEGER);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return first.LOGAND(second);
		}

		public SubLObject execute(SubLObject[] args) {
			SubLObject result = Fixnum.MINUS_ONE;
			for (int i = 0; i < args.length; i++)
				result = result.LOGAND(args[i]);
			return result;
		}
	}

	static public class logandc1 extends JavaPrimitive {
		public logandc1() {
			super("logandc1", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum) {
				if (second instanceof Fixnum)
					return LispObjectFactory.makeInteger(~((Fixnum) first).value & ((Fixnum) second).value);
				if (second instanceof Bignum) {
					BigInteger n1 = ((Fixnum) first).bigIntegerValue();
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.not().and(n2));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			if (first instanceof Bignum) {
				BigInteger n1 = ((Bignum) first).bigIntegerValue();
				if (second instanceof Fixnum) {
					BigInteger n2 = ((Fixnum) second).bigIntegerValue();
					return Lisp.number(n1.not().and(n2));
				}
				if (second instanceof Bignum) {
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.not().and(n2));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			return Lisp.error(new TypeError(first, LispSymbols.INTEGER));
		}

	}

	// logandc2 integer-1 integer-2 => result-integer
	// and integer-1 with complement of integer-2
	static public class logandc2 extends JavaPrimitive {
		public logandc2() {
			super("logandc2", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum) {
				if (second instanceof Fixnum)
					return LispObjectFactory.makeInteger(((Fixnum) first).value & ~((Fixnum) second).value);
				if (second instanceof Bignum) {
					BigInteger n1 = ((Fixnum) first).bigIntegerValue();
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.and(n2.not()));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			if (first instanceof Bignum) {
				BigInteger n1 = ((Bignum) first).bigIntegerValue();
				if (second instanceof Fixnum) {
					BigInteger n2 = ((Fixnum) second).bigIntegerValue();
					return Lisp.number(n1.and(n2.not()));
				}
				if (second instanceof Bignum) {
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.and(n2.not()));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			return Lisp.error(new TypeError(first, LispSymbols.INTEGER));
		}

	}

	static public class logbitp extends JavaPrimitive {
		public logbitp() {
			super("logbitp", "index integer");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			int index = -1;
			if (first instanceof Fixnum)
				index = ((Fixnum) first).value;
			else if (first instanceof Bignum)
				// FIXME If the number is really big, we're not checking the
				// right
				// bit...
				if (((Bignum) first).bigIntegerValue().signum() > 0)
				index = Integer.MAX_VALUE;
			if (index < 0)
				return Lisp.type_error(first, LispSymbols.UNSIGNED_BYTE);
			BigInteger n;
			if (second instanceof Fixnum)
				n = ((Fixnum) second).bigIntegerValue();
			else if (second instanceof Bignum)
				n = ((Bignum) second).bigIntegerValue();
			else
				return Lisp.type_error(second, LispSymbols.INTEGER);
			// FIXME See above.
			if (index == Integer.MAX_VALUE)
				return n.signum() < 0 ? Lisp.T : Lisp.NIL;
			return n.testBit(index) ? Lisp.T : Lisp.NIL;
		}

	}

	static public class logcount extends JavaPrimitive {
		public logcount() {
			super("logcount", "integer");
		}

		// FIXME Optimize fixnum case!

		public SubLObject execute(SubLObject arg) {
			BigInteger n;
			if (arg instanceof Fixnum)
				n = ((Fixnum) arg).bigIntegerValue();
			else if (arg instanceof Bignum)
				n = ((Bignum) arg).bigIntegerValue();
			else
				return Lisp.type_error(arg, LispSymbols.INTEGER);
			return LispObjectFactory.makeInteger(n.bitCount());
		}

	}

	// logeqv &rest integers => result-integer
	// equivalence (exclusive nor)
	static public class logeqv extends JavaPrimitive {
		public logeqv() {
			super("logeqv", "&rest integers");
		}

		public SubLObject execute() {
			return Fixnum.MINUS_ONE;
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof Fixnum)
				return arg;
			if (arg instanceof Bignum)
				return arg;
			return Lisp.error(new TypeError(arg, LispSymbols.INTEGER));
		}

		public SubLObject execute(SubLObject[] args) {
			BigInteger result = null;
			for (int i = 0; i < args.length; i++) {
				SubLObject arg = args[i];
				BigInteger n;
				if (arg instanceof Fixnum)
					n = ((Fixnum) arg).bigIntegerValue();
				else if (arg instanceof Bignum)
					n = ((Bignum) arg).bigIntegerValue();
				else
					return Lisp.error(new TypeError(arg, LispSymbols.INTEGER));
				if (result == null)
					result = n;
				else
					result = result.xor(n).not();
			}
			return Lisp.number(result);
		}
	}

	static public class logior extends JavaPrimitive {
		public logior() {
			super("logior", "&rest integers");
		}

		public SubLObject execute() {
			return Fixnum.ZERO;
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof Fixnum || arg instanceof Bignum)
				return arg;
			return Lisp.type_error(arg, LispSymbols.INTEGER);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return first.LOGIOR(second);
		}

		public SubLObject execute(SubLObject[] args) {
			SubLObject result = Fixnum.ZERO;
			for (int i = 0; i < args.length; i++)
				result = result.LOGIOR(args[i]);
			return result;
		}

	}

	static public class lognand extends JavaPrimitive {
		public lognand() {
			super("lognand", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum) {
				if (second instanceof Fixnum)
					return LispObjectFactory.makeInteger(~(((Fixnum) first).value & ((Fixnum) second).value));
				if (second instanceof Bignum) {
					BigInteger n1 = ((Fixnum) first).bigIntegerValue();
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.and(n2).not());
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			if (first instanceof Bignum) {
				BigInteger n1 = ((Bignum) first).bigIntegerValue();
				if (second instanceof Fixnum) {
					BigInteger n2 = ((Fixnum) second).bigIntegerValue();
					return Lisp.number(n1.and(n2).not());
				}
				if (second instanceof Bignum) {
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.and(n2).not());
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			return Lisp.error(new TypeError(first, LispSymbols.INTEGER));
		}

	}

	static public class lognor extends JavaPrimitive {
		public lognor() {
			super("lognor", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum) {
				if (second instanceof Fixnum)
					return LispObjectFactory.makeInteger(~(((Fixnum) first).value | ((Fixnum) second).value));
				if (second instanceof Bignum) {
					BigInteger n1 = ((Fixnum) first).bigIntegerValue();
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.or(n2).not());
				}
				return Lisp.type_error(second, LispSymbols.INTEGER);
			}
			if (first instanceof Bignum) {
				BigInteger n1 = ((Bignum) first).bigIntegerValue();
				if (second instanceof Fixnum) {
					BigInteger n2 = ((Fixnum) second).bigIntegerValue();
					return Lisp.number(n1.or(n2).not());
				}
				if (second instanceof Bignum) {
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.or(n2).not());
				}
				return Lisp.type_error(second, LispSymbols.INTEGER);
			}
			return Lisp.type_error(first, LispSymbols.INTEGER);
		}

	}

	static public class lognot extends JavaPrimitive {
		public lognot(String name, String arglist) {
			super(name, arglist);
		}

		public SubLObject execute(SubLObject arg) {
			return arg.LOGNOT();
		}

	}

	// logorc1 integer-1 integer-2 => result-integer
	// or complement of integer-1 with integer-2
	static public class logorc1 extends JavaPrimitive {
		public logorc1() {
			super("logorc1", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum) {
				if (second instanceof Fixnum)
					return LispObjectFactory.makeInteger(~((Fixnum) first).value | ((Fixnum) second).value);
				if (second instanceof Bignum) {
					BigInteger n1 = ((Fixnum) first).bigIntegerValue();
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.not().or(n2));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			if (first instanceof Bignum) {
				BigInteger n1 = ((Bignum) first).bigIntegerValue();
				if (second instanceof Fixnum) {
					BigInteger n2 = ((Fixnum) second).bigIntegerValue();
					return Lisp.number(n1.not().or(n2));
				}
				if (second instanceof Bignum) {
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.not().or(n2));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			return Lisp.error(new TypeError(first, LispSymbols.INTEGER));
		}

	}

	// logorc2 integer-1 integer-2 => result-integer
	// or integer-1 with complement of integer-2
	static public class logorc2 extends JavaPrimitive {
		public logorc2() {
			super("logorc2", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum) {
				if (second instanceof Fixnum)
					return LispObjectFactory.makeInteger(((Fixnum) first).value | ~((Fixnum) second).value);
				if (second instanceof Bignum) {
					BigInteger n1 = ((Fixnum) first).bigIntegerValue();
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.or(n2.not()));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			if (first instanceof Bignum) {
				BigInteger n1 = ((Bignum) first).bigIntegerValue();
				if (second instanceof Fixnum) {
					BigInteger n2 = ((Fixnum) second).bigIntegerValue();
					return Lisp.number(n1.or(n2.not()));
				}
				if (second instanceof Bignum) {
					BigInteger n2 = ((Bignum) second).bigIntegerValue();
					return Lisp.number(n1.or(n2.not()));
				}
				return Lisp.error(new TypeError(second, LispSymbols.INTEGER));
			}
			return Lisp.error(new TypeError(first, LispSymbols.INTEGER));
		}

	}

	// (logtest x y) == (not (zerop (logand x y)))
	static public class logtest extends JavaPrimitive {
		public logtest() {
			super("logtest", "integer-1 integer-2");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof Fixnum && second instanceof Fixnum)
				return (((Fixnum) first).value & ((Fixnum) second).value) == 0 ? Lisp.NIL : Lisp.T;
			else {
				BigInteger n1, n2;
				if (first instanceof Fixnum)
					n1 = ((Fixnum) first).bigIntegerValue();
				else if (first instanceof Bignum)
					n1 = ((Bignum) first).bigIntegerValue();
				else
					return Lisp.type_error(first, LispSymbols.INTEGER);
				if (second instanceof Fixnum)
					n2 = ((Fixnum) second).bigIntegerValue();
				else if (second instanceof Bignum)
					n2 = ((Bignum) second).bigIntegerValue();
				else
					return Lisp.type_error(second, LispSymbols.INTEGER);
				return n1.and(n2).signum() == 0 ? Lisp.NIL : Lisp.T;
			}
		}

	}

	static public class logxor extends JavaPrimitive {
		public logxor() {
			super("logxor", "&rest integers");
		}

		public SubLObject execute() {
			return Fixnum.ZERO;
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof Fixnum || arg instanceof Bignum)
				return arg;
			return Lisp.type_error(arg, LispSymbols.INTEGER);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return first.LOGXOR(second);
		}

		public SubLObject execute(SubLObject[] args) {
			SubLObject result = Fixnum.ZERO;
			for (int i = 0; i < args.length; i++)
				result = result.LOGXOR(args[i]);
			return result;
		}

	}

	static public class mod extends JavaPrimitive {
		public mod() {
			super("mod", "number divisor");
		}

		public SubLObject execute(SubLObject number, SubLObject divisor)

		{
			return number.MOD(divisor);
		}

	}

	static public class rem extends JavaPrimitive {
		public rem() {
			super("rem", "number divisor");
		}

		public SubLObject execute(SubLObject number, SubLObject divisor)

		{
			number.truncate(divisor);
			LispThread thread = LispThread.currentThread();
			SubLObject remainder = thread._values[1];
			thread.clearValues();
			return remainder;
		}

	}

	static public class truncate extends JavaPrimitive {
		public truncate() {
			super("truncate", "number &optional divisor");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.truncate(Fixnum.ONE);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return first.truncate(second);
		}

	}

	// ### sin
	private static Primitive SIN = new JavaPrimitive("sin", "radians") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.sin(arg);
		}
	};

	// ### cos
	private static Primitive COS = new JavaPrimitive("cos", "radians") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.cos(arg);
		}
	};

	// ### tan
	private static Primitive TAN = new JavaPrimitive("tan", "radians") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof DoubleFloat)
				return LispObjectFactory.makeDouble(Math.tan(((DoubleFloat) arg).value));
			if (arg.realp())
				return LispObjectFactory.makeSingle((float) Math.tan(SingleFloat.coerceToFloat(arg).value));
			return MathFunctions.sin(arg).divideBy(MathFunctions.cos(arg));
		}
	};

	// ### asin
	private static Primitive ASIN = new JavaPrimitive("asin", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.asin(arg);
		}
	};

	// ### acos
	private static Primitive ACOS = new JavaPrimitive("acos", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.acos(arg);
		}
	};

	// ### atan
	private static Primitive ATAN = new JavaPrimitive("atan", "number1 &optional number2") {

		public SubLObject execute(SubLObject arg) {
			if (arg.isNumber())
				return MathFunctions.atan(arg);
			return Lisp.type_error(arg, LispSymbols.NUMBER);
		}

		// "If both number1 and number2 are supplied for atan, the result is
		// the arc tangent of number1/number2."

		// y = +0 x = +0 +0
		// y = -0 x = +0 -0
		// y = +0 x = -0 +<PI>
		// y = -0 x = -0 -<PI>

		public SubLObject execute(SubLObject y, SubLObject x)

		{
			if (!y.realp())
				return Lisp.type_error(y, LispSymbols.REAL);
			if (!x.realp())
				return Lisp.type_error(x, LispSymbols.REAL);
			double d1, d2;
			d1 = DoubleFloat.coerceToFloat(y).value;
			d2 = DoubleFloat.coerceToFloat(x).value;
			double result = Math.atan2(d1, d2);
			if (y instanceof DoubleFloat || x instanceof DoubleFloat)
				return LispObjectFactory.makeDouble(result);
			else
				return LispObjectFactory.makeSingle((float) result);
		}
	};

	// ### sinh
	private static Primitive SINH = new JavaPrimitive("sinh", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.sinh(arg);
		}
	};

	// ### cosh
	private static Primitive COSH = new JavaPrimitive("cosh", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.cosh(arg);
		}
	};

	// ### tanh
	private static Primitive TANH = new JavaPrimitive("tanh", "number") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SingleFloat) {
				double d = Math.tanh(((SingleFloat) arg).value);
				return LispObjectFactory.makeSingle((float) d);
			} else if (arg instanceof DoubleFloat) {
				double d = Math.tanh(((DoubleFloat) arg).value);
				return LispObjectFactory.makeDouble(d);
			}
			return MathFunctions.sinh(arg).divideBy(MathFunctions.cosh(arg));
		}
	};

	// ### asinh
	private static Primitive ASINH = new JavaPrimitive("asinh", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.asinh(arg);
		}
	};

	// ### acosh
	private static Primitive ACOSH = new JavaPrimitive("acosh", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.acosh(arg);
		}
	};

	// ### atanh
	private static Primitive ATANH = new JavaPrimitive("atanh", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.atanh(arg);
		}
	};

	// ### cis
	private static Primitive CIS = new JavaPrimitive("cis", "radians") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.cis(arg);
		}
	};

	/// Start of moving more math function to this file

	// ### exp
	private static Primitive EXP = new JavaPrimitive("exp", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.exp(arg);
		}
	};

	// ### sqrt
	private static Primitive SQRT = new JavaPrimitive("sqrt", "number") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.sqrt(arg);
		}
	};

	// ### log
	private static Primitive LOG = new JavaPrimitive("log", "number &optional base") {

		public SubLObject execute(SubLObject arg) {
			return MathFunctions.log(arg);
		}

		public SubLObject execute(SubLObject number, SubLObject base)

		{
			if (number.realp() && !number.isNegative() && base.numE(LispObjectFactory.makeInteger(10))) {
				double d = Math.log10(DoubleFloat.coerceToFloat(number).value);
				if (number instanceof DoubleFloat || base instanceof DoubleFloat)
					return LispObjectFactory.makeDouble(d);
				else
					return LispObjectFactory.makeSingle((float) d);
			}
			return MathFunctions.log(number).divideBy(MathFunctions.log(base));
		}
	};

	// ### expt base-number power-number => result
	public static Primitive EXPT = new JavaPrimitive("expt", "base-number power-number") {

		public SubLObject execute(SubLObject base, SubLObject power)

		{
			if (power.isZero()) {
				if (power instanceof Fixnum) {
					if (base instanceof SingleFloat)
						return SingleFloat.ONE;
					if (base instanceof DoubleFloat)
						return DoubleFloat.ONE;
					if (base instanceof Complex) {
						if (((Complex) base).realpart instanceof SingleFloat)
							return LispObjectFactory.makeComplex(SingleFloat.ONE, SingleFloat.ZERO);
						if (((Complex) base).realpart instanceof DoubleFloat)
							return LispObjectFactory.makeComplex(DoubleFloat.ONE, DoubleFloat.ZERO);
					}
					return Fixnum.ONE;
				}
				if (power instanceof DoubleFloat)
					return DoubleFloat.ONE;
				if (base instanceof DoubleFloat)
					return DoubleFloat.ONE;
				return SingleFloat.ONE;
			}
			if (base.isZero())
				return base;
			if (base.isEqualTo(1))
				return base;

			if ((power instanceof Fixnum || power instanceof Bignum)
					&& (base.rationalp() || base instanceof Complex && ((Complex) base).realpart.rationalp()))
				// exact math version
				return MathFunctions.intexp(base, power);
			// for anything not a rational or complex rational, use
			// float approximation.
			if (base instanceof Complex || power instanceof Complex)
				return MathFunctions.exp(power.mult(MathFunctions.log(base)));
			double x; // base
			double y; // power
			if (base instanceof Fixnum)
				x = ((Fixnum) base).value;
			else if (base instanceof Bignum)
				x = ((Bignum) base).doubleValue();
			else if (base instanceof Ratio)
				x = ((Ratio) base).doubleValue();
			else if (base instanceof SingleFloat)
				x = ((SingleFloat) base).value;
			else if (base instanceof DoubleFloat)
				x = ((DoubleFloat) base).value;
			else
				return Lisp.error(
						new LispError("EXPT: unsupported case: base is of type " + base.typeOf().writeToString()));

			if (power instanceof Fixnum)
				y = ((Fixnum) power).value;
			else if (power instanceof Bignum)
				y = ((Bignum) power).doubleValue();
			else if (power instanceof Ratio)
				y = ((Ratio) power).doubleValue();
			else if (power instanceof SingleFloat)
				y = ((SingleFloat) power).value;
			else if (power instanceof DoubleFloat)
				y = ((DoubleFloat) power).value;
			else
				return Lisp.error(
						new LispError("EXPT: unsupported case: power is of type " + power.typeOf().writeToString()));
			double r = Math.pow(x, y);
			if (Double.isNaN(r))
				if (x < 0) {
					r = Math.pow(-x, y);
					double realPart = r * Math.cos(y * Math.PI);
					double imagPart = r * Math.sin(y * Math.PI);
					if (base instanceof DoubleFloat || power instanceof DoubleFloat)
						return LispObjectFactory.makeComplex(
								MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeDouble(realPart)),
								MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeDouble(imagPart)));
					else
						return LispObjectFactory.makeComplex(
								MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeSingle((float) realPart)),
								MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeSingle((float) imagPart)));
				}
			if (base instanceof DoubleFloat || power instanceof DoubleFloat)
				return MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeDouble(r));
			else
				return MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeSingle((float) r));
		}
	};

	// ### mod number divisor
	public static Primitive MOD = new mod();

	// ### rem number divisor => remainder
	public static Primitive REM = new rem();

	// ### truncate number &optional divisor
	public static Primitive TRUNCATE = new truncate();

	// ### ash
	// ash integer count => shifted-integer
	public static Primitive ASH = new ash();

	public static Primitive CEILING = new ceiling();

	// ### float-sign
	public static Primitive FLOAT_SIGN = new float_sign();

	// ### floor number &optional divisor
	public static Primitive FLOOR = new floor();

	// "FFLOOR, FCEILING, FTRUNCATE, and FROUND handle arguments of different
	// types
	// in the following way: If number is a float, and divisor is not a float of
	// longer format, then the first result is a float of the same type as
	// number.
	// Otherwise, the first result is of the type determined by contagion
	// rules."
	public static Primitive FTRUNCATE = new ftruncate();

	// ### logand &rest integers => result-integer
	public static Primitive LOGAND = new logand();

	public static Primitive LOGANDC1 = new logandc1();

	// ### ftruncate number &optional divisor => quotient, remainder
	// (defun ftruncate (number &optional (divisor 1))
	// (multiple-value-bind (tru rem) (truncate number divisor)
	// (values (float tru) rem)))

	// ### logandc2
	public static Primitive LOGANDC2 = new logandc2();

	// ### logbitp index integer => generalized-boolean
	public static Primitive LOGBITP = new logbitp();

	// ### logcount integer => number-of-on-bits
	public static Primitive LOGCOUNT = new logcount();

	// ### logeqv
	public static Primitive LOGEQV = new logeqv();

	// ### logior &rest integers => result-integer
	public static Primitive LOGIOR = new logior();

	public static Primitive LOGNAND = new lognand();

	public static Primitive LOGNOR = new lognor();

	// ### lognot
	public static Primitive LOGNOT = new lognot("lognot", "integer");

	// ### logorc1
	public static Primitive LOGORC1 = new logorc1();

	// ### logorc2
	public static Primitive LOGORC2 = new logorc2();

	// ### logtest integer-1 integer-2 => generalized-boolean
	public static Primitive LOGTEST = new logtest();

	// ### logxor &rest integers => result-integer
	public static Primitive LOGXOR = new logxor();

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(MathFunctions.class);
	}

	@InlinableMethod
	public static SubLObject acos(SubLObject arg) {
		if (arg instanceof DoubleFloat) {
			double d = ((DoubleFloat) arg).value;
			if (Math.abs(d) <= 1)
				return LispObjectFactory.makeDouble(Math.acos(d));
		}
		if (arg instanceof SingleFloat) {
			float f = ((SingleFloat) arg).value;
			if (Math.abs(f) <= 1)
				return LispObjectFactory.makeSingle((float) Math.acos(f));
		}
		SubLObject result = LispObjectFactory.makeDouble(Math.PI / 2);
		if (!(arg instanceof DoubleFloat))
			if (arg instanceof Complex && ((Complex) arg).getRealPart() instanceof DoubleFloat) {
				// do nothing; we want to keep the double float value
			} else
				result = LispObjectFactory.makeSingle((float) ((DoubleFloat) result).value);
		result = result.sub(MathFunctions.asin(arg));
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	@InlinableMethod
	public static SubLObject acosh(SubLObject arg) {
		if (arg instanceof Complex) {
			SubLObject im = ((Complex) arg).getImaginaryPart();
			if (im.isZero())
				return LispObjectFactory.makeComplex(MathFunctions.acosh(((Complex) arg).getRealPart()), im);
		}
		SubLObject n1 = arg.add(Fixnum.ONE);
		n1 = n1.divideBy(Fixnum.TWO);
		n1 = MathFunctions.sqrt(n1);
		SubLObject n2 = arg.sub(Fixnum.ONE);
		n2 = n2.divideBy(Fixnum.TWO);
		n2 = MathFunctions.sqrt(n2);
		SubLObject result = n1.add(n2);
		result = MathFunctions.log(result);
		result = result.mult(Fixnum.TWO);
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	@InlinableMethod
	public static SubLObject asin(SubLObject arg) {
		if (arg instanceof SingleFloat) {
			float f = ((SingleFloat) arg).value;
			if (Math.abs(f) <= 1)
				return LispObjectFactory.makeSingle((float) Math.asin(f));
		}
		if (arg instanceof DoubleFloat) {
			double d = ((DoubleFloat) arg).value;
			if (Math.abs(d) <= 1)
				return LispObjectFactory.makeDouble(Math.asin(d));
		}
		SubLObject result = arg.mult(arg);
		result = Fixnum.ONE.sub(result);
		result = MathFunctions.sqrt(result);
		SubLObject n = LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.ONE);
		n = n.mult(arg);
		result = n.add(result);
		result = MathFunctions.log(result);
		result = result.mult(LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.MINUS_ONE));
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	@InlinableMethod
	public static SubLObject asinh(SubLObject arg) {
		if (arg instanceof Complex) {
			SubLObject im = ((Complex) arg).getImaginaryPart();
			if (im.isZero())
				return LispObjectFactory.makeComplex(MathFunctions.asinh(((Complex) arg).getRealPart()), im);
		}
		SubLObject result = arg.mult(arg);
		result = Fixnum.ONE.add(result);
		result = MathFunctions.sqrt(result);
		result = result.add(arg);
		result = MathFunctions.log(result);
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	static SubLObject atan(SubLObject arg) {
		if (arg instanceof Complex) {
			SubLObject im = ((Complex) arg).imagpart;
			if (im.isZero())
				return LispObjectFactory.makeComplex(MathFunctions.atan(((Complex) arg).realpart), im);
			SubLObject result = arg.mult(arg);
			result = result.add(Fixnum.ONE);
			result = Fixnum.ONE.divideBy(result);
			result = MathFunctions.sqrt(result);
			SubLObject n = LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.ONE);
			n = n.mult(arg);
			n = n.add(Fixnum.ONE);
			result = n.mult(result);
			result = MathFunctions.log(result);
			result = result.mult(LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.MINUS_ONE));
			return result;
		}
		if (arg instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(Math.atan(((DoubleFloat) arg).value));
		return LispObjectFactory.makeSingle((float) Math.atan(SingleFloat.coerceToFloat(arg).value));
	}

	@InlinableMethod
	public static SubLObject atanh(SubLObject arg) {
		if (arg instanceof Complex) {
			SubLObject im = ((Complex) arg).getImaginaryPart();
			if (im.isZero())
				return LispObjectFactory.makeComplex(MathFunctions.atanh(((Complex) arg).getRealPart()), im);
		}
		SubLObject n1 = MathFunctions.log(Fixnum.ONE.add(arg));
		SubLObject n2 = MathFunctions.log(Fixnum.ONE.sub(arg));
		SubLObject result = n1.sub(n2);
		result = result.divideBy(Fixnum.TWO);
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	@InlinableMethod
	public static SubLObject cis(SubLObject arg) {
		if (arg.realp())
			return LispObjectFactory.makeComplex(MathFunctions.cos(arg), MathFunctions.sin(arg));
		return Lisp.type_error(arg, LispSymbols.REAL);
	}

	@InlinableMethod
	public static SubLObject cos(SubLObject arg) {
		if (arg instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(Math.cos(((DoubleFloat) arg).value));
		if (arg.realp())
			return LispObjectFactory.makeSingle((float) Math.cos(SingleFloat.coerceToFloat(arg).value));
		if (arg instanceof Complex) {
			SubLObject n = arg.mult(LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.ONE));
			SubLObject result = MathFunctions.exp(n);
			result = result.add(MathFunctions.exp(n.mult(Fixnum.MINUS_ONE)));
			return result.divideBy(Fixnum.TWO);
		}
		return Lisp.type_error(arg, LispSymbols.NUMBER);
	}

	@InlinableMethod
	public static SubLObject cosh(SubLObject arg) {
		if (arg instanceof Complex) {
			SubLObject im = ((Complex) arg).getImaginaryPart();
			if (im.isZero())
				return LispObjectFactory.makeComplex(MathFunctions.cosh(((Complex) arg).getRealPart()), im);
		}
		if (arg instanceof SingleFloat) {
			double d = Math.cosh(((SingleFloat) arg).value);
			return LispObjectFactory.makeSingle((float) d);
		} else if (arg instanceof DoubleFloat) {
			double d = Math.cosh(((DoubleFloat) arg).value);
			return LispObjectFactory.makeDouble(d);
		}
		SubLObject result = MathFunctions.exp(arg);
		result = result.add(MathFunctions.exp(arg.mult(Fixnum.MINUS_ONE)));
		result = result.divideBy(Fixnum.TWO);
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	@InlinableMethod
	public static SubLObject exp(SubLObject arg) {
		if (arg.realp())
			if (arg instanceof DoubleFloat) {
				double d = Math.pow(Math.E, ((DoubleFloat) arg).value);
				return MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeDouble(d));
			} else {
				float f = (float) Math.pow(Math.E, SingleFloat.coerceToFloat(arg).value);
				return MathFunctions.OverUnderFlowCheck(LispObjectFactory.makeSingle(f));
			}
		if (arg instanceof Complex) {
			Complex c = (Complex) arg;
			return MathFunctions.exp(c.getRealPart()).mult(MathFunctions.cis(c.getImaginaryPart()));
		}
		return Lisp.type_error(arg, LispSymbols.NUMBER);
	}

	// Adapted from SBCL.
	/**
	 * Return the exponent of base taken to the integer exponent power
	 *
	 * @param base
	 *            A value of any type
	 * @param power
	 *            An integer (fixnum or bignum) value
	 */
	static public SubLObject intexp(SubLObject base, SubLObject power)

	{
		if (power.isEqualTo(0))
			return Fixnum.ONE;
		if (base.isEqualTo(1))
			return base;
		if (base.isEqualTo(0))
			return base;

		if (power.isNegative()) {
			power = Fixnum.ZERO.sub(power);
			return Fixnum.ONE.divideBy(MathFunctions.intexp(base, power));
		}
		if (base.eql(Fixnum.TWO))
			return Fixnum.ONE.ash(power);

		SubLObject nextn = power.ash(Fixnum.MINUS_ONE);
		SubLObject total;
		if (power.isOdd())
			total = base;
		else
			total = Fixnum.ONE;
		while (true) {
			if (nextn.isZero())
				return total;
			base = base.mult(base);

			if (nextn.isOdd())
				total = base.mult(total);
			nextn = nextn.ash(Fixnum.MINUS_ONE);
		}
	}

	@InlinableMethod
	public static SubLObject log(SubLObject obj) {
		if (obj.realp() && !obj.isNegative()) {
			// Result is real.
			if (obj instanceof Fixnum)
				return LispObjectFactory.makeSingle((float) Math.log(((Fixnum) obj).value));
			if (obj instanceof Bignum)
				return LispObjectFactory.makeSingle((float) Math.log(((Bignum) obj).doubleValue()));
			if (obj instanceof Ratio)
				return LispObjectFactory.makeSingle((float) Math.log(((Ratio) obj).doubleValue()));
			if (obj instanceof SingleFloat)
				return LispObjectFactory.makeSingle((float) Math.log(((SingleFloat) obj).value));
			if (obj instanceof DoubleFloat)
				return LispObjectFactory.makeDouble(Math.log(((DoubleFloat) obj).value));
		} else // Result is complex.
		if (obj.realp() && obj.isNegative()) {
			if (obj instanceof DoubleFloat) {
				DoubleFloat re = DoubleFloat.coerceToFloat(obj);
				DoubleFloat abs = LispObjectFactory.makeDouble(Math.abs(re.value));
				DoubleFloat phase = LispObjectFactory.makeDouble(Math.PI);
				return LispObjectFactory.makeComplex(LispObjectFactory.makeDouble(Math.log(abs.doubleValue())), phase);
			} else {
				SingleFloat re = SingleFloat.coerceToFloat(obj);
				SingleFloat abs = LispObjectFactory.makeSingle(Math.abs(re.value));
				SingleFloat phase = LispObjectFactory.makeSingle((float) Math.PI);
				return LispObjectFactory.makeComplex(LispObjectFactory.makeSingle((float) Math.log(abs.value)), phase);
			}
		} else if (obj instanceof Complex)
			if (((Complex) obj).getRealPart() instanceof DoubleFloat) {
				DoubleFloat re = DoubleFloat.coerceToFloat(((Complex) obj).getRealPart());
				DoubleFloat im = DoubleFloat.coerceToFloat(((Complex) obj).getImaginaryPart());
				DoubleFloat phase = LispObjectFactory.makeDouble(Math.atan2(im.doubleValue(), re.doubleValue())); // atan(y/x)
				DoubleFloat abs = DoubleFloat.coerceToFloat(obj.ABS());
				return LispObjectFactory.makeComplex(LispObjectFactory.makeDouble(Math.log(abs.doubleValue())), phase);
			} else {
				SingleFloat re = SingleFloat.coerceToFloat(((Complex) obj).getRealPart());
				SingleFloat im = SingleFloat.coerceToFloat(((Complex) obj).getImaginaryPart());
				SingleFloat phase = LispObjectFactory.makeSingle((float) Math.atan2(im.value, re.value)); // atan(y/x)
				SingleFloat abs = SingleFloat.coerceToFloat(obj.ABS());
				return LispObjectFactory.makeComplex(LispObjectFactory.makeSingle((float) Math.log(abs.value)), phase);
			}
		Lisp.type_error(obj, LispSymbols.NUMBER);
		return Lisp.NIL;
	}

	/**
	 * Checks number for over- or underflow values.
	 *
	 * @param number
	 * @return number or signals an appropriate error
	 */
	public static double OverUnderFlowCheck(double number)

	{
		if (Lisp.TRAP_OVERFLOW)
			if (Double.isInfinite(number))
				Lisp.error(new FloatingPointOverflow(Lisp.NIL));
		if (Lisp.TRAP_UNDERFLOW)
			if (number == 0)
				Lisp.error(new FloatingPointUnderflow(Lisp.NIL));
		return number;
	}

	/**
	 * Checks number for over- or underflow values.
	 *
	 * @param number
	 * @return number or signals an appropriate error
	 */
	static float OverUnderFlowCheck(float number)

	{
		if (Lisp.TRAP_OVERFLOW)
			if (Float.isInfinite(number))
				Lisp.error(new FloatingPointOverflow(Lisp.NIL));
		if (Lisp.TRAP_UNDERFLOW)
			if (number == 0)
				Lisp.error(new FloatingPointUnderflow(Lisp.NIL));
		return number;
	}

	/**
	 * Checks number for over- or underflow values.
	 *
	 * @param number
	 * @return number or signals an appropriate error
	 */
	static SubLObject OverUnderFlowCheck(SubLObject number)

	{
		if (number instanceof Complex) {
			MathFunctions.OverUnderFlowCheck(((Complex) number).realpart);
			MathFunctions.OverUnderFlowCheck(((Complex) number).imagpart);
			return number;
		}

		if (Lisp.TRAP_OVERFLOW) {
			if (number instanceof SingleFloat)
				if (Float.isInfinite(((SingleFloat) number).value))
					return Lisp.error(new FloatingPointOverflow(Lisp.NIL));
			if (number instanceof DoubleFloat)
				if (Double.isInfinite(((DoubleFloat) number).value))
					return Lisp.error(new FloatingPointOverflow(Lisp.NIL));
		}
		if (Lisp.TRAP_UNDERFLOW)
			if (number.isZero())
				return Lisp.error(new FloatingPointUnderflow(Lisp.NIL));
		return number;
	}

	@InlinableMethod
	public static SubLObject sin(SubLObject arg) {
		if (arg instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(Math.sin(((DoubleFloat) arg).value));
		if (arg.realp())
			return LispObjectFactory.makeSingle((float) Math.sin(SingleFloat.coerceToFloat(arg).value));
		if (arg instanceof Complex) {
			SubLObject n = arg.mult(LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.ONE));
			SubLObject result = MathFunctions.exp(n);
			result = result.sub(MathFunctions.exp(n.mult(Fixnum.MINUS_ONE)));
			return result.divideBy(Fixnum.TWO.mult(LispObjectFactory.makeComplex(Fixnum.ZERO, Fixnum.ONE)));
		}
		return Lisp.type_error(arg, LispSymbols.NUMBER);
	}

	@InlinableMethod
	public static SubLObject sinh(SubLObject arg) {
		if (arg instanceof Complex) {
			SubLObject im = ((Complex) arg).getImaginaryPart();
			if (im.isZero())
				return LispObjectFactory.makeComplex(MathFunctions.sinh(((Complex) arg).getRealPart()), im);
		}
		if (arg instanceof SingleFloat) {
			double d = Math.sinh(((SingleFloat) arg).value);
			return LispObjectFactory.makeSingle((float) d);
		} else if (arg instanceof DoubleFloat) {
			double d = Math.sinh(((DoubleFloat) arg).value);
			return LispObjectFactory.makeDouble(d);
		}
		SubLObject result = MathFunctions.exp(arg);
		result = result.sub(MathFunctions.exp(arg.mult(Fixnum.MINUS_ONE)));
		result = result.divideBy(Fixnum.TWO);
		if (result instanceof Complex) {
			if (arg instanceof Complex)
				return result;
			SubLObject im = ((Complex) result).getImaginaryPart();
			if (im.isZero())
				return ((Complex) result).getRealPart();
		}
		return result;
	}

	@InlinableMethod
	public static SubLObject sqrt(SubLObject obj) {
		if (obj instanceof DoubleFloat) {
			if (obj.isNegative())
				return LispObjectFactory.makeComplex(LispObjectFactory.makeDouble(0), MathFunctions.sqrt(obj.negate()));
			return LispObjectFactory.makeDouble(Math.sqrt(DoubleFloat.coerceToFloat(obj).value));
		}
		if (obj.realp()) {
			if (obj.isNegative())
				return LispObjectFactory.makeComplex(LispObjectFactory.makeSingle(0), MathFunctions.sqrt(obj.negate()));
			return LispObjectFactory.makeSingle((float) Math.sqrt(SingleFloat.coerceToFloat(obj).value));
		}
		if (obj instanceof Complex) {
			SubLObject imagpart = ((Complex) obj).imagpart;
			if (imagpart.isZero()) {
				SubLObject realpart = ((Complex) obj).realpart;
				if (realpart.isNegative())
					return LispObjectFactory.makeComplex(imagpart, MathFunctions.sqrt(realpart.negate()));
				else
					return LispObjectFactory.makeComplex(MathFunctions.sqrt(realpart), imagpart);
			}
			return MathFunctions.exp(MathFunctions.log(obj).divideBy(Fixnum.TWO));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}
}
