package jasko.tim.lisp.editors;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.text.rules.IWordDetector;

public class SymbolDetector implements IWordDetector {
	
	private char start;
	
	public SymbolDetector(char start) {
		this.start = start;
	}

	public boolean isWordStart(char c) {
		return (c == start);
	}

	public boolean isWordPart(char c) {
		if (Character.isWhitespace(c) || c == '(' || c == ')') {
			return false;
		} else {
			return true;
		}
	}

}
