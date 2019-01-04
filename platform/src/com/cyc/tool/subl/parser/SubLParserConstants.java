//
// For LarKC
//
package com.cyc.tool.subl.parser;

public interface SubLParserConstants {
	public static int EOF = 0;
	public static int OPEN_PAREN = 1;
	public static int CLOSE_PAREN = 2;
	public static int PACKAGE_SEPARATOR = 3;
	public static int SUBL_SYMBOL_NAME_QUOTE = 4;
	public static int VECTOR_PREFIX = 5;
	public static int FUNCTION_QUOTE = 6;
	public static int QUOTE_CHAR = 7;
	public static int BACK_QUOTE = 8;
	public static int SPLICING_UNQUOTE = 9;
	public static int UNQUOTE = 10;
	public static int DOT = 11;
	public static int STRING_QUOTE = 12;
	public static int UNINTERNED_SYMBOL_PREFIX = 13;
	public static int READ_TIME_EVALUATION = 14;
	public static int IF_FEATURE = 15;
	public static int IF_NOT_FEATURE = 16;
	public static int CHARACTER_PREFIX = 17;
	public static int HASH_MARK = 18;
	public static int BACKSLASH = 19;
	public static int SINGLE_LINE_COMMENT = 22;
	public static int MULTI_LINE_COMMENT = 23;
	public static int WS = 25;
	public static int FLOAT1 = 26;
	public static int FLOAT2 = 27;
	public static int EXPONENT = 28;
	public static int DECIMAL_INTEGER = 29;
	public static int BASED_INTEGER = 30;
	public static int BASED_INTEGER_PREFIX = 31;
	public static int NUMBER_CHAR = 32;
	public static int NAMED_CHARACTER = 33;
	public static int CHARACTER = 34;
	public static int CHARACTER_START = 35;
	public static int CONTROL_BITS = 36;
	public static int CONTROL_LONG = 37;
	public static int CONTROL_SHORT = 38;
	public static int META_LONG = 39;
	public static int META_SHORT = 40;
	public static int CHAR_NAME = 41;
	public static int STRING = 42;
	public static int CASE_SENSITIVE_SUBL_SYMBOL_NAME = 43;
	public static int CONSTITUENT_CHAR = 44;
	public static int PRINTABLE_CHAR = 45;
	public static int SUBL_SYMBOL_NAME = 46;
	public static int DEFAULT = 0;
	public static int IN_SINGLE_LINE_COMMENT = 1;
	public static int IN_MULTI_LINE_COMMENT = 2;
	public static String[] tokenImage = { "<EOF>", "\"(\"", "\")\"", "\":\"", "\"|\"", "\"#(\"", "\"#\\'\"", "\"\\'\"",
			"\"`\"", "\",@\"", "\",\"", "\".\"", "\"\\\"\"", "\"#:\"", "\"#.\"", "\"#+\"", "\"#-\"", "\"#\\\\\"",
			"\"#\"", "\"\\\\\"", "\";\"", "\"#|\"", "<SINGLE_LINE_COMMENT>", "\"|#\"", "<token of kind 24>", "<WS>",
			"<FLOAT1>", "<FLOAT2>", "<EXPONENT>", "<DECIMAL_INTEGER>", "<BASED_INTEGER>", "<BASED_INTEGER_PREFIX>",
			"<NUMBER_CHAR>", "<NAMED_CHARACTER>", "<CHARACTER>", "<CHARACTER_START>", "<CONTROL_BITS>", "\"Control-\"",
			"\"C-\"", "\"Meta-\"", "\"M-\"", "<CHAR_NAME>", "<STRING>", "<CASE_SENSITIVE_SUBL_SYMBOL_NAME>",
			"<CONSTITUENT_CHAR>", "<PRINTABLE_CHAR>", "<SUBL_SYMBOL_NAME>" };
}
