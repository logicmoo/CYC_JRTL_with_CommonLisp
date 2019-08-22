/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_assertion_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_prin1;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SHOP-DISPLAYERS
 * source file: /cyc/top/cycl/shop-displayers.lisp
 * created:     2019/07/03 17:38:27
 */
public final class shop_displayers extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shop_displayers();

 public static final String myName = "com.cyc.cycjava.cycl.shop_displayers";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_plan_task_examiner_link_image$ = makeSymbol("*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_plan_task_examiner_method_image$ = makeSymbol("*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_plan_task_examiner_operator_image$ = makeSymbol("*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_plan_task_examiner_scond_image$ = makeSymbol("*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*");

    static private final SubLString $str1$bl_sdi_gif = makeString("bl_sdi.gif");

    static private final SubLString $str3$gr_sdi_gif = makeString("gr_sdi.gif");

    static private final SubLString $str5$yl_sdi_gif = makeString("yl_sdi.gif");

    static private final SubLString $str7$red_diam_gif = makeString("red_diam.gif");

    private static final SubLSymbol HTML_TASK_DISPLAYER = makeSymbol("HTML-TASK-DISPLAYER");

    private static final SubLSymbol SHOP_INDEXED_OBJECT = makeSymbol("SHOP-INDEXED-OBJECT");

    static private final SubLList $list10 = list(list(makeSymbol("TASK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PLAN-DISPLAYER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("FIND-INSTANCE-BY-ID-STRING"), list(makeSymbol("ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-WITH-TASK"), list(makeSymbol("TASK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CB-TASK-EXAMINER-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-TASK-PAGE"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TASK-EXAMINER-LINK-IMAGE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-INSTANCE");

    private static final SubLSymbol HTML_PLAN_DISPLAYER = makeSymbol("HTML-PLAN-DISPLAYER");

    static private final SubLList $list21 = list(makeSymbol("SHOP-PLAN-I"));

    static private final SubLList $list22 = list(new SubLObject[]{ list(makeSymbol("PLAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TASK-DISPLAYER-HASH-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MBINDING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OPEN-VARIABLES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-HIERARCHICAL-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-PRIMITIVE-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-MBINDING-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-MULTIBINDING-VALUES"), list(makeSymbol("VAR"), makeSymbol("MBINDING"), makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREPARE-TASK-FOR-DISPLAY"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")) });

    private static final SubLSymbol DISPLAY_VARIABLE_SUBSTITUTION = makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION");

    private static final SubLSymbol TASK_DISPLAYER_HASH_TABLE = makeSymbol("TASK-DISPLAYER-HASH-TABLE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-INSTANCE");

    private static final SubLSymbol CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY = makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY");

    private static final SubLSymbol SHOP_PLAN_DISPLAYER_FACTORY = makeSymbol("SHOP-PLAN-DISPLAYER-FACTORY");

    static private final SubLSymbol $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CLASS");

    static private final SubLSymbol $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-INSTANCE");

    private static final SubLSymbol CREATE_PLAN_DISPLAYER = makeSymbol("CREATE-PLAN-DISPLAYER");

    static private final SubLList $list35 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list36 = list(makeSymbol("PLAN"));

    static private final SubLList $list37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLAN-DISPLAYER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("HTML-PLAN-DISPLAYER")), list(QUOTE, makeSymbol("HTML-PLAN-DISPLAYER"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT-WITH-PLAN"), makeSymbol("HTML-PLAN-DISPLAYER")), makeSymbol("PLAN-DISPLAYER"), makeSymbol("PLAN"), makeSymbol("SELF")), list(RET, makeSymbol("PLAN-DISPLAYER"))));

    private static final SubLSymbol INIT_WITH_PLAN = makeSymbol("INIT-WITH-PLAN");

    static private final SubLSymbol $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH = makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-PLAN-DISPLAYER-METHOD");

    private static final SubLSymbol CREATE_TASK_DISPLAYER = makeSymbol("CREATE-TASK-DISPLAYER");

    static private final SubLList $list41 = list(makeSymbol("TASK"));

    static private final SubLList $list42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TASK-DISPLAYER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("HTML-TASK-DISPLAYER")), list(QUOTE, makeSymbol("HTML-TASK-DISPLAYER"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT-WITH-TASK"), makeSymbol("HTML-TASK-DISPLAYER")), makeSymbol("TASK-DISPLAYER"), makeSymbol("TASK")), list(RET, makeSymbol("TASK-DISPLAYER"))));

    static private final SubLSymbol $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH = makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-TASK-DISPLAYER-METHOD");

    static private final SubLList $list45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list46 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol HTML_TASK_DISPLAYER_INITIALIZE_METHOD = makeSymbol("HTML-TASK-DISPLAYER-INITIALIZE-METHOD");

    private static final SubLSymbol INIT_WITH_TASK = makeSymbol("INIT-WITH-TASK");

    static private final SubLList $list49 = list(makeSymbol("NEW-TASK"));

    static private final SubLList $list50 = list(list(makeSymbol("CSETQ"), makeSymbol("TASK"), makeSymbol("NEW-TASK")), list(RET, NIL));

    static private final SubLSymbol $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    private static final SubLSymbol HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD = makeSymbol("HTML-TASK-DISPLAYER-INIT-WITH-TASK-METHOD");

    private static final SubLSymbol FIND_INSTANCE_BY_ID_STRING = makeSymbol("FIND-INSTANCE-BY-ID-STRING");

    static private final SubLList $list54 = list(makeSymbol("ID-STRING"));

    static private final SubLList $list55 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("ID-STRING")))), list(RET, list(makeSymbol("FIND-INSTANCE"), makeSymbol("SELF"), makeSymbol("ID")))));

    private static final SubLSymbol HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD = makeSymbol("HTML-TASK-DISPLAYER-FIND-INSTANCE-BY-ID-STRING-METHOD");

    private static final SubLSymbol TASK_EXAMINER_LINK_IMAGE = makeSymbol("TASK-EXAMINER-LINK-IMAGE");

    static private final SubLList $list58 = list(makeString("@param TASK shop-task-p\n   @return keywordp ;; cb-icon to use for image"), list(makeSymbol("CLET"), list(list(makeSymbol("PLANNER-RULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLANNER-RULE"), makeSymbol("TASK")), makeSymbol("TASK")))), list(makeSymbol("PCOND"), list(list(makeSymbol("SHOP-METHOD-P"), makeSymbol("PLANNER-RULE")), list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*"))), list(list(makeSymbol("SHOP-PRECONDITION-P"), makeSymbol("PLANNER-RULE")), list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*"))), list(list(makeSymbol("SHOP-SUFFICIENCY-CONDITION-P"), makeSymbol("PLANNER-RULE")), list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*"))), list(T, list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*"))))));

    static private final SubLSymbol $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    private static final SubLSymbol HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD = makeSymbol("HTML-TASK-DISPLAYER-TASK-EXAMINER-LINK-IMAGE-METHOD");

    private static final SubLSymbol CB_TASK_EXAMINER_LINK = makeSymbol("CB-TASK-EXAMINER-LINK");

    static private final SubLList $list63 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID-STRING"), list(makeSymbol("WRITE-TO-STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INSTANCE-NUMBER"))))), list(makeSymbol("HREF"), list(makeSymbol("CCONCATENATE"), makeString("cg?plan-task-examiner&"), makeSymbol("ID-STRING"))), list(makeSymbol("IMAGE"), list(makeSymbol("TASK-EXAMINER-LINK-IMAGE"), makeSymbol("SELF")))), list(makeSymbol("HTML-FANCY-ANCHOR"), list($HREF, makeSymbol("HREF")), list(makeSymbol("CB-ICON"), makeSymbol("IMAGE"), makeKeyword("BORDER-OVERRIDE"), ZERO_INTEGER))), list(RET, NIL));

    static private final SubLSymbol $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    static private final SubLString $str65$cg_plan_task_examiner_ = makeString("cg?plan-task-examiner&");

    private static final SubLSymbol HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD = makeSymbol("HTML-TASK-DISPLAYER-CB-TASK-EXAMINER-LINK-METHOD");

    private static final SubLSymbol HTML_FORM = makeSymbol("HTML-FORM");

    static private final SubLList $list69 = list(makeSymbol("STYLE-ARGS"));

    static private final SubLList $list70 = list(list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("TASK-EXAMINER-LINKS"), makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-TASK-EXAMINER-LINK"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("DISPLAY-FORM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PLAN-DISPLAYER"), list(QUOTE, makeSymbol("PREPARE-TASK-FOR-DISPLAY")), list(makeSymbol("GET-SLOT"), makeSymbol("TASK"), list(QUOTE, makeSymbol("FORMULA")))))), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), $CYCL, makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-FORM"), makeSymbol("DISPLAY-FORM")), list(makeSymbol("PROGN"), list(makeSymbol("CLET"), list(list(makeSymbol("*PPH-QUANTIFY-VARS?*"), NIL)), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("DISPLAY-FORM"))))), list(RET, NIL)));

    static private final SubLSymbol $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    private static final SubLSymbol $TASK_EXAMINER_LINKS = makeKeyword("TASK-EXAMINER-LINKS");

    private static final SubLSymbol PREPARE_TASK_FOR_DISPLAY = makeSymbol("PREPARE-TASK-FOR-DISPLAY");

    private static final SubLSymbol HTML_TASK_DISPLAYER_HTML_FORM_METHOD = makeSymbol("HTML-TASK-DISPLAYER-HTML-FORM-METHOD");

    static private final SubLList $list77 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("TASK"), list(QUOTE, makeSymbol("FORMULA")))));

    static private final SubLSymbol $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    private static final SubLSymbol HTML_TASK_DISPLAYER_FORMULA_METHOD = makeSymbol("HTML-TASK-DISPLAYER-FORMULA-METHOD");

    static private final SubLList $list81 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("TASK"), list(QUOTE, makeSymbol("BINDINGS")))));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    private static final SubLSymbol HTML_TASK_DISPLAYER_BINDINGS_METHOD = makeSymbol("HTML-TASK-DISPLAYER-BINDINGS-METHOD");

    private static final SubLSymbol DISPLAY_BINDINGS = makeSymbol("DISPLAY-BINDINGS");

    static private final SubLList $list85 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list86 = list(list(makeSymbol("IGNORE"), makeSymbol("STYLE-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-COMPOSED-SLOTS"), makeSymbol("SELF"), makeSymbol("VARIABLE-MANAGER"), makeSymbol("PLAN"), makeSymbol("PLAN-DISPLAYER"))), list(makeSymbol("MBIND"), list(makeSymbol("BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("MBIND"), list(makeSymbol("HTML-FANCY-TABLE"), list(makeKeyword("BORDER"), ZERO_INTEGER), list(makeSymbol("DO-MBIND"), list(makeSymbol("CUR-VAR"), makeSymbol("CUR-VALUES"), makeSymbol("MBIND")), list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("FIM"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL")), makeSymbol("CUR-VAR"))), list(makeSymbol("EL-VALUES"), list(makeSymbol("FIM"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL")), makeSymbol("CUR-VALUES")))), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-PRINC"), makeSymbol("EL-VAR"))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("PIF"), list(makeSymbol("SINGLETON?"), makeSymbol("EL-VALUES")), list(makeSymbol("CB-FORM"), list(makeSymbol("FIRST"), makeSymbol("EL-VALUES"))), list(makeSymbol("CB-FORM"), makeSymbol("EL-VALUES")))))))), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    private static final SubLSymbol RECOVER_EL = makeSymbol("RECOVER-EL");

    private static final SubLSymbol HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD = makeSymbol("HTML-TASK-DISPLAYER-DISPLAY-BINDINGS-METHOD");

    private static final SubLSymbol HTML_TASK_PAGE = makeSymbol("HTML-TASK-PAGE");

    static private final SubLList $list93 = list(makeString("This method displays the contents of the Task Examiner Page for the\n   displayer\'s associated TASK."), list(makeSymbol("IGNORE"), makeSymbol("STYLE-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("PREPARED-FORM"), list(makeSymbol("FIM"), makeSymbol("PLAN-DISPLAYER"), list(QUOTE, makeSymbol("PREPARE-TASK-FOR-DISPLAY")), list(makeSymbol("FORMULA"), makeSymbol("SELF"))))), list(new SubLObject[]{ makeSymbol("CB-SIMPLE-MAIN-DOCUMENT"), list(makeString("Task Examiner"), makeKeyword("COMPLETION?"), T), list(makeSymbol("HTML-HR")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Task: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("CB-FORM"), makeSymbol("PREPARED-FORM")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Translation: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("CLET"), list(list(makeSymbol("*PPH-QUANTIFY-VARS?*"), NIL)), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("PREPARED-FORM"))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Assertion: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("CLET"), list(list(makeSymbol("PLANNER-RULES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLANNER-RULE"), makeSymbol("SHOP-BASIC-TASK")), makeSymbol("TASK")))), list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), makeSymbol("PLANNER-RULES")), list(makeSymbol("CSETQ"), makeSymbol("PLANNER-RULES"), list(makeSymbol("LIST"), makeSymbol("PLANNER-RULES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-RULE"), makeSymbol("PLANNER-RULES")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-ASSERTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSERTIONS"), makeSymbol("SHOP-PLANNER-RULE")), makeSymbol("CUR-RULE"))), list(makeSymbol("CB-ASSERTION-LINK"), makeSymbol("CUR-ASSERTION"))))), list(makeSymbol("PWHEN"), list(makeSymbol("BINDINGS"), makeSymbol("SELF")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Bindings: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("DISPLAY-BINDINGS"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS"))), list(RET, NIL) })));

    static private final SubLSymbol $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");

    static private final SubLString $$$Task_Examiner = makeString("Task Examiner");

    private static final SubLString $str96$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str97$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str102$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str107$Task__ = makeString("Task: ");

    private static final SubLString $str108$Translation__ = makeString("Translation: ");

    private static final SubLString $str109$Assertion__ = makeString("Assertion: ");

    private static final SubLString $str111$Bindings__ = makeString("Bindings: ");

    private static final SubLSymbol HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD = makeSymbol("HTML-TASK-DISPLAYER-HTML-TASK-PAGE-METHOD");

    private static final SubLList $list113 = list(makeKeyword("PROTECTED"), makeKeyword("NO-MEMBER-VARIABLES"));

    static private final SubLList $list114 = list(makeString("@returns html-plan-displayer-p; initialized object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TASK-DISPLAYER-HASH-TABLE")), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol HTML_PLAN_DISPLAYER_INITIALIZE_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-INITIALIZE-METHOD");

    private static final SubLList $list116 = list(makeSymbol("NEW-PLAN"), makeSymbol("DISPLAYER-FACTORY"));

    private static final SubLList $list117 = list(makeString("@param NEW-PLAN          shop-basic-plan-p\n   @param DISPLAYER-FACTORY shop-plan-displayer-factory-p\n   @return html-plan-displayer-p"), list(makeSymbol("CSETQ"), makeSymbol("PLAN"), makeSymbol("NEW-PLAN")), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("VARIABLE-MANAGER")))), list(makeSymbol("NEW-MBINDING"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("BINDINGS")))), list(makeSymbol("OPEN-VARS"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("OPEN-VARIABLES")))), makeSymbol("DISPLAY-SUB")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAR"), makeSymbol("OPEN-VARS")), list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL-VARIABLE")), makeSymbol("CUR-VAR")))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("CUR-VAR"), makeSymbol("EL-VAR")), makeSymbol("DISPLAY-SUB")))), list(makeSymbol("CSETQ"), makeSymbol("MBINDING"), makeSymbol("NEW-MBINDING")), list(makeSymbol("CSETQ"), makeSymbol("OPEN-VARIABLES"), makeSymbol("OPEN-VARS")), list(makeSymbol("CSETQ"), makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION"), makeSymbol("DISPLAY-SUB")), list(makeSymbol("CDOLIST"), list(makeSymbol("STEP"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("PRE-ORDERING")))), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-DISPLAYER"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("DISPLAYER-FACTORY"), list(QUOTE, makeSymbol("CREATE-TASK-DISPLAYER")), makeSymbol("STEP")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT-WITH-TASK"), makeSymbol("HTML-TASK-DISPLAYER")), makeSymbol("TASK-DISPLAYER"), makeSymbol("STEP")), list(makeSymbol("SET-SLOT"), makeSymbol("TASK-DISPLAYER"), list(QUOTE, makeSymbol("PLAN-DISPLAYER")), makeSymbol("SELF")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("STEP"), makeSymbol("TASK-DISPLAYER-HASH-TABLE")), makeSymbol("TASK-DISPLAYER")))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    private static final SubLSymbol RECOVER_EL_VARIABLE = makeSymbol("RECOVER-EL-VARIABLE");

    private static final SubLSymbol HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-INIT-WITH-PLAN-METHOD");

    private static final SubLList $list122 = list(makeString("@param TASK listp; a task formula in CycL."), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TASK"), list(makeSymbol("SUBLIS"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("SIMPLE-BINDING-LIST"))), makeSymbol("TASK"))), list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("VARIABLE-MANAGER"))))), list(RET, list(makeSymbol("FIM"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL")), makeSymbol("NEW-TASK")))));

    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    private static final SubLSymbol SIMPLE_BINDING_LIST = makeSymbol("SIMPLE-BINDING-LIST");

    private static final SubLSymbol HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-PREPARE-TASK-FOR-DISPLAY-METHOD");

    private static final SubLSymbol HTML_HIERARCHICAL_FORM = makeSymbol("HTML-HIERARCHICAL-FORM");

    private static final SubLList $list127 = list(makeString("Displays all the tasks in the plan, indicating decompositon relationships\n   with tree-like indentation."), list(makeSymbol("CLET"), list(list(makeSymbol("PRE"), list(makeSymbol("REVERSE"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("PRE-ORDERING"))))), list(makeSymbol("POST"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("POST-ORDERING"))))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("DO-PPO-TREE-DEPTH"), list(makeSymbol("STEP"), makeSymbol("INDENT-COUNT"), makeSymbol("PRE"), makeSymbol("POST"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CLET"), list(list(makeSymbol("CUR-TASK"), list(makeSymbol("GETHASH"), makeSymbol("STEP"), makeSymbol("TASK-DISPLAYER-HASH-TABLE")))), list(makeSymbol("HTML-INDENT"), list(makeSymbol("*"), FIVE_INTEGER, makeSymbol("INDENT-COUNT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HTML-FORM"), makeSymbol("HTML-TASK-DISPLAYER")), makeSymbol("CUR-TASK"), makeSymbol("STYLE-ARGS")), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL)));

    private static final SubLSymbol $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    private static final SubLSymbol HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-HTML-HIERARCHICAL-FORM-METHOD");

    private static final SubLSymbol HTML_PRIMITIVE_FORM = makeSymbol("HTML-PRIMITIVE-FORM");

    static private final SubLList $list132 = list(makeString("Displays only the primitive tasks of the plan."), list(makeSymbol("CLET"), list(list(makeSymbol("STEP-DISPLAY-FORM"), NIL)), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("STEP"), makeSymbol("NUM"), list(makeSymbol("FIM"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("PRIMITIVE-FORM")))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("  Step ")), list(makeSymbol("HTML-PRIN1"), list(makeSymbol("1+"), makeSymbol("NUM"))), list(makeSymbol("HTML-PRINC"), makeString(".  "))), list(makeSymbol("CSETQ"), makeSymbol("STEP-DISPLAY-FORM"), list(makeSymbol("PREPARE-TASK-FOR-DISPLAY"), makeSymbol("SELF"), makeSymbol("STEP"))), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), $CYCL, makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-FORM"), makeSymbol("STEP-DISPLAY-FORM")), list(makeSymbol("CLET"), list(list(makeSymbol("*PPH-QUANTIFY-VARS?*"), NIL)), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("STEP-DISPLAY-FORM")))), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL));

    static private final SubLSymbol $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    private static final SubLString $$$__Step_ = makeString("  Step ");

    private static final SubLString $str136$___ = makeString(".  ");

    private static final SubLSymbol HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-HTML-PRIMITIVE-FORM-METHOD");

    private static final SubLSymbol HTML_MULTIBINDING_VALUES = makeSymbol("HTML-MULTIBINDING-VALUES");

    private static final SubLList $list139 = list(makeSymbol("VAR"), makeSymbol("STYLE-ARGS"));

    private static final SubLList $list140 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("VARIABLE-MANAGER"))), list(QUOTE, makeSymbol("RECOVER-EL-VARIABLE")), makeSymbol("VAR"))), list(makeSymbol("VALUES"), list(makeSymbol("MB-VAR-VALUES"), makeSymbol("VAR"), makeSymbol("MBINDING")))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("VALUES")), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), $CYCL, makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-FORM"), makeSymbol("EL-VAR")), list(makeSymbol("HTML-PHRASE-WITH-TARGET"), makeSymbol("EL-VAR"))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-INDENT"), THREE_INTEGER), list(makeSymbol("HTML-PRINC"), makeString("is one of")), list(makeSymbol("HTML-INDENT"), THREE_INTEGER)), list(makeSymbol("HTML-PHRASE-WITH-TARGET"), list(makeSymbol("FIRST"), makeSymbol("VALUES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAL"), list(makeSymbol("REST"), makeSymbol("VALUES"))), list(makeSymbol("HTML-PRINC"), makeString(",")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("HTML-PHRASE-WITH-TARGET"), makeSymbol("CUR-VAL"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL)));

    private static final SubLSymbol $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    private static final SubLString $$$is_one_of = makeString("is one of");

    private static final SubLString $str143$_ = makeString(",");

    private static final SubLSymbol HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-HTML-MULTIBINDING-VALUES-METHOD");

    private static final SubLSymbol HTML_MBINDING_FORM = makeSymbol("HTML-MBINDING-FORM");

    private static final SubLList $list146 = list(list(makeSymbol("PWHEN"), makeSymbol("OPEN-VARIABLES"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("for any of the following values..."))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAR"), makeSymbol("OPEN-VARIABLES")), list(makeSymbol("HTML-MULTIBINDING-VALUES"), makeSymbol("SELF"), makeSymbol("CUR-VAR"), makeSymbol("STYLE-ARGS"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL));

    private static final SubLSymbol $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    private static final SubLString $str148$for_any_of_the_following_values__ = makeString("for any of the following values...");

    private static final SubLSymbol HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-HTML-MBINDING-FORM-METHOD");

    private static final SubLList $list150 = list(list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), makeKeyword("PRIMITIVE"), makeSymbol("STYLE-ARGS")), list(makeSymbol("HTML-PRIMITIVE-FORM"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS")), list(makeSymbol("HTML-HIERARCHICAL-FORM"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS"))), list(makeSymbol("HTML-MBINDING-FORM"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS")), list(RET, NIL));

    private static final SubLSymbol HTML_PLAN_DISPLAYER_HTML_FORM_METHOD = makeSymbol("HTML-PLAN-DISPLAYER-HTML-FORM-METHOD");

    public static final SubLObject get_html_task_displayer_plan_displayer_alt(SubLObject html_task_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_task_displayer, TWO_INTEGER, PLAN_DISPLAYER);
    }

    public static SubLObject get_html_task_displayer_plan_displayer(final SubLObject html_task_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_task_displayer, TWO_INTEGER, PLAN_DISPLAYER);
    }

    public static final SubLObject set_html_task_displayer_plan_displayer_alt(SubLObject html_task_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_task_displayer, value, TWO_INTEGER, PLAN_DISPLAYER);
    }

    public static SubLObject set_html_task_displayer_plan_displayer(final SubLObject html_task_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_task_displayer, value, TWO_INTEGER, PLAN_DISPLAYER);
    }

    public static final SubLObject get_html_task_displayer_task_alt(SubLObject html_task_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_task_displayer, ONE_INTEGER, TASK);
    }

    public static SubLObject get_html_task_displayer_task(final SubLObject html_task_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_task_displayer, ONE_INTEGER, TASK);
    }

    public static final SubLObject set_html_task_displayer_task_alt(SubLObject html_task_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_task_displayer, value, ONE_INTEGER, TASK);
    }

    public static SubLObject set_html_task_displayer_task(final SubLObject html_task_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_task_displayer, value, ONE_INTEGER, TASK);
    }

    public static final SubLObject subloop_reserved_initialize_html_task_displayer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_html_task_displayer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_html_task_displayer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_TASK_DISPLAYER, TASK, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_TASK_DISPLAYER, PLAN_DISPLAYER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_html_task_displayer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_TASK_DISPLAYER, TASK, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_TASK_DISPLAYER, PLAN_DISPLAYER, NIL);
        return NIL;
    }

    public static final SubLObject html_task_displayer_p_alt(SubLObject html_task_displayer) {
        return classes.subloop_instanceof_class(html_task_displayer, HTML_TASK_DISPLAYER);
    }

    public static SubLObject html_task_displayer_p(final SubLObject html_task_displayer) {
        return classes.subloop_instanceof_class(html_task_displayer, HTML_TASK_DISPLAYER);
    }

    public static final SubLObject get_html_plan_displayer_display_variable_substitution_alt(SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, FIVE_INTEGER, DISPLAY_VARIABLE_SUBSTITUTION);
    }

    public static SubLObject get_html_plan_displayer_display_variable_substitution(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, FIVE_INTEGER, DISPLAY_VARIABLE_SUBSTITUTION);
    }

    public static final SubLObject set_html_plan_displayer_display_variable_substitution_alt(SubLObject html_plan_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, FIVE_INTEGER, DISPLAY_VARIABLE_SUBSTITUTION);
    }

    public static SubLObject set_html_plan_displayer_display_variable_substitution(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, FIVE_INTEGER, DISPLAY_VARIABLE_SUBSTITUTION);
    }

    public static final SubLObject get_html_plan_displayer_open_variables_alt(SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, FOUR_INTEGER, OPEN_VARIABLES);
    }

    public static SubLObject get_html_plan_displayer_open_variables(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, FOUR_INTEGER, OPEN_VARIABLES);
    }

    public static final SubLObject set_html_plan_displayer_open_variables_alt(SubLObject html_plan_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, FOUR_INTEGER, OPEN_VARIABLES);
    }

    public static SubLObject set_html_plan_displayer_open_variables(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, FOUR_INTEGER, OPEN_VARIABLES);
    }

    public static final SubLObject get_html_plan_displayer_mbinding_alt(SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, THREE_INTEGER, MBINDING);
    }

    public static SubLObject get_html_plan_displayer_mbinding(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, THREE_INTEGER, MBINDING);
    }

    public static final SubLObject set_html_plan_displayer_mbinding_alt(SubLObject html_plan_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, THREE_INTEGER, MBINDING);
    }

    public static SubLObject set_html_plan_displayer_mbinding(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, THREE_INTEGER, MBINDING);
    }

    public static final SubLObject get_html_plan_displayer_task_displayer_hash_table_alt(SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, TWO_INTEGER, TASK_DISPLAYER_HASH_TABLE);
    }

    public static SubLObject get_html_plan_displayer_task_displayer_hash_table(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, TWO_INTEGER, TASK_DISPLAYER_HASH_TABLE);
    }

    public static final SubLObject set_html_plan_displayer_task_displayer_hash_table_alt(SubLObject html_plan_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, TWO_INTEGER, TASK_DISPLAYER_HASH_TABLE);
    }

    public static SubLObject set_html_plan_displayer_task_displayer_hash_table(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, TWO_INTEGER, TASK_DISPLAYER_HASH_TABLE);
    }

    public static final SubLObject get_html_plan_displayer_plan_alt(SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, ONE_INTEGER, PLAN);
    }

    public static SubLObject get_html_plan_displayer_plan(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, ONE_INTEGER, PLAN);
    }

    public static final SubLObject set_html_plan_displayer_plan_alt(SubLObject html_plan_displayer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, ONE_INTEGER, PLAN);
    }

    public static SubLObject set_html_plan_displayer_plan(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, ONE_INTEGER, PLAN);
    }

    public static final SubLObject subloop_reserved_initialize_html_plan_displayer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_html_plan_displayer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_html_plan_displayer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, PLAN, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, TASK_DISPLAYER_HASH_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, MBINDING, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, OPEN_VARIABLES, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, DISPLAY_VARIABLE_SUBSTITUTION, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_html_plan_displayer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, PLAN, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, TASK_DISPLAYER_HASH_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, MBINDING, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, OPEN_VARIABLES, NIL);
        classes.subloop_initialize_slot(new_instance, HTML_PLAN_DISPLAYER, DISPLAY_VARIABLE_SUBSTITUTION, NIL);
        return NIL;
    }

    public static final SubLObject html_plan_displayer_p_alt(SubLObject html_plan_displayer) {
        return classes.subloop_instanceof_class(html_plan_displayer, HTML_PLAN_DISPLAYER);
    }

    public static SubLObject html_plan_displayer_p(final SubLObject html_plan_displayer) {
        return classes.subloop_instanceof_class(html_plan_displayer, HTML_PLAN_DISPLAYER);
    }

    public static final SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static final SubLObject cyc_development_plan_displayer_factory_p_alt(SubLObject cyc_development_plan_displayer_factory) {
        return classes.subloop_instanceof_class(cyc_development_plan_displayer_factory, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
    }

    public static SubLObject cyc_development_plan_displayer_factory_p(final SubLObject cyc_development_plan_displayer_factory) {
        return classes.subloop_instanceof_class(cyc_development_plan_displayer_factory, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
    }

    public static final SubLObject cyc_development_plan_displayer_factory_create_plan_displayer_method_alt(SubLObject self, SubLObject plan) {
        {
            SubLObject plan_displayer = object.object_new_method(HTML_PLAN_DISPLAYER);
            methods.funcall_instance_method_with_2_args(plan_displayer, INIT_WITH_PLAN, plan, self);
            return plan_displayer;
        }
    }

    public static SubLObject cyc_development_plan_displayer_factory_create_plan_displayer_method(final SubLObject self, final SubLObject plan) {
        final SubLObject plan_displayer = object.object_new_method(HTML_PLAN_DISPLAYER);
        methods.funcall_instance_method_with_2_args(plan_displayer, INIT_WITH_PLAN, plan, self);
        return plan_displayer;
    }

    public static final SubLObject cyc_development_plan_displayer_factory_create_task_displayer_method_alt(SubLObject self, SubLObject task) {
        {
            SubLObject task_displayer = object.object_new_method(HTML_TASK_DISPLAYER);
            com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_init_with_task_method(task_displayer, task);
            return task_displayer;
        }
    }

    public static SubLObject cyc_development_plan_displayer_factory_create_task_displayer_method(final SubLObject self, final SubLObject task) {
        final SubLObject task_displayer = object.object_new_method(HTML_TASK_DISPLAYER);
        html_task_displayer_init_with_task_method(task_displayer, task);
        return task_displayer;
    }

    public static final SubLObject html_task_displayer_initialize_method_alt(SubLObject self) {
        shop_datastructures.shop_indexed_object_initialize_method(self);
        return self;
    }

    public static SubLObject html_task_displayer_initialize_method(final SubLObject self) {
        shop_datastructures.shop_indexed_object_initialize_method(self);
        return self;
    }

    public static final SubLObject html_task_displayer_init_with_task_method_alt(SubLObject self, SubLObject new_task) {
        {
            SubLObject catch_var_for_html_task_displayer_method = NIL;
            SubLObject task = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_task(self);
            try {
                try {
                    task = new_task;
                    sublisp_throw($sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_task(self, task);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            }
            return catch_var_for_html_task_displayer_method;
        }
    }

    public static SubLObject html_task_displayer_init_with_task_method(final SubLObject self, final SubLObject new_task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push($sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                task = new_task;
                sublisp_throw($sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    public static final SubLObject html_task_displayer_find_instance_by_id_string_method_alt(SubLObject self, SubLObject id_string) {
        {
            SubLObject id = read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return shop_datastructures.shop_indexed_object_find_instance_method(self, id);
        }
    }

    public static SubLObject html_task_displayer_find_instance_by_id_string_method(final SubLObject self, final SubLObject id_string) {
        final SubLObject id = read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return shop_datastructures.shop_indexed_object_find_instance_method(self, id);
    }

    /**
     *
     *
     * @param TASK
    shop-task-p
     * 		
     * @return keywordp ;; cb-icon to use for image
     */
    @LispMethod(comment = "@param TASK\nshop-task-p\r\n\t\t\r\n@return keywordp ;; cb-icon to use for image")
    public static final SubLObject html_task_displayer_task_examiner_link_image_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_html_task_displayer_method = NIL;
            SubLObject task = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_task(self);
            try {
                try {
                    {
                        SubLObject planner_rule = methods.funcall_instance_method_with_0_args(task, PLANNER_RULE);
                        if (NIL != shop_datastructures.shop_method_p(planner_rule)) {
                            sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_method_image$.getGlobalValue());
                        } else {
                            if (NIL != shop_datastructures.shop_precondition_p(planner_rule)) {
                                sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_operator_image$.getGlobalValue());
                            } else {
                                if (NIL != shop_datastructures.shop_sufficiency_condition_p(planner_rule)) {
                                    sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_scond_image$.getGlobalValue());
                                } else {
                                    sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_link_image$.getGlobalValue());
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_task(self, task);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            }
            return catch_var_for_html_task_displayer_method;
        }
    }

    /**
     *
     *
     * @param TASK
    shop-task-p
     * 		
     * @return keywordp ;; cb-icon to use for image
     */
    @LispMethod(comment = "@param TASK\nshop-task-p\r\n\t\t\r\n@return keywordp ;; cb-icon to use for image")
    public static SubLObject html_task_displayer_task_examiner_link_image_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject planner_rule = methods.funcall_instance_method_with_0_args(task, PLANNER_RULE);
                if (NIL != shop_datastructures.shop_method_p(planner_rule)) {
                    sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_method_image$.getGlobalValue());
                } else
                    if (NIL != shop_datastructures.shop_precondition_p(planner_rule)) {
                        sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_operator_image$.getGlobalValue());
                    } else
                        if (NIL != shop_datastructures.shop_sufficiency_condition_p(planner_rule)) {
                            sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_scond_image$.getGlobalValue());
                        } else {
                            sublisp_throw($sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, $cb_plan_task_examiner_link_image$.getGlobalValue());
                        }


            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    public static final SubLObject html_task_displayer_cb_task_examiner_link_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_html_task_displayer_method = NIL;
                SubLObject instance_number = object.get_object_instance_number(self);
                try {
                    try {
                        {
                            SubLObject id_string = write_to_string(instances.get_slot(self, INSTANCE_NUMBER), EMPTY_SUBL_OBJECT_ARRAY);
                            SubLObject href = cconcatenate($str_alt65$cg_plan_task_examiner_, id_string);
                            SubLObject image = com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_task_examiner_link_image_method(self);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(href);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image);
                                        SubLObject align = $TOP;
                                        SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image);
                                        SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                                        html_markup(html_macros.$html_image_head$.getGlobalValue());
                                        html_markup(html_macros.$html_image_src$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(image_src);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != alt) {
                                            html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(alt);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != align) {
                                            html_markup(html_macros.$html_image_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align(align));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != border) {
                                            html_markup(html_macros.$html_image_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(border);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            sublisp_throw($sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                object.set_object_instance_number(self, instance_number);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
                }
                return catch_var_for_html_task_displayer_method;
            }
        }
    }

    public static SubLObject html_task_displayer_cb_task_examiner_link_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject id_string = write_to_string(instances.get_slot(self, INSTANCE_NUMBER), EMPTY_SUBL_OBJECT_ARRAY);
                final SubLObject href = cconcatenate($str65$cg_plan_task_examiner_, id_string);
                final SubLObject image = html_task_displayer_task_examiner_link_image_method(self);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(href);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image);
                    final SubLObject align = $TOP;
                    final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image);
                    final SubLObject border = ZERO_INTEGER;
                    html_markup(html_macros.$html_image_head$.getGlobalValue());
                    html_markup(html_macros.$html_image_src$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(image_src);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != alt) {
                        html_markup(html_macros.$html_image_alt$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(alt);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != align) {
                        html_markup(html_macros.$html_image_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align(align));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != border) {
                        html_markup(html_macros.$html_image_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(border);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                    }
                    html_markup(html_macros.$html_image_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                sublisp_throw($sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    public static final SubLObject html_task_displayer_html_form_method_alt(SubLObject self, SubLObject style_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_html_task_displayer_method = NIL;
                SubLObject plan_displayer = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_plan_displayer(self);
                SubLObject task = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_task(self);
                try {
                    try {
                        if (NIL != subl_promotions.memberP($TASK_EXAMINER_LINKS, style_args, UNPROVIDED, UNPROVIDED)) {
                            com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_cb_task_examiner_link_method(self);
                        }
                        {
                            SubLObject display_form = methods.funcall_instance_method_with_1_args(plan_displayer, PREPARE_TASK_FOR_DISPLAY, instances.get_slot(task, FORMULA));
                            if (NIL != subl_promotions.memberP($CYCL, style_args, UNPROVIDED, UNPROVIDED)) {
                                cb_form(display_form, UNPROVIDED, UNPROVIDED);
                            } else {
                                {
                                    SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                        pph_html.html_text_with_target(display_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            sublisp_throw($sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_plan_displayer(self, plan_displayer);
                                com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_task(self, task);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
                }
                return catch_var_for_html_task_displayer_method;
            }
        }
    }

    public static SubLObject html_task_displayer_html_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject plan_displayer = get_html_task_displayer_plan_displayer(self);
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push($sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                if (NIL != subl_promotions.memberP($TASK_EXAMINER_LINKS, style_args, UNPROVIDED, UNPROVIDED)) {
                    html_task_displayer_cb_task_examiner_link_method(self);
                }
                final SubLObject display_form = methods.funcall_instance_method_with_1_args(plan_displayer, PREPARE_TASK_FOR_DISPLAY, instances.get_slot(task, FORMULA));
                if (NIL != subl_promotions.memberP($CYCL, style_args, UNPROVIDED, UNPROVIDED)) {
                    cb_form(display_form, UNPROVIDED, UNPROVIDED);
                } else {
                    final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                        pph_html.html_text_with_target(display_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                    }
                }
                sublisp_throw($sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_plan_displayer(self, plan_displayer);
                    set_html_task_displayer_task(self, task);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    public static final SubLObject html_task_displayer_formula_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_html_task_displayer_method = NIL;
            SubLObject task = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_task(self);
            try {
                try {
                    sublisp_throw($sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot(task, FORMULA));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_task(self, task);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            }
            return catch_var_for_html_task_displayer_method;
        }
    }

    public static SubLObject html_task_displayer_formula_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push($sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                sublisp_throw($sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot(task, FORMULA));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    public static final SubLObject html_task_displayer_bindings_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_html_task_displayer_method = NIL;
            SubLObject task = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_task(self);
            try {
                try {
                    sublisp_throw($sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot(task, BINDINGS));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_task(self, task);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            }
            return catch_var_for_html_task_displayer_method;
        }
    }

    public static SubLObject html_task_displayer_bindings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push($sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                sublisp_throw($sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot(task, BINDINGS));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    public static final SubLObject html_task_displayer_display_bindings_method_alt(SubLObject self, SubLObject style_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_html_task_displayer_method = NIL;
                SubLObject plan_displayer = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_plan_displayer(self);
                try {
                    try {
                        {
                            SubLObject var_manager = instances.get_slot(instances.get_slot(instances.get_slot(self, PLAN_DISPLAYER), PLAN), VARIABLE_MANAGER);
                            SubLObject mbind = com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_bindings_method(self);
                            if (NIL != mbind) {
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ZERO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_multi_var_term_map(mbind)));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject entry = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                                                        SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_var);
                                                        SubLObject el_values = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_values);
                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_princ(el_var);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != list_utilities.singletonP(el_values)) {
                                                                            cb_form(el_values.first(), UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            cb_form(el_values, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_simple_var_term_map(mbind)));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject entry = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                                                        SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_var);
                                                        SubLObject el_values = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_values);
                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_princ(el_var);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != list_utilities.singletonP(el_values)) {
                                                                            cb_form(el_values.first(), UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            cb_form(el_values, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                            }
                            sublisp_throw($sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_plan_displayer(self, plan_displayer);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
                }
                return catch_var_for_html_task_displayer_method;
            }
        }
    }

    public static SubLObject html_task_displayer_display_bindings_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject plan_displayer = get_html_task_displayer_plan_displayer(self);
        try {
            thread.throwStack.push($sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject var_manager = instances.get_slot(instances.get_slot(instances.get_slot(self, PLAN_DISPLAYER), PLAN), VARIABLE_MANAGER);
                final SubLObject mbind = html_task_displayer_bindings_method(self);
                if (NIL != mbind) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_multi_var_term_map(mbind))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                            final SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_var);
                            final SubLObject el_values = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_values);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(el_var);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != list_utilities.singletonP(el_values)) {
                                        cb_form(el_values.first(), UNPROVIDED, UNPROVIDED);
                                    } else {
                                        cb_form(el_values, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_simple_var_term_map(mbind))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                            final SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_var);
                            final SubLObject el_values = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, cur_values);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(el_var);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != list_utilities.singletonP(el_values)) {
                                        cb_form(el_values.first(), UNPROVIDED, UNPROVIDED);
                                    } else {
                                        cb_form(el_values, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                }
                sublisp_throw($sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_plan_displayer(self, plan_displayer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    /**
     * This method displays the contents of the Task Examiner Page for the
     * displayer's associated TASK.
     */
    @LispMethod(comment = "This method displays the contents of the Task Examiner Page for the\r\ndisplayer\'s associated TASK.\nThis method displays the contents of the Task Examiner Page for the\ndisplayer\'s associated TASK.")
    public static final SubLObject html_task_displayer_html_task_page_method_alt(SubLObject self, SubLObject style_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_html_task_displayer_method = NIL;
                SubLObject plan_displayer = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_plan_displayer(self);
                SubLObject task = com.cyc.cycjava.cycl.shop_displayers.get_html_task_displayer_task(self);
                try {
                    try {
                        {
                            SubLObject prepared_form = methods.funcall_instance_method_with_1_args(plan_displayer, PREPARE_TASK_FOR_DISPLAY, com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_formula_method(self));
                            SubLObject title_var = $$$Task_Examiner;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                try {
                                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    cb_head_shortcut_icon();
                                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                                    if (NIL != title_var) {
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                                        html_princ(title_var);
                                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                    }
                                    html_complete.html_complete_script();
                                    html_complete.html_autocomplete_css();
                                    html_complete.html_autocomplete_scripts();
                                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                        try {
                                            html_macros.$html_inside_bodyP$.bind(T, thread);
                                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                                            if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_body_class$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str_alt98$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (NIL != title_var) {
                                                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_markup(TWO_INTEGER);
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        html_princ(title_var);
                                                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_markup(TWO_INTEGER);
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                    }
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt99$Task__);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    cb_form(prepared_form, UNPROVIDED, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt100$Translation__);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject _prev_bind_0_10 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                                            pph_html.html_text_with_target(prepared_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0_10, thread);
                                                        }
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt101$Assertion__);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject planner_rules = shop_basic_plan.shop_basic_task_planner_rule_method(task);
                                                        if (!planner_rules.isList()) {
                                                            planner_rules = list(planner_rules);
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var = planner_rules;
                                                            SubLObject cur_rule = NIL;
                                                            for (cur_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_rule = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject cdolist_list_var_11 = methods.funcall_instance_method_with_0_args(cur_rule, ASSERTIONS);
                                                                    SubLObject cur_assertion = NIL;
                                                                    for (cur_assertion = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , cur_assertion = cdolist_list_var_11.first()) {
                                                                        cb_assertion_link(cur_assertion, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (NIL != com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_bindings_method(self)) {
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt103$Bindings__);
                                                        html_newline(UNPROVIDED);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_display_bindings_method(self, style_args);
                                                    }
                                                    sublisp_throw($sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_plan_displayer(self, plan_displayer);
                                com.cyc.cycjava.cycl.shop_displayers.set_html_task_displayer_task(self, task);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
                }
                return catch_var_for_html_task_displayer_method;
            }
        }
    }

    /**
     * This method displays the contents of the Task Examiner Page for the
     * displayer's associated TASK.
     */
    @LispMethod(comment = "This method displays the contents of the Task Examiner Page for the\r\ndisplayer\'s associated TASK.\nThis method displays the contents of the Task Examiner Page for the\ndisplayer\'s associated TASK.")
    public static SubLObject html_task_displayer_html_task_page_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = NIL;
        final SubLObject plan_displayer = get_html_task_displayer_plan_displayer(self);
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push($sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject prepared_form = methods.funcall_instance_method_with_1_args(plan_displayer, PREPARE_TASK_FOR_DISPLAY, html_task_displayer_formula_method(self));
                final SubLObject title_var = $$$Task_Examiner;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str96$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str97$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css($CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str102$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$button);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$reload);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_princ($$$Refresh_Frames);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (NIL != title_var) {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    html_princ(title_var);
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str107$Task__);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_form(prepared_form, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str108$Translation__);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                final SubLObject _prev_bind_0_$12 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                    pph_html.html_text_with_target(prepared_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str109$Assertion__);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                SubLObject planner_rules = shop_basic_plan.shop_basic_task_planner_rule_method(task);
                                if (!planner_rules.isList()) {
                                    planner_rules = list(planner_rules);
                                }
                                SubLObject cdolist_list_var = planner_rules;
                                SubLObject cur_rule = NIL;
                                cur_rule = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args(cur_rule, ASSERTIONS);
                                    SubLObject cur_assertion = NIL;
                                    cur_assertion = cdolist_list_var_$13.first();
                                    while (NIL != cdolist_list_var_$13) {
                                        cb_assertion_link(cur_assertion, UNPROVIDED);
                                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                        cur_assertion = cdolist_list_var_$13.first();
                                    } 
                                    cdolist_list_var = cdolist_list_var.rest();
                                    cur_rule = cdolist_list_var.first();
                                } 
                                if (NIL != html_task_displayer_bindings_method(self)) {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str111$Bindings__);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_task_displayer_display_bindings_method(self, style_args);
                                }
                                sublisp_throw($sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, NIL);
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_task_displayer_plan_displayer(self, plan_displayer);
                    set_html_task_displayer_task(self, task);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }

    /**
     *
     *
     * @unknown html-plan-displayer-p; initialized object
     */
    @LispMethod(comment = "@unknown html-plan-displayer-p; initialized object")
    public static final SubLObject html_plan_displayer_initialize_method_alt(SubLObject self) {
        shop_datastructures.shop_indexed_object_initialize_method(self);
        instances.set_slot(self, TASK_DISPLAYER_HASH_TABLE, make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return self;
    }

    /**
     *
     *
     * @unknown html-plan-displayer-p; initialized object
     */
    @LispMethod(comment = "@unknown html-plan-displayer-p; initialized object")
    public static SubLObject html_plan_displayer_initialize_method(final SubLObject self) {
        shop_datastructures.shop_indexed_object_initialize_method(self);
        instances.set_slot(self, TASK_DISPLAYER_HASH_TABLE, make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return self;
    }

    /**
     *
     *
     * @param NEW-PLAN
    shop-basic-plan-p
     * 		
     * @param DISPLAYER-FACTORY
    shop-plan-displayer-factory-p
     * 		
     * @return html-plan-displayer-p
     */
    @LispMethod(comment = "@param NEW-PLAN\nshop-basic-plan-p\r\n\t\t\r\n@param DISPLAYER-FACTORY\nshop-plan-displayer-factory-p\r\n\t\t\r\n@return html-plan-displayer-p")
    public static final SubLObject html_plan_displayer_init_with_plan_method_alt(SubLObject self, SubLObject new_plan, SubLObject displayer_factory) {
        {
            SubLObject catch_var_for_html_plan_displayer_method = NIL;
            SubLObject display_variable_substitution = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_display_variable_substitution(self);
            SubLObject open_variables = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_open_variables(self);
            SubLObject mbinding = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_mbinding(self);
            SubLObject task_displayer_hash_table = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_task_displayer_hash_table(self);
            SubLObject plan = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_plan(self);
            try {
                try {
                    plan = new_plan;
                    {
                        SubLObject var_manager = instances.get_slot(new_plan, VARIABLE_MANAGER);
                        SubLObject new_mbinding = instances.get_slot(new_plan, BINDINGS);
                        SubLObject open_vars = instances.get_slot(new_plan, OPEN_VARIABLES);
                        SubLObject display_sub = NIL;
                        {
                            SubLObject cdolist_list_var = open_vars;
                            SubLObject cur_var = NIL;
                            for (cur_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_var = cdolist_list_var.first()) {
                                {
                                    SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL_VARIABLE, cur_var);
                                    display_sub = cons(cons(cur_var, el_var), display_sub);
                                }
                            }
                        }
                        mbinding = new_mbinding;
                        open_variables = open_vars;
                        display_variable_substitution = display_sub;
                        {
                            SubLObject cdolist_list_var = instances.get_slot(new_plan, PRE_ORDERING);
                            SubLObject step = NIL;
                            for (step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , step = cdolist_list_var.first()) {
                                {
                                    SubLObject task_displayer = methods.funcall_class_method_with_1_args(displayer_factory, CREATE_TASK_DISPLAYER, step);
                                    com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_init_with_task_method(task_displayer, step);
                                    instances.set_slot(task_displayer, PLAN_DISPLAYER, self);
                                    sethash(step, task_displayer_hash_table, task_displayer);
                                }
                            }
                        }
                        sublisp_throw($sym110$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_display_variable_substitution(self, display_variable_substitution);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_open_variables(self, open_variables);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_mbinding(self, mbinding);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_task_displayer_hash_table(self, task_displayer_hash_table);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_plan(self, plan);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym110$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            }
            return catch_var_for_html_plan_displayer_method;
        }
    }

    /**
     *
     *
     * @param NEW-PLAN
    shop-basic-plan-p
     * 		
     * @param DISPLAYER-FACTORY
    shop-plan-displayer-factory-p
     * 		
     * @return html-plan-displayer-p
     */
    @LispMethod(comment = "@param NEW-PLAN\nshop-basic-plan-p\r\n\t\t\r\n@param DISPLAYER-FACTORY\nshop-plan-displayer-factory-p\r\n\t\t\r\n@return html-plan-displayer-p")
    public static SubLObject html_plan_displayer_init_with_plan_method(final SubLObject self, final SubLObject new_plan, final SubLObject displayer_factory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = NIL;
        SubLObject display_variable_substitution = get_html_plan_displayer_display_variable_substitution(self);
        SubLObject open_variables = get_html_plan_displayer_open_variables(self);
        SubLObject mbinding = get_html_plan_displayer_mbinding(self);
        final SubLObject task_displayer_hash_table = get_html_plan_displayer_task_displayer_hash_table(self);
        SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push($sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                plan = new_plan;
                final SubLObject var_manager = instances.get_slot(new_plan, VARIABLE_MANAGER);
                final SubLObject new_mbinding = instances.get_slot(new_plan, BINDINGS);
                final SubLObject open_vars = instances.get_slot(new_plan, OPEN_VARIABLES);
                SubLObject display_sub = NIL;
                SubLObject cdolist_list_var = open_vars;
                SubLObject cur_var = NIL;
                cur_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL_VARIABLE, cur_var);
                    display_sub = cons(cons(cur_var, el_var), display_sub);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_var = cdolist_list_var.first();
                } 
                mbinding = new_mbinding;
                open_variables = open_vars;
                display_variable_substitution = display_sub;
                cdolist_list_var = instances.get_slot(new_plan, PRE_ORDERING);
                SubLObject step = NIL;
                step = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject task_displayer = methods.funcall_class_method_with_1_args(displayer_factory, CREATE_TASK_DISPLAYER, step);
                    html_task_displayer_init_with_task_method(task_displayer, step);
                    instances.set_slot(task_displayer, PLAN_DISPLAYER, self);
                    sethash(step, task_displayer_hash_table, task_displayer);
                    cdolist_list_var = cdolist_list_var.rest();
                    step = cdolist_list_var.first();
                } 
                sublisp_throw($sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_plan_displayer_display_variable_substitution(self, display_variable_substitution);
                    set_html_plan_displayer_open_variables(self, open_variables);
                    set_html_plan_displayer_mbinding(self, mbinding);
                    set_html_plan_displayer_task_displayer_hash_table(self, task_displayer_hash_table);
                    set_html_plan_displayer_plan(self, plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }

    /**
     *
     *
     * @param TASK
     * 		listp; a task formula in CycL.
     */
    @LispMethod(comment = "@param TASK\r\n\t\tlistp; a task formula in CycL.")
    public static final SubLObject html_plan_displayer_prepare_task_for_display_method_alt(SubLObject self, SubLObject task) {
        {
            SubLObject catch_var_for_html_plan_displayer_method = NIL;
            SubLObject plan = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_plan(self);
            try {
                try {
                    {
                        SubLObject new_task = sublis(instances.get_slot(plan, SIMPLE_BINDING_LIST), task, UNPROVIDED, UNPROVIDED);
                        SubLObject var_manager = instances.get_slot(plan, VARIABLE_MANAGER);
                        sublisp_throw($sym115$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, new_task));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_plan(self, plan);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            }
            return catch_var_for_html_plan_displayer_method;
        }
    }

    /**
     *
     *
     * @param TASK
     * 		listp; a task formula in CycL.
     */
    @LispMethod(comment = "@param TASK\r\n\t\tlistp; a task formula in CycL.")
    public static SubLObject html_plan_displayer_prepare_task_for_display_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = NIL;
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push($sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                final SubLObject new_task = sublis(instances.get_slot(plan, SIMPLE_BINDING_LIST), task, UNPROVIDED, UNPROVIDED);
                final SubLObject var_manager = instances.get_slot(plan, VARIABLE_MANAGER);
                sublisp_throw($sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, new_task));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_plan_displayer_plan(self, plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }

    /**
     * Displays all the tasks in the plan, indicating decompositon relationships
     * with tree-like indentation.
     */
    @LispMethod(comment = "Displays all the tasks in the plan, indicating decompositon relationships\r\nwith tree-like indentation.\nDisplays all the tasks in the plan, indicating decompositon relationships\nwith tree-like indentation.")
    public static final SubLObject html_plan_displayer_html_hierarchical_form_method_alt(SubLObject self, SubLObject style_args) {
        {
            SubLObject catch_var_for_html_plan_displayer_method = NIL;
            SubLObject task_displayer_hash_table = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_task_displayer_hash_table(self);
            SubLObject plan = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_plan(self);
            try {
                try {
                    {
                        SubLObject pre = reverse(instances.get_slot(plan, PRE_ORDERING));
                        SubLObject post = instances.get_slot(plan, POST_ORDERING);
                        html_newline(TWO_INTEGER);
                        {
                            SubLObject stack = NIL;
                            SubLObject indent_count = ZERO_INTEGER;
                            SubLObject cur_pre = NIL;
                            for (cur_pre = pre; NIL != cur_pre; cur_pre = cur_pre.rest()) {
                                {
                                    SubLObject step = cur_pre.first();
                                    SubLObject next = second(cur_pre);
                                    while ((NIL == shop_basic_plan.ppo_tree_descendantP(pre, post, step, stack.first(), symbol_function(EQUAL))) && (NIL != stack)) {
                                        indent_count = subtract(indent_count, ONE_INTEGER);
                                        stack = stack.rest();
                                    } 
                                    {
                                        SubLObject cur_task = gethash(step, task_displayer_hash_table, UNPROVIDED);
                                        html_indent(multiply(FIVE_INTEGER, indent_count));
                                        com.cyc.cycjava.cycl.shop_displayers.html_task_displayer_html_form_method(cur_task, style_args);
                                        html_newline(UNPROVIDED);
                                    }
                                    if (NIL != shop_basic_plan.ppo_tree_descendantP(pre, post, next, step, symbol_function(EQUAL))) {
                                        indent_count = add(indent_count, ONE_INTEGER);
                                        stack = cons(step, stack);
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym120$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_task_displayer_hash_table(self, task_displayer_hash_table);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_plan(self, plan);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym120$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            }
            return catch_var_for_html_plan_displayer_method;
        }
    }

    /**
     * Displays all the tasks in the plan, indicating decompositon relationships
     * with tree-like indentation.
     */
    @LispMethod(comment = "Displays all the tasks in the plan, indicating decompositon relationships\r\nwith tree-like indentation.\nDisplays all the tasks in the plan, indicating decompositon relationships\nwith tree-like indentation.")
    public static SubLObject html_plan_displayer_html_hierarchical_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = NIL;
        final SubLObject task_displayer_hash_table = get_html_plan_displayer_task_displayer_hash_table(self);
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push($sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                final SubLObject pre = reverse(instances.get_slot(plan, PRE_ORDERING));
                final SubLObject post = instances.get_slot(plan, POST_ORDERING);
                html_newline(TWO_INTEGER);
                SubLObject stack = NIL;
                SubLObject indent_count = ZERO_INTEGER;
                SubLObject cur_pre;
                SubLObject step;
                SubLObject next;
                SubLObject cur_task;
                for (cur_pre = NIL, cur_pre = pre; NIL != cur_pre; cur_pre = cur_pre.rest()) {
                    step = cur_pre.first();
                    next = second(cur_pre);
                    while ((NIL == shop_basic_plan.ppo_tree_descendantP(pre, post, step, stack.first(), symbol_function(EQUAL))) && (NIL != stack)) {
                        indent_count = subtract(indent_count, ONE_INTEGER);
                        stack = stack.rest();
                    } 
                    cur_task = gethash(step, task_displayer_hash_table, UNPROVIDED);
                    html_indent(multiply(FIVE_INTEGER, indent_count));
                    html_task_displayer_html_form_method(cur_task, style_args);
                    html_newline(UNPROVIDED);
                    if (NIL != shop_basic_plan.ppo_tree_descendantP(pre, post, next, step, symbol_function(EQUAL))) {
                        indent_count = add(indent_count, ONE_INTEGER);
                        stack = cons(step, stack);
                    }
                }
                sublisp_throw($sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_plan_displayer_task_displayer_hash_table(self, task_displayer_hash_table);
                    set_html_plan_displayer_plan(self, plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }

    /**
     * Displays only the primitive tasks of the plan.
     */
    @LispMethod(comment = "Displays only the primitive tasks of the plan.")
    public static final SubLObject html_plan_displayer_html_primitive_form_method_alt(SubLObject self, SubLObject style_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_html_plan_displayer_method = NIL;
                SubLObject plan = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_plan(self);
                try {
                    try {
                        {
                            SubLObject step_display_form = NIL;
                            html_newline(TWO_INTEGER);
                            {
                                SubLObject list_var = NIL;
                                SubLObject step = NIL;
                                SubLObject num = NIL;
                                for (list_var = methods.funcall_instance_method_with_0_args(plan, PRIMITIVE_FORM), step = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , step = list_var.first() , num = add(ONE_INTEGER, num)) {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str_alt127$__Step_);
                                    html_prin1(number_utilities.f_1X(num));
                                    html_princ($str_alt128$___);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    step_display_form = com.cyc.cycjava.cycl.shop_displayers.html_plan_displayer_prepare_task_for_display_method(self, step);
                                    if (NIL != subl_promotions.memberP($CYCL, style_args, UNPROVIDED, UNPROVIDED)) {
                                        cb_form(step_display_form, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        {
                                            SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                                pph_html.html_text_with_target(step_display_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    html_newline(UNPROVIDED);
                                }
                            }
                            sublisp_throw($sym125$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_plan(self, plan);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
                }
                return catch_var_for_html_plan_displayer_method;
            }
        }
    }

    /**
     * Displays only the primitive tasks of the plan.
     */
    @LispMethod(comment = "Displays only the primitive tasks of the plan.")
    public static SubLObject html_plan_displayer_html_primitive_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = NIL;
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push($sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                SubLObject step_display_form = NIL;
                html_newline(TWO_INTEGER);
                SubLObject list_var = NIL;
                SubLObject step = NIL;
                SubLObject num = NIL;
                list_var = methods.funcall_instance_method_with_0_args(plan, PRIMITIVE_FORM);
                step = list_var.first();
                for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , step = list_var.first() , num = add(ONE_INTEGER, num)) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$__Step_);
                    html_prin1(number_utilities.f_1X(num));
                    html_princ($str136$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    step_display_form = html_plan_displayer_prepare_task_for_display_method(self, step);
                    if (NIL != subl_promotions.memberP($CYCL, style_args, UNPROVIDED, UNPROVIDED)) {
                        cb_form(step_display_form, UNPROVIDED, UNPROVIDED);
                    } else {
                        final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                            pph_html.html_text_with_target(step_display_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_newline(UNPROVIDED);
                }
                sublisp_throw($sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_plan_displayer_plan(self, plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }

    static private final SubLString $str_alt1$bl_sdi_gif = makeString("bl_sdi.gif");

    static private final SubLString $str_alt3$gr_sdi_gif = makeString("gr_sdi.gif");

    static private final SubLString $str_alt5$yl_sdi_gif = makeString("yl_sdi.gif");

    static private final SubLString $str_alt7$red_diam_gif = makeString("red_diam.gif");

    static private final SubLList $list_alt10 = list(list(makeSymbol("TASK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PLAN-DISPLAYER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("FIND-INSTANCE-BY-ID-STRING"), list(makeSymbol("ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-WITH-TASK"), list(makeSymbol("TASK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CB-TASK-EXAMINER-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-TASK-PAGE"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TASK-EXAMINER-LINK-IMAGE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt21 = list(makeSymbol("SHOP-PLAN-I"));

    static private final SubLList $list_alt22 = list(new SubLObject[]{ list(makeSymbol("PLAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TASK-DISPLAYER-HASH-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MBINDING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OPEN-VARIABLES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-HIERARCHICAL-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-PRIMITIVE-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-MBINDING-FORM"), list(makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-MULTIBINDING-VALUES"), list(makeSymbol("VAR"), makeSymbol("MBINDING"), makeSymbol("STYLE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREPARE-TASK-FOR-DISPLAY"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")) });

    public static final SubLObject html_plan_displayer_html_multibinding_values_method_alt(SubLObject self, SubLObject var, SubLObject style_args) {
        {
            SubLObject catch_var_for_html_plan_displayer_method = NIL;
            SubLObject mbinding = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_mbinding(self);
            SubLObject plan = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_plan(self);
            try {
                try {
                    {
                        SubLObject el_var = methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(plan, VARIABLE_MANAGER), RECOVER_EL_VARIABLE, var);
                        SubLObject values = multibindings.mb_var_values(var, mbinding);
                        if (NIL != values) {
                            if (NIL != subl_promotions.memberP($CYCL, style_args, UNPROVIDED, UNPROVIDED)) {
                                cb_form(el_var, UNPROVIDED, UNPROVIDED);
                            } else {
                                pph_html.html_phrase_with_target(el_var, UNPROVIDED, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_indent(THREE_INTEGER);
                            html_princ($$$is_one_of);
                            html_indent(THREE_INTEGER);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            pph_html.html_phrase_with_target(values.first(), UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = values.rest();
                                SubLObject cur_val = NIL;
                                for (cur_val = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_val = cdolist_list_var.first()) {
                                    html_princ($str_alt135$_);
                                    html_indent(TWO_INTEGER);
                                    pph_html.html_phrase_with_target(cur_val, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            html_newline(UNPROVIDED);
                        }
                        sublisp_throw($sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_mbinding(self, mbinding);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_plan(self, plan);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            }
            return catch_var_for_html_plan_displayer_method;
        }
    }

    public static SubLObject html_plan_displayer_html_multibinding_values_method(final SubLObject self, final SubLObject var, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = NIL;
        final SubLObject mbinding = get_html_plan_displayer_mbinding(self);
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push($sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                final SubLObject el_var = methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(plan, VARIABLE_MANAGER), RECOVER_EL_VARIABLE, var);
                final SubLObject values = multibindings.mb_var_values(var, mbinding);
                if (NIL != values) {
                    if (NIL != subl_promotions.memberP($CYCL, style_args, UNPROVIDED, UNPROVIDED)) {
                        cb_form(el_var, UNPROVIDED, UNPROVIDED);
                    } else {
                        pph_html.html_phrase_with_target(el_var, UNPROVIDED, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_indent(THREE_INTEGER);
                    html_princ($$$is_one_of);
                    html_indent(THREE_INTEGER);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    pph_html.html_phrase_with_target(values.first(), UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = values.rest();
                    SubLObject cur_val = NIL;
                    cur_val = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_princ($str143$_);
                        html_indent(TWO_INTEGER);
                        pph_html.html_phrase_with_target(cur_val, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cur_val = cdolist_list_var.first();
                    } 
                    html_newline(UNPROVIDED);
                }
                sublisp_throw($sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_plan_displayer_mbinding(self, mbinding);
                    set_html_plan_displayer_plan(self, plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }

    static private final SubLList $list_alt35 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt36 = list(makeSymbol("PLAN"));

    static private final SubLList $list_alt37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLAN-DISPLAYER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("HTML-PLAN-DISPLAYER")), list(QUOTE, makeSymbol("HTML-PLAN-DISPLAYER"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT-WITH-PLAN"), makeSymbol("HTML-PLAN-DISPLAYER")), makeSymbol("PLAN-DISPLAYER"), makeSymbol("PLAN"), makeSymbol("SELF")), list(RET, makeSymbol("PLAN-DISPLAYER"))));

    public static final SubLObject html_plan_displayer_html_mbinding_form_method_alt(SubLObject self, SubLObject style_args) {
        {
            SubLObject catch_var_for_html_plan_displayer_method = NIL;
            SubLObject open_variables = com.cyc.cycjava.cycl.shop_displayers.get_html_plan_displayer_open_variables(self);
            try {
                try {
                    if (NIL != open_variables) {
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str_alt140$for_any_of_the_following_values__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        {
                            SubLObject cdolist_list_var = open_variables;
                            SubLObject cur_var = NIL;
                            for (cur_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_var = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.shop_displayers.html_plan_displayer_html_multibinding_values_method(self, cur_var, style_args);
                            }
                        }
                        html_newline(UNPROVIDED);
                    }
                    sublisp_throw($sym139$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_displayers.set_html_plan_displayer_open_variables(self, open_variables);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            }
            return catch_var_for_html_plan_displayer_method;
        }
    }

    public static SubLObject html_plan_displayer_html_mbinding_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = NIL;
        final SubLObject open_variables = get_html_plan_displayer_open_variables(self);
        try {
            thread.throwStack.push($sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                if (NIL != open_variables) {
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str148$for_any_of_the_following_values__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(TWO_INTEGER);
                    SubLObject cdolist_list_var = open_variables;
                    SubLObject cur_var = NIL;
                    cur_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_plan_displayer_html_multibinding_values_method(self, cur_var, style_args);
                        cdolist_list_var = cdolist_list_var.rest();
                        cur_var = cdolist_list_var.first();
                    } 
                    html_newline(UNPROVIDED);
                }
                sublisp_throw($sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_html_plan_displayer_open_variables(self, open_variables);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }

    static private final SubLList $list_alt41 = list(makeSymbol("TASK"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TASK-DISPLAYER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("HTML-TASK-DISPLAYER")), list(QUOTE, makeSymbol("HTML-TASK-DISPLAYER"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT-WITH-TASK"), makeSymbol("HTML-TASK-DISPLAYER")), makeSymbol("TASK-DISPLAYER"), makeSymbol("TASK")), list(RET, makeSymbol("TASK-DISPLAYER"))));

    static private final SubLList $list_alt45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt49 = list(makeSymbol("NEW-TASK"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("CSETQ"), makeSymbol("TASK"), makeSymbol("NEW-TASK")), list(RET, NIL));

    static private final SubLList $list_alt54 = list(makeSymbol("ID-STRING"));

    public static final SubLObject html_plan_displayer_html_form_method_alt(SubLObject self, SubLObject style_args) {
        if (NIL != subl_promotions.memberP($PRIMITIVE, style_args, UNPROVIDED, UNPROVIDED)) {
            com.cyc.cycjava.cycl.shop_displayers.html_plan_displayer_html_primitive_form_method(self, style_args);
        } else {
            com.cyc.cycjava.cycl.shop_displayers.html_plan_displayer_html_hierarchical_form_method(self, style_args);
        }
        com.cyc.cycjava.cycl.shop_displayers.html_plan_displayer_html_mbinding_form_method(self, style_args);
        return NIL;
    }

    public static SubLObject html_plan_displayer_html_form_method(final SubLObject self, final SubLObject style_args) {
        if (NIL != subl_promotions.memberP($PRIMITIVE, style_args, UNPROVIDED, UNPROVIDED)) {
            html_plan_displayer_html_primitive_form_method(self, style_args);
        } else {
            html_plan_displayer_html_hierarchical_form_method(self, style_args);
        }
        html_plan_displayer_html_mbinding_form_method(self, style_args);
        return NIL;
    }

    static private final SubLList $list_alt55 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("ID-STRING")))), list(RET, list(makeSymbol("FIND-INSTANCE"), makeSymbol("SELF"), makeSymbol("ID")))));

    public static SubLObject declare_shop_displayers_file() {
        declareFunction("get_html_task_displayer_plan_displayer", "GET-HTML-TASK-DISPLAYER-PLAN-DISPLAYER", 1, 0, false);
        declareFunction("set_html_task_displayer_plan_displayer", "SET-HTML-TASK-DISPLAYER-PLAN-DISPLAYER", 2, 0, false);
        declareFunction("get_html_task_displayer_task", "GET-HTML-TASK-DISPLAYER-TASK", 1, 0, false);
        declareFunction("set_html_task_displayer_task", "SET-HTML-TASK-DISPLAYER-TASK", 2, 0, false);
        declareFunction("subloop_reserved_initialize_html_task_displayer_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_html_task_displayer_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-INSTANCE", 1, 0, false);
        declareFunction("html_task_displayer_p", "HTML-TASK-DISPLAYER-P", 1, 0, false);
        declareFunction("get_html_plan_displayer_display_variable_substitution", "GET-HTML-PLAN-DISPLAYER-DISPLAY-VARIABLE-SUBSTITUTION", 1, 0, false);
        declareFunction("set_html_plan_displayer_display_variable_substitution", "SET-HTML-PLAN-DISPLAYER-DISPLAY-VARIABLE-SUBSTITUTION", 2, 0, false);
        declareFunction("get_html_plan_displayer_open_variables", "GET-HTML-PLAN-DISPLAYER-OPEN-VARIABLES", 1, 0, false);
        declareFunction("set_html_plan_displayer_open_variables", "SET-HTML-PLAN-DISPLAYER-OPEN-VARIABLES", 2, 0, false);
        declareFunction("get_html_plan_displayer_mbinding", "GET-HTML-PLAN-DISPLAYER-MBINDING", 1, 0, false);
        declareFunction("set_html_plan_displayer_mbinding", "SET-HTML-PLAN-DISPLAYER-MBINDING", 2, 0, false);
        declareFunction("get_html_plan_displayer_task_displayer_hash_table", "GET-HTML-PLAN-DISPLAYER-TASK-DISPLAYER-HASH-TABLE", 1, 0, false);
        declareFunction("set_html_plan_displayer_task_displayer_hash_table", "SET-HTML-PLAN-DISPLAYER-TASK-DISPLAYER-HASH-TABLE", 2, 0, false);
        declareFunction("get_html_plan_displayer_plan", "GET-HTML-PLAN-DISPLAYER-PLAN", 1, 0, false);
        declareFunction("set_html_plan_displayer_plan", "SET-HTML-PLAN-DISPLAYER-PLAN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_html_plan_displayer_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_html_plan_displayer_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-INSTANCE", 1, 0, false);
        declareFunction("html_plan_displayer_p", "HTML-PLAN-DISPLAYER-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyc_development_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false);
        declareFunction("cyc_development_plan_displayer_factory_p", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-P", 1, 0, false);
        declareFunction("cyc_development_plan_displayer_factory_create_plan_displayer_method", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-PLAN-DISPLAYER-METHOD", 2, 0, false);
        declareFunction("cyc_development_plan_displayer_factory_create_task_displayer_method", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-TASK-DISPLAYER-METHOD", 2, 0, false);
        declareFunction("html_task_displayer_initialize_method", "HTML-TASK-DISPLAYER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("html_task_displayer_init_with_task_method", "HTML-TASK-DISPLAYER-INIT-WITH-TASK-METHOD", 2, 0, false);
        declareFunction("html_task_displayer_find_instance_by_id_string_method", "HTML-TASK-DISPLAYER-FIND-INSTANCE-BY-ID-STRING-METHOD", 2, 0, false);
        declareFunction("html_task_displayer_task_examiner_link_image_method", "HTML-TASK-DISPLAYER-TASK-EXAMINER-LINK-IMAGE-METHOD", 1, 0, false);
        declareFunction("html_task_displayer_cb_task_examiner_link_method", "HTML-TASK-DISPLAYER-CB-TASK-EXAMINER-LINK-METHOD", 1, 0, false);
        declareFunction("html_task_displayer_html_form_method", "HTML-TASK-DISPLAYER-HTML-FORM-METHOD", 2, 0, false);
        declareFunction("html_task_displayer_formula_method", "HTML-TASK-DISPLAYER-FORMULA-METHOD", 1, 0, false);
        declareFunction("html_task_displayer_bindings_method", "HTML-TASK-DISPLAYER-BINDINGS-METHOD", 1, 0, false);
        declareFunction("html_task_displayer_display_bindings_method", "HTML-TASK-DISPLAYER-DISPLAY-BINDINGS-METHOD", 2, 0, false);
        declareFunction("html_task_displayer_html_task_page_method", "HTML-TASK-DISPLAYER-HTML-TASK-PAGE-METHOD", 2, 0, false);
        declareFunction("html_plan_displayer_initialize_method", "HTML-PLAN-DISPLAYER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("html_plan_displayer_init_with_plan_method", "HTML-PLAN-DISPLAYER-INIT-WITH-PLAN-METHOD", 3, 0, false);
        declareFunction("html_plan_displayer_prepare_task_for_display_method", "HTML-PLAN-DISPLAYER-PREPARE-TASK-FOR-DISPLAY-METHOD", 2, 0, false);
        declareFunction("html_plan_displayer_html_hierarchical_form_method", "HTML-PLAN-DISPLAYER-HTML-HIERARCHICAL-FORM-METHOD", 2, 0, false);
        declareFunction("html_plan_displayer_html_primitive_form_method", "HTML-PLAN-DISPLAYER-HTML-PRIMITIVE-FORM-METHOD", 2, 0, false);
        declareFunction("html_plan_displayer_html_multibinding_values_method", "HTML-PLAN-DISPLAYER-HTML-MULTIBINDING-VALUES-METHOD", 3, 0, false);
        declareFunction("html_plan_displayer_html_mbinding_form_method", "HTML-PLAN-DISPLAYER-HTML-MBINDING-FORM-METHOD", 2, 0, false);
        declareFunction("html_plan_displayer_html_form_method", "HTML-PLAN-DISPLAYER-HTML-FORM-METHOD", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt58 = list(makeString("@param TASK shop-task-p\n   @return keywordp ;; cb-icon to use for image"), list(makeSymbol("CLET"), list(list(makeSymbol("PLANNER-RULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLANNER-RULE"), makeSymbol("TASK")), makeSymbol("TASK")))), list(makeSymbol("PCOND"), list(list(makeSymbol("SHOP-METHOD-P"), makeSymbol("PLANNER-RULE")), list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*"))), list(list(makeSymbol("SHOP-PRECONDITION-P"), makeSymbol("PLANNER-RULE")), list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*"))), list(list(makeSymbol("SHOP-SUFFICIENCY-CONDITION-P"), makeSymbol("PLANNER-RULE")), list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*"))), list(T, list(RET, makeSymbol("*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*"))))));

    static private final SubLList $list_alt63 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ID-STRING"), list(makeSymbol("WRITE-TO-STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INSTANCE-NUMBER"))))), list(makeSymbol("HREF"), list(makeSymbol("CCONCATENATE"), makeString("cg?plan-task-examiner&"), makeSymbol("ID-STRING"))), list(makeSymbol("IMAGE"), list(makeSymbol("TASK-EXAMINER-LINK-IMAGE"), makeSymbol("SELF")))), list(makeSymbol("HTML-FANCY-ANCHOR"), list($HREF, makeSymbol("HREF")), list(makeSymbol("CB-ICON"), makeSymbol("IMAGE"), makeKeyword("BORDER-OVERRIDE"), ZERO_INTEGER))), list(RET, NIL));

    static private final SubLString $str_alt65$cg_plan_task_examiner_ = makeString("cg?plan-task-examiner&");

    static private final SubLList $list_alt69 = list(makeSymbol("STYLE-ARGS"));

    static private final SubLList $list_alt70 = list(list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("TASK-EXAMINER-LINKS"), makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-TASK-EXAMINER-LINK"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("DISPLAY-FORM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PLAN-DISPLAYER"), list(QUOTE, makeSymbol("PREPARE-TASK-FOR-DISPLAY")), list(makeSymbol("GET-SLOT"), makeSymbol("TASK"), list(QUOTE, makeSymbol("FORMULA")))))), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), $CYCL, makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-FORM"), makeSymbol("DISPLAY-FORM")), list(makeSymbol("PROGN"), list(makeSymbol("CLET"), list(list(makeSymbol("*PPH-QUANTIFY-VARS?*"), NIL)), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("DISPLAY-FORM"))))), list(RET, NIL)));

    static private final SubLList $list_alt77 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("TASK"), list(QUOTE, makeSymbol("FORMULA")))));

    static private final SubLList $list_alt81 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("TASK"), list(QUOTE, makeSymbol("BINDINGS")))));

    static private final SubLList $list_alt85 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt86 = list(list(makeSymbol("IGNORE"), makeSymbol("STYLE-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-COMPOSED-SLOTS"), makeSymbol("SELF"), makeSymbol("VARIABLE-MANAGER"), makeSymbol("PLAN"), makeSymbol("PLAN-DISPLAYER"))), list(makeSymbol("MBIND"), list(makeSymbol("BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("MBIND"), list(makeSymbol("HTML-FANCY-TABLE"), list(makeKeyword("BORDER"), ZERO_INTEGER), list(makeSymbol("DO-MBIND"), list(makeSymbol("CUR-VAR"), makeSymbol("CUR-VALUES"), makeSymbol("MBIND")), list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("FIM"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL")), makeSymbol("CUR-VAR"))), list(makeSymbol("EL-VALUES"), list(makeSymbol("FIM"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL")), makeSymbol("CUR-VALUES")))), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-PRINC"), makeSymbol("EL-VAR"))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("PIF"), list(makeSymbol("SINGLETON?"), makeSymbol("EL-VALUES")), list(makeSymbol("CB-FORM"), list(makeSymbol("FIRST"), makeSymbol("EL-VALUES"))), list(makeSymbol("CB-FORM"), makeSymbol("EL-VALUES")))))))), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL));

    public static SubLObject init_shop_displayers_file() {
        deflexical("*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*", $TE_LINK);
        deflexical("*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*", $TE_METHOD);
        deflexical("*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*", $TE_OPERATOR);
        deflexical("*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*", $TE_EXAMINER);
        return NIL;
    }

    public static final SubLObject setup_shop_displayers_file_alt() {
        sethash($TE_LINK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt1$bl_sdi_gif, NIL));
        sethash($TE_METHOD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt3$gr_sdi_gif, NIL));
        sethash($TE_OPERATOR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt5$yl_sdi_gif, NIL));
        sethash($TE_EXAMINER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt7$red_diam_gif, NIL));
        classes.subloop_new_class(HTML_TASK_DISPLAYER, SHOP_INDEXED_OBJECT, NIL, NIL, $list_alt10);
        classes.class_set_implements_slot_listeners(HTML_TASK_DISPLAYER, NIL);
        classes.subloop_note_class_initialization_function(HTML_TASK_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS);
        classes.subloop_note_instance_initialization_function(HTML_TASK_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE);
        com.cyc.cycjava.cycl.shop_displayers.subloop_reserved_initialize_html_task_displayer_class(HTML_TASK_DISPLAYER);
        classes.subloop_new_class(HTML_PLAN_DISPLAYER, SHOP_INDEXED_OBJECT, $list_alt21, NIL, $list_alt22);
        classes.class_set_implements_slot_listeners(HTML_PLAN_DISPLAYER, NIL);
        classes.subloop_note_class_initialization_function(HTML_PLAN_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS);
        classes.subloop_note_instance_initialization_function(HTML_PLAN_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE);
        com.cyc.cycjava.cycl.shop_displayers.subloop_reserved_initialize_html_plan_displayer_class(HTML_PLAN_DISPLAYER);
        classes.subloop_new_class(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, SHOP_PLAN_DISPLAYER_FACTORY, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, NIL);
        classes.subloop_note_class_initialization_function(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
        classes.subloop_note_instance_initialization_function(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
        com.cyc.cycjava.cycl.shop_displayers.subloop_reserved_initialize_cyc_development_plan_displayer_factory_class(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
        methods.methods_incorporate_class_method(CREATE_PLAN_DISPLAYER, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list_alt35, $list_alt36, $list_alt37);
        methods.subloop_register_class_method(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, CREATE_PLAN_DISPLAYER, $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH);
        methods.methods_incorporate_class_method(CREATE_TASK_DISPLAYER, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list_alt35, $list_alt41, $list_alt42);
        methods.subloop_register_class_method(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, CREATE_TASK_DISPLAYER, $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH);
        methods.methods_incorporate_instance_method(INITIALIZE, HTML_TASK_DISPLAYER, $list_alt45, NIL, $list_alt46);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, INITIALIZE, HTML_TASK_DISPLAYER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INIT_WITH_TASK, HTML_TASK_DISPLAYER, $list_alt35, $list_alt49, $list_alt50);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, INIT_WITH_TASK, HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD);
        methods.methods_incorporate_class_method(FIND_INSTANCE_BY_ID_STRING, HTML_TASK_DISPLAYER, $list_alt35, $list_alt54, $list_alt55);
        methods.subloop_register_class_method(HTML_TASK_DISPLAYER, FIND_INSTANCE_BY_ID_STRING, HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD);
        methods.methods_incorporate_instance_method(TASK_EXAMINER_LINK_IMAGE, HTML_TASK_DISPLAYER, $list_alt45, NIL, $list_alt58);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, TASK_EXAMINER_LINK_IMAGE, HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD);
        methods.methods_incorporate_instance_method(CB_TASK_EXAMINER_LINK, HTML_TASK_DISPLAYER, $list_alt45, NIL, $list_alt63);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, CB_TASK_EXAMINER_LINK, HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD);
        methods.methods_incorporate_instance_method(HTML_FORM, HTML_TASK_DISPLAYER, $list_alt35, $list_alt69, $list_alt70);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, HTML_FORM, HTML_TASK_DISPLAYER_HTML_FORM_METHOD);
        methods.methods_incorporate_instance_method(FORMULA, HTML_TASK_DISPLAYER, $list_alt35, NIL, $list_alt77);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, FORMULA, HTML_TASK_DISPLAYER_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(BINDINGS, HTML_TASK_DISPLAYER, $list_alt35, NIL, $list_alt81);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, BINDINGS, HTML_TASK_DISPLAYER_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_BINDINGS, HTML_TASK_DISPLAYER, $list_alt85, $list_alt69, $list_alt86);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, DISPLAY_BINDINGS, HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(HTML_TASK_PAGE, HTML_TASK_DISPLAYER, $list_alt35, $list_alt69, $list_alt93);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, HTML_TASK_PAGE, HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, HTML_PLAN_DISPLAYER, $list_alt105, NIL, $list_alt106);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, INITIALIZE, HTML_PLAN_DISPLAYER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INIT_WITH_PLAN, HTML_PLAN_DISPLAYER, $list_alt35, $list_alt108, $list_alt109);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, INIT_WITH_PLAN, HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD);
        methods.methods_incorporate_instance_method(PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt41, $list_alt114);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt69, $list_alt119);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD);
        methods.methods_incorporate_instance_method(HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER, $list_alt85, $list_alt69, $list_alt124);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD);
        methods.methods_incorporate_instance_method(HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt131, $list_alt132);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD);
        methods.methods_incorporate_instance_method(HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt69, $list_alt138);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD);
        methods.methods_incorporate_instance_method(HTML_FORM, HTML_PLAN_DISPLAYER, $list_alt35, $list_alt69, $list_alt142);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_FORM, HTML_PLAN_DISPLAYER_HTML_FORM_METHOD);
        return NIL;
    }

    public static SubLObject setup_shop_displayers_file() {
        if (SubLFiles.USE_V1) {
            sethash($TE_LINK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str1$bl_sdi_gif, NIL));
            sethash($TE_METHOD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str3$gr_sdi_gif, NIL));
            sethash($TE_OPERATOR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str5$yl_sdi_gif, NIL));
            sethash($TE_EXAMINER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str7$red_diam_gif, NIL));
            classes.subloop_new_class(HTML_TASK_DISPLAYER, SHOP_INDEXED_OBJECT, NIL, NIL, $list10);
            classes.class_set_implements_slot_listeners(HTML_TASK_DISPLAYER, NIL);
            classes.subloop_note_class_initialization_function(HTML_TASK_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS);
            classes.subloop_note_instance_initialization_function(HTML_TASK_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE);
            subloop_reserved_initialize_html_task_displayer_class(HTML_TASK_DISPLAYER);
            classes.subloop_new_class(HTML_PLAN_DISPLAYER, SHOP_INDEXED_OBJECT, $list21, NIL, $list22);
            classes.class_set_implements_slot_listeners(HTML_PLAN_DISPLAYER, NIL);
            classes.subloop_note_class_initialization_function(HTML_PLAN_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS);
            classes.subloop_note_instance_initialization_function(HTML_PLAN_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE);
            subloop_reserved_initialize_html_plan_displayer_class(HTML_PLAN_DISPLAYER);
            classes.subloop_new_class(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, SHOP_PLAN_DISPLAYER_FACTORY, NIL, NIL, NIL);
            classes.class_set_implements_slot_listeners(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, NIL);
            classes.subloop_note_class_initialization_function(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
            classes.subloop_note_instance_initialization_function(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
            subloop_reserved_initialize_cyc_development_plan_displayer_factory_class(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
            methods.methods_incorporate_class_method(CREATE_PLAN_DISPLAYER, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list35, $list36, $list37);
            methods.subloop_register_class_method(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, CREATE_PLAN_DISPLAYER, $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH);
            methods.methods_incorporate_class_method(CREATE_TASK_DISPLAYER, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list35, $list41, $list42);
            methods.subloop_register_class_method(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, CREATE_TASK_DISPLAYER, $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH);
            methods.methods_incorporate_instance_method(INITIALIZE, HTML_TASK_DISPLAYER, $list45, NIL, $list46);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, INITIALIZE, HTML_TASK_DISPLAYER_INITIALIZE_METHOD);
            methods.methods_incorporate_instance_method(INIT_WITH_TASK, HTML_TASK_DISPLAYER, $list35, $list49, $list50);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, INIT_WITH_TASK, HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD);
            methods.methods_incorporate_class_method(FIND_INSTANCE_BY_ID_STRING, HTML_TASK_DISPLAYER, $list35, $list54, $list55);
            methods.subloop_register_class_method(HTML_TASK_DISPLAYER, FIND_INSTANCE_BY_ID_STRING, HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD);
            methods.methods_incorporate_instance_method(TASK_EXAMINER_LINK_IMAGE, HTML_TASK_DISPLAYER, $list45, NIL, $list58);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, TASK_EXAMINER_LINK_IMAGE, HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD);
            methods.methods_incorporate_instance_method(CB_TASK_EXAMINER_LINK, HTML_TASK_DISPLAYER, $list45, NIL, $list63);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, CB_TASK_EXAMINER_LINK, HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD);
            methods.methods_incorporate_instance_method(HTML_FORM, HTML_TASK_DISPLAYER, $list35, $list69, $list70);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, HTML_FORM, HTML_TASK_DISPLAYER_HTML_FORM_METHOD);
            methods.methods_incorporate_instance_method(FORMULA, HTML_TASK_DISPLAYER, $list35, NIL, $list77);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, FORMULA, HTML_TASK_DISPLAYER_FORMULA_METHOD);
            methods.methods_incorporate_instance_method(BINDINGS, HTML_TASK_DISPLAYER, $list35, NIL, $list81);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, BINDINGS, HTML_TASK_DISPLAYER_BINDINGS_METHOD);
            methods.methods_incorporate_instance_method(DISPLAY_BINDINGS, HTML_TASK_DISPLAYER, $list85, $list69, $list86);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, DISPLAY_BINDINGS, HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD);
            methods.methods_incorporate_instance_method(HTML_TASK_PAGE, HTML_TASK_DISPLAYER, $list35, $list69, $list93);
            methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, HTML_TASK_PAGE, HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD);
            methods.methods_incorporate_instance_method(INITIALIZE, HTML_PLAN_DISPLAYER, $list113, NIL, $list114);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, INITIALIZE, HTML_PLAN_DISPLAYER_INITIALIZE_METHOD);
            methods.methods_incorporate_instance_method(INIT_WITH_PLAN, HTML_PLAN_DISPLAYER, $list35, $list116, $list117);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, INIT_WITH_PLAN, HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD);
            methods.methods_incorporate_instance_method(PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER, $list45, $list41, $list122);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD);
            methods.methods_incorporate_instance_method(HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER, $list45, $list69, $list127);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD);
            methods.methods_incorporate_instance_method(HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER, $list85, $list69, $list132);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD);
            methods.methods_incorporate_instance_method(HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER, $list45, $list139, $list140);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD);
            methods.methods_incorporate_instance_method(HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER, $list45, $list69, $list146);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD);
            methods.methods_incorporate_instance_method(HTML_FORM, HTML_PLAN_DISPLAYER, $list35, $list69, $list150);
            methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_FORM, HTML_PLAN_DISPLAYER_HTML_FORM_METHOD);
        }
        if (SubLFiles.USE_V2) {
            methods.methods_incorporate_instance_method(INITIALIZE, HTML_PLAN_DISPLAYER, $list_alt105, NIL, $list_alt106);
            methods.methods_incorporate_instance_method(INIT_WITH_PLAN, HTML_PLAN_DISPLAYER, $list_alt35, $list_alt108, $list_alt109);
            methods.methods_incorporate_instance_method(PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt41, $list_alt114);
            methods.methods_incorporate_instance_method(HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt69, $list_alt119);
            methods.methods_incorporate_instance_method(HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER, $list_alt85, $list_alt69, $list_alt124);
            methods.methods_incorporate_instance_method(HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt131, $list_alt132);
            methods.methods_incorporate_instance_method(HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER, $list_alt45, $list_alt69, $list_alt138);
            methods.methods_incorporate_instance_method(HTML_FORM, HTML_PLAN_DISPLAYER, $list_alt35, $list_alt69, $list_alt142);
        }
        return NIL;
    }

    public static SubLObject setup_shop_displayers_file_Previous() {
        sethash($TE_LINK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str1$bl_sdi_gif, NIL));
        sethash($TE_METHOD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str3$gr_sdi_gif, NIL));
        sethash($TE_OPERATOR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str5$yl_sdi_gif, NIL));
        sethash($TE_EXAMINER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str7$red_diam_gif, NIL));
        classes.subloop_new_class(HTML_TASK_DISPLAYER, SHOP_INDEXED_OBJECT, NIL, NIL, $list10);
        classes.class_set_implements_slot_listeners(HTML_TASK_DISPLAYER, NIL);
        classes.subloop_note_class_initialization_function(HTML_TASK_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS);
        classes.subloop_note_instance_initialization_function(HTML_TASK_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE);
        subloop_reserved_initialize_html_task_displayer_class(HTML_TASK_DISPLAYER);
        classes.subloop_new_class(HTML_PLAN_DISPLAYER, SHOP_INDEXED_OBJECT, $list21, NIL, $list22);
        classes.class_set_implements_slot_listeners(HTML_PLAN_DISPLAYER, NIL);
        classes.subloop_note_class_initialization_function(HTML_PLAN_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS);
        classes.subloop_note_instance_initialization_function(HTML_PLAN_DISPLAYER, SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE);
        subloop_reserved_initialize_html_plan_displayer_class(HTML_PLAN_DISPLAYER);
        classes.subloop_new_class(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, SHOP_PLAN_DISPLAYER_FACTORY, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, NIL);
        classes.subloop_note_class_initialization_function(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
        classes.subloop_note_instance_initialization_function(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
        subloop_reserved_initialize_cyc_development_plan_displayer_factory_class(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
        methods.methods_incorporate_class_method(CREATE_PLAN_DISPLAYER, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list35, $list36, $list37);
        methods.subloop_register_class_method(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, CREATE_PLAN_DISPLAYER, $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH);
        methods.methods_incorporate_class_method(CREATE_TASK_DISPLAYER, CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, $list35, $list41, $list42);
        methods.subloop_register_class_method(CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, CREATE_TASK_DISPLAYER, $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH);
        methods.methods_incorporate_instance_method(INITIALIZE, HTML_TASK_DISPLAYER, $list45, NIL, $list46);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, INITIALIZE, HTML_TASK_DISPLAYER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INIT_WITH_TASK, HTML_TASK_DISPLAYER, $list35, $list49, $list50);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, INIT_WITH_TASK, HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD);
        methods.methods_incorporate_class_method(FIND_INSTANCE_BY_ID_STRING, HTML_TASK_DISPLAYER, $list35, $list54, $list55);
        methods.subloop_register_class_method(HTML_TASK_DISPLAYER, FIND_INSTANCE_BY_ID_STRING, HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD);
        methods.methods_incorporate_instance_method(TASK_EXAMINER_LINK_IMAGE, HTML_TASK_DISPLAYER, $list45, NIL, $list58);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, TASK_EXAMINER_LINK_IMAGE, HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD);
        methods.methods_incorporate_instance_method(CB_TASK_EXAMINER_LINK, HTML_TASK_DISPLAYER, $list45, NIL, $list63);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, CB_TASK_EXAMINER_LINK, HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD);
        methods.methods_incorporate_instance_method(HTML_FORM, HTML_TASK_DISPLAYER, $list35, $list69, $list70);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, HTML_FORM, HTML_TASK_DISPLAYER_HTML_FORM_METHOD);
        methods.methods_incorporate_instance_method(FORMULA, HTML_TASK_DISPLAYER, $list35, NIL, $list77);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, FORMULA, HTML_TASK_DISPLAYER_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(BINDINGS, HTML_TASK_DISPLAYER, $list35, NIL, $list81);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, BINDINGS, HTML_TASK_DISPLAYER_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_BINDINGS, HTML_TASK_DISPLAYER, $list85, $list69, $list86);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, DISPLAY_BINDINGS, HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(HTML_TASK_PAGE, HTML_TASK_DISPLAYER, $list35, $list69, $list93);
        methods.subloop_register_instance_method(HTML_TASK_DISPLAYER, HTML_TASK_PAGE, HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, HTML_PLAN_DISPLAYER, $list113, NIL, $list114);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, INITIALIZE, HTML_PLAN_DISPLAYER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INIT_WITH_PLAN, HTML_PLAN_DISPLAYER, $list35, $list116, $list117);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, INIT_WITH_PLAN, HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD);
        methods.methods_incorporate_instance_method(PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER, $list45, $list41, $list122);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, PREPARE_TASK_FOR_DISPLAY, HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER, $list45, $list69, $list127);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_HIERARCHICAL_FORM, HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD);
        methods.methods_incorporate_instance_method(HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER, $list85, $list69, $list132);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_PRIMITIVE_FORM, HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD);
        methods.methods_incorporate_instance_method(HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER, $list45, $list139, $list140);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_MULTIBINDING_VALUES, HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD);
        methods.methods_incorporate_instance_method(HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER, $list45, $list69, $list146);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_MBINDING_FORM, HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD);
        methods.methods_incorporate_instance_method(HTML_FORM, HTML_PLAN_DISPLAYER, $list35, $list69, $list150);
        methods.subloop_register_instance_method(HTML_PLAN_DISPLAYER, HTML_FORM, HTML_PLAN_DISPLAYER_HTML_FORM_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt93 = list(makeString("This method displays the contents of the Task Examiner Page for the\n   displayer\'s associated TASK."), list(makeSymbol("IGNORE"), makeSymbol("STYLE-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("PREPARED-FORM"), list(makeSymbol("FIM"), makeSymbol("PLAN-DISPLAYER"), list(QUOTE, makeSymbol("PREPARE-TASK-FOR-DISPLAY")), list(makeSymbol("FORMULA"), makeSymbol("SELF"))))), list(new SubLObject[]{ makeSymbol("CB-SIMPLE-MAIN-DOCUMENT"), list(makeString("Task Examiner"), makeKeyword("COMPLETION?"), T), list(makeSymbol("HTML-HR")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Task: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("CB-FORM"), makeSymbol("PREPARED-FORM")), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Translation: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("CLET"), list(list(makeSymbol("*PPH-QUANTIFY-VARS?*"), NIL)), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("PREPARED-FORM"))), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Assertion: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("CLET"), list(list(makeSymbol("PLANNER-RULES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLANNER-RULE"), makeSymbol("SHOP-BASIC-TASK")), makeSymbol("TASK")))), list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), makeSymbol("PLANNER-RULES")), list(makeSymbol("CSETQ"), makeSymbol("PLANNER-RULES"), list(makeSymbol("LIST"), makeSymbol("PLANNER-RULES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-RULE"), makeSymbol("PLANNER-RULES")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-ASSERTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSERTIONS"), makeSymbol("SHOP-PLANNER-RULE")), makeSymbol("CUR-RULE"))), list(makeSymbol("CB-ASSERTION-LINK"), makeSymbol("CUR-ASSERTION"))))), list(makeSymbol("PWHEN"), list(makeSymbol("BINDINGS"), makeSymbol("SELF")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Bindings: ")), list(makeSymbol("HTML-NEWLINE"))), list(makeSymbol("DISPLAY-BINDINGS"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS"))), list(RET, NIL) })));

    static private final SubLString $str_alt97$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt98$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt99$Task__ = makeString("Task: ");

    static private final SubLString $str_alt100$Translation__ = makeString("Translation: ");

    static private final SubLString $str_alt101$Assertion__ = makeString("Assertion: ");

    static private final SubLString $str_alt103$Bindings__ = makeString("Bindings: ");

    static private final SubLList $list_alt105 = list(makeKeyword("PROTECTED"), makeKeyword("NO-MEMBER-VARIABLES"));

    static private final SubLList $list_alt106 = list(makeString("@returns html-plan-displayer-p; initialized object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TASK-DISPLAYER-HASH-TABLE")), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt108 = list(makeSymbol("NEW-PLAN"), makeSymbol("DISPLAYER-FACTORY"));

    static private final SubLList $list_alt109 = list(makeString("@param NEW-PLAN          shop-basic-plan-p\n   @param DISPLAYER-FACTORY shop-plan-displayer-factory-p\n   @return html-plan-displayer-p"), list(makeSymbol("CSETQ"), makeSymbol("PLAN"), makeSymbol("NEW-PLAN")), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("VARIABLE-MANAGER")))), list(makeSymbol("NEW-MBINDING"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("BINDINGS")))), list(makeSymbol("OPEN-VARS"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("OPEN-VARIABLES")))), makeSymbol("DISPLAY-SUB")), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAR"), makeSymbol("OPEN-VARS")), list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL-VARIABLE")), makeSymbol("CUR-VAR")))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("CUR-VAR"), makeSymbol("EL-VAR")), makeSymbol("DISPLAY-SUB")))), list(makeSymbol("CSETQ"), makeSymbol("MBINDING"), makeSymbol("NEW-MBINDING")), list(makeSymbol("CSETQ"), makeSymbol("OPEN-VARIABLES"), makeSymbol("OPEN-VARS")), list(makeSymbol("CSETQ"), makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION"), makeSymbol("DISPLAY-SUB")), list(makeSymbol("CDOLIST"), list(makeSymbol("STEP"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-PLAN"), list(QUOTE, makeSymbol("PRE-ORDERING")))), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-DISPLAYER"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("DISPLAYER-FACTORY"), list(QUOTE, makeSymbol("CREATE-TASK-DISPLAYER")), makeSymbol("STEP")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT-WITH-TASK"), makeSymbol("HTML-TASK-DISPLAYER")), makeSymbol("TASK-DISPLAYER"), makeSymbol("STEP")), list(makeSymbol("SET-SLOT"), makeSymbol("TASK-DISPLAYER"), list(QUOTE, makeSymbol("PLAN-DISPLAYER")), makeSymbol("SELF")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("STEP"), makeSymbol("TASK-DISPLAYER-HASH-TABLE")), makeSymbol("TASK-DISPLAYER")))), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym110$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    static private final SubLList $list_alt114 = list(makeString("@param TASK listp; a task formula in CycL."), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TASK"), list(makeSymbol("SUBLIS"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("SIMPLE-BINDING-LIST"))), makeSymbol("TASK"))), list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("VARIABLE-MANAGER"))))), list(RET, list(makeSymbol("FIM"), makeSymbol("VAR-MANAGER"), list(QUOTE, makeSymbol("RECOVER-EL")), makeSymbol("NEW-TASK")))));

    @Override
    public void declareFunctions() {
        declare_shop_displayers_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_displayers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_displayers_file();
    }

    

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    static private final SubLList $list_alt119 = list(makeString("Displays all the tasks in the plan, indicating decompositon relationships\n   with tree-like indentation."), list(makeSymbol("CLET"), list(list(makeSymbol("PRE"), list(makeSymbol("REVERSE"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("PRE-ORDERING"))))), list(makeSymbol("POST"), list(makeSymbol("GET-SLOT"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("POST-ORDERING"))))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("DO-PPO-TREE-DEPTH"), list(makeSymbol("STEP"), makeSymbol("INDENT-COUNT"), makeSymbol("PRE"), makeSymbol("POST"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CLET"), list(list(makeSymbol("CUR-TASK"), list(makeSymbol("GETHASH"), makeSymbol("STEP"), makeSymbol("TASK-DISPLAYER-HASH-TABLE")))), list(makeSymbol("HTML-INDENT"), list(makeSymbol("*"), FIVE_INTEGER, makeSymbol("INDENT-COUNT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HTML-FORM"), makeSymbol("HTML-TASK-DISPLAYER")), makeSymbol("CUR-TASK"), makeSymbol("STYLE-ARGS")), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL)));

    static private final SubLSymbol $sym120$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    static private final SubLList $list_alt124 = list(makeString("Displays only the primitive tasks of the plan."), list(makeSymbol("CLET"), list(list(makeSymbol("STEP-DISPLAY-FORM"), NIL)), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("STEP"), makeSymbol("NUM"), list(makeSymbol("FIM"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("PRIMITIVE-FORM")))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("  Step ")), list(makeSymbol("HTML-PRIN1"), list(makeSymbol("1+"), makeSymbol("NUM"))), list(makeSymbol("HTML-PRINC"), makeString(".  "))), list(makeSymbol("CSETQ"), makeSymbol("STEP-DISPLAY-FORM"), list(makeSymbol("PREPARE-TASK-FOR-DISPLAY"), makeSymbol("SELF"), makeSymbol("STEP"))), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), $CYCL, makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-FORM"), makeSymbol("STEP-DISPLAY-FORM")), list(makeSymbol("CLET"), list(list(makeSymbol("*PPH-QUANTIFY-VARS?*"), NIL)), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("STEP-DISPLAY-FORM")))), list(makeSymbol("HTML-NEWLINE")))), list(RET, NIL));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    static private final SubLString $str_alt127$__Step_ = makeString("  Step ");

    static private final SubLString $str_alt128$___ = makeString(".  ");

    static private final SubLList $list_alt131 = list(makeSymbol("VAR"), makeSymbol("STYLE-ARGS"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PLAN"), list(QUOTE, makeSymbol("VARIABLE-MANAGER"))), list(QUOTE, makeSymbol("RECOVER-EL-VARIABLE")), makeSymbol("VAR"))), list(makeSymbol("VALUES"), list(makeSymbol("MB-VAR-VALUES"), makeSymbol("VAR"), makeSymbol("MBINDING")))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("VALUES")), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), $CYCL, makeSymbol("STYLE-ARGS")), list(makeSymbol("CB-FORM"), makeSymbol("EL-VAR")), list(makeSymbol("HTML-PHRASE-WITH-TARGET"), makeSymbol("EL-VAR"))), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-INDENT"), THREE_INTEGER), list(makeSymbol("HTML-PRINC"), makeString("is one of")), list(makeSymbol("HTML-INDENT"), THREE_INTEGER)), list(makeSymbol("HTML-PHRASE-WITH-TARGET"), list(makeSymbol("FIRST"), makeSymbol("VALUES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAL"), list(makeSymbol("REST"), makeSymbol("VALUES"))), list(makeSymbol("HTML-PRINC"), makeString(",")), list(makeSymbol("HTML-INDENT"), TWO_INTEGER), list(makeSymbol("HTML-PHRASE-WITH-TARGET"), makeSymbol("CUR-VAL"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL)));

    static private final SubLString $str_alt135$_ = makeString(",");

    static private final SubLList $list_alt138 = list(list(makeSymbol("PWHEN"), makeSymbol("OPEN-VARIABLES"), list(makeSymbol("HTML-NEWLINE")), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("for any of the following values..."))), list(makeSymbol("HTML-NEWLINE"), TWO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAR"), makeSymbol("OPEN-VARIABLES")), list(makeSymbol("HTML-MULTIBINDING-VALUES"), makeSymbol("SELF"), makeSymbol("CUR-VAR"), makeSymbol("STYLE-ARGS"))), list(makeSymbol("HTML-NEWLINE"))), list(RET, NIL));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");

    static private final SubLString $str_alt140$for_any_of_the_following_values__ = makeString("for any of the following values...");

    static private final SubLList $list_alt142 = list(list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), makeKeyword("PRIMITIVE"), makeSymbol("STYLE-ARGS")), list(makeSymbol("HTML-PRIMITIVE-FORM"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS")), list(makeSymbol("HTML-HIERARCHICAL-FORM"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS"))), list(makeSymbol("HTML-MBINDING-FORM"), makeSymbol("SELF"), makeSymbol("STYLE-ARGS")), list(RET, NIL));
}

/**
 * Total time: 750 ms
 */
