/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeCycSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeFixnum;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSublispSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

public interface CommonSymbols extends CommonSymbols_KW {

    final Object commonSymbolsCheck = new Object() {
	{
	    if (!SubLMain.commonSymbolsOK) {
		if (true) {
		    throw new Error("!commonSymbolsOK!");
		}
	    }
	}
    };

    SubLT T = SubLT.T;
    SubLObject RET_T = CommonSymbols.T;
    SubLNil NIL = SubLNil.NIL;
    SubLObject RET_NIL = SubLNil.NIL;
    SubLSymbol EQ = makeSublispSymbol("EQ");
    SubLSymbol EQL = makeSublispSymbol("EQL");
    SubLSymbol EQUAL = makeSublispSymbol("EQUAL");
    SubLSymbol EQUALP = makeSublispSymbol("EQUALP");
    SubLFixnum MINUS_ONE_INTEGER = makeFixnum(-1);
    SubLDoubleFloat ZERO_DOUBLE = makeDouble(0.0);
    SubLFixnum ZERO_INTEGER = makeFixnum(0);
    SubLFixnum ONE_INTEGER = makeFixnum(1);
    SubLFixnum TWO_INTEGER = makeFixnum(2);
    SubLFixnum THREE_INTEGER = makeFixnum(3);
    SubLFixnum FOUR_INTEGER = makeFixnum(4);
    SubLFixnum FIVE_INTEGER = makeFixnum(5);
    SubLFixnum SIX_INTEGER = makeFixnum(6);
    SubLFixnum SEVEN_INTEGER = makeFixnum(7);
    SubLFixnum EIGHT_INTEGER = makeFixnum(8);
    SubLFixnum NINE_INTEGER = makeFixnum(9);
    SubLFixnum TEN_INTEGER = makeFixnum(10);
    SubLFixnum ELEVEN_INTEGER = makeFixnum(11);
    SubLFixnum TWELVE_INTEGER = makeFixnum(12);
    SubLFixnum THIRTEEN_INTEGER = makeFixnum(13);
    SubLFixnum FOURTEEN_INTEGER = makeFixnum(14);
    SubLFixnum FIFTEEN_INTEGER = makeFixnum(15);
    SubLFixnum SIXTEEN_INTEGER = makeFixnum(16);
    SubLFixnum SEVENTEEN_INTEGER = makeFixnum(17);
    SubLFixnum EIGHTEEN_INTEGER = makeFixnum(18);
    SubLFixnum NINETEEN_INTEGER = makeFixnum(19);
    SubLFixnum TWENTY_INTEGER = makeFixnum(20);
    SubLFixnum THIRTY_TWO_INTEGER = makeFixnum(32);
    SubLFixnum THIRTY_THREE_INTEGER = makeFixnum(33);
    SubLFixnum THIRTY_FOUR_INTEGER = makeFixnum(34);
    SubLFixnum SIXTY_FOUR_INTEGER = makeFixnum(64);
    SubLFixnum ONE_HUNDRED_TWENTY_SEVEN_INTEGER = makeFixnum(127);
    SubLFixnum ONE_HUNDRED_THIRTY_SEVEN_INTEGER = makeFixnum(137);
    SubLFixnum TWO_HUNDRED_FORTY_FOUR_INTEGER = makeFixnum(244);
    SubLFixnum TWO_HUNDRED_FIFTY_FOUR_INTEGER = makeFixnum(254);
    SubLFixnum ONE_THOUSAND_INTEGER = makeFixnum(1000);

    SubLSymbol BINDING_TYPE_KEYWORD = makeKeyword("BINDING-TYPE");
    SubLSymbol LEXICAL_KEYWORD = makeKeyword("LEXICAL");
    SubLSymbol CONSTANT_KEYWORD = makeKeyword("CONSTANT");
    SubLSymbol DYNAMIC_KEYWORD = makeKeyword("DYNAMIC");
    SubLSymbol UNDECLARED_KEYWORD = makeKeyword("UNDECLARED");
    SubLSymbol INITIALIZATION_TYPE_KEYWORD = makeKeyword("INITIALIZATION-TYPE");
    SubLSymbol INITIALIZER_KEYWORD = makeKeyword("INITIALIZER");
    SubLSymbol WORLD_KEYWORD = makeKeyword("WORLD");

