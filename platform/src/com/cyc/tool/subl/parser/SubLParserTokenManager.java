//
// For LarKC
//
package com.cyc.tool.subl.parser;

import java.io.IOException;

public class SubLParserTokenManager implements SubLParserConstants {
	public SubLParserTokenManager(ASCII_CharStream stream) {
		jjrounds = new int[177];
		jjstateSet = new int[354];
		curLexState = 0;
		defaultLexState = 0;
		input_stream = stream;
	}

	public SubLParserTokenManager(ASCII_CharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	private ASCII_CharStream input_stream;
	private int[] jjrounds;
	private int[] jjstateSet;
	StringBuilder image;
	int jjimageLen;
	int lengthOfMatch;
	protected char curChar;
	int curLexState;
	int defaultLexState;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;
	static long[] jjbitVec0;
	static int[] jjnextStates;
	public static String[] jjstrLiteralImages;
	public static String[] lexStateNames;
	public static int[] jjnewLexState;
	static long[] jjtoToken;
	static long[] jjtoSkip;
	static long[] jjtoSpecial;
	static long[] jjtoMore;
	static {
		jjbitVec0 = new long[] { 0L, 0L, -1L, -1L };
		jjnextStates = new int[] { 12, 13, 15, 31, 36, 37, 161, 7, 8, 10, 20, 21, 23, 26, 1, 27, 28, 20, 26, 1, 27, 20,
				21, 23, 38, 41, 43, 47, 49, 50, 51, 63, 77, 90, 93, 104, 113, 124, 125, 134, 137, 38, 41, 43, 47, 49,
				50, 51, 63, 77, 90, 93, 104, 113, 124, 125, 134, 137, 148, 162, 163, 164, 162, 163, 164, 169, 38, 41,
				43, 47, 49, 50, 51, 63, 77, 90, 93, 104, 113, 124, 125, 137, 148, 153, 4, 5, 24, 25, 41, 43, 47, 49, 50,
				51, 63, 77, 90, 93, 104, 113, 124, 125, 134, 137, 54, 55, 60, 52, 62, 65, 67, 68, 69, 71, 72, 75, 76,
				78, 79, 81, 82, 83, 87, 89, 91, 92, 95, 96, 103, 48, 129, 48, 133, 138, 140, 142, 144, 146, 147, 160,
				154, 135, 136 };
		jjstrLiteralImages = new String[] { "", "(", ")", ":", "|", "#(", "#'", "'", "`", ",@", ",", ".", "\"", "#:",
				"#.", "#+", "#-", null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null };
		lexStateNames = new String[] { "DEFAULT", "IN_SINGLE_LINE_COMMENT", "IN_MULTI_LINE_COMMENT" };
		jjnewLexState = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1,
				2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		jjtoToken = new long[] { 83590499139583L };
		jjtoSkip = new long[] { 12582912L };
		jjtoSpecial = new long[] { 12582912L };
		jjtoMore = new long[] { 19922944L };
	}

	private void jjAddStates(int start, int end) {
		do
			jjstateSet[jjnewStateCnt++] = SubLParserTokenManager.jjnextStates[start];
		while (start++ != end);
	}

	private void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private void jjCheckNAddStates(int start) {
		jjCheckNAdd(SubLParserTokenManager.jjnextStates[start]);
		jjCheckNAdd(SubLParserTokenManager.jjnextStates[start + 1]);
	}

	private void jjCheckNAddStates(int start, int end) {
		do
			jjCheckNAdd(SubLParserTokenManager.jjnextStates[start]);
		while (start++ != end);
	}

	private void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private Token jjFillToken() {
		Token t = Token.newToken(jjmatchedKind);
		t.kind = jjmatchedKind;
		String im = SubLParserTokenManager.jjstrLiteralImages[jjmatchedKind];
		t.image = im == null ? input_stream.GetImage() : im;
		t.beginLine = input_stream.getBeginLine();
		t.beginColumn = input_stream.getBeginColumn();
		t.endLine = input_stream.getEndLine();
		t.endColumn = input_stream.getEndColumn();
		return t;
	}

	private int jjMoveNfa_0(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 177;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = Integer.MAX_VALUE;
		while (true) {
			if (++jjround == Integer.MAX_VALUE)
				ReInitRounds();
			if (curChar < '@') {
				long l = 1L << curChar;
				do
					switch (jjstateSet[--i]) {
					case 0:
						if ((0xF3FFEC7200000000L & l) != 0x0L) {
							if (kind > 46)
								kind = 46;
							jjCheckNAddTwoStates(16, 18);
						} else if ((0x100003600L & l) != 0x0L) {
							if (kind > 25)
								kind = 25;
						} else if (curChar == '#')
							jjAddStates(3, 6);
						else if (curChar == '\"')
							this.jjCheckNAddStates(7, 9);
						if ((0x3FF000000000000L & l) != 0x0L) {
							if (kind > 29)
								kind = 29;
							this.jjCheckNAddStates(10, 16);
							continue;
						}
						if ((0x280000000000L & l) != 0x0L) {
							this.jjCheckNAddStates(17, 20);
							continue;
						}
						if (curChar == '.') {
							jjCheckNAdd(2);
							continue;
						}
						continue;
					case 177:
						if ((0xFFFFFFFBFFFFFFFFL & l) != 0x0L) {
							this.jjCheckNAddStates(7, 9);
							continue;
						}
						if (curChar == '\"' && kind > 42) {
							kind = 42;
							continue;
						}
						continue;
					case 31:
						if ((0x3FF000000000000L & l) != 0x0L) {
							jjCheckNAddTwoStates(32, 33);
							continue;
						}
						continue;
					case 179:
						if ((0xF3FFEC7200000000L & l) != 0x0L) {
							if (kind > 46)
								kind = 46;
							jjCheckNAddTwoStates(16, 18);
						}
						if ((0x3FF000000000000L & l) != 0x0L) {
							if (kind > 27)
								kind = 27;
							jjCheckNAddTwoStates(2, 3);
							continue;
						}
						continue;
					case 1:
						if (curChar == '.') {
							jjCheckNAdd(2);
							continue;
						}
						continue;
					case 2:
						if ((0x3FF000000000000L & l) == 0x0L)
							continue;
						if (kind > 27)
							kind = 27;
						jjCheckNAddTwoStates(2, 3);
						continue;
					case 4:
						if ((0x280000000000L & l) != 0x0L) {
							jjCheckNAdd(5);
							continue;
						}
						continue;
					case 5:
						if ((0x3FF000000000000L & l) == 0x0L)
							continue;
						if (kind > 27)
							kind = 27;
						jjCheckNAdd(5);
						continue;
					case 6:
						if (curChar == '\"') {
							this.jjCheckNAddStates(7, 9);
							continue;
						}
						continue;
					case 7:
						if ((0xFFFFFFFBFFFFFFFFL & l) != 0x0L) {
							this.jjCheckNAddStates(7, 9);
							continue;
						}
						continue;
					case 10:
						if (curChar == '\"' && kind > 42) {
							kind = 42;
							continue;
						}
						continue;
					case 18:
						if ((0xF3FFEC7200000000L & l) == 0x0L)
							continue;
						if (kind > 46)
							kind = 46;
						jjCheckNAddTwoStates(16, 18);
						continue;
					case 19:
						if ((0x280000000000L & l) != 0x0L) {
							this.jjCheckNAddStates(17, 20);
							continue;
						}
						continue;
					case 20:
						if ((0x3FF000000000000L & l) != 0x0L) {
							this.jjCheckNAddStates(21, 23);
							continue;
						}
						continue;
					case 21:
						if (curChar == '.') {
							jjCheckNAddTwoStates(22, 23);
							continue;
						}
						continue;
					case 22:
						if ((0x3FF000000000000L & l) != 0x0L) {
							jjCheckNAddTwoStates(22, 23);
							continue;
						}
						continue;
					case 24:
						if ((0x280000000000L & l) != 0x0L) {
							jjCheckNAdd(25);
							continue;
						}
						continue;
					case 25:
						if ((0x3FF000000000000L & l) == 0x0L)
							continue;
						if (kind > 26)
							kind = 26;
						jjCheckNAdd(25);
						continue;
					case 26:
						if ((0x3FF000000000000L & l) != 0x0L) {
							jjCheckNAddTwoStates(26, 1);
							continue;
						}
						continue;
					case 27:
						if ((0x3FF000000000000L & l) == 0x0L)
							continue;
						if (kind > 29)
							kind = 29;
						jjCheckNAddTwoStates(27, 28);
						continue;
					case 28:
						if (curChar == '.' && kind > 29) {
							kind = 29;
							continue;
						}
						continue;
					case 29:
						if ((0x3FF000000000000L & l) == 0x0L)
							continue;
						if (kind > 29)
							kind = 29;
						this.jjCheckNAddStates(10, 16);
						continue;
					case 30:
						if (curChar == '#') {
							jjAddStates(3, 6);
							continue;
						}
						continue;
					case 32:
						if ((0x3FF000000000000L & l) != 0x0L) {
							jjCheckNAdd(33);
							continue;
						}
						continue;
					case 34:
						if ((0x280000000000L & l) != 0x0L) {
							jjCheckNAdd(35);
							continue;
						}
						continue;
					case 35:
						if ((0x3FF000000000000L & l) == 0x0L)
							continue;
						if (kind > 30)
							kind = 30;
						jjCheckNAdd(35);
						continue;
					case 116:
						if (curChar == '-') {
							jjstateSet[jjnewStateCnt++] = 115;
							continue;
						}
						continue;
					case 139:
						if (curChar == '1' && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 141:
						if (curChar == '2' && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 143:
						if (curChar == '3' && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 145:
						if (curChar == '4' && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 149:
						if (curChar == '-') {
							this.jjCheckNAddStates(24, 40);
							continue;
						}
						continue;
					case 154:
						if (curChar == '-') {
							this.jjCheckNAddStates(41, 58);
							continue;
						}
						continue;
					case 163:
						if ((0xFFFFFFFE00000000L & l) != 0x0L && kind > 34) {
							kind = 34;
							continue;
						}
						continue;
					case 165:
						if (curChar == '-') {
							jjCheckNAddTwoStates(162, 163);
							continue;
						}
						continue;
					case 170:
						if (curChar == '-') {
							this.jjCheckNAddStates(59, 61);
							continue;
						}
						continue;
					default:
						continue;
					case 12:
					case 14:
					case 178:
						this.jjCheckNAddStates(0, 2);
						continue;
					case 9:
						this.jjCheckNAddStates(7, 9);
						continue;
					case 17:
						if (kind > 46)
							kind = 46;
						jjCheckNAddTwoStates(16, 18);
						continue;
					}
				while (i != startsAt);
			} else if (curChar < '\u0080') {
				long l = 1L << (curChar & '?');
				do
					switch (jjstateSet[--i]) {
					case 178:
						if ((0xEFFFFFFFEFFFFFFFL & l) != 0x0L) {
							this.jjCheckNAddStates(0, 2);
							continue;
						}
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 14;
							continue;
						}
						continue;
					case 0:
						if ((0x6FFFFFFEEFFFFFFFL & l) != 0x0L) {
							if (kind > 46)
								kind = 46;
							jjCheckNAddTwoStates(16, 18);
							continue;
						}
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 17;
							continue;
						}
						if (curChar == '|') {
							jjCheckNAddTwoStates(12, 13);
							continue;
						}
						continue;
					case 177:
						if ((0xFFFFFFFFEFFFFFFFL & l) != 0x0L) {
							this.jjCheckNAddStates(7, 9);
							continue;
						}
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 9;
							continue;
						}
						continue;
					case 31:
						if ((0x100800401008004L & l) != 0x0L)
							jjCheckNAddTwoStates(34, 35);
						else if (curChar == '\\')
							this.jjCheckNAddStates(62, 65);
						if (curChar == '\\') {
							this.jjCheckNAddStates(66, 83);
							continue;
						}
						continue;
					case 179:
						if ((0x6FFFFFFEEFFFFFFFL & l) != 0x0L) {
							if (kind > 46)
								kind = 46;
							jjCheckNAddTwoStates(16, 18);
							continue;
						}
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 17;
							continue;
						}
						continue;
					case 3:
						if ((0x8107000081070L & l) != 0x0L) {
							jjAddStates(84, 85);
							continue;
						}
						continue;
					case 7:
						if ((0xFFFFFFFFEFFFFFFFL & l) != 0x0L) {
							this.jjCheckNAddStates(7, 9);
							continue;
						}
						continue;
					case 8:
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 9;
							continue;
						}
						continue;
					case 11:
						if (curChar == '|') {
							jjCheckNAddTwoStates(12, 13);
							continue;
						}
						continue;
					case 12:
						if ((0xEFFFFFFFEFFFFFFFL & l) != 0x0L) {
							this.jjCheckNAddStates(0, 2);
							continue;
						}
						continue;
					case 13:
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 14;
							continue;
						}
						continue;
					case 15:
						if (curChar == '|' && kind > 43) {
							kind = 43;
							continue;
						}
						continue;
					case 16:
						if (curChar == '\\') {
							jjstateSet[jjnewStateCnt++] = 17;
							continue;
						}
						continue;
					case 18:
						if ((0x6FFFFFFEEFFFFFFFL & l) == 0x0L)
							continue;
						if (kind > 46)
							kind = 46;
						jjCheckNAddTwoStates(16, 18);
						continue;
					case 23:
						if ((0x8107000081070L & l) != 0x0L) {
							jjAddStates(86, 87);
							continue;
						}
						continue;
					case 33:
						if ((0x4000000040000L & l) != 0x0L) {
							jjCheckNAddTwoStates(34, 35);
							continue;
						}
						continue;
					case 35:
						if ((0x7FFFFFE07FFFFFEL & l) == 0x0L)
							continue;
						if (kind > 30)
							kind = 30;
						jjCheckNAdd(35);
						continue;
					case 36:
						if ((0x100800401008004L & l) != 0x0L) {
							jjCheckNAddTwoStates(34, 35);
							continue;
						}
						continue;
					case 37:
						if (curChar == '\\') {
							this.jjCheckNAddStates(66, 83);
							continue;
						}
						continue;
					case 38:
						if (curChar == '\\') {
							this.jjCheckNAddStates(88, 103);
							continue;
						}
						continue;
					case 39:
						if ((0x400000004L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 40:
					case 114:
						if ((0x200000002L & l) != 0x0L) {
							jjCheckNAdd(39);
							continue;
						}
						continue;
					case 41:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 40;
							continue;
						}
						continue;
					case 42:
						if ((0x10000000100000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 43:
						if ((0x10000000100L & l) != 0x0L) {
							jjCheckNAdd(42);
							continue;
						}
						continue;
					case 44:
						if ((0x2000000020L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 45:
						if ((0x8000000080L & l) != 0x0L) {
							jjCheckNAdd(44);
							continue;
						}
						continue;
					case 46:
						if ((0x200000002L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 45;
							continue;
						}
						continue;
					case 47:
						if ((0x1000000010000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 46;
							continue;
						}
						continue;
					case 48:
						if ((0x8000000080000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 49:
						if ((0x8000000080L & l) != 0x0L) {
							jjCheckNAdd(48);
							continue;
						}
						continue;
					case 50:
						if ((0x20000000200000L & l) != 0x0L) {
							jjCheckNAdd(48);
							continue;
						}
						continue;
					case 51:
						if ((0x400000004000L & l) != 0x0L) {
							this.jjCheckNAddStates(104, 108);
							continue;
						}
						continue;
					case 52:
						if ((0x100000001000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 53:
					case 94:
						if ((0x100000001000L & l) != 0x0L) {
							jjCheckNAdd(52);
							continue;
						}
						continue;
					case 54:
						if ((0x20000000200000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 53;
							continue;
						}
						continue;
					case 55:
						if ((0x20000000200000L & l) != 0x0L) {
							jjCheckNAdd(52);
							continue;
						}
						continue;
					case 56:
						if ((0x400000004000L & l) != 0x0L) {
							jjCheckNAdd(44);
							continue;
						}
						continue;
					case 57:
						if ((0x20000000200L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 56;
							continue;
						}
						continue;
					case 58:
						if ((0x100000001000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 57;
							continue;
						}
						continue;
					case 59:
						if ((0x80000000800000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 58;
							continue;
						}
						continue;
					case 60:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 59;
							continue;
						}
						continue;
					case 61:
						if ((0x80000000800L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 62:
						if ((0x200000002L & l) != 0x0L) {
							jjCheckNAdd(61);
							continue;
						}
						continue;
					case 63:
						if ((0x8000000080000L & l) != 0x0L) {
							jjAddStates(109, 116);
							continue;
						}
						continue;
					case 64:
						if ((0x10000000100L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 65:
						if ((0x800000008000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 64;
							continue;
						}
						continue;
					case 66:
						if ((0x100000001000000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 67:
					case 78:
						if ((0x10000000100000L & l) != 0x0L) {
							jjCheckNAdd(66);
							continue;
						}
						continue;
					case 68:
						if ((0x800000008000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 69:
						if ((0x20000000200L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 70:
						if ((0x400000004000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 71:
						if ((0x200000002000000L & l) != 0x0L) {
							jjCheckNAdd(70);
							continue;
						}
						continue;
					case 72:
						if ((0x20000000200000L & l) != 0x0L) {
							jjCheckNAdd(39);
							continue;
						}
						continue;
					case 73:
					case 97:
						if ((0x800000008L & l) != 0x0L) {
							jjCheckNAdd(44);
							continue;
						}
						continue;
					case 74:
						if ((0x200000002L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 73;
							continue;
						}
						continue;
					case 75:
						if ((0x1000000010000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 74;
							continue;
						}
						continue;
					case 76:
						if ((0x1000000010000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 77:
						if ((0x2000000020L & l) != 0x0L) {
							jjAddStates(117, 123);
							continue;
						}
						continue;
					case 79:
						if ((0x800000008000L & l) != 0x0L) {
							jjCheckNAdd(42);
							continue;
						}
						continue;
					case 80:
						if ((0x2000000020000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 81:
						if ((0x400000004000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 80;
							continue;
						}
						continue;
					case 82:
						if ((0x10000000100000L & l) != 0x0L) {
							jjCheckNAdd(39);
							continue;
						}
						continue;
					case 83:
						if ((0x200000002000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 84:
						if ((0x1000000010000L & l) != 0x0L) {
							jjCheckNAdd(44);
							continue;
						}
						continue;
					case 85:
						if ((0x200000002L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 84;
							continue;
						}
						continue;
					case 86:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 85;
							continue;
						}
						continue;
					case 87:
						if ((0x8000000080000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 86;
							continue;
						}
						continue;
					case 88:
						if ((0x800000008L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 89:
						if ((0x8000000080000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 88;
							continue;
						}
						continue;
					case 90:
						if ((0x200000002L & l) != 0x0L) {
							jjAddStates(124, 125);
							continue;
						}
						continue;
					case 91:
						if ((0x800000008L & l) != 0x0L) {
							jjCheckNAdd(61);
							continue;
						}
						continue;
					case 92:
						if ((0x100000001000L & l) != 0x0L) {
							jjCheckNAdd(42);
							continue;
						}
						continue;
					case 93:
						if ((0x400000004L & l) != 0x0L) {
							this.jjCheckNAddStates(126, 129);
							continue;
						}
						continue;
					case 95:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 94;
							continue;
						}
						continue;
					case 96:
					case 147:
						if ((0x2000000020L & l) != 0x0L) {
							jjCheckNAdd(52);
							continue;
						}
						continue;
					case 98:
						if ((0x200000002L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 97;
							continue;
						}
						continue;
					case 99:
						if ((0x1000000010000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 98;
							continue;
						}
						continue;
					case 100:
						if ((0x8000000080000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 99;
							continue;
						}
						continue;
					case 101:
						if ((0x80000000800L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 100;
							continue;
						}
						continue;
					case 102:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 101;
							continue;
						}
						continue;
					case 103:
						if ((0x200000002L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 102;
							continue;
						}
						continue;
					case 104:
						if ((0x100000001000L & l) != 0x0L) {
							jjCheckNAddTwoStates(111, 112);
							continue;
						}
						continue;
					case 105:
						if ((0x1000000010L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 106:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 105;
							continue;
						}
						continue;
					case 107:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 106;
							continue;
						}
						continue;
					case 108:
						if ((0x4000000040L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 107;
							continue;
						}
						continue;
					case 109:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 108;
							continue;
						}
						continue;
					case 110:
						if ((0x400000004000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 109;
							continue;
						}
						continue;
					case 111:
						if ((0x20000000200L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 110;
							continue;
						}
						continue;
					case 112:
						if ((0x4000000040L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 113:
						if ((0x40000000400000L & l) != 0x0L) {
							jjCheckNAddTwoStates(123, 42);
							continue;
						}
						continue;
					case 115:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 114;
							continue;
						}
						continue;
					case 117:
						if ((0x100000001000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 116;
							continue;
						}
						continue;
					case 118:
						if ((0x200000002L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 117;
							continue;
						}
						continue;
					case 119:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 118;
							continue;
						}
						continue;
					case 120:
						if ((0x20000000200L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 119;
							continue;
						}
						continue;
					case 121:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 120;
							continue;
						}
						continue;
					case 122:
						if ((0x4000000040000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 121;
							continue;
						}
						continue;
					case 123:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 122;
							continue;
						}
						continue;
					case 124:
						if ((0x4000000040L & l) != 0x0L) {
							jjCheckNAddTwoStates(112, 48);
							continue;
						}
						continue;
					case 125:
						if ((0x4000000040000L & l) != 0x0L) {
							this.jjCheckNAddStates(130, 132);
							continue;
						}
						continue;
					case 126:
						if ((0x4000000040000L & l) != 0x0L) {
							jjCheckNAdd(70);
							continue;
						}
						continue;
					case 127:
						if ((0x20000000200000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 126;
							continue;
						}
						continue;
					case 128:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 127;
							continue;
						}
						continue;
					case 129:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 128;
							continue;
						}
						continue;
					case 130:
						if ((0x20000000200000L & l) != 0x0L) {
							jjCheckNAdd(42);
							continue;
						}
						continue;
					case 131:
						if ((0x800000008000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 130;
							continue;
						}
						continue;
					case 132:
						if ((0x400000004L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 131;
							continue;
						}
						continue;
					case 133:
						if ((0x20000000200000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 132;
							continue;
						}
						continue;
					case 134:
						if ((0x800000008L & l) != 0x0L) {
							jjCheckNAddTwoStates(135, 136);
							continue;
						}
						continue;
					case 135:
						if ((0x4000000040000L & l) != 0x0L && kind > 33) {
							kind = 33;
							continue;
						}
						continue;
					case 136:
						if ((0x200000002L & l) != 0x0L) {
							jjCheckNAdd(70);
							continue;
						}
						continue;
					case 137:
						if ((0x1000000010L & l) != 0x0L) {
							jjAddStates(133, 138);
							continue;
						}
						continue;
					case 138:
						if ((0x100000001000L & l) != 0x0L) {
							jjCheckNAdd(44);
							continue;
						}
						continue;
					case 140:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 139;
							continue;
						}
						continue;
					case 142:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 141;
							continue;
						}
						continue;
					case 144:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 143;
							continue;
						}
						continue;
					case 146:
						if ((0x800000008L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 145;
							continue;
						}
						continue;
					case 148:
						if ((0x200000002000L & l) != 0x0L) {
							jjCheckNAddTwoStates(152, 149);
							continue;
						}
						continue;
					case 150:
						if ((0x200000002L & l) != 0x0L) {
							jjCheckNAdd(149);
							continue;
						}
						continue;
					case 151:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 150;
							continue;
						}
						continue;
					case 152:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 151;
							continue;
						}
						continue;
					case 153:
						if ((0x800000008L & l) != 0x0L) {
							this.jjCheckNAddStates(139, 142);
							continue;
						}
						continue;
					case 155:
						if ((0x100000001000L & l) != 0x0L) {
							jjCheckNAdd(154);
							continue;
						}
						continue;
					case 156:
						if ((0x800000008000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 155;
							continue;
						}
						continue;
					case 157:
						if ((0x4000000040000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 156;
							continue;
						}
						continue;
					case 158:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 157;
							continue;
						}
						continue;
					case 159:
						if ((0x400000004000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 158;
							continue;
						}
						continue;
					case 160:
						if ((0x800000008000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 159;
							continue;
						}
						continue;
					case 161:
						if (curChar == '\\') {
							this.jjCheckNAddStates(62, 65);
							continue;
						}
						continue;
					case 162:
						if (curChar == '\\') {
							jjCheckNAdd(163);
							continue;
						}
						continue;
					case 163:
						if ((Long.MAX_VALUE & l) != 0x0L && kind > 34) {
							kind = 34;
							continue;
						}
						continue;
					case 164:
						if ((0x200000002000L & l) != 0x0L) {
							jjCheckNAddTwoStates(168, 165);
							continue;
						}
						continue;
					case 166:
						if ((0x200000002L & l) != 0x0L) {
							jjCheckNAdd(165);
							continue;
						}
						continue;
					case 167:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 166;
							continue;
						}
						continue;
					case 168:
						if ((0x2000000020L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 167;
							continue;
						}
						continue;
					case 169:
						if ((0x800000008L & l) != 0x0L) {
							jjCheckNAddTwoStates(176, 170);
							continue;
						}
						continue;
					case 171:
						if ((0x100000001000L & l) != 0x0L) {
							jjCheckNAdd(170);
							continue;
						}
						continue;
					case 172:
						if ((0x800000008000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 171;
							continue;
						}
						continue;
					case 173:
						if ((0x4000000040000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 172;
							continue;
						}
						continue;
					case 174:
						if ((0x10000000100000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 173;
							continue;
						}
						continue;
					case 175:
						if ((0x400000004000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 174;
							continue;
						}
						continue;
					case 176:
						if ((0x800000008000L & l) != 0x0L) {
							jjstateSet[jjnewStateCnt++] = 175;
							continue;
						}
						continue;
					default:
						continue;
					case 9:
						this.jjCheckNAddStates(7, 9);
						continue;
					case 14:
						this.jjCheckNAddStates(0, 2);
						continue;
					case 17:
						if (kind > 46)
							kind = 46;
						jjCheckNAddTwoStates(16, 18);
						continue;
					}
				while (i != startsAt);
			} else {
				int i2 = (curChar & '\u00ff') >> 6;
				long l2 = 1L << (curChar & '?');
				do
					switch (jjstateSet[--i]) {
					case 12:
					case 14:
					case 178:
						if ((SubLParserTokenManager.jjbitVec0[i2] & l2) != 0x0L) {
							this.jjCheckNAddStates(0, 2);
							continue;
						}
						continue;
					default:
						continue;
					}
				while (i != startsAt);
			}
			if (kind != Integer.MAX_VALUE) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = Integer.MAX_VALUE;
			}
			++curPos;
			int n = i = jjnewStateCnt;
			int n2 = 177;
			int jjnewStateCnt = startsAt;
			this.jjnewStateCnt = jjnewStateCnt;
			if (n == (startsAt = n2 - jjnewStateCnt))
				break;
			try {
				curChar = input_stream.readChar();
			} catch (IOException e) {
				return curPos;
			}
		}
		return curPos;
	}

	private int jjMoveNfa_1(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 3;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = Integer.MAX_VALUE;
		while (true) {
			if (++jjround == Integer.MAX_VALUE)
				ReInitRounds();
			if (curChar < '@') {
				long l = 1L << curChar;
				do
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x2400L & l) != 0x0L && kind > 22)
							kind = 22;
						if (curChar == '\r') {
							jjstateSet[jjnewStateCnt++] = 1;
							continue;
						}
						continue;
					case 1:
						if (curChar == '\n' && kind > 22) {
							kind = 22;
							continue;
						}
						continue;
					case 2:
						if (curChar == '\r') {
							jjstateSet[jjnewStateCnt++] = 1;
							continue;
						}
						continue;
					default:
						continue;
					}
				while (i != startsAt);
			} else if (curChar < '\u0080') {
				long l = 1L << (curChar & '?');
				do
					switch (jjstateSet[--i]) {
					default:
						continue;
					}
				while (i != startsAt);
			} else {
				int i2 = (curChar & '\u00ff') >> 6;
				long l2 = 1L << (curChar & '?');
				do
					switch (jjstateSet[--i]) {
					default:
						continue;
					}
				while (i != startsAt);
			}
			if (kind != Integer.MAX_VALUE) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = Integer.MAX_VALUE;
			}
			++curPos;
			int n = i = jjnewStateCnt;
			int n2 = 3;
			int jjnewStateCnt = startsAt;
			this.jjnewStateCnt = jjnewStateCnt;
			if (n == (startsAt = n2 - jjnewStateCnt))
				break;
			try {
				curChar = input_stream.readChar();
			} catch (IOException e) {
				return curPos;
			}
		}
		return curPos;
	}

	private int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case '\"':
			return jjStartNfaWithStates_0(0, 12, 177);
		case '#':
			return jjMoveStringLiteralDfa1_0(2220128L);
		case '\'':
			return jjStopAtPos(0, 7);
		case '(':
			return jjStopAtPos(0, 1);
		case ')':
			return jjStopAtPos(0, 2);
		case ',':
			jjmatchedKind = 10;
			return jjMoveStringLiteralDfa1_0(512L);
		case '.':
			return jjStartNfaWithStates_0(0, 11, 179);
		case ':':
			return jjStopAtPos(0, 3);
		case ';':
			return jjStopAtPos(0, 20);
		case '`':
			return jjStopAtPos(0, 8);
		case '|':
			return jjStartNfaWithStates_0(0, 4, 178);
		default:
			return jjMoveNfa_0(0, 0);
		}
	}

	private int jjMoveStringLiteralDfa0_1() {
		return jjMoveNfa_1(0, 0);
	}

	private int jjMoveStringLiteralDfa0_2() {
		switch (curChar) {
		case '|':
			return jjMoveStringLiteralDfa1_2(8388608L);
		default:
			return 1;
		}
	}

	private int jjMoveStringLiteralDfa1_0(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case '\'':
			if ((active0 & 0x40L) != 0x0L)
				return jjStopAtPos(1, 6);
			break;
		case '(':
			if ((active0 & 0x20L) != 0x0L)
				return jjStopAtPos(1, 5);
			break;
		case '+':
			if ((active0 & 0x8000L) != 0x0L)
				return jjStopAtPos(1, 15);
			break;
		case '-':
			if ((active0 & 0x10000L) != 0x0L)
				return jjStopAtPos(1, 16);
			break;
		case '.':
			if ((active0 & 0x4000L) != 0x0L)
				return jjStopAtPos(1, 14);
			break;
		case ':':
			if ((active0 & 0x2000L) != 0x0L)
				return jjStopAtPos(1, 13);
			break;
		case '@':
			if ((active0 & 0x200L) != 0x0L)
				return jjStopAtPos(1, 9);
			break;
		case '|':
			if ((active0 & 0x200000L) != 0x0L)
				return jjStopAtPos(1, 21);
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private int jjMoveStringLiteralDfa1_2(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (IOException e) {
			return 1;
		}
		switch (curChar) {
		case '#':
			if ((active0 & 0x800000L) != 0x0L)
				return jjStopAtPos(1, 23);
			return 2;
		default:
			return 2;
		}
	}

	private int jjStartNfa_0(int pos, long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	private int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		return (jjmatchedPos = pos) + 1;
	}

	private int jjStopStringLiteralDfa_0(int pos, long active0) {
		switch (pos) {
		case 0:
			if ((active0 & 0x1000L) != 0x0L)
				return 177;
			if ((active0 & 0x10L) != 0x0L)
				return 178;
			if ((active0 & 0x800L) != 0x0L)
				return 179;
			if ((active0 & 0x21E060L) != 0x0L)
				return 31;
			return -1;
		default:
			return -1;
		}
	}

	private void ReInitRounds() {
		jjround = -2147483647;
		int i = 177;
		while (i-- > 0)
			jjrounds[i] = Integer.MIN_VALUE;
	}

	public Token getNextToken() {
		Token specialToken = null;
		int curPos = 0;
		Label_0461: while (true) {
			try {
				curChar = input_stream.BeginToken();
			} catch (IOException e) {
				jjmatchedKind = 0;
				Token matchedToken = jjFillToken();
				matchedToken.specialToken = specialToken;
				return matchedToken;
			}
			image = null;
			jjimageLen = 0;
			while (true) {
				switch (curLexState) {
				case 0:
					jjmatchedKind = Integer.MAX_VALUE;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_0();
					break;
				case 1:
					jjmatchedKind = Integer.MAX_VALUE;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_1();
					if (jjmatchedPos == 0 && jjmatchedKind > 24) {
						jjmatchedKind = 24;
						break;
					}
					break;
				case 2:
					jjmatchedKind = Integer.MAX_VALUE;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_2();
					if (jjmatchedPos == 0 && jjmatchedKind > 24) {
						jjmatchedKind = 24;
						break;
					}
					break;
				}
				if (jjmatchedKind == Integer.MAX_VALUE)
					break Label_0461;
				if (jjmatchedPos + 1 < curPos)
					input_stream.backup(curPos - jjmatchedPos - 1);
				if ((SubLParserTokenManager.jjtoToken[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 0x3F)) != 0x0L) {
					Token matchedToken = jjFillToken();
					matchedToken.specialToken = specialToken;
					if (SubLParserTokenManager.jjnewLexState[jjmatchedKind] != -1)
						curLexState = SubLParserTokenManager.jjnewLexState[jjmatchedKind];
					return matchedToken;
				}
				if ((SubLParserTokenManager.jjtoSkip[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 0x3F)) == 0x0L) {
					jjimageLen += jjmatchedPos + 1;
					if (SubLParserTokenManager.jjnewLexState[jjmatchedKind] != -1)
						curLexState = SubLParserTokenManager.jjnewLexState[jjmatchedKind];
					curPos = 0;
					jjmatchedKind = Integer.MAX_VALUE;
					try {
						curChar = input_stream.readChar();
						continue;
					} catch (IOException ex) {
					}
					break Label_0461;
				}
				if ((SubLParserTokenManager.jjtoSpecial[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 0x3F)) != 0x0L) {
					Token matchedToken = jjFillToken();
					if (specialToken == null)
						specialToken = matchedToken;
					else {
						matchedToken.specialToken = specialToken;
						Token token = specialToken;
						Token next = matchedToken;
						token.next = next;
						specialToken = next;
					}
					SkipLexicalActions(matchedToken);
				} else
					SkipLexicalActions(null);
				if (SubLParserTokenManager.jjnewLexState[jjmatchedKind] != -1) {
					curLexState = SubLParserTokenManager.jjnewLexState[jjmatchedKind];
					break;
				}
				break;
			}
		}
		int error_line = input_stream.getEndLine();
		int error_column = input_stream.getEndColumn();
		String error_after = null;
		boolean EOFSeen = false;
		try {
			input_stream.readChar();
			input_stream.backup(1);
		} catch (IOException e2) {
			EOFSeen = true;
			error_after = curPos <= 1 ? "" : input_stream.GetImage();
			if (curChar == '\n' || curChar == '\r') {
				++error_line;
				error_column = 0;
			} else
				++error_column;
		}
		if (!EOFSeen) {
			input_stream.backup(1);
			error_after = curPos <= 1 ? "" : input_stream.GetImage();
		}
		throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, 0);
	}

	public void ReInit(ASCII_CharStream stream) {
		boolean b = false;
		jjnewStateCnt = b ? 1 : 0;
		jjmatchedPos = b ? 1 : 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	public void ReInit(ASCII_CharStream stream, int lexState) {
		this.ReInit(stream);
		SwitchTo(lexState);
	}

	public void SwitchTo(int lexState) {
		if (lexState >= 3 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", 2);
		curLexState = lexState;
	}

	void SkipLexicalActions(Token matchedToken) {
		switch (jjmatchedKind) {
		default:
		}
	}
}
