package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sort_variants;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rule_cascade extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rule_cascade";
    public static final String myFingerPrint = "324e66cf9f465ddafc373a1404059dac34b10b65081f2ffc7aab2b8a270a329f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 1147L)
    private static SubLSymbol $default_first_implied_dependent_of_sentence_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2082L)
    private static SubLSymbol $debug_first_implied_dependent_of_sentenceP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2155L)
    private static SubLSymbol $cascade_rule_ordering_rule_pairs_for_sort$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2227L)
    private static SubLSymbol $cascade_rule_parent_rules_for_sort$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2291L)
    private static SubLSymbol $cascade_rule_terminal_rules_for_sort$;
    private static final SubLObject $const0$firstImpliedDependentOfSentence;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_FIRST_IMPLIED_DEPENDENT_OF_SENTENCE_CHECK;
    private static final SubLList $list3;
    private static final SubLString $str4$first_implied_dependent_of_senten;
    private static final SubLSymbol $sym5$QUEUE_P;
    private static final SubLSymbol $kw6$OPAQUE;
    private static final SubLString $str7$first_implied_dependent_of_senten;
    private static final SubLObject $const8$parentNodeOfCascade;
    private static final SubLSymbol $kw9$GAF;
    private static final SubLObject $const10$terminalNodeOfCascade;
    private static final SubLObject $const11$successorRulesInCascade;
    private static final SubLSymbol $sym12$CASCADE_RULE__;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2357L)
    public static SubLObject removal_first_implied_dependent_of_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rule_cascade.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rule_cascade.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
        final SubLObject rule_cascade = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
        final SubLObject rules = sorted_rules_in_cascade(rule_cascade);
        final SubLObject asent_mt = arguments.support_mt(forward.current_forward_inference_gaf());
        if (removal_modules_rule_cascade.NIL != removal_modules_rule_cascade.$debug_first_implied_dependent_of_sentenceP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)removal_modules_rule_cascade.T, (SubLObject)removal_modules_rule_cascade.$str4$first_implied_dependent_of_senten, Sequences.length(rules), rule_cascade, asent, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
        }
        SubLObject result_bindings = (SubLObject)removal_modules_rule_cascade.NIL;
        SubLObject result_mt = (SubLObject)removal_modules_rule_cascade.NIL;
        SubLObject deduction_spec_supports = (SubLObject)removal_modules_rule_cascade.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind((SubLObject)removal_modules_rule_cascade.T, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)removal_modules_rule_cascade.NIL, thread);
            control_vars.$prefer_forward_skolemization$.bind((SubLObject)removal_modules_rule_cascade.NIL, thread);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert removal_modules_rule_cascade.NIL != queues.queue_p(environment) : environment;
            final SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                utilities_macros.$current_forward_problem_store$.bind((SubLObject)removal_modules_rule_cascade.NIL, thread);
                try {
                    if (removal_modules_rule_cascade.NIL == result_bindings) {
                        SubLObject csome_list_var = rules;
                        SubLObject rule = (SubLObject)removal_modules_rule_cascade.NIL;
                        rule = csome_list_var.first();
                        while (removal_modules_rule_cascade.NIL == result_bindings && removal_modules_rule_cascade.NIL != csome_list_var) {
                            final SubLObject assertibles_queue = forward.forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(arguments.make_hl_support((SubLObject)removal_modules_rule_cascade.$kw6$OPAQUE, sentence, asent_mt, (SubLObject)removal_modules_rule_cascade.UNPROVIDED), rule);
                            SubLObject rest;
                            SubLObject hl_assertible_var;
                            SubLObject assertible;
                            SubLObject argument_spec;
                            SubLObject hl_assertion_spec_var_$3;
                            SubLObject hl_assertion_spec_var;
                            SubLObject cnf;
                            SubLObject mt;
                            SubLObject direction;
                            SubLObject variable_map;
                            SubLObject possible_result_bindings;
                            SubLObject deduction_spec;
                            SubLObject deduction_spec_bindings;
                            for (rest = (SubLObject)removal_modules_rule_cascade.NIL, rest = queues.do_queue_elements_queue_elements(assertibles_queue); removal_modules_rule_cascade.NIL == result_bindings && removal_modules_rule_cascade.NIL != rest; rest = rest.rest()) {
                                assertible = (hl_assertible_var = rest.first());
                                argument_spec = hl_storage_modules.hl_assertible_argument_spec(hl_assertible_var);
                                hl_assertion_spec_var = (hl_assertion_spec_var_$3 = hl_storage_modules.hl_assertible_hl_assertion_spec(hl_assertible_var));
                                cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$3);
                                mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$3);
                                direction = hl_storage_modules.hl_assertion_spec_direction(hl_assertion_spec_var_$3);
                                variable_map = hl_storage_modules.hl_assertion_spec_variable_map(hl_assertion_spec_var_$3);
                                possible_result_bindings = unification_utilities.term_unify(arg2, uncanonicalizer.cnf_el_formula(cnf, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
                                if (removal_modules_rule_cascade.NIL != possible_result_bindings) {
                                    result_bindings = possible_result_bindings;
                                    deduction_spec = (SubLObject)((removal_modules_rule_cascade.NIL != deductions_high.deduction_spec_p(argument_spec)) ? argument_spec : removal_modules_rule_cascade.NIL);
                                    deduction_spec_bindings = (SubLObject)((removal_modules_rule_cascade.NIL != deductions_high.deduction_spec_p(deduction_spec)) ? deductions_high.deduction_spec_bindings(deduction_spec) : removal_modules_rule_cascade.NIL);
                                    result_mt = mt;
                                    deduction_spec_supports = (SubLObject)((removal_modules_rule_cascade.NIL != deductions_high.deduction_spec_p(deduction_spec)) ? deductions_high.deduction_spec_supports(deduction_spec) : removal_modules_rule_cascade.NIL);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            rule = csome_list_var.first();
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rule_cascade.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        forward.clear_current_forward_problem_store();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$2, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_3, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_2, thread);
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_rule_cascade.NIL != result_bindings) {
            final SubLObject result_asent = bindings.apply_bindings(result_bindings, arg2);
            if (removal_modules_rule_cascade.NIL != removal_modules_rule_cascade.$debug_first_implied_dependent_of_sentenceP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)removal_modules_rule_cascade.T, (SubLObject)removal_modules_rule_cascade.$str7$first_implied_dependent_of_senten, result_asent, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
            }
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rule_cascade.$kw6$OPAQUE, el_utilities.make_ternary_formula(removal_modules_rule_cascade.$const0$firstImpliedDependentOfSentence, sentence, result_asent, rule_cascade), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED), result_bindings, deduction_spec_supports);
        }
        return (SubLObject)removal_modules_rule_cascade.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 4731L)
    public static SubLObject sorted_rules_in_cascade(final SubLObject rule_cascade) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = (SubLObject)removal_modules_rule_cascade.NIL;
        final SubLObject _prev_bind_0 = removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.currentBinding(thread);
        try {
            removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.bind((SubLObject)removal_modules_rule_cascade.NIL, thread);
            removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.bind((SubLObject)removal_modules_rule_cascade.NIL, thread);
            removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.bind((SubLObject)removal_modules_rule_cascade.NIL, thread);
            SubLObject pred_var = removal_modules_rule_cascade.$const8$parentNodeOfCascade;
            if (removal_modules_rule_cascade.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cascade, (SubLObject)removal_modules_rule_cascade.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cascade, (SubLObject)removal_modules_rule_cascade.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_rule_cascade.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_rule_cascade.NIL;
                while (removal_modules_rule_cascade.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_rule_cascade.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_rule_cascade.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_rule_cascade.$kw9$GAF, (SubLObject)removal_modules_rule_cascade.NIL, (SubLObject)removal_modules_rule_cascade.NIL);
                            SubLObject done_var_$5 = (SubLObject)removal_modules_rule_cascade.NIL;
                            final SubLObject token_var_$6 = (SubLObject)removal_modules_rule_cascade.NIL;
                            while (removal_modules_rule_cascade.NIL == done_var_$5) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(gaf));
                                if (removal_modules_rule_cascade.NIL != valid_$7) {
                                    SubLObject item_var = assertions_high.gaf_arg1(gaf);
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        rules = (SubLObject)ConsesLow.cons(item_var, rules);
                                    }
                                    item_var = assertions_high.gaf_arg1(gaf);
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread)), thread);
                                    }
                                }
                                done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rule_cascade.NIL == valid_$7);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rule_cascade.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_rule_cascade.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rule_cascade.NIL == valid);
                }
            }
            pred_var = removal_modules_rule_cascade.$const10$terminalNodeOfCascade;
            if (removal_modules_rule_cascade.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cascade, (SubLObject)removal_modules_rule_cascade.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cascade, (SubLObject)removal_modules_rule_cascade.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_rule_cascade.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_rule_cascade.NIL;
                while (removal_modules_rule_cascade.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_rule_cascade.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_rule_cascade.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_rule_cascade.$kw9$GAF, (SubLObject)removal_modules_rule_cascade.NIL, (SubLObject)removal_modules_rule_cascade.NIL);
                            SubLObject done_var_$6 = (SubLObject)removal_modules_rule_cascade.NIL;
                            final SubLObject token_var_$7 = (SubLObject)removal_modules_rule_cascade.NIL;
                            while (removal_modules_rule_cascade.NIL == done_var_$6) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(gaf));
                                if (removal_modules_rule_cascade.NIL != valid_$8) {
                                    SubLObject item_var = assertions_high.gaf_arg1(gaf);
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        rules = (SubLObject)ConsesLow.cons(item_var, rules);
                                    }
                                    item_var = assertions_high.gaf_arg1(gaf);
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread)), thread);
                                    }
                                }
                                done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rule_cascade.NIL == valid_$8);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rule_cascade.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (removal_modules_rule_cascade.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rule_cascade.NIL == valid);
                }
            }
            pred_var = removal_modules_rule_cascade.$const11$successorRulesInCascade;
            if (removal_modules_rule_cascade.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cascade, (SubLObject)removal_modules_rule_cascade.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cascade, (SubLObject)removal_modules_rule_cascade.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_rule_cascade.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_rule_cascade.NIL;
                while (removal_modules_rule_cascade.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_rule_cascade.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_rule_cascade.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_rule_cascade.$kw9$GAF, (SubLObject)removal_modules_rule_cascade.NIL, (SubLObject)removal_modules_rule_cascade.NIL);
                            SubLObject done_var_$7 = (SubLObject)removal_modules_rule_cascade.NIL;
                            final SubLObject token_var_$8 = (SubLObject)removal_modules_rule_cascade.NIL;
                            while (removal_modules_rule_cascade.NIL == done_var_$7) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(gaf));
                                if (removal_modules_rule_cascade.NIL != valid_$9) {
                                    SubLObject item_var = assertions_high.gaf_arg2(gaf);
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        rules = (SubLObject)ConsesLow.cons(item_var, rules);
                                    }
                                    item_var = assertions_high.gaf_arg3(gaf);
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        rules = (SubLObject)ConsesLow.cons(item_var, rules);
                                    }
                                    item_var = (SubLObject)ConsesLow.list(assertions_high.gaf_arg2(gaf), assertions_high.gaf_arg3(gaf));
                                    if (removal_modules_rule_cascade.NIL == conses_high.member(item_var, removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQL), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.IDENTITY))) {
                                        removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread)), thread);
                                    }
                                }
                                done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rule_cascade.NIL == valid_$9);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rule_cascade.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                if (removal_modules_rule_cascade.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rule_cascade.NIL == valid);
                }
            }
            rules = sort_variants.merge_sort_list(rules, (SubLObject)removal_modules_rule_cascade.$sym12$CASCADE_RULE__, (SubLObject)removal_modules_rule_cascade.UNPROVIDED);
        }
        finally {
            removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.rebind(_prev_bind_3, thread);
            removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.rebind(_prev_bind_2, thread);
            removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.rebind(_prev_bind_0, thread);
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 5681L)
    public static SubLObject cascade_rule_L(final SubLObject rule1, final SubLObject rule2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_rule_cascade.NIL != subl_promotions.memberP((SubLObject)ConsesLow.list(rule1, rule2), removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQUAL), (SubLObject)removal_modules_rule_cascade.UNPROVIDED)) {
            return (SubLObject)removal_modules_rule_cascade.T;
        }
        if (removal_modules_rule_cascade.NIL != subl_promotions.memberP((SubLObject)ConsesLow.list(rule2, rule1), removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)removal_modules_rule_cascade.EQUAL), (SubLObject)removal_modules_rule_cascade.UNPROVIDED)) {
            return (SubLObject)removal_modules_rule_cascade.NIL;
        }
        if (removal_modules_rule_cascade.NIL != subl_promotions.memberP(rule1, removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED) && removal_modules_rule_cascade.NIL == subl_promotions.memberP(rule2, removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED)) {
            return (SubLObject)removal_modules_rule_cascade.T;
        }
        if (removal_modules_rule_cascade.NIL != subl_promotions.memberP(rule2, removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED) && removal_modules_rule_cascade.NIL == subl_promotions.memberP(rule1, removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED)) {
            return (SubLObject)removal_modules_rule_cascade.NIL;
        }
        if (removal_modules_rule_cascade.NIL != subl_promotions.memberP(rule1, removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED) && removal_modules_rule_cascade.NIL == subl_promotions.memberP(rule2, removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED)) {
            return (SubLObject)removal_modules_rule_cascade.NIL;
        }
        if (removal_modules_rule_cascade.NIL != subl_promotions.memberP(rule2, removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED) && removal_modules_rule_cascade.NIL == subl_promotions.memberP(rule1, removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), (SubLObject)removal_modules_rule_cascade.UNPROVIDED, (SubLObject)removal_modules_rule_cascade.UNPROVIDED)) {
            return (SubLObject)removal_modules_rule_cascade.T;
        }
        return (SubLObject)removal_modules_rule_cascade.NIL;
    }
    
    public static SubLObject declare_removal_modules_rule_cascade_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rule_cascade", "removal_first_implied_dependent_of_sentence_check_expand", "REMOVAL-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rule_cascade", "sorted_rules_in_cascade", "SORTED-RULES-IN-CASCADE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rule_cascade", "cascade_rule_L", "CASCADE-RULE-<", 2, 0, false);
        return (SubLObject)removal_modules_rule_cascade.NIL;
    }
    
    public static SubLObject init_removal_modules_rule_cascade_file() {
        removal_modules_rule_cascade.$default_first_implied_dependent_of_sentence_check_cost$ = SubLFiles.defparameter("*DEFAULT-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        removal_modules_rule_cascade.$debug_first_implied_dependent_of_sentenceP$ = SubLFiles.defparameter("*DEBUG-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE?*", (SubLObject)removal_modules_rule_cascade.NIL);
        removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$ = SubLFiles.defparameter("*CASCADE-RULE-ORDERING-RULE-PAIRS-FOR-SORT*", (SubLObject)removal_modules_rule_cascade.NIL);
        removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$ = SubLFiles.defparameter("*CASCADE-RULE-PARENT-RULES-FOR-SORT*", (SubLObject)removal_modules_rule_cascade.NIL);
        removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$ = SubLFiles.defparameter("*CASCADE-RULE-TERMINAL-RULES-FOR-SORT*", (SubLObject)removal_modules_rule_cascade.NIL);
        return (SubLObject)removal_modules_rule_cascade.NIL;
    }
    
    public static SubLObject setup_removal_modules_rule_cascade_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rule_cascade.$const0$firstImpliedDependentOfSentence);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_rule_cascade.$kw1$POS, removal_modules_rule_cascade.$const0$firstImpliedDependentOfSentence, (SubLObject)removal_modules_rule_cascade.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_rule_cascade.$kw1$POS, removal_modules_rule_cascade.$const0$firstImpliedDependentOfSentence, (SubLObject)removal_modules_rule_cascade.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rule_cascade.$kw2$REMOVAL_FIRST_IMPLIED_DEPENDENT_OF_SENTENCE_CHECK, (SubLObject)removal_modules_rule_cascade.$list3);
        return (SubLObject)removal_modules_rule_cascade.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_rule_cascade_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_rule_cascade_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_rule_cascade_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_rule_cascade();
        removal_modules_rule_cascade.$default_first_implied_dependent_of_sentence_check_cost$ = null;
        removal_modules_rule_cascade.$debug_first_implied_dependent_of_sentenceP$ = null;
        removal_modules_rule_cascade.$cascade_rule_ordering_rule_pairs_for_sort$ = null;
        removal_modules_rule_cascade.$cascade_rule_parent_rules_for_sort$ = null;
        removal_modules_rule_cascade.$cascade_rule_terminal_rules_for_sort$ = null;
        $const0$firstImpliedDependentOfSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstImpliedDependentOfSentence"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_FIRST_IMPLIED_DEPENDENT_OF_SENTENCE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstImpliedDependentOfSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstImpliedDependentOfSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$firstImpliedDependentOfSentence <fully-bound> <anything> <fully-bound>) by internally triggering the supplied rules, in order, using the fully bound sentence and returning a fully bound consequent setnence and stopping after the first success."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$firstImpliedDependentOfSentence (#$stepObject (#$TheList 5 4 3 2 1)) ?RESULT #$ListSortingDemoRuleCascade)") });
        $str4$first_implied_dependent_of_senten = SubLObjectFactory.makeString("first-implied-dependent-of-sentence has ~A rules in cascade ~S for ~S~%");
        $sym5$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $kw6$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $str7$first_implied_dependent_of_senten = SubLObjectFactory.makeString("first-implied-dependent-of-sentence returning ~S~%");
        $const8$parentNodeOfCascade = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parentNodeOfCascade"));
        $kw9$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const10$terminalNodeOfCascade = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("terminalNodeOfCascade"));
        $const11$successorRulesInCascade = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("successorRulesInCascade"));
        $sym12$CASCADE_RULE__ = SubLObjectFactory.makeSymbol("CASCADE-RULE-<");
    }
}

/*

	Total time: 251 ms
	
*/