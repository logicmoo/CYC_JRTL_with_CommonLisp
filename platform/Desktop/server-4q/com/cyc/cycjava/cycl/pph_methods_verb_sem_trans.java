package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_methods_verb_sem_trans extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_verb_sem_trans";
    public static final String myFingerPrint = "ffb90561e5a9d5c48c19fd07c47c29b040467195cce681c852ec9783a3c5656d";
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 10042L)
    private static SubLSymbol $pph_phrase_templates_for_frames$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 13106L)
    private static SubLSymbol $pph_vst_preposition_info$;
    private static final SubLSymbol $sym0$GENERATE_WITH_VERB_SEM_TRANS_CANONICAL;
    private static final SubLSymbol $kw1$VERB_SEMTRANS_MATCHER;
    private static final SubLSymbol $kw2$BEST;
    private static final SubLSymbol $kw3$EXISTENTIAL;
    private static final SubLString $str4$__Entering_PPH_SETTING_VAR_TYPES_;
    private static final SubLList $list5;
    private static final SubLString $str6$__Leaving_PPH_SETTING_VAR_TYPES_I;
    private static final SubLString $str7$___Output_list___S__;
    private static final SubLString $str8$___Setting__S_to____S;
    private static final SubLString $str9$___Leaving__PPH_VAR_TYPES___S;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$IGNORE;
    private static final SubLObject $const13$isa;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$ARG2;
    private static final SubLSymbol $kw16$ARG0;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$PRED;
    private static final SubLObject $const20$DitransitiveNP_NPFrame;
    private static final SubLObject $const21$NLSentence;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLObject $const26$TransitiveNPFrame;
    private static final SubLObject $const27$VerbPhrase;
    private static final SubLSymbol $kw28$VERB_DENOT;
    private static final SubLObject $const29$IntransitiveVerbFrame;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$ARG0;
    private static final SubLList $list33;
    private static final SubLObject $const34$PrepositionalPhrase;
    private static final SubLObject $const35$prepositionStrings;
    private static final SubLString $str36$_PPH_error_level_;
    private static final SubLString $str37$__;
    private static final SubLString $str38$Couldn_t_adjoin__S_to____S;
    private static final SubLList $list39;
    private static final SubLSymbol $kw40$VERB;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 1001L)
    public static SubLObject generate_with_verb_sem_trans_canonical(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
        SubLObject doneP = (SubLObject)pph_methods_verb_sem_trans.NIL;
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_methods_formulas.pph_strip_explicit_cycl_quants(cycl, (SubLObject)pph_methods_verb_sem_trans.$kw3$EXISTENTIAL);
        final SubLObject core_template = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_verb_sem_trans.NIL == doneP) {
            SubLObject csome_list_var = pph_types.pph_matching_verb_semtrans_assertions(cycl, pph_vars.$pph_language_mt$.getDynamicValue(thread));
            SubLObject vst_canonical_as = (SubLObject)pph_methods_verb_sem_trans.NIL;
            vst_canonical_as = csome_list_var.first();
            while (pph_methods_verb_sem_trans.NIL == doneP && pph_methods_verb_sem_trans.NIL != csome_list_var) {
                final SubLObject var_types_shadow = dictionary_utilities.copy_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_macros.$pph_var_types_counter$.currentBinding(thread);
                try {
                    pph_vars.$pph_noted_var_types$.bind((pph_methods_verb_sem_trans.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_verb_sem_trans.EQL), (SubLObject)pph_methods_verb_sem_trans.SIXTEEN_INTEGER), thread);
                    pph_macros.$pph_var_types_counter$.bind(number_utilities.f_1X(pph_macros.$pph_var_types_counter$.getDynamicValue(thread)), thread);
                    if (pph_methods_verb_sem_trans.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_verb_sem_trans.T, (SubLObject)pph_methods_verb_sem_trans.$str4$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                    }
                    try {
                        final SubLObject _prev_bind_0_$1 = pph_vars.$pph_var_types$.currentBinding(thread);
                        try {
                            pph_vars.$pph_var_types$.bind(var_types_shadow, thread);
                            SubLObject cdolist_list_var = var_pairs;
                            SubLObject cons = (SubLObject)pph_methods_verb_sem_trans.NIL;
                            cons = cdolist_list_var.first();
                            while (pph_methods_verb_sem_trans.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject var = (SubLObject)pph_methods_verb_sem_trans.NIL;
                                SubLObject var_arg_position = (SubLObject)pph_methods_verb_sem_trans.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list5);
                                var = current.first();
                                current = (var_arg_position = current.rest());
                                pph_variable_handling.pph_register_var_quantifier(var, (SubLObject)pph_methods_verb_sem_trans.$kw3$EXISTENTIAL);
                                cdolist_list_var = cdolist_list_var.rest();
                                cons = cdolist_list_var.first();
                            }
                            final SubLObject attemptedP = pph_try_vst_canonical(phrase, core_template, var_pairs, vst_canonical_as);
                            if (pph_methods_verb_sem_trans.NIL != attemptedP) {
                                if (pph_methods_verb_sem_trans.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                    doneP = (SubLObject)pph_methods_verb_sem_trans.T;
                                }
                            }
                        }
                        finally {
                            pph_vars.$pph_var_types$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_verb_sem_trans.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (pph_methods_verb_sem_trans.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_verb_sem_trans.T, (SubLObject)pph_methods_verb_sem_trans.$str6$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                            }
                            if (pph_methods_verb_sem_trans.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                if (pph_methods_verb_sem_trans.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_verb_sem_trans.T, (SubLObject)pph_methods_verb_sem_trans.$str7$___Output_list___S__, pph_phrase.pph_phrase_output_list(phrase), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                                }
                                if (pph_methods_verb_sem_trans.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_verb_sem_trans.T, (SubLObject)pph_methods_verb_sem_trans.$str8$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue(thread), dictionary.dictionary_values(var_types_shadow), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                                }
                                pph_macros.pph_reset_var_types(var_types_shadow);
                            }
                            else if (pph_methods_verb_sem_trans.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_verb_sem_trans.T, (SubLObject)pph_methods_verb_sem_trans.$str9$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$pph_var_types_counter$.rebind(_prev_bind_2, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0, thread);
                }
                csome_list_var = csome_list_var.rest();
                vst_canonical_as = csome_list_var.first();
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 1887L)
    public static SubLObject pph_try_vst_canonical(final SubLObject phrase, final SubLObject core_template, final SubLObject var_pairs, final SubLObject vst_canonical_as) {
        final SubLObject rephrase_template = pph_rephrase_template_from_vst_canonical(phrase, core_template, var_pairs, vst_canonical_as);
        SubLObject attemptedP = (SubLObject)pph_methods_verb_sem_trans.NIL;
        if (pph_methods_verb_sem_trans.NIL == pph_utilities.pph_identity_template_p(rephrase_template)) {
            final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            final SubLObject past_preds = pph_utilities.pph_filter_preds(agr_preds, (SubLObject)pph_methods_verb_sem_trans.$list10, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            final SubLObject phrase_template = pph_templates.pph_phrasify_phrase_naut(rephrase_template, arg_position_map);
            pph_phrase.pph_phrase_set_agr_preds(phrase_template, (pph_methods_verb_sem_trans.NIL != past_preds) ? past_preds : agr_preds, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            pph_templates.pph_template_phrase_set_cycl(phrase_template, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED), arg_position_map, (SubLObject)pph_methods_verb_sem_trans.NIL);
            pph_main.pph_phrase_generate(phrase_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            if (pph_methods_verb_sem_trans.NIL != pph_phrase.pph_phrase_doneP(phrase_template)) {
                pph_phrase.pph_phrase_copy(phrase_template, phrase, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                pph_phrase.pph_phrase_add_justification(phrase, vst_canonical_as);
            }
            attemptedP = (SubLObject)pph_methods_verb_sem_trans.T;
        }
        return attemptedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 2979L)
    public static SubLObject pph_rephrase_template_from_vst_canonical(final SubLObject phrase, final SubLObject core_template, final SubLObject var_pairs, final SubLObject vst_canonical_as) {
        final SubLObject core_formula = pph_utilities.pph_apply_template(core_template, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED));
        final SubLObject core_map = pph_utilities.pph_figure_new_arg_position_map(pph_phrase.pph_phrase_arg_position_map(phrase), core_template);
        final SubLObject core_vst_template = pph_rephrase_template_from_vst_canonical_int(core_formula, var_pairs, vst_canonical_as, core_map);
        final SubLObject contextualized = (pph_methods_verb_sem_trans.NIL != pph_utilities.pph_identity_template_p(core_vst_template)) ? pph_utilities.pph_identity_template() : pph_utilities.pph_apply_template(core_vst_template, core_template);
        return contextualized;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 3956L)
    public static SubLObject pph_rephrase_template_from_vst_canonical_int(final SubLObject core_formula, final SubLObject var_pairs, final SubLObject vst_canonical_as, final SubLObject core_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(vst_canonical_as);
        SubLObject wu = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject sense = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject frame = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject head_type = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject roles = (SubLObject)pph_methods_verb_sem_trans.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list11);
        wu = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list11);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list11);
        frame = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list11);
        head_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list11);
        roles = current.first();
        current = current.rest();
        if (pph_methods_verb_sem_trans.NIL == current) {
            if (pph_methods_verb_sem_trans.NIL != el_utilities.el_conjunction_p(core_formula)) {
                thread.resetMultipleValues();
                final SubLObject head_var = pph_vst_head_extraction_templates(core_formula, var_pairs, head_type, core_map);
                final SubLObject head_var_template = thread.secondMultipleValue();
                final SubLObject head_type_template = thread.thirdMultipleValue();
                final SubLObject head_remainder_template = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (pph_methods_verb_sem_trans.NIL != head_var) {
                    SubLObject dependent_templates = (SubLObject)pph_methods_verb_sem_trans.NIL;
                    SubLObject remainder_template = head_remainder_template;
                    SubLObject abortP = (SubLObject)pph_methods_verb_sem_trans.NIL;
                    if (pph_methods_verb_sem_trans.NIL == abortP) {
                        SubLObject csome_list_var = el_utilities.el_list_items(roles);
                        SubLObject role = (SubLObject)pph_methods_verb_sem_trans.NIL;
                        role = csome_list_var.first();
                        while (pph_methods_verb_sem_trans.NIL == abortP && pph_methods_verb_sem_trans.NIL != csome_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject dependent_template = pph_vst_dependent_templates(role, head_var, core_formula, remainder_template);
                            final SubLObject new_remainder_template = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (pph_methods_verb_sem_trans.NIL != dependent_template) {
                                dependent_templates = (SubLObject)ConsesLow.cons(dependent_template, dependent_templates);
                                remainder_template = new_remainder_template;
                            }
                            else {
                                abortP = (SubLObject)pph_methods_verb_sem_trans.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            role = csome_list_var.first();
                        }
                    }
                    if (pph_methods_verb_sem_trans.NIL != abortP) {
                        return pph_utilities.pph_identity_template();
                    }
                    dependent_templates = Sequences.nreverse(dependent_templates);
                    template = pph_vst_rephrase_template(frame, wu, head_var_template, dependent_templates, remainder_template, core_map, core_formula);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_verb_sem_trans.$list11);
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 5586L)
    public static SubLObject pph_vst_head_extraction_templates(final SubLObject core_formula, final SubLObject var_pairs, final SubLObject head_type, final SubLObject core_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject head_var_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject head_remainder_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject head_var = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject actual_head_type = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject head_type_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject head_conjunct_num = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject conjunct_num = (SubLObject)pph_methods_verb_sem_trans.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(core_formula, (SubLObject)pph_methods_verb_sem_trans.$kw12$IGNORE);
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
        for (rest = (SubLObject)pph_methods_verb_sem_trans.NIL, rest = args; pph_methods_verb_sem_trans.NIL == head_conjunct_num && pph_methods_verb_sem_trans.NIL != rest; rest = rest.rest()) {
            conjunct = rest.first();
            conjunct_num = Numbers.add(conjunct_num, (SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER);
            for (rest_$3 = (SubLObject)pph_methods_verb_sem_trans.NIL, rest_$3 = var_pairs; pph_methods_verb_sem_trans.NIL == head_conjunct_num && pph_methods_verb_sem_trans.NIL != rest_$3; rest_$3 = rest_$3.rest()) {
                cons = rest_$3.first();
                datum = (current = cons);
                var = (SubLObject)pph_methods_verb_sem_trans.NIL;
                var_arg_position = (SubLObject)pph_methods_verb_sem_trans.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list5);
                var = current.first();
                current = (var_arg_position = current.rest());
                thread.resetMultipleValues();
                success = formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)ConsesLow.listS(pph_methods_verb_sem_trans.$const13$isa, var, (SubLObject)pph_methods_verb_sem_trans.$list14));
                v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_methods_verb_sem_trans.NIL != success) {
                    arg2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_methods_verb_sem_trans.$sym15$ARG2, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                    if (pph_methods_verb_sem_trans.NIL != pph_vst_okay_for_head_typeP(arg2, head_type)) {
                        head_conjunct_num = conjunct_num;
                        actual_head_type = arg2;
                        head_var = var;
                    }
                }
            }
        }
        if (pph_methods_verb_sem_trans.NIL != head_conjunct_num) {
            head_var_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)ConsesLow.list(head_conjunct_num, (SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER));
            head_type_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)ConsesLow.list(head_conjunct_num, (SubLObject)pph_methods_verb_sem_trans.TWO_INTEGER));
            SubLObject other_conjunct_templates = (SubLObject)pph_methods_verb_sem_trans.NIL;
            SubLObject end_var;
            SubLObject conjunct_num2;
            SubLObject conjunct_template;
            for (end_var = el_utilities.formula_length(core_formula, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED), conjunct_num2 = (SubLObject)pph_methods_verb_sem_trans.NIL, conjunct_num2 = (SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER; !conjunct_num2.numGE(end_var); conjunct_num2 = number_utilities.f_1X(conjunct_num2)) {
                if (!conjunct_num2.eql(head_conjunct_num)) {
                    conjunct_template = at_utilities.get_generic_arg(conjunct_num2);
                    other_conjunct_templates = (SubLObject)ConsesLow.cons(conjunct_template, other_conjunct_templates);
                }
            }
            head_remainder_template = el_utilities.make_el_formula((SubLObject)pph_methods_verb_sem_trans.$kw16$ARG0, Sequences.nreverse(other_conjunct_templates), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            final SubLObject head_type_arg_position = pph_utilities.pph_arg_position_lookup(pph_utilities.pph_arg_position_from_template(head_type_template), core_map);
            pph_variable_handling.pph_register_var(head_var, actual_head_type, head_type_arg_position);
        }
        return Values.values(head_var, head_var_template, head_type_template, head_remainder_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 7828L)
    public static SubLObject pph_vst_okay_for_head_typeP(final SubLObject arg2, final SubLObject head_type) {
        return (pph_methods_verb_sem_trans.NIL != pph_utilities.pph_top_level_preciseP()) ? Equality.equal(arg2, head_type) : pph_utilities.pph_genlP(head_type, arg2, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 8038L)
    public static SubLObject pph_vst_dependent_templates(final SubLObject role, final SubLObject head_var, final SubLObject core_formula, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dependent_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject remainder_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject dependent_conjunct_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        final SubLObject args = cycl_utilities.formula_args(template, (SubLObject)pph_methods_verb_sem_trans.$kw12$IGNORE);
        SubLObject rest;
        SubLObject conjunct_template;
        SubLObject conjunct;
        SubLObject success;
        SubLObject v_bindings;
        SubLObject pred;
        for (rest = (SubLObject)pph_methods_verb_sem_trans.NIL, rest = args; pph_methods_verb_sem_trans.NIL == dependent_conjunct_template && pph_methods_verb_sem_trans.NIL != rest; rest = rest.rest()) {
            conjunct_template = rest.first();
            conjunct = pph_utilities.pph_apply_template(conjunct_template, core_formula);
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)ConsesLow.listS((SubLObject)pph_methods_verb_sem_trans.$list17, head_var, (SubLObject)pph_methods_verb_sem_trans.$list18));
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_methods_verb_sem_trans.NIL != success) {
                pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_methods_verb_sem_trans.$sym19$PRED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                if (pph_methods_verb_sem_trans.NIL != pph_vst_okay_for_roleP(pred, role)) {
                    dependent_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_verb_sem_trans.TWO_INTEGER, conjunct_template);
                    dependent_conjunct_template = conjunct_template;
                }
            }
        }
        if (pph_methods_verb_sem_trans.NIL != dependent_conjunct_template) {
            final SubLObject remaining_conjunct_templates = Sequences.remove(dependent_conjunct_template, cycl_utilities.formula_args(template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            remainder_template = (SubLObject)((pph_methods_verb_sem_trans.NIL != remaining_conjunct_templates) ? el_utilities.make_el_formula((SubLObject)pph_methods_verb_sem_trans.$kw16$ARG0, remaining_conjunct_templates, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED) : pph_methods_verb_sem_trans.NIL);
        }
        return Values.values(dependent_template, remainder_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 9146L)
    public static SubLObject pph_vst_okay_for_roleP(final SubLObject arg2, final SubLObject role) {
        return (pph_methods_verb_sem_trans.NIL != pph_utilities.pph_top_level_preciseP()) ? Equality.equal(arg2, role) : pph_utilities.pph_genl_predicateP(role, arg2, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 9344L)
    public static SubLObject pph_vst_rephrase_template(final SubLObject frame, final SubLObject wu, final SubLObject head_var_template, final SubLObject dependent_templates, final SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        final SubLObject recipe_template = pph_phrase_template_for_frame(frame, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
        final SubLObject dependent_keywords = lexicon_utilities.argument_keywords_for_frame(frame);
        final SubLObject v_bindings = list_utilities.make_alist_from_keys_and_values(dependent_keywords, dependent_templates);
        SubLObject template = pph_utilities.pph_identity_template();
        if (pph_methods_verb_sem_trans.NIL != pph_types.pph_phrase_nautP(recipe_template) && pph_methods_verb_sem_trans.NIL != v_bindings) {
            template = pph_recipe_from_verb_sem_trans_template(recipe_template, wu, head_var_template, v_bindings, remainder_template, core_map, core_formula);
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 11151L)
    public static SubLObject pph_phrase_template_for_frame(final SubLObject frame, SubLObject mt) {
        if (mt == pph_methods_verb_sem_trans.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return list_utilities.alist_lookup(pph_methods_verb_sem_trans.$pph_phrase_templates_for_frames$.getGlobalValue(), frame, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 11374L)
    public static SubLObject pph_recipe_from_verb_sem_trans_template(SubLObject recipe_template, final SubLObject verb_wu, final SubLObject verb_denot, final SubLObject v_bindings, SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_verb_sem_trans.NIL != remainder_template) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 12150L)
    public static SubLObject pph_vst_add_adjuncts(SubLObject recipe_template, SubLObject remainder_template, final SubLObject verb_denot_template, final SubLObject core_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_var = pph_utilities.pph_apply_template(verb_denot_template, core_formula);
        SubLObject remaining_conjunct_templates = (SubLObject)pph_methods_verb_sem_trans.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(remainder_template, (SubLObject)pph_methods_verb_sem_trans.$kw12$IGNORE);
        SubLObject conjunct_template = (SubLObject)pph_methods_verb_sem_trans.NIL;
        conjunct_template = cdolist_list_var.first();
        while (pph_methods_verb_sem_trans.NIL != cdolist_list_var) {
            final SubLObject conjunct = pph_utilities.pph_apply_template(conjunct_template, core_formula);
            final SubLObject head_var_position = el_utilities.formula_position(head_var, conjunct, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            SubLObject handledP = (SubLObject)pph_methods_verb_sem_trans.NIL;
            if (pph_methods_verb_sem_trans.NIL != head_var_position) {
                thread.resetMultipleValues();
                final SubLObject recipe_template_$6 = pph_try_to_add_adjunct_for_conjunct(conjunct, head_var_position, conjunct_template, recipe_template);
                final SubLObject handledP_$7 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                recipe_template = recipe_template_$6;
                handledP = handledP_$7;
            }
            if (pph_methods_verb_sem_trans.NIL == handledP) {
                remaining_conjunct_templates = (SubLObject)ConsesLow.cons(conjunct_template, remaining_conjunct_templates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_template = cdolist_list_var.first();
        }
        remainder_template = (SubLObject)((pph_methods_verb_sem_trans.NIL != remaining_conjunct_templates) ? el_utilities.make_el_formula((SubLObject)pph_methods_verb_sem_trans.$kw16$ARG0, Sequences.nreverse(remaining_conjunct_templates), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED) : pph_methods_verb_sem_trans.NIL);
        return Values.values(recipe_template, remainder_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 13465L)
    public static SubLObject pph_try_to_add_adjunct_for_conjunct(final SubLObject conjunct, final SubLObject head_var_position, final SubLObject conjunct_template, SubLObject recipe_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject handledP = (SubLObject)pph_methods_verb_sem_trans.NIL;
        if (pph_methods_verb_sem_trans.ONE_INTEGER.eql(head_var_position)) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)pph_methods_verb_sem_trans.$list31);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_methods_verb_sem_trans.NIL != success) {
                final SubLObject arg2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_methods_verb_sem_trans.$sym15$ARG2, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                final SubLObject arg3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_methods_verb_sem_trans.$sym32$ARG0, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
                if (pph_methods_verb_sem_trans.NIL == handledP) {
                    SubLObject csome_list_var = pph_methods_verb_sem_trans.$pph_vst_preposition_info$.getGlobalValue();
                    SubLObject tuple = (SubLObject)pph_methods_verb_sem_trans.NIL;
                    tuple = csome_list_var.first();
                    while (pph_methods_verb_sem_trans.NIL == handledP && pph_methods_verb_sem_trans.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = tuple;
                        SubLObject pred = (SubLObject)pph_methods_verb_sem_trans.NIL;
                        SubLObject col = (SubLObject)pph_methods_verb_sem_trans.NIL;
                        SubLObject wu = (SubLObject)pph_methods_verb_sem_trans.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list33);
                        pred = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list33);
                        col = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list33);
                        wu = current.first();
                        current = current.rest();
                        if (pph_methods_verb_sem_trans.NIL == current) {
                            if (pph_methods_verb_sem_trans.NIL != pph_utilities.pph_genl_predicateP(arg3, pred, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED) && pph_methods_verb_sem_trans.NIL != pph_utilities.pph_isaP(arg2, col, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED)) {
                                final SubLObject pred_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_verb_sem_trans.ZERO_INTEGER, conjunct_template);
                                final SubLObject object_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_verb_sem_trans.TWO_INTEGER, conjunct_template);
                                final SubLObject pp_naut = pph_vst_make_pp_naut(wu, pred_template, object_template);
                                recipe_template = pph_vst_adjoin(pp_naut, recipe_template);
                                handledP = (SubLObject)pph_methods_verb_sem_trans.T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_verb_sem_trans.$list33);
                        }
                        csome_list_var = csome_list_var.rest();
                        tuple = csome_list_var.first();
                    }
                }
            }
        }
        return Values.values(recipe_template, handledP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 14574L)
    public static SubLObject pph_vst_make_pp_naut(final SubLObject wu, final SubLObject pred_template, final SubLObject object_template) {
        return (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const34$PrepositionalPhrase, (SubLObject)ConsesLow.list(pph_functions.concatenatephrasesfn(), (SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), (SubLObject)ConsesLow.list(pph_functions.phrasecyclfn(), pred_template, (SubLObject)ConsesLow.list(pph_functions.bestnlwordformoflexemefn_constrained(), pph_methods_verb_sem_trans.$const35$prepositionStrings, wu))), (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn(), object_template)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 14917L)
    public static SubLObject pph_vst_adjoin(final SubLObject pp_naut, final SubLObject recipe_template) {
        final SubLObject fn = cycl_utilities.nat_functor(recipe_template);
        if (pph_methods_verb_sem_trans.NIL != kb_utilities.kbeq(fn, pph_functions.phraseformfn())) {
            if (cycl_utilities.formula_arg1(recipe_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED).eql(pph_methods_verb_sem_trans.$const27$VerbPhrase)) {
                return el_utilities.replace_formula_arg((SubLObject)pph_methods_verb_sem_trans.TWO_INTEGER, el_utilities.make_binary_formula(pph_functions.concatenatephrasesfn(), (SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), cycl_utilities.formula_arg2(recipe_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED)), pp_naut), recipe_template);
            }
            return el_utilities.replace_formula_arg((SubLObject)pph_methods_verb_sem_trans.TWO_INTEGER, pph_vst_adjoin(pp_naut, cycl_utilities.formula_arg2(recipe_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED)), recipe_template);
        }
        else {
            if (pph_methods_verb_sem_trans.NIL != kb_utilities.kbeq(fn, pph_functions.concatenatephrasesfn())) {
                SubLObject new_phrase_nauts = (SubLObject)pph_methods_verb_sem_trans.NIL;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(recipe_template, (SubLObject)pph_methods_verb_sem_trans.$kw12$IGNORE);
                SubLObject phrase_naut = (SubLObject)pph_methods_verb_sem_trans.NIL;
                phrase_naut = cdolist_list_var.first();
                while (pph_methods_verb_sem_trans.NIL != cdolist_list_var) {
                    if (pph_methods_verb_sem_trans.NIL != el_utilities.el_formula_with_operator_p(phrase_naut, pph_functions.headwordofphrasefn())) {
                        new_phrase_nauts = (SubLObject)ConsesLow.cons(el_utilities.replace_formula_arg((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER, pph_vst_adjoin(pp_naut, cycl_utilities.formula_arg1(phrase_naut, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED)), phrase_naut), new_phrase_nauts);
                    }
                    else {
                        new_phrase_nauts = (SubLObject)ConsesLow.cons(phrase_naut, new_phrase_nauts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    phrase_naut = cdolist_list_var.first();
                }
                return el_utilities.make_el_formula(pph_functions.concatenatephrasesfn(), Sequences.nreverse(new_phrase_nauts), (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            }
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_verb_sem_trans.$str36$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_verb_sem_trans.ONE_INTEGER), pph_methods_verb_sem_trans.$str37$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_verb_sem_trans.$str38$Couldn_t_adjoin__S_to____S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pp_naut, recipe_template));
            return (SubLObject)pph_methods_verb_sem_trans.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 15957L)
    public static SubLObject pph_vst_template_for_remainder(final SubLObject remaining_conjunction_template) {
        return (SubLObject)((pph_methods_verb_sem_trans.NIL != remaining_conjunction_template) ? el_utilities.make_unary_formula(pph_functions.termparaphrasefn(), remaining_conjunction_template) : pph_methods_verb_sem_trans.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 16162L)
    public static SubLObject pph_vst_remainder_template_remove_var_typing_clauses(SubLObject remainder_template, final SubLObject core_map, final SubLObject core_formula) {
        if (pph_methods_verb_sem_trans.NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
            final SubLObject remainder_map = pph_utilities.pph_figure_new_arg_position_map(core_map, remainder_template);
            remainder_template = pph_utilities.pph_apply_template(pph_methods_formulas.remove_var_typing_clauses(pph_utilities.pph_apply_template(remainder_template, core_formula), (SubLObject)pph_methods_verb_sem_trans.NIL, remainder_map, (SubLObject)pph_methods_verb_sem_trans.NIL), remainder_template);
        }
        return remainder_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-verb-sem-trans.lisp", position = 16688L)
    public static SubLObject pph_sub_verb_sem_trans_recipe_template(SubLObject recipe_template, final SubLObject binding_list, final SubLObject verb_wu, final SubLObject verb_denot, final SubLObject remainder_template) {
        SubLObject cdolist_list_var = binding_list;
        SubLObject cons = (SubLObject)pph_methods_verb_sem_trans.NIL;
        cons = cdolist_list_var.first();
        while (pph_methods_verb_sem_trans.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)pph_methods_verb_sem_trans.NIL;
            SubLObject value = (SubLObject)pph_methods_verb_sem_trans.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_verb_sem_trans.$list39);
            key = current.first();
            current = (value = current.rest());
            recipe_template = cycl_utilities.expression_subst(value, key, recipe_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        recipe_template = cycl_utilities.expression_subst(verb_wu, (SubLObject)pph_methods_verb_sem_trans.$kw40$VERB, recipe_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
        recipe_template = cycl_utilities.expression_subst(verb_denot, (SubLObject)pph_methods_verb_sem_trans.$kw28$VERB_DENOT, recipe_template, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED, (SubLObject)pph_methods_verb_sem_trans.UNPROVIDED);
        if (pph_methods_verb_sem_trans.NIL != pph_utilities.pph_cycl_template_p(remainder_template)) {
            recipe_template = (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const21$NLSentence, (SubLObject)ConsesLow.list(pph_functions.nlconjunctionfn(), recipe_template, remainder_template));
        }
        return recipe_template;
    }
    
    public static SubLObject declare_pph_methods_verb_sem_trans_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "generate_with_verb_sem_trans_canonical", "GENERATE-WITH-VERB-SEM-TRANS-CANONICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_try_vst_canonical", "PPH-TRY-VST-CANONICAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_rephrase_template_from_vst_canonical", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_rephrase_template_from_vst_canonical_int", "PPH-REPHRASE-TEMPLATE-FROM-VST-CANONICAL-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_head_extraction_templates", "PPH-VST-HEAD-EXTRACTION-TEMPLATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_okay_for_head_typeP", "PPH-VST-OKAY-FOR-HEAD-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_dependent_templates", "PPH-VST-DEPENDENT-TEMPLATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_okay_for_roleP", "PPH-VST-OKAY-FOR-ROLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_rephrase_template", "PPH-VST-REPHRASE-TEMPLATE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_phrase_template_for_frame", "PPH-PHRASE-TEMPLATE-FOR-FRAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_recipe_from_verb_sem_trans_template", "PPH-RECIPE-FROM-VERB-SEM-TRANS-TEMPLATE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_add_adjuncts", "PPH-VST-ADD-ADJUNCTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_try_to_add_adjunct_for_conjunct", "PPH-TRY-TO-ADD-ADJUNCT-FOR-CONJUNCT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_make_pp_naut", "PPH-VST-MAKE-PP-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_adjoin", "PPH-VST-ADJOIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_template_for_remainder", "PPH-VST-TEMPLATE-FOR-REMAINDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_vst_remainder_template_remove_var_typing_clauses", "PPH-VST-REMAINDER-TEMPLATE-REMOVE-VAR-TYPING-CLAUSES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_verb_sem_trans", "pph_sub_verb_sem_trans_recipe_template", "PPH-SUB-VERB-SEM-TRANS-RECIPE-TEMPLATE", 5, 0, false);
        return (SubLObject)pph_methods_verb_sem_trans.NIL;
    }
    
    public static SubLObject init_pph_methods_verb_sem_trans_file() {
        pph_methods_verb_sem_trans.$pph_phrase_templates_for_frames$ = SubLFiles.deflexical("*PPH-PHRASE-TEMPLATES-FOR-FRAMES*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pph_methods_verb_sem_trans.$const20$DitransitiveNP_NPFrame, pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const21$NLSentence, (SubLObject)ConsesLow.list(pph_functions.concatenatephrasesfn(), reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_verb_sem_trans.$list22), reader.bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), (SubLObject)pph_methods_verb_sem_trans.$list23), reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_verb_sem_trans.$list24), reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_verb_sem_trans.$list25))), (SubLObject)ConsesLow.list(pph_methods_verb_sem_trans.$const26$TransitiveNPFrame, pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const21$NLSentence, (SubLObject)ConsesLow.list(pph_functions.concatenatephrasesfn(), reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_verb_sem_trans.$list22), (SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const27$VerbPhrase, (SubLObject)ConsesLow.list(pph_functions.concatenatephrasesfn(), (SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), (SubLObject)ConsesLow.list(pph_functions.phrasecyclfn(), (SubLObject)pph_methods_verb_sem_trans.$kw28$VERB_DENOT, reader.bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), (SubLObject)pph_methods_verb_sem_trans.$list23))), reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_verb_sem_trans.$list25)))))), (SubLObject)ConsesLow.list(pph_methods_verb_sem_trans.$const29$IntransitiveVerbFrame, pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const21$NLSentence, (SubLObject)ConsesLow.list(pph_functions.concatenatephrasesfn(), reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_verb_sem_trans.$list22), (SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), pph_methods_verb_sem_trans.$const27$VerbPhrase, (SubLObject)ConsesLow.list(pph_functions.phrasecyclfn(), (SubLObject)pph_methods_verb_sem_trans.$kw28$VERB_DENOT, reader.bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), (SubLObject)pph_methods_verb_sem_trans.$list23))))))));
        pph_methods_verb_sem_trans.$pph_vst_preposition_info$ = SubLFiles.deflexical("*PPH-VST-PREPOSITION-INFO*", (SubLObject)pph_methods_verb_sem_trans.$list30);
        return (SubLObject)pph_methods_verb_sem_trans.NIL;
    }
    
    public static SubLObject setup_pph_methods_verb_sem_trans_file() {
        pph_types.pph_register_method((SubLObject)pph_methods_verb_sem_trans.$sym0$GENERATE_WITH_VERB_SEM_TRANS_CANONICAL, (SubLObject)pph_methods_verb_sem_trans.$kw1$VERB_SEMTRANS_MATCHER, (SubLObject)pph_methods_verb_sem_trans.$kw2$BEST);
        return (SubLObject)pph_methods_verb_sem_trans.NIL;
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
        me = (SubLFile)new pph_methods_verb_sem_trans();
        pph_methods_verb_sem_trans.$pph_phrase_templates_for_frames$ = null;
        pph_methods_verb_sem_trans.$pph_vst_preposition_info$ = null;
        $sym0$GENERATE_WITH_VERB_SEM_TRANS_CANONICAL = SubLObjectFactory.makeSymbol("GENERATE-WITH-VERB-SEM-TRANS-CANONICAL");
        $kw1$VERB_SEMTRANS_MATCHER = SubLObjectFactory.makeKeyword("VERB-SEMTRANS-MATCHER");
        $kw2$BEST = SubLObjectFactory.makeKeyword("BEST");
        $kw3$EXISTENTIAL = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $str4$__Entering_PPH_SETTING_VAR_TYPES_ = SubLObjectFactory.makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");
        $list5 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-ARG-POSITION"));
        $str6$__Leaving_PPH_SETTING_VAR_TYPES_I = SubLObjectFactory.makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");
        $str7$___Output_list___S__ = SubLObjectFactory.makeString("~& Output list: ~S~%");
        $str8$___Setting__S_to____S = SubLObjectFactory.makeString("~& Setting ~S to~% ~S");
        $str9$___Leaving__PPH_VAR_TYPES___S = SubLObjectFactory.makeString("~% Leaving *PPH-VAR-TYPES* ~S");
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastTense-Generic")));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ROLES"));
        $kw12$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const13$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")));
        $sym15$ARG2 = SubLObjectFactory.makeSymbol("ARG2");
        $kw16$ARG0 = SubLObjectFactory.makeKeyword("ARG0");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym19$PRED = SubLObjectFactory.makeSymbol("PRED");
        $const20$DitransitiveNP_NPFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitiveNP-NPFrame"));
        $const21$NLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERB"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $const26$TransitiveNPFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame"));
        $const27$VerbPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VerbPhrase"));
        $kw28$VERB_DENOT = SubLObjectFactory.makeKeyword("VERB-DENOT");
        $const29$IntransitiveVerbFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntransitiveVerbFrame"));
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarYear")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMonth")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarDay")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("On-TheWord"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("to-UnderspecifiedLocation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("To-TheWord"))));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG0")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")));
        $sym32$ARG0 = SubLObjectFactory.makeSymbol("ARG0");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("WU"));
        $const34$PrepositionalPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase"));
        $const35$prepositionStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"));
        $str36$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str37$__ = SubLObjectFactory.makeString(") ");
        $str38$Couldn_t_adjoin__S_to____S = SubLObjectFactory.makeString("Couldn't adjoin ~S to~% ~S");
        $list39 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw40$VERB = SubLObjectFactory.makeKeyword("VERB");
    }
}

/*

	Total time: 248 ms
	
*/