/*
 * Created on 19.04.2004
 *
 * 
 */
package org.eclisp.ui.editor;

import java.util.ArrayList;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;


/**
 * @author soul
 *
 */
public class LispPartitionScanner extends RuleBasedPartitionScanner {

	public final static String LISP_MULTILINE_COMMENT= "__lisp_multiline_comment"; //$NON-NLS-1$
	public final static String[] LISP_PARTITION_TYPES= new String[] { LISP_MULTILINE_COMMENT };
	
	
	/**
	 * Detector for empty comments.
	 */
	static class EmptyCommentDetector implements IWordDetector {

		/* (non-Javadoc)
		* Method declared on IWordDetector
	 	*/
		public boolean isWordStart(char c) {
			return (c == '#');
		}

		/* (non-Javadoc)
		* Method declared on IWordDetector
	 	*/
		public boolean isWordPart(char c) {
			return (c == '#' || c == '|');
		}
	}
	
	/**
	 * 
	 */
	static class WordPredicateRule extends WordRule implements IPredicateRule {
		
		private IToken fSuccessToken;
		
		public WordPredicateRule(IToken successToken) {
			super(new EmptyCommentDetector());
			fSuccessToken= successToken;
			addWord("#||#", fSuccessToken);
		}
		
		/*
		 * @see org.eclipse.jface.text.rules.IPredicateRule#evaluate(ICharacterScanner, boolean)
		 */
		public IToken evaluate(ICharacterScanner scanner, boolean resume) {
			return super.evaluate(scanner);
		}

		/*
		 * @see org.eclipse.jface.text.rules.IPredicateRule#getSuccessToken()
		 */
		public IToken getSuccessToken() {
			return fSuccessToken;
		}
	}
	
	public LispPartitionScanner() {
	    IToken comment = new Token(LispPartitionScanner.LISP_MULTILINE_COMMENT);
	    
	    ArrayList rules = new ArrayList();
	    
	    // Add rule for single line comments.
	    rules.add(new EndOfLineRule(";", Token.UNDEFINED));

		// Add rule for strings and character constants.
		rules.add(new SingleLineRule( "\"", "\"", Token.UNDEFINED, '\\')); 
		//rules.add(new SingleLineRule( "'", "'", Token.UNDEFINED, '\\')); 

		// Add rules for multi-line comments.
		rules.add(new MultiLineRule( "#|", "|#", comment, (char) 0, true));
		
		IPredicateRule[] result = new IPredicateRule[rules.size()];
		rules.toArray(result);
		setPredicateRules(result);
	}
}
