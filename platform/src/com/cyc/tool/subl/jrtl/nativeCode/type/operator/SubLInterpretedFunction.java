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

package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.util.ArrayList;

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.FunctionArgListDescription;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInterpretedFunction extends AbstractSubLFunction implements SubLFunction {

	//// Constructors

	public static String LAMBDA_FUNCTION_TYPE_NAME = "INTERPRETED-FUNCTION";

	public static boolean isLambdaSymbol(SubLObject obj) {
		return obj == CommonSymbols.LAMBDA_SYMBOL;
	}

	//// Public Area

	public static boolean isPossiblyLambdaExpression(SubLObject exp, boolean checkForLambda) {
		if (!exp.isCons())
			return false;
		SubLCons cons = exp.toCons();
		int size = cons.size();
		if (size < 2)
			return false;
		if (!checkForLambda)
			return true;
		SubLObject possibleLamdaSymbol = cons.get(0);
		return SubLInterpretedFunction.isLambdaSymbol(possibleLamdaSymbol);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private SubLList form;

	private FunctionArgListDescription argDesc;

	private SubLObject body;

	private SubLEnvironment env;

	SubLInterpretedFunction(SubLCons form, SubLEnvironment env) {
		this(form, env, null);
	}

	/**
	 * Creates a new instance of SubLInterpretedFunction.
	 */
	SubLInterpretedFunction(SubLCons form, SubLEnvironment env, SubLSymbol functionSymbol) {
		super(functionSymbol);
		this.form = form;
		if (!SubLInterpretedFunction.isPossiblyLambdaExpression(form, functionSymbol == null))
			throw new InvalidSubLExpressionException("Got invalid interpreted function definition: " + form);
		if (form.size() >= 2)
			this.argDesc = new FunctionArgListDescription(form.get(1));
		else
			this.argDesc = new FunctionArgListDescription(CommonSymbols.NIL);
		this.requiredArgCount = this.argDesc.getRequiredArgCount();
		this.optionalArgCount = this.argDesc.getOptionalArgCount();
		this.allowsRest = this.argDesc.allowsRest();
		if (form.size() >= 3) {
			this.body = form.cddr();
			if (!this.body.isCons())
				throw new InvalidSubLExpressionException("Got invalid body for interpreted function: " + this.body);
			this.body = SubLObjectFactory.makeCons(CommonSymbols.PROGN, this.body);
		} else
			this.body = CommonSymbols.NIL;
		this.env = env;
		if (functionSymbol != null)
			functionSymbol.setFunction(this);
	}

	public SubLObject apply(Object[] args) {
		SubLEnvironment oldEnv = SubLEnvironment.currentEnvironment();
		SubLEnvironment newEnv = this.env.extend();
		SubLObject result = CommonSymbols.NIL;
		ArrayList oldDynamicValues = null;
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.throwStack.push(CommonSymbols.RETURN_TAG);
		try {
			oldDynamicValues = this.argDesc.expandArgBindings(args, newEnv);
			this.body.eval(newEnv);
		} catch (CatchableThrow ct) {
			result = Dynamic.handleCatchableThrow(ct, CommonSymbols.RETURN_TAG);
		} finally {
			thread.throwStack.pop();
			SubLSpecialOperatorDeclarations.possiblyRebindDynamics(oldDynamicValues);
			newEnv.unextend();
			SubLEnvironment.setCurrentEnvironment(oldEnv);
		}
		Values.setFirstMultipleValue(result);
		return result;
	}

	public int applyArity() {
		return this.getRequiredArgCount() + this.getOptionalArgCount();
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	public SubLList getArglist() {
		Errors.unimplementedMethod("SubLInterpretedFunction.getArglist()");
		return CommonSymbols.NIL;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.form.hashCode(currentDepth + 1);
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

	public boolean isDouble() {
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
		return true;
	}

	public boolean isFunctionSpec() {
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

	public boolean isInterpreted() {
		return true;
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

	public boolean isSpecial() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	//// Protected Area

	//// Private Area

	public boolean isString() {
		return false;
	}

	//// Internal Rep

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public String toString() {
		SubLSymbol functionSymbol = this.getFunctionSymbol();

		if (functionSymbol != null)
			return "#<Interpreted Function " + functionSymbol + ">";
		else
			return super.toString();
	}

	//// Main

	public String toTypeName() {
		return SubLInterpretedFunction.LAMBDA_FUNCTION_TYPE_NAME;
	}

}
