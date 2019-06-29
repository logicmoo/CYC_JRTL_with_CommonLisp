//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class UserIO implements SubLFile {
	public static SubLObject alert_user(SubLObject format_string, SubLObject[] args) {
		return Errors.unimplementedMethod("UserIO.alert_user()");
	}

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

	public static SubLFile me;
	static {
		me = new UserIO();
	}
	public UserIO() {
		BeanShellCntrl.addSubLFile(this);
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(UserIO.me, "alert_user", "ALERT-USER", 1, 0, true);
		SubLFiles.declareFunction(UserIO.me, "get_string_from_user", "GET-STRING-FROM-USER", 1, 0, false);
		SubLFiles.declareFunction(UserIO.me, "log_message", "LOG-MESSAGE", 1, 0, true);
		SubLFiles.declareFunction(UserIO.me, "notify_user", "NOTIFY-USER", 1, 0, true);
		SubLFiles.declareFunction(UserIO.me, "report_error", "REPORT-ERROR", 2, 0, true);
		SubLFiles.declareFunction(UserIO.me, "user_confirm", "USER-CONFIRM", 1, 0, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
