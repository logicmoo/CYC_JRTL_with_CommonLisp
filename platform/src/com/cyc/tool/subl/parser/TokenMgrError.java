/* For LarKC */
package com.cyc.tool.subl.parser;

public class TokenMgrError extends RuntimeException {
	public TokenMgrError() {
	}

	public TokenMgrError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar,
			int reason) {
		this(LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar), reason);
	}

	public TokenMgrError(String message, int reason) {
		super(message);
		errorCode = reason;
	}

	private static String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter,
			char curChar) {
		return "Lexical error at line " + errorLine + ", column " + errorColumn + ".  Encountered: "
				+ (EOFSeen ? "<EOF> "
						: "\"" + addEscapes(String.valueOf(curChar)) + "\"" + " (" + (int) curChar + "), ")
				+ "after : \"" + addEscapes(errorAfter) + "\"";
	}

	protected static String addEscapes(String str) {
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

	int errorCode;
	static int LEXICAL_ERROR = 0;
	static int STATIC_LEXER_ERROR = 1;
	static int INVALID_LEXICAL_STATE = 2;
	static int LOOP_DETECTED = 3;

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
