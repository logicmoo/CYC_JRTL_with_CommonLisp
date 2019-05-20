package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.*;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.cusp.*;

import org.eclipse.jface.dialogs.*;


public class UndefineFunctionAction extends LispAction {
	
	public UndefineFunctionAction() {
	}
	
	public UndefineFunctionAction(ILispEditor editor) {
		super(editor);
	}
	
	public void run() {
		String symbol = getSymbol();
		CuspInterface cusp = LispPlugin.getDefault().getCusp();
		
		InputDialog win = new InputDialog(editor.getTextWidget().getShell(), "Undefine",
				"Undefine the following symbol:", symbol, new IInputValidator() {
			public String isValid(String newText) {
				if (newText.equals("")) {
					return "Symbol may not be blank.";
				}
				
				return null;
			}
		});
		
		if (win.open() == InputDialog.OK && !win.getValue().equals("")) {
			cusp.sendUndefine(win.getValue(), getPackage(), null);
		}
	}

}