    SubLObject UNPROVIDED = makeSublispSymbol("&UNPROVIDED-SUBLISP-ARGUMENT&");
    SubLSymbol UNPROVIDED_SYM = makeSublispSymbol("&UNPROVIDED-SUBLISP-ARGUMENT&");
    SubLSymbol OPTIONAL_SYMBOL = makeSublispSymbol("&OPTIONAL");
    SubLSymbol REST_SYMBOL = makeSublispSymbol("&REST");
    SubLSymbol RETURN_TAG = makeSublispSymbol("%RET");
    SubLSymbol ANSWER_TAG = makeSublispSymbol("%ANSWER");
    SubLSymbol SUSPEND_TYPE_CHECKING = makeSublispSymbol("*SUSPEND-TYPE-CHECKING?*");
    SubLSymbol OTHERWISE = makeSublispSymbol("OTHERWISE");
    SubLSymbol CDESTRUCTURING_BIND = makeSublispSymbol("CDESTRUCTURING-BIND");
    SubLSymbol MACRO_FORM = makeSublispSymbol("%MACRO-FORM");
    SubLSymbol MACRO_ENV = makeSublispSymbol("%ENV");
    SubLSymbol APPEND_STACK_TRACES_TO_ERROR_MESSAGES = makeSublispSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
    SubLSymbol FORCE_ERROR_MESSAGE_OUTPUT = makeSublispSymbol("*FORCE-ERROR-MESSAGE-OUTPUT?*");
    SubLSymbol EXTERNAL_KEYWORD = makeKeyword("EXTERNAL");
    SubLSymbol INTERNAL_KEYWORD = makeKeyword("INTERNAL");
    SubLSymbol INHERITED_KEYWORD = makeKeyword("INHERITED");
    SubLSymbol ERROR = makeSublispSymbol("ERROR");
    SubLSymbol NCONC = makeSublispSymbol("NCONC");
    SubLSymbol CAAR = makeSublispSymbol("CAAR");
    SubLSymbol CADR = makeSublispSymbol("CADR");
    SubLSymbol VALUES = makeSublispSymbol("VALUES");
    SubLSymbol TRUE = makeSublispSymbol("TRUE");
    SubLSymbol KILL_KEYWORD = makeKeyword("KILL");
    SubLSymbol LIST = makeSublispSymbol("LIST");
    SubLSymbol LISTS = makeSublispSymbol("LIST*");
    SubLSymbol SSS = makeSublispSymbol("***");

    // @TODO defvarCheckCL
    SubLSymbol $print_level$ = makeSublispSymbol("*PRINT-LEVEL*");

    // @TODO defvarCheckCL
    SubLSymbol $print_length$ = makeSublispSymbol("*PRINT-LENGTH*");

    SubLSymbol $cyc_tests$ = makeSymbol("*CYC-TESTS*");

