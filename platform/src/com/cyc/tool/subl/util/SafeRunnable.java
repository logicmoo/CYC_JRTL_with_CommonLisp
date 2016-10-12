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

package com.cyc.tool.subl.util;

import java.util.logging.Level;

//// Internal Imports

//// External Imports

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractLispObject;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

public abstract class SafeRunnable extends AbstractLispObject implements Runnable {

	//// Constructors

	/** Creates a new instance of SafeRunnable. */
	public SafeRunnable() {
	}

	//// Public Area

	/** Override this to show a better high level user error message. **/
	protected String getErrorMessage(Exception e) {
		return e.getMessage();
	}

	/** Override this to return a log level other than WARNING. **/
	protected Level getLogLevel(Exception e) {
		return Level.WARNING;
	}

	//// Protected Area

	public void run() {
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			this.safeRun();
		} catch (SubLProcess.TerminationRequest tr) {
			; // ignore
		} catch (Exception e) {
			try {
				Errors.handleError(e);
			} catch (CatchableThrow t) {
				t.printStackTrace();
			}
		}
	}

	abstract public void safeRun();

	//// Private Area

	//// Internal Rep9

	//// Main

	public String writeToString() {
		return this.unreadableString(this.getClass().getSuperclass().getSimpleName());
	}
}
