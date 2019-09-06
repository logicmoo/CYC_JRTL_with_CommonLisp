package org.armedbear.lisp;

import static org.logicmoo.system.Startup.doThrow;
import static org.logicmoo.system.Startup.isSubLisp;
import static org.logicmoo.system.Startup.setSubLisp;

import java.util.concurrent.Callable;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;

public class ABCLStatic {
	@LispMethod
	public static <T> T subl_preserve_pkg(final boolean tf, boolean keepPackage, final Callable<T> str) {
		boolean wasSubLisp = isSubLisp();
		SubLPackage package1;
		if (keepPackage) {
			package1 = Lisp.getCurrentPackage();
		} else {
			package1 = null;
		}
		setSubLisp(tf);
		try {
			return str.call();
		} catch (Throwable e) {
			throw doThrow(e);
		} finally { 
			setSubLisp(wasSubLisp);
		}
	}
	
	@LispMethod
	public static <T> T subl_preserve_pkg(final boolean tf, boolean keepPackage, final Runnable str) {
		boolean wasSubLisp = isSubLisp();
		SubLPackage package1;
		if (keepPackage) {
			package1 = Lisp.getCurrentPackage();
		} else {
			package1 = null;
		}
		setSubLisp(tf);
		try {
			str.run();
			return null;
		} catch (Throwable e) {
			throw doThrow(e);
		} finally { 
			setSubLisp(wasSubLisp);
		}
	}
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
