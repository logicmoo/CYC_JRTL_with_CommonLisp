/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBL-MACROS
 * source file: /cyc/top/cycl/subl-macros.lisp
 * created:     2019/07/03 17:37:05
 */
public final class subl_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new subl_macros();

 public static final String myName = "com.cyc.cycjava.cycl.subl_macros";




    private static final SubLList $list1 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol REPEAT_FOREVER = makeSymbol("REPEAT-FOREVER");

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");

    private static final SubLList $list7 = list(list(makeSymbol("NUMBER-VAR"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), list(makeSymbol("DELTA"), ONE_INTEGER), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list8 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("DELTA"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym15$1_ = makeSymbol("1+");

    private static final SubLSymbol $sym16$_ = makeSymbol("+");

    private static final SubLSymbol $sym17$DELTA_VAR = makeUninternedSymbol("DELTA-VAR");

    private static final SubLSymbol $sym18$END_VAR = makeUninternedSymbol("END-VAR");

    private static final SubLSymbol DO_NUMBERS_ENDTEST_MACRO = makeSymbol("DO-NUMBERS-ENDTEST-MACRO");

    private static final SubLList $list23 = list(makeSymbol("NUMBER-VAR"), makeSymbol("DELTA-FORM"), makeSymbol("END-VAR"));

    static private final SubLSymbol $sym24$__ = makeSymbol(">=");

    private static final SubLSymbol $sym25$__ = makeSymbol("<=");

    private static final SubLSymbol $sym26$_ = makeSymbol("=");

    private static final SubLSymbol DO_NUMBERS_ENDTEST = makeSymbol("DO-NUMBERS-ENDTEST");

    static private final SubLList $list29 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list30 = list($DONE, makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $sym32$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym33$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    private static final SubLSymbol $sym34$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym35$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLList $list36 = list(ZERO_INTEGER);

    private static final SubLSymbol $sym41$REST = makeUninternedSymbol("REST");

    private static final SubLSymbol DO_LIST_INDEX = makeSymbol("DO-LIST-INDEX");

    private static final SubLList $list47 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list48 = list($DONE);

    private static final SubLSymbol $sym49$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    private static final SubLList $list51 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list(makeKeyword("INDEX"), $DONE);

    private static final SubLSymbol $sym54$CONS = makeUninternedSymbol("CONS");

    private static final SubLSymbol DO_ALIST_VALUES = makeSymbol("DO-ALIST-VALUES");

    static private final SubLList $list57 = list(list(makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym58$KEY = makeUninternedSymbol("KEY");

    private static final SubLSymbol DO_ALIST_KEYS = makeSymbol("DO-ALIST-KEYS");

    private static final SubLList $list61 = list(list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym62$VALUE = makeUninternedSymbol("VALUE");

    private static final SubLSymbol CINC_ALIST = makeSymbol("CINC-ALIST");

    private static final SubLList $list64 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)), list(makeSymbol("INCREMENT"), ONE_INTEGER));

    private static final SubLSymbol $sym65$ENTRY = makeUninternedSymbol("ENTRY");

    private static final SubLSymbol CDEC_ALIST = makeSymbol("CDEC-ALIST");

    static private final SubLList $list73 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)), list(makeSymbol("DECREMENT"), ONE_INTEGER));

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

    static private final SubLList $list87 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_PAIRS = makeSymbol("DO-PAIRS");

    private static final SubLList $list90 = list(list(makeSymbol("VAR1"), makeSymbol("VAR2"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym91$LIST = makeUninternedSymbol("LIST");

    private static final SubLSymbol DO_LIST_WITH_TAIL = makeSymbol("DO-LIST-WITH-TAIL");

    private static final SubLList $list96 = list(list(makeSymbol("ITEM"), makeSymbol("TAIL"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym97$CDR_VAR = makeUninternedSymbol("CDR-VAR");

    private static final SubLSymbol DOLISTS = makeSymbol("DOLISTS");

    static private final SubLList $list99 = list(list(makeSymbol("&REST"), makeSymbol("SPECS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str100$CURRENT__A = makeString("CURRENT-~A");

    private static final SubLSymbol DO_STRING = makeSymbol("DO-STRING");

    private static final SubLList $list103 = list(list(makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("CHAR-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list104 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("CHAR-NUM"), $DONE);

    private static final SubLSymbol DO_STRING_INDEX = makeSymbol("DO-STRING-INDEX");

    private static final SubLSymbol $sym107$CHAR_NUM = makeUninternedSymbol("CHAR-NUM");

    private static final SubLList $list108 = list(list(makeSymbol("CHAR-NUM"), makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list109 = list(makeKeyword("START"), makeKeyword("END"), $DONE);

    private static final SubLSymbol $sym110$STRING_VAR = makeUninternedSymbol("STRING-VAR");

    private static final SubLSymbol $sym111$END_VAR = makeUninternedSymbol("END-VAR");

    private static final SubLList $list115 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list116 = list(makeKeyword("ELEMENT-NUM"), $DONE, makeKeyword("BACKWARD?"));

    private static final SubLSymbol DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");

    private static final SubLSymbol $sym120$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");

    static private final SubLList $list121 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list122 = list($DONE, makeKeyword("BACKWARD?"));

    private static final SubLSymbol $sym123$VECTOR_VAR = makeUninternedSymbol("VECTOR-VAR");

    private static final SubLSymbol $sym124$BACKWARD__VAR = makeUninternedSymbol("BACKWARD?-VAR");

    private static final SubLSymbol $sym125$LENGTH = makeUninternedSymbol("LENGTH");

    private static final SubLSymbol $sym126$START = makeUninternedSymbol("START");

    private static final SubLSymbol $sym127$END = makeUninternedSymbol("END");

    private static final SubLSymbol $sym128$DELTA = makeUninternedSymbol("DELTA");

    private static final SubLSymbol $sym130$_ = makeSymbol("-");

    static private final SubLList $list131 = list(ONE_INTEGER);

    private static final SubLList $list132 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);

    private static final SubLSymbol $sym134$ITERATION = makeUninternedSymbol("ITERATION");

    private static final SubLList $list136 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CSOME_VECTOR = makeSymbol("CSOME-VECTOR");

    private static final SubLList $list138 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SMART_CSOMEVECTOR = makeSymbol("SMART-CSOMEVECTOR");

    private static final SubLSymbol DO_SEQUENCE = makeSymbol("DO-SEQUENCE");

    private static final SubLList $list141 = list(list(makeSymbol("VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list142 = list(makeKeyword("ELEMENT-NUM"), $DONE);

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

    private static final SubLSymbol $silent_progressP$ = makeSymbol("*SILENT-PROGRESS?*");

    private static final SubLList $list165 = list(makeString(""));

    private static final SubLSymbol HASH_TABLE_COUNT = makeSymbol("HASH-TABLE-COUNT");

    private static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLSymbol DO_HASH_TABLE_DONE_CHECK = makeSymbol("DO-HASH-TABLE-DONE-CHECK");

    private static final SubLSymbol DO_HASH_TABLE_KEYS = makeSymbol("DO-HASH-TABLE-KEYS");

    private static final SubLList $list172 = list(list(makeSymbol("KEY"), makeSymbol("HASH-TABLE"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym173$NO_VALUE = makeUninternedSymbol("NO-VALUE");

    static private final SubLList $list174 = list(makeSymbol("TAG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym175$CATCH_VAR = makeUninternedSymbol("CATCH-VAR");

    private static final SubLSymbol PUNLESS_ERROR = makeSymbol("PUNLESS-ERROR");

    static private final SubLList $list178 = list(makeSymbol("FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    static private final SubLList $list202 = list(T);

    private static final SubLSymbol CUNWIND_PROTECT_WITH_FAIL_CLAUSE = makeSymbol("CUNWIND-PROTECT-WITH-FAIL-CLAUSE");

    private static final SubLList $list204 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("FAILURE-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym205$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");

    public static final SubLSymbol $ignore_assert_typesP$ = makeSymbol("*IGNORE-ASSERT-TYPES?*");

    private static final SubLList $list208 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    private static final SubLSymbol ASSERT_TYPE_IF_PRESENT = makeSymbol("ASSERT-TYPE-IF-PRESENT");

    private static final SubLSymbol ASSERT_LIST_TYPE = makeSymbol("ASSERT-LIST-TYPE");

    private static final SubLList $list213 = list(makeSymbol("LIST"), makeSymbol("PRED"));

    private static final SubLSymbol CHECK_LIST_TYPE = makeSymbol("CHECK-LIST-TYPE");

    private static final SubLSymbol ASSERT_PLIST_TYPE = makeSymbol("ASSERT-PLIST-TYPE");

    static private final SubLList $list216 = list(makeSymbol("PLIST"), makeSymbol("PRED"));

    private static final SubLSymbol CHECK_PLIST_TYPE = makeSymbol("CHECK-PLIST-TYPE");

    private static final SubLSymbol ASSERT_MUST = makeSymbol("ASSERT-MUST");

    private static final SubLList $list219 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    private static final SubLList $list220 = list(makeSymbol("PROGN"));

    private static final SubLSymbol PCASE_FEATURE = makeSymbol("PCASE-FEATURE");

    private static final SubLList $list223 = cons(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("BODY"));

    private static final SubLList $list226 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));

    private static final SubLList $list227 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("FEATURE-CLAUSES"));

    static private final SubLList $list229 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    static private final SubLList $list240 = list(list(makeSymbol("OTHERWISE"), T));

    private static final SubLSymbol ATOMIC_FEATURE_MATCH = makeSymbol("ATOMIC-FEATURE-MATCH");

    private static final SubLSymbol FEATURE_EXPRESSION_MATCH = makeSymbol("FEATURE-EXPRESSION-MATCH");

    static private final SubLList $list243 = cons(makeSymbol("OPERATOR"), makeSymbol("SUBEXPRESSIONS"));

    private static final SubLSymbol NOT = makeSymbol("NOT");

    private static final SubLString $str250$_S_is_not_a_well_formed_feature_e = makeString("~S is not a well-formed feature expression");

    private static final SubLSymbol FUNCALL_IF = makeSymbol("FUNCALL-IF");

    private static final SubLList $list252 = list(makeSymbol("FUNC"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLList $list253 = list(makeSymbol("FALSE"));

    private static final SubLSymbol CPUSH_IF = makeSymbol("CPUSH-IF");

    private static final SubLList $list257 = list(makeSymbol("ITEM"), makeSymbol("PLACE"));

    private static final SubLSymbol $sym258$VAR = makeUninternedSymbol("VAR");

    private static final SubLSymbol CPUSHNEW_IF = makeSymbol("CPUSHNEW-IF");

    private static final SubLList $list260 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(QUOTE, list(makeSymbol("FUNCTION"), IDENTITY))));

    private static final SubLList $list261 = list(makeSymbol("FUNCTION"), EQL);

    private static final SubLList $list262 = list(makeSymbol("FUNCTION"), IDENTITY);

    private static final SubLSymbol $sym263$VAR = makeUninternedSymbol("VAR");

    private static final SubLSymbol CPUSH_ALL = makeSymbol("CPUSH-ALL");

    private static final SubLList $list266 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"));

    private static final SubLSymbol $sym267$ITEM = makeUninternedSymbol("ITEM");

    private static final SubLSymbol $sym268$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");

    private static final SubLSymbol CPUSHNEW_ALL = makeSymbol("CPUSHNEW-ALL");

    private static final SubLList $list271 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(QUOTE, list(makeSymbol("FUNCTION"), IDENTITY))));

    private static final SubLSymbol $sym272$ITEM = makeUninternedSymbol("ITEM");

    private static final SubLSymbol $sym273$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");

    private static final SubLSymbol CSETF_DELETE = makeSymbol("CSETF-DELETE");

    private static final SubLList $list275 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&KEY"), list(makeSymbol("TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(QUOTE, list(makeSymbol("FUNCTION"), IDENTITY))));

    private static final SubLList $list276 = list($TEST, makeKeyword("KEY"));

    private static final SubLSymbol CPUSH_END = makeSymbol("CPUSH-END");

    private static final SubLSymbol $sym282$NEW_CONS = makeUninternedSymbol("NEW-CONS");

    private static final SubLSymbol $sym283$LIST = makeUninternedSymbol("LIST");

    private static final SubLSymbol RPLACD_LAST = makeSymbol("RPLACD-LAST");

    private static final SubLSymbol CPUSHNEW_END = makeSymbol("CPUSHNEW-END");

    private static final SubLSymbol $sym286$ITEM_VAR = makeUninternedSymbol("ITEM-VAR");

    private static final SubLSymbol $sym288$WAS_APPENDING_ = makeUninternedSymbol("WAS-APPENDING?");

    private static final SubLList $list290 = list(list(makeSymbol("EVAL"), list(QUOTE, makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"))));

    private static final SubLList $list291 = list(makeSymbol("EVAL"), list(QUOTE, list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL)));

    private static final SubLList $list293 = list(QUOTE, makeSymbol("CSETQ"));

    private static final SubLList $list294 = list(QUOTE, makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"));

    private static final SubLSymbol SILENTLY = makeSymbol("SILENTLY");

    private static final SubLList $list296 = list(list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")));

    private static final SubLList $list298 = list(makeSymbol("LHS"), makeSymbol("RHS"));

    private static final SubLSymbol FXOR = makeSymbol("FXOR");

    private static final SubLList $list300 = list(makeSymbol("A"), makeSymbol("B"));

    private static final SubLSymbol FEQUIV = makeSymbol("FEQUIV");

    private static final SubLList $list302 = list(makeSymbol("VAR?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    // Definitions
    /**
     * Repeatedly evaluate BODY until TEST is true.
     */
    @LispMethod(comment = "Repeatedly evaluate BODY until TEST is true.")
    public static final SubLObject until_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            test = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CDO, NIL, list(test), append(body, NIL));
            }
        }
    }

    // Definitions
    /**
     * Repeatedly evaluate BODY until TEST is true.
     */
    @LispMethod(comment = "Repeatedly evaluate BODY until TEST is true.")
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

    /**
     * Repeatedly evaluate BODY until TEST is not true.
     */
    @LispMethod(comment = "Repeatedly evaluate BODY until TEST is not true.")
    public static final SubLObject sublisp_while_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            test = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(UNTIL, list(CNOT, test), append(body, NIL));
            }
        }
    }

    /**
     * Repeatedly evaluate BODY until TEST is not true.
     */
    @LispMethod(comment = "Repeatedly evaluate BODY until TEST is not true.")
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

    /**
     * Repeatedly evaluate BODY forever.
     */
    @LispMethod(comment = "Repeatedly evaluate BODY forever.")
    public static final SubLObject repeat_forever_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WHILE, T, append(body, NIL));
        }
    }

    /**
     * Repeatedly evaluate BODY forever.
     */
    @LispMethod(comment = "Repeatedly evaluate BODY forever.")
    public static SubLObject repeat_forever(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WHILE, T, append(body, NIL));
    }

    /**
     * Execute BODY with NUMBER-VAR bound iteratively to numbers starting at START.
     * Numbers are presented in sequence, in increments of DELTA.
     * If non-nil, END is an number threshold (exclusive) at which the iteration should end.
     * If END is nil, the iteration will not terminate.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY with NUMBER-VAR bound iteratively to numbers starting at START.\r\nNumbers are presented in sequence, in increments of DELTA.\r\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.\r\nIf END is nil, the iteration will not terminate.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY with NUMBER-VAR bound iteratively to numbers starting at START.\nNumbers are presented in sequence, in increments of DELTA.\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.\nIf END is nil, the iteration will not terminate.\nExecution will stop if DONE becomes non-nil.")
    public static final SubLObject do_numbers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject number_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    number_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt5);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt5);
                            if (NIL == member(current_1, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt5);
                        }
                        {
                            SubLObject start_tail = property_list_member($START, current);
                            SubLObject start = (NIL != start_tail) ? ((SubLObject) (cadr(start_tail))) : ZERO_INTEGER;
                            SubLObject end_tail = property_list_member($END, current);
                            SubLObject end = (NIL != end_tail) ? ((SubLObject) (cadr(end_tail))) : NIL;
                            SubLObject delta_tail = property_list_member($DELTA, current);
                            SubLObject delta = (NIL != delta_tail) ? ((SubLObject) (cadr(delta_tail))) : ONE_INTEGER;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if ((((ZERO_INTEGER.eql(start) && end.isInteger()) && (!end.isNegative())) && ONE_INTEGER.eql(delta)) && (NIL == done)) {
                                    return listS(CDOTIMES, list(number_var, end), append(body, NIL));
                                }
                                {
                                    SubLObject clet_initializations = NIL;
                                    SubLObject delta_form = NIL;
                                    SubLObject update_form = NIL;
                                    SubLObject end_test_form = NIL;
                                    SubLObject iteration_form = NIL;
                                    if (ONE_INTEGER.eql(delta)) {
                                        delta_form = ONE_INTEGER;
                                        update_form = list($sym13$1_, number_var);
                                    } else {
                                        if (delta.isAtom()) {
                                            delta_form = delta;
                                            update_form = list($sym14$_, number_var, delta);
                                        } else {
                                            {
                                                SubLObject delta_var = $sym15$DELTA_VAR;
                                                clet_initializations = cons(list(delta_var, delta), clet_initializations);
                                                delta_form = delta_var;
                                                update_form = list($sym14$_, number_var, delta_var);
                                            }
                                        }
                                    }
                                    if (NIL != end) {
                                        {
                                            SubLObject end_var = $sym16$END_VAR;
                                            clet_initializations = cons(list(end_var, end), clet_initializations);
                                            end_test_form = list(DO_NUMBERS_ENDTEST_MACRO, number_var, delta_form, end_var);
                                        }
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
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with NUMBER-VAR bound iteratively to numbers starting at START.
     * Numbers are presented in sequence, in increments of DELTA.
     * If non-nil, END is an number threshold (exclusive) at which the iteration should end.
     * If END is nil, the iteration will not terminate.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY with NUMBER-VAR bound iteratively to numbers starting at START.\r\nNumbers are presented in sequence, in increments of DELTA.\r\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.\r\nIf END is nil, the iteration will not terminate.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY with NUMBER-VAR bound iteratively to numbers starting at START.\nNumbers are presented in sequence, in increments of DELTA.\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.\nIf END is nil, the iteration will not terminate.\nExecution will stop if DONE becomes non-nil.")
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

    public static final SubLObject do_numbers_endtest_macro_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject number_var = NIL;
            SubLObject delta_form = NIL;
            SubLObject end_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            number_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            delta_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            end_var = current.first();
            current = current.rest();
            if (NIL == current) {
                if (delta_form.isNumber()) {
                    if (delta_form.isPositive()) {
                        return list($sym23$__, number_var, end_var);
                    } else {
                        if (delta_form.isNegative()) {
                            return list($sym24$__, number_var, end_var);
                        } else {
                            return list($sym25$_, number_var, end_var);
                        }
                    }
                } else {
                    return list(DO_NUMBERS_ENDTEST, number_var, delta_form, end_var);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt22);
            }
        }
        return NIL;
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

    public static final SubLObject do_numbers_endtest_alt(SubLObject number, SubLObject delta, SubLObject end) {
        if (delta.isPositive()) {
            return numGE(number, end);
        } else {
            if (delta.isNegative()) {
                return numLE(number, end);
            } else {
                return numE(number, end);
            }
        }
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

    /**
     * Similar to CSOME (and CDOLIST) except DONE is a keyword argument.
     */
    @LispMethod(comment = "Similar to CSOME (and CDOLIST) except DONE is a keyword argument.")
    public static final SubLObject do_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    list = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt28);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt28);
                            if (NIL == member(current_2, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt28);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != progress_message) {
                                    {
                                        SubLObject message_var = $sym31$MESSAGE_VAR;
                                        SubLObject list_var = $sym32$LIST_VAR;
                                        SubLObject sofar = $sym33$SOFAR;
                                        SubLObject total = $sym34$TOTAL;
                                        return list(CLET, list(list(message_var, progress_message), list(list_var, list), bq_cons(sofar, $list_alt35), list(total, list(LENGTH, list_var))), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_LIST, list(var, list_var, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, sofar), append(body, NIL))));
                                    }
                                }
                                if (NIL != done) {
                                    {
                                        SubLObject rest_3 = $sym40$REST;
                                        return list(CDO, list(list(rest_3, list, list(CDR, rest_3))), list(list(COR, done, list(NULL, rest_3))), listS(CLET, list(list(var, list(CAR, rest_3))), append(body, NIL)));
                                    }
                                }
                                return listS(CDOLIST, list(var, list), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to CSOME (and CDOLIST) except DONE is a keyword argument.
     */
    @LispMethod(comment = "Similar to CSOME (and CDOLIST) except DONE is a keyword argument.")
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

    /**
     * Similar to DO-LIST, except LIST is interpreted as an integer key -> value index.
     */
    @LispMethod(comment = "Similar to DO-LIST, except LIST is interpreted as an integer key -> value index.")
    public static final SubLObject do_list_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    list = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt45);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt45);
                            if (NIL == member(current_4, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt45);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject list_var = $sym47$LIST_VAR;
                                return listS(CDO, list(list(list_var, list, list(CDR, list_var)), list(value, list(CAR, list_var), list(CAR, list_var)), list(key, ZERO_INTEGER, list($sym13$1_, key))), list(list(COR, done, list(NULL, list_var))), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to DO-LIST, except LIST is interpreted as an integer key -> value index.
     */
    @LispMethod(comment = "Similar to DO-LIST, except LIST is interpreted as an integer key -> value index.")
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

    /**
     * Similar to DO-LIST, except ALIST is interpreted as a key -> value index.
     */
    @LispMethod(comment = "Similar to DO-LIST, except ALIST is interpreted as a key -> value index.")
    public static final SubLObject do_alist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject alist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    alist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            if (NIL == member(current_5, $list_alt49, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt48);
                        }
                        {
                            SubLObject index_tail = property_list_member($INDEX, current);
                            SubLObject index = (NIL != index_tail) ? ((SubLObject) (cadr(index_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != index) {
                                    return list(CLET, list(bq_cons(index, $list_alt35)), listS(DO_ALIST, list(key, value, alist, $DONE, done), append(body, list(list(CINC, index)))));
                                } else {
                                    {
                                        SubLObject cons = $sym52$CONS;
                                        return list(DO_LIST, list(cons, alist, $DONE, done), listS(CDESTRUCTURING_BIND, bq_cons(key, value), cons, append(body, NIL)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to DO-LIST, except ALIST is interpreted as a key -> value index.
     */
    @LispMethod(comment = "Similar to DO-LIST, except ALIST is interpreted as a key -> value index.")
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

    public static final SubLObject do_alist_values_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject value = NIL;
                    SubLObject alist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    alist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            if (NIL == member(current_6, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject key = $sym55$KEY;
                                return listS(DO_ALIST, list(key, value, alist, $DONE, done), list(IGNORE, key), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject do_alist_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject alist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    alist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt57);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt57);
                            if (NIL == member(current_7, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt57);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject value = $sym58$VALUE;
                                return listS(DO_ALIST, list(key, value, alist, $DONE, done), list(IGNORE, value), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
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

    /**
     *
     *
     * @param KEY
     * 		object; the key to increment
     * @param ALIST
    list
     * 		
     * @param TEST
     * 		symbolp; the test function used to compare keys
     * @param INCREMENT
     * 		integer-p; the amount to increment
     * 		Increments the value for KEY (using TEST) in ALIST by INCREMENT
     */
    @LispMethod(comment = "@param KEY\r\n\t\tobject; the key to increment\r\n@param ALIST\nlist\r\n\t\t\r\n@param TEST\r\n\t\tsymbolp; the test function used to compare keys\r\n@param INCREMENT\r\n\t\tinteger-p; the amount to increment\r\n\t\tIncrements the value for KEY (using TEST) in ALIST by INCREMENT")
    public static final SubLObject cinc_alist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            alist = current.first();
            current = current.rest();
            {
                SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : EQL;
                destructuring_bind_must_listp(current, datum, $list_alt59);
                current = current.rest();
                {
                    SubLObject increment = (current.isCons()) ? ((SubLObject) (current.first())) : ONE_INTEGER;
                    destructuring_bind_must_listp(current, datum, $list_alt59);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject entry = $sym60$ENTRY;
                            return list(CLET, list(list(entry, list(ASSOC, key, alist, list(QUOTE, test)))), list(PUNLESS, entry, list(CSETQ, entry, listS(CONS, key, $list_alt35)), list(CPUSH, entry, alist)), list(RPLACD, entry, list($sym14$_, list(CDR, entry), increment)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt59);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param KEY
     * 		object; the key to increment
     * @param ALIST
    list
     * 		
     * @param TEST
     * 		symbolp; the test function used to compare keys
     * @param INCREMENT
     * 		integer-p; the amount to increment
     * 		Increments the value for KEY (using TEST) in ALIST by INCREMENT
     */
    @LispMethod(comment = "@param KEY\r\n\t\tobject; the key to increment\r\n@param ALIST\nlist\r\n\t\t\r\n@param TEST\r\n\t\tsymbolp; the test function used to compare keys\r\n@param INCREMENT\r\n\t\tinteger-p; the amount to increment\r\n\t\tIncrements the value for KEY (using TEST) in ALIST by INCREMENT")
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

    /**
     *
     *
     * @param KEY
     * 		object; the key to increment
     * @param ALIST
    list
     * 		
     * @param TEST
     * 		symbolp; the test function used to compare keys
     * @param DECREMENT
     * 		integer-p; the amount to decrement
     * 		Decrements the value for KEY (using TEST) in ALIST by DECREMENT
     */
    @LispMethod(comment = "@param KEY\r\n\t\tobject; the key to increment\r\n@param ALIST\nlist\r\n\t\t\r\n@param TEST\r\n\t\tsymbolp; the test function used to compare keys\r\n@param DECREMENT\r\n\t\tinteger-p; the amount to decrement\r\n\t\tDecrements the value for KEY (using TEST) in ALIST by DECREMENT")
    public static final SubLObject cdec_alist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            alist = current.first();
            current = current.rest();
            {
                SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : EQL;
                destructuring_bind_must_listp(current, datum, $list_alt67);
                current = current.rest();
                {
                    SubLObject decrement = (current.isCons()) ? ((SubLObject) (current.first())) : ONE_INTEGER;
                    destructuring_bind_must_listp(current, datum, $list_alt67);
                    current = current.rest();
                    if (NIL == current) {
                        return list(CINC_ALIST, key, alist, test, minus(decrement));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt67);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param KEY
     * 		object; the key to increment
     * @param ALIST
    list
     * 		
     * @param TEST
     * 		symbolp; the test function used to compare keys
     * @param DECREMENT
     * 		integer-p; the amount to decrement
     * 		Decrements the value for KEY (using TEST) in ALIST by DECREMENT
     */
    @LispMethod(comment = "@param KEY\r\n\t\tobject; the key to increment\r\n@param ALIST\nlist\r\n\t\t\r\n@param TEST\r\n\t\tsymbolp; the test function used to compare keys\r\n@param DECREMENT\r\n\t\tinteger-p; the amount to decrement\r\n\t\tDecrements the value for KEY (using TEST) in ALIST by DECREMENT")
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

    /**
     * Execute BODY with PROPERTY and VALUE bound iteratively to each entry in PLIST,
     * stopping when DONE becomes non-nil.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with PROPERTY and VALUE bound iteratively to each entry in PLIST,\r\nstopping when DONE becomes non-nil.\r\n\r\n@unknown baxter\nExecute BODY with PROPERTY and VALUE bound iteratively to each entry in PLIST,\nstopping when DONE becomes non-nil.")
    public static final SubLObject do_plist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject property = NIL;
                    SubLObject value = NIL;
                    SubLObject plist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    property = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    plist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt69);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt69);
                            if (NIL == member(current_8, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt69);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject remainder = $sym70$REMAINDER;
                                return list(CDO, list(list(remainder, plist, list(CDDR, remainder))), list(list(COR, done, list(NULL, remainder))), listS(CLET, list(list(property, list(CAR, remainder)), list(value, list(CADR, remainder))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with PROPERTY and VALUE bound iteratively to each entry in PLIST,
     * stopping when DONE becomes non-nil.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with PROPERTY and VALUE bound iteratively to each entry in PLIST,\r\nstopping when DONE becomes non-nil.\r\n\r\n@unknown baxter\nExecute BODY with PROPERTY and VALUE bound iteratively to each entry in PLIST,\nstopping when DONE becomes non-nil.")
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

    public static final SubLObject do_plist_properties_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt73);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject property = NIL;
                    SubLObject plist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    property = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    plist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt73);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt73);
                            if (NIL == member(current_9, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt73);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject value = $sym74$VALUE;
                                return listS(DO_PLIST, list(property, value, plist, $DONE, done), list(IGNORE, value), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject do_plist_values_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt76);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject value = NIL;
                    SubLObject plist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    plist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_10 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt76);
                            current_10 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt76);
                            if (NIL == member(current_10, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_10 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt76);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject property = $sym77$PROPERTY;
                                return listS(DO_PLIST, list(property, value, plist, $DONE, done), list(IGNORE, property), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
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

    /**
     * obsolete -- merge with do-list
     */
    @LispMethod(comment = "obsolete -- merge with do-list")
    public static final SubLObject smart_csome_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt78);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list = NIL;
                    SubLObject donevar = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    list = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    donevar = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_LIST, list(var, list, $DONE, donevar), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt78);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * obsolete -- merge with do-list
     */
    @LispMethod(comment = "obsolete -- merge with do-list")
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

    /**
     * Similar to CDOLIST, except VAR iterates over LISTFORM and successive
     * CDR's of that list, rather than successive elements of the list.
     */
    @LispMethod(comment = "Similar to CDOLIST, except VAR iterates over LISTFORM and successive\r\nCDR\'s of that list, rather than successive elements of the list.\nSimilar to CDOLIST, except VAR iterates over LISTFORM and successive\nCDR\'s of that list, rather than successive elements of the list.")
    public static final SubLObject cdocons_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject listform = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    listform = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_11 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt79);
                            current_11 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt79);
                            if (NIL == member(current_11, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_11 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt79);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != done) {
                                    return listS(CDO, list(list(var, listform, list(CDR, var))), list(list(COR, done, list(ATOM, var))), append(body, NIL));
                                } else {
                                    return listS(CDO, list(list(var, listform, list(CDR, var))), list(list(ATOM, var)), append(body, NIL));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to CDOLIST, except VAR iterates over LISTFORM and successive
     * CDR's of that list, rather than successive elements of the list.
     */
    @LispMethod(comment = "Similar to CDOLIST, except VAR iterates over LISTFORM and successive\r\nCDR\'s of that list, rather than successive elements of the list.\nSimilar to CDOLIST, except VAR iterates over LISTFORM and successive\nCDR\'s of that list, rather than successive elements of the list.")
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

    /**
     * Iterates over all pairs of elements in LISTFORM such that VAR1 strictly precedes
     * VAR2 in LISTFORM.
     */
    @LispMethod(comment = "Iterates over all pairs of elements in LISTFORM such that VAR1 strictly precedes\r\nVAR2 in LISTFORM.\nIterates over all pairs of elements in LISTFORM such that VAR1 strictly precedes\nVAR2 in LISTFORM.")
    public static final SubLObject do_pairs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt81);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var1 = NIL;
                    SubLObject var2 = NIL;
                    SubLObject listform = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    var1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    var2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    listform = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_12 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt81);
                            current_12 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt81);
                            if (NIL == member(current_12, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_12 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt81);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject list = $sym82$LIST;
                                return list(CDOCONS, list(list, listform, $DONE, done), list(CLET, list(list(var1, list(FIRST, list))), listS(CSOME, list(var2, list(REST, list), done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterates over all pairs of elements in LISTFORM such that VAR1 strictly precedes
     * VAR2 in LISTFORM.
     */
    @LispMethod(comment = "Iterates over all pairs of elements in LISTFORM such that VAR1 strictly precedes\r\nVAR2 in LISTFORM.\nIterates over all pairs of elements in LISTFORM such that VAR1 strictly precedes\nVAR2 in LISTFORM.")
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

    public static final SubLObject do_list_with_tail_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt87);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item = NIL;
                    SubLObject tail = NIL;
                    SubLObject listform = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    item = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    tail = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    listform = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_13 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt87);
                            current_13 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt87);
                            if (NIL == member(current_13, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_13 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt87);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject cdr_var = $sym88$CDR_VAR;
                                return list(CDOCONS, list(cdr_var, listform, $DONE, done), listS(CLET, list(list(item, list(CAR, cdr_var)), list(tail, list(CDR, cdr_var))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject dolists_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt89);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject specs = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        SubLObject forms = NIL;
                        SubLObject steppers = NIL;
                        SubLObject cdolist_list_var = specs;
                        SubLObject spec = NIL;
                        for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                            {
                                SubLObject var = spec.first();
                                SubLObject list = cadr(spec);
                                SubLObject listvar = make_symbol(format(NIL, $str_alt90$CURRENT__A, var));
                                forms = cons(list(listvar, list, list(CDR, listvar)), forms);
                                forms = cons(list(var, list(CAR, listvar), list(CAR, listvar)), forms);
                            }
                        }
                        forms = nreverse(forms);
                        {
                            SubLObject current_forms = NIL;
                            SubLObject stepper = NIL;
                            for (current_forms = forms, stepper = caar(current_forms); NIL != current_forms; current_forms = cddr(current_forms) , stepper = caar(current_forms)) {
                                steppers = cons(stepper, steppers);
                            }
                        }
                        return listS(CDO, forms, list(list(CNOT, bq_cons(CAND, append(steppers, NIL)))), append(body, NIL));
                    }
                }
            }
        }
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

    /**
     * Execute BODY with CHAR bound iteratively to each character in STRING.
     * Characters are sequenced from START to END position of the STRING.
     * If specified, CHAR-NUM will be bound to the index of CHAR.
     * Execution halts as soon as DONE is non-nil.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with CHAR bound iteratively to each character in STRING.\r\nCharacters are sequenced from START to END position of the STRING.\r\nIf specified, CHAR-NUM will be bound to the index of CHAR.\r\nExecution halts as soon as DONE is non-nil.\r\n\r\n@unknown baxter\nExecute BODY with CHAR bound iteratively to each character in STRING.\nCharacters are sequenced from START to END position of the STRING.\nIf specified, CHAR-NUM will be bound to the index of CHAR.\nExecution halts as soon as DONE is non-nil.")
    public static final SubLObject do_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt92);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_char = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    v_char = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    string = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_14 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt92);
                            current_14 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt92);
                            if (NIL == member(current_14, $list_alt93, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_14 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt92);
                        }
                        {
                            SubLObject start_tail = property_list_member($START, current);
                            SubLObject start = (NIL != start_tail) ? ((SubLObject) (cadr(start_tail))) : ZERO_INTEGER;
                            SubLObject end_tail = property_list_member($END, current);
                            SubLObject end = (NIL != end_tail) ? ((SubLObject) (cadr(end_tail))) : NIL;
                            SubLObject char_num_tail = property_list_member($CHAR_NUM, current);
                            SubLObject char_num = (NIL != char_num_tail) ? ((SubLObject) (cadr(char_num_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != char_num) {
                                    return listS(DO_STRING_INDEX, list(new SubLObject[]{ char_num, v_char, string, $START, start, $END, end, $DONE, done }), append(body, NIL));
                                } else {
                                    {
                                        SubLObject char_num_15 = $sym96$CHAR_NUM;
                                        return listS(DO_STRING, list(new SubLObject[]{ v_char, string, $CHAR_NUM, char_num_15, $START, start, $END, end, $DONE, done }), list(IGNORE, char_num_15), append(body, NIL));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with CHAR bound iteratively to each character in STRING.
     * Characters are sequenced from START to END position of the STRING.
     * If specified, CHAR-NUM will be bound to the index of CHAR.
     * Execution halts as soon as DONE is non-nil.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with CHAR bound iteratively to each character in STRING.\r\nCharacters are sequenced from START to END position of the STRING.\r\nIf specified, CHAR-NUM will be bound to the index of CHAR.\r\nExecution halts as soon as DONE is non-nil.\r\n\r\n@unknown baxter\nExecute BODY with CHAR bound iteratively to each character in STRING.\nCharacters are sequenced from START to END position of the STRING.\nIf specified, CHAR-NUM will be bound to the index of CHAR.\nExecution halts as soon as DONE is non-nil.")
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

    /**
     * Similar to DO-HASH-TABLE, except STRING is interpreted as an
     * integer char-num -> char index.
     * Characters are sequenced from START to END position of the STRING.
     * Execution halts as soon as DONE is non-nil.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Similar to DO-HASH-TABLE, except STRING is interpreted as an\r\ninteger char-num -> char index.\r\nCharacters are sequenced from START to END position of the STRING.\r\nExecution halts as soon as DONE is non-nil.\r\n\r\n@unknown baxter\nSimilar to DO-HASH-TABLE, except STRING is interpreted as an\ninteger char-num -> char index.\nCharacters are sequenced from START to END position of the STRING.\nExecution halts as soon as DONE is non-nil.")
    public static final SubLObject do_string_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt98);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject char_num = NIL;
                    SubLObject v_char = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    char_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    v_char = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    string = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_16 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt98);
                            current_16 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt98);
                            if (NIL == member(current_16, $list_alt99, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_16 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt98);
                        }
                        {
                            SubLObject start_tail = property_list_member($START, current);
                            SubLObject start = (NIL != start_tail) ? ((SubLObject) (cadr(start_tail))) : ZERO_INTEGER;
                            SubLObject end_tail = property_list_member($END, current);
                            SubLObject end = (NIL != end_tail) ? ((SubLObject) (cadr(end_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject string_var = $sym100$STRING_VAR;
                                SubLObject end_var = $sym101$END_VAR;
                                SubLObject end_init_form = NIL;
                                if (end.isInteger()) {
                                    end_init_form = end;
                                } else {
                                    if (NIL == end) {
                                        end_init_form = list(LENGTH, string_var);
                                    } else {
                                        end_init_form = list(FIF, end, end, list(LENGTH, string_var));
                                    }
                                }
                                return list(CLET, list(list(string_var, string), list(end_var, end_init_form)), list(DO_NUMBERS, list(char_num, $START, start, $END, end_var, $DONE, done), listS(CLET, list(list(v_char, list(CHAR, string_var, char_num))), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to DO-HASH-TABLE, except STRING is interpreted as an
     * integer char-num -> char index.
     * Characters are sequenced from START to END position of the STRING.
     * Execution halts as soon as DONE is non-nil.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Similar to DO-HASH-TABLE, except STRING is interpreted as an\r\ninteger char-num -> char index.\r\nCharacters are sequenced from START to END position of the STRING.\r\nExecution halts as soon as DONE is non-nil.\r\n\r\n@unknown baxter\nSimilar to DO-HASH-TABLE, except STRING is interpreted as an\ninteger char-num -> char index.\nCharacters are sequenced from START to END position of the STRING.\nExecution halts as soon as DONE is non-nil.")
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

    /**
     * Execute BODY with VAR bound iteratively to each element in VECTOR.
     * If specified, ELEMENT-NUM will be bound to the index of VAR.
     * If BACKWARD? is non-nil, the elements will be done in reverse order.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY with VAR bound iteratively to each element in VECTOR.\r\nIf specified, ELEMENT-NUM will be bound to the index of VAR.\r\nIf BACKWARD? is non-nil, the elements will be done in reverse order.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY with VAR bound iteratively to each element in VECTOR.\nIf specified, ELEMENT-NUM will be bound to the index of VAR.\nIf BACKWARD? is non-nil, the elements will be done in reverse order.\nExecution will stop if DONE becomes non-nil.")
    public static final SubLObject do_vector_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt104);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject vector = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    vector = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_17 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt104);
                            current_17 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt104);
                            if (NIL == member(current_17, $list_alt105, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_17 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt104);
                        }
                        {
                            SubLObject element_num_tail = property_list_member($ELEMENT_NUM, current);
                            SubLObject element_num = (NIL != element_num_tail) ? ((SubLObject) (cadr(element_num_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject backwardP_tail = property_list_member($BACKWARD_, current);
                            SubLObject backwardP = (NIL != backwardP_tail) ? ((SubLObject) (cadr(backwardP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != element_num) {
                                    return listS(DO_VECTOR_INDEX, list(element_num, var, vector, $DONE, done, $BACKWARD_, backwardP), append(body, NIL));
                                } else {
                                    {
                                        SubLObject element_num_18 = $sym109$ELEMENT_NUM;
                                        return listS(DO_VECTOR_INDEX, list(element_num_18, var, vector, $DONE, done, $BACKWARD_, backwardP), list(IGNORE, element_num_18), append(body, NIL));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with VAR bound iteratively to each element in VECTOR.
     * If specified, ELEMENT-NUM will be bound to the index of VAR.
     * If BACKWARD? is non-nil, the elements will be done in reverse order.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY with VAR bound iteratively to each element in VECTOR.\r\nIf specified, ELEMENT-NUM will be bound to the index of VAR.\r\nIf BACKWARD? is non-nil, the elements will be done in reverse order.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY with VAR bound iteratively to each element in VECTOR.\nIf specified, ELEMENT-NUM will be bound to the index of VAR.\nIf BACKWARD? is non-nil, the elements will be done in reverse order.\nExecution will stop if DONE becomes non-nil.")
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

    /**
     * Similar to DO-HASH-TABLE, except VECTOR is interpreted as an integer key -> value index.
     */
    @LispMethod(comment = "Similar to DO-HASH-TABLE, except VECTOR is interpreted as an integer key -> value index.")
    public static final SubLObject do_vector_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt110);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject vector = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    vector = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_19 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt110);
                            current_19 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt110);
                            if (NIL == member(current_19, $list_alt111, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_19 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt110);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject backwardP_tail = property_list_member($BACKWARD_, current);
                            SubLObject backwardP = (NIL != backwardP_tail) ? ((SubLObject) (cadr(backwardP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject vector_var = $sym112$VECTOR_VAR;
                                SubLObject backwardP_var = $sym113$BACKWARD__VAR;
                                SubLObject length = $sym114$LENGTH;
                                if (NIL != done) {
                                    {
                                        SubLObject start = $sym115$START;
                                        SubLObject end = $sym116$END;
                                        SubLObject delta = $sym117$DELTA;
                                        return list(CLET, list(list(vector_var, vector), list(backwardP_var, backwardP), list(length, list(LENGTH, vector_var))), list(CDESTRUCTURING_BIND, list(start, end, delta), list(FIF, backwardP_var, listS(LIST, listS($sym119$_, length, $list_alt120), $list_alt121), listS(LIST, ZERO_INTEGER, length, $list_alt120)), list(DO_NUMBERS, list(new SubLObject[]{ key, $START, start, $END, end, $DONE, done, $DELTA, delta }), listS(CLET, list(list(value, list(AREF, vector_var, key))), append(body, NIL)))));
                                    }
                                } else {
                                    {
                                        SubLObject v_iteration = $sym123$ITERATION;
                                        return list(CLET, list(list(vector_var, vector), list(backwardP_var, backwardP), list(length, list(LENGTH, vector_var))), list(CDOTIMES, list(v_iteration, length), listS(CLET, list(list(key, list(FIF, backwardP_var, listS($sym119$_, length, v_iteration, $list_alt120), v_iteration)), list(value, list(AREF, vector_var, key))), append(body, NIL))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to DO-HASH-TABLE, except VECTOR is interpreted as an integer key -> value index.
     */
    @LispMethod(comment = "Similar to DO-HASH-TABLE, except VECTOR is interpreted as an integer key -> value index.")
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

    /**
     * obsolete -- merge with do-vector
     */
    @LispMethod(comment = "obsolete -- merge with do-vector")
    public static final SubLObject cdovector_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt124);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject vector = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt124);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt124);
                    vector = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_VECTOR, list(var, vector), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt124);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * obsolete -- merge with do-vector
     */
    @LispMethod(comment = "obsolete -- merge with do-vector")
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

    /**
     * obsolete -- merge with do-vector
     */
    @LispMethod(comment = "obsolete -- merge with do-vector")
    public static final SubLObject csome_vector_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt126);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject vector = NIL;
                    SubLObject donevar = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    vector = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    donevar = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_VECTOR, list(var, vector, $DONE, donevar), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt126);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * obsolete -- merge with do-vector
     */
    @LispMethod(comment = "obsolete -- merge with do-vector")
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

    /**
     * obsolete -- merge with do-vector
     */
    @LispMethod(comment = "obsolete -- merge with do-vector")
    public static final SubLObject smart_csomevector_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt126);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject vector = NIL;
                    SubLObject donevar = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    vector = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    donevar = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_VECTOR, list(var, vector, $DONE, donevar), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt126);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * obsolete -- merge with do-vector
     */
    @LispMethod(comment = "obsolete -- merge with do-vector")
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

    /**
     * Execute BODY with VAR bound iteratively to each element in SEQUENCE.
     * If specified, ELEMENT-NUM will be bound to the positional index of VAR.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY with VAR bound iteratively to each element in SEQUENCE.\r\nIf specified, ELEMENT-NUM will be bound to the positional index of VAR.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY with VAR bound iteratively to each element in SEQUENCE.\nIf specified, ELEMENT-NUM will be bound to the positional index of VAR.\nExecution will stop if DONE becomes non-nil.")
    public static final SubLObject do_sequence_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt127);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject sequence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    sequence = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_20 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt127);
                            current_20 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt127);
                            if (NIL == member(current_20, $list_alt128, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_20 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt127);
                        }
                        {
                            SubLObject element_num_tail = property_list_member($ELEMENT_NUM, current);
                            SubLObject element_num = (NIL != element_num_tail) ? ((SubLObject) (cadr(element_num_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != element_num) {
                                    return listS(DO_SEQUENCE_INDEX, list(element_num, var, sequence, $DONE, done), append(body, NIL));
                                } else {
                                    {
                                        SubLObject element_num_21 = $sym130$ELEMENT_NUM;
                                        return listS(DO_SEQUENCE_INDEX, list(element_num_21, var, sequence, $DONE, done), list(IGNORE, element_num_21), append(body, NIL));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with VAR bound iteratively to each element in SEQUENCE.
     * If specified, ELEMENT-NUM will be bound to the positional index of VAR.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY with VAR bound iteratively to each element in SEQUENCE.\r\nIf specified, ELEMENT-NUM will be bound to the positional index of VAR.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY with VAR bound iteratively to each element in SEQUENCE.\nIf specified, ELEMENT-NUM will be bound to the positional index of VAR.\nExecution will stop if DONE becomes non-nil.")
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

    /**
     * Similar to DO-SEQUENCE, but SEQUENCE is interpreted as an integer key -> value index.
     */
    @LispMethod(comment = "Similar to DO-SEQUENCE, but SEQUENCE is interpreted as an integer key -> value index.")
    public static final SubLObject do_sequence_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt131);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key_var = NIL;
                    SubLObject value_var = NIL;
                    SubLObject sequence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt131);
                    key_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt131);
                    value_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt131);
                    sequence = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_22 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt131);
                            current_22 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt131);
                            if (NIL == member(current_22, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_22 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt131);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject sequence_var = $sym132$SEQUENCE_VAR;
                                SubLObject end_index = $sym133$END_INDEX;
                                SubLObject sequence_doneP = $sym134$SEQUENCE_DONE_;
                                return list(CLET, list(list(sequence_var, sequence), list(end_index, list(FUNLESS, list(LISTP, sequence_var), list(LENGTH, sequence_var))), bq_cons(key_var, $list_alt35), list(sequence_doneP, list($sym137$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var))), list(WHILE, list(CAND, list(CNOT, sequence_doneP), list(CNOT, done)), listS(CLET, list(list(value_var, list($sym138$DO_SEQUENCE_INDEX_VALUE_, key_var, sequence_var))), append(body, list(list(PROGN, list(CSETQ, sequence_var, list(DO_SEQUENCE_INDEX_UPDATE, sequence_var)), list(CINC, key_var), list(CSETQ, sequence_doneP, list($sym137$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var))))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to DO-SEQUENCE, but SEQUENCE is interpreted as an integer key -> value index.
     */
    @LispMethod(comment = "Similar to DO-SEQUENCE, but SEQUENCE is interpreted as an integer key -> value index.")
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

    public static final SubLObject do_sequence_index_doneP_alt(SubLObject index, SubLObject end_index, SubLObject sequence) {
        if (sequence.isList()) {
            return sublisp_null(sequence);
        } else {
            return numE(index, end_index);
        }
    }

    public static SubLObject do_sequence_index_doneP(final SubLObject index, final SubLObject end_index, final SubLObject sequence) {
        if (sequence.isList()) {
            return sublisp_null(sequence);
        }
        return numE(index, end_index);
    }

    public static final SubLObject do_sequence_index_valueP_alt(SubLObject index, SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.first();
        } else {
            if (sequence.isVector()) {
                return aref(sequence, index);
            } else {
                return Strings.sublisp_char(sequence, index);
            }
        }
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

    public static final SubLObject do_sequence_index_update_alt(SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.rest();
        } else {
            return sequence;
        }
    }

    public static SubLObject do_sequence_index_update(final SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.rest();
        }
        return sequence;
    }

    /**
     * Similar to CDOHASH except DONE and PROGRESS-MESSAGE are keyword arguments.
     *
     * @param PROGRESS-MESSAGE;
     * 		stringp or NIL: If non-nil, percent progress is printed
     */
    @LispMethod(comment = "Similar to CDOHASH except DONE and PROGRESS-MESSAGE are keyword arguments.\r\n\r\n@param PROGRESS-MESSAGE;\r\n\t\tstringp or NIL: If non-nil, percent progress is printed")
    public static final SubLObject do_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt142);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject hash_table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt142);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt142);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt142);
                    hash_table = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_23 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt142);
                            current_23 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt142);
                            if (NIL == member(current_23, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_23 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt142);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != progress_message) {
                                    {
                                        SubLObject message_var = $sym143$MESSAGE_VAR;
                                        SubLObject silentP = $sym144$SILENT_;
                                        SubLObject table_var = $sym145$TABLE_VAR;
                                        SubLObject index_var = $sym146$INDEX_VAR;
                                        SubLObject count_var = $sym147$COUNT_VAR;
                                        return list(CLET, list(list(message_var, progress_message), bq_cons(silentP, $list_alt148), list($silent_progressP$, list(COR, silentP, list(NULL, message_var)))), list(NOTING_PERCENT_PROGRESS, listS(FIRST_OF, message_var, $list_alt151), list(CLET, list(list(table_var, hash_table), bq_cons(index_var, $list_alt35), list(count_var, list(HASH_TABLE_COUNT, table_var))), list(DO_HASH_TABLE, list(key, value, table_var, $DONE, done), listS(CLET, list(list($silent_progressP$, silentP)), append(body, NIL)), list(CSETQ, index_var, list($sym13$1_, index_var)), list(NOTE_PERCENT_PROGRESS, index_var, count_var)))));
                                    }
                                } else {
                                    if (NIL != done) {
                                        return list(PUNLESS, done, list(CCATCH_IGNORE, $DO_HASH_TABLE, listS(DO_HASH_TABLE, list(key, value, hash_table), list(DO_HASH_TABLE_DONE_CHECK, done), append(body, NIL))));
                                    } else {
                                        return listS(CDOHASH, list(key, value, hash_table), append(body, NIL));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Similar to CDOHASH except DONE and PROGRESS-MESSAGE are keyword arguments.
     *
     * @param PROGRESS-MESSAGE;
     * 		stringp or NIL: If non-nil, percent progress is printed
     */
    @LispMethod(comment = "Similar to CDOHASH except DONE and PROGRESS-MESSAGE are keyword arguments.\r\n\r\n@param PROGRESS-MESSAGE;\r\n\t\tstringp or NIL: If non-nil, percent progress is printed")
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
            return list(CLET, list(list(message_var, progress_message), bq_cons(silentP, $list162), list($silent_progressP$, list(COR, silentP, list(NULL, message_var)))), list(NOTING_PERCENT_PROGRESS, listS(FIRST_OF, message_var, $list165), list(CLET, list(list(table_var, hash_table), bq_cons(index_var, $list36), list(count_var, list(HASH_TABLE_COUNT, table_var))), list(DO_HASH_TABLE, list(key, value, table_var, $DONE, done), listS(CLET, list(list($silent_progressP$, silentP)), append(body, NIL)), list(CSETQ, index_var, list($sym15$1_, index_var)), list(NOTE_PERCENT_PROGRESS, index_var, count_var)))));
        }
        if (NIL != done) {
            return list(PUNLESS, done, list(CCATCH_IGNORE, $DO_HASH_TABLE, listS(DO_HASH_TABLE, list(key, value, hash_table), list(DO_HASH_TABLE_DONE_CHECK, done), append(body, NIL))));
        }
        return listS(CDOHASH, list(key, value, hash_table), append(body, NIL));
    }

    public static final SubLObject do_hash_table_done_check_alt(SubLObject done) {
        if (NIL != done) {
            sublisp_throw($DO_HASH_TABLE, NIL);
        }
        return NIL;
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

    /**
     * Like CCATCH, but no result variable is set when thrown to.
     */
    @LispMethod(comment = "Like CCATCH, but no result variable is set when thrown to.")
    public static final SubLObject ccatch_ignore_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tag = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt157);
            tag = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject catch_var = $sym158$CATCH_VAR;
                return list(CLET, list(catch_var), list(IGNORE, catch_var), listS(CCATCH, tag, catch_var, append(body, NIL)));
            }
        }
    }

    /**
     * Like CCATCH, but no result variable is set when thrown to.
     */
    @LispMethod(comment = "Like CCATCH, but no result variable is set when thrown to.")
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
    }/**
     * Like CCATCH, but no result variable is set when thrown to.
     */


    /**
     * Executes BODY if FORM evaluates without error.
     */
    @LispMethod(comment = "Executes BODY if FORM evaluates without error.")
    public static final SubLObject punless_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt160);
            form = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject error = $sym161$ERROR;
                return list(CLET, list(error), list(CATCH_ERROR_MESSAGE, list(error), form), listS(PUNLESS, error, append(body, NIL)));
            }
        }
    }

    /**
     * Executes BODY if FORM evaluates without error.
     */
    @LispMethod(comment = "Executes BODY if FORM evaluates without error.")
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
    }/**
     * Executes BODY if FORM evaluates without error.
     */


    /**
     * Executes BODY if FORM evaluates with an error.
     */
    @LispMethod(comment = "Executes BODY if FORM evaluates with an error.")
    public static final SubLObject pwhen_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt160);
            form = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject error = $sym163$ERROR;
                return list(CLET, list(error), list(CATCH_ERROR_MESSAGE, list(error), form), listS(PWHEN, error, append(body, NIL)));
            }
        }
    }

    /**
     * Executes BODY if FORM evaluates with an error.
     */
    @LispMethod(comment = "Executes BODY if FORM evaluates with an error.")
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
    }/**
     * Executes BODY if FORM evaluates with an error.
     */


    /**
     * Execute BODY as an implicit progn.  If any error occurs, the body is
     * aborted and the resulting error is issued as a warning.
     */
    @LispMethod(comment = "Execute BODY as an implicit progn.  If any error occurs, the body is\r\naborted and the resulting error is issued as a warning.\nExecute BODY as an implicit progn.  If any error occurs, the body is\naborted and the resulting error is issued as a warning.")
    public static final SubLObject warn_on_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject message_var = $sym165$MESSAGE_VAR;
            return list(CLET, list(message_var), listS(CATCH_ERROR_MESSAGE, list(message_var), append(body, NIL)), list(PWHEN, list(STRINGP, message_var), list(WARN, $str_alt168$_A, message_var)));
        }
    }

    /**
     * Execute BODY as an implicit progn.  If any error occurs, the body is
     * aborted and the resulting error is issued as a warning.
     */
    @LispMethod(comment = "Execute BODY as an implicit progn.  If any error occurs, the body is\r\naborted and the resulting error is issued as a warning.\nExecute BODY as an implicit progn.  If any error occurs, the body is\naborted and the resulting error is issued as a warning.")
    public static SubLObject warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject message_var = $sym185$MESSAGE_VAR;
        return list(CLET, list(message_var), list(WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES, listS(CATCH_ERROR_MESSAGE, list(message_var), append(body, NIL))), list(PWHEN, list(STRINGP, message_var), list(WARN, $str189$_A, message_var)));
    }/**
     * Execute BODY as an implicit progn.  If any error occurs, the body is
     * aborted and the resulting error is issued as a warning.
     */


    /**
     * Warns on errors iff VAR.
     */
    @LispMethod(comment = "Warns on errors iff VAR.")
    public static final SubLObject possibly_warn_on_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PIF, var, bq_cons(WARN_ON_ERRORS, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
            }
        }
    }

    /**
     * Warns on errors iff VAR.
     */
    @LispMethod(comment = "Warns on errors iff VAR.")
    public static SubLObject possibly_warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list191);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, var, bq_cons(WARN_ON_ERRORS, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }/**
     * Warns on errors iff VAR.
     */


    public static final SubLObject possibly_ignore_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PIF, var, bq_cons(IGNORE_ERRORS, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
            }
        }
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

    /**
     * Execute BODY with the default error handling.
     */
    @LispMethod(comment = "Execute BODY with the default error handling.")
    public static final SubLObject with_default_error_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_ERROR_HANDLER, NIL, append(body, NIL));
        }
    }

    /**
     * Execute BODY with the default error handling.
     */
    @LispMethod(comment = "Execute BODY with the default error handling.")
    public static SubLObject with_default_error_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_ERROR_HANDLER, NIL, append(body, NIL));
    }/**
     * Execute BODY with the default error handling.
     */


    /**
     * This is like cunwind-protect except that BODY is
     * executed if and only if PROTECTED-FORM fails to
     * finish execution.
     */
    @LispMethod(comment = "This is like cunwind-protect except that BODY is\r\nexecuted if and only if PROTECTED-FORM fails to\r\nfinish execution.\nThis is like cunwind-protect except that BODY is\nexecuted if and only if PROTECTED-FORM fails to\nfinish execution.")
    public static final SubLObject cunwind_on_failure_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject protected_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt174);
            protected_form = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject success_var = $sym175$SUCCESS_VAR;
                return list(CLET, list(success_var), list(CUNWIND_PROTECT, list(PROGN, protected_form, listS(CSETQ, success_var, $list_alt177)), listS(PUNLESS, success_var, append(body, NIL))));
            }
        }
    }

    /**
     * This is like cunwind-protect except that BODY is
     * executed if and only if PROTECTED-FORM fails to
     * finish execution.
     */
    @LispMethod(comment = "This is like cunwind-protect except that BODY is\r\nexecuted if and only if PROTECTED-FORM fails to\r\nfinish execution.\nThis is like cunwind-protect except that BODY is\nexecuted if and only if PROTECTED-FORM fails to\nfinish execution.")
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
    }/**
     * This is like cunwind-protect except that BODY is
     * executed if and only if PROTECTED-FORM fails to
     * finish execution.
     */


    /**
     * This first executes PROTECTED-FORM.  If an error occurs during this
     * execution, FAILURE-FORM and then BODY are executed.  If no error
     * occurs, then only BODY is executed.  NB: BODY will be executed even
     * if an error occurs in FAILURE-FORM.
     */
    @LispMethod(comment = "This first executes PROTECTED-FORM.  If an error occurs during this\r\nexecution, FAILURE-FORM and then BODY are executed.  If no error\r\noccurs, then only BODY is executed.  NB: BODY will be executed even\r\nif an error occurs in FAILURE-FORM.\nThis first executes PROTECTED-FORM.  If an error occurs during this\nexecution, FAILURE-FORM and then BODY are executed.  If no error\noccurs, then only BODY is executed.  NB: BODY will be executed even\nif an error occurs in FAILURE-FORM.")
    public static final SubLObject cunwind_protect_with_fail_clause_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject protected_form = NIL;
            SubLObject failure_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt178);
            protected_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt178);
            failure_form = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject success_var = $sym179$SUCCESS_VAR;
                return list(CLET, list(success_var), list(CUNWIND_PROTECT, list(PROGN, protected_form, listS(CSETQ, success_var, $list_alt177)), listS(CUNWIND_PROTECT, list(PUNLESS, success_var, failure_form), append(body, NIL))));
            }
        }
    }

    /**
     * This first executes PROTECTED-FORM.  If an error occurs during this
     * execution, FAILURE-FORM and then BODY are executed.  If no error
     * occurs, then only BODY is executed.  NB: BODY will be executed even
     * if an error occurs in FAILURE-FORM.
     */
    @LispMethod(comment = "This first executes PROTECTED-FORM.  If an error occurs during this\r\nexecution, FAILURE-FORM and then BODY are executed.  If no error\r\noccurs, then only BODY is executed.  NB: BODY will be executed even\r\nif an error occurs in FAILURE-FORM.\nThis first executes PROTECTED-FORM.  If an error occurs during this\nexecution, FAILURE-FORM and then BODY are executed.  If no error\noccurs, then only BODY is executed.  NB: BODY will be executed even\nif an error occurs in FAILURE-FORM.")
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
    }/**
     * This first executes PROTECTED-FORM.  If an error occurs during this
     * execution, FAILURE-FORM and then BODY are executed.  If no error
     * occurs, then only BODY is executed.  NB: BODY will be executed even
     * if an error occurs in FAILURE-FORM.
     */


    /**
     * Document that OBJECT is expected to satisfy PRED
     */
    @LispMethod(comment = "Document that OBJECT is expected to satisfy PRED")
    public static final SubLObject assert_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt180);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
                    return list(IGNORE, v_object);
                } else {
                    return list(CHECK_TYPE, v_object, pred);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt180);
            }
        }
        return NIL;
    }

    /**
     * Document that OBJECT is expected to satisfy PRED
     */
    @LispMethod(comment = "Document that OBJECT is expected to satisfy PRED")
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
    }/**
     * Document that OBJECT is expected to satisfy PRED
     */


    /**
     * Document that OBJECT is expected to satisfy PRED when object is non-null
     */
    @LispMethod(comment = "Document that OBJECT is expected to satisfy PRED when object is non-null")
    public static final SubLObject assert_type_if_present_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt180);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
                    return list(IGNORE, v_object);
                } else {
                    return list(CHECK_TYPE_IF_PRESENT, v_object, pred);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt180);
            }
        }
        return NIL;
    }

    /**
     * Document that OBJECT is expected to satisfy PRED when object is non-null
     */
    @LispMethod(comment = "Document that OBJECT is expected to satisfy PRED when object is non-null")
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
    }/**
     * Document that OBJECT is expected to satisfy PRED when object is non-null
     */


    /**
     * Document that LIST is expected to be a non-dotted-list-p, and that each
     * of its elements is expected to satisfy PRED.
     */
    @LispMethod(comment = "Document that LIST is expected to be a non-dotted-list-p, and that each\r\nof its elements is expected to satisfy PRED.\nDocument that LIST is expected to be a non-dotted-list-p, and that each\nof its elements is expected to satisfy PRED.")
    public static final SubLObject assert_list_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt183);
            list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt183);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
                    return list(IGNORE, list);
                } else {
                    return list(CHECK_LIST_TYPE, list, pred);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt183);
            }
        }
        return NIL;
    }

    /**
     * Document that LIST is expected to be a non-dotted-list-p, and that each
     * of its elements is expected to satisfy PRED.
     */
    @LispMethod(comment = "Document that LIST is expected to be a non-dotted-list-p, and that each\r\nof its elements is expected to satisfy PRED.\nDocument that LIST is expected to be a non-dotted-list-p, and that each\nof its elements is expected to satisfy PRED.")
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
    }/**
     * Document that LIST is expected to be a non-dotted-list-p, and that each
     * of its elements is expected to satisfy PRED.
     */


    /**
     * Document that PLIST is expected to be a property-list-p, and that each
     * of its properties is expected to satisfy PRED.
     */
    @LispMethod(comment = "Document that PLIST is expected to be a property-list-p, and that each\r\nof its properties is expected to satisfy PRED.\nDocument that PLIST is expected to be a property-list-p, and that each\nof its properties is expected to satisfy PRED.")
    public static final SubLObject assert_plist_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject plist = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt185);
            plist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
                    return list(IGNORE, plist);
                } else {
                    return list(CHECK_PLIST_TYPE, plist, pred);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt185);
            }
        }
        return NIL;
    }

    /**
     * Document that PLIST is expected to be a property-list-p, and that each
     * of its properties is expected to satisfy PRED.
     */
    @LispMethod(comment = "Document that PLIST is expected to be a property-list-p, and that each\r\nof its properties is expected to satisfy PRED.\nDocument that PLIST is expected to be a property-list-p, and that each\nof its properties is expected to satisfy PRED.")
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
    }/**
     * Document that PLIST is expected to be a property-list-p, and that each
     * of its properties is expected to satisfy PRED.
     */


    public static final SubLObject assert_must_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt187);
            form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject v_arguments = current;
                if (NIL != $ignore_assert_typesP$.getGlobalValue()) {
                    return $list_alt188;
                } else {
                    return listS(MUST, form, format_string, append(v_arguments, NIL));
                }
            }
        }
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

    /**
     * Macro for compile-time procedural conditionalization based on *features*.
     * Each clause in FEATURE-CLAUSES is of the form (feature-expression . body).
     * The first FEATURE-EXPRESSION that matches *features* determines which BODY
     * is used in the expansion of a PROGN.  If the feature-expression is OTHERWISE
     * it is considered to be a match. Feature expressions are either feature
     * symbols or boolean combinations of feature expressions using CNOT, CAND, COR.
     */
    @LispMethod(comment = "Macro for compile-time procedural conditionalization based on *features*.\r\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . body).\r\nThe first FEATURE-EXPRESSION that matches *features* determines which BODY\r\nis used in the expansion of a PROGN.  If the feature-expression is OTHERWISE\r\nit is considered to be a match. Feature expressions are either feature\r\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.\nMacro for compile-time procedural conditionalization based on *features*.\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . body).\nThe first FEATURE-EXPRESSION that matches *features* determines which BODY\nis used in the expansion of a PROGN.  If the feature-expression is OTHERWISE\nit is considered to be a match. Feature expressions are either feature\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.")
    public static final SubLObject pcase_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clauses = current;
            SubLObject cdolist_list_var = feature_clauses;
            SubLObject feature_clause = NIL;
            for (feature_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature_clause = cdolist_list_var.first()) {
                {
                    SubLObject datum_24 = feature_clause;
                    SubLObject current_25 = datum_24;
                    SubLObject feature_expression = NIL;
                    SubLObject body = NIL;
                    destructuring_bind_must_consp(current_25, datum_24, $list_alt190);
                    feature_expression = current_25.first();
                    current_25 = current_25.rest();
                    body = current_25;
                    if ((OTHERWISE == feature_expression) || (NIL != com.cyc.cycjava.cycl.subl_macros.feature_expression_match(feature_expression))) {
                        return bq_cons(PROGN, append(body, NIL));
                    }
                }
            }
            return $list_alt188;
        }
    }

    /**
     * Macro for compile-time procedural conditionalization based on *features*.
     * Each clause in FEATURE-CLAUSES is of the form (feature-expression . body).
     * The first FEATURE-EXPRESSION that matches *features* determines which BODY
     * is used in the expansion of a PROGN.  If the feature-expression is OTHERWISE
     * it is considered to be a match. Feature expressions are either feature
     * symbols or boolean combinations of feature expressions using CNOT, CAND, COR.
     */
    @LispMethod(comment = "Macro for compile-time procedural conditionalization based on *features*.\r\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . body).\r\nThe first FEATURE-EXPRESSION that matches *features* determines which BODY\r\nis used in the expansion of a PROGN.  If the feature-expression is OTHERWISE\r\nit is considered to be a match. Feature expressions are either feature\r\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.\nMacro for compile-time procedural conditionalization based on *features*.\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . body).\nThe first FEATURE-EXPRESSION that matches *features* determines which BODY\nis used in the expansion of a PROGN.  If the feature-expression is OTHERWISE\nit is considered to be a match. Feature expressions are either feature\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.")
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
    }/**
     * Macro for compile-time procedural conditionalization based on *features*.
     * Each clause in FEATURE-CLAUSES is of the form (feature-expression . body).
     * The first FEATURE-EXPRESSION that matches *features* determines which BODY
     * is used in the expansion of a PROGN.  If the feature-expression is OTHERWISE
     * it is considered to be a match. Feature expressions are either feature
     * symbols or boolean combinations of feature expressions using CNOT, CAND, COR.
     */


    /**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE ACTION)(otherwise ELSE-ACTION))
     */
    @LispMethod(comment = "Syntactic sugar for (pcase-feature (FEATURE-CLAUSE ACTION)(otherwise ELSE-ACTION))")
    public static final SubLObject pif_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            SubLObject action = NIL;
            SubLObject else_action = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt192);
            feature_clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt192);
            action = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt192);
            else_action = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PCASE_FEATURE, list(feature_clause, action), list(OTHERWISE, else_action));
            } else {
                cdestructuring_bind_error(datum, $list_alt192);
            }
        }
        return NIL;
    }

    /**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE ACTION)(otherwise ELSE-ACTION))
     */
    @LispMethod(comment = "Syntactic sugar for (pcase-feature (FEATURE-CLAUSE ACTION)(otherwise ELSE-ACTION))")
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
    }/**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE ACTION)(otherwise ELSE-ACTION))
     */


    /**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (pcase-feature (FEATURE-CLAUSE . BODY))")
    public static final SubLObject pwhen_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            feature_clause = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)));
            }
        }
    }

    /**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (pcase-feature (FEATURE-CLAUSE . BODY))")
    public static SubLObject pwhen_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)));
    }/**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE . BODY))
     */


    /**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE) (otherwise . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (pcase-feature (FEATURE-CLAUSE) (otherwise . BODY))")
    public static final SubLObject punless_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            feature_clause = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PCASE_FEATURE, list(feature_clause), bq_cons(OTHERWISE, append(body, NIL)));
            }
        }
    }

    /**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE) (otherwise . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (pcase-feature (FEATURE-CLAUSE) (otherwise . BODY))")
    public static SubLObject punless_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PCASE_FEATURE, list(feature_clause), bq_cons(OTHERWISE, append(body, NIL)));
    }/**
     * Syntactic sugar for (pcase-feature (FEATURE-CLAUSE) (otherwise . BODY))
     */


    /**
     * Macro for compile-time functional conditionalization based on *features*.
     * Each clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).
     * The first FEATURE-EXPRESSION that matches *features* determines which FORM
     * is used as the expansion  If the feature-expression is OTHERWISE
     * it is considered to be a match. Feature expressions are either feature
     * symbols or boolean combinations of feature expressions using CNOT, CAND, COR.
     */
    @LispMethod(comment = "Macro for compile-time functional conditionalization based on *features*.\r\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).\r\nThe first FEATURE-EXPRESSION that matches *features* determines which FORM\r\nis used as the expansion  If the feature-expression is OTHERWISE\r\nit is considered to be a match. Feature expressions are either feature\r\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.\nMacro for compile-time functional conditionalization based on *features*.\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).\nThe first FEATURE-EXPRESSION that matches *features* determines which FORM\nis used as the expansion  If the feature-expression is OTHERWISE\nit is considered to be a match. Feature expressions are either feature\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.")
    public static final SubLObject fcase_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clauses = current;
            SubLObject cdolist_list_var = feature_clauses;
            SubLObject feature_clause = NIL;
            for (feature_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature_clause = cdolist_list_var.first()) {
                {
                    SubLObject datum_26 = feature_clause;
                    SubLObject current_27 = datum_26;
                    SubLObject feature_expression = NIL;
                    SubLObject form = NIL;
                    destructuring_bind_must_consp(current_27, datum_26, $list_alt197);
                    feature_expression = current_27.first();
                    current_27 = current_27.rest();
                    destructuring_bind_must_consp(current_27, datum_26, $list_alt197);
                    form = current_27.first();
                    current_27 = current_27.rest();
                    if (NIL == current_27) {
                        if ((OTHERWISE == feature_expression) || (NIL != com.cyc.cycjava.cycl.subl_macros.feature_expression_match(feature_expression))) {
                            return form;
                        }
                    } else {
                        cdestructuring_bind_error(datum_26, $list_alt197);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Macro for compile-time functional conditionalization based on *features*.
     * Each clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).
     * The first FEATURE-EXPRESSION that matches *features* determines which FORM
     * is used as the expansion  If the feature-expression is OTHERWISE
     * it is considered to be a match. Feature expressions are either feature
     * symbols or boolean combinations of feature expressions using CNOT, CAND, COR.
     */
    @LispMethod(comment = "Macro for compile-time functional conditionalization based on *features*.\r\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).\r\nThe first FEATURE-EXPRESSION that matches *features* determines which FORM\r\nis used as the expansion  If the feature-expression is OTHERWISE\r\nit is considered to be a match. Feature expressions are either feature\r\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.\nMacro for compile-time functional conditionalization based on *features*.\nEach clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).\nThe first FEATURE-EXPRESSION that matches *features* determines which FORM\nis used as the expansion  If the feature-expression is OTHERWISE\nit is considered to be a match. Feature expressions are either feature\nsymbols or boolean combinations of feature expressions using CNOT, CAND, COR.")
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
    }/**
     * Macro for compile-time functional conditionalization based on *features*.
     * Each clause in FEATURE-CLAUSES is of the form (feature-expression . FORM).
     * The first FEATURE-EXPRESSION that matches *features* determines which FORM
     * is used as the expansion  If the feature-expression is OTHERWISE
     * it is considered to be a match. Feature expressions are either feature
     * symbols or boolean combinations of feature expressions using CNOT, CAND, COR.
     */


    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE ACTION) (otherwise ELSE-ACTION))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE ACTION) (otherwise ELSE-ACTION))")
    public static final SubLObject fif_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            SubLObject action = NIL;
            SubLObject else_action = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt192);
            feature_clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt192);
            action = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt192);
            else_action = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(FCASE_FEATURE, list(feature_clause, action), list(OTHERWISE, else_action));
            } else {
                cdestructuring_bind_error(datum, $list_alt192);
            }
        }
        return NIL;
    }

    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE ACTION) (otherwise ELSE-ACTION))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE ACTION) (otherwise ELSE-ACTION))")
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
    }/**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE ACTION) (otherwise ELSE-ACTION))
     */


    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY))")
    public static final SubLObject fwhen_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            feature_clause = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(FCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)));
            }
        }
    }

    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY))")
    public static SubLObject fwhen_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(FCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)));
    }/**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY))
     */


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

    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE NIL) (otherwise . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE NIL) (otherwise . BODY))")
    public static final SubLObject funless_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            feature_clause = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(FCASE_FEATURE, bq_cons(feature_clause, $list_alt200), bq_cons(OTHERWISE, append(body, NIL)));
            }
        }
    }

    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE NIL) (otherwise . BODY))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE NIL) (otherwise . BODY))")
    public static SubLObject funless_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(FCASE_FEATURE, bq_cons(feature_clause, $list238), bq_cons(OTHERWISE, append(body, NIL)));
    }/**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE NIL) (otherwise . BODY))
     */


    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY) (otherwise T))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY) (otherwise T))")
    public static final SubLObject fimplies_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject feature_clause = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            feature_clause = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(FCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)), $list_alt201);
            }
        }
    }

    /**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY) (otherwise T))
     */
    @LispMethod(comment = "Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY) (otherwise T))")
    public static SubLObject fimplies_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        feature_clause = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(FCASE_FEATURE, bq_cons(feature_clause, append(body, NIL)), $list240);
    }/**
     * Syntactic sugar for (fcase-feature (FEATURE-CLAUSE . BODY) (otherwise T))
     */


    /**
     * Return T iff ATOMIC-FEATURE is one of the features in *features*.
     */
    @LispMethod(comment = "Return T iff ATOMIC-FEATURE is one of the features in *features*.")
    public static final SubLObject atomic_feature_match_alt(SubLObject atomic_feature) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != member(atomic_feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
        }
    }

    /**
     * Return T iff ATOMIC-FEATURE is one of the features in *features*.
     */
    @LispMethod(comment = "Return T iff ATOMIC-FEATURE is one of the features in *features*.")
    public static SubLObject atomic_feature_match(final SubLObject atomic_feature) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(atomic_feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }/**
     * Return T iff ATOMIC-FEATURE is one of the features in *features*.
     */


    /**
     * Return T iff FEATURE-EXPRESSION matches *features*.
     * Feature expressions are either feature symbols or boolean
     * combinations of feature expressions using CNOT, CAND, COR.
     */
    @LispMethod(comment = "Return T iff FEATURE-EXPRESSION matches *features*.\r\nFeature expressions are either feature symbols or boolean\r\ncombinations of feature expressions using CNOT, CAND, COR.\nReturn T iff FEATURE-EXPRESSION matches *features*.\nFeature expressions are either feature symbols or boolean\ncombinations of feature expressions using CNOT, CAND, COR.")
    public static final SubLObject feature_expression_match_alt(SubLObject feature_expression) {
        if (feature_expression.isAtom()) {
            if (feature_expression.isSymbol()) {
                return com.cyc.cycjava.cycl.subl_macros.atomic_feature_match(feature_expression);
            }
        } else {
            {
                SubLObject datum = feature_expression;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject subexpressions = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt202);
                operator = current.first();
                current = current.rest();
                subexpressions = current;
                {
                    SubLObject pcase_var = operator;
                    if ((pcase_var.eql($NOT) || pcase_var.eql(NOT)) || pcase_var.eql(CNOT)) {
                        return makeBoolean(NIL == com.cyc.cycjava.cycl.subl_macros.feature_expression_match(subexpressions.first()));
                    } else {
                        if ((pcase_var.eql($OR) || pcase_var.eql(OR)) || pcase_var.eql(COR)) {
                            {
                                SubLObject some_sub_match_succeeds = NIL;
                                if (NIL == some_sub_match_succeeds) {
                                    {
                                        SubLObject csome_list_var = subexpressions;
                                        SubLObject subexpression = NIL;
                                        for (subexpression = csome_list_var.first(); !((NIL != some_sub_match_succeeds) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subexpression = csome_list_var.first()) {
                                            some_sub_match_succeeds = com.cyc.cycjava.cycl.subl_macros.feature_expression_match(subexpression);
                                        }
                                    }
                                }
                                return some_sub_match_succeeds;
                            }
                        } else {
                            if ((pcase_var.eql($AND) || pcase_var.eql(AND)) || pcase_var.eql(CAND)) {
                                {
                                    SubLObject some_sub_match_fails = NIL;
                                    if (NIL == some_sub_match_fails) {
                                        {
                                            SubLObject csome_list_var = subexpressions;
                                            SubLObject subexpression = NIL;
                                            for (subexpression = csome_list_var.first(); !((NIL != some_sub_match_fails) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subexpression = csome_list_var.first()) {
                                                some_sub_match_fails = makeBoolean(NIL == com.cyc.cycjava.cycl.subl_macros.feature_expression_match(subexpression));
                                            }
                                        }
                                    }
                                    return makeBoolean(NIL == some_sub_match_fails);
                                }
                            }
                        }
                    }
                }
            }
        }
        Errors.error($str_alt209$_S_is_not_a_well_formed_feature_e, feature_expression);
        return NIL;
    }

    /**
     * Return T iff FEATURE-EXPRESSION matches *features*.
     * Feature expressions are either feature symbols or boolean
     * combinations of feature expressions using CNOT, CAND, COR.
     */
    @LispMethod(comment = "Return T iff FEATURE-EXPRESSION matches *features*.\r\nFeature expressions are either feature symbols or boolean\r\ncombinations of feature expressions using CNOT, CAND, COR.\nReturn T iff FEATURE-EXPRESSION matches *features*.\nFeature expressions are either feature symbols or boolean\ncombinations of feature expressions using CNOT, CAND, COR.")
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
    }/**
     * Return T iff FEATURE-EXPRESSION matches *features*.
     * Feature expressions are either feature symbols or boolean
     * combinations of feature expressions using CNOT, CAND, COR.
     */


    /**
     *
     *
     * @unknown may eval FUNC twice
     */
    @LispMethod(comment = "@unknown may eval FUNC twice")
    public static final SubLObject funcall_if_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject func = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt210);
            func = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                if (NIL == func) {
                    return $list_alt211;
                } else {
                    return list(FWHEN, func, listS(FUNCALL, func, append(args, NIL)));
                }
            }
        }
    }

    /**
     *
     *
     * @unknown may eval FUNC twice
     */
    @LispMethod(comment = "@unknown may eval FUNC twice")
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

    public static final SubLObject cpush_if_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject item = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt214);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt214);
            place = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject var = $sym215$VAR;
                    return list(CLET, list(list(var, item)), list(PWHEN, var, list(CPUSH, var, place)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt214);
            }
        }
        return NIL;
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

    public static final SubLObject cpushnew_if_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject item = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt216);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt216);
            place = current.first();
            current = current.rest();
            {
                SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : $list_alt217;
                destructuring_bind_must_listp(current, datum, $list_alt216);
                current = current.rest();
                {
                    SubLObject key = (current.isCons()) ? ((SubLObject) (current.first())) : $list_alt218;
                    destructuring_bind_must_listp(current, datum, $list_alt216);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject var = $sym219$VAR;
                            return list(CLET, list(list(var, item)), list(PWHEN, var, list(CPUSHNEW, var, place, test, key)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt216);
                    }
                }
            }
        }
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

    public static final SubLObject cpush_all_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject items = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt221);
            items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt221);
            place = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject item = $sym222$ITEM;
                    SubLObject items_var = $sym223$ITEMS_VAR;
                    return list(CLET, list(list(items_var, items)), list(PIF, list(VECTORP, items_var), list(DO_VECTOR, list(item, items), list(CPUSH, item, place)), list(CDOLIST, list(item, items), list(CPUSH, item, place))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt221);
            }
        }
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

    /**
     *
     *
     * @unknown inefficient
     */
    @LispMethod(comment = "@unknown inefficient")
    public static final SubLObject cpushnew_all_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject items = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt225);
            items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt225);
            place = current.first();
            current = current.rest();
            {
                SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : $list_alt217;
                destructuring_bind_must_listp(current, datum, $list_alt225);
                current = current.rest();
                {
                    SubLObject key = (current.isCons()) ? ((SubLObject) (current.first())) : $list_alt218;
                    destructuring_bind_must_listp(current, datum, $list_alt225);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject item = $sym226$ITEM;
                            SubLObject items_var = $sym227$ITEMS_VAR;
                            return list(CLET, list(list(items_var, items)), list(PIF, list(VECTORP, items_var), list(DO_VECTOR, list(item, items), list(CPUSHNEW, item, place, test, key)), list(CDOLIST, list(item, items), list(CPUSHNEW, item, place, test, key))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt225);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown inefficient
     */
    @LispMethod(comment = "@unknown inefficient")
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

    public static final SubLObject csetf_delete_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject item = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt228);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt228);
            place = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_28 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt228);
                    current_28 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt228);
                    if (NIL == member(current_28, $list_alt229, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_28 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt228);
                }
                {
                    SubLObject test_tail = property_list_member($TEST, current);
                    SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : $list_alt217;
                    SubLObject key_tail = property_list_member($KEY, current);
                    SubLObject key = (NIL != key_tail) ? ((SubLObject) (cadr(key_tail))) : $list_alt218;
                    if (key.equal($list_alt218)) {
                        if (test.equal($list_alt217)) {
                            return list(CSETF, place, list(DELETE, item, place));
                        } else {
                            return list(CSETF, place, list(DELETE, item, place, test));
                        }
                    } else {
                        return list(CSETF, place, list(DELETE, item, place, test, key));
                    }
                }
            }
        }
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

    /**
     * Add ITEM to be the new last element of the list stored at PLACE.
     * Similar to @xref CPUSH, which makes ITEM the new first element.
     */
    @LispMethod(comment = "Add ITEM to be the new last element of the list stored at PLACE.\r\nSimilar to @xref CPUSH, which makes ITEM the new first element.\nAdd ITEM to be the new last element of the list stored at PLACE.\nSimilar to @xref CPUSH, which makes ITEM the new first element.")
    public static final SubLObject cpush_end_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject item = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt214);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt214);
            place = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_cons = $sym234$NEW_CONS;
                    SubLObject list = $sym235$LIST;
                    return list(CLET, list(list(new_cons, listS(CONS, item, $list_alt200)), list(list, place)), list(PIF, list, list(RPLACD_LAST, list, new_cons), list(CSETF, place, new_cons)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt214);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Add ITEM to be the new last element of the list stored at PLACE.\r\nSimilar to @xref CPUSH, which makes ITEM the new first element.\nAdd ITEM to be the new last element of the list stored at PLACE.\nSimilar to @xref CPUSH, which makes ITEM the new first element.")
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
    }/**
     * Add ITEM to be the new last element of the list stored at PLACE.
     * Similar to @xref CPUSH, which makes ITEM the new first element.
     */


    /**
     * Add ITEM to be the new last element of the list stored at PLACE,
     * unless ITEM is already a member (according to TEST and KEY).
     * Similar to @xref CPUSHNEW, which makes ITEM the new first element.
     */
    @LispMethod(comment = "Add ITEM to be the new last element of the list stored at PLACE,\r\nunless ITEM is already a member (according to TEST and KEY).\r\nSimilar to @xref CPUSHNEW, which makes ITEM the new first element.\nAdd ITEM to be the new last element of the list stored at PLACE,\nunless ITEM is already a member (according to TEST and KEY).\nSimilar to @xref CPUSHNEW, which makes ITEM the new first element.")
    public static final SubLObject cpushnew_end_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject item = NIL;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt228);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt228);
            place = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_29 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt228);
                    current_29 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt228);
                    if (NIL == member(current_29, $list_alt229, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_29 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt228);
                }
                {
                    SubLObject test_tail = property_list_member($TEST, current);
                    SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : $list_alt217;
                    SubLObject key_tail = property_list_member($KEY, current);
                    SubLObject key = (NIL != key_tail) ? ((SubLObject) (cadr(key_tail))) : $list_alt218;
                    SubLObject item_var = $sym237$ITEM_VAR;
                    return list(CLET, list(list(item_var, item)), list(PUNLESS, list(MEMBER, item_var, place, test, key), list(CPUSH_END, item_var, place)));
                }
            }
        }
    }

    @LispMethod(comment = "Add ITEM to be the new last element of the list stored at PLACE,\r\nunless ITEM is already a member (according to TEST and KEY).\r\nSimilar to @xref CPUSHNEW, which makes ITEM the new first element.\nAdd ITEM to be the new last element of the list stored at PLACE,\nunless ITEM is already a member (according to TEST and KEY).\nSimilar to @xref CPUSHNEW, which makes ITEM the new first element.")
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
    }/**
     * Add ITEM to be the new last element of the list stored at PLACE,
     * unless ITEM is already a member (according to TEST and KEY).
     * Similar to @xref CPUSHNEW, which makes ITEM the new first element.
     */


    /**
     * Replace the last cdr of NON-EMPTY-LIST with NEW-LAST-CDR
     */
    @LispMethod(comment = "Replace the last cdr of NON-EMPTY-LIST with NEW-LAST-CDR")
    public static final SubLObject rplacd_last_alt(SubLObject non_empty_list, SubLObject new_last_cdr) {
        return rplacd(last(non_empty_list, UNPROVIDED), new_last_cdr);
    }

    @LispMethod(comment = "Replace the last cdr of NON-EMPTY-LIST with NEW-LAST-CDR")
    public static SubLObject rplacd_last(final SubLObject non_empty_list, final SubLObject new_last_cdr) {
        return rplacd(last(non_empty_list, UNPROVIDED), new_last_cdr);
    }/**
     * Replace the last cdr of NON-EMPTY-LIST with NEW-LAST-CDR
     */


    public static SubLObject without_appending_stack_traces_to_error_messages(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject was_appendingP = $sym288$WAS_APPENDING_;
        return list(PIF_FEATURE, $SL2JAVA, list(CLET, list(bq_cons(was_appendingP, $list290)), $list291, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(EVAL, list(LIST, $list293, $list294, was_appendingP)))), bq_cons(PROGN, append(body, NIL)));
    }

    /**
     * Perform BODY as silently as possible, suppressing all printout
     */
    @LispMethod(comment = "Perform BODY as silently as possible, suppressing all printout")
    public static final SubLObject silently_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt240, append(body, NIL));
        }
    }

    @LispMethod(comment = "Perform BODY as silently as possible, suppressing all printout")
    public static SubLObject silently(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list296, append(body, NIL));
    }/**
     * Perform BODY as silently as possible, suppressing all printout
     */


    /**
     * Return T iff LHS is not true or RHS is true.
     */
    @LispMethod(comment = "Return T iff LHS is not true or RHS is true.")
    public static final SubLObject fimplies_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject lhs = NIL;
            SubLObject rhs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt241);
            lhs = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt241);
            rhs = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(COR, list(CNOT, lhs), rhs);
            } else {
                cdestructuring_bind_error(datum, $list_alt241);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff LHS is not true or RHS is true.")
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
    }/**
     * Return T iff LHS is not true or RHS is true.
     */


    /**
     *
     *
     * @unknown mahler
     */
    @LispMethod(comment = "@unknown mahler")
    public static final SubLObject fxor_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject a = NIL;
            SubLObject b = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt242);
            a = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt242);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CNOT, list(EQ, list(CNOT, a), list(CNOT, b)));
            } else {
                cdestructuring_bind_error(datum, $list_alt242);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown mahler
     */
    @LispMethod(comment = "@unknown mahler")
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

    /**
     *
     *
     * @unknown mahler
     */
    @LispMethod(comment = "@unknown mahler")
    public static final SubLObject fequiv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject a = NIL;
            SubLObject b = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt242);
            a = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt242);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(EQ, list(CNOT, a), list(CNOT, b));
            } else {
                cdestructuring_bind_error(datum, $list_alt242);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown mahler
     */
    @LispMethod(comment = "@unknown mahler")
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

    public static final SubLObject possibly_with_static_area_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject varP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt243);
                varP = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return bq_cons(PROGN, append(body, NIL));
                    }
                    return list(PIF, varP, bq_cons(WITH_STATIC_AREA, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
                }
            }
        }
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
        declareMacro("until", "UNTIL");
        declareMacro("sublisp_while", "WHILE");
        declareMacro("repeat_forever", "REPEAT-FOREVER");
        declareMacro("do_numbers", "DO-NUMBERS");
        declareMacro("do_numbers_endtest_macro", "DO-NUMBERS-ENDTEST-MACRO");
        declareFunction("do_numbers_endtest", "DO-NUMBERS-ENDTEST", 3, 0, false);
        declareMacro("do_list", "DO-LIST");
        declareMacro("do_list_index", "DO-LIST-INDEX");
        declareMacro("do_alist", "DO-ALIST");
        declareMacro("do_alist_values", "DO-ALIST-VALUES");
        declareMacro("do_alist_keys", "DO-ALIST-KEYS");
        declareMacro("cinc_alist", "CINC-ALIST");
        declareMacro("cdec_alist", "CDEC-ALIST");
        declareMacro("do_plist", "DO-PLIST");
        declareMacro("do_plist_properties", "DO-PLIST-PROPERTIES");
        declareMacro("do_plist_values", "DO-PLIST-VALUES");
        declareMacro("smart_csome", "SMART-CSOME");
        declareMacro("cdocons", "CDOCONS");
        declareMacro("do_pairs", "DO-PAIRS");
        declareMacro("do_list_with_tail", "DO-LIST-WITH-TAIL");
        declareMacro("dolists", "DOLISTS");
        declareMacro("do_string", "DO-STRING");
        declareMacro("do_string_index", "DO-STRING-INDEX");
        declareMacro("do_vector", "DO-VECTOR");
        declareMacro("do_vector_index", "DO-VECTOR-INDEX");
        declareMacro("cdovector", "CDOVECTOR");
        declareMacro("csome_vector", "CSOME-VECTOR");
        declareMacro("smart_csomevector", "SMART-CSOMEVECTOR");
        declareMacro("do_sequence", "DO-SEQUENCE");
        declareMacro("do_sequence_index", "DO-SEQUENCE-INDEX");
        declareFunction("do_sequence_index_doneP", "DO-SEQUENCE-INDEX-DONE?", 3, 0, false);
        declareFunction("do_sequence_index_valueP", "DO-SEQUENCE-INDEX-VALUE?", 2, 0, false);
        declareFunction("do_sequence_index_update", "DO-SEQUENCE-INDEX-UPDATE", 1, 0, false);
        declareMacro("do_hash_table", "DO-HASH-TABLE");
        declareFunction("do_hash_table_done_check", "DO-HASH-TABLE-DONE-CHECK", 1, 0, false);
        declareMacro("do_hash_table_keys", "DO-HASH-TABLE-KEYS");
        declareMacro("ccatch_ignore", "CCATCH-IGNORE");
        declareMacro("punless_error", "PUNLESS-ERROR");
        declareMacro("pwhen_error", "PWHEN-ERROR");
        declareMacro("warn_on_errors", "WARN-ON-ERRORS");
        declareMacro("possibly_warn_on_errors", "POSSIBLY-WARN-ON-ERRORS");
        declareMacro("possibly_ignore_errors", "POSSIBLY-IGNORE-ERRORS");
        declareMacro("warn_or_ignore_errors", "WARN-OR-IGNORE-ERRORS");
        declareMacro("with_default_error_handling", "WITH-DEFAULT-ERROR-HANDLING");
        declareMacro("cunwind_on_failure", "CUNWIND-ON-FAILURE");
        declareMacro("cunwind_protect_with_fail_clause", "CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        declareMacro("assert_type", "ASSERT-TYPE");
        declareMacro("assert_type_if_present", "ASSERT-TYPE-IF-PRESENT");
        declareMacro("assert_list_type", "ASSERT-LIST-TYPE");
        declareMacro("assert_plist_type", "ASSERT-PLIST-TYPE");
        declareMacro("assert_must", "ASSERT-MUST");
        declareMacro("pcase_feature", "PCASE-FEATURE");
        declareMacro("pif_feature", "PIF-FEATURE");
        declareMacro("pwhen_feature", "PWHEN-FEATURE");
        declareMacro("punless_feature", "PUNLESS-FEATURE");
        declareMacro("fcase_feature", "FCASE-FEATURE");
        declareMacro("fif_feature", "FIF-FEATURE");
        declareMacro("fwhen_feature", "FWHEN-FEATURE");
        declareMacro("feature_match", "FEATURE-MATCH");
        declareMacro("funless_feature", "FUNLESS-FEATURE");
        declareMacro("fimplies_feature", "FIMPLIES-FEATURE");
        declareFunction("atomic_feature_match", "ATOMIC-FEATURE-MATCH", 1, 0, false);
        declareFunction("feature_expression_match", "FEATURE-EXPRESSION-MATCH", 1, 0, false);
        declareMacro("funcall_if", "FUNCALL-IF");
        declareMacro("cpush_if", "CPUSH-IF");
        declareMacro("cpushnew_if", "CPUSHNEW-IF");
        declareMacro("cpush_all", "CPUSH-ALL");
        declareMacro("cpushnew_all", "CPUSHNEW-ALL");
        declareMacro("csetf_delete", "CSETF-DELETE");
        declareMacro("cpush_end", "CPUSH-END");
        declareMacro("cpushnew_end", "CPUSHNEW-END");
        declareFunction("rplacd_last", "RPLACD-LAST", 2, 0, false);
        declareMacro("without_appending_stack_traces_to_error_messages", "WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES");
        declareMacro("silently", "SILENTLY");
        declareMacro("fimplies", "FIMPLIES");
        declareMacro("fxor", "FXOR");
        declareMacro("fequiv", "FEQUIV");
        declareMacro("possibly_with_static_area", "POSSIBLY-WITH-STATIC-AREA");
        return NIL;
    }

    public static SubLObject init_subl_macros_file() {
        deflexical("*IGNORE-ASSERT-TYPES?*", T);
        return NIL;
    }

    public static final SubLObject setup_subl_macros_file_alt() {
        register_macro_helper(DO_NUMBERS_ENDTEST_MACRO, DO_NUMBERS);
        register_macro_helper(DO_NUMBERS_ENDTEST, DO_NUMBERS);
        register_external_symbol(DO_LIST);
        register_macro_helper($sym137$DO_SEQUENCE_INDEX_DONE_, DO_SEQUENCE_INDEX);
        register_macro_helper($sym138$DO_SEQUENCE_INDEX_VALUE_, DO_SEQUENCE_INDEX);
        register_macro_helper(DO_SEQUENCE_INDEX_UPDATE, DO_SEQUENCE_INDEX);
        register_external_symbol(DO_HASH_TABLE);
        register_macro_helper(DO_HASH_TABLE_DONE_CHECK, DO_HASH_TABLE);
        meta_macros.declare_indention_pattern(PIF_FEATURE, $list_alt195);
        meta_macros.declare_indention_pattern(FIF_FEATURE, $list_alt195);
        return NIL;
    }

    public static SubLObject setup_subl_macros_file() {
        if (SubLFiles.USE_V1) {
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
            register_external_symbol($ignore_assert_typesP$);
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
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper($sym137$DO_SEQUENCE_INDEX_DONE_, DO_SEQUENCE_INDEX);
            register_macro_helper($sym138$DO_SEQUENCE_INDEX_VALUE_, DO_SEQUENCE_INDEX);
            meta_macros.declare_indention_pattern(PIF_FEATURE, $list_alt195);
            meta_macros.declare_indention_pattern(FIF_FEATURE, $list_alt195);
        }
        return NIL;
    }

    public static SubLObject setup_subl_macros_file_Previous() {
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
        register_external_symbol($ignore_assert_typesP$);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("NUMBER-VAR"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), list(makeSymbol("DELTA"), ONE_INTEGER), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("DELTA"), $DONE);

    static private final SubLSymbol $sym13$1_ = makeSymbol("1+");

    static private final SubLSymbol $sym14$_ = makeSymbol("+");

    static private final SubLSymbol $sym15$DELTA_VAR = makeUninternedSymbol("DELTA-VAR");

    static private final SubLSymbol $sym16$END_VAR = makeUninternedSymbol("END-VAR");

    static private final SubLList $list_alt22 = list(makeSymbol("NUMBER-VAR"), makeSymbol("DELTA-FORM"), makeSymbol("END-VAR"));

    static private final SubLSymbol $sym23$__ = makeSymbol(">=");

    static private final SubLSymbol $sym25$_ = makeSymbol("=");

    static private final SubLList $list_alt28 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt29 = list($DONE, makeKeyword("PROGRESS-MESSAGE"));

    static private final SubLSymbol $sym31$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLSymbol $sym32$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    static private final SubLSymbol $sym33$SOFAR = makeUninternedSymbol("SOFAR");

    static private final SubLSymbol $sym34$TOTAL = makeUninternedSymbol("TOTAL");

    static private final SubLList $list_alt35 = list(ZERO_INTEGER);

    static private final SubLSymbol $sym40$REST = makeUninternedSymbol("REST");

    static private final SubLList $list_alt45 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("LIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt46 = list($DONE);

    static private final SubLSymbol $sym47$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    static private final SubLList $list_alt48 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt49 = list(makeKeyword("INDEX"), $DONE);

    static private final SubLSymbol $sym52$CONS = makeUninternedSymbol("CONS");

    static private final SubLList $list_alt54 = list(list(makeSymbol("VALUE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym55$KEY = makeUninternedSymbol("KEY");

    static private final SubLList $list_alt57 = list(list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym58$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLList $list_alt59 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)), list(makeSymbol("INCREMENT"), ONE_INTEGER));

    static private final SubLSymbol $sym60$ENTRY = makeUninternedSymbol("ENTRY");

    static private final SubLList $list_alt67 = list(makeSymbol("KEY"), makeSymbol("ALIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)), list(makeSymbol("DECREMENT"), ONE_INTEGER));

    static private final SubLList $list_alt69 = list(list(makeSymbol("PROPERTY"), makeSymbol("VALUE"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym70$REMAINDER = makeUninternedSymbol("REMAINDER");

    static private final SubLList $list_alt73 = list(list(makeSymbol("PROPERTY"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym74$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLList $list_alt76 = list(list(makeSymbol("VALUE"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym77$PROPERTY = makeUninternedSymbol("PROPERTY");

    static private final SubLList $list_alt78 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt79 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("VAR1"), makeSymbol("VAR2"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym82$LIST = makeUninternedSymbol("LIST");

    static private final SubLList $list_alt87 = list(list(makeSymbol("ITEM"), makeSymbol("TAIL"), makeSymbol("LISTFORM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym88$CDR_VAR = makeUninternedSymbol("CDR-VAR");

    static private final SubLList $list_alt89 = list(list(makeSymbol("&REST"), makeSymbol("SPECS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt90$CURRENT__A = makeString("CURRENT-~A");

    static private final SubLList $list_alt92 = list(list(makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("CHAR-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt93 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("CHAR-NUM"), $DONE);

    static private final SubLSymbol $sym96$CHAR_NUM = makeUninternedSymbol("CHAR-NUM");

    static private final SubLList $list_alt98 = list(list(makeSymbol("CHAR-NUM"), makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt99 = list(makeKeyword("START"), makeKeyword("END"), $DONE);

    static private final SubLSymbol $sym100$STRING_VAR = makeUninternedSymbol("STRING-VAR");

    static private final SubLSymbol $sym101$END_VAR = makeUninternedSymbol("END-VAR");

    static private final SubLList $list_alt104 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt105 = list(makeKeyword("ELEMENT-NUM"), $DONE, makeKeyword("BACKWARD?"));

    static private final SubLSymbol $sym109$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");

    static private final SubLList $list_alt110 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("BACKWARD?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt111 = list($DONE, makeKeyword("BACKWARD?"));

    static private final SubLSymbol $sym112$VECTOR_VAR = makeUninternedSymbol("VECTOR-VAR");

    static private final SubLSymbol $sym113$BACKWARD__VAR = makeUninternedSymbol("BACKWARD?-VAR");

    static private final SubLSymbol $sym114$LENGTH = makeUninternedSymbol("LENGTH");

    static private final SubLSymbol $sym115$START = makeUninternedSymbol("START");

    static private final SubLSymbol $sym116$END = makeUninternedSymbol("END");

    static private final SubLSymbol $sym117$DELTA = makeUninternedSymbol("DELTA");

    static private final SubLSymbol $sym119$_ = makeSymbol("-");

    static private final SubLList $list_alt120 = list(ONE_INTEGER);

    static private final SubLList $list_alt121 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);

    static private final SubLSymbol $sym123$ITERATION = makeUninternedSymbol("ITERATION");

    static private final SubLList $list_alt124 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt126 = list(list(makeSymbol("VAR"), makeSymbol("VECTOR"), makeSymbol("DONEVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt128 = list(makeKeyword("ELEMENT-NUM"), $DONE);

    static private final SubLSymbol $sym130$ELEMENT_NUM = makeUninternedSymbol("ELEMENT-NUM");

    static private final SubLList $list_alt131 = list(list(makeSymbol("KEY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("SEQUENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym132$SEQUENCE_VAR = makeUninternedSymbol("SEQUENCE-VAR");

    static private final SubLSymbol $sym133$END_INDEX = makeUninternedSymbol("END-INDEX");

    static private final SubLSymbol $sym134$SEQUENCE_DONE_ = makeUninternedSymbol("SEQUENCE-DONE?");

    static private final SubLSymbol $sym137$DO_SEQUENCE_INDEX_DONE_ = makeSymbol("DO-SEQUENCE-INDEX-DONE?");

    static private final SubLSymbol $sym138$DO_SEQUENCE_INDEX_VALUE_ = makeSymbol("DO-SEQUENCE-INDEX-VALUE?");

    static private final SubLList $list_alt142 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("HASH-TABLE"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym143$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLSymbol $sym144$SILENT_ = makeUninternedSymbol("SILENT?");

    static private final SubLSymbol $sym145$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    static private final SubLSymbol $sym146$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    static private final SubLSymbol $sym147$COUNT_VAR = makeUninternedSymbol("COUNT-VAR");

    static private final SubLList $list_alt148 = list(makeSymbol("*SILENT-PROGRESS?*"));

    static private final SubLList $list_alt151 = list(makeString(""));

    static private final SubLList $list_alt157 = list(makeSymbol("TAG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym158$CATCH_VAR = makeUninternedSymbol("CATCH-VAR");

    static private final SubLList $list_alt160 = list(makeSymbol("FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym161$ERROR = makeUninternedSymbol("ERROR");

    static private final SubLSymbol $sym163$ERROR = makeUninternedSymbol("ERROR");

    static private final SubLSymbol $sym165$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLString $str_alt168$_A = makeString("~A");

    static private final SubLList $list_alt169 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt174 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym175$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");

    static private final SubLList $list_alt177 = list(T);

    static private final SubLList $list_alt178 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("FAILURE-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym179$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");

    static private final SubLList $list_alt180 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    static private final SubLList $list_alt183 = list(makeSymbol("LIST"), makeSymbol("PRED"));

    static private final SubLList $list_alt185 = list(makeSymbol("PLIST"), makeSymbol("PRED"));

    static private final SubLList $list_alt187 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    static private final SubLList $list_alt188 = list(makeSymbol("PROGN"));

    static private final SubLList $list_alt190 = cons(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("BODY"));

    static private final SubLList $list_alt192 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));

    static private final SubLList $list_alt195 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("FEATURE-CLAUSES"));

    static private final SubLList $list_alt196 = list(makeSymbol("FEATURE-CLAUSE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt197 = list(makeSymbol("FEATURE-EXPRESSION"), makeSymbol("FORM"));

    static private final SubLList $list_alt200 = list(NIL);

    static private final SubLList $list_alt201 = list(list(makeSymbol("OTHERWISE"), T));

    static private final SubLList $list_alt202 = cons(makeSymbol("OPERATOR"), makeSymbol("SUBEXPRESSIONS"));

    static private final SubLString $str_alt209$_S_is_not_a_well_formed_feature_e = makeString("~S is not a well-formed feature expression");

    static private final SubLList $list_alt210 = list(makeSymbol("FUNC"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt211 = list(makeSymbol("FALSE"));

    static private final SubLList $list_alt214 = list(makeSymbol("ITEM"), makeSymbol("PLACE"));

    static private final SubLSymbol $sym215$VAR = makeUninternedSymbol("VAR");

    static private final SubLList $list_alt216 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(QUOTE, list(makeSymbol("FUNCTION"), IDENTITY))));

    static private final SubLList $list_alt217 = list(makeSymbol("FUNCTION"), EQL);

    static private final SubLList $list_alt218 = list(makeSymbol("FUNCTION"), IDENTITY);

    static private final SubLSymbol $sym219$VAR = makeUninternedSymbol("VAR");

    static private final SubLList $list_alt221 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"));

    static private final SubLSymbol $sym222$ITEM = makeUninternedSymbol("ITEM");

    static private final SubLSymbol $sym223$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");

    static private final SubLList $list_alt225 = list(makeSymbol("ITEMS"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(QUOTE, list(makeSymbol("FUNCTION"), IDENTITY))));

    static private final SubLSymbol $sym226$ITEM = makeUninternedSymbol("ITEM");

    static private final SubLSymbol $sym227$ITEMS_VAR = makeUninternedSymbol("ITEMS-VAR");

    static private final SubLList $list_alt228 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&KEY"), list(makeSymbol("TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(QUOTE, list(makeSymbol("FUNCTION"), IDENTITY))));

    static private final SubLList $list_alt229 = list($TEST, makeKeyword("KEY"));

    static private final SubLSymbol $sym234$NEW_CONS = makeUninternedSymbol("NEW-CONS");

    static private final SubLSymbol $sym235$LIST = makeUninternedSymbol("LIST");

    static private final SubLSymbol $sym237$ITEM_VAR = makeUninternedSymbol("ITEM-VAR");

    static private final SubLList $list_alt240 = list(list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")));

    static private final SubLList $list_alt241 = list(makeSymbol("LHS"), makeSymbol("RHS"));

    static private final SubLList $list_alt242 = list(makeSymbol("A"), makeSymbol("B"));

    static private final SubLList $list_alt243 = list(makeSymbol("VAR?"), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 734 ms
 */
