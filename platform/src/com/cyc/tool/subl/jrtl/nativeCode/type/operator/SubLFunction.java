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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuataryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface SubLFunction extends SubLOperator {

	//// Public Area

	boolean allowsRest();

	/**
	 *
	 * @param args
	 *            This is an array of Object instead of SubLObject because for
	 *            &rest functions, the argument is an array of SubLObjects,
	 *            which is not itself a SubLObject.
	 * @return
	 */
	SubLObject apply(Object[] args);

	SubLObject apply(SubLCons arg1, SubLEnvironment arg2);

	/** public SubLObject apply(SubLObject arg1, Object arg2); */
	/** the arity that will be used during apply */
	int applyArity();

	SubLObject evalViaApply(SubLCons form, SubLEnvironment env);

	SubLObject funcall(SubLObject[] incomingArgs);

	com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList getArglist();

	BinaryFunction getBinaryFunction();

	int getOptionalArgCount();

	QuataryFunction getQuataryFunction();

	QuintaryFunction getQuintaryFunction();

	int getRequiredArgCount();

	TernaryFunction getTernaryFunction();

	UnaryFunction getUnaryFunction();

	ZeroArityFunction getZeroArityFunction();

	boolean isInterpreted();

	void setBinaryFunction(BinaryFunction f);

	void setQuataryFunction(QuataryFunction f);

	void setQuintaryFunction(QuintaryFunction f);

	void setTernaryFunction(TernaryFunction f);

	void setUnaryFunction(UnaryFunction f);

	void setZeroArityFunction(ZeroArityFunction f);
}
