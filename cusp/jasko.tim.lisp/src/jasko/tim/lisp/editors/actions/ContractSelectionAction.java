package jasko.tim.lisp.editors.actions;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.*;
import org.eclipse.ui.IEditorPart;

public class ContractSelectionAction extends LispAction {

    private ILispEditor editor;
    
    public ContractSelectionAction () {}
    
    public ContractSelectionAction (ILispEditor editor) {
        this.editor = editor;
    }
    
    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
        editor = (LispEditor)targetEditor;
    }
    
    public void run () { 
        ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
        //int offset = ts.getOffset();
        IDocument doc = editor.getDocument();
        editor.popHistory();
        Integer[] range = editor.peekHistory();
        if (range != null) {
        	editor.getSelectionProvider().setSelection(new TextSelection(doc, range[0], range[1]));
        	editor.flagSelectionAction();
        }
    }
    
}
