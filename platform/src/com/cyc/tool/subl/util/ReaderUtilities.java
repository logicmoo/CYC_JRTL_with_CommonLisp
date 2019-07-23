/* For LarKC */
package com.cyc.tool.subl.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderUtilities {
	public static int areParenthesesBalanced(String subLStatement) {
		int curIndex = 0;
		do {
			curIndex = subLStatement.indexOf(40, curIndex);
			if (curIndex >= 0) {
				if (!isInsideString(curIndex, subLStatement) && findMatchToOpenParen(curIndex, subLStatement) < 0)
					return 1;
				++curIndex;
			}
		} while (curIndex >= 0);
		curIndex = 0;
		do {
			curIndex = subLStatement.indexOf(41, curIndex);
			if (curIndex >= 0) {
				if (!isInsideString(curIndex, subLStatement) && findMatchToCloseParen(curIndex, subLStatement) < 0)
					return 2;
				++curIndex;
			}
		} while (curIndex >= 0);
		return 0;
	}

	public static int findMatchToCloseParen(int loc, String str) {
		try {
			int parenCount = 1;
			int i = loc - 1;
			int insideOfQuotes = 0;
			while (i >= 0) {
				char c = str.charAt(i);
				switch (c) {
				case ')':
					if (insideOfQuotes != 0)
						break;
					++parenCount;
					break;
				case '(':
					if (insideOfQuotes != 0)
						break;
					--parenCount;
					break;
				case '\"':
					try {
						if (str.charAt(i - 1) == '\\')
							break;
					} catch (Exception ex) {
					}
					if (insideOfQuotes == 0) {
						++insideOfQuotes;
						break;
					}
					--insideOfQuotes;
					break;
				}
				if (parenCount == 0)
					break;
				--i;
			}
			return i;
		} catch (Exception e) {
			return -1;
		}
	}

	public static int findMatchToOpenParen(int loc, String str) {
		try {
			int parenCount = 1;
			int i = loc + 1;
			int insideOfQuotes = 0;
			for (int size = str.length(); i <= size; ++i) {
				char c = str.charAt(i);
				switch (c) {
				case ')':
					if (insideOfQuotes != 0)
						break;
					--parenCount;
					break;
				case '(':
					if (insideOfQuotes != 0)
						break;
					++parenCount;
					break;
				case '\"':
					try {
						if (str.charAt(i - 1) == '\\')
							break;
					} catch (Exception ex) {
					}
					if (insideOfQuotes == 0) {
						++insideOfQuotes;
						break;
					}
					--insideOfQuotes;
					break;
				}
				if (parenCount == 0)
					break;
			}
			return i > str.length() ? -1 : i;
		} catch (Exception e) {
			return -1;
		}
	}

	public static int getEndOfWordAtLoc(int pos, String str) {
		if (str == null || str.length() == 0)
			return -1;
		int i = pos;
		for (int size = str.length(); i < size; ++i) {
			char c = str.charAt(i);
			if (isWordBreakChar(c))
				break;
		}
		if (i >= str.length())
			i = str.length();
		return i;
	}

	public static String getIndentationOfPreviousLine(int loc, String text) {
		if (text == null || text.length() <= 0 || loc < 0 || loc >= text.length())
			return "";
		StringBuilder buf = new StringBuilder("");
		text = text.substring(0, loc + 1);
		int aLoc = text.lastIndexOf(10);
		if (aLoc < 0)
			return "";
		for (text = text.substring(0, aLoc); text.endsWith("\n"); text = text.substring(0, text.length() - 1)) {
		}
		int endLoc = text.lastIndexOf(10, loc) + 1;
		if (endLoc < 0)
			return "";
		text = text.substring(endLoc, text.length());
		for (int i = 0, size = text.length(); i < size; ++i) {
			char c = text.charAt(i);
			if (!Character.isWhitespace(c) || c == '\n' || c == '\r')
				break;
			buf.append(c);
		}
		return buf.toString();
	}

	public static int getLocInTextFromLineCol(String text, int line, int col) {
		try {
			Pattern pattern = --line == 0 ? Pattern.compile("\\A.{" + col + "}")
					: Pattern.compile("\\A(.*?$\\s){" + line + "}.{" + col + "}", 8);
			Matcher matcher = pattern.matcher(text);
			if (matcher.find())
				return matcher.end() - 1;
		} catch (Exception ex) {
		}
		return -1;
	}

	public static int getStartOfWordAtLoc(int pos, String str) {
		if (str == null || str.length() == 0)
			return -1;
		int i = pos;
		if (pos == str.length() || !isConstantChar(str.charAt(i)))
			--i;
		while (i >= 0) {
			char c = str.charAt(i);
			if (isWordBreakChar(c)) {
				++i;
				break;
			}
			--i;
		}
		if (i < 0)
			i = 0;
		return i;
	}

	public static boolean isConstantChar(char curChar) {
		return Character.isLetterOrDigit(curChar) || curChar == '-' || curChar == '_' || curChar == '#'
				|| curChar == '$' || curChar == '*' || curChar == '?' || curChar == '\\';
	}

	public static boolean isFinalQuoteComplete(String subLStatement) {
		return !subLStatement.endsWith("'") && !subLStatement.endsWith("#(") && !subLStatement.endsWith("`")
				&& !subLStatement.endsWith(",@") && !subLStatement.endsWith(",") && !subLStatement.endsWith("#")
				&& !subLStatement.endsWith("#\\");
	}

	public static boolean isFinalStringComplete(String subLStatement) {
		return !isInsideString(subLStatement.length() - 1, subLStatement);
	}

	public static boolean isInsideString(int loc, String str) {
		try {
			int i = loc;
			int insideOfQuotes = 0;
			while (i >= 0) {
				char c = str.charAt(i);
				switch (c) {
				case '\"':
					try {
						if (str.charAt(i - 1) == '\\')
							break;
					} catch (Exception ex) {
					}
					if (insideOfQuotes == 0) {
						++insideOfQuotes;
						break;
					}
					--insideOfQuotes;
					break;
				}
				--i;
			}
			return insideOfQuotes == 1;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isWordBreakChar(char c) {
		if (Character.isLetterOrDigit(c))
			return false;
		switch (c) {
		case '#':
		case '$':
		case '+':
		case '-':
		case '.':
		case ':':
		case '?':
		case '_':
			return false;
		default:
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting.");
		try {
			String str = "ad < sad 32.235 kjds ()";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "aasdfas";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "()";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "(isa (?X dog))";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "( asdfa ) asdf ( asdf )";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "( asdf ( asdf ) \")\"";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = ") ( asdf ( asdf ) \")\" )";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "( asdf ( asdf ) \")\" )";
			System.out.println("Parenthesis are balanced '" + str + "': " + areParenthesesBalanced(str));
			str = "\"asfdaff";
			System.out.println("Final string complete? '" + str + "': " + isFinalStringComplete(str));
			str = "( asdf ( asdf ) \")\" )";
			System.out.println("Final string complete? '" + str + "': " + isFinalStringComplete(str));
			str = "\"a\nb\"";
			System.out.println("Final string complete? '" + str + "': " + isFinalStringComplete(str));
			str = "\"a\nb";
			System.out.println("Final string complete? '" + str + "': " + isFinalStringComplete(str));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finished.");
	}

	public static boolean shouldProcessSubLStatementNow(String subLStatement) {
		subLStatement = subLStatement.trim();
		boolean notIsEmptyString = !"".equals(subLStatement);
		int parenthesisMatchType = areParenthesesBalanced(subLStatement);
		boolean isFinalQuoteComplete = isFinalQuoteComplete(subLStatement);
		boolean isFinalStringComplete = isFinalStringComplete(subLStatement);
		return parenthesisMatchType == 2
				|| notIsEmptyString && parenthesisMatchType == 0 && isFinalQuoteComplete & isFinalStringComplete;
	}
}
