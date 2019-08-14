/*
 * Symbol.java
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
package com.cyc.tool.subl.util;

import static org.armedbear.lisp.Lisp.NIL;
import static org.armedbear.lisp.Lisp.T;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.Symbol;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols_KW;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

public class ObjectMerger {

    /**
     * TODO Describe the purpose of this method.
     * @param symtrace
     * @param value2
     * @param newValue
     * @param forced
     * @return
     */
    public static SubLObject mergeValues(Symbol symtrace, SubLObject newValue, SubLObject oldValue, boolean forced) {
	if (newValue == oldValue)
	    return oldValue;
	final SubLObject origOldValue = oldValue;

	final int valueless = valueless(oldValue);
	if (valueless < 1) {
	    symtrace.notifyChange("setGlobalValue", newValue, oldValue);
	    symtrace.setTLValue(newValue);
	    return newValue;
	}
	if (newValue == null) {
	    if (symtrace.isTraced == 0)
		symtrace.isTraced = 1;
	    Errors.warn("Setting NULL? " + symtrace);
	    return oldValue;
	} else if (newValue.equal(oldValue)) {
	    return oldValue;
	}

	final int valuelessNew = valueless(newValue);
	if (valuelessNew < 1) {
	    symtrace.notifyChange("NOT installingUnderlay ", newValue, oldValue);
	    return oldValue;
	}

	final boolean wasSymbol = oldValue.isSymbol();
	if (wasSymbol && !newValue.isSymbol()) {
	    symtrace.notifyChange("setGlobalValue", newValue, oldValue);
	    symtrace.setTLValue(newValue);
	    return newValue;
	}

	if (newValue.isCons() && oldValue.isCons()) {
	    String OldToString = valueOfString(oldValue);
	    String AddToString = valueOfString(newValue);
	    int oldSize = oldValue.toCons().consLength();
	    int newSize = newValue.toCons().consLength();
	    if (oldSize == newSize && newValue.equalp(oldValue)) {
		oldValue.setFirst(newValue.first());
		oldValue.setRest(newValue.rest());
		return oldValue;
	    }
	    if (oldSize + newSize > 100) {
		symtrace.notifyChange("SHOULD HAVE installingUnderlay ", newValue, oldValue);
	    }
	    if (oldSize < newSize) {
		SubLObject swap = newValue;
		newValue = oldValue;
		oldValue = swap;
		int swapInt = newSize;
		newSize = oldSize;
		oldSize = swapInt;
	    }
	    SubLObject modOld = oldValue;

	    for (SubLObject item : newValue.toCons().toSubLObjectArray()) {
		final LispObject lispObject = item.toLispObject();
		modOld = Sequences.delete(lispObject, modOld, Symbol.EQUAL, NIL, Fixnum.ZERO, NIL, Fixnum.ONE);
	    }
	    if (modOld == NIL) {
		origOldValue.setFirst(newValue.first());
		origOldValue.setRest(newValue.rest());
		return origOldValue;
	    }
	    if (oldValue != modOld)
		oldValue = modOld;
	    // ConsesLow.nconc(value, newValue);
	    SubLObject lastCDR = oldValue;
	    while (lastCDR.rest().isCons()) {
		lastCDR = lastCDR.rest();
	    }
	    lastCDR.setRest(newValue);
	    String NewToString = valueOfString(oldValue);
	    if (!NewToString.contentEquals(OldToString)) {
		notifyChange("UPDATE ", symtrace.toDebugString(false), NewToString, " Adding: " + AddToString + " + " + OldToString, true);
		SystemCurrent.originalSystemErr.println("FOR: " + symtrace.getQualifiedName());
	    }
	    return oldValue;
	}
	if (newValue.isHashtable() && oldValue.isHashtable()) {
	    int oldSize = oldValue.size();
	    int newSize = newValue.size();
	    if (oldSize < newSize) {
		SubLObject swap = newValue;
		newValue = oldValue;
		oldValue = swap;
		int swapInt = newSize;
		newSize = oldSize;
		oldSize = swapInt;
	    }
	    final SubLHashtable oldMap = oldValue.toHashtable();
	    final SubLHashtable newMap = newValue.toHashtable();
	    HashMap<SubLHashtableKeyEntry, SubLObject> oldHT = oldMap.hash;
	    HashMap<SubLHashtableKeyEntry, SubLObject> newHT = newMap.hash;
	    if (oldSize + newSize > 100) {
		symtrace.notifyChange("SHOULD HAVE installingUnderlay ", newValue, oldValue);
	    }
	    if (oldSize == newSize) {
		if (newValue.equalp(oldValue)) {
		    oldMap.hash = oldHT;
		    newMap.hash = oldHT;
		    return oldValue;
		}
	    }
	    for (Map.Entry<SubLHashtableKeyEntry, SubLObject> kv : newHT.entrySet()) {
		final SubLHashtableKeyEntry newK = kv.getKey();
		final SubLObject newV = kv.getValue();
		final SubLObject oldV = oldHT.get(newK);
		if (oldV == null) {
		    oldHT.put(newK, newV);
		} else {
		    final SubLObject mergeValues = ObjectMerger.subMergeValues("HashMap " + newK, symtrace, newV, oldV, forced);
		    if (mergeValues != oldV) {
			oldHT.put(newK, mergeValues);
		    }
		    if (mergeValues != newV) {
			newHT.put(newK, mergeValues);
		    }
		}

	    }
	    oldMap.hash = oldHT;
	    newMap.hash = oldHT;
	    return oldMap;
	}

	Class cOld = oldValue.getClass();
	Class cNew = newValue.getClass();
	if (cNew == SubLT.class) {
	    cNew = Symbol.class;
	}
	if (cOld == SubLT.class) {
	    cOld = Symbol.class;
	}
	Class cOld1 = ObjectMerger.assignableClass(cOld, cOld);
	Class cNew1 = ObjectMerger.assignableClass(cNew, cNew);

	while (true) {
	    if (newValue.isStructure() || oldValue.isStructure()) {
		if ((symtrace.isTraced == 0 || symtrace.isTraced == 1) && forced) {
		    symtrace.isTraced = 2;
		    if (cOld == cNew) {
			SubLStruct newV = newValue.toStruct();//.toLispObject();
			SubLStruct oldV = oldValue.toStruct();//.toLispObject();
			int len = newV.getFieldCount();
			int oldLoss = 0;
			int newLoss = 0;
			SubLObject[] newValues = new SubLObject[len];
			for (int newK = 2; newK < len; newK++) {
			    SubLObject oldE = oldV.getField(newK);
			    SubLObject newE = newV.getField(newK);
			    final SubLObject mergeValues = newValues[newK] = ObjectMerger.subMergeValues(cNew + " " + newK, symtrace, newE, oldE, forced);
			    if (mergeValues != oldE) {
				oldLoss++;
			    }
			    if (mergeValues != newE) {
				newLoss++;
			    }
			}
			if (oldLoss == 0 && newLoss == 0) {
			    break;
			} else if (newLoss == 0) {

			} else if (oldLoss == 0) {

			}
			for (int newK = 2; newK < len; newK++) {
			    SubLObject oldE = oldV.getField(newK);
			    SubLObject newE = newV.getField(newK);
			    SubLObject mergeValues = newValues[newK];
			    if (mergeValues != oldE) {
				oldV.setField(newK, mergeValues);
			    }
			    if (mergeValues != newE) {
				newV.setField(newK, mergeValues);
			    }
			}

		    }
		}
	    }
	    if (cOld1 != cNew1) {

		if (!cNew1.isAssignableFrom(cOld1) && !cOld1.isAssignableFrom(cNew)) {
		    symtrace.notifyChange("Changing class??!?!? ", newValue, oldValue);
		} else {
		    symtrace.notifyChange("Changing class ", newValue, oldValue);
		}
		if (symtrace.isTraced == 0) {
		    symtrace.isTraced = 1;
		}
	    } else if (newValue.isString() || newValue.isNumber()) {
		symtrace.notifyChange("SHOULD HAVE installingUnderlay ", newValue, oldValue);
	    }
	    break;
	    // notifyChange(newValue, value);
	}
	if (!forced) {
	    symtrace.notifyChange("UNCHANGED: ", newValue, oldValue);
	    return oldValue;
	} else {
	    symtrace.notifyChange("FORCED: ", newValue, oldValue);
	    //symtrace.setTLValue(newValue);
	    return newValue;
	}
    }

    /**
     * TODO Describe the purpose of this method.
     * @param oldValue
     * @return
     */
    private static String valueOfString(SubLObject oldValue) {
	return Lisp.valueOfString(oldValue);
    }

    /**
     * TODO Describe the purpose of this method.
     * @param cOld
     * @return
     */
    public static Class assignableClass(Class cOld, Class elseC) {
	Class[] infaces = cOld.getInterfaces();
	if (infaces != null && infaces.length > 1) {
	    for (Class c : infaces) {
		if (SubLObject.class.isAssignableFrom(c))
		    return c;
	    }
	}
	Class cOld1 = cOld.getSuperclass();
	if (cOld1 != Object.class && cOld1 != Lisp.class && cOld1 != LispObject.class && cOld1 != SubLObject.class) {
	    return assignableClass(cOld1, cOld);
	}
	return elseC;
    }

    /**
     * TODO Describe the purpose of this method.
     * @param symtrace
     * @param forced
     * @param newV
     * @param oldV
     * @return
     */
    public static SubLObject subMergeValues(String why, Symbol symtrace, final SubLObject newV, final SubLObject oldV, boolean forced) {
	final boolean newSymtrace = Symbol.SYM_TRACE != symtrace;
	if (newSymtrace) {
	    if (why != null) {
		Symbol.SYM_TRACE.name = new SimpleString(why + " " + symtrace.name);
	    } else {
		Symbol.SYM_TRACE.name = symtrace.name;
	    }
	    Symbol.SYM_TRACE.subLID = symtrace.subLID;
	    Symbol.SYM_TRACE.accessModeVar = symtrace.accessModeVar;
	    Symbol.SYM_TRACE.function = symtrace.function;
	    Symbol.SYM_TRACE.setPackage(symtrace.getPackage());
	    Symbol.SYM_TRACE.value = symtrace.value;
	    Symbol.SYM_TRACE.isTraced = symtrace.isTraced;
	}
	final SubLObject mergeValues = mergeValues(Symbol.SYM_TRACE, newV, oldV, forced);
	if (newSymtrace) {
	    symtrace.isTraced = Symbol.SYM_TRACE.isTraced;
	}
	return mergeValues;
    }

    /**
     * TODO Describe the purpose of this method.
     * @param sym
     * @return
     */
    public static boolean tooSimpleValue(SubLObject value) {
	if (value == null)
	    return true;
	if (value.isNumber())
	    return true;
	if (value.isString())
	    return true;
	return valueless(value) < 100;
    }

    /**
     * TODO Describe the purpose of this method.
     * @return
     */
    public static int valueless(SubLObject value) {
	if (value == null)
	    return -1;
	if (value == NIL || value == CommonSymbols_KW.$UNINITIALIZED //
		|| value == CommonSymbols_KW.$UNSET || value == CommonSymbols_KW.$RESET)
	    return 0;
	if (value == T)
	    return 1;
	if (value instanceof Symbol) {
	    Symbol sym = (Symbol) value;
	    int size = sym.attributeSize();
	    if (!sym.isKeyword())
		size++;
	    if (sym.boundp())
		size++;
	    if (sym.boundp_at_all())
		size++;
	    if (sym.fboundp())
		size++;
	    if (sym.getPlist() != NIL)
		size++;
	    return size;
	}
	if (value.isNumber()) {
	    final int numSize = value.getNumSize();
	    return numSize + 2;
	}
	if (value.isString())
	    return 3;
	if (value instanceof Cons)
	    return 3 + value.size();
	if (value.isHashtable())
	    return 100 + value.toHashtable().getSize();
	if (value.isSequence())
	    return 200 + value.size();
	if (value.isStructure()) {
	    return 200 + value.toStruct().getFieldCount() * 100;
	}
	final String string2 = "" + value;
	return 300 + string2.length();

    }

    static public void notifyChange(String prefix, Object symbolString, Object newValue, Object oldValue, boolean ownLines) {

	if (!prefix.endsWith(" ")) {
	    prefix = prefix + " ";
	}
	if (symbolString instanceof Symbol) {
	    symbolString = ((Symbol) symbolString).getQualifiedName();
	} else {
	    symbolString = String.valueOf(symbolString);
	}

	final String NewToString = Lisp.valueOfString(newValue, false, Lisp.insideToString, newValue);
	final String OldToString = Lisp.valueOfString(oldValue, false, Lisp.insideToString, oldValue);

	final PrintStream debugIO = SystemCurrent.originalSystemErr;
	if (ownLines || needOwnLines(NewToString) || needOwnLines(OldToString)) {
	    debugIO.println("[ " + prefix);
	    debugIO.println("      " + "OLD: " + OldToString);
	    debugIO.println("      " + "NEW: " + NewToString);
	    debugIO.println(" FOR:  " + symbolString + " ]");
	} else {
	    String msg = prefix + " FOR " + symbolString + " TO <<<< " + NewToString + " >>>>   (was: " + oldValue + ")";
	    debugIO.println(msg);
	}
	// ( new Exception( msg ) ).printStackTrace( SystemCurrent.originalSystemErr
	// );
    }

    /**
     * TODO Describe the purpose of this method.
     * @param newToString
     * @return
     */
    private static boolean needOwnLines(String newToString) {
	return newToString.contains("(") || newToString.contains("\n");
    }
}
