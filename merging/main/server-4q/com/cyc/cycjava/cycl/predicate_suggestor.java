/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_show_enhanced_tables$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.optimize_el_formula_variable_names;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
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
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 * module:      PREDICATE-SUGGESTOR
 * source file: /cyc/top/cycl/predicate-suggestor.lisp
 * created:     2019/07/03 17:39:04
 */
public final class predicate_suggestor extends SubLTranslatedFile implements V12 {
    public static final SubLObject cb_link_get_suggested_followups(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt39$_Followup_Term_Suggestion_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt41$get_suggested_followups);
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

    public static final SubLFile me = new predicate_suggestor();

 public static final String myName = "com.cyc.cycjava.cycl.predicate_suggestor";


    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fts_expert_term_coll$ = makeSymbol("*FTS-EXPERT-TERM-COLL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $fts_expert_terms$ = makeSymbol("*FTS-EXPERT-TERMS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fts_excluded_term_coll$ = makeSymbol("*FTS-EXCLUDED-TERM-COLL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $fts_excluded_terms$ = makeSymbol("*FTS-EXCLUDED-TERMS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $suggested_predicate_sort_types$ = makeSymbol("*SUGGESTED-PREDICATE-SORT-TYPES*");

    static private final SubLSymbol $sym1$_ = makeSymbol(">");

    public static final SubLSymbol $fts_antecedent_index$ = makeSymbol("*FTS-ANTECEDENT-INDEX*");

    public static final SubLSymbol $fts_consequent_index$ = makeSymbol("*FTS-CONSEQUENT-INDEX*");

    public static final SubLSymbol $fts_joint_antecedent_index$ = makeSymbol("*FTS-JOINT-ANTECEDENT-INDEX*");



    private static final SubLInteger $int$5000 = makeInteger(5000);





    private static final SubLInteger $int$6000 = makeInteger(6000);

    static private final SubLString $str11$Initializing_predicate_connectivi = makeString("Initializing predicate connectivity from KB rules");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list13 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str16$_A = makeString("~A");





    private static final SubLString $str20$Initializing_predicate_connectivi = makeString("Initializing predicate connectivity from rule macro predicate GAFs");

    private static final SubLSymbol $sym23$FTS_UNUSABLE_TERM_ = makeSymbol("FTS-UNUSABLE-TERM?");

    private static final SubLSymbol $sym25$STRING_LENGTH__ = makeSymbol("STRING-LENGTH-<");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol LIST_OF_FORT_P = makeSymbol("LIST-OF-FORT-P");

    private static final SubLString $str35$Bad_sort_type__S_ = makeString("Bad sort-type ~S!");

    private static final SubLSymbol $sym36$FTS_EXPERT_TERM_ = makeSymbol("FTS-EXPERT-TERM?");

    private static final SubLSymbol LIST_OF_PREDICATES_P = makeSymbol("LIST-OF-PREDICATES-P");

    private static final SubLList $list39 = list(makeKeyword("INTERSECT"), makeKeyword("OCCURRENCES"), makeKeyword("LENGTH"), makeKeyword("INTERSECT-COMPLEX"), $BEST);

    private static final SubLSymbol CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES = makeSymbol("CREATE-SUGGESTED-PREDICATE-SENTENCES-FOR-PREDICATES");

    private static final SubLSymbol CREATE_SENTENCES_FOR_PREDICATES = makeSymbol("CREATE-SENTENCES-FOR-PREDICATES");

    private static final SubLSymbol GET_SUGGESTED_FOLLOWUPS = makeSymbol("GET-SUGGESTED-FOLLOWUPS");

    private static final SubLString $$$Followup_Term_Suggestion = makeString("Followup Term Suggestion");

    private static final SubLString $str45$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str46$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    static private final SubLString $str51$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str57$handle_get_followup_suggestions = makeString("handle-get-followup-suggestions");

    private static final SubLString $str58$Enter_constants_separated_by_whit = makeString("Enter constants separated by whitespace: ");

    private static final SubLString $$$terms = makeString("terms");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $$$Cyclify = makeString("Cyclify");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str65$Maximum_number_of_results__ = makeString("Maximum number of results: ");

    private static final SubLString $$$cap = makeString("cap");



    private static final SubLString $str69$Allow_non_predicate_outputs__ = makeString("Allow non-predicate outputs: ");

    private static final SubLString $str70$allow_non_preds = makeString("allow-non-preds");

    private static final SubLString $str71$Show_expert_level_terms__ = makeString("Show expert-level terms: ");

    private static final SubLString $$$expert = makeString("expert");

    private static final SubLString $str74$50_ = makeString("50%");

    private static final SubLString $str78$Error_reading_terms___Check_for_t = makeString("Error reading terms.  Check for typos.");

    private static final SubLString $str79$No_usable_input_constants_ = makeString("No usable input constants.");

    private static final SubLString $$$Terms_related_to_ = makeString("Terms related to ");

    private static final SubLSymbol HANDLE_GET_FOLLOWUP_SUGGESTIONS = makeSymbol("HANDLE-GET-FOLLOWUP-SUGGESTIONS");

    // Definitions
    /**
     *
     *
     * @param dict:
    dictionary-p
     * 		
     * @return listp
    Sorts the dictionary by value, then returns the keys.
     */
    @LispMethod(comment = "@param dict:\ndictionary-p\r\n\t\t\r\n@return listp\r\nSorts the dictionary by value, then returns the keys.")
    public static final SubLObject get_term_values_from_dict_alt(SubLObject dict) {
        return Mapping.mapcar(symbol_function(CAR), dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym1$_)));
    }

