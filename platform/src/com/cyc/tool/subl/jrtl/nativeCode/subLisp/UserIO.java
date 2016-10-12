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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public class UserIO implements SubLFile {

	//// Constructors

	public static SubLFile me = new UserIO();

	public static SubLObject alert_user(SubLObject format_string, SubLObject[] args) {
		return Errors.unimplementedMethod("UserIO.alert_user()");
	}

	//// Public Area

	public static SubLObject get_string_from_user(SubLObject prompt_string) {
		return Errors.unimplementedMethod("UserIO.get_string_from_user()");
	}

	public static SubLObject log_message(SubLObject format_string, SubLObject[] args) {
		return Errors.unimplementedMethod("UserIO.log_message()");
	}

	public static SubLObject notify_user(SubLObject format_string, SubLObject[] args) {
		return Errors.unimplementedMethod("UserIO.notify_user()");
	}

	public static SubLObject report_error(SubLObject fatalP, SubLObject format_string, SubLObject[] args) {
		return Errors.unimplementedMethod("UserIO.report_error()");
	}

	public static SubLObject user_confirm(SubLObject prompt_string) {
		return Errors.unimplementedMethod("UserIO.user_confirm()");
	}

	/** Creates a new instance of UserIO. */
	public UserIO() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(UserIO.me, "alert_user", "ALERT-USER", 1, 0, true);
		SubLFiles.declareFunction(UserIO.me, "get_string_from_user", "GET-STRING-FROM-USER", 1, 0, false);
		SubLFiles.declareFunction(UserIO.me, "log_message", "LOG-MESSAGE", 1, 0, true);
		SubLFiles.declareFunction(UserIO.me, "notify_user", "NOTIFY-USER", 1, 0, true);
		SubLFiles.declareFunction(UserIO.me, "report_error", "REPORT-ERROR", 2, 0, true);
		SubLFiles.declareFunction(UserIO.me, "user_confirm", "USER-CONFIRM", 1, 0, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
