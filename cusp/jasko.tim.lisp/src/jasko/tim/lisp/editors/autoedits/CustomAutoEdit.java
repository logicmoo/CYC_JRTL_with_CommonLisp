package jasko.tim.lisp.editors.autoedits;

import java.util.HashMap;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.LispPartitionScanner;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

/* autoedit snippets, like (let) (progn) etc */
public class CustomAutoEdit implements IAutoEditStrategy {

	private static String CARET_CHAR = "|";

	private AutoEditData tree;
			
	public class AutoEditData{
		public String replace = null;
		public int caretMove = 0;
		public int offset = 0;
		public int maxMatchLength = 0;
		
		public HashMap<String,AutoEditData> subtree = null;

		/*
		 * SK: I bet this all can be done in more elegant way using regex,
		 * but I was not able to come up how to do that yet. So I'll
		 * leave that exercise for the RegexAutoEdit class
		 */
		
		public AutoEditData(){
		}

		private void addMatch(String match, AutoEditData ae0, int level, String subst){
			if( ae0 == null || subst == null || subst.contentEquals("") ){
				return;
			}
			if( match == null || match.contentEquals("") ){ //nothing to add
				return;
			}
			if( match.length() == 1 ){ //create terminal node
				if( ae0.subtree == null ){
					ae0.subtree = new HashMap<String,AutoEditData>();
				}
				AutoEditData ae = new AutoEditData();
				ae.replace = subst;
				ae.offset = level;
				ae.caretMove = subst.indexOf(CARET_CHAR) - ae.offset;
				ae.replace = subst.replace(CARET_CHAR, "");
				ae.subtree = null;
				ae0.subtree.put(match, ae);
				return;
			} else { // traverse tree
				if( ae0.subtree == null ){ //will create whole subtree
					ae0.subtree = new HashMap<String,AutoEditData>();
				}
				String last_char =	match.substring(match.length()-1);
				String new_match = match.substring(0,match.length()-1);
				AutoEditData ae;
				if( ae0.subtree.containsKey(last_char) ){
					ae = ae0.subtree.get(last_char);
				} else {
					ae = new AutoEditData(); //create subtree if does not exist
					ae0.subtree.put(last_char, ae);
				}
				addMatch(new_match,ae,level+1,subst);
				return;
			}
		}

		private AutoEditData findMatch(String match, AutoEditData ae0){
			if( ae0 == null ){
				return null;
			}
			if( match == null || match.contentEquals("")){ //initial match string is shorter than tree
				if( ae0.replace != null ){ // but still got match
					return ae0;
				} else {
					return null;
				}
			}
			String last_char =	match.substring(match.length()-1);
			String new_match = match.substring(0,match.length()-1);
			if( ae0.replace != null ){ // found potential match
				if( ae0.subtree == null ){ // found match
					return ae0;
				} else { // try to find longer match
					AutoEditData ae1 = findMatch(new_match,ae0.subtree.get(last_char));
					if( ae1 != null ){ // found longer match
						return ae1;
					} else { // did not find longer match
						return ae0;
					}
				}
			}
			if( ae0.subtree.containsKey(last_char) ){ // continue with next character
				return findMatch(new_match,ae0.subtree.get(last_char)); 
			} else { // no match
				return null;
			}		
		}

		public String toString(){
			String sub = "null";
			if( subtree != null ){
				sub = subtree.toString();
			}
			String res = "{"+offset+","+caretMove+","+replace+","+sub+"}";
			return res;
		}
		
		public void addMatch(String match, String subst){
			if( match == null || match.contentEquals("") ){
				return;
			} else {
				addMatch(match,this,0,subst);
				maxMatchLength = Math.max(maxMatchLength, match.length());
				return;
			}
		}
		
		public AutoEditData findMatch(String match){
			if( match == null || match.contentEquals("") ){
				return null;
			} else {
				return findMatch(match,this);				
			}
		}		
	}

	private void initAutoEditTree(){
		String[] strs = PreferenceInitializer.getCustomAutoEditsPreference2();
		int n = strs.length/2;
		tree = new AutoEditData();
		for( int i = 0; i < n; ++i ){
			if( strs[2*i] != null && strs[2*i+1] != null && strs[2*i].length()>0
					&& strs[2*i+1].contains(CARET_CHAR)){
				tree.addMatch(strs[2*i], strs[2*i+1]);
			}
		}
	}
	
	public CustomAutoEdit(){
		initAutoEditTree();
		//FIXME: also need to properly dispose listener
		LispPlugin.getDefault().getPreferenceStore()
		 .addPropertyChangeListener(new IPropertyChangeListener(){
			public void propertyChange(PropertyChangeEvent event) {
				if(event.getProperty().equals(PreferenceConstants.CUSTOM_AUTO_EDITS)){
					initAutoEditTree();
				}
			}
		 });
	}
	
	private void cmdEnd(IDocument d, DocumentCommand c, AutoEditData data){
		try{
			d.replace(c.offset - data.offset, data.offset, data.replace);			
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		c.shiftsCaret = false;
		c.caretOffset = c.offset + data.caretMove;
		c.text = "";
		c.doit = false;
		return;
	}

	public void customizeDocumentCommand(IDocument d,
			DocumentCommand c) {
		try{
			if( tree != null && tree.subtree != null 
					&& d.getContentType(c.offset) != LispPartitionScanner.LISP_STRING
					&& d.getContentType(c.offset) != LispPartitionScanner.LISP_COMMENT
					&& tree.subtree.containsKey(c.text) ){ //candidate for autoedit
				// check if in string
				
				
				int max_match_length = 
					tree.maxMatchLength - Math.max(0, tree.maxMatchLength - c.offset - 1);
					String max_match_str = "";
					if( max_match_length > 1 ){
						max_match_str =
							d.get(c.offset - max_match_length + 1, max_match_length - 1);
					}
					AutoEditData ae = tree.findMatch(max_match_str+c.text);
					if( ae != null ){
						cmdEnd(d,c,ae);					
					}
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

}
