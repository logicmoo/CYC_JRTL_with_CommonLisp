//
////
//
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

	@Override
	SubLList getArglist();

	boolean allowsRest();

	SubLObject apply(Object[] p0);

	SubLObject apply(SubLCons p0, SubLEnvironment p1);

	int applyArity();

	SubLObject evalViaApply(SubLCons p0, SubLEnvironment p1);

	SubLObject funcall(SubLObject[] p0);

	SubLObject funcallVA(SubLObject... p0);

	BinaryFunction getBinaryFunction();

	int getOptionalArgCount();

	QuataryFunction getQuataryFunction();

	QuintaryFunction getQuintaryFunction();

	int getRequiredArgCount();

	TernaryFunction getTernaryFunction();

	UnaryFunction getUnaryFunction();

	ZeroArityFunction getZeroArityFunction();

	boolean isInterpreted();
	
	boolean isSubLispBased();

	void setBinaryFunction(BinaryFunction p0);

	void setQuataryFunction(QuataryFunction p0);

	void setQuintaryFunction(QuintaryFunction p0);

	void setTernaryFunction(TernaryFunction p0);

	void setUnaryFunction(UnaryFunction p0);

	void setZeroArityFunction(ZeroArityFunction p0);
}
