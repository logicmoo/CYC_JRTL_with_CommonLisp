package jasko.tim.lisp.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IWordDetector;

public class LispIdentifierDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		// Not sure where the 65535 comes from, but we were looping endlessly without it
		return !(Character.isWhitespace(c) || Character.isDigit(c)
				|| c == ')' || c == '(' || c == ICharacterScanner.EOF || c == 65535);
	}

	public boolean isWordPart(char c) {
		// Not sure where the 65535 comes from, but we were looping endlessly without it
		return !(Character.isWhitespace(c) || c == ')' || c == '('
			|| c == ICharacterScanner.EOF || c == 65535);
	}

}
