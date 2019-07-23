/* For LarKC */
package com.cyc.tool.subl.parser;

public class ParseException extends RuntimeException {
	public ParseException() {
		eol = System.getProperty("line.separator", "\n");
		specialConstructor = false;
	}

	public ParseException(String message) {
		super(message);
		eol = System.getProperty("line.separator", "\n");
		specialConstructor = false;
	}

	public ParseException(Token currentTokenVal, int[][] expectedTokenSequencesVal, String[] tokenImageVal) {
		super("");
		eol = System.getProperty("line.separator", "\n");
		specialConstructor = true;
		currentToken = currentTokenVal;
		expectedTokenSequences = expectedTokenSequencesVal;
		tokenImage = tokenImageVal;
	}

	protected boolean specialConstructor;
	public Token currentToken;
	public int[][] expectedTokenSequences;
	public String[] tokenImage;
	protected String eol;

	@Override
	public String getMessage() {
		if (!specialConstructor)
			return super.getMessage();
		String expected = "";
		int maxSize = 0;
		for (int i = 0; i < expectedTokenSequences.length; ++i) {
			if (maxSize < expectedTokenSequences[i].length)
				maxSize = expectedTokenSequences[i].length;
			for (int j = 0; j < expectedTokenSequences[i].length; ++j)
				expected = expected + tokenImage[expectedTokenSequences[i][j]] + " ";
			if (expectedTokenSequences[i][expectedTokenSequences[i].length - 1] != 0)
				expected += "...";
			expected = expected + eol + "    ";
		}
		String retval = "Encountered \"";
		Token tok = currentToken.next;
		for (int k = 0; k < maxSize; ++k) {
			if (k != 0)
				retval += " ";
			if (tok.kind == 0) {
				retval += tokenImage[0];
				break;
			}
			retval += add_escapes(tok.image);
			tok = tok.next;
		}
		retval = retval + "\" at line " + currentToken.next.beginLine + ", column " + currentToken.next.beginColumn
				+ "." + eol;
		if (expectedTokenSequences.length == 1)
			retval = retval + "Was expecting:" + eol + "    ";
		else
			retval = retval + "Was expecting one of:" + eol + "    ";
		retval += expected;
		return retval;
	}

	protected String add_escapes(String str) {
		StringBuilder retval = new StringBuilder();
		for (int i = 0; i < str.length(); ++i)
			switch (str.charAt(i)) {
			case '\0':
				break;
			case '\b':
				retval.append("\\b");
				break;
			case '\t':
				retval.append("\\t");
				break;
			case '\n':
				retval.append("\\n");
				break;
			case '\f':
				retval.append("\\f");
				break;
			case '\r':
				retval.append("\\r");
				break;
			case '\"':
				retval.append("\\\"");
				break;
			case '\'':
				retval.append("\\'");
				break;
			case '\\':
				retval.append("\\\\");
				break;
			default: {
				char ch;
				if ((ch = str.charAt(i)) < ' ' || ch > '~') {
					String s = "0000" + Integer.toString(ch, 16);
					retval.append("\\u" + s.substring(s.length() - 4, s.length()));
					break;
				}
				retval.append(ch);
				break;
			}
			}
		return retval.toString();
	}
}
