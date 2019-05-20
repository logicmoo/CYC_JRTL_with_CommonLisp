package jasko.tim.lisp.editors;

import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.ICharacterScanner;

public class CharacterDetector implements IWordDetector {

	private boolean inWord = false;

	public CharacterDetector() {
		//System.out.println("*created");

	}
	
	
	public boolean isWordPart(char c) {
		//System.out.println("***" + c + ":" + index);
		/*if (index == 0 && c == '#') {
			index = 1;
			return true;
		} else if (index == 1 && c == '\\') {
			index = 2;
			return true;
		} else if (index == 2) {
			index = 3;
			return true;
		}*/
		if (inWord) {
			if  (Character.isWhitespace(c) || Character.isDigit(c)
					|| c == ')' || c == '(' || c == ICharacterScanner.EOF || c == 65535) {
				inWord = false;
				return false;
			} else {
				return true;
			}
		} else {
			if  (Character.isWhitespace(c) || Character.isDigit(c)
					|| c == ICharacterScanner.EOF || c == 65535) {
				return false;
			} else {
				inWord = true;
				return true;
			}
		}
		
		/*if (index == 0) {
			index = 1;
			return true;
		} else {
			index = 0;
			return false;
		}*/
	}

	public boolean isWordStart(char c) {
		//System.out.println("**" + c);
		if (c == '#') {
			return true;
		} else {
			return false;
		}
	}

}
