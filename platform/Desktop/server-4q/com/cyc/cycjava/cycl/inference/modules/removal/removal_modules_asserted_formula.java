package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_asserted_formula extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula";
    public static final String myFingerPrint = "712475d3ab1302f0e762efafcf0fe540fddfc6d112d1756d9e42e13e083a1c9d";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 25653L)
    public static SubLSymbol $term_formulas_defining_mt$;
    private static final SubLObject $const0$assertedSentence;
    private static final SubLSymbol $kw1$ASSERTED_SENTENCE_VARIABLE;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$NEG;
    private static final SubLSymbol $sym4$HL_VAR_;
    private static final SubLSymbol $kw5$GAF_ARG;
    private static final SubLSymbol $kw6$GAF;
    private static final SubLSymbol $kw7$PREDICATE_EXTENT;
    private static final SubLSymbol $kw8$OVERLAP;
    private static final SubLSymbol $kw9$REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$MINIMIZE;
    private static final SubLSymbol $kw14$REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG;
    private static final SubLList $list15;
    private static final SubLObject $const16$exactlyAssertedSentence;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG;
    private static final SubLList $list23;
    private static final SubLObject $const24$assertedPredicateArg;
    private static final SubLSymbol $kw25$REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$OPAQUE;
    private static final SubLSymbol $kw28$REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$TRUE;
    private static final SubLSymbol $kw37$REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED;
    private static final SubLList $list38;
    private static final SubLObject $const39$termFormulas;
    private static final SubLSymbol $kw40$POS;
    private static final SubLSymbol $sym41$_TERM_FORMULAS_DEFINING_MT_;
    private static final SubLObject $const42$BaseKB;
    private static final SubLSymbol $kw43$TRUE_MON;
    private static final SubLSymbol $sym44$CYCL_FORMULA_P;
    private static final SubLSymbol $sym45$HL_TERM_P;
    private static final SubLSymbol $kw46$REMOVAL_TERM_FORMULAS_CHECK_POS;
    private static final SubLList $list47;
    private static final SubLSymbol $kw48$REMOVAL_TERM_FORMULAS_CHECK_NEG;
    private static final SubLList $list49;
    private static final SubLSymbol $kw50$REMOVAL_TERM_FORMULAS_UNIFY;
    private static final SubLList $list51;
    private static final SubLObject $const52$assertedTermSentences;
    private static final SubLSymbol $kw53$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG;
    private static final SubLList $list56;
    private static final SubLSymbol $kw57$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY;
    private static final SubLList $list62;
    private static final SubLSymbol $kw63$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE;
    private static final SubLList $list64;
    private static final SubLObject $const65$assertedTermSetSentences;
    private static final SubLSymbol $kw66$REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE;
    private static final SubLList $list67;
    private static final SubLSymbol $kw68$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG;
    private static final SubLList $list71;
    private static final SubLObject $const72$nearestAssertionSupportingSentenc;
    private static final SubLSymbol $kw73$REMOVAL_NEAREST_ASSERTION_SUPPORTING_SENTENCE;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$ASSERTION_MT;
    private static final SubLObject $const76$termAppearsInAssertion;
    private static final SubLSymbol $kw77$REMOVAL_TERMAPPEARSINASSERTION;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER;
    private static final SubLSymbol $sym80$INDEXED_TERM_P;
    private static final SubLSymbol $sym81$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const82$EverythingPSC;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 1143L)
    public static SubLObject removal_asserted_sentence_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        if (removal_modules_asserted_formula.NIL != variables.fully_bound_p(gaf_sentence)) {
            return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
        }
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(gaf_sentence);
        final SubLObject sub_sense = el_utilities.literal_sense(gaf_sentence);
        SubLObject cost = (SubLObject)removal_modules_asserted_formula.ZERO_INTEGER;
        final SubLObject source_formula_var = sub_literal;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.$sym4$HL_VAR_), (SubLObject)removal_modules_asserted_formula.T);
        SubLObject permuted_asent = (SubLObject)removal_modules_asserted_formula.NIL;
        permuted_asent = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            cost = Numbers.add(cost, inference_trampolines.inference_num_gaf_lookup_index(permuted_asent, sub_sense));
            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 2197L)
    public static SubLObject removal_asserted_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_asserted_sentence_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 2510L)
    public static SubLObject removal_asserted_sentence_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sub_asent = el_utilities.literal_atomic_sentence(sub_literal);
        final SubLObject sub_sense = el_utilities.literal_sense(sub_literal);
        final SubLObject source_formula_var = sub_asent;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.$sym4$HL_VAR_), (SubLObject)removal_modules_asserted_formula.T);
        SubLObject permuted_asent = (SubLObject)removal_modules_asserted_formula.NIL;
        permuted_asent = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, sub_sense);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$1 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$1) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$3 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (removal_modules_asserted_formula.NIL != v_bindings) {
                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$3);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$3 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$2) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$4 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (removal_modules_asserted_formula.NIL != v_bindings) {
                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$4);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$3 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$5 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (removal_modules_asserted_formula.NIL != v_bindings) {
                                                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$4 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$5 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$6 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (removal_modules_asserted_formula.NIL != v_bindings) {
                                                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$6);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$5 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$6 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$5) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$7 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion2), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                                            final SubLObject gaf_asent2 = thread.secondMultipleValue();
                                            final SubLObject unify_justification2 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (removal_modules_asserted_formula.NIL != v_bindings2) {
                                                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings2, assertion2), result);
                                            }
                                        }
                                        done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$7);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject cdolist_list_var_$17 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
                assertion3 = cdolist_list_var_$17.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var_$17) {
                    if ((removal_modules_asserted_formula.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion3)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion3), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                        final SubLObject gaf_asent3 = thread.secondMultipleValue();
                        final SubLObject unify_justification3 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_asserted_formula.NIL != v_bindings3) {
                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings3, assertion3), result);
                        }
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    assertion3 = cdolist_list_var_$17.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        }
        if (removal_modules_asserted_formula.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 4392L)
    public static SubLObject removal_asserted_sentence_unbound_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_exactly_asserted_sentence_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 4801L)
    public static SubLObject removal_asserted_sentence_unbound_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(sentence);
        final SubLObject sub_sense = el_utilities.literal_sense(sentence);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_literal, sub_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != argnum) {
                if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$18 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$19 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$18) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$20 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$20);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$19 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$20 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$19) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$21 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$21);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_asserted_formula.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$20 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$21 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$20) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                    final SubLObject valid_$22 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$21.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$22 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$22);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$21 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$22 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$21) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                    final SubLObject valid_$23 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$23 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$21 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$23);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_asserted_formula.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$22 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$23 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$22) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$23);
                                    final SubLObject valid_$24 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$23.eql(assertion2));
                                    if (removal_modules_asserted_formula.NIL != valid_$24 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion2) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion2), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion2, result);
                                    }
                                    done_var_$22 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$24);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                if ((removal_modules_asserted_formula.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion3) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion3), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_asserted_formula.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 6574L)
    public static SubLObject removal_asserted_sentence_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_sentence_cost(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 6914L)
    public static SubLObject removal_asserted_sentence_lookup_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_literal = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject inference_asent = el_utilities.literal_atomic_sentence(inference_literal);
        final SubLObject inference_sense = el_utilities.literal_sense(inference_literal);
        SubLObject found = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject source_formula_var = inference_asent;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.$sym4$HL_VAR_), (SubLObject)removal_modules_asserted_formula.T);
        SubLObject permuted_asent = (SubLObject)removal_modules_asserted_formula.NIL;
        permuted_asent = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, inference_sense);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$34 = found;
                                        final SubLObject token_var_$35 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$34) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                            final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$36) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                            }
                                            done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$36 || removal_modules_asserted_formula.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$35 = found;
                                        final SubLObject token_var_$36 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$35) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                            final SubLObject valid_$37 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$36.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$37) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                            }
                                            done_var_$35 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$37 || removal_modules_asserted_formula.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$36 = found;
                                    final SubLObject token_var_$37 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$36) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                        final SubLObject valid_$38 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$37.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$38) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                        }
                                        done_var_$36 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$38 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$37 = found;
                                    final SubLObject token_var_$38 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$37) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                                        final SubLObject valid_$39 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$38.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$39) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                        }
                                        done_var_$37 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$39 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = found;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$38 = found;
                                    final SubLObject token_var_$39 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$38) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$39);
                                        final SubLObject valid_$40 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$39.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$40) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion2, permuted_asent);
                                        }
                                        done_var_$38 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$40 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2 || removal_modules_asserted_formula.NIL != found);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject rest;
                SubLObject assertion3;
                for (rest = (SubLObject)removal_modules_asserted_formula.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED); removal_modules_asserted_formula.NIL == found && removal_modules_asserted_formula.NIL != rest; rest = rest.rest()) {
                    assertion3 = rest.first();
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth(inference_sense) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(inference_sense))) {
                        found = removal_asserted_sentence_lookup_neg_expand_internal(assertion3, permuted_asent);
                    }
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
            if (removal_modules_asserted_formula.NIL == found) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw13$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 7606L)
    public static SubLObject removal_asserted_sentence_lookup_neg_expand_internal(final SubLObject assertion, final SubLObject inference_asent) {
        if (removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            return list_utilities.sublisp_boolean(unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 9101L)
    public static SubLObject removal_exactly_asserted_sentence_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        if (removal_modules_asserted_formula.NIL != variables.fully_bound_p(gaf_sentence)) {
            return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
        }
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(gaf_sentence);
        final SubLObject sub_sense = el_utilities.literal_sense(gaf_sentence);
        return inference_trampolines.inference_num_gaf_lookup_index(sub_literal, sub_sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 10026L)
    public static SubLObject removal_exactly_asserted_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_exactly_asserted_sentence_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 10361L)
    public static SubLObject removal_exactly_asserted_sentence_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sub_asent = el_utilities.literal_atomic_sentence(sub_literal);
        final SubLObject sub_sense = el_utilities.literal_sense(sub_literal);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_asent, sub_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != argnum) {
                if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$50 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$51 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$50) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                        final SubLObject valid_$52 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$51.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$52 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$50 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$52);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$51 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$52 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$51) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                        final SubLObject valid_$53 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$52.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$53 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$51 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$53);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_asserted_formula.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$52 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$53 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$52) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                    final SubLObject valid_$54 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$53.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$54 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$52 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$54);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$53 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$54 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$53) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$54);
                                    final SubLObject valid_$55 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$54.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$55 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$53 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$55);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_asserted_formula.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$54 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$55 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$54) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$55);
                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(assertion2));
                                    if (removal_modules_asserted_formula.NIL != valid_$56 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion2) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion2), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion2, result);
                                    }
                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$56);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                if ((removal_modules_asserted_formula.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion3) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion3), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_asserted_formula.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 11997L)
    public static SubLObject removal_exactly_asserted_sentence_unbound_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_exactly_asserted_sentence_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 12366L)
    public static SubLObject removal_exactly_asserted_sentence_unbound_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sub_literal = el_utilities.literal_atomic_sentence(sentence);
        final SubLObject sub_sense = el_utilities.literal_sense(sentence);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_literal, sub_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != argnum) {
                if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$66 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$67 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$66) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                        final SubLObject valid_$68 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$67.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$68 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$66 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$68);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$67 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$68 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$67) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                                        final SubLObject valid_$69 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$68.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$69 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$67 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$69);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_asserted_formula.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$68 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$69 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$68) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$69);
                                    final SubLObject valid_$70 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$69.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$70 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$68 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$70);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$69 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$70 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$69) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                    final SubLObject valid_$71 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$70.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$71 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$69 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$71);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_asserted_formula.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(sub_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$70 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$71 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$70) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$71);
                                    final SubLObject valid_$72 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$71.eql(assertion2));
                                    if (removal_modules_asserted_formula.NIL != valid_$72 && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion2) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion2), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion2, result);
                                    }
                                    done_var_$70 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$72);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                if ((removal_modules_asserted_formula.NIL == enumeration_types.sense_truth(sub_sense) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) && removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion3) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion3), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_asserted_formula.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 13981L)
    public static SubLObject removal_exactly_asserted_sentence_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_exactly_asserted_sentence_cost(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 14345L)
    public static SubLObject removal_exactly_asserted_sentence_lookup_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_literal = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject inference_asent = el_utilities.literal_atomic_sentence(inference_literal);
        final SubLObject inference_sense = el_utilities.literal_sense(inference_literal);
        SubLObject found = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(inference_asent, inference_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != argnum) {
                if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$82 = found;
                                    final SubLObject token_var_$83 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$82) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                        final SubLObject valid_$84 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$83.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$84) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                        done_var_$82 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$84 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$83 = found;
                                    final SubLObject token_var_$84 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$83) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                        final SubLObject valid_$85 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$84.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$85) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                        done_var_$83 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$85 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
            }
            else if (removal_modules_asserted_formula.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = found;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$84 = found;
                                final SubLObject token_var_$85 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$84) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$85);
                                    final SubLObject valid_$86 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$85.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$86) {
                                        found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                    }
                                    done_var_$84 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$86 || removal_modules_asserted_formula.NIL != found);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = found;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$85 = found;
                                final SubLObject token_var_$86 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$85) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                    final SubLObject valid_$87 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$86.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$87) {
                                        found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                    }
                                    done_var_$85 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$87 || removal_modules_asserted_formula.NIL != found);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = found;
                    final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_asserted_formula.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth(inference_sense), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$86 = found;
                                final SubLObject token_var_$87 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$86) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$87);
                                    final SubLObject valid_$88 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$87.eql(assertion2));
                                    if (removal_modules_asserted_formula.NIL != valid_$88) {
                                        found = removal_asserted_sentence_lookup_neg_expand_internal(assertion2, asent);
                                    }
                                    done_var_$86 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$88 || removal_modules_asserted_formula.NIL != found);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2 || removal_modules_asserted_formula.NIL != found);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
            SubLObject rest;
            SubLObject assertion3;
            for (rest = (SubLObject)removal_modules_asserted_formula.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED); removal_modules_asserted_formula.NIL == found && removal_modules_asserted_formula.NIL != rest; rest = rest.rest()) {
                assertion3 = rest.first();
                if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth(inference_sense) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(inference_sense))) {
                    found = removal_asserted_sentence_lookup_neg_expand_internal(assertion3, asent);
                }
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_asserted_formula.NIL == found) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw13$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 17114L)
    public static SubLObject removal_asserted_predicate_arg_pos_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_asserted_predicate_arg_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 17413L)
    public static SubLObject removal_asserted_predicate_arg_pos_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        if (removal_modules_asserted_formula.NIL != removal_asserted_predicate_arg_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 18204L)
    public static SubLObject removal_asserted_predicate_arg_check_cost(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return Numbers.min((SubLObject)removal_modules_asserted_formula.ONE_INTEGER, kb_indexing.num_gaf_arg_index(v_term, argnum, predicate, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 18484L)
    public static SubLObject removal_asserted_predicate_arg_check(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return Numbers.plusp(kb_indexing.relevant_num_gaf_arg_index(v_term, argnum, predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 18754L)
    public static SubLObject removal_asserted_predicate_arg_neg_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_predicate_arg_check_cost(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 19082L)
    public static SubLObject removal_asserted_predicate_arg_neg_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        if (removal_modules_asserted_formula.NIL == removal_asserted_predicate_arg_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw13$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 20089L)
    public static SubLObject removal_asserted_predicate_term_arg_var_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return Sequences.length(inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(v_term, argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 20499L)
    public static SubLObject removal_asserted_predicate_term_arg_var_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(v_term, argnum);
        SubLObject key = (SubLObject)removal_modules_asserted_formula.NIL;
        key = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg3, key, (SubLObject)removal_modules_asserted_formula.T, (SubLObject)removal_modules_asserted_formula.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, support_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 21725L)
    public static SubLObject removal_asserted_predicate_term_var_var_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return Sequences.length(inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 22289L)
    public static SubLObject removal_asserted_predicate_term_var_var_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject argnums = cdolist_list_var = inference_trampolines.inference_argnums_from_gafs_mentioning_term(v_term);
        SubLObject argnum = (SubLObject)removal_modules_asserted_formula.NIL;
        argnum = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$98;
            final SubLObject preds = cdolist_list_var_$98 = inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(v_term, argnum);
            SubLObject pred = (SubLObject)removal_modules_asserted_formula.NIL;
            pred = cdolist_list_var_$98.first();
            while (removal_modules_asserted_formula.NIL != cdolist_list_var_$98) {
                final SubLObject support_formula = (SubLObject)ConsesLow.list(removal_modules_asserted_formula.$const24$assertedPredicateArg, v_term, argnum, pred);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, support_formula, (SubLObject)removal_modules_asserted_formula.T, (SubLObject)removal_modules_asserted_formula.T);
                final SubLObject gaf_asent = thread.secondMultipleValue();
                final SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != v_bindings) {
                    final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, support_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                    backward.removal_add_node(hl_support, v_bindings, unify_justification);
                }
                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                pred = cdolist_list_var_$98.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 23605L)
    public static SubLObject removal_asserted_predicate_var_arg_pred_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return kb_indexing.num_predicate_extent_index(pred, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 23934L)
    public static SubLObject removal_asserted_predicate_var_arg_pred_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_refs(pred, argnum, (SubLObject)removal_modules_asserted_formula.$kw36$TRUE);
        SubLObject v_term = (SubLObject)removal_modules_asserted_formula.NIL;
        v_term = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_term, (SubLObject)removal_modules_asserted_formula.T, (SubLObject)removal_modules_asserted_formula.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, support_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 25725L)
    public static SubLObject make_term_formulas_support(final SubLObject support_formula) {
        return arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, support_formula, removal_modules_asserted_formula.$term_formulas_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_asserted_formula.$kw43$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 25876L)
    public static SubLObject inference_term_formulas_find(final SubLObject v_term, final SubLObject formula) {
        assert removal_modules_asserted_formula.NIL != cycl_grammar.cycl_formula_p(formula) : formula;
        return cycl_utilities.expression_find(v_term, formula, (SubLObject)removal_modules_asserted_formula.T, Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.EQUAL), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 26028L)
    public static SubLObject inference_term_formulas_gather(SubLObject formula) {
        formula = czer_utilities.unwrap_quotes(formula);
        assert removal_modules_asserted_formula.NIL != cycl_grammar.cycl_formula_p(formula) : formula;
        final SubLObject candidates = list_utilities.fast_delete_duplicates(narts_high.nart_substitute(cycl_utilities.expression_gather(formula, (SubLObject)removal_modules_asserted_formula.$sym45$HL_TERM_P, (SubLObject)removal_modules_asserted_formula.T, Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.EQUAL), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_asserted_formula.NIL;
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = (SubLObject)removal_modules_asserted_formula.NIL;
        candidate = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            if (removal_modules_asserted_formula.NIL != el_utilities.closedP(candidate, (SubLObject)removal_modules_asserted_formula.UNPROVIDED) && removal_modules_asserted_formula.NIL != variables.fully_bound_p(candidate)) {
                result = (SubLObject)ConsesLow.cons(candidate, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 26646L)
    public static SubLObject inference_term_formulas_count(final SubLObject formula) {
        return Sequences.length(inference_term_formulas_gather(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 26904L)
    public static SubLObject removal_term_formulas_check_cost_pos(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_term_formulas_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 27158L)
    public static SubLObject removal_term_formulas_check_expand_pos(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        if (removal_modules_asserted_formula.NIL != removal_term_formulas_check(asent)) {
            backward.removal_add_node(make_term_formulas_support(asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 27888L)
    public static SubLObject removal_term_formulas_check(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        formula = czer_utilities.unwrap_quotes(formula);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL != cycl_grammar.cycl_formula_p(formula) && removal_modules_asserted_formula.NIL != inference_term_formulas_find(v_term, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 28185L)
    public static SubLObject removal_term_formulas_check_cost(final SubLObject asent) {
        return (SubLObject)((removal_modules_asserted_formula.NIL != removal_term_formulas_check(asent)) ? control_vars.$cheap_hl_module_check_cost$.getGlobalValue() : removal_modules_asserted_formula.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 28335L)
    public static SubLObject removal_term_formulas_check_cost_neg(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_term_formulas_check_cost(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 28618L)
    public static SubLObject removal_term_formulas_check_expand_neg(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        if (removal_modules_asserted_formula.NIL == removal_term_formulas_check(asent)) {
            backward.removal_add_node(make_term_formulas_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 29376L)
    public static SubLObject removal_term_formulas_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return inference_term_formulas_count(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 29665L)
    public static SubLObject removal_term_formulas_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = inference_term_formulas_gather(formula);
        SubLObject v_term = (SubLObject)removal_modules_asserted_formula.NIL;
        v_term = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_term, (SubLObject)removal_modules_asserted_formula.T, (SubLObject)removal_modules_asserted_formula.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(make_term_formulas_support(support_formula), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 31151L)
    public static SubLObject removal_asserted_term_sentences_sentence_cost(final SubLObject sentence) {
        return inference_trampolines.inference_num_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 31281L)
    public static SubLObject removal_asserted_term_sentences_term_index_cost(final SubLObject v_term, SubLObject predicate) {
        if (predicate == removal_modules_asserted_formula.UNPROVIDED) {
            predicate = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        if (removal_modules_asserted_formula.NIL == predicate) {
            return kb_indexing.relevant_num_gaf_arg_index(v_term, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        SubLObject term_index_cost = (SubLObject)removal_modules_asserted_formula.ZERO_INTEGER;
        SubLObject cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(v_term, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject term_key = (SubLObject)removal_modules_asserted_formula.NIL;
        term_key = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            term_index_cost = Numbers.add(term_index_cost, kb_indexing.relevant_num_gaf_arg_index(v_term, term_key, predicate));
            cdolist_list_var = cdolist_list_var.rest();
            term_key = cdolist_list_var.first();
        }
        return term_index_cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 31735L)
    public static SubLObject removal_asserted_term_sentences_gaf_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_asserted_term_sentences_gaf_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 33338L)
    public static SubLObject removal_asserted_term_sentences_gaf_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        if (removal_modules_asserted_formula.NIL != inference_term_formulas_find(v_term, sentence)) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$99 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$100 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$101 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$100) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$101);
                                            final SubLObject valid_$102 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$101.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$102) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$100 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$102);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$101 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$102 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$101) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$102);
                                            final SubLObject valid_$103 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$102.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$103) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$101 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$103);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$102 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$103 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$102) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$103);
                                        final SubLObject valid_$104 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$103.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$104) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                        }
                                        done_var_$102 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$104);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$103 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$104 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$103) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$104);
                                        final SubLObject valid_$105 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$104.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$105) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                        }
                                        done_var_$103 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$105);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$104 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$105 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$104) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$105);
                                        final SubLObject valid_$106 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$105.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$106) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion2, sentence);
                                        }
                                        done_var_$104 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$106);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
                assertion3 = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                        removal_modules_lookup.removal_lookup_expand_internal(assertion3, sentence);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 34423L)
    public static SubLObject removal_asserted_term_sentences_gaf_check_cost(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return (SubLObject)((removal_modules_asserted_formula.NIL != inference_term_formulas_find(v_term, sentence)) ? removal_asserted_term_sentences_sentence_cost(sentence) : removal_modules_asserted_formula.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 34737L)
    public static SubLObject removal_asserted_term_sentences_gaf_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_term_sentences_gaf_check_cost(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 35286L)
    public static SubLObject removal_asserted_term_sentences_gaf_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject inference_asent = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject found = (SubLObject)removal_modules_asserted_formula.NIL;
        if (removal_modules_asserted_formula.NIL != inference_term_formulas_find(v_term, inference_asent)) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(inference_asent, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$116 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$117 = found;
                                        final SubLObject token_var_$118 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$117) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$118);
                                            final SubLObject valid_$119 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$118.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$119) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                            }
                                            done_var_$117 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$119 || removal_modules_asserted_formula.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$118 = found;
                                        final SubLObject token_var_$119 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$118) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$119);
                                            final SubLObject valid_$120 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$119.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$120) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                            }
                                            done_var_$118 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$120 || removal_modules_asserted_formula.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$119 = found;
                                    final SubLObject token_var_$120 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$119) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                        final SubLObject valid_$121 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$120.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$121) {
                                            found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                        }
                                        done_var_$119 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$121 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$120 = found;
                                    final SubLObject token_var_$121 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$120) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$121);
                                        final SubLObject valid_$122 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$121.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$122) {
                                            found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                        }
                                        done_var_$120 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$122 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = found;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$121 = found;
                                    final SubLObject token_var_$122 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$121) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$122);
                                        final SubLObject valid_$123 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$122.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$123) {
                                            found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion2, v_term, inference_asent);
                                        }
                                        done_var_$121 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$123 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2 || removal_modules_asserted_formula.NIL != found);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject rest;
                SubLObject assertion3;
                for (rest = (SubLObject)removal_modules_asserted_formula.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED); removal_modules_asserted_formula.NIL == found && removal_modules_asserted_formula.NIL != rest; rest = rest.rest()) {
                    assertion3 = rest.first();
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                        found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion3, v_term, inference_asent);
                    }
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        if (removal_modules_asserted_formula.NIL == found) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw13$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 35885L)
    public static SubLObject removal_asserted_term_sentences_gaf_check_neg_expand_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject inference_asent) {
        if (removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL != inference_term_formulas_find(v_term, gaf_formula) && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 37009L)
    public static SubLObject removal_asserted_term_sentences_gaf_iterate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject term_count = inference_term_formulas_count(sentence);
        final SubLObject sentence_cost = removal_asserted_term_sentences_sentence_cost(sentence);
        return Numbers.multiply(term_count, sentence_cost);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 37680L)
    public static SubLObject removal_asserted_term_sentences_gaf_iterate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_asserted_formula.NIL != argnum) {
                if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$133 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$134 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$133) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$134);
                                        final SubLObject valid_$135 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$134.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$135) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                        }
                                        done_var_$133 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$135);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$134 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$135 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$134) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$135);
                                        final SubLObject valid_$136 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$135.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$136) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                        }
                                        done_var_$134 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$136);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_asserted_formula.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$135 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$136 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$135) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                    final SubLObject valid_$137 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$136.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$137) {
                                        removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                    }
                                    done_var_$135 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$137);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_formula.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$136 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$137 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$136) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$137);
                                    final SubLObject valid_$138 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$137.eql(assertion));
                                    if (removal_modules_asserted_formula.NIL != valid_$138) {
                                        removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                    }
                                    done_var_$136 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$138);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                    while (removal_modules_asserted_formula.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_asserted_formula.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                SubLObject done_var_$137 = (SubLObject)removal_modules_asserted_formula.NIL;
                                final SubLObject token_var_$138 = (SubLObject)removal_modules_asserted_formula.NIL;
                                while (removal_modules_asserted_formula.NIL == done_var_$137) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$138);
                                    final SubLObject valid_$139 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$138.eql(assertion2));
                                    if (removal_modules_asserted_formula.NIL != valid_$139) {
                                        removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion2, arg1, sentence);
                                    }
                                    done_var_$137 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$139);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                    removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion3, arg1, sentence);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 38056L)
    public static SubLObject removal_asserted_term_sentences_gaf_iterate_expand_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(asent, gaf_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED)) {
                SubLObject cdolist_list_var;
                final SubLObject asent_terms = cdolist_list_var = inference_term_formulas_gather(gaf_formula);
                SubLObject asent_term = (SubLObject)removal_modules_asserted_formula.NIL;
                asent_term = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, asent_term, (SubLObject)removal_modules_asserted_formula.T, (SubLObject)removal_modules_asserted_formula.T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_asserted_formula.NIL != v_bindings) {
                        backward.removal_add_node(assertion, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    asent_term = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 39297L)
    public static SubLObject removal_asserted_term_sentences_arg_index_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        return Numbers.min(removal_asserted_term_sentences_term_index_cost(v_term, predicate), removal_asserted_term_sentences_sentence_cost(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 40062L)
    public static SubLObject removal_asserted_term_sentences_arg_index_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject predicate = sentence.first();
        if (removal_asserted_term_sentences_term_index_cost(v_term, predicate).numL(removal_asserted_term_sentences_sentence_cost(sentence))) {
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.$kw6$GAF)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.$kw6$GAF);
                SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                while (removal_modules_asserted_formula.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_asserted_formula.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.$kw36$TRUE, (SubLObject)removal_modules_asserted_formula.NIL);
                            SubLObject done_var_$149 = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var_$150 = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var_$149) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$150);
                                final SubLObject valid_$151 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$150.eql(assertion));
                                if (removal_modules_asserted_formula.NIL != valid_$151 && removal_modules_asserted_formula.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec) && predicate.eql(assertions_high.gaf_predicate(assertion))) {
                                    removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                }
                                done_var_$149 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$151);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                }
            }
        }
        else {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$152 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate_$153 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate_$153) {
                        final SubLObject pred_var = predicate_$153;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, argnum, pred_var);
                            SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_asserted_formula.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$150 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$151 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$150) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$151);
                                            final SubLObject valid_$152 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$151.eql(assertion2));
                                            if (removal_modules_asserted_formula.NIL != valid_$152) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$150 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$152);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, argnum, pred_var);
                            SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_asserted_formula.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$151 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$152 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$151) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$152);
                                            final SubLObject valid_$153 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$152.eql(assertion2));
                                            if (removal_modules_asserted_formula.NIL != valid_$153) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$151 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$153);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate_$153) {
                    final SubLObject pred_var = predicate_$153;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$152 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$153 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$152) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$153);
                                        final SubLObject valid_$154 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$153.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$154) {
                                            removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                        }
                                        done_var_$152 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$154);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$153 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$154 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$153) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$154);
                                        final SubLObject valid_$155 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$154.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$155) {
                                            removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                        }
                                        done_var_$153 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$155);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var3 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var3 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                            if (removal_modules_asserted_formula.NIL != valid3) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator3 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$154 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$155 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$154) {
                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$155);
                                        final SubLObject valid_$156 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$155.eql(assertion3));
                                        if (removal_modules_asserted_formula.NIL != valid_$156) {
                                            removal_asserted_term_sentences_unify_expand_internal(assertion3, v_term, sentence);
                                        }
                                        done_var_$154 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$156);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$169 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
                                    }
                                }
                            }
                            done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid3);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_13, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject assertion4 = (SubLObject)removal_modules_asserted_formula.NIL;
                assertion4 = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion4, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                        removal_asserted_term_sentences_unify_expand_internal(assertion4, v_term, sentence);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion4 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 40878L)
    public static SubLObject removal_asserted_term_sentences_unify_expand_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject inference_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (removal_modules_asserted_formula.NIL != inference_term_formulas_find(v_term, gaf_formula)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, (SubLObject)removal_modules_asserted_formula.T, (SubLObject)removal_modules_asserted_formula.T);
                final SubLObject gaf_asent = thread.secondMultipleValue();
                final SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != v_bindings) {
                    backward.removal_add_node(assertion, v_bindings, unify_justification);
                }
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 42229L)
    public static SubLObject removal_asserted_term_sentences_index_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return Numbers.min(removal_asserted_term_sentences_term_index_cost(v_term, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), removal_asserted_term_sentences_sentence_cost(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 43213L)
    public static SubLObject removal_asserted_term_sentences_index_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        if (removal_asserted_term_sentences_term_index_cost(v_term, (SubLObject)removal_modules_asserted_formula.UNPROVIDED).numL(removal_asserted_term_sentences_sentence_cost(sentence))) {
            if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.$kw6$GAF)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.$kw6$GAF);
                SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                while (removal_modules_asserted_formula.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_asserted_formula.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.$kw36$TRUE, (SubLObject)removal_modules_asserted_formula.NIL);
                            SubLObject done_var_$170 = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var_$171 = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var_$170) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$171);
                                final SubLObject valid_$172 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$171.eql(assertion));
                                if (removal_modules_asserted_formula.NIL != valid_$172 && removal_modules_asserted_formula.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                    removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                }
                                done_var_$170 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$172);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                }
            }
        }
        else {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$173 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, argnum, pred_var);
                            SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_asserted_formula.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$171 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$172 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$171) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$172);
                                            final SubLObject valid_$173 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$172.eql(assertion2));
                                            if (removal_modules_asserted_formula.NIL != valid_$173) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$171 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$173);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, argnum, pred_var);
                            SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_asserted_formula.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$172 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$173 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$172) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$173);
                                            final SubLObject valid_$174 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$173.eql(assertion2));
                                            if (removal_modules_asserted_formula.NIL != valid_$174) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$172 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$174);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$173 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$174 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$173) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$174);
                                        final SubLObject valid_$175 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$174.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$175) {
                                            removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                        }
                                        done_var_$173 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$175);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$174 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$175 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$174) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$175);
                                        final SubLObject valid_$176 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$175.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$176) {
                                            removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                        }
                                        done_var_$174 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$176);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var3 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var3 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                            if (removal_modules_asserted_formula.NIL != valid3) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator3 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$175 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$176 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$175) {
                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$176);
                                        final SubLObject valid_$177 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$176.eql(assertion3));
                                        if (removal_modules_asserted_formula.NIL != valid_$177) {
                                            removal_asserted_term_sentences_unify_expand_internal(assertion3, v_term, sentence);
                                        }
                                        done_var_$175 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$177);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$189 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$189, thread);
                                    }
                                }
                            }
                            done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid3);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_13, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject assertion4 = (SubLObject)removal_modules_asserted_formula.NIL;
                assertion4 = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion4, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                        removal_asserted_term_sentences_unify_expand_internal(assertion4, v_term, sentence);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion4 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 44752L)
    public static SubLObject removal_asserted_term_sentences_index_variable_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        return removal_asserted_term_sentences_term_index_cost(v_term, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 45472L)
    public static SubLObject removal_asserted_term_sentences_index_variable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.$kw6$GAF)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.$kw6$GAF);
            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
            while (removal_modules_asserted_formula.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_asserted_formula.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.$kw36$TRUE, (SubLObject)removal_modules_asserted_formula.NIL);
                        SubLObject done_var_$190 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var_$191 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var_$190) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$191);
                            final SubLObject valid_$192 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$191.eql(assertion));
                            if (removal_modules_asserted_formula.NIL != valid_$192 && removal_modules_asserted_formula.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                removal_modules_lookup.removal_lookup_expand_internal(assertion, arg2);
                            }
                            done_var_$190 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$192);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_asserted_formula.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 46782L)
    public static SubLObject removal_asserted_term_set_sentences_terms_index_cost(final SubLObject terms) {
        return virtual_indexing.estimated_num_overlap_index(terms, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 46905L)
    public static SubLObject removal_asserted_term_set_sentences_arg1_bound_asent_cost(final SubLObject asent) {
        final SubLObject terms = el_utilities.el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        return virtual_indexing.estimated_num_overlap_index(terms, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 47113L)
    public static SubLObject removal_asserted_term_set_sentences_index_variable_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 48965L)
    public static SubLObject removal_asserted_term_set_sentences_index_variable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLObject terms = el_utilities.el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject assertions = cdolist_list_var = virtual_indexing.gather_overlap_index(terms, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject assertion = (SubLObject)removal_modules_asserted_formula.NIL;
        assertion = cdolist_list_var.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
            if (removal_modules_asserted_formula.NIL != assertions_high.gaf_assertionP(assertion)) {
                removal_modules_lookup.removal_lookup_expand_internal(assertion, arg2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 50030L)
    public static SubLObject removal_asserted_term_set_sentences_gaf_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 50485L)
    public static SubLObject removal_asserted_term_set_sentences_gaf_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = el_utilities.el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject missing = (SubLObject)removal_modules_asserted_formula.NIL;
        if (removal_modules_asserted_formula.NIL == missing) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = (SubLObject)removal_modules_asserted_formula.NIL;
            v_term = csome_list_var.first();
            while (removal_modules_asserted_formula.NIL == missing && removal_modules_asserted_formula.NIL != csome_list_var) {
                if (removal_modules_asserted_formula.NIL == inference_term_formulas_find(v_term, sentence)) {
                    missing = (SubLObject)removal_modules_asserted_formula.T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            }
        }
        if (removal_modules_asserted_formula.NIL == missing) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$193 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$194 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$193) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$194);
                                            final SubLObject valid_$195 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$194.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$195) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$193 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$195);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$194 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$195 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$194) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$195);
                                            final SubLObject valid_$196 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$195.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$196) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$194 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$196);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$195 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$196 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$195) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$196);
                                        final SubLObject valid_$197 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$196.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$197) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                        }
                                        done_var_$195 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$197);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$196 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$197 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$196) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$197);
                                        final SubLObject valid_$198 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$197.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$198) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                        }
                                        done_var_$196 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$198);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$197 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$198 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$197) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$198);
                                        final SubLObject valid_$199 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$198.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$199) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion2, sentence);
                                        }
                                        done_var_$197 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$199);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$208 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject assertion3 = (SubLObject)removal_modules_asserted_formula.NIL;
                assertion3 = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                        removal_modules_lookup.removal_lookup_expand_internal(assertion3, sentence);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 51726L)
    public static SubLObject removal_asserted_term_set_sentences_gaf_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 52217L)
    public static SubLObject removal_asserted_term_set_sentences_gaf_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = el_utilities.el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject missing = (SubLObject)removal_modules_asserted_formula.NIL;
        SubLObject found = (SubLObject)removal_modules_asserted_formula.NIL;
        if (removal_modules_asserted_formula.NIL == missing) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = (SubLObject)removal_modules_asserted_formula.NIL;
            v_term = csome_list_var.first();
            while (removal_modules_asserted_formula.NIL == missing && removal_modules_asserted_formula.NIL != csome_list_var) {
                if (removal_modules_asserted_formula.NIL == inference_term_formulas_find(v_term, sentence)) {
                    missing = (SubLObject)removal_modules_asserted_formula.T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            }
        }
        if (removal_modules_asserted_formula.NIL == missing) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.$kw40$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$209 = found;
                                        final SubLObject token_var_$210 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$209) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$210);
                                            final SubLObject valid_$211 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$210.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$211) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                            }
                                            done_var_$209 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$211 || removal_modules_asserted_formula.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$210 = found;
                                        final SubLObject token_var_$211 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$210) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$211);
                                            final SubLObject valid_$212 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$211.eql(assertion));
                                            if (removal_modules_asserted_formula.NIL != valid_$212) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                            }
                                            done_var_$210 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$212 || removal_modules_asserted_formula.NIL != found);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$211 = found;
                                    final SubLObject token_var_$212 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$211) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$212);
                                        final SubLObject valid_$213 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$212.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$213) {
                                            found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                        }
                                        done_var_$211 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$213 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$212 = found;
                                    final SubLObject token_var_$213 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$212) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$213);
                                        final SubLObject valid_$214 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$213.eql(assertion));
                                        if (removal_modules_asserted_formula.NIL != valid_$214) {
                                            found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                        }
                                        done_var_$212 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$214 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid || removal_modules_asserted_formula.NIL != found);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = found;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS), (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$213 = found;
                                    final SubLObject token_var_$214 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$213) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$214);
                                        final SubLObject valid_$215 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$214.eql(assertion2));
                                        if (removal_modules_asserted_formula.NIL != valid_$215) {
                                            found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion2, terms, asent);
                                        }
                                        done_var_$213 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$215 || removal_modules_asserted_formula.NIL != found);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$224 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$224, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2 || removal_modules_asserted_formula.NIL != found);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject rest;
                SubLObject assertion3;
                for (rest = (SubLObject)removal_modules_asserted_formula.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED); removal_modules_asserted_formula.NIL == found && removal_modules_asserted_formula.NIL != rest; rest = rest.rest()) {
                    assertion3 = rest.first();
                    if (removal_modules_asserted_formula.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS) || removal_modules_asserted_formula.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_asserted_formula.$kw40$POS))) {
                        found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion3, terms, asent);
                    }
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        if (removal_modules_asserted_formula.NIL == found) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw13$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 52923L)
    public static SubLObject removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(final SubLObject assertion, final SubLObject terms, final SubLObject inference_asent) {
        if (removal_modules_asserted_formula.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            SubLObject missing = (SubLObject)removal_modules_asserted_formula.NIL;
            if (removal_modules_asserted_formula.NIL == missing) {
                SubLObject csome_list_var = terms;
                SubLObject v_term = (SubLObject)removal_modules_asserted_formula.NIL;
                v_term = csome_list_var.first();
                while (removal_modules_asserted_formula.NIL == missing && removal_modules_asserted_formula.NIL != csome_list_var) {
                    if (removal_modules_asserted_formula.NIL == inference_term_formulas_find(v_term, gaf_formula)) {
                        missing = (SubLObject)removal_modules_asserted_formula.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == missing && removal_modules_asserted_formula.NIL != unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED));
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 54981L)
    public static SubLObject removal_nearest_assertion_supporting_sentence_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject assertion = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject matching_assertions = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(sentence, (SubLObject)removal_modules_asserted_formula.NIL, (SubLObject)removal_modules_asserted_formula.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw5$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_formula.NIL != argnum) {
                    if (removal_modules_asserted_formula.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.NIL, (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$225 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$226 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$225) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$226);
                                            final SubLObject valid_$227 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$226.eql(gaf));
                                            if (removal_modules_asserted_formula.NIL != valid_$227 && removal_modules_asserted_formula.NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf))) {
                                                matching_assertions = (SubLObject)ConsesLow.cons(gaf, matching_assertions);
                                            }
                                            done_var_$225 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$227);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$228 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                            while (removal_modules_asserted_formula.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_asserted_formula.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.NIL, (SubLObject)removal_modules_asserted_formula.NIL);
                                        SubLObject done_var_$226 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        final SubLObject token_var_$227 = (SubLObject)removal_modules_asserted_formula.NIL;
                                        while (removal_modules_asserted_formula.NIL == done_var_$226) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$227);
                                            final SubLObject valid_$228 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$227.eql(gaf));
                                            if (removal_modules_asserted_formula.NIL != valid_$228 && removal_modules_asserted_formula.NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf))) {
                                                matching_assertions = (SubLObject)ConsesLow.cons(gaf, matching_assertions);
                                            }
                                            done_var_$226 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$228);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$229 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$229, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_asserted_formula.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.NIL, (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$227 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$228 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$227) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$228);
                                        final SubLObject valid_$229 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$228.eql(gaf));
                                        if (removal_modules_asserted_formula.NIL != valid_$229 && removal_modules_asserted_formula.NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf))) {
                                            matching_assertions = (SubLObject)ConsesLow.cons(gaf, matching_assertions);
                                        }
                                        done_var_$227 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$229);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$230 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_formula.NIL;
                    if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_formula.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_formula.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.NIL, (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$228 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$229 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$228) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$229);
                                        final SubLObject valid_$230 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$229.eql(gaf));
                                        if (removal_modules_asserted_formula.NIL != valid_$230 && removal_modules_asserted_formula.NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf))) {
                                            matching_assertions = (SubLObject)ConsesLow.cons(gaf, matching_assertions);
                                        }
                                        done_var_$228 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$230);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$231 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$231, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw7$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_asserted_formula.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_formula.NIL;
                    final SubLObject _prev_bind_0_$232 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$242 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$243 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_formula.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_formula.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_formula.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_formula.NIL;
                        while (removal_modules_asserted_formula.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_formula.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_formula.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_formula.$kw6$GAF, (SubLObject)removal_modules_asserted_formula.NIL, (SubLObject)removal_modules_asserted_formula.NIL);
                                    SubLObject done_var_$229 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    final SubLObject token_var_$230 = (SubLObject)removal_modules_asserted_formula.NIL;
                                    while (removal_modules_asserted_formula.NIL == done_var_$229) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$230);
                                        final SubLObject valid_$231 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$230.eql(gaf2));
                                        if (removal_modules_asserted_formula.NIL != valid_$231 && removal_modules_asserted_formula.NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf2))) {
                                            matching_assertions = (SubLObject)ConsesLow.cons(gaf2, matching_assertions);
                                        }
                                        done_var_$229 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid_$231);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$233 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_formula.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_formula.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$233, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_formula.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$243, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$242, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$232, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_asserted_formula.$kw8$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject gaf3 = (SubLObject)removal_modules_asserted_formula.NIL;
                gaf3 = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    if (removal_modules_asserted_formula.NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf3))) {
                        matching_assertions = (SubLObject)ConsesLow.cons(gaf3, matching_assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        final SubLObject min_mts = genl_mts.min_mts(Mapping.mapcar((SubLObject)removal_modules_asserted_formula.$sym75$ASSERTION_MT, matching_assertions), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject min_matching_assertions = (SubLObject)removal_modules_asserted_formula.NIL;
        SubLObject cdolist_list_var2 = matching_assertions;
        SubLObject matching_assertion = (SubLObject)removal_modules_asserted_formula.NIL;
        matching_assertion = cdolist_list_var2.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var2) {
            if (removal_modules_asserted_formula.NIL != list_utilities.member_kbeqP(assertions_high.assertion_mt(matching_assertion), min_mts)) {
                min_matching_assertions = (SubLObject)ConsesLow.cons(matching_assertion, min_matching_assertions);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            matching_assertion = cdolist_list_var2.first();
        }
        cdolist_list_var2 = min_matching_assertions;
        SubLObject min_matching_assertion = (SubLObject)removal_modules_asserted_formula.NIL;
        min_matching_assertion = cdolist_list_var2.first();
        while (removal_modules_asserted_formula.NIL != cdolist_list_var2) {
            if (removal_modules_asserted_formula.NIL != unification.unify_possible(assertion, min_matching_assertion)) {
                final SubLObject v_bindings = unification_utilities.term_unify((SubLObject)ConsesLow.list(min_matching_assertion, assertions_high.gaf_el_formula(min_matching_assertion)), (SubLObject)ConsesLow.list(assertion, sentence), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                if (removal_modules_asserted_formula.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), v_bindings, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            min_matching_assertion = cdolist_list_var2.first();
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 56923L)
    public static SubLObject removal_termappearsinassertion_assertion_terms_helper_internal(final SubLObject assertion) {
        return cycl_utilities.expression_gather(assertions_high.assertion_cnf(assertion), (SubLObject)removal_modules_asserted_formula.$sym80$INDEXED_TERM_P, (SubLObject)removal_modules_asserted_formula.T, Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.EQL), Symbols.symbol_function((SubLObject)removal_modules_asserted_formula.IDENTITY), (SubLObject)removal_modules_asserted_formula.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 56923L)
    public static SubLObject removal_termappearsinassertion_assertion_terms_helper(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_asserted_formula.NIL;
        if (removal_modules_asserted_formula.NIL == v_memoization_state) {
            return removal_termappearsinassertion_assertion_terms_helper_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_asserted_formula.$sym79$REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        if (removal_modules_asserted_formula.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_asserted_formula.$sym79$REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER, (SubLObject)removal_modules_asserted_formula.ONE_INTEGER, (SubLObject)removal_modules_asserted_formula.SIXTEEN_INTEGER, (SubLObject)removal_modules_asserted_formula.EQ, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_asserted_formula.$sym79$REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_termappearsinassertion_assertion_terms_helper_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 57144L)
    public static SubLObject removal_termappearsinassertion_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_arg = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject assertion_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        SubLObject cost = (SubLObject)removal_modules_asserted_formula.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_asserted_formula.$sym81$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_asserted_formula.$const82$EverythingPSC, thread);
            cost = ((removal_modules_asserted_formula.NIL != assertion_handles.assertion_p(assertion_arg)) ? Sequences.length(removal_termappearsinassertion_assertion_terms_helper(assertion_arg)) : kb_indexing.num_index(term_arg));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 57556L)
    public static SubLObject removal_termappearsinassertion_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_formula.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_formula.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_arg = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject assertion_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_asserted_formula.$sym81$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_asserted_formula.$const82$EverythingPSC, thread);
            if (removal_modules_asserted_formula.NIL != assertion_handles.assertion_p(assertion_arg)) {
                SubLObject cdolist_list_var = removal_termappearsinassertion_assertion_terms_helper(assertion_arg);
                SubLObject v_term = (SubLObject)removal_modules_asserted_formula.NIL;
                v_term = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, term_arg, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                    if (removal_modules_asserted_formula.NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, bindings.apply_bindings(v_bindings, asent), removal_modules_asserted_formula.$const42$BaseKB, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), v_bindings, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index((SubLObject)ConsesLow.list(term_arg), (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                SubLObject assertion = (SubLObject)removal_modules_asserted_formula.NIL;
                assertion = cdolist_list_var.first();
                while (removal_modules_asserted_formula.NIL != cdolist_list_var) {
                    final SubLObject v_bindings = unification_utilities.term_unify(assertion, assertion_arg, (SubLObject)removal_modules_asserted_formula.UNPROVIDED, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                    if (removal_modules_asserted_formula.NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_formula.$kw27$OPAQUE, bindings.apply_bindings(v_bindings, asent), removal_modules_asserted_formula.$const42$BaseKB, (SubLObject)removal_modules_asserted_formula.UNPROVIDED), v_bindings, (SubLObject)removal_modules_asserted_formula.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    public static SubLObject declare_removal_modules_asserted_formula_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_cost", "REMOVAL-ASSERTED-SENTENCE-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_lookup_pos_cost", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        new $removal_asserted_sentence_lookup_pos_cost$UnaryFunction();
        new $removal_asserted_sentence_lookup_pos_cost$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_lookup_iterator", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR", 1, 0, false);
        new $removal_asserted_sentence_lookup_iterator$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_unbound_lookup_pos_cost", "REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_unbound_lookup_iterator", "REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_lookup_neg_cost", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_lookup_neg_expand", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_sentence_lookup_neg_expand_internal", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_lookup_pos_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_lookup_iterator", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_unbound_lookup_pos_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_unbound_lookup_iterator", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_lookup_neg_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_exactly_asserted_sentence_lookup_neg_expand", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_arg_pos_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_arg_pos_check_expand", "REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_arg_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_arg_check", "REMOVAL-ASSERTED-PREDICATE-ARG-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_arg_neg_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_arg_neg_check_expand", "REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_term_arg_var_cost", "REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_term_arg_var_expand", "REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_term_var_var_cost", "REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_term_var_var_expand", "REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_var_arg_pred_cost", "REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_predicate_var_arg_pred_expand", "REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "make_term_formulas_support", "MAKE-TERM-FORMULAS-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "inference_term_formulas_find", "INFERENCE-TERM-FORMULAS-FIND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "inference_term_formulas_gather", "INFERENCE-TERM-FORMULAS-GATHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "inference_term_formulas_count", "INFERENCE-TERM-FORMULAS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_check_cost_pos", "REMOVAL-TERM-FORMULAS-CHECK-COST-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_check_expand_pos", "REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_check", "REMOVAL-TERM-FORMULAS-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_check_cost", "REMOVAL-TERM-FORMULAS-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_check_cost_neg", "REMOVAL-TERM-FORMULAS-CHECK-COST-NEG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_check_expand_neg", "REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_unify_cost", "REMOVAL-TERM-FORMULAS-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_term_formulas_unify_expand", "REMOVAL-TERM-FORMULAS-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_sentence_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-SENTENCE-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_term_index_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-TERM-INDEX-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_check_pos_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_check_pos_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_check_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_check_neg_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_check_neg_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_check_neg_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_iterate_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_iterate_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_gaf_iterate_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_arg_index_unify_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_arg_index_unify_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_unify_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-UNIFY-EXPAND-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_index_unify_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_index_unify_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_index_variable_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_sentences_index_variable_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_terms_index_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-TERMS-INDEX-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_arg1_bound_asent_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-ARG1-BOUND-ASENT-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_index_variable_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_index_variable_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_gaf_check_pos_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_gaf_check_pos_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_gaf_check_neg_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_gaf_check_neg_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_asserted_term_set_sentences_gaf_check_neg_expand_internal", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_nearest_assertion_supporting_sentence_expand", "REMOVAL-NEAREST-ASSERTION-SUPPORTING-SENTENCE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_termappearsinassertion_assertion_terms_helper_internal", "REMOVAL-TERMAPPEARSINASSERTION-ASSERTION-TERMS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_termappearsinassertion_assertion_terms_helper", "REMOVAL-TERMAPPEARSINASSERTION-ASSERTION-TERMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_termappearsinassertion_cost", "REMOVAL-TERMAPPEARSINASSERTION-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula", "removal_termappearsinassertion_expand", "REMOVAL-TERMAPPEARSINASSERTION-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    public static SubLObject init_removal_modules_asserted_formula_file() {
        removal_modules_asserted_formula.$term_formulas_defining_mt$ = SubLFiles.deflexical("*TERM-FORMULAS-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_asserted_formula.$sym41$_TERM_FORMULAS_DEFINING_MT_, removal_modules_asserted_formula.$term_formulas_defining_mt$, removal_modules_asserted_formula.$const42$BaseKB));
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    public static SubLObject setup_removal_modules_asserted_formula_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const0$assertedSentence);
        preference_modules.inference_preference_module((SubLObject)removal_modules_asserted_formula.$kw1$ASSERTED_SENTENCE_VARIABLE, (SubLObject)removal_modules_asserted_formula.$list2);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_formula.$kw3$NEG, removal_modules_asserted_formula.$const0$assertedSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw9$REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS, (SubLObject)removal_modules_asserted_formula.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw11$REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, (SubLObject)removal_modules_asserted_formula.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw14$REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG, (SubLObject)removal_modules_asserted_formula.$list15);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const16$exactlyAssertedSentence);
        preference_modules.inference_preference_module((SubLObject)removal_modules_asserted_formula.$kw1$ASSERTED_SENTENCE_VARIABLE, (SubLObject)removal_modules_asserted_formula.$list17);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_formula.$kw3$NEG, removal_modules_asserted_formula.$const16$exactlyAssertedSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw18$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS, (SubLObject)removal_modules_asserted_formula.$list19);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw20$REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, (SubLObject)removal_modules_asserted_formula.$list21);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw22$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG, (SubLObject)removal_modules_asserted_formula.$list23);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const24$assertedPredicateArg);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_formula.$kw3$NEG, removal_modules_asserted_formula.$const24$assertedPredicateArg);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw25$REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE, (SubLObject)removal_modules_asserted_formula.$list26);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw28$REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK, (SubLObject)removal_modules_asserted_formula.$list29);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw30$REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK, (SubLObject)removal_modules_asserted_formula.$list31);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw32$REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR, (SubLObject)removal_modules_asserted_formula.$list33);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw34$REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR, (SubLObject)removal_modules_asserted_formula.$list35);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw37$REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED, (SubLObject)removal_modules_asserted_formula.$list38);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const39$termFormulas);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_asserted_formula.$kw40$POS, removal_modules_asserted_formula.$const39$termFormulas, (SubLObject)removal_modules_asserted_formula.TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_formula.$kw3$NEG, removal_modules_asserted_formula.$const39$termFormulas);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_asserted_formula.$sym41$_TERM_FORMULAS_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_asserted_formula.$sym41$_TERM_FORMULAS_DEFINING_MT_, removal_modules_asserted_formula.$const39$termFormulas);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw46$REMOVAL_TERM_FORMULAS_CHECK_POS, (SubLObject)removal_modules_asserted_formula.$list47);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw48$REMOVAL_TERM_FORMULAS_CHECK_NEG, (SubLObject)removal_modules_asserted_formula.$list49);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw50$REMOVAL_TERM_FORMULAS_UNIFY, (SubLObject)removal_modules_asserted_formula.$list51);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const52$assertedTermSentences);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_asserted_formula.$kw40$POS, removal_modules_asserted_formula.$const52$assertedTermSentences);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_formula.$kw3$NEG, removal_modules_asserted_formula.$const52$assertedTermSentences);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw53$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS, (SubLObject)removal_modules_asserted_formula.$list54);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw55$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG, (SubLObject)removal_modules_asserted_formula.$list56);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw57$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE, (SubLObject)removal_modules_asserted_formula.$list58);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw59$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY, (SubLObject)removal_modules_asserted_formula.$list60);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw61$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY, (SubLObject)removal_modules_asserted_formula.$list62);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw63$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE, (SubLObject)removal_modules_asserted_formula.$list64);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const65$assertedTermSetSentences);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_asserted_formula.$kw40$POS, removal_modules_asserted_formula.$const65$assertedTermSetSentences, (SubLObject)removal_modules_asserted_formula.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_formula.$kw3$NEG, removal_modules_asserted_formula.$const65$assertedTermSetSentences);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw66$REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE, (SubLObject)removal_modules_asserted_formula.$list67);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw68$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS, (SubLObject)removal_modules_asserted_formula.$list69);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw70$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG, (SubLObject)removal_modules_asserted_formula.$list71);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const72$nearestAssertionSupportingSentenc);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_asserted_formula.$kw40$POS, removal_modules_asserted_formula.$const72$nearestAssertionSupportingSentenc, (SubLObject)removal_modules_asserted_formula.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw73$REMOVAL_NEAREST_ASSERTION_SUPPORTING_SENTENCE, (SubLObject)removal_modules_asserted_formula.$list74);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_formula.$const76$termAppearsInAssertion);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_asserted_formula.$kw40$POS, removal_modules_asserted_formula.$const76$termAppearsInAssertion);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_formula.$kw77$REMOVAL_TERMAPPEARSINASSERTION, (SubLObject)removal_modules_asserted_formula.$list78);
        memoization_state.note_memoized_function((SubLObject)removal_modules_asserted_formula.$sym79$REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER);
        return (SubLObject)removal_modules_asserted_formula.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_asserted_formula_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_asserted_formula_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_asserted_formula_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_asserted_formula();
        removal_modules_asserted_formula.$term_formulas_defining_mt$ = null;
        $const0$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $kw1$ASSERTED_SENTENCE_VARIABLE = SubLObjectFactory.makeKeyword("ASSERTED-SENTENCE-VARIABLE");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1"));
        $kw3$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym4$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $kw5$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw6$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw7$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw8$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $kw9$REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedSentence (#$genls #$Predicate ?WHAT))\n    (#$assertedSentence (#$genls #$Predicate #$TruthFunction))") });
        $kw11$REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-FORT-ARG-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-FORT-ARG-P")))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-EL-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedSentence (?PRED #$Predicate ?WHAT))") });
        $kw13$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw14$REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedSentence (#$genls #$Predicate #$Thing)))") });
        $const16$exactlyAssertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1"));
        $kw18$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-EL-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (#$genls #$Predicate ?WHAT))\n    (#$exactlyAssertedSentence (#$genls #$Predicate #$TruthFunction))") });
        $kw20$REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-FORT-ARG-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-FORT-ARG-P")))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-EL-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (?PRED #$Predicate ?WHAT))") });
        $kw22$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG = SubLObjectFactory.makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$exactlyAssertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$exactlyAssertedSentence (#$genls #$Predicate #$Thing)))") });
        $const24$assertedPredicateArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg"));
        $kw25$REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-PRUNE");
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_asserted_formula.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("prune these cases :\n    (#$assertedPredicateArg <non-fort>  <whatever>   <whatever>)\n    (#$assertedPredicateArg <whatever> <non-integer> <whatever>)\n    (#$assertedPredicateArg <whatever>  <whatever>   <non-fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg (#$YearFn 2002) 1 #$isa)\n    (#$assertedPredicateArg #$Predicate (#$PlusFn 1 1) #$genls)\n    (#$assertedPredicateArg #$Predicate 1 \"genls\")\n   ") });
        $kw27$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw28$REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg #$Predicate 1 #$genls)") });
        $kw30$REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedPredicateArg <fort> <integer> <fort>))\n     using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedPredicateArg #$and 1 #$arity))") });
        $kw32$REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR");
        $list33 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <fort> <integer> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg #$Predicate 1 ?WHAT)") });
        $kw34$REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR");
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <fort> <non-integer> <whatever>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg #$Predicate ?ARG ?PRED)") });
        $kw36$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw37$REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <non-fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg ?X 1 #$expansion)") });
        $const39$termFormulas = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas"));
        $kw40$POS = SubLObjectFactory.makeKeyword("POS");
        $sym41$_TERM_FORMULAS_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*TERM-FORMULAS-DEFINING-MT*");
        $const42$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw43$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $sym44$CYCL_FORMULA_P = SubLObjectFactory.makeSymbol("CYCL-FORMULA-P");
        $sym45$HL_TERM_P = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $kw46$REMOVAL_TERM_FORMULAS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-POS");
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-POS"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termFormulas <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termFormulas #$Predicate (#$genls #$Predicate #$TruthFunction))") });
        $kw48$REMOVAL_TERM_FORMULAS_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-NEG");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-NEG"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$termFormulas <fully-bound> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$termFormulas #$Predicate (#$genls #$Quantifier #$TruthFunction)))") });
        $kw50$REMOVAL_TERM_FORMULAS_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-TERM-FORMULAS-UNIFY");
        $list51 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termFormulas")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termFormulas <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termFormulas ?TERM (#$genls #$Predicate #$TruthFunction))") });
        $const52$assertedTermSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences"));
        $kw53$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate #$TruthFunction)))") });
        $kw55$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG");
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedTermSentences #$Quantifier (#$genls #$Predicate #$TruthFunction)))\n    (#$not (#$assertedTermSentences #$Predicate  (#$genls #$TruthFunction #$Predicate)))\n    ") });
        $kw57$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE");
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <not fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences ?TERM (#$genls #$Predicate #$TruthFunction)))") });
        $kw59$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY");
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fort> (<predicate> . <not fully-bound>))\n    using only the KB GAF indexing and explicit assertions involving <predicate> and <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate ?GENL)))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC ?GENL))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC #$TruthFunction))\n    ") });
        $kw61$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY");
        $list62 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-FORT-ARG-P")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fort> (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving the two FORTs"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate (?PRED #$Predicate ?TERM))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$Collection))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$TruthFunction))\n    ") });
        $kw63$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE");
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fort> <variable>)\n    using only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate ?SENTENCE))") });
        $const65$assertedTermSetSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences"));
        $kw66$REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE");
        $list67 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSetSentences <fully-bound> <variable>)\n    using the overlap indexing and explicit assertions involving the terms in <fully-bound>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) ?SENTENCE))") });
        $kw68$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS");
        $list69 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSetSentences <fully-bound> ([predicate] . [fully-bound]))\n    using only the KB GAF indexing and explicit assertions involving the terms in <fully-bound>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) (#$genls #$Dog #$Mammal))") });
        $kw70$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG");
        $list71 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedTermSetSentences <fully-bound> ([predicate] . [fully-bound])))\n    using only the overlap indexing and explicit assertions involving the terms in <fully-bound>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedTermSetSentences (#$TheSet #$Predicate) (#$isa #$Collection #$Thing)))\n    (#$not (#$assertedTermSetSentences (#$TheSet #$Predicate #$arity) (#$arity #$Predicate 2))) ") });
        $const72$nearestAssertionSupportingSentenc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestAssertionSupportingSentence"));
        $kw73$REMOVAL_NEAREST_ASSERTION_SUPPORTING_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ASSERTION-SUPPORTING-SENTENCE");
        $list74 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestAssertionSupportingSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestAssertionSupportingSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_asserted_formula.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ASSERTION-SUPPORTING-SENTENCE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestAssertionSupportingSentence MT SENTENCE ASSERTION)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $sym75$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $const76$termAppearsInAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termAppearsInAssertion"));
        $kw77$REMOVAL_TERMAPPEARSINASSERTION = SubLObjectFactory.makeKeyword("REMOVAL-TERMAPPEARSINASSERTION");
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termAppearsInAssertion")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termAppearsInAssertion")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termAppearsInAssertion")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TERMAPPEARSINASSERTION-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERMAPPEARSINASSERTION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termAppearsInAssertion TERM ASSERTION)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termAppearsInAssertion #$Dog ?ASSERTION)") });
        $sym79$REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER = SubLObjectFactory.makeSymbol("REMOVAL-TERMAPPEARSINASSERTION-ASSERTION-TERMS-HELPER");
        $sym80$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym81$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const82$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
    }
    
    public static final class $removal_asserted_sentence_lookup_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $removal_asserted_sentence_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_asserted_formula.removal_asserted_sentence_lookup_pos_cost(arg1, (SubLObject)$removal_asserted_sentence_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_asserted_sentence_lookup_pos_cost$BinaryFunction extends BinaryFunction
    {
        public $removal_asserted_sentence_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_asserted_formula.removal_asserted_sentence_lookup_pos_cost(arg1, arg2);
        }
    }
    
    public static final class $removal_asserted_sentence_lookup_iterator$UnaryFunction extends UnaryFunction
    {
        public $removal_asserted_sentence_lookup_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_asserted_formula.removal_asserted_sentence_lookup_iterator(arg1);
        }
    }
}

/*

	Total time: 4354 ms
	
*/