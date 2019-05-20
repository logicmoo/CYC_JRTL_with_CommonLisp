package jasko.tim.lisp.views.repl;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.editors.actions.LispAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;



public class SwitchFocusAction  extends LispAction  implements IEditorActionDelegate {
	//private final ReplView repl = null;


    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
    }
    
	public void run() {
		LispPlugin.toggleActiveBuffer();
	}

    public void run(IAction action) {
        run();
    }

    public void selectionChanged(IAction action, ISelection selection) {
    }






}