package jasko.tim.lisp.editors.autoedits;

import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.editors.LispPartitionScanner;
import jasko.tim.lisp.editors.actions.IndentAction;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class LispIndentOnTab implements IAutoEditStrategy {

	private void cmdEnd(DocumentCommand c, int offset) {
	//	if (c.offset!=offset) { I don't know how to prevent the start updating. Help!
		c.shiftsCaret = false;
		c.caretOffset = offset;
		c.doit = false;
		c.text = "";
			//}
	//	else {
	//		c.shiftsCaret = false;
	//		c.text = "";
	//	}
		return;
	}	

    public boolean allWhiteSpace (String text)
    {
    	boolean allWhiteSpace = true;
		for (int i = 0;i<text.length();i++)
		{
			if (!(text.charAt(i)==' '))
			{
				allWhiteSpace = false; break;
			}
		}
	  return allWhiteSpace;
    }

    public void customizeDocumentCommand(IDocument d,
    		DocumentCommand c) { 
    
    	//HIGHLIGHT SUPPORT
    	/*int[]range = ((LispEditor)editor).getHighlighter().getHighlightedRange();
		int newOffset[];
		if (range!=null) {
			newOffset = IndentAction.doIndent(range[0],range[1],d,range[0]);
			editor.getSelectionProvider().setSelection(new TextSelection(newOffset[0],newOffset[1]-newOffset[0]));	
			return;
		}*/
		//
    	//Indenting in comments and lisp strings should be regular!
    	//not totally satisfactory, since it won't determine if it is a string until it is closed,
    	//but whatever.
    	if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.ALLOW_TABS)) {
    		String partition = "";
    		try {

    			partition = d.getPartition(c.offset).getType();
    			if(partition.equals(LispPartitionScanner.LISP_COMMENT) || partition.equals(LispPartitionScanner.LISP_STRING)
    			) {
    				return;
    			} else {
    				//fixes small error: if comment is at beginning of line, tab won't work at the very end of comment.
    				if (d.getLineOffset(d.getLineOfOffset(c.offset))!=c.offset) {
    					String partition2 = d.getPartition(c.offset-1).getType();
    					if (partition2.equals(LispPartitionScanner.LISP_COMMENT))
    						return;
    				}
    			}
    		}
    		catch (BadLocationException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    	String text = c.text;
    	//One day i did something to my computer and all the tabs were interpreted as spaces!
    	//so "\t"!= a tab, but rather a certain amount of spaces.
    	//Note:: i think i fixed this???
    	if  ("\t".equals(text)||(!"\n".equals(text)&&(allWhiteSpace(text)&&c.text.length()>1))) {
    		int topLvlRange[] = LispUtil.getTopLevelRange(d, c.offset);
    		if(topLvlRange != null) {
    			int offsets[] = 	
    				IndentAction.doIndent(topLvlRange[0], topLvlRange[1], d,c.offset);
    			cmdEnd(c,offsets[2]);				
    		} else { // when offset is just next to top-level bracket want to indent
    			topLvlRange = LispUtil.getTopLevelRange(d, c.offset+1);
    			if( topLvlRange != null){
    				int offsets[] = 
    					IndentAction.doIndent(topLvlRange[0], topLvlRange[1], d,c.offset);
    				cmdEnd(c,offsets[2]);
    			} else { //now try one character before
    				topLvlRange = LispUtil.getTopLevelRange(d, c.offset-1);
    				if( topLvlRange != null ){
    					int offsets[] = 
    						IndentAction.doIndent(topLvlRange[0], topLvlRange[1], d,c.offset);
    					cmdEnd(c,offsets[2]);
    				} else {
    					//do default action
    					if (PreferenceInitializer.getStore().getBoolean(PreferenceConstants.INDENT_ON_NO_ENCLOSING_SEXP)) {
    						//Line Indent
    						cmdEnd(c,IndentAction.doLineIndent(c.offset,d)[0]); 
    					} 
    					else  {
    						// Just indent the line we're on if parens aren't balancing yet
    						//i.e DO NOTHING???
    						/*
							System.out.println("REGULAR INDENT");
							int newOffset[] = IndentAction.doIndent(c.offset, 0, d, c.offset);
							cmdEnd(c, newOffset[2]);
    						 */
    					}
    				}
    			}
    		}	
    	}
    }

}

