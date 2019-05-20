package jasko.tim.lisp.editors.assist;

import java.util.*;

import jasko.tim.lisp.*;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.util.*;

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.contentassist.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.jface.preference.IPreferenceStore; 

/**
 * One of the more important parts of an IDE, IMO.
 * This class provides both symbol completion and context info.
 * @author Tim Jasko
 *
 */
public class ArglistAssistProcessor implements IContentAssistProcessor {
	
	private static final int TIMEOUT = 2000;
	
	private String lastCompletionVariable = ")"; // impossible variable name
	private String[] lastCompletionResults;
	private LispEditor editor;
	private String[] lastCompletionResultsInfo;

	private static String NO_DOC_STRING = "No additional information is available";
	public ArglistAssistProcessor(ILispEditor editor) {
		if( editor instanceof LispEditor ){
			this.editor = (LispEditor)editor;			
		} else {
			this.editor = null;
		}
	}

	/**
	 * Finds if offset is after space or ), so that argHint should be displayed
	 * @param doc
	 * @param offset
	 * @return
	 */
	public static boolean doArgs(IDocument doc, int offset){
		char c;
		try {
			c = doc.getChar(offset-1);
		} catch (BadLocationException e) {
			e.printStackTrace();
			return false;
		}
		try {
			if ((c == ')' || Character.isWhitespace(c)) 
					&& doc.getPartition(offset-1).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
				return true;
			} else {
				return false;
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private IContextInformation getContextInfo(String info){
		if( info != null && !info.equals("") && !info.equals(NO_DOC_STRING)){
			return new ContextInformation(info, info);
		} else {
			return null;
		}
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		
		String variable = LispUtil.getCurrentWord(viewer.getDocument(), offset);
		
		if (variable.equals("") || variable.contains("\"")) {
			return null;
		}
		
		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		int nn = prefs.getInt(PreferenceConstants.AUTO_COMPLETIONS_NLIMIT);
		boolean doGetDocs = prefs.getBoolean(PreferenceConstants.DOCS_IN_COMPLETIONS);
		
		// Optimization! Save us lots of cusping (when completion is not fuzzy)
		if (variable.startsWith(lastCompletionVariable) && !variable.contains(":") 
				&& !prefs.getBoolean(PreferenceConstants.AUTO_FUZZY_COMPLETIONS)) {
			if(0 == nn){
				nn = lastCompletionResults.length;
			} else {
				nn = Math.min(nn, lastCompletionResults.length);
			}
			ArrayList<ICompletionProposal> temp
				= new ArrayList<ICompletionProposal>(nn);
			int rStart = offset - variable.length();
			for (int i = 0; i < lastCompletionResults.length; ++i) {
				String comp = lastCompletionResults[i];
				if (comp.startsWith(variable)) {
					String info = null;
					IContextInformation ci = null;
					if( doGetDocs && lastCompletionResultsInfo != null ){
						info = lastCompletionResultsInfo[i];
						ci = getContextInfo(info);																				
					}
					temp.add(new CompletionProposal(comp, rStart,
							variable.length(), comp.length(), null, null, ci ,info));
					if(temp.size() >= nn){
						break;
					}
				}
			}
			
			// Displaying a completion for something that is already complete is dumb.
			if (temp.size() == 1) {
				if (temp.get(0).getDisplayString().equals((variable))) {
					return null;
				}
			}
			
			ICompletionProposal[] ret = new ICompletionProposal[temp.size()];
			for (int i=0; i<temp.size(); ++i) {
				ret[i] = temp.get(i);
			}
			return ret;
		} else {
			CuspInterface cusp = LispPlugin.getDefault().getCusp();
			if ( doGetDocs ){
				String usepkg = null;
				if(editor != null){
					usepkg = LispUtil.getPackage(viewer.getDocument().get(),offset);
				}
				String[][] results = cusp.getCompletionsAndDocs(variable, usepkg, TIMEOUT, nn);
				if (null == results){
					return null;
				}
				if (results[0].length == 1) {
					if (results[0][0].equals(variable)) {
						return null;
					}
				}
				if(0 == nn){
					nn = results[0].length;
				} else {
					nn = Math.min(nn, results[0].length);
				}
				
				ICompletionProposal[] ret = new ICompletionProposal[nn];
				int rStart = offset - variable.length();
				lastCompletionResultsInfo = results[1];
				lastCompletionVariable = variable;
				lastCompletionResults = results[0];
				for (int j=0; j<results[0].length; ++j) {
					String info = results[1][j];
					if(info.equals("")){
						lastCompletionResultsInfo[j] = NO_DOC_STRING;
					} else {
						lastCompletionResultsInfo[j] = info;
					}
					if(j<nn){
						IContextInformation ci = getContextInfo(info);
						ret[j] = new CompletionProposal(results[0][j].toLowerCase(), rStart,
								variable.length(), results[0][j].length(), null, null, 
								ci,lastCompletionResultsInfo[j]);						
					}
				}
				return ret;
				
			} else {
				String[] results = (editor != null ?
						LispPlugin.getDefault().getCusp().getCompletions(variable, 
								LispUtil.getPackage(viewer.getDocument().get(),offset), TIMEOUT) :
						LispPlugin.getDefault().getCusp().getCompletions(variable, TIMEOUT));
				if (results.length == 1) {
					if (results[0].equals(variable)) {
						return null;
					}
				}
				
				if(0 == nn){
					nn = results.length;
				} else {
					nn = Math.min(nn, results.length);
				}
				
				ICompletionProposal[] ret = new ICompletionProposal[nn];
				int rStart = offset - variable.length();
				for (int j=0; j<nn; ++j) {
					ret[j] = new CompletionProposal(results[j].toLowerCase(), rStart,
							variable.length(), results[j].length());
				}				
				
				lastCompletionVariable = variable;
				lastCompletionResults = results;
				return ret;				
			}
		}	
	}
	
	
	public static final char[] completionActivators = "qwertyuiopasdfghjklzxcvbnm*!-:".toCharArray();
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return completionActivators;
	}
	
	
	
	//*****************************************
	//         Context Info
	
	/**
	 * Lets our ContextValidator know whether or not it needs to dismiss the
	 *  make-instance special tooltip
	 */
	protected boolean makeInstanceInfoFound = false;
	protected boolean defmethodInfoFound = false;

	public String computeContextInfoString(IDocument doc, int offset) {
		String function = LispUtil.getCurrentFunction(doc, offset);
		
		CuspInterface cusp = LispPlugin.getDefault().getCusp();
		String info = "";
		
		// Special arglist assistance for make-instance
		if (function.equals("make-instance")) {
			LispNode exp = LispParser.parse(LispUtil
					.getCurrentUnfinishedExpression(doc, offset));
			System.out.println("*" + exp);
			if (exp.get(0).params.size() >= 2) {
				String className = exp.get(0).params.get(1).value;
				className = className.replaceFirst("\'", "");
				System.out.println("className:" + className);
				
				if (editor != null) {
					info = LispPlugin.getDefault().getCusp()
						.getMakeInstanceArglist(className, 
								LispUtil.getPackage(doc.get(),offset), TIMEOUT);
				} else {
					info = LispPlugin.getDefault().getCusp()
						.getMakeInstanceArglist(className, TIMEOUT);
				}
				makeInstanceInfoFound = true;
			}
		} else if (function.equals("defmethod")) {
			LispNode exp = LispParser.parse(LispUtil
					.getCurrentUnfinishedExpression(doc, offset));
			if (exp.get(0).params.size() >= 2) {
				String arg0 = exp.get(0).params.get(1).value;
				
				if (editor != null) {
					info = LispPlugin.getDefault().getCusp()
						.getSpecialArglist("defmethod", arg0, 
								LispUtil.getPackage(doc.get(),offset), TIMEOUT);
				} else {
					info = LispPlugin.getDefault().getCusp()
						.getSpecialArglist("defmethod", arg0, TIMEOUT);
				}
				defmethodInfoFound = true;
				System.out.println("info:" + info);
			}
		}
		
		if (info.equals("")) {
			makeInstanceInfoFound = false;
			defmethodInfoFound = false;
			String docString = "";
			if (editor == null) {
				info = cusp.getArglist(function, 3000);
				docString = cusp.getDocumentation(function, 1000);
			} else {
				info = cusp.getArglist(function, 3000, 
						LispUtil.getPackage(doc.get(),offset));
				docString = cusp.getDocumentation(function, 
						LispUtil.getPackage(doc.get(),offset), 1000);
			}
			if (!docString.equals("")) {
				String[] lines = docString.split("\n");
				int maxlines = LispPlugin.getDefault()
					.getPreferenceStore().getInt(PreferenceConstants.MAX_HINT_LINES);
				if (maxlines > 0 && lines.length > maxlines) {
					for (int i=0; i<maxlines; ++i) {
						info += "\n" + lines[i];
					}
					info += "...";
				} else {
					info += "\n" + docString;
				}
			}
		}
		return info;
	}
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		
		String info = computeContextInfoString(viewer.getDocument(),offset);
		
		if (info != null && !info.equals("") && !info.equals("nil")) {
			return new IContextInformation[] {
				new ContextInformation(info, info)
			};
		}
		return null;
	}
	

	//TODO Use cusp:documentation-symbol to get info where available
	// cusp:describe-symbol ain't bad either

	private static final char[] infoActivators = new char[] { ' ' };
	
	public char[] getContextInformationAutoActivationCharacters() {
		return infoActivators;
	}

	public String getErrorMessage() {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return new ArglistContext();
	}

	

	/**
	 * Tells Eclipse when the given context info is no longer valid.
	 *  Also provides text formatting for the tooltip.
	 * @author Tim
	 *
	 */
	private class ArglistContext 
	  implements IContextInformationValidator, IContextInformationPresenter {
		private ITextViewer viewer;
		private IContextInformation info;
		private int offset;

		public void install(IContextInformation info, ITextViewer viewer, int offset) {
			this.viewer = viewer;
			this.info = info;
			this.offset = offset;
		}

		public boolean isContextInformationValid(int offset) {
			if( offset < this.offset ){
				return false;
			}
			try {
				char c = viewer.getDocument().getChar(offset-1);
				if (c == '(' || c == ')') {
					return false;
				}
				if (!makeInstanceInfoFound && Character.isWhitespace(c) &&
						LispUtil.getCurrentFunction(viewer.getDocument(), offset).equals("make-instance")) {
					return false;
				}
				if (!defmethodInfoFound && Character.isWhitespace(c) &&
						LispUtil.getCurrentFunction(viewer.getDocument(), offset).equals("defmethod")) {
					return false;
				}
			} catch (BadLocationException e) {
				
			}
			return true;
		}



		public boolean updatePresentation(int offset, TextPresentation pres) {
			if (pres!=null &&info!=null) {
				String display = info.getInformationDisplayString();
				LispNode stuff = LispParser.parse(display,true);
				// Without the check, sometimes the same range gets added twice for some reason, which causes an 
				// IllegalArgumentException later in StyledText.setStyleRanges because of overlap
				//TODO: Gorsal - null pointer exception?
				if (stuff!=null&&display!=null&&pres!=null&&pres.getCoverage() == null || 
						(pres.getCoverage()!=null&&pres.getCoverage().getLength() == 0)) {
					pres.addStyleRange(new StyleRange(0, Math.min(stuff.endOffset+1,display.length())
							, null, null, SWT.BOLD));
				}
				return true;
			}
			return false;
		}
	}


}
