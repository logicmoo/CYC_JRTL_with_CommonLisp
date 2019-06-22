package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;

abstract public class NLispObject extends LispObject {
	
	public String toStringSimple() {
		return "" + javaInstance();
	}
	
	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this; // self-evaluating
	}

}
