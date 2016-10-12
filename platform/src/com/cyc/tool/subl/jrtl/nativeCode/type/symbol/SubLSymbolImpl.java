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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.util.SubLFiles.VariableAccessMode;

public class SubLSymbolImpl extends AbstractSubLSymbol implements SubLSymbol {

	//// Constructors

	public static String SYMBOL_TYPE_NAME = "SYMBOL";

	private static int idCounter = 0;

	//// Public Area

	private int id = SubLSymbol.INVALID_BINDING_INDEX; // this should probably
														// be volatile
	// -APB

	private VariableAccessMode accessModeVar = VariableAccessMode.UNDECLARED; // this
																				// should
																				// probably
																				// be
																				// volatile
																				// -APB

	private SubLObject constantValue = SubLSymbol.UNBOUND;

	/**
	 * Creates a new instance of SubLSymbol. symbolName must already be
	 * canonicalized before calling this constructor SubLPackage are allowed to
	 * use this constructor.
	 */
	SubLSymbolImpl(String symbolName, SubLPackage thePackage) {
		super(SubLObjectFactory.makeString(symbolName), thePackage);
	}

	/**
	 * Creates a new instance of SubLSymbol. symbolName must already be
	 * canonicalized before calling this constructor SubLPackage are allowed to
	 * use this constructor.
	 */
	SubLSymbolImpl(SubLString symbolName, SubLPackage thePackage) {
		super(symbolName, thePackage);
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		bindings[this.id] = newValue;
	}

	public void bind(SubLObject newValue, SubLThread thread) {
		thread.bindingsList[this.id] = newValue;
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		return bindings[this.id];
	}

	public SubLObject currentBinding(SubLThread thread) {
		return thread.bindingsList[this.id];
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this.getValue();
	}

	public void forceGlobalValue(SubLObject newValue) {
		if (this.isConstantSymbol())
			this.constantValue = newValue;
		else
			this.value = newValue;
	}

	public int getBindingId() {
		return this.id;
	}

	protected SubLSymbol getBindingType() {
		return this.accessModeVar.toSymbol();
	}

	public SubLObject getDynamicValue() {
		Thread th = Thread.currentThread();

		SubLObject result = ((SubLThread) th).bindingsList[this.id];
		if (result != SubLSymbol.UNBOUND)
			return result;
		result = this.value; // avoid multiple references to value since it is
		// volatile
		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
	}

	public SubLObject getDynamicValue(SubLObject[] bindings) {
		SubLObject result = bindings[this.id];
		if (result != SubLSymbol.UNBOUND)
			return result;
		result = this.value; // avoid multiple references to value since it is
		// volatile
		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
	}

	public SubLObject getDynamicValue(SubLThread thread) {
		SubLObject result = thread.bindingsList[this.id];
		if (result != SubLSymbol.UNBOUND)
			return result;
		result = this.value; // avoid multiple references to value since it is
		// volatile
		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
	}

	public SubLObject getGlobalValue() {
		SubLObject result = this.isConstantSymbol() ? this.constantValue : this.value;
		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
	}

	public SubLObject getUndeclaredValue() {
		SubLObject result = SubLEnvironment.currentEnvironment().lookupBinding(this);
		if (result != SubLSymbol.UNBOUND)
			return result;
		result = this.value; // avoid multiple references to value since it is
		// volatile
		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
	}

	public SubLObject getValue() {
		if (this.accessModeVar == VariableAccessMode.UNDECLARED)
			return this.getUndeclaredValue();
		else if (this.accessModeVar == VariableAccessMode.DYNAMIC)
			return this.getDynamicValue();
		else
			return this.getGlobalValue();
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
		return this.accessModeVar == VariableAccessMode.CONSTANT;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isDynamic() {
		return this.accessModeVar == VariableAccessMode.DYNAMIC;
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
		return this.operator != null && this.operator.isFunction();
	}

	public boolean isGlobal() {
		return this.accessModeVar == VariableAccessMode.LEXICAL || this.accessModeVar == VariableAccessMode.CONSTANT;
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

	/*public boolean isKeyword() {
		return false;
	}*/

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
		return this.operator != null && this.operator.isMacroOperator();
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
		return this.accessModeVar == VariableAccessMode.UNDECLARED;
	}

	public boolean isVector() {
		return false;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		bindings[this.id] = oldValue;
	}

	public void rebind(SubLObject oldValue, SubLThread thread) {
		thread.bindingsList[this.id] = oldValue;
	}

	public synchronized void setAccessMode(VariableAccessMode accessMode) {
		if (accessMode == null)
			Errors.error("Cannot set symbol access mode to null on symbol: " + this);
		// this is to protect idCounter and to ensure that accessModeVar gets
		// set after id
		synchronized (SubLSymbolImpl.class) {
			if (accessMode == VariableAccessMode.DYNAMIC) {
				if (this.id == SubLSymbol.INVALID_BINDING_INDEX)
					this.id = SubLSymbolImpl.idCounter++;
			} else
				this.id = SubLSymbol.INVALID_BINDING_INDEX;
		}
		this.accessModeVar = accessMode;
	}

	public void setDynamicValue(SubLObject newValue) {
		SubLObject[] bindings = ((SubLThread) Thread.currentThread()).bindingsList;
		if (bindings[this.id] != SubLSymbol.UNBOUND)
			bindings[this.id] = newValue;
		else
			this.value = newValue;
	}

	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		if (bindings[this.id] != SubLSymbol.UNBOUND)
			bindings[this.id] = newValue;
		else
			this.value = newValue;
	}

	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		SubLObject[] bindings = thread.bindingsList;
		if (bindings[this.id] != SubLSymbol.UNBOUND)
			bindings[this.id] = newValue;
		else
			this.value = newValue;
	}

	//// Protected Area

	public void setGlobalValue(SubLObject newValue) {
		// @todo consider uncommenting the following
		// if (isConstantSymbol()) {
		// Errors.error("Can't set the value of constant symbol: " + this);
		// }
		this.value = newValue;
	}

	//// Private Area

	//// Internal Rep

	public void setUndeclaredValue(SubLObject newValue) {
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		env.setBinding(this, newValue);
	}

	public void setValue(SubLObject value) {
		if (this.accessModeVar == VariableAccessMode.DYNAMIC)
			this.setDynamicValue(value);
		else if (this.accessModeVar == VariableAccessMode.LEXICAL)
			this.setGlobalValue(value);
		else if (this.accessModeVar == VariableAccessMode.CONSTANT)
			Errors.error("Can't set the value of constant symbol: " + this);
		else if (this.accessModeVar == VariableAccessMode.UNDECLARED)
			this.setUndeclaredValue(value);
		else
			Errors.error("Don't know about access mode: " + this.accessModeVar);
	}

	/** Method created to avoid casting */
	public SubLSymbol toSymbol() {
		return this;
	}

	public String toTypeName() {
		return SubLSymbolImpl.SYMBOL_TYPE_NAME;
	}

}
