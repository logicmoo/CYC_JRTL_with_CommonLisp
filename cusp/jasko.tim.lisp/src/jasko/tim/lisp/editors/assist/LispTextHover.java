package jasko.tim.lisp.editors.assist;

import jasko.tim.lisp.*;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.util.*;

import org.eclipse.jface.text.*;

/**
 * Pops up info about the symbol the mouse is hovering over.
 * @author Tim Jasko
 * @see ArglistAssistProcessor
 */
public class LispTextHover implements ITextHover, ITextHoverExtension {
	String prev = ")"; // impossible value
	String prevResult = "";
	int prevOffset = 0;
	LispEditor editor;
	
	public LispTextHover(ILispEditor editor) {
		if( editor instanceof LispEditor) {
			this.editor = (LispEditor)editor;			
		} else {
			this.editor = null;
		}
	}
	
	public LispTextHover() {
	}

	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		IDocument doc = textViewer.getDocument();
		String function = 
			LispUtil.getCurrentFullWord(doc, hoverRegion.getOffset());
		int[] range = 
			LispUtil.getCurrentFullWordRange(doc, hoverRegion.getOffset());
		if (function.equals("")) {
			return null;
		} else if (function.equals(prev) && range[0] == prevOffset) {
			return prevResult;
		}
		CuspInterface cusp = LispPlugin.getDefault().getCusp();
		String result = "";
		if (editor != null) {
			result = cusp.getArglist(function,3000, 
					LispUtil.getPackage(textViewer.getDocument().get(),
							hoverRegion.getOffset()));
		} else {
			result = cusp.getArglist(function,3000);
		}

		if (!result.contains("not available")) {
			if( result.equalsIgnoreCase("nil") ){
				result = "";
			}
			String docString = "";
			if (editor != null) {
 				docString = cusp.getDocumentation(function, 
 						LispUtil.getPackage(textViewer.getDocument().get(),
 								hoverRegion.getOffset()), 1000);
 			} else {
 				docString = cusp.getDocumentation(function, 1000);
 			}
			if (!docString.equals("") && !docString.equalsIgnoreCase("nil")) {
				if( result.equals("") ){
					result = docString;
				} else {
					result += "\n" + docString;					
				}
			}
			
			// Cache the last result, save some cusping
			prev = function;
			prevResult = result;
			prevOffset = range[0];
			
			return result;
		} else {
			return null;
		}
	}

	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

	public IInformationControlCreator getHoverControlCreator() {
		return new LispTextHoverControlCreator();
	}

}
