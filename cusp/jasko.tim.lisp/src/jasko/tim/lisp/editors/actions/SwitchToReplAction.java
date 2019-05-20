package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.views.ReplView;


public class SwitchToReplAction extends LispAction {	
	public SwitchToReplAction() {
	}
	
	public SwitchToReplAction(LispEditor editor) {
		super(editor);
	}
	
	public void run() {
		ReplView.switchToRepl();
	}

}