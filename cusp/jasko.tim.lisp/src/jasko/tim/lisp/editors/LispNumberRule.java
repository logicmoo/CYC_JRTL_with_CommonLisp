package jasko.tim.lisp.editors;

import org.eclipse.jface.text.rules.*;

public class LispNumberRule implements IRule {
	/** The token to be returned when this rule is successful */
	protected IToken fToken;

	static private String floating = "([-\\+]?((\\d+(\\.\\d*)?)|(\\.\\d+))(([esfdlESFDL])[-\\+]?\\d+)?)";
	static private String decimal = "([-\\+]?\\d+/\\d+)";
	static private String binary = "(#[bB][-\\+]?[01]+(/[01]+)?)";
	static private String radix = "(#([2-9]|([1-2]\\d)|(3[0-6]))[rR][-\\+]?[a-zA-Z0-9]+(/[a-zA-Z0-9]+)?)";
	static private String octal = "(#[oO][-\\+]?[0-7]+(/[0-7]+)?)";
	static private String hex = "(#[xX][-\\+]?[a-fA-F0-9]+(/[a-fA-F0-9]+)?)";

	public LispNumberRule(IToken token) {
		assert token != null;
		fToken= token;
	}

	public IToken evaluate(ICharacterScanner scanner) {
		int c = scanner.read();
		if (Character.isDigit((char)c) || c == '-' || c == '+' || c == '.' || c == '#') {			
			StringBuffer buf = new StringBuffer();
			do {
				buf.append((char)c);
				c = scanner.read();
			} while (!(Character.isWhitespace(c) || c == ')' || c == '('
				|| c == ICharacterScanner.EOF || c == 65535));
			if (buf.toString().matches("("+floating+"|"+decimal+"|"
					+binary+"|"+radix+"|"+octal+"|"+hex+")")) {
				scanner.unread();
				return fToken;
			}
		}
		scanner.unread();
		return Token.UNDEFINED;
	}
}
