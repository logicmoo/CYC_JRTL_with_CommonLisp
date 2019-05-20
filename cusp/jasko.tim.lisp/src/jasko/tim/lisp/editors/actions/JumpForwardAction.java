package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.util.LispUtil;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.*;
import org.eclipse.ui.IEditorPart;

public class JumpForwardAction extends LispAction {

    private ILispEditor editor;
    
    public JumpForwardAction () {}
    
    public JumpForwardAction (ILispEditor editor) {
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
        int jumpTo = docLen;
        if(ts.getLength() > 0 ){
        	offset += ts.getLength();
        }
        
        if( offset >= docLen || offset < 0 ){
        	return;
        }
        
        try {
        	char c = doc.getChar(offset);
        	if( c == '\n' || c == '\r' ){
        		jumpTo = offset + 1;        			
        	} else {
            	if( c == '('){
                    int[] range = 
                    	LispUtil.getCurrentExpressionRange(doc, offset);
                    if( range == null ){
                    	jumpTo = docLen;
                    } else {
                        jumpTo = range[0]+range[1];                	
                    }
            	} else if( Character.isWhitespace(c) ){
            		jumpTo = offset;
            	} else if (c == ')'){
            		if( offset < docLen ){
            			jumpTo = offset+1;
            		} else {
            			jumpTo = offset;
            		}
            	} else if ( c == ';' ){
            		int line = doc.getLineOfOffset(offset);
            		jumpTo = 
            			doc.getLineOffset(line) + doc.getLineLength(line) - 1;
            	} else {
                	int[] range = 
                		LispUtil.getCurrentFullWordRange(doc, offset, false);   
                	if( range == null ){
                		jumpTo = docLen;
                	} else {
                    	jumpTo = range[0]+range[1];
                	}
            	}
            	if( jumpTo < docLen ){
            		c = doc.getChar(jumpTo);
    	        	while( jumpTo < docLen && Character.isWhitespace(c) 
    	            		&& c != '\n' && c != '\r'){
    	        		++jumpTo;
    	            	if(jumpTo < docLen){
    	            		c = doc.getChar(jumpTo);
    	            	}
    	        	}
            	}
        	}        	
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
        
        
        editor.getSelectionProvider()
            .setSelection(new TextSelection(doc, 
            		Math.min(doc.getLength(), jumpTo), 0));
    }
    
}
