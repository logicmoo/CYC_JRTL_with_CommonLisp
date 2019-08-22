package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_datastructures extends SubLTranslatedFile {
    public static final SubLFile me = new shop_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.shop_datastructures";

    public static final String myFingerPrint = "1d022beaf3a87e7f11db01ed5bc67d3a2b940e486d3ad0d7d2e1776a5ca25808";

    // deflexical
    // the symbol returned when @xref SHOP-UNIFY fails.
    public static final SubLSymbol $shop_unify_failed$ = makeSymbol("*SHOP-UNIFY-FAILED*");

    // deflexical
    // the symbol that represents an empty binding.
    public static final SubLSymbol $shop_empty_unifier$ = makeSymbol("*SHOP-EMPTY-UNIFIER*");

    // Internal Constants
    public static final SubLSymbol SHOP_INDEXED_OBJECT = makeSymbol("SHOP-INDEXED-OBJECT");



    public static final SubLList $list2 = list(list(makeSymbol("INSTANCE-INDEX"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("FIND-INSTANCE"), list(makeSymbol("ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-INDEX"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-INSTANCE");

    public static final SubLSymbol FIND_INSTANCE = makeSymbol("FIND-INSTANCE");

    public static final SubLList $list10 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list11 = list(makeSymbol("ID"));

    public static final SubLList $list12 = list(list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("INSTANCE-INDEX"), makeSymbol("ID"), NIL)));

    public static final SubLSymbol $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-INDEXED-OBJECT-METHOD");

    public static final SubLSymbol SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD = makeSymbol("SHOP-INDEXED-OBJECT-FIND-INSTANCE-METHOD");

    public static final SubLSymbol ADD_TO_INDEX = makeSymbol("ADD-TO-INDEX");

    public static final SubLList $list16 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PRIVATE"));

    public static final SubLList $list17 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE-NUMBER"), list(makeSymbol("GET-OBJECT-INSTANCE-NUMBER"), makeSymbol("SELF"))), list(makeSymbol("INSTANCE-INDEX"), list(makeSymbol("GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("INSTANCE-INDEX")), list(makeSymbol("SET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX"), makeSymbol("SELF"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQ), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-INDEX"), list(makeSymbol("GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX"), makeSymbol("SELF")))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("INSTANCE-INDEX"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD = makeSymbol("SHOP-INDEXED-OBJECT-ADD-TO-INDEX-METHOD");



    public static final SubLList $list20 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list21 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PWHEN"), makeSymbol("*SHOP-OBJECT-INDEXING?*"), list(makeSymbol("ADD-TO-INDEX"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol SHOP_INDEXED_OBJECT_INITIALIZE_METHOD = makeSymbol("SHOP-INDEXED-OBJECT-INITIALIZE-METHOD");

    public static final SubLSymbol SHOP_PROBLEM = makeSymbol("SHOP-PROBLEM");

    public static final SubLList $list24 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROBLEM"), list(makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-NAME"), makeSymbol("STATE"), makeSymbol("TASKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DOMAIN"), list(makeSymbol("DOMAIN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OPERATORS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHODS"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol SHOP_PLANNER_RULE = makeSymbol("SHOP-PLANNER-RULE");

    public static final SubLList $list26 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HEAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HEAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY-TASK-TO-HEAD"), list(makeSymbol("TASK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSERTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-DISPLAY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ASSERTIONS"), list(makeSymbol("ASSERTION-LIST")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_OPERATOR = makeSymbol("SHOP-OPERATOR");

    public static final SubLList $list28 = list(makeKeyword("EXTENDS"), makeSymbol("SHOP-PLANNER-RULE"));

    public static final SubLList $list29 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-LITERALS-TO-ADDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DELETES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-LITERALS-TO-DELETES"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_SUFFICIENCY_CONDITION = makeSymbol("SHOP-SUFFICIENCY-CONDITION");

    public static final SubLList $list31 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COND-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-COND-FORMULA"), list(makeSymbol("FORM")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_METHOD = makeSymbol("SHOP-METHOD");

    public static final SubLList $list33 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DECOMPOSITION"), list(makeSymbol("DECOMP")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DECOMPOSITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT"), NIL, makeKeyword("PUBLIC")));

    public static final SubLList $list34 = list(makeSymbol("SET1"), makeSymbol("SET2"), makeSymbol("&KEY"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))));

    public static final SubLList $list35 = list(makeKeyword("TEST"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLList $list38 = list(makeSymbol("FUNCTION"), EQL);

    public static final SubLSymbol SHOP_MY_UNION_FUNC = makeSymbol("SHOP-MY-UNION-FUNC");



    public static final SubLSymbol SHOP_COMPOSE_SUBSTITUTIONS_TEST = makeSymbol("SHOP-COMPOSE-SUBSTITUTIONS-TEST");

    public static final SubLString $str42$_ = makeString("?");

    public static final SubLSymbol SHOP_STANDARDIZER_GENSYM = makeSymbol("SHOP-STANDARDIZER-GENSYM");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE = makeSymbol("SHOP-BASIC-PLANNER-RULE");

    public static final SubLList $list45 = list(makeSymbol("SHOP-PLANNER-RULE"));

    public static final SubLList $list46 = list(list(makeSymbol("HEAD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ASSERTION-LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-INSTANCE");



    public static final SubLList $list52 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list53 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<PLANNER RULE-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("HEAD")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");

    public static final SubLString $str55$__PLANNER_RULE__S__S_ = makeString("#<PLANNER RULE-~S:~S>");

    public static final SubLString $str56$__Malformed_Instance_ = makeString("#<Malformed Instance>");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_PRINT_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-PRINT-METHOD");



    public static final SubLList $list59 = list(list(makeSymbol("PRINT"), makeSymbol("SELF"), makeSymbol("*HTML-STREAM*"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-HTML-DISPLAY-METHOD");



    public static final SubLList $list62 = list(list(makeSymbol("RET"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("HEAD"))));

    public static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_PRED_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-PRED-METHOD");

    public static final SubLList $list65 = list(list(makeSymbol("RET"), makeSymbol("HEAD")));

    public static final SubLSymbol $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_HEAD_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-HEAD-METHOD");

    public static final SubLSymbol SET_HEAD = makeSymbol("SET-HEAD");

    public static final SubLList $list69 = list(makeSymbol("FORM"));

    public static final SubLList $list70 = list(list(makeSymbol("CSETQ"), makeSymbol("HEAD"), makeSymbol("FORM")), list(makeSymbol("RET"), makeSymbol("HEAD")));

    public static final SubLSymbol $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-SET-HEAD-METHOD");



    public static final SubLList $list74 = list(list(makeSymbol("RET"), makeSymbol("ASSERTION-LIST")));

    public static final SubLSymbol $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-ASSERTIONS-METHOD");

    public static final SubLSymbol SET_ASSERTIONS = makeSymbol("SET-ASSERTIONS");

    public static final SubLList $list78 = list(makeSymbol("ASSERTIONS"));

    public static final SubLList $list79 = list(list(makeSymbol("CSETQ"), makeSymbol("ASSERTION-LIST"), makeSymbol("ASSERTIONS")), list(makeSymbol("RET"), makeSymbol("ASSERTIONS")));

    public static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-SET-ASSERTIONS-METHOD");

    public static final SubLSymbol UNIFY_TASK_TO_HEAD = makeSymbol("UNIFY-TASK-TO-HEAD");

    public static final SubLList $list83 = list(makeSymbol("TASK"));

    public static final SubLList $list84 = list(makeString("@param TASK hl-formula-p\n   @return listp"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TASK"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-UNIFIER"), list(makeSymbol("SHOP-UNIFY"), makeSymbol("HEAD"), makeSymbol("TASK")))), list(makeSymbol("PUNLESS"), list(EQ, makeKeyword("FAIL"), makeSymbol("TASK-UNIFIER")), list(makeSymbol("RET"), makeSymbol("TASK-UNIFIER")))));

    public static final SubLSymbol $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");



    public static final SubLSymbol SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD = makeSymbol("SHOP-BASIC-PLANNER-RULE-UNIFY-TASK-TO-HEAD-METHOD");

    public static final SubLSymbol SHOP_CONDITIONAL_EFFECT = makeSymbol("SHOP-CONDITIONAL-EFFECT");

    public static final SubLList $list89 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONDITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSERTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT"), list(makeSymbol("COND"), makeSymbol("ADDS"), makeSymbol("DELETES"), makeSymbol("ASSERTION")), makeKeyword("PUBLIC")));



    public static final SubLList $list91 = list(makeSymbol("SHOP-CONDITIONAL-EFFECT"));

    public static final SubLList $list92 = list(list(makeSymbol("ADDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DELETES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONDITION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")));







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-CLASS");

    public static final SubLSymbol $sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-INSTANCE");

    public static final SubLList $list98 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<COND-EFFECT-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("HEAD")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLString $str100$__COND_EFFECT__S__S_ = makeString("#<COND-EFFECT-~S:~S>");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-PRINT-METHOD");

    public static final SubLList $list102 = list(new SubLObject[]{ list(makeSymbol("HTML-PRINC"), makeString("Condition: ")), list(makeSymbol("CB-FORM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CONDITION")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("Adds: ")), list(makeSymbol("CB-FORM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADDS")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("Deletes: ")), list(makeSymbol("CB-FORM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DELETES")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("Assertion: ")), list(makeSymbol("CB-FORM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTION-LIST")))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("RET"), NIL) });

    public static final SubLSymbol $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLString $str104$Condition__ = makeString("Condition: ");

    public static final SubLString $str105$Adds__ = makeString("Adds: ");

    public static final SubLString $str106$Deletes__ = makeString("Deletes: ");

    public static final SubLString $str107$Assertion__ = makeString("Assertion: ");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-HTML-DISPLAY-METHOD");



    public static final SubLList $list110 = list(makeSymbol("NEW-HEAD"), makeSymbol("NEW-COND"), makeSymbol("NEW-ADDS"), makeSymbol("NEW-DELETES"), makeSymbol("NEW-ASSERTION"));

    public static final SubLList $list111 = list(makeString("@param NEW-HEAD listp\n   @param NEW-COND listp\n   @param NEW-ADDS listp\n   @param NEW-DELETES listp"), list(makeSymbol("CSETQ"), makeSymbol("HEAD"), makeSymbol("NEW-HEAD")), list(makeSymbol("CSETQ"), makeSymbol("ADDS"), makeSymbol("NEW-ADDS")), list(makeSymbol("CSETQ"), makeSymbol("DELETES"), makeSymbol("NEW-DELETES")), list(makeSymbol("CSETQ"), makeSymbol("CONDITION"), makeSymbol("NEW-COND")), list(makeSymbol("CPUSH"), makeSymbol("NEW-ASSERTION"), makeSymbol("ASSERTION-LIST")), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-INIT-METHOD");

    public static final SubLList $list114 = list(list(makeSymbol("RET"), makeSymbol("ADDS")));

    public static final SubLSymbol $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-ADDS-METHOD");

    public static final SubLList $list117 = list(list(makeSymbol("RET"), makeSymbol("DELETES")));

    public static final SubLSymbol $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-DELETES-METHOD");

    public static final SubLList $list120 = list(list(makeSymbol("RET"), makeSymbol("CONDITION")));

    public static final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION-METHOD");



    public static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");

    public static final SubLSymbol SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD = makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-ASSERTION-METHOD");



    public static final SubLList $list127 = list(makeSymbol("SHOP-OPERATOR"));

    public static final SubLList $list128 = list(list(makeSymbol("ADDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DELETES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("CONDITIONAL-EFFECTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COST"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONDITIONAL-EFFECTS"), NIL, makeKeyword("PUBLIC")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-INSTANCE");

    public static final SubLList $list133 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<OPERATOR-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("HEAD")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLString $str135$__OPERATOR__S__S_ = makeString("#<OPERATOR-~S:~S>");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_PRINT_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-PRINT-METHOD");

    public static final SubLList $list137 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("ADD-LITERALS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADDS")))), list(makeSymbol("DELETE-LITERALS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DELETES")))), list(makeSymbol("COST"), list(makeSymbol("GET-SHOP-BASIC-OPERATOR-COST"), makeSymbol("SELF")))), list(makeSymbol("HTML-PRINC"), makeString("  Head:")), list(makeSymbol("CB-FORM"), makeSymbol("HEAD")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("  Add-literals: ")), list(makeSymbol("CB-FORM"), makeSymbol("ADD-LITERALS")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("  Delete-literals: ")), list(makeSymbol("CB-FORM"), makeSymbol("DELETE-LITERALS")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-FORMAT"), makeString("  Cost: ~S"), makeSymbol("COST")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("Assertion: ")), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CB-FORM")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTION-LIST")))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER) }), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLString $str139$__Head_ = makeString("  Head:");

    public static final SubLString $str140$__Add_literals__ = makeString("  Add-literals: ");

    public static final SubLString $str141$__Delete_literals__ = makeString("  Delete-literals: ");

    public static final SubLString $str142$__Cost___S = makeString("  Cost: ~S");



    public static final SubLSymbol SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-HTML-DISPLAY-METHOD");

    public static final SubLList $list145 = list(makeSymbol("NEW-ASSERTION"), makeSymbol("NEW-HEAD"), makeSymbol("NEW-ADDS"), makeSymbol("NEW-DELETES"));

    public static final SubLList $list146 = list(makeString("@param NEW-ASSERTION        assertion-p\n   @param NEW-HEAD             hl-formula-p\n   @param NEW-ADDS             listp   ;; of hl-formula-p\n   @param NEW-DELETES          listp   ;; of hl-formula-p\n   @return shop-basic-operator-p"), list(makeSymbol("CSETQ"), makeSymbol("ASSERTION-LIST"), list(makeSymbol("LIST"), makeSymbol("NEW-ASSERTION"))), list(makeSymbol("CSETQ"), makeSymbol("HEAD"), makeSymbol("NEW-HEAD")), list(makeSymbol("CSETQ"), makeSymbol("ADDS"), makeSymbol("NEW-ADDS")), list(makeSymbol("CSETQ"), makeSymbol("DELETES"), makeSymbol("NEW-DELETES")), list(makeSymbol("CSETQ"), makeSymbol("COST"), ONE_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_INIT_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-INIT-METHOD");

    public static final SubLSymbol GET_ADDS = makeSymbol("GET-ADDS");

    public static final SubLList $list150 = list(makeString("@return listp ;; of hl-formula-p"), list(makeSymbol("RET"), makeSymbol("ADDS")));

    public static final SubLSymbol $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_GET_ADDS_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-GET-ADDS-METHOD");

    public static final SubLSymbol ADD_LITERALS_TO_ADDS = makeSymbol("ADD-LITERALS-TO-ADDS");

    public static final SubLList $list154 = list(makeSymbol("LITS"));

    public static final SubLList $list155 = list(makeString("@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p"), list(makeSymbol("CSETQ"), makeSymbol("ADDS"), list(makeSymbol("UNION"), makeSymbol("ADDS"), makeSymbol("LITS"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("RET"), makeSymbol("ADDS")));

    public static final SubLSymbol $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-ADDS-METHOD");

    public static final SubLSymbol GET_DELETES = makeSymbol("GET-DELETES");

    public static final SubLList $list159 = list(makeString("@return listp ;; of hl-formula-p"), list(makeSymbol("RET"), makeSymbol("DELETES")));

    public static final SubLSymbol $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_GET_DELETES_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-GET-DELETES-METHOD");

    public static final SubLList $list162 = list(list(makeSymbol("RET"), makeSymbol("CONDITIONAL-EFFECTS")));

    public static final SubLSymbol $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS-METHOD");

    public static final SubLSymbol ADD_LITERALS_TO_DELETES = makeSymbol("ADD-LITERALS-TO-DELETES");

    public static final SubLList $list166 = list(makeString("@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p"), list(makeSymbol("CSETQ"), makeSymbol("DELETES"), list(makeSymbol("UNION"), makeSymbol("DELETES"), makeSymbol("LITS"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("RET"), makeSymbol("DELETES")));

    public static final SubLSymbol $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-DELETES-METHOD");

    public static final SubLSymbol UNIT_TEST = makeSymbol("UNIT-TEST");

    public static final SubLList $list170 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list171 = list(makeSymbol("VERBOSE?"));

    public static final SubLList $list172 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEST-OP"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-OPERATOR")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-BASIC-OPERATOR")))), list(makeSymbol("ADD-LIST-1"), list(makeSymbol("QUOTE"), list(list(makeSymbol("P"), makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("Q"), makeSymbol("?X"), makeSymbol("?Z"))))), list(makeSymbol("ADD-LIST-2"), list(makeSymbol("QUOTE"), list(list(makeSymbol("Q"), makeSymbol("?X"), makeSymbol("?Z")), list(makeSymbol("R"), makeSymbol("?W"), makeSymbol("?X"))))), list(makeSymbol("DELETE-LIST-1"), list(makeSymbol("QUOTE"), list(list(makeSymbol("P"), makeSymbol("?Y"), makeSymbol("?X"))))), list(makeSymbol("DELETE-LIST-2"), list(makeSymbol("QUOTE"), list(list(makeSymbol("Q"), makeSymbol("?Z"), makeSymbol("?W")))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-OP"), list(makeSymbol("QUOTE"), makeSymbol("ADD-LITERALS-TO-ADDS")), makeSymbol("ADD-LIST-1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-OP"), list(makeSymbol("QUOTE"), makeSymbol("ADD-LITERALS-TO-ADDS")), makeSymbol("ADD-LIST-2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-OP"), list(makeSymbol("QUOTE"), makeSymbol("ADD-LITERALS-TO-DELETES")), makeSymbol("DELETE-LIST-1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-OP"), list(makeSymbol("QUOTE"), makeSymbol("ADD-LITERALS-TO-DELETES")), makeSymbol("DELETE-LIST-2")), list(makeSymbol("CLET"), list(list(makeSymbol("OP-ADDS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-OP"), list(makeSymbol("QUOTE"), makeSymbol("GET-ADDS")))), list(makeSymbol("CONTROL-ADDS"), list(makeSymbol("UNION"), makeSymbol("ADD-LIST-1"), makeSymbol("ADD-LIST-2"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("OP-DELETES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-OP"), list(makeSymbol("QUOTE"), makeSymbol("GET-DELETES")))), list(makeSymbol("CONTROL-DELETES"), list(makeSymbol("UNION"), makeSymbol("DELETE-LIST-1"), makeSymbol("DELETE-LIST-2"), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("PWHEN"), makeSymbol("VERBOSE?"), list(makeSymbol("FORMAT"), T, makeString("op-adds ~s~%control-adds ~s~%"), makeSymbol("OP-ADDS"), makeSymbol("CONTROL-ADDS")), list(makeSymbol("FORMAT"), T, makeString("op-deletes ~s~%control-deletes ~s~%"), makeSymbol("OP-DELETES"), makeSymbol("CONTROL-DELETES"))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("SUBSETP"), makeSymbol("CONTROL-ADDS"), makeSymbol("OP-ADDS")), list(makeSymbol("SUBSETP"), makeSymbol("OP-ADDS"), makeSymbol("CONTROL-ADDS")), list(makeSymbol("SUBSETP"), makeSymbol("CONTROL-DELETES"), makeSymbol("OP-DELETES")), list(makeSymbol("SUBSETP"), makeSymbol("OP-DELETES"), makeSymbol("CONTROL-DELETES"))), list(makeSymbol("PROGN"), list(makeSymbol("PRINC"), makeString("shop-basic-operator:unit-test: --> SUCESSFUL")), list(makeSymbol("TERPRI")), list(makeSymbol("RET"), T)), list(makeSymbol("PROGN"), list(makeSymbol("PRINC"), makeString("shop-basic-operator:unit-test: --> FAILED")), list(makeSymbol("TERPRI")), list(makeSymbol("RET"), NIL))))));

    public static final SubLList $list173 = list(list(makeSymbol("P"), makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("Q"), makeSymbol("?X"), makeSymbol("?Z")));

    public static final SubLList $list174 = list(list(makeSymbol("Q"), makeSymbol("?X"), makeSymbol("?Z")), list(makeSymbol("R"), makeSymbol("?W"), makeSymbol("?X")));

    public static final SubLList $list175 = list(list(makeSymbol("P"), makeSymbol("?Y"), makeSymbol("?X")));

    public static final SubLList $list176 = list(list(makeSymbol("Q"), makeSymbol("?Z"), makeSymbol("?W")));

    public static final SubLString $str177$op_adds__s__control_adds__s__ = makeString("op-adds ~s~%control-adds ~s~%");

    public static final SubLString $str178$op_deletes__s__control_deletes__s = makeString("op-deletes ~s~%control-deletes ~s~%");

    public static final SubLString $str179$shop_basic_operator_unit_test____ = makeString("shop-basic-operator:unit-test: --> SUCESSFUL");

    public static final SubLString $str180$shop_basic_operator_unit_test____ = makeString("shop-basic-operator:unit-test: --> FAILED");

    public static final SubLSymbol SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD = makeSymbol("SHOP-BASIC-OPERATOR-UNIT-TEST-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD = makeSymbol("SHOP-BASIC-METHOD");

    public static final SubLList $list183 = list(makeSymbol("SHOP-METHOD"));

    public static final SubLList $list184 = list(list(makeSymbol("PRECONDITION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DECOMPOSITION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-INSTANCE");

    public static final SubLList $list189 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<METHOD-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("HEAD")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLString $str191$__METHOD__S__S_ = makeString("#<METHOD-~S:~S>");

    public static final SubLSymbol SHOP_BASIC_METHOD_PRINT_METHOD = makeSymbol("SHOP-BASIC-METHOD-PRINT-METHOD");

    public static final SubLList $list193 = list(new SubLObject[]{ list(makeSymbol("HTML-PRINC"), makeString("Precondition: ")), list(makeSymbol("CB-FORM"), makeSymbol("PRECONDITION")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("Decomposition: ")), list(makeSymbol("CB-FORM"), makeSymbol("DECOMPOSITION")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-FORMAT"), makeString("Assertions: ")), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CB-FORM")), makeSymbol("ASSERTION-LIST")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("RET"), NIL) });

    public static final SubLSymbol $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLString $str195$Precondition__ = makeString("Precondition: ");

    public static final SubLString $str196$Decomposition__ = makeString("Decomposition: ");

    public static final SubLString $str197$Assertions__ = makeString("Assertions: ");

    public static final SubLSymbol SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD = makeSymbol("SHOP-BASIC-METHOD-HTML-DISPLAY-METHOD");

    public static final SubLList $list199 = list(makeSymbol("NEW-ASSERTION"), makeSymbol("NEW-HEAD"), makeSymbol("NEW-PRECONDITION"), makeSymbol("NEW-DECOMPOSITION"));

    public static final SubLList $list200 = list(list(makeSymbol("CSETQ"), makeSymbol("ASSERTION-LIST"), list(makeSymbol("LIST"), makeSymbol("NEW-ASSERTION"))), list(makeSymbol("CSETQ"), makeSymbol("HEAD"), makeSymbol("NEW-HEAD")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION"), makeSymbol("NEW-PRECONDITION")), list(makeSymbol("CSETQ"), makeSymbol("DECOMPOSITION"), makeSymbol("NEW-DECOMPOSITION")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD_INIT_METHOD = makeSymbol("SHOP-BASIC-METHOD-INIT-METHOD");

    public static final SubLSymbol SET_DECOMPOSITION = makeSymbol("SET-DECOMPOSITION");

    public static final SubLList $list204 = list(makeSymbol("DECOMP"));

    public static final SubLList $list205 = list(list(makeSymbol("CSETQ"), makeSymbol("DECOMPOSITION"), makeSymbol("DECOMP")), list(makeSymbol("RET"), makeSymbol("DECOMPOSITION")));

    public static final SubLSymbol $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD = makeSymbol("SHOP-BASIC-METHOD-SET-DECOMPOSITION-METHOD");

    public static final SubLSymbol GET_DECOMPOSITION = makeSymbol("GET-DECOMPOSITION");

    public static final SubLList $list209 = list(list(makeSymbol("RET"), makeSymbol("DECOMPOSITION")));

    public static final SubLSymbol $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD = makeSymbol("SHOP-BASIC-METHOD-GET-DECOMPOSITION-METHOD");

    public static final SubLSymbol GET_PRECONDITION = makeSymbol("GET-PRECONDITION");

    public static final SubLList $list213 = list(list(makeSymbol("RET"), makeSymbol("PRECONDITION")));

    public static final SubLSymbol $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD = makeSymbol("SHOP-BASIC-METHOD-GET-PRECONDITION-METHOD");

    public static final SubLSymbol UNIFY_TASK_TO_HEAD_WITH_DATA = makeSymbol("UNIFY-TASK-TO-HEAD-WITH-DATA");

    public static final SubLList $list217 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TASK-UNIFIER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("UNIFY-TASK-TO-HEAD"), makeSymbol("SHOP-BASIC-PLANNER-RULE")), makeSymbol("SELF"), makeSymbol("TASK")))), list(makeSymbol("PWHEN"), makeSymbol("TASK-UNIFIER"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("TASK-UNIFIER"), list(makeSymbol("SHOP-APPLY-SUBSTITUTION"), makeSymbol("PRECONDITION"), makeSymbol("TASK-UNIFIER")), list(makeSymbol("SHOP-APPLY-SUBSTITUTION"), makeSymbol("DECOMPOSITION"), makeSymbol("TASK-UNIFIER")))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD = makeSymbol("SHOP-BASIC-METHOD-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD");

    public static final SubLSymbol ADD_LITERALS_TO_PRECONDITION = makeSymbol("ADD-LITERALS-TO-PRECONDITION");

    public static final SubLList $list221 = list(makeString("@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p"), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION"), list(makeSymbol("UNION"), makeSymbol("PRECONDITION"), makeSymbol("LITS"))), list(makeSymbol("RET"), makeSymbol("PRECONDITION")));

    public static final SubLSymbol $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");

    public static final SubLSymbol SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD = makeSymbol("SHOP-BASIC-METHOD-ADD-LITERALS-TO-PRECONDITION-METHOD");

    public static final SubLSymbol SHOP_BASIC_SUFFICIENCY_COND = makeSymbol("SHOP-BASIC-SUFFICIENCY-COND");

    public static final SubLList $list225 = list(makeSymbol("SHOP-SUFFICIENCY-CONDITION"));

    public static final SubLList $list226 = list(list(makeSymbol("CONDITION-FORMULA"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-CLASS");

    public static final SubLSymbol CONDITION_FORMULA = makeSymbol("CONDITION-FORMULA");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-INSTANCE");

    public static final SubLList $list230 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Shop-Scond-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PRED")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");

    public static final SubLString $str232$__Shop_Scond__S__S_ = makeString("#<Shop-Scond-~S:~S>");

    public static final SubLSymbol SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD = makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-PRINT-METHOD");

    public static final SubLList $list234 = list(list(makeSymbol("HTML-PRINC"), makeString("Condition: ")), list(makeSymbol("CB-FORM"), makeSymbol("CONDITION-FORMULA")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-PRINC"), makeString("Assertions: ")), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CB-FORM")), makeSymbol("ASSERTION-LIST")), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");

    public static final SubLSymbol SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD = makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-HTML-DISPLAY-METHOD");

    public static final SubLSymbol COND_FORMULA = makeSymbol("COND-FORMULA");

    public static final SubLList $list238 = list(list(makeSymbol("RET"), makeSymbol("CONDITION-FORMULA")));

    public static final SubLSymbol $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");

    public static final SubLSymbol SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD = makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-COND-FORMULA-METHOD");

    public static final SubLSymbol SET_COND_FORMULA = makeSymbol("SET-COND-FORMULA");

    public static final SubLList $list242 = list(list(makeSymbol("CSETQ"), makeSymbol("CONDITION-FORMULA"), makeSymbol("FORM")), list(makeSymbol("RET"), makeSymbol("CONDITION-FORMULA")));

    public static final SubLSymbol $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");

    public static final SubLSymbol SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD = makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-SET-COND-FORMULA-METHOD");

    public static final SubLList $list245 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TASK-UNIFIER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("UNIFY-TASK-TO-HEAD"), makeSymbol("SHOP-BASIC-PLANNER-RULE")), makeSymbol("SELF"), makeSymbol("TASK")))), list(makeSymbol("PWHEN"), makeSymbol("TASK-UNIFIER"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("TASK-UNIFIER"), list(makeSymbol("SHOP-APPLY-SUBSTITUTION"), makeSymbol("CONDITION-FORMULA"), makeSymbol("TASK-UNIFIER")))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");

    public static final SubLSymbol SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD = makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD");

    public static final SubLSymbol SHOP_PRECONDITION = makeSymbol("SHOP-PRECONDITION");

    public static final SubLSymbol SHOP_BASIC_PRECONDITION = makeSymbol("SHOP-BASIC-PRECONDITION");

    public static final SubLList $list250 = list(makeSymbol("SHOP-PRECONDITION"));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-INSTANCE");

    public static final SubLList $list253 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<SHOP-PRECOND-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("HEAD")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PRECONDITION-METHOD");

    public static final SubLString $str255$__SHOP_PRECOND__S__S_ = makeString("#<SHOP-PRECOND-~S:~S>");

    public static final SubLSymbol SHOP_BASIC_PRECONDITION_PRINT_METHOD = makeSymbol("SHOP-BASIC-PRECONDITION-PRINT-METHOD");



    public static final SubLList $list258 = list(makeSymbol("SHOP-PROBLEM"));

    public static final SubLList $list259 = list(list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DOMAIN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TASK-MT"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TASKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-CLASS");







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-INSTANCE");

    public static final SubLList $list267 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TASK-MT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TASKS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STATE"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_INITIALIZE_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-INITIALIZE-METHOD");

    public static final SubLSymbol INITIALIZE_PROBLEM = makeSymbol("INITIALIZE-PROBLEM");

    public static final SubLList $list271 = list(makeSymbol("NEW-NAME"), makeSymbol("NEW-DOMAIN"), makeSymbol("NEW-STATE"), makeSymbol("NEW-TASKS"), makeSymbol("NEW-MT"));

    public static final SubLList $list272 = list(list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), makeSymbol("NEW-DOMAIN")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")), list(makeSymbol("CSETQ"), makeSymbol("STATE"), makeSymbol("NEW-STATE")), list(makeSymbol("CSETQ"), makeSymbol("TASKS"), makeSymbol("NEW-TASKS")), list(makeSymbol("CSETQ"), makeSymbol("TASK-MT"), makeSymbol("NEW-MT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-INITIALIZE-PROBLEM-METHOD");

    public static final SubLList $list275 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<PROBLEM-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("NAME")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLString $str277$__PROBLEM__S__S_ = makeString("#<PROBLEM-~S:~S>");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_PRINT_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-PRINT-METHOD");



    public static final SubLList $list280 = list(makeSymbol("N"));

    public static final SubLList $list281 = list(list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("N")), list(makeSymbol("RET"), makeSymbol("N")));

    public static final SubLSymbol $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_SET_NAME_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-SET-NAME-METHOD");



    public static final SubLList $list285 = list(list(makeSymbol("RET"), makeSymbol("NAME")));

    public static final SubLSymbol $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_GET_NAME_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-GET-NAME-METHOD");

    public static final SubLSymbol SET_DOMAIN = makeSymbol("SET-DOMAIN");

    public static final SubLList $list289 = list(makeSymbol("D"));

    public static final SubLList $list290 = list(list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), makeSymbol("D")), list(makeSymbol("RET"), makeSymbol("D")));

    public static final SubLSymbol $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-SET-DOMAIN-METHOD");



    public static final SubLList $list294 = list(list(makeSymbol("RET"), makeSymbol("DOMAIN")));

    public static final SubLSymbol $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-GET-DOMAIN-METHOD");

    public static final SubLSymbol GET_METHODS = makeSymbol("GET-METHODS");

    public static final SubLList $list298 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DOMAIN"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SELF")))), list(makeSymbol("RET"), list(makeSymbol("GET-SLOT"), makeSymbol("DOMAIN"), list(makeSymbol("QUOTE"), makeSymbol("METHODS"))))));

    public static final SubLSymbol $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");



    public static final SubLSymbol SHOP_BASIC_PROBLEM_GET_METHODS_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-GET-METHODS-METHOD");

    public static final SubLSymbol GET_OPERATORS = makeSymbol("GET-OPERATORS");

    public static final SubLList $list303 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DOMAIN"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SELF")))), list(makeSymbol("RET"), list(makeSymbol("GET-SLOT"), makeSymbol("DOMAIN"), list(makeSymbol("QUOTE"), makeSymbol("OPERATORS"))))));

    public static final SubLSymbol $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");



    public static final SubLSymbol SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-GET-OPERATORS-METHOD");

    public static final SubLSymbol GET_TASKS = makeSymbol("GET-TASKS");

    public static final SubLList $list308 = list(list(makeSymbol("RET"), makeSymbol("TASKS")));

    public static final SubLSymbol $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_GET_TASKS_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-GET-TASKS-METHOD");

    public static final SubLSymbol SET_TASKS = makeSymbol("SET-TASKS");

    public static final SubLList $list312 = list(makeSymbol("TS"));

    public static final SubLList $list313 = list(list(makeSymbol("CSETQ"), makeSymbol("TASKS"), makeSymbol("TS")), list(makeSymbol("RET"), makeSymbol("TS")));

    public static final SubLSymbol $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_SET_TASKS_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-SET-TASKS-METHOD");

    public static final SubLSymbol GET_STATE = makeSymbol("GET-STATE");

    public static final SubLList $list317 = list(list(makeSymbol("RET"), makeSymbol("STATE")));

    public static final SubLSymbol $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_GET_STATE_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-GET-STATE-METHOD");

    public static final SubLSymbol SET_STATE = makeSymbol("SET-STATE");

    public static final SubLList $list321 = list(makeSymbol("S"));

    public static final SubLList $list322 = list(list(makeSymbol("RET"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("STATE")), makeSymbol("S"))));

    public static final SubLSymbol $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");

    public static final SubLSymbol SHOP_BASIC_PROBLEM_SET_STATE_METHOD = makeSymbol("SHOP-BASIC-PROBLEM-SET-STATE-METHOD");

    public static final SubLString $$$SHOP_Category = makeString("SHOP Category");

    public static final SubLString $$$SHOP = makeString("SHOP");

    public static final SubLList $list327 = list(makeString("SHOP Category"));

    public static SubLObject get_shop_indexed_object_instance_index(final SubLObject shop_indexed_object) {
        final SubLObject v_class = (shop_indexed_object.isSymbol()) ? classes.classes_retrieve_class(shop_indexed_object) : NIL != subloop_structures.class_p(shop_indexed_object) ? shop_indexed_object : NIL != subloop_structures.instance_p(shop_indexed_object) ? subloop_structures.instance_class(shop_indexed_object) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(INSTANCE_INDEX, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_shop_indexed_object_instance_index(final SubLObject shop_indexed_object, final SubLObject value) {
        final SubLObject v_class = (shop_indexed_object.isSymbol()) ? classes.classes_retrieve_class(shop_indexed_object) : NIL != subloop_structures.class_p(shop_indexed_object) ? shop_indexed_object : NIL != subloop_structures.instance_p(shop_indexed_object) ? subloop_structures.instance_class(shop_indexed_object) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(INSTANCE_INDEX, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_indexed_object_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_indexed_object_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject shop_indexed_object_p(final SubLObject shop_indexed_object) {
        return classes.subloop_instanceof_class(shop_indexed_object, SHOP_INDEXED_OBJECT);
    }

    public static SubLObject shop_indexed_object_find_instance_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_indexed_object_method = NIL;
        final SubLObject instance_index = get_shop_indexed_object_instance_index(self);
        try {
            thread.throwStack.push($sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD);
            try {
                sublisp_throw($sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD, dictionary.dictionary_lookup(instance_index, id, NIL));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_indexed_object_instance_index(self, instance_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_indexed_object_method = Errors.handleThrowable(ccatch_env_var, $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_indexed_object_method;
    }

    public static SubLObject shop_indexed_object_add_to_index_method(final SubLObject self) {
        final SubLObject instance_number = object.get_object_instance_number(self);
        SubLObject instance_index = get_shop_indexed_object_instance_index(self);
        if (NIL == instance_index) {
            set_shop_indexed_object_instance_index(self, dictionary.new_dictionary(symbol_function(EQ), TEN_INTEGER));
            instance_index = get_shop_indexed_object_instance_index(self);
        }
        dictionary.dictionary_enter(instance_index, instance_number, self);
        return NIL;
    }

    public static SubLObject shop_indexed_object_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        object.object_initialize_method(self);
        if (NIL != shop_parameters.$shop_object_indexingP$.getDynamicValue(thread)) {
            shop_indexed_object_add_to_index_method(self);
        }
        return self;
    }

    public static SubLObject shop_problem_p(final SubLObject shop_problem) {
        return interfaces.subloop_instanceof_interface(shop_problem, SHOP_PROBLEM);
    }

    public static SubLObject shop_planner_rule_p(final SubLObject shop_planner_rule) {
        return interfaces.subloop_instanceof_interface(shop_planner_rule, SHOP_PLANNER_RULE);
    }

    public static SubLObject shop_operator_p(final SubLObject shop_operator) {
        return interfaces.subloop_instanceof_interface(shop_operator, SHOP_OPERATOR);
    }

    public static SubLObject shop_sufficiency_condition_p(final SubLObject shop_sufficiency_condition) {
        return interfaces.subloop_instanceof_interface(shop_sufficiency_condition, SHOP_SUFFICIENCY_CONDITION);
    }

    public static SubLObject shop_method_p(final SubLObject shop_method) {
        return interfaces.subloop_instanceof_interface(shop_method, SHOP_METHOD);
    }

    public static SubLObject shop_my_union(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject set1 = NIL;
        SubLObject set2 = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        set1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        set2 = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list34);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list34);
            if (NIL == member(current_$1, $list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list34);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : $list38;
        return list(SHOP_MY_UNION_FUNC, set1, set2, test);
    }

    public static SubLObject shop_my_union_func(final SubLObject set1, SubLObject set2, final SubLObject test) {
        SubLObject cdolist_list_var = set1;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = x;
            if (NIL == member(item_var, set2, test, symbol_function(IDENTITY))) {
                set2 = cons(item_var, set2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return set2;
    }

    public static SubLObject shop_same_set_p(final SubLObject x, final SubLObject y) {
        return makeBoolean((NIL != subsetp(x, y, symbol_function(EQUAL), UNPROVIDED)) && (NIL != subsetp(y, x, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static SubLObject shop_variablep(final SubLObject x) {
        return makeBoolean((NIL != variables.variable_p(x)) || (NIL != cycl_grammar.el_variable_p(x)));
    }

    public static SubLObject shop_extract_variables(final SubLObject expr) {
        if (NIL != shop_variablep(expr)) {
            return list(expr);
        }
        if (expr.isCons()) {
            return shop_my_union_func(shop_extract_variables(expr.first()), shop_extract_variables(expr.rest()), symbol_function(EQL));
        }
        return NIL;
    }

    public static SubLObject shop_empty_bindingP(final SubLObject v_bindings) {
        return eq(v_bindings, $shop_empty_unifier$.getGlobalValue());
    }

    public static SubLObject shop_unify_failedP(final SubLObject v_bindings) {
        return eq(v_bindings, $shop_unify_failed$.getGlobalValue());
    }

    public static SubLObject shop_apply_substitution(final SubLObject target, final SubLObject a_list) {
        if (NIL == a_list) {
            return target;
        }
        if (NIL == target) {
            return NIL;
        }
        if (NIL != shop_variablep(target)) {
            final SubLObject result = assoc(target, a_list, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                return result.rest();
            }
            return target;
        } else {
            if (target.isAtom()) {
                return target;
            }
            return cons(shop_apply_substitution(target.first(), a_list), shop_apply_substitution(target.rest(), a_list));
        }
    }

    public static SubLObject shop_compose_substitutions_test(final SubLObject x, final SubLObject y) {
        return equal(x.first(), y.first());
    }

    public static SubLObject shop_compose_substitutions(SubLObject sub1, final SubLObject sub2) {
        SubLObject cdolist_list_var = sub1;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rplacd(pair, shop_apply_substitution(pair.rest(), sub2));
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        cdolist_list_var = sub2;
        pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = pair;
            if (NIL == member(item_var, sub1, symbol_function(SHOP_COMPOSE_SUBSTITUTIONS_TEST), symbol_function(IDENTITY))) {
                sub1 = cons(item_var, sub1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return sub1;
    }

    public static SubLObject shop_unify(final SubLObject e1, final SubLObject e2) {
        if (NIL != shop_variablep(e1)) {
            if (e1.eql(e2)) {
                return NIL;
            }
            return NIL != shop_occurs(e1, e2) ? $shop_unify_failed$.getGlobalValue() : list(cons(e1, e2));
        } else {
            if ((NIL != nart_handles.nart_p(e1)) || (NIL != nart_handles.nart_p(e2))) {
                final SubLObject form1 = (NIL != nart_handles.nart_p(e1)) ? narts_high.nart_el_formula(e1) : e1;
                final SubLObject form2 = (NIL != nart_handles.nart_p(e2)) ? narts_high.nart_el_formula(e2) : e2;
                return shop_unify(form1, form2);
            }
            if (e1.isAtom()) {
                if (e1.equal(e2)) {
                    return NIL;
                }
                if (NIL != shop_variablep(e2)) {
                    return list(cons(e2, e1));
                }
                return $shop_unify_failed$.getGlobalValue();
            } else {
                if (NIL == e2) {
                    return $shop_unify_failed$.getGlobalValue();
                }
                if (!e2.isCons()) {
                    return $shop_unify_failed$.getGlobalValue();
                }
                final SubLObject first_e1 = e1.first();
                final SubLObject first_e2 = (e2.isCons()) ? e2.first() : NIL;
                SubLObject hsub = NIL;
                hsub = ((NIL != first_e1) || (NIL != first_e2)) ? shop_unify(first_e1, first_e2) : NIL;
                if (NIL != shop_unify_failedP(hsub)) {
                    return $shop_unify_failed$.getGlobalValue();
                }
                final SubLObject tail1 = shop_apply_substitution(e1.rest(), hsub);
                final SubLObject tail2 = shop_apply_substitution(e2.rest(), hsub);
                SubLObject tsub = NIL;
                tsub = ((NIL != tail1) || (NIL != tail2)) ? shop_unify(tail1, tail2) : NIL;
                if (NIL != shop_unify_failedP(tsub)) {
                    return $shop_unify_failed$.getGlobalValue();
                }
                return shop_compose_substitutions(hsub, tsub);
            }
        }
    }

    public static SubLObject shop_occurs(final SubLObject v, final SubLObject expr) {
        return expr.isAtom() ? eq(v, expr) : makeBoolean((NIL != shop_occurs(v, expr.first())) || (NIL != shop_occurs(v, expr.rest())));
    }

    public static SubLObject shop_standardizer_gensym(final SubLObject x) {
        return cons(x, gensym($str42$_));
    }

    public static SubLObject shop_standardizer(final SubLObject expression) {
        return Mapping.mapcar(symbol_function(SHOP_STANDARDIZER_GENSYM), shop_extract_variables(expression));
    }

    public static SubLObject shop_spec_formulaP(final SubLObject spec_form, final SubLObject form) {
        final SubLObject mgu = shop_unify(spec_form, form);
        if (mgu == $FAIL) {
            return NIL;
        }
        final SubLObject new_genl_form = shop_apply_substitution(form, mgu);
        if (new_genl_form.equal(spec_form)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject get_shop_basic_planner_rule_assertion_list(final SubLObject shop_basic_planner_rule) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_planner_rule, TWO_INTEGER, ASSERTION_LIST);
    }

    public static SubLObject set_shop_basic_planner_rule_assertion_list(final SubLObject shop_basic_planner_rule, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_planner_rule, value, TWO_INTEGER, ASSERTION_LIST);
    }

    public static SubLObject get_shop_basic_planner_rule_head(final SubLObject shop_basic_planner_rule) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_planner_rule, ONE_INTEGER, HEAD);
    }

    public static SubLObject set_shop_basic_planner_rule_head(final SubLObject shop_basic_planner_rule, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_planner_rule, value, ONE_INTEGER, HEAD);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_planner_rule_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_planner_rule_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, HEAD, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, ASSERTION_LIST, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_planner_rule_p(final SubLObject shop_basic_planner_rule) {
        return classes.subloop_instanceof_class(shop_basic_planner_rule, SHOP_BASIC_PLANNER_RULE);
    }

    public static SubLObject shop_basic_planner_rule_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str55$__PLANNER_RULE__S__S_, instance_number, head);
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_basic_planner_rule_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        shop_basic_planner_rule_print_method(self, html_macros.$html_stream$.getDynamicValue(thread), NIL);
        return self;
    }

    public static SubLObject shop_basic_planner_rule_pred_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                sublisp_throw($sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, cycl_utilities.formula_operator(head));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_basic_planner_rule_head_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                sublisp_throw($sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, head);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_basic_planner_rule_set_head_method(final SubLObject self, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                head = form;
                sublisp_throw($sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, head);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_basic_planner_rule_assertions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push($sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                sublisp_throw($sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, assertion_list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_basic_planner_rule_set_assertions_method(final SubLObject self, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                assertion_list = assertions;
                sublisp_throw($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, assertions);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_basic_planner_rule_unify_task_to_head_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                assert NIL != listp(task) : "Types.listp(task) " + "CommonSymbols.NIL != Types.listp(task) " + task;
                final SubLObject task_unifier = shop_unify(head, task);
                if ($FAIL != task_unifier) {
                    sublisp_throw($sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, task_unifier);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }

    public static SubLObject shop_conditional_effect_p(final SubLObject shop_conditional_effect) {
        return interfaces.subloop_instanceof_interface(shop_conditional_effect, SHOP_CONDITIONAL_EFFECT);
    }

    public static SubLObject get_shop_basic_conditional_effect_condition(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_conditional_effect, FIVE_INTEGER, CONDITION);
    }

    public static SubLObject set_shop_basic_conditional_effect_condition(final SubLObject shop_basic_conditional_effect, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_conditional_effect, value, FIVE_INTEGER, CONDITION);
    }

    public static SubLObject get_shop_basic_conditional_effect_deletes(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_conditional_effect, FOUR_INTEGER, DELETES);
    }

    public static SubLObject set_shop_basic_conditional_effect_deletes(final SubLObject shop_basic_conditional_effect, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_conditional_effect, value, FOUR_INTEGER, DELETES);
    }

    public static SubLObject get_shop_basic_conditional_effect_adds(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_conditional_effect, THREE_INTEGER, ADDS);
    }

    public static SubLObject set_shop_basic_conditional_effect_adds(final SubLObject shop_basic_conditional_effect, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_conditional_effect, value, THREE_INTEGER, ADDS);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_conditional_effect_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_conditional_effect_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, HEAD, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, ASSERTION_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_CONDITIONAL_EFFECT, ADDS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_CONDITIONAL_EFFECT, DELETES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_CONDITIONAL_EFFECT, CONDITION, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_conditional_effect_p(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_instanceof_class(shop_basic_conditional_effect, SHOP_BASIC_CONDITIONAL_EFFECT);
    }

    public static SubLObject shop_basic_conditional_effect_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str100$__COND_EFFECT__S__S_, instance_number, head);
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject shop_basic_conditional_effect_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        final SubLObject condition = get_shop_basic_conditional_effect_condition(self);
        final SubLObject deletes = get_shop_basic_conditional_effect_deletes(self);
        final SubLObject adds = get_shop_basic_conditional_effect_adds(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push($sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                html_princ($str104$Condition__);
                cb_form(instances.get_slot(self, CONDITION), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str105$Adds__);
                cb_form(instances.get_slot(self, ADDS), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str106$Deletes__);
                cb_form(instances.get_slot(self, DELETES), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str107$Assertion__);
                cb_form(instances.get_slot(self, ASSERTION_LIST), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                sublisp_throw($sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_conditional_effect_condition(self, condition);
                    set_shop_basic_conditional_effect_deletes(self, deletes);
                    set_shop_basic_conditional_effect_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject shop_basic_conditional_effect_init_method(final SubLObject self, final SubLObject new_head, final SubLObject new_cond, final SubLObject new_adds, final SubLObject new_deletes, final SubLObject new_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        SubLObject condition = get_shop_basic_conditional_effect_condition(self);
        SubLObject deletes = get_shop_basic_conditional_effect_deletes(self);
        SubLObject adds = get_shop_basic_conditional_effect_adds(self);
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                head = new_head;
                adds = new_adds;
                deletes = new_deletes;
                condition = new_cond;
                assertion_list = cons(new_assertion, assertion_list);
                sublisp_throw($sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_conditional_effect_condition(self, condition);
                    set_shop_basic_conditional_effect_deletes(self, deletes);
                    set_shop_basic_conditional_effect_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject shop_basic_conditional_effect_adds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        final SubLObject adds = get_shop_basic_conditional_effect_adds(self);
        try {
            thread.throwStack.push($sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                sublisp_throw($sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, adds);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_conditional_effect_adds(self, adds);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject shop_basic_conditional_effect_deletes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        final SubLObject deletes = get_shop_basic_conditional_effect_deletes(self);
        try {
            thread.throwStack.push($sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                sublisp_throw($sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, deletes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_conditional_effect_deletes(self, deletes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject shop_basic_conditional_effect_condition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        final SubLObject condition = get_shop_basic_conditional_effect_condition(self);
        try {
            thread.throwStack.push($sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                sublisp_throw($sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, condition);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_conditional_effect_condition(self, condition);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject shop_basic_conditional_effect_assertion_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push($sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                sublisp_throw($sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, assertion_list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }

    public static SubLObject get_shop_basic_operator_cost(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, SIX_INTEGER, COST);
    }

    public static SubLObject set_shop_basic_operator_cost(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, SIX_INTEGER, COST);
    }

    public static SubLObject get_shop_basic_operator_conditional_effects(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, FIVE_INTEGER, CONDITIONAL_EFFECTS);
    }

    public static SubLObject set_shop_basic_operator_conditional_effects(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, FIVE_INTEGER, CONDITIONAL_EFFECTS);
    }

    public static SubLObject get_shop_basic_operator_deletes(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, FOUR_INTEGER, DELETES);
    }

    public static SubLObject set_shop_basic_operator_deletes(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, FOUR_INTEGER, DELETES);
    }

    public static SubLObject get_shop_basic_operator_adds(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, THREE_INTEGER, ADDS);
    }

    public static SubLObject set_shop_basic_operator_adds(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, THREE_INTEGER, ADDS);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_operator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_operator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, HEAD, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, ASSERTION_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_OPERATOR, ADDS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_OPERATOR, DELETES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_OPERATOR, CONDITIONAL_EFFECTS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_OPERATOR, COST, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_operator_p(final SubLObject shop_basic_operator) {
        return classes.subloop_instanceof_class(shop_basic_operator, SHOP_BASIC_OPERATOR);
    }

    public static SubLObject shop_basic_operator_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str135$__OPERATOR__S__S_, instance_number, head);
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        final SubLObject cost = get_shop_basic_operator_cost(self);
        final SubLObject deletes = get_shop_basic_operator_deletes(self);
        final SubLObject adds = get_shop_basic_operator_adds(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                final SubLObject add_literals = instances.get_slot(self, ADDS);
                final SubLObject delete_literals = instances.get_slot(self, DELETES);
                final SubLObject cost_$2 = get_shop_basic_operator_cost(self);
                html_princ($str139$__Head_);
                cb_form(head, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str140$__Add_literals__);
                cb_form(add_literals, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str141$__Delete_literals__);
                cb_form(delete_literals, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str142$__Cost___S, cost_$2);
                html_newline(UNPROVIDED);
                html_princ($str107$Assertion__);
                Mapping.mapcar(CB_FORM, instances.get_slot(self, ASSERTION_LIST));
                html_newline(TWO_INTEGER);
                sublisp_throw($sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_cost(self, cost);
                    set_shop_basic_operator_deletes(self, deletes);
                    set_shop_basic_operator_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_init_method(final SubLObject self, final SubLObject new_assertion, final SubLObject new_head, final SubLObject new_adds, final SubLObject new_deletes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        SubLObject cost = get_shop_basic_operator_cost(self);
        SubLObject deletes = get_shop_basic_operator_deletes(self);
        SubLObject adds = get_shop_basic_operator_adds(self);
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                assertion_list = list(new_assertion);
                head = new_head;
                adds = new_adds;
                deletes = new_deletes;
                cost = ONE_INTEGER;
                sublisp_throw($sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_cost(self, cost);
                    set_shop_basic_operator_deletes(self, deletes);
                    set_shop_basic_operator_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_get_adds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        final SubLObject adds = get_shop_basic_operator_adds(self);
        try {
            thread.throwStack.push($sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                sublisp_throw($sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, adds);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_adds(self, adds);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_add_literals_to_adds_method(final SubLObject self, final SubLObject lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        SubLObject adds = get_shop_basic_operator_adds(self);
        try {
            thread.throwStack.push($sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                adds = union(adds, lits, symbol_function(EQUAL), UNPROVIDED);
                sublisp_throw($sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, adds);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_adds(self, adds);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_get_deletes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        final SubLObject deletes = get_shop_basic_operator_deletes(self);
        try {
            thread.throwStack.push($sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                sublisp_throw($sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, deletes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_deletes(self, deletes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_conditional_effects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        final SubLObject conditional_effects = get_shop_basic_operator_conditional_effects(self);
        try {
            thread.throwStack.push($sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                sublisp_throw($sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, conditional_effects);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_conditional_effects(self, conditional_effects);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_add_literals_to_deletes_method(final SubLObject self, final SubLObject lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = NIL;
        SubLObject deletes = get_shop_basic_operator_deletes(self);
        try {
            thread.throwStack.push($sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                deletes = union(deletes, lits, symbol_function(EQUAL), UNPROVIDED);
                sublisp_throw($sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, deletes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_operator_deletes(self, deletes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }

    public static SubLObject shop_basic_operator_unit_test_method(final SubLObject self, final SubLObject verboseP) {
        final SubLObject test_op = object.object_new_method(SHOP_BASIC_OPERATOR);
        final SubLObject add_list_1 = $list173;
        final SubLObject add_list_2 = $list174;
        final SubLObject delete_list_1 = $list175;
        final SubLObject delete_list_2 = $list176;
        methods.funcall_instance_method_with_1_args(test_op, ADD_LITERALS_TO_ADDS, add_list_1);
        methods.funcall_instance_method_with_1_args(test_op, ADD_LITERALS_TO_ADDS, add_list_2);
        methods.funcall_instance_method_with_1_args(test_op, ADD_LITERALS_TO_DELETES, delete_list_1);
        methods.funcall_instance_method_with_1_args(test_op, ADD_LITERALS_TO_DELETES, delete_list_2);
        final SubLObject op_adds = methods.funcall_instance_method_with_0_args(test_op, GET_ADDS);
        final SubLObject control_adds = union(add_list_1, add_list_2, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject op_deletes = methods.funcall_instance_method_with_0_args(test_op, GET_DELETES);
        final SubLObject control_deletes = union(delete_list_1, delete_list_2, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != verboseP) {
            format(T, $str177$op_adds__s__control_adds__s__, op_adds, control_adds);
            format(T, $str178$op_deletes__s__control_deletes__s, op_deletes, control_deletes);
        }
        if ((((NIL != subsetp(control_adds, op_adds, UNPROVIDED, UNPROVIDED)) && (NIL != subsetp(op_adds, control_adds, UNPROVIDED, UNPROVIDED))) && (NIL != subsetp(control_deletes, op_deletes, UNPROVIDED, UNPROVIDED))) && (NIL != subsetp(op_deletes, control_deletes, UNPROVIDED, UNPROVIDED))) {
            princ($str179$shop_basic_operator_unit_test____, UNPROVIDED);
            terpri(UNPROVIDED);
            return T;
        }
        princ($str180$shop_basic_operator_unit_test____, UNPROVIDED);
        terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_shop_basic_method_decomposition(final SubLObject shop_basic_method) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_method, FOUR_INTEGER, DECOMPOSITION);
    }

    public static SubLObject set_shop_basic_method_decomposition(final SubLObject shop_basic_method, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_method, value, FOUR_INTEGER, DECOMPOSITION);
    }

    public static SubLObject get_shop_basic_method_precondition(final SubLObject shop_basic_method) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_method, THREE_INTEGER, PRECONDITION);
    }

    public static SubLObject set_shop_basic_method_precondition(final SubLObject shop_basic_method, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_method, value, THREE_INTEGER, PRECONDITION);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_method_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_method_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, HEAD, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, ASSERTION_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_METHOD, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_METHOD, DECOMPOSITION, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_method_p(final SubLObject shop_basic_method) {
        return classes.subloop_instanceof_class(shop_basic_method, SHOP_BASIC_METHOD);
    }

    public static SubLObject shop_basic_method_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str191$__METHOD__S__S_, instance_number, head);
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        final SubLObject decomposition = get_shop_basic_method_decomposition(self);
        final SubLObject precondition = get_shop_basic_method_precondition(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push($sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                html_princ($str195$Precondition__);
                cb_form(precondition, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str196$Decomposition__);
                cb_form(decomposition, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str197$Assertions__);
                Mapping.mapcar(CB_FORM, assertion_list);
                html_newline(TWO_INTEGER);
                sublisp_throw($sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    set_shop_basic_method_precondition(self, precondition);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_init_method(final SubLObject self, final SubLObject new_assertion, final SubLObject new_head, final SubLObject new_precondition, final SubLObject new_decomposition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        SubLObject decomposition = get_shop_basic_method_decomposition(self);
        SubLObject precondition = get_shop_basic_method_precondition(self);
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push($sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                assertion_list = list(new_assertion);
                head = new_head;
                precondition = new_precondition;
                decomposition = new_decomposition;
                sublisp_throw($sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    set_shop_basic_method_precondition(self, precondition);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_set_decomposition_method(final SubLObject self, final SubLObject decomp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        SubLObject decomposition = get_shop_basic_method_decomposition(self);
        try {
            thread.throwStack.push($sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                decomposition = decomp;
                sublisp_throw($sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, decomposition);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_get_decomposition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        final SubLObject decomposition = get_shop_basic_method_decomposition(self);
        try {
            thread.throwStack.push($sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                sublisp_throw($sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, decomposition);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_get_precondition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        final SubLObject precondition = get_shop_basic_method_precondition(self);
        try {
            thread.throwStack.push($sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                sublisp_throw($sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, precondition);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_precondition(self, precondition);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_unify_task_to_head_with_data_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        final SubLObject decomposition = get_shop_basic_method_decomposition(self);
        final SubLObject precondition = get_shop_basic_method_precondition(self);
        try {
            thread.throwStack.push($sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                final SubLObject task_unifier = shop_basic_planner_rule_unify_task_to_head_method(self, task);
                if (NIL != task_unifier) {
                    sublisp_throw($sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, list(task_unifier, shop_apply_substitution(precondition, task_unifier), shop_apply_substitution(decomposition, task_unifier)));
                }
                sublisp_throw($sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    set_shop_basic_method_precondition(self, precondition);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject shop_basic_method_add_literals_to_precondition_method(final SubLObject self, final SubLObject lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = NIL;
        SubLObject precondition = get_shop_basic_method_precondition(self);
        try {
            thread.throwStack.push($sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                precondition = union(precondition, lits, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, precondition);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_method_precondition(self, precondition);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }

    public static SubLObject get_shop_basic_sufficiency_cond_condition_formula(final SubLObject shop_basic_sufficiency_cond) {
        return classes.subloop_get_instance_slot(shop_basic_sufficiency_cond, THREE_INTEGER);
    }

    public static SubLObject set_shop_basic_sufficiency_cond_condition_formula(final SubLObject shop_basic_sufficiency_cond, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_sufficiency_cond, value, THREE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_sufficiency_cond_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_sufficiency_cond_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, HEAD, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, ASSERTION_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_SUFFICIENCY_COND, CONDITION_FORMULA, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_sufficiency_cond_p(final SubLObject shop_basic_sufficiency_cond) {
        return classes.subloop_instanceof_class(shop_basic_sufficiency_cond, SHOP_BASIC_SUFFICIENCY_COND);
    }

    public static SubLObject shop_basic_sufficiency_cond_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str232$__Shop_Scond__S__S_, instance_number, methods.funcall_instance_method_with_0_args(self, PRED));
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }

    public static SubLObject shop_basic_sufficiency_cond_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
        final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push($sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                html_princ($str104$Condition__);
                cb_form(condition_formula, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str197$Assertions__);
                Mapping.mapcar(CB_FORM, assertion_list);
                html_newline(TWO_INTEGER);
                sublisp_throw($sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }

    public static SubLObject shop_basic_sufficiency_cond_cond_formula_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
        final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        try {
            thread.throwStack.push($sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                sublisp_throw($sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, condition_formula);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }

    public static SubLObject shop_basic_sufficiency_cond_set_cond_formula_method(final SubLObject self, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
        SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        try {
            thread.throwStack.push($sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                condition_formula = form;
                sublisp_throw($sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, condition_formula);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }

    public static SubLObject shop_basic_sufficiency_cond_unify_task_to_head_with_data_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
        final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        try {
            thread.throwStack.push($sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                final SubLObject task_unifier = shop_basic_planner_rule_unify_task_to_head_method(self, task);
                if (NIL != task_unifier) {
                    sublisp_throw($sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, list(task_unifier, shop_apply_substitution(condition_formula, task_unifier)));
                }
                sublisp_throw($sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }

    public static SubLObject shop_precondition_p(final SubLObject shop_precondition) {
        return interfaces.subloop_instanceof_interface(shop_precondition, SHOP_PRECONDITION);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_precondition_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_precondition_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, HEAD, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_RULE, ASSERTION_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_METHOD, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_METHOD, DECOMPOSITION, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_precondition_p(final SubLObject shop_basic_precondition) {
        return classes.subloop_instanceof_class(shop_basic_precondition, SHOP_BASIC_PRECONDITION);
    }

    public static SubLObject shop_basic_precondition_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_precondition_method = NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str255$__SHOP_PRECOND__S__S_, instance_number, head);
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_precondition_method = Errors.handleThrowable(ccatch_env_var, $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_precondition_method;
    }

    public static SubLObject get_shop_basic_problem_state(final SubLObject shop_basic_problem) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_problem, FIVE_INTEGER, STATE);
    }

    public static SubLObject set_shop_basic_problem_state(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_problem, value, FIVE_INTEGER, STATE);
    }

    public static SubLObject get_shop_basic_problem_tasks(final SubLObject shop_basic_problem) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_problem, FOUR_INTEGER, TASKS);
    }

    public static SubLObject set_shop_basic_problem_tasks(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_problem, value, FOUR_INTEGER, TASKS);
    }

    public static SubLObject get_shop_basic_problem_task_mt(final SubLObject shop_basic_problem) {
        return classes.subloop_get_instance_slot(shop_basic_problem, THREE_INTEGER);
    }

    public static SubLObject set_shop_basic_problem_task_mt(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_problem, value, THREE_INTEGER);
    }

    public static SubLObject get_shop_basic_problem_domain(final SubLObject shop_basic_problem) {
        return classes.subloop_get_instance_slot(shop_basic_problem, TWO_INTEGER);
    }

    public static SubLObject set_shop_basic_problem_domain(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_problem, value, TWO_INTEGER);
    }

    public static SubLObject get_shop_basic_problem_name(final SubLObject shop_basic_problem) {
        return classes.subloop_get_instance_slot(shop_basic_problem, ONE_INTEGER);
    }

    public static SubLObject set_shop_basic_problem_name(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_problem, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_problem_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_problem_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PROBLEM, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PROBLEM, DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PROBLEM, TASK_MT, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PROBLEM, TASKS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PROBLEM, STATE, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_problem_p(final SubLObject shop_basic_problem) {
        return classes.subloop_instanceof_class(shop_basic_problem, SHOP_BASIC_PROBLEM);
    }

    public static SubLObject shop_basic_problem_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        SubLObject state = get_shop_basic_problem_state(self);
        SubLObject tasks = get_shop_basic_problem_tasks(self);
        SubLObject task_mt = get_shop_basic_problem_task_mt(self);
        SubLObject domain = get_shop_basic_problem_domain(self);
        SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push($sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                object.object_initialize_method(self);
                name = NIL;
                domain = NIL;
                task_mt = NIL;
                tasks = NIL;
                state = NIL;
                sublisp_throw($sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    set_shop_basic_problem_tasks(self, tasks);
                    set_shop_basic_problem_task_mt(self, task_mt);
                    set_shop_basic_problem_domain(self, domain);
                    set_shop_basic_problem_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_initialize_problem_method(final SubLObject self, final SubLObject new_name, final SubLObject new_domain, final SubLObject new_state, final SubLObject new_tasks, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        SubLObject state = get_shop_basic_problem_state(self);
        SubLObject tasks = get_shop_basic_problem_tasks(self);
        SubLObject task_mt = get_shop_basic_problem_task_mt(self);
        SubLObject domain = get_shop_basic_problem_domain(self);
        SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push($sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                domain = new_domain;
                name = new_name;
                state = new_state;
                tasks = new_tasks;
                task_mt = new_mt;
                sublisp_throw($sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    set_shop_basic_problem_tasks(self, tasks);
                    set_shop_basic_problem_task_mt(self, task_mt);
                    set_shop_basic_problem_domain(self, domain);
                    set_shop_basic_problem_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject name = get_shop_basic_problem_name(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str277$__PROBLEM__S__S_, instance_number, name);
                } else {
                    format(stream, $str56$__Malformed_Instance_);
                }
                sublisp_throw($sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_name(self, name);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_set_name_method(final SubLObject self, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push($sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                name = n;
                sublisp_throw($sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, n);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_get_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push($sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                sublisp_throw($sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, name);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_set_domain_method(final SubLObject self, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push($sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                domain = d;
                sublisp_throw($sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, d);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_get_domain_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push($sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                sublisp_throw($sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, domain);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_get_methods_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push($sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                final SubLObject domain_$3 = shop_basic_problem_get_domain_method(self);
                sublisp_throw($sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.get_slot(domain_$3, METHODS));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_get_operators_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push($sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                final SubLObject domain_$4 = shop_basic_problem_get_domain_method(self);
                sublisp_throw($sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.get_slot(domain_$4, OPERATORS));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_get_tasks_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject tasks = get_shop_basic_problem_tasks(self);
        try {
            thread.throwStack.push($sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                sublisp_throw($sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, tasks);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_tasks(self, tasks);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_set_tasks_method(final SubLObject self, final SubLObject ts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        SubLObject tasks = get_shop_basic_problem_tasks(self);
        try {
            thread.throwStack.push($sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                tasks = ts;
                sublisp_throw($sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, ts);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_tasks(self, tasks);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_get_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject state = get_shop_basic_problem_state(self);
        try {
            thread.throwStack.push($sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                sublisp_throw($sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject shop_basic_problem_set_state_method(final SubLObject self, final SubLObject s) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = NIL;
        final SubLObject state = get_shop_basic_problem_state(self);
        try {
            thread.throwStack.push($sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                sublisp_throw($sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.set_slot(self, STATE, s));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }

    public static SubLObject declare_shop_datastructures_file() {
        declareFunction(me, "get_shop_indexed_object_instance_index", "GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX", 1, 0, false);
        declareFunction(me, "set_shop_indexed_object_instance_index", "SET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_indexed_object_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_indexed_object_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_indexed_object_p", "SHOP-INDEXED-OBJECT-P", 1, 0, false);
        declareFunction(me, "shop_indexed_object_find_instance_method", "SHOP-INDEXED-OBJECT-FIND-INSTANCE-METHOD", 2, 0, false);
        declareFunction(me, "shop_indexed_object_add_to_index_method", "SHOP-INDEXED-OBJECT-ADD-TO-INDEX-METHOD", 1, 0, false);
        declareFunction(me, "shop_indexed_object_initialize_method", "SHOP-INDEXED-OBJECT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_problem_p", "SHOP-PROBLEM-P", 1, 0, false);
        declareFunction(me, "shop_planner_rule_p", "SHOP-PLANNER-RULE-P", 1, 0, false);
        declareFunction(me, "shop_operator_p", "SHOP-OPERATOR-P", 1, 0, false);
        declareFunction(me, "shop_sufficiency_condition_p", "SHOP-SUFFICIENCY-CONDITION-P", 1, 0, false);
        declareFunction(me, "shop_method_p", "SHOP-METHOD-P", 1, 0, false);
        declareMacro(me, "shop_my_union", "SHOP-MY-UNION");
        declareFunction(me, "shop_my_union_func", "SHOP-MY-UNION-FUNC", 3, 0, false);
        declareFunction(me, "shop_same_set_p", "SHOP-SAME-SET-P", 2, 0, false);
        declareFunction(me, "shop_variablep", "SHOP-VARIABLEP", 1, 0, false);
        declareFunction(me, "shop_extract_variables", "SHOP-EXTRACT-VARIABLES", 1, 0, false);
        declareFunction(me, "shop_empty_bindingP", "SHOP-EMPTY-BINDING?", 1, 0, false);
        declareFunction(me, "shop_unify_failedP", "SHOP-UNIFY-FAILED?", 1, 0, false);
        declareFunction(me, "shop_apply_substitution", "SHOP-APPLY-SUBSTITUTION", 2, 0, false);
        declareFunction(me, "shop_compose_substitutions_test", "SHOP-COMPOSE-SUBSTITUTIONS-TEST", 2, 0, false);
        declareFunction(me, "shop_compose_substitutions", "SHOP-COMPOSE-SUBSTITUTIONS", 2, 0, false);
        declareFunction(me, "shop_unify", "SHOP-UNIFY", 2, 0, false);
        declareFunction(me, "shop_occurs", "SHOP-OCCURS", 2, 0, false);
        declareFunction(me, "shop_standardizer_gensym", "SHOP-STANDARDIZER-GENSYM", 1, 0, false);
        declareFunction(me, "shop_standardizer", "SHOP-STANDARDIZER", 1, 0, false);
        declareFunction(me, "shop_spec_formulaP", "SHOP-SPEC-FORMULA?", 2, 0, false);
        declareFunction(me, "get_shop_basic_planner_rule_assertion_list", "GET-SHOP-BASIC-PLANNER-RULE-ASSERTION-LIST", 1, 0, false);
        declareFunction(me, "set_shop_basic_planner_rule_assertion_list", "SET-SHOP-BASIC-PLANNER-RULE-ASSERTION-LIST", 2, 0, false);
        declareFunction(me, "get_shop_basic_planner_rule_head", "GET-SHOP-BASIC-PLANNER-RULE-HEAD", 1, 0, false);
        declareFunction(me, "set_shop_basic_planner_rule_head", "SET-SHOP-BASIC-PLANNER-RULE-HEAD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_planner_rule_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_planner_rule_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_planner_rule_p", "SHOP-BASIC-PLANNER-RULE-P", 1, 0, false);
        declareFunction(me, "shop_basic_planner_rule_print_method", "SHOP-BASIC-PLANNER-RULE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_planner_rule_html_display_method", "SHOP-BASIC-PLANNER-RULE-HTML-DISPLAY-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_planner_rule_pred_method", "SHOP-BASIC-PLANNER-RULE-PRED-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_planner_rule_head_method", "SHOP-BASIC-PLANNER-RULE-HEAD-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_planner_rule_set_head_method", "SHOP-BASIC-PLANNER-RULE-SET-HEAD-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_planner_rule_assertions_method", "SHOP-BASIC-PLANNER-RULE-ASSERTIONS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_planner_rule_set_assertions_method", "SHOP-BASIC-PLANNER-RULE-SET-ASSERTIONS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_planner_rule_unify_task_to_head_method", "SHOP-BASIC-PLANNER-RULE-UNIFY-TASK-TO-HEAD-METHOD", 2, 0, false);
        declareFunction(me, "shop_conditional_effect_p", "SHOP-CONDITIONAL-EFFECT-P", 1, 0, false);
        declareFunction(me, "get_shop_basic_conditional_effect_condition", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION", 1, 0, false);
        declareFunction(me, "set_shop_basic_conditional_effect_condition", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION", 2, 0, false);
        declareFunction(me, "get_shop_basic_conditional_effect_deletes", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-DELETES", 1, 0, false);
        declareFunction(me, "set_shop_basic_conditional_effect_deletes", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-DELETES", 2, 0, false);
        declareFunction(me, "get_shop_basic_conditional_effect_adds", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-ADDS", 1, 0, false);
        declareFunction(me, "set_shop_basic_conditional_effect_adds", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-ADDS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_conditional_effect_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_conditional_effect_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_p", "SHOP-BASIC-CONDITIONAL-EFFECT-P", 1, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_print_method", "SHOP-BASIC-CONDITIONAL-EFFECT-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_html_display_method", "SHOP-BASIC-CONDITIONAL-EFFECT-HTML-DISPLAY-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_init_method", "SHOP-BASIC-CONDITIONAL-EFFECT-INIT-METHOD", 6, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_adds_method", "SHOP-BASIC-CONDITIONAL-EFFECT-ADDS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_deletes_method", "SHOP-BASIC-CONDITIONAL-EFFECT-DELETES-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_condition_method", "SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_conditional_effect_assertion_method", "SHOP-BASIC-CONDITIONAL-EFFECT-ASSERTION-METHOD", 1, 0, false);
        declareFunction(me, "get_shop_basic_operator_cost", "GET-SHOP-BASIC-OPERATOR-COST", 1, 0, false);
        declareFunction(me, "set_shop_basic_operator_cost", "SET-SHOP-BASIC-OPERATOR-COST", 2, 0, false);
        declareFunction(me, "get_shop_basic_operator_conditional_effects", "GET-SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS", 1, 0, false);
        declareFunction(me, "set_shop_basic_operator_conditional_effects", "SET-SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS", 2, 0, false);
        declareFunction(me, "get_shop_basic_operator_deletes", "GET-SHOP-BASIC-OPERATOR-DELETES", 1, 0, false);
        declareFunction(me, "set_shop_basic_operator_deletes", "SET-SHOP-BASIC-OPERATOR-DELETES", 2, 0, false);
        declareFunction(me, "get_shop_basic_operator_adds", "GET-SHOP-BASIC-OPERATOR-ADDS", 1, 0, false);
        declareFunction(me, "set_shop_basic_operator_adds", "SET-SHOP-BASIC-OPERATOR-ADDS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_operator_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_operator_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_operator_p", "SHOP-BASIC-OPERATOR-P", 1, 0, false);
        declareFunction(me, "shop_basic_operator_print_method", "SHOP-BASIC-OPERATOR-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_operator_html_display_method", "SHOP-BASIC-OPERATOR-HTML-DISPLAY-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_operator_init_method", "SHOP-BASIC-OPERATOR-INIT-METHOD", 5, 0, false);
        declareFunction(me, "shop_basic_operator_get_adds_method", "SHOP-BASIC-OPERATOR-GET-ADDS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_operator_add_literals_to_adds_method", "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-ADDS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_operator_get_deletes_method", "SHOP-BASIC-OPERATOR-GET-DELETES-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_operator_conditional_effects_method", "SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_operator_add_literals_to_deletes_method", "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-DELETES-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_operator_unit_test_method", "SHOP-BASIC-OPERATOR-UNIT-TEST-METHOD", 2, 0, false);
        declareFunction(me, "get_shop_basic_method_decomposition", "GET-SHOP-BASIC-METHOD-DECOMPOSITION", 1, 0, false);
        declareFunction(me, "set_shop_basic_method_decomposition", "SET-SHOP-BASIC-METHOD-DECOMPOSITION", 2, 0, false);
        declareFunction(me, "get_shop_basic_method_precondition", "GET-SHOP-BASIC-METHOD-PRECONDITION", 1, 0, false);
        declareFunction(me, "set_shop_basic_method_precondition", "SET-SHOP-BASIC-METHOD-PRECONDITION", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_method_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_method_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_method_p", "SHOP-BASIC-METHOD-P", 1, 0, false);
        declareFunction(me, "shop_basic_method_print_method", "SHOP-BASIC-METHOD-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_method_html_display_method", "SHOP-BASIC-METHOD-HTML-DISPLAY-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_method_init_method", "SHOP-BASIC-METHOD-INIT-METHOD", 5, 0, false);
        declareFunction(me, "shop_basic_method_set_decomposition_method", "SHOP-BASIC-METHOD-SET-DECOMPOSITION-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_method_get_decomposition_method", "SHOP-BASIC-METHOD-GET-DECOMPOSITION-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_method_get_precondition_method", "SHOP-BASIC-METHOD-GET-PRECONDITION-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_method_unify_task_to_head_with_data_method", "SHOP-BASIC-METHOD-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_method_add_literals_to_precondition_method", "SHOP-BASIC-METHOD-ADD-LITERALS-TO-PRECONDITION-METHOD", 2, 0, false);
        declareFunction(me, "get_shop_basic_sufficiency_cond_condition_formula", "GET-SHOP-BASIC-SUFFICIENCY-COND-CONDITION-FORMULA", 1, 0, false);
        declareFunction(me, "set_shop_basic_sufficiency_cond_condition_formula", "SET-SHOP-BASIC-SUFFICIENCY-COND-CONDITION-FORMULA", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_sufficiency_cond_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_sufficiency_cond_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_sufficiency_cond_p", "SHOP-BASIC-SUFFICIENCY-COND-P", 1, 0, false);
        declareFunction(me, "shop_basic_sufficiency_cond_print_method", "SHOP-BASIC-SUFFICIENCY-COND-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_sufficiency_cond_html_display_method", "SHOP-BASIC-SUFFICIENCY-COND-HTML-DISPLAY-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_sufficiency_cond_cond_formula_method", "SHOP-BASIC-SUFFICIENCY-COND-COND-FORMULA-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_sufficiency_cond_set_cond_formula_method", "SHOP-BASIC-SUFFICIENCY-COND-SET-COND-FORMULA-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_sufficiency_cond_unify_task_to_head_with_data_method", "SHOP-BASIC-SUFFICIENCY-COND-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD", 2, 0, false);
        declareFunction(me, "shop_precondition_p", "SHOP-PRECONDITION-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_precondition_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_precondition_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_precondition_p", "SHOP-BASIC-PRECONDITION-P", 1, 0, false);
        declareFunction(me, "shop_basic_precondition_print_method", "SHOP-BASIC-PRECONDITION-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "get_shop_basic_problem_state", "GET-SHOP-BASIC-PROBLEM-STATE", 1, 0, false);
        declareFunction(me, "set_shop_basic_problem_state", "SET-SHOP-BASIC-PROBLEM-STATE", 2, 0, false);
        declareFunction(me, "get_shop_basic_problem_tasks", "GET-SHOP-BASIC-PROBLEM-TASKS", 1, 0, false);
        declareFunction(me, "set_shop_basic_problem_tasks", "SET-SHOP-BASIC-PROBLEM-TASKS", 2, 0, false);
        declareFunction(me, "get_shop_basic_problem_task_mt", "GET-SHOP-BASIC-PROBLEM-TASK-MT", 1, 0, false);
        declareFunction(me, "set_shop_basic_problem_task_mt", "SET-SHOP-BASIC-PROBLEM-TASK-MT", 2, 0, false);
        declareFunction(me, "get_shop_basic_problem_domain", "GET-SHOP-BASIC-PROBLEM-DOMAIN", 1, 0, false);
        declareFunction(me, "set_shop_basic_problem_domain", "SET-SHOP-BASIC-PROBLEM-DOMAIN", 2, 0, false);
        declareFunction(me, "get_shop_basic_problem_name", "GET-SHOP-BASIC-PROBLEM-NAME", 1, 0, false);
        declareFunction(me, "set_shop_basic_problem_name", "SET-SHOP-BASIC-PROBLEM-NAME", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_problem_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_problem_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_problem_p", "SHOP-BASIC-PROBLEM-P", 1, 0, false);
        declareFunction(me, "shop_basic_problem_initialize_method", "SHOP-BASIC-PROBLEM-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_initialize_problem_method", "SHOP-BASIC-PROBLEM-INITIALIZE-PROBLEM-METHOD", 6, 0, false);
        declareFunction(me, "shop_basic_problem_print_method", "SHOP-BASIC-PROBLEM-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_problem_set_name_method", "SHOP-BASIC-PROBLEM-SET-NAME-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_problem_get_name_method", "SHOP-BASIC-PROBLEM-GET-NAME-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_set_domain_method", "SHOP-BASIC-PROBLEM-SET-DOMAIN-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_problem_get_domain_method", "SHOP-BASIC-PROBLEM-GET-DOMAIN-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_get_methods_method", "SHOP-BASIC-PROBLEM-GET-METHODS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_get_operators_method", "SHOP-BASIC-PROBLEM-GET-OPERATORS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_get_tasks_method", "SHOP-BASIC-PROBLEM-GET-TASKS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_set_tasks_method", "SHOP-BASIC-PROBLEM-SET-TASKS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_problem_get_state_method", "SHOP-BASIC-PROBLEM-GET-STATE-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_problem_set_state_method", "SHOP-BASIC-PROBLEM-SET-STATE-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_datastructures_file() {
        deflexical("*SHOP-UNIFY-FAILED*", $FAIL);
        deflexical("*SHOP-EMPTY-UNIFIER*", NIL);
        return NIL;
    }

    public static SubLObject setup_shop_datastructures_file() {
        classes.subloop_new_class(SHOP_INDEXED_OBJECT, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(SHOP_INDEXED_OBJECT, NIL);
        classes.subloop_note_class_initialization_function(SHOP_INDEXED_OBJECT, SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_INDEXED_OBJECT, SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE);
        subloop_reserved_initialize_shop_indexed_object_class(SHOP_INDEXED_OBJECT);
        methods.methods_incorporate_instance_method(FIND_INSTANCE, SHOP_INDEXED_OBJECT, $list10, $list11, $list12);
        methods.subloop_register_instance_method(SHOP_INDEXED_OBJECT, FIND_INSTANCE, SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_INDEX, SHOP_INDEXED_OBJECT, $list16, NIL, $list17);
        methods.subloop_register_instance_method(SHOP_INDEXED_OBJECT, ADD_TO_INDEX, SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_INDEXED_OBJECT, $list20, NIL, $list21);
        methods.subloop_register_instance_method(SHOP_INDEXED_OBJECT, INITIALIZE, SHOP_INDEXED_OBJECT_INITIALIZE_METHOD);
        interfaces.new_interface(SHOP_PROBLEM, NIL, NIL, $list24);
        interfaces.new_interface(SHOP_PLANNER_RULE, NIL, NIL, $list26);
        interfaces.new_interface(SHOP_OPERATOR, SHOP_PLANNER_RULE, $list28, $list29);
        interfaces.new_interface(SHOP_SUFFICIENCY_CONDITION, SHOP_PLANNER_RULE, $list28, $list31);
        interfaces.new_interface(SHOP_METHOD, SHOP_PLANNER_RULE, $list28, $list33);
        classes.subloop_new_class(SHOP_BASIC_PLANNER_RULE, SHOP_INDEXED_OBJECT, $list45, NIL, $list46);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PLANNER_RULE, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PLANNER_RULE, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PLANNER_RULE, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE);
        subloop_reserved_initialize_shop_basic_planner_rule_class(SHOP_BASIC_PLANNER_RULE);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_PLANNER_RULE, $list10, $list52, $list53);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, PRINT, SHOP_BASIC_PLANNER_RULE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HTML_DISPLAY, SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list59);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, HTML_DISPLAY, SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(PRED, SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list62);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, PRED, SHOP_BASIC_PLANNER_RULE_PRED_METHOD);
        methods.methods_incorporate_instance_method(HEAD, SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list65);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, HEAD, SHOP_BASIC_PLANNER_RULE_HEAD_METHOD);
        methods.methods_incorporate_instance_method(SET_HEAD, SHOP_BASIC_PLANNER_RULE, $list10, $list69, $list70);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, SET_HEAD, SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD);
        methods.methods_incorporate_instance_method(ASSERTIONS, SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list74);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, ASSERTIONS, SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_ASSERTIONS, SHOP_BASIC_PLANNER_RULE, $list10, $list78, $list79);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, SET_ASSERTIONS, SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD);
        methods.methods_incorporate_instance_method(UNIFY_TASK_TO_HEAD, SHOP_BASIC_PLANNER_RULE, $list10, $list83, $list84);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_RULE, UNIFY_TASK_TO_HEAD, SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD);
        interfaces.new_interface(SHOP_CONDITIONAL_EFFECT, NIL, NIL, $list89);
        classes.subloop_new_class(SHOP_BASIC_CONDITIONAL_EFFECT, SHOP_BASIC_PLANNER_RULE, $list91, NIL, $list92);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_CONDITIONAL_EFFECT, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_CONDITIONAL_EFFECT, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_CONDITIONAL_EFFECT, $sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC);
        subloop_reserved_initialize_shop_basic_conditional_effect_class(SHOP_BASIC_CONDITIONAL_EFFECT);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, $list52, $list98);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, PRINT, SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HTML_DISPLAY, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list102);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, HTML_DISPLAY, SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(INIT, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, $list110, $list111);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, INIT, SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD);
        methods.methods_incorporate_instance_method(ADDS, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list114);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, ADDS, SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD);
        methods.methods_incorporate_instance_method(DELETES, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list117);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, DELETES, SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD);
        methods.methods_incorporate_instance_method(CONDITION, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list120);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, CONDITION, SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD);
        methods.methods_incorporate_instance_method(ASSERTION, SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list74);
        methods.subloop_register_instance_method(SHOP_BASIC_CONDITIONAL_EFFECT, ASSERTION, SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD);
        classes.subloop_new_class(SHOP_BASIC_OPERATOR, SHOP_BASIC_PLANNER_RULE, $list127, NIL, $list128);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_OPERATOR, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_OPERATOR, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_OPERATOR, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE);
        subloop_reserved_initialize_shop_basic_operator_class(SHOP_BASIC_OPERATOR);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_OPERATOR, $list10, $list52, $list133);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, PRINT, SHOP_BASIC_OPERATOR_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HTML_DISPLAY, SHOP_BASIC_OPERATOR, $list10, NIL, $list137);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, HTML_DISPLAY, SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(INIT, SHOP_BASIC_OPERATOR, $list10, $list145, $list146);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, INIT, SHOP_BASIC_OPERATOR_INIT_METHOD);
        methods.methods_incorporate_instance_method(GET_ADDS, SHOP_BASIC_OPERATOR, $list10, NIL, $list150);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, GET_ADDS, SHOP_BASIC_OPERATOR_GET_ADDS_METHOD);
        methods.methods_incorporate_instance_method(ADD_LITERALS_TO_ADDS, SHOP_BASIC_OPERATOR, $list10, $list154, $list155);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, ADD_LITERALS_TO_ADDS, SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD);
        methods.methods_incorporate_instance_method(GET_DELETES, SHOP_BASIC_OPERATOR, $list10, NIL, $list159);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, GET_DELETES, SHOP_BASIC_OPERATOR_GET_DELETES_METHOD);
        methods.methods_incorporate_instance_method(CONDITIONAL_EFFECTS, SHOP_BASIC_OPERATOR, $list10, NIL, $list162);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, CONDITIONAL_EFFECTS, SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD);
        methods.methods_incorporate_instance_method(ADD_LITERALS_TO_DELETES, SHOP_BASIC_OPERATOR, $list10, $list154, $list166);
        methods.subloop_register_instance_method(SHOP_BASIC_OPERATOR, ADD_LITERALS_TO_DELETES, SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD);
        methods.methods_incorporate_class_method(UNIT_TEST, SHOP_BASIC_OPERATOR, $list170, $list171, $list172);
        methods.subloop_register_class_method(SHOP_BASIC_OPERATOR, UNIT_TEST, SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD);
        classes.subloop_new_class(SHOP_BASIC_METHOD, SHOP_BASIC_PLANNER_RULE, $list183, NIL, $list184);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_METHOD, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_METHOD, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_METHOD, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE);
        subloop_reserved_initialize_shop_basic_method_class(SHOP_BASIC_METHOD);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_METHOD, NIL, $list52, $list189);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, PRINT, SHOP_BASIC_METHOD_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HTML_DISPLAY, SHOP_BASIC_METHOD, $list10, NIL, $list193);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, HTML_DISPLAY, SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(INIT, SHOP_BASIC_METHOD, $list10, $list199, $list200);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, INIT, SHOP_BASIC_METHOD_INIT_METHOD);
        methods.methods_incorporate_instance_method(SET_DECOMPOSITION, SHOP_BASIC_METHOD, $list10, $list204, $list205);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, SET_DECOMPOSITION, SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD);
        methods.methods_incorporate_instance_method(GET_DECOMPOSITION, SHOP_BASIC_METHOD, $list10, NIL, $list209);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, GET_DECOMPOSITION, SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION, SHOP_BASIC_METHOD, $list10, NIL, $list213);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, GET_PRECONDITION, SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD);
        methods.methods_incorporate_instance_method(UNIFY_TASK_TO_HEAD_WITH_DATA, SHOP_BASIC_METHOD, $list10, $list83, $list217);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, UNIFY_TASK_TO_HEAD_WITH_DATA, SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD);
        methods.methods_incorporate_instance_method(ADD_LITERALS_TO_PRECONDITION, SHOP_BASIC_METHOD, $list10, $list154, $list221);
        methods.subloop_register_instance_method(SHOP_BASIC_METHOD, ADD_LITERALS_TO_PRECONDITION, SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD);
        classes.subloop_new_class(SHOP_BASIC_SUFFICIENCY_COND, SHOP_BASIC_PLANNER_RULE, $list225, NIL, $list226);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_SUFFICIENCY_COND, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_SUFFICIENCY_COND, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_SUFFICIENCY_COND, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE);
        subloop_reserved_initialize_shop_basic_sufficiency_cond_class(SHOP_BASIC_SUFFICIENCY_COND);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_SUFFICIENCY_COND, NIL, $list52, $list230);
        methods.subloop_register_instance_method(SHOP_BASIC_SUFFICIENCY_COND, PRINT, SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HTML_DISPLAY, SHOP_BASIC_SUFFICIENCY_COND, NIL, NIL, $list234);
        methods.subloop_register_instance_method(SHOP_BASIC_SUFFICIENCY_COND, HTML_DISPLAY, SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(COND_FORMULA, SHOP_BASIC_SUFFICIENCY_COND, $list10, NIL, $list238);
        methods.subloop_register_instance_method(SHOP_BASIC_SUFFICIENCY_COND, COND_FORMULA, SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(SET_COND_FORMULA, SHOP_BASIC_SUFFICIENCY_COND, $list10, $list69, $list242);
        methods.subloop_register_instance_method(SHOP_BASIC_SUFFICIENCY_COND, SET_COND_FORMULA, SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(UNIFY_TASK_TO_HEAD_WITH_DATA, SHOP_BASIC_SUFFICIENCY_COND, $list10, $list83, $list245);
        methods.subloop_register_instance_method(SHOP_BASIC_SUFFICIENCY_COND, UNIFY_TASK_TO_HEAD_WITH_DATA, SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD);
        interfaces.new_interface(SHOP_PRECONDITION, NIL, NIL, NIL);
        classes.subloop_new_class(SHOP_BASIC_PRECONDITION, SHOP_BASIC_METHOD, $list250, NIL, NIL);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PRECONDITION, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PRECONDITION, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PRECONDITION, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE);
        subloop_reserved_initialize_shop_basic_precondition_class(SHOP_BASIC_PRECONDITION);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_PRECONDITION, $list10, $list52, $list253);
        methods.subloop_register_instance_method(SHOP_BASIC_PRECONDITION, PRINT, SHOP_BASIC_PRECONDITION_PRINT_METHOD);
        classes.subloop_new_class(SHOP_BASIC_PROBLEM, OBJECT, $list258, NIL, $list259);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PROBLEM, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PROBLEM, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PROBLEM, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE);
        subloop_reserved_initialize_shop_basic_problem_class(SHOP_BASIC_PROBLEM);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_BASIC_PROBLEM, $list20, NIL, $list267);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, INITIALIZE, SHOP_BASIC_PROBLEM_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_PROBLEM, SHOP_BASIC_PROBLEM, $list10, $list271, $list272);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, INITIALIZE_PROBLEM, SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_PROBLEM, NIL, $list52, $list275);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, PRINT, SHOP_BASIC_PROBLEM_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, SHOP_BASIC_PROBLEM, $list10, $list280, $list281);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, SET_NAME, SHOP_BASIC_PROBLEM_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_NAME, SHOP_BASIC_PROBLEM, $list10, NIL, $list285);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, GET_NAME, SHOP_BASIC_PROBLEM_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_DOMAIN, SHOP_BASIC_PROBLEM, $list10, $list289, $list290);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, SET_DOMAIN, SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP_BASIC_PROBLEM, $list10, NIL, $list294);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, GET_DOMAIN, SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_METHODS, SHOP_BASIC_PROBLEM, $list10, NIL, $list298);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, GET_METHODS, SHOP_BASIC_PROBLEM_GET_METHODS_METHOD);
        methods.methods_incorporate_instance_method(GET_OPERATORS, SHOP_BASIC_PROBLEM, $list10, NIL, $list303);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, GET_OPERATORS, SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method(GET_TASKS, SHOP_BASIC_PROBLEM, $list10, NIL, $list308);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, GET_TASKS, SHOP_BASIC_PROBLEM_GET_TASKS_METHOD);
        methods.methods_incorporate_instance_method(SET_TASKS, SHOP_BASIC_PROBLEM, $list10, $list312, $list313);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, SET_TASKS, SHOP_BASIC_PROBLEM_SET_TASKS_METHOD);
        methods.methods_incorporate_instance_method(GET_STATE, SHOP_BASIC_PROBLEM, $list10, NIL, $list317);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, GET_STATE, SHOP_BASIC_PROBLEM_GET_STATE_METHOD);
        methods.methods_incorporate_instance_method(SET_STATE, SHOP_BASIC_PROBLEM, $list10, $list321, $list322);
        methods.subloop_register_instance_method(SHOP_BASIC_PROBLEM, SET_STATE, SHOP_BASIC_PROBLEM_SET_STATE_METHOD);
        sunit_external.define_test_category($$$SHOP_Category, UNPROVIDED);
        sunit_external.define_test_suite($$$SHOP, $list327, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_datastructures_file();
    }

    
}

/**
 * Total time: 1169 ms
 */
