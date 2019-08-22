/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HALO-INFERENCE-PARAPHRASE
 *  source file: /cyc/top/cycl/halo-inference-paraphrase.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class halo_inference_paraphrase extends SubLTranslatedFile implements V02 {
    // // Constructor
    private halo_inference_paraphrase() {
    }

    public static final SubLFile me = new halo_inference_paraphrase();


    // // Definitions
    // defparameter
    private static final SubLSymbol $halo_pph_language_mt$ = makeSymbol("*HALO-PPH-LANGUAGE-MT*");

    // defparameter
    private static final SubLSymbol $halo_pph_domain_mt$ = makeSymbol("*HALO-PPH-DOMAIN-MT*");

    /**
     * Other possible value: :text
     */
    // defparameter
    public static final SubLSymbol $halo_paraphrase_mode$ = makeSymbol("*HALO-PARAPHRASE-MODE*");

    // defparameter
    private static final SubLSymbol $halo_constant_link_function$ = makeSymbol("*HALO-CONSTANT-LINK-FUNCTION*");

    // defparameter
    private static final SubLSymbol $halo_significant_digits_cutoff$ = makeSymbol("*HALO-SIGNIFICANT-DIGITS-CUTOFF*");

    public static final SubLObject halo_display_inference_answer(SubLObject inference_answer, SubLObject stream, SubLObject domain_mt, SubLObject proof) {
        if (proof == UNPROVIDED) {
            proof = $FIND_BEST;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                SubLObject _prev_bind_1 = $halo_pph_domain_mt$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    $halo_pph_domain_mt$.bind(domain_mt, thread);
                    if (NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) {
                        halo_show_inference_answer_proof(inference_answer, proof);
                    }
                } finally {
                    $halo_pph_domain_mt$.rebind(_prev_bind_1, thread);
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject with_halo_pph_parameters(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt5, append(body, NIL));
        }
    }

    /**
     * Display the query proven by PROOF to STREAM, as part of INFERENCE.
     */
    public static final SubLObject halo_display_proof_query_formula(SubLObject proof, SubLObject stream, SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_mts = inference_datastructures_inference.inference_hl_mts(inference);
                SubLObject mt = (NIL != list_utilities.singletonP(hl_mts)) ? ((SubLObject) (hl_mts.first())) : inference_datastructures_inference.inference_mt(inference);
                SubLObject proven_el_query = pph_proof.pph_proof_el_formula(proof, mt);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $halo_pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_stream$.currentBinding(thread);
                    SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_5 = pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.currentBinding(thread);
                    SubLObject _prev_bind_6 = pph_vars.$pph_expand_e_notation_for_floatsP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_8 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_9 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_11 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference), thread);
                        $halo_pph_domain_mt$.bind(mt, thread);
                        html_macros.$html_stream$.bind(stream, thread);
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        pph_vars.$pph_significant_digits_cutoff$.bind(NIL != subl_promotions.positive_integer_p(pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread))) : $halo_significant_digits_cutoff$.getDynamicValue(thread), thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.bind($list_alt6, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.bind(NIL, thread);
                        pph_vars.$pph_language_mt$.bind($halo_pph_language_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_domain_mt$.bind($halo_pph_domain_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_use_showXhideP$.bind(NIL, thread);
                        pph_vars.$constant_link_function$.bind($halo_constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$paraphrase_mode$.bind($halo_paraphrase_mode$.getDynamicValue(thread), thread);
                        if (NIL != el_utilities.el_conjunction_p(proven_el_query)) {
                            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject args = cycl_utilities.formula_args(proven_el_query, $IGNORE);
                                        SubLObject cdolist_list_var = args;
                                        SubLObject conjunct = NIL;
                                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    pph_proof.pph_show_sentence(conjunct, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        } else {
                            pph_proof.pph_show_sentence(proven_el_query, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_11, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_10, thread);
                        pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_9, thread);
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_8, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_7, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.rebind(_prev_bind_6, thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.rebind(_prev_bind_5, thread);
                        pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_4, thread);
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
                        html_macros.$html_stream$.rebind(_prev_bind_2, thread);
                        $halo_pph_domain_mt$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return proof;
        }
    }

    /**
     * Print the answer bindings for INFERENCE-ANSWER to STREAM.
     */
    public static final SubLObject halo_display_answer_bindings(SubLObject inference_answer, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
                SubLObject hl_mts = inference_datastructures_inference.inference_hl_mts(inference);
                SubLObject mt = (NIL != list_utilities.singletonP(hl_mts)) ? ((SubLObject) (hl_mts.first())) : inference_datastructures_inference.inference_mt(inference);
                {
                    SubLObject _prev_bind_0 = $halo_pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                    try {
                        $halo_pph_domain_mt$.bind(mt, thread);
                        pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference), thread);
                        {
                            SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
                            {
                                SubLObject _prev_bind_0_3 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(stream, thread);
                                    if (NIL != list_utilities.singletonP(v_bindings)) {
                                        {
                                            SubLObject binding = v_bindings.first();
                                            SubLObject value = bindings.variable_binding_value(binding);
                                            halo_show_term(value, UNPROVIDED);
                                        }
                                    } else {
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = v_bindings;
                                                            SubLObject binding = NIL;
                                                            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject variable = bindings.variable_binding_variable(binding);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            halo_show_term(variable, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = v_bindings;
                                                            SubLObject binding = NIL;
                                                            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject value = bindings.variable_binding_value(binding);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            halo_show_term(value, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_1, thread);
                        $halo_pph_domain_mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return inference_answer;
        }
    }

    /**
     * Print the paraphrase for the halo question NUMBER.
     *
     * @unknown - works best in the SubL Interactor, which handles HTML formatting.
     */
    public static final SubLObject print_halo_question(SubLObject number, SubLObject test_spec, SubLObject mt) {
        if (test_spec == UNPROVIDED) {
            test_spec = halo_qa_interface.$halo_default_test_specification$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = halo_qa_interface.$halo_default_query_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ask_sentence1 = listS($$and, list($$testQueryToNumber, $sym10$_QUERY_NAT, number), list($$isa, $sym12$_QUERY, test_spec), $list_alt13);
                SubLObject query_nat = narts_high.find_nart(ask_utilities.ask_variable($sym10$_QUERY_NAT, ask_sentence1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
                if (NIL != query_nat) {
                    {
                        SubLObject ask_sentence = kb_query.kbq_askable_query_spec_sentence($sym14$_QUERY_FORMULA, query_nat, UNPROVIDED);
                        SubLObject query_formula = ask_utilities.ask_variable($sym14$_QUERY_FORMULA, ask_sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                        if (NIL != el_utilities.el_formula_p(query_formula)) {
                            {
                                SubLObject _prev_bind_0 = $halo_constant_link_function$.currentBinding(thread);
                                try {
                                    $halo_constant_link_function$.bind(CB_CF, thread);
                                    halo_show_question(query_formula);
                                } finally {
                                    $halo_constant_link_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return query_formula;
                        } else {
                            html_utilities.html_princ($str_alt16$No_query_formula_for_);
                            cb_utilities.cb_form(query_nat, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt17$No_query_specification_for__S_in_, number, mt);
                }
            }
            return number;
        }
    }

    public static final SubLObject halo_show_inference_formula(SubLObject inference) {
        halo_show_question(inference_datastructures_inference.inference_el_query(inference));
        return inference;
    }

    public static final SubLObject halo_show_bindings(SubLObject v_bindings) {
        {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                halo_show_one_binding(binding);
                html_utilities.html_newline(UNPROVIDED);
            }
        }
        return v_bindings;
    }

    public static final SubLObject halo_show_one_binding(SubLObject binding) {
        {
            SubLObject datum = binding;
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            var = current.first();
            current = current.rest();
            value = current;
            html_utilities.html_princ(var);
            html_utilities.html_indent(UNPROVIDED);
            html_utilities.html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            if (NIL != collection_defns.cycl_sentenceP(value)) {
                halo_show_sentence(value);
            } else {
                halo_show_term(value, UNPROVIDED);
            }
        }
        return binding;
    }

    public static final SubLObject halo_show_inference_answer_proof(SubLObject inference_answer, SubLObject proof) {
        if (proof == UNPROVIDED) {
            proof = $FIND_BEST;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_3 = pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.currentBinding(thread);
                    SubLObject _prev_bind_4 = pph_vars.$pph_expand_e_notation_for_floatsP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_6 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_7 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_9 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference), thread);
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        pph_vars.$pph_significant_digits_cutoff$.bind(NIL != subl_promotions.positive_integer_p(pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread))) : $halo_significant_digits_cutoff$.getDynamicValue(thread), thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.bind($list_alt6, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.bind(NIL, thread);
                        pph_vars.$pph_language_mt$.bind($halo_pph_language_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_domain_mt$.bind($halo_pph_domain_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_use_showXhideP$.bind(NIL, thread);
                        pph_vars.$constant_link_function$.bind($halo_constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$paraphrase_mode$.bind($halo_paraphrase_mode$.getDynamicValue(thread), thread);
                        pph_proof.pph_show_inference_answer_proof(inference_answer, proof);
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_9, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_8, thread);
                        pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_7, thread);
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_6, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_5, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.rebind(_prev_bind_4, thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.rebind(_prev_bind_3, thread);
                        pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return inference_answer;
        }
    }

    public static final SubLObject halo_show_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $halo_pph_domain_mt$.currentBinding(thread);
                try {
                    $halo_pph_domain_mt$.bind(assertions_high.assertion_mt(assertion), thread);
                    {
                        SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
                        if (NIL != halo_chemical_lawP(assertion)) {
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            halo_show_sentence(sentence);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } else {
                            halo_show_sentence(sentence);
                        }
                    }
                } finally {
                    $halo_pph_domain_mt$.rebind(_prev_bind_0, thread);
                }
            }
            return assertion;
        }
    }

    public static final SubLObject halo_chemical_lawP(SubLObject assertion) {
        return kb_mapping_utilities.some_pred_value_in_any_mt(assertion, $$chemicalLaw, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject halo_show_sentence(SubLObject sentence) {
        halo_show_wXsentential_force(sentence, $DECLARATIVE, UNPROVIDED);
        return sentence;
    }

    public static final SubLObject halo_show_term(SubLObject v_term, SubLObject paraphrase) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        halo_show_wXsentential_force(v_term, $NONE, paraphrase);
        return v_term;
    }

    public static final SubLObject halo_show_question(SubLObject v_question) {
        halo_show_wXsentential_force(v_question, $INTERROGATIVE, UNPROVIDED);
        return v_question;
    }

    public static final SubLObject halo_term_phrase_np(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tagged = list($$TermParaphraseFn_Constrained, $$NounPhrase, v_object);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.currentBinding(thread);
                    SubLObject _prev_bind_3 = pph_vars.$pph_expand_e_notation_for_floatsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_5 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_6 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_8 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        pph_vars.$pph_significant_digits_cutoff$.bind(NIL != subl_promotions.positive_integer_p(pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread))) : $halo_significant_digits_cutoff$.getDynamicValue(thread), thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.bind($list_alt6, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.bind(NIL, thread);
                        pph_vars.$pph_language_mt$.bind($halo_pph_language_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_domain_mt$.bind($halo_pph_domain_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_use_showXhideP$.bind(NIL, thread);
                        pph_vars.$constant_link_function$.bind($halo_constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$paraphrase_mode$.bind($halo_paraphrase_mode$.getDynamicValue(thread), thread);
                        ans = pph_main.generate_text_wXsentential_force(tagged, $NONE, $ANY, $halo_pph_language_mt$.getDynamicValue(thread), $halo_pph_domain_mt$.getDynamicValue(thread), $halo_paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_8, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_7, thread);
                        pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_6, thread);
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_5, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_4, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.rebind(_prev_bind_3, thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject halo_show_wXsentential_force(SubLObject v_object, SubLObject force, SubLObject paraphrase) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!paraphrase.isString()) {
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.currentBinding(thread);
                    SubLObject _prev_bind_3 = pph_vars.$pph_expand_e_notation_for_floatsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_5 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_6 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_8 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        pph_vars.$pph_significant_digits_cutoff$.bind(NIL != subl_promotions.positive_integer_p(pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread))) : $halo_significant_digits_cutoff$.getDynamicValue(thread), thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.bind($list_alt6, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.bind(NIL, thread);
                        pph_vars.$pph_language_mt$.bind($halo_pph_language_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_domain_mt$.bind($halo_pph_domain_mt$.getDynamicValue(thread), thread);
                        pph_vars.$pph_use_showXhideP$.bind(NIL, thread);
                        pph_vars.$constant_link_function$.bind($halo_constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$paraphrase_mode$.bind($halo_paraphrase_mode$.getDynamicValue(thread), thread);
                        paraphrase = pph_main.generate_text_wXsentential_force(v_object, force, $ANY, $halo_pph_language_mt$.getDynamicValue(thread), $halo_pph_domain_mt$.getDynamicValue(thread), $halo_paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_8, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_7, thread);
                        pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_6, thread);
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_5, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_4, thread);
                        pph_vars.$pph_expand_e_notation_for_floatsP$.rebind(_prev_bind_3, thread);
                        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            html_utilities.html_markup(paraphrase);
            return v_object;
        }
    }

    public static final SubLObject declare_halo_inference_paraphrase_file() {
        declareFunction("halo_display_inference_answer", "HALO-DISPLAY-INFERENCE-ANSWER", 3, 1, false);
        declareMacro("with_halo_pph_parameters", "WITH-HALO-PPH-PARAMETERS");
        declareFunction("halo_display_proof_query_formula", "HALO-DISPLAY-PROOF-QUERY-FORMULA", 3, 0, false);
        declareFunction("halo_display_answer_bindings", "HALO-DISPLAY-ANSWER-BINDINGS", 2, 0, false);
        declareFunction("print_halo_question", "PRINT-HALO-QUESTION", 1, 2, false);
        declareFunction("halo_show_inference_formula", "HALO-SHOW-INFERENCE-FORMULA", 1, 0, false);
        declareFunction("halo_show_bindings", "HALO-SHOW-BINDINGS", 1, 0, false);
        declareFunction("halo_show_one_binding", "HALO-SHOW-ONE-BINDING", 1, 0, false);
        declareFunction("halo_show_inference_answer_proof", "HALO-SHOW-INFERENCE-ANSWER-PROOF", 1, 1, false);
        declareFunction("halo_show_assertion", "HALO-SHOW-ASSERTION", 1, 0, false);
        declareFunction("halo_chemical_lawP", "HALO-CHEMICAL-LAW?", 1, 0, false);
        declareFunction("halo_show_sentence", "HALO-SHOW-SENTENCE", 1, 0, false);
        declareFunction("halo_show_term", "HALO-SHOW-TERM", 1, 1, false);
        declareFunction("halo_show_question", "HALO-SHOW-QUESTION", 1, 0, false);
        declareFunction("halo_term_phrase_np", "HALO-TERM-PHRASE-NP", 1, 0, false);
        declareFunction("halo_show_wXsentential_force", "HALO-SHOW-W/SENTENTIAL-FORCE", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_halo_inference_paraphrase_file() {
        defparameter("*HALO-PPH-LANGUAGE-MT*", $$EnglishParaphraseMt);
        defparameter("*HALO-PPH-DOMAIN-MT*", $$EnglishParaphraseMt);
        defparameter("*HALO-PARAPHRASE-MODE*", $HTML);
        defparameter("*HALO-CONSTANT-LINK-FUNCTION*", $NONE);
        defparameter("*HALO-SIGNIFICANT-DIGITS-CUTOFF*", FIVE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_halo_inference_paraphrase_file() {
                return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$EnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"));









    static private final SubLList $list_alt5 = list(new SubLObject[]{ list(makeSymbol("*PPH-USE-BULLETED-LISTS?*"), T), list(makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*"), list(makeSymbol("FIF"), list(makeSymbol("POSITIVE-INTEGER-P"), makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*")), makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*"), makeSymbol("*HALO-SIGNIFICANT-DIGITS-CUTOFF*"))), list(makeSymbol("*PPH-HL-MODULES-TO-SKIP-META-SUPPORTS-FOR*"), list(QUOTE, list($EVAL))), list(makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), NIL), list(makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*HALO-PPH-LANGUAGE-MT*")), list(makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*HALO-PPH-DOMAIN-MT*")), list(makeSymbol("*PPH-USE-SHOW/HIDE?*"), NIL), list(makeSymbol("*CONSTANT-LINK-FUNCTION*"), makeSymbol("*HALO-CONSTANT-LINK-FUNCTION*")), list(makeSymbol("*PARAPHRASE-MODE*"), makeSymbol("*HALO-PARAPHRASE-MODE*")) });

    static private final SubLList $list_alt6 = list($EVAL);



    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$testQueryToNumber = constant_handles.reader_make_constant_shell(makeString("testQueryToNumber"));

    static private final SubLSymbol $sym10$_QUERY_NAT = makeSymbol("?QUERY-NAT");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLSymbol $sym12$_QUERY = makeSymbol("?QUERY");

    static private final SubLList $list_alt13 = list(list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?QUERY"), makeSymbol("?QUERY-NAT")));

    static private final SubLSymbol $sym14$_QUERY_FORMULA = makeSymbol("?QUERY-FORMULA");

    private static final SubLSymbol CB_CF = makeSymbol("CB-CF");

    static private final SubLString $str_alt16$No_query_formula_for_ = makeString("No query formula for ");

    static private final SubLString $str_alt17$No_query_specification_for__S_in_ = makeString("No query specification for ~S in ~S");

    static private final SubLList $list_alt18 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));



    public static final SubLObject $$chemicalLaw = constant_handles.reader_make_constant_shell(makeString("chemicalLaw"));





    public static final SubLObject $$TermParaphraseFn_Constrained = constant_handles.reader_make_constant_shell(makeString("TermParaphraseFn-Constrained"));

    public static final SubLObject $$NounPhrase = constant_handles.reader_make_constant_shell(makeString("NounPhrase"));



    // // Initializers
    public void declareFunctions() {
        declare_halo_inference_paraphrase_file();
    }

    public void initializeVariables() {
        init_halo_inference_paraphrase_file();
    }

    public void runTopLevelForms() {
        setup_halo_inference_paraphrase_file();
    }
}

