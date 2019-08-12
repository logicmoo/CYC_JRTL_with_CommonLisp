/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.format_nil.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_methods_verb_sem_trans extends SubLTranslatedFile implements V12 {
    public static final SubLObject vst_canonical_test_case_p(SubLObject vst_canonical_test_case) {
        return classes.subloop_instanceof_class(vst_canonical_test_case, VST_CANONICAL_TEST_CASE);
    }

    public static final SubLObject subloop_reserved_initialize_vst_canonical_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vst_canonical_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLFile me = new pph_methods_verb_sem_trans();

 public static final String myName = "com.cyc.cycjava.cycl.pph_methods_verb_sem_trans";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_phrase_templates_for_frames$ = makeSymbol("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_vst_preposition_info$ = makeSymbol("*PPH-VST-PREPOSITION-INFO*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GENERATE_WITH_VERB_SEM_TRANS_CANONICAL = makeSymbol("GENERATE-WITH-VERB-SEM-TRANS-CANONICAL");

    private static final SubLSymbol $VERB_SEMTRANS_MATCHER = makeKeyword("VERB-SEMTRANS-MATCHER");

    static private final SubLString $str4$__Entering_PPH_SETTING_VAR_TYPES_ = makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");

    static private final SubLList $list5 = cons(makeSymbol("VAR"), makeSymbol("VAR-ARG-POSITION"));

    static private final SubLString $str6$__Leaving_PPH_SETTING_VAR_TYPES_I = makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");

    static private final SubLString $str7$___Output_list___S__ = makeString("~& Output list: ~S~%");

    static private final SubLString $str8$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    static private final SubLString $str9$___Leaving__PPH_VAR_TYPES___S = makeString("~% Leaving *PPH-VAR-TYPES* ~S");

    static private final SubLList $list10 = list(reader_make_constant_shell("pastTense-Generic"));

    static private final SubLList $list11 = list(makeSymbol("WU"), makeSymbol("SENSE"), makeSymbol("FRAME"), makeSymbol("HEAD-TYPE"), makeSymbol("ROLES"));



    static private final SubLList $list14 = list(list($BIND, makeSymbol("ARG2")));

    static private final SubLList $list17 = list($BIND, makeSymbol("PRED"));

    static private final SubLList $list18 = list(makeKeyword("ANYTHING"));

    private static final SubLObject $$DitransitiveNP_NPFrame = reader_make_constant_shell("DitransitiveNP-NPFrame");



    private static final SubLList $list22 = list(makeKeyword("SUBJECT"));

    private static final SubLList $list23 = list($VERB);

    private static final SubLList $list24 = list(makeKeyword("OBLIQUE-OBJECT"));

    static private final SubLList $list25 = list(makeKeyword("OBJECT"));







    private static final SubLList $list30 = list(list(reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("CalendarYear"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("CalendarMonth"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("CalendarDay"), reader_make_constant_shell("On-TheWord")), list(reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("City"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("GeographicalRegion"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("to-UnderspecifiedLocation"), reader_make_constant_shell("Thing"), reader_make_constant_shell("To-TheWord")));

    private static final SubLList $list31 = list(list($BIND, makeSymbol("ARG0")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("ARG2")));

    private static final SubLSymbol ARG0 = makeSymbol("ARG0");

    private static final SubLList $list33 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("WU"));





    private static final SubLString $str36$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str37$__ = makeString(") ");

    static private final SubLString $str38$Couldn_t_adjoin__S_to____S = makeString("Couldn't adjoin ~S to~% ~S");

    static private final SubLList $list39 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    // Definitions
    /**
     * Try to generate PHRASE using #$verbSemTrans-Canonical information.
     */
    @LispMethod(comment = "Try to generate PHRASE using #$verbSemTrans-Canonical information.")
    public static final SubLObject generate_with_verb_sem_trans_canonical_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject doneP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject var_pairs = pph_methods_formulas.pph_strip_explicit_cycl_quants(cycl, $EXISTENTIAL);
                    SubLObject core_template = thread.secondMultipleValue();
                    SubLObject keep_explicitP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = pph_types.pph_matching_verb_semtrans_assertions(cycl, pph_vars.$pph_language_mt$.getDynamicValue(thread));
                            SubLObject vst_canonical_as = NIL;
                            for (vst_canonical_as = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , vst_canonical_as = csome_list_var.first()) {
                                {
                                    SubLObject var_types_shadow = dictionary_utilities.copy_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
                                    {
                                        SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = pph_macros.$pph_var_types_counter$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                                            pph_macros.$pph_var_types_counter$.bind(number_utilities.f_1X(pph_macros.$pph_var_types_counter$.getDynamicValue(thread)), thread);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format(T, $str_alt4$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)));
                                            }
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_1 = pph_vars.$pph_var_types$.currentBinding(thread);
                                                    try {
                                                        pph_vars.$pph_var_types$.bind(var_types_shadow, thread);
                                                        {
                                                            SubLObject cdolist_list_var = var_pairs;
                                                            SubLObject cons = NIL;
                                                            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject datum = cons;
                                                                    SubLObject current = datum;
                                                                    SubLObject var = NIL;
                                                                    SubLObject var_arg_position = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt5);
                                                                    var = current.first();
                                                                    current = current.rest();
                                                                    var_arg_position = current;
                                                                    pph_variable_handling.pph_register_var_quantifier(var, $EXISTENTIAL);
                                                                }
                                                            }
                                                            {
                                                                SubLObject attemptedP = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_try_vst_canonical(phrase, core_template, var_pairs, vst_canonical_as);
                                                                if (NIL == attemptedP) {
                                                                } else {
                                                                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                                                        doneP = T;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_vars.$pph_var_types$.rebind(_prev_bind_0_1, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                            format(T, $str_alt6$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue(thread));
                                                        }
                                                        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                format(T, $str_alt7$___Output_list___S__, pph_phrase.pph_phrase_output_list(phrase));
                                                            }
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                format(T, $str_alt8$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue(thread), dictionary.dictionary_values(var_types_shadow));
                                                            }
                                                            pph_macros.pph_reset_var_types(var_types_shadow);
                                                        } else {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                format(T, $str_alt9$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)));
                                                            }
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_var_types_counter$.rebind(_prev_bind_1, thread);
                                            pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    // Definitions
    /**
     * Try to generate PHRASE using #$verbSemTrans-Canonical information.
     */
    @LispMethod(comment = "Try to generate PHRASE using #$verbSemTrans-Canonical information.")
    public static SubLObject generate_with_verb_sem_trans_canonical(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject doneP = NIL;
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_methods_formulas.pph_strip_explicit_cycl_quants(cycl, $EXISTENTIAL);
        final SubLObject core_template = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == doneP) {
            SubLObject csome_list_var = pph_types.pph_matching_verb_semtrans_assertions(cycl, pph_vars.$pph_language_mt$.getDynamicValue(thread));
            SubLObject vst_canonical_as = NIL;
            vst_canonical_as = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject var_types_shadow = dictionary_utilities.copy_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_macros.$pph_var_types_counter$.currentBinding(thread);
                try {
                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                    pph_macros.$pph_var_types_counter$.bind(number_utilities.f_1X(pph_macros.$pph_var_types_counter$.getDynamicValue(thread)), thread);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str4$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    try {
                        final SubLObject _prev_bind_0_$1 = pph_vars.$pph_var_types$.currentBinding(thread);
                        try {
                            pph_vars.$pph_var_types$.bind(var_types_shadow, thread);
                            SubLObject cdolist_list_var = var_pairs;
                            SubLObject cons = NIL;
                            cons = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject var = NIL;
                                SubLObject var_arg_position = NIL;
                                destructuring_bind_must_consp(current, datum, $list5);
                                var = current.first();
                                current = var_arg_position = current.rest();
                                pph_variable_handling.pph_register_var_quantifier(var, $EXISTENTIAL);
                                cdolist_list_var = cdolist_list_var.rest();
                                cons = cdolist_list_var.first();
                            } 
                            final SubLObject attemptedP = pph_try_vst_canonical(phrase, core_template, var_pairs, vst_canonical_as);
                            if (NIL != attemptedP) {
                                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                    doneP = T;
                                }
                            }
                        } finally {
                            pph_vars.$pph_var_types$.rebind(_prev_bind_0_$1, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str6$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str7$___Output_list___S__, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str8$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue(thread), dictionary.dictionary_values(var_types_shadow), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_macros.pph_reset_var_types(var_types_shadow);
                            } else
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str9$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }

                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_var_types_counter$.rebind(_prev_bind_2, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0, thread);
                }
                csome_list_var = csome_list_var.rest();
                vst_canonical_as = csome_list_var.first();
            } 
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     *
     *
     * @param CORE-TEMPLATE;
     * 		the template to apply to PHRASE to get its non-existentially
     * 		bound core formula.
     */
    @LispMethod(comment = "@param CORE-TEMPLATE;\r\n\t\tthe template to apply to PHRASE to get its non-existentially\r\n\t\tbound core formula.")
    public static final SubLObject pph_try_vst_canonical_alt(SubLObject phrase, SubLObject core_template, SubLObject var_pairs, SubLObject vst_canonical_as) {
        {
            SubLObject rephrase_template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_rephrase_template_from_vst_canonical(phrase, core_template, var_pairs, vst_canonical_as);
            SubLObject attemptedP = NIL;
            if (NIL == pph_utilities.pph_identity_template_p(rephrase_template)) {
                {
                    SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                    SubLObject past_preds = pph_utilities.pph_filter_preds(agr_preds, $list_alt10, UNPROVIDED);
                    SubLObject phrase_template = pph_templates.pph_phrasify_phrase_naut(rephrase_template, arg_position_map);
                    pph_phrase.pph_phrase_set_agr_preds(phrase_template, NIL != past_preds ? ((SubLObject) (past_preds)) : agr_preds, UNPROVIDED);
                    pph_templates.pph_template_phrase_set_cycl(phrase_template, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), arg_position_map, NIL);
                    pph_main.pph_phrase_generate(phrase_template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != pph_phrase.pph_phrase_doneP(phrase_template)) {
                        pph_phrase.pph_phrase_copy(phrase_template, phrase, UNPROVIDED);
                        pph_phrase.pph_phrase_add_justification(phrase, vst_canonical_as);
                    }
                }
                attemptedP = T;
            }
            return attemptedP;
        }
    }

    /**
     *
     *
     * @param CORE-TEMPLATE;
     * 		the template to apply to PHRASE to get its non-existentially
     * 		bound core formula.
     */
    @LispMethod(comment = "@param CORE-TEMPLATE;\r\n\t\tthe template to apply to PHRASE to get its non-existentially\r\n\t\tbound core formula.")
    public static SubLObject pph_try_vst_canonical(final SubLObject phrase, final SubLObject core_template, final SubLObject var_pairs, final SubLObject vst_canonical_as) {
        final SubLObject rephrase_template = pph_rephrase_template_from_vst_canonical(phrase, core_template, var_pairs, vst_canonical_as);
        SubLObject attemptedP = NIL;
        if (NIL == pph_utilities.pph_identity_template_p(rephrase_template)) {
            final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
            final SubLObject past_preds = pph_utilities.pph_filter_preds(agr_preds, $list10, UNPROVIDED);
            final SubLObject phrase_template = pph_templates.pph_phrasify_phrase_naut(rephrase_template, arg_position_map);
            pph_phrase.pph_phrase_set_agr_preds(phrase_template, NIL != past_preds ? past_preds : agr_preds, UNPROVIDED);
            pph_templates.pph_template_phrase_set_cycl(phrase_template, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), arg_position_map, NIL);
            pph_main.pph_phrase_generate(phrase_template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != pph_phrase.pph_phrase_doneP(phrase_template)) {
                pph_phrase.pph_phrase_copy(phrase_template, phrase, UNPROVIDED);
                pph_phrase.pph_phrase_add_justification(phrase, vst_canonical_as);
            }
            attemptedP = T;
        }
        return attemptedP;
    }

    /**
     *
     *
     * @param CORE-TEMPLATE;
     * 		the template to apply to PHRASE to get its non-existentially
     * 		bound core formula.
     * @param VAR-PAIRS;
     * 		ALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.
     * @return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using #$verbSemTrans-Canonical.
     */
    @LispMethod(comment = "@param CORE-TEMPLATE;\r\n\t\tthe template to apply to PHRASE to get its non-existentially\r\n\t\tbound core formula.\r\n@param VAR-PAIRS;\r\n\t\tALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.\r\n@return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using #$verbSemTrans-Canonical.")
    public static final SubLObject pph_rephrase_template_from_vst_canonical_alt(SubLObject phrase, SubLObject core_template, SubLObject var_pairs, SubLObject vst_canonical_as) {
        {
            SubLObject core_formula = pph_utilities.pph_apply_template(core_template, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
            SubLObject core_map = pph_utilities.pph_figure_new_arg_position_map(pph_phrase.pph_phrase_arg_position_map(phrase), core_template);
            SubLObject core_vst_template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_rephrase_template_from_vst_canonical_int(core_formula, var_pairs, vst_canonical_as, core_map);
            SubLObject contextualized = (NIL != pph_utilities.pph_identity_template_p(core_vst_template)) ? ((SubLObject) (pph_utilities.pph_identity_template())) : pph_utilities.pph_apply_template(core_vst_template, core_template);
            return contextualized;
        }
    }

    /**
     *
     *
     * @param CORE-TEMPLATE;
     * 		the template to apply to PHRASE to get its non-existentially
     * 		bound core formula.
     * @param VAR-PAIRS;
     * 		ALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.
     * @return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using #$verbSemTrans-Canonical.
     */
    @LispMethod(comment = "@param CORE-TEMPLATE;\r\n\t\tthe template to apply to PHRASE to get its non-existentially\r\n\t\tbound core formula.\r\n@param VAR-PAIRS;\r\n\t\tALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.\r\n@return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using #$verbSemTrans-Canonical.")
    public static SubLObject pph_rephrase_template_from_vst_canonical(final SubLObject phrase, final SubLObject core_template, final SubLObject var_pairs, final SubLObject vst_canonical_as) {
        final SubLObject core_formula = pph_utilities.pph_apply_template(core_template, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        final SubLObject core_map = pph_utilities.pph_figure_new_arg_position_map(pph_phrase.pph_phrase_arg_position_map(phrase), core_template);
        final SubLObject core_vst_template = pph_rephrase_template_from_vst_canonical_int(core_formula, var_pairs, vst_canonical_as, core_map);
        final SubLObject contextualized = (NIL != pph_utilities.pph_identity_template_p(core_vst_template)) ? pph_utilities.pph_identity_template() : pph_utilities.pph_apply_template(core_vst_template, core_template);
        return contextualized;
    }

    /**
     *
     *
     * @param VAR-PAIRS;
     * 		ALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.
     * @return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using VST-CANONICAL-AS.
     */
    @LispMethod(comment = "@param VAR-PAIRS;\r\n\t\tALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.\r\n@return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using VST-CANONICAL-AS.")
    public static final SubLObject pph_rephrase_template_from_vst_canonical_int_alt(SubLObject core_formula, SubLObject var_pairs, SubLObject vst_canonical_as, SubLObject core_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template = pph_utilities.pph_identity_template();
                SubLObject datum = assertions_high.gaf_args(vst_canonical_as);
                SubLObject current = datum;
                SubLObject wu = NIL;
                SubLObject sense = NIL;
                SubLObject frame = NIL;
                SubLObject head_type = NIL;
                SubLObject roles = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                wu = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt11);
                sense = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt11);
                frame = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt11);
                head_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt11);
                roles = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != el_conjunction_p(core_formula)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject head_var = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_head_extraction_templates(core_formula, var_pairs, head_type, core_map);
                            SubLObject head_var_template = thread.secondMultipleValue();
                            SubLObject head_type_template = thread.thirdMultipleValue();
                            SubLObject head_remainder_template = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != head_var) {
                                {
                                    SubLObject dependent_templates = NIL;
                                    SubLObject remainder_template = head_remainder_template;
                                    SubLObject abortP = NIL;
                                    if (NIL == abortP) {
                                        {
                                            SubLObject csome_list_var = el_list_items(roles);
                                            SubLObject role = NIL;
                                            for (role = csome_list_var.first(); !((NIL != abortP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , role = csome_list_var.first()) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject dependent_template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_dependent_templates(role, head_var, core_formula, remainder_template);
                                                    SubLObject new_remainder_template = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != dependent_template) {
                                                        dependent_templates = cons(dependent_template, dependent_templates);
                                                        remainder_template = new_remainder_template;
                                                    } else {
                                                        abortP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != abortP) {
                                        return pph_utilities.pph_identity_template();
                                    }
                                    dependent_templates = nreverse(dependent_templates);
                                    template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_rephrase_template(frame, wu, head_var_template, dependent_templates, remainder_template, core_map, core_formula);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
                return template;
            }
        }
    }

    /**
     *
     *
     * @param VAR-PAIRS;
     * 		ALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.
     * @return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using VST-CANONICAL-AS.
     */
    @LispMethod(comment = "@param VAR-PAIRS;\r\n\t\tALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.\r\n@return PPH-CYCL-TEMPLATE-P; for rephrasing PHRASE using VST-CANONICAL-AS.")
    public static SubLObject pph_rephrase_template_from_vst_canonical_int(final SubLObject core_formula, final SubLObject var_pairs, final SubLObject vst_canonical_as, final SubLObject core_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(vst_canonical_as);
        SubLObject wu = NIL;
        SubLObject sense = NIL;
        SubLObject frame = NIL;
        SubLObject head_type = NIL;
        SubLObject roles = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        wu = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        frame = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        head_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        roles = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != el_conjunction_p(core_formula)) {
                thread.resetMultipleValues();
                final SubLObject head_var = pph_vst_head_extraction_templates(core_formula, var_pairs, head_type, core_map);
                final SubLObject head_var_template = thread.secondMultipleValue();
                final SubLObject head_type_template = thread.thirdMultipleValue();
                final SubLObject head_remainder_template = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != head_var) {
                    SubLObject dependent_templates = NIL;
                    SubLObject remainder_template = head_remainder_template;
                    SubLObject abortP = NIL;
                    if (NIL == abortP) {
                        SubLObject csome_list_var = el_list_items(roles);
                        SubLObject role = NIL;
                        role = csome_list_var.first();
                        while ((NIL == abortP) && (NIL != csome_list_var)) {
                            thread.resetMultipleValues();
                            final SubLObject dependent_template = pph_vst_dependent_templates(role, head_var, core_formula, remainder_template);
                            final SubLObject new_remainder_template = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != dependent_template) {
                                dependent_templates = cons(dependent_template, dependent_templates);
                                remainder_template = new_remainder_template;
                            } else {
                                abortP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            role = csome_list_var.first();
                        } 
                    }
                    if (NIL != abortP) {
                        return pph_utilities.pph_identity_template();
                    }
                    dependent_templates = nreverse(dependent_templates);
                    template = pph_vst_rephrase_template(frame, wu, head_var_template, dependent_templates, remainder_template, core_map, core_formula);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list11);
        }
        return template;
    }

    /**
     * Try to identify an existentially bound variable in CORE-FORMULA to use as the denot of the head verb.
     *
     * @param HEAD-TYPE;
     * 		the type the denot is constrained to be.
     * @param VAR-PAIRS;
     * 		ALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.
     * @return 0; EL-VAR? - the head variable we've identified.
     * @return 1; PPH-CYCL-TEMPLATE-P - where it's located.
     * @return 2; PPH-CYCL-TEMPLATE-P - where the HEAD-TYPE is located.
     * @return 3; PPH-CYCL-TEMPLATE-P - a template indicating what of CORE-FORMULA remains to be taken care of.
     */
    @LispMethod(comment = "Try to identify an existentially bound variable in CORE-FORMULA to use as the denot of the head verb.\r\n\r\n@param HEAD-TYPE;\r\n\t\tthe type the denot is constrained to be.\r\n@param VAR-PAIRS;\r\n\t\tALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.\r\n@return 0; EL-VAR? - the head variable we\'ve identified.\r\n@return 1; PPH-CYCL-TEMPLATE-P - where it\'s located.\r\n@return 2; PPH-CYCL-TEMPLATE-P - where the HEAD-TYPE is located.\r\n@return 3; PPH-CYCL-TEMPLATE-P - a template indicating what of CORE-FORMULA remains to be taken care of.")
    public static final SubLObject pph_vst_head_extraction_templates_alt(SubLObject core_formula, SubLObject var_pairs, SubLObject head_type, SubLObject core_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject head_var_template = NIL;
                SubLObject head_remainder_template = NIL;
                SubLObject head_var = NIL;
                SubLObject actual_head_type = NIL;
                SubLObject head_type_template = NIL;
                SubLObject head_conjunct_num = NIL;
                {
                    SubLObject conjunct_num = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(core_formula, $IGNORE);
                    SubLObject rest = NIL;
                    for (rest = args; !((NIL != head_conjunct_num) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject conjunct = rest.first();
                            conjunct_num = add(conjunct_num, ONE_INTEGER);
                            {
                                SubLObject rest_3 = NIL;
                                for (rest_3 = var_pairs; !((NIL != head_conjunct_num) || (NIL == rest_3)); rest_3 = rest_3.rest()) {
                                    {
                                        SubLObject cons = rest_3.first();
                                        SubLObject datum = cons;
                                        SubLObject current = datum;
                                        SubLObject var = NIL;
                                        SubLObject var_arg_position = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt5);
                                        var = current.first();
                                        current = current.rest();
                                        var_arg_position = current;
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, listS($$isa, var, $list_alt14));
                                            SubLObject v_bindings = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != success) {
                                                {
                                                    SubLObject arg2 = list_utilities.alist_lookup_without_values(v_bindings, ARG2, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_okay_for_head_typeP(arg2, head_type)) {
                                                        head_conjunct_num = conjunct_num;
                                                        actual_head_type = arg2;
                                                        head_var = var;
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
                if (NIL != head_conjunct_num) {
                    head_var_template = pph_utilities.pph_cycl_template_from_arg_position(list(head_conjunct_num, ONE_INTEGER));
                    head_type_template = pph_utilities.pph_cycl_template_from_arg_position(list(head_conjunct_num, TWO_INTEGER));
                    {
                        SubLObject other_conjunct_templates = NIL;
                        SubLObject end_var = formula_length(core_formula, UNPROVIDED);
                        SubLObject conjunct_num = NIL;
                        for (conjunct_num = ONE_INTEGER; !conjunct_num.numGE(end_var); conjunct_num = number_utilities.f_1X(conjunct_num)) {
                            if (!conjunct_num.eql(head_conjunct_num)) {
                                {
                                    SubLObject conjunct_template = at_utilities.get_generic_arg(conjunct_num);
                                    other_conjunct_templates = cons(conjunct_template, other_conjunct_templates);
                                }
                            }
                        }
                        head_remainder_template = make_el_formula($ARG0, nreverse(other_conjunct_templates), UNPROVIDED);
                    }
                    {
                        SubLObject head_type_arg_position = pph_utilities.pph_arg_position_lookup(pph_utilities.pph_arg_position_from_template(head_type_template), core_map);
                        pph_variable_handling.pph_register_var(head_var, actual_head_type, head_type_arg_position);
                    }
                }
                return values(head_var, head_var_template, head_type_template, head_remainder_template);
            }
        }
    }

    /**
     * Try to identify an existentially bound variable in CORE-FORMULA to use as the denot of the head verb.
     *
     * @param HEAD-TYPE;
     * 		the type the denot is constrained to be.
     * @param VAR-PAIRS;
     * 		ALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.
     * @return 0; EL-VAR? - the head variable we've identified.
     * @return 1; PPH-CYCL-TEMPLATE-P - where it's located.
     * @return 2; PPH-CYCL-TEMPLATE-P - where the HEAD-TYPE is located.
     * @return 3; PPH-CYCL-TEMPLATE-P - a template indicating what of CORE-FORMULA remains to be taken care of.
     */
    @LispMethod(comment = "Try to identify an existentially bound variable in CORE-FORMULA to use as the denot of the head verb.\r\n\r\n@param HEAD-TYPE;\r\n\t\tthe type the denot is constrained to be.\r\n@param VAR-PAIRS;\r\n\t\tALIST-P of (<VAR> -> <ARG-POSITION>) mappings for variables in CORE-FORMULA. The arg-positions are with respect to the matrix formula.\r\n@return 0; EL-VAR? - the head variable we\'ve identified.\r\n@return 1; PPH-CYCL-TEMPLATE-P - where it\'s located.\r\n@return 2; PPH-CYCL-TEMPLATE-P - where the HEAD-TYPE is located.\r\n@return 3; PPH-CYCL-TEMPLATE-P - a template indicating what of CORE-FORMULA remains to be taken care of.")
    public static SubLObject pph_vst_head_extraction_templates(final SubLObject core_formula, final SubLObject var_pairs, final SubLObject head_type, final SubLObject core_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject head_var_template = NIL;
        SubLObject head_remainder_template = NIL;
        SubLObject head_var = NIL;
        SubLObject actual_head_type = NIL;
        SubLObject head_type_template = NIL;
        SubLObject head_conjunct_num = NIL;
        SubLObject conjunct_num = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(core_formula, $IGNORE);
        SubLObject rest;
        SubLObject conjunct;
        SubLObject rest_$3;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject var;
        SubLObject var_arg_position;
        SubLObject success;
        SubLObject v_bindings;
        SubLObject arg2;
        for (rest = NIL, rest = args; (NIL == head_conjunct_num) && (NIL != rest); rest = rest.rest()) {
            conjunct = rest.first();
            conjunct_num = add(conjunct_num, ONE_INTEGER);
            for (rest_$3 = NIL, rest_$3 = var_pairs; (NIL == head_conjunct_num) && (NIL != rest_$3); rest_$3 = rest_$3.rest()) {
                cons = rest_$3.first();
                datum = current = cons;
                var = NIL;
                var_arg_position = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                var = current.first();
                current = var_arg_position = current.rest();
                thread.resetMultipleValues();
                success = formula_pattern_match.formula_matches_pattern(conjunct, listS($$isa, var, $list14));
                v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    arg2 = list_utilities.alist_lookup_without_values(v_bindings, ARG2, UNPROVIDED, UNPROVIDED);
                    if (NIL != pph_vst_okay_for_head_typeP(arg2, head_type)) {
                        head_conjunct_num = conjunct_num;
                        actual_head_type = arg2;
                        head_var = var;
                    }
                }
            }
        }
        if (NIL != head_conjunct_num) {
            head_var_template = pph_utilities.pph_cycl_template_from_arg_position(list(head_conjunct_num, ONE_INTEGER));
            head_type_template = pph_utilities.pph_cycl_template_from_arg_position(list(head_conjunct_num, TWO_INTEGER));
            SubLObject other_conjunct_templates = NIL;
            SubLObject end_var;
            SubLObject conjunct_num2;
            SubLObject conjunct_template;
            for (end_var = formula_length(core_formula, UNPROVIDED), conjunct_num2 = NIL, conjunct_num2 = ONE_INTEGER; !conjunct_num2.numGE(end_var); conjunct_num2 = number_utilities.f_1X(conjunct_num2)) {
                if (!conjunct_num2.eql(head_conjunct_num)) {
                    conjunct_template = at_utilities.get_generic_arg(conjunct_num2);
                    other_conjunct_templates = cons(conjunct_template, other_conjunct_templates);
                }
            }
            head_remainder_template = make_el_formula($ARG0, nreverse(other_conjunct_templates), UNPROVIDED);
            final SubLObject head_type_arg_position = pph_utilities.pph_arg_position_lookup(pph_utilities.pph_arg_position_from_template(head_type_template), core_map);
            pph_variable_handling.pph_register_var(head_var, actual_head_type, head_type_arg_position);
        }
        return values(head_var, head_var_template, head_type_template, head_remainder_template);
    }

    public static final SubLObject pph_vst_okay_for_head_typeP_alt(SubLObject arg2, SubLObject head_type) {
        return NIL != pph_utilities.pph_top_level_preciseP() ? ((SubLObject) (equal(arg2, head_type))) : pph_utilities.pph_genlP(head_type, arg2, UNPROVIDED);
    }

    public static SubLObject pph_vst_okay_for_head_typeP(final SubLObject arg2, final SubLObject head_type) {
        return NIL != pph_utilities.pph_top_level_preciseP() ? equal(arg2, head_type) : pph_utilities.pph_genlP(head_type, arg2, UNPROVIDED);
    }

    /**
     * Try to find something in the part of CORE-FORMULA specified by TEMPLATE that
     * playes ROLE with respect to HEAD-VAR.
     */
    @LispMethod(comment = "Try to find something in the part of CORE-FORMULA specified by TEMPLATE that\r\nplayes ROLE with respect to HEAD-VAR.\nTry to find something in the part of CORE-FORMULA specified by TEMPLATE that\nplayes ROLE with respect to HEAD-VAR.")
    public static final SubLObject pph_vst_dependent_templates_alt(SubLObject role, SubLObject head_var, SubLObject core_formula, SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dependent_template = NIL;
                SubLObject remainder_template = NIL;
                SubLObject dependent_conjunct_template = NIL;
                SubLObject args = cycl_utilities.formula_args(template, $IGNORE);
                SubLObject rest = NIL;
                for (rest = args; !((NIL != dependent_conjunct_template) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject conjunct_template = rest.first();
                        SubLObject conjunct = pph_utilities.pph_apply_template(conjunct_template, core_formula);
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, listS($list_alt17, head_var, $list_alt18));
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_okay_for_roleP(pred, role)) {
                                        dependent_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, conjunct_template);
                                        dependent_conjunct_template = conjunct_template;
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != dependent_conjunct_template) {
                    {
                        SubLObject remaining_conjunct_templates = remove(dependent_conjunct_template, cycl_utilities.formula_args(template, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        remainder_template = (NIL != remaining_conjunct_templates) ? ((SubLObject) (make_el_formula($ARG0, remaining_conjunct_templates, UNPROVIDED))) : NIL;
                    }
                }
                return values(dependent_template, remainder_template);
            }
        }
    }

    @LispMethod(comment = "Try to find something in the part of CORE-FORMULA specified by TEMPLATE that\r\nplayes ROLE with respect to HEAD-VAR.\nTry to find something in the part of CORE-FORMULA specified by TEMPLATE that\nplayes ROLE with respect to HEAD-VAR.")
    public static SubLObject pph_vst_dependent_templates(final SubLObject role, final SubLObject head_var, final SubLObject core_formula, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dependent_template = NIL;
        SubLObject remainder_template = NIL;
        SubLObject dependent_conjunct_template = NIL;
        final SubLObject args = cycl_utilities.formula_args(template, $IGNORE);
        SubLObject rest;
        SubLObject conjunct_template;
        SubLObject conjunct;
        SubLObject success;
        SubLObject v_bindings;
        SubLObject pred;
        for (rest = NIL, rest = args; (NIL == dependent_conjunct_template) && (NIL != rest); rest = rest.rest()) {
            conjunct_template = rest.first();
            conjunct = pph_utilities.pph_apply_template(conjunct_template, core_formula);
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(conjunct, listS($list17, head_var, $list18));
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
                if (NIL != pph_vst_okay_for_roleP(pred, role)) {
                    dependent_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, conjunct_template);
                    dependent_conjunct_template = conjunct_template;
                }
            }
        }
        if (NIL != dependent_conjunct_template) {
            final SubLObject remaining_conjunct_templates = remove(dependent_conjunct_template, cycl_utilities.formula_args(template, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            remainder_template = (NIL != remaining_conjunct_templates) ? make_el_formula($ARG0, remaining_conjunct_templates, UNPROVIDED) : NIL;
        }
        return values(dependent_template, remainder_template);
    }

    public static final SubLObject pph_vst_okay_for_roleP_alt(SubLObject arg2, SubLObject role) {
        return NIL != pph_utilities.pph_top_level_preciseP() ? ((SubLObject) (equal(arg2, role))) : pph_utilities.pph_genl_predicateP(role, arg2, UNPROVIDED);
    }

    public static SubLObject pph_vst_okay_for_roleP(final SubLObject arg2, final SubLObject role) {
        return NIL != pph_utilities.pph_top_level_preciseP() ? equal(arg2, role) : pph_utilities.pph_genl_predicateP(role, arg2, UNPROVIDED);
    }

    public static final SubLObject pph_vst_rephrase_template_alt(SubLObject frame, SubLObject wu, SubLObject head_var_template, SubLObject dependent_templates, SubLObject remainder_template, SubLObject core_map, SubLObject core_formula) {
        {
            SubLObject recipe_template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_phrase_template_for_frame(frame, UNPROVIDED);
            SubLObject dependent_keywords = lexicon_utilities.argument_keywords_for_frame(frame);
            SubLObject v_bindings = list_utilities.make_alist_from_keys_and_values(dependent_keywords, dependent_templates);
            SubLObject template = pph_utilities.pph_identity_template();
            if ((NIL != pph_types.pph_phrase_nautP(recipe_template)) && (NIL != v_bindings)) {
                template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_recipe_from_verb_sem_trans_template(recipe_template, wu, head_var_template, v_bindings, remainder_template, core_map, core_formula);
            }
            return template;
        }
    }

    public static SubLObject pph_vst_rephrase_template(final SubLObject frame, final SubLObject wu, final SubLObject head_var_template, final SubLObject dependent_templates, final SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        final SubLObject recipe_template = pph_phrase_template_for_frame(frame, UNPROVIDED);
        final SubLObject dependent_keywords = lexicon_utilities.argument_keywords_for_frame(frame);
        final SubLObject v_bindings = list_utilities.make_alist_from_keys_and_values(dependent_keywords, dependent_templates);
        SubLObject template = pph_utilities.pph_identity_template();
        if ((NIL != pph_types.pph_phrase_nautP(recipe_template)) && (NIL != v_bindings)) {
            template = pph_recipe_from_verb_sem_trans_template(recipe_template, wu, head_var_template, v_bindings, remainder_template, core_map, core_formula);
        }
        return template;
    }

    /**
     *
     *
     * @unknown - should be mt-dependent and come from the KB.
     */
    @LispMethod(comment = "@unknown - should be mt-dependent and come from the KB.")
    public static final SubLObject pph_phrase_template_for_frame_alt(SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return list_utilities.alist_lookup($pph_phrase_templates_for_frames$.getGlobalValue(), frame, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown - should be mt-dependent and come from the KB.
     */
    @LispMethod(comment = "@unknown - should be mt-dependent and come from the KB.")
    public static SubLObject pph_phrase_template_for_frame(final SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return list_utilities.alist_lookup($pph_phrase_templates_for_frames$.getGlobalValue(), frame, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_recipe_from_verb_sem_trans_template_alt(SubLObject recipe_template, SubLObject verb_wu, SubLObject verb_denot, SubLObject v_bindings, SubLObject remainder_template, SubLObject core_map, SubLObject core_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_types.pph_phrase_nautP(recipe_template)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt21$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt22$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(recipe_template), new SubLObject[]{ $str_alt23$_is_not_a_, format_nil_s_no_copy($sym24$PPH_PHRASE_NAUT_) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL != remainder_template) {
                thread.resetMultipleValues();
                {
                    SubLObject recipe_template_4 = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_add_adjuncts(recipe_template, remainder_template, verb_denot, core_formula);
                    SubLObject remainder_template_5 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    recipe_template = recipe_template_4;
                    remainder_template = remainder_template_5;
                }
                remainder_template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_template_for_remainder(com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_remainder_template_remove_var_typing_clauses(remainder_template, core_map, core_formula));
            }
            {
                SubLObject vst_phrase_naut = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_sub_verb_sem_trans_recipe_template(recipe_template, v_bindings, verb_wu, verb_denot, remainder_template);
                return vst_phrase_naut;
            }
        }
    }

    public static SubLObject pph_recipe_from_verb_sem_trans_template(SubLObject recipe_template, final SubLObject verb_wu, final SubLObject verb_denot, final SubLObject v_bindings, SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != remainder_template) {
            thread.resetMultipleValues();
            final SubLObject recipe_template_$4 = pph_vst_add_adjuncts(recipe_template, remainder_template, verb_denot, core_formula);
            final SubLObject remainder_template_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            recipe_template = recipe_template_$4;
            remainder_template = remainder_template_$5;
            remainder_template = pph_vst_template_for_remainder(pph_vst_remainder_template_remove_var_typing_clauses(remainder_template, core_map, core_formula));
        }
        final SubLObject vst_phrase_naut = pph_sub_verb_sem_trans_recipe_template(recipe_template, v_bindings, verb_wu, verb_denot, remainder_template);
        return vst_phrase_naut;
    }

    public static final SubLObject pph_vst_add_adjuncts_alt(SubLObject recipe_template, SubLObject remainder_template, SubLObject verb_denot_template, SubLObject core_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject head_var = pph_utilities.pph_apply_template(verb_denot_template, core_formula);
                SubLObject remaining_conjunct_templates = NIL;
                SubLObject args = cycl_utilities.formula_args(remainder_template, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject conjunct_template = NIL;
                for (conjunct_template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct_template = cdolist_list_var.first()) {
                    {
                        SubLObject conjunct = pph_utilities.pph_apply_template(conjunct_template, core_formula);
                        SubLObject head_var_position = formula_position(head_var, conjunct, UNPROVIDED);
                        SubLObject handledP = NIL;
                        if (NIL != head_var_position) {
                            thread.resetMultipleValues();
                            {
                                SubLObject recipe_template_6 = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_try_to_add_adjunct_for_conjunct(conjunct, head_var_position, conjunct_template, recipe_template);
                                SubLObject handledP_7 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                recipe_template = recipe_template_6;
                                handledP = handledP_7;
                            }
                        }
                        if (NIL == handledP) {
                            remaining_conjunct_templates = cons(conjunct_template, remaining_conjunct_templates);
                        }
                    }
                }
                remainder_template = (NIL != remaining_conjunct_templates) ? ((SubLObject) (make_el_formula($ARG0, nreverse(remaining_conjunct_templates), UNPROVIDED))) : NIL;
            }
            return values(recipe_template, remainder_template);
        }
    }

    public static SubLObject pph_vst_add_adjuncts(SubLObject recipe_template, SubLObject remainder_template, final SubLObject verb_denot_template, final SubLObject core_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_var = pph_utilities.pph_apply_template(verb_denot_template, core_formula);
        SubLObject remaining_conjunct_templates = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(remainder_template, $IGNORE);
        SubLObject conjunct_template = NIL;
        conjunct_template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject conjunct = pph_utilities.pph_apply_template(conjunct_template, core_formula);
            final SubLObject head_var_position = formula_position(head_var, conjunct, UNPROVIDED);
            SubLObject handledP = NIL;
            if (NIL != head_var_position) {
                thread.resetMultipleValues();
                final SubLObject recipe_template_$6 = pph_try_to_add_adjunct_for_conjunct(conjunct, head_var_position, conjunct_template, recipe_template);
                final SubLObject handledP_$7 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                recipe_template = recipe_template_$6;
                handledP = handledP_$7;
            }
            if (NIL == handledP) {
                remaining_conjunct_templates = cons(conjunct_template, remaining_conjunct_templates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_template = cdolist_list_var.first();
        } 
        remainder_template = (NIL != remaining_conjunct_templates) ? make_el_formula($ARG0, nreverse(remaining_conjunct_templates), UNPROVIDED) : NIL;
        return values(recipe_template, remainder_template);
    }

    /**
     * Try to adjoin a phrase into/onto RECIPE-TEMPLATE that encodes the semantics of CONJUNCT.
     *
     * @param HEAD-VAR-POSITION;
     * 		where the head var appears in CONJUNCT.
     * @param CONJUNCT-TEMPLATE;
     * 		the template identifying the position of CONJUNCT.
     */
    @LispMethod(comment = "Try to adjoin a phrase into/onto RECIPE-TEMPLATE that encodes the semantics of CONJUNCT.\r\n\r\n@param HEAD-VAR-POSITION;\r\n\t\twhere the head var appears in CONJUNCT.\r\n@param CONJUNCT-TEMPLATE;\r\n\t\tthe template identifying the position of CONJUNCT.")
    public static final SubLObject pph_try_to_add_adjunct_for_conjunct_alt(SubLObject conjunct, SubLObject head_var_position, SubLObject conjunct_template, SubLObject recipe_template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject handledP = NIL;
                if (ONE_INTEGER.eql(head_var_position)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, $list_alt26);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject arg2 = list_utilities.alist_lookup_without_values(v_bindings, ARG2, UNPROVIDED, UNPROVIDED);
                                SubLObject arg0 = list_utilities.alist_lookup_without_values(v_bindings, ARG0, UNPROVIDED, UNPROVIDED);
                                if (NIL == handledP) {
                                    {
                                        SubLObject csome_list_var = $pph_vst_preposition_info$.getGlobalValue();
                                        SubLObject tuple = NIL;
                                        for (tuple = csome_list_var.first(); !((NIL != handledP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , tuple = csome_list_var.first()) {
                                            {
                                                SubLObject datum = tuple;
                                                SubLObject current = datum;
                                                SubLObject pred = NIL;
                                                SubLObject col = NIL;
                                                SubLObject wu = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt28);
                                                pred = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt28);
                                                col = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt28);
                                                wu = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if ((NIL != pph_utilities.pph_genl_predicateP(arg0, pred, UNPROVIDED)) && (NIL != pph_utilities.pph_isaP(arg2, col, UNPROVIDED))) {
                                                        {
                                                            SubLObject pred_template = pph_utilities.make_formula_arg_naut(ZERO_INTEGER, conjunct_template);
                                                            SubLObject object_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, conjunct_template);
                                                            SubLObject pp_naut = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_make_pp_naut(wu, pred_template, object_template);
                                                            recipe_template = com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_adjoin(pp_naut, recipe_template);
                                                            handledP = T;
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt28);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(recipe_template, handledP);
            }
        }
    }

    @LispMethod(comment = "Try to adjoin a phrase into/onto RECIPE-TEMPLATE that encodes the semantics of CONJUNCT.\r\n\r\n@param HEAD-VAR-POSITION;\r\n\t\twhere the head var appears in CONJUNCT.\r\n@param CONJUNCT-TEMPLATE;\r\n\t\tthe template identifying the position of CONJUNCT.")
    public static SubLObject pph_try_to_add_adjunct_for_conjunct(final SubLObject conjunct, final SubLObject head_var_position, final SubLObject conjunct_template, SubLObject recipe_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject handledP = NIL;
        if (ONE_INTEGER.eql(head_var_position)) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, $list31);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject arg2 = list_utilities.alist_lookup_without_values(v_bindings, ARG2, UNPROVIDED, UNPROVIDED);
                final SubLObject arg3 = list_utilities.alist_lookup_without_values(v_bindings, ARG0, UNPROVIDED, UNPROVIDED);
                if (NIL == handledP) {
                    SubLObject csome_list_var = $pph_vst_preposition_info$.getGlobalValue();
                    SubLObject tuple = NIL;
                    tuple = csome_list_var.first();
                    while ((NIL == handledP) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = tuple;
                        SubLObject pred = NIL;
                        SubLObject col = NIL;
                        SubLObject wu = NIL;
                        destructuring_bind_must_consp(current, datum, $list33);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list33);
                        col = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list33);
                        wu = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != pph_utilities.pph_genl_predicateP(arg3, pred, UNPROVIDED)) && (NIL != pph_utilities.pph_isaP(arg2, col, UNPROVIDED))) {
                                final SubLObject pred_template = pph_utilities.make_formula_arg_naut(ZERO_INTEGER, conjunct_template);
                                final SubLObject object_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, conjunct_template);
                                final SubLObject pp_naut = pph_vst_make_pp_naut(wu, pred_template, object_template);
                                recipe_template = pph_vst_adjoin(pp_naut, recipe_template);
                                handledP = T;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list33);
                        }
                        csome_list_var = csome_list_var.rest();
                        tuple = csome_list_var.first();
                    } 
                }
            }
        }
        return values(recipe_template, handledP);
    }/**
     * Try to adjoin a phrase into/onto RECIPE-TEMPLATE that encodes the semantics of CONJUNCT.
     *
     * @param HEAD-VAR-POSITION;
     * 		where the head var appears in CONJUNCT.
     * @param CONJUNCT-TEMPLATE;
     * 		the template identifying the position of CONJUNCT.
     */


    public static final SubLObject pph_vst_make_pp_naut_alt(SubLObject wu, SubLObject pred_template, SubLObject object_template) {
        return list($$PhraseFormFn, $$PrepositionalPhrase, list($$ConcatenatePhrasesFn, list($$HeadWordOfPhraseFn, list($$PhraseCycLFn, pred_template, list($const34$BestNLWordFormOfLexemeFn_Constrai, $$prepositionStrings, wu))), list($$TermParaphraseFn, object_template)));
    }

    public static SubLObject pph_vst_make_pp_naut(final SubLObject wu, final SubLObject pred_template, final SubLObject object_template) {
        return list(pph_functions.phraseformfn(), $$PrepositionalPhrase, list(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), list(pph_functions.phrasecyclfn(), pred_template, list(pph_functions.bestnlwordformoflexemefn_constrained(), $$prepositionStrings, wu))), list(pph_functions.termparaphrasefn(), object_template)));
    }

    public static final SubLObject pph_vst_adjoin_alt(SubLObject pp_naut, SubLObject recipe_template) {
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(recipe_template);
            if (pcase_var.eql($$PhraseFormFn)) {
                if (cycl_utilities.formula_arg1(recipe_template, UNPROVIDED).eql($$VerbPhrase)) {
                    return replace_formula_arg(TWO_INTEGER, make_binary_formula($$ConcatenatePhrasesFn, list($$HeadWordOfPhraseFn, cycl_utilities.formula_arg2(recipe_template, UNPROVIDED)), pp_naut), recipe_template);
                } else {
                    return replace_formula_arg(TWO_INTEGER, com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_adjoin(pp_naut, cycl_utilities.formula_arg2(recipe_template, UNPROVIDED)), recipe_template);
                }
            } else {
                if (pcase_var.eql($$ConcatenatePhrasesFn)) {
                    {
                        SubLObject new_phrase_nauts = NIL;
                        SubLObject args = cycl_utilities.formula_args(recipe_template, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject phrase_naut = NIL;
                        for (phrase_naut = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase_naut = cdolist_list_var.first()) {
                            if (NIL != el_formula_with_operator_p(phrase_naut, $$HeadWordOfPhraseFn)) {
                                new_phrase_nauts = cons(replace_formula_arg(ONE_INTEGER, com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.pph_vst_adjoin(pp_naut, cycl_utilities.formula_arg1(phrase_naut, UNPROVIDED)), phrase_naut), new_phrase_nauts);
                            } else {
                                new_phrase_nauts = cons(phrase_naut, new_phrase_nauts);
                            }
                        }
                        return make_el_formula($$ConcatenatePhrasesFn, nreverse(new_phrase_nauts), UNPROVIDED);
                    }
                } else {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt21$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt22$__, format_nil_a_no_copy($str_alt38$Couldn_t_adjoin__S_to____S) });
                        pph_error.pph_handle_error(new_format_string, list(pp_naut, recipe_template));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject pph_vst_adjoin(final SubLObject pp_naut, final SubLObject recipe_template) {
        final SubLObject fn = cycl_utilities.nat_functor(recipe_template);
        if (NIL != kb_utilities.kbeq(fn, pph_functions.phraseformfn())) {
            if (cycl_utilities.formula_arg1(recipe_template, UNPROVIDED).eql($$VerbPhrase)) {
                return replace_formula_arg(TWO_INTEGER, make_binary_formula(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), cycl_utilities.formula_arg2(recipe_template, UNPROVIDED)), pp_naut), recipe_template);
            }
            return replace_formula_arg(TWO_INTEGER, pph_vst_adjoin(pp_naut, cycl_utilities.formula_arg2(recipe_template, UNPROVIDED)), recipe_template);
        } else {
            if (NIL != kb_utilities.kbeq(fn, pph_functions.concatenatephrasesfn())) {
                SubLObject new_phrase_nauts = NIL;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(recipe_template, $IGNORE);
                SubLObject phrase_naut = NIL;
                phrase_naut = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != el_formula_with_operator_p(phrase_naut, pph_functions.headwordofphrasefn())) {
                        new_phrase_nauts = cons(replace_formula_arg(ONE_INTEGER, pph_vst_adjoin(pp_naut, cycl_utilities.formula_arg1(phrase_naut, UNPROVIDED)), phrase_naut), new_phrase_nauts);
                    } else {
                        new_phrase_nauts = cons(phrase_naut, new_phrase_nauts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    phrase_naut = cdolist_list_var.first();
                } 
                return make_el_formula(pph_functions.concatenatephrasesfn(), nreverse(new_phrase_nauts), UNPROVIDED);
            }
            final SubLObject new_format_string = cconcatenate($str36$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str37$__, format_nil.format_nil_a_no_copy($str38$Couldn_t_adjoin__S_to____S) });
            pph_error.pph_handle_error(new_format_string, list(pp_naut, recipe_template));
            return NIL;
        }
    }

    public static final SubLObject pph_vst_template_for_remainder_alt(SubLObject remaining_conjunction_template) {
        return NIL != remaining_conjunction_template ? ((SubLObject) (make_unary_formula($$TermParaphraseFn, remaining_conjunction_template))) : NIL;
    }

    public static SubLObject pph_vst_template_for_remainder(final SubLObject remaining_conjunction_template) {
        return NIL != remaining_conjunction_template ? make_unary_formula(pph_functions.termparaphrasefn(), remaining_conjunction_template) : NIL;
    }

    public static final SubLObject pph_vst_remainder_template_remove_var_typing_clauses_alt(SubLObject remainder_template, SubLObject core_map, SubLObject core_formula) {
        if (NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
            {
                SubLObject remainder_map = pph_utilities.pph_figure_new_arg_position_map(core_map, remainder_template);
                remainder_template = pph_utilities.pph_apply_template(pph_methods_formulas.remove_var_typing_clauses(pph_utilities.pph_apply_template(remainder_template, core_formula), NIL, remainder_map, NIL), remainder_template);
            }
        }
        return remainder_template;
    }

    public static SubLObject pph_vst_remainder_template_remove_var_typing_clauses(SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        if (NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
            final SubLObject remainder_map = pph_utilities.pph_figure_new_arg_position_map(core_map, remainder_template);
            remainder_template = pph_utilities.pph_apply_template(pph_methods_formulas.remove_var_typing_clauses(pph_utilities.pph_apply_template(remainder_template, core_formula), NIL, remainder_map, NIL), remainder_template);
        }
        return remainder_template;
    }

    /**
     *
     *
     * @param BINDING-LIST;
     * 		alist mapping keywords in RECIPE-TEMPLATE to what they should be
     * 		replaced with.
     */
    @LispMethod(comment = "@param BINDING-LIST;\r\n\t\talist mapping keywords in RECIPE-TEMPLATE to what they should be\r\n\t\treplaced with.")
    public static final SubLObject pph_sub_verb_sem_trans_recipe_template_alt(SubLObject recipe_template, SubLObject binding_list, SubLObject verb_wu, SubLObject verb_denot, SubLObject remainder_template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_types.pph_phrase_nautP(recipe_template)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt21$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt22$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(recipe_template), new SubLObject[]{ $str_alt23$_is_not_a_, format_nil_s_no_copy($sym24$PPH_PHRASE_NAUT_) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject cdolist_list_var = binding_list;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        key = current.first();
                        current = current.rest();
                        value = current;
                        recipe_template = cycl_utilities.expression_subst(value, key, recipe_template, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            recipe_template = cycl_utilities.expression_subst(verb_wu, $VERB, recipe_template, UNPROVIDED, UNPROVIDED);
            recipe_template = cycl_utilities.expression_subst(verb_denot, $VERB_DENOT, recipe_template, UNPROVIDED, UNPROVIDED);
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_cycl_template_p(recipe_template)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt21$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt22$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(recipe_template), new SubLObject[]{ $str_alt23$_is_not_a_, format_nil_s_no_copy(PPH_CYCL_TEMPLATE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
                recipe_template = list($$PhraseFormFn, $$NLSentence, list($$NLConjunctionFn, recipe_template, remainder_template));
            }
            return recipe_template;
        }
    }

    /**
     *
     *
     * @param BINDING-LIST;
     * 		alist mapping keywords in RECIPE-TEMPLATE to what they should be
     * 		replaced with.
     */
    @LispMethod(comment = "@param BINDING-LIST;\r\n\t\talist mapping keywords in RECIPE-TEMPLATE to what they should be\r\n\t\treplaced with.")
    public static SubLObject pph_sub_verb_sem_trans_recipe_template(SubLObject recipe_template, final SubLObject binding_list, final SubLObject verb_wu, final SubLObject verb_denot, final SubLObject remainder_template) {
        SubLObject cdolist_list_var = binding_list;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            key = current.first();
            current = value = current.rest();
            recipe_template = cycl_utilities.expression_subst(value, key, recipe_template, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        recipe_template = cycl_utilities.expression_subst(verb_wu, $VERB, recipe_template, UNPROVIDED, UNPROVIDED);
        recipe_template = cycl_utilities.expression_subst(verb_denot, $VERB_DENOT, recipe_template, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
            recipe_template = list(pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.nlconjunctionfn(), recipe_template, remainder_template));
        }
        return recipe_template;
    }

    public static final SubLObject declare_pph_methods_verb_sem_trans_file_alt() {
        declareFunction("generate_with_verb_sem_trans_canonical", "GENERATE-WITH-VERB-SEM-TRANS-CANONICAL", 1, 0, false);
        declareFunction("pph_try_vst_canonical", "PPH-TRY-VST-CANONICAL", 4, 0, false);
        declareFunction("pph_rephrase_template_from_vst_canonical", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL", 4, 0, false);
        declareFunction("pph_rephrase_template_from_vst_canonical_int", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL-INT", 4, 0, false);
        declareFunction("pph_vst_head_extraction_templates", "PPH-VST-HEAD-EXTRACTION-TEMPLATES", 4, 0, false);
        declareFunction("pph_vst_okay_for_head_typeP", "PPH-VST-OKAY-FOR-HEAD-TYPE?", 2, 0, false);
        declareFunction("pph_vst_dependent_templates", "PPH-VST-DEPENDENT-TEMPLATES", 4, 0, false);
        declareFunction("pph_vst_okay_for_roleP", "PPH-VST-OKAY-FOR-ROLE?", 2, 0, false);
        declareFunction("pph_vst_rephrase_template", "PPH-VST-REPHRASE-TEMPLATE", 7, 0, false);
        declareFunction("pph_phrase_template_for_frame", "PPH-PHRASE-TEMPLATE-FOR-FRAME", 1, 1, false);
        declareFunction("pph_recipe_from_verb_sem_trans_template", "PPH-RECIPE-FROM-VERB-SEM-TRANS-TEMPLATE", 7, 0, false);
        declareFunction("pph_vst_add_adjuncts", "PPH-VST-ADD-ADJUNCTS", 4, 0, false);
        declareFunction("pph_try_to_add_adjunct_for_conjunct", "PPH-TRY-TO-ADD-ADJUNCT-FOR-CONJUNCT", 4, 0, false);
        declareFunction("pph_vst_make_pp_naut", "PPH-VST-MAKE-PP-NAUT", 3, 0, false);
        declareFunction("pph_vst_adjoin", "PPH-VST-ADJOIN", 2, 0, false);
        declareFunction("pph_vst_template_for_remainder", "PPH-VST-TEMPLATE-FOR-REMAINDER", 1, 0, false);
        declareFunction("pph_vst_remainder_template_remove_var_typing_clauses", "PPH-VST-REMAINDER-TEMPLATE-REMOVE-VAR-TYPING-CLAUSES", 3, 0, false);
        declareFunction("pph_sub_verb_sem_trans_recipe_template", "PPH-SUB-VERB-SEM-TRANS-RECIPE-TEMPLATE", 5, 0, false);
        declareFunction("subloop_reserved_initialize_vst_canonical_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VST-CANONICAL-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_vst_canonical_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VST-CANONICAL-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("vst_canonical_test_case_p", "VST-CANONICAL-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_pph_methods_verb_sem_trans_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("generate_with_verb_sem_trans_canonical", "GENERATE-WITH-VERB-SEM-TRANS-CANONICAL", 1, 0, false);
            declareFunction("pph_try_vst_canonical", "PPH-TRY-VST-CANONICAL", 4, 0, false);
            declareFunction("pph_rephrase_template_from_vst_canonical", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL", 4, 0, false);
            declareFunction("pph_rephrase_template_from_vst_canonical_int", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL-INT", 4, 0, false);
            declareFunction("pph_vst_head_extraction_templates", "PPH-VST-HEAD-EXTRACTION-TEMPLATES", 4, 0, false);
            declareFunction("pph_vst_okay_for_head_typeP", "PPH-VST-OKAY-FOR-HEAD-TYPE?", 2, 0, false);
            declareFunction("pph_vst_dependent_templates", "PPH-VST-DEPENDENT-TEMPLATES", 4, 0, false);
            declareFunction("pph_vst_okay_for_roleP", "PPH-VST-OKAY-FOR-ROLE?", 2, 0, false);
            declareFunction("pph_vst_rephrase_template", "PPH-VST-REPHRASE-TEMPLATE", 7, 0, false);
            declareFunction("pph_phrase_template_for_frame", "PPH-PHRASE-TEMPLATE-FOR-FRAME", 1, 1, false);
            declareFunction("pph_recipe_from_verb_sem_trans_template", "PPH-RECIPE-FROM-VERB-SEM-TRANS-TEMPLATE", 7, 0, false);
            declareFunction("pph_vst_add_adjuncts", "PPH-VST-ADD-ADJUNCTS", 4, 0, false);
            declareFunction("pph_try_to_add_adjunct_for_conjunct", "PPH-TRY-TO-ADD-ADJUNCT-FOR-CONJUNCT", 4, 0, false);
            declareFunction("pph_vst_make_pp_naut", "PPH-VST-MAKE-PP-NAUT", 3, 0, false);
            declareFunction("pph_vst_adjoin", "PPH-VST-ADJOIN", 2, 0, false);
            declareFunction("pph_vst_template_for_remainder", "PPH-VST-TEMPLATE-FOR-REMAINDER", 1, 0, false);
            declareFunction("pph_vst_remainder_template_remove_var_typing_clauses", "PPH-VST-REMAINDER-TEMPLATE-REMOVE-VAR-TYPING-CLAUSES", 3, 0, false);
            declareFunction("pph_sub_verb_sem_trans_recipe_template", "PPH-SUB-VERB-SEM-TRANS-RECIPE-TEMPLATE", 5, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_vst_canonical_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VST-CANONICAL-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_vst_canonical_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VST-CANONICAL-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("vst_canonical_test_case_p", "VST-CANONICAL-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_pph_methods_verb_sem_trans_file_Previous() {
        declareFunction("generate_with_verb_sem_trans_canonical", "GENERATE-WITH-VERB-SEM-TRANS-CANONICAL", 1, 0, false);
        declareFunction("pph_try_vst_canonical", "PPH-TRY-VST-CANONICAL", 4, 0, false);
        declareFunction("pph_rephrase_template_from_vst_canonical", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL", 4, 0, false);
        declareFunction("pph_rephrase_template_from_vst_canonical_int", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL-INT", 4, 0, false);
        declareFunction("pph_vst_head_extraction_templates", "PPH-VST-HEAD-EXTRACTION-TEMPLATES", 4, 0, false);
        declareFunction("pph_vst_okay_for_head_typeP", "PPH-VST-OKAY-FOR-HEAD-TYPE?", 2, 0, false);
        declareFunction("pph_vst_dependent_templates", "PPH-VST-DEPENDENT-TEMPLATES", 4, 0, false);
        declareFunction("pph_vst_okay_for_roleP", "PPH-VST-OKAY-FOR-ROLE?", 2, 0, false);
        declareFunction("pph_vst_rephrase_template", "PPH-VST-REPHRASE-TEMPLATE", 7, 0, false);
        declareFunction("pph_phrase_template_for_frame", "PPH-PHRASE-TEMPLATE-FOR-FRAME", 1, 1, false);
        declareFunction("pph_recipe_from_verb_sem_trans_template", "PPH-RECIPE-FROM-VERB-SEM-TRANS-TEMPLATE", 7, 0, false);
        declareFunction("pph_vst_add_adjuncts", "PPH-VST-ADD-ADJUNCTS", 4, 0, false);
        declareFunction("pph_try_to_add_adjunct_for_conjunct", "PPH-TRY-TO-ADD-ADJUNCT-FOR-CONJUNCT", 4, 0, false);
        declareFunction("pph_vst_make_pp_naut", "PPH-VST-MAKE-PP-NAUT", 3, 0, false);
        declareFunction("pph_vst_adjoin", "PPH-VST-ADJOIN", 2, 0, false);
        declareFunction("pph_vst_template_for_remainder", "PPH-VST-TEMPLATE-FOR-REMAINDER", 1, 0, false);
        declareFunction("pph_vst_remainder_template_remove_var_typing_clauses", "PPH-VST-REMAINDER-TEMPLATE-REMOVE-VAR-TYPING-CLAUSES", 3, 0, false);
        declareFunction("pph_sub_verb_sem_trans_recipe_template", "PPH-SUB-VERB-SEM-TRANS-RECIPE-TEMPLATE", 5, 0, false);
        return NIL;
    }

    public static final SubLObject init_pph_methods_verb_sem_trans_file_alt() {
        deflexical("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*", $list_alt20);
        deflexical("*PPH-VST-PREPOSITION-INFO*", $list_alt25);
        return NIL;
    }

    public static SubLObject init_pph_methods_verb_sem_trans_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*", list(list($$DitransitiveNP_NPFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23), bq_cons(pph_functions.termparaphrasefn_np(), $list24), bq_cons(pph_functions.termparaphrasefn_np(), $list25))), list($$TransitiveNPFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), $$VerbPhrase, list(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), list(pph_functions.phrasecyclfn(), $VERB_DENOT, bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23))), bq_cons(pph_functions.termparaphrasefn_np(), $list25)))))), list($$IntransitiveVerbFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), $$VerbPhrase, list(pph_functions.phrasecyclfn(), $VERB_DENOT, bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23))))))));
            deflexical("*PPH-VST-PREPOSITION-INFO*", $list30);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*", $list_alt20);
            deflexical("*PPH-VST-PREPOSITION-INFO*", $list_alt25);
        }
        return NIL;
    }

    public static SubLObject init_pph_methods_verb_sem_trans_file_Previous() {
        deflexical("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*", list(list($$DitransitiveNP_NPFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23), bq_cons(pph_functions.termparaphrasefn_np(), $list24), bq_cons(pph_functions.termparaphrasefn_np(), $list25))), list($$TransitiveNPFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), $$VerbPhrase, list(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), list(pph_functions.phrasecyclfn(), $VERB_DENOT, bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23))), bq_cons(pph_functions.termparaphrasefn_np(), $list25)))))), list($$IntransitiveVerbFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), $$VerbPhrase, list(pph_functions.phrasecyclfn(), $VERB_DENOT, bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23))))))));
        deflexical("*PPH-VST-PREPOSITION-INFO*", $list30);
        return NIL;
    }

    public static final SubLObject setup_pph_methods_verb_sem_trans_file_alt() {
        pph_types.pph_register_method(GENERATE_WITH_VERB_SEM_TRANS_CANONICAL, $VERB_SEMTRANS_MATCHER, $BEST);
        sunit_external.define_test_category($$$PPH_verbSemTrans, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VST_CANONICAL_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(VST_CANONICAL_TEST_CASE);
        classes.subloop_new_class(VST_CANONICAL_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt48);
        classes.class_set_implements_slot_listeners(VST_CANONICAL_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(VST_CANONICAL_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VST_CANONICAL_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(VST_CANONICAL_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VST_CANONICAL_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.subloop_reserved_initialize_vst_canonical_test_case_class(VST_CANONICAL_TEST_CASE);
        sunit_macros.define_test_case_postamble(VST_CANONICAL_TEST_CASE, $str_alt63$pph_methods_verb_sem_trans, $$$cycl, $list_alt65);
        sunit_macros.def_test_method_register(VST_CANONICAL_TEST_CASE, TEST_ADJUNCTION);
        sunit_macros.def_test_method_register(VST_CANONICAL_TEST_CASE, TEST_DEPENDENT_TEMPLATES);
        sunit_external.define_test_suite($$$PPH_verbSemTrans_Test_Suite, $list_alt65, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_pph_methods_verb_sem_trans_file() {
        if (SubLFiles.USE_V1) {
            pph_types.pph_register_method(GENERATE_WITH_VERB_SEM_TRANS_CANONICAL, $VERB_SEMTRANS_MATCHER, $BEST);
        }
        if (SubLFiles.USE_V2) {
            sunit_external.define_test_category($$$PPH_verbSemTrans, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VST_CANONICAL_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(VST_CANONICAL_TEST_CASE);
            classes.subloop_new_class(VST_CANONICAL_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt48);
            classes.class_set_implements_slot_listeners(VST_CANONICAL_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(VST_CANONICAL_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VST_CANONICAL_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(VST_CANONICAL_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VST_CANONICAL_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.subloop_reserved_initialize_vst_canonical_test_case_class(VST_CANONICAL_TEST_CASE);
            sunit_macros.define_test_case_postamble(VST_CANONICAL_TEST_CASE, $str_alt63$pph_methods_verb_sem_trans, $$$cycl, $list_alt65);
            sunit_macros.def_test_method_register(VST_CANONICAL_TEST_CASE, TEST_ADJUNCTION);
            sunit_macros.def_test_method_register(VST_CANONICAL_TEST_CASE, TEST_DEPENDENT_TEMPLATES);
            sunit_external.define_test_suite($$$PPH_verbSemTrans_Test_Suite, $list_alt65, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject setup_pph_methods_verb_sem_trans_file_Previous() {
        pph_types.pph_register_method(GENERATE_WITH_VERB_SEM_TRANS_CANONICAL, $VERB_SEMTRANS_MATCHER, $BEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_methods_verb_sem_trans_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_methods_verb_sem_trans_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_methods_verb_sem_trans_file();
    }

    static {
    }

    static private final SubLString $str_alt4$__Entering_PPH_SETTING_VAR_TYPES_ = makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");

    static private final SubLList $list_alt5 = cons(makeSymbol("VAR"), makeSymbol("VAR-ARG-POSITION"));

    static private final SubLString $str_alt6$__Leaving_PPH_SETTING_VAR_TYPES_I = makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");

    static private final SubLString $str_alt7$___Output_list___S__ = makeString("~& Output list: ~S~%");

    static private final SubLString $str_alt8$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    static private final SubLString $str_alt9$___Leaving__PPH_VAR_TYPES___S = makeString("~% Leaving *PPH-VAR-TYPES* ~S");

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("pastTense-Generic"));

    static private final SubLList $list_alt11 = list(makeSymbol("WU"), makeSymbol("SENSE"), makeSymbol("FRAME"), makeSymbol("HEAD-TYPE"), makeSymbol("ROLES"));

    static private final SubLList $list_alt14 = list(list($BIND, makeSymbol("ARG2")));

    static private final SubLList $list_alt17 = list($BIND, makeSymbol("PRED"));

    static private final SubLList $list_alt18 = list(makeKeyword("ANYTHING"));

    static private final SubLList $list_alt20 = list(list(reader_make_constant_shell("DitransitiveNP-NPFrame"), reader_make_constant_shell("PhraseFormFn"), reader_make_constant_shell("NLSentence"), list(reader_make_constant_shell("ConcatenatePhrasesFn"), list(reader_make_constant_shell("TermParaphraseFn-NP"), makeKeyword("SUBJECT")), list(reader_make_constant_shell("BestHeadVerbForInitialSubjectFn"), $VERB), list(reader_make_constant_shell("TermParaphraseFn-NP"), makeKeyword("OBLIQUE-OBJECT")), list(reader_make_constant_shell("TermParaphraseFn-NP"), makeKeyword("OBJECT")))), list(reader_make_constant_shell("TransitiveNPFrame"), reader_make_constant_shell("PhraseFormFn"), reader_make_constant_shell("NLSentence"), list(reader_make_constant_shell("ConcatenatePhrasesFn"), list(reader_make_constant_shell("TermParaphraseFn-NP"), makeKeyword("SUBJECT")), list(reader_make_constant_shell("HeadWordOfPhraseFn"), list(reader_make_constant_shell("PhraseFormFn"), reader_make_constant_shell("VerbPhrase"), list(reader_make_constant_shell("ConcatenatePhrasesFn"), list(reader_make_constant_shell("HeadWordOfPhraseFn"), list(reader_make_constant_shell("PhraseCycLFn"), makeKeyword("VERB-DENOT"), list(reader_make_constant_shell("BestHeadVerbForInitialSubjectFn"), $VERB))), list(reader_make_constant_shell("TermParaphraseFn-NP"), makeKeyword("OBJECT"))))))), list(reader_make_constant_shell("IntransitiveVerbFrame"), reader_make_constant_shell("PhraseFormFn"), reader_make_constant_shell("NLSentence"), list(reader_make_constant_shell("ConcatenatePhrasesFn"), list(reader_make_constant_shell("TermParaphraseFn-NP"), makeKeyword("SUBJECT")), list(reader_make_constant_shell("HeadWordOfPhraseFn"), list(reader_make_constant_shell("PhraseFormFn"), reader_make_constant_shell("VerbPhrase"), list(reader_make_constant_shell("PhraseCycLFn"), makeKeyword("VERB-DENOT"), list(reader_make_constant_shell("BestHeadVerbForInitialSubjectFn"), $VERB)))))));

    static private final SubLString $str_alt21$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt22$__ = makeString(") ");

    static private final SubLString $str_alt23$_is_not_a_ = makeString(" is not a ");

    static private final SubLSymbol $sym24$PPH_PHRASE_NAUT_ = makeSymbol("PPH-PHRASE-NAUT?");

    static private final SubLList $list_alt25 = list(list(reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("CalendarYear"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("CalendarMonth"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("CalendarDay"), reader_make_constant_shell("On-TheWord")), list(reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("City"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("GeographicalRegion"), reader_make_constant_shell("In-TheWord")), list(reader_make_constant_shell("to-UnderspecifiedLocation"), reader_make_constant_shell("Thing"), reader_make_constant_shell("To-TheWord")));

    static private final SubLList $list_alt26 = list(list($BIND, makeSymbol("ARG0")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("ARG2")));

    static private final SubLList $list_alt28 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("WU"));









    public static final SubLObject $const34$BestNLWordFormOfLexemeFn_Constrai = reader_make_constant_shell("BestNLWordFormOfLexemeFn-Constrained");



    static private final SubLString $str_alt38$Couldn_t_adjoin__S_to____S = makeString("Couldn't adjoin ~S to~% ~S");

    static private final SubLList $list_alt39 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol PPH_CYCL_TEMPLATE_P = makeSymbol("PPH-CYCL-TEMPLATE-P");



    static private final SubLString $$$PPH_verbSemTrans = makeString("PPH verbSemTrans");

    private static final SubLSymbol VST_CANONICAL_TEST_CASE = makeSymbol("VST-CANONICAL-TEST-CASE");

    static private final SubLList $list_alt48 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-ADJUNCTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-DEPENDENT-TEMPLATES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VST_CANONICAL_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VST-CANONICAL-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VST_CANONICAL_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VST-CANONICAL-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt63$pph_methods_verb_sem_trans = makeString("pph-methods-verb-sem-trans");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt65 = list(makeString("PPH verbSemTrans"));

    private static final SubLSymbol TEST_ADJUNCTION = makeSymbol("TEST-ADJUNCTION");

    private static final SubLSymbol TEST_DEPENDENT_TEMPLATES = makeSymbol("TEST-DEPENDENT-TEMPLATES");

    static private final SubLString $$$PPH_verbSemTrans_Test_Suite = makeString("PPH verbSemTrans Test Suite");
}

/**
 * Total time: 248 ms
 */
