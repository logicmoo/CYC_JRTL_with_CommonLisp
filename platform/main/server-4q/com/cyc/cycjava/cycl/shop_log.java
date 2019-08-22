package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_log extends SubLTranslatedFile {
    public static final SubLFile me = new shop_log();

    public static final String myName = "com.cyc.cycjava.cycl.shop_log";

    public static final String myFingerPrint = "1aa9deb937db22c6f459d21d40522114c78982359c3d15321118ab2697ecd690";

    // deflexical
    // Maps log entry types to the methods of SHOP-LOG that will display them.
    private static final SubLSymbol $shop_log_entry_map$ = makeSymbol("*SHOP-LOG-ENTRY-MAP*");

    // Internal Constants
    public static final SubLSymbol PROCESS_LOG = makeSymbol("PROCESS-LOG");

    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-ENTRY"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WARNING"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUCCESS"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-SECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-HTML-LOG"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol HTML_PROCESS_LOG = makeSymbol("HTML-PROCESS-LOG");

    public static final SubLList $list3 = list(makeKeyword("EXTENDS"), makeSymbol("PROCESS-LOG"));

    public static final SubLList $list4 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLOR-LOG-ENTRY"), list(makeSymbol("ITEM"), makeSymbol("COLOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-FANCY-ENTRY"), list(makeSymbol("ITEM"), makeSymbol("MOD-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-HEADING"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PREFORMATTED"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_LOG = makeSymbol("SHOP-LOG");



    public static final SubLList $list7 = list(makeSymbol("HTML-PROCESS-LOG"));

    public static final SubLList $list8 = list(new SubLObject[]{ list(makeSymbol("LOG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VERBOSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ISG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-LOG"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VERBOSITY"), list(makeSymbol("NEW-VERBOSE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-FANCY-ENTRY"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-COLOR-ENTRY"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFERENCE-LINK"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("METHOD-LINK"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-PARTIAL-PLAN"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PLANNER-RULE"), list(makeSymbol("RULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-INFERENCE"), list(makeSymbol("BINDINGS"), makeSymbol("RESULTS"), makeSymbol("HALT-STATUS"), makeSymbol("INFERENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PARTIAL-PLAN"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")) });











    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE");



    public static final SubLList $list19 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list20 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("STREAM"), T), list(makeSymbol("CSETQ"), makeSymbol("LOG"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ISG"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    public static final SubLSymbol SHOP_LOG_INITIALIZE_METHOD = makeSymbol("SHOP-LOG-INITIALIZE-METHOD");



    public static final SubLList $list24 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list25 = list(makeSymbol("ITEM"));

    public static final SubLList $list26 = list(list(makeSymbol("CSETQ"), makeSymbol("LOG"), list(makeSymbol("CONS"), makeSymbol("ITEM"), makeSymbol("LOG"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("ITEM")), list(makeSymbol("PRINC"), makeSymbol("ITEM"))), list(makeSymbol("RET"), makeSymbol("ITEM")));

    public static final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    public static final SubLSymbol SHOP_LOG_ADD_TO_LOG_METHOD = makeSymbol("SHOP-LOG-ADD-TO-LOG-METHOD");



    public static final SubLList $list30 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list31 = list(list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeKeyword("NEWLINE"))));



    public static final SubLSymbol SHOP_LOG_LOG_NEWLINE_METHOD = makeSymbol("SHOP-LOG-LOG-NEWLINE-METHOD");



    public static final SubLList $list35 = list(list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeSymbol("ITEM"))));

    public static final SubLSymbol SHOP_LOG_LOG_ENTRY_METHOD = makeSymbol("SHOP-LOG-LOG-ENTRY-METHOD");

    public static final SubLSymbol LOG_PREFORMATTED = makeSymbol("LOG-PREFORMATTED");

    public static final SubLList $list38 = list(list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeKeyword("PRE"), makeSymbol("ITEM")))));



    public static final SubLSymbol SHOP_LOG_LOG_PREFORMATTED_METHOD = makeSymbol("SHOP-LOG-LOG-PREFORMATTED-METHOD");



    public static final SubLList $list42 = list(makeSymbol("ENTRY"), makeSymbol("MOD-LIST"));

    public static final SubLList $list43 = list(list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("FANCY"), makeSymbol("ENTRY"), makeSymbol("MOD-LIST")))));



    public static final SubLSymbol SHOP_LOG_LOG_FANCY_ENTRY_METHOD = makeSymbol("SHOP-LOG-LOG-FANCY-ENTRY-METHOD");

    public static final SubLSymbol LOG_HEADING = makeSymbol("LOG-HEADING");

    public static final SubLList $list47 = list(makeSymbol("ENTRY"));

    public static final SubLList $list48 = list(list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("HEADING"), makeSymbol("ENTRY")))));



    public static final SubLSymbol SHOP_LOG_LOG_HEADING_METHOD = makeSymbol("SHOP-LOG-LOG-HEADING-METHOD");

    public static final SubLSymbol LOG_PARTIAL_PLAN = makeSymbol("LOG-PARTIAL-PLAN");

    public static final SubLList $list52 = list(list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("PARTIAL-PLAN"), makeSymbol("ENTRY")))));



    public static final SubLSymbol SHOP_LOG_LOG_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-LOG-LOG-PARTIAL-PLAN-METHOD");

    public static final SubLSymbol COLOR_LOG_ENTRY = makeSymbol("COLOR-LOG-ENTRY");

    public static final SubLList $list56 = list(makeSymbol("ITEM"), makeSymbol("COLOR"));

    public static final SubLList $list57 = list(makeString("Log ITEM so it shows in HTML in COLOR."), list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("COLOR"), makeSymbol("COLOR"), makeSymbol("ITEM")))));



    public static final SubLSymbol SHOP_LOG_COLOR_LOG_ENTRY_METHOD = makeSymbol("SHOP-LOG-COLOR-LOG-ENTRY-METHOD");



    public static final SubLList $list61 = list(makeString("Log item in a warning color (red)"), list(makeSymbol("RET"), list(makeSymbol("COLOR-LOG-ENTRY"), makeSymbol("SELF"), makeSymbol("ITEM"), makeKeyword("RED"))));



    public static final SubLSymbol SHOP_LOG_WARNING_METHOD = makeSymbol("SHOP-LOG-WARNING-METHOD");



    public static final SubLList $list65 = list(makeString("Log item in a success color (green)"), list(makeSymbol("RET"), list(makeSymbol("COLOR-LOG-ENTRY"), makeSymbol("SELF"), makeSymbol("ITEM"), makeKeyword("DARK-GREEN"))));



    public static final SubLSymbol SHOP_LOG_SUCCESS_METHOD = makeSymbol("SHOP-LOG-SUCCESS-METHOD");

    public static final SubLSymbol NEW_SECTION = makeSymbol("NEW-SECTION");

    public static final SubLList $list69 = list(makeString("Signals a horizontal rule in the log output"), list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeKeyword("HR"))));



    public static final SubLSymbol SHOP_LOG_NEW_SECTION_METHOD = makeSymbol("SHOP-LOG-NEW-SECTION-METHOD");

    public static final SubLSymbol LOG_PLANNER_RULE = makeSymbol("LOG-PLANNER-RULE");

    public static final SubLList $list73 = list(makeSymbol("RULE"));

    public static final SubLList $list74 = list(makeString("@param RULE shop-basic-planner-rule-p"), list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("RULE"), makeSymbol("RULE")))));



    public static final SubLSymbol SHOP_LOG_LOG_PLANNER_RULE_METHOD = makeSymbol("SHOP-LOG-LOG-PLANNER-RULE-METHOD");

    public static final SubLSymbol LOG_INFERENCE = makeSymbol("LOG-INFERENCE");

    public static final SubLList $list78 = list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE"));

    public static final SubLList $list79 = list(makeString("@param BINDINGS listp\n   @param INFERENCE inference-p"), list(makeSymbol("CHECK-TYPE"), makeSymbol("INFERENCE"), makeSymbol("INFERENCE-P")), list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("INFERENCE"), makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")))));





    public static final SubLSymbol SHOP_LOG_LOG_INFERENCE_METHOD = makeSymbol("SHOP-LOG-LOG-INFERENCE-METHOD");

    public static final SubLSymbol LOG_MULTIBINDING = makeSymbol("LOG-MULTIBINDING");

    public static final SubLList $list84 = list(makeSymbol("MBIND"));

    public static final SubLList $list85 = list(makeString("@param RULE multibinding-p"), list(makeSymbol("RET"), list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("MBIND"), makeSymbol("MBIND")))));



    public static final SubLSymbol SHOP_LOG_LOG_MULTIBINDING_METHOD = makeSymbol("SHOP-LOG-LOG-MULTIBINDING-METHOD");

    public static final SubLSymbol PLANNER_RULE_LINK = makeSymbol("PLANNER-RULE-LINK");

    public static final SubLList $list89 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RULE"), list(makeSymbol("SECOND"), makeSymbol("ENTRY"))), list(makeSymbol("ASS"), list(makeSymbol("FIRST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSERTIONS"), makeSymbol("SHOP-BASIC-PLANNER-RULE")), makeSymbol("RULE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("ASSERTION-P"), makeSymbol("ASS")), list(makeSymbol("CB-SHOW-ASSERTION-READABLY"), makeSymbol("ASS"))), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol SHOP_LOG_PLANNER_RULE_LINK_METHOD = makeSymbol("SHOP-LOG-PLANNER-RULE-LINK-METHOD");

    public static final SubLSymbol DISPLAY_FANCY_ENTRY = makeSymbol("DISPLAY-FANCY-ENTRY");

    public static final SubLList $list92 = list(makeString("only :bold supported for now"), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("ITEM"), makeSymbol("MOD-LIST")), list(makeSymbol("REST"), makeSymbol("ENTRY")), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("BOLD"), makeSymbol("MOD-LIST")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeSymbol("ITEM"))))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list93 = list(makeSymbol("ITEM"), makeSymbol("MOD-LIST"));



    public static final SubLSymbol SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD = makeSymbol("SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD");

    public static final SubLSymbol DISPLAY_MULTIBINDING = makeSymbol("DISPLAY-MULTIBINDING");

    public static final SubLList $list97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MB"), list(makeSymbol("SECOND"), makeSymbol("ENTRY"))), list(makeSymbol("ALIST"), NIL)), list(makeSymbol("DO-MBIND"), list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("MB")), list(makeSymbol("ALIST-ENTER"), makeSymbol("ALIST"), makeSymbol("VAR"), makeSymbol("VALUES"))), list(makeSymbol("SORT"), makeSymbol("ALIST"), list(makeSymbol("QUOTE"), makeSymbol("STRING<")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-VAR-NAME"))), list(makeSymbol("DO-ALIST"), list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("ALIST")), list(makeSymbol("HTML-FORMAT"), makeString("~s -->"), makeSymbol("VAR")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAL"), makeSymbol("VALUES")), list(makeSymbol("HTML-FORMAT"), makeString(" ~s"), makeSymbol("CUR-VAL"))), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("RET"), NIL)));



    public static final SubLSymbol $sym99$STRING_ = makeSymbol("STRING<");

    public static final SubLSymbol SHOP_VAR_NAME = makeSymbol("SHOP-VAR-NAME");

    public static final SubLList $list101 = cons(makeSymbol("VAR"), makeSymbol("VALUES"));

    public static final SubLString $str102$_s____ = makeString("~s -->");

    public static final SubLString $str103$__s = makeString(" ~s");

    public static final SubLSymbol SHOP_LOG_DISPLAY_MULTIBINDING_METHOD = makeSymbol("SHOP-LOG-DISPLAY-MULTIBINDING-METHOD");

    public static final SubLSymbol INFERENCE_LINK = makeSymbol("INFERENCE-LINK");

    public static final SubLList $list106 = list(makeSymbol("LOG-ENTRY"));

    public static final SubLList $list107 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")), list(makeSymbol("REST"), makeSymbol("LOG-ENTRY")), list(makeSymbol("CLET"), list(list(makeSymbol("NUM-BINDINGS"), list(makeSymbol("LENGTH"), makeSymbol("BINDINGS"))), list(makeSymbol("INFERENCE-NAME"), makeString("[Examine Inference]"))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-FORMAT"), makeString("# returned bindings: ~s"), makeSymbol("NUM-BINDINGS")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("HTML-EM"), list(makeSymbol("HTML-FORMAT"), makeString("~s"), makeSymbol("HALT-REASON"))), list(makeSymbol("PUNLESS-FEATURE"), list(makeKeyword("OR"), makeKeyword("CYC-OPENCYC"), makeKeyword("CYC-RESEARCHCYC")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("CB-LINK"), makeKeyword("INFERENCE"), makeSymbol("INFERENCE"), NIL, makeSymbol("INFERENCE-NAME"))), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("RET"), NIL)));

    public static final SubLString $str108$_Examine_Inference_ = makeString("[Examine Inference]");

    public static final SubLString $str109$__returned_bindings___s = makeString("# returned bindings: ~s");

    public static final SubLString $str110$_s = makeString("~s");

    public static final SubLSymbol SHOP_LOG_INFERENCE_LINK_METHOD = makeSymbol("SHOP-LOG-INFERENCE-LINK-METHOD");

    public static final SubLSymbol DISPLAY_COLOR_ENTRY = makeSymbol("DISPLAY-COLOR-ENTRY");

    public static final SubLList $list113 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("COLOR"), makeSymbol("ENTRY")), list(makeSymbol("REST"), makeSymbol("LOG-ENTRY")), list(makeSymbol("HTML-FONT-COLOR"), list(makeSymbol("COLOR")), list(makeSymbol("HTML-PRE"), list(makeSymbol("CB-FORM"), makeSymbol("ENTRY"))))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list114 = list(makeSymbol("COLOR"), makeSymbol("ENTRY"));

    public static final SubLSymbol SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD = makeSymbol("SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD");

    public static final SubLSymbol DISPLAY_PARTIAL_PLAN = makeSymbol("DISPLAY-PARTIAL-PLAN");

    public static final SubLList $list117 = list(makeString("Display partial plan cleanly"), list(makeSymbol("CLET"), list(list(makeSymbol("PARTIAL-PLAN"), list(makeSymbol("SECOND"), makeSymbol("LOG-ENTRY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("STEP"), makeSymbol("PARTIAL-PLAN")), list(makeSymbol("CB-FORM"), makeSymbol("STEP")), list(makeSymbol("HTML-NEWLINE")))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD");

    public static final SubLSymbol DISPLAY_SWITCHABLE_PARTIAL_PLAN = makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN");

    public static final SubLList $list120 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("ISG"))), list(makeSymbol("OBJECT-ID"), list(makeSymbol("CCONCATENATE"), makeString("partial-plan-"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("ID"))))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Partial Plan"))), list(makeSymbol("HTML-INDENT")), list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"), makeSymbol("OBJECT-ID"), makeString("[Show]"), makeString("[Hide]")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"), list(makeSymbol("OBJECT-ID"), makeKeyword("INITIAL-VISIBILITY"), makeKeyword("INVISIBLE"), makeKeyword("FLOW-TYPE"), makeKeyword("PARAGRAPH")), list(makeSymbol("DISPLAY-PARTIAL-PLAN"), makeSymbol("SELF"), makeSymbol("LOG-ENTRY")))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    public static final SubLString $str122$partial_plan_ = makeString("partial-plan-");

    public static final SubLString $$$Partial_Plan = makeString("Partial Plan");

    public static final SubLString $str124$_Show_ = makeString("[Show]");

    public static final SubLString $str125$_Hide_ = makeString("[Hide]");





    public static final SubLSymbol SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD");

    public static final SubLList $list129 = list(list(makeKeyword("COLOR"), makeSymbol("DISPLAY-COLOR-ENTRY")), list(makeKeyword("RULE"), makeSymbol("PLANNER-RULE-LINK")), list(makeKeyword("INFERENCE"), makeSymbol("INFERENCE-LINK")), list(makeKeyword("MBIND"), makeSymbol("DISPLAY-MULTIBINDING")), list(makeKeyword("FANCY"), makeSymbol("DISPLAY-FANCY-ENTRY")), list(makeKeyword("PARTIAL-PLAN"), makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN")));

    public static final SubLSymbol DISPLAY_HTML_LOG = makeSymbol("DISPLAY-HTML-LOG");

    public static final SubLList $list131 = list(list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-RESET"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ISG")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), list(makeSymbol("REVERSE"), makeSymbol("LOG"))), list(makeSymbol("PCOND"), list(list(makeSymbol("KEYWORDP"), makeSymbol("ITEM")), list(makeSymbol("PCASE"), makeSymbol("ITEM"), list(makeKeyword("HR"), list(makeSymbol("HTML-HR"))), list(makeKeyword("NEWLINE"), list(makeSymbol("HTML-NEWLINE"))))), list(list(makeSymbol("LISTP"), makeSymbol("ITEM")), list(makeSymbol("PCASE"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), list(makeKeyword("PRE"), list(makeSymbol("HTML-PRE"), list(makeSymbol("CB-FORM"), list(makeSymbol("CDR"), makeSymbol("ITEM"))))), list(makeKeyword("HEADING"), list(makeSymbol("HTML-HEADING"), list(THREE_INTEGER), list(makeSymbol("HTML-PRINC"), list(makeSymbol("SECOND"), makeSymbol("ITEM"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD"), list(makeSymbol("SECOND"), list(makeSymbol("ASSOC"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), makeSymbol("*SHOP-LOG-ENTRY-MAP*"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("METHOD"), makeSymbol("ITEM")))))), list(list(makeSymbol("STRINGP"), makeSymbol("ITEM")), list(makeSymbol("PIF"), list(makeSymbol("SUBSTRING?"), makeString("#$"), makeSymbol("ITEM")), list(makeSymbol("CB-FORM"), makeSymbol("ITEM")), list(makeSymbol("HTML-PRINC"), makeSymbol("ITEM"))), list(makeSymbol("HTML-BR"))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    public static final SubLString $str133$__ = makeString("#$");

    public static final SubLSymbol SHOP_LOG_DISPLAY_HTML_LOG_METHOD = makeSymbol("SHOP-LOG-DISPLAY-HTML-LOG-METHOD");

    public static final SubLSymbol SET_VERBOSITY = makeSymbol("SET-VERBOSITY");

    public static final SubLList $list136 = list(makeSymbol("NEW-VERBOSE"));

    public static final SubLList $list137 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("NUMBERP"), makeSymbol("NEW-VERBOSE")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), makeSymbol("NEW-VERBOSE"))), list(list(makeSymbol("KEYWORDP"), makeSymbol("NEW-VERBOSE")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), list(makeSymbol("REST"), list(makeSymbol("ASSOC"), makeSymbol("NEW-VERBOSE"), makeSymbol("*SHOP-VERBOSE-KEYS*"), list(makeSymbol("FUNCTION"), makeSymbol("MEMBER")))))), list(T, list(makeSymbol("CERROR"), makeString("~s is not a permissible value for VERBOSE"), makeSymbol("NEW-VERBOSE")))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");



    public static final SubLString $str140$_s_is_not_a_permissible_value_for = makeString("~s is not a permissible value for VERBOSE");

    public static final SubLSymbol SHOP_LOG_SET_VERBOSITY_METHOD = makeSymbol("SHOP-LOG-SET-VERBOSITY-METHOD");

    public static SubLObject process_log_p(final SubLObject process_log) {
        return interfaces.subloop_instanceof_interface(process_log, PROCESS_LOG);
    }

    public static SubLObject html_process_log_p(final SubLObject html_process_log) {
        return interfaces.subloop_instanceof_interface(html_process_log, HTML_PROCESS_LOG);
    }

    public static SubLObject get_shop_log_isg(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, FOUR_INTEGER, ISG);
    }

    public static SubLObject set_shop_log_isg(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, FOUR_INTEGER, ISG);
    }

    public static SubLObject get_shop_log_verbose(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, THREE_INTEGER, VERBOSE);
    }

    public static SubLObject set_shop_log_verbose(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, THREE_INTEGER, VERBOSE);
    }

    public static SubLObject get_shop_log_stream(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, TWO_INTEGER, STREAM);
    }

    public static SubLObject set_shop_log_stream(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, TWO_INTEGER, STREAM);
    }

    public static SubLObject get_shop_log_log(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, ONE_INTEGER, LOG);
    }

    public static SubLObject set_shop_log_log(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, ONE_INTEGER, LOG);
    }

    public static SubLObject subloop_reserved_initialize_shop_log_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_log_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, LOG, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, VERBOSE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, ISG, NIL);
        return NIL;
    }

    public static SubLObject shop_log_p(final SubLObject v_shop_log) {
        return classes.subloop_instanceof_class(v_shop_log, SHOP_LOG);
    }

    public static SubLObject shop_log_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = NIL;
        SubLObject isg = get_shop_log_isg(self);
        SubLObject verbose = get_shop_log_verbose(self);
        SubLObject stream = get_shop_log_stream(self);
        SubLObject log = get_shop_log_log(self);
        try {
            thread.throwStack.push($sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                object.object_initialize_method(self);
                verbose = ZERO_INTEGER;
                stream = T;
                log = NIL;
                isg = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_log_isg(self, isg);
                    set_shop_log_verbose(self, verbose);
                    set_shop_log_stream(self, stream);
                    set_shop_log_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }

    public static SubLObject shop_log_add_to_log_method(final SubLObject self, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = NIL;
        SubLObject log = get_shop_log_log(self);
        try {
            thread.throwStack.push($sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                log = cons(item, log);
                if (item.isString()) {
                    princ(item, UNPROVIDED);
                }
                sublisp_throw($sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD, item);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_log_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }

    public static SubLObject shop_log_log_newline_method(final SubLObject self) {
        return shop_log_add_to_log_method(self, $NEWLINE);
    }

    public static SubLObject shop_log_log_entry_method(final SubLObject self, final SubLObject item) {
        return shop_log_add_to_log_method(self, item);
    }

    public static SubLObject shop_log_log_preformatted_method(final SubLObject self, final SubLObject item) {
        return shop_log_add_to_log_method(self, cons($PRE, item));
    }

    public static SubLObject shop_log_log_fancy_entry_method(final SubLObject self, final SubLObject entry, final SubLObject mod_list) {
        return shop_log_add_to_log_method(self, list($FANCY, entry, mod_list));
    }

    public static SubLObject shop_log_log_heading_method(final SubLObject self, final SubLObject entry) {
        return shop_log_add_to_log_method(self, list($HEADING, entry));
    }

    public static SubLObject shop_log_log_partial_plan_method(final SubLObject self, final SubLObject entry) {
        return shop_log_add_to_log_method(self, list($PARTIAL_PLAN, entry));
    }

    public static SubLObject shop_log_color_log_entry_method(final SubLObject self, final SubLObject item, final SubLObject color) {
        return shop_log_add_to_log_method(self, list($COLOR, color, item));
    }

    public static SubLObject shop_log_warning_method(final SubLObject self, final SubLObject item) {
        return shop_log_color_log_entry_method(self, item, $RED);
    }

    public static SubLObject shop_log_success_method(final SubLObject self, final SubLObject item) {
        return shop_log_color_log_entry_method(self, item, $DARK_GREEN);
    }

    public static SubLObject shop_log_new_section_method(final SubLObject self) {
        return shop_log_add_to_log_method(self, $HR);
    }

    public static SubLObject shop_log_log_planner_rule_method(final SubLObject self, final SubLObject rule) {
        return shop_log_add_to_log_method(self, list($RULE, rule));
    }

    public static SubLObject shop_log_log_inference_method(final SubLObject self, final SubLObject v_bindings, final SubLObject halt_reason, final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        return shop_log_add_to_log_method(self, list($INFERENCE, v_bindings, halt_reason, inference));
    }

    public static SubLObject shop_log_log_multibinding_method(final SubLObject self, final SubLObject mbind) {
        return shop_log_add_to_log_method(self, list($MBIND, mbind));
    }

    public static SubLObject shop_log_planner_rule_link_method(final SubLObject self, final SubLObject entry) {
        final SubLObject rule = second(entry);
        final SubLObject ass = shop_datastructures.shop_basic_planner_rule_assertions_method(rule).first();
        if (NIL != assertion_handles.assertion_p(ass)) {
            cb_show_assertion_readably(ass, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject shop_log_display_fancy_entry_method(final SubLObject self, final SubLObject entry) {
        SubLObject current;
        final SubLObject datum = current = entry.rest();
        SubLObject item = NIL;
        SubLObject mod_list = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        mod_list = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != subl_promotions.memberP($BOLD, mod_list, UNPROVIDED, UNPROVIDED)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(item);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
        } else {
            cdestructuring_bind_error(datum, $list93);
        }
        return NIL;
    }

    public static SubLObject shop_var_name(final SubLObject item) {
        return symbol_name(item.first());
    }

    public static SubLObject shop_log_display_multibinding_method(final SubLObject self, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mb = second(entry);
        final SubLObject alist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_multi_var_term_map(mb))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry_$1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry_$1);
            list_utilities.alist_enter(alist, var, values, UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_simple_var_term_map(mb))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry_$2);
            list_utilities.alist_enter(alist, var, values, UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        Sort.sort(alist, $sym99$STRING_, SHOP_VAR_NAME);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject var2 = NIL;
            SubLObject values2 = NIL;
            destructuring_bind_must_consp(current, datum, $list101);
            var2 = current.first();
            current = values2 = current.rest();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str102$_s____, var2);
            SubLObject cdolist_list_var_$3 = values2;
            SubLObject cur_val = NIL;
            cur_val = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str103$__s, cur_val);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                cur_val = cdolist_list_var_$3.first();
            } 
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject shop_log_inference_link_method(final SubLObject self, final SubLObject log_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = log_entry.rest();
        SubLObject v_bindings = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        v_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        halt_reason = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject num_bindings = length(v_bindings);
            final SubLObject inference_name = $str108$_Examine_Inference_;
            html_newline(TWO_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str109$__returned_bindings___s, num_bindings);
            html_indent(TWO_INTEGER);
            html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str110$_s, halt_reason);
            html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            return NIL;
        }
        cdestructuring_bind_error(datum, $list78);
        return NIL;
    }

    public static SubLObject shop_log_display_color_entry_method(final SubLObject self, final SubLObject log_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = log_entry.rest();
        SubLObject color = NIL;
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        color = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list114);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject color_val = color;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.verify_not_within_html_pre();
                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                final SubLObject _prev_bind_0_$4 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind(T, thread);
                    cb_form(entry, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } else {
            cdestructuring_bind_error(datum, $list114);
        }
        return NIL;
    }

    public static SubLObject shop_log_display_partial_plan_method(final SubLObject self, final SubLObject log_entry) {
        SubLObject cdolist_list_var;
        final SubLObject partial_plan = cdolist_list_var = second(log_entry);
        SubLObject step = NIL;
        step = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_form(step, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            step = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject shop_log_display_switchable_partial_plan_method(final SubLObject self, final SubLObject log_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = NIL;
        final SubLObject isg = get_shop_log_isg(self);
        try {
            thread.throwStack.push($sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
                final SubLObject object_id = cconcatenate($str122$partial_plan_, write_to_string(id, EMPTY_SUBL_OBJECT_ARRAY));
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($$$Partial_Plan);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links(object_id, $str124$_Show_, $str125$_Hide_);
                html_newline(UNPROVIDED);
                dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $PARAGRAPH);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != object_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(object_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    shop_log_display_partial_plan_method(self, log_entry);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                sublisp_throw($sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_log_isg(self, isg);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }

    public static SubLObject shop_log_display_html_log_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = NIL;
        final SubLObject isg = get_shop_log_isg(self);
        final SubLObject log = get_shop_log_log(self);
        try {
            thread.throwStack.push($sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                integer_sequence_generator.integer_sequence_generator_reset(instances.get_slot(self, ISG));
                SubLObject cdolist_list_var = reverse(log);
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (item.isKeyword()) {
                        final SubLObject pcase_var = item;
                        if (pcase_var.eql($HR)) {
                            html_hr(UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($NEWLINE)) {
                                html_newline(UNPROVIDED);
                            }

                    } else
                        if (item.isList()) {
                            final SubLObject pcase_var = item.first();
                            if (pcase_var.eql($PRE)) {
                                html_macros.verify_not_within_html_pre();
                                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                                try {
                                    html_macros.$within_html_pre$.bind(T, thread);
                                    cb_form(item.rest(), UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                                }
                                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            } else
                                if (pcase_var.eql($HEADING)) {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(THREE_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    html_princ(second(item));
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(THREE_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                } else {
                                    final SubLObject method = second(assoc(item.first(), $shop_log_entry_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                    methods.funcall_instance_method_with_1_args(self, method, item);
                                }

                        } else
                            if (item.isString()) {
                                if (NIL != string_utilities.substringP($str133$__, item, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    cb_form(item, UNPROVIDED, UNPROVIDED);
                                } else {
                                    html_princ(item);
                                }
                                html_br();
                            }


                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                sublisp_throw($sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_log_isg(self, isg);
                    set_shop_log_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }

    public static SubLObject shop_log_set_verbosity_method(final SubLObject self, final SubLObject new_verbose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = NIL;
        SubLObject verbose = get_shop_log_verbose(self);
        try {
            thread.throwStack.push($sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                if (new_verbose.isNumber()) {
                    verbose = new_verbose;
                } else
                    if (new_verbose.isKeyword()) {
                        verbose = assoc(new_verbose, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), symbol_function(MEMBER), UNPROVIDED).rest();
                    } else {
                        Errors.cerror($str140$_s_is_not_a_permissible_value_for, new_verbose);
                    }

                sublisp_throw($sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_log_verbose(self, verbose);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }

    public static SubLObject declare_shop_log_file() {
        declareFunction(me, "process_log_p", "PROCESS-LOG-P", 1, 0, false);
        declareFunction(me, "html_process_log_p", "HTML-PROCESS-LOG-P", 1, 0, false);
        declareFunction(me, "get_shop_log_isg", "GET-SHOP-LOG-ISG", 1, 0, false);
        declareFunction(me, "set_shop_log_isg", "SET-SHOP-LOG-ISG", 2, 0, false);
        declareFunction(me, "get_shop_log_verbose", "GET-SHOP-LOG-VERBOSE", 1, 0, false);
        declareFunction(me, "set_shop_log_verbose", "SET-SHOP-LOG-VERBOSE", 2, 0, false);
        declareFunction(me, "get_shop_log_stream", "GET-SHOP-LOG-STREAM", 1, 0, false);
        declareFunction(me, "set_shop_log_stream", "SET-SHOP-LOG-STREAM", 2, 0, false);
        declareFunction(me, "get_shop_log_log", "GET-SHOP-LOG-LOG", 1, 0, false);
        declareFunction(me, "set_shop_log_log", "SET-SHOP-LOG-LOG", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_log_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_log_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_log_p", "SHOP-LOG-P", 1, 0, false);
        declareFunction(me, "shop_log_initialize_method", "SHOP-LOG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_log_add_to_log_method", "SHOP-LOG-ADD-TO-LOG-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_log_newline_method", "SHOP-LOG-LOG-NEWLINE-METHOD", 1, 0, false);
        declareFunction(me, "shop_log_log_entry_method", "SHOP-LOG-LOG-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_log_preformatted_method", "SHOP-LOG-LOG-PREFORMATTED-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_log_fancy_entry_method", "SHOP-LOG-LOG-FANCY-ENTRY-METHOD", 3, 0, false);
        declareFunction(me, "shop_log_log_heading_method", "SHOP-LOG-LOG-HEADING-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_log_partial_plan_method", "SHOP-LOG-LOG-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_color_log_entry_method", "SHOP-LOG-COLOR-LOG-ENTRY-METHOD", 3, 0, false);
        declareFunction(me, "shop_log_warning_method", "SHOP-LOG-WARNING-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_success_method", "SHOP-LOG-SUCCESS-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_new_section_method", "SHOP-LOG-NEW-SECTION-METHOD", 1, 0, false);
        declareFunction(me, "shop_log_log_planner_rule_method", "SHOP-LOG-LOG-PLANNER-RULE-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_log_inference_method", "SHOP-LOG-LOG-INFERENCE-METHOD", 4, 0, false);
        declareFunction(me, "shop_log_log_multibinding_method", "SHOP-LOG-LOG-MULTIBINDING-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_planner_rule_link_method", "SHOP-LOG-PLANNER-RULE-LINK-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_display_fancy_entry_method", "SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "shop_var_name", "SHOP-VAR-NAME", 1, 0, false);
        declareFunction(me, "shop_log_display_multibinding_method", "SHOP-LOG-DISPLAY-MULTIBINDING-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_inference_link_method", "SHOP-LOG-INFERENCE-LINK-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_display_color_entry_method", "SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_display_partial_plan_method", "SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_display_switchable_partial_plan_method", "SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_log_display_html_log_method", "SHOP-LOG-DISPLAY-HTML-LOG-METHOD", 1, 0, false);
        declareFunction(me, "shop_log_set_verbosity_method", "SHOP-LOG-SET-VERBOSITY-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_log_file() {
        deflexical("*SHOP-LOG-ENTRY-MAP*", $list129);
        return NIL;
    }

    public static SubLObject setup_shop_log_file() {
        interfaces.new_interface(PROCESS_LOG, NIL, NIL, $list1);
        interfaces.new_interface(HTML_PROCESS_LOG, PROCESS_LOG, $list3, $list4);
        classes.subloop_new_class(SHOP_LOG, OBJECT, $list7, NIL, $list8);
        classes.class_set_implements_slot_listeners(SHOP_LOG, NIL);
        classes.subloop_note_class_initialization_function(SHOP_LOG, SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_LOG, SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE);
        subloop_reserved_initialize_shop_log_class(SHOP_LOG);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_LOG, $list19, NIL, $list20);
        methods.subloop_register_instance_method(SHOP_LOG, INITIALIZE, SHOP_LOG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_LOG, SHOP_LOG, $list24, $list25, $list26);
        methods.subloop_register_instance_method(SHOP_LOG, ADD_TO_LOG, SHOP_LOG_ADD_TO_LOG_METHOD);
        methods.methods_incorporate_instance_method(LOG_NEWLINE, SHOP_LOG, $list30, NIL, $list31);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_NEWLINE, SHOP_LOG_LOG_NEWLINE_METHOD);
        methods.methods_incorporate_instance_method(LOG_ENTRY, SHOP_LOG, $list30, $list25, $list35);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_ENTRY, SHOP_LOG_LOG_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(LOG_PREFORMATTED, SHOP_LOG, $list30, $list25, $list38);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_PREFORMATTED, SHOP_LOG_LOG_PREFORMATTED_METHOD);
        methods.methods_incorporate_instance_method(LOG_FANCY_ENTRY, SHOP_LOG, $list30, $list42, $list43);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_FANCY_ENTRY, SHOP_LOG_LOG_FANCY_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(LOG_HEADING, SHOP_LOG, $list30, $list47, $list48);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_HEADING, SHOP_LOG_LOG_HEADING_METHOD);
        methods.methods_incorporate_instance_method(LOG_PARTIAL_PLAN, SHOP_LOG, $list30, $list47, $list52);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_PARTIAL_PLAN, SHOP_LOG_LOG_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method(COLOR_LOG_ENTRY, SHOP_LOG, $list30, $list56, $list57);
        methods.subloop_register_instance_method(SHOP_LOG, COLOR_LOG_ENTRY, SHOP_LOG_COLOR_LOG_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(WARNING, SHOP_LOG, $list30, $list25, $list61);
        methods.subloop_register_instance_method(SHOP_LOG, WARNING, SHOP_LOG_WARNING_METHOD);
        methods.methods_incorporate_instance_method(SUCCESS, SHOP_LOG, $list30, $list25, $list65);
        methods.subloop_register_instance_method(SHOP_LOG, SUCCESS, SHOP_LOG_SUCCESS_METHOD);
        methods.methods_incorporate_instance_method(NEW_SECTION, SHOP_LOG, $list30, NIL, $list69);
        methods.subloop_register_instance_method(SHOP_LOG, NEW_SECTION, SHOP_LOG_NEW_SECTION_METHOD);
        methods.methods_incorporate_instance_method(LOG_PLANNER_RULE, SHOP_LOG, $list30, $list73, $list74);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_PLANNER_RULE, SHOP_LOG_LOG_PLANNER_RULE_METHOD);
        methods.methods_incorporate_instance_method(LOG_INFERENCE, SHOP_LOG, $list30, $list78, $list79);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_INFERENCE, SHOP_LOG_LOG_INFERENCE_METHOD);
        methods.methods_incorporate_instance_method(LOG_MULTIBINDING, SHOP_LOG, $list30, $list84, $list85);
        methods.subloop_register_instance_method(SHOP_LOG, LOG_MULTIBINDING, SHOP_LOG_LOG_MULTIBINDING_METHOD);
        methods.methods_incorporate_instance_method(PLANNER_RULE_LINK, SHOP_LOG, $list24, $list47, $list89);
        methods.subloop_register_instance_method(SHOP_LOG, PLANNER_RULE_LINK, SHOP_LOG_PLANNER_RULE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_FANCY_ENTRY, SHOP_LOG, $list24, $list47, $list92);
        methods.subloop_register_instance_method(SHOP_LOG, DISPLAY_FANCY_ENTRY, SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_MULTIBINDING, SHOP_LOG, $list24, $list47, $list97);
        methods.subloop_register_instance_method(SHOP_LOG, DISPLAY_MULTIBINDING, SHOP_LOG_DISPLAY_MULTIBINDING_METHOD);
        methods.methods_incorporate_instance_method(INFERENCE_LINK, SHOP_LOG, $list24, $list106, $list107);
        methods.subloop_register_instance_method(SHOP_LOG, INFERENCE_LINK, SHOP_LOG_INFERENCE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_COLOR_ENTRY, SHOP_LOG, $list24, $list106, $list113);
        methods.subloop_register_instance_method(SHOP_LOG, DISPLAY_COLOR_ENTRY, SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_PARTIAL_PLAN, SHOP_LOG, $list24, $list106, $list117);
        methods.subloop_register_instance_method(SHOP_LOG, DISPLAY_PARTIAL_PLAN, SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_SWITCHABLE_PARTIAL_PLAN, SHOP_LOG, $list24, $list106, $list120);
        methods.subloop_register_instance_method(SHOP_LOG, DISPLAY_SWITCHABLE_PARTIAL_PLAN, SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_HTML_LOG, SHOP_LOG, $list30, NIL, $list131);
        methods.subloop_register_instance_method(SHOP_LOG, DISPLAY_HTML_LOG, SHOP_LOG_DISPLAY_HTML_LOG_METHOD);
        methods.methods_incorporate_instance_method(SET_VERBOSITY, SHOP_LOG, $list30, $list136, $list137);
        methods.subloop_register_instance_method(SHOP_LOG, SET_VERBOSITY, SHOP_LOG_SET_VERBOSITY_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_log_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_log_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_log_file();
    }

    
}

/**
 * Total time: 465 ms
 */
