package org.armedbear.lisp;

import static org.logicmoo.system.Startup.doThrow;
import static org.logicmoo.system.Startup.isSubLisp;
import static org.logicmoo.system.Startup.setSubLisp;

import java.util.concurrent.Callable;

import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;

public class ABCLStatic {
	static {
		SystemCurrent.setupIO();
	}

	@LispMethod
	public static <T> T subl_preserve_pkg(final boolean clOrSubL, boolean keepPackage, final Callable<T> str) {
		boolean wasSubLisp = isSubLisp();
		Package package1;
		if (keepPackage) {
			package1 = Lisp.getCurrentPackage();
		} else {
			package1 = null;
		}
		if (wasSubLisp != clOrSubL)
			setSubLisp(clOrSubL);
		try {
			return str.call();
		} catch (Throwable e) {
			throw doThrow(e);
		} finally {
			setSubLisp(wasSubLisp);
			if (package1 != null) {
				Lisp.setCurrentPackage(package1);
			}
		}
	}

	@LispMethod
	public static <T> T subl_preserve_pkg(final boolean clOrSubL, boolean keepPackage, final Runnable str) {
		boolean wasSubLisp = isSubLisp();
		Package package1;
		if (keepPackage) {
			package1 = Lisp.getCurrentPackage();
		} else {
			package1 = null;
		}
		if (wasSubLisp != clOrSubL)
			setSubLisp(clOrSubL);
		try {
			str.run();
			return (T) Lisp.T;
		} catch (Throwable e) {
			throw doThrow(e);
		} finally {
			setSubLisp(wasSubLisp);
			if (package1 != null) {
				Lisp.setCurrentPackage(package1);
			}
		}
	}

	@LispMethod
	public static <T> T with_thread_prefix(String pref, boolean forceCL, final Callable<T> str) {
		if (forceCL && Startup.optimizeForSpeed) {
			return subl_preserve_pkg(false, false, str);
		}
		Thread ct = null;
		String tn = null;
		if (!Startup.optimizeForSpeed) {
			ct = Thread.currentThread();
			tn = ct.getName();
			pref = pref.replace(Startup.getPlatformDir(), "$PLATFORM");
			if (tn.contains(pref)) {
				tn = null;
			} else {
				final String name = "" + (int) (tn.length() / 8) + ": " + pref + " " + tn;
				ct.setName(name);
			}
		}

		try {
			if (forceCL) {
				return subl_preserve_pkg(false, false, str);
			} else {
				return str.call();
			}
		} catch (Throwable e) {
			throw doThrow(e);
		} finally {
			if (tn != null)
				ct.setName(tn);
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
