package jasko.tim.lisp.editors;

import jasko.tim.lisp.ColorManager;
import jasko.tim.lisp.util.InsensitiveWordPatternRule;

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.rules.*;
import org.eclipse.swt.*;
import org.eclipse.swt.graphics.Color;

public class LispScanner extends RuleBasedScanner {

	public LispScanner(ColorManager manager, Color background) {
		IRule[] rules = new IRule[12];
		
		IToken comment = new Token(
			new TextAttribute(manager.getColor(ColorManager.TokenType.COMMENT), background, SWT.NORMAL));
		rules[0] = new EndOfLineRule(";", comment);
		
		IToken paren = new Token(
			new TextAttribute(manager.getColor(ColorManager.TokenType.PAREN), background, SWT.NORMAL));
		rules[1] = new WordRule(new ParenDetector(), paren);
		
		IToken symbol = new Token(
			new TextAttribute(manager.getColor(ColorManager.TokenType.SYMBOL), background, SWT.NORMAL));
		rules[2] = new WordRule(new SymbolDetector(':'), symbol);
		
		IToken params = new Token(
			new TextAttribute(manager.getColor(ColorManager.TokenType.PARAMS), background, SWT.ITALIC));
		rules[3] = new WordRule(new SymbolDetector('&'), params);
		
		IToken global = new Token(
			new TextAttribute(manager.getColor(ColorManager.TokenType.GLOBAL), background, SWT.NORMAL));
		//rules[5] = new SingleLineRule("*", "*", global);
		rules[4] = new WordPatternRule(new LispIdentifierDetector(), "*", "*", global);
		
		IToken constant = new Token(
				new TextAttribute(manager.getColor(ColorManager.TokenType.CONSTANT), background, SWT.NORMAL));
		rules[5] = new WordPatternRule(new LispIdentifierDetector(), "+", "+", constant);
		rules[6] = new WordPatternRule(new LispIdentifierDetector(), "#.+", "+", constant);
		
		IToken number = new Token(
				new TextAttribute(manager.getColor(ColorManager.TokenType.NUMBER), background, SWT.NORMAL));
		rules[7] = new LispNumberRule(number);
		
		IToken ucwToken = new Token(
				new TextAttribute(manager.getColor(ColorManager.TokenType.UCW_TAG), background, SWT.BOLD));
		rules[8] = new WordPatternRule(new LispIdentifierDetector(), "<:", "", ucwToken);
		rules[9] = new WordPatternRule(new LispIdentifierDetector(), "<ucw:", "", ucwToken);
		
		IToken defaultToken = new Token(
				new TextAttribute(manager.getColor(ColorManager.TokenType.KEYWORD), background, SWT.NORMAL));
		IToken keyword = new Token(
			new TextAttribute(manager.getColor(ColorManager.TokenType.KEYWORD), background, SWT.BOLD));
		WordRule keywordRule = new WordRule(new LispIdentifierDetector(), defaultToken);
		for(int i = 0; i < LispSpecialWordDetector.RESERVED_WORDS.length; i++) {
			keywordRule.addWord(LispSpecialWordDetector.RESERVED_WORDS[i], keyword);
		}
		rules[10] = keywordRule;
		
		
		IToken character = new Token(
					new TextAttribute(manager.getColor(ColorManager.TokenType.SYMBOL), background, SWT.NORMAL));
		rules[11] = new InsensitiveWordPatternRule(new CharacterDetector(), "#\\", "space", character);
			
		// Add generic whitespace rule.
		//rules[7] = new WhitespaceRule(new LispWhitespaceDetector());
		setRules(rules);
		setDefaultReturnToken(defaultToken);
	}
	
	
	
	
}
