
package jasko.tim.lisp.editors.actions;

import org.eclipse.ui.PlatformUI;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.*;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.cusp.CuspRunnable;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.views.ReplView;
import jasko.tim.lisp.views.ReplView.ReturnHandler;

public class EvalTopLevelExpAction extends LispAction {
	
	public EvalTopLevelExpAction() {
	}
	
	public EvalTopLevelExpAction(LispEditor editor) {
		super(editor);
	}
	
	public void runStr(String exp){
	    if (exp.length() == 0) return;

        if( LispPlugin.getDefault().getPreferenceStore()
        		.getBoolean(PreferenceConstants.SHOW_EVAL_IN_REPL) ){
    		try {
    			ReplView repl = LispPlugin.findREPL();
    			String cleanCmd = exp.replace("\r", "");

    			repl.PreEvalStateHandleWithPackage(exp, cleanCmd);
    			evalExpInCurrentPackageIf(cleanCmd,repl.new ReturnHandler());
    			repl.checkSwitchPackage(cleanCmd);
    			//repl.EvalStateHandle(exp+"\n", cleanCmd);
    			//ReplView.switchToRepl();
    		} catch ( Exception e ){
    			
    			evalExpInCurrentPackageIf(exp);
    		}        	
        } else {
        	evalExpInCurrentPackageIf(exp);    	
        }
	}
	
	public void run() {
		String exp = "";
		
		if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EVALUATE_HIGHLIGHT)) {
			exp = ((LispEditor)super.editor).getHighlighter().getHighlightedString(); 
			if (exp.equals("")||exp==null)
				exp = getTopLevelExpression();
		} 
		else {
			exp = getTopLevelExpression();}		
		runStr(exp);	       
	}
}
