package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;

public abstract class SLispObject extends LispObject {
	@Override
	abstract public String printObjectImpl();

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this; // self-evaluating
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.armedbear.lisp.LispObject#lispEquals(java.lang.Object)
	 */
	@Override
	public boolean lispEquals(Object obj) {
		if (!(obj instanceof LispObject))
			return false;
		return equal((LispObject) obj);
	}

//	@Override
//	public int eq_hashCode() {
//		return ref_hashCode();
//	}
}
