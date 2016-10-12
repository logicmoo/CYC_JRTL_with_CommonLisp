/*
 * LispObject.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: LispObject.java 12541 2010-03-15 10:57:44Z mevenson $
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

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.LispObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractLispObject extends SubLInchworm implements SubLObject {
	public AbstractLispObject() {
	}

	public SubLObject ABS() {
		return this.toNumber().ABS();
	}

	public SubLObject add(int n) {
		return this.add(LispObjectFactory.makeInteger(n));
	}

	public SubLObject add(SubLObject obj) {
		return this.toNumber().add(obj);
	}

	public int aref(int index) {
		return this.AREF(index).intValue();
	}

	public SubLObject AREF(int index) {
		return Lisp.type_error(this, LispSymbols.ARRAY).AREF(index);
	}

	public SubLObject AREF(SubLObject index) {
		return this.AREF(index.intValue());
	}

	public long aref_long(int index) {
		return this.AREF(index).longValue();
	}

	public void aset(int index, int n)

	{
		this.aset(index, LispObjectFactory.makeInteger(n));
	}

	public void aset(int index, SubLObject newValue)

	{
		Lisp.type_error(this, LispSymbols.ARRAY).aset(index, newValue);
	}

	public void aset(SubLObject index, SubLObject newValue)

	{
		this.aset(index.intValue(), newValue);
	}

	public SubLObject ash(int shift) {
		return this.ash(LispObjectFactory.makeInteger(shift));
	}

	public SubLObject ash(SubLObject obj) {
		return Lisp.checkInteger(this).ash(obj);
	}

	public SubLObject ATOM() {
		return this.isAtom() ? Lisp.T : Lisp.NIL;
	}

	// SubLObject
	public BigInteger bigIntegerValue() {
		return Lisp.type_error(this, LispSymbols.BIGNUM).bigIntegerValue();
	}

	// final static public Object getValue() throws Throwable {
	// Thread.dumpStack();
	// return null;
	// }
	// public Object getValue(LispObject a) throws Throwable {
	// Thread.dumpStack();
	// return null;
	// }
	public SubLObject car() {
		return this.first();
	}

	public SubLObject cddr() {
		return this.toList().cddr();
	}

	public SubLObject cdr() {
		return this.rest();
	}

	public SubLObject CHAR(int index) {
		return Lisp.type_error(this, LispSymbols.STRING);
	}

	public SubLObject CHARACTERP() {
		return this.isCharacter() ? Lisp.T : Lisp.NIL;
	}

	public char[] charsOld() {
		return Lisp.checkString(this).charsOld();
	}

	public char charValue() {
		Lisp.type_error(this, LispSymbols.CHARACTER);
		return 0;
	}

	public int cl_length() {
		if (this instanceof SubLSequence)
			return this.size();
		return this.toSeq().cl_length();
	}

	public SubLObject classOf() {
		return BuiltInClass.CLASS_T;
	}

	public SubLObject COMPLEXP() {
		return Lisp.NIL;
	}

	public boolean constantp() {
		return true;
	}

	public SubLObject CONSTANTP() {
		return this.constantp() ? Lisp.T : Lisp.NIL;
	}

	public SubLObject[] copyToArray() {
		return this.toList().copyToArray();
	}

	public SubLObject dec() {
		return this.toNumber().dec();
	}

	public SubLObject DENOMINATOR() {
		return Lisp.type_error(this, LispSymbols.RATIONAL).DENOMINATOR();
	}

	// Used by COMPILE-MULTIPLE-VALUE-CALL.
	public SubLObject dispatch(SubLObject[] args) {
		switch (args.length) {
		case 0:
			return this.execute();
		case 1:
			return this.execute(args[0]);
		case 2:
			return this.execute(args[0], args[1]);
		case 3:
			return this.execute(args[0], args[1], args[2]);
		case 4:
			return this.execute(args[0], args[1], args[2], args[3]);
		case 5:
			return this.execute(args[0], args[1], args[2], args[3], args[4]);
		case 6:
			return this.execute(args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return this.execute(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return this.execute(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		default:
			return this.execute(args);
		}
	}

	public SubLObject divideBy(SubLObject obj) {
		return this.toNumber().divideBy(obj);
	}

	public double doubleValue() {
		return Lisp.type_error(this, LispSymbols.DOUBLE_FLOAT).doubleValue();
	}

	public SubLObject elt(int index) {
		return this.toSeq().elt(index);
	}

	public boolean endp() {
		return this.toList().endp();
	}

	public SubLObject ENDP() {
		return this.endp() ? Lisp.T : Lisp.NIL;
	}

	public SubLObject EQ(SubLObject obj) {
		return this == obj ? Lisp.T : Lisp.NIL;
	}

	public boolean eql(char c) {
		return false;
	}

	public boolean eql(int n) {
		return false;
	}

	public boolean eql(SubLObject obj) {
		return this == obj;
	}

	public SubLObject EQL(SubLObject obj) {
		return this.eql(obj) ? Lisp.T : Lisp.NIL;
	}

	public boolean equal(int n) {
		return false;
	}

	public boolean equal(SubLObject obj) {
		return this == obj;
	}

	public SubLObject EQUAL(SubLObject obj) {
		return this.equal(obj) ? Lisp.T : Lisp.NIL;
	}

	public boolean equalp(int n) {
		return false;
	}

	public boolean equalp(SubLObject obj) {
		return this == obj;
	}

	public SubLObject EQUALP(SubLObject obj) {
		return this.equalp(obj) ? Lisp.T : Lisp.NIL;
	}

	public SubLObject EVENP() {
		return this.isEven() ? Lisp.T : Lisp.NIL;
	}

	public SubLObject execute() {
		return this.toSubLFunction().execute();
	}

	public SubLObject execute(SubLObject arg) {
		return this.toSubLFunction().execute(arg);
	}

	// Special operator
	public SubLObject execute(SubLObject args, Environment env)

	{
		return Lisp.error(new LispError("not an Operator " + this.writeToString()));
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		return this.toSubLFunction().execute(first, second);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		return this.toSubLFunction().execute(first, second, third);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		return this.toSubLFunction().execute(first, second, third, fourth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		return this.toSubLFunction().execute(first, second, third, fourth, fifth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		return this.toSubLFunction().execute(first, second, third, fourth, fifth, sixth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		return this.toSubLFunction().execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		return this.toSubLFunction().execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public SubLObject execute(SubLObject[] args) {
		return this.toSubLFunction().execute(args);
	}

	public SubLObject first() {
		// if (this instanceof Nil) {
		// return NIL;
		// }
		return this.toList().first();
	}

	public SubLObject FLOATP() {
		return this.isDouble() ? Lisp.T : Lisp.NIL;
	}

	public float floatValue() {
		return Lisp.type_error(this, LispSymbols.SINGLE_FLOAT).floatValue();
	}

	public SubLObject get(int index) {
		// TODO Auto-generated method stub
		return this.elt(index);
	}

	public boolean getBooleanValue() {
		return true;
	}

	// Profiling.
	public SubLObject getCallCount() {
		return Lisp.NIL;
	}

	public SubLObject getDescription() {
		StringBuilder sb = new StringBuilder("An object of type ");
		sb.append(this.typeOf().writeToString());
		sb.append(" at #x");
		sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
		return LispObjectFactory.makeString(sb);
	}

	public SubLObject getDocumentation(SubLObject docType)

	{
		SubLObject alist;
		synchronized (LispObject.documentationHashTable) {
			alist = LispObject.documentationHashTable.get(this);
		}
		if (alist != null) {
			SubLObject entry = Lisp.assq(docType, alist);
			if (entry instanceof SubLCons)
				return ((SubLCons) entry).rest();
		}
		return Lisp.NIL;
	}

	public int getFixnumSlotValue(int index) {
		return this.getSlotValue(index).intValue();
	}

	public int getHotCount() {
		return 0;
	}

	/**
	 * Implementing the getParts() protocol will allow INSPECT to return
	 * information about the substructure of a descendent of LispObject.
	 *
	 * The protocol is to return a List of Cons pairs, where the car of each
	 * pair contains a decriptive string, and the cdr returns a subobject for
	 * inspection.
	 */
	public SubLObject getParts() {
		return Lisp.NIL;
	}

	public SubLObject getPropertyList() {
		// Thread.dumpStack();
		// Debug.trace("getPropertyList " + writeToString());
		return null;
	}

	public SubLObject getSlotValue(int index) {
		return Lisp.type_error(this, LispSymbols.STRUCTURE_OBJECT);
	}

	public SubLObject getSlotValue_0() {
		return this.getSlotValue(0);
	}

	public SubLObject getSlotValue_1() {
		return this.getSlotValue(1);
	}

	public SubLObject getSlotValue_2() {
		return this.getSlotValue(2);
	}

	public SubLObject getSlotValue_3() {
		return this.getSlotValue(3);
	}

	public boolean getSlotValueAsBoolean(int index) {
		return this.getSlotValue(index).getBooleanValue();
	}

	/**
	 * Returns a string representing the value of a 'string designator', if the
	 * instance is one.
	 *
	 * Throws an error if the instance isn't a string designator.
	 */
	public String getString() {
		return Lisp.checkString(this).getString();
	}

	public char[] getStringChars() {
		return Lisp.checkString(this).getStringChars();
	}

	public SubLObject getSymbolFunction() {
		return this.toSymbol().getSymbolFunction();
	}

	public SubLObject getSymbolFunctionOrDie() {
		return this.toSymbol().getSymbolFunctionOrDie();
	}

	public SubLObject getSymbolValue() {
		return this.toSymbol().getSymbolValue();
	}

	public int hashCode() {
		return this.hashCodeLisp();
	}

	public int hashCode(int currentDepth) {
		return this.psxhash(currentDepth);
	}

	public int hashCodeLisp() {
		return this.superHash();
	}

	public SubLObject inc() {
		return this.toNumber().inc();
	}

	public void incrementCallCount(int n) {
	}

	public void incrementHotCount() {
	}

	public SubLObject INTEGERP() {
		return this.isInteger() ? Lisp.T : Lisp.NIL;
	}

	public int intValue() {
		return Lisp.checkInteger(this).intValue();
	}

	public SubLObject IS_E(SubLObject obj) {
		return this.numE(obj) ? Lisp.T : Lisp.NIL;
	}

	public SubLObject IS_GE(SubLObject obj) {
		return this.numGE(obj) ? Lisp.T : Lisp.NIL;
	}

	public SubLObject IS_GT(SubLObject obj) {
		return this.numG(obj) ? Lisp.T : Lisp.NIL;
	}

	public SubLObject IS_LE(SubLObject obj) {
		return this.numLE(obj) ? Lisp.T : Lisp.NIL;
	}

	public SubLObject IS_LT(SubLObject obj) {
		return this.numL(obj) ? Lisp.T : Lisp.NIL;
	}

	public SubLObject IS_NE(SubLObject obj) {
		return this.isNotEqualTo(obj) ? Lisp.T : Lisp.NIL;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isCharacter() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEqualTo(int n) {
		return this.numE(LispObjectFactory.makeInteger(n));
	}

	public boolean isEven() {
		return Lisp.checkInteger(this).isEven();
	}

	public boolean isGreaterThan(int n) {
		return this.numG(LispObjectFactory.makeInteger(n));
	}

	public boolean isGreaterThanOrEqualTo(int n) {
		return this.numGE(LispObjectFactory.makeInteger(n));
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isLessThan(int n) {
		return this.numL(LispObjectFactory.makeInteger(n));
	}

	public boolean isLessThanOrEqualTo(int n) {
		return this.numLE(LispObjectFactory.makeInteger(n));
	}

	public boolean isList() {
		return false;
	}

	public boolean isNegative() {
		Lisp.type_error(this, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean isNotEqualTo(int n) {
		return this.isNotEqualTo(LispObjectFactory.makeInteger(n));
	}

	public boolean isNotEqualTo(SubLObject obj) {
		return this.toNumber().isNotEqualTo(obj);
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isOdd() {
		return Lisp.checkInteger(this).isOdd();
	}

	public boolean isPositive() {
		Lisp.type_error(this, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean isSpecialOperator() {
		return this.toSymbol().isSpecialOperator();
	}

	public boolean isSpecialVariable() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public boolean isZero() {
		return this.toNumber().isZero();
	}

	public Object javaInstance() {
		return this;
	}

	public <T> Object javaInstance(Class<T> c) {
		if (c.isAssignableFrom(this.getClass()))
			return this;
		return Lisp.error(new LispError("The value " + this.writeToString() + " is not of class " + c.getName()));
	}

	public SubLObject LDB(int size, int position) {
		return Lisp.checkInteger(this).LDB(size, position);
	}

	public SubLObject LENGTH() {
		return LispObjectFactory.makeInteger(this.cl_length());
	}

	public SubLObject LISTP() {
		return this.isList() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * This method returns 'this' by default, but allows objects to return
	 * different values to increase Java interoperability
	 *
	 * @return An object to be used with synchronized, wait, notify, etc
	 */
	public Object lockableInstance() {
		return this;
	}

	public SubLObject LOGAND(int n) {
		return this.LOGAND(LispObjectFactory.makeInteger(n));
	}

	public SubLObject LOGAND(SubLObject obj) {
		return Lisp.checkInteger(this).LOGAND(obj);
	}

	public SubLObject LOGIOR(int n) {
		return this.LOGIOR(LispObjectFactory.makeInteger(n));
	}

	public SubLObject LOGIOR(SubLObject obj) {
		return Lisp.checkInteger(this);
	}

	public SubLObject LOGNOT() {
		return Lisp.checkInteger(this).LOGNOT();
	}

	public SubLObject LOGXOR(int n) {
		return this.LOGXOR(LispObjectFactory.makeInteger(n));
	}

	public SubLObject LOGXOR(SubLObject obj) {
		return Lisp.checkInteger(this).LOGXOR(obj);
	}

	public long longValue() {
		return Lisp.checkInteger(this).longValue();
	}

	public SubLObject MINUSP() {
		return this.isNegative() ? Lisp.T : Lisp.NIL;
	}

	public SubLObject MOD(int divisor) {
		return this.MOD(LispObjectFactory.makeInteger(divisor));
	}

	public SubLObject MOD(SubLObject divisor) {
		this.truncate(divisor);
		LispThread thread = LispThread.currentThread();
		SubLObject remainder = thread._values[1];
		thread.clearValues();
		if (!remainder.isZero())
			if (divisor.isNegative()) {
				if (this.isPositive())
					return remainder.add(divisor);
			} else if (this.isNegative())
				return remainder.add(divisor);
		return remainder;
	}

	public SubLObject mult(SubLObject obj) {
		return this.toNumber().mult(obj);
	}

	public SubLObject multiplyBy(int n) {
		return this.mult(LispObjectFactory.makeInteger(n));
	}

	public SubLObject negate() {
		return Fixnum.ZERO.sub(this);
	}

	public SubLObject noFillPointer() {
		return Lisp
				.type_error(this,
						Lisp.list(LispSymbols.AND, LispSymbols.VECTOR,
								Lisp.list(LispSymbols.SATISFIES, LispSymbols.ARRAY_HAS_FILL_POINTER_P)))
				.noFillPointer();
	}

	public SubLObject NOT() {
		return Lisp.NIL;
	}

	public SubLObject nreverse() {
		return this.toSeq().nreverse();
	}

	public SubLObject NTH(int index) {
		return this.toList().NTH(index);
	}

	public SubLObject NTH(SubLObject arg) {
		return this.toList().NTH(arg);
	}

	public SubLObject nthCdr(int n) {
		if (n < 0)
			n = Lisp.type_error(LispObjectFactory.makeInteger(n), Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO))
					.intValue();
		return this.toList().nthCdr(n);
	}

	public SubLObject NUMBERP() {
		return this.isNumber() ? Lisp.T : Lisp.NIL;
	}

	public boolean numE(SubLObject obj) {
		return this.toNumber().numE(obj);
	}

	public SubLObject NUMERATOR() {
		return Lisp.type_error(this, LispSymbols.RATIONAL).NUMERATOR();
	}

	public boolean numG(SubLObject obj) {
		Lisp.type_error(this, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numGE(SubLObject obj) {
		Lisp.type_error(this, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numL(SubLObject obj) {
		Lisp.type_error(this, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numLE(SubLObject obj) {
		Lisp.type_error(this, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public SubLObject ODDP() {
		return this.isOdd() ? Lisp.T : Lisp.NIL;
	}

	public SubLObject PLUSP() {
		return this.isPositive() ? Lisp.T : Lisp.NIL;
	}

	// For EQUALP hash tables.
	public int psxhash() {
		return this.sxhash();
	}

	public int psxhash(int depth) {
		return this.psxhash();
	}

	public SubLCons push(SubLObject obj) {
		if (this instanceof SubLCons)
			return LispObjectFactory.makeCons(obj, this);
		else if (this instanceof Nil)
			return LispObjectFactory.makeCons(obj);
		return this.toList().push(obj);
	}

	public boolean rationalp() {
		return false;
	}

	public SubLObject RATIONALP() {
		return this.rationalp() ? Lisp.T : Lisp.NIL;
	}

	public boolean realp() {
		return false;
	}

	public SubLObject REALP() {
		return this.realp() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Function to allow objects to return the value "they stand for". Used by
	 * AutoloadedFunctionProxy to return the function it is proxying.
	 */
	public SubLObject resolve() {
		return this;
	}

	public SubLObject rest() {
		// if (this instanceof Nil) {
		// return this;
		// }
		return this.toList().rest();
	}

	public SubLObject reverse() {
		return this.toSeq().reverse();
	}

	public SubLObject SCHAR(int index) {
		return Lisp.type_error(this, LispSymbols.SIMPLE_STRING);
	}

	public SubLObject second() {
		return this.toList().get(1);
	}

	public void setCallCount(int n) {
	}

	public void setCar(SubLObject obj) {
		if (this instanceof SubLCons) {
			((SubLCons) this).setFirst(obj);
			return;
		}
		Lisp.type_error(this, LispSymbols.CONS);
	}

	public void setCdr(SubLObject obj) {
		Lisp.type_error(this, LispSymbols.CONS).setCdr(obj);
	}

	public void setDocumentation(SubLObject docType, SubLObject documentation)

	{
		synchronized (LispObject.documentationHashTable) {
			SubLObject alist = LispObject.documentationHashTable.get(this);
			if (alist == null)
				alist = Lisp.NIL;
			SubLObject entry = Lisp.assq(docType, alist);
			if (entry instanceof SubLCons)
				((SubLCons) entry).setCdr(documentation);
			else {
				alist = alist.push(LispObjectFactory.makeCons(docType, documentation));
				LispObject.documentationHashTable.put(this, alist);
			}
		}
	}

	public SubLCons setFirst(SubLObject obj) {
		return Lisp.type_error(this, LispSymbols.CONS).setFirst(obj);
	}

	public void setHotCount(int n) {
	}

	public void setPropertyList(SubLObject obj) {
	}

	public SubLCons setRest(SubLObject obj) {
		return Lisp.type_error(this, LispSymbols.CONS).setRest(obj);
	}

	public void setSlotValue(int index, SubLObject value)

	{
		Lisp.type_error(this, LispSymbols.STRUCTURE_OBJECT);
	}

	public void setSlotValue(SubLObject slotName, SubLObject newValue)

	{
		Lisp.type_error(this, LispSymbols.STANDARD_OBJECT);
	}

	public void setSlotValue_0(SubLObject value)

	{
		this.setSlotValue(0, value);
	}

	public void setSlotValue_1(SubLObject value)

	{
		this.setSlotValue(1, value);
	}

	public void setSlotValue_2(SubLObject value)

	{
		this.setSlotValue(2, value);
	}

	public void setSlotValue_3(SubLObject value)

	{
		this.setSlotValue(3, value);
	}

	public SubLObject SIMPLE_STRING_P() {
		return Lisp.NIL;
	}

	public SubLObject SLOT_VALUE(SubLObject slotName) {
		return Lisp.type_error(this, LispSymbols.STANDARD_OBJECT);
	}

	public SubLObject STRING() {
		return Lisp.error(new TypeError(this.writeToString() + " cannot be coerced to a string."));
	}

	public SubLObject STRINGP() {
		return this.isString() ? Lisp.T : Lisp.NIL;
	}

	public SubLObject sub(SubLObject obj) {
		return this.toNumber().sub(obj);
	}

	public SubLObject subtract(int n) {
		return this.sub(LispObjectFactory.makeInteger(n));
	}

	public int superHash() {
		return super.hashCode();
	}

	public SubLObject SVREF(int index) {
		return Lisp.type_error(this, LispSymbols.SIMPLE_VECTOR).SVREF(index);
	}

	public void svset(int index, SubLObject newValue) {
		Lisp.type_error(this, LispSymbols.SIMPLE_VECTOR).svset(index, newValue);
	}

	public int sxhash() {
		return this.hashCodeLisp() & 0x7fffffff;
	}

	public SubLObject SYMBOLP() {
		return Lisp.NIL;
	}

	public SubLObject third() {
		return this.toList().get(2);
	}

	public SubLCharacter toChar() {
		if (this instanceof SubLCharacter)
			return (SubLCharacter) this;
		return Lisp.type_error(this, LispSymbols.CHAR).toChar();
	}

	public SubLList toList() {
		if (this instanceof SubLList)
			return (SubLList) this;
		return Lisp.type_error(this, LispSymbols.LIST).toList();
	}

	public SubLNumber toNumber() {
		return (SubLNumber) Lisp.type_error(this, LispSymbols.NUMBER);
	}
	

	public SubLPackageIterator toPackageIterator() {
		Errors.error(this + " is not of type: PACKAGE.");
		return null;
	}

	public SubLProcess toProcess() {
		return (SubLProcess) Lisp.type_error(this, CommonSymbols.PROCESSP);
	}

	public SubLSequence toSeq() {
		return Lisp.type_error(this, LispSymbols.SEQUENCE).toSeq();
	}

	public String toString() {
		return super.toString();
	}

	public SubLObject toSubLFunction() {
		return Lisp.type_error(this, LispSymbols.FUNCTION).toSubLFunction();
	}

	public SubLSymbol toSymbol() {
		if (this instanceof SubLSymbol)
			return (SubLSymbol) this;
		return Lisp.type_error(this, LispSymbols.SYMBOL).toSymbol();
	}

	public SubLObject truncate(SubLObject obj) {
		return Lisp.type_error(this, LispSymbols.REAL);
	}

	public SubLObject typeOf() {
		return Lisp.T;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == Lisp.T)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.CLASS_T)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.ATOM)
			return Lisp.T;
		return Lisp.NIL;
	}

	public String unreadableString(String s) {
		return this.unreadableString(s, true);
	}

	public String unreadableString(String s, boolean identity) {
		StringBuilder sb = new StringBuilder("#<");
		sb.append(s);
		if (identity) {
			sb.append(" {");
			sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
			sb.append("}");
		}
		sb.append(">");
		return sb.toString();
	}

	public String unreadableString(SubLSymbol sym) {
		return this.unreadableString(sym, true);
	}

	public String unreadableString(SubLSymbol symbol, boolean identity)

	{
		return this.unreadableString(symbol.writeToString(), identity);
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element)

	{
		return this.noFillPointer().VECTOR_PUSH_EXTEND(element);
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension)

	{
		return this.noFillPointer().VECTOR_PUSH_EXTEND(element, extension);
	}

	public SubLObject VECTORP() {
		return this.isVector() ? Lisp.T : Lisp.NIL;
	}

	public void vectorPushExtend(SubLObject element)

	{
		this.noFillPointer().vectorPushExtend(element);
	}

	public abstract String writeToString();

	public SubLObject ZEROP() {
		return this.isZero() ? Lisp.T : Lisp.NIL;
	}

	public int size(int max) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}
	
}
