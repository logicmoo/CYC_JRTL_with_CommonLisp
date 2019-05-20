package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;

public class MacroExpandAllAction extends MacroExpandAction {
	public MacroExpandAllAction() {
		super();
		super.all = true;
	}
	
	public MacroExpandAllAction(LispEditor editor) {
		super (editor);
		super.all = true;
	}
}
