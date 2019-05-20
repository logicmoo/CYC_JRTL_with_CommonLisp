package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;

public class CompileTopSlowAction extends CompileTopAction {
	public CompileTopSlowAction() {
		super();
	}
	
	public CompileTopSlowAction(LispEditor editor, boolean quick) {
		super(editor, quick);
	}
}
