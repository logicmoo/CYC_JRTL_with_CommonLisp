package jasko.tim.lisp.editors.autoedits;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.LispPartitionScanner;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.util.LispUtil;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class PairAutoEdit implements IAutoEditStrategy {

	private void cmdEnd(DocumentCommand c){
		c.shiftsCaret = false;
		c.caretOffset = c.offset + 1;
		c.doit = false;
		return;
	}
	// insert paired "", (), #| |#
	public void customizeDocumentCommand(IDocument d,
			DocumentCommand c) {
		try{
			IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
			boolean pairBrackets = prefs.getBoolean(PreferenceConstants.PAIR_SMART_BRACKETS);
			//prefs.getBoolean(PreferenceConstants.PAIR_EDIT_BRACKETS);
			String contentType = d.getContentType(c.offset);
			if(contentType != LispPartitionScanner.LISP_STRING 
					&& contentType != LispPartitionScanner.LISP_COMMENT
					&& d.getLength() > c.offset){
				boolean pairSmartBrackets = prefs.getBoolean(PreferenceConstants.PAIR_SMART_BRACKETS);
				boolean pairBraces = prefs.getBoolean(PreferenceConstants.PAIR_EDIT_BRACES);
				if( (pairBrackets && pairSmartBrackets && "(".equals(c.text) )
				  ||(pairBraces && "[".equals(c.text) )){
					char nextc = d.getChar(c.offset);

					if( !Character.isWhitespace(nextc) && nextc != ')' ){
						String txt = "";
						if( nextc == '(' ){
							txt = LispUtil.getCurrentExpression(d, c.offset, 0);							
						} else {
							txt = LispUtil.getCurrentFullWord(d, c.offset);
						}
						if( txt != "" ){
							txt = "( "+txt+")";
							c.text = txt;
							c.length = txt.length()-3;
							cmdEnd(c);
							return;						
						}						
					}
				}				
			}
			if("(".equals(c.text) && pairBrackets){
				c.text = "()";
				cmdEnd(c);
				return;
			}
			if("\"".equals(c.text) && !(c.offset > 0 && d.getChar(c.offset-1) == '\\')
					&& prefs.getBoolean(PreferenceConstants.PAIR_EDIT_QUOTES)){
				c.text = "\"\"";
				cmdEnd(c);
				return;
			}
			if("|".equals(c.text) && c.offset > 0 && d.getChar(c.offset-1) == '#' 
				&& prefs.getBoolean(PreferenceConstants.PAIR_EDIT_COMMENTS)){
				c.text = "|  |#";
				cmdEnd(c);
				return;
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

}
