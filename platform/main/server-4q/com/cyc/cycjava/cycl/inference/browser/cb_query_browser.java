package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_query_browser extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.browser.cb_query_browser";
    public static String myFingerPrint = "a5f0ba72c8cc4101b107db5f508befb46d835efeb9cd5fc829b67a88bfa07202";
    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 17300L)
    private static SubLSymbol $cb_inference_browser_show_answer_max_floor_mtsP$;
    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 32700L)
    public static SubLSymbol $cb_show_inference_results_in_nlP$;
    private static SubLSymbol $SILK;
    private static SubLString $str1$SILK_Query__;
    private static SubLString $str2$Mt__;
    private static SubLString $str3$EL_Query__;
    private static SubLString $str4$Pragmatics__;
    private static SubLSymbol $sym5$INFERENCE_STATUS_P;
    private static SubLSymbol $NEW;
    private static SubLString $str7$New;
    private static SubLSymbol $PREPARED;
    private static SubLString $str9$Prepared;
    private static SubLSymbol $READY;
    private static SubLString $str11$Ready;
    private static SubLSymbol $RUNNING;
    private static SubLString $str13$Running;
    private static SubLSymbol $SUSPENDED;
    private static SubLString $str15$Suspended;
    private static SubLSymbol $DEAD;
    private static SubLString $str17$Dead;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLString $str19$Tautology;
    private static SubLSymbol $CONTRADICTION;
    private static SubLString $str21$Contradiction;
    private static SubLSymbol $ILL_FORMED;
    private static SubLString $str23$Ill_Formed;
    private static SubLSymbol $sym24$INFERENCE_SUSPEND_STATUS_P;
    private static SubLSymbol $ABORT;
    private static SubLString $str26$Abort;
    private static SubLSymbol $INTERRUPT;
    private static SubLString $str28$Interrupt;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLString $str30$Max_Number;
    private static SubLSymbol $MAX_TIME;
    private static SubLString $str32$Max_Time;
    private static SubLSymbol $MAX_STEP;
    private static SubLString $str34$Max_Step;
    private static SubLSymbol $MAX_PROBLEM_COUNT;
    private static SubLString $str36$Max_Problem_Count;
    private static SubLSymbol $PROBABLY_APPROXIMATELY_DONE;
    private static SubLString $str38$Probably_Approximately_Done;
    private static SubLSymbol $EXHAUST;
    private static SubLString $str40$Exhaust;
    private static SubLSymbol $EXHAUST_TOTAL;
    private static SubLString $str42$Exhaust_Total;
    private static SubLList $list43;
    private static SubLString $str44$_A_did_not_specify_an_inference_a;
    private static SubLSymbol $sym45$CB_INFERENCE_ANSWER;
    private static SubLSymbol $HTML_HANDLER;
    private static SubLSymbol $MAIN;
    private static SubLSymbol $TERSE;
    private static SubLSymbol $MINIMAL;
    private static SubLString $str50$__A__A__A_;
    private static SubLString $str51$_Inference_Answer__A__A__A_;
    private static SubLSymbol $VERBOSE;
    private static SubLString $str53$_Inference_Answer__A__A__A__A_;
    private static SubLString $str54$cb_inference_answer__A__A__A;
    private static SubLString $str55$button;
    private static SubLSymbol $INFERENCE_ANSWER;
    private static SubLSymbol $sym57$CB_LINK_INFERENCE_ANSWER;
    private static SubLSymbol $sym58$CB_FORM_INFERENCE_ANSWER_METHOD;
    private static SubLString $str59$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static SubLString $str60$_meta_http_equiv__X_UA_Compatible;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLString $str62$Inference_Answer;
    private static SubLString $str63$_for_;
    private static SubLSymbol $INFERENCE;
    private static SubLString $str65$_in_;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $SOCRATIC_QUERY_FROM_ANSWER;
    private static SubLString $str68$_Socratic_Query_;
    private static SubLString $str69$Creation_Time____;
    private static SubLString $str70$Steps_to_This_Answer____;
    private static SubLString $str71$Answer_Bindings__;
    private static SubLString $str72$Answer_Mt_p___;
    private static SubLString $str73$None_found;
    private static SubLString $str74$Justifications__;
    private static SubLString $str75$after;
    private static SubLString $str76$__at_;
    private static SubLString $str77$_;
    private static SubLSymbol $sym78$UNIVERSAL_TIME_P;
    private static SubLString $str79$_today;
    private static SubLString $str80$_on__A;
    private static SubLSymbol $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER;
    private static SubLSymbol $SELF;
    private static SubLString $str83$cb_socratic_query_from_answer__A_;
    private static SubLSymbol $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER;
    private static SubLList $list85;
    private static SubLString $str86$_A_did_not_specify_an_inference_a;
    private static SubLSymbol $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION;
    private static SubLString $str88$__A__A__A__A_;
    private static SubLString $str89$_Inference_Answer__A__A__A__A_;
    private static SubLString $str90$_Inference_Answer__A__A__A__A__A_;
    private static SubLString $str91$cb_inference_answer_full_justific;
    private static SubLSymbol $INFERENCE_ANSWER_FULL_JUSTIFICATION;
    private static SubLSymbol $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION;
    private static SubLString $str94$;
    private static SubLSymbol $CB_CYC;
    private static SubLSymbol $SAM_AUTOCOMPLETE_CSS;
    private static SubLSymbol $SHA1;
    private static SubLString $str98$yui_skin_sam;
    private static SubLString $str99$reloadFrameButton;
    private static SubLString $str100$reload;
    private static SubLString $str101$Refresh_Frames;
    private static SubLString $str102$Inference_Answer_Full_Justificati;
    private static SubLString $str103$_for_answer_;
    private static SubLSymbol $sym104$SUPPORT_MT;
    private static SubLString $str105$Answer_Justification_Mt_p___;
    private static SubLString $str106$Full_Justification__;
    private static SubLSymbol $LEFT;
    private static SubLSymbol $TOP;
    private static SubLString $str109$_Full_Justification_;
    private static SubLString $str110$Proofs__;
    private static SubLString $str111$proofs;
    private static SubLSymbol $PROOF;
    private static SubLSymbol $SIMPLE_PROOF_VIEW;
    private static SubLString $str114$_Show_Proof_View_;
    private static SubLSymbol $DATA_TABLES;
    private static SubLString $str116$_;
    private static SubLInteger $int$600;
    private static SubLInteger $int$200;
    private static SubLInteger $int$30;
    private static SubLString $str120$__null;
    private static SubLString $str121$_columnDefs_____type____num_html_;
    private static SubLString $str122$__document__ready_function_______;
    private static SubLString $str123$_columnDefs_____type____num_html_;
    private static SubLString $str124$__document__ready_function_______;
    private static SubLString $str125$Query_was_not_yet_proven;
    private static SubLString $str126$Query_was_not_proven;
    private static SubLString $str127$Query_was_proven;
    private static SubLObject $$True;
    private static SubLInteger $int$2100;
    private static SubLString $str130$No_answers;
    private static SubLString $str131$_yet_;
    private static SubLString $str132$display;
    private static SubLString $str133$inferenceresults;
    private static SubLString $str134$Answer;
    private static SubLString $str135$Answer_Mt;
    private static SubLSymbol $RIGHT;
    private static SubLString $str137$Explain;
    private static SubLString $str138$Explain___A;
    private static SubLString $str139$_;
    private static SubLString $str140$_;
    private static SubLString $str141$display_none;
    private static SubLString $str142$_A;
    private static SubLSymbol $NEW_ANSWER;
    private static SubLSymbol $NEW_JUSTIFICATION;
    private static SubLSymbol $OLD;
    private static SubLString $str146$Old_answer;
    private static SubLString $str147$New_answer;
    private static SubLString $str148$Old_answer_with_a_new_justificati;
    private static SubLString $str149$_;
    private static SubLSymbol $YELLOW;
    private static SubLSymbol $GREEN;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym153$_;
    private static SubLSymbol $sym154$INFERENCE_ANSWER_SUID;
    private static SubLString $str155$Weighing_these_arguments_yields_a;
    private static SubLSymbol $TRUE_DEF;
    private static SubLString $str157$True__default_;
    private static SubLSymbol $TRUE_MON;
    private static SubLString $str159$True__monotonic_;
    private static SubLSymbol $FALSE_DEF;
    private static SubLString $str161$False__default_;
    private static SubLSymbol $FALSE_MON;
    private static SubLString $str163$False__monotonic_;
    private static SubLSymbol $UNKNOWN;
    private static SubLString $str165$Unknown;
    private static SubLString $str166$___;
    private static SubLSymbol $ALL;
    private static SubLString $str168$_;
    private static SubLList $list169;
    private static SubLString $str170$___;
    private static SubLSymbol $CENTER;
    private static SubLSymbol $NBSP;
    private static SubLSymbol $RIGHTWARDS_ARROW;
    private static SubLSymbol $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__;
    private static SubLList $list175;
    private static SubLSymbol $UPWARDS_ARROW;

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 800L)
    public static SubLObject cb_show_inference_el_query(SubLObject inference, SubLObject show_mtP) {
        if (show_mtP == UNPROVIDED) {
            show_mtP = T;
        }
        SubLObject el_query = inference_datastructures_inference.inference_input_el_query(inference);
        if (NIL == el_query) {
            el_query = clause_utilities.contextualized_dnf_formula_from_clauses(inference_datastructures_inference.inference_hl_query(inference));
        }
        if (NIL != show_mtP) {
            SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
            if (NIL != mt) {
                html_utilities.html_princ_strong($str2$Mt__);
                html_utilities.html_indent(UNPROVIDED);
                cb_utilities.cb_show_term(mt, ZERO_INTEGER, NIL);
                html_utilities.html_newline(UNPROVIDED);
            }
        }
        html_utilities.html_princ_strong($str3$EL_Query__);
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_form(el_query, ZERO_INTEGER, T);
        SubLObject non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
        if (NIL != non_explanatory_el_query) {
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ_strong($str4$Pragmatics__);
            html_utilities.html_newline(UNPROVIDED);
            cb_utilities.cb_form(non_explanatory_el_query, ZERO_INTEGER, T);
        }
        return inference;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 2100L)
    public static SubLObject cb_show_inference_status(SubLObject status) {
        assert NIL != inference_datastructures_enumerated_types.inference_status_p(status) : status;
        if (status.eql($NEW)) {
            html_utilities.html_princ($str7$New);
        } else if (status.eql($PREPARED)) {
            html_utilities.html_princ($str9$Prepared);
        } else if (status.eql($READY)) {
            html_utilities.html_princ($str11$Ready);
        } else if (status.eql($RUNNING)) {
            html_utilities.html_princ($str13$Running);
        } else if (status.eql($SUSPENDED)) {
            html_utilities.html_princ($str15$Suspended);
        } else if (status.eql($DEAD)) {
            html_utilities.html_princ($str17$Dead);
        } else if (status.eql($TAUTOLOGY)) {
            html_utilities.html_princ($str19$Tautology);
        } else if (status.eql($CONTRADICTION)) {
            html_utilities.html_princ($str21$Contradiction);
        } else if (status.eql($ILL_FORMED)) {
            html_utilities.html_princ($str23$Ill_Formed);
        } else {
            html_utilities.html_princ(status);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 2700L)
    public static SubLObject cb_show_inference_suspend_status(SubLObject suspend_status) {
        assert NIL != inference_datastructures_enumerated_types.inference_suspend_status_p(suspend_status) : suspend_status;
        if (suspend_status.eql($ABORT)) {
            html_utilities.html_princ($str26$Abort);
        } else if (suspend_status.eql($INTERRUPT)) {
            html_utilities.html_princ($str28$Interrupt);
        } else if (suspend_status.eql($MAX_NUMBER)) {
            html_utilities.html_princ($str30$Max_Number);
        } else if (suspend_status.eql($MAX_TIME)) {
            html_utilities.html_princ($str32$Max_Time);
        } else if (suspend_status.eql($MAX_STEP)) {
            html_utilities.html_princ($str34$Max_Step);
        } else if (suspend_status.eql($MAX_PROBLEM_COUNT)) {
            html_utilities.html_princ($str36$Max_Problem_Count);
        } else if (suspend_status.eql($PROBABLY_APPROXIMATELY_DONE)) {
            html_utilities.html_princ($str38$Probably_Approximately_Done);
        } else if (suspend_status.eql($EXHAUST)) {
            html_utilities.html_princ($str40$Exhaust);
        } else if (suspend_status.eql($EXHAUST_TOTAL)) {
            html_utilities.html_princ($str42$Exhaust_Total);
        } else {
            html_utilities.html_princ(suspend_status);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 3400L)
    public static SubLObject cb_inference_answer(SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject answer_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list43);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list43);
        inference_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list43);
        answer_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list43);
            return NIL;
        }
        SubLObject v_answer = cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
        if (NIL == inference_datastructures_inference.inference_answer_p(v_answer)) {
            return cb_utilities.cb_error($str44$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inference_answer_guts(v_answer);
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 3800L)
    public static SubLObject cb_link_inference_answer(SubLObject v_answer, SubLObject verbosity, SubLObject linktext, SubLObject target) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == target) {
            target = $MAIN;
        }
        if (NIL == verbosity) {
            verbosity = $TERSE;
        }
        SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
        SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(v_answer);
        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        if (NIL == linktext) {
            SubLObject pcase_var = verbosity;
            if (pcase_var.eql($MINIMAL)) {
                linktext = PrintLow.format(NIL, $str50$__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id });
            } else if (pcase_var.eql($TERSE)) {
                linktext = PrintLow.format(NIL, $str51$_Inference_Answer__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id });
            } else if (pcase_var.eql($VERBOSE)) {
                linktext = PrintLow.format(NIL, $str53$_Inference_Answer__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, v_bindings });
            }
        }
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        if (NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (NIL != answer_id) {
                html_utilities.html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(answer_id);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str54$cb_inference_answer__A__A__A, new SubLObject[] { store_id, inference_id, answer_id });
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str55$button);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                if (NIL != answer_id) {
                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_princ(answer_id);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                if (NIL != linktext) {
                    html_utilities.html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(linktext);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            } else {
                html_utilities.html_princ(linktext);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return v_answer;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 5200L)
    public static SubLObject cb_form_inference_answer_method(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_utilities.cb_link($INFERENCE_ANSWER, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 5300L)
    public static SubLObject cb_guess_inference_answer(SubLObject store_id_string, SubLObject inference_id_string, SubLObject answer_id_string) {
        SubLObject store_id = string_utilities.string_to_integer(store_id_string);
        SubLObject inference_id = string_utilities.string_to_integer(inference_id_string);
        SubLObject answer_id = string_utilities.string_to_integer(answer_id_string);
        if (inference_id.isInteger() && answer_id.isInteger()) {
            SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_ids(store_id, inference_id, answer_id);
            if (NIL != inference_datastructures_inference.inference_answer_p(v_answer)) {
                return v_answer;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 5800L)
    public static SubLObject cb_show_inference_answer_bindings(SubLObject v_bindings, SubLObject free_variables) {
        cb_show_bindings_vertical(v_bindings, free_variables);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 6000L)
    public static SubLObject cb_show_inference_answer_summary(SubLObject v_answer) {
        cb_utilities.cb_link($INFERENCE_ANSWER, v_answer, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(UNPROVIDED);
        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        cb_show_bindings(v_bindings, UNPROVIDED);
        return v_answer;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 6200L)
    public static SubLObject cb_inference_answer_guts(SubLObject v_answer) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str60$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str62$Inference_Answer);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$1 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            SubLObject _prev_bind_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
                        : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_script_utilities.cb_hoverover_page_init();
                    dhtml_macros.html_basic_cb_scripts();
                    cb_inference_browser.cb_show_relevant_inference_debugging_links(v_answer);
                    html_utilities.html_princ_strong($str62$Inference_Answer);
                    html_utilities.html_indent(UNPROVIDED);
                    cb_utilities.cb_link($INFERENCE_ANSWER, v_answer, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str63$_for_);
                    cb_utilities.cb_link($INFERENCE, inference_datastructures_inference.inference_answer_inference(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str65$_in_);
                    cb_utilities.cb_link($PROBLEM_STORE, inference_datastructures_inference.inference_answer_problem_store(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_indent(FOUR_INTEGER);
                    cb_utilities.cb_link($SOCRATIC_QUERY_FROM_ANSWER, v_answer, $str68$_Socratic_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_indent(TWO_INTEGER);
                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                    cb_show_inference_el_query(inference_datastructures_inference.inference_answer_inference(v_answer), UNPROVIDED);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_princ_strong($str69$Creation_Time____);
                    cb_show_inference_answer_creation_time(v_answer);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ_strong($str70$Steps_to_This_Answer____);
                    cb_show_inference_answer_step_count(v_answer);
                    html_utilities.html_newline(UNPROVIDED);
                    SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                    SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars(v_answer);
                    html_utilities.html_princ_strong($str71$Answer_Bindings__);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_show_inference_answer_bindings(v_bindings, free_el_vars);
                    if (NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue(thread)) {
                        SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer(v_answer, UNPROVIDED);
                        html_utilities.html_princ_strong(PrintLow.format(NIL, $str72$Answer_Mt_p___, Sequences.length(mts)));
                        if (NIL != mts) {
                            SubLObject cdolist_list_var = mts;
                            SubLObject mt = NIL;
                            mt = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                mt = cdolist_list_var.first();
                            }
                        } else {
                            html_utilities.html_princ($str73$None_found);
                            html_utilities.html_newline(UNPROVIDED);
                        }
                    }
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ_strong($str74$Justifications__);
                    SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                    SubLObject justification = NIL;
                    justification = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        html_utilities.html_newline(UNPROVIDED);
                        cb_show_inference_answer_justification(justification);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        justification = cdolist_list_var2.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_2, thread);
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 8600L)
    public static SubLObject cb_show_inference_answer_creation_time(SubLObject v_answer) {
        SubLObject creation_time = inference_datastructures_inference.inference_answer_creation_time(v_answer);
        SubLObject elapsed_creation_time = inference_datastructures_inference.inference_answer_elapsed_time(v_answer, NIL);
        html_utilities.html_princ($str75$after);
        html_utilities.html_princ(numeric_date_utilities.elapsed_seconds_string(elapsed_creation_time));
        html_utilities.html_princ($str76$__at_);
        cb_show_universal_time(creation_time);
        html_utilities.html_princ($str77$_);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 9000L)
    public static SubLObject cb_show_universal_time(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numeric_date_utilities.universal_time_p(universal_time) : universal_time;
        thread.resetMultipleValues();
        SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time(universal_time);
        SubLObject universal_seconds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_utilities.html_princ(numeric_date_utilities.secondstring(universal_seconds));
        if (universal_date.numE(numeric_date_utilities.today())) {
            html_utilities.html_princ($str79$_today);
        } else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str80$_on__A, numeric_date_utilities.datestring(universal_date));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 9400L)
    public static SubLObject cb_show_inference_answer_step_count(SubLObject v_answer) {
        SubLObject step_count = inference_datastructures_inference.inference_answer_step_count(v_answer);
        html_utilities.html_princ(step_count);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 9600L)
    public static SubLObject cb_socratic_query_from_answer(SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject answer_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list43);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list43);
        inference_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list43);
        answer_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list43);
            return NIL;
        }
        SubLObject inference_answer = cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
        if (NIL == inference_datastructures_inference.inference_answer_p(inference_answer)) {
            return cb_utilities.cb_error($str44$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        SubLObject sentence = inference_datastructures_inference.inference_answer_el_sentence(inference_answer);
        SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
        SubLObject v_properties = inference_datastructures_inference.inference_input_query_properties(cb_inference_browser.compute_the_relevant_inference(inference_answer));
        return cb_query.cb_socratic_query(sentence, mt, v_properties);
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 10300L)
    public static SubLObject cb_link_socratic_query_from_answer(SubLObject inference_answer, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str68$_Socratic_Query_;
        }
        SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(inference_answer);
        SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str83$cb_socratic_query_from_answer__A_, new SubLObject[] { store_id, inference_id, answer_id });
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 10900L)
    public static SubLObject cb_inference_answer_full_justification(SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject answer_id_string = NIL;
        SubLObject justification_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list85);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list85);
        inference_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list85);
        answer_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list85);
        justification_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list85);
            return NIL;
        }
        SubLObject justification = cb_guess_inference_answer_justification(store_id_string, inference_id_string, answer_id_string, justification_id_string);
        if (NIL == inference_datastructures_inference.inference_answer_justification_p(justification)) {
            return cb_utilities.cb_error($str86$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inference_answer_full_justification_guts(justification);
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 11600L)
    public static SubLObject cb_link_inference_answer_full_justification(SubLObject justification, SubLObject verbosity, SubLObject linktext, SubLObject target) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == target) {
            target = $MAIN;
        }
        if (NIL == verbosity) {
            verbosity = $TERSE;
        }
        SubLObject justification_id = inference_answer_justification_suid(justification);
        SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
        SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(v_answer);
        SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
        SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        if (NIL == linktext) {
            SubLObject pcase_var = verbosity;
            if (pcase_var.eql($MINIMAL)) {
                linktext = PrintLow.format(NIL, $str88$__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id });
            } else if (pcase_var.eql($TERSE)) {
                linktext = PrintLow.format(NIL, $str89$_Inference_Answer__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id });
            } else if (pcase_var.eql($VERBOSE)) {
                linktext = PrintLow.format(NIL, $str90$_Inference_Answer__A__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id, v_bindings });
            }
        }
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str91$cb_inference_answer_full_justific, new SubLObject[] { store_id, inference_id, answer_id, justification_id });
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return v_answer;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 12900L)
    public static SubLObject inference_answer_justification_suid(SubLObject justification) {
        SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
        SubLObject justifications = inference_datastructures_inference.inference_answer_justifications(v_answer);
        return Sequences.position(justification, justifications, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 13200L)
    public static SubLObject cb_guess_inference_answer_justification(SubLObject store_id_string, SubLObject inference_id_string, SubLObject answer_id_string, SubLObject justification_id_string) {
        SubLObject v_answer = cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
        if (NIL != inference_datastructures_inference.inference_answer_p(v_answer)) {
            SubLObject just_id = reader.read_from_string_ignoring_errors(justification_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != subl_promotions.non_negative_integer_p(just_id)) {
                SubLObject justification = nth(just_id, inference_datastructures_inference.inference_answer_justifications(v_answer));
                return justification;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 13700L)
    public static SubLObject cb_inference_answer_full_justification_guts(SubLObject justification) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
        SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject title_var = $str94$;
        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
                    : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_utilities.html_markup($str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup($str60$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str98$yui_skin_sam);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str99$reloadFrameButton);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str55$button);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str100$reload);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_princ($str101$Refresh_Frames);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        }
                        html_script_utilities.cb_hoverover_page_init();
                        html_utilities.html_princ_strong($str102$Inference_Answer_Full_Justificati);
                        html_utilities.html_indent(UNPROVIDED);
                        cb_utilities.cb_link($INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $MINIMAL, NIL, $SELF, UNPROVIDED);
                        html_utilities.html_princ($str103$_for_answer_);
                        cb_utilities.cb_link($INFERENCE_ANSWER, v_answer, $MINIMAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        cb_show_inference_el_query(inference, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                        SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars(v_answer);
                        html_utilities.html_princ_strong($str71$Answer_Bindings__);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_show_inference_answer_bindings(v_bindings, free_el_vars);
                        SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                        SubLObject full_justification = hl_supports.hl_justification_expand(supports);
                        SubLObject validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
                        SubLObject mts = genl_mts.max_floor_mts(list_utilities.fast_delete_duplicates(Mapping.mapcar($sym104$SUPPORT_MT, full_justification), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ_strong(PrintLow.format(NIL, $str105$Answer_Justification_Mt_p___, Sequences.length(mts)));
                        if (NIL != mts) {
                            SubLObject cdolist_list_var = mts;
                            SubLObject mt = NIL;
                            mt = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                mt = cdolist_list_var.first();
                            }
                        } else {
                            html_utilities.html_princ($str73$None_found);
                            html_utilities.html_newline(UNPROVIDED);
                        }
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ_strong($str106$Full_Justification__);
                        cb_assertion_browser.cb_show_justification_readably(full_justification, validation_level);
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 16000L)
    public static SubLObject cb_show_inference_answer_justification(SubLObject justification) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($LEFT));
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($TOP));
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                    cb_assertion_browser.cb_show_justification_readably(supports, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(inference_datastructures_inference.inference_answer_justification_store(justification)));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($LEFT));
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($TOP));
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_utilities.cb_link($INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $TERSE, $str109$_Full_Justification_, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_query.cb_princ_with_inference_doc_more_link($str110$Proofs__, $str111$proofs, UNPROVIDED, UNPROVIDED);
                    SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
                    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                    SubLObject proof = NIL;
                    proof = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($PROOF, proof, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($SIMPLE_PROOF_VIEW, proof, v_answer, $str114$_Show_Proof_View_, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        proof = cdolist_list_var.first();
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return justification;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 17400L)
    public static SubLObject cb_inference_fancy_table_js(SubLObject var_count, SubLObject nanswers) {
        SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.web_bundle($DATA_TABLES);
        SubLObject column_type_spec_json = $str116$_;
        SubLObject pixel_height = nanswers.numG(TWENTY_INTEGER) ? $int$600 : (nanswers.numL(SEVEN_INTEGER) ? $int$200 : Numbers.multiply(nanswers, $int$30));
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(var_count); n = Numbers.add(n, ONE_INTEGER)) {
            column_type_spec_json = Sequences.cconcatenate(column_type_spec_json, $str120$__null);
        }
        column_type_spec_json = Sequences.copy_seq($str121$_columnDefs_____type____num_html_);
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str122$__document__ready_function_______, pixel_height, column_type_spec_json);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 18500L)
    public static SubLObject cb_inference_fancy_table_all_answers_js(SubLObject var_count) {
        SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.web_bundle($DATA_TABLES);
        SubLObject column_type_spec_json = $str116$_;
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(var_count); n = Numbers.add(n, ONE_INTEGER)) {
            column_type_spec_json = Sequences.cconcatenate(column_type_spec_json, $str120$__null);
        }
        column_type_spec_json = Sequences.copy_seq($str123$_columnDefs_____type____num_html_);
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str124$__document__ready_function_______, column_type_spec_json);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 19400L)
    public static SubLObject cb_show_fully_bound_answer(SubLObject inference, SubLObject answer_count, SubLObject current_answers, SubLObject inference_new_justification_set) {
        if (answer_count.isZero()) {
            if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                html_utilities.html_princ_strong($str125$Query_was_not_yet_proven);
            } else {
                html_utilities.html_princ_strong($str126$Query_was_not_proven);
            }
        } else {
            SubLObject v_answer = current_answers.first();
            html_utilities.html_princ_strong($str127$Query_was_proven);
            html_utilities.html_indent(UNPROVIDED);
            cb_utilities.cb_show_term($$True, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, answer_count);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 20000L)
    public static SubLObject cb_show_streamed_inference_answer_section(SubLObject inference, SubLObject answer_limit) {
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 20300L)
    public static SubLObject cb_show_inference_answer_section(SubLObject inference, SubLObject answer_limit) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject current_answers = cb_inference_current_answers(inference);
        SubLObject free_el_variables = thread.secondMultipleValue();
        SubLObject inference_new_justification_set = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject answer_count = Sequences.length(current_answers);
        SubLObject is_running = Equality.eq(inference_datastructures_inference.inference_status(inference), $RUNNING);
        SubLObject my_answer_limit = (NIL == is_running && NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) ? $int$2100 : answer_limit;
        if (NIL == free_el_variables) {
            cb_show_fully_bound_answer(inference, answer_count, current_answers, inference_new_justification_set);
        } else if (answer_count.isZero()) {
            html_utilities.html_princ_strong($str130$No_answers);
            if (NIL != is_running) {
                html_utilities.html_princ_strong($str131$_yet_);
            }
        } else {
            SubLObject index = ZERO_INTEGER;
            SubLObject answer_limit_exceededP = NIL;
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str132$display);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str133$inferenceresults);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(ZERO_INTEGER);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(ZERO_INTEGER);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(ZERO_INTEGER);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_table_thead_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ_strong($str134$Answer);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                        cb_show_bindings_horizontal_variable_row(free_el_variables, NIL, T);
                        if (NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ_strong($str135$Answer_Mt);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_thead_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_tbody_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL == answer_limit_exceededP) {
                        SubLObject csome_list_var = current_answers;
                        SubLObject v_answer = NIL;
                        v_answer = csome_list_var.first();
                        while (NIL == answer_limit_exceededP && NIL != csome_list_var) {
                            if (NIL != my_answer_limit && index.numGE(my_answer_limit)) {
                                answer_limit_exceededP = T;
                            } else {
                                index = Numbers.add(index, ONE_INTEGER);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, answer_count);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cb_show_inference_answer_section_bindings(v_answer, free_el_variables);
                                    if (NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue(thread)) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer(v_answer, T);
                                            if (NIL != mts) {
                                                SubLObject cdolist_list_var = mts;
                                                SubLObject mt = NIL;
                                                mt = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    mt = cdolist_list_var.first();
                                                }
                                            } else {
                                                html_utilities.html_princ($str73$None_found);
                                                html_utilities.html_newline(UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                            csome_list_var = csome_list_var.rest();
                            v_answer = csome_list_var.first();
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tbody_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            if (NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread) && NIL == answer_limit_exceededP && NIL == is_running) {
                if (NIL == answer_limit) {
                    cb_inference_fancy_table_all_answers_js(Sequences.length(free_el_variables));
                } else {
                    cb_inference_fancy_table_js(Sequences.length(free_el_variables), index);
                }
            }
            if (NIL != cb_parameters.$cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread) && NIL != inference_utilities.inference_requires_argumentationP(inference)) {
                cb_show_argumentation_result(inference);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 23000L)
    public static SubLObject cb_show_inference_answer_section_answer_number(SubLObject v_answer, SubLObject inference_new_justification_set, SubLObject answer_count) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject linktext = ONE_INTEGER.numE(answer_count) ? $str137$Explain : PrintLow.format(NIL, $str138$Explain___A, inference_datastructures_inference.inference_answer_suid(v_answer));
        SubLObject newness = cb_determine_inference_answer_newness(v_answer, inference_new_justification_set);
        if (NIL == cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) {
            linktext = Sequences.cconcatenate($str139$_, new SubLObject[] { linktext, $str140$_ });
        }
        cb_show_normal_inference_answer_justification_button(newness, v_answer, linktext);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 24100L)
    public static SubLObject cb_show_normal_inference_answer_justification_button(SubLObject newness, SubLObject v_answer, SubLObject hover) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup($str141$display_none);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str142$_A, inference_datastructures_inference.inference_answer_suid(v_answer));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        cb_show_inference_answer_newness_token(newness);
        cb_utilities.cb_link($INFERENCE_ANSWER, v_answer, $MINIMAL, hover, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 24600L)
    public static SubLObject cb_determine_inference_answer_newness(SubLObject v_answer, SubLObject inference_new_justification_set) {
        if (NIL != inference_datastructures_inference.inference_answer_newP(v_answer)) {
            return $NEW_ANSWER;
        }
        if (NIL != cb_inference_answer_has_new_justificationP(v_answer, inference_new_justification_set)) {
            return $NEW_JUSTIFICATION;
        }
        return $OLD;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 24900L)
    public static SubLObject cb_show_inference_answer_newness_token(SubLObject newness) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject color = cb_determine_inference_answer_bgcolor(newness);
        SubLObject explanation = NIL;
        if (newness.eql($OLD)) {
            explanation = $str146$Old_answer;
        } else if (newness.eql($NEW_ANSWER)) {
            explanation = $str147$New_answer;
        } else if (newness.eql($NEW_JUSTIFICATION)) {
            explanation = $str148$Old_answer_with_a_new_justificati;
        }
        if ($OLD != newness) {
            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_style_background_color(color);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_query.cb_princ_with_explanation($str149$_, explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 25500L)
    public static SubLObject cb_inference_answer_has_new_justificationP(SubLObject v_answer, SubLObject new_justification_set) {
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != set.set_memberP(justification, new_justification_set)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 25700L)
    public static SubLObject cb_determine_inference_answer_bgcolor(SubLObject newness) {
        if (newness.eql($OLD)) {
            return NIL;
        }
        if (newness.eql($NEW_ANSWER)) {
            return $YELLOW;
        }
        if (newness.eql($NEW_JUSTIFICATION)) {
            return $GREEN;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 25900L)
    public static SubLObject cb_inference_current_answers(SubLObject inference) {
        SubLObject free_el_variables = inference_datastructures_inference.inference_free_el_vars(inference);
        SubLObject inference_new_justification_set = set.new_set(Symbols.symbol_function(EQ), inference_datastructures_inference.inference_new_justification_count(inference));
        SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(inference_datastructures_inference.inference_new_answer_justifications(inference));
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(justification, inference_new_justification_set);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        SubLObject current_answers = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$19 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$19);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        current_answers = cons(v_answer, current_answers);
                    }
                }
            }
            SubLObject idx_$20 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$20)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$20);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        current_answers = cons(v_answer2, current_answers);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        current_answers = Sort.sort(current_answers, Symbols.symbol_function($sym153$_), Symbols.symbol_function($sym154$INFERENCE_ANSWER_SUID));
        return Values.values(current_answers, free_el_variables, inference_new_justification_set);
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 26800L)
    public static SubLObject cb_show_inference_answer_section_bindings(SubLObject inference_answer, SubLObject free_el_variables) {
        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        cb_show_bindings_horizontal_value_row(v_bindings, free_el_variables);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 27000L)
    public static SubLObject cb_show_argumentation_result(SubLObject inference) {
        SubLObject tv = inference_utilities.inference_argumentation_result(inference);
        html_utilities.html_princ($str155$Weighing_these_arguments_yields_a);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_show_tv(tv);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 27500L)
    public static SubLObject cb_show_tv(SubLObject tv) {
        if (tv.eql($TRUE_DEF)) {
            html_utilities.html_princ($str157$True__default_);
        } else if (tv.eql($TRUE_MON)) {
            html_utilities.html_princ($str159$True__monotonic_);
        } else if (tv.eql($FALSE_DEF)) {
            html_utilities.html_princ($str161$False__default_);
        } else if (tv.eql($FALSE_MON)) {
            html_utilities.html_princ($str163$False__monotonic_);
        } else if (tv.eql($UNKNOWN)) {
            html_utilities.html_princ($str165$Unknown);
        } else {
            html_utilities.html_princ($str166$___);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 27800L)
    public static SubLObject cb_show_bindings(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        html_utilities.html_princ($str168$_);
        if ($ALL == selected_variables) {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!binding.eql(v_bindings.first())) {
                    html_utilities.html_indent(UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_show_binding(binding);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
        } else {
            SubLObject some_binding_shownP = NIL;
            SubLObject cdolist_list_var2 = selected_variables;
            SubLObject selected_variable = NIL;
            selected_variable = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject binding2 = bindings.get_variable_binding(selected_variable, v_bindings);
                if (NIL != binding2) {
                    if (NIL != some_binding_shownP) {
                        html_utilities.html_indent(UNPROVIDED);
                    } else {
                        some_binding_shownP = T;
                    }
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_show_binding(binding2);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                selected_variable = cdolist_list_var2.first();
            }
        }
        html_utilities.html_princ($str77$_);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 28800L)
    public static SubLObject cb_show_binding(SubLObject binding) {
        SubLObject variable = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(binding, binding, $list169);
        variable = binding.first();
        SubLObject current = value = binding.rest();
        html_utilities.html_princ($str168$_);
        cb_utilities.cb_show_term(variable, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str170$___);
        cb_utilities.cb_show_term(value, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str77$_);
        return binding;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 29000L)
    public static SubLObject cb_show_bindings_vertical(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if ($ALL == selected_variables) {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                binding = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cb_show_binding_vertical(binding);
                    cdolist_list_var = cdolist_list_var.rest();
                    binding = cdolist_list_var.first();
                }
            } else {
                SubLObject cdolist_list_var = selected_variables;
                SubLObject selected_variable = NIL;
                selected_variable = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject binding2 = bindings.get_variable_binding(selected_variable, v_bindings);
                    if (NIL != binding2) {
                        cb_show_binding_vertical(binding2);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    selected_variable = cdolist_list_var.first();
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 29800L)
    public static SubLObject cb_show_binding_vertical(SubLObject binding) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject variable = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(binding, binding, $list169);
        variable = binding.first();
        SubLObject current = value = binding.rest();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align($RIGHT));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align($TOP));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_utilities.cb_show_term(variable, ZERO_INTEGER, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align($CENTER));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align($TOP));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_glyph($NBSP, UNPROVIDED);
                html_utilities.html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
                html_utilities.html_glyph($NBSP, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align($LEFT));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align($TOP));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_utilities.cb_show_term(value, ZERO_INTEGER, T);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return binding;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 30300L)
    public static SubLObject cb_show_bindings_horizontal(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(TWO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(FOUR_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_show_bindings_horizontal_variable_row(selected_variables, v_bindings, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_show_bindings_horizontal_value_row(v_bindings, selected_variables);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 30900L)
    public static SubLObject cb_show_bindings_horizontal_variable_row(SubLObject selected_variables, SubLObject v_bindings, SubLObject strongP) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (strongP == UNPROVIDED) {
            strongP = NIL;
        }
        if ($ALL == selected_variables) {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_show_binding_variable_horizontal(bindings.variable_binding_variable(binding), strongP);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
        } else {
            SubLObject cdolist_list_var = selected_variables;
            SubLObject selected_variable = NIL;
            selected_variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_show_binding_variable_horizontal(selected_variable, strongP);
                cdolist_list_var = cdolist_list_var.rest();
                selected_variable = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 31600L)
    public static SubLObject cb_show_bindings_horizontal_value_row(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        if ($ALL == selected_variables) {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_show_binding_value_horizontal(bindings.variable_binding_value(binding));
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
        } else {
            SubLObject cdolist_list_var = selected_variables;
            SubLObject selected_variable = NIL;
            selected_variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject binding2 = bindings.get_variable_binding(selected_variable, v_bindings);
                if (NIL != binding2) {
                    cb_show_binding_value_horizontal(bindings.variable_binding_value(binding2));
                } else {
                    cb_show_missing_binding_value_horizontal();
                }
                cdolist_list_var = cdolist_list_var.rest();
                selected_variable = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 32400L)
    public static SubLObject cb_show_binding_variable_horizontal(SubLObject variable, SubLObject strongP) {
        if (strongP == UNPROVIDED) {
            strongP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align($LEFT));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align($TOP));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != strongP) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_utilities.cb_show_term(variable, ZERO_INTEGER, NIL);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } else {
                cb_utilities.cb_show_term(variable, ZERO_INTEGER, NIL);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        return variable;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 32800L)
    public static SubLObject cb_show_binding_value_horizontal(SubLObject value) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align($LEFT));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align($TOP));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != $cb_show_inference_results_in_nlP$.getDynamicValue(thread)) {
                cb_utilities.cb_show_term_in_nl(value, UNPROVIDED);
            } else {
                cb_utilities.cb_show_term(value, ZERO_INTEGER, T);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return value;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 33000L)
    public static SubLObject cb_show_missing_binding_value_horizontal() {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align($LEFT));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align($TOP));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_indent(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 33200L)
    public static SubLObject cb_variable_map_horizontal(SubLObject variable_map) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject variable_map_binding = NIL;
                SubLObject index = NIL;
                list_var = variable_map;
                variable_map_binding = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    SubLObject current;
                    SubLObject datum = current = variable_map_binding;
                    SubLObject from_variable = NIL;
                    SubLObject to_variable = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list175);
                    from_variable = current.first();
                    current = (to_variable = current.rest());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($TOP));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_utilities.cb_form(to_variable, ZERO_INTEGER, NIL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject variable_map_binding = NIL;
                SubLObject index = NIL;
                list_var = variable_map;
                variable_map_binding = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($TOP));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_glyph($UPWARDS_ARROW, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject variable_map_binding = NIL;
                SubLObject index = NIL;
                list_var = variable_map;
                variable_map_binding = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    SubLObject current;
                    SubLObject datum = current = variable_map_binding;
                    SubLObject from_variable = NIL;
                    SubLObject to_variable = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list175);
                    from_variable = current.first();
                    current = (to_variable = current.rest());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($TOP));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_utilities.cb_form(from_variable, ZERO_INTEGER, NIL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_cb_query_browser_file() {
        declareFunction(myName, "cb_show_inference_el_query", "CB-SHOW-INFERENCE-EL-QUERY", 1, 1, false);
        declareFunction(myName, "cb_show_inference_status", "CB-SHOW-INFERENCE-STATUS", 1, 0, false);
        declareFunction(myName, "cb_show_inference_suspend_status", "CB-SHOW-INFERENCE-SUSPEND-STATUS", 1, 0, false);
        declareFunction(myName, "cb_inference_answer", "CB-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(myName, "cb_link_inference_answer", "CB-LINK-INFERENCE-ANSWER", 1, 3, false);
        declareFunction(myName, "cb_form_inference_answer_method", "CB-FORM-INFERENCE-ANSWER-METHOD", 1, 2, false);
        declareFunction(myName, "cb_guess_inference_answer", "CB-GUESS-INFERENCE-ANSWER", 3, 0, false);
        declareFunction(myName, "cb_show_inference_answer_bindings", "CB-SHOW-INFERENCE-ANSWER-BINDINGS", 2, 0, false);
        declareFunction(myName, "cb_show_inference_answer_summary", "CB-SHOW-INFERENCE-ANSWER-SUMMARY", 1, 0, false);
        declareFunction(myName, "cb_inference_answer_guts", "CB-INFERENCE-ANSWER-GUTS", 1, 0, false);
        declareFunction(myName, "cb_show_inference_answer_creation_time", "CB-SHOW-INFERENCE-ANSWER-CREATION-TIME", 1, 0, false);
        declareFunction(myName, "cb_show_universal_time", "CB-SHOW-UNIVERSAL-TIME", 0, 1, false);
        declareFunction(myName, "cb_show_inference_answer_step_count", "CB-SHOW-INFERENCE-ANSWER-STEP-COUNT", 1, 0, false);
        declareFunction(myName, "cb_socratic_query_from_answer", "CB-SOCRATIC-QUERY-FROM-ANSWER", 1, 0, false);
        declareFunction(myName, "cb_link_socratic_query_from_answer", "CB-LINK-SOCRATIC-QUERY-FROM-ANSWER", 1, 1, false);
        declareFunction(myName, "cb_inference_answer_full_justification", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "cb_link_inference_answer_full_justification", "CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 3, false);
        declareFunction(myName, "inference_answer_justification_suid", "INFERENCE-ANSWER-JUSTIFICATION-SUID", 1, 0, false);
        declareFunction(myName, "cb_guess_inference_answer_justification", "CB-GUESS-INFERENCE-ANSWER-JUSTIFICATION", 4, 0, false);
        declareFunction(myName, "cb_inference_answer_full_justification_guts", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION-GUTS", 1, 0, false);
        declareFunction(myName, "cb_show_inference_answer_justification", "CB-SHOW-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "cb_inference_fancy_table_js", "CB-INFERENCE-FANCY-TABLE-JS", 2, 0, false);
        declareFunction(myName, "cb_inference_fancy_table_all_answers_js", "CB-INFERENCE-FANCY-TABLE-ALL-ANSWERS-JS", 1, 0, false);
        declareFunction(myName, "cb_show_fully_bound_answer", "CB-SHOW-FULLY-BOUND-ANSWER", 4, 0, false);
        declareFunction(myName, "cb_show_streamed_inference_answer_section", "CB-SHOW-STREAMED-INFERENCE-ANSWER-SECTION", 2, 0, false);
        declareFunction(myName, "cb_show_inference_answer_section", "CB-SHOW-INFERENCE-ANSWER-SECTION", 2, 0, false);
        declareFunction(myName, "cb_show_inference_answer_section_answer_number", "CB-SHOW-INFERENCE-ANSWER-SECTION-ANSWER-NUMBER", 3, 0, false);
        declareFunction(myName, "cb_show_normal_inference_answer_justification_button", "CB-SHOW-NORMAL-INFERENCE-ANSWER-JUSTIFICATION-BUTTON", 3, 0, false);
        declareFunction(myName, "cb_determine_inference_answer_newness", "CB-DETERMINE-INFERENCE-ANSWER-NEWNESS", 2, 0, false);
        declareFunction(myName, "cb_show_inference_answer_newness_token", "CB-SHOW-INFERENCE-ANSWER-NEWNESS-TOKEN", 1, 0, false);
        declareFunction(myName, "cb_inference_answer_has_new_justificationP", "CB-INFERENCE-ANSWER-HAS-NEW-JUSTIFICATION?", 2, 0, false);
        declareFunction(myName, "cb_determine_inference_answer_bgcolor", "CB-DETERMINE-INFERENCE-ANSWER-BGCOLOR", 1, 0, false);
        declareFunction(myName, "cb_inference_current_answers", "CB-INFERENCE-CURRENT-ANSWERS", 1, 0, false);
        declareFunction(myName, "cb_show_inference_answer_section_bindings", "CB-SHOW-INFERENCE-ANSWER-SECTION-BINDINGS", 2, 0, false);
        declareFunction(myName, "cb_show_argumentation_result", "CB-SHOW-ARGUMENTATION-RESULT", 1, 0, false);
        declareFunction(myName, "cb_show_tv", "CB-SHOW-TV", 1, 0, false);
        declareFunction(myName, "cb_show_bindings", "CB-SHOW-BINDINGS", 1, 1, false);
        declareFunction(myName, "cb_show_binding", "CB-SHOW-BINDING", 1, 0, false);
        declareFunction(myName, "cb_show_bindings_vertical", "CB-SHOW-BINDINGS-VERTICAL", 1, 1, false);
        declareFunction(myName, "cb_show_binding_vertical", "CB-SHOW-BINDING-VERTICAL", 1, 0, false);
        declareFunction(myName, "cb_show_bindings_horizontal", "CB-SHOW-BINDINGS-HORIZONTAL", 1, 1, false);
        declareFunction(myName, "cb_show_bindings_horizontal_variable_row", "CB-SHOW-BINDINGS-HORIZONTAL-VARIABLE-ROW", 1, 2, false);
        declareFunction(myName, "cb_show_bindings_horizontal_value_row", "CB-SHOW-BINDINGS-HORIZONTAL-VALUE-ROW", 1, 1, false);
        declareFunction(myName, "cb_show_binding_variable_horizontal", "CB-SHOW-BINDING-VARIABLE-HORIZONTAL", 1, 1, false);
        declareFunction(myName, "cb_show_binding_value_horizontal", "CB-SHOW-BINDING-VALUE-HORIZONTAL", 1, 0, false);
        declareFunction(myName, "cb_show_missing_binding_value_horizontal", "CB-SHOW-MISSING-BINDING-VALUE-HORIZONTAL", 0, 0, false);
        declareFunction(myName, "cb_variable_map_horizontal", "CB-VARIABLE-MAP-HORIZONTAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_query_browser_file() {
        $cb_inference_browser_show_answer_max_floor_mtsP$ = SubLFiles.defparameter("*CB-INFERENCE-BROWSER-SHOW-ANSWER-MAX-FLOOR-MTS?*", NIL);
        $cb_show_inference_results_in_nlP$ = defparameter("*CB-SHOW-INFERENCE-RESULTS-IN-NL?*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_query_browser_file() {
        html_macros.note_cgi_handler_function($sym45$CB_INFERENCE_ANSWER, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($INFERENCE_ANSWER, $sym57$CB_LINK_INFERENCE_ANSWER, FOUR_INTEGER);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym58$CB_FORM_INFERENCE_ANSWER_METHOD));
        html_macros.note_cgi_handler_function($sym81$CB_SOCRATIC_QUERY_FROM_ANSWER, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($SOCRATIC_QUERY_FROM_ANSWER, $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER, TWO_INTEGER);
        html_macros.note_cgi_handler_function($sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($INFERENCE_ANSWER_FULL_JUSTIFICATION, $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION, FOUR_INTEGER);
        utilities_macros.register_html_state_variable($sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__);
        utilities_macros.register_html_interface_variable($sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_query_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_query_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_query_browser_file();
    }

    static {
        me = new cb_query_browser();
        $cb_inference_browser_show_answer_max_floor_mtsP$ = null;
        $cb_show_inference_results_in_nlP$ = null;
        $SILK = makeKeyword("SILK");
        $str1$SILK_Query__ = makeString("SILK Query :");
        $str2$Mt__ = makeString("Mt :");
        $str3$EL_Query__ = makeString("EL Query :");
        $str4$Pragmatics__ = makeString("Pragmatics :");
        $sym5$INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");
        $NEW = makeKeyword("NEW");
        $str7$New = makeString("New");
        $PREPARED = makeKeyword("PREPARED");
        $str9$Prepared = makeString("Prepared");
        $READY = makeKeyword("READY");
        $str11$Ready = makeString("Ready");
        $RUNNING = makeKeyword("RUNNING");
        $str13$Running = makeString("Running");
        $SUSPENDED = makeKeyword("SUSPENDED");
        $str15$Suspended = makeString("Suspended");
        $DEAD = makeKeyword("DEAD");
        $str17$Dead = makeString("Dead");
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $str19$Tautology = makeString("Tautology");
        $CONTRADICTION = makeKeyword("CONTRADICTION");
        $str21$Contradiction = makeString("Contradiction");
        $ILL_FORMED = makeKeyword("ILL-FORMED");
        $str23$Ill_Formed = makeString("Ill-Formed");
        $sym24$INFERENCE_SUSPEND_STATUS_P = makeSymbol("INFERENCE-SUSPEND-STATUS-P");
        $ABORT = makeKeyword("ABORT");
        $str26$Abort = makeString("Abort");
        $INTERRUPT = makeKeyword("INTERRUPT");
        $str28$Interrupt = makeString("Interrupt");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $str30$Max_Number = makeString("Max Number");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $str32$Max_Time = makeString("Max Time");
        $MAX_STEP = makeKeyword("MAX-STEP");
        $str34$Max_Step = makeString("Max Step");
        $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
        $str36$Max_Problem_Count = makeString("Max Problem Count");
        $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $str38$Probably_Approximately_Done = makeString("Probably Approximately Done");
        $EXHAUST = makeKeyword("EXHAUST");
        $str40$Exhaust = makeString("Exhaust");
        $EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
        $str42$Exhaust_Total = makeString("Exhaust Total");
        $list43 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("ANSWER-ID-STRING"));
        $str44$_A_did_not_specify_an_inference_a = makeString("~A did not specify an inference answer");
        $sym45$CB_INFERENCE_ANSWER = makeSymbol("CB-INFERENCE-ANSWER");
        $HTML_HANDLER = makeKeyword("HTML-HANDLER");
        $MAIN = makeKeyword("MAIN");
        $TERSE = makeKeyword("TERSE");
        $MINIMAL = makeKeyword("MINIMAL");
        $str50$__A__A__A_ = makeString("[~A.~A.~A]");
        $str51$_Inference_Answer__A__A__A_ = makeString("[Inference Answer ~A.~A.~A]");
        $VERBOSE = makeKeyword("VERBOSE");
        $str53$_Inference_Answer__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A ~A]");
        $str54$cb_inference_answer__A__A__A = makeString("cb-inference-answer&~A&~A&~A");
        $str55$button = makeString("button");
        $INFERENCE_ANSWER = makeKeyword("INFERENCE-ANSWER");
        $sym57$CB_LINK_INFERENCE_ANSWER = makeSymbol("CB-LINK-INFERENCE-ANSWER");
        $sym58$CB_FORM_INFERENCE_ANSWER_METHOD = makeSymbol("CB-FORM-INFERENCE-ANSWER-METHOD");
        $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str60$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $str62$Inference_Answer = makeString("Inference Answer");
        $str63$_for_ = makeString(" for ");
        $INFERENCE = makeKeyword("INFERENCE");
        $str65$_in_ = makeString(" in ");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $SOCRATIC_QUERY_FROM_ANSWER = makeKeyword("SOCRATIC-QUERY-FROM-ANSWER");
        $str68$_Socratic_Query_ = makeString("[Socratic Query]");
        $str69$Creation_Time____ = makeString("Creation Time :  ");
        $str70$Steps_to_This_Answer____ = makeString("Steps to This Answer :  ");
        $str71$Answer_Bindings__ = makeString("Answer Bindings :");
        $str72$Answer_Mt_p___ = makeString("Answer Mt~p : ");
        $str73$None_found = makeString("None found");
        $str74$Justifications__ = makeString("Justifications :");
        $str75$after = makeString("after");
        $str76$__at_ = makeString(" (at ");
        $str77$_ = makeString(")");
        $sym78$UNIVERSAL_TIME_P = makeSymbol("UNIVERSAL-TIME-P");
        $str79$_today = makeString(" today");
        $str80$_on__A = makeString(" on ~A");
        $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER = makeSymbol("CB-SOCRATIC-QUERY-FROM-ANSWER");
        $SELF = makeKeyword("SELF");
        $str83$cb_socratic_query_from_answer__A_ = makeString("cb-socratic-query-from-answer&~A&~A&~A");
        $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER = makeSymbol("CB-LINK-SOCRATIC-QUERY-FROM-ANSWER");
        $list85 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("ANSWER-ID-STRING"), makeSymbol("JUSTIFICATION-ID-STRING"));
        $str86$_A_did_not_specify_an_inference_a = makeString("~A did not specify an inference answer justification");
        $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION = makeSymbol("CB-INFERENCE-ANSWER-FULL-JUSTIFICATION");
        $str88$__A__A__A__A_ = makeString("[~A.~A.~A.~A]");
        $str89$_Inference_Answer__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A.~A]");
        $str90$_Inference_Answer__A__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A.~A ~A]");
        $str91$cb_inference_answer_full_justific = makeString("cb-inference-answer-full-justification&~A&~A&~A&~A");
        $INFERENCE_ANSWER_FULL_JUSTIFICATION = makeKeyword("INFERENCE-ANSWER-FULL-JUSTIFICATION");
        $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION = makeSymbol("CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION");
        $str94$ = makeString("");
        $CB_CYC = makeKeyword("CB-CYC");
        $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $SHA1 = makeKeyword("SHA1");
        $str98$yui_skin_sam = makeString("yui-skin-sam");
        $str99$reloadFrameButton = makeString("reloadFrameButton");
        $str100$reload = makeString("reload");
        $str101$Refresh_Frames = makeString("Refresh Frames");
        $str102$Inference_Answer_Full_Justificati = makeString("Inference Answer Full Justification");
        $str103$_for_answer_ = makeString(" for answer ");
        $sym104$SUPPORT_MT = makeSymbol("SUPPORT-MT");
        $str105$Answer_Justification_Mt_p___ = makeString("Answer Justification Mt~p : ");
        $str106$Full_Justification__ = makeString("Full Justification :");
        $LEFT = makeKeyword("LEFT");
        $TOP = makeKeyword("TOP");
        $str109$_Full_Justification_ = makeString("[Full Justification]");
        $str110$Proofs__ = makeString("Proofs :");
        $str111$proofs = makeString("proofs");
        $PROOF = makeKeyword("PROOF");
        $SIMPLE_PROOF_VIEW = makeKeyword("SIMPLE-PROOF-VIEW");
        $str114$_Show_Proof_View_ = makeString("[Show Proof View]");
        $DATA_TABLES = makeKeyword("DATA-TABLES");
        $str116$_ = makeString(" ");
        $int$600 = makeInteger(600);
        $int$200 = makeInteger(200);
        $int$30 = makeInteger(30);
        $str120$__null = makeString(", null");
        $str121$_columnDefs_____type____num_html_ = makeString("'columnDefs':[{'type': 'num-html', targets: 0, width: '5px'}]");
        $str122$__document__ready_function_______ = makeString(
                "$(document).ready(function() {\n                   var oTable=$('#inferenceresults').DataTable(\n    {   'autoWidth':      false,\n        'scrollY':        '~Apx',\n        'scrollX':        false,\n        'scrollCollapse': true,\n        'paging':         false,\n        'dom': 'Rtif',\n        'language': {\n\t       'search': 'Filter Answers:' \n\t },\n         ~A\n    } \n                   )  } );");
        $str123$_columnDefs_____type____num_html_ = makeString("'columnDefs':[{'type': 'num-html', targets: 0, width: 1}]");
        $str124$__document__ready_function_______ = makeString(
                "$(document).ready(function() {\n                   var oTable=$('#inferenceresults').DataTable(\n    {\n        'autoWidth': false,\n        'paging'   : false,\n        'dom'      : 'Rfti',\n        'language' : {\n\t       'search': 'Filter Answers:'\n\t },\n         ~A\n    } \n                   )  } );");
        $str125$Query_was_not_yet_proven = makeString("Query was not yet proven");
        $str126$Query_was_not_proven = makeString("Query was not proven");
        $str127$Query_was_proven = makeString("Query was proven");
        $$True = makeConstSym(("True"));
        $int$2100 = makeInteger(2100);
        $str130$No_answers = makeString("No answers");
        $str131$_yet_ = makeString(" yet.");
        $str132$display = makeString("display");
        $str133$inferenceresults = makeString("inferenceresults");
        $str134$Answer = makeString("Answer");
        $str135$Answer_Mt = makeString("Answer Mt");
        $RIGHT = makeKeyword("RIGHT");
        $str137$Explain = makeString("Explain");
        $str138$Explain___A = makeString("Explain #~A");
        $str139$_ = makeString("[");
        $str140$_ = makeString("]");
        $str141$display_none = makeString("display:none");
        $str142$_A = makeString("~A");
        $NEW_ANSWER = makeKeyword("NEW-ANSWER");
        $NEW_JUSTIFICATION = makeKeyword("NEW-JUSTIFICATION");
        $OLD = makeKeyword("OLD");
        $str146$Old_answer = makeString("Old answer");
        $str147$New_answer = makeString("New answer");
        $str148$Old_answer_with_a_new_justificati = makeString("Old answer with a new justification");
        $str149$_ = makeString("*");
        $YELLOW = makeKeyword("YELLOW");
        $GREEN = makeKeyword("GREEN");
        $SKIP = makeKeyword("SKIP");
        $sym153$_ = makeSymbol(">");
        $sym154$INFERENCE_ANSWER_SUID = makeSymbol("INFERENCE-ANSWER-SUID");
        $str155$Weighing_these_arguments_yields_a = makeString("Weighing these arguments yields an overall result of: ");
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $str157$True__default_ = makeString("True (default)");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $str159$True__monotonic_ = makeString("True (monotonic)");
        $FALSE_DEF = makeKeyword("FALSE-DEF");
        $str161$False__default_ = makeString("False (default)");
        $FALSE_MON = makeKeyword("FALSE-MON");
        $str163$False__monotonic_ = makeString("False (monotonic)");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $str165$Unknown = makeString("Unknown");
        $str166$___ = makeString("???");
        $ALL = makeKeyword("ALL");
        $str168$_ = makeString("(");
        $list169 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
        $str170$___ = makeString(" . ");
        $CENTER = makeKeyword("CENTER");
        $NBSP = makeKeyword("NBSP");
        $RIGHTWARDS_ARROW = makeKeyword("RIGHTWARDS-ARROW");
        $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ = makeSymbol("*CB-SHOW-INFERENCE-RESULTS-IN-NL?*");
        $list175 = cons(makeSymbol("FROM-VARIABLE"), makeSymbol("TO-VARIABLE"));
        $UPWARDS_ARROW = makeKeyword("UPWARDS-ARROW");
    }
}
/*
 *
 * Total time: 739 ms
 *
 */