package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_methods_verb_sem_trans;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.pph_methods_verb_sem_trans.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_methods_verb_sem_trans extends SubLTranslatedFile {
    public static final SubLFile me = new pph_methods_verb_sem_trans();

    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_verb_sem_trans";

    public static final String myFingerPrint = "ffb90561e5a9d5c48c19fd07c47c29b040467195cce681c852ec9783a3c5656d";

    // deflexical
    private static final SubLSymbol $pph_phrase_templates_for_frames$ = makeSymbol("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*");

    // deflexical
    private static final SubLSymbol $pph_vst_preposition_info$ = makeSymbol("*PPH-VST-PREPOSITION-INFO*");

    // Internal Constants
    public static final SubLSymbol GENERATE_WITH_VERB_SEM_TRANS_CANONICAL = makeSymbol("GENERATE-WITH-VERB-SEM-TRANS-CANONICAL");

    private static final SubLSymbol $VERB_SEMTRANS_MATCHER = makeKeyword("VERB-SEMTRANS-MATCHER");





    public static final SubLString $str4$__Entering_PPH_SETTING_VAR_TYPES_ = makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");

    public static final SubLList $list5 = cons(makeSymbol("VAR"), makeSymbol("VAR-ARG-POSITION"));

    public static final SubLString $str6$__Leaving_PPH_SETTING_VAR_TYPES_I = makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");

    public static final SubLString $str7$___Output_list___S__ = makeString("~& Output list: ~S~%");

    public static final SubLString $str8$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    public static final SubLString $str9$___Leaving__PPH_VAR_TYPES___S = makeString("~% Leaving *PPH-VAR-TYPES* ~S");

    public static final SubLList $list10 = list(reader_make_constant_shell(makeString("pastTense-Generic")));

    public static final SubLList $list11 = list(makeSymbol("WU"), makeSymbol("SENSE"), makeSymbol("FRAME"), makeSymbol("HEAD-TYPE"), makeSymbol("ROLES"));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list14 = list(list(makeKeyword("BIND"), makeSymbol("ARG2")));





    public static final SubLList $list17 = list(makeKeyword("BIND"), makeSymbol("PRED"));

    public static final SubLList $list18 = list(makeKeyword("ANYTHING"));



    private static final SubLObject $$DitransitiveNP_NPFrame = reader_make_constant_shell(makeString("DitransitiveNP-NPFrame"));

    private static final SubLObject $$NLSentence = reader_make_constant_shell(makeString("NLSentence"));

    private static final SubLList $list22 = list(makeKeyword("SUBJECT"));

    private static final SubLList $list23 = list(makeKeyword("VERB"));

    private static final SubLList $list24 = list(makeKeyword("OBLIQUE-OBJECT"));

    public static final SubLList $list25 = list(makeKeyword("OBJECT"));

    private static final SubLObject $$TransitiveNPFrame = reader_make_constant_shell(makeString("TransitiveNPFrame"));

    private static final SubLObject $$VerbPhrase = reader_make_constant_shell(makeString("VerbPhrase"));



    private static final SubLObject $$IntransitiveVerbFrame = reader_make_constant_shell(makeString("IntransitiveVerbFrame"));

    private static final SubLList $list30 = list(list(reader_make_constant_shell(makeString("dateOfEvent")), reader_make_constant_shell(makeString("CalendarYear")), reader_make_constant_shell(makeString("In-TheWord"))), list(reader_make_constant_shell(makeString("dateOfEvent")), reader_make_constant_shell(makeString("CalendarMonth")), reader_make_constant_shell(makeString("In-TheWord"))), list(reader_make_constant_shell(makeString("dateOfEvent")), reader_make_constant_shell(makeString("CalendarDay")), reader_make_constant_shell(makeString("On-TheWord"))), list(reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("City")), reader_make_constant_shell(makeString("In-TheWord"))), list(reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("GeographicalRegion")), reader_make_constant_shell(makeString("In-TheWord"))), list(reader_make_constant_shell(makeString("to-UnderspecifiedLocation")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("To-TheWord"))));

    private static final SubLList $list31 = list(list(makeKeyword("BIND"), makeSymbol("ARG0")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG2")));

    private static final SubLSymbol ARG0 = makeSymbol("ARG0");

    private static final SubLList $list33 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("WU"));

    private static final SubLObject $$PrepositionalPhrase = reader_make_constant_shell(makeString("PrepositionalPhrase"));

    private static final SubLObject $$prepositionStrings = reader_make_constant_shell(makeString("prepositionStrings"));

    private static final SubLString $str36$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str37$__ = makeString(") ");

    public static final SubLString $str38$Couldn_t_adjoin__S_to____S = makeString("Couldn't adjoin ~S to~% ~S");

    public static final SubLList $list39 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));



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

    public static SubLObject pph_rephrase_template_from_vst_canonical(final SubLObject phrase, final SubLObject core_template, final SubLObject var_pairs, final SubLObject vst_canonical_as) {
        final SubLObject core_formula = pph_utilities.pph_apply_template(core_template, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        final SubLObject core_map = pph_utilities.pph_figure_new_arg_position_map(pph_phrase.pph_phrase_arg_position_map(phrase), core_template);
        final SubLObject core_vst_template = pph_rephrase_template_from_vst_canonical_int(core_formula, var_pairs, vst_canonical_as, core_map);
        final SubLObject contextualized = (NIL != pph_utilities.pph_identity_template_p(core_vst_template)) ? pph_utilities.pph_identity_template() : pph_utilities.pph_apply_template(core_vst_template, core_template);
        return contextualized;
    }

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

    public static SubLObject pph_vst_okay_for_head_typeP(final SubLObject arg2, final SubLObject head_type) {
        return NIL != pph_utilities.pph_top_level_preciseP() ? equal(arg2, head_type) : pph_utilities.pph_genlP(head_type, arg2, UNPROVIDED);
    }

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

    public static SubLObject pph_vst_okay_for_roleP(final SubLObject arg2, final SubLObject role) {
        return NIL != pph_utilities.pph_top_level_preciseP() ? equal(arg2, role) : pph_utilities.pph_genl_predicateP(role, arg2, UNPROVIDED);
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

    public static SubLObject pph_phrase_template_for_frame(final SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return list_utilities.alist_lookup($pph_phrase_templates_for_frames$.getGlobalValue(), frame, UNPROVIDED, UNPROVIDED);
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
    }

    public static SubLObject pph_vst_make_pp_naut(final SubLObject wu, final SubLObject pred_template, final SubLObject object_template) {
        return list(pph_functions.phraseformfn(), $$PrepositionalPhrase, list(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), list(pph_functions.phrasecyclfn(), pred_template, list(pph_functions.bestnlwordformoflexemefn_constrained(), $$prepositionStrings, wu))), list(pph_functions.termparaphrasefn(), object_template)));
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

    public static SubLObject pph_vst_template_for_remainder(final SubLObject remaining_conjunction_template) {
        return NIL != remaining_conjunction_template ? make_unary_formula(pph_functions.termparaphrasefn(), remaining_conjunction_template) : NIL;
    }

    public static SubLObject pph_vst_remainder_template_remove_var_typing_clauses(SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        if (NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
            final SubLObject remainder_map = pph_utilities.pph_figure_new_arg_position_map(core_map, remainder_template);
            remainder_template = pph_utilities.pph_apply_template(pph_methods_formulas.remove_var_typing_clauses(pph_utilities.pph_apply_template(remainder_template, core_formula), NIL, remainder_map, NIL), remainder_template);
        }
        return remainder_template;
    }

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

    public static SubLObject declare_pph_methods_verb_sem_trans_file() {
        declareFunction(me, "generate_with_verb_sem_trans_canonical", "GENERATE-WITH-VERB-SEM-TRANS-CANONICAL", 1, 0, false);
        declareFunction(me, "pph_try_vst_canonical", "PPH-TRY-VST-CANONICAL", 4, 0, false);
        declareFunction(me, "pph_rephrase_template_from_vst_canonical", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL", 4, 0, false);
        declareFunction(me, "pph_rephrase_template_from_vst_canonical_int", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL-INT", 4, 0, false);
        declareFunction(me, "pph_vst_head_extraction_templates", "PPH-VST-HEAD-EXTRACTION-TEMPLATES", 4, 0, false);
        declareFunction(me, "pph_vst_okay_for_head_typeP", "PPH-VST-OKAY-FOR-HEAD-TYPE?", 2, 0, false);
        declareFunction(me, "pph_vst_dependent_templates", "PPH-VST-DEPENDENT-TEMPLATES", 4, 0, false);
        declareFunction(me, "pph_vst_okay_for_roleP", "PPH-VST-OKAY-FOR-ROLE?", 2, 0, false);
        declareFunction(me, "pph_vst_rephrase_template", "PPH-VST-REPHRASE-TEMPLATE", 7, 0, false);
        declareFunction(me, "pph_phrase_template_for_frame", "PPH-PHRASE-TEMPLATE-FOR-FRAME", 1, 1, false);
        declareFunction(me, "pph_recipe_from_verb_sem_trans_template", "PPH-RECIPE-FROM-VERB-SEM-TRANS-TEMPLATE", 7, 0, false);
        declareFunction(me, "pph_vst_add_adjuncts", "PPH-VST-ADD-ADJUNCTS", 4, 0, false);
        declareFunction(me, "pph_try_to_add_adjunct_for_conjunct", "PPH-TRY-TO-ADD-ADJUNCT-FOR-CONJUNCT", 4, 0, false);
        declareFunction(me, "pph_vst_make_pp_naut", "PPH-VST-MAKE-PP-NAUT", 3, 0, false);
        declareFunction(me, "pph_vst_adjoin", "PPH-VST-ADJOIN", 2, 0, false);
        declareFunction(me, "pph_vst_template_for_remainder", "PPH-VST-TEMPLATE-FOR-REMAINDER", 1, 0, false);
        declareFunction(me, "pph_vst_remainder_template_remove_var_typing_clauses", "PPH-VST-REMAINDER-TEMPLATE-REMOVE-VAR-TYPING-CLAUSES", 3, 0, false);
        declareFunction(me, "pph_sub_verb_sem_trans_recipe_template", "PPH-SUB-VERB-SEM-TRANS-RECIPE-TEMPLATE", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_methods_verb_sem_trans_file() {
        deflexical("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*", list(list($$DitransitiveNP_NPFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23), bq_cons(pph_functions.termparaphrasefn_np(), $list24), bq_cons(pph_functions.termparaphrasefn_np(), $list25))), list($$TransitiveNPFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), $$VerbPhrase, list(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), list(pph_functions.phrasecyclfn(), $VERB_DENOT, bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23))), bq_cons(pph_functions.termparaphrasefn_np(), $list25)))))), list($$IntransitiveVerbFrame, pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.termparaphrasefn_np(), $list22), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), $$VerbPhrase, list(pph_functions.phrasecyclfn(), $VERB_DENOT, bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list23))))))));
        deflexical("*PPH-VST-PREPOSITION-INFO*", $list30);
        return NIL;
    }

    public static SubLObject setup_pph_methods_verb_sem_trans_file() {
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
}

/**
 * Total time: 248 ms
 */
