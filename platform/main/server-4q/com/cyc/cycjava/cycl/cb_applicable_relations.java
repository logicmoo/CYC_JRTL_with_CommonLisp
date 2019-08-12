/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-APPLICABLE-RELATIONS
 * source file: /cyc/top/cycl/cb-applicable-relations.lisp
 * created:     2019/07/03 17:38:06
 */
public final class cb_applicable_relations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_applicable_relations();

 public static final String myName = "com.cyc.cycjava.cycl.cb_applicable_relations";


    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $CB_APPLICABLE_RELATIONS = makeKeyword("CB-APPLICABLE-RELATIONS");

    static private final SubLString $str1$cb_applicable_relations_html = makeString("cb-applicable-relations.html");

    static private final SubLString $str2$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    static private final SubLString $$$Applicable_Relations = makeString("Applicable Relations");

    private static final SubLString $str4$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str5$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str10$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$Relations_which_apply_to_ = makeString("Relations which apply to ");

    private static final SubLString $str16$___ = makeString(" : ");

    private static final SubLList $list17 = list(makeSymbol("ARG"), makeSymbol("RELATIONS"));



    private static final SubLString $str19$_dddddd = makeString("#dddddd");

    private static final SubLSymbol $GAF_ARG_PREDICATE = makeKeyword("GAF-ARG-PREDICATE");

    private static final SubLSymbol LITERAL_QUERY_NORMAL = makeSymbol("LITERAL-QUERY-NORMAL");



    private static final SubLSymbol $NART_ARG_FUNCTION = makeKeyword("NART-ARG-FUNCTION");





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol CB_APPLICABLE_RELATIONS = makeSymbol("CB-APPLICABLE-RELATIONS");

    private static final SubLString $str33$cb_applicable_relations__A = makeString("cb-applicable-relations&~A");

    private static final SubLSymbol CB_LINK_APPLICABLE_RELATIONS = makeSymbol("CB-LINK-APPLICABLE-RELATIONS");



    private static final SubLSymbol $sym38$_ = makeSymbol("<");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    private static final SubLString $str42$_GAF_Suggestor_ = makeString("[GAF Suggestor]");

    private static final SubLString $str43$cb_gaf_suggestor = makeString("cb-gaf-suggestor");

    private static final SubLSymbol CB_LINK_GAF_SUGGESTOR = makeSymbol("CB-LINK-GAF-SUGGESTOR");

    private static final SubLString $$$GAF_Suggestor = makeString("GAF Suggestor");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str48$cb_handle_gaf_suggestor = makeString("cb-handle-gaf-suggestor");

    private static final SubLSymbol $CB_GAF_SUGGESTOR = makeKeyword("CB-GAF-SUGGESTOR");

    private static final SubLString $$$Suggest_GAFs = makeString("Suggest GAFs");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$term = makeString("term");

    private static final SubLString $$$Term_ = makeString("Term ");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLSymbol CB_GAF_SUGGESTOR = makeSymbol("CB-GAF-SUGGESTOR");

    private static final SubLString $$$GAF_Suggestions = makeString("GAF Suggestions");

    private static final SubLString $str63$Terms__ = makeString("Terms :");

    private static final SubLSymbol $SENTENCE_QUERY_SIMILAR = makeKeyword("SENTENCE-QUERY-SIMILAR");

    private static final SubLString $str65$_Query_ = makeString("[Query]");

    private static final SubLString $str68$_Assert_ = makeString("[Assert]");

    private static final SubLSymbol CB_HANDLE_GAF_SUGGESTOR = makeSymbol("CB-HANDLE-GAF-SUGGESTOR");



    private static final SubLSymbol CB_SUGGEST_GAFS_FOR_TERMS = makeSymbol("CB-SUGGEST-GAFS-FOR-TERMS");

    private static final SubLSymbol $cb_suggest_gafs_for_terms_caching_state$ = makeSymbol("*CB-SUGGEST-GAFS-FOR-TERMS-CACHING-STATE*");

    // Definitions
    /**
     * Display all the relations in the KB which can apply to the given fort.
     */
    @LispMethod(comment = "Display all the relations in the KB which can apply to the given fort.")
    public static final SubLObject cb_applicable_relations_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_guess_fort(args, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    return cb_error($str_alt2$Unable_to_determine_a_term_from__, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject v_applicable_relations = com.cyc.cycjava.cycl.cb_applicable_relations.old_applicable_relations(fort);
                    SubLObject temp_relations = NIL;
                    SubLObject first_lineP = T;
                    SubLObject title_var = $$$Applicable_Relations;
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
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_markup($str_alt6$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_help_preamble($CB_APPLICABLE_RELATIONS, UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt7$Relations_which_apply_to_);
                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt8$___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                    {
                                                        SubLObject cdolist_list_var = v_applicable_relations;
                                                        SubLObject info = NIL;
                                                        for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject datum = info;
                                                                SubLObject current = datum;
                                                                SubLObject arg = NIL;
                                                                SubLObject relations = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt9);
                                                                arg = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt9);
                                                                relations = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    relations = kb_utilities.sort_terms(remove_duplicates(relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    if (NIL == $cb_skolem_applicable_relationsP$.getDynamicValue(thread)) {
                                                                        {
                                                                            SubLObject cdolist_list_var_4 = relations;
                                                                            SubLObject relation = NIL;
                                                                            for (relation = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , relation = cdolist_list_var_4.first()) {
                                                                                if (NIL == isa.isaP(relation, $$SkolemFunction, UNPROVIDED, UNPROVIDED)) {
                                                                                    {
                                                                                        SubLObject item_var = relation;
                                                                                        if (NIL == member(item_var, temp_relations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                            temp_relations = cons(item_var, temp_relations);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        relations = nreverse(temp_relations);
                                                                    }
                                                                    if (NIL != $cb_applicable_relations_one_per_lineP$.getDynamicValue(thread)) {
                                                                        html_newline(UNPROVIDED);
                                                                        cb_browser.cb_c_gaf_arg_header(arg);
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
                                                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject bgcolor = NIL;
                                                                                    if (NIL == $cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                                                        bgcolor = html_macros.$html_color_lightest_grey$.getDynamicValue(thread);
                                                                                    }
                                                                                    {
                                                                                        SubLObject color_toggle = NIL;
                                                                                        SubLObject list_var = NIL;
                                                                                        SubLObject relation = NIL;
                                                                                        SubLObject ignore_me = NIL;
                                                                                        for (list_var = relations, relation = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , relation = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                                                                            if (NIL != $cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                                                                if (NIL != color_toggle) {
                                                                                                    color_toggle = NIL;
                                                                                                } else {
                                                                                                    color_toggle = T;
                                                                                                }
                                                                                                bgcolor = (NIL != color_toggle) ? ((SubLObject) ($str_alt11$_dddddd)) : html_macros.$html_color_lightest_grey$.getDynamicValue(thread);
                                                                                            }
                                                                                            if (NIL != fort_types_interface.predicate_in_any_mtP(relation)) {
                                                                                                cb_adornments.handle_specific_adornment($GAF_ARG_PREDICATE, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation, $$InferencePSC);
                                                                                            } else {
                                                                                                if (NIL != fort_types_interface.function_in_any_mtP(relation)) {
                                                                                                    cb_adornments.handle_specific_adornment($NART_ARG_FUNCTION, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation, $$InferencePSC);
                                                                                                }
                                                                                            }
                                                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                            if (NIL != bgcolor) {
                                                                                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_markup(bgcolor);
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            cb_form(relation, UNPROVIDED, UNPROVIDED);
                                                                                                            if (NIL != $cb_paraphrase_applicable_relationsP$.getDynamicValue(thread)) {
                                                                                                                html_newline(UNPROVIDED);
                                                                                                                html_indent(FOUR_INTEGER);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_9 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                                                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                                                                        if (((NIL == isa.isaP(relation, $$SkolemFunction, UNPROVIDED, UNPROVIDED)) && (NIL == isa.isaP(relation, $$NLGenerationFunction, UNPROVIDED, UNPROVIDED))) && ((NIL != fort_types_interface.predicateP(relation)) || (NIL != fort_types_interface.functionP(relation)))) {
                                                                                                                            {
                                                                                                                                SubLObject dummy_formula = pph_utilities.pph_dummy_formula(relation, T);
                                                                                                                                list_utilities.nreplace_nth(arg, fort, dummy_formula);
                                                                                                                                {
                                                                                                                                    SubLObject ignore_errors_tag = NIL;
                                                                                                                                    try {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_10 = Errors.$error_handler$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                                                                                try {
                                                                                                                                                    html_princ(pph_main.generate_phrase(dummy_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                                                                } catch (Throwable catch_var) {
                                                                                                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                Errors.$error_handler$.rebind(_prev_bind_0_10, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (Throwable ccatch_env_var) {
                                                                                                                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_9, thread);
                                                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_8, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                                                }
                                                                                            }
                                                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                            html_source_readability_terpri(UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                    } else {
                                                                        if (NIL != first_lineP) {
                                                                            first_lineP = NIL;
                                                                        } else {
                                                                            html_newline(UNPROVIDED);
                                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                        cb_browser.cb_c_gaf_arg_header(arg);
                                                                        html_newline(UNPROVIDED);
                                                                        {
                                                                            SubLObject cdolist_list_var_11 = relations;
                                                                            SubLObject relation = NIL;
                                                                            for (relation = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , relation = cdolist_list_var_11.first()) {
                                                                                if (NIL != fort_types_interface.predicate_in_any_mtP(relation)) {
                                                                                    cb_adornments.handle_specific_adornment($GAF_ARG_PREDICATE, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation, $$InferencePSC);
                                                                                } else {
                                                                                    if (NIL != fort_types_interface.function_in_any_mtP(relation)) {
                                                                                        cb_adornments.handle_specific_adornment($NART_ARG_FUNCTION, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation, $$InferencePSC);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                                                cb_form(relation, UNPROVIDED, UNPROVIDED);
                                                                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                                                html_indent(TWO_INTEGER);
                                                                                html_terpri(UNPROVIDED);
                                                                                html_indent(TWO_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt9);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // Definitions
    /**
     * Display all the relations in the KB which can apply to the given fort.
     */
    @LispMethod(comment = "Display all the relations in the KB which can apply to the given fort.")
    public static SubLObject cb_applicable_relations(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cb_guess_fort(args, UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            return cb_error($str2$Unable_to_determine_a_term_from__, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject v_applicable_relations = old_applicable_relations(fort);
        SubLObject temp_relations = NIL;
        SubLObject first_lineP = T;
        final SubLObject title_var = $$$Applicable_Relations;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str5$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str10$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_APPLICABLE_RELATIONS, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$Relations_which_apply_to_);
                            cb_show_term(fort, UNPROVIDED, UNPROVIDED);
                            html_princ($str16$___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_hr(UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = v_applicable_relations;
                            SubLObject info = NIL;
                            info = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = info;
                                SubLObject arg = NIL;
                                SubLObject relations = NIL;
                                destructuring_bind_must_consp(current, datum, $list17);
                                arg = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list17);
                                relations = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    relations = kb_utilities.sort_terms(remove_duplicates(relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL == $cb_skolem_applicable_relationsP$.getDynamicValue(thread)) {
                                        SubLObject cdolist_list_var_$6 = relations;
                                        SubLObject relation = NIL;
                                        relation = cdolist_list_var_$6.first();
                                        while (NIL != cdolist_list_var_$6) {
                                            if (NIL == isa.isaP(relation, $$SkolemFunction, UNPROVIDED, UNPROVIDED)) {
                                                final SubLObject item_var = relation;
                                                if (NIL == member(item_var, temp_relations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    temp_relations = cons(item_var, temp_relations);
                                                }
                                            }
                                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                            relation = cdolist_list_var_$6.first();
                                        } 
                                        relations = nreverse(temp_relations);
                                    }
                                    if (NIL != $cb_applicable_relations_one_per_lineP$.getDynamicValue(thread)) {
                                        html_newline(UNPROVIDED);
                                        cb_browser.cb_c_gaf_arg_header(arg);
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
                                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            SubLObject bgcolor = NIL;
                                            SubLObject color_toggle = NIL;
                                            SubLObject list_var = NIL;
                                            SubLObject relation2 = NIL;
                                            SubLObject ignore_me = NIL;
                                            list_var = relations;
                                            relation2 = list_var.first();
                                            for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , relation2 = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                                if (NIL != color_toggle) {
                                                    color_toggle = NIL;
                                                } else {
                                                    color_toggle = T;
                                                }
                                                bgcolor = (NIL != color_toggle) ? $str19$_dddddd : html_macros.$html_color_lightest_grey$.getGlobalValue();
                                                if (NIL != fort_types_interface.predicate_in_any_mtP(relation2)) {
                                                    cb_adornments.handle_specific_adornment($GAF_ARG_PREDICATE, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation2, $$InferencePSC);
                                                } else
                                                    if (NIL != fort_types_interface.function_in_any_mtP(relation2)) {
                                                        cb_adornments.handle_specific_adornment($NART_ARG_FUNCTION, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation2, $$InferencePSC);
                                                    }

                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                if (NIL != bgcolor) {
                                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(bgcolor);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_show_term(relation2, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != $cb_paraphrase_applicable_relationsP$.getDynamicValue(thread)) {
                                                            html_newline(UNPROVIDED);
                                                            html_indent(FOUR_INTEGER);
                                                            final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                if (((NIL == isa.isaP(relation2, $$SkolemFunction, UNPROVIDED, UNPROVIDED)) && (NIL == isa.isaP(relation2, $$NLGenerationFunction, UNPROVIDED, UNPROVIDED))) && ((NIL != fort_types_interface.predicateP(relation2)) || (NIL != fort_types_interface.functionP(relation2)))) {
                                                                    final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(relation2, T);
                                                                    list_utilities.nreplace_nth(arg, fort, dummy_formula);
                                                                    SubLObject ignore_errors_tag = NIL;
                                                                    try {
                                                                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                                        final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                                                        try {
                                                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                            try {
                                                                                html_princ(pph_main.generate_phrase(dummy_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                            } catch (final Throwable catch_var) {
                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                            }
                                                                        } finally {
                                                                            Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                                                        }
                                                                    } catch (final Throwable ccatch_env_var) {
                                                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                    } finally {
                                                                        thread.throwStack.pop();
                                                                    }
                                                                }
                                                            } finally {
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$11, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$9, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } else {
                                        if (NIL != first_lineP) {
                                            first_lineP = NIL;
                                        } else {
                                            html_newline(UNPROVIDED);
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        }
                                        cb_browser.cb_c_gaf_arg_header(arg);
                                        html_newline(UNPROVIDED);
                                        SubLObject cdolist_list_var_$7 = relations;
                                        SubLObject relation = NIL;
                                        relation = cdolist_list_var_$7.first();
                                        while (NIL != cdolist_list_var_$7) {
                                            if (NIL != fort_types_interface.predicate_in_any_mtP(relation)) {
                                                cb_adornments.handle_specific_adornment($GAF_ARG_PREDICATE, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation, $$InferencePSC);
                                            } else
                                                if (NIL != fort_types_interface.function_in_any_mtP(relation)) {
                                                    cb_adornments.handle_specific_adornment($NART_ARG_FUNCTION, LITERAL_QUERY_NORMAL, $MAIN, fort, arg, relation, $$InferencePSC);
                                                }

                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            cb_show_term(relation, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_indent(TWO_INTEGER);
                                            html_terpri(UNPROVIDED);
                                            html_indent(TWO_INTEGER);
                                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                            relation = cdolist_list_var_$7.first();
                                        } 
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list17);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                info = cdolist_list_var.first();
                            } 
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_link_applicable_relations_alt(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Applicable_Relations;
            }
            {
                SubLObject frame_name_var = cb_frame_name($CONTENT);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$cb_applicable_relations__A, cb_fort_identifier(fort));
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
            return fort;
        }
    }

    public static SubLObject cb_link_applicable_relations(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Applicable_Relations;
        }
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str33$cb_applicable_relations__A, cb_fort_identifier(fort));
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
        return fort;
    }

    public static final SubLObject old_applicable_relations_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject collectionP = fort_types_interface.collectionP(fort);
                            SubLObject defn_isas = genls.all_genls($$CycLReifiableDenotationalTerm, NIL, UNPROVIDED);
                            SubLObject all_isas = isa.all_isa(fort, NIL, UNPROVIDED);
                            all_isas = nunion(all_isas, defn_isas, UNPROVIDED, UNPROVIDED);
                            all_isas = Sort.sort(all_isas, symbol_function($sym29$_), symbol_function(SPEC_CARDINALITY));
                            {
                                SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    {
                                        SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(arg, UNPROVIDED, UNPROVIDED);
                                        SubLObject arg_preds = NIL;
                                        SubLObject cdolist_list_var_12 = all_isas;
                                        SubLObject v_isa = NIL;
                                        for (v_isa = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , v_isa = cdolist_list_var_12.first()) {
                                            {
                                                SubLObject candidate_preds = kb_mapping_utilities.pred_values(v_isa, arg_isa_pred, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                                SubLObject cdolist_list_var_13 = candidate_preds;
                                                SubLObject candidate_pred = NIL;
                                                for (candidate_pred = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , candidate_pred = cdolist_list_var_13.first()) {
                                                    {
                                                        SubLObject arg_constraints_violatedP = NIL;
                                                        if (kb_indexing.num_gaf_arg_index(candidate_pred, ONE_INTEGER, arg_isa_pred, UNPROVIDED).numG(ONE_INTEGER)) {
                                                            {
                                                                SubLObject collection = NIL;
                                                                SubLObject pred_var = arg_isa_pred;
                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(candidate_pred, ONE_INTEGER, pred_var)) {
                                                                    {
                                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(candidate_pred, ONE_INTEGER, pred_var);
                                                                        SubLObject done_var = arg_constraints_violatedP;
                                                                        SubLObject token_var = NIL;
                                                                        while (NIL == done_var) {
                                                                            {
                                                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                if (NIL != valid) {
                                                                                    {
                                                                                        SubLObject final_index_iterator = NIL;
                                                                                        try {
                                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                            {
                                                                                                SubLObject done_var_14 = arg_constraints_violatedP;
                                                                                                SubLObject token_var_15 = NIL;
                                                                                                while (NIL == done_var_14) {
                                                                                                    {
                                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                                                                        SubLObject valid_16 = makeBoolean(token_var_15 != assertion);
                                                                                                        if (NIL != valid_16) {
                                                                                                            collection = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                                            if (collection != v_isa) {
                                                                                                                arg_constraints_violatedP = makeBoolean(NIL == isa.isaP(fort, collection, NIL, UNPROVIDED));
                                                                                                            }
                                                                                                        }
                                                                                                        done_var_14 = makeBoolean((NIL == valid_16) || (NIL != arg_constraints_violatedP));
                                                                                                    }
                                                                                                } 
                                                                                            }
                                                                                        } finally {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    if (NIL != final_index_iterator) {
                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                    }
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var = makeBoolean((NIL == valid) || (NIL != arg_constraints_violatedP));
                                                                            }
                                                                        } 
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL == arg_constraints_violatedP) {
                                                            {
                                                                SubLObject arg_genl_pred = kb_accessors.arg_genl_pred(arg, UNPROVIDED, UNPROVIDED);
                                                                if (kb_indexing.num_gaf_arg_index(candidate_pred, ONE_INTEGER, arg_genl_pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                                                                    arg_constraints_violatedP = makeBoolean(NIL == collectionP);
                                                                    {
                                                                        SubLObject collection = NIL;
                                                                        SubLObject pred_var = arg_genl_pred;
                                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(candidate_pred, ONE_INTEGER, pred_var)) {
                                                                            {
                                                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(candidate_pred, ONE_INTEGER, pred_var);
                                                                                SubLObject done_var = arg_constraints_violatedP;
                                                                                SubLObject token_var = NIL;
                                                                                while (NIL == done_var) {
                                                                                    {
                                                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                        if (NIL != valid) {
                                                                                            {
                                                                                                SubLObject final_index_iterator = NIL;
                                                                                                try {
                                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                                    {
                                                                                                        SubLObject done_var_18 = arg_constraints_violatedP;
                                                                                                        SubLObject token_var_19 = NIL;
                                                                                                        while (NIL == done_var_18) {
                                                                                                            {
                                                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                                                                SubLObject valid_20 = makeBoolean(token_var_19 != assertion);
                                                                                                                if (NIL != valid_20) {
                                                                                                                    collection = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                                                    arg_constraints_violatedP = makeBoolean(NIL == genls.genlsP(fort, collection, NIL, UNPROVIDED));
                                                                                                                }
                                                                                                                done_var_18 = makeBoolean((NIL == valid_20) || (NIL != arg_constraints_violatedP));
                                                                                                            }
                                                                                                        } 
                                                                                                    }
                                                                                                } finally {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            if (NIL != final_index_iterator) {
                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_var = makeBoolean((NIL == valid) || (NIL != arg_constraints_violatedP));
                                                                                    }
                                                                                } 
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL == arg_constraints_violatedP) {
                                                            arg_preds = cons(candidate_pred, arg_preds);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != arg_preds) {
                                            arg_preds = nreverse(arg_preds);
                                            v_answer = cons(list(arg, arg_preds), v_answer);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(v_answer);
            }
        }
    }

    public static SubLObject old_applicable_relations(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject collectionP = fort_types_interface.collectionP(fort);
            final SubLObject defn_isas = genls.all_genls($$CycLReifiableDenotationalTerm, NIL, UNPROVIDED);
            SubLObject all_isas = isa.all_isa(fort, NIL, UNPROVIDED);
            all_isas = nunion(all_isas, defn_isas, UNPROVIDED, UNPROVIDED);
            all_isas = Sort.sort(all_isas, symbol_function($sym38$_), symbol_function(SPEC_CARDINALITY));
            SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(arg, UNPROVIDED, UNPROVIDED);
                SubLObject arg_preds = NIL;
                SubLObject cdolist_list_var_$14 = all_isas;
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    SubLObject cdolist_list_var_$15;
                    final SubLObject candidate_preds = cdolist_list_var_$15 = kb_mapping_utilities.pred_values(v_isa, arg_isa_pred, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    SubLObject candidate_pred = NIL;
                    candidate_pred = cdolist_list_var_$15.first();
                    while (NIL != cdolist_list_var_$15) {
                        SubLObject arg_constraints_violatedP = NIL;
                        if (kb_indexing.num_gaf_arg_index(candidate_pred, ONE_INTEGER, arg_isa_pred, UNPROVIDED).numG(ONE_INTEGER)) {
                            SubLObject collection = NIL;
                            final SubLObject pred_var = arg_isa_pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(candidate_pred, ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(candidate_pred, ONE_INTEGER, pred_var);
                                SubLObject done_var = arg_constraints_violatedP;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$16 = arg_constraints_violatedP;
                                            final SubLObject token_var_$17 = NIL;
                                            while (NIL == done_var_$16) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                                final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(assertion));
                                                if (NIL != valid_$18) {
                                                    collection = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                    if (!collection.eql(v_isa)) {
                                                        arg_constraints_violatedP = makeBoolean(NIL == isa.isaP(fort, collection, NIL, UNPROVIDED));
                                                    }
                                                }
                                                done_var_$16 = makeBoolean((NIL == valid_$18) || (NIL != arg_constraints_violatedP));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != arg_constraints_violatedP));
                                } 
                            }
                        }
                        if (NIL == arg_constraints_violatedP) {
                            final SubLObject arg_genl_pred = kb_accessors.arg_genl_pred(arg, UNPROVIDED, UNPROVIDED);
                            if (kb_indexing.num_gaf_arg_index(candidate_pred, ONE_INTEGER, arg_genl_pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                                arg_constraints_violatedP = makeBoolean(NIL == collectionP);
                                SubLObject collection2 = NIL;
                                final SubLObject pred_var2 = arg_genl_pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(candidate_pred, ONE_INTEGER, pred_var2)) {
                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(candidate_pred, ONE_INTEGER, pred_var2);
                                    SubLObject done_var2 = arg_constraints_violatedP;
                                    final SubLObject token_var2 = NIL;
                                    while (NIL == done_var2) {
                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                        if (NIL != valid2) {
                                            SubLObject final_index_iterator2 = NIL;
                                            try {
                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$17 = arg_constraints_violatedP;
                                                final SubLObject token_var_$18 = NIL;
                                                while (NIL == done_var_$17) {
                                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$18);
                                                    final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion2));
                                                    if (NIL != valid_$19) {
                                                        collection2 = assertions_high.gaf_arg(assertion2, TWO_INTEGER);
                                                        arg_constraints_violatedP = makeBoolean(NIL == genls.genlsP(fort, collection2, NIL, UNPROVIDED));
                                                    }
                                                    done_var_$17 = makeBoolean((NIL == valid_$19) || (NIL != arg_constraints_violatedP));
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    if (NIL != final_index_iterator2) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                    }
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                        }
                                        done_var2 = makeBoolean((NIL == valid2) || (NIL != arg_constraints_violatedP));
                                    } 
                                }
                            }
                        }
                        if (NIL == arg_constraints_violatedP) {
                            arg_preds = cons(candidate_pred, arg_preds);
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        candidate_pred = cdolist_list_var_$15.first();
                    } 
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    v_isa = cdolist_list_var_$14.first();
                } 
                if (NIL != arg_preds) {
                    arg_preds = nreverse(arg_preds);
                    v_answer = cons(list(arg, arg_preds), v_answer);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(v_answer);
    }

    public static final SubLObject cb_link_gaf_suggestor_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt33$_GAF_Suggestor_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt34$cb_gaf_suggestor);
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

    public static SubLObject cb_link_gaf_suggestor(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str42$_GAF_Suggestor_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str43$cb_gaf_suggestor);
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

    /**
     * Display all the relations in the KB which can apply to the given fort.
     */
    @LispMethod(comment = "Display all the relations in the KB which can apply to the given fort.")
    public static final SubLObject cb_gaf_suggestor_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$GAF_Suggestor;
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
                            SubLObject _prev_bind_0_22 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt6$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt38$cb_handle_gaf_suggestor, T, UNPROVIDED);
                                                    cb_help_preamble($CB_GAF_SUGGESTOR, UNPROVIDED, UNPROVIDED);
                                                    html_submit_input($$$Suggest_GAFs, UNPROVIDED, UNPROVIDED);
                                                    html_indent(THREE_INTEGER);
                                                    html_reset_input($$$Clear);
                                                    html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject i = NIL;
                                                        for (i = ZERO_INTEGER; i.numL(TWO_INTEGER); i = add(i, ONE_INTEGER)) {
                                                            {
                                                                SubLObject options = list($INPUT_NAME, cconcatenate($$$term, format_nil.format_nil_a_no_copy(i)), $PRETTY_NAME, cconcatenate($str_alt45$Term_, format_nil.format_nil_s_no_copy(i)), $COMPLETE_LABEL, $$$Complete, $HEIGHT, ONE_INTEGER);
                                                                html_newline(UNPROVIDED);
                                                                cb_form_widgets.cb_el_term_input_section(NIL, options);
                                                            }
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_22, thread);
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

    /**
     * Display all the relations in the KB which can apply to the given fort.
     */
    @LispMethod(comment = "Display all the relations in the KB which can apply to the given fort.")
    public static SubLObject cb_gaf_suggestor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$GAF_Suggestor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str5$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$25 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str10$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
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
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str48$cb_handle_gaf_suggestor, T, UNPROVIDED);
                            cb_help_preamble($CB_GAF_SUGGESTOR, UNPROVIDED, UNPROVIDED);
                            html_submit_input($$$Suggest_GAFs, UNPROVIDED, UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_reset_input($$$Clear);
                            html_newline(UNPROVIDED);
                            SubLObject i;
                            SubLObject options;
                            for (i = NIL, i = ZERO_INTEGER; i.numL(TWO_INTEGER); i = add(i, ONE_INTEGER)) {
                                options = list($INPUT_NAME, cconcatenate($$$term, format_nil.format_nil_a_no_copy(i)), $PRETTY_NAME, cconcatenate($$$Term_, format_nil.format_nil_s_no_copy(i)), $COMPLETE_LABEL, $$$Complete, $HEIGHT, ONE_INTEGER);
                                html_newline(UNPROVIDED);
                                cb_form_widgets.cb_el_term_input_section(NIL, options);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$24, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Display all the relations in the KB which can apply to the given fort.
     */


    public static final SubLObject cb_handle_gaf_suggestor_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(TWO_INTEGER); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject options = list($INPUT_NAME, cconcatenate($$$term, format_nil.format_nil_a_no_copy(i)), $REQUIRED_, T, $AUTO_CYCLIFY, T);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_term = cb_form_widgets.cb_extract_el_term_input(args, options);
                            SubLObject error = thread.secondMultipleValue();
                            SubLObject input_string = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != error) {
                                return cb_form_widgets.cb_el_term_error(error, input_string, UNPROVIDED);
                            }
                            terms = cons(v_term, terms);
                        }
                    }
                }
                terms = nreverse(terms);
                {
                    SubLObject iterator = com.cyc.cycjava.cycl.cb_applicable_relations.cb_new_suggested_gafs_for_terms_iterator(terms);
                    SubLObject title_var = $$$GAF_Suggestions;
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
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_25 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_markup($str_alt6$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            cb_help_preamble($CB_GAF_SUGGESTOR, UNPROVIDED, UNPROVIDED);
                                                            html_newline(TWO_INTEGER);
                                                            html_princ_strong($str_alt55$Terms__);
                                                            {
                                                                SubLObject cdolist_list_var = terms;
                                                                SubLObject v_term = NIL;
                                                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                    html_indent(TWO_INTEGER);
                                                                    cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                            html_newline(UNPROVIDED);
                                                            html_flush();
                                                            {
                                                                SubLObject done_var = NIL;
                                                                while (NIL == done_var) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject gaf = iteration.iteration_next(iterator);
                                                                        SubLObject valid = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != valid) {
                                                                            html_newline(UNPROVIDED);
                                                                            cb_link($SENTENCE_QUERY_SIMILAR, gaf, $str_alt57$_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            html_indent(UNPROVIDED);
                                                                            cb_link($ASSERT_FORMULA, gaf, $UNSPECIFIED, $str_alt60$_Assert_, UNPROVIDED, UNPROVIDED);
                                                                            html_indent(UNPROVIDED);
                                                                            html_indent(TWO_INTEGER);
                                                                            cb_form(gaf, ZERO_INTEGER, NIL);
                                                                            html_flush();
                                                                        }
                                                                        done_var = makeBoolean(NIL == valid);
                                                                    }
                                                                } 
                                                            }
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_handle_gaf_suggestor(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = NIL;
        SubLObject i;
        SubLObject options;
        SubLObject v_term;
        SubLObject error;
        SubLObject input_string;
        for (i = NIL, i = ZERO_INTEGER; i.numL(TWO_INTEGER); i = add(i, ONE_INTEGER)) {
            options = list($INPUT_NAME, cconcatenate($$$term, format_nil.format_nil_a_no_copy(i)), $REQUIRED_, T, $AUTO_CYCLIFY, T);
            thread.resetMultipleValues();
            v_term = cb_form_widgets.cb_extract_el_term_input(args, options);
            error = thread.secondMultipleValue();
            input_string = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != error) {
                return cb_form_widgets.cb_el_term_error(error, input_string, UNPROVIDED);
            }
            terms = cons(v_term, terms);
        }
        terms = nreverse(terms);
        final SubLObject iterator = cb_new_suggested_gafs_for_terms_iterator(terms);
        final SubLObject title_var = $$$GAF_Suggestions;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str5$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str10$yui_skin_sam);
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
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                cb_help_preamble($CB_GAF_SUGGESTOR, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($str63$Terms__);
                                SubLObject cdolist_list_var = terms;
                                SubLObject v_term2 = NIL;
                                v_term2 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_indent(TWO_INTEGER);
                                    cb_show_term(v_term2, UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    v_term2 = cdolist_list_var.first();
                                } 
                                html_newline(UNPROVIDED);
                                html_flush();
                                SubLObject valid;
                                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                    thread.resetMultipleValues();
                                    final SubLObject gaf = iteration.iteration_next(iterator);
                                    valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        html_newline(UNPROVIDED);
                                        cb_link($SENTENCE_QUERY_SIMILAR, gaf, $str65$_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_indent(UNPROVIDED);
                                        cb_link($ASSERT_FORMULA, gaf, $UNSPECIFIED, $str68$_Assert_, UNPROVIDED, UNPROVIDED);
                                        html_indent(UNPROVIDED);
                                        html_indent(TWO_INTEGER);
                                        cb_show_term(gaf, ZERO_INTEGER, NIL);
                                        html_flush();
                                    }
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
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

    public static final SubLObject cb_new_suggested_gafs_for_terms_iterator_alt(SubLObject terms) {
        return applicable_relations.new_suggested_gafs_for_terms_iterator(terms, $$EverythingPSC, list($USAGE_THRESHOLD, THREE_INTEGER, $ISA_HORIZON, $$Individual));
    }

    public static SubLObject cb_new_suggested_gafs_for_terms_iterator(final SubLObject terms) {
        return applicable_relations.new_suggested_gafs_for_terms_iterator(terms, $$EverythingPSC, list($USAGE_THRESHOLD, THREE_INTEGER, $ISA_HORIZON, $$Individual));
    }

    public static final SubLObject clear_cb_suggest_gafs_for_terms_alt() {
        {
            SubLObject cs = $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cb_suggest_gafs_for_terms() {
        final SubLObject cs = $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cb_suggest_gafs_for_terms_alt(SubLObject terms) {
        return memoization_state.caching_state_remove_function_results_with_args($cb_suggest_gafs_for_terms_caching_state$.getGlobalValue(), list(terms), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cb_suggest_gafs_for_terms(final SubLObject terms) {
        return memoization_state.caching_state_remove_function_results_with_args($cb_suggest_gafs_for_terms_caching_state$.getGlobalValue(), list(terms), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_suggest_gafs_for_terms_internal_alt(SubLObject terms) {
        return applicable_relations.suggest_gafs_for_terms(terms, $$EverythingPSC, list($MAX_NUMBER, $int$100, $USAGE_THRESHOLD, TEN_INTEGER, $ISA_HORIZON, $$Individual));
    }

    public static SubLObject cb_suggest_gafs_for_terms_internal(final SubLObject terms) {
        return applicable_relations.suggest_gafs_for_terms(terms, $$EverythingPSC, list($MAX_NUMBER, $int$100, $USAGE_THRESHOLD, TEN_INTEGER, $ISA_HORIZON, $$Individual));
    }

    public static final SubLObject cb_suggest_gafs_for_terms_alt(SubLObject terms) {
        {
            SubLObject caching_state = $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CB_SUGGEST_GAFS_FOR_TERMS, $cb_suggest_gafs_for_terms_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, terms, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw69$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cb_applicable_relations.cb_suggest_gafs_for_terms_internal(terms)));
                    memoization_state.caching_state_put(caching_state, terms, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cb_suggest_gafs_for_terms(final SubLObject terms) {
        SubLObject caching_state = $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CB_SUGGEST_GAFS_FOR_TERMS, $cb_suggest_gafs_for_terms_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, terms, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cb_suggest_gafs_for_terms_internal(terms)));
            memoization_state.caching_state_put(caching_state, terms, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_cb_applicable_relations_file() {
        declareFunction("cb_applicable_relations", "CB-APPLICABLE-RELATIONS", 1, 0, false);
        declareFunction("cb_link_applicable_relations", "CB-LINK-APPLICABLE-RELATIONS", 1, 1, false);
        declareFunction("old_applicable_relations", "OLD-APPLICABLE-RELATIONS", 1, 0, false);
        declareFunction("cb_link_gaf_suggestor", "CB-LINK-GAF-SUGGESTOR", 0, 1, false);
        declareFunction("cb_gaf_suggestor", "CB-GAF-SUGGESTOR", 0, 1, false);
        declareFunction("cb_handle_gaf_suggestor", "CB-HANDLE-GAF-SUGGESTOR", 1, 0, false);
        declareFunction("cb_new_suggested_gafs_for_terms_iterator", "CB-NEW-SUGGESTED-GAFS-FOR-TERMS-ITERATOR", 1, 0, false);
        declareFunction("clear_cb_suggest_gafs_for_terms", "CLEAR-CB-SUGGEST-GAFS-FOR-TERMS", 0, 0, false);
        declareFunction("remove_cb_suggest_gafs_for_terms", "REMOVE-CB-SUGGEST-GAFS-FOR-TERMS", 1, 0, false);
        declareFunction("cb_suggest_gafs_for_terms_internal", "CB-SUGGEST-GAFS-FOR-TERMS-INTERNAL", 1, 0, false);
        declareFunction("cb_suggest_gafs_for_terms", "CB-SUGGEST-GAFS-FOR-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_applicable_relations_file() {
        deflexical("*CB-SUGGEST-GAFS-FOR-TERMS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_applicable_relations_file_alt() {
        sethash($CB_APPLICABLE_RELATIONS, $cb_help_definitions$.getGlobalValue(), list($str_alt1$cb_applicable_relations_html, NIL));
        html_macros.note_html_handler_function(CB_APPLICABLE_RELATIONS);
        setup_cb_link_method($APPLICABLE_RELATIONS, CB_LINK_APPLICABLE_RELATIONS, TWO_INTEGER);
        setup_cb_link_method($GAF_SUGGESTOR, CB_LINK_GAF_SUGGESTOR, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_GAF_SUGGESTOR);
        declare_cb_tool($GAF_SUGGESTOR, $$$GAF_Suggestor, $str_alt50$GAF_S, $str_alt51$Suggest_possible_GAFs_for_a_set_o);
        html_macros.note_html_handler_function(CB_HANDLE_GAF_SUGGESTOR);
        memoization_state.note_globally_cached_function(CB_SUGGEST_GAFS_FOR_TERMS);
        return NIL;
    }

    public static SubLObject setup_cb_applicable_relations_file() {
        if (SubLFiles.USE_V1) {
            sethash($CB_APPLICABLE_RELATIONS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_applicable_relations_html, NIL));
            html_macros.note_cgi_handler_function(CB_APPLICABLE_RELATIONS, $HTML_HANDLER);
            setup_cb_link_method($APPLICABLE_RELATIONS, CB_LINK_APPLICABLE_RELATIONS, TWO_INTEGER);
            setup_cb_link_method($GAF_SUGGESTOR, CB_LINK_GAF_SUGGESTOR, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_GAF_SUGGESTOR, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_GAF_SUGGESTOR, $HTML_HANDLER);
            memoization_state.note_globally_cached_function(CB_SUGGEST_GAFS_FOR_TERMS);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_APPLICABLE_RELATIONS);
            html_macros.note_html_handler_function(CB_GAF_SUGGESTOR);
            declare_cb_tool($GAF_SUGGESTOR, $$$GAF_Suggestor, $str_alt50$GAF_S, $str_alt51$Suggest_possible_GAFs_for_a_set_o);
            html_macros.note_html_handler_function(CB_HANDLE_GAF_SUGGESTOR);
        }
        return NIL;
    }

    public static SubLObject setup_cb_applicable_relations_file_Previous() {
        sethash($CB_APPLICABLE_RELATIONS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_applicable_relations_html, NIL));
        html_macros.note_cgi_handler_function(CB_APPLICABLE_RELATIONS, $HTML_HANDLER);
        setup_cb_link_method($APPLICABLE_RELATIONS, CB_LINK_APPLICABLE_RELATIONS, TWO_INTEGER);
        setup_cb_link_method($GAF_SUGGESTOR, CB_LINK_GAF_SUGGESTOR, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_GAF_SUGGESTOR, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_GAF_SUGGESTOR, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(CB_SUGGEST_GAFS_FOR_TERMS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_applicable_relations_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_applicable_relations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_applicable_relations_file();
    }

    static {
    }

    static private final SubLString $str_alt1$cb_applicable_relations_html = makeString("cb-applicable-relations.html");

    static private final SubLString $str_alt2$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    static private final SubLString $str_alt5$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt6$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt7$Relations_which_apply_to_ = makeString("Relations which apply to ");

    static private final SubLString $str_alt8$___ = makeString(" : ");

    static private final SubLList $list_alt9 = list(makeSymbol("ARG"), makeSymbol("RELATIONS"));

    static private final SubLString $str_alt11$_dddddd = makeString("#dddddd");

    static private final SubLString $str_alt24$cb_applicable_relations__A = makeString("cb-applicable-relations&~A");

    static private final SubLSymbol $sym29$_ = makeSymbol("<");

    static private final SubLString $str_alt33$_GAF_Suggestor_ = makeString("[GAF Suggestor]");

    static private final SubLString $str_alt34$cb_gaf_suggestor = makeString("cb-gaf-suggestor");

    static private final SubLString $str_alt38$cb_handle_gaf_suggestor = makeString("cb-handle-gaf-suggestor");

    static private final SubLString $str_alt45$Term_ = makeString("Term ");

    static private final SubLString $str_alt50$GAF_S = makeString("GAF-S");

    static private final SubLString $str_alt51$Suggest_possible_GAFs_for_a_set_o = makeString("Suggest possible GAFs for a set of terms");

    static private final SubLString $str_alt55$Terms__ = makeString("Terms :");

    static private final SubLString $str_alt57$_Query_ = makeString("[Query]");

    static private final SubLString $str_alt60$_Assert_ = makeString("[Assert]");

    public static final SubLSymbol $kw69$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 732 ms
 */
