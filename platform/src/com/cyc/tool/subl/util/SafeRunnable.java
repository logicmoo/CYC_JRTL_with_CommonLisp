//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.logging.Level;

import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.FromSubLisp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

public abstract class SafeRunnable extends FromSubLisp implements Runnable {

	@Override
	public void run() {
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			safeRun();
		} catch (SubLProcess.TerminationRequest tr) {
		} catch (Exception e) {
			try {
				Errors.handleError(e);
			} catch (CatchableThrow t) {
				t.printStackTrace();
			}
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
