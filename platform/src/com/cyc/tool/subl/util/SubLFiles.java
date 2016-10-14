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

package com.cyc.tool.subl.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLFiles {

	//// Constructors

	public static final boolean assertionsDisabledInClass = true;

	public static abstract class VariableAccessMode {
		public static VariableAccessMode CONSTANT = new VariableAccessMode() {
			public SubLSymbol toSymbol() {
				return CommonSymbols.CONSTANT;
			}
		};

		public static VariableAccessMode LEXICAL = new VariableAccessMode() {
			public SubLSymbol toSymbol() {
				return CommonSymbols.LEXICAL;
			}
		};

		public static VariableAccessMode DYNAMIC = new VariableAccessMode() {
			public SubLSymbol toSymbol() {
				return CommonSymbols.DYNAMIC;
			}
		};
		public static VariableAccessMode UNDECLARED = new VariableAccessMode() {
			public SubLSymbol toSymbol() {
				return CommonSymbols.UNDECLARED;
			}
		};

		public String toString() {
			return this.toSymbol().toString();
		}

		public abstract SubLSymbol toSymbol();
	}

	//// Public Area

	public static void declareFunction(String className, String methodName, String functionName, int requiredArgCount,
			int optionalArgCount, boolean allowsRest) {
		try {
			List<Class> parameterTypes = new ArrayList<Class>();
			for (int i = 0; i < requiredArgCount + optionalArgCount; i++)
				parameterTypes.add(SubLObject.class);
			if (allowsRest)
				parameterTypes.add(SubLObject[].class);
			Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			if (functionSymbol.fboundp()) {
				Errors.warn("Attempt to redefine: " + functionSymbol);
				return;
			}
			SubLFunction func = SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray,
					SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
		}
	}

	/**
	 * implicitly dependent on the current package, @todo extend to support
	 * non-sublisp functions. We need this helper function to be non-static so
	 * that we can access this.getClass() without having to pass it as an
	 * argument
	 */
	public static void declareFunction(SubLFile file, String methodName, String functionName, int requiredArgCount,
			int optionalArgCount, boolean allowsRest) {
		try {
			List<Class> parameterTypes = new ArrayList<Class>();
			for (int i = 0; i < requiredArgCount + optionalArgCount; i++)
				parameterTypes.add(SubLObject.class);
			if (allowsRest)
				parameterTypes.add(SubLObject[].class);
			Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
			Method meth = file.getClass().getMethod(methodName, parameterArray);
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			SubLFunction previous = null;
			if (functionSymbol.fboundp()) {
				Errors.warn("Attempt to redefine: " + functionSymbol);
				if (false)
					return;
				previous = functionSymbol.getFunc();
				if (parameterArray.length <= previous.applyArity())
					return;
			}
			SubLFunction func = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount,
					optionalArgCount, allowsRest);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
		}
	}

	private static SubLSymbol declareGlobal(String variableName, SubLObject initialValue, VariableAccessMode accessMode,
			boolean isReinitialized) {
		return SubLFiles.declareGlobal(variableName, initialValue, accessMode, isReinitialized,
				(SubLPackage) Packages.$package$.getDynamicValue());
	}

	private static SubLSymbol declareGlobal(String variableName, SubLObject initialValue, VariableAccessMode accessMode,
			boolean isReinitialized, SubLPackage thePackage) {
		try {
			SubLSymbol symbol = SubLObjectFactory.makeSymbol(variableName, thePackage);
			symbol.setAccessMode(accessMode);
			if (isReinitialized || !symbol.boundp())
				symbol.forceGlobalValue(initialValue);
			// perform symbol annotation -- for initialization type
			SubLSymbol initializationType = isReinitialized ? CommonSymbols.INITIALIZER : CommonSymbols.WORLD;
			symbol.setProperty(CommonSymbols.INITIALIZATION_TYPE, initializationType);
			// symbol annotation -- for binding type
			symbol.setProperty(CommonSymbols.BINDING_TYPE, accessMode.toSymbol());

			return symbol;
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring global: " + variableName, e);
		}
		return null;
	}

	public static void declareMacro(String className, String methodName, String functionName) {
		try {
			Class[] parameterArray = new Class[] { SubLObject.class, SubLObject.class };
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(className, methodName,
					parameterArray, SubLObject.class, functionSymbol, 2, 0, false);
			SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
			functionSymbol.setFunction(macro);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
		}
	}

	public static void declareMacro(SubLFile file, String methodName, String functionName) {
		try {
			Class[] parameterArray = new Class[] { SubLObject.class, SubLObject.class };
			Method meth = file.getClass().getMethod(methodName, parameterArray);
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, 2, 0,
					false);
			SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
			functionSymbol.setFunction(macro);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
		}
	}

	public static SubLSymbol defconstant(String variableName, SubLObject initialValue) {
		/* SubL defconstant : constant lexical global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true);
	}

	// @todo get rid of references to file -APB
	public static SubLSymbol defconstant(SubLFile file, String variableName, SubLObject initialValue) {
		/* SubL defconstant : constant lexical global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true);
	}

	// @todo get rid of references to file -APB
	public static SubLSymbol defconstant(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		/* SubL defconstant : constant lexical global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true, thePackage);
	}

	public static SubLSymbol defglobal(String variableName, SubLObject initialValue) {
		/*
		 * SubL defglobal : mutable lexical global, not re-initialized on
		 * re-evaluation
		 */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false);
	}

	// @todo get rid of references to file -APB
	public static SubLSymbol defglobal(SubLFile file, String variableName, SubLObject initialValue) {
		/*
		 * SubL defglobal : mutable lexical global, not re-initialized on
		 * re-evaluation
		 */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false);
	}

	public static SubLSymbol defglobal(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		/*
		 * SubL defglobal : mutable lexical global, not re-initialized on
		 * re-evaluation
		 */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false, thePackage);
	}

	public static SubLSymbol deflexical(String variableName, SubLObject initialValue) {
		/* SubL deflexical : mutable lexical global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true);
	}

	// @todo get rid of references to file -APB
	public static SubLSymbol deflexical(SubLFile file, String variableName, SubLObject initialValue) {
		/* SubL deflexical : mutable lexical global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true);
	}

	public static SubLSymbol deflexical(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		/* SubL deflexical : mutable lexical global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true, thePackage);
	}

	public static SubLSymbol defparameter(String variableName, SubLObject initialValue) {
		/* SubL defparameter : mutable dynamic global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
	}

	// @todo get rid of references to file -APB
	public static SubLSymbol defparameter(SubLFile file, String variableName, SubLObject initialValue) {
		/* SubL defparameter : mutable dynamic global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
	}

	public static SubLSymbol defparameter(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		/* SubL defparameter : mutable dynamic global */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true, thePackage);
	}

	public static SubLSymbol defvar(String variableName, SubLObject initialValue) {
		/*
		 * SubL defvar : mutable dynamic global, not re-initialized on
		 * re-evaluation
		 */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
	}

	// @todo get rid of references to file -APB
	public static SubLSymbol defvar(SubLFile file, String variableName, SubLObject initialValue) {
		/*
		 * SubL defvar : mutable dynamic global, not re-initialized on
		 * re-evaluation
		 */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
	}

	public static SubLSymbol defvar(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		/*
		 * SubL defvar : mutable dynamic global, not re-initialized on
		 * re-evaluation
		 */
		return SubLFiles.declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false, thePackage);
	}

	//// Protected Area

	//// Private Area

	public static void handleThrowable() {
		;
	}

	public static void initialize(String className) {
		try {
			Class clazz = PatchFileLoader.PATCH_FILE_LOADER.loadClass(className, true);
			ClassLoader loader = clazz.getClassLoader();
			Field meField = clazz.getDeclaredField("me");
			if (meField == null)
				throw new RuntimeException("Bad SubLFile: " + className);
			SubLFile file = (SubLFile) meField.get(null);
			if (file == null) {
				throw new RuntimeException("'me' not boudn in SubLFile: " + className);
			}
			//System.err.println("" + file.getClass().getName());
			initialize(file);
		} catch (Exception e) {
			e.printStackTrace();
			Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
		}
	}

	/**
	 * Calls declareFunctions(), initializeVariables(), and runTopLevelForms()
	 * in order. Used for all translated files and sporadically used for some
	 * handwritten files.
	 */
	public static void initialize(SubLFile file) {
		try {
			file.declareFunctions();
			file.initializeVariables();
			file.runTopLevelForms();
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error initializing SubL file: " + file.getClass().getName(), e);
		}
	}

	/** Everything in here should be static */
	private SubLFiles() {
	}

	//// Internal Rep

	//// Main

}