    SubLSymbol IDENTITY = makeSublispSymbol("IDENTITY");
    SubLSymbol MEMBER = makeSublispSymbol("MEMBER");
    SubLSymbol SYMBOL_FUNCTION = makeSublispSymbol("SYMBOL-FUNCTION");
    SubLSymbol LAMBDA_SYMBOL = makeSublispSymbol("LAMBDA");
    SubLSymbol NUM_E_SYMBOL = makeSublispSymbol("=");
    SubLSymbol NUM_NE_SYMBOL = makeSublispSymbol("/=");
    SubLSymbol NUM_GT_SYMBOL = makeSublispSymbol(">");
    SubLSymbol NUM_LT_SYMBOL = makeSublispSymbol("<");
    SubLSymbol NUM_GTE_SYMBOL = makeSublispSymbol(">=");
    SubLSymbol NUM_LTE_SYMBOL = makeSublispSymbol("<=");
    SubLSymbol STRING_E_SYMBOL = makeSublispSymbol("STRING=");
    SubLSymbol STRING_NE_SYMBOL = makeSublispSymbol("STRING/=");
    SubLSymbol STRING_GT_SYMBOL = makeSublispSymbol("STRING>");
    SubLSymbol STRING_LT_SYMBOL = makeSublispSymbol("STRING<");
    SubLSymbol STRING_GTE_SYMBOL = makeSublispSymbol("STRING>=");
    SubLSymbol STRING_LTE_SYMBOL = makeSublispSymbol("STRING<=");
    SubLSymbol STRING_EQUAL_SYMBOL = makeSublispSymbol("STRING-EQUAL");
    SubLSymbol STRING_NOT_EQUAL_SYMBOL = makeSublispSymbol("STRING-NOT-EQUAL");
    SubLSymbol STRING_GREATER_THAN_SYMBOL = makeSublispSymbol("STRING-GREATERP");
    SubLSymbol STRING_LESS_THAN_SYMBOL = makeSublispSymbol("STRING-LESSP");
    SubLSymbol STRING_GREATER_THAN_OR_EQUAL_SYMBOL = makeSublispSymbol("STRING-NOT-LESSP");
    SubLSymbol STRING_LESS_THAN_OR_EQUAL_SYMBOL = makeSublispSymbol("STRING-NOT-GREATERP");
    SubLSymbol CHAR_EQUAL_SYMBOL = makeSublispSymbol("CHAR-EQUAL");
    SubLSymbol CHAR_NOT_EQUAL_SYMBOL = makeSublispSymbol("CHAR-NOT-EQUAL");
    SubLSymbol CHAR_GREATER_THAN_SYMBOL = makeSublispSymbol("CHAR-GREATERP");
    SubLSymbol CHAR_LESS_THAN_SYMBOL = makeSublispSymbol("CHAR-LESSP");
    SubLSymbol CHAR_GREATER_THAN_OR_EQUAL_SYMBOL = makeSublispSymbol("CHAR-NOT-LESSP");
    SubLSymbol CHAR_LESS_THAN_OR_EQUAL_SYMBOL = makeSublispSymbol("CHAR-NOT-GREATERP");
    SubLSymbol CHAR_E_SYMBOL = makeSublispSymbol("CHAR=");
    SubLSymbol CHAR_NE_SYMBOL = makeSublispSymbol("CHAR/=");
    SubLSymbol CHAR_GT_SYMBOL = makeSublispSymbol("CHAR>");
    SubLSymbol CHAR_LT_SYMBOL = makeSublispSymbol("CHAR<");
    SubLSymbol CHAR_GTE_SYMBOL = makeSublispSymbol("CHAR>=");
    SubLSymbol CHAR_LTE_SYMBOL = makeSublispSymbol("CHAR<=");
    SubLSymbol CAR = makeSublispSymbol("CAR");
    SubLSymbol CDR = makeSublispSymbol("CDR");
    SubLSymbol NTH = makeSublispSymbol("NTH");
    SubLSymbol GETHASH = makeSublispSymbol("GETHASH");
    SubLSymbol GETHASH_WITHOUT_VALUES = makeSublispSymbol("GETHASH-WITHOUT-VALUES");
    SubLSymbol FIRST = makeSublispSymbol("FIRST");
    SubLSymbol SECOND = makeSublispSymbol("SECOND");
    SubLSymbol REVERSE = makeSublispSymbol("REVERSE");
    SubLSymbol NREVERSE = makeSublispSymbol("NREVERSE");
    SubLSymbol EVAL = makeSublispSymbol("EVAL");
    SubLSymbol CONS = makeSublispSymbol("CONS");
    SubLSymbol CHAR = makeSublispSymbol("CHAR");
    SubLSymbol AREF = makeSublispSymbol("AREF");
    SubLSymbol GET = makeSublispSymbol("GET");
    SubLSymbol VECTOR = makeSublispSymbol("VECTOR");
    SubLSymbol SYMBOL_VALUE = makeSublispSymbol("SYMBOL-VALUE");
    SubLSymbol ASSEMBLE_FIXNUMS_TO_INTEGER = makeSublispSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER");
    SubLSymbol SORT = makeSublispSymbol("SORT");
    SubLSymbol DEFINE = makeSublispSymbol("DEFINE");
    SubLSymbol DEFMACRO = makeSublispSymbol("DEFMACRO");
    SubLSymbol DEFCONSTANT = makeSublispSymbol("DEFCONSTANT");
    SubLSymbol DEFPARAMETER = makeSublispSymbol("DEFPARAMETER");
    SubLSymbol DEFVAR = makeSublispSymbol("DEFVAR");
    SubLSymbol DEFLEXICAL = makeSublispSymbol("DEFLEXICAL");
    SubLSymbol PROGN = makeSublispSymbol("PROGN");
    SubLSymbol PIF = makeSublispSymbol("PIF");
    SubLSymbol PWHEN = makeSublispSymbol("PWHEN");
    SubLSymbol PUNLESS = makeSublispSymbol("PUNLESS");
    SubLSymbol PCOND = makeSublispSymbol("PCOND");
    SubLSymbol PCASE = makeSublispSymbol("PCASE");
    SubLSymbol CSETQ = makeSublispSymbol("CSETQ");
    SubLSymbol CSETF = makeSublispSymbol("CSETF");
    SubLSymbol CINC = makeSublispSymbol("CINC");
    SubLSymbol CDEC = makeSublispSymbol("CDEC");
    SubLSymbol CPUSH = makeSublispSymbol("CPUSH");
    SubLSymbol CPUSHNEW = makeSublispSymbol("CPUSHNEW");
    SubLSymbol CPOP = makeSublispSymbol("CPOP");
    SubLSymbol CLET = makeSublispSymbol("CLET");
    SubLSymbol CPROGV = makeSublispSymbol("CPROGV");
    SubLSymbol CMULTIPLE_VALUE_BIND = makeSublispSymbol("CMULTIPLE-VALUE-BIND");
    SubLSymbol MULTIPLE_VALUE_LIST = makeSublispSymbol("MULTIPLE-VALUE-LIST");
    SubLSymbol NTH_VALUE = makeSublispSymbol("NTH-VALUE");
    SubLSymbol CDO = makeSublispSymbol("CDO");
    SubLSymbol CDOTIMES = makeSublispSymbol("CDOTIMES");
    SubLSymbol CDOLIST = makeSublispSymbol("CDOLIST");
    SubLSymbol CSOME = makeSublispSymbol("CSOME");
    SubLSymbol CDOHASH = makeSublispSymbol("CDOHASH");
    SubLSymbol CDO_SYMBOLS = makeSublispSymbol("CDO-SYMBOLS");
    SubLSymbol CDO_ALL_SYMBOLS = makeSublispSymbol("CDO-ALL-SYMBOLS");
    SubLSymbol CDO_EXTERNAL_SYMBOLS = makeSublispSymbol("CDO-EXTERNAL-SYMBOLS");
    SubLSymbol CCATCH = makeSublispSymbol("CCATCH");
    SubLSymbol CUNWIND_PROTECT = makeSublispSymbol("CUNWIND-PROTECT");
    SubLSymbol CTIME = makeSublispSymbol("CTIME");
    SubLSymbol RET = makeSublispSymbol("RET");
    SubLSymbol ENFORCE_TYPE = makeSublispSymbol("ENFORCE-TYPE");
    SubLSymbol CHECK_TYPE = makeSublispSymbol("CHECK-TYPE");
    SubLSymbol ENFORCE_MUST = makeSublispSymbol("ENFORCE-MUST");
    SubLSymbol MUST = makeSublispSymbol("MUST");
    SubLSymbol CNOT = makeSublispSymbol("CNOT");
    SubLSymbol CAND = makeSublispSymbol("CAND");
    SubLSymbol COR = makeSublispSymbol("COR");
    SubLSymbol FIF = makeSublispSymbol("FIF");
    SubLSymbol FWHEN = makeSublispSymbol("FWHEN");
    SubLSymbol FUNLESS = makeSublispSymbol("FUNLESS");
    SubLSymbol IGNORE = makeSublispSymbol("IGNORE");
    SubLSymbol CVS_ID = makeSublispSymbol("CVS-ID");
    SubLSymbol DECLARE = makeSublispSymbol("DECLARE");
    SubLSymbol DECLAIM = makeSublispSymbol("DECLAIM");
    SubLSymbol PROCLAIM = makeSublispSymbol("PROCLAIM");
    SubLSymbol QUOTE = makeSublispSymbol("QUOTE");
    SubLSymbol FUNCTION = makeSublispSymbol("FUNCTION");
    SubLSymbol WITH_ERROR_HANDLER = makeSublispSymbol("WITH-ERROR-HANDLER");
    SubLSymbol WITH_STATIC_AREA = makeSublispSymbol("WITH-STATIC-AREA");
    SubLSymbol WITH_THREAD_PRIVATE_AREA = makeSublispSymbol("WITH-THREAD-PRIVATE-AREA");
    SubLSymbol WITH_WORKING_AREA = makeSublispSymbol("WITH-WORKING-AREA");
    SubLSymbol QUIT = makeSublispSymbol("QUIT");
    SubLSymbol NULL = makeSublispSymbol("NULL");
    SubLSymbol BOOLEANP = makeCycSymbol("BOOLEANP");
    SubLSymbol SYMBOLP = makeSublispSymbol("SYMBOLP");
    SubLSymbol ATOM = makeSublispSymbol("ATOM");
    SubLSymbol CONSP = makeSublispSymbol("CONSP");
    SubLSymbol LISTP = makeSublispSymbol("LISTP");
    SubLSymbol SEQUENCEP = makeSublispSymbol("SEQUENCEP");
    SubLSymbol NUMBERP = makeSublispSymbol("NUMBERP");
    SubLSymbol FIXNUMP = makeSublispSymbol("FIXNUMP");
    SubLSymbol BIGNUMP = makeSublispSymbol("BIGNUMP");
    SubLSymbol SHORT_BIGNUM_P = makeSublispSymbol("SHORT-BIGNUM-P");
    SubLSymbol MEDIUM_BIGNUM_P = makeSublispSymbol("MEDIUM-BIGNUM-P");
    SubLSymbol LONG_BIGNUM_P = makeSublispSymbol("LONG-BIGNUM-P");
    SubLSymbol INTEGERP = makeSublispSymbol("INTEGERP");
    SubLSymbol FLOATP = makeSublispSymbol("FLOATP");
    SubLSymbol CHARACTERP = makeSublispSymbol("CHARACTERP");
    SubLSymbol STRINGP = makeSublispSymbol("STRINGP");
    SubLSymbol VECTORP = makeSublispSymbol("VECTORP");
    SubLSymbol FUNCTIONP = makeSublispSymbol("FUNCTIONP");
    SubLSymbol FUNCTION_SPEC_P = makeSublispSymbol("FUNCTION-SPEC-P");
    SubLSymbol PROCESSP = makeSublispSymbol("PROCESSP");
    SubLSymbol LOCK_P = makeSublispSymbol("LOCK-P");
    SubLSymbol RW_LOCK_P = makeSublispSymbol("RW-LOCK-P");
    SubLSymbol HASH_TABLE_P = makeSublispSymbol("HASH-TABLE-P");
    SubLSymbol STRUCTURE_P = makeSublispSymbol("STRUCTURE-P");
    SubLSymbol PACKAGEP = makeSublispSymbol("PACKAGEP");
    SubLSymbol GUID_P = makeSublispSymbol("GUID-P");
    SubLSymbol HASH_TABLE_ITERATOR_P = makeSublispSymbol("HASH-TABLE-ITERATOR-P");
    SubLSymbol PACKAGE_ITERATOR_P = makeSublispSymbol("PACKAGE-ITERATOR-P");
    SubLSymbol STREAMP = makeSublispSymbol("STREAMP");
    SubLSymbol INPUT_STREAM_P = makeSublispSymbol("INPUT-STREAM-P");
    SubLSymbol OUTPUT_STREAM_P = makeSublispSymbol("OUTPUT-STREAM-P");
    SubLSymbol KEYWORDP = makeSublispSymbol("KEYWORDP");

