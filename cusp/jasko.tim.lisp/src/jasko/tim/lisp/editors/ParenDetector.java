package jasko.tim.lisp.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class ParenDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		if (c == '(' || c == ')') {
			return true;
		}
		return false;
	}

	public boolean isWordPart(char c) {
		if (c == '(' || c == ')') {
			return true;
		}
		return false;
	}

}
