package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;


public class LispDocAction extends CallUrlAction {
	
	public LispDocAction() {
		super(null, "http://www.lispdoc.com/?q=%s&search=Basic+search");
	}
	
	public LispDocAction(ILispEditor editor) {
		super(editor, "http://www.lispdoc.com/?q=%s&search=Basic+search");
	}

}
