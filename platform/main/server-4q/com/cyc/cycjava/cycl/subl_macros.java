package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.subl_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class subl_macros extends SubLTranslatedFile {
    public static final SubLFile me = new subl_macros();

    public static final String myName = "com.cyc.cycjava.cycl.subl_macros";

    public static final String myFingerPrint = "83c70bf0e3123160608f92d661c9ab0ea0f69353ab9d704f32c0457e35519520";

    // deflexical
    /**
     * When non-NIL, ASSERT-TYPE and ASSERT-MUST statements are ignored. Otherwise,
     * they expand into CHECK-TYPE and MUST statements, respectively.
     */
    public static final SubLSymbol $ignore_assert_typesP$ = makeSymbol("*IGNORE-ASSERT-TYPES?*");



    private static final SubLList $list1 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLSymbol REPEAT_FOREVER = makeSymbol("REPEAT-FOREVER");

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");

    private static final SubLList $list7 = list(list(makeSymbol("NUMBER-VAR"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), list(makeSymbol("DELTA"), ONE_INTEGER), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list8 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("DELTA"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    private static final SubLSymbol $sym15$1_ = makeSymbol("1+");

    private static final SubLSymbol $sym16$_ = makeSymbol("+");

    private static final SubLSymbol $sym17$DELTA_VAR = makeUninternedSymbol("DELTA-VAR");

    private static final SubLSymbol $sym18$END_VAR = makeUninternedSymbol("END-VAR");

    private static final SubLSymbol DO_NUMBERS_ENDTEST_MACRO = makeSymbol("DO-NUMBERS-ENDTEST-MACRO");







    private static final SubLList $list23 = list(makeSymbol("NUMBER-VAR"), makeSymbol("DELTA-FORM"), makeSymbol("END-VAR"));

    public static final SubLSymbol $sym24$__ = makeSymbol(">=");

    private static final SubLSymbol $sym25$__ = makeSymbol("<=");

    private static final SubLSymbol $sym26$_ = makeSymbol("=");

    private static final SubLSymbol DO_NUMBERS_ENDTEST = makeSymbol("DO-NUMBERS-ENDTEST");



    public static final SubLList $list29 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list30 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-MESSAGE"));



    private static final SubLSymbol $sym32$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym33$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    private static final SubLSymbol $sym34$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym35$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLList $list36 = list(ZERO_INTEGER);









    private static final SubLSymbol $sym41$REST = makeUninternedSymbol("REST");









    private static final SubLSymbol DO_LIST_INDEX = makeSymbol("DO-LIST-INDEX");

    private static final SubLList $list47 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list48 = list(makeKeyword("DONE"));

    private static final SubLSymbol $sym49$LIST_VAR = makeUninternedSymbol("LIST-VAR");



    private static final SubLList $list51 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list(makeKeyword("INDEX"), makeKeyword("DONE"));



    private static final SubLSymbol $sym54$CONS = makeUninternedSymbol("CONS");



    private static final SubLSymbol DO_ALIST_VALUES = makeSymbol("DO-ALIST-VALUES");

    public static final SubLList $list57 = list(list(makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym58$KEY = makeUninternedSymbol("KEY");



    private static final SubLSymbol DO_ALIST_KEYS = makeSymbol("DO-ALIST-KEYS");

    private static final SubLList $list61 = list(list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym62$VALUE = makeUninternedSymbol("VALUE");

    private static final SubLSymbol CINC_ALIST = makeSymbol("CINC-ALIST");

    private static final SubLList $list64 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("INCREMENT"), ONE_INTEGER));

    private static final SubLSymbol $sym65$ENTRY = makeUninternedSymbol("ENTRY");













    private static final SubLSymbol CDEC_ALIST = makeSymbol("CDEC-ALIST");

    public static final SubLList $list73 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("DECREMENT"), ONE_INTEGER));

    private static final SubLSymbol DO_PLIST = makeSymbol("DO-PLIST");

    private static final SubLList $list75 = list(list(makeSymbol("PROPERTY"), makeSymbol("VALUE"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym76$REMAINDER = makeUninternedSymbol("REMAINDER");





    private static final SubLSymbol DO_PLIST_PROPERTIES = makeSymbol("DO-PLIST-PROPERTIES");

    private static final SubLList $list80 = list(list(makeSymbol("PROPERTY"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym81$VALUE = makeUninternedSymbol("VALUE");

    private static final SubLSymbol DO_PLIST_VALUES = makeSymbol("DO-PLIST-VALUES");

    private static final SubLList $list83 = list(list(makeSymbol("VALUE"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym84$PROPERTY = makeUninternedSymbol("PROPERTY");

    private static final SubLList $list85 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CDOCONS = makeSymbol("CDOCONS");

    public static final SubLList $list87 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol DO_PAIRS = makeSymbol("DO-PAIRS");

    private static final SubLList $list90 = list(list(makeSymbol("VAR1"), makeSymbol("VAR2"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym91$LIST = makeUninternedSymbol("LIST");







    private static final SubLSymbol DO_LIST_WITH_TAIL = makeSymbol("DO-LIST-WITH-TAIL");

    private static final SubLList $list96 = list(list(makeSymbol("ITEM"), makeSymbol("TAIL"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym97$CDR_VAR = makeUninternedSymbol("CDR-VAR");

    private static final SubLSymbol DOLISTS = makeSymbol("DOLISTS");

    public static final SubLList $list99 = list(list(makeSymbol("&REST"), makeSymbol("SPECS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str100$CURRENT__A = makeString("CURRENT-~A");



    private static final SubLSymbol DO_STRING = makeSymbol("DO-STRING");

    private static final SubLList $list103 = list(list(makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("CHAR-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list104 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("CHAR-NUM"), makeKeyword("DONE"));



    private static final SubLSymbol DO_STRING_INDEX = makeSymbol("DO-STRING-INDEX");

    private static final SubLSymbol $sym107$CHAR_NUM = makeUninternedSymbol("CHAR-NUM");

    private static final SubLList $list108 = list(list(makeSymbol("CHAR-NUM"), makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list109 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("DONE"));

    private static final SubLSymbol $sym110$STRING_VAR = makeUninternedSymbol("STRING-VAR");

    private static final SubLSymbol $sym111$END_VAR = makeUninternedSymbol("END-VAR");







    private static final SubLList $list115 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list116 = list(makeKeyword("ELEMENT-NUM"), makeKeyword("DONE"), makeKeyword("BACKWARD?"));





    private static final SubLSymbol DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");

    private static final SubLSymbol $sym120$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");

    public static final SubLList $list121 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list122 = list(makeKeyword("DONE"), makeKeyword("BACKWARD?"));

    private static final SubLSymbol $sym123$VECTOR_VAR = makeUninternedSymbol("VECTOR-VAR");

    private static final SubLSymbol $sym124$BACKWARD__VAR = makeUninternedSymbol("BACKWARD?-VAR");

    private static final SubLSymbol $sym125$LENGTH = makeUninternedSymbol("LENGTH");

    private static final SubLSymbol $sym126$START = makeUninternedSymbol("START");

    private static final SubLSymbol $sym127$END = makeUninternedSymbol("END");

    private static final SubLSymbol $sym128$DELTA = makeUninternedSymbol("DELTA");



    private static final SubLSymbol $sym130$_ = makeSymbol("-");

    public static final SubLList $list131 = list(ONE_INTEGER);

    private static final SubLList $list132 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);



    private static final SubLSymbol $sym134$ITERATION = makeUninternedSymbol("ITERATION");



    private static final SubLList $list136 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CSOME_VECTOR = makeSymbol("CSOME-VECTOR");

    private static final SubLList $list138 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SMART_CSOMEVECTOR = makeSymbol("SMART-CSOMEVECTOR");

    private static final SubLSymbol DO_SEQUENCE = makeSymbol("DO-SEQUENCE");

    private static final SubLList $list141 = list(list(makeSymbol("VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list142 = list(makeKeyword("ELEMENT-NUM"), makeKeyword("DONE"));

    private static final SubLSymbol DO_SEQUENCE_INDEX = makeSymbol("DO-SEQUENCE-INDEX");

    private static final SubLSymbol $sym144$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");

    private static final SubLList $list145 = list(list(makeSymbol("KEY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym146$SEQUENCE_VAR = makeUninternedSymbol("SEQUENCE-VAR");

    private static final SubLSymbol $sym147$END_INDEX = makeUninternedSymbol("END-INDEX");

    private static final SubLSymbol $sym148$SEQUENCE_DONE_ = makeUninternedSymbol("SEQUENCE-DONE?");





    private static final SubLSymbol $sym151$DO_SEQUENCE_INDEX_DONE_ = makeSymbol("DO-SEQUENCE-INDEX-DONE?");

    private static final SubLSymbol $sym152$DO_SEQUENCE_INDEX_VALUE_ = makeSymbol("DO-SEQUENCE-INDEX-VALUE?");



    private static final SubLSymbol DO_SEQUENCE_INDEX_UPDATE = makeSymbol("DO-SEQUENCE-INDEX-UPDATE");



    private static final SubLList $list156 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("HASH-TABLE"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym157$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym158$SILENT_ = makeUninternedSymbol("SILENT?");

    private static final SubLSymbol $sym159$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    private static final SubLSymbol $sym160$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    private static final SubLSymbol $sym161$COUNT_VAR = makeUninternedSymbol("COUNT-VAR");

    private static final SubLList $list162 = list(makeSymbol("*SILENT-PROGRESS?*"));

    private static final SubLSymbol $sym163$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");



    private static final SubLList $list165 = list(makeString(""));

    private static final SubLSymbol HASH_TABLE_COUNT = makeSymbol("HASH-TABLE-COUNT");

    private static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLSymbol DO_HASH_TABLE_DONE_CHECK = makeSymbol("DO-HASH-TABLE-DONE-CHECK");



    private static final SubLSymbol DO_HASH_TABLE_KEYS = makeSymbol("DO-HASH-TABLE-KEYS");

    private static final SubLList $list172 = list(list(makeSymbol("KEY"), makeSymbol("HASH-TABLE"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym173$NO_VALUE = makeUninternedSymbol("NO-VALUE");

    public static final SubLList $list174 = list(makeSymbol("TAG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym175$CATCH_VAR = makeUninternedSymbol("CATCH-VAR");



    private static final SubLSymbol PUNLESS_ERROR = makeSymbol("PUNLESS-ERROR");

    public static final SubLList $list178 = list(makeSymbol("FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym179$ERROR = makeUninternedSymbol("ERROR");



    private static final SubLSymbol PWHEN_ERROR = makeSymbol("PWHEN-ERROR");

    private static final SubLSymbol $sym182$ERROR = makeUninternedSymbol("ERROR");



    private static final SubLSymbol WARN_ON_ERRORS = makeSymbol("WARN-ON-ERRORS");

    private static final SubLSymbol $sym185$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES = makeSymbol("WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES");





    private static final SubLString $str189$_A = makeString("~A");

    private static final SubLSymbol POSSIBLY_WARN_ON_ERRORS = makeSymbol("POSSIBLY-WARN-ON-ERRORS");

    private static final SubLList $list191 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol POSSIBLY_IGNORE_ERRORS = makeSymbol("POSSIBLY-IGNORE-ERRORS");

    private static final SubLSymbol IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");

    private static final SubLSymbol WARN_OR_IGNORE_ERRORS = makeSymbol("WARN-OR-IGNORE-ERRORS");

    private static final SubLSymbol WITH_DEFAULT_ERROR_HANDLING = makeSymbol("WITH-DEFAULT-ERROR-HANDLING");



    private static final SubLSymbol CUNWIND_ON_FAILURE = makeSymbol("CUNWIND-ON-FAILURE");

    private static final SubLList $list199 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym200$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");



    public static final SubLList $list202 = list(T);

    private static final SubLSymbol CUNWIND_PROTECT_WITH_FAIL_CLAUSE = makeSymbol("CUNWIND-PROTECT-WITH-FAIL-CLAUSE");

    private static final SubLList $list204 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("FAILURE-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym205$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");

    private static final SubLSymbol $sym206$_IGNORE_ASSERT_TYPES__ = makeSymbol("*IGNORE-ASSERT-TYPES?*");



    private static final SubLList $list208 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));



    private static final SubLSymbol ASSERT_TYPE_IF_PRESENT = makeSymbol("ASSERT-TYPE-IF-PRESENT");



    private static final SubLSymbol ASSERT_LIST_TYPE = makeSymbol("ASSERT-LIST-TYPE");

    private static final SubLList $list213 = list(makeSymbol("LIST"), makeSymbol("PRED"));

    private static final SubLSymbol CHECK_LIST_TYPE = makeSymbol("CHECK-LIST-TYPE");

    private static final SubLSymbol ASSERT_PLIST_TYPE = makeSymbol("ASSERT-PLIST-TYPE");

    public static final SubLList $list216 = list(makeSymbol("PLIST"), makeSymbol("PRED"));

    private static final SubLSymbol CHECK_PLIST_TYPE = makeSymbol("CHECK-PLIST-TYPE");

    private static final SubLSymbol ASSERT_MUST = makeSymbol("ASSERT-MUST");

    private static final SubLList $list219 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    private static final SubLList $list220 = list(makeSymbol("PROGN"));



    private static final SubLSymbol PCASE_FEATURE = makeSymbol("PCASE-FEATURE");

    private static final SubLList $list223 = cons(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("BODY"));





    private static final SubLList $list226 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));

    private static final SubLList $list227 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("FEATURE-CLAUSES"));



    public static final SubLList $list229 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PUNLESS_FEATURE = makeSymbol("PUNLESS-FEATURE");

    private static final SubLSymbol FCASE_FEATURE = makeSymbol("FCASE-FEATURE");

    private static final SubLList $list232 = list(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("FORM"));

    private static final SubLSymbol FIF_FEATURE = makeSymbol("FIF-FEATURE");

    private static final SubLSymbol FWHEN_FEATURE = makeSymbol("FWHEN-FEATURE");

    private static final SubLSymbol FEATURE_MATCH = makeSymbol("FEATURE-MATCH");

    private static final SubLList $list236 = list(makeSymbol("FEATURE-CLAUSE"));

    private static final SubLSymbol FUNLESS_FEATURE = makeSymbol("FUNLESS-FEATURE");

    private static final SubLList $list238 = list(NIL);

    private static final SubLSymbol FIMPLIES_FEATURE = makeSymbol("FIMPLIES-FEATURE");

    public static final SubLList $list240 = list(list(makeSymbol("OTHERWISE"), T));

    private static final SubLSymbol ATOMIC_FEATURE_MATCH = makeSymbol("ATOMIC-FEATURE-MATCH");

    private static final SubLSymbol FEATURE_EXPRESSION_MATCH = makeSymbol("FEATURE-EXPRESSION-MATCH");

    public static final SubLList $list243 = cons(makeSymbol("OPERATOR"), makeSymbol("SUBEXPRESSIONS"));



    private static final SubLSymbol NOT = makeSymbol("NOT");









    private static final SubLString $str250$_S_is_not_a_well_formed_feature_e = makeString("~S is not a well-formed feature expression");

    private static final SubLSymbol FUNCALL_IF = makeSymbol("FUNCALL-IF");

    private static final SubLList $list252 = list(makeSymbol("FUNC"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLList $list253 = list(makeSymbol("FALSE"));





    private static final SubLSymbol CPUSH_IF = makeSymbol("CPUSH-IF");

    private static final SubLList $list257 = list(makeSymbol("ITEM"), makeSymbol("PLACE"));

    private static final SubLSymbol $sym258$VAR = makeUninternedSymbol("VAR");

    private static final SubLSymbol CPUSHNEW_IF = makeSymbol("CPUSHNEW-IF");

    private static final SubLList $list260 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));

    private static final SubLList $list261 = list(makeSymbol("FUNCTION"), EQL);

    private static final SubLList $list262 = list(makeSymbol("FUNCTION"), IDENTITY);

    private static final SubLSymbol $sym263$VAR = makeUninternedSymbol("VAR");



    private static final SubLSymbol CPUSH_ALL = makeSymbol("CPUSH-ALL");

    private static final SubLList $list266 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"));

    private static final SubLSymbol $sym267$ITEM = makeUninternedSymbol("ITEM");

    private static final SubLSymbol $sym268$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");



    private static final SubLSymbol CPUSHNEW_ALL = makeSymbol("CPUSHNEW-ALL");

    private static final SubLList $list271 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));

    private static final SubLSymbol $sym272$ITEM = makeUninternedSymbol("ITEM");

    private static final SubLSymbol $sym273$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");

    private static final SubLSymbol CSETF_DELETE = makeSymbol("CSETF-DELETE");

    private static final SubLList $list275 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&KEY"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));

    private static final SubLList $list276 = list(makeKeyword("TEST"), makeKeyword("KEY"));









    private static final SubLSymbol CPUSH_END = makeSymbol("CPUSH-END");

    private static final SubLSymbol $sym282$NEW_CONS = makeUninternedSymbol("NEW-CONS");

    private static final SubLSymbol $sym283$LIST = makeUninternedSymbol("LIST");

    private static final SubLSymbol RPLACD_LAST = makeSymbol("RPLACD-LAST");

    private static final SubLSymbol CPUSHNEW_END = makeSymbol("CPUSHNEW-END");

    private static final SubLSymbol $sym286$ITEM_VAR = makeUninternedSymbol("ITEM-VAR");



    private static final SubLSymbol $sym288$WAS_APPENDING_ = makeUninternedSymbol("WAS-APPENDING?");



    private static final SubLList $list290 = list(list(makeSymbol("EVAL"), list(makeSymbol("QUOTE"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"))));

    private static final SubLList $list291 = list(makeSymbol("EVAL"), list(makeSymbol("QUOTE"), list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL)));



    private static final SubLList $list293 = list(makeSymbol("QUOTE"), makeSymbol("CSETQ"));

    private static final SubLList $list294 = list(makeSymbol("QUOTE"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"));

    private static final SubLSymbol SILENTLY = makeSymbol("SILENTLY");

    private static final SubLList $list296 = list(list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")));



    private static final SubLList $list298 = list(makeSymbol("LHS"), makeSymbol("RHS"));

    private static final SubLSymbol FXOR = makeSymbol("FXOR");

    private static final SubLList $list300 = list(makeSymbol("A"), makeSymbol("B"));

    private static final SubLSymbol FEQUIV = makeSymbol("FEQUIV");

    private static final SubLList $list302 = list(makeSymbol("VAR?"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static SubLObject until(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        test = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CDO, NIL, list(test), append(body, NIL));
    }

    public static SubLObject sublisp_while(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        test = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(UNTIL, list(CNOT, test), append(body, NIL));
    }

    public static SubLObject repeat_forever(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WHILE, T, append(body, NIL));
    }

    public static SubLObject do_numbers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject number_var = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        number_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list7);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list7);
            if (NIL == member(current_$1, $list8, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list7);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject delta_tail = property_list_member($DELTA, current);
        final SubLObject delta = (NIL != delta_tail) ? cadr(delta_tail) : ONE_INTEGER;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if ((((ZERO_INTEGER.eql(start) && end.isInteger()) && (!end.isNegative())) && ONE_INTEGER.eql(delta)) && (NIL == done)) {
            return listS(CDOTIMES, list(number_var, end), append(body, NIL));
        }
        SubLObject clet_initializations = NIL;
        SubLObject delta_form = NIL;
        SubLObject update_form = NIL;
        SubLObject end_test_form = NIL;
        SubLObject iteration_form = NIL;
        if (ONE_INTEGER.eql(delta)) {
            delta_form = ONE_INTEGER;
            update_form = list($sym15$1_, number_var);
        } else
            if (delta.isAtom()) {
                delta_form = delta;
                update_form = list($sym16$_, number_var, delta);
            } else {
                final SubLObject delta_var = $sym17$DELTA_VAR;
                clet_initializations = cons(list(delta_var, delta), clet_initializations);
                delta_form = delta_var;
                update_form = list($sym16$_, number_var, delta_var);
            }

        if (NIL != end) {
            final SubLObject end_var = $sym18$END_VAR;
            clet_initializations = cons(list(end_var, end), clet_initializations);
            end_test_form = list(DO_NUMBERS_ENDTEST_MACRO, number_var, delta_form, end_var);
        }
        if (NIL != done) {
            if (NIL != end_test_form) {
                end_test_form = list(COR, done, end_test_form);
            } else {
                end_test_form = done;
            }
        }
        iteration_form = listS(CDO, list(list(number_var, start, update_form)), list(end_test_form), append(body, NIL));
        if (NIL != clet_initializations) {
            iteration_form = list(CLET, clet_initializations, iteration_form);
        }
        if (NIL != done) {
            iteration_form = list(PUNLESS, done, iteration_form);
        }
        return iteration_form;
    }

    public static SubLObject do_numbers_endtest_macro(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject number_var = NIL;
        SubLObject delta_form = NIL;
        SubLObject end_var = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        number_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        delta_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        end_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list23);
            return NIL;
        }
        if (!delta_form.isNumber()) {
            return list(DO_NUMBERS_ENDTEST, number_var, delta_form, end_var);
        }
        if (delta_form.isPositive()) {
            return list($sym24$__, number_var, end_var);
        }
        if (delta_form.isNegative()) {
            return list($sym25$__, number_var, end_var);
        }
        return list($sym26$_, number_var, end_var);
    }

    public static SubLObject do_numbers_endtest(final SubLObject number, final SubLObject delta, final SubLObject end) {
        if (delta.isPositive()) {
            return numGE(number, end);
        }
        if (delta.isNegative()) {
            return numLE(number, end);
        }
        return numE(number, end);
    }

    public static SubLObject do_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list29);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list29);
            if (NIL == member(current_$2, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list29);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject message_var = $sym32$MESSAGE_VAR;
            final SubLObject list_var = $sym33$LIST_VAR;
            final SubLObject sofar = $sym34$SOFAR;
            final SubLObject total = $sym35$TOTAL;
            return list(CLET, list(list(message_var, progress_message), list(list_var, list), bq_cons(sofar, $list36), list(total, list(LENGTH, list_var))), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_LIST, list(var, list_var, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, sofar), append(body, NIL))));
        }
        if (NIL != done) {
            final SubLObject rest_$3 = $sym41$REST;
            return list(CDO, list(list(rest_$3, list, list(CDR, rest_$3))), list(list(COR, done, list(NULL, rest_$3))), listS(CLET, list(list(var, list(CAR, rest_$3))), append(body, NIL)));
        }
        return listS(CDOLIST, list(var, list), append(body, NIL));
    }

    public static SubLObject do_list_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$4, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject list_var = $sym49$LIST_VAR;
        return listS(CDO, list(list(list_var, list, list(CDR, list_var)), list(value, list(CAR, list_var), list(CAR, list_var)), list(key, ZERO_INTEGER, list($sym15$1_, key))), list(list(COR, done, list(NULL, list_var))), append(body, NIL));
    }

    public static SubLObject do_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list51);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list51);
            if (NIL == member(current_$5, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list51);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != index) {
            return list(CLET, list(bq_cons(index, $list36)), listS(DO_ALIST, list(key, value, alist, $DONE, done), append(body, list(list(CINC, index)))));
        }
        final SubLObject cons = $sym54$CONS;
        return list(DO_LIST, list(cons, alist, $DONE, done), listS(CDESTRUCTURING_BIND, bq_cons(key, value), cons, append(body, NIL)));
    }

    public static SubLObject do_alist_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$6, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key = $sym58$KEY;
        return listS(DO_ALIST, list(key, value, alist, $DONE, done), list(IGNORE, key), append(body, NIL));
    }

    public static SubLObject do_alist_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list61);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list61);
            if (NIL == member(current_$7, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list61);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject value = $sym62$VALUE;
        return listS(DO_ALIST, list(key, value, alist, $DONE, done), list(IGNORE, value), append(body, NIL));
    }

    public static SubLObject cinc_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        alist = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : EQL;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        final SubLObject increment = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        if (NIL == current) {
            final SubLObject entry = $sym65$ENTRY;
            return list(CLET, list(list(entry, list(ASSOC, key, alist, list(QUOTE, test)))), list(PUNLESS, entry, list(CSETQ, entry, listS(CONS, key, $list36)), list(CPUSH, entry, alist)), list(RPLACD, entry, list($sym16$_, list(CDR, entry), increment)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject cdec_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list73);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list73);
        alist = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : EQL;
        destructuring_bind_must_listp(current, datum, $list73);
        current = current.rest();
        final SubLObject decrement = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list73);
        current = current.rest();
        if (NIL == current) {
            return list(CINC_ALIST, key, alist, test, minus(decrement));
        }
        cdestructuring_bind_error(datum, $list73);
        return NIL;
    }

    public static SubLObject do_plist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property = NIL;
        SubLObject value = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list75);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list75);
            if (NIL == member(current_$8, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list75);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject remainder = $sym76$REMAINDER;
        return list(CDO, list(list(remainder, plist, list(CDDR, remainder))), list(list(COR, done, list(NULL, remainder))), listS(CLET, list(list(property, list(CAR, remainder)), list(value, list(CADR, remainder))), append(body, NIL)));
    }

    public static SubLObject do_plist_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list80);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list80);
            if (NIL == member(current_$9, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list80);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject value = $sym81$VALUE;
        return listS(DO_PLIST, list(property, value, plist, $DONE, done), list(IGNORE, value), append(body, NIL));
    }

    public static SubLObject do_plist_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list83);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list83);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list83);
            if (NIL == member(current_$10, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list83);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject property = $sym84$PROPERTY;
        return listS(DO_PLIST, list(property, value, plist, $DONE, done), list(IGNORE, property), append(body, NIL));
    }

    public static SubLObject smart_csome(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject list = NIL;
        SubLObject donevar = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        donevar = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_LIST, list(var, list, $DONE, donevar), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list85);
        return NIL;
    }

    public static SubLObject cdocons(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list87);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        destructuring_bind_must_consp(current, datum, $list87);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list87);
        listform = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list87);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list87);
            if (NIL == member(current_$11, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list87);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != done) {
            return listS(CDO, list(list(var, listform, list(CDR, var))), list(list(COR, done, list(ATOM, var))), append(body, NIL));
        }
        return listS(CDO, list(list(var, listform, list(CDR, var))), list(list(ATOM, var)), append(body, NIL));
    }

    public static SubLObject do_pairs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var1 = NIL;
        SubLObject var2 = NIL;
        SubLObject listform = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        var1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        var2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        listform = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list90);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list90);
            if (NIL == member(current_$12, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list90);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject list = $sym91$LIST;
        return list(CDOCONS, list(list, listform, $DONE, done), list(CLET, list(list(var1, list(FIRST, list))), listS(CSOME, list(var2, list(REST, list), done), append(body, NIL))));
    }

    public static SubLObject do_list_with_tail(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = NIL;
        SubLObject tail = NIL;
        SubLObject listform = NIL;
        destructuring_bind_must_consp(current, datum, $list96);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        tail = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        listform = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list96);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list96);
            if (NIL == member(current_$13, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list96);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject cdr_var = $sym97$CDR_VAR;
        return list(CDOCONS, list(cdr_var, listform, $DONE, done), listS(CLET, list(list(item, list(CAR, cdr_var)), list(tail, list(CDR, cdr_var))), append(body, NIL)));
    }

    public static SubLObject dolists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        final SubLObject specs;
        current = specs = current.first();
        final SubLObject body;
        current = body = temp;
        SubLObject forms = NIL;
        SubLObject steppers = NIL;
        SubLObject cdolist_list_var = specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = spec.first();
            final SubLObject list = cadr(spec);
            final SubLObject listvar = make_symbol(format(NIL, $str100$CURRENT__A, var));
            forms = cons(list(listvar, list, list(CDR, listvar)), forms);
            forms = cons(list(var, list(CAR, listvar), list(CAR, listvar)), forms);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        forms = nreverse(forms);
        SubLObject current_forms = NIL;
        SubLObject stepper = NIL;
        current_forms = forms;
        stepper = caar(current_forms);
        while (NIL != current_forms) {
            steppers = cons(stepper, steppers);
            current_forms = cddr(current_forms);
            stepper = caar(current_forms);
        } 
        return listS(CDO, forms, list(list(CNOT, bq_cons(CAND, append(steppers, NIL)))), append(body, NIL));
    }

    public static SubLObject do_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_char = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        v_char = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list103);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list103);
            if (NIL == member(current_$14, $list104, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list103);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject char_num_tail = property_list_member($CHAR_NUM, current);
        final SubLObject char_num = (NIL != char_num_tail) ? cadr(char_num_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != char_num) {
            return listS(DO_STRING_INDEX, list(new SubLObject[]{ char_num, v_char, string, $START, start, $END, end, $DONE, done }), append(body, NIL));
        }
        final SubLObject char_num_$15 = $sym107$CHAR_NUM;
        return listS(DO_STRING, list(new SubLObject[]{ v_char, string, $CHAR_NUM, char_num_$15, $START, start, $END, end, $DONE, done }), list(IGNORE, char_num_$15), append(body, NIL));
    }

    public static SubLObject do_string_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject char_num = NIL;
        SubLObject v_char = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list108);
        char_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        v_char = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$16 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list108);
            current_$16 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list108);
            if (NIL == member(current_$16, $list109, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$16 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list108);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject string_var = $sym110$STRING_VAR;
        final SubLObject end_var = $sym111$END_VAR;
        SubLObject end_init_form = NIL;
        if (end.isInteger()) {
            end_init_form = end;
        } else
            if (NIL == end) {
                end_init_form = list(LENGTH, string_var);
            } else {
                end_init_form = list(FIF, end, end, list(LENGTH, string_var));
            }

        return list(CLET, list(list(string_var, string), list(end_var, end_init_form)), list(DO_NUMBERS, list(char_num, $START, start, $END, end_var, $DONE, done), listS(CLET, list(list(v_char, list(CHAR, string_var, char_num))), append(body, NIL))));
    }

    public static SubLObject do_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject vector = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        vector = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$17 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list115);
            current_$17 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list115);
            if (NIL == member(current_$17, $list116, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$17 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list115);
        }
        final SubLObject element_num_tail = property_list_member($ELEMENT_NUM, current);
        final SubLObject element_num = (NIL != element_num_tail) ? cadr(element_num_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject backwardP_tail = property_list_member($BACKWARD_, current);
        final SubLObject backwardP = (NIL != backwardP_tail) ? cadr(backwardP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != element_num) {
            return listS(DO_VECTOR_INDEX, list(element_num, var, vector, $DONE, done, $BACKWARD_, backwardP), append(body, NIL));
        }
        final SubLObject element_num_$18 = $sym120$ELEMENT_NUM;
        return listS(DO_VECTOR_INDEX, list(element_num_$18, var, vector, $DONE, done, $BACKWARD_, backwardP), list(IGNORE, element_num_$18), append(body, NIL));
    }

    public static SubLObject do_vector_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject vector = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        vector = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list121);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list121);
            if (NIL == member(current_$19, $list122, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list121);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject backwardP_tail = property_list_member($BACKWARD_, current);
        final SubLObject backwardP = (NIL != backwardP_tail) ? cadr(backwardP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject vector_var = $sym123$VECTOR_VAR;
        final SubLObject backwardP_var = $sym124$BACKWARD__VAR;
        final SubLObject length = $sym125$LENGTH;
        if (NIL != done) {
            final SubLObject start = $sym126$START;
            final SubLObject end = $sym127$END;
            final SubLObject delta = $sym128$DELTA;
            return list(CLET, list(list(vector_var, vector), list(backwardP_var, backwardP), list(length, list(LENGTH, vector_var))), list(CDESTRUCTURING_BIND, list(start, end, delta), list(FIF, backwardP_var, listS(LIST, listS($sym130$_, length, $list131), $list132), listS(LIST, ZERO_INTEGER, length, $list131)), list(DO_NUMBERS, list(new SubLObject[]{ key, $START, start, $END, end, $DONE, done, $DELTA, delta }), listS(CLET, list(list(value, list(AREF, vector_var, key))), append(body, NIL)))));
        }
        final SubLObject v_iteration = $sym134$ITERATION;
        return list(CLET, list(list(vector_var, vector), list(backwardP_var, backwardP), list(length, list(LENGTH, vector_var))), list(CDOTIMES, list(v_iteration, length), listS(CLET, list(list(key, list(FIF, backwardP_var, listS($sym130$_, length, v_iteration, $list131), v_iteration)), list(value, list(AREF, vector_var, key))), append(body, NIL))));
    }

    public static SubLObject cdovector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject vector = NIL;
        destructuring_bind_must_consp(current, datum, $list136);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list136);
        vector = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_VECTOR, list(var, vector), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list136);
        return NIL;
    }

    public static SubLObject csome_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject vector = NIL;
        SubLObject donevar = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        vector = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        donevar = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_VECTOR, list(var, vector, $DONE, donevar), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list138);
        return NIL;
    }

    public static SubLObject smart_csomevector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject vector = NIL;
        SubLObject donevar = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        vector = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        donevar = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_VECTOR, list(var, vector, $DONE, donevar), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list138);
        return NIL;
    }

    public static SubLObject do_sequence(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list141);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject sequence = NIL;
        destructuring_bind_must_consp(current, datum, $list141);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list141);
        sequence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$20 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list141);
            current_$20 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list141);
            if (NIL == member(current_$20, $list142, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$20 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list141);
        }
        final SubLObject element_num_tail = property_list_member($ELEMENT_NUM, current);
        final SubLObject element_num = (NIL != element_num_tail) ? cadr(element_num_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != element_num) {
            return listS(DO_SEQUENCE_INDEX, list(element_num, var, sequence, $DONE, done), append(body, NIL));
        }
        final SubLObject element_num_$21 = $sym144$ELEMENT_NUM;
        return listS(DO_SEQUENCE_INDEX, list(element_num_$21, var, sequence, $DONE, done), list(IGNORE, element_num_$21), append(body, NIL));
    }

    public static SubLObject do_sequence_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list145);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = NIL;
        SubLObject value_var = NIL;
        SubLObject sequence = NIL;
        destructuring_bind_must_consp(current, datum, $list145);
        key_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list145);
        value_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list145);
        sequence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$22 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list145);
            current_$22 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list145);
            if (NIL == member(current_$22, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$22 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list145);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject sequence_var = $sym146$SEQUENCE_VAR;
        final SubLObject end_index = $sym147$END_INDEX;
        final SubLObject sequence_doneP = $sym148$SEQUENCE_DONE_;
        return list(CLET, list(list(sequence_var, sequence), list(end_index, list(FUNLESS, list(LISTP, sequence_var), list(LENGTH, sequence_var))), bq_cons(key_var, $list36), list(sequence_doneP, list($sym151$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var))), list(WHILE, list(CAND, list(CNOT, sequence_doneP), list(CNOT, done)), listS(CLET, list(list(value_var, list($sym152$DO_SEQUENCE_INDEX_VALUE_, key_var, sequence_var))), append(body, list(list(PROGN, list(CSETQ, sequence_var, list(DO_SEQUENCE_INDEX_UPDATE, sequence_var)), list(CINC, key_var), list(CSETQ, sequence_doneP, list($sym151$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var))))))));
    }

    public static SubLObject do_sequence_index_doneP(final SubLObject index, final SubLObject end_index, final SubLObject sequence) {
        if (sequence.isList()) {
            return sublisp_null(sequence);
        }
        return numE(index, end_index);
    }

    public static SubLObject do_sequence_index_valueP(final SubLObject index, final SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.first();
        }
        if (sequence.isVector()) {
            return aref(sequence, index);
        }
        return Strings.sublisp_char(sequence, index);
    }

    public static SubLObject do_sequence_index_update(final SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.rest();
        }
        return sequence;
    }

    public static SubLObject do_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject hash_table = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        hash_table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$23 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list156);
            current_$23 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list156);
            if (NIL == member(current_$23, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$23 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list156);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject message_var = $sym157$MESSAGE_VAR;
            final SubLObject silentP = $sym158$SILENT_;
            final SubLObject table_var = $sym159$TABLE_VAR;
            final SubLObject index_var = $sym160$INDEX_VAR;
            final SubLObject count_var = $sym161$COUNT_VAR;
            return list(CLET, list(list(message_var, progress_message), bq_cons(silentP, $list162), list($sym163$_SILENT_PROGRESS__, list(COR, silentP, list(NULL, message_var)))), list(NOTING_PERCENT_PROGRESS, listS(FIRST_OF, message_var, $list165), list(CLET, list(list(table_var, hash_table), bq_cons(index_var, $list36), list(count_var, list(HASH_TABLE_COUNT, table_var))), list(DO_HASH_TABLE, list(key, value, table_var, $DONE, done), listS(CLET, list(list($sym163$_SILENT_PROGRESS__, silentP)), append(body, NIL)), list(CSETQ, index_var, list($sym15$1_, index_var)), list(NOTE_PERCENT_PROGRESS, index_var, count_var)))));
        }
        if (NIL != done) {
            return list(PUNLESS, done, list(CCATCH_IGNORE, $DO_HASH_TABLE, listS(DO_HASH_TABLE, list(key, value, hash_table), list(DO_HASH_TABLE_DONE_CHECK, done), append(body, NIL))));
        }
        return listS(CDOHASH, list(key, value, hash_table), append(body, NIL));
    }

    public static SubLObject do_hash_table_done_check(final SubLObject done) {
        if (NIL != done) {
            sublisp_throw($DO_HASH_TABLE, NIL);
        }
        return NIL;
    }

    public static SubLObject do_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list172);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject hash_table = NIL;
        destructuring_bind_must_consp(current, datum, $list172);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list172);
        hash_table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$24 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list172);
            current_$24 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list172);
            if (NIL == member(current_$24, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$24 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list172);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject no_value = $sym173$NO_VALUE;
        return listS(DO_HASH_TABLE, list(key, no_value, hash_table, $DONE, done, $PROGRESS_MESSAGE, progress_message), list(IGNORE, no_value), append(body, NIL));
    }

    public static SubLObject ccatch_ignore(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        tag = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject catch_var = $sym175$CATCH_VAR;
        return list(CLET, list(catch_var), list(IGNORE, catch_var), listS(CCATCH, tag, catch_var, append(body, NIL)));
    }

    public static SubLObject punless_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list178);
        form = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject error = $sym179$ERROR;
        return list(CLET, list(error), list(CATCH_ERROR_MESSAGE, list(error), form), listS(PUNLESS, error, append(body, NIL)));
    }

    public static SubLObject pwhen_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list178);
        form = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject error = $sym182$ERROR;
        return list(CLET, list(error), list(CATCH_ERROR_MESSAGE, list(error), form), listS(PWHEN, error, append(body, NIL)));
    }

    public static SubLObject warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject message_var = $sym185$MESSAGE_VAR;
        return list(CLET, list(message_var), list(WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES, listS(CATCH_ERROR_MESSAGE, list(message_var), append(body, NIL))), list(PWHEN, list(STRINGP, message_var), list(WARN, $str189$_A, message_var)));
    }

    public static SubLObject possibly_warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list191);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, var, bq_cons(WARN_ON_ERRORS, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject possibly_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list191);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, var, bq_cons(IGNORE_ERRORS, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject warn_or_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list191);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, var, bq_cons(WARN_ON_ERRORS, append(body, NIL)), bq_cons(IGNORE_ERRORS, append(body, NIL)));
    }

    public static SubLObject with_default_error_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_ERROR_HANDLER, NIL, append(body, NIL));
    }

    public static SubLObject cunwind_on_failure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject protected_form = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        protected_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject success_var = $sym200$SUCCESS_VAR;
        return list(CLET, list(success_var), list(CUNWIND_PROTECT, list(PROGN, protected_form, listS(CSETQ, success_var, $list202)), listS(PUNLESS, success_var, append(body, NIL))));
    }

    public static SubLObject cunwind_protect_with_fail_clause(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject protected_form = NIL;
        SubLObject failure_form = NIL;
        destructuring_bind_must_consp(current, datum, $list204);
        protected_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list204);
        failure_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject success_var = $sym205$SUCCESS_VAR;
        return list(CLET, list(success_var), list(CUNWIND_PROTECT, list(PROGN, protected_form, listS(CSETQ, success_var, $list202)), listS(CUNWIND_PROTECT, list(PUNLESS, success_var, failure_form), append(body, NIL))));
    }

    public static SubLObject assert_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list208);
        pred = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list208);
            return NIL;
        }
        if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
            return list(IGNORE, v_object);
        }
        return list(CHECK_TYPE, v_object, pred);
    }

    public static SubLObject assert_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list208);
        pred = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list208);
            return NIL;
        }
        if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
            return list(IGNORE, v_object);
        }
        return list(CHECK_TYPE_IF_PRESENT, v_object, pred);
    }

    public static SubLObject assert_list_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        pred = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list213);
            return NIL;
        }
        if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
            return list(IGNORE, list);
        }
        return list(CHECK_LIST_TYPE, list, pred);
    }

    public static SubLObject assert_plist_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list216);
        plist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list216);
        pred = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list216);
            return NIL;
        }
        if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
            return list(IGNORE, plist);
        }
        return list(CHECK_PLIST_TYPE, plist, pred);
    }

    public static SubLObject assert_must(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list219);
        form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list219);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
            return $list220;
        }
        return listS(MUST, form, format_string, append(v_arguments, NIL));
    }

    public static SubLObject pcase_feature(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cdolist_list_var;
        final SubLObject feature_clauses = cdolist_list_var = current;
        SubLObject feature_clause = NIL;
        feature_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$26;
            final SubLObject datum_$25 = current_$26 = feature_clause;
            SubLObject feature_expression = NIL;
            SubLObject body = NIL;
            destructuring_bind_must_consp(current_$26, datum_$25, $list223);
            feature_expression = current_$26.first();
            current_$26 = body = current_$26.rest();
            if ((OTHERWISE == feature_expression) || (NIL != feature_expression_match(feature_expression))) {
                return bq_cons(PROGN, append(body, NIL));
            }
            cdolist_list_var = cdolist_list_var.rest();
            feature_clause = cdolist_list_var.first();
        } 
        return $list220;
    }

    public static SubLObject pif_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(current, datum, $list226);
        feature_clause = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list226);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list226);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PCASE_FEATURE, list(feature_clause, action), list(OTHERWISE, else_action));
        }
        cdestructuring_bind_error(datum, $list226);
        return NIL;
    }

    public static SubLObject pwhen_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)));
    }

    public static SubLObject punless_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PCASE_FEATURE, list(feature_clause), bq_cons(OTHERWISE, append(body, NIL)));
    }

    public static SubLObject fcase_feature(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cdolist_list_var;
        final SubLObject feature_clauses = cdolist_list_var = current;
        SubLObject feature_clause = NIL;
        feature_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$28;
            final SubLObject datum_$27 = current_$28 = feature_clause;
            SubLObject feature_expression = NIL;
            SubLObject form = NIL;
            destructuring_bind_must_consp(current_$28, datum_$27, $list232);
            feature_expression = current_$28.first();
            current_$28 = current_$28.rest();
            destructuring_bind_must_consp(current_$28, datum_$27, $list232);
            form = current_$28.first();
            current_$28 = current_$28.rest();
            if (NIL == current_$28) {
                if ((OTHERWISE == feature_expression) || (NIL != feature_expression_match(feature_expression))) {
                    return form;
                }
            } else {
                cdestructuring_bind_error(datum_$27, $list232);
            }
            cdolist_list_var = cdolist_list_var.rest();
            feature_clause = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject fif_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(current, datum, $list226);
        feature_clause = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list226);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list226);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FCASE_FEATURE, list(feature_clause, action), list(OTHERWISE, else_action));
        }
        cdestructuring_bind_error(datum, $list226);
        return NIL;
    }

    public static SubLObject fwhen_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(FCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)));
    }

    public static SubLObject feature_match(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list236);
        feature_clause = current.first();
        current = current.rest();
        if (NIL == current) {
            return listS(FWHEN_FEATURE, feature_clause, $list202);
        }
        cdestructuring_bind_error(datum, $list236);
        return NIL;
    }

    public static SubLObject funless_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(FCASE_FEATURE, bq_cons(feature_clause, $list238), bq_cons(OTHERWISE, append(body, NIL)));
    }

    public static SubLObject fimplies_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(FCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)), $list240);
    }

    public static SubLObject atomic_feature_match(final SubLObject atomic_feature) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(atomic_feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject feature_expression_match(final SubLObject feature_expression) {
        if (feature_expression.isAtom()) {
            if (feature_expression.isSymbol()) {
                return atomic_feature_match(feature_expression);
            }
        } else {
            SubLObject operator = NIL;
            SubLObject subexpressions = NIL;
            destructuring_bind_must_consp(feature_expression, feature_expression, $list243);
            operator = feature_expression.first();
            final SubLObject current = subexpressions = feature_expression.rest();
            final SubLObject pcase_var = operator;
            if ((pcase_var.eql($NOT) || pcase_var.eql(NOT)) || pcase_var.eql(CNOT)) {
                return makeBoolean(NIL == feature_expression_match(subexpressions.first()));
            }
            if ((pcase_var.eql($OR) || pcase_var.eql(OR)) || pcase_var.eql(COR)) {
                SubLObject some_sub_match_succeeds = NIL;
                if (NIL == some_sub_match_succeeds) {
                    SubLObject csome_list_var;
                    SubLObject subexpression;
                    for (csome_list_var = subexpressions, subexpression = NIL, subexpression = csome_list_var.first(); (NIL == some_sub_match_succeeds) && (NIL != csome_list_var); some_sub_match_succeeds = feature_expression_match(subexpression) , csome_list_var = csome_list_var.rest() , subexpression = csome_list_var.first()) {
                    }
                }
                return some_sub_match_succeeds;
            }
            if ((pcase_var.eql($AND) || pcase_var.eql(AND)) || pcase_var.eql(CAND)) {
                SubLObject some_sub_match_fails = NIL;
                if (NIL == some_sub_match_fails) {
                    SubLObject csome_list_var;
                    SubLObject subexpression;
                    for (csome_list_var = subexpressions, subexpression = NIL, subexpression = csome_list_var.first(); (NIL == some_sub_match_fails) && (NIL != csome_list_var); some_sub_match_fails = makeBoolean(NIL == feature_expression_match(subexpression)) , csome_list_var = csome_list_var.rest() , subexpression = csome_list_var.first()) {
                    }
                }
                return makeBoolean(NIL == some_sub_match_fails);
            }
        }
        Errors.error($str250$_S_is_not_a_well_formed_feature_e, feature_expression);
        return NIL;
    }

    public static SubLObject funcall_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject func = NIL;
        destructuring_bind_must_consp(current, datum, $list252);
        func = current.first();
        final SubLObject args;
        current = args = current.rest();
        if (NIL == func) {
            return $list253;
        }
        return list(FWHEN, func, listS(FUNCALL, func, append(args, NIL)));
    }

    public static SubLObject cpush_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list257);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list257);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject var = $sym258$VAR;
            return list(CLET, list(list(var, item)), list(PWHEN, var, list(CPUSH, var, place)));
        }
        cdestructuring_bind_error(datum, $list257);
        return NIL;
    }

    public static SubLObject cpushnew_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list260);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        place = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : $list261;
        destructuring_bind_must_listp(current, datum, $list260);
        current = current.rest();
        final SubLObject key = (current.isCons()) ? current.first() : $list262;
        destructuring_bind_must_listp(current, datum, $list260);
        current = current.rest();
        if (NIL == current) {
            final SubLObject var = $sym263$VAR;
            return list(CLET, list(list(var, item)), list(PWHEN, var, list(CPUSHNEW, var, place, test, key)));
        }
        cdestructuring_bind_error(datum, $list260);
        return NIL;
    }

    public static SubLObject cpush_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject items = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list266);
        items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list266);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject item = $sym267$ITEM;
            final SubLObject items_var = $sym268$ITEMS_VAR;
            return list(CLET, list(list(items_var, items)), list(PIF, list(VECTORP, items_var), list(DO_VECTOR, list(item, items_var), list(CPUSH, item, place)), list(CDOLIST, list(item, items_var), list(CPUSH, item, place))));
        }
        cdestructuring_bind_error(datum, $list266);
        return NIL;
    }

    public static SubLObject cpushnew_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject items = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list271);
        items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list271);
        place = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : $list261;
        destructuring_bind_must_listp(current, datum, $list271);
        current = current.rest();
        final SubLObject key = (current.isCons()) ? current.first() : $list262;
        destructuring_bind_must_listp(current, datum, $list271);
        current = current.rest();
        if (NIL == current) {
            final SubLObject item = $sym272$ITEM;
            final SubLObject items_var = $sym273$ITEMS_VAR;
            return list(CLET, list(list(items_var, items)), list(PIF, list(VECTORP, items_var), list(DO_VECTOR, list(item, items_var), list(CPUSHNEW, item, place, test, key)), list(CDOLIST, list(item, items_var), list(CPUSHNEW, item, place, test, key))));
        }
        cdestructuring_bind_error(datum, $list271);
        return NIL;
    }

    public static SubLObject csetf_delete(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list275);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list275);
        place = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$29 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list275);
            current_$29 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list275);
            if (NIL == member(current_$29, $list276, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$29 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list275);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : $list261;
        final SubLObject key_tail = property_list_member($KEY, current);
        final SubLObject key = (NIL != key_tail) ? cadr(key_tail) : $list262;
        if (!key.equal($list262)) {
            return list(CSETF, place, list(DELETE, item, place, test, key));
        }
        if (test.equal($list261)) {
            return list(CSETF, place, list(DELETE, item, place));
        }
        return list(CSETF, place, list(DELETE, item, place, test));
    }

    public static SubLObject cpush_end(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list257);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list257);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_cons = $sym282$NEW_CONS;
            final SubLObject list = $sym283$LIST;
            return list(CLET, list(list(new_cons, listS(CONS, item, $list238)), list(list, place)), list(PIF, list, list(RPLACD_LAST, list, new_cons), list(CSETF, place, new_cons)));
        }
        cdestructuring_bind_error(datum, $list257);
        return NIL;
    }

    public static SubLObject cpushnew_end(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list275);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list275);
        place = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$30 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list275);
            current_$30 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list275);
            if (NIL == member(current_$30, $list276, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$30 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list275);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : $list261;
        final SubLObject key_tail = property_list_member($KEY, current);
        final SubLObject key = (NIL != key_tail) ? cadr(key_tail) : $list262;
        final SubLObject item_var = $sym286$ITEM_VAR;
        return list(CLET, list(list(item_var, item)), list(PUNLESS, list(MEMBER, item_var, place, test, key), list(CPUSH_END, item_var, place)));
    }

    public static SubLObject rplacd_last(final SubLObject non_empty_list, final SubLObject new_last_cdr) {
        return rplacd(last(non_empty_list, UNPROVIDED), new_last_cdr);
    }

    public static SubLObject without_appending_stack_traces_to_error_messages(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject was_appendingP = $sym288$WAS_APPENDING_;
        return list(PIF_FEATURE, $SL2JAVA, list(CLET, list(bq_cons(was_appendingP, $list290)), $list291, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(EVAL, list(LIST, $list293, $list294, was_appendingP)))), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject silently(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list296, append(body, NIL));
    }

    public static SubLObject fimplies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject lhs = NIL;
        SubLObject rhs = NIL;
        destructuring_bind_must_consp(current, datum, $list298);
        lhs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list298);
        rhs = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(COR, list(CNOT, lhs), rhs);
        }
        cdestructuring_bind_error(datum, $list298);
        return NIL;
    }

    public static SubLObject fxor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject a = NIL;
        SubLObject b = NIL;
        destructuring_bind_must_consp(current, datum, $list300);
        a = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        b = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CNOT, list(EQ, list(CNOT, a), list(CNOT, b)));
        }
        cdestructuring_bind_error(datum, $list300);
        return NIL;
    }

    public static SubLObject fequiv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject a = NIL;
        SubLObject b = NIL;
        destructuring_bind_must_consp(current, datum, $list300);
        a = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        b = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(EQ, list(CNOT, a), list(CNOT, b));
        }
        cdestructuring_bind_error(datum, $list300);
        return NIL;
    }

    public static SubLObject possibly_with_static_area(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject varP = NIL;
        destructuring_bind_must_consp(current, datum, $list302);
        varP = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bq_cons(PROGN, append(body, NIL));
        }
        return list(PIF, varP, bq_cons(WITH_STATIC_AREA, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject declare_subl_macros_file() {
        declareMacro(me, "until", "UNTIL");
        declareMacro(me, "sublisp_while", "WHILE");
        declareMacro(me, "repeat_forever", "REPEAT-FOREVER");
        declareMacro(me, "do_numbers", "DO-NUMBERS");
        declareMacro(me, "do_numbers_endtest_macro", "DO-NUMBERS-ENDTEST-MACRO");
        declareFunction(me, "do_numbers_endtest", "DO-NUMBERS-ENDTEST", 3, 0, false);
        declareMacro(me, "do_list", "DO-LIST");
        declareMacro(me, "do_list_index", "DO-LIST-INDEX");
        declareMacro(me, "do_alist", "DO-ALIST");
        declareMacro(me, "do_alist_values", "DO-ALIST-VALUES");
        declareMacro(me, "do_alist_keys", "DO-ALIST-KEYS");
        declareMacro(me, "cinc_alist", "CINC-ALIST");
        declareMacro(me, "cdec_alist", "CDEC-ALIST");
        declareMacro(me, "do_plist", "DO-PLIST");
        declareMacro(me, "do_plist_properties", "DO-PLIST-PROPERTIES");
        declareMacro(me, "do_plist_values", "DO-PLIST-VALUES");
        declareMacro(me, "smart_csome", "SMART-CSOME");
        declareMacro(me, "cdocons", "CDOCONS");
        declareMacro(me, "do_pairs", "DO-PAIRS");
        declareMacro(me, "do_list_with_tail", "DO-LIST-WITH-TAIL");
        declareMacro(me, "dolists", "DOLISTS");
        declareMacro(me, "do_string", "DO-STRING");
        declareMacro(me, "do_string_index", "DO-STRING-INDEX");
        declareMacro(me, "do_vector", "DO-VECTOR");
        declareMacro(me, "do_vector_index", "DO-VECTOR-INDEX");
        declareMacro(me, "cdovector", "CDOVECTOR");
        declareMacro(me, "csome_vector", "CSOME-VECTOR");
        declareMacro(me, "smart_csomevector", "SMART-CSOMEVECTOR");
        declareMacro(me, "do_sequence", "DO-SEQUENCE");
        declareMacro(me, "do_sequence_index", "DO-SEQUENCE-INDEX");
        declareFunction(me, "do_sequence_index_doneP", "DO-SEQUENCE-INDEX-DONE?", 3, 0, false);
        declareFunction(me, "do_sequence_index_valueP", "DO-SEQUENCE-INDEX-VALUE?", 2, 0, false);
        declareFunction(me, "do_sequence_index_update", "DO-SEQUENCE-INDEX-UPDATE", 1, 0, false);
        declareMacro(me, "do_hash_table", "DO-HASH-TABLE");
        declareFunction(me, "do_hash_table_done_check", "DO-HASH-TABLE-DONE-CHECK", 1, 0, false);
        declareMacro(me, "do_hash_table_keys", "DO-HASH-TABLE-KEYS");
        declareMacro(me, "ccatch_ignore", "CCATCH-IGNORE");
        declareMacro(me, "punless_error", "PUNLESS-ERROR");
        declareMacro(me, "pwhen_error", "PWHEN-ERROR");
        declareMacro(me, "warn_on_errors", "WARN-ON-ERRORS");
        declareMacro(me, "possibly_warn_on_errors", "POSSIBLY-WARN-ON-ERRORS");
        declareMacro(me, "possibly_ignore_errors", "POSSIBLY-IGNORE-ERRORS");
        declareMacro(me, "warn_or_ignore_errors", "WARN-OR-IGNORE-ERRORS");
        declareMacro(me, "with_default_error_handling", "WITH-DEFAULT-ERROR-HANDLING");
        declareMacro(me, "cunwind_on_failure", "CUNWIND-ON-FAILURE");
        declareMacro(me, "cunwind_protect_with_fail_clause", "CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        declareMacro(me, "assert_type", "ASSERT-TYPE");
        declareMacro(me, "assert_type_if_present", "ASSERT-TYPE-IF-PRESENT");
        declareMacro(me, "assert_list_type", "ASSERT-LIST-TYPE");
        declareMacro(me, "assert_plist_type", "ASSERT-PLIST-TYPE");
        declareMacro(me, "assert_must", "ASSERT-MUST");
        declareMacro(me, "pcase_feature", "PCASE-FEATURE");
        declareMacro(me, "pif_feature", "PIF-FEATURE");
        declareMacro(me, "pwhen_feature", "PWHEN-FEATURE");
        declareMacro(me, "punless_feature", "PUNLESS-FEATURE");
        declareMacro(me, "fcase_feature", "FCASE-FEATURE");
        declareMacro(me, "fif_feature", "FIF-FEATURE");
        declareMacro(me, "fwhen_feature", "FWHEN-FEATURE");
        declareMacro(me, "feature_match", "FEATURE-MATCH");
        declareMacro(me, "funless_feature", "FUNLESS-FEATURE");
        declareMacro(me, "fimplies_feature", "FIMPLIES-FEATURE");
        declareFunction(me, "atomic_feature_match", "ATOMIC-FEATURE-MATCH", 1, 0, false);
        declareFunction(me, "feature_expression_match", "FEATURE-EXPRESSION-MATCH", 1, 0, false);
        declareMacro(me, "funcall_if", "FUNCALL-IF");
        declareMacro(me, "cpush_if", "CPUSH-IF");
        declareMacro(me, "cpushnew_if", "CPUSHNEW-IF");
        declareMacro(me, "cpush_all", "CPUSH-ALL");
        declareMacro(me, "cpushnew_all", "CPUSHNEW-ALL");
        declareMacro(me, "csetf_delete", "CSETF-DELETE");
        declareMacro(me, "cpush_end", "CPUSH-END");
        declareMacro(me, "cpushnew_end", "CPUSHNEW-END");
        declareFunction(me, "rplacd_last", "RPLACD-LAST", 2, 0, false);
        declareMacro(me, "without_appending_stack_traces_to_error_messages", "WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES");
        declareMacro(me, "silently", "SILENTLY");
        declareMacro(me, "fimplies", "FIMPLIES");
        declareMacro(me, "fxor", "FXOR");
        declareMacro(me, "fequiv", "FEQUIV");
        declareMacro(me, "possibly_with_static_area", "POSSIBLY-WITH-STATIC-AREA");
        return NIL;
    }

    public static SubLObject init_subl_macros_file() {
        deflexical("*IGNORE-ASSERT-TYPES?*", T);
        return NIL;
    }

    public static SubLObject setup_subl_macros_file() {
        register_external_symbol(UNTIL);
        register_external_symbol(WHILE);
        register_external_symbol(REPEAT_FOREVER);
        register_external_symbol(DO_NUMBERS);
        register_macro_helper(DO_NUMBERS_ENDTEST_MACRO, DO_NUMBERS);
        register_macro_helper(DO_NUMBERS_ENDTEST, DO_NUMBERS);
        register_external_symbol(DO_LIST);
        register_external_symbol(DO_LIST_INDEX);
        register_external_symbol(DO_ALIST);
        register_external_symbol(DO_ALIST_VALUES);
        register_external_symbol(DO_ALIST_KEYS);
        register_external_symbol(CINC_ALIST);
        register_external_symbol(CDEC_ALIST);
        register_external_symbol(DO_PLIST);
        register_external_symbol(DO_PLIST_PROPERTIES);
        register_external_symbol(DO_PLIST_VALUES);
        register_external_symbol(CDOCONS);
        register_external_symbol(DO_PAIRS);
        register_external_symbol(DO_LIST_WITH_TAIL);
        register_external_symbol(DOLISTS);
        register_external_symbol(DO_STRING);
        register_external_symbol(DO_STRING_INDEX);
        register_external_symbol(DO_VECTOR);
        register_external_symbol(DO_VECTOR_INDEX);
        register_external_symbol(CDOVECTOR);
        register_external_symbol(CSOME_VECTOR);
        register_external_symbol(SMART_CSOMEVECTOR);
        register_external_symbol(DO_SEQUENCE);
        register_external_symbol(DO_SEQUENCE_INDEX);
        register_macro_helper($sym151$DO_SEQUENCE_INDEX_DONE_, DO_SEQUENCE_INDEX);
        register_macro_helper($sym152$DO_SEQUENCE_INDEX_VALUE_, DO_SEQUENCE_INDEX);
        register_macro_helper(DO_SEQUENCE_INDEX_UPDATE, DO_SEQUENCE_INDEX);
        register_external_symbol(DO_HASH_TABLE);
        register_macro_helper(DO_HASH_TABLE_DONE_CHECK, DO_HASH_TABLE);
        register_external_symbol(DO_HASH_TABLE_KEYS);
        register_external_symbol(CCATCH_IGNORE);
        register_external_symbol(PUNLESS_ERROR);
        register_external_symbol(PWHEN_ERROR);
        register_external_symbol(WARN_ON_ERRORS);
        register_external_symbol(POSSIBLY_WARN_ON_ERRORS);
        register_external_symbol(POSSIBLY_IGNORE_ERRORS);
        register_external_symbol(WARN_OR_IGNORE_ERRORS);
        register_external_symbol(WITH_DEFAULT_ERROR_HANDLING);
        register_external_symbol(CUNWIND_ON_FAILURE);
        register_external_symbol(CUNWIND_PROTECT_WITH_FAIL_CLAUSE);
        register_external_symbol($sym206$_IGNORE_ASSERT_TYPES__);
        register_external_symbol(ASSERT_TYPE);
        register_external_symbol(ASSERT_TYPE_IF_PRESENT);
        register_external_symbol(ASSERT_LIST_TYPE);
        register_external_symbol(ASSERT_PLIST_TYPE);
        register_external_symbol(ASSERT_MUST);
        register_external_symbol(PCASE_FEATURE);
        register_external_symbol(PIF_FEATURE);
        meta_macros.declare_indention_pattern(PIF_FEATURE, $list227);
        register_external_symbol(PWHEN_FEATURE);
        register_external_symbol(PUNLESS_FEATURE);
        register_external_symbol(FCASE_FEATURE);
        register_external_symbol(FIF_FEATURE);
        meta_macros.declare_indention_pattern(FIF_FEATURE, $list227);
        register_external_symbol(FWHEN_FEATURE);
        register_external_symbol(FEATURE_MATCH);
        register_external_symbol(FUNLESS_FEATURE);
        register_external_symbol(FIMPLIES_FEATURE);
        register_external_symbol(ATOMIC_FEATURE_MATCH);
        register_external_symbol(FEATURE_EXPRESSION_MATCH);
        register_external_symbol(FUNCALL_IF);
        register_external_symbol(CPUSH_IF);
        register_external_symbol(CPUSHNEW_IF);
        register_external_symbol(CPUSH_ALL);
        register_external_symbol(CPUSHNEW_ALL);
        register_external_symbol(CSETF_DELETE);
        register_external_symbol(CPUSH_END);
        register_external_symbol(CPUSHNEW_END);
        register_external_symbol(SILENTLY);
        register_external_symbol(FIMPLIES);
        register_external_symbol(FXOR);
        register_external_symbol(FEQUIV);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subl_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_subl_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subl_macros_file();
    }

    static {


















































































































































































































































































































    }
}

/**
 * Total time: 734 ms
 */
