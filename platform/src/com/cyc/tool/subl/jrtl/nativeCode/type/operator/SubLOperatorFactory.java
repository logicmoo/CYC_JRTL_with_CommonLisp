//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.lang.reflect.Method;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLOperatorFactory {
	public static void main(String[] args) {
	}

	public static SubLCompiledFunction makeCompiledFunction(Method method, SubLSymbol functionSymbol,
			int requiredArgCount, int optionalArgCount, boolean allowsRest) {
		return new SubLCompiledFunction(method, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
	}

	public static SubLCompiledFunction makeCompiledFunction(String methodClassStr, String methodName,
			Class[] methodParameters, Class returnType, SubLSymbol functionSymbol, int requiredArgCount,
			int optionalArgCount, boolean allowsRest) {
		return new SubLCompiledFunction(methodClassStr, methodName, methodParameters, returnType, functionSymbol,
				requiredArgCount, optionalArgCount, allowsRest);
	}

	public static SubLInterpretedFunction makeInterpretedFunction(SubLCons form, SubLEnvironment env) {
		return new SubLInterpretedFunction(form, env);
	}

	public static SubLInterpretedFunction makeInterpretedFunction(SubLSymbol functionSymbol, SubLCons form,
			SubLEnvironment env) {
		return new SubLInterpretedFunction(form, env, functionSymbol);
	}

	public static SubLMacro makeMacro(SubLFunction macroExpander) {
		return new SubLMacro(macroExpander);
	}
}
