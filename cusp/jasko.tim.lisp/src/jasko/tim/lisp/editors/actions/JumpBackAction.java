package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.util.LispUtil;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.*;
import org.eclipse.ui.IEditorPart;

public class JumpBackAction extends LispAction {
	public static final String ID = "jasko.tim.lisp.actions.JumpBackAction";

    private ILispEditor editor;
    
    public JumpBackAction () {}
    
    public JumpBackAction (ILispEditor editor) {
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
        int docLen = doc.getLength();
        int jumpTo = 0;
        
        if( offset > docLen || offset <= 0 ){
        	return;
        }
        
        try {
        	char c = doc.getChar(offset-1);
        	if( c == '\n' ){
        		if( doc.getChar(offset-2) == '\r' ){
        			jumpTo = offset - 2;
        		} else {
            		jumpTo = offset - 1;        			
        		}
        	} else {
        		boolean justSpace = false;
            	if( c == ')'){
                    int[] range = 
                    	LispUtil.getCurrentExpressionRange(doc, offset);
                    if( range == null ){
                    	jumpTo = 0;
                    } else {
                        jumpTo = range[0];                	
                    }
            	} else if( Character.isWhitespace(c) ){
            		jumpTo = offset - 1;
            		justSpace = true;
            	} else if (c == '('){
            			jumpTo = offset-1;
            	} else {
                	int[] range = 
                		LispUtil.getCurrentFullWordRange(doc, offset, false);
                	if( range == null ){
                		jumpTo = 0;
                	} else {
                    	jumpTo = range[0];
                	}
            	}
            	int jump = jumpTo;
            	if( jumpTo < docLen && jumpTo > 0){
            		c = doc.getChar(jumpTo-1);
            	
    	        	while( jumpTo > 0 && Character.isWhitespace(c) 
    	            		&& c != '\n'){
    	        		--jumpTo;
                		c = doc.getChar(jumpTo-1);
    	        	}
            	}
            	if( !justSpace && c == '\n'){
            		jumpTo = jump;
            	}
        	}        	
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
        
        
        editor.getSelectionProvider()
            .setSelection(new TextSelection(doc, Math.max(0,jumpTo), 0));
    }
    
}
