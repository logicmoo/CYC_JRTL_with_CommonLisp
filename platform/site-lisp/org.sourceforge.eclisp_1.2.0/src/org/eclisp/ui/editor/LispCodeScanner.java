/*
 * Created on 19.04.2004
 *
 * 
 */
package org.eclisp.ui.editor;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;
import org.eclisp.ui.editor.util.LispColorProvider;
import org.eclisp.util.LispKeywordProvider;


/**
 * @author soul
 *
 */
public class LispCodeScanner extends RuleBasedScanner {
    
    private static ArrayList keywords = LispKeywordProvider.getKeywordList();
	private static String[] constants = { "t", "nil" };
	
    /**
     * @param colorProvider
     */
    public LispCodeScanner(LispColorProvider colorProvider) {
        
        //LispCodeScanner.keywords = LispKeywordProvider.getKeywordList();
        
        IToken keyword = new Token(new TextAttribute(colorProvider.getColor(LispColorProvider.KEYWORD),null , SWT.BOLD));
        IToken string = new Token(new TextAttribute(colorProvider.getColor(LispColorProvider.STRING)));        
        IToken comment = new Token(new TextAttribute(colorProvider.getColor(LispColorProvider.SINGLE_LINE_COMMENT)));
        IToken other = new Token(new TextAttribute(colorProvider.getColor(LispColorProvider.DEFAULT)));

        ArrayList rules = new ArrayList();
        
        // Add rule for single line comments.
		rules.add(new EndOfLineRule(";", comment));
        
		// Add rule for strings and character constants.
		rules.add(new SingleLineRule("\"", "\"", string, '\\'));
		//rules.add(new SingleLineRule("'", "'", string, '\\'));
		
		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new LispWhitespaceDetector()));
		

		// Add word rule for keywords, types, and constants.
		WordRule wordRule = new WordRule(new LispWordDetector(), other);
		
		for (Iterator iterator = keywords.iterator(); iterator.hasNext();) {
        	wordRule.addWord( (String) iterator.next(), keyword);
        	//wordRule.addWord( ((String) iterator.next()).toUpperCase(), keyword);
        }
		
		for (int i= 0; i < constants.length; i++) {
			wordRule.addWord(constants[i], comment);
		}
		
		rules.add(wordRule);
		
		IRule[] result= new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);
    }

	
	
}
