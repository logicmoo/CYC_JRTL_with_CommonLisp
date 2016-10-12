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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

//// External Imports
import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLEnvironment extends AbstractSubLObject {

	private static class EnvironmentBinding {
		private SubLSymbol var;

		private SubLObject value;

		// @todo consider merging with BindingState.Binding
		EnvironmentBinding(SubLSymbol var, SubLObject value) {
			this.var = var;
			this.value = value;
		}

		SubLObject getValue() {
			return this.value;
		}

		SubLSymbol getVar() {
			return this.var;
		}

		void setValue(SubLObject value) {
			this.value = value;
		}

	}

	//// Constructors

	private static SubLEnvironment defaultEnvironment = new SubLEnvironment(null);

	static {
		SubLEnvironment.noteDefaultBindings();
	}

	//// Public Area

	public static SubLEnvironment currentEnvironment() {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (thread.env != null)
			return thread.env;
		return SubLEnvironment.defaultEnvironment;
	}

	public static SubLEnvironment getDefaultEnvironment() {
		return SubLEnvironment.defaultEnvironment;
	}

	private static void noteDefaultBindings() {
	}

	public static void setCurrentEnvironment(SubLEnvironment env) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.env = env;
	}

	private SubLEnvironment outerEnvironment;

	private ArrayList<EnvironmentBinding> bindingStack = new ArrayList<EnvironmentBinding>();

	/**
	 * Creates a new instance of SubLEnvironment.
	 */
	private SubLEnvironment() {
		this(SubLEnvironment.defaultEnvironment);
	}

	private SubLEnvironment(SubLEnvironment outerEnv) {
		this.outerEnvironment = outerEnv;
	}

	public boolean canFastHash() {
		return true;
	}

	public SubLEnvironment extend() {
		SubLEnvironment extendedEnv = new SubLEnvironment(this);
		SubLProcess.currentSubLThread().env = extendedEnv;
		return extendedEnv;
	}

	public SubLPackage getCurrentPackage() {
		return SubLPackage.getCurrentPackage();
	}

	public SubLEnvironment getOuterEnvironment() {
		return this.outerEnvironment;
	}

	public int hashCode(int currentDepth) {
		return super.superHash();
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

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return true;
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
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLObject lookupBinding(SubLSymbol var) {
		if (!var.isUndeclared())
			Errors.error("Illegal call of lookupBinding on declared symbol: " + var);
		// first try scanning through this environment
		for (int i = 0, size = this.bindingStack.size(); i < size; i++) {
			EnvironmentBinding currentBinding = this.bindingStack.get(i);
			if (currentBinding.getVar() == var)
				return currentBinding.getValue();
		}

		// then try scanning the outer environments
		if (this.outerEnvironment == null)
			return var.getGlobalValue();
		else
			return this.outerEnvironment.lookupBinding(var);
	}

	//// Protected Area

	//// Private Area

	public SubLObject noteBinding(SubLSymbol var, SubLObject newValue) {
		if (var.isDynamic()) {
			SubLObject oldValue = var.currentBinding(SubLProcess.currentSubLThread().bindingsList);
			var.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
			return oldValue;
		} else if (var.isGlobal())
			return Errors.error("Illegal attempt to dynamically bind a global symbol: " + var);
		else {
			if (this == SubLEnvironment.defaultEnvironment)
				// The outermost environment must be immutable or we have to
				// worry about synchronization issues. -APB
				Errors.error("Illegal ttempt to modify ther outermost environment.");
			EnvironmentBinding varBinding = new EnvironmentBinding(var, newValue); // @todo
																					// resource
																					// these!!!!!!!!!!
																					// -APB
			this.bindingStack.add(varBinding);
			return null;
		}
	}

	public void setBinding(SubLSymbol var, SubLObject value) {
		if (var.isDynamic()) {
			var.setDynamicValue(value);
			return;
		} else if (var.isGlobal()) {
			var.setGlobalValue(value);
			return;
		}
		// first try scanning through this environment
		for (int i = 0, size = this.bindingStack.size(); i < size; i++) {
			EnvironmentBinding currentBinding = this.bindingStack.get(i);
			if (currentBinding.getVar() == var) {
				currentBinding.setValue(value);
				return;
			}
		}

		// then try scanning the outer environments
		if (this.outerEnvironment == null) {
			if (var.isConstantSymbol())
				Errors.error("Can't set the value of constant symbol: " + this);
			var.forceGlobalValue(value);
		} else
			this.outerEnvironment.setBinding(var, value);
	}

	//// Internal Rep

	/** Method created to avoid casting */
	public SubLEnvironment toEnv() { // SubLEnvironment
		return this;
	}

	public String toTypeName() {
		return "ENVIRONMENT";
	}

	public void unextend() {
		if (this.outerEnvironment != null) {
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.env = this.outerEnvironment;
		} else
			Errors.error("Illegal attempt to reclaim base enviroment.");
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

}
