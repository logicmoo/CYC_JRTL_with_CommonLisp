/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_perform_argumentation_for_closed_queryP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_use_dynamic_table_for_inference_results$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_form_method_table$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_term_in_nl;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_style_background_color;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.cb_user_interaction_agenda;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.user_interaction_agenda;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-QUERY-BROWSER
 * source file: /cyc/top/cycl/inference/browser/cb-query-browser.lisp
 * created:     2019/07/03 17:38:07
 */
public final class cb_query_browser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_query_browser();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_inference_browser_show_answer_max_floor_mtsP$ = makeSymbol("*CB-INFERENCE-BROWSER-SHOW-ANSWER-MAX-FLOOR-MTS?*");



    private static final SubLString $str1$SILK_Query__ = makeString("SILK Query :");

    private static final SubLString $str2$Mt__ = makeString("Mt :");

    private static final SubLString $str3$EL_Query__ = makeString("EL Query :");

    private static final SubLString $str4$Pragmatics__ = makeString("Pragmatics :");

    private static final SubLSymbol INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");

    private static final SubLString $$$New = makeString("New");

    private static final SubLString $$$Prepared = makeString("Prepared");

    private static final SubLString $$$Ready = makeString("Ready");

    private static final SubLString $$$Running = makeString("Running");

    private static final SubLString $$$Suspended = makeString("Suspended");

    private static final SubLString $$$Dead = makeString("Dead");

    private static final SubLString $$$Tautology = makeString("Tautology");

    private static final SubLString $$$Contradiction = makeString("Contradiction");

    private static final SubLString $str23$Ill_Formed = makeString("Ill-Formed");

    private static final SubLSymbol INFERENCE_SUSPEND_STATUS_P = makeSymbol("INFERENCE-SUSPEND-STATUS-P");

    private static final SubLString $$$Abort = makeString("Abort");

    private static final SubLString $$$Interrupt = makeString("Interrupt");

    private static final SubLString $$$Max_Number = makeString("Max Number");

    private static final SubLString $$$Max_Time = makeString("Max Time");

    private static final SubLString $$$Max_Step = makeString("Max Step");

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    private static final SubLString $$$Max_Problem_Count = makeString("Max Problem Count");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLString $$$Probably_Approximately_Done = makeString("Probably Approximately Done");

    private static final SubLString $$$Exhaust = makeString("Exhaust");

    private static final SubLString $$$Exhaust_Total = makeString("Exhaust Total");

    private static final SubLList $list43 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("ANSWER-ID-STRING"));

    private static final SubLString $str44$_A_did_not_specify_an_inference_a = makeString("~A did not specify an inference answer");

    private static final SubLSymbol CB_INFERENCE_ANSWER = makeSymbol("CB-INFERENCE-ANSWER");

    private static final SubLString $str50$__A__A__A_ = makeString("[~A.~A.~A]");

    private static final SubLString $str51$_Inference_Answer__A__A__A_ = makeString("[Inference Answer ~A.~A.~A]");

    private static final SubLString $str53$_Inference_Answer__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A ~A]");

    private static final SubLString $str54$cb_inference_answer__A__A__A = makeString("cb-inference-answer&~A&~A&~A");

    private static final SubLString $$$button = makeString("button");

    private static final SubLSymbol CB_LINK_INFERENCE_ANSWER = makeSymbol("CB-LINK-INFERENCE-ANSWER");

    private static final SubLSymbol CB_FORM_INFERENCE_ANSWER_METHOD = makeSymbol("CB-FORM-INFERENCE-ANSWER-METHOD");

    private static final SubLString $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str60$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$Inference_Answer = makeString("Inference Answer");

    private static final SubLString $$$_for_ = makeString(" for ");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLSymbol $SOCRATIC_QUERY_FROM_ANSWER = makeKeyword("SOCRATIC-QUERY-FROM-ANSWER");

    private static final SubLString $str68$_Socratic_Query_ = makeString("[Socratic Query]");

    private static final SubLString $str69$Creation_Time____ = makeString("Creation Time :  ");

    private static final SubLString $str70$Steps_to_This_Answer____ = makeString("Steps to This Answer :  ");

    private static final SubLString $str71$Answer_Bindings__ = makeString("Answer Bindings :");

    private static final SubLString $str72$Answer_Mt_p___ = makeString("Answer Mt~p : ");

    private static final SubLString $$$None_found = makeString("None found");

    private static final SubLString $str74$Justifications__ = makeString("Justifications :");

    private static final SubLString $$$after = makeString("after");

    private static final SubLString $str76$__at_ = makeString(" (at ");

    private static final SubLString $str77$_ = makeString(")");

    private static final SubLString $$$_today = makeString(" today");

    private static final SubLString $str80$_on__A = makeString(" on ~A");

    private static final SubLSymbol CB_SOCRATIC_QUERY_FROM_ANSWER = makeSymbol("CB-SOCRATIC-QUERY-FROM-ANSWER");

    private static final SubLString $str83$cb_socratic_query_from_answer__A_ = makeString("cb-socratic-query-from-answer&~A&~A&~A");

    private static final SubLSymbol CB_LINK_SOCRATIC_QUERY_FROM_ANSWER = makeSymbol("CB-LINK-SOCRATIC-QUERY-FROM-ANSWER");

    private static final SubLList $list85 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("ANSWER-ID-STRING"), makeSymbol("JUSTIFICATION-ID-STRING"));

    private static final SubLString $str86$_A_did_not_specify_an_inference_a = makeString("~A did not specify an inference answer justification");

    private static final SubLSymbol CB_INFERENCE_ANSWER_FULL_JUSTIFICATION = makeSymbol("CB-INFERENCE-ANSWER-FULL-JUSTIFICATION");

    private static final SubLString $str88$__A__A__A__A_ = makeString("[~A.~A.~A.~A]");

    private static final SubLString $str89$_Inference_Answer__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A.~A]");

    private static final SubLString $str90$_Inference_Answer__A__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A.~A ~A]");

    private static final SubLString $str91$cb_inference_answer_full_justific = makeString("cb-inference-answer-full-justification&~A&~A&~A&~A");

    private static final SubLSymbol $INFERENCE_ANSWER_FULL_JUSTIFICATION = makeKeyword("INFERENCE-ANSWER-FULL-JUSTIFICATION");

    private static final SubLSymbol CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION = makeSymbol("CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION");

    private static final SubLString $str94$ = makeString("");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str98$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str102$Inference_Answer_Full_Justificati = makeString("Inference Answer Full Justification");

    private static final SubLString $$$_for_answer_ = makeString(" for answer ");

    private static final SubLString $str105$Answer_Justification_Mt_p___ = makeString("Answer Justification Mt~p : ");

    private static final SubLString $str106$Full_Justification__ = makeString("Full Justification :");

    private static final SubLString $str109$_Full_Justification_ = makeString("[Full Justification]");

    private static final SubLString $str110$Proofs__ = makeString("Proofs :");

    private static final SubLString $$$proofs = makeString("proofs");

    private static final SubLSymbol $SIMPLE_PROOF_VIEW = makeKeyword("SIMPLE-PROOF-VIEW");

    private static final SubLString $str114$_Show_Proof_View_ = makeString("[Show Proof View]");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLInteger $int$200 = makeInteger(200);



    private static final SubLString $str120$__null = makeString(", null");

    private static final SubLString $str121$_columnDefs_____type____num_html_ = makeString("'columnDefs':[{'type': 'num-html', targets: 0, width: '5px'}]");

    private static final SubLString $str122$__document__ready_function_______ = makeString("$(document).ready(function() {\n                   var oTable=$(\'#inferenceresults\').DataTable(\n    {   \'autoWidth\':      false,\n        \'scrollY\':        \'~Apx\',\n        \'scrollX\':        false,\n        \'scrollCollapse\': true,\n        \'paging\':         false,\n        \'dom\': \'Rtif\',\n        \'language\': {\n\t       \'search\': \'Filter Answers:\' \n\t },\n         ~A\n    } \n                   )  } );");

    private static final SubLString $str123$_columnDefs_____type____num_html_ = makeString("'columnDefs':[{'type': 'num-html', targets: 0, width: 1}]");

    private static final SubLString $str124$__document__ready_function_______ = makeString("$(document).ready(function() {\n                   var oTable=$(\'#inferenceresults\').DataTable(\n    {\n        \'autoWidth\': false,\n        \'paging\'   : false,\n        \'dom\'      : \'Rfti\',\n        \'language\' : {\n\t       \'search\': \'Filter Answers:\'\n\t },\n         ~A\n    } \n                   )  } );");

    private static final SubLString $$$Query_was_not_yet_proven = makeString("Query was not yet proven");

    private static final SubLString $$$Query_was_not_proven = makeString("Query was not proven");

    private static final SubLString $$$Query_was_proven = makeString("Query was proven");



    private static final SubLInteger $int$2100 = makeInteger(2100);

    private static final SubLString $$$No_answers = makeString("No answers");

    private static final SubLString $str131$_yet_ = makeString(" yet.");

    private static final SubLString $$$display = makeString("display");

    private static final SubLString $$$inferenceresults = makeString("inferenceresults");

    private static final SubLString $$$Answer = makeString("Answer");

    private static final SubLString $$$Answer_Mt = makeString("Answer Mt");

    private static final SubLString $$$Explain = makeString("Explain");

    private static final SubLString $str138$Explain___A = makeString("Explain #~A");

    private static final SubLString $str139$_ = makeString("[");

    private static final SubLString $str140$_ = makeString("]");

    private static final SubLString $str141$display_none = makeString("display:none");

    private static final SubLString $str142$_A = makeString("~A");

    private static final SubLString $$$Old_answer = makeString("Old answer");

    private static final SubLString $$$New_answer = makeString("New answer");

    private static final SubLString $str148$Old_answer_with_a_new_justificati = makeString("Old answer with a new justification");

    private static final SubLString $str149$_ = makeString("*");

    private static final SubLSymbol $sym153$_ = makeSymbol(">");

    private static final SubLSymbol INFERENCE_ANSWER_SUID = makeSymbol("INFERENCE-ANSWER-SUID");

    private static final SubLString $str155$Weighing_these_arguments_yields_a = makeString("Weighing these arguments yields an overall result of: ");

    private static final SubLString $str157$True__default_ = makeString("True (default)");

    private static final SubLString $str159$True__monotonic_ = makeString("True (monotonic)");

    private static final SubLString $str161$False__default_ = makeString("False (default)");

    private static final SubLString $str163$False__monotonic_ = makeString("False (monotonic)");

    private static final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLString $str166$___ = makeString("???");

    private static final SubLString $str168$_ = makeString("(");

    private static final SubLList $list169 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLString $str170$___ = makeString(" . ");

    public static final SubLSymbol $cb_show_inference_results_in_nlP$ = makeSymbol("*CB-SHOW-INFERENCE-RESULTS-IN-NL?*");

    private static final SubLList $list175 = cons(makeSymbol("FROM-VARIABLE"), makeSymbol("TO-VARIABLE"));

    // Definitions
    public static final SubLObject cb_show_inference_el_query_alt(SubLObject inference, SubLObject show_mtP) {
        if (show_mtP == UNPROVIDED) {
            show_mtP = T;
        }
        {
            SubLObject el_query = inference_datastructures_inference.inference_input_el_query(inference);
            if (NIL == el_query) {
                el_query = clause_utilities.contextualized_dnf_formula_from_clauses(inference_datastructures_inference.inference_hl_query(inference));
            }
            if (NIL != show_mtP) {
                {
                    SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
                    if (NIL != mt) {
                        html_princ_strong($str_alt0$Mt__);
                        html_indent(UNPROVIDED);
                        cb_form(mt, ZERO_INTEGER, NIL);
                        html_newline(UNPROVIDED);
                    }
                }
            }
            html_princ_strong($str_alt1$EL_Query__);
            html_newline(UNPROVIDED);
            cb_form(el_query, ZERO_INTEGER, T);
            {
                SubLObject non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
                if (NIL != non_explanatory_el_query) {
                    html_newline(UNPROVIDED);
                    html_princ_strong($str_alt2$Pragmatics__);
                    html_newline(UNPROVIDED);
                    cb_form(non_explanatory_el_query, ZERO_INTEGER, T);
                }
            }
        }
        return inference;
    }

    // Definitions
    public static SubLObject cb_show_inference_el_query(final SubLObject inference, SubLObject show_mtP) {
        if (show_mtP == UNPROVIDED) {
            show_mtP = T;
        }
        SubLObject el_query = inference_datastructures_inference.inference_input_el_query(inference);
        if (NIL == el_query) {
            el_query = clause_utilities.contextualized_dnf_formula_from_clauses(inference_datastructures_inference.inference_hl_query(inference));
        }
        if (NIL != show_mtP) {
            final SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
            if (NIL != mt) {
                html_princ_strong($str2$Mt__);
                html_indent(UNPROVIDED);
                cb_show_term(mt, ZERO_INTEGER, NIL);
                html_newline(UNPROVIDED);
            }
        }
        html_princ_strong($str3$EL_Query__);
        html_newline(UNPROVIDED);
        cb_form(el_query, ZERO_INTEGER, T);
        final SubLObject non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
        if (NIL != non_explanatory_el_query) {
            html_newline(UNPROVIDED);
            html_princ_strong($str4$Pragmatics__);
            html_newline(UNPROVIDED);
            cb_form(non_explanatory_el_query, ZERO_INTEGER, T);
        }
        return inference;
    }

    public static final SubLObject cb_show_inference_status_alt(SubLObject status) {
        SubLTrampolineFile.checkType(status, INFERENCE_STATUS_P);
        {
            SubLObject pcase_var = status;
            if (pcase_var.eql($NEW)) {
                html_princ($$$New);
            } else {
                if (pcase_var.eql($PREPARED)) {
                    html_princ($$$Prepared);
                } else {
                    if (pcase_var.eql($READY)) {
                        html_princ($$$Ready);
                    } else {
                        if (pcase_var.eql($RUNNING)) {
                            html_princ($$$Running);
                        } else {
                            if (pcase_var.eql($SUSPENDED)) {
                                html_princ($$$Suspended);
                            } else {
                                if (pcase_var.eql($DEAD)) {
                                    html_princ($$$Dead);
                                } else {
                                    if (pcase_var.eql($TAUTOLOGY)) {
                                        html_princ($$$Tautology);
                                    } else {
                                        if (pcase_var.eql($CONTRADICTION)) {
                                            html_princ($$$Contradiction);
                                        } else {
                                            if (pcase_var.eql($ILL_FORMED)) {
                                                html_princ($str_alt21$Ill_Formed);
                                            } else {
                                                html_princ(status);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_status(final SubLObject status) {
        assert NIL != inference_datastructures_enumerated_types.inference_status_p(status) : "! inference_datastructures_enumerated_types.inference_status_p(status) " + ("inference_datastructures_enumerated_types.inference_status_p(status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_status_p(status) ") + status;
        if (status.eql($NEW)) {
            html_princ($$$New);
        } else
            if (status.eql($PREPARED)) {
                html_princ($$$Prepared);
            } else
                if (status.eql($READY)) {
                    html_princ($$$Ready);
                } else
                    if (status.eql($RUNNING)) {
                        html_princ($$$Running);
                    } else
                        if (status.eql($SUSPENDED)) {
                            html_princ($$$Suspended);
                        } else
                            if (status.eql($DEAD)) {
                                html_princ($$$Dead);
                            } else
                                if (status.eql($TAUTOLOGY)) {
                                    html_princ($$$Tautology);
                                } else
                                    if (status.eql($CONTRADICTION)) {
                                        html_princ($$$Contradiction);
                                    } else
                                        if (status.eql($ILL_FORMED)) {
                                            html_princ($str23$Ill_Formed);
                                        } else {
                                            html_princ(status);
                                        }








        return NIL;
    }

    public static final SubLObject cb_show_inference_suspend_status_alt(SubLObject suspend_status) {
        SubLTrampolineFile.checkType(suspend_status, INFERENCE_SUSPEND_STATUS_P);
        {
            SubLObject pcase_var = suspend_status;
            if (pcase_var.eql($ABORT)) {
                html_princ($$$Abort);
            } else {
                if (pcase_var.eql($INTERRUPT)) {
                    html_princ($$$Interrupt);
                } else {
                    if (pcase_var.eql($MAX_NUMBER)) {
                        html_princ($$$Max_Number);
                    } else {
                        if (pcase_var.eql($MAX_TIME)) {
                            html_princ($$$Max_Time);
                        } else {
                            if (pcase_var.eql($MAX_STEP)) {
                                html_princ($$$Max_Step);
                            } else {
                                if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
                                    html_princ($$$Max_Problem_Count);
                                } else {
                                    if (pcase_var.eql($PROBABLY_APPROXIMATELY_DONE)) {
                                        html_princ($$$Probably_Approximately_Done);
                                    } else {
                                        if (pcase_var.eql($EXHAUST)) {
                                            html_princ($$$Exhaust);
                                        } else {
                                            if (pcase_var.eql($EXHAUST_TOTAL)) {
                                                html_princ($$$Exhaust_Total);
                                            } else {
                                                html_princ(suspend_status);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_suspend_status(final SubLObject suspend_status) {
        assert NIL != inference_datastructures_enumerated_types.inference_suspend_status_p(suspend_status) : "! inference_datastructures_enumerated_types.inference_suspend_status_p(suspend_status) " + ("inference_datastructures_enumerated_types.inference_suspend_status_p(suspend_status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_suspend_status_p(suspend_status) ") + suspend_status;
        if (suspend_status.eql($ABORT)) {
            html_princ($$$Abort);
        } else
            if (suspend_status.eql($INTERRUPT)) {
                html_princ($$$Interrupt);
            } else
                if (suspend_status.eql($MAX_NUMBER)) {
                    html_princ($$$Max_Number);
                } else
                    if (suspend_status.eql($MAX_TIME)) {
                        html_princ($$$Max_Time);
                    } else
                        if (suspend_status.eql($MAX_STEP)) {
                            html_princ($$$Max_Step);
                        } else
                            if (suspend_status.eql($MAX_PROBLEM_COUNT)) {
                                html_princ($$$Max_Problem_Count);
                            } else
                                if (suspend_status.eql($PROBABLY_APPROXIMATELY_DONE)) {
                                    html_princ($$$Probably_Approximately_Done);
                                } else
                                    if (suspend_status.eql($EXHAUST)) {
                                        html_princ($$$Exhaust);
                                    } else
                                        if (suspend_status.eql($EXHAUST_TOTAL)) {
                                            html_princ($$$Exhaust_Total);
                                        } else {
                                            html_princ(suspend_status);
                                        }








        return NIL;
    }

    public static final SubLObject cb_inference_answer_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject store_id_string = NIL;
            SubLObject inference_id_string = NIL;
            SubLObject answer_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            store_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            inference_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            answer_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_answer = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
                    if (NIL == inference_datastructures_inference.inference_answer_p(v_answer)) {
                        return cb_error($str_alt42$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_inference_answer_guts(v_answer);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt41);
            }
        }
        return NIL;
    }

    public static SubLObject cb_inference_answer(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject answer_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list43);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list43);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list43);
        answer_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list43);
            return NIL;
        }
        final SubLObject v_answer = cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
        if (NIL == inference_datastructures_inference.inference_answer_p(v_answer)) {
            return cb_error($str44$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inference_answer_guts(v_answer);
    }

    public static final SubLObject cb_link_inference_answer_alt(SubLObject v_answer, SubLObject verbosity, SubLObject linktext, SubLObject target) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == target) {
                target = $MAIN;
            }
            if (NIL == verbosity) {
                verbosity = $TERSE;
            }
            {
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
                SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(v_answer);
                SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                if (NIL == linktext) {
                    {
                        SubLObject pcase_var = verbosity;
                        if (pcase_var.eql($MINIMAL)) {
                            linktext = format(NIL, $str_alt47$__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id });
                        } else {
                            if (pcase_var.eql($TERSE)) {
                                linktext = format(NIL, $str_alt48$_Inference_Answer__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id });
                            } else {
                                if (pcase_var.eql($VERBOSE)) {
                                    linktext = format(NIL, $str_alt50$_Inference_Answer__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, v_bindings });
                                }
                            }
                        }
                    }
                }
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                {
                    SubLObject frame_name_var = cb_frame_name(target);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt51$cb_inference_answer__A__A__A, new SubLObject[]{ store_id, inference_id, answer_id });
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
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                return v_answer;
            }
        }
    }

    public static SubLObject cb_link_inference_answer(final SubLObject v_answer, SubLObject verbosity, SubLObject linktext, SubLObject target) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == target) {
            target = $MAIN;
        }
        if (NIL == verbosity) {
            verbosity = $TERSE;
        }
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(v_answer);
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        if (NIL == linktext) {
            final SubLObject pcase_var = verbosity;
            if (pcase_var.eql($MINIMAL)) {
                linktext = format(NIL, $str50$__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id });
            } else
                if (pcase_var.eql($TERSE)) {
                    linktext = format(NIL, $str51$_Inference_Answer__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id });
                } else
                    if (pcase_var.eql($VERBOSE)) {
                        linktext = format(NIL, $str53$_Inference_Answer__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, v_bindings });
                    }


        }
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        if (NIL != $cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (NIL != answer_id) {
                html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(answer_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str54$cb_inference_answer__A__A__A, new SubLObject[]{ store_id, inference_id, answer_id });
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != $cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$button);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != answer_id) {
                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_princ(answer_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != linktext) {
                    html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(linktext);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_char(CHAR_greater, UNPROVIDED);
            } else {
                html_princ(linktext);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return v_answer;
    }

    public static final SubLObject cb_form_inference_answer_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($INFERENCE_ANSWER, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject cb_form_inference_answer_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($INFERENCE_ANSWER, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject cb_guess_inference_answer_alt(SubLObject store_id_string, SubLObject inference_id_string, SubLObject answer_id_string) {
        {
            SubLObject store_id = string_utilities.string_to_integer(store_id_string);
            SubLObject inference_id = string_utilities.string_to_integer(inference_id_string);
            SubLObject answer_id = string_utilities.string_to_integer(answer_id_string);
            if (inference_id.isInteger() && answer_id.isInteger()) {
                {
                    SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_ids(store_id, inference_id, answer_id);
                    if (NIL != inference_datastructures_inference.inference_answer_p(v_answer)) {
                        return v_answer;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_guess_inference_answer(final SubLObject store_id_string, final SubLObject inference_id_string, final SubLObject answer_id_string) {
        final SubLObject store_id = string_utilities.string_to_integer(store_id_string);
        final SubLObject inference_id = string_utilities.string_to_integer(inference_id_string);
        final SubLObject answer_id = string_utilities.string_to_integer(answer_id_string);
        if (inference_id.isInteger() && answer_id.isInteger()) {
            final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_ids(store_id, inference_id, answer_id);
            if (NIL != inference_datastructures_inference.inference_answer_p(v_answer)) {
                return v_answer;
            }
        }
        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_bindings_alt(SubLObject v_bindings, SubLObject free_variables) {
        com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_bindings_vertical(v_bindings, free_variables);
        return NIL;
    }

    public static SubLObject cb_show_inference_answer_bindings(final SubLObject v_bindings, final SubLObject free_variables) {
        cb_show_bindings_vertical(v_bindings, free_variables);
        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_summary_alt(SubLObject v_answer) {
        cb_link($INFERENCE_ANSWER, v_answer, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        {
            SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_bindings(v_bindings, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject cb_show_inference_answer_summary(final SubLObject v_answer) {
        cb_link($INFERENCE_ANSWER, v_answer, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        cb_show_bindings(v_bindings, UNPROVIDED);
        return v_answer;
    }

    public static final SubLObject cb_inference_answer_guts_alt(SubLObject v_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Inference_Answer);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_script_utilities.cb_hoverover_page_init();
                            cb_inference_browser.cb_show_relevant_inference_debugging_links(v_answer);
                            html_princ_strong($$$Inference_Answer);
                            html_indent(UNPROVIDED);
                            cb_link($INFERENCE_ANSWER, v_answer, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str_alt56$_for_);
                            cb_link($INFERENCE, inference_datastructures_inference.inference_answer_inference(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str_alt58$_in_);
                            cb_link($PROBLEM_STORE, inference_datastructures_inference.inference_answer_problem_store(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(FOUR_INTEGER);
                            cb_link($SOCRATIC_QUERY_FROM_ANSWER, v_answer, $str_alt61$_Socratic_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            if (NIL != user_interaction_agenda.user_interaction_agenda_p(cb_user_interaction_agenda.cb_current_uia())) {
                                cb_link($UIA_JUSTIFICATION_BROWSER_EXTERNAL, v_answer, $str_alt63$_Browse_in_UIA_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                            }
                            html_hr(UNPROVIDED, UNPROVIDED);
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_el_query(inference_datastructures_inference.inference_answer_inference(v_answer), UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_princ_strong($str_alt64$Creation_Time____);
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_creation_time(v_answer);
                            html_newline(UNPROVIDED);
                            html_princ_strong($str_alt65$Steps_to_This_Answer____);
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_step_count(v_answer);
                            html_newline(UNPROVIDED);
                            {
                                SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars(v_answer);
                                html_princ_strong($str_alt66$Answer_Bindings__);
                                html_newline(UNPROVIDED);
                                com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_bindings(v_bindings, free_el_vars);
                            }
                            html_newline(UNPROVIDED);
                            html_princ_strong($str_alt67$Justifications__);
                            if (NIL != list_utilities.singletonP(inference_datastructures_inference.inference_answer_justifications(v_answer))) {
                                html_indent(TWO_INTEGER);
                                cb_link($INFERENCE_ANSWER_FULL_JUSTIFICATION, inference_datastructures_inference.inference_answer_justifications(v_answer).first(), $TERSE, $str_alt69$_Full_, UNPROVIDED, UNPROVIDED);
                            }
                            {
                                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                SubLObject justification = NIL;
                                for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                                    html_newline(UNPROVIDED);
                                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_justification(justification);
                                }
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
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_inference_answer_guts(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str60$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Inference_Answer);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_script_utilities.cb_hoverover_page_init();
                    dhtml_macros.html_basic_cb_scripts();
                    cb_inference_browser.cb_show_relevant_inference_debugging_links(v_answer);
                    html_princ_strong($$$Inference_Answer);
                    html_indent(UNPROVIDED);
                    cb_link($INFERENCE_ANSWER, v_answer, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_princ($$$_for_);
                    cb_link($INFERENCE, inference_datastructures_inference.inference_answer_inference(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_princ($$$_in_);
                    cb_link($PROBLEM_STORE, inference_datastructures_inference.inference_answer_problem_store(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(FOUR_INTEGER);
                    cb_link($SOCRATIC_QUERY_FROM_ANSWER, v_answer, $str68$_Socratic_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(TWO_INTEGER);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    cb_show_inference_el_query(inference_datastructures_inference.inference_answer_inference(v_answer), UNPROVIDED);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($str69$Creation_Time____);
                    cb_show_inference_answer_creation_time(v_answer);
                    html_newline(UNPROVIDED);
                    html_princ_strong($str70$Steps_to_This_Answer____);
                    cb_show_inference_answer_step_count(v_answer);
                    html_newline(UNPROVIDED);
                    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                    final SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars(v_answer);
                    html_princ_strong($str71$Answer_Bindings__);
                    html_newline(UNPROVIDED);
                    cb_show_inference_answer_bindings(v_bindings, free_el_vars);
                    if (NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue(thread)) {
                        final SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer(v_answer, UNPROVIDED);
                        html_princ_strong(format(NIL, $str72$Answer_Mt_p___, length(mts)));
                        if (NIL != mts) {
                            SubLObject cdolist_list_var = mts;
                            SubLObject mt = NIL;
                            mt = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cb_form(mt, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                mt = cdolist_list_var.first();
                            } 
                        } else {
                            html_princ($$$None_found);
                            html_newline(UNPROVIDED);
                        }
                    }
                    html_newline(UNPROVIDED);
                    html_princ_strong($str74$Justifications__);
                    SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                    SubLObject justification = NIL;
                    justification = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        html_newline(UNPROVIDED);
                        cb_show_inference_answer_justification(justification);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        justification = cdolist_list_var2.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_2, thread);
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_creation_time_alt(SubLObject v_answer) {
        {
            SubLObject creation_time = inference_datastructures_inference.inference_answer_creation_time(v_answer);
            SubLObject elapsed_creation_time = inference_datastructures_inference.inference_answer_elapsed_time(v_answer, NIL);
            html_princ($$$after);
            html_princ(numeric_date_utilities.elapsed_seconds_string(elapsed_creation_time));
            html_princ($str_alt71$__at_);
            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_universal_time(creation_time);
            html_princ($str_alt72$_);
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_answer_creation_time(final SubLObject v_answer) {
        final SubLObject creation_time = inference_datastructures_inference.inference_answer_creation_time(v_answer);
        final SubLObject elapsed_creation_time = inference_datastructures_inference.inference_answer_elapsed_time(v_answer, NIL);
        html_princ($$$after);
        html_princ(numeric_date_utilities.elapsed_seconds_string(elapsed_creation_time));
        html_princ($str76$__at_);
        cb_show_universal_time(creation_time);
        html_princ($str77$_);
        return NIL;
    }

    public static final SubLObject cb_show_universal_time_alt(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(universal_time, UNIVERSAL_TIME_P);
            thread.resetMultipleValues();
            {
                SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time(universal_time);
                SubLObject universal_seconds = thread.secondMultipleValue();
                thread.resetMultipleValues();
                html_princ(numeric_date_utilities.secondstring(universal_seconds));
                if (universal_date.numE(numeric_date_utilities.today())) {
                    html_princ($str_alt74$_today);
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt75$_on__A, numeric_date_utilities.datestring(universal_date));
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_universal_time(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numeric_date_utilities.universal_time_p(universal_time) : "! numeric_date_utilities.universal_time_p(universal_time) " + ("numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) ") + universal_time;
        thread.resetMultipleValues();
        final SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time(universal_time);
        final SubLObject universal_seconds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_princ(numeric_date_utilities.secondstring(universal_seconds));
        if (universal_date.numE(numeric_date_utilities.today())) {
            html_princ($$$_today);
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str80$_on__A, numeric_date_utilities.datestring(universal_date));
        }
        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_step_count_alt(SubLObject v_answer) {
        {
            SubLObject step_count = inference_datastructures_inference.inference_answer_step_count(v_answer);
            html_princ(step_count);
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_answer_step_count(final SubLObject v_answer) {
        final SubLObject step_count = inference_datastructures_inference.inference_answer_step_count(v_answer);
        html_princ(step_count);
        return NIL;
    }

    public static final SubLObject cb_socratic_query_from_answer_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject store_id_string = NIL;
            SubLObject inference_id_string = NIL;
            SubLObject answer_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            store_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            inference_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            answer_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject inference_answer = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
                    if (NIL == inference_datastructures_inference.inference_answer_p(inference_answer)) {
                        return cb_error($str_alt42$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    {
                        SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
                        SubLObject sentence = inference_datastructures_inference.inference_answer_el_sentence(inference_answer);
                        SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
                        SubLObject v_properties = NIL;
                        return cb_query.cb_socratic_query(sentence, mt, v_properties);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt41);
            }
        }
        return NIL;
    }

    public static SubLObject cb_socratic_query_from_answer(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject answer_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list43);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list43);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list43);
        answer_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list43);
            return NIL;
        }
        final SubLObject inference_answer = cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
        if (NIL == inference_datastructures_inference.inference_answer_p(inference_answer)) {
            return cb_error($str44$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject sentence = inference_datastructures_inference.inference_answer_el_sentence(inference_answer);
        final SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
        final SubLObject v_properties = inference_datastructures_inference.inference_input_query_properties(cb_inference_browser.compute_the_relevant_inference(inference_answer));
        return cb_query.cb_socratic_query(sentence, mt, v_properties);
    }

    public static final SubLObject cb_link_socratic_query_from_answer_alt(SubLObject inference_answer, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt61$_Socratic_Query_;
            }
            {
                SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(inference_answer);
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
                SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt78$cb_socratic_query_from_answer__A_, new SubLObject[]{ store_id, inference_id, answer_id });
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

    public static SubLObject cb_link_socratic_query_from_answer(final SubLObject inference_answer, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str68$_Socratic_Query_;
        }
        final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(inference_answer);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str83$cb_socratic_query_from_answer__A_, new SubLObject[]{ store_id, inference_id, answer_id });
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

    public static final SubLObject cb_inference_answer_full_justification_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject store_id_string = NIL;
            SubLObject inference_id_string = NIL;
            SubLObject answer_id_string = NIL;
            SubLObject justification_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            store_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt80);
            inference_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt80);
            answer_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt80);
            justification_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject justification = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_guess_inference_answer_justification(store_id_string, inference_id_string, answer_id_string, justification_id_string);
                    if (NIL == inference_datastructures_inference.inference_answer_justification_p(justification)) {
                        return cb_error($str_alt81$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_inference_answer_full_justification_guts(justification);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt80);
            }
        }
        return NIL;
    }

    public static SubLObject cb_inference_answer_full_justification(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject answer_id_string = NIL;
        SubLObject justification_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list85);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list85);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list85);
        answer_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list85);
        justification_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list85);
            return NIL;
        }
        final SubLObject justification = cb_guess_inference_answer_justification(store_id_string, inference_id_string, answer_id_string, justification_id_string);
        if (NIL == inference_datastructures_inference.inference_answer_justification_p(justification)) {
            return cb_error($str86$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inference_answer_full_justification_guts(justification);
    }

    public static final SubLObject cb_link_inference_answer_full_justification_alt(SubLObject justification, SubLObject verbosity, SubLObject linktext, SubLObject target) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == target) {
                target = $MAIN;
            }
            if (NIL == verbosity) {
                verbosity = $TERSE;
            }
            {
                SubLObject justification_id = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.inference_answer_justification_suid(justification);
                SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
                SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(v_answer);
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
                SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                if (NIL == linktext) {
                    {
                        SubLObject pcase_var = verbosity;
                        if (pcase_var.eql($MINIMAL)) {
                            linktext = format(NIL, $str_alt83$__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, justification_id });
                        } else {
                            if (pcase_var.eql($TERSE)) {
                                linktext = format(NIL, $str_alt84$_Inference_Answer__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, justification_id });
                            } else {
                                if (pcase_var.eql($VERBOSE)) {
                                    linktext = format(NIL, $str_alt85$_Inference_Answer__A__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, justification_id, v_bindings });
                                }
                            }
                        }
                    }
                }
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                {
                    SubLObject frame_name_var = cb_frame_name(target);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt86$cb_inference_answer_full_justific, new SubLObject[]{ store_id, inference_id, answer_id, justification_id });
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
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                return v_answer;
            }
        }
    }

    public static SubLObject cb_link_inference_answer_full_justification(final SubLObject justification, SubLObject verbosity, SubLObject linktext, SubLObject target) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == target) {
            target = $MAIN;
        }
        if (NIL == verbosity) {
            verbosity = $TERSE;
        }
        final SubLObject justification_id = inference_answer_justification_suid(justification);
        final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
        final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(v_answer);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        if (NIL == linktext) {
            final SubLObject pcase_var = verbosity;
            if (pcase_var.eql($MINIMAL)) {
                linktext = format(NIL, $str88$__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, justification_id });
            } else
                if (pcase_var.eql($TERSE)) {
                    linktext = format(NIL, $str89$_Inference_Answer__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, justification_id });
                } else
                    if (pcase_var.eql($VERBOSE)) {
                        linktext = format(NIL, $str90$_Inference_Answer__A__A__A__A__A_, new SubLObject[]{ store_id, inference_id, answer_id, justification_id, v_bindings });
                    }


        }
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str91$cb_inference_answer_full_justific, new SubLObject[]{ store_id, inference_id, answer_id, justification_id });
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
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return v_answer;
    }

    public static final SubLObject inference_answer_justification_suid_alt(SubLObject justification) {
        {
            SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
            SubLObject justifications = inference_datastructures_inference.inference_answer_justifications(v_answer);
            return position(justification, justifications, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject inference_answer_justification_suid(final SubLObject justification) {
        final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
        final SubLObject justifications = inference_datastructures_inference.inference_answer_justifications(v_answer);
        return position(justification, justifications, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_guess_inference_answer_justification_alt(SubLObject store_id_string, SubLObject inference_id_string, SubLObject answer_id_string, SubLObject justification_id_string) {
        {
            SubLObject v_answer = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
            if (NIL != inference_datastructures_inference.inference_answer_p(v_answer)) {
                {
                    SubLObject just_id = read_from_string_ignoring_errors(justification_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != subl_promotions.non_negative_integer_p(just_id)) {
                        {
                            SubLObject justification = nth(just_id, inference_datastructures_inference.inference_answer_justifications(v_answer));
                            return justification;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_guess_inference_answer_justification(final SubLObject store_id_string, final SubLObject inference_id_string, final SubLObject answer_id_string, final SubLObject justification_id_string) {
        final SubLObject v_answer = cb_guess_inference_answer(store_id_string, inference_id_string, answer_id_string);
        if (NIL != inference_datastructures_inference.inference_answer_p(v_answer)) {
            final SubLObject just_id = read_from_string_ignoring_errors(justification_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != subl_promotions.non_negative_integer_p(just_id)) {
                final SubLObject justification = nth(just_id, inference_datastructures_inference.inference_answer_justifications(v_answer));
                return justification;
            }
        }
        return NIL;
    }

    public static final SubLObject cb_inference_answer_full_justification_guts_alt(SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ($str_alt88$Inference_Answer_Full_Justificati);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_script_utilities.cb_hoverover_page_init();
                                html_princ_strong($str_alt88$Inference_Answer_Full_Justificati);
                                html_indent(UNPROVIDED);
                                cb_link($INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $MINIMAL, NIL, $SELF, UNPROVIDED);
                                html_princ($str_alt89$_for_answer_);
                                cb_link($INFERENCE_ANSWER, v_answer, $MINIMAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_el_query(inference, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                {
                                    SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                    SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars(v_answer);
                                    html_princ_strong($str_alt66$Answer_Bindings__);
                                    html_newline(UNPROVIDED);
                                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_bindings(v_bindings, free_el_vars);
                                }
                                html_newline(UNPROVIDED);
                                html_princ_strong($str_alt90$Full_Justification__);
                                {
                                    SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                                    SubLObject full_justification = hl_supports.hl_justification_expand(supports);
                                    SubLObject validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
                                    cb_assertion_browser.cb_show_justification_readably(full_justification, validation_level);
                                }
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_inference_answer_full_justification_guts(final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject title_var = $str94$;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str60$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str98$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
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
                        html_script_utilities.cb_hoverover_page_init();
                        html_princ_strong($str102$Inference_Answer_Full_Justificati);
                        html_indent(UNPROVIDED);
                        cb_link($INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $MINIMAL, NIL, $SELF, UNPROVIDED);
                        html_princ($$$_for_answer_);
                        cb_link($INFERENCE_ANSWER, v_answer, $MINIMAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_show_inference_el_query(inference, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                        final SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars(v_answer);
                        html_princ_strong($str71$Answer_Bindings__);
                        html_newline(UNPROVIDED);
                        cb_show_inference_answer_bindings(v_bindings, free_el_vars);
                        final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                        final SubLObject full_justification = hl_supports.hl_justification_expand(supports);
                        final SubLObject validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
                        final SubLObject mts = genl_mts.max_floor_mts(list_utilities.fast_delete_duplicates(Mapping.mapcar(SUPPORT_MT, full_justification), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        html_princ_strong(format(NIL, $str105$Answer_Justification_Mt_p___, length(mts)));
                        if (NIL != mts) {
                            SubLObject cdolist_list_var = mts;
                            SubLObject mt = NIL;
                            mt = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cb_form(mt, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                mt = cdolist_list_var.first();
                            } 
                        } else {
                            html_princ($$$None_found);
                            html_newline(UNPROVIDED);
                        }
                        html_newline(UNPROVIDED);
                        html_princ_strong($str106$Full_Justification__);
                        cb_assertion_browser.cb_show_justification_readably(full_justification, validation_level);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$3, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_justification_alt(SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                                        cb_assertion_browser.cb_show_justification_readably(supports, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(inference_datastructures_inference.inference_answer_justification_store(justification)));
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(FOUR_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_query.cb_princ_with_inference_doc_more_link($str_alt93$Proofs__, $$$proofs, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                        SubLObject proof = NIL;
                                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                                            html_newline(UNPROVIDED);
                                            cb_link($PROOF, proof, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return justification;
        }
    }

    public static SubLObject cb_show_inference_answer_justification(final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                    cb_assertion_browser.cb_show_justification_readably(supports, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(inference_datastructures_inference.inference_answer_justification_store(justification)));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_link($INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $TERSE, $str109$_Full_Justification_, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    cb_query.cb_princ_with_inference_doc_more_link($str110$Proofs__, $$$proofs, UNPROVIDED, UNPROVIDED);
                    final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer(justification);
                    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                    SubLObject proof = NIL;
                    proof = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_newline(UNPROVIDED);
                        cb_link($PROOF, proof, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cb_link($SIMPLE_PROOF_VIEW, proof, v_answer, $str114$_Show_Proof_View_, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        proof = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return justification;
    }

    public static SubLObject cb_inference_fancy_table_js(final SubLObject var_count, final SubLObject nanswers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.web_bundle($DATA_TABLES);
        SubLObject column_type_spec_json = $$$_;
        final SubLObject pixel_height = (nanswers.numG(TWENTY_INTEGER)) ? $int$600 : nanswers.numL(SEVEN_INTEGER) ? $int$200 : multiply(nanswers, $int$30);
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(var_count); n = add(n, ONE_INTEGER)) {
            column_type_spec_json = cconcatenate(column_type_spec_json, $str120$__null);
        }
        column_type_spec_json = copy_seq($str121$_columnDefs_____type____num_html_);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str122$__document__ready_function_______, pixel_height, column_type_spec_json);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_inference_fancy_table_all_answers_js(final SubLObject var_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.web_bundle($DATA_TABLES);
        SubLObject column_type_spec_json = $$$_;
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(var_count); n = add(n, ONE_INTEGER)) {
            column_type_spec_json = cconcatenate(column_type_spec_json, $str120$__null);
        }
        column_type_spec_json = copy_seq($str123$_columnDefs_____type____num_html_);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str124$__document__ready_function_______, column_type_spec_json);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_fully_bound_answer(final SubLObject inference, final SubLObject answer_count, final SubLObject current_answers, final SubLObject inference_new_justification_set) {
        if (answer_count.isZero()) {
            if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                html_princ_strong($$$Query_was_not_yet_proven);
            } else {
                html_princ_strong($$$Query_was_not_proven);
            }
        } else {
            final SubLObject v_answer = current_answers.first();
            html_princ_strong($$$Query_was_proven);
            html_indent(UNPROVIDED);
            cb_show_term($$True, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, answer_count);
        }
        return NIL;
    }

    public static SubLObject cb_show_streamed_inference_answer_section(final SubLObject inference, final SubLObject answer_limit) {
        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_section_alt(SubLObject inference, SubLObject answer_limit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject current_answers = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_inference_current_answers(inference);
                SubLObject free_el_variables = thread.secondMultipleValue();
                SubLObject inference_new_justification_set = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject answer_count = length(current_answers);
                    if ((NIL == free_el_variables) && answer_count.isZero()) {
                        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                            html_princ_strong($$$Query_was_not_yet_proven);
                        } else {
                            html_princ_strong($$$Query_was_not_proven);
                        }
                    } else {
                        if (answer_count.isZero()) {
                            html_princ_strong($$$No_answers);
                        } else {
                            if ((NIL == free_el_variables) && ONE_INTEGER.numE(answer_count)) {
                                {
                                    SubLObject v_answer = current_answers.first();
                                    html_princ_strong($$$Query_was_proven);
                                    html_indent(UNPROVIDED);
                                    cb_form($$True, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, answer_count);
                                }
                            } else {
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
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($LEFT));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($TOP));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ_strong($$$Answer);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_bindings_horizontal_variable_row(free_el_variables, NIL, T);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        {
                                            SubLObject index = ZERO_INTEGER;
                                            SubLObject answer_limit_exceededP = NIL;
                                            if (NIL == answer_limit_exceededP) {
                                                {
                                                    SubLObject csome_list_var = current_answers;
                                                    SubLObject v_answer = NIL;
                                                    for (v_answer = csome_list_var.first(); !((NIL != answer_limit_exceededP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_answer = csome_list_var.first()) {
                                                        if ((NIL != answer_limit) && index.numGE(answer_limit)) {
                                                            answer_limit_exceededP = T;
                                                        } else {
                                                            index = add(index, ONE_INTEGER);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_align($LEFT));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_align($TOP));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, answer_count);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_section_bindings(v_answer, free_el_variables);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
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
                                if ((NIL != $cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread)) && (NIL != inference_utilities.inference_requires_argumentationP(inference))) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_argumentation_result(inference);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_inference_answer_section(final SubLObject inference, final SubLObject answer_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject current_answers = cb_inference_current_answers(inference);
        final SubLObject free_el_variables = thread.secondMultipleValue();
        final SubLObject inference_new_justification_set = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject answer_count = length(current_answers);
        final SubLObject is_running = eq(inference_datastructures_inference.inference_status(inference), $RUNNING);
        final SubLObject my_answer_limit = ((NIL == is_running) && (NIL != $cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread))) ? $int$2100 : answer_limit;
        if (NIL == free_el_variables) {
            cb_show_fully_bound_answer(inference, answer_count, current_answers, inference_new_justification_set);
        } else
            if (answer_count.isZero()) {
                html_princ_strong($$$No_answers);
                if (NIL != is_running) {
                    html_princ_strong($str131$_yet_);
                }
            } else {
                SubLObject index = ZERO_INTEGER;
                SubLObject answer_limit_exceededP = NIL;
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$display);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$inferenceresults);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_thead_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($$$Answer);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                            cb_show_bindings_horizontal_variable_row(free_el_variables, NIL, T);
                            if (NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ_strong($$$Answer_Mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_table_thead_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_tbody_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL == answer_limit_exceededP) {
                            SubLObject csome_list_var = current_answers;
                            SubLObject v_answer = NIL;
                            v_answer = csome_list_var.first();
                            while ((NIL == answer_limit_exceededP) && (NIL != csome_list_var)) {
                                if ((NIL != my_answer_limit) && index.numGE(my_answer_limit)) {
                                    answer_limit_exceededP = T;
                                } else {
                                    index = add(index, ONE_INTEGER);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, answer_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cb_show_inference_answer_section_bindings(v_answer, free_el_variables);
                                        if (NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer(v_answer, T);
                                                if (NIL != mts) {
                                                    SubLObject cdolist_list_var = mts;
                                                    SubLObject mt = NIL;
                                                    mt = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                        html_newline(UNPROVIDED);
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        mt = cdolist_list_var.first();
                                                    } 
                                                } else {
                                                    html_princ($$$None_found);
                                                    html_newline(UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                                csome_list_var = csome_list_var.rest();
                                v_answer = csome_list_var.first();
                            } 
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_table_tbody_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                if (((NIL != $cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) && (NIL == answer_limit_exceededP)) && (NIL == is_running)) {
                    if (NIL == answer_limit) {
                        cb_inference_fancy_table_all_answers_js(length(free_el_variables));
                    } else {
                        cb_inference_fancy_table_js(length(free_el_variables), index);
                    }
                }
                if ((NIL != $cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread)) && (NIL != inference_utilities.inference_requires_argumentationP(inference))) {
                    cb_show_argumentation_result(inference);
                }
            }

        return NIL;
    }

    public static final SubLObject cb_show_inference_answer_section_answer_number_alt(SubLObject v_answer, SubLObject inference_new_justification_set, SubLObject answer_count) {
        {
            SubLObject linktext = (ONE_INTEGER.numE(answer_count)) ? ((SubLObject) ($str_alt102$_Explain_)) : format(NIL, $str_alt103$_Explain___A_, inference_datastructures_inference.inference_answer_suid(v_answer));
            SubLObject newness = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_determine_inference_answer_newness(v_answer, inference_new_justification_set);
            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_inference_answer_newness_token(newness);
            cb_link($INFERENCE_ANSWER, v_answer, $MINIMAL, linktext, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_answer_section_answer_number(final SubLObject v_answer, final SubLObject inference_new_justification_set, final SubLObject answer_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject linktext = (ONE_INTEGER.numE(answer_count)) ? $$$Explain : format(NIL, $str138$Explain___A, inference_datastructures_inference.inference_answer_suid(v_answer));
        final SubLObject newness = cb_determine_inference_answer_newness(v_answer, inference_new_justification_set);
        if (NIL == $cb_use_dynamic_table_for_inference_results$.getDynamicValue(thread)) {
            linktext = cconcatenate($str139$_, new SubLObject[]{ linktext, $str140$_ });
        }
        cb_show_normal_inference_answer_justification_button(newness, v_answer, linktext);
        return NIL;
    }

    public static SubLObject cb_show_normal_inference_answer_justification_button(final SubLObject newness, final SubLObject v_answer, final SubLObject hover) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str141$display_none);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str142$_A, inference_datastructures_inference.inference_answer_suid(v_answer));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        cb_show_inference_answer_newness_token(newness);
        cb_link($INFERENCE_ANSWER, v_answer, $MINIMAL, hover, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_determine_inference_answer_newness_alt(SubLObject v_answer, SubLObject inference_new_justification_set) {
        if (NIL != inference_datastructures_inference.inference_answer_newP(v_answer)) {
            return $NEW_ANSWER;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_inference_answer_has_new_justificationP(v_answer, inference_new_justification_set)) {
                return $NEW_JUSTIFICATION;
            } else {
                return $OLD;
            }
        }
    }

    public static SubLObject cb_determine_inference_answer_newness(final SubLObject v_answer, final SubLObject inference_new_justification_set) {
        if (NIL != inference_datastructures_inference.inference_answer_newP(v_answer)) {
            return $NEW_ANSWER;
        }
        if (NIL != cb_inference_answer_has_new_justificationP(v_answer, inference_new_justification_set)) {
            return $NEW_JUSTIFICATION;
        }
        return $OLD;
    }

    public static final SubLObject cb_show_inference_answer_newness_token_alt(SubLObject newness) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_determine_inference_answer_bgcolor(newness);
                SubLObject explanation = NIL;
                SubLObject pcase_var = newness;
                if (pcase_var.eql($OLD)) {
                    explanation = $$$Old_answer;
                } else {
                    if (pcase_var.eql($NEW_ANSWER)) {
                        explanation = $$$New_answer;
                    } else {
                        if (pcase_var.eql($NEW_JUSTIFICATION)) {
                            explanation = $str_alt109$Old_answer_with_a_new_justificati;
                        }
                    }
                }
                if ($OLD != newness) {
                    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_span_style$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_style_background_color(color);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_query.cb_princ_with_explanation($str_alt110$_, explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_inference_answer_newness_token(final SubLObject newness) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = cb_determine_inference_answer_bgcolor(newness);
        SubLObject explanation = NIL;
        if (newness.eql($OLD)) {
            explanation = $$$Old_answer;
        } else
            if (newness.eql($NEW_ANSWER)) {
                explanation = $$$New_answer;
            } else
                if (newness.eql($NEW_JUSTIFICATION)) {
                    explanation = $str148$Old_answer_with_a_new_justificati;
                }


        if ($OLD != newness) {
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            html_markup(html_macros.$html_span_head$.getGlobalValue());
            html_markup(html_macros.$html_span_style$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_style_background_color(color);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_query.cb_princ_with_explanation($str149$_, explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_span_tail$.getGlobalValue());
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_inference_answer_has_new_justificationP_alt(SubLObject v_answer, SubLObject new_justification_set) {
        {
            SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
            SubLObject justification = NIL;
            for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                if (NIL != set.set_memberP(justification, new_justification_set)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_inference_answer_has_new_justificationP(final SubLObject v_answer, final SubLObject new_justification_set) {
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

    public static final SubLObject cb_determine_inference_answer_bgcolor_alt(SubLObject newness) {
        {
            SubLObject pcase_var = newness;
            if (pcase_var.eql($OLD)) {
                return NIL;
            } else {
                if (pcase_var.eql($NEW_ANSWER)) {
                    return $YELLOW;
                } else {
                    if (pcase_var.eql($NEW_JUSTIFICATION)) {
                        return $GREEN;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject cb_determine_inference_answer_bgcolor(final SubLObject newness) {
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

    public static final SubLObject cb_inference_current_answers_alt(SubLObject inference) {
        {
            SubLObject free_el_variables = inference_datastructures_inference.inference_free_el_vars(inference);
            SubLObject inference_new_justification_set = set.new_set(symbol_function(EQ), inference_datastructures_inference.inference_new_justification_count(inference));
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(inference_datastructures_inference.inference_new_answer_justifications(inference));
            SubLObject justification = NIL;
            for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                set.set_add(justification, inference_new_justification_set);
            }
            {
                SubLObject current_answers = NIL;
                SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject v_answer = NIL;
                        while (NIL != id) {
                            v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                                current_answers = cons(v_answer, current_answers);
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
                current_answers = Sort.sort(current_answers, symbol_function($sym114$_), symbol_function(INFERENCE_ANSWER_SUID));
                return values(current_answers, free_el_variables, inference_new_justification_set);
            }
        }
    }

    public static SubLObject cb_inference_current_answers(final SubLObject inference) {
        final SubLObject free_el_variables = inference_datastructures_inference.inference_free_el_vars(inference);
        final SubLObject inference_new_justification_set = set.new_set(symbol_function(EQ), inference_datastructures_inference.inference_new_justification_count(inference));
        SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(inference_datastructures_inference.inference_new_answer_justifications(inference));
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(justification, inference_new_justification_set);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        SubLObject current_answers = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$19 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$19);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        current_answers = cons(v_answer, current_answers);
                    }
                }
            }
            final SubLObject idx_$20 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$20)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$20);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        current_answers = cons(v_answer2, current_answers);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        current_answers = Sort.sort(current_answers, symbol_function($sym153$_), symbol_function(INFERENCE_ANSWER_SUID));
        return values(current_answers, free_el_variables, inference_new_justification_set);
    }

    public static final SubLObject cb_show_inference_answer_section_bindings_alt(SubLObject inference_answer, SubLObject free_el_variables) {
        {
            SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_bindings_horizontal_value_row(v_bindings, free_el_variables);
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_answer_section_bindings(final SubLObject inference_answer, final SubLObject free_el_variables) {
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        cb_show_bindings_horizontal_value_row(v_bindings, free_el_variables);
        return NIL;
    }

    /**
     * Assumes that INFERENCE has exactly two answers, one true and one false
     */
    @LispMethod(comment = "Assumes that INFERENCE has exactly two answers, one true and one false")
    public static final SubLObject cb_show_argumentation_result_alt(SubLObject inference) {
        {
            SubLObject tv = inference_utilities.inference_argumentation_result(inference);
            html_princ($str_alt116$Weighing_these_arguments_yields_a);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_tv(tv);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Assumes that INFERENCE has exactly two answers, one true and one false
     */
    @LispMethod(comment = "Assumes that INFERENCE has exactly two answers, one true and one false")
    public static SubLObject cb_show_argumentation_result(final SubLObject inference) {
        final SubLObject tv = inference_utilities.inference_argumentation_result(inference);
        html_princ($str155$Weighing_these_arguments_yields_a);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_show_tv(tv);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_show_tv_alt(SubLObject tv) {
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($TRUE_DEF)) {
                html_princ($str_alt118$True__default_);
            } else {
                if (pcase_var.eql($TRUE_MON)) {
                    html_princ($str_alt120$True__monotonic_);
                } else {
                    if (pcase_var.eql($FALSE_DEF)) {
                        html_princ($str_alt122$False__default_);
                    } else {
                        if (pcase_var.eql($FALSE_MON)) {
                            html_princ($str_alt124$False__monotonic_);
                        } else {
                            if (pcase_var.eql($UNKNOWN)) {
                                html_princ($$$Unknown);
                            } else {
                                html_princ($str_alt127$___);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_tv(final SubLObject tv) {
        if (tv.eql($TRUE_DEF)) {
            html_princ($str157$True__default_);
        } else
            if (tv.eql($TRUE_MON)) {
                html_princ($str159$True__monotonic_);
            } else
                if (tv.eql($FALSE_DEF)) {
                    html_princ($str161$False__default_);
                } else
                    if (tv.eql($FALSE_MON)) {
                        html_princ($str163$False__monotonic_);
                    } else
                        if (tv.eql($UNKNOWN)) {
                            html_princ($$$Unknown);
                        } else {
                            html_princ($str166$___);
                        }




        return NIL;
    }

    /**
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS as an alist.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the bindings for SELECTED-VARIABLES of BINDINGS as an alist.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nBindings are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the bindings for SELECTED-VARIABLES of BINDINGS as an alist.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nBindings are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static final SubLObject cb_show_bindings_alt(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        html_princ($str_alt129$_);
        if ($ALL == selected_variables) {
            {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    if (binding != v_bindings.first()) {
                        html_indent(UNPROVIDED);
                    }
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding(binding);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
            }
        } else {
            {
                SubLObject some_binding_shownP = NIL;
                SubLObject cdolist_list_var = selected_variables;
                SubLObject selected_variable = NIL;
                for (selected_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , selected_variable = cdolist_list_var.first()) {
                    {
                        SubLObject binding = bindings.get_variable_binding(selected_variable, v_bindings);
                        if (NIL != binding) {
                            if (NIL != some_binding_shownP) {
                                html_indent(UNPROVIDED);
                            } else {
                                some_binding_shownP = T;
                            }
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding(binding);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                    }
                }
            }
        }
        html_princ($str_alt72$_);
        return NIL;
    }

    /**
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS as an alist.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the bindings for SELECTED-VARIABLES of BINDINGS as an alist.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nBindings are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the bindings for SELECTED-VARIABLES of BINDINGS as an alist.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nBindings are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static SubLObject cb_show_bindings(final SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        html_princ($str168$_);
        if ($ALL == selected_variables) {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!binding.eql(v_bindings.first())) {
                    html_indent(UNPROVIDED);
                }
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_show_binding(binding);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
        } else {
            SubLObject some_binding_shownP = NIL;
            SubLObject cdolist_list_var2 = selected_variables;
            SubLObject selected_variable = NIL;
            selected_variable = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject binding2 = bindings.get_variable_binding(selected_variable, v_bindings);
                if (NIL != binding2) {
                    if (NIL != some_binding_shownP) {
                        html_indent(UNPROVIDED);
                    } else {
                        some_binding_shownP = T;
                    }
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_show_binding(binding2);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                selected_variable = cdolist_list_var2.first();
            } 
        }
        html_princ($str77$_);
        return NIL;
    }

    public static final SubLObject cb_show_binding_alt(SubLObject binding) {
        {
            SubLObject datum = binding;
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt130);
            variable = current.first();
            current = current.rest();
            value = current;
            html_princ($str_alt129$_);
            cb_form(variable, UNPROVIDED, UNPROVIDED);
            html_princ($str_alt131$___);
            cb_form(value, UNPROVIDED, UNPROVIDED);
            html_princ($str_alt72$_);
        }
        return binding;
    }

    public static SubLObject cb_show_binding(final SubLObject binding) {
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list169);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        html_princ($str168$_);
        cb_show_term(variable, UNPROVIDED, UNPROVIDED);
        html_princ($str170$___);
        cb_show_term(value, UNPROVIDED, UNPROVIDED);
        html_princ($str77$_);
        return binding;
    }

    /**
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nBindings are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nBindings are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static final SubLObject cb_show_bindings_vertical_alt(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
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
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
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
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if ($ALL == selected_variables) {
                        {
                            SubLObject cdolist_list_var = v_bindings;
                            SubLObject binding = NIL;
                            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding_vertical(binding);
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = selected_variables;
                            SubLObject selected_variable = NIL;
                            for (selected_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , selected_variable = cdolist_list_var.first()) {
                                {
                                    SubLObject binding = bindings.get_variable_binding(selected_variable, v_bindings);
                                    if (NIL != binding) {
                                        com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding_vertical(binding);
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
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nBindings are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nBindings are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static SubLObject cb_show_bindings_vertical(final SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                    final SubLObject binding2 = bindings.get_variable_binding(selected_variable, v_bindings);
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
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_show_binding_vertical_alt(SubLObject binding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = binding;
                SubLObject current = datum;
                SubLObject variable = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt130);
                variable = current.first();
                current = current.rest();
                value = current;
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($RIGHT));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(variable);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                                html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form(value, ZERO_INTEGER, T);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return binding;
        }
    }

    public static SubLObject cb_show_binding_vertical(final SubLObject binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list169);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($RIGHT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_show_term(variable, ZERO_INTEGER, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_glyph($NBSP, UNPROVIDED);
                html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
                html_glyph($NBSP, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_show_term(value, ZERO_INTEGER, T);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return binding;
    }

    /**
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a horizontal table.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a horizontal table.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nBindings are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the bindings for SELECTED-VARIABLES of BINDINGS in a horizontal table.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nBindings are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static final SubLObject cb_show_bindings_horizontal_alt(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
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
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(FOUR_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_bindings_horizontal_variable_row(selected_variables, v_bindings, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_bindings_horizontal_value_row(v_bindings, selected_variables);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a horizontal table.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a horizontal table.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nBindings are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the bindings for SELECTED-VARIABLES of BINDINGS in a horizontal table.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nBindings are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static SubLObject cb_show_bindings_horizontal(final SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(FOUR_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_show_bindings_horizontal_variable_row(selected_variables, v_bindings, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_show_bindings_horizontal_value_row(v_bindings, selected_variables);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * SHOW the variables for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Variables are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the variables for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nVariables are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the variables for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nVariables are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static final SubLObject cb_show_bindings_horizontal_variable_row_alt(SubLObject selected_variables, SubLObject v_bindings, SubLObject strongP) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (strongP == UNPROVIDED) {
            strongP = NIL;
        }
        if ($ALL == selected_variables) {
            {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding_variable_horizontal(bindings.variable_binding_variable(binding), strongP);
                }
            }
        } else {
            {
                SubLObject cdolist_list_var = selected_variables;
                SubLObject selected_variable = NIL;
                for (selected_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , selected_variable = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding_variable_horizontal(selected_variable, strongP);
                }
            }
        }
        return NIL;
    }

    /**
     * SHOW the variables for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Variables are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the variables for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nVariables are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the variables for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nVariables are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static SubLObject cb_show_bindings_horizontal_variable_row(final SubLObject selected_variables, SubLObject v_bindings, SubLObject strongP) {
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

    /**
     * SHOW the values for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Values for variables are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the values for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nValues for variables are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the values for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nValues for variables are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static final SubLObject cb_show_bindings_horizontal_value_row_alt(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        if ($ALL == selected_variables) {
            {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding_value_horizontal(bindings.variable_binding_value(binding));
                }
            }
        } else {
            {
                SubLObject cdolist_list_var = selected_variables;
                SubLObject selected_variable = NIL;
                for (selected_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , selected_variable = cdolist_list_var.first()) {
                    {
                        SubLObject binding = bindings.get_variable_binding(selected_variable, v_bindings);
                        if (NIL != binding) {
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_binding_value_horizontal(bindings.variable_binding_value(binding));
                        } else {
                            com.cyc.cycjava.cycl.inference.browser.cb_query_browser.cb_show_missing_binding_value_horizontal();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * SHOW the values for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Values for variables are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    @LispMethod(comment = "SHOW the values for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\r\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\r\nValues for variables are shown in the order given by SELECTED-VARIABLES.\r\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.\nSHOW the values for SELECTED-VARIABLES of BINDINGS as table elements within a horizontal row.\nSELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .\nValues for variables are shown in the order given by SELECTED-VARIABLES.\nIf SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.")
    public static SubLObject cb_show_bindings_horizontal_value_row(final SubLObject v_bindings, SubLObject selected_variables) {
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
                final SubLObject binding2 = bindings.get_variable_binding(selected_variable, v_bindings);
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

    public static final SubLObject cb_show_binding_variable_horizontal_alt(SubLObject variable, SubLObject strongP) {
        if (strongP == UNPROVIDED) {
            strongP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != strongP) {
                        html_princ_strong(variable);
                    } else {
                        html_princ(variable);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return variable;
        }
    }

    public static SubLObject cb_show_binding_variable_horizontal(final SubLObject variable, SubLObject strongP) {
        if (strongP == UNPROVIDED) {
            strongP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($LEFT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != strongP) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_show_term(variable, ZERO_INTEGER, NIL);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } else {
                cb_show_term(variable, ZERO_INTEGER, NIL);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        return variable;
    }

    public static final SubLObject cb_show_binding_value_horizontal_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_form(value, ZERO_INTEGER, T);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return value;
        }
    }

    public static SubLObject cb_show_binding_value_horizontal(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($LEFT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != $cb_show_inference_results_in_nlP$.getDynamicValue(thread)) {
                cb_show_term_in_nl(value, UNPROVIDED);
            } else {
                cb_show_term(value, ZERO_INTEGER, T);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return value;
    }

    public static final SubLObject cb_show_missing_binding_value_horizontal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_show_missing_binding_value_horizontal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($LEFT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_indent(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_variable_map_horizontal_alt(SubLObject variable_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
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
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = variable_map;
                                SubLObject variable_map_binding = NIL;
                                for (variable_map_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_map_binding = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = variable_map_binding;
                                        SubLObject current = datum;
                                        SubLObject from_variable = NIL;
                                        SubLObject to_variable = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt136);
                                        from_variable = current.first();
                                        current = current.rest();
                                        to_variable = current;
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($CENTER));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ(to_variable);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = variable_map;
                                SubLObject variable_map_binding = NIL;
                                for (variable_map_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_map_binding = cdolist_list_var.first()) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($CENTER));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_glyph($UPWARDS_ARROW, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = variable_map;
                                SubLObject variable_map_binding = NIL;
                                for (variable_map_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_map_binding = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = variable_map_binding;
                                        SubLObject current = datum;
                                        SubLObject from_variable = NIL;
                                        SubLObject to_variable = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt136);
                                        from_variable = current.first();
                                        current = current.rest();
                                        to_variable = current;
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($CENTER));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ(from_variable);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_variable_map_horizontal(final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject variable_map_binding = NIL;
                SubLObject index = NIL;
                list_var = variable_map;
                variable_map_binding = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , variable_map_binding = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    SubLObject current;
                    final SubLObject datum = current = variable_map_binding;
                    SubLObject from_variable = NIL;
                    SubLObject to_variable = NIL;
                    destructuring_bind_must_consp(current, datum, $list175);
                    from_variable = current.first();
                    current = to_variable = current.rest();
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form(to_variable, ZERO_INTEGER, NIL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject variable_map_binding = NIL;
                SubLObject index = NIL;
                list_var = variable_map;
                variable_map_binding = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , variable_map_binding = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($UPWARDS_ARROW, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject variable_map_binding = NIL;
                SubLObject index = NIL;
                list_var = variable_map;
                variable_map_binding = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , variable_map_binding = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    SubLObject current;
                    final SubLObject datum = current = variable_map_binding;
                    SubLObject from_variable = NIL;
                    SubLObject to_variable = NIL;
                    destructuring_bind_must_consp(current, datum, $list175);
                    from_variable = current.first();
                    current = to_variable = current.rest();
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form(from_variable, ZERO_INTEGER, NIL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Mt__ = makeString("Mt :");

    static private final SubLString $str_alt1$EL_Query__ = makeString("EL Query :");

    static private final SubLString $str_alt2$Pragmatics__ = makeString("Pragmatics :");

    static private final SubLString $str_alt21$Ill_Formed = makeString("Ill-Formed");

    static private final SubLList $list_alt41 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("ANSWER-ID-STRING"));

    static private final SubLString $str_alt42$_A_did_not_specify_an_inference_a = makeString("~A did not specify an inference answer");

    static private final SubLString $str_alt47$__A__A__A_ = makeString("[~A.~A.~A]");

    static private final SubLString $str_alt48$_Inference_Answer__A__A__A_ = makeString("[Inference Answer ~A.~A.~A]");

    static private final SubLString $str_alt50$_Inference_Answer__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A ~A]");

    static private final SubLString $str_alt51$cb_inference_answer__A__A__A = makeString("cb-inference-answer&~A&~A&~A");

    static private final SubLString $str_alt56$_for_ = makeString(" for ");

    static private final SubLString $str_alt58$_in_ = makeString(" in ");

    static private final SubLString $str_alt61$_Socratic_Query_ = makeString("[Socratic Query]");

    private static final SubLSymbol $UIA_JUSTIFICATION_BROWSER_EXTERNAL = makeKeyword("UIA-JUSTIFICATION-BROWSER-EXTERNAL");

    static private final SubLString $str_alt63$_Browse_in_UIA_ = makeString("[Browse in UIA]");

    static private final SubLString $str_alt64$Creation_Time____ = makeString("Creation Time :  ");

    static private final SubLString $str_alt65$Steps_to_This_Answer____ = makeString("Steps to This Answer :  ");

    static private final SubLString $str_alt66$Answer_Bindings__ = makeString("Answer Bindings :");

    static private final SubLString $str_alt67$Justifications__ = makeString("Justifications :");

    static private final SubLString $str_alt69$_Full_ = makeString("[Full]");

    static private final SubLString $str_alt71$__at_ = makeString(" (at ");

    static private final SubLString $str_alt72$_ = makeString(")");

    static private final SubLString $str_alt74$_today = makeString(" today");

    static private final SubLString $str_alt75$_on__A = makeString(" on ~A");

    static private final SubLString $str_alt78$cb_socratic_query_from_answer__A_ = makeString("cb-socratic-query-from-answer&~A&~A&~A");

    static private final SubLList $list_alt80 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("ANSWER-ID-STRING"), makeSymbol("JUSTIFICATION-ID-STRING"));

    static private final SubLString $str_alt81$_A_did_not_specify_an_inference_a = makeString("~A did not specify an inference answer justification");

    static private final SubLString $str_alt83$__A__A__A__A_ = makeString("[~A.~A.~A.~A]");

    static private final SubLString $str_alt84$_Inference_Answer__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A.~A]");

    static private final SubLString $str_alt85$_Inference_Answer__A__A__A__A__A_ = makeString("[Inference Answer ~A.~A.~A.~A ~A]");

    static private final SubLString $str_alt86$cb_inference_answer_full_justific = makeString("cb-inference-answer-full-justification&~A&~A&~A&~A");

    static private final SubLString $str_alt88$Inference_Answer_Full_Justificati = makeString("Inference Answer Full Justification");

    static private final SubLString $str_alt89$_for_answer_ = makeString(" for answer ");

    static private final SubLString $str_alt90$Full_Justification__ = makeString("Full Justification :");

    static private final SubLString $str_alt93$Proofs__ = makeString("Proofs :");

    static private final SubLString $str_alt102$_Explain_ = makeString("[Explain]");

    static private final SubLString $str_alt103$_Explain___A_ = makeString("[Explain #~A]");

    static private final SubLString $str_alt109$Old_answer_with_a_new_justificati = makeString("Old answer with a new justification");

    static private final SubLString $str_alt110$_ = makeString("*");

    static private final SubLSymbol $sym114$_ = makeSymbol(">");

    static private final SubLString $str_alt116$Weighing_these_arguments_yields_a = makeString("Weighing these arguments yields an overall result of: ");

    static private final SubLString $str_alt118$True__default_ = makeString("True (default)");

    static private final SubLString $str_alt120$True__monotonic_ = makeString("True (monotonic)");

    static private final SubLString $str_alt122$False__default_ = makeString("False (default)");

    static private final SubLString $str_alt124$False__monotonic_ = makeString("False (monotonic)");

    static private final SubLString $str_alt127$___ = makeString("???");

    static private final SubLString $str_alt129$_ = makeString("(");

    static private final SubLList $list_alt130 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    static private final SubLString $str_alt131$___ = makeString(" . ");

    static private final SubLList $list_alt136 = cons(makeSymbol("FROM-VARIABLE"), makeSymbol("TO-VARIABLE"));

    public static SubLObject declare_cb_query_browser_file() {
        declareFunction("cb_show_inference_el_query", "CB-SHOW-INFERENCE-EL-QUERY", 1, 1, false);
        declareFunction("cb_show_inference_status", "CB-SHOW-INFERENCE-STATUS", 1, 0, false);
        declareFunction("cb_show_inference_suspend_status", "CB-SHOW-INFERENCE-SUSPEND-STATUS", 1, 0, false);
        declareFunction("cb_inference_answer", "CB-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("cb_link_inference_answer", "CB-LINK-INFERENCE-ANSWER", 1, 3, false);
        declareFunction("cb_form_inference_answer_method", "CB-FORM-INFERENCE-ANSWER-METHOD", 1, 2, false);
        declareFunction("cb_guess_inference_answer", "CB-GUESS-INFERENCE-ANSWER", 3, 0, false);
        declareFunction("cb_show_inference_answer_bindings", "CB-SHOW-INFERENCE-ANSWER-BINDINGS", 2, 0, false);
        declareFunction("cb_show_inference_answer_summary", "CB-SHOW-INFERENCE-ANSWER-SUMMARY", 1, 0, false);
        declareFunction("cb_inference_answer_guts", "CB-INFERENCE-ANSWER-GUTS", 1, 0, false);
        declareFunction("cb_show_inference_answer_creation_time", "CB-SHOW-INFERENCE-ANSWER-CREATION-TIME", 1, 0, false);
        declareFunction("cb_show_universal_time", "CB-SHOW-UNIVERSAL-TIME", 0, 1, false);
        declareFunction("cb_show_inference_answer_step_count", "CB-SHOW-INFERENCE-ANSWER-STEP-COUNT", 1, 0, false);
        declareFunction("cb_socratic_query_from_answer", "CB-SOCRATIC-QUERY-FROM-ANSWER", 1, 0, false);
        declareFunction("cb_link_socratic_query_from_answer", "CB-LINK-SOCRATIC-QUERY-FROM-ANSWER", 1, 1, false);
        declareFunction("cb_inference_answer_full_justification", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 0, false);
        declareFunction("cb_link_inference_answer_full_justification", "CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 3, false);
        declareFunction("inference_answer_justification_suid", "INFERENCE-ANSWER-JUSTIFICATION-SUID", 1, 0, false);
        declareFunction("cb_guess_inference_answer_justification", "CB-GUESS-INFERENCE-ANSWER-JUSTIFICATION", 4, 0, false);
        declareFunction("cb_inference_answer_full_justification_guts", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION-GUTS", 1, 0, false);
        declareFunction("cb_show_inference_answer_justification", "CB-SHOW-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction("cb_inference_fancy_table_js", "CB-INFERENCE-FANCY-TABLE-JS", 2, 0, false);
        declareFunction("cb_inference_fancy_table_all_answers_js", "CB-INFERENCE-FANCY-TABLE-ALL-ANSWERS-JS", 1, 0, false);
        declareFunction("cb_show_fully_bound_answer", "CB-SHOW-FULLY-BOUND-ANSWER", 4, 0, false);
        declareFunction("cb_show_streamed_inference_answer_section", "CB-SHOW-STREAMED-INFERENCE-ANSWER-SECTION", 2, 0, false);
        declareFunction("cb_show_inference_answer_section", "CB-SHOW-INFERENCE-ANSWER-SECTION", 2, 0, false);
        declareFunction("cb_show_inference_answer_section_answer_number", "CB-SHOW-INFERENCE-ANSWER-SECTION-ANSWER-NUMBER", 3, 0, false);
        declareFunction("cb_show_normal_inference_answer_justification_button", "CB-SHOW-NORMAL-INFERENCE-ANSWER-JUSTIFICATION-BUTTON", 3, 0, false);
        declareFunction("cb_determine_inference_answer_newness", "CB-DETERMINE-INFERENCE-ANSWER-NEWNESS", 2, 0, false);
        declareFunction("cb_show_inference_answer_newness_token", "CB-SHOW-INFERENCE-ANSWER-NEWNESS-TOKEN", 1, 0, false);
        declareFunction("cb_inference_answer_has_new_justificationP", "CB-INFERENCE-ANSWER-HAS-NEW-JUSTIFICATION?", 2, 0, false);
        declareFunction("cb_determine_inference_answer_bgcolor", "CB-DETERMINE-INFERENCE-ANSWER-BGCOLOR", 1, 0, false);
        declareFunction("cb_inference_current_answers", "CB-INFERENCE-CURRENT-ANSWERS", 1, 0, false);
        declareFunction("cb_show_inference_answer_section_bindings", "CB-SHOW-INFERENCE-ANSWER-SECTION-BINDINGS", 2, 0, false);
        declareFunction("cb_show_argumentation_result", "CB-SHOW-ARGUMENTATION-RESULT", 1, 0, false);
        declareFunction("cb_show_tv", "CB-SHOW-TV", 1, 0, false);
        declareFunction("cb_show_bindings", "CB-SHOW-BINDINGS", 1, 1, false);
        declareFunction("cb_show_binding", "CB-SHOW-BINDING", 1, 0, false);
        declareFunction("cb_show_bindings_vertical", "CB-SHOW-BINDINGS-VERTICAL", 1, 1, false);
        declareFunction("cb_show_binding_vertical", "CB-SHOW-BINDING-VERTICAL", 1, 0, false);
        declareFunction("cb_show_bindings_horizontal", "CB-SHOW-BINDINGS-HORIZONTAL", 1, 1, false);
        declareFunction("cb_show_bindings_horizontal_variable_row", "CB-SHOW-BINDINGS-HORIZONTAL-VARIABLE-ROW", 1, 2, false);
        declareFunction("cb_show_bindings_horizontal_value_row", "CB-SHOW-BINDINGS-HORIZONTAL-VALUE-ROW", 1, 1, false);
        declareFunction("cb_show_binding_variable_horizontal", "CB-SHOW-BINDING-VARIABLE-HORIZONTAL", 1, 1, false);
        declareFunction("cb_show_binding_value_horizontal", "CB-SHOW-BINDING-VALUE-HORIZONTAL", 1, 0, false);
        declareFunction("cb_show_missing_binding_value_horizontal", "CB-SHOW-MISSING-BINDING-VALUE-HORIZONTAL", 0, 0, false);
        declareFunction("cb_variable_map_horizontal", "CB-VARIABLE-MAP-HORIZONTAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_query_browser_file() {
        defparameter("*CB-INFERENCE-BROWSER-SHOW-ANSWER-MAX-FLOOR-MTS?*", NIL);
        defparameter("*CB-SHOW-INFERENCE-RESULTS-IN-NL?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_query_browser_file_alt() {
        html_macros.note_html_handler_function(CB_INFERENCE_ANSWER);
        setup_cb_link_method($INFERENCE_ANSWER, CB_LINK_INFERENCE_ANSWER, FOUR_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), symbol_function(CB_FORM_INFERENCE_ANSWER_METHOD));
        html_macros.note_html_handler_function(CB_SOCRATIC_QUERY_FROM_ANSWER);
        setup_cb_link_method($SOCRATIC_QUERY_FROM_ANSWER, CB_LINK_SOCRATIC_QUERY_FROM_ANSWER, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_INFERENCE_ANSWER_FULL_JUSTIFICATION);
        setup_cb_link_method($INFERENCE_ANSWER_FULL_JUSTIFICATION, CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION, FOUR_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_query_browser_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(CB_INFERENCE_ANSWER, $HTML_HANDLER);
            setup_cb_link_method($INFERENCE_ANSWER, CB_LINK_INFERENCE_ANSWER, FOUR_INTEGER);
            register_method($cb_form_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), symbol_function(CB_FORM_INFERENCE_ANSWER_METHOD));
            html_macros.note_cgi_handler_function(CB_SOCRATIC_QUERY_FROM_ANSWER, $HTML_HANDLER);
            setup_cb_link_method($SOCRATIC_QUERY_FROM_ANSWER, CB_LINK_SOCRATIC_QUERY_FROM_ANSWER, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_INFERENCE_ANSWER_FULL_JUSTIFICATION, $HTML_HANDLER);
            setup_cb_link_method($INFERENCE_ANSWER_FULL_JUSTIFICATION, CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION, FOUR_INTEGER);
            register_html_state_variable($cb_show_inference_results_in_nlP$);
            register_html_interface_variable($cb_show_inference_results_in_nlP$);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_INFERENCE_ANSWER);
            html_macros.note_html_handler_function(CB_SOCRATIC_QUERY_FROM_ANSWER);
            html_macros.note_html_handler_function(CB_INFERENCE_ANSWER_FULL_JUSTIFICATION);
        }
        return NIL;
    }

    public static SubLObject setup_cb_query_browser_file_Previous() {
        html_macros.note_cgi_handler_function(CB_INFERENCE_ANSWER, $HTML_HANDLER);
        setup_cb_link_method($INFERENCE_ANSWER, CB_LINK_INFERENCE_ANSWER, FOUR_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), symbol_function(CB_FORM_INFERENCE_ANSWER_METHOD));
        html_macros.note_cgi_handler_function(CB_SOCRATIC_QUERY_FROM_ANSWER, $HTML_HANDLER);
        setup_cb_link_method($SOCRATIC_QUERY_FROM_ANSWER, CB_LINK_SOCRATIC_QUERY_FROM_ANSWER, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_ANSWER_FULL_JUSTIFICATION, $HTML_HANDLER);
        setup_cb_link_method($INFERENCE_ANSWER_FULL_JUSTIFICATION, CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION, FOUR_INTEGER);
        register_html_state_variable($cb_show_inference_results_in_nlP$);
        register_html_interface_variable($cb_show_inference_results_in_nlP$);
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
    }
}

/**
 * Total time: 739 ms
 */
