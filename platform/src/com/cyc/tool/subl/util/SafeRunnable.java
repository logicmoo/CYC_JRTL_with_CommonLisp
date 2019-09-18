/* For LarKC */
package com.cyc.tool.subl.util;

import java.util.logging.Level;

import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Package;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.FromSubLisp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

public abstract class SafeRunnable extends FromSubLisp implements Runnable {

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this; // self-evaluating
	}

	protected boolean outerSubLisp;
	protected Package outerPackage;

	public SafeRunnable() {
		this(Main.isSubLisp());
	}

	public SafeRunnable(boolean tf) {
		this(tf, (tf ? null : Lisp.getCurrentPackage()));
	}

	public SafeRunnable(Package pkg) {
		this(Main.isSubLisp(), pkg != null ? pkg : (Main.isSubLisp() ? null : Lisp.getCurrentPackage()));
	}

	public SafeRunnable(boolean tf, Package pkg) {
		this.outerSubLisp = tf;
		this.outerPackage = pkg;
	}

	@Override
	public SafeRunnable toLispObject() {
		return this;
	}

	@Override
	public void run() {

		final boolean wasSubLisp = Main.isSubLisp();
		SubLPackage prevPackage = null;
		try {
			Main.setSubLisp(outerSubLisp);
			if (outerSubLisp) {
				if (outerPackage != null) {
					prevPackage = Lisp.getCurrentPackage();
					SubLPackage.setCurrentPackage(outerPackage);
				} else {
					prevPackage = Lisp.getCurrentPackage();
					SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
				}
			} else {
				if (outerPackage != null) {
					prevPackage = Lisp.getCurrentPackage();
					SubLPackage.setCurrentPackage(outerPackage);
				}
			}
			safeRun();
		} catch (ControlTransfer tr) {
			throw tr;
		} catch (SubLProcess.TerminationRequest tr) {
		} catch (Throwable e) {
			Errors.handleError(e);
		} finally {
			Main.setSubLisp(wasSubLisp);
			if (prevPackage != null)
				SubLPackage.setCurrentPackage(prevPackage);
		}
	}

	public abstract void safeRun();

	protected String getErrorMessage(Exception e) {
		return e.getMessage();
	}

	protected Level getLogLevel(Exception e) {
		return Level.WARNING;
	}
}
