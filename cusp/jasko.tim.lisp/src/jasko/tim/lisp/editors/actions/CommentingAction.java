package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.*;
import org.eclipse.ui.IEditorPart;

public class CommentingAction extends LispAction {

    private ILispEditor editor;
    
    public CommentingAction () {}
    
    public CommentingAction (ILispEditor editor) {
        this.editor = editor;
    }
    
    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
        editor = (ILispEditor)targetEditor;
    }
    
    public void run () {
        ITextSelection ts = 
        	(ITextSelection) editor.getSelectionProvider().getSelection();
        int offset = ts.getOffset();
        IDocument doc = editor.getDocument();
        
        if( ts.getLength() > 0 ){
        	String oldtxt = ts.getText();
        	String txt = "";
        	if( oldtxt.length() > 4 
        			&& oldtxt.startsWith("#|") && oldtxt.endsWith("|#") ){
        		txt = oldtxt.substring(2, oldtxt.length()-2);
        	} else {
            	txt = "#|" + oldtxt + "|#";        		
        	}
        	try{
        		doc.replace(offset, ts.getLength(), txt);
        		editor.getSelectionProvider()
        		  .setSelection(new TextSelection(doc,offset,txt.length()));
        	}
        	catch (BadLocationException e){
                e.printStackTrace();        		
        	}
        }
    }    
}
