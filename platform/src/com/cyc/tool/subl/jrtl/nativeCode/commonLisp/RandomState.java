/*
 * RandomState.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: RandomState.java 12298 2009-12-18 21:50:54Z ehuelsmann $
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Random;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class RandomState extends AbstractLispObject {
	// ### random limit &optional random-state => random-number
	private static Primitive RANDOM = new JavaPrimitive(LispSymbols.RANDOM, "limit &optional random-state") {

		public SubLObject execute(SubLObject arg) {
			RandomState randomState = (RandomState) LispSymbols._RANDOM_STATE_.symbolValue();
			return randomState.random(arg);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (second instanceof RandomState) {
				RandomState randomState = (RandomState) second;
				return randomState.random(first);
			}
			return Lisp.type_error(first, LispSymbols.RANDOM_STATE);
		}
	};

	// ### make-random-state &optional state
	private static Primitive MAKE_RANDOM_STATE = new JavaPrimitive(LispSymbols.MAKE_RANDOM_STATE, "&optional state") {

		public SubLObject execute() {
			return new RandomState((RandomState) LispSymbols._RANDOM_STATE_.symbolValue());
		}

		public SubLObject execute(SubLObject arg)

		{
			if (arg == Lisp.NIL)
				return new RandomState((RandomState) LispSymbols._RANDOM_STATE_.symbolValue());
			if (arg == Lisp.T)
				return new RandomState();
			if (arg instanceof RandomState)
				return new RandomState((RandomState) arg);
			return Lisp.type_error(arg, LispSymbols.RANDOM_STATE);
		}
	};

	// ### random-state-p
	private static Primitive RANDOM_STATE_P = new JavaPrimitive(LispSymbols.RANDOM_STATE_P, "object") {

		public SubLObject execute(SubLObject arg) {
			return arg instanceof RandomState ? Lisp.T : Lisp.NIL;
		}
	};

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(RandomState.class);
	}

	@InlinableMethod
	static public SubLObject RANDOM_execute(SubLObject arg) {
		RandomState randomState = (RandomState) LispSymbols._RANDOM_STATE_.symbolValue();
		return randomState.random(arg);
	}

	private Random random;

	public RandomState() {
		this.random = new Random();
	}

	public RandomState(RandomState rs) {
		try {
			File file = File.createTempFile("MAKE-RANDOM-STATE", null);
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(rs.random);
			out.close();
			FileInputStream fileIn = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			this.random = (Random) in.readObject();
			in.close();
			file.delete(); // FIXME: file leak on exception
		} catch (Throwable t) { // ANY exception gets converted to a lisp error
			Lisp.error(new LispError("Unable to copy random state."));
		}
	}

	public SubLObject classOf() {
		return BuiltInClass.RANDOM_STATE;
	}

	public SubLObject random(SubLObject arg) {
		if (arg instanceof Fixnum) {
			int limit = ((Fixnum) arg).value;
			if (limit > 0) {
				int n = this.random.nextInt(limit);
				return LispObjectFactory.makeInteger(n);
			}
		} else if (arg instanceof Bignum) {
			BigInteger limit = ((Bignum) arg).bigIntegerValue();
			if (limit.signum() > 0) {
				int bitLength = limit.bitLength();
				BigInteger rand = new BigInteger(bitLength + 1, this.random);
				BigInteger remainder = rand.remainder(limit);
				return Lisp.number(remainder);
			}
		} else if (arg instanceof SingleFloat) {
			float limit = ((SingleFloat) arg).value;
			if (limit > 0) {
				float rand = this.random.nextFloat();
				return LispObjectFactory.makeSingle(rand * limit);
			}
		} else if (arg instanceof DoubleFloat) {
			double limit = ((DoubleFloat) arg).value;
			if (limit > 0) {
				double rand = this.random.nextDouble();
				return LispObjectFactory.makeDouble(rand * limit);
			}
		}
		return Lisp.type_error(arg, Lisp.list(LispSymbols.OR, Lisp.list(LispSymbols.INTEGER, Fixnum.ONE),
				Lisp.list(LispSymbols.FLOAT, Lisp.list(Fixnum.ZERO))));
	}

	public SubLObject typeOf() {
		return LispSymbols.RANDOM_STATE;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.RANDOM_STATE)
			return Lisp.T;
		if (type == BuiltInClass.RANDOM_STATE)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		return this.unreadableString(LispSymbols.RANDOM_STATE);
	}
}
