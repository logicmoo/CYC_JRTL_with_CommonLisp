/*
 * Created on 19.04.2004
 *
 * 
 */
package org.eclisp.ui.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;


/**
 * @author soul
 *
 */
public class LispWhitespaceDetector implements IWhitespaceDetector {

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.rules.IWhitespaceDetector#isWhitespace(char)
     */
    public boolean isWhitespace(char character) {
        return Character.isWhitespace(character);
    }

}
