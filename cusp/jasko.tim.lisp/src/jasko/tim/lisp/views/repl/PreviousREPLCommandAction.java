package jasko.tim.lisp.views.repl;

import jasko.tim.lisp.views.ReplView;
import jasko.tim.lisp.editors.actions.LispAction;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public class PreviousREPLCommandAction extends LispAction implements IEditorActionDelegate {
    private final ReplView repl;
    
    public PreviousREPLCommandAction (ReplView repl) {
        this.repl = repl;
    }

    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
    }
    
    public void run() {
        repl.showPreviousCommandFromHistory();
    }

    public void run(IAction action) {
        run();
    }

    public void selectionChanged(IAction action, ISelection selection) {
    }
}
