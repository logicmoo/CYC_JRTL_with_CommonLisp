/*
 * Cons.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Cons.java 12516 2010-03-03 21:05:41Z astalla $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class LispConsPair extends AbstractSubLList implements SubLCons {
	// Statistics for TIME.
	private static long count;

	private static int computeEqualpHash(SubLObject obj, int depth) {
		if (obj instanceof SubLCons) {
			if (depth > 0) {
				int n1 = LispConsPair.computeEqualpHash(((SubLCons) obj).first(), depth - 1);
				int n2 = LispConsPair.computeEqualpHash(((SubLCons) obj).rest(), depth - 1);
				return n1 ^ n2;
			} else
				return 261835505; // See above.
		} else
			return obj.psxhash();
	}

	private static int computeHash(SubLObject obj, int depth) {
		if (obj instanceof SubLCons) {
			if (depth > 0) {
				int n1 = LispConsPair.computeHash(((SubLCons) obj).first(), depth - 1);
				int n2 = LispConsPair.computeHash(((SubLCons) obj).rest(), depth - 1);
				return n1 ^ n2;
			} else
				// This number comes from SBCL, but since we're not really
				// using SBCL's SXHASH algorithm, it's probably not optimal.
				// But who knows?
				return 261835505;
		} else
			return obj.sxhash();
	}

	/* package */ static long getCount() {
		return LispConsPair.count;
	}

	/* package */ static void setCount(long n) {
		LispConsPair.count = n;
	}

	protected SubLObject car;

	protected SubLObject cdr;

	public LispConsPair(String name, SubLObject value) {
		this.setCar(LispObjectFactory.makeString(name));
		this.setCdr(value != null ? value : Lisp.NULL_VALUE);
		++LispConsPair.count;
	}

	public LispConsPair(SubLObject car) {
		this.setCar(car);
		this.setCdr(Lisp.NIL);
		++LispConsPair.count;
	}

	public LispConsPair(SubLObject car, SubLObject cdr) {
		this.setCar(car);
		this.setCdr(cdr);
		++LispConsPair.count;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#cddr()
	 */

	public SubLObject cddr() {
		return this.rest().rest();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#length()
	 */

	public int cl_length() {
		int length = 1;
		SubLObject obj = this.rest();
		while (obj != Lisp.NIL) {
			++length;
			if (obj instanceof SubLCons)
				obj = ((SubLCons) obj).rest();
			else
				Lisp.type_error(obj, LispSymbols.LIST);
		}
		return length;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#classOf()
	 */

	public SubLObject classOf() {
		return BuiltInClass.CONS;
	}

	public int consLength() {
		// TODO Auto-generated method stub
		return this.cl_length();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#constantp()
	 */

	public boolean constantp() {
		if (this.first() == LispSymbols.QUOTE)
			if (this.rest() instanceof SubLCons)
				if (((SubLCons) this.rest()).rest() == Lisp.NIL)
					return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#copyToArray()
	 */

	public SubLObject[] copyToArray() {
		int length = this.cl_length();
		SubLObject[] array = LispObjectFactory.makeLispObjectArray(length);
		SubLObject rest = this;
		for (int i = 0; i < length; i++) {
			array[i] = rest.first();
			rest = rest.rest();
		}
		return array;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#elt(int)
	 */

	public SubLObject elt(int index) {
		if (index < 0)
			Lisp.type_error(LispObjectFactory.makeInteger(index), LispSymbols.UNSIGNED_BYTE);
		int i = 0;
		SubLCons cons = this;
		while (true) {
			if (i == index)
				return cons.first();
			SubLObject conscdr = cons.rest();
			if (conscdr instanceof SubLCons)
				cons = (SubLCons) conscdr;
			else {
				if (conscdr == Lisp.NIL)
					// Index too large.
					Lisp.type_error(LispObjectFactory.makeInteger(index), Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO,
							LispObjectFactory.makeInteger(this.cl_length() - 1)));
				else
					// Dotted list.
					Lisp.type_error(conscdr, LispSymbols.LIST);
				// Not reached.
				return Lisp.NIL;
			}
			++i;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#endp()
	 */

	public boolean endp() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#equal(com.cyc.tool.
	 * subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj.isArrayBased())
			return super.equal(obj);
		if (obj instanceof SubLCons)
			if (this.first().equal(((SubLCons) obj).first()) && this.rest().equal(((SubLCons) obj).rest()))
				return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#equalp(com.cyc.tool
	 * .subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj.isArrayBased())
			return super.equalp(obj);
		if (obj instanceof SubLCons)
			if (this.first().equalp(((SubLCons) obj).first()) && this.rest().equalp(((SubLCons) obj).rest()))
				return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute()
	 */

	public SubLObject execute() {
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute();
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject arg) {
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(arg);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second, third);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second, third, fourth);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second, third, fourth, fifth);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second, third, fourth, fifth, sixth);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second, third, fourth, fifth, sixth, seventh);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject,
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject[])
	 */

	public SubLObject execute(SubLObject[] args) {
		if (this.first() == LispSymbols.LAMBDA) {
			Closure closure = new Closure(this, new Environment());
			return closure.execute(args);
		}
		return this.signalExecutionError();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#first()
	 */
	public SubLObject first() {
		return this.car;
	}

	public boolean isArrayBased() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#isAtom()
	 */

	public boolean isAtom() {
		return false;
	}

	public boolean isCons() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#isList()
	 */

	public boolean isList() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#nreverse()
	 */

	public SubLObject nreverse() {
		if (this.rest() instanceof SubLCons) {
			SubLCons cons = (SubLCons) this.rest();
			if (cons.rest() instanceof SubLCons) {
				SubLCons cons1 = cons;
				SubLObject list = Lisp.NIL;
				do {
					SubLCons temp = (SubLCons) cons.rest();
					cons.setCdr(list);
					list = cons;
					cons = temp;
				} while (cons.rest() instanceof SubLCons);
				if (cons.rest() != Lisp.NIL)
					return Lisp.type_error(cons.rest(), LispSymbols.LIST);
				this.setCdr(list);
				cons1.setCdr(cons);
			} else if (cons.rest() != Lisp.NIL)
				return Lisp.type_error(cons.rest(), LispSymbols.LIST);
			SubLObject temp = this.first();
			this.setCar(cons.first());
			cons.setCar(temp);
		} else if (this.rest() != Lisp.NIL)
			return Lisp.type_error(this.rest(), LispSymbols.LIST);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#NTH(int)
	 */

	public SubLObject NTH(int index) {
		if (index < 0)
			Lisp.type_error(LispObjectFactory.makeInteger(index), LispSymbols.UNSIGNED_BYTE);
		int i = 0;
		SubLObject obj = this;
		while (true) {
			if (i == index)
				return obj.first();
			obj = obj.rest();
			if (obj == Lisp.NIL)
				return Lisp.NIL;
			++i;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#NTH(com.cyc.tool.
	 * subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject NTH(SubLObject arg) {
		int index;
		if (arg instanceof Fixnum)
			index = ((Fixnum) arg).value;
		else {
			if (arg instanceof Bignum) {
				// FIXME (when machines have enough memory for it to matter)
				if (arg.isNegative())
					return Lisp.type_error(arg, LispSymbols.UNSIGNED_BYTE);
				return Lisp.NIL;
			}
			return Lisp.type_error(arg, LispSymbols.UNSIGNED_BYTE);
		}
		if (index < 0)
			Lisp.type_error(arg, LispSymbols.UNSIGNED_BYTE);
		int i = 0;
		SubLObject obj = this;
		while (true) {
			if (i == index)
				return obj.first();
			obj = obj.rest();
			if (obj == Lisp.NIL)
				return Lisp.NIL;
			++i;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#nthCdr(int)
	 */

	public SubLObject nthCdr(int n) {
		if (n < 0)
			return Lisp.type_error(LispObjectFactory.makeInteger(n), Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO));
		SubLObject result = this;
		for (int i = n; i-- > 0;) {
			result = result.rest();
			if (result == Lisp.NIL)
				break;
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#psxhash()
	 */

	public int psxhash() {
		return LispConsPair.computeEqualpHash(this, 4);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#rest()
	 */
	public SubLObject rest() {
		return this.cdr;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#reverse()
	 */

	public SubLObject reverse() {
		SubLCons cons = this;
		SubLObject result = LispObjectFactory.makeCons(cons.first());
		while (cons.rest() instanceof SubLCons) {
			cons = (SubLCons) cons.rest();
			result = LispObjectFactory.makeCons(cons.first(), result);
		}
		if (cons.rest() != Lisp.NIL)
			return Lisp.type_error(cons.rest(), LispSymbols.LIST);
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#cadr()
	 */

	public SubLObject second() {
		return this.rest().first();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setCar(com.cyc.tool
	 * .subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
	public void setCar(SubLObject car) {
		this.car = car;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setCdr(com.cyc.tool
	 * .subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
	public void setCdr(SubLObject cdr) {
		this.cdr = cdr;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setFirst(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLCons setFirst(SubLObject obj) {
		this.setCar(obj);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setRest(com.cyc.
	 * tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLCons setRest(SubLObject obj) {
		this.setCdr(obj);
		return this;
	}

	private SubLObject signalExecutionError() {
		return Lisp.type_error(this, Lisp.list(LispSymbols.OR, LispSymbols.FUNCTION, LispSymbols.SYMBOL));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#sxhash()
	 */

	public int sxhash() {
		return LispConsPair.computeHash(this, 4);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#caddr()
	 */

	public SubLObject third() {
		return this.rest().second();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#toString()
	 */

	public String toString() {
		try {
			return this.writeToString();
		} catch (Throwable e) {
			return super.toString();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#typeOf()
	 */

	public SubLObject typeOf() {
		return LispSymbols.CONS;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#typep(com.cyc.tool.
	 * subl.jrtl.nativeCode.commonLisp.LispObject)
	 */

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier instanceof SubLSymbol) {
			if (typeSpecifier == LispSymbols.LIST)
				return Lisp.T;
			if (typeSpecifier == LispSymbols.CONS)
				return Lisp.T;
			if (typeSpecifier == LispSymbols.SEQUENCE)
				return Lisp.T;
			if (typeSpecifier == Lisp.T)
				return Lisp.T;
		} else if (typeSpecifier instanceof LispClass) {
			if (typeSpecifier == BuiltInClass.LIST)
				return Lisp.T;
			if (typeSpecifier == BuiltInClass.CONS)
				return Lisp.T;
			if (typeSpecifier == BuiltInClass.SEQUENCE)
				return Lisp.T;
			if (typeSpecifier == BuiltInClass.CLASS_T)
				return Lisp.T;
		}
		return Lisp.NIL;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#writeToString()
	 */

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		SubLObject printLength = LispSymbols.PRINT_LENGTH.symbolValue(thread);
		int maxLength;
		if (printLength instanceof Fixnum)
			maxLength = ((Fixnum) printLength).value;
		else
			maxLength = Integer.MAX_VALUE;
		SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
		int maxLevel;
		if (printLevel instanceof Fixnum)
			maxLevel = ((Fixnum) printLevel).value;
		else
			maxLevel = Integer.MAX_VALUE;
		StringBuilder sb = new StringBuilder();
		if (this.first() == LispSymbols.QUOTE)
			if (this.rest() instanceof SubLCons)
				// Not a dotted list.
				if (this.rest().rest() == Lisp.NIL) {
				sb.append('\'');
				sb.append(this.rest().first().writeToString());
				return sb.toString();
				}
		if (this.first() == LispSymbols.FUNCTION)
			if (this.rest() instanceof SubLCons)
				// Not a dotted list.
				if (this.rest().rest() == Lisp.NIL) {
				sb.append("#'");
				sb.append(this.rest().first().writeToString());
				return sb.toString();
				}
		SubLObject currentPrintLevel = Lisp._CURRENT_PRINT_LEVEL_.symbolValue(thread);
		int currentLevel = currentPrintLevel.intValue();
		if (currentLevel < maxLevel) {
			SpecialBindingsMark mark = thread.markSpecialBindings();
			thread.bindSpecial(Lisp._CURRENT_PRINT_LEVEL_, currentPrintLevel.inc());
			try {
				int count = 0;
				boolean truncated = false;
				sb.append('(');
				if (count < maxLength) {
					SubLObject p = this;
					sb.append(p.first().writeToString());
					++count;
					while ((p = p.rest()) instanceof SubLCons) {
						sb.append(' ');
						if (count < maxLength) {
							sb.append(p.first().writeToString());
							++count;
						} else {
							truncated = true;
							break;
						}
					}
					if (!truncated && p != Lisp.NIL) {
						sb.append(" . ");
						sb.append(p.writeToString());
					}
				} else
					truncated = true;
				if (truncated)
					sb.append("...");
				sb.append(')');
			} finally {
				thread.resetSpecialBindings(mark);
			}
		} else
			sb.append('#');
		return sb.toString();
	}
}
