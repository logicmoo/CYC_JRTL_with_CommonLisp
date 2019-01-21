package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_termofunit extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit";
    public static final String myFingerPrint = "76db5996ec780c682d0895a71fe1a86e4129442138a6e3b89e8056b7e07bc38b";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 4348L)
    private static SubLSymbol $default_skolemize_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 8115L)
    private static SubLSymbol $default_nat_unify_cost$;
    private static final SubLObject $const0$termOfUnit;
    private static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
    private static final SubLSymbol $kw3$NAT_LOOKUP_POS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$DISALLOWED;
    private static final SubLSymbol $kw6$PREFERRED;
    private static final SubLSymbol $sym7$NAT_LOOKUP_POS_PREFERENCE;
    private static final SubLSymbol $kw8$EQUALITY;
    private static final SubLSymbol $kw9$TRUE_MON;
    private static final SubLSymbol $kw10$REMOVAL_NAT_FORMULA;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$REMOVAL_TERM_OF_UNIT_FAIL;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$REMOVAL_SKOLEMIZE_CREATE;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$COMPLETE;
    private static final SubLSymbol $kw17$GROSSLY_INCOMPLETE;
    private static final SubLSymbol $kw18$NART_ARG;
    private static final SubLSymbol $kw19$GAF;
    private static final SubLSymbol $kw20$FUNCTION_EXTENT;
    private static final SubLSymbol $kw21$OVERLAP;
    private static final SubLSymbol $kw22$REMOVAL_NAT_LOOKUP;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$REMOVAL_NAT_UNIFY;
    private static final SubLList $list25;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 1090L)
    public static SubLObject nat_lookup_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_termofunit.NIL != control_vars.$prefer_forward_skolemization$.getDynamicValue(thread)) {
            return (SubLObject)removal_modules_termofunit.$kw5$DISALLOWED;
        }
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject naut_vars = cdolist_list_var = variables.gather_hl_variables(naut);
        SubLObject naut_var = (SubLObject)removal_modules_termofunit.NIL;
        naut_var = cdolist_list_var.first();
        while (removal_modules_termofunit.NIL != cdolist_list_var) {
            if (removal_modules_termofunit.NIL != subl_promotions.memberP(naut_var, bindable_vars, (SubLObject)removal_modules_termofunit.UNPROVIDED, (SubLObject)removal_modules_termofunit.UNPROVIDED)) {
                return (SubLObject)removal_modules_termofunit.$kw5$DISALLOWED;
            }
            cdolist_list_var = cdolist_list_var.rest();
            naut_var = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_termofunit.$kw6$PREFERRED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 1496L)
    public static SubLObject make_term_of_unit_support(final SubLObject nat, final SubLObject naut) {
        final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_termofunit.$const0$termOfUnit, nat, naut);
        return arguments.make_hl_support((SubLObject)removal_modules_termofunit.$kw8$EQUALITY, formula, mt_vars.$tou_mt$.getGlobalValue(), (SubLObject)removal_modules_termofunit.$kw9$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 1669L)
    public static SubLObject tou_analog_asentsP(final SubLObject asent1, final SubLObject asent2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL != el_utilities.tou_asentP(asent1) && removal_modules_termofunit.NIL != el_utilities.tou_asentP(asent2) && cycl_utilities.atomic_sentence_arg1(asent1, (SubLObject)removal_modules_termofunit.UNPROVIDED).equal(cycl_utilities.atomic_sentence_arg1(asent2, (SubLObject)removal_modules_termofunit.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 1863L)
    public static SubLObject tou_sibling_asentsP(final SubLObject asent1, final SubLObject asent2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!asent1.equal(asent2) && removal_modules_termofunit.NIL != tou_analog_asentsP(asent1, asent2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 2002L)
    public static SubLObject removal_nat_formula_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        return kb_indexing.num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED), (SubLObject)removal_modules_termofunit.ONE_INTEGER, removal_modules_termofunit.$const0$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 2240L)
    public static SubLObject removal_nat_formula_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nart);
        if (removal_modules_termofunit.NIL != assertion) {
            final SubLObject nart_hl_formula = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_termofunit.TWO_INTEGER);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, nart_hl_formula, (SubLObject)removal_modules_termofunit.T, (SubLObject)removal_modules_termofunit.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_termofunit.NIL != v_bindings) {
                backward.removal_add_node(assertion, v_bindings, unify_justification);
            }
        }
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 4159L)
    public static SubLObject removal_term_of_unit_unify_impossibleP(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        return unification.unify_impossible(arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 4474L)
    public static SubLObject removal_skolemize_create_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(naut);
        if (removal_modules_termofunit.NIL != skolemization_allowed(function)) {
            final SubLObject rewritten_naut = equals.possibly_subst_preferred_rewrite_terms(naut, (SubLObject)removal_modules_termofunit.UNPROVIDED);
            final SubLObject nart = narts_high.find_nart(rewritten_naut);
            if (removal_modules_termofunit.NIL == nart && removal_modules_termofunit.NIL != function_terms.within_term_functional_complexity_cutoffP(rewritten_naut)) {
                return (SubLObject)removal_modules_termofunit.T;
            }
        }
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 4925L)
    public static SubLObject removal_skolemize_create_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(arg1, naut, (SubLObject)removal_modules_termofunit.T, (SubLObject)removal_modules_termofunit.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_termofunit.NIL != v_bindings) {
            final SubLObject hl_support = make_term_of_unit_support(naut, naut);
            backward.removal_add_node(hl_support, v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 5862L)
    public static SubLObject skolemization_allowed(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL != removal_module_utilities.current_query_allows_new_termsP() && removal_modules_termofunit.NIL != ((removal_modules_termofunit.NIL != kb_control_vars.within_forward_inferenceP()) ? SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL != control_vars.$prefer_forward_skolemization$.getDynamicValue(thread) || removal_modules_termofunit.NIL != control_vars.$allow_forward_skolemization$.getDynamicValue(thread) || removal_modules_termofunit.NIL != czer_main.forward_inference_reifiable_functionP(function, (SubLObject)removal_modules_termofunit.UNPROVIDED)) : SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 6208L)
    public static SubLObject removal_nat_lookup_completeness(final SubLObject asent) {
        final SubLObject nart_hl_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(nart_hl_formula);
        if (removal_modules_termofunit.NIL == fort_types_interface.reifiable_function_p(function)) {
            return (SubLObject)removal_modules_termofunit.$kw16$COMPLETE;
        }
        if (removal_modules_termofunit.NIL == skolemization_allowed(function)) {
            return (SubLObject)removal_modules_termofunit.$kw16$COMPLETE;
        }
        if (removal_modules_termofunit.NIL != variables.fully_bound_p(nart_hl_formula) && removal_modules_termofunit.NIL != narts_high.find_nart(nart_hl_formula)) {
            return (SubLObject)removal_modules_termofunit.$kw16$COMPLETE;
        }
        return (SubLObject)removal_modules_termofunit.$kw17$GROSSLY_INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 6752L)
    public static SubLObject removal_nat_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        final SubLObject nart_hl_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(nart_hl_formula);
        if (removal_modules_termofunit.NIL == fort_types_interface.reifiable_function_p(function)) {
            return (SubLObject)removal_modules_termofunit.ZERO_INTEGER;
        }
        if (removal_modules_termofunit.NIL != variables.fully_bound_p(nart_hl_formula)) {
            return (SubLObject)((removal_modules_termofunit.NIL != narts_high.find_nart(nart_hl_formula)) ? removal_modules_termofunit.ONE_INTEGER : removal_modules_termofunit.ZERO_INTEGER);
        }
        return kb_indexing.num_best_nat_lookup_index(nart_hl_formula, (SubLObject)removal_modules_termofunit.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 7182L)
    public static SubLObject removal_nat_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart_hl_formula = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(nart_hl_formula);
        if (removal_modules_termofunit.NIL != fort_types_interface.reifiable_function_p(function)) {
            final SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, (SubLObject)removal_modules_termofunit.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_termofunit.$kw18$NART_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject functor = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_termofunit.NIL != argnum) {
                    if (removal_modules_termofunit.NIL != functor) {
                        if (removal_modules_termofunit.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                            SubLObject done_var = (SubLObject)removal_modules_termofunit.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_termofunit.NIL;
                            while (removal_modules_termofunit.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_termofunit.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_termofunit.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_termofunit.$kw19$GAF, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL);
                                        SubLObject done_var_$1 = (SubLObject)removal_modules_termofunit.NIL;
                                        final SubLObject token_var_$2 = (SubLObject)removal_modules_termofunit.NIL;
                                        while (removal_modules_termofunit.NIL == done_var_$1) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(ass));
                                            if (removal_modules_termofunit.NIL != valid_$3) {
                                                removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                            }
                                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid_$3);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_termofunit.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_termofunit.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid);
                            }
                        }
                    }
                    else if (removal_modules_termofunit.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, (SubLObject)removal_modules_termofunit.NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, (SubLObject)removal_modules_termofunit.NIL);
                        SubLObject done_var = (SubLObject)removal_modules_termofunit.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_termofunit.NIL;
                        while (removal_modules_termofunit.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_termofunit.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_termofunit.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_termofunit.$kw19$GAF, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL);
                                    SubLObject done_var_$2 = (SubLObject)removal_modules_termofunit.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)removal_modules_termofunit.NIL;
                                    while (removal_modules_termofunit.NIL == done_var_$2) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(ass));
                                        if (removal_modules_termofunit.NIL != valid_$4) {
                                            removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_termofunit.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_termofunit.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid);
                        }
                    }
                }
                else if (removal_modules_termofunit.NIL != functor) {
                    if (removal_modules_termofunit.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, (SubLObject)removal_modules_termofunit.NIL, functor)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_termofunit.NIL, functor);
                        SubLObject done_var = (SubLObject)removal_modules_termofunit.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_termofunit.NIL;
                        while (removal_modules_termofunit.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_termofunit.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_termofunit.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_termofunit.$kw19$GAF, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL);
                                    SubLObject done_var_$3 = (SubLObject)removal_modules_termofunit.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)removal_modules_termofunit.NIL;
                                    while (removal_modules_termofunit.NIL == done_var_$3) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(ass));
                                        if (removal_modules_termofunit.NIL != valid_$5) {
                                            removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_termofunit.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_termofunit.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid);
                        }
                    }
                }
                else if (removal_modules_termofunit.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL);
                    SubLObject done_var = (SubLObject)removal_modules_termofunit.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_termofunit.NIL;
                    while (removal_modules_termofunit.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_termofunit.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_termofunit.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_termofunit.$kw19$GAF, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL);
                                SubLObject done_var_$4 = (SubLObject)removal_modules_termofunit.NIL;
                                final SubLObject token_var_$5 = (SubLObject)removal_modules_termofunit.NIL;
                                while (removal_modules_termofunit.NIL == done_var_$4) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(ass));
                                    if (removal_modules_termofunit.NIL != valid_$6) {
                                        removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid_$6);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_termofunit.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_termofunit.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_termofunit.$kw20$FUNCTION_EXTENT)) {
                if (removal_modules_termofunit.NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                    final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_termofunit.NIL;
                    try {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_termofunit.$kw19$GAF, (SubLObject)removal_modules_termofunit.NIL, (SubLObject)removal_modules_termofunit.NIL);
                        SubLObject done_var2 = (SubLObject)removal_modules_termofunit.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_termofunit.NIL;
                        while (removal_modules_termofunit.NIL == done_var2) {
                            final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(ass2));
                            if (removal_modules_termofunit.NIL != valid2) {
                                removal_modules_lookup.removal_lookup_expand_internal(ass2, asent);
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_termofunit.NIL == valid2);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_termofunit.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            if (removal_modules_termofunit.NIL != final_index_iterator2) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                            }
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_termofunit.$kw21$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), (SubLObject)removal_modules_termofunit.UNPROVIDED);
                SubLObject ass3 = (SubLObject)removal_modules_termofunit.NIL;
                ass3 = cdolist_list_var.first();
                while (removal_modules_termofunit.NIL != cdolist_list_var) {
                    removal_modules_lookup.removal_lookup_expand_internal(ass3, asent);
                    cdolist_list_var = cdolist_list_var.rest();
                    ass3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_nli_method_error(l_index, method);
            }
        }
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 8241L)
    public static SubLObject removal_nat_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_termofunit.UNPROVIDED) {
            sense = (SubLObject)removal_modules_termofunit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_termofunit.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, (SubLObject)removal_modules_termofunit.T, (SubLObject)removal_modules_termofunit.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_termofunit.NIL != v_bindings) {
            final SubLObject subst_arg1 = bindings.subst_bindings(v_bindings, arg1);
            final SubLObject subst_arg2 = bindings.subst_bindings(v_bindings, arg2);
            final SubLObject hl_support = make_term_of_unit_support(subst_arg1, subst_arg2);
            backward.removal_add_node(hl_support, v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    public static SubLObject declare_removal_modules_termofunit_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "nat_lookup_pos_preference", "NAT-LOOKUP-POS-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "make_term_of_unit_support", "MAKE-TERM-OF-UNIT-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "tou_analog_asentsP", "TOU-ANALOG-ASENTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "tou_sibling_asentsP", "TOU-SIBLING-ASENTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_nat_formula_cost", "REMOVAL-NAT-FORMULA-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_nat_formula_expand", "REMOVAL-NAT-FORMULA-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_term_of_unit_unify_impossibleP", "REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?", 1, 0, false);
        new $removal_term_of_unit_unify_impossibleP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_skolemize_create_required", "REMOVAL-SKOLEMIZE-CREATE-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_skolemize_create_expand", "REMOVAL-SKOLEMIZE-CREATE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "skolemization_allowed", "SKOLEMIZATION-ALLOWED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_nat_lookup_completeness", "REMOVAL-NAT-LOOKUP-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_nat_lookup_cost", "REMOVAL-NAT-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_nat_lookup_expand", "REMOVAL-NAT-LOOKUP-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit", "removal_nat_unify_expand", "REMOVAL-NAT-UNIFY-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    public static SubLObject init_removal_modules_termofunit_file() {
        removal_modules_termofunit.$default_skolemize_cost$ = SubLFiles.defparameter("*DEFAULT-SKOLEMIZE-COST*", (SubLObject)removal_modules_termofunit.ONE_INTEGER);
        removal_modules_termofunit.$default_nat_unify_cost$ = SubLFiles.defparameter("*DEFAULT-NAT-UNIFY-COST*", (SubLObject)removal_modules_termofunit.ONE_INTEGER);
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    public static SubLObject setup_removal_modules_termofunit_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_termofunit.$const0$termOfUnit);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_termofunit.$const0$termOfUnit, (SubLObject)removal_modules_termofunit.$kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_termofunit.$const0$termOfUnit, (SubLObject)removal_modules_termofunit.$kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        preference_modules.inference_preference_module((SubLObject)removal_modules_termofunit.$kw3$NAT_LOOKUP_POS, (SubLObject)removal_modules_termofunit.$list4);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_termofunit.$sym7$NAT_LOOKUP_POS_PREFERENCE);
        inference_modules.inference_removal_module((SubLObject)removal_modules_termofunit.$kw10$REMOVAL_NAT_FORMULA, (SubLObject)removal_modules_termofunit.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_termofunit.$kw12$REMOVAL_TERM_OF_UNIT_FAIL, (SubLObject)removal_modules_termofunit.$list13);
        inference_modules.inference_removal_module((SubLObject)removal_modules_termofunit.$kw14$REMOVAL_SKOLEMIZE_CREATE, (SubLObject)removal_modules_termofunit.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_termofunit.$kw22$REMOVAL_NAT_LOOKUP, (SubLObject)removal_modules_termofunit.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_termofunit.$kw24$REMOVAL_NAT_UNIFY, (SubLObject)removal_modules_termofunit.$list25);
        return (SubLObject)removal_modules_termofunit.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_termofunit_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_termofunit_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_termofunit_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_termofunit();
        removal_modules_termofunit.$default_skolemize_cost$ = null;
        removal_modules_termofunit.$default_nat_unify_cost$ = null;
        $const0$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $kw3$NAT_LOOKUP_POS = SubLObjectFactory.makeKeyword("NAT-LOOKUP-POS");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SKOLEMIZATION-ALLOWED"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-LOOKUP-POS-PREFERENCE"));
        $kw5$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $kw6$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym7$NAT_LOOKUP_POS_PREFERENCE = SubLObjectFactory.makeSymbol("NAT-LOOKUP-POS-PREFERENCE");
        $kw8$EQUALITY = SubLObjectFactory.makeKeyword("EQUALITY");
        $kw9$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw10$REMOVAL_NAT_FORMULA = SubLObjectFactory.makeKeyword("REMOVAL-NAT-FORMULA");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FORMULA-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-FORMULA-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termOfUnit <reified NAT> <whatever>)\n    using the GAF indexing on <reified NAT>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))") });
        $kw12$REMOVAL_TERM_OF_UNIT_FAIL = SubLObjectFactory.makeKeyword("REMOVAL-TERM-OF-UNIT-FAIL");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ABDUCTION-ALLOWED?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ATOM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("NART")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_termofunit.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termOfUnit <atom> <whatever>)\n    in all cases where <atom> is not a reified NAT or variable, should immediately fail.\n\n    (#$termOfUnit <arg1> <arg2>)\n    in all cases where ARG1 and ARG2 could not possibly unify, should immediately fail."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termOfUnit #$Dog (#$JuvenileFn ?WHAT))\n    (#$termOfUnit 1 ?WHAT)\n    (#$termOfUnit (#$IdentityFn #$Dog) (#$JuvenileFn ?WHAT))") });
        $kw14$REMOVAL_SKOLEMIZE_CREATE = SubLObjectFactory.makeKeyword("REMOVAL-SKOLEMIZE-CREATE");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-SKOLEMIZE-CREATE-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SKOLEMIZE-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SKOLEMIZE-CREATE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termOfUnit <variable> (<fort> . <fully bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termOfUnit ?NAT (#$JuvenileFn #$Cougar))") });
        $kw16$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw17$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $kw18$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
        $kw19$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw20$FUNCTION_EXTENT = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $kw21$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $kw22$REMOVAL_NAT_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-NAT-LOOKUP");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NAT-LOOKUP-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termOfUnit <not fully-bound> (<fort> . <whatever>)) \n    using the function-argument indexing on <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termOfUnit ?NAT (#$JuvenileFn ?COL))") });
        $kw24$REMOVAL_NAT_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-NAT-UNIFY");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NAT-UNIFY-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termOfUnit (<fully bound> . <fully bound>) (<whatever . <whatever>))\n    via unification"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))") });
    }
    
    public static final class $removal_term_of_unit_unify_impossibleP$UnaryFunction extends UnaryFunction
    {
        public $removal_term_of_unit_unify_impossibleP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_termofunit.removal_term_of_unit_unify_impossibleP(arg1);
        }
    }
}

/*

	Total time: 227 ms
	
*/