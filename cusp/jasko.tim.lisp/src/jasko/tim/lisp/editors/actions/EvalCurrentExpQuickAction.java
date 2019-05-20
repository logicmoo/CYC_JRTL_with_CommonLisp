/**
 * 
 */
package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;

/**
 * @author sk
 *
 */
public class EvalCurrentExpQuickAction extends LispAction {
    public EvalCurrentExpQuickAction () {}
    
    public EvalCurrentExpQuickAction (LispEditor editor) {
        super(editor);
    }
    
    public void run() {
    	String exp;
		if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EVALUATE_HIGHLIGHT)) {
			exp = ((LispEditor)super.editor).getHighlighter().getHighlightedString(); 
			if (exp.equals("")||exp==null)
				exp = getCurrentExpression();
			EvalTopLevelExpQuickAction.runStr(exp);
		}
    }

}
