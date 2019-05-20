package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.editors.*;

public class MacroExpandAction extends LispAction {
	public boolean all = false;
	public boolean topLevel = false;
	
	public MacroExpandAction() {};
  
	public MacroExpandAction(ILispEditor editor) {
		super(editor);
	}

	
	public void run() {

		String exp;
		if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EVALUATE_HIGHLIGHT)) {
			exp = ((LispEditor)super.editor).getHighlighter().getHighlightedString(); //getRange();
			if (exp.equals("")||exp==null)
				exp = (topLevel?getTopLevelExpression():getExpression()); 
		}
		else
			exp = (topLevel?getTopLevelExpression():getExpression()); 
		boolean pref = PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EVAL_IN_PACKAGE);
		//String pack = ((LispEditor)editor).getOutlinePage().getPackage(getOffset());
		if (exp!=null &&!exp.equals(""))	
			getCusp().sendMacroExpand(exp, new CuspRunnable() {
				public void run() {
					String expanded = result.getf(":return").getf(":ok").value;
					editor.showMessage(expanded);
				}
			}, all, (pref?((LispEditor)editor).getOutlinePage().getPackage(getOffset()):getPackage()));

	}


}