    // Definitions
    /**
     *
     *
     * @param dict:
    dictionary-p
     * 		
     * @return listp
    Sorts the dictionary by value, then returns the keys.
     */
    @LispMethod(comment = "@param dict:\ndictionary-p\r\n\t\t\r\n@return listp\r\nSorts the dictionary by value, then returns the keys.")
    public static SubLObject get_term_values_from_dict(final SubLObject dict) {
        return Mapping.mapcar(symbol_function(CAR), dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym1$_)));
    }

    /**
     *
     *
     * @param SEQ:
    listp
     * 		
     * @return alist
    Given a list of objects, return an alist where the keys are the number
    of occurrences and the values are the occurring thing.
    Ex: (counted-alist-from-list '(#$spouse #$husband #$spouse #$wife)) =>
    ((1 . #$wife) (1 . #$husband) (2 . #$spouse))
     */
    @LispMethod(comment = "@param SEQ:\nlistp\r\n\t\t\r\n@return alist\r\nGiven a list of objects, return an alist where the keys are the number\r\nof occurrences and the values are the occurring thing.\r\nEx: (counted-alist-from-list \'(#$spouse #$husband #$spouse #$wife)) =>\r\n((1 . #$wife) (1 . #$husband) (2 . #$spouse))")
    public static final SubLObject counted_alist_from_list_alt(SubLObject seq) {
        SubLTrampolineFile.checkType(seq, LISTP);
        {
            SubLObject retlist = NIL;
            SubLObject modified_seq = remove_duplicates(seq, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = modified_seq;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                retlist = acons(elem, count(elem, seq, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), retlist);
            }
            return retlist;
        }
    }

    /**
     *
     *
     * @param SEQ:
    listp
     * 		
     * @return alist
    Given a list of objects, return an alist where the keys are the number
    of occurrences and the values are the occurring thing.
    Ex: (counted-alist-from-list '(#$spouse #$husband #$spouse #$wife)) =>
    ((1 . #$wife) (1 . #$husband) (2 . #$spouse))
     */
    @LispMethod(comment = "@param SEQ:\nlistp\r\n\t\t\r\n@return alist\r\nGiven a list of objects, return an alist where the keys are the number\r\nof occurrences and the values are the occurring thing.\r\nEx: (counted-alist-from-list \'(#$spouse #$husband #$spouse #$wife)) =>\r\n((1 . #$wife) (1 . #$husband) (2 . #$spouse))")
    public static SubLObject counted_alist_from_list(final SubLObject seq) {
        assert NIL != listp(seq) : "! listp(seq) " + ("Types.listp(seq) " + "CommonSymbols.NIL != Types.listp(seq) ") + seq;
        SubLObject retlist = NIL;
        SubLObject cdolist_list_var;
        final SubLObject modified_seq = cdolist_list_var = remove_duplicates(seq, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            retlist = acons(elem, count(elem, seq, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), retlist);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return retlist;
    }

    /**
     *
     *
     * @param SEQ:
    listp
     * 		
     * @return listp
    Given a list of objects, return the same list, duplicates removed, sorted
    by the number of times something occurs.
    Ex: (sort-list-by-count '(#$spouse #$husband #$spouse #$wife))
    =>
    (#$spouse #$wife #$husband)
     */
    @LispMethod(comment = "@param SEQ:\nlistp\r\n\t\t\r\n@return listp\r\nGiven a list of objects, return the same list, duplicates removed, sorted\r\nby the number of times something occurs.\r\nEx: (sort-list-by-count \'(#$spouse #$husband #$spouse #$wife))\r\n=>\r\n(#$spouse #$wife #$husband)")
    public static final SubLObject sort_list_by_count_alt(SubLObject seq) {
        SubLTrampolineFile.checkType(seq, LISTP);
        return Mapping.mapcar(symbol_function(CAR), list_utilities.sort_alist_by_values(com.cyc.cycjava.cycl.predicate_suggestor.counted_alist_from_list(seq), symbol_function($sym1$_)));
    }

    /**
     *
     *
     * @param SEQ:
    listp
     * 		
     * @return listp
    Given a list of objects, return the same list, duplicates removed, sorted
    by the number of times something occurs.
    Ex: (sort-list-by-count '(#$spouse #$husband #$spouse #$wife))
    =>
    (#$spouse #$wife #$husband)
     */
    @LispMethod(comment = "@param SEQ:\nlistp\r\n\t\t\r\n@return listp\r\nGiven a list of objects, return the same list, duplicates removed, sorted\r\nby the number of times something occurs.\r\nEx: (sort-list-by-count \'(#$spouse #$husband #$spouse #$wife))\r\n=>\r\n(#$spouse #$wife #$husband)")
    public static SubLObject sort_list_by_count(final SubLObject seq) {
        assert NIL != listp(seq) : "! listp(seq) " + ("Types.listp(seq) " + "CommonSymbols.NIL != Types.listp(seq) ") + seq;
        return Mapping.mapcar(symbol_function(CAR), list_utilities.sort_alist_by_values(counted_alist_from_list(seq), symbol_function($sym1$_)));
    }

    public static final SubLObject fts_init_index_alt() {
        return forts.new_fort_id_index();
    }

    public static SubLObject fts_init_index() {
        return forts.new_fort_id_index();
    }

    public static final SubLObject fts_term_antecedents_raw_alt(SubLObject v_term) {
        return forts.fort_id_index_lookup($fts_antecedent_index$.getGlobalValue(), v_term);
    }

    public static SubLObject fts_term_antecedents_raw(final SubLObject v_term) {
        return forts.fort_id_index_lookup($fts_antecedent_index$.getGlobalValue(), v_term);
    }

    public static final SubLObject fts_term_consequents_raw_alt(SubLObject v_term) {
        return forts.fort_id_index_lookup($fts_consequent_index$.getGlobalValue(), v_term);
    }

    public static SubLObject fts_term_consequents_raw(final SubLObject v_term) {
        return forts.fort_id_index_lookup($fts_consequent_index$.getGlobalValue(), v_term);
    }

    public static final SubLObject fts_term_joint_antecedents_raw_alt(SubLObject v_term) {
        return forts.fort_id_index_lookup($fts_joint_antecedent_index$.getGlobalValue(), v_term);
    }

    public static SubLObject fts_term_joint_antecedents_raw(final SubLObject v_term) {
        return forts.fort_id_index_lookup($fts_joint_antecedent_index$.getGlobalValue(), v_term);
    }

    public static final SubLObject fts_term_antecedents_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_term_element_list(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_antecedents_raw(v_term));
    }

    public static SubLObject fts_term_antecedents(final SubLObject v_term) {
        return fts_term_element_list(fts_term_antecedents_raw(v_term));
    }

    public static final SubLObject fts_term_consequents_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_term_element_list(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_consequents_raw(v_term));
    }

    public static SubLObject fts_term_consequents(final SubLObject v_term) {
        return fts_term_element_list(fts_term_consequents_raw(v_term));
    }

    public static final SubLObject fts_term_joint_antecedents_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_term_element_list(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_joint_antecedents_raw(v_term));
    }

    public static SubLObject fts_term_joint_antecedents(final SubLObject v_term) {
        return fts_term_element_list(fts_term_joint_antecedents_raw(v_term));
    }

    public static final SubLObject fts_term_element_list_alt(SubLObject contents) {
        return NIL != bag.bag_p(contents) ? ((SubLObject) (bag.bag_element_list(contents))) : NIL;
    }

    public static SubLObject fts_term_element_list(final SubLObject contents) {
        return NIL != bag.bag_p(contents) ? bag.bag_element_list(contents) : NIL;
    }

    public static final SubLObject fts_term_antecedent_count_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_term_element_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_consequents_raw(v_term));
    }

    public static SubLObject fts_term_antecedent_count(final SubLObject v_term) {
        return fts_term_element_count(fts_term_consequents_raw(v_term));
    }

    public static final SubLObject fts_term_consequent_count_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_term_element_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_antecedents_raw(v_term));
    }

    public static SubLObject fts_term_consequent_count(final SubLObject v_term) {
        return fts_term_element_count(fts_term_antecedents_raw(v_term));
    }

    public static final SubLObject fts_term_joint_antecedent_count_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_term_element_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_joint_antecedents_raw(v_term));
    }

    public static SubLObject fts_term_joint_antecedent_count(final SubLObject v_term) {
        return fts_term_element_count(fts_term_joint_antecedents_raw(v_term));
    }

    public static final SubLObject fts_term_element_count_alt(SubLObject contents) {
        return NIL != bag.bag_p(contents) ? ((SubLObject) (bag.bag_size(contents))) : ZERO_INTEGER;
    }

    public static SubLObject fts_term_element_count(final SubLObject contents) {
        return NIL != bag.bag_p(contents) ? bag.bag_size(contents) : ZERO_INTEGER;
    }

    public static final SubLObject fts_antecedent_index_push_list_alt(SubLObject v_term, SubLObject term_list) {
        {
            SubLObject already_found_terms = com.cyc.cycjava.cycl.predicate_suggestor.fts_term_antecedents_raw(v_term);
            return forts.fort_id_index_enter($fts_antecedent_index$.getGlobalValue(), v_term, com.cyc.cycjava.cycl.predicate_suggestor.fts_update_entry_with_new_terms(already_found_terms, term_list));
        }
    }

    public static SubLObject fts_antecedent_index_push_list(final SubLObject v_term, final SubLObject term_list) {
        final SubLObject already_found_terms = fts_term_antecedents_raw(v_term);
        return forts.fort_id_index_enter($fts_antecedent_index$.getGlobalValue(), v_term, fts_update_entry_with_new_terms(already_found_terms, term_list));
    }

    public static final SubLObject fts_consequent_index_push_list_alt(SubLObject v_term, SubLObject term_list) {
        {
            SubLObject already_found_terms = com.cyc.cycjava.cycl.predicate_suggestor.fts_term_consequents_raw(v_term);
            return forts.fort_id_index_enter($fts_consequent_index$.getGlobalValue(), v_term, com.cyc.cycjava.cycl.predicate_suggestor.fts_update_entry_with_new_terms(already_found_terms, term_list));
        }
    }

    public static SubLObject fts_consequent_index_push_list(final SubLObject v_term, final SubLObject term_list) {
        final SubLObject already_found_terms = fts_term_consequents_raw(v_term);
        return forts.fort_id_index_enter($fts_consequent_index$.getGlobalValue(), v_term, fts_update_entry_with_new_terms(already_found_terms, term_list));
    }

    public static final SubLObject fts_joint_antecedent_index_push_list_alt(SubLObject v_term, SubLObject term_list) {
        {
            SubLObject already_found_terms = com.cyc.cycjava.cycl.predicate_suggestor.fts_term_antecedents_raw(v_term);
            return forts.fort_id_index_enter($fts_joint_antecedent_index$.getGlobalValue(), v_term, com.cyc.cycjava.cycl.predicate_suggestor.fts_update_entry_with_new_terms(already_found_terms, term_list));
        }
    }

    public static SubLObject fts_joint_antecedent_index_push_list(final SubLObject v_term, final SubLObject term_list) {
        final SubLObject already_found_terms = fts_term_antecedents_raw(v_term);
        return forts.fort_id_index_enter($fts_joint_antecedent_index$.getGlobalValue(), v_term, fts_update_entry_with_new_terms(already_found_terms, term_list));
    }

    public static final SubLObject fts_update_entry_with_new_terms_alt(SubLObject already_found_terms, SubLObject term_list) {
        if (NIL == bag.bag_p(already_found_terms)) {
            already_found_terms = bag.new_bag(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject cdolist_list_var = term_list;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                bag.bag_add(item, already_found_terms);
            }
        }
        return already_found_terms;
    }

    public static SubLObject fts_update_entry_with_new_terms(SubLObject already_found_terms, final SubLObject term_list) {
        if (NIL == bag.bag_p(already_found_terms)) {
            already_found_terms = bag.new_bag(UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = term_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            bag.bag_add(item, already_found_terms);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return already_found_terms;
    }

    /**
     *
     *
     * @param TERM:
    constant-p
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param TERM:\nconstant-p\r\n\t\t\r\n@return boolean")
    public static final SubLObject fts_expert_termP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (ZERO_INTEGER == keyhash.keyhash_count($fts_expert_terms$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = append(isa.all_fort_instances_in_all_mts($fts_expert_term_coll$.getGlobalValue()), isa.all_quoted_instances_in_all_mts($fts_expert_term_coll$.getGlobalValue()));
                    SubLObject expert_term = NIL;
                    for (expert_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expert_term = cdolist_list_var.first()) {
                        keyhash.setkeyhash(expert_term, $fts_expert_terms$.getDynamicValue(thread));
                    }
                }
            }
            return keyhash.getkeyhash(v_term, $fts_expert_terms$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @param TERM:
    constant-p
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param TERM:\nconstant-p\r\n\t\t\r\n@return boolean")
    public static SubLObject fts_expert_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ZERO_INTEGER.eql(keyhash.keyhash_count($fts_expert_terms$.getDynamicValue(thread)))) {
            SubLObject cdolist_list_var = append(isa.all_fort_instances_in_all_mts($fts_expert_term_coll$.getGlobalValue()), isa.all_quoted_instances_in_all_mts($fts_expert_term_coll$.getGlobalValue()));
            SubLObject expert_term = NIL;
            expert_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(expert_term, $fts_expert_terms$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                expert_term = cdolist_list_var.first();
            } 
        }
        return keyhash.getkeyhash(v_term, $fts_expert_terms$.getDynamicValue(thread));
    }

    public static final SubLObject fts_additional_excluded_terms_alt() {
        return kb_mapping_utilities.pred_refs_in_any_mt($$quotedCollection, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fts_additional_excluded_terms() {
        return kb_mapping_utilities.pred_refs_in_any_mt($$quotedCollection, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fts_excluded_termP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (ZERO_INTEGER == keyhash.keyhash_count($fts_excluded_terms$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = union(append(isa.all_fort_instances_in_all_mts($fts_excluded_term_coll$.getGlobalValue()), isa.all_quoted_instances_in_all_mts($fts_excluded_term_coll$.getGlobalValue())), com.cyc.cycjava.cycl.predicate_suggestor.fts_additional_excluded_terms(), UNPROVIDED, UNPROVIDED);
                    SubLObject excluded_term = NIL;
                    for (excluded_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , excluded_term = cdolist_list_var.first()) {
                        keyhash.setkeyhash(excluded_term, $fts_excluded_terms$.getDynamicValue(thread));
                    }
                }
            }
            return keyhash.getkeyhash(v_term, $fts_excluded_terms$.getDynamicValue(thread));
        }
    }

    public static SubLObject fts_excluded_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ZERO_INTEGER.eql(keyhash.keyhash_count($fts_excluded_terms$.getDynamicValue(thread)))) {
            SubLObject cdolist_list_var = union(append(isa.all_fort_instances_in_all_mts($fts_excluded_term_coll$.getGlobalValue()), isa.all_quoted_instances_in_all_mts($fts_excluded_term_coll$.getGlobalValue())), fts_additional_excluded_terms(), UNPROVIDED, UNPROVIDED);
            SubLObject excluded_term = NIL;
            excluded_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(excluded_term, $fts_excluded_terms$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                excluded_term = cdolist_list_var.first();
            } 
        }
        return keyhash.getkeyhash(v_term, $fts_excluded_terms$.getDynamicValue(thread));
    }

    public static final SubLObject fts_unusable_termP_alt(SubLObject v_term) {
        if (NIL != nart_handles.nart_p(v_term)) {
            return T;
        } else {
            if (NIL != cycl_utilities.non_indexed_fort_p(v_term)) {
                return T;
            } else {
                if (NIL != hl_supports.hl_predicate_p(v_term)) {
                    return T;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.predicate_suggestor.fts_excluded_termP(v_term)) {
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject fts_unusable_termP(final SubLObject v_term) {
        if (NIL != nart_handles.nart_p(v_term)) {
            return T;
        }
        if (NIL != cycl_utilities.non_indexed_fort_p(v_term)) {
            return T;
        }
        if (NIL != hl_supports.hl_predicate_p(v_term)) {
            return T;
        }
        if (NIL != fts_excluded_termP(v_term)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject rule_connectivity_graph_builtP_alt() {
        return makeBoolean((((((NIL != forts.fort_id_index_p($fts_antecedent_index$.getGlobalValue())) && (NIL == forts.fort_id_index_emptyP($fts_antecedent_index$.getGlobalValue()))) && (NIL != forts.fort_id_index_p($fts_consequent_index$.getGlobalValue()))) && (NIL == forts.fort_id_index_emptyP($fts_consequent_index$.getGlobalValue()))) && (NIL != forts.fort_id_index_p($fts_joint_antecedent_index$.getGlobalValue()))) && (NIL == forts.fort_id_index_emptyP($fts_joint_antecedent_index$.getGlobalValue())));
    }

    public static SubLObject rule_connectivity_graph_builtP() {
        return makeBoolean((((((NIL != forts.fort_id_index_p($fts_antecedent_index$.getGlobalValue())) && (NIL == forts.fort_id_index_emptyP($fts_antecedent_index$.getGlobalValue()))) && (NIL != forts.fort_id_index_p($fts_consequent_index$.getGlobalValue()))) && (NIL == forts.fort_id_index_emptyP($fts_consequent_index$.getGlobalValue()))) && (NIL != forts.fort_id_index_p($fts_joint_antecedent_index$.getGlobalValue()))) && (NIL == forts.fort_id_index_emptyP($fts_joint_antecedent_index$.getGlobalValue())));
    }

    public static final SubLObject rebuild_rule_connectivity_graph_alt() {
        $fts_antecedent_index$.setGlobalValue(com.cyc.cycjava.cycl.predicate_suggestor.fts_init_index());
        $fts_consequent_index$.setGlobalValue(com.cyc.cycjava.cycl.predicate_suggestor.fts_init_index());
        $fts_joint_antecedent_index$.setGlobalValue(com.cyc.cycjava.cycl.predicate_suggestor.fts_init_index());
        com.cyc.cycjava.cycl.predicate_suggestor.fts_init_via_rules();
        com.cyc.cycjava.cycl.predicate_suggestor.fts_init_via_rmp_gafs();
        return NIL;
    }

    public static SubLObject rebuild_rule_connectivity_graph() {
        $fts_antecedent_index$.setGlobalValue(fts_init_index());
        $fts_consequent_index$.setGlobalValue(fts_init_index());
        $fts_joint_antecedent_index$.setGlobalValue(fts_init_index());
        fts_init_via_rules();
        fts_init_via_rmp_gafs();
        return NIL;
    }

    public static final SubLObject fts_init_via_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject message_var = $str_alt11$Initializing_predicate_connectivi;
                SubLObject total_1 = assertions_low.rule_count();
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(message_var);
                        {
                            SubLObject vector_var = keyhash.do_keyhash_nodes(assertions_low.kb_rule_set());
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject rule = aref(vector_var, element_num);
                                    if (NIL != keyhash.do_keyhash_valid_key_p(rule)) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total_1);
                                        total = add(total, ONE_INTEGER);
                                        {
                                            SubLObject message_var_2 = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_3 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            com.cyc.cycjava.cycl.predicate_suggestor.fts_init_handle_rule(rule);
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                message_var_2 = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                            if (message_var_2.isString()) {
                                                Errors.warn($str_alt13$_A, message_var_2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject fts_init_via_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject message_var = $str11$Initializing_predicate_connectivi;
        final SubLObject total_$1 = assertions_low.rule_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total_$1);
                        total = add(total, ONE_INTEGER);
                        SubLObject message_var_$2 = NIL;
                        final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                        eval($list13);
                        try {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        fts_init_handle_rule(rule);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                message_var_$2 = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        if (message_var_$2.isString()) {
                            Errors.warn($str16$_A, message_var_$2);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static final SubLObject fts_init_via_rmp_gafs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject rmps = isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = rmps;
                                SubLObject rmp = NIL;
                                for (rmp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rmp = cdolist_list_var.first()) {
                                    total = add(total, kb_indexing.num_predicate_extent_index(rmp, UNPROVIDED));
                                }
                            }
                            {
                                SubLObject _prev_bind_0_4 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_5 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($str_alt17$Initializing_predicate_connectivi);
                                    {
                                        SubLObject cdolist_list_var = rmps;
                                        SubLObject rmp = NIL;
                                        for (rmp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rmp = cdolist_list_var.first()) {
                                            {
                                                SubLObject pred_var = rmp;
                                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                        SubLObject done_var = NIL;
                                                        SubLObject token_var = NIL;
                                                        while (NIL == done_var) {
                                                            {
                                                                SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject final_index_iterator = NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                            {
                                                                                SubLObject done_var_6 = NIL;
                                                                                SubLObject token_var_7 = NIL;
                                                                                while (NIL == done_var_6) {
                                                                                    {
                                                                                        SubLObject gaf = iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                                        SubLObject valid_8 = makeBoolean(token_var_7 != gaf);
                                                                                        if (NIL != valid_8) {
                                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                                            note_percent_progress(sofar, total);
                                                                                            {
                                                                                                SubLObject message_var = NIL;
                                                                                                try {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_9 = Errors.$error_handler$.currentBinding(thread);
                                                                                                        try {
                                                                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                                                            try {
                                                                                                                com.cyc.cycjava.cycl.predicate_suggestor.fts_init_handle_rmp_gaf(gaf);
                                                                                                            } catch (Throwable catch_var) {
                                                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            Errors.$error_handler$.rebind(_prev_bind_0_9, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable ccatch_env_var) {
                                                                                                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                                                }
                                                                                                if (message_var.isString()) {
                                                                                                    Errors.warn($str_alt13$_A, message_var);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_var_6 = makeBoolean(NIL == valid_8);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_5, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject fts_init_via_rmp_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject rmps = cdolist_list_var = isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED);
            SubLObject rmp = NIL;
            rmp = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                total = add(total, kb_indexing.num_predicate_extent_index(rmp, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                rmp = cdolist_list_var.first();
            } 
            final SubLObject _prev_bind_0_$6 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str20$Initializing_predicate_connectivi);
                    SubLObject cdolist_list_var2 = rmps;
                    SubLObject rmp2 = NIL;
                    rmp2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject pred_var = rmp2;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = NIL;
                            final SubLObject _prev_bind_0_$7 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$8 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$10 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$11 = $progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                            try {
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                $progress_count$.bind(ZERO_INTEGER, thread);
                                $is_noting_progressP$.bind(T, thread);
                                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                noting_progress_preamble(str);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        note_progress();
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$12 = NIL;
                                            final SubLObject token_var_$13 = NIL;
                                            while (NIL == done_var_$12) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                                final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(gaf));
                                                if (NIL != valid_$14) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    SubLObject message_var = NIL;
                                                    final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                                                    eval($list13);
                                                    try {
                                                        try {
                                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                            final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                try {
                                                                    fts_init_handle_rmp_gaf(gaf);
                                                                } catch (final Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var) {
                                                            message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                    }
                                                    if (message_var.isString()) {
                                                        Errors.warn($str16$_A, message_var);
                                                    }
                                                }
                                                done_var_$12 = makeBoolean(NIL == valid_$14);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_8, thread);
                                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                $progress_count$.rebind(_prev_bind_6, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                $progress_notification_count$.rebind(_prev_bind_3_$11, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$10, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$8, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        rmp2 = cdolist_list_var2.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$7, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static final SubLObject fts_init_handle_rule_alt(SubLObject rule) {
        return com.cyc.cycjava.cycl.predicate_suggestor.fts_init_handle_rule_formula(assertions_high.assertion_formula(rule));
    }

    public static SubLObject fts_init_handle_rule(final SubLObject rule) {
        return fts_init_handle_rule_formula(assertions_high.assertion_formula(rule));
    }

    public static final SubLObject fts_init_handle_rmp_gaf_alt(SubLObject gaf) {
        {
            SubLObject gaf_formula = assertions_high.assertion_formula(gaf);
            SubLObject rule_formula = uncanonicalizer.undo_implications(verbosifier.verbosify_cycl(gaf_formula, UNPROVIDED, UNPROVIDED));
            return com.cyc.cycjava.cycl.predicate_suggestor.fts_init_handle_rule_formula(rule_formula);
        }
    }

    public static SubLObject fts_init_handle_rmp_gaf(final SubLObject gaf) {
        final SubLObject gaf_formula = assertions_high.assertion_formula(gaf);
        final SubLObject rule_formula = uncanonicalizer.undo_implications(verbosifier.verbosify_cycl(gaf_formula, UNPROVIDED, UNPROVIDED));
        return fts_init_handle_rule_formula(rule_formula);
    }

    public static final SubLObject fts_init_handle_rule_formula_alt(SubLObject formula) {
        if (NIL != el_implication_p(formula)) {
            {
                SubLObject lhs = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                SubLObject rhs = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                SubLObject antecedent_terms = remove_if($sym20$FTS_UNUSABLE_TERM_, cycl_utilities.formula_forts(lhs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject consequent_terms = remove_if($sym20$FTS_UNUSABLE_TERM_, cycl_utilities.formula_forts(rhs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = antecedent_terms;
                    SubLObject antecedent_term = NIL;
                    for (antecedent_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_term = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.predicate_suggestor.fts_joint_antecedent_index_push_list(antecedent_term, antecedent_terms);
                    }
                }
                {
                    SubLObject cdolist_list_var = antecedent_terms;
                    SubLObject antecedent_term = NIL;
                    for (antecedent_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_term = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.predicate_suggestor.fts_consequent_index_push_list(antecedent_term, consequent_terms);
                    }
                }
                {
                    SubLObject cdolist_list_var = consequent_terms;
                    SubLObject consequent_term = NIL;
                    for (consequent_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , consequent_term = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.predicate_suggestor.fts_antecedent_index_push_list(consequent_term, antecedent_terms);
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject fts_init_handle_rule_formula(final SubLObject formula) {
        if (NIL != el_implication_p(formula)) {
            final SubLObject lhs = cycl_utilities.formula_arg1(formula, UNPROVIDED);
            final SubLObject rhs = cycl_utilities.formula_arg2(formula, UNPROVIDED);
            final SubLObject antecedent_terms = remove_if($sym23$FTS_UNUSABLE_TERM_, cycl_utilities.formula_forts(lhs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject consequent_terms = remove_if($sym23$FTS_UNUSABLE_TERM_, cycl_utilities.formula_forts(rhs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = antecedent_terms;
            SubLObject antecedent_term = NIL;
            antecedent_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fts_joint_antecedent_index_push_list(antecedent_term, antecedent_terms);
                cdolist_list_var = cdolist_list_var.rest();
                antecedent_term = cdolist_list_var.first();
            } 
            cdolist_list_var = antecedent_terms;
            antecedent_term = NIL;
            antecedent_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fts_consequent_index_push_list(antecedent_term, consequent_terms);
                cdolist_list_var = cdolist_list_var.rest();
                antecedent_term = cdolist_list_var.first();
            } 
            cdolist_list_var = consequent_terms;
            SubLObject consequent_term = NIL;
            consequent_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fts_antecedent_index_push_list(consequent_term, antecedent_terms);
                cdolist_list_var = cdolist_list_var.rest();
                consequent_term = cdolist_list_var.first();
            } 
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject dump_rule_connectivity_graph_to_stream_alt(SubLObject stream) {
        com.cyc.cycjava.cycl.predicate_suggestor.dump_rule_connectivity_graph_to_stream_int($fts_antecedent_index$.getGlobalValue(), stream);
        com.cyc.cycjava.cycl.predicate_suggestor.dump_rule_connectivity_graph_to_stream_int($fts_consequent_index$.getGlobalValue(), stream);
        com.cyc.cycjava.cycl.predicate_suggestor.dump_rule_connectivity_graph_to_stream_int($fts_joint_antecedent_index$.getGlobalValue(), stream);
        return NIL;
    }

    public static SubLObject dump_rule_connectivity_graph_to_stream(final SubLObject stream) {
        dump_rule_connectivity_graph_to_stream_int($fts_antecedent_index$.getGlobalValue(), stream);
        dump_rule_connectivity_graph_to_stream_int($fts_consequent_index$.getGlobalValue(), stream);
        dump_rule_connectivity_graph_to_stream_int($fts_joint_antecedent_index$.getGlobalValue(), stream);
        return NIL;
    }

    public static final SubLObject load_rule_connectivity_graph_from_stream_alt(SubLObject stream) {
        $fts_antecedent_index$.setGlobalValue(com.cyc.cycjava.cycl.predicate_suggestor.load_rule_connectivity_graph_from_stream_int(stream));
        $fts_consequent_index$.setGlobalValue(com.cyc.cycjava.cycl.predicate_suggestor.load_rule_connectivity_graph_from_stream_int(stream));
        $fts_joint_antecedent_index$.setGlobalValue(com.cyc.cycjava.cycl.predicate_suggestor.load_rule_connectivity_graph_from_stream_int(stream));
        return NIL;
    }

    public static SubLObject load_rule_connectivity_graph_from_stream(final SubLObject stream) {
        $fts_antecedent_index$.setGlobalValue(load_rule_connectivity_graph_from_stream_int(stream));
        $fts_consequent_index$.setGlobalValue(load_rule_connectivity_graph_from_stream_int(stream));
        $fts_joint_antecedent_index$.setGlobalValue(load_rule_connectivity_graph_from_stream_int(stream));
        return NIL;
    }

    public static final SubLObject dump_rule_connectivity_graph_to_stream_int_alt(SubLObject index, SubLObject stream) {
        cfasl_output(forts.fort_id_index_count(index), stream);
        {
            SubLObject fii = index;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject fort = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != fort) {
                                        cfasl_output(fort, stream);
                                        cfasl_output(value, stream);
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject fort = nart_handles.find_nart_by_id(id);
                                    if (NIL != fort) {
                                        cfasl_output(fort, stream);
                                        cfasl_output(value, stream);
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject dump_rule_connectivity_graph_to_stream_int(final SubLObject index, final SubLObject stream) {
        cfasl_output(forts.fort_id_index_count(index), stream);
        SubLObject idx = forts.do_fii_get_constants(index);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$19 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$19);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject fort;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    value = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(value)) {
                            value = $SKIP;
                        }
                        fort = constants_high.find_constant_by_internal_id(id);
                        if (NIL != fort) {
                            cfasl_output(fort, stream);
                            cfasl_output(value, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$20 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$20)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$20);
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        final SubLObject fort2 = constants_high.find_constant_by_internal_id(id2);
                        if (NIL != fort2) {
                            cfasl_output(fort2, stream);
                            cfasl_output(value2, stream);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        idx = forts.do_fii_get_narts(index);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$21 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$21, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$21);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject fort;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    value = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(value)) {
                            value = $SKIP;
                        }
                        fort = nart_handles.find_nart_by_id(id);
                        if (NIL != fort) {
                            cfasl_output(fort, stream);
                            cfasl_output(value, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$22 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$22)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$22);
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        final SubLObject fort2 = nart_handles.find_nart_by_id(id2);
                        if (NIL != fort2) {
                            cfasl_output(fort2, stream);
                            cfasl_output(value2, stream);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject load_rule_connectivity_graph_from_stream_int_alt(SubLObject stream) {
        {
            SubLObject index = com.cyc.cycjava.cycl.predicate_suggestor.fts_init_index();
            SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject fort = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    forts.fort_id_index_enter(index, fort, value);
                }
            }
            return index;
        }
    }

    public static SubLObject load_rule_connectivity_graph_from_stream_int(final SubLObject stream) {
        final SubLObject index = fts_init_index();
        SubLObject count;
        SubLObject i;
        SubLObject fort;
        SubLObject value;
        for (count = cfasl_input(stream, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            fort = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            forts.fort_id_index_enter(index, fort, value);
        }
        return index;
    }

    public static final SubLObject fts_term_related_terms_with_counts_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.counted_alist_from_list(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_related_terms(v_term));
    }

    public static SubLObject fts_term_related_terms_with_counts(final SubLObject v_term) {
        return counted_alist_from_list(fts_term_related_terms(v_term));
    }

    public static final SubLObject fts_term_related_terms_by_relevance_alt(SubLObject v_term) {
        return list_utilities.ordered_merge(list_utilities.ordered_merge(com.cyc.cycjava.cycl.predicate_suggestor.sort_list_by_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_joint_antecedents(v_term)), com.cyc.cycjava.cycl.predicate_suggestor.sort_list_by_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_consequents(v_term)), symbol_function(EQUAL), UNPROVIDED), com.cyc.cycjava.cycl.predicate_suggestor.sort_list_by_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_antecedents(v_term)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject fts_term_related_terms_by_relevance(final SubLObject v_term) {
        return list_utilities.ordered_merge(list_utilities.ordered_merge(sort_list_by_count(fts_term_joint_antecedents(v_term)), sort_list_by_count(fts_term_consequents(v_term)), symbol_function(EQUAL), UNPROVIDED), sort_list_by_count(fts_term_antecedents(v_term)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject fts_term_related_terms_by_count_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.predicate_suggestor.sort_list_by_count(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_related_terms(v_term));
    }

    public static SubLObject fts_term_related_terms_by_count(final SubLObject v_term) {
        return sort_list_by_count(fts_term_related_terms(v_term));
    }

    public static final SubLObject fts_term_related_terms_alt(SubLObject v_term) {
        return cconcatenate(com.cyc.cycjava.cycl.predicate_suggestor.fts_term_joint_antecedents(v_term), new SubLObject[]{ com.cyc.cycjava.cycl.predicate_suggestor.fts_term_antecedents(v_term), com.cyc.cycjava.cycl.predicate_suggestor.fts_term_consequents(v_term) });
    }

    public static SubLObject fts_term_related_terms(final SubLObject v_term) {
        return cconcatenate(fts_term_joint_antecedents(v_term), new SubLObject[]{ fts_term_antecedents(v_term), fts_term_consequents(v_term) });
    }

    /**
     *
     *
     * @param dict:
     * 		dictionary of output terms, keyed by term
     * @param n:
     * 		weight to multiply the values you find in the function by
     * @unknown nil (destructively modifies dict)
     */
    @LispMethod(comment = "@param dict:\r\n\t\tdictionary of output terms, keyed by term\r\n@param n:\r\n\t\tweight to multiply the values you find in the function by\r\n@unknown nil (destructively modifies dict)")
    public static final SubLObject weight_termlist_by_name_alt(SubLObject dict, SubLObject n) {
        {
            SubLObject output_terms = dictionary.dictionary_keys(dict);
            SubLObject outterms_ranked = nreverse(Sort.sort(copy_list(output_terms), $sym22$STRING_LENGTH__, CONSTANT_NAME));
            SubLObject current_rank = ZERO_INTEGER;
            SubLObject cdolist_list_var = outterms_ranked;
            SubLObject outterm = NIL;
            for (outterm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , outterm = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_increment(dict, outterm, multiply(n, current_rank));
                current_rank = add(current_rank, ONE_INTEGER);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param dict:
     * 		dictionary of output terms, keyed by term
     * @param n:
     * 		weight to multiply the values you find in the function by
     * @unknown nil (destructively modifies dict)
     */
    @LispMethod(comment = "@param dict:\r\n\t\tdictionary of output terms, keyed by term\r\n@param n:\r\n\t\tweight to multiply the values you find in the function by\r\n@unknown nil (destructively modifies dict)")
    public static SubLObject weight_termlist_by_name(final SubLObject dict, final SubLObject n) {
        final SubLObject output_terms = dictionary.dictionary_keys(dict);
        final SubLObject outterms_ranked = nreverse(Sort.sort(copy_list(output_terms), $sym25$STRING_LENGTH__, CONSTANT_NAME));
        SubLObject current_rank = ZERO_INTEGER;
        SubLObject cdolist_list_var = outterms_ranked;
        SubLObject outterm = NIL;
        outterm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_increment(dict, outterm, multiply(n, current_rank));
            current_rank = add(current_rank, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            outterm = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param dict:
     * 		dictionary of output terms, keyed by term
     * @param n:
     * 		weight to multiply the values you find in the function by
     * @param all-related-terms:
     * 		the complete (concatenated) list of all terms
     * 		related to the input terms in the various indices
     * @unknown nil (destructively modifies dict)
     */
    @LispMethod(comment = "@param dict:\r\n\t\tdictionary of output terms, keyed by term\r\n@param n:\r\n\t\tweight to multiply the values you find in the function by\r\n@param all-related-terms:\r\n\t\tthe complete (concatenated) list of all terms\r\n\t\trelated to the input terms in the various indices\r\n@unknown nil (destructively modifies dict)")
    public static final SubLObject weight_termlist_by_total_occurrences_alt(SubLObject dict, SubLObject n, SubLObject all_related_terms) {
        {
            SubLObject cdolist_list_var = all_related_terms;
            SubLObject relterm = NIL;
            for (relterm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relterm = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_increment(dict, relterm, n);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param dict:
     * 		dictionary of output terms, keyed by term
     * @param n:
     * 		weight to multiply the values you find in the function by
     * @param all-related-terms:
     * 		the complete (concatenated) list of all terms
     * 		related to the input terms in the various indices
     * @unknown nil (destructively modifies dict)
     */
    @LispMethod(comment = "@param dict:\r\n\t\tdictionary of output terms, keyed by term\r\n@param n:\r\n\t\tweight to multiply the values you find in the function by\r\n@param all-related-terms:\r\n\t\tthe complete (concatenated) list of all terms\r\n\t\trelated to the input terms in the various indices\r\n@unknown nil (destructively modifies dict)")
    public static SubLObject weight_termlist_by_total_occurrences(final SubLObject dict, final SubLObject n, final SubLObject all_related_terms) {
        SubLObject cdolist_list_var = all_related_terms;
        SubLObject relterm = NIL;
        relterm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_increment(dict, relterm, n);
            cdolist_list_var = cdolist_list_var.rest();
            relterm = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param dict:
     * 		dictionary of output terms, keyed by term
     * @param n:
     * 		weight to multiply the values you find in the function by
     * @param output-terms:
     * 		the output terms related in some way to the inputs
     * @param list-of-related-term-lists:
     * 		a list of lists of all terms related
     * 		to the input terms, by input term (so, same length as input terms)
     * @unknown nil (destructively modifies dict)
     */
    @LispMethod(comment = "@param dict:\r\n\t\tdictionary of output terms, keyed by term\r\n@param n:\r\n\t\tweight to multiply the values you find in the function by\r\n@param output-terms:\r\n\t\tthe output terms related in some way to the inputs\r\n@param list-of-related-term-lists:\r\n\t\ta list of lists of all terms related\r\n\t\tto the input terms, by input term (so, same length as input terms)\r\n@unknown nil (destructively modifies dict)")
    public static final SubLObject weight_termlist_by_intersection_of_inputs_alt(SubLObject dict, SubLObject n, SubLObject output_terms, SubLObject list_of_related_term_lists) {
        {
            SubLObject cdolist_list_var = list_of_related_term_lists;
            SubLObject terms_related_to_one_interm = NIL;
            for (terms_related_to_one_interm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terms_related_to_one_interm = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_11 = output_terms;
                    SubLObject outterm = NIL;
                    for (outterm = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , outterm = cdolist_list_var_11.first()) {
                        if (NIL != subl_promotions.memberP(outterm, terms_related_to_one_interm, UNPROVIDED, UNPROVIDED)) {
                            dictionary_utilities.dictionary_increment(dict, outterm, n);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param dict:
     * 		dictionary of output terms, keyed by term
     * @param n:
     * 		weight to multiply the values you find in the function by
     * @param output-terms:
     * 		the output terms related in some way to the inputs
     * @param list-of-related-term-lists:
     * 		a list of lists of all terms related
     * 		to the input terms, by input term (so, same length as input terms)
     * @unknown nil (destructively modifies dict)
     */
    @LispMethod(comment = "@param dict:\r\n\t\tdictionary of output terms, keyed by term\r\n@param n:\r\n\t\tweight to multiply the values you find in the function by\r\n@param output-terms:\r\n\t\tthe output terms related in some way to the inputs\r\n@param list-of-related-term-lists:\r\n\t\ta list of lists of all terms related\r\n\t\tto the input terms, by input term (so, same length as input terms)\r\n@unknown nil (destructively modifies dict)")
    public static SubLObject weight_termlist_by_intersection_of_inputs(final SubLObject dict, final SubLObject n, final SubLObject output_terms, final SubLObject list_of_related_term_lists) {
        SubLObject cdolist_list_var = list_of_related_term_lists;
        SubLObject terms_related_to_one_interm = NIL;
        terms_related_to_one_interm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$23 = output_terms;
            SubLObject outterm = NIL;
            outterm = cdolist_list_var_$23.first();
            while (NIL != cdolist_list_var_$23) {
                if (NIL != subl_promotions.memberP(outterm, terms_related_to_one_interm, UNPROVIDED, UNPROVIDED)) {
                    dictionary_utilities.dictionary_increment(dict, outterm, n);
                }
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                outterm = cdolist_list_var_$23.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            terms_related_to_one_interm = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject terms_from_terms_sorted_alt(SubLObject input_terms, SubLObject intersect_wt, SubLObject occurrence_wt, SubLObject namelength_wt) {
        if (intersect_wt == UNPROVIDED) {
            intersect_wt = $int$10000;
        }
        if (occurrence_wt == UNPROVIDED) {
            occurrence_wt = TEN_INTEGER;
        }
        if (namelength_wt == UNPROVIDED) {
            namelength_wt = ONE_INTEGER;
        }
        {
            SubLObject output_terms = NIL;
            SubLObject weighted_output_terms = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject all_related_terms = NIL;
            SubLObject list_of_lists_of_related_terms = NIL;
            SubLObject cdolist_list_var = input_terms;
            SubLObject interm = NIL;
            for (interm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interm = cdolist_list_var.first()) {
                {
                    SubLObject relterms = com.cyc.cycjava.cycl.predicate_suggestor.fts_term_related_terms(interm);
                    list_of_lists_of_related_terms = cons(relterms, list_of_lists_of_related_terms);
                    {
                        SubLObject cdolist_list_var_12 = relterms;
                        SubLObject outterm = NIL;
                        for (outterm = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , outterm = cdolist_list_var_12.first()) {
                            all_related_terms = cons(outterm, all_related_terms);
                            {
                                SubLObject item_var = outterm;
                                if (NIL == member(item_var, output_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    output_terms = cons(item_var, output_terms);
                                }
                            }
                            dictionary.dictionary_enter(weighted_output_terms, outterm, ZERO_INTEGER);
                        }
                    }
                }
            }
            if (intersect_wt != ZERO_INTEGER) {
                com.cyc.cycjava.cycl.predicate_suggestor.weight_termlist_by_intersection_of_inputs(weighted_output_terms, intersect_wt, output_terms, list_of_lists_of_related_terms);
            }
            if (occurrence_wt != ZERO_INTEGER) {
                com.cyc.cycjava.cycl.predicate_suggestor.weight_termlist_by_total_occurrences(weighted_output_terms, occurrence_wt, all_related_terms);
            }
            if (namelength_wt != ZERO_INTEGER) {
                com.cyc.cycjava.cycl.predicate_suggestor.weight_termlist_by_name(weighted_output_terms, namelength_wt);
            }
            return com.cyc.cycjava.cycl.predicate_suggestor.get_term_values_from_dict(weighted_output_terms);
        }
    }

    public static SubLObject terms_from_terms_sorted(final SubLObject input_terms, SubLObject intersect_wt, SubLObject occurrence_wt, SubLObject namelength_wt) {
        if (intersect_wt == UNPROVIDED) {
            intersect_wt = $int$10000;
        }
        if (occurrence_wt == UNPROVIDED) {
            occurrence_wt = TEN_INTEGER;
        }
        if (namelength_wt == UNPROVIDED) {
            namelength_wt = ONE_INTEGER;
        }
        SubLObject output_terms = NIL;
        final SubLObject weighted_output_terms = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject all_related_terms = NIL;
        SubLObject list_of_lists_of_related_terms = NIL;
        SubLObject cdolist_list_var = input_terms;
        SubLObject interm = NIL;
        interm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject relterms = fts_term_related_terms(interm);
            list_of_lists_of_related_terms = cons(relterms, list_of_lists_of_related_terms);
            SubLObject cdolist_list_var_$24 = relterms;
            SubLObject outterm = NIL;
            outterm = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                all_related_terms = cons(outterm, all_related_terms);
                final SubLObject item_var = outterm;
                if (NIL == member(item_var, output_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                    output_terms = cons(item_var, output_terms);
                }
                dictionary.dictionary_enter(weighted_output_terms, outterm, ZERO_INTEGER);
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                outterm = cdolist_list_var_$24.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            interm = cdolist_list_var.first();
        } 
        if (!intersect_wt.eql(ZERO_INTEGER)) {
            weight_termlist_by_intersection_of_inputs(weighted_output_terms, intersect_wt, output_terms, list_of_lists_of_related_terms);
        }
        if (!occurrence_wt.eql(ZERO_INTEGER)) {
            weight_termlist_by_total_occurrences(weighted_output_terms, occurrence_wt, all_related_terms);
        }
        if (!namelength_wt.eql(ZERO_INTEGER)) {
            weight_termlist_by_name(weighted_output_terms, namelength_wt);
        }
        return get_term_values_from_dict(weighted_output_terms);
    }

    public static final SubLObject suggested_terms_from_terms_alt(SubLObject input_terms, SubLObject sort_type, SubLObject cap, SubLObject expert) {
        if (sort_type == UNPROVIDED) {
            sort_type = $BEST;
        }
        if (cap == UNPROVIDED) {
            cap = $int$100;
        }
        if (expert == UNPROVIDED) {
            expert = NIL;
        }
        SubLTrampolineFile.checkType(input_terms, LIST_OF_FORT_P);
        {
            SubLObject results = NIL;
            if (NIL != list_utilities.empty_list_p(input_terms)) {
                return NIL;
            } else {
                if (sort_type == $INTERSECT) {
                    results = com.cyc.cycjava.cycl.predicate_suggestor.terms_from_terms_sorted(input_terms, $int$100, ZERO_INTEGER, ZERO_INTEGER);
                } else {
                    if (sort_type == $OCCURRENCES) {
                        results = com.cyc.cycjava.cycl.predicate_suggestor.terms_from_terms_sorted(input_terms, ZERO_INTEGER, $int$100, ZERO_INTEGER);
                    } else {
                        if (sort_type == $LENGTH) {
                            results = com.cyc.cycjava.cycl.predicate_suggestor.terms_from_terms_sorted(input_terms, ZERO_INTEGER, ZERO_INTEGER, $int$100);
                        } else {
                            if (sort_type == $INTERSECT_COMPLEX) {
                                results = com.cyc.cycjava.cycl.predicate_suggestor.terms_from_terms_sorted(input_terms, $int$10000, $int$100, ONE_INTEGER);
                            } else {
                                if (sort_type == $BEST) {
                                    results = (ONE_INTEGER == length(input_terms)) ? ((SubLObject) (com.cyc.cycjava.cycl.predicate_suggestor.terms_from_terms_sorted(input_terms, ZERO_INTEGER, $int$100, ZERO_INTEGER))) : com.cyc.cycjava.cycl.predicate_suggestor.terms_from_terms_sorted(input_terms, $int$10000, TEN_INTEGER, ONE_INTEGER);
                                } else {
                                    Errors.error($str_alt32$Bad_sort_type__S_, sort_type);
                                }
                            }
                        }
                    }
                }
            }
            results = list_utilities.remove_objects_from_list(input_terms, results, UNPROVIDED);
            if (NIL == expert) {
                results = remove_if($sym33$FTS_EXPERT_TERM_, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != list_utilities.lengthG(results, cap, UNPROVIDED)) {
                return list_utilities.first_n(cap, results);
            } else {
                return results;
            }
        }
    }

    public static SubLObject suggested_terms_from_terms(final SubLObject input_terms, SubLObject sort_type, SubLObject cap, SubLObject expert) {
        if (sort_type == UNPROVIDED) {
            sort_type = $BEST;
        }
        if (cap == UNPROVIDED) {
            cap = $int$100;
        }
        if (expert == UNPROVIDED) {
            expert = NIL;
        }
        assert NIL != forts.list_of_fort_p(input_terms) : "! forts.list_of_fort_p(input_terms) " + ("forts.list_of_fort_p(input_terms) " + "CommonSymbols.NIL != forts.list_of_fort_p(input_terms) ") + input_terms;
        SubLObject results = NIL;
        if (NIL != list_utilities.empty_list_p(input_terms)) {
            return NIL;
        }
        if (sort_type == $INTERSECT) {
            results = terms_from_terms_sorted(input_terms, $int$100, ZERO_INTEGER, ZERO_INTEGER);
        } else
            if (sort_type == $OCCURRENCES) {
                results = terms_from_terms_sorted(input_terms, ZERO_INTEGER, $int$100, ZERO_INTEGER);
            } else
                if (sort_type == $LENGTH) {
                    results = terms_from_terms_sorted(input_terms, ZERO_INTEGER, ZERO_INTEGER, $int$100);
                } else
                    if (sort_type == $INTERSECT_COMPLEX) {
                        results = terms_from_terms_sorted(input_terms, $int$10000, $int$100, ONE_INTEGER);
                    } else
                        if (sort_type == $BEST) {
                            results = (ONE_INTEGER.eql(length(input_terms))) ? terms_from_terms_sorted(input_terms, ZERO_INTEGER, $int$100, ZERO_INTEGER) : terms_from_terms_sorted(input_terms, $int$10000, TEN_INTEGER, ONE_INTEGER);
                        } else {
                            Errors.error($str35$Bad_sort_type__S_, sort_type);
                        }




        results = list_utilities.remove_objects_from_list(input_terms, results, UNPROVIDED);
        if (NIL == expert) {
            results = remove_if($sym36$FTS_EXPERT_TERM_, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != list_utilities.lengthG(results, cap, UNPROVIDED)) {
            return list_utilities.first_n(cap, results);
        }
        return results;
    }

    public static final SubLObject suggested_predicates_from_predicates_alt(SubLObject input_terms, SubLObject sort_type, SubLObject cap, SubLObject expert) {
        if (sort_type == UNPROVIDED) {
            sort_type = $BEST;
        }
        if (cap == UNPROVIDED) {
            cap = TWENTY_INTEGER;
        }
        if (expert == UNPROVIDED) {
            expert = NIL;
        }
        SubLTrampolineFile.checkType(input_terms, LIST_OF_PREDICATES_P);
        return list_utilities.remove_if_not(PREDICATE_P, com.cyc.cycjava.cycl.predicate_suggestor.suggested_terms_from_terms(input_terms, sort_type, cap, expert), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject suggested_predicates_from_predicates(final SubLObject input_terms, SubLObject sort_type, SubLObject cap, SubLObject expert) {
        if (sort_type == UNPROVIDED) {
            sort_type = $BEST;
        }
        if (cap == UNPROVIDED) {
            cap = TWENTY_INTEGER;
        }
        if (expert == UNPROVIDED) {
            expert = NIL;
        }
        assert NIL != fort_types_interface.list_of_predicates_p(input_terms) : "! fort_types_interface.list_of_predicates_p(input_terms) " + ("fort_types_interface.list_of_predicates_p(input_terms) " + "CommonSymbols.NIL != fort_types_interface.list_of_predicates_p(input_terms) ") + input_terms;
        return list_utilities.remove_if_not(PREDICATE_P, suggested_terms_from_terms(input_terms, sort_type, cap, expert), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject suggested_predicate_sort_type_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(member(v_object, $suggested_predicate_sort_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject suggested_predicate_sort_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(member(v_object, $suggested_predicate_sort_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    /**
     * take a list of predicates and generate the suggested predicate sentences with optimized variables
     */
    @LispMethod(comment = "take a list of predicates and generate the suggested predicate sentences with optimized variables")
    public static final SubLObject create_suggested_predicate_sentences_for_predicates_alt(SubLObject list_of_preds, SubLObject sort_type, SubLObject cap, SubLObject expert) {
        if (sort_type == UNPROVIDED) {
            sort_type = $BEST;
        }
        if (cap == UNPROVIDED) {
            cap = TWENTY_INTEGER;
        }
        if (expert == UNPROVIDED) {
            expert = NIL;
        }
        return com.cyc.cycjava.cycl.predicate_suggestor.create_sentences_for_predicates(com.cyc.cycjava.cycl.predicate_suggestor.suggested_predicates_from_predicates(list_of_preds, sort_type, cap, expert));
    }

    /**
     * take a list of predicates and generate the suggested predicate sentences with optimized variables
     */
    @LispMethod(comment = "take a list of predicates and generate the suggested predicate sentences with optimized variables")
    public static SubLObject create_suggested_predicate_sentences_for_predicates(final SubLObject list_of_preds, SubLObject sort_type, SubLObject cap, SubLObject expert) {
        if (sort_type == UNPROVIDED) {
            sort_type = $BEST;
        }
        if (cap == UNPROVIDED) {
            cap = TWENTY_INTEGER;
        }
        if (expert == UNPROVIDED) {
            expert = NIL;
        }
        return create_sentences_for_predicates(suggested_predicates_from_predicates(list_of_preds, sort_type, cap, expert));
    }

    /**
     * take a list of predicates and create sentences with optimized variables
     */
    @LispMethod(comment = "take a list of predicates and create sentences with optimized variables")
    public static final SubLObject create_sentences_for_predicates_alt(SubLObject list_of_preds) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list_of_preds;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                {
                    SubLObject predicate_arity = arity.arity(predicate);
                    SubLObject formula = list(predicate);
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL(predicate_arity); index = add(index, ONE_INTEGER)) {
                        formula = cons(variables.get_default_el_var(index), formula);
                    }
                    result = cons(optimize_el_formula_variable_names(nreverse(formula), UNPROVIDED, UNPROVIDED), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * take a list of predicates and create sentences with optimized variables
     */
    @LispMethod(comment = "take a list of predicates and create sentences with optimized variables")
    public static SubLObject create_sentences_for_predicates(final SubLObject list_of_preds) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_of_preds;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicate_arity = arity.arity(predicate);
            SubLObject formula = list(predicate);
            SubLObject index;
            for (index = NIL, index = ZERO_INTEGER; index.numL(predicate_arity); index = add(index, ONE_INTEGER)) {
                formula = cons(variables.get_default_el_var(index), formula);
            }
            result = cons(optimize_el_formula_variable_names(nreverse(formula), UNPROVIDED, UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject get_suggested_followups_alt(SubLObject args) {
        com.cyc.cycjava.cycl.predicate_suggestor.get_suggested_followups_int(args);
        return NIL;
    }

    public static SubLObject get_suggested_followups(final SubLObject args) {
        get_suggested_followups_int(args);
        return NIL;
    }

    public static final SubLObject get_suggested_followups_int_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Followup_Term_Suggestion;
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
                            SubLObject _prev_bind_0_13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt51$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        {
                                            SubLObject frame_name_var = cb_frame_name(NIL);
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(frame_name_var);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt52$handle_get_followup_suggestions, T, UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt53$Enter_constants_separated_by_whit);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_complete.html_complete_button($$$terms, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_complete.html_cyclify_button($$$terms, $$$Cyclify);
                                                    html_indent(UNPROVIDED);
                                                    html_script_utilities.html_clear_input_button($$$terms, $$$Clear);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$terms);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($int$80);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(TEN_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt60$Maximum_number_of_results__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_glyph($NBSP, ONE_INTEGER);
                                                    html_text_input($$$cap, $int$30, THREE_INTEGER);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt64$Allow_non_predicate_outputs__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_glyph($NBSP, ONE_INTEGER);
                                                    html_checkbox_input($str_alt65$allow_non_preds, $str_alt65$allow_non_preds, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt66$Show_expert_level_terms__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_glyph($NBSP, ONE_INTEGER);
                                                    html_checkbox_input($$$expert, $$$expert, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_13, thread);
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

    public static SubLObject get_suggested_followups_int(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Followup_Term_Suggestion;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str45$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str46$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str51$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
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
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str57$handle_get_followup_suggestions, T, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str58$Enter_constants_separated_by_whit);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_complete.html_complete_button($$$terms, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_complete.html_cyclify_button($$$terms, $$$Cyclify, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$terms, $$$Clear, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$terms);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$80);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TEN_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str65$Maximum_number_of_results__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_glyph($NBSP, ONE_INTEGER);
                            html_text_input($$$cap, $int$30, THREE_INTEGER);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str69$Allow_non_predicate_outputs__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_glyph($NBSP, ONE_INTEGER);
                            html_checkbox_input($str70$allow_non_preds, $str70$allow_non_preds, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str71$Show_expert_level_terms__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_glyph($NBSP, ONE_INTEGER);
                            html_checkbox_input($$$expert, $$$expert, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$25, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject strip_parens_alt(SubLObject str) {
        SubLTrampolineFile.checkType(str, STRINGP);
        return remove(CHAR_lparen, remove(CHAR_rparen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strip_parens(final SubLObject str) {
        assert NIL != stringp(str) : "! stringp(str) " + ("Types.stringp(str) " + "CommonSymbols.NIL != Types.stringp(str) ") + str;
        return remove(CHAR_lparen, remove(CHAR_rparen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject draw_fts_output_table_alt(SubLObject output_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ranking = ZERO_INTEGER;
                SubLObject bgcolor = NIL;
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
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt69$50_);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL == $cb_show_enhanced_tables$.getDynamicValue(thread)) {
                            bgcolor = html_macros.$html_color_lighter_blue$.getDynamicValue(thread);
                        }
                        {
                            SubLObject color_toggle = NIL;
                            SubLObject list_var = NIL;
                            SubLObject v_term = NIL;
                            SubLObject ignore_me = NIL;
                            for (list_var = output_terms, v_term = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                if (NIL != $cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                    if (NIL != color_toggle) {
                                        color_toggle = NIL;
                                    } else {
                                        color_toggle = T;
                                    }
                                    bgcolor = (NIL != color_toggle) ? ((SubLObject) (html_macros.$html_color_light_cyan$.getDynamicValue(thread))) : html_macros.$html_color_lighter_blue$.getDynamicValue(thread);
                                }
                                ranking = add(ranking, ONE_INTEGER);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(bgcolor);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ(ranking);
                                                html_glyph($NBSP, THREE_INTEGER);
                                                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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
            }
            return NIL;
        }
    }

    public static SubLObject draw_fts_output_table(final SubLObject output_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ranking = ZERO_INTEGER;
        SubLObject bgcolor = NIL;
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(THREE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str74$50_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject color_toggle = NIL;
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject ignore_me = NIL;
            list_var = output_terms;
            v_term = list_var.first();
            for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                if (NIL != color_toggle) {
                    color_toggle = NIL;
                } else {
                    color_toggle = T;
                }
                bgcolor = (NIL != color_toggle) ? html_macros.$html_color_light_cyan$.getGlobalValue() : html_macros.$html_color_lighter_blue$.getGlobalValue();
                ranking = add(ranking, ONE_INTEGER);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(ranking);
                        html_glyph($NBSP, THREE_INTEGER);
                        cb_form(v_term, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject read_fts_term_inputs_alt(SubLObject terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constants = NIL;
                SubLObject index = ZERO_INTEGER;
                while (index.numL(length(terms))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_object = read_from_string_ignoring_errors(terms, NIL, $EOF, index, UNPROVIDED);
                        SubLObject next_index = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (v_object == $EOF) {
                            index = length(terms);
                        } else {
                            if (next_index == $ERROR) {
                                return cb_error($str_alt73$Error_reading_terms___Check_for_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (v_object.isSymbol()) {
                                    v_object = constant_completion_high.constant_complete(symbol_name(v_object), NIL, T, UNPROVIDED, UNPROVIDED).first();
                                }
                                if (NIL != constant_p(v_object)) {
                                    {
                                        SubLObject item_var = v_object;
                                        if (NIL == member(item_var, constants, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            constants = cons(item_var, constants);
                                        }
                                    }
                                }
                                if (next_index.isInteger()) {
                                    index = next_index;
                                } else {
                                    index = length(terms);
                                }
                            }
                        }
                    }
                } 
                return constants;
            }
        }
    }

    public static SubLObject read_fts_term_inputs(final SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = NIL;
        SubLObject index = ZERO_INTEGER;
        while (index.numL(length(terms))) {
            thread.resetMultipleValues();
            SubLObject v_object = read_from_string_ignoring_errors(terms, NIL, $EOF, index, UNPROVIDED);
            final SubLObject next_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (v_object == $EOF) {
                index = length(terms);
            } else {
                if (next_index == $ERROR) {
                    return cb_error($str78$Error_reading_terms___Check_for_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (v_object.isSymbol()) {
                    v_object = constant_completion_high.constant_complete(symbol_name(v_object), NIL, T, UNPROVIDED, UNPROVIDED).first();
                }
                if (NIL != constant_p(v_object)) {
                    final SubLObject item_var = v_object;
                    if (NIL == member(item_var, constants, symbol_function(EQL), symbol_function(IDENTITY))) {
                        constants = cons(item_var, constants);
                    }
                }
                if (next_index.isInteger()) {
                    index = next_index;
                } else {
                    index = length(terms);
                }
            }
        } 
        return constants;
    }

    public static final SubLObject handle_get_followup_suggestions_alt(SubLObject args) {
        {
            SubLObject terms = com.cyc.cycjava.cycl.predicate_suggestor.strip_parens(html_extract_input($$$terms, args));
            SubLObject constants = com.cyc.cycjava.cycl.predicate_suggestor.read_fts_term_inputs(terms);
            SubLObject usable_inputs = NIL;
            SubLObject sort_symbol = $BEST;
            SubLObject cap = read_from_string(html_extract_input($$$cap, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject expert = list_utilities.sublisp_boolean(html_extract_input($$$expert, args));
            SubLObject allow_non_preds = list_utilities.sublisp_boolean(html_extract_input($str_alt65$allow_non_preds, args));
            SubLObject cdolist_list_var = constants;
            SubLObject v_const = NIL;
            for (v_const = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_const = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.predicate_suggestor.fts_unusable_termP(v_const)) {
                    usable_inputs = cons(v_const, usable_inputs);
                }
            }
            if (NIL == usable_inputs) {
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str_alt74$No_usable_input_constants_);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                return NIL;
            }
            {
                SubLObject output_terms = (NIL == allow_non_preds) ? ((SubLObject) (list_utilities.remove_if_not(PREDICATE_P, com.cyc.cycjava.cycl.predicate_suggestor.suggested_terms_from_terms(usable_inputs, sort_symbol, cap, expert), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : com.cyc.cycjava.cycl.predicate_suggestor.suggested_terms_from_terms(usable_inputs, sort_symbol, cap, expert);
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str_alt75$Terms_related_to_);
                html_princ(usable_inputs);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(TWO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                com.cyc.cycjava.cycl.predicate_suggestor.draw_fts_output_table(output_terms);
            }
        }
        html_newline(UNPROVIDED);
        cb_back_button(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject handle_get_followup_suggestions(final SubLObject args) {
        final SubLObject terms = strip_parens(html_extract_input($$$terms, args));
        final SubLObject constants = read_fts_term_inputs(terms);
        SubLObject usable_inputs = NIL;
        final SubLObject sort_symbol = $BEST;
        final SubLObject cap = read_from_string(html_extract_input($$$cap, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject expert = list_utilities.sublisp_boolean(html_extract_input($$$expert, args));
        final SubLObject allow_non_preds = list_utilities.sublisp_boolean(html_extract_input($str70$allow_non_preds, args));
        SubLObject cdolist_list_var = constants;
        SubLObject v_const = NIL;
        v_const = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == fts_unusable_termP(v_const)) {
                usable_inputs = cons(v_const, usable_inputs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_const = cdolist_list_var.first();
        } 
        if (NIL == usable_inputs) {
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(TWO_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($str79$No_usable_input_constants_);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(TWO_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            return NIL;
        }
        final SubLObject output_terms = (NIL == allow_non_preds) ? list_utilities.remove_if_not(PREDICATE_P, suggested_terms_from_terms(usable_inputs, sort_symbol, cap, expert), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : suggested_terms_from_terms(usable_inputs, sort_symbol, cap, expert);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(TWO_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($$$Terms_related_to_);
        html_princ(usable_inputs);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(TWO_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        draw_fts_output_table(output_terms);
        html_newline(UNPROVIDED);
        cb_back_button(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject declare_predicate_suggestor_file_alt() {
        declareFunction("get_term_values_from_dict", "GET-TERM-VALUES-FROM-DICT", 1, 0, false);
        declareFunction("counted_alist_from_list", "COUNTED-ALIST-FROM-LIST", 1, 0, false);
        declareFunction("sort_list_by_count", "SORT-LIST-BY-COUNT", 1, 0, false);
        declareFunction("fts_init_index", "FTS-INIT-INDEX", 0, 0, false);
        declareFunction("fts_term_antecedents_raw", "FTS-TERM-ANTECEDENTS-RAW", 1, 0, false);
        declareFunction("fts_term_consequents_raw", "FTS-TERM-CONSEQUENTS-RAW", 1, 0, false);
        declareFunction("fts_term_joint_antecedents_raw", "FTS-TERM-JOINT-ANTECEDENTS-RAW", 1, 0, false);
        declareFunction("fts_term_antecedents", "FTS-TERM-ANTECEDENTS", 1, 0, false);
        declareFunction("fts_term_consequents", "FTS-TERM-CONSEQUENTS", 1, 0, false);
        declareFunction("fts_term_joint_antecedents", "FTS-TERM-JOINT-ANTECEDENTS", 1, 0, false);
        declareFunction("fts_term_element_list", "FTS-TERM-ELEMENT-LIST", 1, 0, false);
        declareFunction("fts_term_antecedent_count", "FTS-TERM-ANTECEDENT-COUNT", 1, 0, false);
        declareFunction("fts_term_consequent_count", "FTS-TERM-CONSEQUENT-COUNT", 1, 0, false);
        declareFunction("fts_term_joint_antecedent_count", "FTS-TERM-JOINT-ANTECEDENT-COUNT", 1, 0, false);
        declareFunction("fts_term_element_count", "FTS-TERM-ELEMENT-COUNT", 1, 0, false);
        declareFunction("fts_antecedent_index_push_list", "FTS-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("fts_consequent_index_push_list", "FTS-CONSEQUENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("fts_joint_antecedent_index_push_list", "FTS-JOINT-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("fts_update_entry_with_new_terms", "FTS-UPDATE-ENTRY-WITH-NEW-TERMS", 2, 0, false);
        declareFunction("fts_expert_termP", "FTS-EXPERT-TERM?", 1, 0, false);
        declareFunction("fts_additional_excluded_terms", "FTS-ADDITIONAL-EXCLUDED-TERMS", 0, 0, false);
        declareFunction("fts_excluded_termP", "FTS-EXCLUDED-TERM?", 1, 0, false);
        declareFunction("fts_unusable_termP", "FTS-UNUSABLE-TERM?", 1, 0, false);
        declareFunction("rule_connectivity_graph_builtP", "RULE-CONNECTIVITY-GRAPH-BUILT?", 0, 0, false);
        declareFunction("rebuild_rule_connectivity_graph", "REBUILD-RULE-CONNECTIVITY-GRAPH", 0, 0, false);
        declareFunction("fts_init_via_rules", "FTS-INIT-VIA-RULES", 0, 0, false);
        declareFunction("fts_init_via_rmp_gafs", "FTS-INIT-VIA-RMP-GAFS", 0, 0, false);
        declareFunction("fts_init_handle_rule", "FTS-INIT-HANDLE-RULE", 1, 0, false);
        declareFunction("fts_init_handle_rmp_gaf", "FTS-INIT-HANDLE-RMP-GAF", 1, 0, false);
        declareFunction("fts_init_handle_rule_formula", "FTS-INIT-HANDLE-RULE-FORMULA", 1, 0, false);
        declareFunction("dump_rule_connectivity_graph_to_stream", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM", 1, 0, false);
        declareFunction("load_rule_connectivity_graph_from_stream", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM", 1, 0, false);
        declareFunction("dump_rule_connectivity_graph_to_stream_int", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM-INT", 2, 0, false);
        declareFunction("load_rule_connectivity_graph_from_stream_int", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM-INT", 1, 0, false);
        declareFunction("fts_term_related_terms_with_counts", "FTS-TERM-RELATED-TERMS-WITH-COUNTS", 1, 0, false);
        declareFunction("fts_term_related_terms_by_relevance", "FTS-TERM-RELATED-TERMS-BY-RELEVANCE", 1, 0, false);
        declareFunction("fts_term_related_terms_by_count", "FTS-TERM-RELATED-TERMS-BY-COUNT", 1, 0, false);
        declareFunction("fts_term_related_terms", "FTS-TERM-RELATED-TERMS", 1, 0, false);
        declareFunction("weight_termlist_by_name", "WEIGHT-TERMLIST-BY-NAME", 2, 0, false);
        declareFunction("weight_termlist_by_total_occurrences", "WEIGHT-TERMLIST-BY-TOTAL-OCCURRENCES", 3, 0, false);
        declareFunction("weight_termlist_by_intersection_of_inputs", "WEIGHT-TERMLIST-BY-INTERSECTION-OF-INPUTS", 4, 0, false);
        declareFunction("terms_from_terms_sorted", "TERMS-FROM-TERMS-SORTED", 1, 3, false);
        declareFunction("suggested_terms_from_terms", "SUGGESTED-TERMS-FROM-TERMS", 1, 3, false);
        declareFunction("suggested_predicates_from_predicates", "SUGGESTED-PREDICATES-FROM-PREDICATES", 1, 3, false);
        declareFunction("suggested_predicate_sort_type_p", "SUGGESTED-PREDICATE-SORT-TYPE-P", 1, 0, false);
        declareFunction("create_suggested_predicate_sentences_for_predicates", "CREATE-SUGGESTED-PREDICATE-SENTENCES-FOR-PREDICATES", 1, 3, false);
        declareFunction("create_sentences_for_predicates", "CREATE-SENTENCES-FOR-PREDICATES", 1, 0, false);
        declareFunction("cb_link_get_suggested_followups", "CB-LINK-GET-SUGGESTED-FOLLOWUPS", 0, 1, false);
        declareFunction("get_suggested_followups", "GET-SUGGESTED-FOLLOWUPS", 1, 0, false);
        declareFunction("get_suggested_followups_int", "GET-SUGGESTED-FOLLOWUPS-INT", 1, 0, false);
        declareFunction("strip_parens", "STRIP-PARENS", 1, 0, false);
        declareFunction("draw_fts_output_table", "DRAW-FTS-OUTPUT-TABLE", 1, 0, false);
        declareFunction("read_fts_term_inputs", "READ-FTS-TERM-INPUTS", 1, 0, false);
        declareFunction("handle_get_followup_suggestions", "HANDLE-GET-FOLLOWUP-SUGGESTIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_predicate_suggestor_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("get_term_values_from_dict", "GET-TERM-VALUES-FROM-DICT", 1, 0, false);
            declareFunction("counted_alist_from_list", "COUNTED-ALIST-FROM-LIST", 1, 0, false);
            declareFunction("sort_list_by_count", "SORT-LIST-BY-COUNT", 1, 0, false);
            declareFunction("fts_init_index", "FTS-INIT-INDEX", 0, 0, false);
            declareFunction("fts_term_antecedents_raw", "FTS-TERM-ANTECEDENTS-RAW", 1, 0, false);
            declareFunction("fts_term_consequents_raw", "FTS-TERM-CONSEQUENTS-RAW", 1, 0, false);
            declareFunction("fts_term_joint_antecedents_raw", "FTS-TERM-JOINT-ANTECEDENTS-RAW", 1, 0, false);
            declareFunction("fts_term_antecedents", "FTS-TERM-ANTECEDENTS", 1, 0, false);
            declareFunction("fts_term_consequents", "FTS-TERM-CONSEQUENTS", 1, 0, false);
            declareFunction("fts_term_joint_antecedents", "FTS-TERM-JOINT-ANTECEDENTS", 1, 0, false);
            declareFunction("fts_term_element_list", "FTS-TERM-ELEMENT-LIST", 1, 0, false);
            declareFunction("fts_term_antecedent_count", "FTS-TERM-ANTECEDENT-COUNT", 1, 0, false);
            declareFunction("fts_term_consequent_count", "FTS-TERM-CONSEQUENT-COUNT", 1, 0, false);
            declareFunction("fts_term_joint_antecedent_count", "FTS-TERM-JOINT-ANTECEDENT-COUNT", 1, 0, false);
            declareFunction("fts_term_element_count", "FTS-TERM-ELEMENT-COUNT", 1, 0, false);
            declareFunction("fts_antecedent_index_push_list", "FTS-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
            declareFunction("fts_consequent_index_push_list", "FTS-CONSEQUENT-INDEX-PUSH-LIST", 2, 0, false);
            declareFunction("fts_joint_antecedent_index_push_list", "FTS-JOINT-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
            declareFunction("fts_update_entry_with_new_terms", "FTS-UPDATE-ENTRY-WITH-NEW-TERMS", 2, 0, false);
            declareFunction("fts_expert_termP", "FTS-EXPERT-TERM?", 1, 0, false);
            declareFunction("fts_additional_excluded_terms", "FTS-ADDITIONAL-EXCLUDED-TERMS", 0, 0, false);
            declareFunction("fts_excluded_termP", "FTS-EXCLUDED-TERM?", 1, 0, false);
            declareFunction("fts_unusable_termP", "FTS-UNUSABLE-TERM?", 1, 0, false);
            declareFunction("rule_connectivity_graph_builtP", "RULE-CONNECTIVITY-GRAPH-BUILT?", 0, 0, false);
            declareFunction("rebuild_rule_connectivity_graph", "REBUILD-RULE-CONNECTIVITY-GRAPH", 0, 0, false);
            declareFunction("fts_init_via_rules", "FTS-INIT-VIA-RULES", 0, 0, false);
            declareFunction("fts_init_via_rmp_gafs", "FTS-INIT-VIA-RMP-GAFS", 0, 0, false);
            declareFunction("fts_init_handle_rule", "FTS-INIT-HANDLE-RULE", 1, 0, false);
            declareFunction("fts_init_handle_rmp_gaf", "FTS-INIT-HANDLE-RMP-GAF", 1, 0, false);
            declareFunction("fts_init_handle_rule_formula", "FTS-INIT-HANDLE-RULE-FORMULA", 1, 0, false);
            declareFunction("dump_rule_connectivity_graph_to_stream", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM", 1, 0, false);
            declareFunction("load_rule_connectivity_graph_from_stream", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM", 1, 0, false);
            declareFunction("dump_rule_connectivity_graph_to_stream_int", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM-INT", 2, 0, false);
            declareFunction("load_rule_connectivity_graph_from_stream_int", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM-INT", 1, 0, false);
            declareFunction("fts_term_related_terms_with_counts", "FTS-TERM-RELATED-TERMS-WITH-COUNTS", 1, 0, false);
            declareFunction("fts_term_related_terms_by_relevance", "FTS-TERM-RELATED-TERMS-BY-RELEVANCE", 1, 0, false);
            declareFunction("fts_term_related_terms_by_count", "FTS-TERM-RELATED-TERMS-BY-COUNT", 1, 0, false);
            declareFunction("fts_term_related_terms", "FTS-TERM-RELATED-TERMS", 1, 0, false);
            declareFunction("weight_termlist_by_name", "WEIGHT-TERMLIST-BY-NAME", 2, 0, false);
            declareFunction("weight_termlist_by_total_occurrences", "WEIGHT-TERMLIST-BY-TOTAL-OCCURRENCES", 3, 0, false);
            declareFunction("weight_termlist_by_intersection_of_inputs", "WEIGHT-TERMLIST-BY-INTERSECTION-OF-INPUTS", 4, 0, false);
            declareFunction("terms_from_terms_sorted", "TERMS-FROM-TERMS-SORTED", 1, 3, false);
            declareFunction("suggested_terms_from_terms", "SUGGESTED-TERMS-FROM-TERMS", 1, 3, false);
            declareFunction("suggested_predicates_from_predicates", "SUGGESTED-PREDICATES-FROM-PREDICATES", 1, 3, false);
            declareFunction("suggested_predicate_sort_type_p", "SUGGESTED-PREDICATE-SORT-TYPE-P", 1, 0, false);
            declareFunction("create_suggested_predicate_sentences_for_predicates", "CREATE-SUGGESTED-PREDICATE-SENTENCES-FOR-PREDICATES", 1, 3, false);
            declareFunction("create_sentences_for_predicates", "CREATE-SENTENCES-FOR-PREDICATES", 1, 0, false);
            declareFunction("get_suggested_followups", "GET-SUGGESTED-FOLLOWUPS", 1, 0, false);
            declareFunction("get_suggested_followups_int", "GET-SUGGESTED-FOLLOWUPS-INT", 1, 0, false);
            declareFunction("strip_parens", "STRIP-PARENS", 1, 0, false);
            declareFunction("draw_fts_output_table", "DRAW-FTS-OUTPUT-TABLE", 1, 0, false);
            declareFunction("read_fts_term_inputs", "READ-FTS-TERM-INPUTS", 1, 0, false);
            declareFunction("handle_get_followup_suggestions", "HANDLE-GET-FOLLOWUP-SUGGESTIONS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_link_get_suggested_followups", "CB-LINK-GET-SUGGESTED-FOLLOWUPS", 0, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_predicate_suggestor_file_Previous() {
        declareFunction("get_term_values_from_dict", "GET-TERM-VALUES-FROM-DICT", 1, 0, false);
        declareFunction("counted_alist_from_list", "COUNTED-ALIST-FROM-LIST", 1, 0, false);
        declareFunction("sort_list_by_count", "SORT-LIST-BY-COUNT", 1, 0, false);
        declareFunction("fts_init_index", "FTS-INIT-INDEX", 0, 0, false);
        declareFunction("fts_term_antecedents_raw", "FTS-TERM-ANTECEDENTS-RAW", 1, 0, false);
        declareFunction("fts_term_consequents_raw", "FTS-TERM-CONSEQUENTS-RAW", 1, 0, false);
        declareFunction("fts_term_joint_antecedents_raw", "FTS-TERM-JOINT-ANTECEDENTS-RAW", 1, 0, false);
        declareFunction("fts_term_antecedents", "FTS-TERM-ANTECEDENTS", 1, 0, false);
        declareFunction("fts_term_consequents", "FTS-TERM-CONSEQUENTS", 1, 0, false);
        declareFunction("fts_term_joint_antecedents", "FTS-TERM-JOINT-ANTECEDENTS", 1, 0, false);
        declareFunction("fts_term_element_list", "FTS-TERM-ELEMENT-LIST", 1, 0, false);
        declareFunction("fts_term_antecedent_count", "FTS-TERM-ANTECEDENT-COUNT", 1, 0, false);
        declareFunction("fts_term_consequent_count", "FTS-TERM-CONSEQUENT-COUNT", 1, 0, false);
        declareFunction("fts_term_joint_antecedent_count", "FTS-TERM-JOINT-ANTECEDENT-COUNT", 1, 0, false);
        declareFunction("fts_term_element_count", "FTS-TERM-ELEMENT-COUNT", 1, 0, false);
        declareFunction("fts_antecedent_index_push_list", "FTS-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("fts_consequent_index_push_list", "FTS-CONSEQUENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("fts_joint_antecedent_index_push_list", "FTS-JOINT-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("fts_update_entry_with_new_terms", "FTS-UPDATE-ENTRY-WITH-NEW-TERMS", 2, 0, false);
        declareFunction("fts_expert_termP", "FTS-EXPERT-TERM?", 1, 0, false);
        declareFunction("fts_additional_excluded_terms", "FTS-ADDITIONAL-EXCLUDED-TERMS", 0, 0, false);
        declareFunction("fts_excluded_termP", "FTS-EXCLUDED-TERM?", 1, 0, false);
        declareFunction("fts_unusable_termP", "FTS-UNUSABLE-TERM?", 1, 0, false);
        declareFunction("rule_connectivity_graph_builtP", "RULE-CONNECTIVITY-GRAPH-BUILT?", 0, 0, false);
        declareFunction("rebuild_rule_connectivity_graph", "REBUILD-RULE-CONNECTIVITY-GRAPH", 0, 0, false);
        declareFunction("fts_init_via_rules", "FTS-INIT-VIA-RULES", 0, 0, false);
        declareFunction("fts_init_via_rmp_gafs", "FTS-INIT-VIA-RMP-GAFS", 0, 0, false);
        declareFunction("fts_init_handle_rule", "FTS-INIT-HANDLE-RULE", 1, 0, false);
        declareFunction("fts_init_handle_rmp_gaf", "FTS-INIT-HANDLE-RMP-GAF", 1, 0, false);
        declareFunction("fts_init_handle_rule_formula", "FTS-INIT-HANDLE-RULE-FORMULA", 1, 0, false);
        declareFunction("dump_rule_connectivity_graph_to_stream", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM", 1, 0, false);
        declareFunction("load_rule_connectivity_graph_from_stream", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM", 1, 0, false);
        declareFunction("dump_rule_connectivity_graph_to_stream_int", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM-INT", 2, 0, false);
        declareFunction("load_rule_connectivity_graph_from_stream_int", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM-INT", 1, 0, false);
        declareFunction("fts_term_related_terms_with_counts", "FTS-TERM-RELATED-TERMS-WITH-COUNTS", 1, 0, false);
        declareFunction("fts_term_related_terms_by_relevance", "FTS-TERM-RELATED-TERMS-BY-RELEVANCE", 1, 0, false);
        declareFunction("fts_term_related_terms_by_count", "FTS-TERM-RELATED-TERMS-BY-COUNT", 1, 0, false);
        declareFunction("fts_term_related_terms", "FTS-TERM-RELATED-TERMS", 1, 0, false);
        declareFunction("weight_termlist_by_name", "WEIGHT-TERMLIST-BY-NAME", 2, 0, false);
        declareFunction("weight_termlist_by_total_occurrences", "WEIGHT-TERMLIST-BY-TOTAL-OCCURRENCES", 3, 0, false);
        declareFunction("weight_termlist_by_intersection_of_inputs", "WEIGHT-TERMLIST-BY-INTERSECTION-OF-INPUTS", 4, 0, false);
        declareFunction("terms_from_terms_sorted", "TERMS-FROM-TERMS-SORTED", 1, 3, false);
        declareFunction("suggested_terms_from_terms", "SUGGESTED-TERMS-FROM-TERMS", 1, 3, false);
        declareFunction("suggested_predicates_from_predicates", "SUGGESTED-PREDICATES-FROM-PREDICATES", 1, 3, false);
        declareFunction("suggested_predicate_sort_type_p", "SUGGESTED-PREDICATE-SORT-TYPE-P", 1, 0, false);
        declareFunction("create_suggested_predicate_sentences_for_predicates", "CREATE-SUGGESTED-PREDICATE-SENTENCES-FOR-PREDICATES", 1, 3, false);
        declareFunction("create_sentences_for_predicates", "CREATE-SENTENCES-FOR-PREDICATES", 1, 0, false);
        declareFunction("get_suggested_followups", "GET-SUGGESTED-FOLLOWUPS", 1, 0, false);
        declareFunction("get_suggested_followups_int", "GET-SUGGESTED-FOLLOWUPS-INT", 1, 0, false);
        declareFunction("strip_parens", "STRIP-PARENS", 1, 0, false);
        declareFunction("draw_fts_output_table", "DRAW-FTS-OUTPUT-TABLE", 1, 0, false);
        declareFunction("read_fts_term_inputs", "READ-FTS-TERM-INPUTS", 1, 0, false);
        declareFunction("handle_get_followup_suggestions", "HANDLE-GET-FOLLOWUP-SUGGESTIONS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_predicate_suggestor_file_alt() {
        deflexical("*FTS-ANTECEDENT-INDEX*", NIL != boundp($fts_antecedent_index$) ? ((SubLObject) ($fts_antecedent_index$.getGlobalValue())) : NIL);
        deflexical("*FTS-CONSEQUENT-INDEX*", NIL != boundp($fts_consequent_index$) ? ((SubLObject) ($fts_consequent_index$.getGlobalValue())) : NIL);
        deflexical("*FTS-JOINT-ANTECEDENT-INDEX*", NIL != boundp($fts_joint_antecedent_index$) ? ((SubLObject) ($fts_joint_antecedent_index$.getGlobalValue())) : NIL);
        defconstant("*FTS-EXPERT-TERM-COLL*", $$TermSuggestorExpertOnlyTerm);
        defparameter("*FTS-EXPERT-TERMS*", keyhash.new_keyhash($int$5000, UNPROVIDED));
        defconstant("*FTS-EXCLUDED-TERM-COLL*", $$TermSuggestorNonIndexedTerm);
        defparameter("*FTS-EXCLUDED-TERMS*", keyhash.new_keyhash($int$6000, UNPROVIDED));
        defparameter("*SUGGESTED-PREDICATE-SORT-TYPES*", $list_alt36);
        return NIL;
    }

    public static SubLObject init_predicate_suggestor_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*FTS-ANTECEDENT-INDEX*", SubLTrampolineFile.maybeDefault($fts_antecedent_index$, $fts_antecedent_index$, NIL));
            deflexical("*FTS-CONSEQUENT-INDEX*", SubLTrampolineFile.maybeDefault($fts_consequent_index$, $fts_consequent_index$, NIL));
            deflexical("*FTS-JOINT-ANTECEDENT-INDEX*", SubLTrampolineFile.maybeDefault($fts_joint_antecedent_index$, $fts_joint_antecedent_index$, NIL));
            defconstant("*FTS-EXPERT-TERM-COLL*", $$TermSuggestorExpertOnlyTerm);
            defparameter("*FTS-EXPERT-TERMS*", keyhash.new_keyhash($int$5000, UNPROVIDED));
            defconstant("*FTS-EXCLUDED-TERM-COLL*", $$TermSuggestorNonIndexedTerm);
            defparameter("*FTS-EXCLUDED-TERMS*", keyhash.new_keyhash($int$6000, UNPROVIDED));
            defparameter("*SUGGESTED-PREDICATE-SORT-TYPES*", $list39);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*FTS-ANTECEDENT-INDEX*", NIL != boundp($fts_antecedent_index$) ? ((SubLObject) ($fts_antecedent_index$.getGlobalValue())) : NIL);
            deflexical("*FTS-CONSEQUENT-INDEX*", NIL != boundp($fts_consequent_index$) ? ((SubLObject) ($fts_consequent_index$.getGlobalValue())) : NIL);
            deflexical("*FTS-JOINT-ANTECEDENT-INDEX*", NIL != boundp($fts_joint_antecedent_index$) ? ((SubLObject) ($fts_joint_antecedent_index$.getGlobalValue())) : NIL);
            defparameter("*SUGGESTED-PREDICATE-SORT-TYPES*", $list_alt36);
        }
        return NIL;
    }

    public static SubLObject init_predicate_suggestor_file_Previous() {
        deflexical("*FTS-ANTECEDENT-INDEX*", SubLTrampolineFile.maybeDefault($fts_antecedent_index$, $fts_antecedent_index$, NIL));
        deflexical("*FTS-CONSEQUENT-INDEX*", SubLTrampolineFile.maybeDefault($fts_consequent_index$, $fts_consequent_index$, NIL));
        deflexical("*FTS-JOINT-ANTECEDENT-INDEX*", SubLTrampolineFile.maybeDefault($fts_joint_antecedent_index$, $fts_joint_antecedent_index$, NIL));
        defconstant("*FTS-EXPERT-TERM-COLL*", $$TermSuggestorExpertOnlyTerm);
        defparameter("*FTS-EXPERT-TERMS*", keyhash.new_keyhash($int$5000, UNPROVIDED));
        defconstant("*FTS-EXCLUDED-TERM-COLL*", $$TermSuggestorNonIndexedTerm);
        defparameter("*FTS-EXCLUDED-TERMS*", keyhash.new_keyhash($int$6000, UNPROVIDED));
        defparameter("*SUGGESTED-PREDICATE-SORT-TYPES*", $list39);
        return NIL;
    }

    public static final SubLObject setup_predicate_suggestor_file_alt() {
        declare_defglobal($fts_antecedent_index$);
        declare_defglobal($fts_consequent_index$);
        declare_defglobal($fts_joint_antecedent_index$);
        register_external_symbol(CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES);
        register_external_symbol(CREATE_SENTENCES_FOR_PREDICATES);
        setup_cb_link_method($GET_SUGGESTED_FOLLOWUPS, CB_LINK_GET_SUGGESTED_FOLLOWUPS, ONE_INTEGER);
        declare_cb_tool($GET_SUGGESTED_FOLLOWUPS, $$$Followup_Term_Suggestor, $$$Foll, $str_alt46$Suggest_possible_follow_up_terms_);
        html_macros.note_html_handler_function(GET_SUGGESTED_FOLLOWUPS);
        html_macros.note_html_handler_function(HANDLE_GET_FOLLOWUP_SUGGESTIONS);
        return NIL;
    }

    public static SubLObject setup_predicate_suggestor_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($fts_antecedent_index$);
            declare_defglobal($fts_consequent_index$);
            declare_defglobal($fts_joint_antecedent_index$);
            register_external_symbol(CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES);
            register_external_symbol(CREATE_SENTENCES_FOR_PREDICATES);
            html_macros.note_cgi_handler_function(GET_SUGGESTED_FOLLOWUPS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HANDLE_GET_FOLLOWUP_SUGGESTIONS, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            setup_cb_link_method($GET_SUGGESTED_FOLLOWUPS, CB_LINK_GET_SUGGESTED_FOLLOWUPS, ONE_INTEGER);
            declare_cb_tool($GET_SUGGESTED_FOLLOWUPS, $$$Followup_Term_Suggestor, $$$Foll, $str_alt46$Suggest_possible_follow_up_terms_);
            html_macros.note_html_handler_function(GET_SUGGESTED_FOLLOWUPS);
            html_macros.note_html_handler_function(HANDLE_GET_FOLLOWUP_SUGGESTIONS);
        }
        return NIL;
    }

    public static SubLObject setup_predicate_suggestor_file_Previous() {
        declare_defglobal($fts_antecedent_index$);
        declare_defglobal($fts_consequent_index$);
        declare_defglobal($fts_joint_antecedent_index$);
        register_external_symbol(CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES);
        register_external_symbol(CREATE_SENTENCES_FOR_PREDICATES);
        html_macros.note_cgi_handler_function(GET_SUGGESTED_FOLLOWUPS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_GET_FOLLOWUP_SUGGESTIONS, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_predicate_suggestor_file();
    }

    @Override
    public void initializeVariables() {
        init_predicate_suggestor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_predicate_suggestor_file();
    }

    

    static private final SubLString $str_alt11$Initializing_predicate_connectivi = makeString("Initializing predicate connectivity from KB rules");

    static private final SubLString $str_alt13$_A = makeString("~A");

    static private final SubLString $str_alt17$Initializing_predicate_connectivi = makeString("Initializing predicate connectivity from rule macro predicate GAFs");

    static private final SubLSymbol $sym20$FTS_UNUSABLE_TERM_ = makeSymbol("FTS-UNUSABLE-TERM?");

    static private final SubLSymbol $sym22$STRING_LENGTH__ = makeSymbol("STRING-LENGTH-<");

    static private final SubLString $str_alt32$Bad_sort_type__S_ = makeString("Bad sort-type ~S!");

    static private final SubLSymbol $sym33$FTS_EXPERT_TERM_ = makeSymbol("FTS-EXPERT-TERM?");

    static private final SubLList $list_alt36 = list(makeKeyword("INTERSECT"), makeKeyword("OCCURRENCES"), makeKeyword("LENGTH"), makeKeyword("INTERSECT-COMPLEX"), $BEST);

    static private final SubLString $str_alt39$_Followup_Term_Suggestion_ = makeString("[Followup Term Suggestion]");

    static private final SubLString $str_alt41$get_suggested_followups = makeString("get-suggested-followups");

    private static final SubLSymbol $GET_SUGGESTED_FOLLOWUPS = makeKeyword("GET-SUGGESTED-FOLLOWUPS");

    private static final SubLSymbol CB_LINK_GET_SUGGESTED_FOLLOWUPS = makeSymbol("CB-LINK-GET-SUGGESTED-FOLLOWUPS");

    static private final SubLString $$$Followup_Term_Suggestor = makeString("Followup Term Suggestor");

    static private final SubLString $$$Foll = makeString("Foll");

    static private final SubLString $str_alt46$Suggest_possible_follow_up_terms_ = makeString("Suggest possible follow-up terms for conceptual relationships");

    static private final SubLString $str_alt50$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt51$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt52$handle_get_followup_suggestions = makeString("handle-get-followup-suggestions");

    static private final SubLString $str_alt53$Enter_constants_separated_by_whit = makeString("Enter constants separated by whitespace: ");

    static private final SubLString $str_alt60$Maximum_number_of_results__ = makeString("Maximum number of results: ");

    static private final SubLString $str_alt64$Allow_non_predicate_outputs__ = makeString("Allow non-predicate outputs: ");

    static private final SubLString $str_alt65$allow_non_preds = makeString("allow-non-preds");

    static private final SubLString $str_alt66$Show_expert_level_terms__ = makeString("Show expert-level terms: ");

    static private final SubLString $str_alt69$50_ = makeString("50%");

    static private final SubLString $str_alt73$Error_reading_terms___Check_for_t = makeString("Error reading terms.  Check for typos.");

    static private final SubLString $str_alt74$No_usable_input_constants_ = makeString("No usable input constants.");

    static private final SubLString $str_alt75$Terms_related_to_ = makeString("Terms related to ");
}

/**
 * Total time: 496 ms
 */
