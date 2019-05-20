package jasko.tim.lisp.editors;

import jasko.tim.lisp.util.ExactWordPatternRule;
import jasko.tim.lisp.util.InsensitiveWordPatternRule;

import org.eclipse.jface.text.rules.*;

public class LispPartitionScanner extends RuleBasedPartitionScanner {
	public final static String LISP_DEFAULT = "__lisp_default";
	public final static String LISP_COMMENT = "__lisp_comment";
	public final static String LISP_STRING = "__lisp_string";
	public final static String LISP_CHARACTER = "__lisp_character";
	public final static String LISP_SPECIAL_CHARACTER = "__lisp_special_character";
	public final static String[] PARTITIONS = {
		LISP_SPECIAL_CHARACTER,LISP_STRING, LISP_COMMENT, LISP_CHARACTER
	};

	public LispPartitionScanner() {

		IPredicateRule[] rules = new IPredicateRule[15];

		IToken lispSpecialCharacter= new Token(LISP_SPECIAL_CHARACTER);
		rules[0] = new ExactWordPatternRule("\\(",lispSpecialCharacter);
		rules[1] = new ExactWordPatternRule("\\)",lispSpecialCharacter);
		
		IToken lispComment = new Token(LISP_COMMENT);
		rules[2] = new MultiLineRule("#|", "|#", lispComment);
		rules[3] = new EndOfLineRule(";", lispComment);

		IToken lispCharacter = new Token(LISP_CHARACTER);
		rules[4] = new WordPatternRule(new CharacterDetector(), "#\\", "\"", lispCharacter);
		rules[5] = new WordPatternRule(new CharacterDetector(), "#\\", "(", lispCharacter);
		rules[6] = new WordPatternRule(new CharacterDetector(), "#\\", ")", lispCharacter);
		rules[7] = new WordPatternRule(new CharacterDetector(), "#\\", ";", lispCharacter);
		rules[8] = new InsensitiveWordPatternRule(new CharacterDetector(), "#\\", "return", lispCharacter);
		rules[9] = new InsensitiveWordPatternRule(new CharacterDetector(), "#\\", "space", lispCharacter);
		rules[10] = new InsensitiveWordPatternRule(new CharacterDetector(), "#\\", "backspace", lispCharacter);
		rules[11] = new InsensitiveWordPatternRule(new CharacterDetector(), "#\\", "newline", lispCharacter);
		rules[12] = new WordPatternRule(new CharacterDetector(), "\\", "\"", lispCharacter);
	
		IToken lispString = new Token(LISP_STRING);
		rules[13] = new MultiLineRule("\"", "\"", lispString, '\\');
		rules[14] = new EndOfLineRule("\"", lispString);

		setPredicateRules(rules);
	}
}
