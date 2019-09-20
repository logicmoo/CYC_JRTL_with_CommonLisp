package org.opencyc.parser;

public interface CycLParserConstants
{
    public static final int EOF = 0;
    public static final int OPEN_PAREN = 1;
    public static final int CLOSE_PAREN = 2;
    public static final int WS = 10;
    public static final int CONSTANT_PREFIX = 11;
    public static final int SIMPLE_VARIABLE_PREFIX = 12;
    public static final int META_VARIABLE_PREFIX = 13;
    public static final int GUID_PREFIX = 14;
    public static final int TRUE_CONSTANT = 15;
    public static final int FALSE_CONSTANT = 16;
    public static final int AND_CONSTANT = 17;
    public static final int OR_CONSTANT = 18;
    public static final int XOR_CONSTANT = 19;
    public static final int NOT_CONSTANT = 20;
    public static final int EQUIV_CONSTANT = 21;
    public static final int IMPLIES_CONSTANT = 22;
    public static final int FORALL_CONSTANT = 23;
    public static final int THEREEXISTS_CONSTANT = 24;
    public static final int THEREEXISTEXACTLY_CONSTANT = 25;
    public static final int THEREEXISTATMOST_CONSTANT = 26;
    public static final int THEREEXISTATLEAST_CONSTANT = 27;
    public static final int EXPANDSUBLFN_CONSTANT = 28;
    public static final int SUBLQUOTEFN_CONSTANT = 29;
    public static final int TRUE_GUID_CONSTANT = 30;
    public static final int FALSE_GUID_CONSTANT = 31;
    public static final int AND_GUID_CONSTANT = 32;
    public static final int OR_GUID_CONSTANT = 33;
    public static final int XOR_GUID_CONSTANT = 34;
    public static final int NOT_GUID_CONSTANT = 35;
    public static final int EQUIV_GUID_CONSTANT = 36;
    public static final int IMPLIES_GUID_CONSTANT = 37;
    public static final int FORALL_GUID_CONSTANT = 38;
    public static final int THEREEXISTS_GUID_CONSTANT = 39;
    public static final int THEREEXISTEXACTLY_GUID_CONSTANT = 40;
    public static final int THEREEXISTATMOST_GUID_CONSTANT = 41;
    public static final int THEREEXISTATLEAST_GUID_CONSTANT = 42;
    public static final int EXPANDSUBLFN_GUID_CONSTANT = 43;
    public static final int SUBLQUOTEFN_GUID_CONSTANT = 44;
    public static final int TRUE_GUID = 45;
    public static final int FALSE_GUID = 46;
    public static final int AND_GUID = 47;
    public static final int OR_GUID = 48;
    public static final int XOR_GUID = 49;
    public static final int NOT_GUID = 50;
    public static final int EQUIV_GUID = 51;
    public static final int IMPLIES_GUID = 52;
    public static final int FORALL_GUID = 53;
    public static final int THEREEXISTS_GUID = 54;
    public static final int THEREEXISTEXACTLY_GUID = 55;
    public static final int THEREEXISTATMOST_GUID = 56;
    public static final int THEREEXISTATLEAST_GUID = 57;
    public static final int EXPANDSUBLFN_GUID = 58;
    public static final int SUBLQUOTEFN_GUID = 59;
    public static final int INTEGER = 60;
    public static final int FLOAT = 61;
    public static final int DECIMAL_INT = 62;
    public static final int FLOAT_ONE = 63;
    public static final int FLOAT_TWO = 64;
    public static final int CONSTANT_NAME1 = 65;
    public static final int NON_NUMERIC_START_CHAR = 66;
    public static final int NUMERIC_START_CHAR = 67;
    public static final int VALID_CONSTANT_CHAR = 68;
    public static final int CONSTANT_NAME2 = 69;
    public static final int CONSTANT_GUID = 70;
    public static final int GUID_CHAR = 71;
    public static final int CONSTANT_GUID2 = 72;
    public static final int SIMPLE_VARIABLE = 73;
    public static final int NON_DASH_VARIABLE_CHAR = 74;
    public static final int META_VARIABLE = 75;
    public static final int NON_DASH_META_VARIABLE_CHAR = 76;
    public static final int STRING = 77;
    public static final int DEFAULT = 0;
    public static final int IN_LINE_COMMENT = 1;
    public static final int IN_COMMENT = 2;
    public static final String[] tokenImage = { "<EOF>", "\"(\"", "\")\"", "\"//\"", "\";\"", "\"\"", "<token of kind 9>", "<WS>", "\"#$\"", "\"?\"", "\":\"", "\"#G\"", "<TRUE_CONSTANT>", "<FALSE_CONSTANT>", "<AND_CONSTANT>", "<OR_CONSTANT>", "<XOR_CONSTANT>", "<NOT_CONSTANT>", "<EQUIV_CONSTANT>", "<IMPLIES_CONSTANT>", "<FORALL_CONSTANT>", "<THEREEXISTS_CONSTANT>", "<THEREEXISTEXACTLY_CONSTANT>", "<THEREEXISTATMOST_CONSTANT>", "<THEREEXISTATLEAST_CONSTANT>", "<EXPANDSUBLFN_CONSTANT>", "<SUBLQUOTEFN_CONSTANT>", "<TRUE_GUID_CONSTANT>", "<FALSE_GUID_CONSTANT>", "<AND_GUID_CONSTANT>", "<OR_GUID_CONSTANT>", "<XOR_GUID_CONSTANT>", "<NOT_GUID_CONSTANT>", "<EQUIV_GUID_CONSTANT>", "<IMPLIES_GUID_CONSTANT>", "<FORALL_GUID_CONSTANT>", "<THEREEXISTS_GUID_CONSTANT>", "<THEREEXISTEXACTLY_GUID_CONSTANT>", "<THEREEXISTATMOST_GUID_CONSTANT>", "<THEREEXISTATLEAST_GUID_CONSTANT>", "<EXPANDSUBLFN_GUID_CONSTANT>", "<SUBLQUOTEFN_GUID_CONSTANT>", "\"bd5880d9-9c29-11b1-9dad-c379636f7270\"", "\"bd5880d8-9c29-11b1-9dad-c379636f7270\"", "\"bd5880f9-9c29-11b1-9dad-c379636f7270\"", "\"bd5880fa-9c29-11b1-9dad-c379636f7270\"", "\"bde7f9f2-9c29-11b1-9dad-c379636f7270\"", "\"bd5880fb-9c29-11b1-9dad-c379636f7270\"", "\"bda887b6-9c29-11b1-9dad-c379636f7270\"", "\"bd5880f8-9c29-11b1-9dad-c379636f7270\"", "\"bd5880f7-9c29-11b1-9dad-c379636f7270\"", "\"bd5880f6-9c29-11b1-9dad-c379636f7270\"", "\"c10ae7b8-9c29-11b1-9dad-c379636f7270\"", "\"c10af932-9c29-11b1-9dad-c379636f7270\"", "\"c10af5e7-9c29-11b1-9dad-c379636f7270\"", "\"c0b2bc13-9c29-11b1-9dad-c379636f7270\"", "\"94f07021-8b0d-11d7-8701-0002b3a8515d\"", "<INTEGER>", "<FLOAT>", "<DECIMAL_INT>", "<FLOAT_ONE>", "<FLOAT_TWO>", "<CONSTANT_NAME1>", "<NON_NUMERIC_START_CHAR>", "<NUMERIC_START_CHAR>", "<VALID_CONSTANT_CHAR>", "<CONSTANT_NAME2>", "<CONSTANT_GUID>", "<GUID_CHAR>", "<CONSTANT_GUID2>", "<SIMPLE_VARIABLE>", "<NON_DASH_VARIABLE_CHAR>", "<META_VARIABLE>", "<NON_DASH_META_VARIABLE_CHAR>", "<STRING>", "\".\"" };
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 10 ms
	\"", "\"\\n\"", "<token of kind 7>", "\"
	Decompiled with Procyon 0.5.32.
*/