/*
 * Created on 20.04.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextViewer;

/**
 * @author soul
 *  
 */
public class LispDoubleClickSelector implements ITextDoubleClickStrategy {

    private ITextViewer viewer;

    private int pos;
    protected int startPos;
    protected int endPos;

    protected static char[] brackets = { '(', ')', '"', '"'};

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.text.ITextDoubleClickStrategy#doubleClicked(org.eclipse.jface.text.ITextViewer)
     */
    public void doubleClicked(ITextViewer viewer) {
        pos = viewer.getSelectedRange().x;

        if (pos < 0) { return; }

        this.viewer = viewer;

		if (!selectBracketBlock())
		    selectWord();
    }

	/**
	 * Select the area between the selected bracket and the closing bracket. Return
	 * true if successful.
	 */
	 protected boolean selectBracketBlock() {
		if (matchBracketsAt()) {

			if (startPos == endPos) {
			    viewer.setSelectedRange(startPos, 0);
			} else {
			    viewer.setSelectedRange(startPos, endPos - startPos + 1);
			}			    

			return true;
		}
		return false;
	}
	
	/**
	 * Select the word at the current selection. 
	 */
	 protected void selectWord() {
		if (matchWord()) {

			if (startPos == endPos)
			    viewer.setSelectedRange(startPos, 0);
			else
			    viewer.setSelectedRange(startPos + 1, endPos - startPos - 1);
		}
	}
	 
    /**
     * Match the brackets at the current selection. Return true if successful,
     * false otherwise.
     */
    protected boolean matchBracketsAt() {

        char prevChar, nextChar;

        int i;
        int bracketIndex1 = brackets.length;
        int bracketIndex2 = brackets.length;

        startPos = -1;
        endPos = -1;

        // get the chars preceding and following the start position
        try {

            IDocument doc = viewer.getDocument();

            prevChar = doc.getChar(pos - 1);
            nextChar = doc.getChar(pos);

            // is the char either an open or close bracket?
            for (i = 0; i < brackets.length; i = i + 2) {
                if (prevChar == brackets[i]) {
                    startPos = pos - 1;
                    bracketIndex1 = i;
                }
            }
            for (i = 1; i < brackets.length; i = i + 2) {
                if (nextChar == brackets[i]) {
                    endPos = pos;
                    bracketIndex2 = i;
                }
            }

            if (startPos > -1 && bracketIndex1 < bracketIndex2) {
                endPos = searchForClosingBracket(startPos, prevChar,
                        brackets[bracketIndex1 + 1], doc);
                if (endPos > -1)
                    return true;
                else
                    startPos = -1;
            } else if (endPos > -1) {
                startPos = searchForOpenBracket(endPos,
                        brackets[bracketIndex2 - 1], nextChar, doc);
                if (startPos > -1)
                    return true;
                else
                    endPos = -1;
            }

        } catch (BadLocationException x) {
        }

        return false;
    }

    /**
     * Select the word at the current selection. Return true if successful,
     * false otherwise.
     */
    protected boolean matchWord() {

        IDocument doc = viewer.getDocument();
        
        LispWordDetector wordDetector = new LispWordDetector();
        
        try {

            int curPos = pos;
            char c;

            while (curPos >= 0) {
                c = doc.getChar(curPos);
                if (!wordDetector.isWordPart(c)) {
                    break;
                }
                --curPos;
            }

            startPos = curPos;

            curPos = pos;
            int length = doc.getLength();

            while (curPos < length) {
                c = doc.getChar(curPos);
                if (!wordDetector.isWordPart(c)) {
                    break;
                }
                ++curPos;
            }

            endPos = curPos;

            return true;

        } catch (BadLocationException x) {
        }

        return false;
    }

    /**
     * Returns the position of the closing bracket after startPosition.
     * @returns the location of the closing bracket.
     * @param startPosition - the beginning position
     * @param openBracket - the character that represents the open bracket
     * @param closeBracket - the character that represents the close bracket
     * @param document - the document being searched
     */
    protected int searchForClosingBracket(int startPosition, char openBracket,
            char closeBracket, IDocument document) throws BadLocationException {
        int stack = 1;
        int closePosition = startPosition + 1;
        int length = document.getLength();
        char nextChar;

        while (closePosition < length && stack > 0) {
            nextChar = document.getChar(closePosition);
            if (nextChar == openBracket && nextChar != closeBracket)
                stack++;
            else if (nextChar == closeBracket) stack--;
            closePosition++;
        }

        if (stack == 0)
            return closePosition - 1;
        else
            return -1;

    }

    /**
     * Returns the position of the open bracket before startPosition.
     * @returns the location of the starting bracket.
     * @param startPosition - the beginning position
     * @param openBracket - the character that represents the open bracket
     * @param closeBracket - the character that represents the close bracket
     * @param document - the document being searched
     */
    protected int searchForOpenBracket(int startPosition, char openBracket,
            char closeBracket, IDocument document) throws BadLocationException {
        int stack = 1;
        int openPos = startPosition - 1;
        char nextChar;

        while (openPos >= 0 && stack > 0) {
            nextChar = document.getChar(openPos);
            if (nextChar == closeBracket && nextChar != openBracket)
                stack++;
            else if (nextChar == openBracket) stack--;
            openPos--;
        }

        if (stack == 0)
            return openPos + 1;
        else
            return -1;
    }

}