    SubLSymbol NON_NEGATIVE_NUMBER_P = makeCycSymbol("NON-NEGATIVE-NUMBER-P");

    SubLSymbol ELEMENT_TYPE_KEYWORD = makeKeyword("ELEMENT-TYPE");
    SubLSymbol TEXT_KEYWORD = makeKeyword("TEXT");
    SubLSymbol BINARY_KEYWORD = makeKeyword("BINARY");
    SubLSymbol DIRECTION_KEYWORD = makeKeyword("DIRECTION");
    SubLSymbol INPUT_KEYWORD = makeKeyword("INPUT");
    SubLSymbol OUTPUT_KEYWORD = makeKeyword("OUTPUT");
    SubLSymbol IO_KEYWORD = makeKeyword("IO");
    SubLSymbol PROBE_KEYWORD = makeKeyword("PROBE");
    SubLSymbol IF_EXISTS_KEYWORD = makeKeyword("IF-EXISTS");
    SubLSymbol IF_DOES_NOT_EXIST_KEYWORD = makeKeyword("IF-DOES-NOT-EXIST");
    SubLSymbol ERROR_KEYWORD = makeKeyword("ERROR");
    SubLSymbol NEW_VERSION_KEYWORD = makeKeyword("NEW-VERSION");
    SubLSymbol RENAME_AND_DELETE_KEYWORD = makeKeyword("RENAME-AND-DELETE");
    SubLSymbol OVERWRITE_KEYWORD = makeKeyword("OVERWRITE");
    SubLSymbol APPEND_KEYWORD = makeKeyword("APPEND");
    SubLSymbol SUPERSEDE_KEYWORD = makeKeyword("SUPERSEDE");
    SubLSymbol CREATE_KEYWORD = makeKeyword("CREATE");
    SubLSymbol EXTERNAL_FORMAT_KEYWORD = makeKeyword("EXTERNAL-FORMAT");
    SubLSymbol START_KEYWORD = makeKeyword("START");
    SubLSymbol END_KEYWORD = makeKeyword("END");

