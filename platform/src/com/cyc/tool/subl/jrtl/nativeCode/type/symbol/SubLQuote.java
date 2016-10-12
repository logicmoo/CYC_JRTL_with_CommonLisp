/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles.VariableAccessMode;

//// External Imports

/**
 * <P>
 * SubLQuote is designed to to be a temporary hack until we get the JRTL
 * bootstrapped, then it should be removed.
 *
 * <P>
 * Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved. <BR>
 * This software is the proprietary information of Cycorp, Inc.
 * <P>
 * Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 10, 2005, 7:44 PM
 * @version $Id: SubLQuote.java 126764 2009-01-07 22:27:23Z tbrussea $
 */
final public class SubLQuote extends AbstractSubLObject implements SubLObject, SubLSymbol {

	public static SubLQuote QUOTE_SYMBOL = new SubLQuote("SUBLISP", "QUOTE", "'");

	//// Constructors

	public static SubLQuote BACK_QUOTE_SYMBOL = new SubLQuote("SUBLISP", "BACKQUOTE", "`");

	//// Public Area

	public static SubLQuote UNQUOTE_SYMBOL = new SubLQuote("SUBLISP", "UNQUOTE", ",");

	public static SubLQuote SPLICING_UNQUOTE_SYMBOL = new SubLQuote("SUBLISP", "SPLICING-UNQUOTE", ",@");

	public static SubLQuote FUNCTION_QUOTE_SYMBOL = new SubLQuote("SUBLISP", "FUNCTION", "#'");
	public static String QUOTE_TYPE_NAME = "QUOTE";

	public static String uniqueQuoteName(String packageName, String symbolName, String alternateRep) {
		String lookupName = packageName + ":" + symbolName + " (" + alternateRep + ")";
		return lookupName;
	}

	private SubLSymbol symbol;
	private SubLSymbol alternateSymbol;

	/** Creates a new instance of SubLQuote. */
	// @todo swap packageName, symbolName arg order
	private SubLQuote(String packageName, String symbolName, String alternateRep) {
		this.symbol = SubLObjectFactory.makeSymbol(symbolName, packageName);
		this.alternateSymbol = SubLObjectFactory.makeSymbol(alternateRep, packageName);
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		this.symbol.bind(newValue, bindings);
	}

	public void bind(SubLObject newValue, SubLThread thread) {
		this.symbol.bind(newValue, thread);
	}

	public boolean boundp() {
		return this.symbol.boundp();
	}

	public boolean canFastHash() {
		return true;
	}

	public Object clone() {
		return this;
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		return this.symbol.currentBinding(bindings);
	}

	public SubLObject currentBinding(SubLThread thread) {
		return this.symbol.currentBinding(thread);
	}

	public boolean equals(Object obj) {
		return this.symbol.equals(obj);
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		throw new InvalidSubLExpressionException(
				"Error: Attempt to take the " + "value of the unbound variable '" + this + "'.");
	}

	public boolean fboundp() {
		return this.symbol.fboundp();
	}

	public void forceGlobalValue(SubLObject newValue) {
		this.symbol.forceGlobalValue(newValue);
	}

	public SubLSymbol getAlternateSymbol() {
		return this.alternateSymbol;
	}

	public int getBindingId() {
		return this.symbol.getBindingId();
	}

	public SubLObject getDynamicValue() {
		return this.symbol.getDynamicValue();
	}

	public SubLObject getDynamicValue(SubLObject[] bindings) {
		return this.symbol.getDynamicValue(bindings);
	}

	public SubLObject getDynamicValue(SubLThread thread) {
		return this.symbol.getDynamicValue(thread);
	}

	public SubLFunction getFunc() {
		return this.symbol.getFunc();
	}

	public SubLOperator getFunction() {
		return this.symbol.getFunction();
	}

	public SubLObject getGlobalValue() {
		return this.symbol.getGlobalValue();
	}

	public String getName() {
		return this.symbol.getName();
	}

	public SubLPackage getPackage() {
		return this.symbol.getPackage();
	}

	public SubLList getPlist() {
		return this.symbol.getPlist();
	}

	public SubLObject getProperty(SubLObject indicator) {
		return this.symbol.getProperty(indicator);
	}

	public SubLString getSubLName() {
		return this.symbol.getSubLName();
	}

	public SubLSymbol getSymbol() {
		return this.symbol;
	}

	public SubLSymbol getType() {
		return Types.$dtp_symbol$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_INTEGER;
	}

	public SubLObject getValue() {
		return this.symbol.getValue();
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.symbol.hashCode(currentDepth + 1);
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}


	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isConstantSymbol() {
		return this.symbol.isConstantSymbol();
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isDynamic() {
		return this.symbol.isDynamic();
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGlobal() {
		return this.symbol.isGlobal();
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return true;
	}

	public boolean isUndeclared() {
		return this.symbol.isUndeclared();
	}

	public boolean isVector() {
		return false;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		this.symbol.rebind(oldValue, bindings);
	}

	public void rebind(SubLObject oldValue, SubLThread thread) {
		this.symbol.rebind(oldValue, thread);
	}

	public void removeProperty(SubLObject indicator) {
		this.symbol.removeProperty(indicator);
	}

	public void setAccessMode(VariableAccessMode accessMode) {
		this.symbol.setAccessMode(accessMode);
	}

	public void setConstantValue(SubLObject value) {
		this.symbol.setConstantValue(value);
	}

	public void setDynamicValue(SubLObject value) {
		this.symbol.setDynamicValue(value);
	}

	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		this.symbol.setDynamicValue(newValue, bindings);
	}

	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		this.symbol.setDynamicValue(newValue, thread);
	}

	public void setFunction(SubLOperator func) {
		this.symbol.setFunction(func);
	}

	public void setGlobalValue(SubLObject value) {
		this.symbol.setGlobalValue(value);
	}

	public void setPackage(SubLPackage thePackage) {
		Errors.error("Can't set package on symbol: " + this.getName());
	}

	public void setProperty(SubLObject indicator, SubLObject value) {
		this.symbol.setProperty(indicator, value);
	}

	public void setValue(SubLObject value) {
		this.symbol.setValue(value);
	}

	public String toString() {
		return this.symbol.toString();
	}

	/** Method created to avoid casting */
	public SubLSymbol toSymbol() {
		return this.symbol;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String toTypeName() {
		return SubLQuote.QUOTE_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

}
