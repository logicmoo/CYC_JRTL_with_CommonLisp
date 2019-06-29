package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class ABCLStatic {

	/**
	 * @param incomingArgs
	 * @return
	 */
	static public LispObject[] asLispObjectArray(SubLObject[] incomingArgs) {
		int len = incomingArgs.length;
		LispObject[] execArgs = new LispObject[len];
		System.arraycopy(incomingArgs, 0, execArgs, 0, len);
		return execArgs;
	}

	/**
	 * @param incomingArgs
	 * @return
	 */
	static public SubLObject[] asSubLObjectArray(LispObject[] incomingArgs) {
		int len = incomingArgs.length;
		SubLObject[] execArgs = new SubLObject[len];
		System.arraycopy(incomingArgs, 0, execArgs, 0, len);
		return execArgs;
	}
}
