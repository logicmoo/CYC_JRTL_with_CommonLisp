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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLSpecialOperator extends AbstractSubLOperator implements SubLOperator {

	//// Constructors

	//// Internal Rep
	private SubLCompiledFunction evaluationFunction;

	//// Public Area

	/**
	 * Creates a new instance of SubLSpecialOperator. Unfortunately, this has to
	 * be public since it's called from a sibling directory and we want
	 * declareSpecialOperator to be private.
	 */
	public SubLSpecialOperator(SubLCompiledFunction evaluationFunction, SubLSymbol functionSymbol) {
		super(functionSymbol);
		this.evaluationFunction = evaluationFunction;
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this; // special operators are self-evaluating
	}

	@Override
	public SubLList getArglist() {
		return getEvaluationFunction().getArglist();
	}

	public SubLCompiledFunction getEvaluationFunction() {
		return this.evaluationFunction;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.evaluationFunction.hashCode(currentDepth + 1) << 3;
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return false;
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

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
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
		return true;
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

	public SubLSpecialOperator toSpecialOperator() {
		return this;
	}

	//// Protected Area

	//// Private Area

	public String toString() {
		SubLSymbol functionSymbol = this.getFunctionSymbol();
		assert functionSymbol != null;
		return "#<Special Operator " + functionSymbol + ">";
	}

	//// Main

}