    SubLSymbol TERMINAL_IO = makeSublispSymbol("*TERMINAL-IO*");
    SubLSymbol STANDARD_INPUT = makeSublispSymbol("*STANDARD-INPUT*");
    SubLSymbol STANDARD_OUTPUT = makeSublispSymbol("*STANDARD-OUTPUT*");
    SubLSymbol ERROR_OUTPUT = makeSublispSymbol("*ERROR-OUTPUT*");
    SubLSymbol DEBUG_IO = makeSublispSymbol("*DEBUG-IO*");
    SubLSymbol NULL_INPUT = makeSublispSymbol("*NULL-INPUT*");
    SubLSymbol NULL_OUTPUT = makeSublispSymbol("*NULL-OUTPUT*");
    SubLSymbol QUERY_IO = makeSublispSymbol("*QUERY-IO*");
    SubLSymbol TRACE_OUTPUT = makeSublispSymbol("*TRACE-OUTPUT*");

    SubLInteger $int$100 = makeInteger(100);
    SubLInteger $int$1000 = makeInteger(1000);
    SubLInteger $int$_1 = makeInteger(-1);
    SubLInteger $int$_2 = makeInteger(-2);
    SubLInteger $int$32 = makeInteger(32);
    SubLInteger $int$64 = makeInteger(64);
    SubLInteger $int$255 = makeInteger(255);
    SubLInteger $int$256 = makeInteger(256);
    SubLInteger $int$512 = makeInteger(512);
    SubLInteger $int$4095 = makeInteger(4095);
    SubLInteger $int$4096 = makeInteger(4096);

