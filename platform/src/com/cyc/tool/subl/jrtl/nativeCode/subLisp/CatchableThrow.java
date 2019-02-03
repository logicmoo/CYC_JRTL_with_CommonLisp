//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.Deque;

import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;

public abstract class CatchableThrow extends ControlTransfer {

	public CatchableThrow() {
		super();
	}

	public CatchableThrow(String message) {
		super(message);
	}

	abstract public SubLObject getResult();

	abstract public SubLObject getTarget();

	@Override
	abstract public LispObject getCondition();

	public static boolean dequeContains(Deque<SubLObject> deque, SubLObject elem) {
		for (Object cur : deque)
			if (cur == elem)
				return true;
		return false;
	}

	public static void throwToCatch(SubLObject target, SubLObject result, boolean errorIfCantThrow)
			throws CatchableThrow {
		Deque<SubLObject> stack = SubLProcess.currentSubLThread().throwStack;
		if (dequeContains(stack, target))
			throw new CatchableThrowImpl(target, result);
		if (errorIfCantThrow)
			Errors.error("Invalid attempt to throw to the uncaught target: " + target + "\n expecting one of: "
					+ SubLProcess.currentSubLThread().throwStack);
		throw new CatchableThrowImpl(target, result);
	}

	public static void throwToCatchLegacy(SubLObject target, SubLObject result) {
		Deque<SubLObject> stack = SubLProcess.currentSubLThread().throwStack;
		if (dequeContains(stack, target))
			throw new CatchableThrowImpl(target, result);

		throw new CatchableThrowImpl(target, result);

	}

}
