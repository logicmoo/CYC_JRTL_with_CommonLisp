//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;

import org.armedbear.lisp.Environment;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

abstract public class SubLEnvironment extends FromSubLisp {

	@Override
	public Environment toLispObject() {
		return (Environment)this;
	}

	private static class EnvironmentBinding {
		EnvironmentBinding(SubLSymbol var, SubLObject value) {
			this.var = var;
			this.value = value;
		}

		private SubLSymbol var;
		private SubLObject value;

		SubLObject getValue() {
			return value;
		}

		SubLSymbol getVar() {
			return var;
		}

		void setValue(SubLObject value) {
			this.value = value;
		}
	}

	private SubLEnvironment() {
		this(SubLEnvironment.defaultEnvironment);
	}

	protected SubLEnvironment(SubLEnvironment outerEnv) {
		bindingStack = new ArrayList<EnvironmentBinding>();
		outerEnvironment = outerEnv;
	}

	private static void noteDefaultBindings() {
	}

	public static SubLEnvironment currentEnvironment() {
		SubLThread thread = SubLProcess.currentSubLThreadOrNull();
		if (thread!=null && thread.env != null)
			return thread.env;
		return SubLEnvironment.defaultEnvironment;
	}

	public static SubLEnvironment getDefaultEnvironment() {
		return SubLEnvironment.defaultEnvironment;
	}

	public static void setCurrentEnvironment(SubLEnvironment env) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.env = (Environment) env;
	}

	private SubLEnvironment outerEnvironment;
	private ArrayList<EnvironmentBinding> bindingStack;
	private static SubLEnvironment defaultEnvironment;
	static {
		defaultEnvironment = new Environment(null) {
			@Override
			public String printObjectImpl() {
				return "#<Environment defaultEnvironment>";
			}
		};
		noteDefaultBindings();
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	public SubLEnvironment extend() {
		SubLEnvironment extendedEnv = new Environment(this);
		return SubLProcess.currentSubLThread().env = (Environment) extendedEnv;
	}

//	public SubLPackage getCurrentPackage() {
//		return SubLPackage.getCurrentPackage();
//	}

	public SubLEnvironment getOuterEnvironment() {
		return outerEnvironment;
	}

	@Override
	public int hashCode(int currentDepth) {
		return super.superHash();
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isEnvironment() {
		return true;
	}


	public SubLObject lookupBinding(SubLSymbol var) {
		if (!var.isUndeclared())
			Errors.error("Illegal call of lookupBinding on declared symbol: " + var);
		for (int i = 0, size = bindingStack.size(); i < size; ++i) {
			EnvironmentBinding currentBinding = bindingStack.get(i);
			if (currentBinding.getVar() == var)
				return currentBinding.getValue();
		}
		if (outerEnvironment == null)
			return ((Symbol)var).getTLValue0();
		return outerEnvironment.lookupBinding(var);
	}

	public SubLObject noteBinding(SubLSymbol var, SubLObject newValue) {
		if (var.isDynamic()) {
			SubLObject oldValue = var.currentBinding(SubLProcess.currentSubLThread().bindingsList);
			var.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
			return oldValue;
		}
		if (var.isGlobal())
			return Errors.error("Illegal attempt to dynamically bind a global symbol: " + var);
		if (this == SubLEnvironment.defaultEnvironment)
			Errors.error("Illegal ttempt to modify ther outermost environment.");
		EnvironmentBinding varBinding = new EnvironmentBinding(var, newValue);
		bindingStack.add(varBinding);
		return null;
	}

	public void setBinding(SubLSymbol var, SubLObject value) {
		if (var.isDynamic()) {
			var.setDynamicValue(value);
			return;
		}
		if (var.isGlobal()) {
			var.setGlobalValue(value);
			return;
		}
		for (int i = 0, size = bindingStack.size(); i < size; ++i) {
			EnvironmentBinding currentBinding = bindingStack.get(i);
			if (currentBinding.getVar() == var) {
				currentBinding.setValue(value);
				return;
			}
		}
		if (outerEnvironment == null) {
			if (var.isConstantSymbol())
				Errors.error("Can't set the value of constant symbol: " + this);
			var.forceGlobalValue(value);
		} else
			outerEnvironment.setBinding(var, value);
	}

	@Override
	public SubLEnvironment toEnv() {
		return this;
	}

	@Override
	public String toTypeName() {
		return "ENVIRONMENT";
	}

	public void unextend() {
		if (outerEnvironment != null) {
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.env =  (Environment) outerEnvironment;
		} else
			Errors.error("Illegal attempt to reclaim base enviroment.");
	}
}
