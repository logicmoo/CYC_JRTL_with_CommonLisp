//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Characters extends SubLTrampolineFile {
	public static SubLObject alpha_char_p(SubLObject c) {
		if (c.toChar().isAlphaChar())
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject alphanumericp(SubLObject c) {
		if (c.toChar().isAlphNumeric())
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject both_case_p(SubLObject c) {
		return alpha_char_p(c);
	}

	public static SubLObject char_code(SubLObject c) {
		return SubLObjectFactory.makeInteger(c.charValue());
	}

	public static SubLObject char_downcase(SubLObject c) {
		return c.toChar().toLowerCase();
	}

	public static SubLObject char_equal(SubLObject char1, SubLObject char2) {
		if (char1.toChar().equalsIgnoringCase(char2.toChar()))
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject char_greaterp(SubLObject char1, SubLObject char2) {
		if (char1.toChar().greaterThanIgnoringCase(char2.toChar()))
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject char_lessp(SubLObject char1, SubLObject char2) {
		if (char1.toChar().lessThanIgnoringCase(char2.toChar()))
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject char_not_equal(SubLObject char1, SubLObject char2) {
		if (char1.toChar().equalsIgnoringCase(char2.toChar()))
			return SubLNil.NIL;
		return CommonSymbols.T;
	}

	public static SubLObject char_not_greaterp(SubLObject char1, SubLObject char2) {
		if (char1.toChar().lessThanOrEqualIgnoringCase(char2.toChar()))
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject char_not_lessp(SubLObject char1, SubLObject char2) {
		if (char1.toChar().greaterThanOrEqualIgnoringCase(char2.toChar()))
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject char_upcase(SubLObject c) {
		return c.toChar().toUpperCase();
	}

	public static SubLObject charE(SubLObject char1, SubLObject char2) {
		return char1 == char2 ? CommonSymbols.T : SubLNil.NIL;
	}

	public static SubLObject charG(SubLObject char1, SubLObject char2) {
		return char1.toChar().greaterThan(char2.toChar()) ? CommonSymbols.T : SubLNil.NIL;
	}

	public static SubLObject charGE(SubLObject char1, SubLObject char2) {
		return char1.toChar().greaterThanOrEqual(char2.toChar()) ? CommonSymbols.T : SubLNil.NIL;
	}

	public static SubLObject charL(SubLObject char1, SubLObject char2) {
		return char1.toChar().lessThan(char2.toChar()) ? CommonSymbols.T : SubLNil.NIL;
	}

	public static SubLObject charLE(SubLObject char1, SubLObject char2) {
		return char1.toChar().lessThanOrEqual(char2.toChar()) ? CommonSymbols.T : SubLNil.NIL;
	}

	public static SubLObject charNE(SubLObject char1, SubLObject char2) {
		return char1 == char2 ? SubLNil.NIL : CommonSymbols.T;
	}

	public static SubLObject code_char(SubLObject code) {
		int val = code.intValue();
		if (val < 0 || val > 255)
			return SubLNil.NIL;
		return SubLCharacter.makeChar(val);
	}

	public static SubLObject digit_char(SubLObject digit) {
		char val = Character.toUpperCase(Character.forDigit(digit.intValue(), 36));
		if (val == '\0')
			return SubLNil.NIL;
		return SubLObjectFactory.makeChar(val);
	}

	public static SubLObject digit_char_p(SubLObject c, SubLObject radix) {
		if (radix == CommonSymbols.UNPROVIDED)
			radix = CommonSymbols.TEN_INTEGER;
		int result = c.toChar().charInDigitNumber(radix.intValue());
		if (result >= 0)
			return SubLNumberFactory.makeInteger(result);
		return SubLNil.NIL;
	}

	public static SubLObject lower_case_p(SubLObject c) {
		if (c.toChar().isLowerCase())
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject name_character(SubLObject namestring) {
		return SubLCharacter.getCharFromName(namestring.toStr());
	}

	public static SubLObject upper_case_p(SubLObject c) {
		if (c.toChar().isUpperCase())
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static SubLCharacter CHAR_null;
	public static SubLCharacter CHAR_backspace;
	public static SubLCharacter CHAR_tab;
	public static SubLCharacter CHAR_newline;
	public static SubLCharacter CHAR_return;
	public static SubLCharacter CHAR_page;
	public static SubLCharacter CHAR_escape;
	public static SubLCharacter CHAR_space;
	public static SubLCharacter CHAR_exclamation;
	public static SubLCharacter CHAR_quotation;
	public static SubLCharacter CHAR_hash;
	public static SubLCharacter CHAR_dollar;
	public static SubLCharacter CHAR_percent;
	public static SubLCharacter CHAR_ampersand;
	public static SubLCharacter CHAR_quote;
	public static SubLCharacter CHAR_lparen;
	public static SubLCharacter CHAR_rparen;
	public static SubLCharacter CHAR_asterisk;
	public static SubLCharacter CHAR_plus;
	public static SubLCharacter CHAR_comma;
	public static SubLCharacter CHAR_hyphen;
	public static SubLCharacter CHAR_period;
	public static SubLCharacter CHAR_slash;
	public static SubLCharacter CHAR_0;
	public static SubLCharacter CHAR_1;
	public static SubLCharacter CHAR_2;
	public static SubLCharacter CHAR_3;
	public static SubLCharacter CHAR_4;
	public static SubLCharacter CHAR_5;
	public static SubLCharacter CHAR_6;
	public static SubLCharacter CHAR_7;
	public static SubLCharacter CHAR_8;
	public static SubLCharacter CHAR_9;
	public static SubLCharacter CHAR_colon;
	public static SubLCharacter CHAR_semicolon;
	public static SubLCharacter CHAR_less;
	public static SubLCharacter CHAR_equal;
	public static SubLCharacter CHAR_greater;
	public static SubLCharacter CHAR_question;
	public static SubLCharacter CHAR_at;
	public static SubLCharacter CHAR_A;
	public static SubLCharacter CHAR_B;
	public static SubLCharacter CHAR_C;
	public static SubLCharacter CHAR_D;
	public static SubLCharacter CHAR_E;
	public static SubLCharacter CHAR_F;
	public static SubLCharacter CHAR_G;
	public static SubLCharacter CHAR_H;
	public static SubLCharacter CHAR_I;
	public static SubLCharacter CHAR_J;
	public static SubLCharacter CHAR_K;
	public static SubLCharacter CHAR_L;
	public static SubLCharacter CHAR_M;
	public static SubLCharacter CHAR_N;
	public static SubLCharacter CHAR_O;
	public static SubLCharacter CHAR_P;
	public static SubLCharacter CHAR_Q;
	public static SubLCharacter CHAR_R;
	public static SubLCharacter CHAR_S;
	public static SubLCharacter CHAR_T;
	public static SubLCharacter CHAR_U;
	public static SubLCharacter CHAR_V;
	public static SubLCharacter CHAR_W;
	public static SubLCharacter CHAR_X;
	public static SubLCharacter CHAR_Y;
	public static SubLCharacter CHAR_Z;
	public static SubLCharacter CHAR_lbracket;
	public static SubLCharacter CHAR_backslash;
	public static SubLCharacter CHAR_rbracket;
	public static SubLCharacter CHAR_caret;
	public static SubLCharacter CHAR_underbar;
	public static SubLCharacter CHAR_backquote;
	public static SubLCharacter CHAR_a;
	public static SubLCharacter CHAR_b;
	public static SubLCharacter CHAR_c;
	public static SubLCharacter CHAR_d;
	public static SubLCharacter CHAR_e;
	public static SubLCharacter CHAR_f;
	public static SubLCharacter CHAR_g;
	public static SubLCharacter CHAR_h;
	public static SubLCharacter CHAR_i;
	public static SubLCharacter CHAR_j;
	public static SubLCharacter CHAR_k;
	public static SubLCharacter CHAR_l;
	public static SubLCharacter CHAR_m;
	public static SubLCharacter CHAR_n;
	public static SubLCharacter CHAR_o;
	public static SubLCharacter CHAR_p;
	public static SubLCharacter CHAR_q;
	public static SubLCharacter CHAR_r;
	public static SubLCharacter CHAR_s;
	public static SubLCharacter CHAR_t;
	public static SubLCharacter CHAR_u;
	public static SubLCharacter CHAR_v;
	public static SubLCharacter CHAR_w;
	public static SubLCharacter CHAR_x;
	public static SubLCharacter CHAR_y;
	public static SubLCharacter CHAR_z;
	public static SubLCharacter CHAR_lbrace;
	public static SubLCharacter CHAR_vertical;
	public static SubLCharacter CHAR_rbrace;
	public static SubLCharacter CHAR_tilde;
	public static SubLCharacter CHAR_rubout;
	static {
		me = new Characters();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Characters.me, "alpha_char_p", "ALPHA-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "alphanumericp", "ALPHANUMERICP", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "both_case_p", "BOTH-CASE-P", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_code", "CHAR-CODE", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_downcase", "CHAR-DOWNCASE", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_equal", "CHAR-EQUAL", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_greaterp", "CHAR-GREATERP", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_lessp", "CHAR-LESSP", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_not_equal", "CHAR-NOT-EQUAL", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_not_greaterp", "CHAR-NOT-GREATERP", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_not_lessp", "CHAR-NOT-LESSP", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "char_upcase", "CHAR-UPCASE", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "charNE", "CHAR/=", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "charL", "CHAR<", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "charLE", "CHAR<=", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "charE", "CHAR=", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "charG", "CHAR>", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "charGE", "CHAR>=", 2, 0, false);
		SubLFiles.declareFunction(Characters.me, "code_char", "CODE-CHAR", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "digit_char", "DIGIT-CHAR", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "digit_char_p", "DIGIT-CHAR-P", 1, 1, false);
		SubLFiles.declareFunction(Characters.me, "lower_case_p", "LOWER-CASE-P", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "upper_case_p", "UPPER-CASE-P", 1, 0, false);
		SubLFiles.declareFunction(Characters.me, "name_character", "NAME-CHARACTER", 1, 0, false);
	}

	@Override
	public void initializeVariables() {
		Characters.CHAR_null = SubLObjectFactory.makeChar('\0');
		Characters.CHAR_backspace = SubLObjectFactory.makeChar('\b');
		Characters.CHAR_tab = SubLObjectFactory.makeChar('\t');
		Characters.CHAR_newline = SubLObjectFactory.makeChar('\n');
		Characters.CHAR_return = SubLObjectFactory.makeChar('\r');
		Characters.CHAR_page = SubLObjectFactory.makeChar('\f');
		Characters.CHAR_escape = SubLObjectFactory.makeChar('\u001b');
		Characters.CHAR_space = SubLObjectFactory.makeChar(' ');
		Characters.CHAR_exclamation = SubLObjectFactory.makeChar('!');
		Characters.CHAR_quotation = SubLObjectFactory.makeChar('\"');
		Characters.CHAR_hash = SubLObjectFactory.makeChar('#');
		Characters.CHAR_dollar = SubLObjectFactory.makeChar('$');
		Characters.CHAR_percent = SubLObjectFactory.makeChar('%');
		Characters.CHAR_ampersand = SubLObjectFactory.makeChar('&');
		Characters.CHAR_quote = SubLObjectFactory.makeChar('\'');
		Characters.CHAR_lparen = SubLObjectFactory.makeChar('(');
		Characters.CHAR_rparen = SubLObjectFactory.makeChar(')');
		Characters.CHAR_asterisk = SubLObjectFactory.makeChar('*');
		Characters.CHAR_plus = SubLObjectFactory.makeChar('+');
		Characters.CHAR_comma = SubLObjectFactory.makeChar(',');
		Characters.CHAR_hyphen = SubLObjectFactory.makeChar('-');
		Characters.CHAR_period = SubLObjectFactory.makeChar('.');
		Characters.CHAR_slash = SubLObjectFactory.makeChar('/');
		Characters.CHAR_0 = SubLObjectFactory.makeChar('0');
		Characters.CHAR_1 = SubLObjectFactory.makeChar('1');
		Characters.CHAR_2 = SubLObjectFactory.makeChar('2');
		Characters.CHAR_3 = SubLObjectFactory.makeChar('3');
		Characters.CHAR_4 = SubLObjectFactory.makeChar('4');
		Characters.CHAR_5 = SubLObjectFactory.makeChar('5');
		Characters.CHAR_6 = SubLObjectFactory.makeChar('6');
		Characters.CHAR_7 = SubLObjectFactory.makeChar('7');
		Characters.CHAR_8 = SubLObjectFactory.makeChar('8');
		Characters.CHAR_9 = SubLObjectFactory.makeChar('9');
		Characters.CHAR_colon = SubLObjectFactory.makeChar(':');
		Characters.CHAR_semicolon = SubLObjectFactory.makeChar(';');
		Characters.CHAR_less = SubLObjectFactory.makeChar('<');
		Characters.CHAR_equal = SubLObjectFactory.makeChar('=');
		Characters.CHAR_greater = SubLObjectFactory.makeChar('>');
		Characters.CHAR_question = SubLObjectFactory.makeChar('?');
		Characters.CHAR_at = SubLObjectFactory.makeChar('@');
		Characters.CHAR_A = SubLObjectFactory.makeChar('A');
		Characters.CHAR_B = SubLObjectFactory.makeChar('B');
		Characters.CHAR_C = SubLObjectFactory.makeChar('C');
		Characters.CHAR_D = SubLObjectFactory.makeChar('D');
		Characters.CHAR_E = SubLObjectFactory.makeChar('E');
		Characters.CHAR_F = SubLObjectFactory.makeChar('F');
		Characters.CHAR_G = SubLObjectFactory.makeChar('G');
		Characters.CHAR_H = SubLObjectFactory.makeChar('H');
		Characters.CHAR_I = SubLObjectFactory.makeChar('I');
		Characters.CHAR_J = SubLObjectFactory.makeChar('J');
		Characters.CHAR_K = SubLObjectFactory.makeChar('K');
		Characters.CHAR_L = SubLObjectFactory.makeChar('L');
		Characters.CHAR_M = SubLObjectFactory.makeChar('M');
		Characters.CHAR_N = SubLObjectFactory.makeChar('N');
		Characters.CHAR_O = SubLObjectFactory.makeChar('O');
		Characters.CHAR_P = SubLObjectFactory.makeChar('P');
		Characters.CHAR_Q = SubLObjectFactory.makeChar('Q');
		Characters.CHAR_R = SubLObjectFactory.makeChar('R');
		Characters.CHAR_S = SubLObjectFactory.makeChar('S');
		Characters.CHAR_T = SubLObjectFactory.makeChar('T');
		Characters.CHAR_U = SubLObjectFactory.makeChar('U');
		Characters.CHAR_V = SubLObjectFactory.makeChar('V');
		Characters.CHAR_W = SubLObjectFactory.makeChar('W');
		Characters.CHAR_X = SubLObjectFactory.makeChar('X');
		Characters.CHAR_Y = SubLObjectFactory.makeChar('Y');
		Characters.CHAR_Z = SubLObjectFactory.makeChar('Z');
		Characters.CHAR_lbracket = SubLObjectFactory.makeChar('[');
		Characters.CHAR_backslash = SubLObjectFactory.makeChar('\\');
		Characters.CHAR_rbracket = SubLObjectFactory.makeChar(']');
		Characters.CHAR_caret = SubLObjectFactory.makeChar('^');
		Characters.CHAR_underbar = SubLObjectFactory.makeChar('_');
		Characters.CHAR_backquote = SubLObjectFactory.makeChar('`');
		Characters.CHAR_a = SubLObjectFactory.makeChar('a');
		Characters.CHAR_b = SubLObjectFactory.makeChar('b');
		Characters.CHAR_c = SubLObjectFactory.makeChar('c');
		Characters.CHAR_d = SubLObjectFactory.makeChar('d');
		Characters.CHAR_e = SubLObjectFactory.makeChar('e');
		Characters.CHAR_f = SubLObjectFactory.makeChar('f');
		Characters.CHAR_g = SubLObjectFactory.makeChar('g');
		Characters.CHAR_h = SubLObjectFactory.makeChar('h');
		Characters.CHAR_i = SubLObjectFactory.makeChar('i');
		Characters.CHAR_j = SubLObjectFactory.makeChar('j');
		Characters.CHAR_k = SubLObjectFactory.makeChar('k');
		Characters.CHAR_l = SubLObjectFactory.makeChar('l');
		Characters.CHAR_m = SubLObjectFactory.makeChar('m');
		Characters.CHAR_n = SubLObjectFactory.makeChar('n');
		Characters.CHAR_o = SubLObjectFactory.makeChar('o');
		Characters.CHAR_p = SubLObjectFactory.makeChar('p');
		Characters.CHAR_q = SubLObjectFactory.makeChar('q');
		Characters.CHAR_r = SubLObjectFactory.makeChar('r');
		Characters.CHAR_s = SubLObjectFactory.makeChar('s');
		Characters.CHAR_t = SubLObjectFactory.makeChar('t');
		Characters.CHAR_u = SubLObjectFactory.makeChar('u');
		Characters.CHAR_v = SubLObjectFactory.makeChar('v');
		Characters.CHAR_w = SubLObjectFactory.makeChar('w');
		Characters.CHAR_x = SubLObjectFactory.makeChar('x');
		Characters.CHAR_y = SubLObjectFactory.makeChar('y');
		Characters.CHAR_z = SubLObjectFactory.makeChar('z');
		Characters.CHAR_lbrace = SubLObjectFactory.makeChar('{');
		Characters.CHAR_vertical = SubLObjectFactory.makeChar('|');
		Characters.CHAR_rbrace = SubLObjectFactory.makeChar('}');
		Characters.CHAR_tilde = SubLObjectFactory.makeChar('~');
		Characters.CHAR_rubout = SubLObjectFactory.makeChar('\u007f');
	}

	@Override
	public void runTopLevelForms() {
	}
}