    SubLInteger $int$21 = makeInteger(21);

    SubLInteger $int$22 = makeInteger(22);

    SubLInteger $int$23 = makeInteger(23);

    SubLInteger $int$24 = makeInteger(24);

    SubLInteger $int$25 = makeInteger(25);

    SubLInteger $int$26 = makeInteger(26);

    SubLInteger $int$27 = makeInteger(27);

    SubLInteger $int$28 = makeInteger(28);

    SubLInteger $int$29 = makeInteger(29);

    SubLInteger $int$30 = makeInteger(30);

    SubLInteger $int$31 = makeInteger(31);

    SubLInteger $int$33 = makeInteger(33);

    SubLInteger $int$34 = makeInteger(34);

    SubLInteger $int$35 = makeInteger(35);

    SubLInteger $int$36 = makeInteger(36);

    SubLInteger $int$37 = makeInteger(37);

    SubLInteger $int$38 = makeInteger(38);

    SubLInteger $int$39 = makeInteger(39);

    SubLInteger $int$40 = makeInteger(40);

    SubLInteger $int$41 = makeInteger(41);

    SubLInteger $int$42 = makeInteger(42);

    SubLInteger $int$43 = makeInteger(43);

    SubLInteger $int$44 = makeInteger(44);

    SubLInteger $int$45 = makeInteger(45);

    SubLInteger $int$46 = makeInteger(46);

    SubLInteger $int$47 = makeInteger(47);

    SubLInteger $int$48 = makeInteger(48);

    SubLInteger $int$49 = makeInteger(49);

    int PROCESS_TO_END = Integer.MAX_VALUE;
}
