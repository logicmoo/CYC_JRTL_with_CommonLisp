/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-BLUE
 *  source file: /cyc/top/cycl/cb-uia-blue.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uia_blue extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_blue() {
    }

    public static final SubLFile me = new cb_uia_blue();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_blue";

    // // Definitions
    public static final SubLObject create_uia_blue_signature_from_uia(SubLObject uia) {
        {
            SubLObject uia_id = user_interaction_agenda.uia_id(uia);
            SubLObject uima_id = user_interaction_agenda.uima_id(user_interaction_agenda.uia_meta_agenda(uia));
            return create_uia_blue_signature(uima_id, uia_id);
        }
    }

    public static final SubLObject create_uia_blue_signature_from_ids(SubLObject uima_id, SubLObject uia_id) {
        return create_uia_blue_signature(uima_id, uia_id);
    }

    public static final SubLObject create_uia_blue_signature(SubLObject uima_id, SubLObject uia_id) {
        return format(NIL, $str_alt0$_A, random.random(expt(TWO_INTEGER, $int$32)));
    }

    public static final SubLObject uia_blue_event(SubLObject uia, SubLObject blue_event) {
        {
            SubLObject signature = create_uia_blue_signature_from_uia(uia);
            return blue_grapher_utilities.blue_event(signature, blue_event);
        }
    }

    public static final SubLObject cb_link_uia_blue_concept_recognizer_event(SubLObject v_agenda, SubLObject linktext, SubLObject terms, SubLObject depth, SubLObject preds) {
        {
            SubLObject terms_corrected = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (v_term.isList()) {
                    {
                        SubLObject poss_nart = narts_high.find_nart(v_term);
                        if (NIL != nart_handles.nart_p(poss_nart)) {
                            terms_corrected = cons(poss_nart, terms_corrected);
                        }
                    }
                } else {
                    terms_corrected = cons(v_term, terms_corrected);
                }
            }
            terms_corrected = nreverse(terms_corrected);
            if (NIL == v_agenda) {
                v_agenda = cb_user_interaction_agenda.cb_current_uia();
            }
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                {
                    SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
                    cb_blue_grapher.cb_blue_applet_window_set_arghash(arghash, create_uia_blue_signature_from_uia(v_agenda), UNPROVIDED, UNPROVIDED);
                    html_arghash.set_arghash_value($SIGNATURE, arghash, create_uia_blue_signature_from_uia(v_agenda));
                    html_arghash.set_arghash_value($DOMAIN_MT, arghash, user_interaction_agenda.uia_domain_mt(v_agenda));
                    html_arghash.set_arghash_value_list($TERMS, arghash, terms_corrected);
                    html_arghash.set_arghash_value_list($PREDS, arghash, preds);
                    html_arghash.set_arghash_value($DEPTH, arghash, depth);
                    cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, $str_alt7$cb_uia_blue_concept_recognizer_ev);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_blue_concept_recognizer_event(SubLObject args) {
        cb_blue_grapher.cb_blue_applet_window(args);
        subl_promotions.make_process_with_args($str_alt10$cb_uia_blue_concept_recognizer_ev, symbol_function(CB_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT_PROCESS), list(args));
        return NIL;
    }

    public static final SubLObject cb_uia_blue_concept_recognizer_event_process(SubLObject args) {
        sleep(cb_blue_grapher.$cb_blue_applet_reset_delay$.getGlobalValue());
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject domain_mt = html_arghash.get_arghash_value($DOMAIN_MT, arghash);
            SubLObject preds = html_arghash.get_arghash_value_list($PREDS, arghash);
            SubLObject v_forts = html_arghash.get_arghash_value_list($TERMS, arghash);
            SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
            SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
            SubLObject filter_fns = $list_alt13;
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list(new SubLObject[]{ $BUILDER_FN, BBF_MIN_FORWARD_TRUE, $PREDS, preds, $FORTS, v_forts, $MT, domain_mt, $FILTER_FNS, filter_fns, $DEPTH, depth })));
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_blue_concept_comparator_event(SubLObject v_agenda, SubLObject linktext, SubLObject terms, SubLObject depth, SubLObject preds) {
        {
            SubLObject terms_corrected = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (v_term.isList()) {
                    {
                        SubLObject poss_nart = narts_high.find_nart(v_term);
                        if (NIL != nart_handles.nart_p(poss_nart)) {
                            terms_corrected = cons(poss_nart, terms_corrected);
                        }
                    }
                } else {
                    terms_corrected = cons(v_term, terms_corrected);
                }
            }
            terms_corrected = nreverse(terms_corrected);
            if (NIL == v_agenda) {
                v_agenda = cb_user_interaction_agenda.cb_current_uia();
            }
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                {
                    SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
                    cb_blue_grapher.cb_blue_applet_window_set_arghash(arghash, create_uia_blue_signature_from_uia(v_agenda), UNPROVIDED, UNPROVIDED);
                    html_arghash.set_arghash_value($SIGNATURE, arghash, create_uia_blue_signature_from_uia(v_agenda));
                    html_arghash.set_arghash_value($DOMAIN_MT, arghash, user_interaction_agenda.uia_domain_mt(v_agenda));
                    html_arghash.set_arghash_value_list($TERMS, arghash, terms_corrected);
                    html_arghash.set_arghash_value_list($PREDS, arghash, preds);
                    html_arghash.set_arghash_value($DEPTH, arghash, depth);
                    cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, $str_alt19$cb_uia_blue_concept_comparator_ev);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_blue_concept_comparator_event(SubLObject args) {
        cb_blue_grapher.cb_blue_applet_window(args);
        subl_promotions.make_process_with_args($str_alt22$cb_uia_blue_concept_comparator_ev, symbol_function(CB_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT_PROCESS), list(args));
        return NIL;
    }

    public static final SubLObject cb_uia_blue_concept_comparator_event_process(SubLObject args) {
        sleep(cb_blue_grapher.$cb_blue_applet_reset_delay$.getGlobalValue());
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject domain_mt = html_arghash.get_arghash_value($DOMAIN_MT, arghash);
            SubLObject preds = html_arghash.get_arghash_value_list($PREDS, arghash);
            SubLObject v_forts = html_arghash.get_arghash_value_list($TERMS, arghash);
            SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
            SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
            SubLObject filter_fns = $list_alt13;
            blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), listS($BUILDER_FN, new SubLObject[]{ BBF_MIN_FORWARD_TRUE, $PREDS, $list_alt24, $FORTS, v_forts, $MT, domain_mt, $FILTER_FNS, filter_fns, $list_alt25 })));
        }
        return NIL;
    }

    /**
     * open a grapher applet in a window with an empty graph.
     */
    public static final SubLObject cb_uia_show_blue_window(SubLObject v_agenda) {
        if (NIL != uia_setup_state.uia_setup_completeP(v_agenda)) {
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                {
                    SubLObject signature = create_uia_blue_signature_from_uia(v_agenda);
                    SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
                    html_arghash.set_arghash_value($DOMAIN_MT, arghash, user_interaction_agenda.uia_domain_mt(v_agenda));
                    html_arghash.set_arghash_value($PARSING_MT, arghash, user_interaction_agenda.uia_parsing_mt(v_agenda));
                    html_arghash.set_arghash_value($GENERATION_MT, arghash, user_interaction_agenda.uia_generation_mt(v_agenda, UNPROVIDED));
                    cb_utilities.cb_link($BLUE_APPLET_WINDOW, $str_alt29$_Visualize_, signature, arghash, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_blue_file() {
        declareFunction("create_uia_blue_signature_from_uia", "CREATE-UIA-BLUE-SIGNATURE-FROM-UIA", 1, 0, false);
        declareFunction("create_uia_blue_signature_from_ids", "CREATE-UIA-BLUE-SIGNATURE-FROM-IDS", 2, 0, false);
        declareFunction("create_uia_blue_signature", "CREATE-UIA-BLUE-SIGNATURE", 2, 0, false);
        declareFunction("uia_blue_event", "UIA-BLUE-EVENT", 2, 0, false);
        declareFunction("cb_link_uia_blue_concept_recognizer_event", "CB-LINK-UIA-BLUE-CONCEPT-RECOGNIZER-EVENT", 5, 0, false);
        declareFunction("cb_uia_blue_concept_recognizer_event", "CB-UIA-BLUE-CONCEPT-RECOGNIZER-EVENT", 1, 0, false);
        declareFunction("cb_uia_blue_concept_recognizer_event_process", "CB-UIA-BLUE-CONCEPT-RECOGNIZER-EVENT-PROCESS", 1, 0, false);
        declareFunction("cb_link_uia_blue_concept_comparator_event", "CB-LINK-UIA-BLUE-CONCEPT-COMPARATOR-EVENT", 5, 0, false);
        declareFunction("cb_uia_blue_concept_comparator_event", "CB-UIA-BLUE-CONCEPT-COMPARATOR-EVENT", 1, 0, false);
        declareFunction("cb_uia_blue_concept_comparator_event_process", "CB-UIA-BLUE-CONCEPT-COMPARATOR-EVENT-PROCESS", 1, 0, false);
        declareFunction("cb_uia_show_blue_window", "CB-UIA-SHOW-BLUE-WINDOW", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_blue_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_uia_blue_file() {
                cb_utilities.setup_cb_link_method($UIA_BLUE_CONCEPT_RECOGNIZER_EVENT, CB_LINK_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT);
        cb_utilities.setup_cb_link_method($UIA_BLUE_CONCEPT_COMPARATOR_EVENT, CB_LINK_UIA_BLUE_CONCEPT_COMPARATOR_EVENT, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_BLUE_CONCEPT_COMPARATOR_EVENT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_A = makeString("~A");













    static private final SubLString $str_alt7$cb_uia_blue_concept_recognizer_ev = makeString("cb-uia-blue-concept-recognizer-event");

    private static final SubLSymbol $UIA_BLUE_CONCEPT_RECOGNIZER_EVENT = makeKeyword("UIA-BLUE-CONCEPT-RECOGNIZER-EVENT");

    private static final SubLSymbol CB_LINK_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT = makeSymbol("CB-LINK-UIA-BLUE-CONCEPT-RECOGNIZER-EVENT");

    static private final SubLString $str_alt10$cb_uia_blue_concept_recognizer_ev = makeString("cb-uia-blue-concept-recognizer-event-process");

    private static final SubLSymbol CB_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT_PROCESS = makeSymbol("CB-UIA-BLUE-CONCEPT-RECOGNIZER-EVENT-PROCESS");

    private static final SubLSymbol CB_UIA_BLUE_CONCEPT_RECOGNIZER_EVENT = makeSymbol("CB-UIA-BLUE-CONCEPT-RECOGNIZER-EVENT");

    static private final SubLList $list_alt13 = list(makeSymbol("BFF-RKF-IRRELEVANT-TERMS"), makeSymbol("BFF-ARBITRARY-UNIONS"));



    private static final SubLSymbol BBF_MIN_FORWARD_TRUE = makeSymbol("BBF-MIN-FORWARD-TRUE");







    static private final SubLString $str_alt19$cb_uia_blue_concept_comparator_ev = makeString("cb-uia-blue-concept-comparator-event");

    private static final SubLSymbol $UIA_BLUE_CONCEPT_COMPARATOR_EVENT = makeKeyword("UIA-BLUE-CONCEPT-COMPARATOR-EVENT");

    private static final SubLSymbol CB_LINK_UIA_BLUE_CONCEPT_COMPARATOR_EVENT = makeSymbol("CB-LINK-UIA-BLUE-CONCEPT-COMPARATOR-EVENT");

    static private final SubLString $str_alt22$cb_uia_blue_concept_comparator_ev = makeString("cb-uia-blue-concept-comparator-event-process");

    private static final SubLSymbol CB_UIA_BLUE_CONCEPT_COMPARATOR_EVENT = makeSymbol("CB-UIA-BLUE-CONCEPT-COMPARATOR-EVENT");

    static private final SubLList $list_alt24 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));

    static private final SubLList $list_alt25 = list(makeKeyword("DEPTH"), TWO_INTEGER);





    private static final SubLSymbol $BLUE_APPLET_WINDOW = makeKeyword("BLUE-APPLET-WINDOW");

    static private final SubLString $str_alt29$_Visualize_ = makeString("[Visualize]");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_blue_file();
    }

    public void initializeVariables() {
        init_cb_uia_blue_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_blue_file();
    }
}

