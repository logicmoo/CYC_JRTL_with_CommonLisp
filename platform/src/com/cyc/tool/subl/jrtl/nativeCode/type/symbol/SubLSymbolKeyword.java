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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.util.SubLFiles.VariableAccessMode;

//// External Imports

public class SubLSymbolKeyword extends AbstractSubLSymbol implements SubLSymbol {

	//// Constructors

	public static String SYMBOL_TYPE_NAME = "SYMBOL";

	/**
	 * Creates a new instance of SubLSymbol. symbolName must already be
	 * canonicalized before calling this constructor SubLPackage are allowed to
	 * use this constructor.
	 */
	SubLSymbolKeyword(String symbolName) {
		super(SubLObjectFactory.makeString(symbolName), SubLPackage.KEYWORD_PACKAGE);
	}

	//// Public Area

	/**
	 * Creates a new instance of SubLSymbol. symbolName must already be
	 * canonicalized before calling this constructor SubLPackage are allowed to
	 * use this constructor.
	 */
	SubLSymbolKeyword(SubLString symbolName) {
		super(symbolName, SubLPackage.KEYWORD_PACKAGE);
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Keyword: " + this + " cannot be dynamically bound.");
	}

	public void bind(SubLObject newValue, SubLThread thread) {
		Errors.error("Keyword: " + this + " cannot be dynamically bound.");
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		return Errors.error("Keyword: " + this + " does not have a dynamic binding.");
	}

	public SubLObject currentBinding(SubLThread thread) {
		return Errors.error("Keyword: " + this + " does not have a dynamic binding.");
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	public void forceGlobalValue(SubLObject newValue) {
		Errors.error("Cannot set the value of keyword: " + this + ".");
	}

	public int getBindingId() {
		return SubLSymbol.INVALID_BINDING_INDEX;
	}

	public SubLObject getDynamicValue() {
		Errors.error(this + " is not boundp.");
		return null;
	}

	public SubLObject getDynamicValue(SubLObject[] bindings) {
		return Errors.error(this + " is not boundp.");
	}

	public SubLObject getDynamicValue(SubLThread thread) {
		return Errors.error(this + " is not boundp.");
	}

	public SubLObject getGlobalValue() {
		Errors.error(this + " is not boundp.");
		return null;
	}

	public SubLObject getValue() {
		return this;
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
		return true;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isDynamic() {
		return false;
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
		return true;
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
		return true;
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
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Keyword: " + this + " cannot be dynamically rebound.");
	}

	public void rebind(SubLObject oldValue, SubLThread thread) {
		Errors.error("Keyword: " + this + " cannot be dynamically rebound.");
	}

	public void setAccessMode(VariableAccessMode accessMode) {
	}

	public void setDynamicValue(SubLObject value) {
		Errors.error("Can't change the value of keyword symbol: " + this);
	}

	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't change the value of keyword symbol: " + this);
	}

	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't change the value of keyword symbol: " + this);
	}

	public void setGlobalValue(SubLObject value) {
		Errors.error("Can't change the value of keyword symbol: " + this);
	}

	public void setValue(SubLObject value) {
		Errors.error("Can't change the value of keyword symbol: " + this);
	}

	/** Method created to avoid casting */
	public SubLSymbol toSymbol() {
		return this;
	}

	public String toTypeName() {
		return SubLSymbolKeyword.SYMBOL_TYPE_NAME;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

}
