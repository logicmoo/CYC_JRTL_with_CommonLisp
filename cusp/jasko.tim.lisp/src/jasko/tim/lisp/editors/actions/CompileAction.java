package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;


                           

public class CompileAction extends LispAction {
	
	public CompileAction() {
	}
	
	public CompileAction(ILispEditor editor) {
		super(editor);
	}
	
	public void run() {
		FileCompiler.compileFile(editor, true);
	}

}
