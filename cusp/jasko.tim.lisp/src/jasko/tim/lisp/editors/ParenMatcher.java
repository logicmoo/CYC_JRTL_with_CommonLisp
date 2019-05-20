package jasko.tim.lisp.editors;

import jasko.tim.lisp.util.*;

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.source.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

/**
 * Highlights the matching parenthesis.
 *  We even highlight the current one in red if it is unmatched.
 * @author Tim Jasko
 *
 */
public class ParenMatcher implements ICharacterPairMatcher {
	MatchingCharacterPainter painter;
	
	public void setPainter(MatchingCharacterPainter painter) {
		this.painter = painter;
	}

	public void dispose() {
	}

	public void clear() {
	}

	public IRegion match(IDocument doc, int i) {
		try {
			if (! doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
				return null;
			}
		} catch (BadLocationException e1) {
			return null;
		}
		try {
			char c = doc.getChar(i);
			
			if (c == '(') {
				int close = LispUtil.findCloseParen(doc, i+1);
				if (close > -1 ) {
					painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
					return new Region(close, 1);
				} else {
					painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_RED));
					return new Region(i, 1);
				}
			}
		} catch (BadLocationException e) {
		}
		try {
			char c2 = doc.getChar(i-1);
			if (c2 == ')') {
				int start = LispUtil.findOpenParen(doc, i-1);
				if (start > -1) {
					painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
					return new Region(start, 1);
				} else {
					painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_RED));
					return new Region(i, 1);
				}
			} else if (c2 == '(') {
				int close = LispUtil.findCloseParen(doc, i);
				if (close > -1 ) {
					painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
					return new Region(close, 1);
				} else {
					painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_RED));
					return new Region(i, 1);
				}
			}
		} catch (BadLocationException e) {
			return null;
		}
		return null;
	}

	public int getAnchor() {
		return ParenMatcher.RIGHT;
	}

}
