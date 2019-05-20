package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;

public class CompileSlowAction extends LispAction {
	
	public CompileSlowAction() {
	}
	
	public CompileSlowAction(ILispEditor editor) {
		super(editor);
	}
	
	public void run() {
		FileCompiler.compileFile(editor, false);
	}
	
}