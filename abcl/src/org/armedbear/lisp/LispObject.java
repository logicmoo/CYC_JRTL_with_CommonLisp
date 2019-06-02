/*
 * LispObject.java
 *
 * Copyright (C) 2002-2007 Peter Graves
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

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;
import java.util.WeakHashMap;

public abstract class LispObject // extends Number
{

	static Object TO_STRING_OBJ;

	@Override
	public String toString() {
    if (ansi) return super.toString();
		final Object waz = TO_STRING_OBJ;
		if (waz == this) {
			return super.toString();
		} else if (waz == null) {
			TO_STRING_OBJ = this;
		}
		try {			
			return printObject();
		} catch (Throwable t) {
			return toStringSimple();
		} finally {
			TO_STRING_OBJ = waz;
		}
	}

	public String toStringSimple() {
    if (ansi) return super.toString();	
		LispObject parts = getParts();
		if (parts != null && parts != NIL) {
			return parts.toString();
		}
		return super.toString();
	}

	protected LispObject() {
		
	}
  /** Function to allow objects to return the value
   * "they stand for". Used by AutoloadedFunctionProxy to return
   * the function it is proxying.
   */
  public abstract LispObject resolve();

  public abstract LispObject typeOf();

  static public LispObject getInstance(boolean b) {
      return b ? T : NIL;
  }

  public abstract LispObject classOf();

  public abstract LispObject getDescription();

  /** 
   *  Implementing the getParts() protocol will allow INSPECT to
   *  return information about the substructure of a descendent of
   *  LispObject.
   *  
   *  The protocol is to return a List of Cons pairs, where the car of
   *  each pair contains a decriptive string, and the cdr returns a
   *  subobject for inspection.
   */
  public abstract LispObject getParts();

  public abstract boolean getBooleanValue();

  public abstract LispObject typep(LispObject typeSpecifier);

  public abstract boolean constantp();

  public abstract LispObject CONSTANTP();

  public abstract LispObject ATOM();

  public abstract boolean atom();

  public abstract Object javaInstance();

  public abstract Object javaInstance(Class<?> c);

  /** This method returns 'this' by default, but allows
   * objects to return different values to increase Java
   * interoperability
   * 
   * @return An object to be used with synchronized, wait, notify, etc
   */
  public abstract Object lockableInstance();


  public abstract LispObject car();

  public abstract void setCar(LispObject obj);

  public abstract LispObject RPLACA(LispObject obj);

  public abstract LispObject cdr();

  public abstract void setCdr(LispObject obj);

  public abstract LispObject RPLACD(LispObject obj);

  public abstract LispObject cadr();

  public abstract LispObject cddr();

  public abstract LispObject caddr();

  public abstract LispObject nthcdr(int n);

  public abstract LispObject push(LispObject obj);

  public abstract LispObject EQ(LispObject obj);

  public abstract boolean eql(char c);

  public abstract boolean eql(int n);

  public abstract boolean eql(LispObject obj);

  public abstract LispObject EQL(LispObject obj);

  public abstract LispObject EQUAL(LispObject obj);

  public abstract boolean equal(int n);

  public abstract boolean equal(LispObject obj);

  public abstract boolean equalp(int n);

  public abstract boolean equalp(LispObject obj);

  public abstract LispObject ABS();

  public abstract LispObject NUMERATOR();

  public abstract LispObject DENOMINATOR();

  public abstract LispObject EVENP();

  public abstract boolean evenp();

  public abstract LispObject ODDP();

  public abstract boolean oddp();

  public abstract LispObject PLUSP();

  public abstract boolean plusp();

  public abstract LispObject MINUSP();

  public abstract boolean minusp();

  public abstract LispObject NUMBERP();

  public abstract boolean numberp();

  public abstract LispObject ZEROP();

  public abstract boolean zerop();

  public abstract LispObject COMPLEXP();

  public abstract LispObject FLOATP();

  public abstract boolean floatp();

  public abstract LispObject INTEGERP();

  public abstract boolean integerp();

  public abstract LispObject RATIONALP();

  public abstract boolean rationalp();

  public abstract LispObject REALP();

  public abstract boolean realp();

  public abstract LispObject STRINGP();

  public abstract boolean stringp();

  public abstract LispObject SIMPLE_STRING_P();

  public abstract LispObject VECTORP();

  public abstract boolean vectorp();

  public abstract LispObject CHARACTERP();

  public abstract boolean characterp();

  public abstract int length();

  public abstract LispObject LENGTH();

  public abstract LispObject CHAR(int index);

  public abstract LispObject SCHAR(int index);

  public abstract LispObject NTH(int index);

  public abstract LispObject NTH(LispObject arg);

  public abstract LispObject elt(int index);

  public abstract LispObject reverse();

  public abstract LispObject nreverse();

  public abstract long aref_long(int index);

  public abstract int aref(int index);

  public abstract LispObject AREF(int index);

  public abstract LispObject AREF(LispObject index);

  public abstract void aset(int index, int n);

  public abstract void aset(int index, LispObject newValue);

  public abstract void aset(LispObject index, LispObject newValue);

  public abstract LispObject SVREF(int index);

  public abstract void svset(int index, LispObject newValue);

  public abstract void vectorPushExtend(LispObject element);

  public abstract LispObject VECTOR_PUSH_EXTEND(LispObject element);

  public abstract LispObject VECTOR_PUSH_EXTEND(LispObject element, LispObject extension);

  public abstract LispObject noFillPointer();

  public abstract LispObject[] copyToArray();

  public abstract LispObject SYMBOLP();

  public abstract boolean listp();

  public abstract LispObject LISTP();

  public abstract boolean endp();

  public abstract LispObject ENDP();

  public abstract LispObject NOT();

  public abstract boolean isSpecialOperator();

  public abstract boolean isSpecialVariable();


  public abstract LispObject getDocumentation(LispObject docType);

  public abstract void setDocumentation(LispObject docType, LispObject documentation);

  public abstract LispObject getPropertyList();

  public abstract void setPropertyList(LispObject obj);

  public abstract LispObject getSymbolValue();

  public abstract LispObject getSymbolFunction();

  public abstract LispObject getSymbolFunctionOrDie();

  public abstract LispObject getSymbolSetfFunction();

  public abstract LispObject getSymbolSetfFunctionOrDie();

  /** PRINC-TO-STRING function to be used with Java objects
   * 
   * @return A string in human-readable format, as per PRINC definition
   */
  public abstract String princToString();

  public abstract String printObject();

  /** Calls unreadableString(String s, boolean identity) with a default
   * identity value of 'true'.
   * 
   * This function is a helper for printObject()
   * 
   * @param s String representation of this object.
   * @return String enclosed in the non-readable #< ... > markers
   */
  public abstract String unreadableString(String s);

  /** Creates a non-readably (as per CLHS terminology) representation
   * of the 'this' object, using string 's'.
   * 
   * If the current value of the variable *PRINT-READABLY* is T, a
   * Lisp error is thrown and no value is returned.
   * 
   * This function is a helper for printObject()
   * 
   * @param s
   * @param identity when 'true', includes Java's identityHash for the object
   *            in the output.
   * @return a non reabable string (i.e. one enclosed in the #< > markers)
   */
  public abstract String unreadableString(String s, boolean identity);

  // Special operator
  public abstract LispObject execute(LispObject args, Environment env);

  public abstract LispObject execute();

  public abstract LispObject execute(LispObject arg);

  public abstract LispObject execute(LispObject first, LispObject second);

  public abstract LispObject execute(LispObject first, LispObject second,
                            LispObject third);

  public abstract LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth);

  public abstract LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth);

  public abstract LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth);

  public abstract LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth,
                            LispObject seventh);

  public abstract LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth,
                            LispObject seventh, LispObject eighth);

  public abstract LispObject execute(LispObject[] args);

  // Used by COMPILE-MULTIPLE-VALUE-CALL.
  public abstract LispObject dispatch(LispObject[] args);

  public abstract int intValue();

  public abstract long longValue();

  public abstract float floatValue();

  public abstract double doubleValue();

  public abstract LispObject incr();

  public abstract LispObject decr();

  public abstract LispObject negate();

  public abstract LispObject add(int n);

  public abstract LispObject add(LispObject obj);

  public abstract LispObject subtract(int n);

  public abstract LispObject subtract(LispObject obj);

  public abstract LispObject multiplyBy(int n);

  public abstract LispObject multiplyBy(LispObject obj);

  public abstract LispObject divideBy(LispObject obj);

  public abstract boolean isEqualTo(int n);

  public abstract boolean isEqualTo(LispObject obj);

  public abstract LispObject IS_E(LispObject obj);

  public abstract boolean isNotEqualTo(int n);

  public abstract boolean isNotEqualTo(LispObject obj);

  public abstract LispObject IS_NE(LispObject obj);

  public abstract boolean isLessThan(int n);

  public abstract boolean isLessThan(LispObject obj);

  public abstract LispObject IS_LT(LispObject obj);

  public abstract boolean isGreaterThan(int n);

  public abstract boolean isGreaterThan(LispObject obj);

  public abstract LispObject IS_GT(LispObject obj);

  public abstract boolean isLessThanOrEqualTo(int n);

  public abstract boolean isLessThanOrEqualTo(LispObject obj);

  public abstract LispObject IS_LE(LispObject obj);

  public abstract boolean isGreaterThanOrEqualTo(int n);

  public abstract boolean isGreaterThanOrEqualTo(LispObject obj);

  public abstract LispObject IS_GE(LispObject obj);

  public abstract LispObject truncate(LispObject obj);

  public abstract LispObject MOD(LispObject divisor);

  public abstract LispObject MOD(int divisor);

  public abstract LispObject ash(int shift);

  public abstract LispObject ash(LispObject obj);

  public abstract LispObject LOGNOT();

  public abstract LispObject LOGAND(int n);

  public abstract LispObject LOGAND(LispObject obj);

  public abstract LispObject LOGIOR(int n);

  public abstract LispObject LOGIOR(LispObject obj);

  public abstract LispObject LOGXOR(int n);

  public abstract LispObject LOGXOR(LispObject obj);

  public abstract LispObject LDB(int size, int position);

  public abstract int sxhash();

  // For EQUALP hash tables.
  public abstract int psxhash();

  public abstract int psxhash(int depth);

  public abstract LispObject STRING();

  public abstract char[] chars();

  public abstract char[] getStringChars();

  /** Returns a string representing the value
   * of a 'string designator', if the instance is one.
   *
   * Throws an error if the instance isn't a string designator.
   */
  public abstract String getStringValue();

  public abstract LispObject getSlotValue_0();

  public abstract LispObject getSlotValue_1();

  public abstract LispObject getSlotValue_2();

  public abstract LispObject getSlotValue_3();

  public abstract LispObject getSlotValue(int index);

  public abstract int getFixnumSlotValue(int index);

  public abstract boolean getSlotValueAsBoolean(int index);

  public abstract void setSlotValue_0(LispObject value);

  public abstract void setSlotValue_1(LispObject value);

  public abstract void setSlotValue_2(LispObject value);

  public abstract void setSlotValue_3(LispObject value);

  public abstract void setSlotValue(int index, LispObject value);

  public abstract LispObject SLOT_VALUE(LispObject slotName);

  public abstract void setSlotValue(LispObject slotName, LispObject newValue);

  // Profiling.
  public abstract int getCallCount();

  public abstract void setCallCount(int n);

  public abstract void incrementCallCount();

  public abstract int getHotCount();

  public abstract void setHotCount(int n);

  public abstract void incrementHotCount();
}
