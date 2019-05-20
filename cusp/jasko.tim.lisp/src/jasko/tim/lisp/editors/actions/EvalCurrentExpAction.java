package jasko.tim.lisp.editors.actions;

import org.eclipse.ui.PlatformUI;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.views.ReplView;

public class EvalCurrentExpAction extends LispAction {
    public EvalCurrentExpAction () {}
    
    public EvalCurrentExpAction (LispEditor editor) {
        super(editor);
    }

	public void runStr(String exp){
	    if (exp.length() == 0) return;

        if( LispPlugin.getDefault().getPreferenceStore()
        		.getBoolean(PreferenceConstants.SHOW_EVAL_IN_REPL) ){
    		try {
    			ReplView repl = (ReplView)PlatformUI.getWorkbench().getActiveWorkbenchWindow()
    				.getActivePage().findView(ReplView.ID);
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
    	String exp;
		if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EVALUATE_HIGHLIGHT)) {
			exp = ((LispEditor)super.editor).getHighlighter().getHighlightedString(); 
			if (exp.equals("")||exp==null)
				exp = getCurrentExpression();
			runStr(exp);
		}
    }
}
