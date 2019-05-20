package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;

public class ProfileReportAction extends LispAction {
	public static final String ID = "jasko.tim.lisp.actions.ProfileReportAction";
	
	public ProfileReportAction() {
	}
	
	public ProfileReportAction(LispEditor editor) {
		super(editor);
	}
	
	public void run() {
		getCusp().sendReportProfile(null);
	}

}
