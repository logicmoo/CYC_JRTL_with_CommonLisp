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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.WeakHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface LispObject {

	public static WeakHashMap<SubLObject, SubLObject> documentationHashTable = new WeakHashMap<SubLObject, SubLObject>();

	public abstract SubLObject ABS();

	public abstract SubLObject add(int n);

	public abstract SubLObject add(SubLObject obj);

	public abstract int aref(int index);

	public abstract SubLObject AREF(int index);

	public abstract SubLObject AREF(SubLObject index);

	public abstract long aref_long(int index);

	public abstract void aset(int index, int n);

	public abstract void aset(int index, SubLObject newValue);

	public abstract void aset(SubLObject index, SubLObject newValue);

	public abstract SubLObject ash(int shift);

	public abstract SubLObject ash(SubLObject obj);

	public abstract SubLObject ATOM();

	public abstract SubLObject car();

	public abstract SubLObject cddr();

	public abstract SubLObject cdr();

	public abstract SubLObject CHAR(int index);

	public abstract SubLObject CHARACTERP();

	public abstract char[] charsOld();

	public abstract char charValue();

	public abstract int cl_length();

	public abstract SubLObject classOf();

	public abstract SubLObject COMPLEXP();

	public abstract boolean constantp();

	public abstract SubLObject CONSTANTP();

	public abstract SubLObject[] copyToArray();

	public abstract SubLObject dec();

	public abstract SubLObject DENOMINATOR();

	// Used by COMPILE-MULTIPLE-VALUE-CALL.
	public abstract SubLObject dispatch(SubLObject[] args);

	public abstract SubLObject divideBy(SubLObject obj);

	public abstract double doubleValue();

	public abstract SubLObject elt(int index);

	public abstract boolean endp();

	public abstract SubLObject ENDP();

	public abstract SubLObject EQ(SubLObject obj);

	public abstract boolean eql(char c);

	public abstract boolean eql(int n);

	public abstract boolean eql(SubLObject obj);

	public abstract SubLObject EQL(SubLObject obj);

	public abstract boolean equal(int n);

	public abstract boolean equal(SubLObject obj);

	public abstract SubLObject EQUAL(SubLObject obj);

	public abstract boolean equalp(int n);

	public abstract boolean equalp(SubLObject obj);

	public abstract SubLObject EQUALP(SubLObject obj);

	public abstract SubLObject EVENP();

	public abstract SubLObject execute();

	public abstract SubLObject execute(SubLObject arg);

	// Special operator
	public abstract SubLObject execute(SubLObject args, Environment env);

	public abstract SubLObject execute(SubLObject first, SubLObject second);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth);

	public abstract SubLObject execute(SubLObject[] args);

	public abstract SubLObject first();

	public abstract SubLObject FLOATP();

	public abstract float floatValue();

	public abstract boolean getBooleanValue();

	// Profiling.
	public abstract SubLObject getCallCount();

	/**
	 * Implementing the getParts() protocol will allow INSPECT to return
	 * information about the substructure of a descendent of LispObject.
	 *
	 * The protocol is to return a List of Cons pairs, where the car of each
	 * pair contains a decriptive string, and the cdr returns a subobject for
	 * inspection.
	 */

	public abstract SubLObject getDescription();

	public abstract SubLObject getDocumentation(SubLObject docType);

	public abstract int getFixnumSlotValue(int index);

	public abstract int getHotCount();

	public abstract SubLObject getParts();

	public abstract SubLObject getPropertyList();

	public abstract SubLObject getSlotValue(int index);

	public abstract SubLObject getSlotValue_0();

	public abstract SubLObject getSlotValue_1();

	public abstract SubLObject getSlotValue_2();

	public abstract SubLObject getSlotValue_3();

	public abstract boolean getSlotValueAsBoolean(int index);

	/**
	 * Returns a string representing the value of a 'string designator', if the
	 * instance is one.
	 *
	 * Throws an error if the instance isn't a string designator.
	 */
	public abstract String getString();

	public abstract char[] getStringChars();

	public abstract SubLObject getSymbolFunction();

	public abstract SubLObject getSymbolFunctionOrDie();

	public abstract SubLObject getSymbolValue();

	int hashCodeLisp();

	public abstract SubLObject inc();

	public abstract void incrementCallCount(int arity);

	public abstract void incrementHotCount();

	public abstract SubLObject INTEGERP();

	public abstract int intValue();

	public abstract SubLObject IS_E(SubLObject obj);

	public abstract SubLObject IS_GE(SubLObject obj);

	public abstract SubLObject IS_GT(SubLObject obj);

	public abstract SubLObject IS_LE(SubLObject obj);

	public abstract SubLObject IS_LT(SubLObject obj);

	public abstract SubLObject IS_NE(SubLObject obj);

	public abstract boolean isAtom();

	public abstract boolean isCharacter();

	public abstract boolean isDouble();

	public abstract boolean isEqualTo(int n);

	public abstract boolean isEven();

	public abstract boolean isGreaterThan(int n);

	public abstract boolean isGreaterThanOrEqualTo(int n);

	public abstract boolean isInteger();

	public abstract boolean isKeyword();

	public abstract boolean isLessThan(int n);

	public abstract boolean isLessThanOrEqualTo(int n);

	public abstract boolean isList();

	public abstract boolean isNegative();

	public abstract boolean isNotEqualTo(int n);

	public abstract boolean isNotEqualTo(SubLObject obj);

	public abstract boolean isNumber();

	public abstract boolean isOdd();

	public abstract boolean isPositive();

	public abstract boolean isSpecialOperator();

	public abstract boolean isSpecialVariable();

	public abstract boolean isString();

	public abstract boolean isSymbol();

	public abstract boolean isVector();

	public abstract boolean isZero();

	public abstract Object javaInstance();

	public abstract <T> Object javaInstance(Class<T> c);

	public abstract SubLObject LDB(int size, int position);

	public abstract SubLObject LENGTH();

	public abstract SubLObject LISTP();

	/**
	 * This method returns 'this' by default, but allows objects to return
	 * different values to increase Java interoperability
	 *
	 * @return An object to be used with synchronized, wait, notify, etc
	 */
	public abstract Object lockableInstance();

	public abstract SubLObject LOGAND(int n);

	public abstract SubLObject LOGAND(SubLObject obj);

	public abstract SubLObject LOGIOR(int n);

	public abstract SubLObject LOGIOR(SubLObject obj);

	public abstract SubLObject LOGNOT();

	public abstract SubLObject LOGXOR(int n);

	public abstract SubLObject LOGXOR(SubLObject obj);

	public abstract long longValue();

	public abstract SubLObject MINUSP();

	public abstract SubLObject MOD(int divisor);

	public abstract SubLObject MOD(SubLObject divisor);

	public abstract SubLObject mult(SubLObject obj);

	public abstract SubLObject multiplyBy(int n);

	public abstract SubLObject negate();

	public abstract SubLObject noFillPointer();

	public abstract SubLObject NOT();

	public abstract SubLObject nreverse();

	public abstract SubLObject NTH(int index);

	public abstract SubLObject NTH(SubLObject arg);

	public abstract SubLObject nthCdr(int n);

	public abstract SubLObject NUMBERP();

	public abstract boolean numE(SubLObject obj);

	public abstract SubLObject NUMERATOR();

	public abstract boolean numG(SubLObject obj);

	public abstract boolean numGE(SubLObject obj);

	public abstract boolean numL(SubLObject obj);

	public abstract boolean numLE(SubLObject obj);

	public abstract SubLObject ODDP();

	public abstract SubLObject PLUSP();

	// For EQUALP hash tables.
	public abstract int psxhash();

	public abstract int psxhash(int depth);

	public abstract SubLObject push(SubLObject obj);

	public abstract boolean rationalp();

	public abstract SubLObject RATIONALP();

	public abstract boolean realp();

	public abstract SubLObject REALP();

	/**
	 * Function to allow objects to return the value "they stand for". Used by
	 * AutoloadedFunctionProxy to return the function it is proxying.
	 */
	public abstract SubLObject resolve();

	public abstract SubLObject rest();

	public abstract SubLObject reverse();

	public abstract SubLObject SCHAR(int index);

	public abstract SubLObject second();

	public abstract void setCallCount(int n);

	public abstract void setCar(SubLObject obj);

	public abstract void setCdr(SubLObject obj);

	public abstract void setDocumentation(SubLObject docType, SubLObject documentation);

	public abstract SubLObject setFirst(SubLObject obj);

	public abstract void setHotCount(int n);

	public abstract void setPropertyList(SubLObject obj);

	public abstract SubLObject setRest(SubLObject obj);

	public abstract void setSlotValue(int index, SubLObject value);

	public abstract void setSlotValue(SubLObject slotName, SubLObject newValue);

	public abstract void setSlotValue_0(SubLObject value);

	public abstract void setSlotValue_1(SubLObject value);

	public abstract void setSlotValue_2(SubLObject value);

	public abstract void setSlotValue_3(SubLObject value);

	public abstract SubLObject SIMPLE_STRING_P();

	public abstract SubLObject SLOT_VALUE(SubLObject slotName);

	public abstract SubLObject STRING();

	public abstract SubLObject STRINGP();

	public abstract SubLObject sub(SubLObject obj);

	public abstract SubLObject subtract(int n);

	public abstract SubLObject SVREF(int index);

	public abstract void svset(int index, SubLObject newValue);

	public abstract int sxhash();

	public abstract SubLObject SYMBOLP();

	public abstract SubLObject third();

	public abstract SubLObject toList();

	public abstract SubLObject toSubLFunction();

	public abstract SubLSymbol toSymbol();

	public abstract SubLObject truncate(SubLObject obj);

	public abstract SubLObject typeOf();

	public abstract SubLObject typep(SubLObject typeSpecifier);

	public abstract String unreadableString(String s);

	public abstract String unreadableString(String s, boolean identity);

	public abstract String unreadableString(SubLSymbol sym);

	public abstract String unreadableString(SubLSymbol symbol, boolean identity);

	public abstract SubLObject VECTOR_PUSH_EXTEND(SubLObject element);

	public abstract SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension);

	public abstract SubLObject VECTORP();

	public abstract void vectorPushExtend(SubLObject element);

	public abstract String writeToString();

	public abstract SubLObject ZEROP();

	//
	// public SubLObject symbolValue(LispThread thread);
	//
	// public SubLObject symbolValue();
	//
	// public void setSymbolValue(SubLObject arglist);
	//
	// public void setSymbolFunction(SubLObject standardGenericFunction);
	//
	// public void setBuiltInFunction(boolean b);
	//
	// public void initializeSpecial(SubLObject t);
	//
	// public void setPackage(SubLObject nil);
	//
	// public void initializeConstant(SubLObject makeSingle);
	//
	// public String getQualifiedName();
	//
	// public SubLObject symbolValueNoThrow();
	//
	// public String getName();
	//
	// public boolean isBuiltInFunction();
	//
	// public SubLObject getLispPackage();
	//
	// public void setSpecial(boolean b);
	//
	// public boolean isConstant();
	//
	// public AbstractString getSymbolName();
	//
	// public SubLObject getSymbolSetfFunctionOrDie();
	//
	// //public Symbol addFunction(String upperCase, LispObject function);
}
