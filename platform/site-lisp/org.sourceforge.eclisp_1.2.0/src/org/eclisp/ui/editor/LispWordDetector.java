/*
 * Created on 19.04.2004
 *
 * 
 */
package org.eclisp.ui.editor;

import org.eclipse.jface.text.rules.IWordDetector;


/**
 * @author soul
 *
 */
public class LispWordDetector implements IWordDetector {

    private char[] starter = new char[]{'*', '&', '-', '/', '+', '<', '=', '>', '1'};
    private char[] part = new char[]{'/', '&', '-', '+', '<', '=', '>', '1', '*'};
    
    /* (non-Javadoc)
     * @see org.eclipse.jface.text.rules.IWordDetector#isWordStart(char)
     */
    public boolean isWordStart(char c) {
        
        if (Character.isLetter(c)) {
            return true;
        }
        
        for (int i = 0; i < starter.length; i++) {
            if (starter[i] == c) {
                return true;
            }
        }
        
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.rules.IWordDetector#isWordPart(char)
     */
    public boolean isWordPart(char c) {
        //return true;
        //return Character.isJavaIdentifierPart(c);
        
        if (Character.isLetter(c)) {
            return true;
        }
        
        for (int i = 0; i < part.length; i++) {
            if (part[i] == c) {
                return true;
            }
        }
        return false;
    }

}
