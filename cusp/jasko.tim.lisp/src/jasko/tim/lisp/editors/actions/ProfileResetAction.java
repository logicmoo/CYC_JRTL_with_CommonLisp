package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;

public class ProfileResetAction extends LispAction {
public static final String ID = "jasko.tim.lisp.actions.ProfileResetAction";
	
	public ProfileResetAction() {
	}
	
	public ProfileResetAction(LispEditor editor) {
		super(editor);
	}
	
	public void run() {
		getCusp().sendProfileReset(null);
	}

}
