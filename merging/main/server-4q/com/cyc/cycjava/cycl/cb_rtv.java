/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_wrap_assertions$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$show_assertions_in_english$;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_elements;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.utilities_macros.register_api_predefined_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-RTV
 * source file: /cyc/top/cycl/cb-rtv.lisp
 * created:     2019/07/03 17:38:11
 */
public final class cb_rtv extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt123$ = makeString("");

    public static final SubLFile me = new cb_rtv();

 public static final String myName = "com.cyc.cycjava.cycl.cb_rtv";


    // defparameter
    // The generation function to use when showing FORTs.
    /**
     * The generation function to use when showing FORTs.
     */
    @LispMethod(comment = "The generation function to use when showing FORTs.\ndefparameter")
    private static final SubLSymbol $cb_rtv_fort_generation_fn$ = makeSymbol("*CB-RTV-FORT-GENERATION-FN*");

    // defparameter
    // The parsing function to use when parsing FORTs.
    /**
     * The parsing function to use when parsing FORTs.
     */
    @LispMethod(comment = "The parsing function to use when parsing FORTs.\ndefparameter")
    private static final SubLSymbol $cb_rtv_fort_parse_fn$ = makeSymbol("*CB-RTV-FORT-PARSE-FN*");

    // deflexical
    /**
     * The default mt to run queries in--also will be auto-entered in the query tool
     */
    @LispMethod(comment = "The default mt to run queries in--also will be auto-entered in the query tool\ndeflexical")
    private static final SubLSymbol $rtv_default_query_mt$ = makeSymbol("*RTV-DEFAULT-QUERY-MT*");

    // defparameter
    // What level of support are we currently on?
    /**
     * What level of support are we currently on?
     */
    @LispMethod(comment = "What level of support are we currently on?\ndefparameter")
    private static final SubLSymbol $cb_rtv_meta_support_level$ = makeSymbol("*CB-RTV-META-SUPPORT-LEVEL*");

    // deflexical
    // How many levels of meta-supports should we find and allow the display of?
    /**
     * How many levels of meta-supports should we find and allow the display of?
     */
    @LispMethod(comment = "How many levels of meta-supports should we find and allow the display of?\ndeflexical")
    private static final SubLSymbol $cb_rtv_meta_support_max$ = makeSymbol("*CB-RTV-META-SUPPORT-MAX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_rtv_graph_keys$ = makeSymbol("*CB-RTV-GRAPH-KEYS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$RTV = makeString("RTV");

    static private final SubLString $str2$cb_rtv = makeString("cb-rtv");

    private static final SubLSymbol CB_LINK_RTV_QUERY = makeSymbol("CB-LINK-RTV-QUERY");

    static private final SubLString $$$relatedToVia_Query_Tool = makeString("relatedToVia Query Tool");

    private static final SubLSymbol FORT_TO_STRING = makeSymbol("FORT-TO-STRING");

    private static final SubLSymbol TERMS_FOR_BROWSING = makeSymbol("TERMS-FOR-BROWSING");

    private static final SubLObject $const10$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    public static final SubLSymbol $cb_rtv_predicates$ = makeSymbol("*CB-RTV-PREDICATES*");

    private static final SubLList $list12 = list(new SubLObject[]{ reader_make_constant_shell("actors"), reader_make_constant_shell("affiliatedWith"), reader_make_constant_shell("acquaintedWith"), reader_make_constant_shell("allies"), reader_make_constant_shell("citizens"), reader_make_constant_shell("containsInformation"), reader_make_constant_shell("deliberateActors"), reader_make_constant_shell("deviceUsed"), reader_make_constant_shell("directingAgent"), reader_make_constant_shell("doesBusinessWith"), reader_make_constant_shell("employees"), reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("hasLeaders"), reader_make_constant_shell("hasOwnershipIn"), reader_make_constant_shell("in-ContCompletely"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("performedBy"), reader_make_constant_shell("possesses"), reader_make_constant_shell("residenceOfOrganization"), reader_make_constant_shell("subEvents") });

    public static final SubLSymbol $cb_rtv_ask_results$ = makeSymbol("*CB-RTV-ASK-RESULTS*");

    public static final SubLSymbol $cb_rtv_collections$ = makeSymbol("*CB-RTV-COLLECTIONS*");





    private static final SubLList $list18 = list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Person"), reader_make_constant_shell("Place"));

    private static final SubLString $str21$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str22$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");



    private static final SubLSymbol $TERM2_ADD_TYPE = makeKeyword("TERM2-ADD-TYPE");



    private static final SubLSymbol $TERM2_VARIABLE_TYPE = makeKeyword("TERM2-VARIABLE-TYPE");





    private static final SubLSymbol $GENL_PRED_REASONING = makeKeyword("GENL-PRED-REASONING");



    private static final SubLList $list44 = list(makeKeyword("ISA"), $GENL);

    private static final SubLSymbol $sym45$_ANY = makeSymbol("?ANY");











    private static final SubLString $str53$___ = makeString(" : ");

    private static final SubLSymbol $sym54$STRING_ = makeSymbol("STRING<");

    private static final SubLString $$$cg = makeString("cg");

    private static final SubLString $$$How_can_the_individual_named_ = makeString("How can the individual named ");

    private static final SubLString $$$be_connected_to_ = makeString("be connected to ");

    private static final SubLString $str62$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    private static final SubLString $$$the_individual_named = makeString("the individual named");

    private static final SubLString $$$any = makeString("any");

    private static final SubLString $$$any_type_of = makeString("any type of");

    private static final SubLString $str68$___ = makeString("<--");

    private static final SubLString $$$by_at_most = makeString("by at most");

    private static final SubLString $$$links_using_ = makeString("links using ");

    private static final SubLString $str71$_the_selected_relations_and_their = makeString(" the selected relations and their specializations ");

    private static final SubLString $$$_only_the_selected_relations_ = makeString(" only the selected relations ");

    private static final SubLString $str76$_ = makeString("*");

    private static final SubLString $str77$________Add_New_Relation = makeString("   <--- Add New Relation");

    private static final SubLString $str79$_____Remove_Selected_Relations = makeString("---> Remove Selected Relations");

    private static final SubLSymbol $RTV_PREDICATE_GRAPH_EVENT = makeKeyword("RTV-PREDICATE-GRAPH-EVENT");

    private static final SubLString $str81$_Visualize_Selected_Relations_ = makeString("[Visualize Selected Relations]");

    private static final SubLString $$$in_the_context_ = makeString("in the context ");

    private static final SubLString $str83$Current_query_formula____A = makeString("Current query formula : ~A");

    private static final SubLSymbol CB_RTV = makeSymbol("CB-RTV");

    private static final SubLString $$$Update = makeString("Update");

    private static final SubLString $$$Run_This_Query = makeString("Run This Query");

    private static final SubLString $$$Reset_Completely = makeString("Reset Completely");

    private static final SubLString $str91$No_answers_found_ = makeString("No answers found.");

    private static final SubLString $$$Query_Results = makeString("Query Results");

    private static final SubLSymbol $RTV_GRAPH_EVENT = makeKeyword("RTV-GRAPH-EVENT");

    private static final SubLString $str94$_Visualize_below_justification_ = makeString("[Visualize below justification]");

    private static final SubLString $str95$_Visualize_more_justifications_ = makeString("[Visualize more justifications]");

    private static final SubLSymbol $EXPANDED_NODE_TO_NODE = makeKeyword("EXPANDED-NODE-TO-NODE");

    private static final SubLString $str97$_Visualize_justifications_of_all_ = makeString("[Visualize justifications of all results]");

    private static final SubLList $list98 = list(makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATION"));

    private static final SubLString $str99$True__ = makeString("True: ");

    private static final SubLSymbol $RTV_JUSTIFY_TERM = makeKeyword("RTV-JUSTIFY-TERM");

    private static final SubLString $str101$_Explain_ = makeString("[Explain]");

    private static final SubLString $str102$_Visualize_ = makeString("[Visualize]");

    private static final SubLSymbol CB_RTV_JUSTIFY_TERM = makeSymbol("CB-RTV-JUSTIFY-TERM");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str108$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$1 = makeString("1");

    private static final SubLSymbol CB_RTV_JUSTIFY_TERM_OPEN_WINDOW = makeSymbol("CB-RTV-JUSTIFY-TERM-OPEN-WINDOW");

    private static final SubLString $str116$justify_me = makeString("justify-me");

    private static final SubLString $str117$cb_rtv_justify_term = makeString("cb-rtv-justify-term");

    private static final SubLSymbol CB_LINK_RTV_JUSTIFY_TERM = makeSymbol("CB-LINK-RTV-JUSTIFY-TERM");

    private static final SubLString $str119$window_open__ = makeString("window.open('");

    private static final SubLString $str120$__ = makeString("',");

    private static final SubLString $str121$__A_ = makeString("'~A'");

    private static final SubLString $$$null = makeString("null");

    private static final SubLString $str123$___A____ = makeString(",'~A'); ");

    private static final SubLString $str124$dependent_yes_height_360_width_64 = makeString("dependent=yes,height=360,width=640,innerheight=360,innerwidth=640,hotkeys=no,directories=no,menubar=no,resizable=yes,scrollbars=yes,toolbar=no");

    private static final SubLString $str125$return_false_ = makeString("return false;");

    private static final SubLList $list127 = list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-GLYPH"), $NBSP));

    private static final SubLString $str129$meta_supports_ = makeString("meta_supports_");

    private static final SubLString $str130$text_css = makeString("text/css");

    private static final SubLString $$$screen = makeString("screen");

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $str133$ = makeString("");

    private static final SubLString $str136$_A_meta__D = makeString("~A_meta_~D");

    private static final SubLString $$$support = makeString("support");

    private static final SubLString $str138$additional_supports_ = makeString("additional_supports_");

    private static final SubLString $$$Additional_Supports = makeString("Additional Supports");

    private static final SubLString $str141$_A_additional__D = makeString("~A_additional_~D");

    private static final SubLString $str142$_A__D = makeString("~A_~D");

    private static final SubLString $str143$_A_ = makeString("~A_");

    private static final SubLString $str144$_A_D = makeString("~A~D");

    private static final SubLString $str146$_S_ = makeString("~S.");

    private static final SubLList $list148 = list(new SubLObject[]{ makeKeyword("ASK-FORMULA"), makeKeyword("FORTS"), makeKeyword("PREDS"), makeKeyword("MT"), makeKeyword("DEPTH"), makeKeyword("FILTER-PRED"), makeKeyword("FILTER-FORT"), makeKeyword("SIGNATURE"), makeKeyword("GRAPH-TYPE") });

    private static final SubLString $str155$_A = makeString("~A");



    private static final SubLString $str157$cb_rtv_graph_event = makeString("cb-rtv-graph-event");

    private static final SubLSymbol CB_LINK_RTV_GRAPH_EVENT = makeSymbol("CB-LINK-RTV-GRAPH-EVENT");

    private static final SubLSymbol CB_RTV_GRAPH_EVENT_PROCESS = makeSymbol("CB-RTV-GRAPH-EVENT-PROCESS");

    private static final SubLSymbol CB_RTV_GRAPH_EVENT = makeSymbol("CB-RTV-GRAPH-EVENT");

    private static final SubLSymbol BBF_RTV_ALL_EDGES_BETWEEN = makeSymbol("BBF-RTV-ALL-EDGES-BETWEEN");

    private static final SubLSymbol BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING = makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE-SATISFYING");

    private static final SubLList $list166 = list(makeKeyword("HELP-STRING"), makeString("Show links between two FORTS (nodes) through PREDS (links) in MT with maximum path length of DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Currently only one path is shown.)"));



    private static final SubLSymbol BBF_RTV_ALL_EDGES_FROM_NODE = makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE");

    private static final SubLList $list169 = list(makeKeyword("HELP-STRING"), makeString("Show all from one FORTS (nodes) through PREDS (links) in MT to DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Note that this can make huge graphs for higher values of DEPTH.)"));

    private static final SubLList $list170 = list(reader_make_constant_shell("isa"), makeSymbol("?ANY"), reader_make_constant_shell("Thing"));

    private static final SubLList $list172 = list(makeKeyword("HELP-STRING"), makeString(""));

    private static final SubLSymbol RTV_CLAUSE_P = makeSymbol("RTV-CLAUSE-P");

    private static final SubLSymbol BBF_RTV = makeSymbol("BBF-RTV");

    private static final SubLString $str176$cb_rtv_predicate_graph_event = makeString("cb-rtv-predicate-graph-event");

    private static final SubLSymbol CB_LINK_RTV_PREDICATE_GRAPH_EVENT = makeSymbol("CB-LINK-RTV-PREDICATE-GRAPH-EVENT");

    private static final SubLSymbol CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS = makeSymbol("CB-RTV-PREDICATE-GRAPH-EVENT-PROCESS");

    private static final SubLSymbol CB_RTV_PREDICATE_GRAPH_EVENT = makeSymbol("CB-RTV-PREDICATE-GRAPH-EVENT");

    private static final SubLSymbol BBF_ALL_EDGES_SUBSUMED_BY_PREDS = makeSymbol("BBF-ALL-EDGES-SUBSUMED-BY-PREDS");

    private static final SubLList $list181 = list(makeKeyword("HELP-STRING"), makeString("Show all specPreds of PREDS (nodes) in MT."));

    // Definitions
    public static final SubLObject cb_link_rtv_query_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$RTV;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt2$cb_rtv);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    // Definitions
    public static SubLObject cb_link_rtv_query(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$RTV;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str2$cb_rtv);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_rtv_fort_generation_fn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $show_assertions_in_english$.getDynamicValue(thread) ? ((SubLObject) ($cb_rtv_fort_generation_fn$.getDynamicValue(thread))) : symbol_function(FORT_TO_STRING);
        }
    }

    public static SubLObject cb_rtv_fort_generation_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue(thread);
        if (pcase_var.eql($NL)) {
            return $cb_rtv_fort_generation_fn$.getDynamicValue(thread);
        }
        return symbol_function(FORT_TO_STRING);
    }

    public static final SubLObject cb_rtv_fort_parse_fn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_rtv_fort_parse_fn$.getDynamicValue(thread);
        }
    }

    public static SubLObject cb_rtv_fort_parse_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_rtv_fort_parse_fn$.getDynamicValue(thread);
    }

    public static final SubLObject maybe_initialize_cb_rtv_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_rtv_predicates$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.cb_rtv.initialize_cb_rtv_predicates();
            }
            return NIL;
        }
    }

    public static SubLObject maybe_initialize_cb_rtv_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_rtv_predicates$.getDynamicValue(thread)) {
            initialize_cb_rtv_predicates();
        }
        return NIL;
    }

    public static final SubLObject initialize_cb_rtv_predicates_alt() {
        $cb_rtv_predicates$.setDynamicValue($list_alt11);
        return NIL;
    }

    public static SubLObject initialize_cb_rtv_predicates() {
        $cb_rtv_predicates$.setDynamicValue($list12);
        return NIL;
    }

    public static final SubLObject maybe_initialize_cb_rtv_collections_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_rtv_collections$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.cb_rtv.initialize_cb_rtv_collections();
            }
            return T;
        }
    }

    public static SubLObject maybe_initialize_cb_rtv_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_rtv_collections$.getDynamicValue(thread)) {
            return initialize_cb_rtv_collections();
        }
        return T;
    }

    public static final SubLObject initialize_cb_rtv_collections_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    $cb_rtv_collections$.setDynamicValue(isa.all_fort_instances($$RTVDemoCollection, UNPROVIDED, UNPROVIDED), thread);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL == $cb_rtv_collections$.getDynamicValue(thread)) {
                $cb_rtv_collections$.setDynamicValue($list_alt17, thread);
            }
            return $cb_rtv_collections$.getDynamicValue(thread);
        }
    }

    public static SubLObject initialize_cb_rtv_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $cb_rtv_collections$.setDynamicValue(isa.all_fort_instances($$RTVDemoCollection, UNPROVIDED, UNPROVIDED), thread);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == $cb_rtv_collections$.getDynamicValue(thread)) {
            $cb_rtv_collections$.setDynamicValue($list18, thread);
        }
        return $cb_rtv_collections$.getDynamicValue(thread);
    }

    public static final SubLObject cb_rtv_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject debug = NIL;
                SubLObject running_query_nowP = NIL;
                SubLObject genl_preds_reasoning_enabledP = NIL;
                SubLObject filter_mt = (NIL != fort_types_interface.mtP(html_arghash.get_arghash_value($MT, arghash))) ? ((SubLObject) (html_arghash.get_arghash_value($MT, arghash))) : $rtv_default_query_mt$.getGlobalValue();
                SubLObject generation_fn = com.cyc.cycjava.cycl.cb_rtv.cb_rtv_fort_generation_fn();
                SubLObject parse_fn = com.cyc.cycjava.cycl.cb_rtv.cb_rtv_fort_parse_fn();
                if (NIL != html_arghash.get_arghash_value($RESET, arghash)) {
                    arghash = html_arghash.new_arghash(UNPROVIDED);
                    com.cyc.cycjava.cycl.cb_rtv.initialize_cb_rtv_collections();
                    com.cyc.cycjava.cycl.cb_rtv.initialize_cb_rtv_predicates();
                }
                com.cyc.cycjava.cycl.cb_rtv.maybe_initialize_cb_rtv_predicates();
                com.cyc.cycjava.cycl.cb_rtv.maybe_initialize_cb_rtv_collections();
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($$$relatedToVia_Query_Tool);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_color_white$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_value));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $TERM1, debug, generation_fn, parse_fn, $$Individual, filter_mt);
                                    if (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $INDIVIDUAL) {
                                        arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $TERM2, debug, generation_fn, parse_fn, $$Individual, filter_mt);
                                    } else {
                                        if ((html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $ISA) || (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $GENL)) {
                                            arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $TERM2_ADD_TYPE, debug, generation_fn, parse_fn, $$Collection, filter_mt);
                                            if (NIL != forts.fort_p(html_arghash.get_arghash_value($TERM2_ADD_TYPE, arghash))) {
                                                $cb_rtv_collections$.setDynamicValue(cons(html_arghash.get_arghash_value($TERM2_ADD_TYPE, arghash), $cb_rtv_collections$.getDynamicValue(thread)), thread);
                                                html_arghash.set_arghash_value($TERM2_VARIABLE_TYPE, arghash, html_arghash.get_arghash_value($TERM2_ADD_TYPE, arghash));
                                                html_arghash.html_arghash_nl_fort_input_clear(arghash, $TERM2_ADD_TYPE);
                                            }
                                        } else {
                                            html_arghash.set_arghash_value($TERM2_TYPE, arghash, $INDIVIDUAL);
                                        }
                                    }
                                    if (NIL == html_arghash.get_arghash_value($PRED, arghash)) {
                                        html_arghash.set_arghash_value($PRED, arghash, $$genls);
                                    }
                                    if (NIL == html_arghash.get_arghash_value($NUM, arghash)) {
                                        html_arghash.set_arghash_value($NUM, arghash, TWO_INTEGER);
                                    }
                                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $NEW_PRED, debug, generation_fn, parse_fn, $$Predicate, filter_mt);
                                    if (NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $NEW_PRED)) {
                                        {
                                            SubLObject item_var = html_arghash.get_arghash_value($NEW_PRED, arghash);
                                            if (NIL == member(item_var, $cb_rtv_predicates$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $cb_rtv_predicates$.setDynamicValue(cons(item_var, $cb_rtv_predicates$.getDynamicValue(thread)), thread);
                                            }
                                        }
                                        arghash = html_arghash.html_arghash_nl_fort_input_clear(arghash, $NEW_PRED);
                                    }
                                    if (NIL != html_arghash.get_arghash_value($REMOVE_PREDS, arghash)) {
                                        $cb_rtv_predicates$.setDynamicValue(list_utilities.remove_objects_from_list(html_arghash.get_arghash_value_list($PREDICATES, arghash), $cb_rtv_predicates$.getDynamicValue(thread), UNPROVIDED), thread);
                                        html_arghash.rem_arghash_value($REMOVE_PREDS, arghash);
                                    }
                                    com.cyc.cycjava.cycl.cb_rtv.maybe_initialize_cb_rtv_collections();
                                    com.cyc.cycjava.cycl.cb_rtv.maybe_initialize_cb_rtv_predicates();
                                    genl_preds_reasoning_enabledP = eq($ON, html_arghash.get_arghash_value($GENL_PRED_REASONING, arghash));
                                    arghash = html_arghash.html_arghash_nl_fort_input_force_default_if_unset(arghash, $MT, $rtv_default_query_mt$.getGlobalValue(), generation_fn, debug);
                                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $MT, debug, generation_fn, parse_fn, $$Microtheory, filter_mt);
                                    {
                                        SubLObject cb_rtv_query_readyP = com.cyc.cycjava.cycl.cb_rtv.cb_rtv_query_readyP(arghash);
                                        SubLObject arg1 = html_arghash.get_arghash_value($TERM1, arghash);
                                        SubLObject arg2 = (NIL != member(html_arghash.get_arghash_value($TERM2_TYPE, arghash), $list_alt40, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($sym41$_ANY)) : html_arghash.get_arghash_value($TERM2, arghash);
                                        SubLObject pred_set = cons($$TheSet, html_arghash.get_arghash_value_list($PREDICATES, arghash));
                                        SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
                                        SubLObject ask_formula = list($$relatedToVia, arg1, arg2, pred_set, depth);
                                        SubLObject arg2_var_type = html_arghash.get_arghash_value($TERM2_VARIABLE_TYPE, arghash);
                                        SubLObject arg2_pred = (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $GENL) ? ((SubLObject) ($$genls)) : $$isa;
                                        SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
                                        if (NIL != cb_rtv_query_readyP) {
                                            if (((arg2 == $sym41$_ANY) && (NIL != arg2_var_type)) && (arg2_var_type != $$Thing)) {
                                                ask_formula = list($$and, ask_formula, list(arg2_pred, $sym41$_ANY, arg2_var_type));
                                            }
                                            html_arghash.set_arghash_value($ASK_FORMULA, arghash, ask_formula);
                                        }
                                        if (NIL != debug) {
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(arghash), symbol_function($sym50$STRING_), symbol_function(SYMBOL_NAME));
                                                SubLObject k = NIL;
                                                for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                                                    html_princ(k);
                                                    html_princ($str_alt49$___);
                                                    html_princ(gethash(k, arghash, UNPROVIDED));
                                                    html_newline(UNPROVIDED);
                                                }
                                            }
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        }
                                        dhtml_macros.dhtml_with_toggle_visibility_support();
                                        dhtml_macros.dhtml_with_dom_script();
                                        if (NIL != html_arghash.get_arghash_value($RUN_QUERY, arghash)) {
                                            running_query_nowP = T;
                                        }
                                        html_arghash.set_arghash_value($RUN_QUERY, arghash, NIL);
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$cg);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_hidden_input($str_alt2$cb_rtv, T, UNPROVIDED);
                                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(ONE_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(FIVE_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(ONE_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt54$How_can_the_individual_named_);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                html_glyph($NBSP, UNPROVIDED);
                                                                html_arghash.html_arghash_nl_fort_input(arghash, $TERM1, debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                html_terpri(UNPROVIDED);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt56$be_connected_to_);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                html_glyph($NBSP, UNPROVIDED);
                                                                {
                                                                    SubLObject key_string = html_arghash.arghash_make_key_string($TERM2_TYPE, $KEYWORD);
                                                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(key_string);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_indent(ONE_INTEGER);
                                                                    html_markup($str_alt58$onChange_javascript_this_form_sub);
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject selected = list_utilities.member_equalP($INDIVIDUAL, html_arghash.get_arghash_value_list($TERM2_TYPE, arghash));
                                                                                SubLObject value_string = html_arghash.arghash_get_string($INDIVIDUAL, $DEFAULT);
                                                                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != selected) {
                                                                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (NIL != value_string) {
                                                                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(value_string);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($$$the_individual_named);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                            {
                                                                                SubLObject selected = list_utilities.member_equalP($ISA, html_arghash.get_arghash_value_list($TERM2_TYPE, arghash));
                                                                                SubLObject value_string = html_arghash.arghash_get_string($ISA, $DEFAULT);
                                                                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != selected) {
                                                                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (NIL != value_string) {
                                                                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(value_string);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($$$any);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                            {
                                                                                SubLObject selected = list_utilities.member_equalP($GENL, html_arghash.get_arghash_value_list($TERM2_TYPE, arghash));
                                                                                SubLObject value_string = html_arghash.arghash_get_string($GENL, $DEFAULT);
                                                                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != selected) {
                                                                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (NIL != value_string) {
                                                                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(value_string);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($$$any_type_of);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                }
                                                                if (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $INDIVIDUAL) {
                                                                    html_arghash.html_arghash_nl_fort_input(arghash, $TERM2, debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_arghash.html_arghash_hidden_input(arghash, $TERM2_VARIABLE_TYPE, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    {
                                                                        SubLObject key_string = html_arghash.arghash_make_key_string($TERM2_VARIABLE_TYPE, $FORT);
                                                                        html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(key_string);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject cdolist_list_var = $cb_rtv_collections$.getDynamicValue(thread);
                                                                                    SubLObject any_type = NIL;
                                                                                    for (any_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , any_type = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject selected = list_utilities.member_equalP(any_type, html_arghash.get_arghash_value_list($TERM2_VARIABLE_TYPE, arghash));
                                                                                            SubLObject value_string = html_arghash.arghash_get_string(any_type, $DEFAULT);
                                                                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            if (NIL != selected) {
                                                                                                html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                            }
                                                                                            if (NIL != value_string) {
                                                                                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_markup(value_string);
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_princ(funcall(generation_fn, any_type));
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                                                }
                                                                                            }
                                                                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                    }
                                                                    html_princ($str_alt64$___);
                                                                    html_arghash.html_arghash_nl_fort_input(arghash, $TERM2_ADD_TYPE, NIL, generation_fn, NIL, UNPROVIDED, UNPROVIDED);
                                                                    html_arghash.html_arghash_nl_fort_input_invisible(arghash, $TERM2);
                                                                }
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($$$by_at_most);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                html_glyph($NBSP, UNPROVIDED);
                                                                html_arghash.html_arghash_text_input(arghash, $DEPTH, TWO_INTEGER, THREE_INTEGER, UNPROVIDED);
                                                                html_glyph($NBSP, UNPROVIDED);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt66$links_using_);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                {
                                                                    SubLObject key_string = html_arghash.arghash_make_key_string($GENL_PRED_REASONING, $KEYWORD);
                                                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(key_string);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_indent(ONE_INTEGER);
                                                                    html_markup($str_alt58$onChange_javascript_this_form_sub);
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject selected = list_utilities.member_equalP($ON, html_arghash.get_arghash_value_list($GENL_PRED_REASONING, arghash));
                                                                                SubLObject value_string = html_arghash.arghash_get_string($ON, $DEFAULT);
                                                                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != selected) {
                                                                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (NIL != value_string) {
                                                                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(value_string);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($str_alt67$_the_selected_relations_and_their);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                            {
                                                                                SubLObject selected = list_utilities.member_equalP($OFF, html_arghash.get_arghash_value_list($GENL_PRED_REASONING, arghash));
                                                                                SubLObject value_string = html_arghash.arghash_get_string($OFF, $DEFAULT);
                                                                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != selected) {
                                                                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (NIL != value_string) {
                                                                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(value_string);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($str_alt69$_only_the_selected_relations_);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                }
                                                                html_newline(UNPROVIDED);
                                                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(ZERO_INTEGER);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(FIVE_INTEGER);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(ZERO_INTEGER);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($CENTER));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        if (NIL == html_arghash.get_arghash_value_list($PREDICATES, arghash)) {
                                                                                            {
                                                                                                SubLObject color = html_color($RED);
                                                                                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                                if (NIL != color) {
                                                                                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_markup(html_color(color));
                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_princ($str_alt72$_);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject key_string = html_arghash.arghash_make_key_string($PREDICATES, $FORT);
                                                                                            html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                                            html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_markup(key_string);
                                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                                                                            if (true) {
                                                                                                html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_markup(FIFTEEN_INTEGER);
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var = $cb_rtv_predicates$.getDynamicValue(thread);
                                                                                                        SubLObject pred = NIL;
                                                                                                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                                                                            {
                                                                                                                SubLObject selected = list_utilities.member_equalP(pred, html_arghash.get_arghash_value_list($PREDICATES, arghash));
                                                                                                                SubLObject value_string = html_arghash.arghash_get_string(pred, $DEFAULT);
                                                                                                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                                                if (NIL != selected) {
                                                                                                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                                                }
                                                                                                                if (NIL != value_string) {
                                                                                                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_markup(value_string);
                                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                }
                                                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_princ(funcall(generation_fn, pred));
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                                                }
                                                                                            }
                                                                                            html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_glyph($NBSP, UNPROVIDED);
                                                                                        html_glyph($NBSP, UNPROVIDED);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_arghash.html_arghash_nl_fort_input(arghash, $NEW_PRED, debug, generation_fn, NIL, $$Predicate, UNPROVIDED);
                                                                                        html_newline(TWO_INTEGER);
                                                                                        html_arghash.html_arghash_submit_input(arghash, $str_alt73$________Add_New_Relation, $ADD_PRED, UNPROVIDED);
                                                                                        html_newline(TWO_INTEGER);
                                                                                        html_arghash.html_arghash_submit_input(arghash, $str_alt75$_____Remove_Selected_Relations, $REMOVE_PREDS, UNPROVIDED);
                                                                                        html_newline(TWO_INTEGER);
                                                                                        if (ONE_INTEGER.numL(length(pred_set)) && (NIL != fort_types_interface.microtheory_p(mt))) {
                                                                                            html_glyph($NBSP, UNPROVIDED);
                                                                                            cb_link($RTV_PREDICATE_GRAPH_EVENT, $str_alt77$_Visualize_Selected_Relations_, list(pred_set, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt78$in_the_context_);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                html_arghash.html_arghash_nl_fort_input(arghash, $MT, debug, generation_fn, T, $$Microtheory, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_rtv.cb_rtv_submit_buttons(arghash, cb_rtv_query_readyP);
                                                html_newline(UNPROVIDED);
                                                if (NIL != html_arghash.get_arghash_value($ASK_FORMULA, arghash)) {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt79$Current_query_formula____A, html_arghash.get_arghash_value($ASK_FORMULA, arghash));
                                                    html_newline(TWO_INTEGER);
                                                }
                                                if (NIL != running_query_nowP) {
                                                    {
                                                        SubLObject ask_formula_23 = html_arghash.get_arghash_value($ASK_FORMULA, arghash);
                                                        SubLObject mt_24 = html_arghash.get_arghash_value($MT, arghash);
                                                        SubLTrampolineFile.checkType(genl_preds_reasoning_enabledP, BOOLEANP);
                                                        {
                                                            SubLObject _prev_bind_0_25 = ghl_search_vars.$ghl_uses_spec_preds_p$.currentBinding(thread);
                                                            try {
                                                                ghl_search_vars.$ghl_uses_spec_preds_p$.bind(genl_preds_reasoning_enabledP, thread);
                                                                com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_query_results(ask_formula_23, mt_24, arghash);
                                                            } finally {
                                                                ghl_search_vars.$ghl_uses_spec_preds_p$.rebind(_prev_bind_0_25, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject debug = NIL;
        SubLObject running_query_nowP = NIL;
        SubLObject genl_preds_reasoning_enabledP = NIL;
        final SubLObject filter_mt = (NIL != fort_types_interface.mtP(html_arghash.get_arghash_value($MT, arghash))) ? html_arghash.get_arghash_value($MT, arghash) : $rtv_default_query_mt$.getGlobalValue();
        final SubLObject generation_fn = cb_rtv_fort_generation_fn();
        final SubLObject parse_fn = cb_rtv_fort_parse_fn();
        if (NIL != html_arghash.get_arghash_value($RESET, arghash)) {
            arghash = html_arghash.new_arghash(UNPROVIDED);
            initialize_cb_rtv_collections();
            initialize_cb_rtv_predicates();
        }
        maybe_initialize_cb_rtv_predicates();
        maybe_initialize_cb_rtv_collections();
        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(TWO_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($$$relatedToVia_Query_Tool);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(TWO_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject color_value = html_macros.$html_color_white$.getGlobalValue();
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $TERM1, debug, generation_fn, parse_fn, $$Individual, filter_mt);
                    if (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $INDIVIDUAL) {
                        arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $TERM2, debug, generation_fn, parse_fn, $$Individual, filter_mt);
                    } else
                        if ((html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $ISA) || (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $GENL)) {
                            arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $TERM2_ADD_TYPE, debug, generation_fn, parse_fn, $$Collection, filter_mt);
                            if (NIL != forts.fort_p(html_arghash.get_arghash_value($TERM2_ADD_TYPE, arghash))) {
                                $cb_rtv_collections$.setDynamicValue(cons(html_arghash.get_arghash_value($TERM2_ADD_TYPE, arghash), $cb_rtv_collections$.getDynamicValue(thread)), thread);
                                html_arghash.set_arghash_value($TERM2_VARIABLE_TYPE, arghash, html_arghash.get_arghash_value($TERM2_ADD_TYPE, arghash));
                                html_arghash.html_arghash_nl_fort_input_clear(arghash, $TERM2_ADD_TYPE);
                            }
                        } else {
                            html_arghash.set_arghash_value($TERM2_TYPE, arghash, $INDIVIDUAL);
                        }

                    if (NIL == html_arghash.get_arghash_value($PRED, arghash)) {
                        html_arghash.set_arghash_value($PRED, arghash, $$genls);
                    }
                    if (NIL == html_arghash.get_arghash_value($NUM, arghash)) {
                        html_arghash.set_arghash_value($NUM, arghash, TWO_INTEGER);
                    }
                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $NEW_PRED, debug, generation_fn, parse_fn, $$Predicate, filter_mt);
                    if (NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $NEW_PRED)) {
                        final SubLObject item_var = html_arghash.get_arghash_value($NEW_PRED, arghash);
                        if (NIL == member(item_var, $cb_rtv_predicates$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                            $cb_rtv_predicates$.setDynamicValue(cons(item_var, $cb_rtv_predicates$.getDynamicValue(thread)), thread);
                        }
                        arghash = html_arghash.html_arghash_nl_fort_input_clear(arghash, $NEW_PRED);
                    }
                    if (NIL != html_arghash.get_arghash_value($REMOVE_PREDS, arghash)) {
                        $cb_rtv_predicates$.setDynamicValue(list_utilities.remove_objects_from_list(html_arghash.get_arghash_value_list($PREDICATES, arghash), $cb_rtv_predicates$.getDynamicValue(thread), UNPROVIDED), thread);
                        html_arghash.rem_arghash_value($REMOVE_PREDS, arghash);
                    }
                    maybe_initialize_cb_rtv_collections();
                    maybe_initialize_cb_rtv_predicates();
                    genl_preds_reasoning_enabledP = eq($ON, html_arghash.get_arghash_value($GENL_PRED_REASONING, arghash));
                    arghash = html_arghash.html_arghash_nl_fort_input_force_default_if_unset(arghash, $MT, $rtv_default_query_mt$.getGlobalValue(), generation_fn, debug);
                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, $MT, debug, generation_fn, parse_fn, $$Microtheory, filter_mt);
                    final SubLObject cb_rtv_query_readyP = cb_rtv_query_readyP(arghash);
                    final SubLObject arg1 = html_arghash.get_arghash_value($TERM1, arghash);
                    final SubLObject arg2 = (NIL != member(html_arghash.get_arghash_value($TERM2_TYPE, arghash), $list44, UNPROVIDED, UNPROVIDED)) ? $sym45$_ANY : html_arghash.get_arghash_value($TERM2, arghash);
                    final SubLObject pred_set = cons($$TheSet, html_arghash.get_arghash_value_list($PREDICATES, arghash));
                    final SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
                    SubLObject ask_formula = list($$relatedToVia, arg1, arg2, pred_set, depth);
                    final SubLObject arg2_var_type = html_arghash.get_arghash_value($TERM2_VARIABLE_TYPE, arghash);
                    final SubLObject arg2_pred = (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $GENL) ? $$genls : $$isa;
                    final SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
                    if (NIL != cb_rtv_query_readyP) {
                        if (((arg2 == $sym45$_ANY) && (NIL != arg2_var_type)) && (NIL == kb_utilities.kbeq(arg2_var_type, $$Thing))) {
                            ask_formula = list($$and, ask_formula, list(arg2_pred, $sym45$_ANY, arg2_var_type));
                        }
                        html_arghash.set_arghash_value($ASK_FORMULA, arghash, ask_formula);
                    }
                    if (NIL != debug) {
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(arghash), symbol_function($sym54$STRING_), symbol_function(SYMBOL_NAME));
                        SubLObject k = NIL;
                        k = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_princ(k);
                            html_princ($str53$___);
                            html_princ(gethash(k, arghash, UNPROVIDED));
                            html_newline(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            k = cdolist_list_var.first();
                        } 
                        html_hr(UNPROVIDED, UNPROVIDED);
                    }
                    dhtml_macros.dhtml_with_toggle_visibility_support();
                    dhtml_macros.dhtml_with_dom_script();
                    if (NIL != html_arghash.get_arghash_value($RUN_QUERY, arghash)) {
                        running_query_nowP = T;
                    }
                    html_arghash.set_arghash_value($RUN_QUERY, arghash, NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$cg);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str2$cb_rtv, T, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(FIVE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_color_lighter_blue$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$How_can_the_individual_named_);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_glyph($NBSP, UNPROVIDED);
                                html_arghash.html_arghash_nl_fort_input(arghash, $TERM1, debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$be_connected_to_);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_glyph($NBSP, UNPROVIDED);
                                SubLObject key_string = html_arghash.arghash_make_key_string($TERM2_TYPE, $KEYWORD);
                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                html_markup(html_macros.$html_select_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(key_string);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_space, UNPROVIDED);
                                html_markup($str62$onChange_javascript_this_form_sub);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject selected = list_utilities.member_equalP($INDIVIDUAL, html_arghash.get_arghash_value_list($TERM2_TYPE, arghash));
                                    SubLObject value_string = html_arghash.arghash_get_string($INDIVIDUAL, $DEFAULT);
                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (NIL != selected) {
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (NIL != value_string) {
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(value_string);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$the_individual_named);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    selected = list_utilities.member_equalP($ISA, html_arghash.get_arghash_value_list($TERM2_TYPE, arghash));
                                    value_string = html_arghash.arghash_get_string($ISA, $DEFAULT);
                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (NIL != selected) {
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (NIL != value_string) {
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(value_string);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$any);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    selected = list_utilities.member_equalP($GENL, html_arghash.get_arghash_value_list($TERM2_TYPE, arghash));
                                    value_string = html_arghash.arghash_get_string($GENL, $DEFAULT);
                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (NIL != selected) {
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (NIL != value_string) {
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(value_string);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$any_type_of);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                if (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $INDIVIDUAL) {
                                    html_arghash.html_arghash_nl_fort_input(arghash, $TERM2, debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_arghash.html_arghash_hidden_input(arghash, $TERM2_VARIABLE_TYPE, UNPROVIDED, UNPROVIDED);
                                } else {
                                    key_string = html_arghash.arghash_make_key_string($TERM2_VARIABLE_TYPE, $FORT);
                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(key_string);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        SubLObject cdolist_list_var2 = $cb_rtv_collections$.getDynamicValue(thread);
                                        SubLObject any_type = NIL;
                                        any_type = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            final SubLObject selected2 = list_utilities.member_equalP(any_type, html_arghash.get_arghash_value_list($TERM2_VARIABLE_TYPE, arghash));
                                            final SubLObject value_string2 = html_arghash.arghash_get_string(any_type, $DEFAULT);
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (NIL != selected2) {
                                                html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (NIL != value_string2) {
                                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(value_string2);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ(funcall(generation_fn, any_type));
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            any_type = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    html_princ($str68$___);
                                    html_arghash.html_arghash_nl_fort_input(arghash, $TERM2_ADD_TYPE, NIL, generation_fn, NIL, UNPROVIDED, UNPROVIDED);
                                    html_arghash.html_arghash_nl_fort_input_invisible(arghash, $TERM2);
                                }
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$by_at_most);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_glyph($NBSP, UNPROVIDED);
                                html_arghash.html_arghash_text_input(arghash, $DEPTH, TWO_INTEGER, THREE_INTEGER, UNPROVIDED);
                                html_glyph($NBSP, UNPROVIDED);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$links_using_);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                key_string = html_arghash.arghash_make_key_string($GENL_PRED_REASONING, $KEYWORD);
                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                html_markup(html_macros.$html_select_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(key_string);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_space, UNPROVIDED);
                                html_markup($str62$onChange_javascript_this_form_sub);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject selected = list_utilities.member_equalP($ON, html_arghash.get_arghash_value_list($GENL_PRED_REASONING, arghash));
                                    SubLObject value_string = html_arghash.arghash_get_string($ON, $DEFAULT);
                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (NIL != selected) {
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (NIL != value_string) {
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(value_string);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str71$_the_selected_relations_and_their);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                    }
                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    selected = list_utilities.member_equalP($OFF, html_arghash.get_arghash_value_list($GENL_PRED_REASONING, arghash));
                                    value_string = html_arghash.arghash_get_string($OFF, $DEFAULT);
                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (NIL != selected) {
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (NIL != value_string) {
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(value_string);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_only_the_selected_relations_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                    }
                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(FIVE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL == html_arghash.get_arghash_value_list($PREDICATES, arghash)) {
                                                final SubLObject color = html_color($RED);
                                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                if (NIL != color) {
                                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_color(color));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ($str76$_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                                }
                                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            final SubLObject key_string2 = html_arghash.arghash_make_key_string($PREDICATES, $FORT);
                                            html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(key_string2);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                            html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(FIFTEEN_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                SubLObject cdolist_list_var3 = $cb_rtv_predicates$.getDynamicValue(thread);
                                                SubLObject pred = NIL;
                                                pred = cdolist_list_var3.first();
                                                while (NIL != cdolist_list_var3) {
                                                    final SubLObject selected3 = list_utilities.member_equalP(pred, html_arghash.get_arghash_value_list($PREDICATES, arghash));
                                                    final SubLObject value_string3 = html_arghash.arghash_get_string(pred, $DEFAULT);
                                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                    if (NIL != selected3) {
                                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                    }
                                                    if (NIL != value_string3) {
                                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(value_string3);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ(funcall(generation_fn, pred));
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                                    pred = cdolist_list_var3.first();
                                                } 
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                            }
                                            html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_glyph($NBSP, UNPROVIDED);
                                            html_glyph($NBSP, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_arghash.html_arghash_nl_fort_input(arghash, $NEW_PRED, debug, generation_fn, NIL, $$Predicate, UNPROVIDED);
                                            html_newline(TWO_INTEGER);
                                            html_arghash.html_arghash_submit_input(arghash, $str77$________Add_New_Relation, $ADD_PRED, UNPROVIDED);
                                            html_newline(TWO_INTEGER);
                                            html_arghash.html_arghash_submit_input(arghash, $str79$_____Remove_Selected_Relations, $REMOVE_PREDS, UNPROVIDED);
                                            html_newline(TWO_INTEGER);
                                            if (ONE_INTEGER.numL(length(pred_set)) && (NIL != fort_types_interface.microtheory_p(mt))) {
                                                html_glyph($NBSP, UNPROVIDED);
                                                cb_link($RTV_PREDICATE_GRAPH_EVENT, $str81$_Visualize_Selected_Relations_, list(pred_set, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$in_the_context_);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_arghash.html_arghash_nl_fort_input(arghash, $MT, debug, generation_fn, T, $$Microtheory, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cb_rtv_submit_buttons(arghash, cb_rtv_query_readyP);
                        html_newline(UNPROVIDED);
                        if (NIL != html_arghash.get_arghash_value($ASK_FORMULA, arghash)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str83$Current_query_formula____A, html_arghash.get_arghash_value($ASK_FORMULA, arghash));
                            html_newline(TWO_INTEGER);
                        }
                        if (NIL != running_query_nowP) {
                            final SubLObject ask_formula_$24 = html_arghash.get_arghash_value($ASK_FORMULA, arghash);
                            final SubLObject mt_$25 = html_arghash.get_arghash_value($MT, arghash);
                            assert NIL != booleanp(genl_preds_reasoning_enabledP) : "! booleanp(genl_preds_reasoning_enabledP) " + ("Types.booleanp(genl_preds_reasoning_enabledP) " + "CommonSymbols.NIL != Types.booleanp(genl_preds_reasoning_enabledP) ") + genl_preds_reasoning_enabledP;
                            final SubLObject _prev_bind_0_$24 = ghl_search_vars.$ghl_uses_spec_preds_p$.currentBinding(thread);
                            try {
                                ghl_search_vars.$ghl_uses_spec_preds_p$.bind(genl_preds_reasoning_enabledP, thread);
                                cb_rtv_show_query_results(ask_formula_$24, mt_$25, arghash);
                            } finally {
                                ghl_search_vars.$ghl_uses_spec_preds_p$.rebind(_prev_bind_0_$24, thread);
                            }
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_rtv_submit_buttons_alt(SubLObject arghash, SubLObject cb_rtv_query_readyP) {
        html_arghash.html_arghash_submit_input(arghash, $$$Update, $UPDATE, UNPROVIDED);
        html_glyph($NBSP, UNPROVIDED);
        if (NIL != cb_rtv_query_readyP) {
            html_glyph($NBSP, UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, $$$Run_This_Query, $RUN_QUERY, UNPROVIDED);
        }
        html_glyph($NBSP, UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Reset_Completely, $RESET, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_rtv_submit_buttons(final SubLObject arghash, final SubLObject cb_rtv_query_readyP) {
        html_arghash.html_arghash_submit_input(arghash, $$$Update, $UPDATE, UNPROVIDED);
        html_glyph($NBSP, UNPROVIDED);
        if (NIL != cb_rtv_query_readyP) {
            html_glyph($NBSP, UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, $$$Run_This_Query, $RUN_QUERY, UNPROVIDED);
        }
        html_glyph($NBSP, UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Reset_Completely, $RESET, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    /**
     * Check if the parameters acan make a query.
     */
    @LispMethod(comment = "Check if the parameters acan make a query.")
    public static final SubLObject cb_rtv_query_readyP_alt(SubLObject arghash) {
        return makeBoolean((((NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $TERM1)) && ((NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $TERM2)) || (NIL != member(html_arghash.get_arghash_value($TERM2_TYPE, arghash), $list_alt40, UNPROVIDED, UNPROVIDED)))) && (NIL != html_arghash.get_arghash_value($PREDICATES, arghash))) && (NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $MT)));
    }

    /**
     * Check if the parameters acan make a query.
     */
    @LispMethod(comment = "Check if the parameters acan make a query.")
    public static SubLObject cb_rtv_query_readyP(final SubLObject arghash) {
        return makeBoolean((((NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $TERM1)) && ((NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $TERM2)) || (NIL != member(html_arghash.get_arghash_value($TERM2_TYPE, arghash), $list44, UNPROVIDED, UNPROVIDED)))) && (NIL != html_arghash.get_arghash_value($PREDICATES, arghash))) && (NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, $MT)));
    }/**
     * Check if the parameters acan make a query.
     */


    public static final SubLObject cb_rtv_show_query_results_alt(SubLObject ask_formula, SubLObject mt, SubLObject arghash) {
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_rtv_ask_results$.setDynamicValue(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            {
                SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                try {
                    api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                    {
                        SubLObject results = ask_utilities.ask_justified(ask_formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        if (NIL == results) {
                            html_princ($str_alt86$No_answers_found_);
                        } else {
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$Query_Results);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            if (NIL != html_arghash.arghash_p(arghash)) {
                                if (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $INDIVIDUAL) {
                                    cb_link($RTV_GRAPH_EVENT, $str_alt89$_Visualize_below_justification_, arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    cb_link($RTV_GRAPH_EVENT, $str_alt90$_Visualize_more_justifications_, arghash, $EXPANDED_NODE_TO_NODE, UNPROVIDED, UNPROVIDED);
                                } else {
                                    {
                                        SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
                                        html_arghash.rem_arghash_value($TERM2, safe_arghash);
                                        cb_link($RTV_GRAPH_EVENT, $str_alt92$_Visualize_justifications_of_all_, safe_arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                html_newline(UNPROVIDED);
                            }
                            html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject v_answer = NIL;
                                        SubLObject answer_num = NIL;
                                        for (list_var = results, v_answer = list_var.first(), answer_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_answer = list_var.first() , answer_num = add(ONE_INTEGER, answer_num)) {
                                            {
                                                SubLObject datum = v_answer;
                                                SubLObject current = datum;
                                                SubLObject v_bindings = NIL;
                                                SubLObject justification = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                                v_bindings = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                                justification = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    {
                                                        SubLObject v_term = bindings.variable_binding_value(v_bindings.first());
                                                        SubLObject boolean_queryP = cyc_kernel.closed_query_bindings_p(v_bindings);
                                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                dictionary.dictionary_enter($cb_rtv_ask_results$.getDynamicValue(thread), v_term, justification);
                                                                if (NIL != boolean_queryP) {
                                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                    html_princ($str_alt94$True__);
                                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                } else {
                                                                    if (NIL != $show_assertions_in_english$.getDynamicValue(thread)) {
                                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                        html_markup(pph_html.html_generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                    } else {
                                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                        cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                    }
                                                                    html_glyph($NBSP, UNPROVIDED);
                                                                    cb_link($RTV_JUSTIFY_TERM, $str_alt96$_Explain_, v_term, justification, UNPROVIDED, UNPROVIDED);
                                                                    if (NIL != html_arghash.arghash_p(arghash)) {
                                                                        html_glyph($NBSP, UNPROVIDED);
                                                                        {
                                                                            SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
                                                                            html_arghash.set_arghash_value($TERM2, safe_arghash, v_term);
                                                                            cb_link($RTV_GRAPH_EVENT, $str_alt97$_Visualize_, safe_arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    }
                                                                }
                                                                html_newline(UNPROVIDED);
                                                                if (NIL != boolean_queryP) {
                                                                    com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_argument(justification, write_to_string(answer_num, EMPTY_SUBL_OBJECT_ARRAY));
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt93);
                                                }
                                            }
                                            html_newline(UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                            html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        }
                    }
                } finally {
                    api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_show_query_results(final SubLObject ask_formula, final SubLObject mt, SubLObject arghash) {
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_rtv_ask_results$.setDynamicValue(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            final SubLObject results = ask_utilities.ask_justified(ask_formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_hr(UNPROVIDED, UNPROVIDED);
            if (NIL == results) {
                html_princ($str91$No_answers_found_);
            } else {
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $$$Query_Results);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                if (NIL != html_arghash.arghash_p(arghash)) {
                    if (html_arghash.get_arghash_value($TERM2_TYPE, arghash) == $INDIVIDUAL) {
                        cb_link($RTV_GRAPH_EVENT, $str94$_Visualize_below_justification_, arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cb_link($RTV_GRAPH_EVENT, $str95$_Visualize_more_justifications_, arghash, $EXPANDED_NODE_TO_NODE, UNPROVIDED, UNPROVIDED);
                    } else {
                        final SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
                        html_arghash.rem_arghash_value($TERM2, safe_arghash);
                        cb_link($RTV_GRAPH_EVENT, $str97$_Visualize_justifications_of_all_, safe_arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    html_newline(UNPROVIDED);
                }
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject list_var = NIL;
                    SubLObject v_answer = NIL;
                    SubLObject answer_num = NIL;
                    list_var = results;
                    v_answer = list_var.first();
                    for (answer_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_answer = list_var.first() , answer_num = add(ONE_INTEGER, answer_num)) {
                        SubLObject current;
                        final SubLObject datum = current = v_answer;
                        SubLObject v_bindings = NIL;
                        SubLObject justification = NIL;
                        destructuring_bind_must_consp(current, datum, $list98);
                        v_bindings = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list98);
                        justification = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject v_term = bindings.variable_binding_value(v_bindings.first());
                            final SubLObject boolean_queryP = cyc_kernel.closed_query_bindings_p(v_bindings);
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                dictionary.dictionary_enter($cb_rtv_ask_results$.getDynamicValue(thread), v_term, justification);
                                if (NIL != boolean_queryP) {
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str99$True__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } else {
                                    final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue(thread);
                                    if (pcase_var.eql($NL)) {
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_markup(pph_html.html_generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } else {
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    html_glyph($NBSP, UNPROVIDED);
                                    cb_link($RTV_JUSTIFY_TERM, $str101$_Explain_, v_term, justification, UNPROVIDED, UNPROVIDED);
                                    if (NIL != html_arghash.arghash_p(arghash)) {
                                        html_glyph($NBSP, UNPROVIDED);
                                        final SubLObject safe_arghash2 = html_arghash.copy_arghash(arghash);
                                        html_arghash.set_arghash_value($TERM2, safe_arghash2, v_term);
                                        cb_link($RTV_GRAPH_EVENT, $str102$_Visualize_, safe_arghash2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                html_newline(UNPROVIDED);
                                if (NIL != boolean_queryP) {
                                    cb_rtv_show_argument(justification, write_to_string(answer_num, EMPTY_SUBL_OBJECT_ARRAY));
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } else {
                            cdestructuring_bind_error(datum, $list98);
                        }
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_rtv_justify_term_alt(SubLObject args) {
        com.cyc.cycjava.cycl.cb_rtv.cb_rtv_justify_term_open_window(args);
        return NIL;
    }

    public static SubLObject cb_rtv_justify_term(final SubLObject args) {
        cb_rtv_justify_term_open_window(args);
        return NIL;
    }

    public static final SubLObject cb_rtv_justify_term_open_window_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject v_term = html_arghash.get_arghash_value($TERM, arghash);
                SubLObject term_string = funcall(com.cyc.cycjava.cycl.cb_rtv.cb_rtv_fort_generation_fn(), v_term);
                SubLObject justification = dictionary.dictionary_lookup($cb_rtv_ask_results$.getDynamicValue(thread), v_term, UNPROVIDED);
                SubLObject title_var = term_string;
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
                            SubLObject _prev_bind_0_28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt102$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        dhtml_macros.dhtml_with_toggle_visibility_support();
                                        dhtml_macros.dhtml_with_dom_script();
                                        com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_argument(justification, $$$1);
                                        html_newline(TWO_INTEGER);
                                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_script_utilities.html_kill_window_button(UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_28, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_justify_term_open_window(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject v_term = html_arghash.get_arghash_value($TERM, arghash);
        final SubLObject term_string = funcall(cb_rtv_fort_generation_fn(), v_term);
        final SubLObject justification = dictionary.dictionary_lookup($cb_rtv_ask_results$.getDynamicValue(thread), v_term, UNPROVIDED);
        final SubLObject title_var = term_string;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str22$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str108$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
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
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.dhtml_with_dom_script();
                        cb_rtv_show_argument(justification, $$$1);
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_script_utilities.html_kill_window_button(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$30, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$29, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_link_rtv_justify_term_alt(SubLObject linktext, SubLObject v_term) {
        {
            SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
            html_arghash.set_arghash_value($SIGNATURE, arghash, $str_alt106$justify_me);
            html_arghash.set_arghash_value($TERM, arghash, v_term);
            com.cyc.cycjava.cycl.cb_rtv.cb_rtv_justify_open_window_link(arghash, linktext, $str_alt107$cb_rtv_justify_term);
        }
        return NIL;
    }

    public static SubLObject cb_link_rtv_justify_term(final SubLObject linktext, final SubLObject v_term) {
        final SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
        html_arghash.set_arghash_value($SIGNATURE, arghash, $str116$justify_me);
        html_arghash.set_arghash_value($TERM, arghash, v_term);
        cb_rtv_justify_open_window_link(arghash, linktext, $str117$cb_rtv_justify_term);
        return NIL;
    }

    public static final SubLObject cb_rtv_justify_open_window_link_alt(SubLObject arghash, SubLObject linktext, SubLObject handler) {
        if (handler == UNPROVIDED) {
            handler = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) ? ((SubLObject) (cb_frame_name(html_arghash.get_arghash_value($SIGNATURE, arghash)))) : NIL;
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ(html_arghash.html_arghash_href(arghash, handler));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt109$window_open__);
                cyc_cgi_url_int();
                html_princ(html_arghash.html_arghash_href(arghash, handler));
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt110$__);
                if (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt111$__A_, html_arghash.get_arghash_value($SIGNATURE, arghash));
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt113$___A____, $str_alt114$dependent_yes_height_360_width_64);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt115$return_false_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_justify_open_window_link(final SubLObject arghash, final SubLObject linktext, SubLObject handler) {
        if (handler == UNPROVIDED) {
            handler = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) ? cb_frame_name(html_arghash.get_arghash_value($SIGNATURE, arghash)) : NIL;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ(html_arghash.html_arghash_href(arghash, handler));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str119$window_open__);
        cyc_cgi_url_int();
        html_princ(html_arghash.html_arghash_href(arghash, handler));
        format(html_macros.$html_stream$.getDynamicValue(thread), $str120$__);
        if (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str121$__A_, html_arghash.get_arghash_value($SIGNATURE, arghash));
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
        }
        format(html_macros.$html_stream$.getDynamicValue(thread), $str123$___A____, $str124$dependent_yes_height_360_width_64);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str125$return_false_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject rtv_hl_justify_alt(SubLObject support) {
        return hl_supports.hl_justify(support);
    }

    public static SubLObject rtv_hl_justify(final SubLObject support) {
        return hl_supports.hl_justify(support);
    }

    /**
     * a terrible hack to get around the fact that plain lists in Netscape 6 have bullets
     */
    @LispMethod(comment = "a terrible hack to get around the fact that plain lists in Netscape 6 have bullets")
    public static final SubLObject cb_rtv_indented_table_data_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(HTML_TABLE_ROW, $list_alt117, bq_cons(HTML_TABLE_DATA, append(body, NIL)));
        }
    }

    /**
     * a terrible hack to get around the fact that plain lists in Netscape 6 have bullets
     */
    @LispMethod(comment = "a terrible hack to get around the fact that plain lists in Netscape 6 have bullets")
    public static SubLObject cb_rtv_indented_table_data(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_TABLE_ROW, $list127, bq_cons(HTML_TABLE_DATA, append(body, NIL)));
    }/**
     * a terrible hack to get around the fact that plain lists in Netscape 6 have bullets
     */


    /**
     *
     *
     * @return LISTP of meta-supports for SUPPORT, filtering out silly ones.
     */
    @LispMethod(comment = "@return LISTP of meta-supports for SUPPORT, filtering out silly ones.")
    public static final SubLObject cb_rtv_meta_supports_to_show_alt(SubLObject support) {
        {
            SubLObject all_meta_supports = com.cyc.cycjava.cycl.cb_rtv.rtv_hl_justify(support);
            SubLObject support_formula = arguments.support_formula(support);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = all_meta_supports;
            SubLObject meta_support = NIL;
            for (meta_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_support = cdolist_list_var.first()) {
                if (!arguments.support_formula(meta_support).equal(support_formula)) {
                    ans = cons(meta_support, ans);
                }
            }
            return nreverse(ans);
        }
    }

    /**
     *
     *
     * @return LISTP of meta-supports for SUPPORT, filtering out silly ones.
     */
    @LispMethod(comment = "@return LISTP of meta-supports for SUPPORT, filtering out silly ones.")
    public static SubLObject cb_rtv_meta_supports_to_show(final SubLObject support) {
        final SubLObject all_meta_supports = rtv_hl_justify(support);
        final SubLObject support_formula = arguments.support_formula(support);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = all_meta_supports;
        SubLObject meta_support = NIL;
        meta_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!arguments.support_formula(meta_support).equal(support_formula)) {
                ans = cons(meta_support, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static final SubLObject cb_rtv_maybe_show_meta_supports_alt(SubLObject meta_supports, SubLObject index_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = cconcatenate($str_alt119$meta_supports_, index_string);
                html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt120$text_css);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$screen);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt123$);
                dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
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
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject support = NIL;
                                    SubLObject support_num = NIL;
                                    for (list_var = meta_supports, support = list_var.first(), support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                                        {
                                            SubLObject support_index_string = format(NIL, $str_alt126$_A_meta__D, index_string, support_num);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_glyph($NBSP, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_support(support, support_index_string);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_maybe_show_meta_supports(final SubLObject meta_supports, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_id = cconcatenate($str129$meta_supports_, index_string);
        html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
        html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str130$text_css);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$screen);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_terpri(UNPROVIDED);
            dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
            dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
            html_markup($$$none);
            dhtml_macros.dhtml_dom_attribute_postamble();
            dhtml_macros.dhtml_dom_wrapper_postamble();
            html_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
        html_terpri(UNPROVIDED);
        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str133$);
        dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != object_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(object_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject support = NIL;
                SubLObject support_num = NIL;
                list_var = meta_supports;
                support = list_var.first();
                for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                    final SubLObject support_index_string = format(NIL, $str136$_A_meta__D, index_string, support_num);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_rtv_show_support(support, support_index_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_rtv_show_support_alt(SubLObject support, SubLObject index_string) {
        if (index_string == UNPROVIDED) {
            index_string = $$$support;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_handles.assertion_p(support)) {
                com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_support_readably(support, UNPROVIDED);
            } else {
                if (NIL != arguments.hl_support_p(support)) {
                    {
                        SubLObject formula = arguments.support_sentence(support);
                        SubLObject meta_supports = ($cb_rtv_meta_support_level$.getDynamicValue(thread).numL($cb_rtv_meta_support_max$.getGlobalValue())) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_rtv.cb_rtv_meta_supports_to_show(support))) : NIL;
                        com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_support_readably(formula, arguments.support_mt(support));
                        if (NIL != meta_supports) {
                            {
                                SubLObject _prev_bind_0 = $cb_rtv_meta_support_level$.currentBinding(thread);
                                try {
                                    $cb_rtv_meta_support_level$.bind(number_utilities.f_1X($cb_rtv_meta_support_level$.getDynamicValue(thread)), thread);
                                    com.cyc.cycjava.cycl.cb_rtv.cb_rtv_maybe_show_meta_supports(meta_supports, index_string);
                                } finally {
                                    $cb_rtv_meta_support_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_show_support(final SubLObject support, SubLObject index_string) {
        if (index_string == UNPROVIDED) {
            index_string = $$$support;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(support)) {
            cb_rtv_show_support_readably(support, UNPROVIDED);
        } else
            if (NIL != arguments.hl_support_p(support)) {
                final SubLObject formula = arguments.support_sentence(support);
                final SubLObject meta_supports = ($cb_rtv_meta_support_level$.getDynamicValue(thread).numL($cb_rtv_meta_support_max$.getGlobalValue())) ? cb_rtv_meta_supports_to_show(support) : NIL;
                cb_rtv_show_support_readably(formula, arguments.support_mt(support));
                if (NIL != meta_supports) {
                    final SubLObject _prev_bind_0 = $cb_rtv_meta_support_level$.currentBinding(thread);
                    try {
                        $cb_rtv_meta_support_level$.bind(number_utilities.f_1X($cb_rtv_meta_support_level$.getDynamicValue(thread)), thread);
                        cb_rtv_maybe_show_meta_supports(meta_supports, index_string);
                    } finally {
                        $cb_rtv_meta_support_level$.rebind(_prev_bind_0, thread);
                    }
                }
            }

        return NIL;
    }

    public static final SubLObject cb_rtv_show_support_readably_alt(SubLObject support, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_handles.assertion_p(support)) {
                cb_show_assertion_readably(support, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL);
                return NIL;
            }
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject assertion = czer_meta.find_assertion_cycl(support, UNPROVIDED);
                        if (NIL != assertion) {
                            cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL);
                        } else {
                            cb_sentence_browser.cb_show_sentence_readably(support, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL, UNPROVIDED);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_show_support_readably(final SubLObject support, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(support)) {
            cb_show_assertion_readably(support, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL);
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject assertion = czer_meta.find_assertion_cycl(support, UNPROVIDED);
            if (NIL != assertion) {
                cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL);
            } else {
                cb_sentence_browser.cb_show_sentence_readably(support, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_rtv_maybe_show_additional_supports_alt(SubLObject supports, SubLObject index_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = cconcatenate($str_alt128$additional_supports_, index_string);
                html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt120$text_css);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$screen);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_terpri(UNPROVIDED);
                html_newline(UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Additional_Supports);
                dhtml_macros.dhtml_set_switched_visibility(object_id, $VISIBLE, $TEXT);
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
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject support = NIL;
                                    SubLObject support_num = NIL;
                                    for (list_var = supports, support = list_var.first(), support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_glyph($NBSP, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject support_index_string = format(NIL, $str_alt131$_A_additional__D, index_string, support_num);
                                                            com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_support(support, support_index_string);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_rtv_maybe_show_additional_supports(final SubLObject supports, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_id = cconcatenate($str138$additional_supports_, index_string);
        html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
        html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str130$text_css);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$screen);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_terpri(UNPROVIDED);
            dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
            dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
            html_markup($$$none);
            dhtml_macros.dhtml_dom_attribute_postamble();
            dhtml_macros.dhtml_dom_wrapper_postamble();
            html_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
        html_terpri(UNPROVIDED);
        html_newline(UNPROVIDED);
        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Additional_Supports);
        dhtml_macros.dhtml_set_switched_visibility(object_id, $VISIBLE, $TEXT);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != object_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(object_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject support = NIL;
                SubLObject support_num = NIL;
                list_var = supports;
                support = list_var.first();
                for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject support_index_string = format(NIL, $str141$_A_additional__D, index_string, support_num);
                            cb_rtv_show_support(support, support_index_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param ARGUMENT;
     * 		listp of supports.
     * @param INDEX-STRING;
     * 		stringp unique for this argument on this html page.
     */
    @LispMethod(comment = "@param ARGUMENT;\r\n\t\tlistp of supports.\r\n@param INDEX-STRING;\r\n\t\tstringp unique for this argument on this html page.")
    public static final SubLObject cb_rtv_show_argument_alt(SubLObject argument, SubLObject index_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.singletonP(argument)) {
                com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_support(argument.first(), index_string);
            } else {
                {
                    SubLObject additional_supports = NIL;
                    SubLObject new_argument = NIL;
                    {
                        SubLObject cdolist_list_var = argument;
                        SubLObject support = NIL;
                        for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                            if (NIL != rkf_argument_communicator.rkf_irrelevant_support_p(support)) {
                                additional_supports = cons(support, additional_supports);
                            } else {
                                new_argument = cconcatenate(new_argument, list(support));
                            }
                        }
                    }
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject list_var = NIL;
                                SubLObject support = NIL;
                                SubLObject support_num = NIL;
                                for (list_var = new_argument, support = list_var.first(), support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_glyph($NBSP, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject support_index_string = format(NIL, $str_alt132$_A__D, index_string, support_num);
                                                        com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_support(support, support_index_string);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    if (NIL != additional_supports) {
                        com.cyc.cycjava.cycl.cb_rtv.cb_rtv_maybe_show_additional_supports(additional_supports, index_string);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param ARGUMENT;
     * 		listp of supports.
     * @param INDEX-STRING;
     * 		stringp unique for this argument on this html page.
     */
    @LispMethod(comment = "@param ARGUMENT;\r\n\t\tlistp of supports.\r\n@param INDEX-STRING;\r\n\t\tstringp unique for this argument on this html page.")
    public static SubLObject cb_rtv_show_argument(final SubLObject argument, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(argument)) {
            cb_rtv_show_support(argument.first(), index_string);
        } else {
            SubLObject additional_supports = NIL;
            SubLObject new_argument = NIL;
            SubLObject cdolist_list_var = argument;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != rkf_argument_communicator.rkf_irrelevant_support_p(support)) {
                    additional_supports = cons(support, additional_supports);
                } else {
                    new_argument = cconcatenate(new_argument, list(support));
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject support2 = NIL;
                SubLObject support_num = NIL;
                list_var = new_argument;
                support2 = list_var.first();
                for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support2 = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject support_index_string = format(NIL, $str142$_A__D, index_string, support_num);
                            cb_rtv_show_support(support2, support_index_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            if (NIL != additional_supports) {
                cb_rtv_maybe_show_additional_supports(additional_supports, index_string);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ARGUMENTS;
     * 		listp of arguments, each a list of supports.
     * @unknown baxter
     */
    @LispMethod(comment = "@param ARGUMENTS;\r\n\t\tlistp of arguments, each a list of supports.\r\n@unknown baxter")
    public static final SubLObject cb_rtv_show_arguments_alt(SubLObject v_arguments, SubLObject type, SubLObject show_separatorP) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (show_separatorP == UNPROVIDED) {
            show_separatorP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        SubLObject list_var = NIL;
                        SubLObject argument = NIL;
                        SubLObject index = NIL;
                        for (list_var = v_arguments, argument = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , argument = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject prefix_string = (NIL != type) ? ((SubLObject) (format(NIL, $str_alt133$_A_, type))) : $str_alt123$;
                                SubLObject index_string = format(NIL, $str_alt134$_A_D, prefix_string, index);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt136$_S_, number_utilities.f_1X(index));
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_rtv.cb_rtv_show_argument(argument, index_string);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                if (NIL != list_utilities.lengthG(v_arguments, index, UNPROVIDED)) {
                                    if (NIL != show_separatorP) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(TWO_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     *
     *
     * @param ARGUMENTS;
     * 		listp of arguments, each a list of supports.
     * @unknown baxter
     */
    @LispMethod(comment = "@param ARGUMENTS;\r\n\t\tlistp of arguments, each a list of supports.\r\n@unknown baxter")
    public static SubLObject cb_rtv_show_arguments(final SubLObject v_arguments, SubLObject type, SubLObject show_separatorP) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (show_separatorP == UNPROVIDED) {
            show_separatorP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject list_var = NIL;
            SubLObject argument = NIL;
            SubLObject index = NIL;
            list_var = v_arguments;
            argument = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , argument = list_var.first() , index = add(ONE_INTEGER, index)) {
                final SubLObject prefix_string = (NIL != type) ? format(NIL, $str143$_A_, type) : $str133$;
                final SubLObject index_string = format(NIL, $str144$_A_D, prefix_string, index);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str146$_S_, number_utilities.f_1X(index));
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_rtv_show_argument(argument, index_string);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                if ((NIL != list_utilities.lengthG(v_arguments, index, UNPROVIDED)) && (NIL != show_separatorP)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_hr(UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject rtv_supportP_alt(SubLObject support) {
        if (support.first() == $RTV) {
            return T;
        } else {
            return NIL;
        }
    }

    public static SubLObject rtv_supportP(final SubLObject support) {
        if (support.first() == $RTV) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject cb_link_rtv_graph_event_alt(SubLObject linktext, SubLObject arghash, SubLObject graph_type) {
        if (graph_type == UNPROVIDED) {
            graph_type = NIL;
        }
        {
            SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
            html_arghash.set_arghash_value_list($FORTS, safe_arghash, list(html_arghash.get_arghash_value($TERM1, safe_arghash), html_arghash.get_arghash_value($TERM2, safe_arghash)));
            html_arghash.set_arghash_value_list($PREDS, safe_arghash, html_arghash.get_arghash_value_list($PREDICATES, safe_arghash));
            html_arghash.set_arghash_value($FILTER_PRED, safe_arghash, $ISA == html_arghash.get_arghash_value($TERM2_TYPE, safe_arghash) ? ((SubLObject) ($$isa)) : $GENLS == html_arghash.get_arghash_value($TERM2_TYPE, safe_arghash) ? ((SubLObject) ($$genls)) : NIL);
            html_arghash.set_arghash_value($FILTER_FORT, safe_arghash, html_arghash.get_arghash_value($TERM2_VARIABLE_TYPE, safe_arghash));
            html_arghash.set_arghash_value($GRAPH_TYPE, safe_arghash, graph_type);
            html_arghash.rem_arghash_values_inverse($cb_rtv_graph_keys$.getGlobalValue(), safe_arghash);
            html_arghash.set_arghash_value($SIGNATURE, safe_arghash, format(NIL, $str_alt145$_A, random.random(expt(TWO_INTEGER, $int$32))));
            cb_blue_grapher.cb_blue_applet_window_link(safe_arghash, linktext, $str_alt147$cb_rtv_graph_event);
            return NIL;
        }
    }

    public static SubLObject cb_link_rtv_graph_event(final SubLObject linktext, final SubLObject arghash, SubLObject graph_type) {
        if (graph_type == UNPROVIDED) {
            graph_type = NIL;
        }
        final SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
        html_arghash.set_arghash_value_list($FORTS, safe_arghash, list(html_arghash.get_arghash_value($TERM1, safe_arghash), html_arghash.get_arghash_value($TERM2, safe_arghash)));
        html_arghash.set_arghash_value_list($PREDS, safe_arghash, html_arghash.get_arghash_value_list($PREDICATES, safe_arghash));
        html_arghash.set_arghash_value($FILTER_PRED, safe_arghash, $ISA == html_arghash.get_arghash_value($TERM2_TYPE, safe_arghash) ? $$isa : $GENLS == html_arghash.get_arghash_value($TERM2_TYPE, safe_arghash) ? $$genls : NIL);
        html_arghash.set_arghash_value($FILTER_FORT, safe_arghash, html_arghash.get_arghash_value($TERM2_VARIABLE_TYPE, safe_arghash));
        html_arghash.set_arghash_value($GRAPH_TYPE, safe_arghash, graph_type);
        html_arghash.rem_arghash_values_inverse($cb_rtv_graph_keys$.getGlobalValue(), safe_arghash);
        html_arghash.set_arghash_value($SIGNATURE, safe_arghash, format(NIL, $str155$_A, random.random(expt(TWO_INTEGER, $int$30))));
        cb_blue_grapher.cb_blue_applet_window_link(safe_arghash, linktext, $str157$cb_rtv_graph_event);
        return NIL;
    }

    public static final SubLObject cb_rtv_graph_event_alt(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            cb_blue_grapher.cb_blue_applet_window_internal(arghash);
            subl_promotions.make_process_with_args($str_alt147$cb_rtv_graph_event, symbol_function(CB_RTV_GRAPH_EVENT_PROCESS), list(arghash));
            return NIL;
        }
    }

    public static SubLObject cb_rtv_graph_event(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        cb_blue_grapher.cb_blue_applet_window_internal(arghash);
        subl_promotions.make_process_with_args($str157$cb_rtv_graph_event, symbol_function(CB_RTV_GRAPH_EVENT_PROCESS), list(arghash));
        return NIL;
    }

    public static final SubLObject cb_rtv_graph_event_process_alt(SubLObject arghash) {
        {
            SubLObject ask_formula = html_arghash.get_arghash_value($ASK_FORMULA, arghash);
            SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
            SubLObject v_forts = html_arghash.get_arghash_value_list($FORTS, arghash);
            SubLObject preds = html_arghash.get_arghash_value_list($PREDS, arghash);
            SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
            SubLObject filter_pred = html_arghash.get_arghash_value($FILTER_PRED, arghash);
            SubLObject filter_fort = html_arghash.get_arghash_value($FILTER_FORT, arghash);
            SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
            SubLObject graph_type = html_arghash.get_arghash_value($GRAPH_TYPE, arghash);
            SubLObject arg1 = v_forts.first();
            SubLObject arg2 = second(v_forts);
            if (NIL != forts.fort_p(arg2)) {
                blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list(new SubLObject[]{ $BUILDER_FN, BBF_RTV_ALL_EDGES_BETWEEN, $FORTS, list(arg1, arg2), $PREDS, preds, $DEPTH, depth, $MT, mt, $GRAPH_TYPE, graph_type })));
            } else {
                blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, $PARAMS, list($FORMULA, ask_formula), $MT, mt, $GRAPH_TYPE, graph_type)));
            }
        }
        return NIL;
    }

    public static SubLObject cb_rtv_graph_event_process(final SubLObject arghash) {
        final SubLObject ask_formula = html_arghash.get_arghash_value($ASK_FORMULA, arghash);
        final SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
        final SubLObject v_forts = html_arghash.get_arghash_value_list($FORTS, arghash);
        final SubLObject preds = html_arghash.get_arghash_value_list($PREDS, arghash);
        final SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
        final SubLObject filter_pred = html_arghash.get_arghash_value($FILTER_PRED, arghash);
        final SubLObject filter_fort = html_arghash.get_arghash_value($FILTER_FORT, arghash);
        final SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
        final SubLObject graph_type = html_arghash.get_arghash_value($GRAPH_TYPE, arghash);
        final SubLObject arg1 = v_forts.first();
        final SubLObject arg2 = second(v_forts);
        if (NIL != forts.fort_p(arg2)) {
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list(new SubLObject[]{ $BUILDER_FN, BBF_RTV_ALL_EDGES_BETWEEN, $FORTS, list(arg1, arg2), $PREDS, preds, $DEPTH, depth, $MT, mt, $GRAPH_TYPE, graph_type })));
        } else {
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, $PARAMS, list($FORMULA, ask_formula), $MT, mt, $GRAPH_TYPE, graph_type)));
        }
        return NIL;
    }

    public static final SubLObject bbf_rtv_all_edges_between_alt(SubLObject arg_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_forts = getf(arg_plist, $FORTS, UNPROVIDED);
                SubLObject preds = getf(arg_plist, $PREDS, UNPROVIDED);
                SubLObject depth = getf(arg_plist, $DEPTH, UNPROVIDED);
                SubLObject mt = (NIL != getf(arg_plist, $MT, UNPROVIDED)) ? ((SubLObject) (getf(arg_plist, $MT, UNPROVIDED))) : $rtv_default_query_mt$.getGlobalValue();
                SubLObject graph_type = getf(arg_plist, $GRAPH_TYPE, UNPROVIDED);
                SubLObject cdolist_list_var = list_utilities.pick_two(v_forts);
                SubLObject fort_pair = NIL;
                for (fort_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort_pair = cdolist_list_var.first()) {
                    {
                        SubLObject fort1 = fort_pair.first();
                        SubLObject fort2 = second(fort_pair);
                        SubLObject just_assertions = NIL;
                        SubLObject result_links = NIL;
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (graph_type == $EXPANDED_NODE_TO_NODE) {
                                    just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_node(fort1, fort2, preds, depth, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    just_assertions = removal_modules_rtv.inference_rtv_justify(list($$relatedToVia, fort1, fort2, bq_cons($$TheSet, append(preds, NIL)), depth), UNPROVIDED);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        {
                            SubLObject cdolist_list_var_46 = just_assertions;
                            SubLObject just_assertion = NIL;
                            for (just_assertion = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , just_assertion = cdolist_list_var_46.first()) {
                                if (NIL != assertion_handles.assertion_p(just_assertion)) {
                                    if (cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)) != $$genlPreds) {
                                        result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                                    }
                                }
                            }
                        }
                        return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject bbf_rtv_all_edges_between(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = getf(arg_plist, $FORTS, UNPROVIDED);
        final SubLObject preds = getf(arg_plist, $PREDS, UNPROVIDED);
        final SubLObject depth = getf(arg_plist, $DEPTH, UNPROVIDED);
        final SubLObject mt = (NIL != getf(arg_plist, $MT, UNPROVIDED)) ? getf(arg_plist, $MT, UNPROVIDED) : $rtv_default_query_mt$.getGlobalValue();
        final SubLObject graph_type = getf(arg_plist, $GRAPH_TYPE, UNPROVIDED);
        final SubLObject cdolist_list_var = list_utilities.pick_two(v_forts);
        SubLObject fort_pair = NIL;
        fort_pair = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject fort1 = fort_pair.first();
            final SubLObject fort2 = second(fort_pair);
            SubLObject just_assertions = NIL;
            SubLObject result_links = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (graph_type == $EXPANDED_NODE_TO_NODE) {
                    just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_node(fort1, fort2, preds, depth, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    just_assertions = removal_modules_rtv.inference_rtv_justify(list($$relatedToVia, fort1, fort2, bq_cons($$TheSet, append(preds, NIL)), depth), UNPROVIDED);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var_$49 = just_assertions;
            SubLObject just_assertion = NIL;
            just_assertion = cdolist_list_var_$49.first();
            while (NIL != cdolist_list_var_$49) {
                if ((NIL != assertion_handles.assertion_p(just_assertion)) && (NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), $$genlPreds))) {
                    result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                }
                cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                just_assertion = cdolist_list_var_$49.first();
            } 
            return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
        }
        return NIL;
    }

    public static final SubLObject bbf_rtv_all_edges_from_node_alt(SubLObject arg_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_forts = getf(arg_plist, $FORTS, UNPROVIDED);
                SubLObject preds = getf(arg_plist, $PREDS, UNPROVIDED);
                SubLObject depth = getf(arg_plist, $DEPTH, UNPROVIDED);
                SubLObject mt = getf(arg_plist, $MT, UNPROVIDED);
                SubLObject filter_pred = getf(arg_plist, $FILTER_PRED, UNPROVIDED);
                SubLObject filter_fort = getf(arg_plist, $FILTER_FORT, UNPROVIDED);
                SubLObject fort1 = v_forts.first();
                SubLObject test_formula = ((NIL != forts.fort_p(filter_pred)) && (NIL != forts.fort_p(filter_fort))) ? ((SubLObject) (list(filter_pred, $sym41$_ANY, filter_fort))) : $list_alt160;
                SubLObject just_assertions = NIL;
                SubLObject result_links = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort1, test_formula, preds, depth, UNPROVIDED), symbol_function(EQUAL), symbol_function(ASSERTION_FORMULA), UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = just_assertions;
                    SubLObject just_assertion = NIL;
                    for (just_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just_assertion = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(just_assertion)) {
                            if (cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)) != $$genlPreds) {
                                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                            }
                        }
                    }
                }
                return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
            }
        }
    }

    public static SubLObject bbf_rtv_all_edges_from_node(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = getf(arg_plist, $FORTS, UNPROVIDED);
        final SubLObject preds = getf(arg_plist, $PREDS, UNPROVIDED);
        final SubLObject depth = getf(arg_plist, $DEPTH, UNPROVIDED);
        final SubLObject mt = getf(arg_plist, $MT, UNPROVIDED);
        final SubLObject filter_pred = getf(arg_plist, $FILTER_PRED, UNPROVIDED);
        final SubLObject filter_fort = getf(arg_plist, $FILTER_FORT, UNPROVIDED);
        final SubLObject fort1 = v_forts.first();
        final SubLObject test_formula = ((NIL != forts.fort_p(filter_pred)) && (NIL != forts.fort_p(filter_fort))) ? list(filter_pred, $sym45$_ANY, filter_fort) : $list170;
        SubLObject just_assertions = NIL;
        SubLObject result_links = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort1, test_formula, preds, depth, UNPROVIDED), symbol_function(EQUAL), symbol_function(ASSERTION_FORMULA), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = NIL;
        just_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.assertion_p(just_assertion)) && (NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), $$genlPreds))) {
                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        } 
        return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
    }

    public static final SubLObject bbf_rtv_all_edges_from_node_satisfying_alt(SubLObject arg_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject params = getf(arg_plist, $PARAMS, UNPROVIDED);
                SubLObject formula = getf(params, $FORMULA, UNPROVIDED);
                SubLObject mt = getf(arg_plist, $MT, UNPROVIDED);
                SubLObject rtv_clause = list_utilities.tree_find_if(RTV_CLAUSE_P, formula, UNPROVIDED);
                SubLObject fort = (NIL != forts.fort_p(cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED))) ? ((SubLObject) (cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED))) : cycl_utilities.formula_arg2(rtv_clause, UNPROVIDED);
                SubLObject preds = el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, UNPROVIDED));
                SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, UNPROVIDED);
                SubLObject just_assertions = NIL;
                SubLObject result_links = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, formula, preds, depth, mt), symbol_function(EQUAL), symbol_function(ASSERTION_FORMULA), UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = just_assertions;
                    SubLObject just_assertion = NIL;
                    for (just_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just_assertion = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(just_assertion)) {
                            if (cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)) != $$genlPreds) {
                                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                            }
                        }
                    }
                }
                return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
            }
        }
    }

    public static SubLObject bbf_rtv_all_edges_from_node_satisfying(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject params = getf(arg_plist, $PARAMS, UNPROVIDED);
        final SubLObject formula = getf(params, $FORMULA, UNPROVIDED);
        final SubLObject mt = getf(arg_plist, $MT, UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if(RTV_CLAUSE_P, formula, UNPROVIDED);
        final SubLObject fort = (NIL != forts.fort_p(cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED) : cycl_utilities.formula_arg2(rtv_clause, UNPROVIDED);
        final SubLObject preds = el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, UNPROVIDED));
        final SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, UNPROVIDED);
        SubLObject just_assertions = NIL;
        SubLObject result_links = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, formula, preds, depth, mt), symbol_function(EQUAL), symbol_function(ASSERTION_FORMULA), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = NIL;
        just_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.assertion_p(just_assertion)) && (NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), $$genlPreds))) {
                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        } 
        return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
    }

    public static final SubLObject bbf_rtv_alt(SubLObject arg_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject params = getf(arg_plist, $PARAMS, UNPROVIDED);
                SubLObject formula = getf(params, $FORMULA, UNPROVIDED);
                SubLObject mt = getf(arg_plist, $MT, UNPROVIDED);
                SubLObject rtv_clause = list_utilities.tree_find_if(RTV_CLAUSE_P, formula, UNPROVIDED);
                SubLObject arg1 = czer_main.canonicalize_term(cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED), UNPROVIDED);
                SubLObject arg2 = czer_main.canonicalize_term(cycl_utilities.formula_arg2(rtv_clause, UNPROVIDED), UNPROVIDED);
                SubLObject fort = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (arg1)) : arg2;
                SubLObject preds = el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, UNPROVIDED));
                SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, UNPROVIDED);
                SubLObject graph_type = getf(arg_plist, $GRAPH_TYPE, UNPROVIDED);
                SubLObject just_assertions = NIL;
                SubLObject result_links = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ((NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED))) || (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_clause, UNPROVIDED)))) {
                            just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, formula, preds, depth, mt), symbol_function(EQUAL), symbol_function(ASSERTION_FORMULA), UNPROVIDED, UNPROVIDED);
                        } else {
                            if (graph_type == $EXPANDED_NODE_TO_NODE) {
                                just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_node(arg1, arg2, preds, depth, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                just_assertions = removal_modules_rtv.inference_rtv_justify(list($$relatedToVia, arg1, arg2, bq_cons($$TheSet, append(preds, NIL)), depth), UNPROVIDED);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = just_assertions;
                    SubLObject just_assertion = NIL;
                    for (just_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just_assertion = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(just_assertion)) {
                            if (cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)) != $$genlPreds) {
                                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                            }
                        }
                    }
                }
                return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
            }
        }
    }

    public static SubLObject bbf_rtv(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject params = getf(arg_plist, $PARAMS, UNPROVIDED);
        final SubLObject formula = getf(params, $FORMULA, UNPROVIDED);
        final SubLObject mt = getf(arg_plist, $MT, UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if(RTV_CLAUSE_P, formula, UNPROVIDED);
        final SubLObject arg1 = czer_main.canonicalize_term(cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED), UNPROVIDED);
        final SubLObject arg2 = czer_main.canonicalize_term(cycl_utilities.formula_arg2(rtv_clause, UNPROVIDED), UNPROVIDED);
        final SubLObject fort = (NIL != forts.fort_p(arg1)) ? arg1 : arg2;
        final SubLObject preds = el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, UNPROVIDED));
        final SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, UNPROVIDED);
        final SubLObject graph_type = getf(arg_plist, $GRAPH_TYPE, UNPROVIDED);
        SubLObject just_assertions = NIL;
        SubLObject result_links = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_clause, UNPROVIDED))) || (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_clause, UNPROVIDED)))) {
                just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, formula, preds, depth, mt), symbol_function(EQUAL), symbol_function(ASSERTION_FORMULA), UNPROVIDED, UNPROVIDED);
            } else
                if (graph_type == $EXPANDED_NODE_TO_NODE) {
                    just_assertions = remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_node(arg1, arg2, preds, depth, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    just_assertions = removal_modules_rtv.inference_rtv_justify(list($$relatedToVia, arg1, arg2, bq_cons($$TheSet, append(preds, NIL)), depth), UNPROVIDED);
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = NIL;
        just_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.assertion_p(just_assertion)) && (NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), $$genlPreds))) {
                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        } 
        return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
    }

    public static final SubLObject cb_link_rtv_predicate_graph_event_alt(SubLObject linktext, SubLObject args) {
        {
            SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
            html_arghash.set_arghash_value($SIGNATURE, arghash, format(NIL, $str_alt145$_A, random.random(expt(TWO_INTEGER, $int$32))));
            html_arghash.set_arghash_value_list($PRED_SET, arghash, nth(ZERO_INTEGER, args));
            html_arghash.set_arghash_value($MT, arghash, NIL != nth(ONE_INTEGER, args) ? ((SubLObject) (nth(ONE_INTEGER, args))) : $rtv_default_query_mt$.getGlobalValue());
            cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, $str_alt166$cb_rtv_predicate_graph_event);
        }
        return NIL;
    }

    public static SubLObject cb_link_rtv_predicate_graph_event(final SubLObject linktext, final SubLObject args) {
        final SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
        html_arghash.set_arghash_value($SIGNATURE, arghash, format(NIL, $str155$_A, random.random(expt(TWO_INTEGER, $int$30))));
        html_arghash.set_arghash_value_list($PRED_SET, arghash, nth(ZERO_INTEGER, args));
        html_arghash.set_arghash_value($MT, arghash, NIL != nth(ONE_INTEGER, args) ? nth(ONE_INTEGER, args) : $rtv_default_query_mt$.getGlobalValue());
        cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, $str176$cb_rtv_predicate_graph_event);
        return NIL;
    }

    public static final SubLObject cb_rtv_predicate_graph_event_alt(SubLObject args) {
        cb_blue_grapher.cb_blue_applet_window(args);
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            subl_promotions.make_process_with_args($str_alt166$cb_rtv_predicate_graph_event, symbol_function(CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS), list(arghash));
            return NIL;
        }
    }

    public static SubLObject cb_rtv_predicate_graph_event(final SubLObject args) {
        cb_blue_grapher.cb_blue_applet_window(args);
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        subl_promotions.make_process_with_args($str176$cb_rtv_predicate_graph_event, symbol_function(CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS), list(arghash));
        return NIL;
    }

    public static final SubLObject cb_rtv_predicate_graph_event_process_alt(SubLObject arghash) {
        {
            SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
            SubLObject preds = html_arghash.get_arghash_value_list($PRED_SET, arghash).rest();
            SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_ALL_EDGES_SUBSUMED_BY_PREDS, $PREDS, preds, $MT, mt)));
            {
                SubLObject cdolist_list_var = preds;
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_node_string$.getGlobalValue(), list($FORTS, list(pred))));
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_rtv_predicate_graph_event_process(final SubLObject arghash) {
        final SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
        final SubLObject preds = html_arghash.get_arghash_value_list($PRED_SET, arghash).rest();
        final SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
        blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_ALL_EDGES_SUBSUMED_BY_PREDS, $PREDS, preds, $MT, mt)));
        SubLObject cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_node_string$.getGlobalValue(), list($FORTS, list(pred))));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject bbf_all_edges_subsumed_by_preds_alt(SubLObject arg_plist) {
        {
            SubLObject preds = getf(arg_plist, $PREDS, UNPROVIDED);
            SubLObject mt = (NIL != getf(arg_plist, $MT, UNPROVIDED)) ? ((SubLObject) (getf(arg_plist, $MT, UNPROVIDED))) : $rtv_default_query_mt$.getGlobalValue();
            SubLObject just_assertions = removal_modules_rtv.all_edges_subsumed_by_preds(preds, mt);
            SubLObject result_links = NIL;
            SubLObject cdolist_list_var = just_assertions;
            SubLObject just_assertion = NIL;
            for (just_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just_assertion = cdolist_list_var.first()) {
                if (NIL != assertion_handles.assertion_p(just_assertion)) {
                    result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                }
            }
            return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
        }
    }

    public static SubLObject bbf_all_edges_subsumed_by_preds(final SubLObject arg_plist) {
        final SubLObject preds = getf(arg_plist, $PREDS, UNPROVIDED);
        final SubLObject mt = (NIL != getf(arg_plist, $MT, UNPROVIDED)) ? getf(arg_plist, $MT, UNPROVIDED) : $rtv_default_query_mt$.getGlobalValue();
        final SubLObject just_assertions = removal_modules_rtv.all_edges_subsumed_by_preds(preds, mt);
        SubLObject result_links = NIL;
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = NIL;
        just_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(just_assertion)) {
                result_links = cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        } 
        return blue_grapher_utilities.bbf_make_graph(NIL, list_utilities.hash_remove_duplicates(result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($MT, mt));
    }

    public static SubLObject declare_cb_rtv_file() {
        declareFunction("cb_link_rtv_query", "CB-LINK-RTV-QUERY", 0, 1, false);
        declareFunction("cb_rtv_fort_generation_fn", "CB-RTV-FORT-GENERATION-FN", 0, 0, false);
        declareFunction("cb_rtv_fort_parse_fn", "CB-RTV-FORT-PARSE-FN", 0, 0, false);
        declareFunction("maybe_initialize_cb_rtv_predicates", "MAYBE-INITIALIZE-CB-RTV-PREDICATES", 0, 0, false);
        declareFunction("initialize_cb_rtv_predicates", "INITIALIZE-CB-RTV-PREDICATES", 0, 0, false);
        declareFunction("maybe_initialize_cb_rtv_collections", "MAYBE-INITIALIZE-CB-RTV-COLLECTIONS", 0, 0, false);
        declareFunction("initialize_cb_rtv_collections", "INITIALIZE-CB-RTV-COLLECTIONS", 0, 0, false);
        declareFunction("cb_rtv", "CB-RTV", 1, 0, false);
        declareFunction("cb_rtv_submit_buttons", "CB-RTV-SUBMIT-BUTTONS", 2, 0, false);
        declareFunction("cb_rtv_query_readyP", "CB-RTV-QUERY-READY?", 1, 0, false);
        declareFunction("cb_rtv_show_query_results", "CB-RTV-SHOW-QUERY-RESULTS", 2, 1, false);
        declareFunction("cb_rtv_justify_term", "CB-RTV-JUSTIFY-TERM", 1, 0, false);
        declareFunction("cb_rtv_justify_term_open_window", "CB-RTV-JUSTIFY-TERM-OPEN-WINDOW", 1, 0, false);
        declareFunction("cb_link_rtv_justify_term", "CB-LINK-RTV-JUSTIFY-TERM", 2, 0, false);
        declareFunction("cb_rtv_justify_open_window_link", "CB-RTV-JUSTIFY-OPEN-WINDOW-LINK", 2, 1, false);
        declareFunction("rtv_hl_justify", "RTV-HL-JUSTIFY", 1, 0, false);
        declareMacro("cb_rtv_indented_table_data", "CB-RTV-INDENTED-TABLE-DATA");
        declareFunction("cb_rtv_meta_supports_to_show", "CB-RTV-META-SUPPORTS-TO-SHOW", 1, 0, false);
        declareFunction("cb_rtv_maybe_show_meta_supports", "CB-RTV-MAYBE-SHOW-META-SUPPORTS", 2, 0, false);
        declareFunction("cb_rtv_show_support", "CB-RTV-SHOW-SUPPORT", 1, 1, false);
        declareFunction("cb_rtv_show_support_readably", "CB-RTV-SHOW-SUPPORT-READABLY", 1, 1, false);
        declareFunction("cb_rtv_maybe_show_additional_supports", "CB-RTV-MAYBE-SHOW-ADDITIONAL-SUPPORTS", 2, 0, false);
        declareFunction("cb_rtv_show_argument", "CB-RTV-SHOW-ARGUMENT", 2, 0, false);
        declareFunction("cb_rtv_show_arguments", "CB-RTV-SHOW-ARGUMENTS", 1, 2, false);
        declareFunction("rtv_supportP", "RTV-SUPPORT?", 1, 0, false);
        declareFunction("cb_link_rtv_graph_event", "CB-LINK-RTV-GRAPH-EVENT", 2, 1, false);
        declareFunction("cb_rtv_graph_event", "CB-RTV-GRAPH-EVENT", 1, 0, false);
        declareFunction("cb_rtv_graph_event_process", "CB-RTV-GRAPH-EVENT-PROCESS", 1, 0, false);
        declareFunction("bbf_rtv_all_edges_between", "BBF-RTV-ALL-EDGES-BETWEEN", 1, 0, false);
        declareFunction("bbf_rtv_all_edges_from_node", "BBF-RTV-ALL-EDGES-FROM-NODE", 1, 0, false);
        declareFunction("bbf_rtv_all_edges_from_node_satisfying", "BBF-RTV-ALL-EDGES-FROM-NODE-SATISFYING", 1, 0, false);
        declareFunction("bbf_rtv", "BBF-RTV", 1, 0, false);
        declareFunction("cb_link_rtv_predicate_graph_event", "CB-LINK-RTV-PREDICATE-GRAPH-EVENT", 2, 0, false);
        declareFunction("cb_rtv_predicate_graph_event", "CB-RTV-PREDICATE-GRAPH-EVENT", 1, 0, false);
        declareFunction("cb_rtv_predicate_graph_event_process", "CB-RTV-PREDICATE-GRAPH-EVENT-PROCESS", 1, 0, false);
        declareFunction("bbf_all_edges_subsumed_by_preds", "BBF-ALL-EDGES-SUBSUMED-BY-PREDS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_rtv_file_alt() {
        defparameter("*CB-RTV-FORT-GENERATION-FN*", GENERATE_PHRASE);
        defparameter("*CB-RTV-FORT-PARSE-FN*", TERMS_FOR_BROWSING);
        deflexical("*RTV-DEFAULT-QUERY-MT*", $$TKBSpindleCollectorMt);
        defparameter("*CB-RTV-PREDICATES*", NIL);
        defparameter("*CB-RTV-ASK-RESULTS*", NIL);
        defparameter("*CB-RTV-COLLECTIONS*", NIL);
        defparameter("*CB-RTV-META-SUPPORT-LEVEL*", ZERO_INTEGER);
        deflexical("*CB-RTV-META-SUPPORT-MAX*", FIVE_INTEGER);
        deflexical("*CB-RTV-GRAPH-KEYS*", $list_alt138);
        return NIL;
    }

    public static SubLObject init_cb_rtv_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CB-RTV-FORT-GENERATION-FN*", GENERATE_PHRASE);
            defparameter("*CB-RTV-FORT-PARSE-FN*", TERMS_FOR_BROWSING);
            deflexical("*RTV-DEFAULT-QUERY-MT*", $const10$CurrentWorldDataCollectorMt_NonHo);
            defparameter("*CB-RTV-PREDICATES*", NIL);
            defparameter("*CB-RTV-ASK-RESULTS*", NIL);
            defparameter("*CB-RTV-COLLECTIONS*", NIL);
            defparameter("*CB-RTV-META-SUPPORT-LEVEL*", ZERO_INTEGER);
            deflexical("*CB-RTV-META-SUPPORT-MAX*", FIVE_INTEGER);
            deflexical("*CB-RTV-GRAPH-KEYS*", $list148);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RTV-DEFAULT-QUERY-MT*", $$TKBSpindleCollectorMt);
            deflexical("*CB-RTV-GRAPH-KEYS*", $list_alt138);
        }
        return NIL;
    }

    public static SubLObject init_cb_rtv_file_Previous() {
        defparameter("*CB-RTV-FORT-GENERATION-FN*", GENERATE_PHRASE);
        defparameter("*CB-RTV-FORT-PARSE-FN*", TERMS_FOR_BROWSING);
        deflexical("*RTV-DEFAULT-QUERY-MT*", $const10$CurrentWorldDataCollectorMt_NonHo);
        defparameter("*CB-RTV-PREDICATES*", NIL);
        defparameter("*CB-RTV-ASK-RESULTS*", NIL);
        defparameter("*CB-RTV-COLLECTIONS*", NIL);
        defparameter("*CB-RTV-META-SUPPORT-LEVEL*", ZERO_INTEGER);
        deflexical("*CB-RTV-META-SUPPORT-MAX*", FIVE_INTEGER);
        deflexical("*CB-RTV-GRAPH-KEYS*", $list148);
        return NIL;
    }

    public static final SubLObject setup_cb_rtv_file_alt() {
        setup_cb_link_method($RTV_QUERY, CB_LINK_RTV_QUERY, ONE_INTEGER);
        declare_cb_tool($RTV_QUERY, $$$RTV, $$$RTV, $$$relatedToVia_Query_Tool);
        register_html_state_variable($cb_rtv_predicates$);
        register_html_state_variable($cb_rtv_ask_results$);
        register_html_state_variable($cb_rtv_collections$);
        html_macros.note_html_handler_function(CB_RTV);
        html_macros.note_html_handler_function(CB_RTV_JUSTIFY_TERM);
        html_macros.note_html_handler_function(CB_RTV_JUSTIFY_TERM_OPEN_WINDOW);
        setup_cb_link_method($RTV_JUSTIFY_TERM, CB_LINK_RTV_JUSTIFY_TERM, TWO_INTEGER);
        setup_cb_link_method($RTV_GRAPH_EVENT, CB_LINK_RTV_GRAPH_EVENT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_RTV_GRAPH_EVENT);
        sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt156);
        register_api_predefined_function(BBF_RTV_ALL_EDGES_BETWEEN);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt159);
        register_api_predefined_function(BBF_RTV_ALL_EDGES_FROM_NODE);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt162);
        register_api_predefined_function(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING);
        sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt162);
        register_api_predefined_function(BBF_RTV);
        setup_cb_link_method($RTV_PREDICATE_GRAPH_EVENT, CB_LINK_RTV_PREDICATE_GRAPH_EVENT, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RTV_PREDICATE_GRAPH_EVENT);
        sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt171);
        register_api_predefined_function(BBF_ALL_EDGES_SUBSUMED_BY_PREDS);
        return NIL;
    }

    public static SubLObject setup_cb_rtv_file() {
        if (SubLFiles.USE_V1) {
            setup_cb_link_method($RTV_QUERY, CB_LINK_RTV_QUERY, ONE_INTEGER);
            declare_cb_tool($RTV_QUERY, $$$RTV, $$$RTV, $$$relatedToVia_Query_Tool);
            register_html_state_variable($cb_rtv_predicates$);
            register_html_state_variable($cb_rtv_ask_results$);
            register_html_state_variable($cb_rtv_collections$);
            html_macros.note_cgi_handler_function(CB_RTV, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_RTV_JUSTIFY_TERM, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_RTV_JUSTIFY_TERM_OPEN_WINDOW, $HTML_HANDLER);
            setup_cb_link_method($RTV_JUSTIFY_TERM, CB_LINK_RTV_JUSTIFY_TERM, TWO_INTEGER);
            setup_cb_link_method($RTV_GRAPH_EVENT, CB_LINK_RTV_GRAPH_EVENT, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_RTV_GRAPH_EVENT, $HTML_HANDLER);
            sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
            sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list166);
            register_api_predefined_function(BBF_RTV_ALL_EDGES_BETWEEN);
            sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
            sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list169);
            register_api_predefined_function(BBF_RTV_ALL_EDGES_FROM_NODE);
            sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
            sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list172);
            register_api_predefined_function(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING);
            sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
            sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list172);
            register_api_predefined_function(BBF_RTV);
            setup_cb_link_method($RTV_PREDICATE_GRAPH_EVENT, CB_LINK_RTV_PREDICATE_GRAPH_EVENT, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_RTV_PREDICATE_GRAPH_EVENT, $HTML_HANDLER);
            sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
            sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list181);
            register_api_predefined_function(BBF_ALL_EDGES_SUBSUMED_BY_PREDS);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_RTV);
            html_macros.note_html_handler_function(CB_RTV_JUSTIFY_TERM);
            html_macros.note_html_handler_function(CB_RTV_JUSTIFY_TERM_OPEN_WINDOW);
            html_macros.note_html_handler_function(CB_RTV_GRAPH_EVENT);
            sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt156);
            sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt159);
            sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt162);
            sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt162);
            html_macros.note_html_handler_function(CB_RTV_PREDICATE_GRAPH_EVENT);
            sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list_alt171);
        }
        return NIL;
    }

    public static SubLObject setup_cb_rtv_file_Previous() {
        setup_cb_link_method($RTV_QUERY, CB_LINK_RTV_QUERY, ONE_INTEGER);
        declare_cb_tool($RTV_QUERY, $$$RTV, $$$RTV, $$$relatedToVia_Query_Tool);
        register_html_state_variable($cb_rtv_predicates$);
        register_html_state_variable($cb_rtv_ask_results$);
        register_html_state_variable($cb_rtv_collections$);
        html_macros.note_cgi_handler_function(CB_RTV, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_RTV_JUSTIFY_TERM, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_RTV_JUSTIFY_TERM_OPEN_WINDOW, $HTML_HANDLER);
        setup_cb_link_method($RTV_JUSTIFY_TERM, CB_LINK_RTV_JUSTIFY_TERM, TWO_INTEGER);
        setup_cb_link_method($RTV_GRAPH_EVENT, CB_LINK_RTV_GRAPH_EVENT, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_RTV_GRAPH_EVENT, $HTML_HANDLER);
        sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list166);
        register_api_predefined_function(BBF_RTV_ALL_EDGES_BETWEEN);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list169);
        register_api_predefined_function(BBF_RTV_ALL_EDGES_FROM_NODE);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list172);
        register_api_predefined_function(BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING);
        sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_RTV, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list172);
        register_api_predefined_function(BBF_RTV);
        setup_cb_link_method($RTV_PREDICATE_GRAPH_EVENT, CB_LINK_RTV_PREDICATE_GRAPH_EVENT, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_RTV_PREDICATE_GRAPH_EVENT, $HTML_HANDLER);
        sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T);
        sethash(BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list181);
        register_api_predefined_function(BBF_ALL_EDGES_SUBSUMED_BY_PREDS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_rtv_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_rtv_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_rtv_file();
    }

    

    static private final SubLString $str_alt2$cb_rtv = makeString("cb-rtv");



    static private final SubLList $list_alt11 = list(new SubLObject[]{ reader_make_constant_shell("actors"), reader_make_constant_shell("affiliatedWith"), reader_make_constant_shell("acquaintedWith"), reader_make_constant_shell("allies"), reader_make_constant_shell("citizens"), reader_make_constant_shell("containsInformation"), reader_make_constant_shell("deliberateActors"), reader_make_constant_shell("deviceUsed"), reader_make_constant_shell("directingAgent"), reader_make_constant_shell("doesBusinessWith"), reader_make_constant_shell("employees"), reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("hasLeaders"), reader_make_constant_shell("hasOwnershipIn"), reader_make_constant_shell("in-ContCompletely"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("performedBy"), reader_make_constant_shell("possesses"), reader_make_constant_shell("residenceOfOrganization"), reader_make_constant_shell("subEvents") });

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Person"), reader_make_constant_shell("Place"));

    static private final SubLList $list_alt40 = list(makeKeyword("ISA"), $GENL);

    static private final SubLSymbol $sym41$_ANY = makeSymbol("?ANY");

    static private final SubLString $str_alt49$___ = makeString(" : ");

    static private final SubLSymbol $sym50$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str_alt54$How_can_the_individual_named_ = makeString("How can the individual named ");

    static private final SubLString $str_alt56$be_connected_to_ = makeString("be connected to ");

    static private final SubLString $str_alt58$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    static private final SubLString $str_alt64$___ = makeString("<--");

    static private final SubLString $str_alt66$links_using_ = makeString("links using ");

    static private final SubLString $str_alt67$_the_selected_relations_and_their = makeString(" the selected relations and their specializations ");

    static private final SubLString $str_alt69$_only_the_selected_relations_ = makeString(" only the selected relations ");

    static private final SubLString $str_alt72$_ = makeString("*");

    static private final SubLString $str_alt73$________Add_New_Relation = makeString("   <--- Add New Relation");

    static private final SubLString $str_alt75$_____Remove_Selected_Relations = makeString("---> Remove Selected Relations");

    static private final SubLString $str_alt77$_Visualize_Selected_Relations_ = makeString("[Visualize Selected Relations]");

    static private final SubLString $str_alt78$in_the_context_ = makeString("in the context ");

    static private final SubLString $str_alt79$Current_query_formula____A = makeString("Current query formula : ~A");

    static private final SubLString $str_alt86$No_answers_found_ = makeString("No answers found.");

    static private final SubLString $str_alt89$_Visualize_below_justification_ = makeString("[Visualize below justification]");

    static private final SubLString $str_alt90$_Visualize_more_justifications_ = makeString("[Visualize more justifications]");

    static private final SubLString $str_alt92$_Visualize_justifications_of_all_ = makeString("[Visualize justifications of all results]");

    static private final SubLList $list_alt93 = list(makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATION"));

    static private final SubLString $str_alt94$True__ = makeString("True: ");

    static private final SubLString $str_alt96$_Explain_ = makeString("[Explain]");

    static private final SubLString $str_alt97$_Visualize_ = makeString("[Visualize]");

    static private final SubLString $str_alt101$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt102$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt106$justify_me = makeString("justify-me");

    static private final SubLString $str_alt107$cb_rtv_justify_term = makeString("cb-rtv-justify-term");

    static private final SubLString $str_alt109$window_open__ = makeString("window.open('");

    static private final SubLString $str_alt110$__ = makeString("',");

    static private final SubLString $str_alt111$__A_ = makeString("'~A'");

    static private final SubLString $str_alt113$___A____ = makeString(",'~A'); ");

    static private final SubLString $str_alt114$dependent_yes_height_360_width_64 = makeString("dependent=yes,height=360,width=640,innerheight=360,innerwidth=640,hotkeys=no,directories=no,menubar=no,resizable=yes,scrollbars=yes,toolbar=no");

    static private final SubLString $str_alt115$return_false_ = makeString("return false;");

    static private final SubLList $list_alt117 = list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-GLYPH"), $NBSP));

    static private final SubLString $str_alt119$meta_supports_ = makeString("meta_supports_");

    static private final SubLString $str_alt120$text_css = makeString("text/css");

    static private final SubLString $str_alt126$_A_meta__D = makeString("~A_meta_~D");

    static private final SubLString $str_alt128$additional_supports_ = makeString("additional_supports_");

    static private final SubLString $str_alt131$_A_additional__D = makeString("~A_additional_~D");

    static private final SubLString $str_alt132$_A__D = makeString("~A_~D");

    static private final SubLString $str_alt133$_A_ = makeString("~A_");

    static private final SubLString $str_alt134$_A_D = makeString("~A~D");

    static private final SubLString $str_alt136$_S_ = makeString("~S.");

    static private final SubLList $list_alt138 = list(new SubLObject[]{ makeKeyword("ASK-FORMULA"), makeKeyword("FORTS"), makeKeyword("PREDS"), makeKeyword("MT"), makeKeyword("DEPTH"), makeKeyword("FILTER-PRED"), makeKeyword("FILTER-FORT"), makeKeyword("SIGNATURE"), makeKeyword("GRAPH-TYPE") });

    static private final SubLString $str_alt145$_A = makeString("~A");

    static private final SubLString $str_alt147$cb_rtv_graph_event = makeString("cb-rtv-graph-event");

    static private final SubLList $list_alt156 = list(makeKeyword("HELP-STRING"), makeString("Show links between two FORTS (nodes) through PREDS (links) in MT with maximum path length of DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Currently only one path is shown.)"));

    static private final SubLList $list_alt159 = list(makeKeyword("HELP-STRING"), makeString("Show all from one FORTS (nodes) through PREDS (links) in MT to DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Note that this can make huge graphs for higher values of DEPTH.)"));

    static private final SubLList $list_alt160 = list(reader_make_constant_shell("isa"), makeSymbol("?ANY"), reader_make_constant_shell("Thing"));

    static private final SubLList $list_alt162 = list(makeKeyword("HELP-STRING"), makeString(""));

    static private final SubLString $str_alt166$cb_rtv_predicate_graph_event = makeString("cb-rtv-predicate-graph-event");

    static private final SubLList $list_alt171 = list(makeKeyword("HELP-STRING"), makeString("Show all specPreds of PREDS (nodes) in MT."));
}

/**
 * Total time: 1334 ms
 */
