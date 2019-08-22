/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_log extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shop_log();

 public static final String myName = "com.cyc.cycjava.cycl.shop_log";


    // deflexical
    // Maps log entry types to the methods of SHOP-LOG that will display them.
    /**
     * Maps log entry types to the methods of SHOP-LOG that will display them.
     */
    @LispMethod(comment = "Maps log entry types to the methods of SHOP-LOG that will display them.\ndeflexical")
    private static final SubLSymbol $shop_log_entry_map$ = makeSymbol("*SHOP-LOG-ENTRY-MAP*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol PROCESS_LOG = makeSymbol("PROCESS-LOG");

    static private final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-ENTRY"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WARNING"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUCCESS"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-SECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-HTML-LOG"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol HTML_PROCESS_LOG = makeSymbol("HTML-PROCESS-LOG");

    static private final SubLList $list3 = list(makeKeyword("EXTENDS"), makeSymbol("PROCESS-LOG"));

    static private final SubLList $list4 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLOR-LOG-ENTRY"), list(makeSymbol("ITEM"), makeSymbol("COLOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-FANCY-ENTRY"), list(makeSymbol("ITEM"), makeSymbol("MOD-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-HEADING"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PREFORMATTED"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SHOP_LOG = makeSymbol("SHOP-LOG");

    static private final SubLList $list7 = list(makeSymbol("HTML-PROCESS-LOG"));

    static private final SubLList $list8 = list(new SubLObject[]{ list(makeSymbol("LOG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VERBOSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ISG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-LOG"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VERBOSITY"), list(makeSymbol("NEW-VERBOSE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-FANCY-ENTRY"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-COLOR-ENTRY"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFERENCE-LINK"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("METHOD-LINK"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-PARTIAL-PLAN"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PLANNER-RULE"), list(makeSymbol("RULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-INFERENCE"), list(makeSymbol("BINDINGS"), makeSymbol("RESULTS"), makeSymbol("HALT-STATUS"), makeSymbol("INFERENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PARTIAL-PLAN"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE");

    static private final SubLList $list19 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list20 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("STREAM"), T), list(makeSymbol("CSETQ"), makeSymbol("LOG"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ISG"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    private static final SubLSymbol SHOP_LOG_INITIALIZE_METHOD = makeSymbol("SHOP-LOG-INITIALIZE-METHOD");

    static private final SubLList $list24 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list25 = list(makeSymbol("ITEM"));

    static private final SubLList $list26 = list(list(makeSymbol("CSETQ"), makeSymbol("LOG"), list(makeSymbol("CONS"), makeSymbol("ITEM"), makeSymbol("LOG"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("ITEM")), list(makeSymbol("PRINC"), makeSymbol("ITEM"))), list(RET, makeSymbol("ITEM")));

    static private final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    private static final SubLSymbol SHOP_LOG_ADD_TO_LOG_METHOD = makeSymbol("SHOP-LOG-ADD-TO-LOG-METHOD");

    static private final SubLList $list30 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list31 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeKeyword("NEWLINE"))));

    private static final SubLSymbol SHOP_LOG_LOG_NEWLINE_METHOD = makeSymbol("SHOP-LOG-LOG-NEWLINE-METHOD");

    static private final SubLList $list35 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeSymbol("ITEM"))));

    private static final SubLSymbol SHOP_LOG_LOG_ENTRY_METHOD = makeSymbol("SHOP-LOG-LOG-ENTRY-METHOD");

    private static final SubLSymbol LOG_PREFORMATTED = makeSymbol("LOG-PREFORMATTED");

    static private final SubLList $list38 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeKeyword("PRE"), makeSymbol("ITEM")))));

    private static final SubLSymbol SHOP_LOG_LOG_PREFORMATTED_METHOD = makeSymbol("SHOP-LOG-LOG-PREFORMATTED-METHOD");

    static private final SubLList $list42 = list(makeSymbol("ENTRY"), makeSymbol("MOD-LIST"));

    static private final SubLList $list43 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("FANCY"), makeSymbol("ENTRY"), makeSymbol("MOD-LIST")))));

    private static final SubLSymbol SHOP_LOG_LOG_FANCY_ENTRY_METHOD = makeSymbol("SHOP-LOG-LOG-FANCY-ENTRY-METHOD");

    private static final SubLSymbol LOG_HEADING = makeSymbol("LOG-HEADING");

    static private final SubLList $list47 = list(makeSymbol("ENTRY"));

    static private final SubLList $list48 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("HEADING"), makeSymbol("ENTRY")))));

    private static final SubLSymbol SHOP_LOG_LOG_HEADING_METHOD = makeSymbol("SHOP-LOG-LOG-HEADING-METHOD");

    private static final SubLSymbol LOG_PARTIAL_PLAN = makeSymbol("LOG-PARTIAL-PLAN");

    static private final SubLList $list52 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("PARTIAL-PLAN"), makeSymbol("ENTRY")))));

    private static final SubLSymbol SHOP_LOG_LOG_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-LOG-LOG-PARTIAL-PLAN-METHOD");

    private static final SubLSymbol COLOR_LOG_ENTRY = makeSymbol("COLOR-LOG-ENTRY");

    static private final SubLList $list56 = list(makeSymbol("ITEM"), makeSymbol("COLOR"));

    static private final SubLList $list57 = list(makeString("Log ITEM so it shows in HTML in COLOR."), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("COLOR"), makeSymbol("COLOR"), makeSymbol("ITEM")))));

    private static final SubLSymbol SHOP_LOG_COLOR_LOG_ENTRY_METHOD = makeSymbol("SHOP-LOG-COLOR-LOG-ENTRY-METHOD");

    static private final SubLList $list61 = list(makeString("Log item in a warning color (red)"), list(RET, list(makeSymbol("COLOR-LOG-ENTRY"), makeSymbol("SELF"), makeSymbol("ITEM"), makeKeyword("RED"))));

    private static final SubLSymbol SHOP_LOG_WARNING_METHOD = makeSymbol("SHOP-LOG-WARNING-METHOD");

    static private final SubLList $list65 = list(makeString("Log item in a success color (green)"), list(RET, list(makeSymbol("COLOR-LOG-ENTRY"), makeSymbol("SELF"), makeSymbol("ITEM"), makeKeyword("DARK-GREEN"))));

    private static final SubLSymbol SHOP_LOG_SUCCESS_METHOD = makeSymbol("SHOP-LOG-SUCCESS-METHOD");

    private static final SubLSymbol NEW_SECTION = makeSymbol("NEW-SECTION");

    static private final SubLList $list69 = list(makeString("Signals a horizontal rule in the log output"), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeKeyword("HR"))));

    private static final SubLSymbol SHOP_LOG_NEW_SECTION_METHOD = makeSymbol("SHOP-LOG-NEW-SECTION-METHOD");

    private static final SubLSymbol LOG_PLANNER_RULE = makeSymbol("LOG-PLANNER-RULE");

    static private final SubLList $list73 = list(makeSymbol("RULE"));

    static private final SubLList $list74 = list(makeString("@param RULE shop-basic-planner-rule-p"), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), $RULE, makeSymbol("RULE")))));

    private static final SubLSymbol SHOP_LOG_LOG_PLANNER_RULE_METHOD = makeSymbol("SHOP-LOG-LOG-PLANNER-RULE-METHOD");

    private static final SubLSymbol LOG_INFERENCE = makeSymbol("LOG-INFERENCE");

    static private final SubLList $list78 = list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE"));

    static private final SubLList $list79 = list(makeString("@param BINDINGS listp\n   @param INFERENCE inference-p"), list(makeSymbol("CHECK-TYPE"), makeSymbol("INFERENCE"), makeSymbol("INFERENCE-P")), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("INFERENCE"), makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")))));

    private static final SubLSymbol SHOP_LOG_LOG_INFERENCE_METHOD = makeSymbol("SHOP-LOG-LOG-INFERENCE-METHOD");

    private static final SubLSymbol LOG_MULTIBINDING = makeSymbol("LOG-MULTIBINDING");

    static private final SubLList $list84 = list(makeSymbol("MBIND"));

    static private final SubLList $list85 = list(makeString("@param RULE multibinding-p"), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("MBIND"), makeSymbol("MBIND")))));

    private static final SubLSymbol SHOP_LOG_LOG_MULTIBINDING_METHOD = makeSymbol("SHOP-LOG-LOG-MULTIBINDING-METHOD");

    private static final SubLSymbol PLANNER_RULE_LINK = makeSymbol("PLANNER-RULE-LINK");

    static private final SubLList $list89 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RULE"), list(makeSymbol("SECOND"), makeSymbol("ENTRY"))), list(makeSymbol("ASS"), list(makeSymbol("FIRST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSERTIONS"), makeSymbol("SHOP-BASIC-PLANNER-RULE")), makeSymbol("RULE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("ASSERTION-P"), makeSymbol("ASS")), list(makeSymbol("CB-SHOW-ASSERTION-READABLY"), makeSymbol("ASS"))), list(RET, NIL)));

    private static final SubLSymbol SHOP_LOG_PLANNER_RULE_LINK_METHOD = makeSymbol("SHOP-LOG-PLANNER-RULE-LINK-METHOD");

    private static final SubLSymbol DISPLAY_FANCY_ENTRY = makeSymbol("DISPLAY-FANCY-ENTRY");

    static private final SubLList $list92 = list(makeString("only :bold supported for now"), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("ITEM"), makeSymbol("MOD-LIST")), list(makeSymbol("REST"), makeSymbol("ENTRY")), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $BOLD, makeSymbol("MOD-LIST")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeSymbol("ITEM"))))), list(RET, NIL));

    static private final SubLList $list93 = list(makeSymbol("ITEM"), makeSymbol("MOD-LIST"));

    private static final SubLSymbol SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD = makeSymbol("SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD");

    private static final SubLSymbol DISPLAY_MULTIBINDING = makeSymbol("DISPLAY-MULTIBINDING");

    static private final SubLList $list97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MB"), list(makeSymbol("SECOND"), makeSymbol("ENTRY"))), list(makeSymbol("ALIST"), NIL)), list(makeSymbol("DO-MBIND"), list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("MB")), list(makeSymbol("ALIST-ENTER"), makeSymbol("ALIST"), makeSymbol("VAR"), makeSymbol("VALUES"))), list(makeSymbol("SORT"), makeSymbol("ALIST"), list(QUOTE, makeSymbol("STRING<")), list(QUOTE, makeSymbol("SHOP-VAR-NAME"))), list(makeSymbol("DO-ALIST"), list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("ALIST")), list(makeSymbol("HTML-FORMAT"), makeString("~s -->"), makeSymbol("VAR")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAL"), makeSymbol("VALUES")), list(makeSymbol("HTML-FORMAT"), makeString(" ~s"), makeSymbol("CUR-VAL"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL)));

    static private final SubLSymbol $sym99$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol SHOP_VAR_NAME = makeSymbol("SHOP-VAR-NAME");

    static private final SubLList $list101 = cons(makeSymbol("VAR"), makeSymbol("VALUES"));

    static private final SubLString $str102$_s____ = makeString("~s -->");

    static private final SubLString $str103$__s = makeString(" ~s");

    private static final SubLSymbol SHOP_LOG_DISPLAY_MULTIBINDING_METHOD = makeSymbol("SHOP-LOG-DISPLAY-MULTIBINDING-METHOD");

    private static final SubLSymbol INFERENCE_LINK = makeSymbol("INFERENCE-LINK");

    static private final SubLList $list106 = list(makeSymbol("LOG-ENTRY"));

    static private final SubLList $list107 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")), list(makeSymbol("REST"), makeSymbol("LOG-ENTRY")), list(makeSymbol("CLET"), list(list(makeSymbol("NUM-BINDINGS"), list(makeSymbol("LENGTH"), makeSymbol("BINDINGS"))), list(makeSymbol("INFERENCE-NAME"), makeString("[Examine Inference]"))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-FORMAT"), makeString("# returned bindings: ~s"), makeSymbol("NUM-BINDINGS")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("HTML-EM"), list(makeSymbol("HTML-FORMAT"), makeString("~s"), makeSymbol("HALT-REASON"))), list(makeSymbol("PUNLESS-FEATURE"), list(makeKeyword("OR"), makeKeyword("CYC-OPENCYC"), makeKeyword("CYC-RESEARCHCYC")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("CB-LINK"), makeKeyword("INFERENCE"), makeSymbol("INFERENCE"), NIL, makeSymbol("INFERENCE-NAME"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL)));

    static private final SubLString $str108$_Examine_Inference_ = makeString("[Examine Inference]");

    static private final SubLString $str109$__returned_bindings___s = makeString("# returned bindings: ~s");

    static private final SubLString $str110$_s = makeString("~s");

    private static final SubLSymbol SHOP_LOG_INFERENCE_LINK_METHOD = makeSymbol("SHOP-LOG-INFERENCE-LINK-METHOD");

    private static final SubLSymbol DISPLAY_COLOR_ENTRY = makeSymbol("DISPLAY-COLOR-ENTRY");

    static private final SubLList $list113 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("COLOR"), makeSymbol("ENTRY")), list(makeSymbol("REST"), makeSymbol("LOG-ENTRY")), list(makeSymbol("HTML-FONT-COLOR"), list(makeSymbol("COLOR")), list(makeSymbol("HTML-PRE"), list(makeSymbol("CB-FORM"), makeSymbol("ENTRY"))))), list(RET, NIL));

    static private final SubLList $list114 = list(makeSymbol("COLOR"), makeSymbol("ENTRY"));

    private static final SubLSymbol SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD = makeSymbol("SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD");

    private static final SubLSymbol DISPLAY_PARTIAL_PLAN = makeSymbol("DISPLAY-PARTIAL-PLAN");

    static private final SubLList $list117 = list(makeString("Display partial plan cleanly"), list(makeSymbol("CLET"), list(list(makeSymbol("PARTIAL-PLAN"), list(makeSymbol("SECOND"), makeSymbol("LOG-ENTRY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("STEP"), makeSymbol("PARTIAL-PLAN")), list(makeSymbol("CB-FORM"), makeSymbol("STEP")), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL));

    private static final SubLSymbol SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD");

    private static final SubLSymbol DISPLAY_SWITCHABLE_PARTIAL_PLAN = makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN");

    static private final SubLList $list120 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("ISG"))), list(makeSymbol("OBJECT-ID"), list(makeSymbol("CCONCATENATE"), makeString("partial-plan-"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("ID"))))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Partial Plan"))), list(makeSymbol("HTML-INDENT")), list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"), makeSymbol("OBJECT-ID"), makeString("[Show]"), makeString("[Hide]")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"), list(makeSymbol("OBJECT-ID"), makeKeyword("INITIAL-VISIBILITY"), makeKeyword("INVISIBLE"), makeKeyword("FLOW-TYPE"), makeKeyword("PARAGRAPH")), list(makeSymbol("DISPLAY-PARTIAL-PLAN"), makeSymbol("SELF"), makeSymbol("LOG-ENTRY")))), list(RET, NIL));

    static private final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    static private final SubLString $str122$partial_plan_ = makeString("partial-plan-");

    static private final SubLString $$$Partial_Plan = makeString("Partial Plan");

    static private final SubLString $str124$_Show_ = makeString("[Show]");

    static private final SubLString $str125$_Hide_ = makeString("[Hide]");

    private static final SubLSymbol SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD");

    static private final SubLList $list129 = list(list(makeKeyword("COLOR"), makeSymbol("DISPLAY-COLOR-ENTRY")), list($RULE, makeSymbol("PLANNER-RULE-LINK")), list(makeKeyword("INFERENCE"), makeSymbol("INFERENCE-LINK")), list(makeKeyword("MBIND"), makeSymbol("DISPLAY-MULTIBINDING")), list(makeKeyword("FANCY"), makeSymbol("DISPLAY-FANCY-ENTRY")), list(makeKeyword("PARTIAL-PLAN"), makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN")));

    private static final SubLSymbol DISPLAY_HTML_LOG = makeSymbol("DISPLAY-HTML-LOG");

    static private final SubLList $list131 = list(list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-RESET"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ISG")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), list(makeSymbol("REVERSE"), makeSymbol("LOG"))), list(makeSymbol("PCOND"), list(list(makeSymbol("KEYWORDP"), makeSymbol("ITEM")), list(makeSymbol("PCASE"), makeSymbol("ITEM"), list(makeKeyword("HR"), list(makeSymbol("HTML-HR"))), list(makeKeyword("NEWLINE"), list(makeSymbol("HTML-NEWLINE"))))), list(list(makeSymbol("LISTP"), makeSymbol("ITEM")), list(makeSymbol("PCASE"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), list(makeKeyword("PRE"), list(makeSymbol("HTML-PRE"), list(makeSymbol("CB-FORM"), list(makeSymbol("CDR"), makeSymbol("ITEM"))))), list(makeKeyword("HEADING"), list(makeSymbol("HTML-HEADING"), list(THREE_INTEGER), list(makeSymbol("HTML-PRINC"), list(makeSymbol("SECOND"), makeSymbol("ITEM"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD"), list(makeSymbol("SECOND"), list(makeSymbol("ASSOC"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), makeSymbol("*SHOP-LOG-ENTRY-MAP*"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("METHOD"), makeSymbol("ITEM")))))), list(list(makeSymbol("STRINGP"), makeSymbol("ITEM")), list(makeSymbol("PIF"), list(makeSymbol("SUBSTRING?"), makeString("#$"), makeSymbol("ITEM")), list(makeSymbol("CB-FORM"), makeSymbol("ITEM")), list(makeSymbol("HTML-PRINC"), makeSymbol("ITEM"))), list(makeSymbol("HTML-BR"))))), list(RET, NIL));

    static private final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    static private final SubLString $str133$__ = makeString("#$");

    private static final SubLSymbol SHOP_LOG_DISPLAY_HTML_LOG_METHOD = makeSymbol("SHOP-LOG-DISPLAY-HTML-LOG-METHOD");

    private static final SubLSymbol SET_VERBOSITY = makeSymbol("SET-VERBOSITY");

    static private final SubLList $list136 = list(makeSymbol("NEW-VERBOSE"));

    static private final SubLList $list137 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("NUMBERP"), makeSymbol("NEW-VERBOSE")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), makeSymbol("NEW-VERBOSE"))), list(list(makeSymbol("KEYWORDP"), makeSymbol("NEW-VERBOSE")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), list(makeSymbol("REST"), list(makeSymbol("ASSOC"), makeSymbol("NEW-VERBOSE"), makeSymbol("*SHOP-VERBOSE-KEYS*"), list(makeSymbol("FUNCTION"), makeSymbol("MEMBER")))))), list(T, list(makeSymbol("CERROR"), makeString("~s is not a permissible value for VERBOSE"), makeSymbol("NEW-VERBOSE")))), list(RET, NIL));

    static private final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");

    static private final SubLString $str140$_s_is_not_a_permissible_value_for = makeString("~s is not a permissible value for VERBOSE");

    private static final SubLSymbol SHOP_LOG_SET_VERBOSITY_METHOD = makeSymbol("SHOP-LOG-SET-VERBOSITY-METHOD");

    // Definitions
    public static final SubLObject process_log_p_alt(SubLObject process_log) {
        return interfaces.subloop_instanceof_interface(process_log, PROCESS_LOG);
    }

    // Definitions
    public static SubLObject process_log_p(final SubLObject process_log) {
        return interfaces.subloop_instanceof_interface(process_log, PROCESS_LOG);
    }

    public static final SubLObject html_process_log_p_alt(SubLObject html_process_log) {
        return interfaces.subloop_instanceof_interface(html_process_log, HTML_PROCESS_LOG);
    }

    public static SubLObject html_process_log_p(final SubLObject html_process_log) {
        return interfaces.subloop_instanceof_interface(html_process_log, HTML_PROCESS_LOG);
    }

    public static final SubLObject get_shop_log_isg_alt(SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, FOUR_INTEGER, ISG);
    }

    public static SubLObject get_shop_log_isg(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, FOUR_INTEGER, ISG);
    }

    public static final SubLObject set_shop_log_isg_alt(SubLObject v_shop_log, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, FOUR_INTEGER, ISG);
    }

    public static SubLObject set_shop_log_isg(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, FOUR_INTEGER, ISG);
    }

    public static final SubLObject get_shop_log_verbose_alt(SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, THREE_INTEGER, VERBOSE);
    }

    public static SubLObject get_shop_log_verbose(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, THREE_INTEGER, VERBOSE);
    }

    public static final SubLObject set_shop_log_verbose_alt(SubLObject v_shop_log, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, THREE_INTEGER, VERBOSE);
    }

    public static SubLObject set_shop_log_verbose(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, THREE_INTEGER, VERBOSE);
    }

    public static final SubLObject get_shop_log_stream_alt(SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, TWO_INTEGER, STREAM);
    }

    public static SubLObject get_shop_log_stream(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, TWO_INTEGER, STREAM);
    }

    public static final SubLObject set_shop_log_stream_alt(SubLObject v_shop_log, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, TWO_INTEGER, STREAM);
    }

    public static SubLObject set_shop_log_stream(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, TWO_INTEGER, STREAM);
    }

    public static final SubLObject get_shop_log_log_alt(SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, ONE_INTEGER, LOG);
    }

    public static SubLObject get_shop_log_log(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, ONE_INTEGER, LOG);
    }

    public static final SubLObject set_shop_log_log_alt(SubLObject v_shop_log, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, ONE_INTEGER, LOG);
    }

    public static SubLObject set_shop_log_log(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, ONE_INTEGER, LOG);
    }

    public static final SubLObject subloop_reserved_initialize_shop_log_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_log_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_shop_log_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, LOG, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, VERBOSE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_LOG, ISG, NIL);
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

    public static final SubLObject shop_log_p_alt(SubLObject v_shop_log) {
        return classes.subloop_instanceof_class(v_shop_log, SHOP_LOG);
    }

    public static SubLObject shop_log_p(final SubLObject v_shop_log) {
        return classes.subloop_instanceof_class(v_shop_log, SHOP_LOG);
    }

    public static final SubLObject shop_log_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_log_method = NIL;
            SubLObject isg = com.cyc.cycjava.cycl.shop_log.get_shop_log_isg(self);
            SubLObject verbose = com.cyc.cycjava.cycl.shop_log.get_shop_log_verbose(self);
            SubLObject stream = com.cyc.cycjava.cycl.shop_log.get_shop_log_stream(self);
            SubLObject log = com.cyc.cycjava.cycl.shop_log.get_shop_log_log(self);
            try {
                try {
                    object.object_initialize_method(self);
                    verbose = ZERO_INTEGER;
                    stream = T;
                    log = NIL;
                    isg = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_log.set_shop_log_isg(self, isg);
                            com.cyc.cycjava.cycl.shop_log.set_shop_log_verbose(self, verbose);
                            com.cyc.cycjava.cycl.shop_log.set_shop_log_stream(self, stream);
                            com.cyc.cycjava.cycl.shop_log.set_shop_log_log(self, log);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            }
            return catch_var_for_shop_log_method;
        }
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

    public static final SubLObject shop_log_add_to_log_method_alt(SubLObject self, SubLObject item) {
        {
            SubLObject catch_var_for_shop_log_method = NIL;
            SubLObject log = com.cyc.cycjava.cycl.shop_log.get_shop_log_log(self);
            try {
                try {
                    log = cons(item, log);
                    if (item.isString()) {
                        princ(item, UNPROVIDED);
                    }
                    sublisp_throw($sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD, item);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_log.set_shop_log_log(self, log);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            }
            return catch_var_for_shop_log_method;
        }
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

    public static final SubLObject shop_log_log_newline_method_alt(SubLObject self) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, $NEWLINE);
    }

    public static SubLObject shop_log_log_newline_method(final SubLObject self) {
        return shop_log_add_to_log_method(self, $NEWLINE);
    }

    public static final SubLObject shop_log_log_entry_method_alt(SubLObject self, SubLObject item) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, item);
    }

    public static SubLObject shop_log_log_entry_method(final SubLObject self, final SubLObject item) {
        return shop_log_add_to_log_method(self, item);
    }

    public static final SubLObject shop_log_log_preformatted_method_alt(SubLObject self, SubLObject item) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, cons($PRE, item));
    }

    public static SubLObject shop_log_log_preformatted_method(final SubLObject self, final SubLObject item) {
        return shop_log_add_to_log_method(self, cons($PRE, item));
    }

    public static final SubLObject shop_log_log_fancy_entry_method_alt(SubLObject self, SubLObject entry, SubLObject mod_list) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($FANCY, entry, mod_list));
    }

    public static SubLObject shop_log_log_fancy_entry_method(final SubLObject self, final SubLObject entry, final SubLObject mod_list) {
        return shop_log_add_to_log_method(self, list($FANCY, entry, mod_list));
    }

    public static final SubLObject shop_log_log_heading_method_alt(SubLObject self, SubLObject entry) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($HEADING, entry));
    }

    public static SubLObject shop_log_log_heading_method(final SubLObject self, final SubLObject entry) {
        return shop_log_add_to_log_method(self, list($HEADING, entry));
    }

    public static final SubLObject shop_log_log_partial_plan_method_alt(SubLObject self, SubLObject entry) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($PARTIAL_PLAN, entry));
    }

    public static SubLObject shop_log_log_partial_plan_method(final SubLObject self, final SubLObject entry) {
        return shop_log_add_to_log_method(self, list($PARTIAL_PLAN, entry));
    }

    /**
     * Log ITEM so it shows in HTML in COLOR.
     */
    @LispMethod(comment = "Log ITEM so it shows in HTML in COLOR.")
    public static final SubLObject shop_log_color_log_entry_method_alt(SubLObject self, SubLObject item, SubLObject color) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($COLOR, color, item));
    }

    /**
     * Log ITEM so it shows in HTML in COLOR.
     */
    @LispMethod(comment = "Log ITEM so it shows in HTML in COLOR.")
    public static SubLObject shop_log_color_log_entry_method(final SubLObject self, final SubLObject item, final SubLObject color) {
        return shop_log_add_to_log_method(self, list($COLOR, color, item));
    }

    /**
     * Log item in a warning color (red)
     */
    @LispMethod(comment = "Log item in a warning color (red)")
    public static final SubLObject shop_log_warning_method_alt(SubLObject self, SubLObject item) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_color_log_entry_method(self, item, $RED);
    }

    /**
     * Log item in a warning color (red)
     */
    @LispMethod(comment = "Log item in a warning color (red)")
    public static SubLObject shop_log_warning_method(final SubLObject self, final SubLObject item) {
        return shop_log_color_log_entry_method(self, item, $RED);
    }

    /**
     * Log item in a success color (green)
     */
    @LispMethod(comment = "Log item in a success color (green)")
    public static final SubLObject shop_log_success_method_alt(SubLObject self, SubLObject item) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_color_log_entry_method(self, item, $DARK_GREEN);
    }

    /**
     * Log item in a success color (green)
     */
    @LispMethod(comment = "Log item in a success color (green)")
    public static SubLObject shop_log_success_method(final SubLObject self, final SubLObject item) {
        return shop_log_color_log_entry_method(self, item, $DARK_GREEN);
    }

    /**
     * Signals a horizontal rule in the log output
     */
    @LispMethod(comment = "Signals a horizontal rule in the log output")
    public static final SubLObject shop_log_new_section_method_alt(SubLObject self) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, $HR);
    }

    /**
     * Signals a horizontal rule in the log output
     */
    @LispMethod(comment = "Signals a horizontal rule in the log output")
    public static SubLObject shop_log_new_section_method(final SubLObject self) {
        return shop_log_add_to_log_method(self, $HR);
    }

    /**
     *
     *
     * @param RULE
    shop-basic-planner-rule-p
     * 		
     */
    @LispMethod(comment = "@param RULE\nshop-basic-planner-rule-p")
    public static final SubLObject shop_log_log_planner_rule_method_alt(SubLObject self, SubLObject rule) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($RULE, rule));
    }

    /**
     *
     *
     * @param RULE
    shop-basic-planner-rule-p
     * 		
     */
    @LispMethod(comment = "@param RULE\nshop-basic-planner-rule-p")
    public static SubLObject shop_log_log_planner_rule_method(final SubLObject self, final SubLObject rule) {
        return shop_log_add_to_log_method(self, list($RULE, rule));
    }

    /**
     *
     *
     * @param BINDINGS
    listp
     * 		
     * @param INFERENCE
    inference-p
     * 		
     */
    @LispMethod(comment = "@param BINDINGS\nlistp\r\n\t\t\r\n@param INFERENCE\ninference-p")
    public static final SubLObject shop_log_log_inference_method_alt(SubLObject self, SubLObject v_bindings, SubLObject halt_reason, SubLObject inference) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($INFERENCE, v_bindings, halt_reason, inference));
    }

    /**
     *
     *
     * @param BINDINGS
    listp
     * 		
     * @param INFERENCE
    inference-p
     * 		
     */
    @LispMethod(comment = "@param BINDINGS\nlistp\r\n\t\t\r\n@param INFERENCE\ninference-p")
    public static SubLObject shop_log_log_inference_method(final SubLObject self, final SubLObject v_bindings, final SubLObject halt_reason, final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        return shop_log_add_to_log_method(self, list($INFERENCE, v_bindings, halt_reason, inference));
    }

    /**
     *
     *
     * @param RULE
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param RULE\nmultibinding-p")
    public static final SubLObject shop_log_log_multibinding_method_alt(SubLObject self, SubLObject mbind) {
        return com.cyc.cycjava.cycl.shop_log.shop_log_add_to_log_method(self, list($MBIND, mbind));
    }

    /**
     *
     *
     * @param RULE
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param RULE\nmultibinding-p")
    public static SubLObject shop_log_log_multibinding_method(final SubLObject self, final SubLObject mbind) {
        return shop_log_add_to_log_method(self, list($MBIND, mbind));
    }

    public static final SubLObject shop_log_planner_rule_link_method_alt(SubLObject self, SubLObject entry) {
        {
            SubLObject rule = second(entry);
            SubLObject ass = shop_datastructures.shop_basic_planner_rule_assertions_method(rule).first();
            if (NIL != assertion_handles.assertion_p(ass)) {
                cb_show_assertion_readably(ass, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject shop_log_planner_rule_link_method(final SubLObject self, final SubLObject entry) {
        final SubLObject rule = second(entry);
        final SubLObject ass = shop_datastructures.shop_basic_planner_rule_assertions_method(rule).first();
        if (NIL != assertion_handles.assertion_p(ass)) {
            cb_show_assertion_readably(ass, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * only :bold supported for now
     */
    @LispMethod(comment = "only :bold supported for now")
    public static final SubLObject shop_log_display_fancy_entry_method_alt(SubLObject self, SubLObject entry) {
        {
            SubLObject datum = entry.rest();
            SubLObject current = datum;
            SubLObject item = NIL;
            SubLObject mod_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt93);
            mod_list = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != subl_promotions.memberP($BOLD, mod_list, UNPROVIDED, UNPROVIDED)) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(item);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt93);
            }
            return NIL;
        }
    }

    /**
     * only :bold supported for now
     */
    @LispMethod(comment = "only :bold supported for now")
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

    public static final SubLObject shop_var_name_alt(SubLObject item) {
        return symbol_name(item.first());
    }

    public static SubLObject shop_var_name(final SubLObject item) {
        return symbol_name(item.first());
    }

    public static final SubLObject shop_log_display_multibinding_method_alt(SubLObject self, SubLObject entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mb = second(entry);
                SubLObject alist = NIL;
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_multi_var_term_map(mb)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry_1 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry_1);
                                list_utilities.alist_enter(alist, var, values, UNPROVIDED);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_simple_var_term_map(mb)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry_2);
                                list_utilities.alist_enter(alist, var, values, UNPROVIDED);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                Sort.sort(alist, $sym99$STRING_, SHOP_VAR_NAME);
                {
                    SubLObject cdolist_list_var = alist;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject var = NIL;
                            SubLObject values = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt101);
                            var = current.first();
                            current = current.rest();
                            values = current;
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt102$_s____, var);
                            {
                                SubLObject cdolist_list_var_3 = values;
                                SubLObject cur_val = NIL;
                                for (cur_val = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , cur_val = cdolist_list_var_3.first()) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt103$__s, cur_val);
                                }
                            }
                            html_newline(UNPROVIDED);
                        }
                    }
                }
                return NIL;
            }
        }
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

    public static final SubLObject shop_log_inference_link_method_alt(SubLObject self, SubLObject log_entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = log_entry.rest();
                SubLObject current = datum;
                SubLObject v_bindings = NIL;
                SubLObject halt_reason = NIL;
                SubLObject inference = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt78);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                halt_reason = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                inference = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject num_bindings = length(v_bindings);
                        SubLObject inference_name = $str_alt108$_Examine_Inference_;
                        html_newline(TWO_INTEGER);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt109$__returned_bindings___s, num_bindings);
                        html_indent(TWO_INTEGER);
                        html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt110$_s, halt_reason);
                        html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                        html_indent(TWO_INTEGER);
                        cb_link($INFERENCE, inference, NIL, inference_name, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                    }
                    return NIL;
                } else {
                    cdestructuring_bind_error(datum, $list_alt78);
                }
            }
            return NIL;
        }
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

    public static final SubLObject shop_log_display_color_entry_method_alt(SubLObject self, SubLObject log_entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = log_entry.rest();
                SubLObject current = datum;
                SubLObject color = NIL;
                SubLObject entry = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt114);
                color = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt114);
                entry = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject color_val = color;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.verify_not_within_html_pre();
                                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_4 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        cb_form(entry, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt114);
                }
                return NIL;
            }
        }
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

    /**
     * Display partial plan cleanly
     */
    @LispMethod(comment = "Display partial plan cleanly")
    public static final SubLObject shop_log_display_partial_plan_method_alt(SubLObject self, SubLObject log_entry) {
        {
            SubLObject partial_plan = second(log_entry);
            SubLObject cdolist_list_var = partial_plan;
            SubLObject step = NIL;
            for (step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , step = cdolist_list_var.first()) {
                cb_form(step, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Display partial plan cleanly
     */
    @LispMethod(comment = "Display partial plan cleanly")
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

    public static final SubLObject shop_log_display_switchable_partial_plan_method_alt(SubLObject self, SubLObject log_entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_log_method = NIL;
                SubLObject isg = com.cyc.cycjava.cycl.shop_log.get_shop_log_isg(self);
                try {
                    try {
                        {
                            SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
                            SubLObject object_id = cconcatenate($str_alt122$partial_plan_, write_to_string(id, EMPTY_SUBL_OBJECT_ARRAY));
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$Partial_Plan);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_indent(UNPROVIDED);
                            dhtml_macros.dhtml_switch_visibility_links(object_id, $str_alt124$_Show_, $str_alt125$_Hide_);
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
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    com.cyc.cycjava.cycl.shop_log.shop_log_display_partial_plan_method(self, log_entry);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            sublisp_throw($sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_log.set_shop_log_isg(self, isg);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
                }
                return catch_var_for_shop_log_method;
            }
        }
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

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-ENTRY"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WARNING"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUCCESS"), list(makeSymbol("ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-SECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-HTML-LOG"), NIL, makeKeyword("PUBLIC")));

    public static final SubLObject shop_log_display_html_log_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_log_method = NIL;
                SubLObject isg = com.cyc.cycjava.cycl.shop_log.get_shop_log_isg(self);
                SubLObject log = com.cyc.cycjava.cycl.shop_log.get_shop_log_log(self);
                try {
                    try {
                        integer_sequence_generator.integer_sequence_generator_reset(instances.get_slot(self, ISG));
                        {
                            SubLObject cdolist_list_var = reverse(log);
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                if (item.isKeyword()) {
                                    {
                                        SubLObject pcase_var = item;
                                        if (pcase_var.eql($HR)) {
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (pcase_var.eql($NEWLINE)) {
                                                html_newline(UNPROVIDED);
                                            }
                                        }
                                    }
                                } else {
                                    if (item.isList()) {
                                        {
                                            SubLObject pcase_var = item.first();
                                            if (pcase_var.eql($PRE)) {
                                                html_macros.verify_not_within_html_pre();
                                                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                                                    try {
                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                        cb_form(item.rest(), UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                            } else {
                                                if (pcase_var.eql($HEADING)) {
                                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_markup(THREE_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    html_princ(second(item));
                                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_markup(THREE_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                } else {
                                                    {
                                                        SubLObject method = second(assoc(item.first(), $shop_log_entry_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                                        methods.funcall_instance_method_with_1_args(self, method, item);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (item.isString()) {
                                            if (NIL != string_utilities.substringP($str_alt133$__, item, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                cb_form(item, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                html_princ(item);
                                            }
                                            html_br();
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_log.set_shop_log_isg(self, isg);
                                com.cyc.cycjava.cycl.shop_log.set_shop_log_log(self, log);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
                }
                return catch_var_for_shop_log_method;
            }
        }
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

    static private final SubLList $list_alt3 = list(makeKeyword("EXTENDS"), makeSymbol("PROCESS-LOG"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLOR-LOG-ENTRY"), list(makeSymbol("ITEM"), makeSymbol("COLOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-FANCY-ENTRY"), list(makeSymbol("ITEM"), makeSymbol("MOD-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-HEADING"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PREFORMATTED"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt7 = list(makeSymbol("HTML-PROCESS-LOG"));

    static private final SubLList $list_alt8 = list(new SubLObject[]{ list(makeSymbol("LOG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VERBOSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ISG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-LOG"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VERBOSITY"), list(makeSymbol("NEW-VERBOSE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-FANCY-ENTRY"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-COLOR-ENTRY"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFERENCE-LINK"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("METHOD-LINK"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-PARTIAL-PLAN"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN"), list(makeSymbol("LOG-ENTRY")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PLANNER-RULE"), list(makeSymbol("RULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-INFERENCE"), list(makeSymbol("BINDINGS"), makeSymbol("RESULTS"), makeSymbol("HALT-STATUS"), makeSymbol("INFERENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOG-PARTIAL-PLAN"), list(makeSymbol("ENTRY")), makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt19 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("STREAM"), T), list(makeSymbol("CSETQ"), makeSymbol("LOG"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ISG"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR"))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt24 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt25 = list(makeSymbol("ITEM"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("CSETQ"), makeSymbol("LOG"), list(makeSymbol("CONS"), makeSymbol("ITEM"), makeSymbol("LOG"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("ITEM")), list(makeSymbol("PRINC"), makeSymbol("ITEM"))), list(RET, makeSymbol("ITEM")));

    static private final SubLList $list_alt30 = list(makeKeyword("PUBLIC"));

    public static final SubLObject shop_log_set_verbosity_method_alt(SubLObject self, SubLObject new_verbose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_log_method = NIL;
                SubLObject verbose = com.cyc.cycjava.cycl.shop_log.get_shop_log_verbose(self);
                try {
                    try {
                        if (new_verbose.isNumber()) {
                            verbose = new_verbose;
                        } else {
                            if (new_verbose.isKeyword()) {
                                verbose = assoc(new_verbose, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), symbol_function(MEMBER), UNPROVIDED).rest();
                            } else {
                                Errors.cerror($str_alt140$_s_is_not_a_permissible_value_for, new_verbose);
                            }
                        }
                        sublisp_throw($sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_log.set_shop_log_verbose(self, verbose);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
                }
                return catch_var_for_shop_log_method;
            }
        }
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

    static private final SubLList $list_alt31 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeKeyword("NEWLINE"))));

    static private final SubLList $list_alt35 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeSymbol("ITEM"))));

    static private final SubLList $list_alt38 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeKeyword("PRE"), makeSymbol("ITEM")))));

    static private final SubLList $list_alt42 = list(makeSymbol("ENTRY"), makeSymbol("MOD-LIST"));

    static private final SubLList $list_alt43 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("FANCY"), makeSymbol("ENTRY"), makeSymbol("MOD-LIST")))));

    static private final SubLList $list_alt47 = list(makeSymbol("ENTRY"));

    static private final SubLList $list_alt48 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("HEADING"), makeSymbol("ENTRY")))));

    public static SubLObject declare_shop_log_file() {
        declareFunction("process_log_p", "PROCESS-LOG-P", 1, 0, false);
        declareFunction("html_process_log_p", "HTML-PROCESS-LOG-P", 1, 0, false);
        declareFunction("get_shop_log_isg", "GET-SHOP-LOG-ISG", 1, 0, false);
        declareFunction("set_shop_log_isg", "SET-SHOP-LOG-ISG", 2, 0, false);
        declareFunction("get_shop_log_verbose", "GET-SHOP-LOG-VERBOSE", 1, 0, false);
        declareFunction("set_shop_log_verbose", "SET-SHOP-LOG-VERBOSE", 2, 0, false);
        declareFunction("get_shop_log_stream", "GET-SHOP-LOG-STREAM", 1, 0, false);
        declareFunction("set_shop_log_stream", "SET-SHOP-LOG-STREAM", 2, 0, false);
        declareFunction("get_shop_log_log", "GET-SHOP-LOG-LOG", 1, 0, false);
        declareFunction("set_shop_log_log", "SET-SHOP-LOG-LOG", 2, 0, false);
        declareFunction("subloop_reserved_initialize_shop_log_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shop_log_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE", 1, 0, false);
        declareFunction("shop_log_p", "SHOP-LOG-P", 1, 0, false);
        declareFunction("shop_log_initialize_method", "SHOP-LOG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("shop_log_add_to_log_method", "SHOP-LOG-ADD-TO-LOG-METHOD", 2, 0, false);
        declareFunction("shop_log_log_newline_method", "SHOP-LOG-LOG-NEWLINE-METHOD", 1, 0, false);
        declareFunction("shop_log_log_entry_method", "SHOP-LOG-LOG-ENTRY-METHOD", 2, 0, false);
        declareFunction("shop_log_log_preformatted_method", "SHOP-LOG-LOG-PREFORMATTED-METHOD", 2, 0, false);
        declareFunction("shop_log_log_fancy_entry_method", "SHOP-LOG-LOG-FANCY-ENTRY-METHOD", 3, 0, false);
        declareFunction("shop_log_log_heading_method", "SHOP-LOG-LOG-HEADING-METHOD", 2, 0, false);
        declareFunction("shop_log_log_partial_plan_method", "SHOP-LOG-LOG-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction("shop_log_color_log_entry_method", "SHOP-LOG-COLOR-LOG-ENTRY-METHOD", 3, 0, false);
        declareFunction("shop_log_warning_method", "SHOP-LOG-WARNING-METHOD", 2, 0, false);
        declareFunction("shop_log_success_method", "SHOP-LOG-SUCCESS-METHOD", 2, 0, false);
        declareFunction("shop_log_new_section_method", "SHOP-LOG-NEW-SECTION-METHOD", 1, 0, false);
        declareFunction("shop_log_log_planner_rule_method", "SHOP-LOG-LOG-PLANNER-RULE-METHOD", 2, 0, false);
        declareFunction("shop_log_log_inference_method", "SHOP-LOG-LOG-INFERENCE-METHOD", 4, 0, false);
        declareFunction("shop_log_log_multibinding_method", "SHOP-LOG-LOG-MULTIBINDING-METHOD", 2, 0, false);
        declareFunction("shop_log_planner_rule_link_method", "SHOP-LOG-PLANNER-RULE-LINK-METHOD", 2, 0, false);
        declareFunction("shop_log_display_fancy_entry_method", "SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD", 2, 0, false);
        declareFunction("shop_var_name", "SHOP-VAR-NAME", 1, 0, false);
        declareFunction("shop_log_display_multibinding_method", "SHOP-LOG-DISPLAY-MULTIBINDING-METHOD", 2, 0, false);
        declareFunction("shop_log_inference_link_method", "SHOP-LOG-INFERENCE-LINK-METHOD", 2, 0, false);
        declareFunction("shop_log_display_color_entry_method", "SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD", 2, 0, false);
        declareFunction("shop_log_display_partial_plan_method", "SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction("shop_log_display_switchable_partial_plan_method", "SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction("shop_log_display_html_log_method", "SHOP-LOG-DISPLAY-HTML-LOG-METHOD", 1, 0, false);
        declareFunction("shop_log_set_verbosity_method", "SHOP-LOG-SET-VERBOSITY-METHOD", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt52 = list(list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("PARTIAL-PLAN"), makeSymbol("ENTRY")))));

    static private final SubLList $list_alt56 = list(makeSymbol("ITEM"), makeSymbol("COLOR"));

    static private final SubLList $list_alt57 = list(makeString("Log ITEM so it shows in HTML in COLOR."), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("COLOR"), makeSymbol("COLOR"), makeSymbol("ITEM")))));

    static private final SubLList $list_alt61 = list(makeString("Log item in a warning color (red)"), list(RET, list(makeSymbol("COLOR-LOG-ENTRY"), makeSymbol("SELF"), makeSymbol("ITEM"), makeKeyword("RED"))));

    static private final SubLList $list_alt65 = list(makeString("Log item in a success color (green)"), list(RET, list(makeSymbol("COLOR-LOG-ENTRY"), makeSymbol("SELF"), makeSymbol("ITEM"), makeKeyword("DARK-GREEN"))));

    static private final SubLList $list_alt69 = list(makeString("Signals a horizontal rule in the log output"), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), makeKeyword("HR"))));

    static private final SubLList $list_alt73 = list(makeSymbol("RULE"));

    static private final SubLList $list_alt74 = list(makeString("@param RULE shop-basic-planner-rule-p"), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), $RULE, makeSymbol("RULE")))));

    static private final SubLList $list_alt78 = list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE"));

    static private final SubLList $list_alt79 = list(makeString("@param BINDINGS listp\n   @param INFERENCE inference-p"), list(makeSymbol("CHECK-TYPE"), makeSymbol("INFERENCE"), makeSymbol("INFERENCE-P")), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("INFERENCE"), makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")))));

    static private final SubLList $list_alt84 = list(makeSymbol("MBIND"));

    static private final SubLList $list_alt85 = list(makeString("@param RULE multibinding-p"), list(RET, list(makeSymbol("ADD-TO-LOG"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("MBIND"), makeSymbol("MBIND")))));

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

    static private final SubLList $list_alt89 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RULE"), list(makeSymbol("SECOND"), makeSymbol("ENTRY"))), list(makeSymbol("ASS"), list(makeSymbol("FIRST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSERTIONS"), makeSymbol("SHOP-BASIC-PLANNER-RULE")), makeSymbol("RULE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("ASSERTION-P"), makeSymbol("ASS")), list(makeSymbol("CB-SHOW-ASSERTION-READABLY"), makeSymbol("ASS"))), list(RET, NIL)));

    static private final SubLList $list_alt92 = list(makeString("only :bold supported for now"), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("ITEM"), makeSymbol("MOD-LIST")), list(makeSymbol("REST"), makeSymbol("ENTRY")), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $BOLD, makeSymbol("MOD-LIST")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeSymbol("ITEM"))))), list(RET, NIL));

    static private final SubLList $list_alt93 = list(makeSymbol("ITEM"), makeSymbol("MOD-LIST"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MB"), list(makeSymbol("SECOND"), makeSymbol("ENTRY"))), list(makeSymbol("ALIST"), NIL)), list(makeSymbol("DO-MBIND"), list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("MB")), list(makeSymbol("ALIST-ENTER"), makeSymbol("ALIST"), makeSymbol("VAR"), makeSymbol("VALUES"))), list(makeSymbol("SORT"), makeSymbol("ALIST"), list(QUOTE, makeSymbol("STRING<")), list(QUOTE, makeSymbol("SHOP-VAR-NAME"))), list(makeSymbol("DO-ALIST"), list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("ALIST")), list(makeSymbol("HTML-FORMAT"), makeString("~s -->"), makeSymbol("VAR")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAL"), makeSymbol("VALUES")), list(makeSymbol("HTML-FORMAT"), makeString(" ~s"), makeSymbol("CUR-VAL"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL)));

    static private final SubLList $list_alt101 = cons(makeSymbol("VAR"), makeSymbol("VALUES"));

    static private final SubLString $str_alt102$_s____ = makeString("~s -->");

    static private final SubLString $str_alt103$__s = makeString(" ~s");

    static private final SubLList $list_alt106 = list(makeSymbol("LOG-ENTRY"));

    static private final SubLList $list_alt107 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")), list(makeSymbol("REST"), makeSymbol("LOG-ENTRY")), list(makeSymbol("CLET"), list(list(makeSymbol("NUM-BINDINGS"), list(makeSymbol("LENGTH"), makeSymbol("BINDINGS"))), list(makeSymbol("INFERENCE-NAME"), makeString("[Examine Inference]"))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("HTML-FORMAT"), makeString("# returned bindings: ~s"), makeSymbol("NUM-BINDINGS")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("HTML-EM"), list(makeSymbol("HTML-FORMAT"), makeString("~s"), makeSymbol("HALT-REASON"))), list(makeSymbol("PUNLESS-FEATURE"), list(makeKeyword("OR"), makeKeyword("CYC-OPENCYC"), makeKeyword("CYC-RESEARCHCYC")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("CB-LINK"), makeKeyword("INFERENCE"), makeSymbol("INFERENCE"), NIL, makeSymbol("INFERENCE-NAME"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL)));

    static private final SubLString $str_alt108$_Examine_Inference_ = makeString("[Examine Inference]");

    static private final SubLString $str_alt109$__returned_bindings___s = makeString("# returned bindings: ~s");

    static private final SubLString $str_alt110$_s = makeString("~s");

    static private final SubLList $list_alt113 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("COLOR"), makeSymbol("ENTRY")), list(makeSymbol("REST"), makeSymbol("LOG-ENTRY")), list(makeSymbol("HTML-FONT-COLOR"), list(makeSymbol("COLOR")), list(makeSymbol("HTML-PRE"), list(makeSymbol("CB-FORM"), makeSymbol("ENTRY"))))), list(RET, NIL));

    static private final SubLList $list_alt114 = list(makeSymbol("COLOR"), makeSymbol("ENTRY"));

    static private final SubLList $list_alt117 = list(makeString("Display partial plan cleanly"), list(makeSymbol("CLET"), list(list(makeSymbol("PARTIAL-PLAN"), list(makeSymbol("SECOND"), makeSymbol("LOG-ENTRY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("STEP"), makeSymbol("PARTIAL-PLAN")), list(makeSymbol("CB-FORM"), makeSymbol("STEP")), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL));

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

    static private final SubLList $list_alt120 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("ISG"))), list(makeSymbol("OBJECT-ID"), list(makeSymbol("CCONCATENATE"), makeString("partial-plan-"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("ID"))))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Partial Plan"))), list(makeSymbol("HTML-INDENT")), list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"), makeSymbol("OBJECT-ID"), makeString("[Show]"), makeString("[Hide]")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"), list(makeSymbol("OBJECT-ID"), makeKeyword("INITIAL-VISIBILITY"), makeKeyword("INVISIBLE"), makeKeyword("FLOW-TYPE"), makeKeyword("PARAGRAPH")), list(makeSymbol("DISPLAY-PARTIAL-PLAN"), makeSymbol("SELF"), makeSymbol("LOG-ENTRY")))), list(RET, NIL));

    

    static private final SubLString $str_alt122$partial_plan_ = makeString("partial-plan-");

    static private final SubLString $str_alt124$_Show_ = makeString("[Show]");

    static private final SubLString $str_alt125$_Hide_ = makeString("[Hide]");

    static private final SubLList $list_alt129 = list(list(makeKeyword("COLOR"), makeSymbol("DISPLAY-COLOR-ENTRY")), list($RULE, makeSymbol("PLANNER-RULE-LINK")), list(makeKeyword("INFERENCE"), makeSymbol("INFERENCE-LINK")), list(makeKeyword("MBIND"), makeSymbol("DISPLAY-MULTIBINDING")), list(makeKeyword("FANCY"), makeSymbol("DISPLAY-FANCY-ENTRY")), list(makeKeyword("PARTIAL-PLAN"), makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN")));

    static private final SubLList $list_alt131 = list(list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-RESET"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ISG")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), list(makeSymbol("REVERSE"), makeSymbol("LOG"))), list(makeSymbol("PCOND"), list(list(makeSymbol("KEYWORDP"), makeSymbol("ITEM")), list(makeSymbol("PCASE"), makeSymbol("ITEM"), list(makeKeyword("HR"), list(makeSymbol("HTML-HR"))), list(makeKeyword("NEWLINE"), list(makeSymbol("HTML-NEWLINE"))))), list(list(makeSymbol("LISTP"), makeSymbol("ITEM")), list(makeSymbol("PCASE"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), list(makeKeyword("PRE"), list(makeSymbol("HTML-PRE"), list(makeSymbol("CB-FORM"), list(makeSymbol("CDR"), makeSymbol("ITEM"))))), list(makeKeyword("HEADING"), list(makeSymbol("HTML-HEADING"), list(THREE_INTEGER), list(makeSymbol("HTML-PRINC"), list(makeSymbol("SECOND"), makeSymbol("ITEM"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD"), list(makeSymbol("SECOND"), list(makeSymbol("ASSOC"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), makeSymbol("*SHOP-LOG-ENTRY-MAP*"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("METHOD"), makeSymbol("ITEM")))))), list(list(makeSymbol("STRINGP"), makeSymbol("ITEM")), list(makeSymbol("PIF"), list(makeSymbol("SUBSTRING?"), makeString("#$"), makeSymbol("ITEM")), list(makeSymbol("CB-FORM"), makeSymbol("ITEM")), list(makeSymbol("HTML-PRINC"), makeSymbol("ITEM"))), list(makeSymbol("HTML-BR"))))), list(RET, NIL));

    static private final SubLString $str_alt133$__ = makeString("#$");

    static private final SubLList $list_alt136 = list(makeSymbol("NEW-VERBOSE"));

    static private final SubLList $list_alt137 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("NUMBERP"), makeSymbol("NEW-VERBOSE")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), makeSymbol("NEW-VERBOSE"))), list(list(makeSymbol("KEYWORDP"), makeSymbol("NEW-VERBOSE")), list(makeSymbol("CSETQ"), makeSymbol("VERBOSE"), list(makeSymbol("REST"), list(makeSymbol("ASSOC"), makeSymbol("NEW-VERBOSE"), makeSymbol("*SHOP-VERBOSE-KEYS*"), list(makeSymbol("FUNCTION"), makeSymbol("MEMBER")))))), list(T, list(makeSymbol("CERROR"), makeString("~s is not a permissible value for VERBOSE"), makeSymbol("NEW-VERBOSE")))), list(RET, NIL));

    static private final SubLString $str_alt140$_s_is_not_a_permissible_value_for = makeString("~s is not a permissible value for VERBOSE");
}

/**
 * Total time: 465 ms
 */
