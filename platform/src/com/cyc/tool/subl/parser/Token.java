/* For LarKC */
package com.cyc.tool.subl.parser;

public class Token {
	public static Token newToken(int ofKind) {
		switch (ofKind) {
		default:
			return new Token();
		}
	}

	public int kind;
	public int beginLine;
	public int beginColumn;
	public int endLine;
	public int endColumn;
	public String image;
	public Token next;
	public Token specialToken;

	@Override
	public String toString() {
		return image;
	}
}
