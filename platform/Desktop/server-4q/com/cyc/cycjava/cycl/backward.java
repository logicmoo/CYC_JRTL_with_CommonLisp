package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class backward extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.backward";
    public static final String myFingerPrint = "7b3a06f44100f1e63f4d2d6fef6e95dbc8ccb36e4820f4b4f6d23749c8c1fbdd";
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 712L)
    public static SubLSymbol $removal_add_node_method$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 913L)
    public static SubLSymbol $transformation_add_node_method$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 1064L)
    public static SubLSymbol $transformation_early_removal_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 1558L)
    private static SubLSymbol $inference_expand_new_children$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 1905L)
    public static SubLSymbol $inference_expand_hl_module$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 2250L)
    public static SubLSymbol $inference_expand_sense$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 9753L)
    public static SubLSymbol $force_query_supports_in_forward_inferenceP$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 9959L)
    public static SubLSymbol $force_forward_mt_combos_computation_in_forward_inferenceP$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 10202L)
    public static SubLSymbol $debug_removal_add_node_helper_modify_supportsP$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 13056L)
    private static SubLSymbol $removal_ask_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 19613L)
    private static SubLSymbol $removal_ask_answers$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 19784L)
    private static SubLSymbol $removal_ask_max_number$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 19845L)
    private static SubLSymbol $removal_ask_disallows_indeterminate_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 19927L)
    private static SubLSymbol $removal_ask_first_answer_elapsed_internal_real_time$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 20017L)
    private static SubLSymbol $removal_ask_last_answer_elapsed_internal_real_time$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 20106L)
    private static SubLSymbol $removal_ask_start_internal_real_time$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 28832L)
    public static SubLSymbol $transformation_semantic_pruning_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 29481L)
    private static SubLSymbol $forward_inference_pruning_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 33322L)
    private static SubLSymbol $forward_asserted_sentence_pruning_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 35668L)
    private static SubLSymbol $preds_with_assumed_extent$;
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 41163L)
    private static SubLSymbol $literal_set_sense_table$;
    private static final SubLString $str0$The_legacy_harness_is_no_longer_s;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE;
    private static final SubLSymbol $sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS;
    private static final SubLSymbol $sym4$REMOVAL_ASK_ADD_NODE;
    private static final SubLSymbol $sym5$SUPPORT_P;
    private static final SubLString $str6$Removing_invalid_support__S_from_;
    private static final SubLSymbol $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_;
    private static final SubLObject $const8$rewriteOf;
    private static final SubLSymbol $kw9$EQUALITY;
    private static final SubLSymbol $sym10$HAS_PREFERRED_REWRITE_TERM_;
    private static final SubLSymbol $sym11$PREFERRED_REWRITE_TERM;
    private static final SubLObject $const12$Now;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$OPAQUE;
    private static final SubLObject $const15$indexicalReferent;
    private static final SubLObject $const16$BaseKB;
    private static final SubLSymbol $sym17$ASSERTION_P;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$QUERY;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$REMOVAL_ASK;
    private static final SubLSymbol $kw23$TRUE;
    private static final SubLSymbol $sym24$CYCL_ATOMIC_SENTENCE_P;
    private static final SubLSymbol $sym25$PROPERTY_LIST_P;
    private static final SubLSymbol $sym26$REMOVAL_ASK_QUERY_PROPERTY_P;
    private static final SubLSymbol $sym27$FIRST;
    private static final SubLSymbol $sym28$SECOND;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$MAX_NUMBER;
    private static final SubLSymbol $kw31$ALLOWED_MODULES;
    private static final SubLSymbol $kw32$ALL;
    private static final SubLSymbol $kw33$EXHAUST_TOTAL;
    private static final SubLSymbol $sym34$_;
    private static final SubLSymbol $kw35$METRICS;
    private static final SubLSymbol $kw36$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw37$REMOVAL_ASK_DONE;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$ANSWER_COUNT;
    private static final SubLSymbol $kw40$TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw41$TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $kw42$TOTAL_TIME;
    private static final SubLSymbol $kw43$TIME_PER_ANSWER;
    private static final SubLSymbol $kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
    private static final SubLSymbol $kw45$COMPLETE_USER_TIME;
    private static final SubLSymbol $kw46$COMPLETE_SYSTEM_TIME;
    private static final SubLSymbol $kw47$COMPLETE_TOTAL_TIME;
    private static final SubLString $str48$removal_ask_cannot_handle_metric_;
    private static final SubLSymbol $kw49$REMOVAL;
    private static final SubLSymbol $kw50$IGNORE;
    private static final SubLSymbol $sym51$CLOSED_CONJUNCTIVE_CYCL_SENTENCE_P;
    private static final SubLSymbol $sym52$CYCL_LITERAL_P;
    private static final SubLSymbol $kw53$FALSE;
    private static final SubLSymbol $sym54$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_;
    private static final SubLString $str55$Semantic_pruning_of_results_of_ba;
    private static final SubLString $str56$This_controls_whether_or_not_the_;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$LEGACY;
    private static final SubLSymbol $kw59$NONE;
    private static final SubLSymbol $kw60$TRIVIAL;
    private static final SubLSymbol $kw61$INFERENCE;
    private static final SubLString $str62$Unexpected_pruning_mode____S;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$TYPE;
    private static final SubLSymbol $kw65$SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY;
    private static final SubLSymbol $kw66$POS_LIT;
    private static final SubLObject $const67$assertedSentence;
    private static final SubLSymbol $sym68$ATOMIC_SENTENCE_PREDICATE;
    private static final SubLSymbol $kw69$SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT;
    private static final SubLSymbol $kw70$ASENT;
    private static final SubLSymbol $kw71$SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$INDEXED_TERM_P;
    private static final SubLObject $const74$isa;
    private static final SubLSymbol $kw75$SEMANTICALLY_INVALID_ISA_ASENT;
    private static final SubLObject $const76$genls;
    private static final SubLSymbol $kw77$SEMANTICALLY_INVALID_GENLS_ASENT;
    private static final SubLObject $const78$termOfUnit;
    private static final SubLSymbol $kw79$SYNTACTICALLY_INVALID_TERM_OF_UNIT;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$CLOSED_CONJUNCTIVE_REMOVAL_ASK;
    private static final SubLSymbol $kw82$TEST;
    private static final SubLSymbol $kw83$OWNER;
    private static final SubLSymbol $kw84$CLASSES;
    private static final SubLSymbol $kw85$KB;
    private static final SubLSymbol $kw86$TINY;
    private static final SubLSymbol $kw87$WORKING_;
    private static final SubLList $list88;
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 1659L)
    public static SubLObject inference_expand_new_children() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return backward.$inference_expand_new_children$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 1750L)
    public static SubLObject add_to_inference_expand_new_children(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        backward.$inference_expand_new_children$.setDynamicValue((SubLObject)ConsesLow.cons(node, backward.$inference_expand_new_children$.getDynamicValue(thread)), thread);
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 2049L)
    public static SubLObject inference_expand_hl_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return backward.$inference_expand_hl_module$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 2390L)
    public static SubLObject inference_expand_sense() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return backward.$inference_expand_sense$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 2469L)
    public static SubLObject transformation_add_node(final SubLObject rule_assertion, final SubLObject rule_pivot_asent, final SubLObject rule_pivot_sense, SubLObject v_bindings, SubLObject more_supports) {
        if (more_supports == backward.UNPROVIDED) {
            more_supports = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (backward.NIL == v_bindings) {
            v_bindings = bindings.unification_success_token();
        }
        final SubLObject no_trans_pos_lits = (SubLObject)backward.NIL;
        final SubLObject no_trans_neg_lits = (SubLObject)backward.NIL;
        thread.resetMultipleValues();
        final SubLObject new_pos_lits = transformation_rule_dependent_lits(rule_assertion, rule_pivot_asent, rule_pivot_sense);
        final SubLObject new_neg_lits = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (backward.NIL != backward.$transformation_add_node_method$.getDynamicValue(thread)) {
            final SubLObject dependent_dnf = clauses.make_clause(ConsesLow.append(new_neg_lits, no_trans_neg_lits), ConsesLow.append(new_pos_lits, no_trans_pos_lits));
            return Functions.funcall(backward.$transformation_add_node_method$.getDynamicValue(thread), rule_assertion, rule_pivot_asent, rule_pivot_sense, v_bindings, dependent_dnf, more_supports);
        }
        return Errors.error((SubLObject)backward.$str0$The_legacy_harness_is_no_longer_s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 4075L)
    public static SubLObject transformation_rule_dependent_lits(final SubLObject rule, final SubLObject asent_from_rule, final SubLObject asent_sense) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        if (backward.$kw1$POS == asent_sense) {
            return Values.values(clauses.neg_lits(cnf), Sequences.remove(asent_from_rule, clauses.pos_lits(cnf), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED));
        }
        return Values.values(Sequences.remove(asent_from_rule, clauses.neg_lits(cnf), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED), clauses.pos_lits(cnf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 4427L)
    public static SubLObject removal_add_node(final SubLObject support, SubLObject v_bindings, SubLObject more_supports) {
        if (v_bindings == backward.UNPROVIDED) {
            v_bindings = (SubLObject)backward.NIL;
        }
        if (more_supports == backward.UNPROVIDED) {
            more_supports = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (backward.NIL == v_bindings) {
            v_bindings = bindings.unification_success_token();
        }
        if (backward.NIL == backward.$removal_add_node_method$.getDynamicValue(thread)) {
            Errors.error((SubLObject)backward.$str0$The_legacy_harness_is_no_longer_s);
        }
        SubLObject supports = (SubLObject)ConsesLow.cons(support, more_supports);
        supports = removal_add_node_helper_remove_bad_supports(supports);
        thread.resetMultipleValues();
        final SubLObject v_bindings_$1 = removal_add_node_helper_rewrite_dispreferred_terms(v_bindings, supports);
        final SubLObject supports_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_bindings = v_bindings_$1;
        supports = supports_$2;
        final SubLObject supports_list = removal_add_node_helper_modify_supports(v_bindings, supports);
        SubLObject result = (SubLObject)backward.NIL;
        SubLObject cdolist_list_var = supports_list;
        SubLObject final_supports = (SubLObject)backward.NIL;
        final_supports = cdolist_list_var.first();
        while (backward.NIL != cdolist_list_var) {
            result = removal_add_node_funcall(backward.$removal_add_node_method$.getDynamicValue(thread), v_bindings, final_supports);
            cdolist_list_var = cdolist_list_var.rest();
            final_supports = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 5427L)
    public static SubLObject removal_add_node_funcall(final SubLObject function, final SubLObject v_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (function.eql((SubLObject)backward.$sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE)) {
            return inference_worker_removal.handle_removal_add_node_for_output_generate(v_bindings, supports);
        }
        if (function.eql((SubLObject)backward.$sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS)) {
            return inference_worker_removal.handle_removal_add_node_for_expand_results(v_bindings, supports);
        }
        if (function.eql((SubLObject)backward.$sym4$REMOVAL_ASK_ADD_NODE)) {
            return removal_ask_add_node(v_bindings, supports);
        }
        return Functions.funcall(backward.$removal_add_node_method$.getDynamicValue(thread), v_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 5926L)
    public static SubLObject removal_add_node_helper_remove_bad_supports(SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (backward.NIL != list_utilities.find_if_not((SubLObject)backward.$sym5$SUPPORT_P, supports, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED)) {
            if (backward.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = list_utilities.find_all_if_not((SubLObject)backward.$sym5$SUPPORT_P, supports, (SubLObject)backward.UNPROVIDED);
                SubLObject bad_support = (SubLObject)backward.NIL;
                bad_support = cdolist_list_var.first();
                while (backward.NIL != cdolist_list_var) {
                    Errors.warn((SubLObject)backward.$str6$Removing_invalid_support__S_from_, bad_support, inference_worker.currently_executing_tactic());
                    cdolist_list_var = cdolist_list_var.rest();
                    bad_support = cdolist_list_var.first();
                }
            }
            supports = list_utilities.remove_if_not((SubLObject)backward.$sym5$SUPPORT_P, supports, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 6402L)
    public static SubLObject removal_add_node_helper_rewrite_dispreferred_terms(SubLObject v_bindings, SubLObject supports) {
        SubLObject bindings_values = bindings.bindings_values(v_bindings);
        SubLObject dispreferred_terms = cycl_utilities.expression_gather(bindings_values, (SubLObject)backward.$sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
        SubLObject rewrite_of_supports = (SubLObject)backward.NIL;
        if (backward.NIL != dispreferred_terms) {
            SubLObject cdolist_list_var;
            dispreferred_terms = (cdolist_list_var = terms_not_used_in_support_quoted_context(dispreferred_terms, supports));
            SubLObject dispreferred_term = (SubLObject)backward.NIL;
            dispreferred_term = cdolist_list_var.first();
            while (backward.NIL != cdolist_list_var) {
                final SubLObject preferred_term = equals.preferred_rewrite_term(dispreferred_term, (SubLObject)backward.UNPROVIDED);
                if (backward.NIL != preferred_term) {
                    final SubLObject rewrite_of_sentence = el_utilities.make_binary_formula(backward.$const8$rewriteOf, preferred_term, dispreferred_term);
                    SubLObject rewrite_of_support = czer_meta.find_visible_assertion_cycl(rewrite_of_sentence, (SubLObject)backward.UNPROVIDED);
                    if (backward.NIL == rewrite_of_support) {
                        rewrite_of_support = arguments.make_hl_support((SubLObject)backward.$kw9$EQUALITY, el_utilities.make_binary_formula(backward.$const8$rewriteOf, preferred_term, dispreferred_term), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
                    }
                    rewrite_of_supports = (SubLObject)ConsesLow.cons(rewrite_of_support, rewrite_of_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                dispreferred_term = cdolist_list_var.first();
            }
            if (backward.NIL != rewrite_of_supports) {
                bindings_values = cycl_utilities.expression_ntransform(bindings_values, (SubLObject)backward.$sym10$HAS_PREFERRED_REWRITE_TERM_, (SubLObject)backward.$sym11$PREFERRED_REWRITE_TERM, (SubLObject)backward.T, (SubLObject)backward.UNPROVIDED);
                v_bindings = bindings.make_variable_bindings(bindings.bindings_variables(v_bindings), bindings_values);
                supports = ConsesLow.append(rewrite_of_supports, supports);
                supports = possibly_simplify_supports_to_single_deduced_assertion(v_bindings, supports);
            }
        }
        return subl_promotions.values2(v_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 7934L)
    public static SubLObject removal_add_node_helper_dereference_indexicals(SubLObject v_bindings, SubLObject supports) {
        if (backward.NIL != kb_control_vars.date_kb_loaded_p() && backward.NIL != cycl_utilities.expression_find(backward.$const12$Now, v_bindings, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED) && backward.NIL != terms_not_used_in_support_quoted_context((SubLObject)backward.$list13, supports)) {
            final SubLObject now = date_utilities.indexical_now();
            v_bindings = cycl_utilities.expression_subst(now, backward.$const12$Now, v_bindings, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)backward.$kw14$OPAQUE, el_utilities.make_binary_formula(backward.$const15$indexicalReferent, backward.$const12$Now, now), backward.$const16$BaseKB, (SubLObject)backward.UNPROVIDED), supports);
        }
        return Values.values(v_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 8432L)
    public static SubLObject terms_not_used_in_support_quoted_context(final SubLObject terms, final SubLObject supports) {
        SubLObject terms_used_in_quoted_context = (SubLObject)backward.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)backward.NIL;
        support = cdolist_list_var.first();
        while (backward.NIL != cdolist_list_var) {
            final SubLObject support_sentence = arguments.support_sentence(support);
            SubLObject cdolist_list_var_$3 = terms;
            SubLObject v_term = (SubLObject)backward.NIL;
            v_term = cdolist_list_var_$3.first();
            while (backward.NIL != cdolist_list_var_$3) {
                SubLObject cdolist_list_var_$4 = list_utilities.all_positions(v_term, support_sentence, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
                SubLObject argnum = (SubLObject)backward.NIL;
                argnum = cdolist_list_var_$4.first();
                while (backward.NIL != cdolist_list_var_$4) {
                    if (backward.NIL != kb_accessors.quoted_argumentP(cycl_utilities.atomic_sentence_predicate(support_sentence), argnum)) {
                        final SubLObject item_var = v_term;
                        if (backward.NIL == conses_high.member(item_var, terms_used_in_quoted_context, Symbols.symbol_function((SubLObject)backward.EQL), Symbols.symbol_function((SubLObject)backward.IDENTITY))) {
                            terms_used_in_quoted_context = (SubLObject)ConsesLow.cons(item_var, terms_used_in_quoted_context);
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    argnum = cdolist_list_var_$4.first();
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                v_term = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return conses_high.set_difference(terms, terms_used_in_quoted_context, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 8991L)
    public static SubLObject possibly_simplify_supports_to_single_deduced_assertion(final SubLObject v_bindings, SubLObject supports) {
        SubLObject better_support_assertion_usedP = (SubLObject)backward.NIL;
        final SubLObject bound_problem_query = inference_czer.problem_query_formula(bindings.apply_bindings(v_bindings, inference_worker.currently_active_problem_query()));
        final SubLObject better_support_assertion_candidates = czer_meta.find_visible_assertions_cycl(bound_problem_query, (SubLObject)backward.UNPROVIDED);
        if (backward.NIL == better_support_assertion_usedP) {
            SubLObject csome_list_var = better_support_assertion_candidates;
            SubLObject better_support_assertion = (SubLObject)backward.NIL;
            better_support_assertion = csome_list_var.first();
            while (backward.NIL == better_support_assertion_usedP && backward.NIL != csome_list_var) {
                if (backward.NIL != better_support_assertion && backward.NIL != deductions_high.find_deduction(better_support_assertion, supports, (SubLObject)backward.UNPROVIDED)) {
                    better_support_assertion_usedP = (SubLObject)backward.T;
                    supports = (SubLObject)ConsesLow.list(better_support_assertion);
                }
                csome_list_var = csome_list_var.rest();
                better_support_assertion = csome_list_var.first();
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 10281L)
    public static SubLObject removal_add_node_helper_modify_supports(final SubLObject v_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports_list = (SubLObject)backward.NIL;
        if ((backward.NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread) || backward.NIL != backward.$force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread)) && (backward.NIL != kb_control_vars.$within_forward_inferenceP$.getDynamicValue(thread) || backward.NIL != backward.$debug_removal_add_node_helper_modify_supportsP$.getDynamicValue(thread)) && (backward.NIL == backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread) || backward.NIL != inference_worker.currently_active_problem() || backward.NIL != backward.$debug_removal_add_node_helper_modify_supportsP$.getDynamicValue(thread)) && backward.NIL == hl_supports.$within_hl_justify_queryP$.getDynamicValue(thread) && backward.NIL != list_utilities.find_if_not((SubLObject)backward.$sym17$ASSERTION_P, supports, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED)) {
            final SubLObject query_support_ist_sentence = (SubLObject)((backward.NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) ? ((backward.NIL != inference_worker.currently_active_problem()) ? inference_czer.problem_query_formula(bindings.apply_bindings(v_bindings, inference_worker.currently_active_problem_query())) : arguments.support_sentence(supports.first())) : backward.NIL);
            final SubLObject query_support_sentence = (backward.NIL != el_utilities.ist_sentence_p(query_support_ist_sentence, (SubLObject)backward.UNPROVIDED)) ? el_utilities.designated_sentence(query_support_ist_sentence) : query_support_ist_sentence;
            final SubLObject all_mt_and_support_combinations = (SubLObject)((backward.NIL != backward.$force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread)) ? forward.compute_all_mt_and_support_combinations(supports, (SubLObject)backward.UNPROVIDED) : backward.NIL);
            if (backward.NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread) && backward.NIL != backward.$force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = all_mt_and_support_combinations;
                SubLObject mts_and_supports = (SubLObject)backward.NIL;
                mts_and_supports = cdolist_list_var.first();
                while (backward.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = mts_and_supports;
                    SubLObject mts = (SubLObject)backward.NIL;
                    SubLObject ignored_supports = (SubLObject)backward.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list18);
                    mts = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list18);
                    ignored_supports = current.first();
                    current = current.rest();
                    if (backward.NIL == current) {
                        SubLObject cdolist_list_var_$5 = mts;
                        SubLObject mt = (SubLObject)backward.NIL;
                        mt = cdolist_list_var_$5.first();
                        while (backward.NIL != cdolist_list_var_$5) {
                            final SubLObject query_support = arguments.make_hl_support((SubLObject)backward.$kw19$QUERY, query_support_sentence, mt, (SubLObject)backward.UNPROVIDED);
                            supports_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_support), supports_list);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            mt = cdolist_list_var_$5.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)backward.$list18);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mts_and_supports = cdolist_list_var.first();
                }
            }
            else if (backward.NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) {
                final SubLObject query_support2 = arguments.make_hl_support((SubLObject)backward.$kw19$QUERY, query_support_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)backward.UNPROVIDED);
                supports_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_support2), supports_list);
            }
            else if (backward.NIL != backward.$force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = all_mt_and_support_combinations;
                SubLObject mts_and_supports = (SubLObject)backward.NIL;
                mts_and_supports = cdolist_list_var.first();
                while (backward.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = mts_and_supports;
                    SubLObject ignored_mts = (SubLObject)backward.NIL;
                    SubLObject new_supports = (SubLObject)backward.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list20);
                    ignored_mts = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list20);
                    new_supports = current.first();
                    current = current.rest();
                    if (backward.NIL == current) {
                        supports_list = (SubLObject)ConsesLow.cons(new_supports, supports_list);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)backward.$list20);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mts_and_supports = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)((backward.NIL != supports_list) ? supports_list : ConsesLow.list(supports));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 13290L)
    public static SubLObject removal_ask_query_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, backward.$removal_ask_query_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 13465L)
    public static SubLObject removal_ask(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(asent, backward.$sym24$CYCL_ATOMIC_SENTENCE_P);
        final SubLObject plist_var = query_properties;
        assert backward.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)backward.NIL, remainder = plist_var; backward.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert backward.NIL != removal_ask_query_property_p(property) : property;
        }
        if (backward.NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        SubLObject answers = (SubLObject)backward.NIL;
        SubLObject halt_reason = (SubLObject)backward.NIL;
        SubLObject metrics = (SubLObject)backward.NIL;
        final SubLObject _prev_bind_0 = backward.$removal_add_node_method$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_macros.$controlling_inferences$.currentBinding(thread);
        final SubLObject _prev_bind_3 = inference_macros.$controlling_strategy$.currentBinding(thread);
        try {
            backward.$removal_add_node_method$.bind((SubLObject)backward.$sym4$REMOVAL_ASK_ADD_NODE, thread);
            inference_macros.$controlling_inferences$.bind((SubLObject)ConsesLow.cons((SubLObject)backward.NIL, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_macros.$controlling_strategy$.bind((SubLObject)backward.NIL, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$8 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                thread.resetMultipleValues();
                final SubLObject answers_$9 = removal_ask_int(asent, truth, query_properties);
                final SubLObject halt_reason_$10 = thread.secondMultipleValue();
                final SubLObject metrics_$11 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                answers = answers_$9;
                halt_reason = halt_reason_$10;
                metrics = metrics_$11;
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$8, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$7, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            inference_macros.$controlling_strategy$.rebind(_prev_bind_3, thread);
            inference_macros.$controlling_inferences$.rebind(_prev_bind_2, thread);
            backward.$removal_add_node_method$.rebind(_prev_bind_0, thread);
        }
        return Values.values(answers, halt_reason, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 14507L)
    public static SubLObject el_removal_ask(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask(hl_asent, mt, truth, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 14904L)
    public static SubLObject removal_ask_bindings(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_answers = removal_ask(asent, mt, truth, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject metrics = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject bindings_list = list_utilities.mapcar_unique(Symbols.symbol_function((SubLObject)backward.$sym27$FIRST), inference_answers, Symbols.symbol_function((SubLObject)backward.EQUAL));
        return Values.values(bindings_list, halt_reason, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 15561L)
    public static SubLObject el_removal_ask_bindings(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask_bindings(hl_asent, mt, truth, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 15985L)
    public static SubLObject removal_ask_justifications(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_answers = removal_ask(asent, mt, truth, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject metrics = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject justifications = Mapping.mapcar(Symbols.symbol_function((SubLObject)backward.$sym28$SECOND), inference_answers);
        return Values.values(justifications, halt_reason, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 16642L)
    public static SubLObject el_removal_ask_justifications(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask_justifications(hl_asent, mt, truth, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 17084L)
    public static SubLObject removal_ask_template(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject inference_answers = removal_ask(asent, mt, truth, query_properties);
        SubLObject template_answers = (SubLObject)backward.NIL;
        SubLObject cdolist_list_var = inference_answers;
        SubLObject inference_answer = (SubLObject)backward.NIL;
        inference_answer = cdolist_list_var.first();
        while (backward.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = inference_answer;
            SubLObject v_bindings = (SubLObject)backward.NIL;
            SubLObject supports = (SubLObject)backward.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list29);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list29);
            supports = current.first();
            current = current.rest();
            if (backward.NIL == current) {
                template_answers = (SubLObject)ConsesLow.cons(bindings.subst_bindings(v_bindings, template), template_answers);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)backward.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(template_answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 17751L)
    public static SubLObject el_removal_ask_template(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject hl_template = variables.error_unless_canonicalize_default_el_vars(template);
        final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars(asent);
        return removal_ask_template(hl_template, hl_asent, mt, truth, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 18279L)
    public static SubLObject el_removal_ask_variable(final SubLObject var, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        SubLObject answers = el_removal_ask_template(var, asent, mt, truth, query_properties);
        answers = list_utilities.fast_delete_duplicates(answers, Symbols.symbol_function((SubLObject)backward.EQUAL), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 18649L)
    public static SubLObject removal_ask_variable(final SubLObject variable_token, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject variable = variables.get_variable((SubLObject)backward.ZERO_INTEGER);
        final SubLObject query_asent = cycl_utilities.expression_subst(variable, variable_token, asent, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
        final SubLObject answers = removal_ask_hl_variable(variable, query_asent, mt, truth, query_properties);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 19177L)
    public static SubLObject removal_ask_hl_variable(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (truth == backward.UNPROVIDED) {
            truth = (SubLObject)backward.$kw23$TRUE;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        SubLObject answers = removal_ask_template(hl_variable, asent, mt, truth, query_properties);
        answers = list_utilities.fast_delete_duplicates(answers, Symbols.symbol_function((SubLObject)backward.EQUAL), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 20181L)
    public static SubLObject removal_ask_answer_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary_contents.dictionary_contents_size(backward.$removal_ask_answers$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 20284L)
    public static SubLObject removal_ask_add_node(final SubLObject v_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (backward.NIL != backward.$removal_ask_disallows_indeterminate_termsP$.getDynamicValue(thread) && backward.NIL != inference_strategist.some_answer_bindings_are_indeterminateP(v_bindings)) {
            return (SubLObject)backward.NIL;
        }
        if (backward.NIL != dictionary_contents.dictionary_contents_empty_p(backward.$removal_ask_answers$.getDynamicValue(thread)) && backward.NIL != backward.$removal_ask_start_internal_real_time$.getDynamicValue(thread)) {
            backward.$removal_ask_first_answer_elapsed_internal_real_time$.setDynamicValue(numeric_date_utilities.elapsed_internal_real_time(backward.$removal_ask_start_internal_real_time$.getDynamicValue(thread), (SubLObject)backward.UNPROVIDED), thread);
        }
        if (backward.NIL != backward.$removal_ask_start_internal_real_time$.getDynamicValue(thread)) {
            backward.$removal_ask_last_answer_elapsed_internal_real_time$.setDynamicValue(numeric_date_utilities.elapsed_internal_real_time(backward.$removal_ask_start_internal_real_time$.getDynamicValue(thread), (SubLObject)backward.UNPROVIDED), thread);
        }
        backward.$removal_ask_answers$.setDynamicValue(dictionary_utilities.dictionary_contents_push(backward.$removal_ask_answers$.getDynamicValue(thread), conses_high.copy_tree(v_bindings), conses_high.copy_tree(supports), Symbols.symbol_function((SubLObject)backward.EQUAL)), thread);
        if (backward.NIL != backward.$removal_ask_max_number$.getDynamicValue(thread) && removal_ask_answer_count().numGE(backward.$removal_ask_max_number$.getDynamicValue(thread))) {
            return note_removal_ask_done((SubLObject)backward.$kw30$MAX_NUMBER);
        }
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 21376L)
    public static SubLObject removal_ask_int(final SubLObject asent, final SubLObject truth, SubLObject query_properties) {
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        final SubLObject plist_var = query_properties;
        assert backward.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)backward.NIL, remainder = plist_var; backward.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert backward.NIL != removal_ask_query_property_p(property) : property;
        }
        final SubLObject sense = enumeration_types.truth_sense(truth);
        final SubLObject allowed_modules_spec = conses_high.getf(query_properties, (SubLObject)backward.$kw31$ALLOWED_MODULES, (SubLObject)backward.$kw32$ALL);
        final SubLObject allowed_tactic_specs = removal_ask_tactic_specs(asent, sense, allowed_modules_spec);
        if (backward.NIL != allowed_tactic_specs) {
            return removal_ask_expand(asent, sense, allowed_tactic_specs, query_properties);
        }
        return Values.values((SubLObject)backward.NIL, (SubLObject)backward.$kw33$EXHAUST_TOTAL, (SubLObject)backward.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 21880L)
    public static SubLObject removal_ask_tactic_specs(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec) {
        return inference_worker_removal.literal_removal_options(asent, sense, allowed_modules_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 22025L)
    public static SubLObject removal_ask_expand(final SubLObject asent, final SubLObject sense, SubLObject tactic_specs, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)backward.NIL;
        SubLObject halt_reason = (SubLObject)backward.NIL;
        SubLObject metric_values = (SubLObject)backward.NIL;
        tactic_specs = Sort.sort(conses_high.copy_list(tactic_specs), Symbols.symbol_function((SubLObject)backward.$sym34$_), Symbols.symbol_function((SubLObject)backward.$sym28$SECOND));
        final SubLObject metrics = conses_high.getf(query_properties, (SubLObject)backward.$kw35$METRICS, (SubLObject)backward.NIL);
        final SubLObject _prev_bind_0 = backward.$removal_ask_answers$.currentBinding(thread);
        final SubLObject _prev_bind_2 = backward.$removal_ask_max_number$.currentBinding(thread);
        final SubLObject _prev_bind_3 = backward.$removal_ask_disallows_indeterminate_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = backward.$removal_ask_start_internal_real_time$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$removal_ask_first_answer_elapsed_internal_real_time$.currentBinding(thread);
        final SubLObject _prev_bind_6 = backward.$removal_ask_last_answer_elapsed_internal_real_time$.currentBinding(thread);
        try {
            backward.$removal_ask_answers$.bind(dictionary_contents.new_dictionary_contents((SubLObject)backward.ZERO_INTEGER, Symbols.symbol_function((SubLObject)backward.EQUAL)), thread);
            backward.$removal_ask_max_number$.bind(conses_high.getf(query_properties, (SubLObject)backward.$kw30$MAX_NUMBER, (SubLObject)backward.NIL), thread);
            backward.$removal_ask_disallows_indeterminate_termsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == conses_high.getf(query_properties, (SubLObject)backward.$kw36$ALLOW_INDETERMINATE_RESULTS_, (SubLObject)backward.T)), thread);
            backward.$removal_ask_start_internal_real_time$.bind((SubLObject)((backward.NIL != metrics) ? Time.get_internal_real_time() : backward.NIL), thread);
            backward.$removal_ask_first_answer_elapsed_internal_real_time$.bind((SubLObject)backward.NIL, thread);
            backward.$removal_ask_last_answer_elapsed_internal_real_time$.bind((SubLObject)backward.NIL, thread);
            if (backward.NIL == halt_reason) {
                SubLObject csome_list_var = tactic_specs;
                SubLObject tactic_spec = (SubLObject)backward.NIL;
                tactic_spec = csome_list_var.first();
                while (backward.NIL == halt_reason && backward.NIL != csome_list_var) {
                    try {
                        thread.throwStack.push(backward.$kw37$REMOVAL_ASK_DONE);
                        SubLObject current;
                        final SubLObject datum = current = tactic_spec;
                        SubLObject hl_module = (SubLObject)backward.NIL;
                        SubLObject productivity = (SubLObject)backward.NIL;
                        SubLObject completeness = (SubLObject)backward.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list38);
                        hl_module = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list38);
                        productivity = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)backward.$list38);
                        completeness = current.first();
                        current = current.rest();
                        if (backward.NIL == current) {
                            final SubLObject cost = inference_datastructures_enumerated_types.cost_for_productivity(productivity);
                            final SubLObject _prev_bind_0_$12 = backward.$inference_expand_hl_module$.currentBinding(thread);
                            try {
                                backward.$inference_expand_hl_module$.bind(hl_module, thread);
                                final SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                                final SubLObject expand_method = (SubLObject)((backward.NIL != pattern) ? backward.NIL : inference_modules.hl_module_expand_func(hl_module));
                                if (backward.NIL == inference_hl_module_cost_too_expensive(hl_module, cost)) {
                                    final SubLObject _prev_bind_0_$13 = backward.$inference_expand_sense$.currentBinding(thread);
                                    try {
                                        backward.$inference_expand_sense$.bind(sense, thread);
                                        if (backward.NIL != pattern) {
                                            formula_pattern_match.pattern_transform_formula(pattern, asent, (SubLObject)backward.UNPROVIDED);
                                        }
                                        else {
                                            Functions.funcall(expand_method, asent, sense);
                                        }
                                    }
                                    finally {
                                        backward.$inference_expand_sense$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            finally {
                                backward.$inference_expand_hl_module$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)backward.$list38);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        halt_reason = Errors.handleThrowable(ccatch_env_var, (SubLObject)backward.$kw37$REMOVAL_ASK_DONE);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    csome_list_var = csome_list_var.rest();
                    tactic_spec = csome_list_var.first();
                }
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(backward.$removal_ask_answers$.getDynamicValue(thread)); backward.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = (SubLObject)backward.NIL;
                justification = cdolist_list_var.first();
                while (backward.NIL != cdolist_list_var) {
                    if (backward.NIL == abnormal.abnormality_except_support_enabledP() || backward.NIL == inference_worker_transformation.supports_contain_excepted_assertionP(justification, (SubLObject)backward.UNPROVIDED)) {
                        answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, justification), answers);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (backward.NIL == halt_reason) {
                halt_reason = (SubLObject)backward.$kw33$EXHAUST_TOTAL;
            }
            if (backward.NIL != metrics) {
                metric_values = removal_ask_compute_metric_values(metrics);
            }
        }
        finally {
            backward.$removal_ask_last_answer_elapsed_internal_real_time$.rebind(_prev_bind_6, thread);
            backward.$removal_ask_first_answer_elapsed_internal_real_time$.rebind(_prev_bind_5, thread);
            backward.$removal_ask_start_internal_real_time$.rebind(_prev_bind_4, thread);
            backward.$removal_ask_disallows_indeterminate_termsP$.rebind(_prev_bind_3, thread);
            backward.$removal_ask_max_number$.rebind(_prev_bind_2, thread);
            backward.$removal_ask_answers$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Sequences.nreverse(answers), halt_reason, metric_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 24362L)
    public static SubLObject removal_ask_compute_metric_values(final SubLObject metrics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject metric_values = conses_high.copy_list(metrics);
        final SubLObject time_to_first_answer = (SubLObject)((backward.NIL != backward.$removal_ask_first_answer_elapsed_internal_real_time$.getDynamicValue(thread)) ? numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(backward.$removal_ask_first_answer_elapsed_internal_real_time$.getDynamicValue(thread)) : backward.NIL);
        final SubLObject time_to_last_answer = (SubLObject)((backward.NIL != backward.$removal_ask_last_answer_elapsed_internal_real_time$.getDynamicValue(thread)) ? numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(backward.$removal_ask_last_answer_elapsed_internal_real_time$.getDynamicValue(thread)) : backward.NIL);
        final SubLObject total_time = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(numeric_date_utilities.elapsed_internal_real_time(backward.$removal_ask_start_internal_real_time$.getDynamicValue(thread), (SubLObject)backward.UNPROVIDED));
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = (SubLObject)backward.NIL;
        metric = cdolist_list_var.first();
        while (backward.NIL != cdolist_list_var) {
            final SubLObject pcase_var = metric;
            if (pcase_var.eql((SubLObject)backward.$kw39$ANSWER_COUNT)) {
                final SubLObject answer_count = removal_ask_answer_count();
                metric_values = Sequences.nsubstitute(answer_count, (SubLObject)backward.$kw39$ANSWER_COUNT, metric_values, Symbols.symbol_function((SubLObject)backward.EQ), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)backward.$kw40$TIME_TO_FIRST_ANSWER)) {
                metric_values = Sequences.nsubstitute(time_to_first_answer, (SubLObject)backward.$kw40$TIME_TO_FIRST_ANSWER, metric_values, Symbols.symbol_function((SubLObject)backward.EQ), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)backward.$kw41$TIME_TO_LAST_ANSWER)) {
                metric_values = Sequences.nsubstitute(time_to_last_answer, (SubLObject)backward.$kw41$TIME_TO_LAST_ANSWER, metric_values, Symbols.symbol_function((SubLObject)backward.EQ), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)backward.$kw42$TOTAL_TIME)) {
                metric_values = Sequences.nsubstitute(total_time, (SubLObject)backward.$kw42$TOTAL_TIME, metric_values, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)backward.$kw43$TIME_PER_ANSWER)) {
                final SubLObject answer_count = removal_ask_answer_count();
                SubLObject time_per_answer = (SubLObject)backward.NIL;
                if (total_time.isNumber() && backward.NIL != subl_promotions.positive_integer_p(answer_count)) {
                    time_per_answer = Numbers.divide(total_time, answer_count);
                }
                metric_values = Sequences.nsubstitute(time_per_answer, (SubLObject)backward.$kw43$TIME_PER_ANSWER, metric_values, Symbols.symbol_function((SubLObject)backward.EQ), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)backward.$kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY)) {
                final SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference(total_time, time_to_first_answer);
                metric_values = Sequences.nsubstitute(latency_improvement_from_iterativity, (SubLObject)backward.$kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY, metric_values, Symbols.symbol_function((SubLObject)backward.EQ), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
            }
            else if (!pcase_var.eql((SubLObject)backward.$kw45$COMPLETE_USER_TIME) && !pcase_var.eql((SubLObject)backward.$kw46$COMPLETE_SYSTEM_TIME)) {
                if (!pcase_var.eql((SubLObject)backward.$kw47$COMPLETE_TOTAL_TIME)) {
                    Errors.warn((SubLObject)backward.$str48$removal_ask_cannot_handle_metric_, metric);
                    metric_values = Sequences.nsubstitute((SubLObject)backward.NIL, metric, metric_values, Symbols.symbol_function((SubLObject)backward.EQ), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return metric_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 26478L)
    public static SubLObject note_removal_ask_done(final SubLObject halt_reason) {
        return Dynamic.sublisp_throw((SubLObject)backward.$kw37$REMOVAL_ASK_DONE, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 26581L)
    public static SubLObject inference_hl_module_cost_too_expensive(final SubLObject hl_module, final SubLObject cost) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = inference_modules.hl_module_type(hl_module);
        if (pcase_var.eql((SubLObject)backward.$kw49$REMOVAL)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL != control_vars.$removal_cost_cutoff$.getDynamicValue(thread) && cost.numG(control_vars.$removal_cost_cutoff$.getDynamicValue(thread)));
        }
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 26877L)
    public static SubLObject closed_conjunctive_cycl_sentence_p(final SubLObject v_object) {
        if (backward.NIL == el_utilities.groundP(v_object, (SubLObject)backward.UNPROVIDED)) {
            return (SubLObject)backward.NIL;
        }
        return cycl_literal_or_conjunction_of_cycl_literals_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 27232L)
    public static SubLObject cycl_literal_or_conjunction_of_cycl_literals_p(final SubLObject v_object) {
        if (backward.NIL != cycl_grammar.cycl_literal_p(v_object)) {
            return (SubLObject)backward.T;
        }
        if (backward.NIL != el_utilities.el_conjunction_p(v_object)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_object, (SubLObject)backward.$kw50$IGNORE);
            SubLObject conjunct = (SubLObject)backward.NIL;
            conjunct = cdolist_list_var.first();
            while (backward.NIL != cdolist_list_var) {
                if (backward.NIL == cycl_grammar.cycl_literal_p(conjunct)) {
                    return (SubLObject)backward.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return (SubLObject)backward.T;
        }
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 27596L)
    public static SubLObject closed_conjunctive_removal_ask(final SubLObject closed_sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (query_properties == backward.UNPROVIDED) {
            query_properties = (SubLObject)backward.NIL;
        }
        assert backward.NIL != closed_conjunctive_cycl_sentence_p(closed_sentence) : closed_sentence;
        if (backward.NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        if (backward.NIL != el_utilities.el_conjunction_p(closed_sentence)) {
            SubLObject falsifiedP = (SubLObject)backward.NIL;
            final SubLObject args = cycl_utilities.formula_args(closed_sentence, (SubLObject)backward.$kw50$IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            for (rest = (SubLObject)backward.NIL, rest = args; backward.NIL == falsifiedP && backward.NIL != rest; rest = rest.rest()) {
                conjunct = rest.first();
                if (backward.NIL == removal_ask_literal(conjunct, mt, query_properties)) {
                    falsifiedP = (SubLObject)backward.T;
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == falsifiedP);
        }
        return list_utilities.sublisp_boolean(removal_ask_literal(closed_sentence, mt, query_properties));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 28564L)
    public static SubLObject removal_ask_literal(final SubLObject literal, final SubLObject mt, final SubLObject query_properties) {
        assert backward.NIL != cycl_grammar.cycl_literal_p(literal) : literal;
        final SubLObject truth = (SubLObject)((backward.NIL != el_utilities.el_negation_p(literal)) ? backward.$kw53$FALSE : backward.$kw23$TRUE);
        final SubLObject asent = el_utilities.literal_atomic_sentence(literal);
        return removal_ask(asent, mt, truth, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 31010L)
    public static SubLObject semantically_valid_closed_asentsP(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = backward.$forward_inference_pruning_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)backward.$kw59$NONE)) {
            return (SubLObject)backward.T;
        }
        if (pcase_var.eql((SubLObject)backward.$kw58$LEGACY)) {
            SubLObject current_validP = (SubLObject)backward.T;
            SubLObject current_reason = (SubLObject)backward.NIL;
            thread.resetMultipleValues();
            final SubLObject current_validP_$14 = semantically_valid_asserted_sentence_asents(dnf, mt, justifyP);
            final SubLObject current_reason_$15 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            current_validP = current_validP_$14;
            current_reason = current_reason_$15;
            if (backward.NIL != current_validP) {
                thread.resetMultipleValues();
                final SubLObject current_validP_$15 = semantically_valid_complete_extent_asserted_asents(dnf, mt, justifyP);
                final SubLObject current_reason_$16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                current_validP = current_validP_$15;
                current_reason = current_reason_$16;
                if (backward.NIL != current_validP) {
                    thread.resetMultipleValues();
                    final SubLObject current_validP_$16 = semantically_valid_isa_asents(dnf, mt, justifyP);
                    final SubLObject current_reason_$17 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    current_validP = current_validP_$16;
                    current_reason = current_reason_$17;
                    if (backward.NIL != current_validP) {
                        thread.resetMultipleValues();
                        final SubLObject current_validP_$17 = semantically_valid_genls_asents(dnf, mt, justifyP);
                        final SubLObject current_reason_$18 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        current_validP = current_validP_$17;
                        current_reason = current_reason_$18;
                    }
                }
            }
            if (backward.NIL == justifyP) {
                return current_validP;
            }
            return Values.values(current_validP, (SubLObject)((backward.NIL != current_validP) ? backward.NIL : current_reason));
        }
        else {
            if (pcase_var.eql((SubLObject)backward.$kw60$TRIVIAL)) {
                return semantically_valid_closed_asentsP_int(dnf, mt, (SubLObject)backward.NIL, justifyP);
            }
            if (pcase_var.eql((SubLObject)backward.$kw61$INFERENCE)) {
                return semantically_valid_closed_asentsP_int(dnf, mt, (SubLObject)backward.T, justifyP);
            }
            return Errors.error((SubLObject)backward.$str62$Unexpected_pruning_mode____S, backward.$forward_inference_pruning_mode$.getDynamicValue(thread));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 32447L)
    public static SubLObject semantically_valid_closed_asentsP_int(final SubLObject dnf, final SubLObject mt, final SubLObject use_problem_storeP, SubLObject justifyP) {
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        final SubLObject invalidP = (SubLObject)backward.NIL;
        SubLObject reason = (SubLObject)backward.NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject invalidP_$22 = (SubLObject)backward.NIL;
        if (backward.NIL == invalidP_$22) {
            SubLObject csome_list_var = pos_lits;
            SubLObject pos_lit = (SubLObject)backward.NIL;
            pos_lit = csome_list_var.first();
            while (backward.NIL == invalidP_$22 && backward.NIL != csome_list_var) {
                if (backward.NIL != variables.fully_bound_p(pos_lit)) {
                    final SubLObject gaf_dnf = clause_utilities.make_gaf_dnf(pos_lit);
                    final SubLObject overriding_query_properties = (SubLObject)backward.$list63;
                    if (backward.NIL != use_problem_storeP) {
                        invalidP_$22 = (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == forward.new_forward_query_from_dnf(gaf_dnf, clauses.empty_clause(), mt, overriding_query_properties));
                    }
                    else {
                        invalidP_$22 = (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == forward.new_cyc_trivial_forward_query_from_dnf(gaf_dnf, mt, (SubLObject)backward.NIL, overriding_query_properties));
                    }
                    if (backward.NIL != invalidP_$22 && backward.NIL != justifyP) {
                        reason = (SubLObject)ConsesLow.list((SubLObject)backward.$kw64$TYPE, (SubLObject)backward.$kw65$SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY, (SubLObject)backward.$kw66$POS_LIT, pos_lit);
                    }
                }
                csome_list_var = csome_list_var.rest();
                pos_lit = csome_list_var.first();
            }
        }
        if (backward.NIL == justifyP) {
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP);
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP), (SubLObject)((backward.NIL != invalidP) ? reason : backward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 33438L)
    public static SubLObject semantically_valid_asserted_sentence_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = (SubLObject)backward.NIL;
        SubLObject reason = (SubLObject)backward.NIL;
        if (backward.NIL != backward.$forward_asserted_sentence_pruning_enabledP$.getDynamicValue(thread)) {
            final SubLObject pos_lits = clauses.pos_lits(dnf);
            if (backward.NIL != Sequences.find(backward.$const67$assertedSentence, pos_lits, Symbols.symbol_function((SubLObject)backward.EQL), Symbols.symbol_function((SubLObject)backward.$sym68$ATOMIC_SENTENCE_PREDICATE), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (backward.NIL == invalidP) {
                        SubLObject csome_list_var = pos_lits;
                        SubLObject asent = (SubLObject)backward.NIL;
                        asent = csome_list_var.first();
                        while (backward.NIL == invalidP && backward.NIL != csome_list_var) {
                            if (backward.$const67$assertedSentence.eql(cycl_utilities.atomic_sentence_predicate(asent)) && backward.NIL != semantically_invalid_asserted_sentence_asent(asent)) {
                                invalidP = (SubLObject)backward.T;
                                if (backward.NIL != justifyP) {
                                    reason = (SubLObject)ConsesLow.list((SubLObject)backward.$kw64$TYPE, (SubLObject)backward.$kw69$SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT, (SubLObject)backward.$kw70$ASENT, asent);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            asent = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (backward.NIL == justifyP) {
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP);
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP), (SubLObject)((backward.NIL != invalidP) ? reason : backward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 34462L)
    public static SubLObject semantically_valid_complete_extent_asserted_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = (SubLObject)backward.NIL;
        SubLObject reason = (SubLObject)backward.NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (backward.NIL == invalidP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject asent = (SubLObject)backward.NIL;
                asent = csome_list_var.first();
                while (backward.NIL == invalidP && backward.NIL != csome_list_var) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if (backward.NIL != forts.fort_p(pred) && backward.NIL != kb_accessors.complete_extent_assertedP(pred, (SubLObject)backward.UNPROVIDED) && backward.NIL != non_asserted_asentP(asent)) {
                        invalidP = (SubLObject)backward.T;
                        if (backward.NIL != justifyP) {
                            reason = (SubLObject)ConsesLow.list((SubLObject)backward.$kw64$TYPE, (SubLObject)backward.$kw71$SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT, (SubLObject)backward.$kw70$ASENT, asent);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    asent = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (backward.NIL == justifyP) {
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP);
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP), (SubLObject)((backward.NIL != invalidP) ? reason : backward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 35296L)
    public static SubLObject semantically_invalid_asserted_sentence_asent(final SubLObject asent) {
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)backward.UNPROVIDED);
        return non_asserted_asentP(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 35459L)
    public static SubLObject asent_only_has_pred_boundP(final SubLObject sentence) {
        if (backward.NIL != variables.variable_p(sentence.first())) {
            return (SubLObject)backward.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)backward.$kw50$IGNORE);
        SubLObject item = (SubLObject)backward.NIL;
        item = cdolist_list_var.first();
        while (backward.NIL != cdolist_list_var) {
            if (backward.NIL == variables.variable_p(item)) {
                return (SubLObject)backward.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)backward.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 35736L)
    public static SubLObject non_asserted_asentP(final SubLObject sentence) {
        if (backward.NIL != el_utilities.el_formula_p(sentence)) {
            if (backward.NIL != asent_only_has_pred_boundP(sentence)) {
                if (backward.NIL != list_utilities.member_kbeqP(sentence.first(), backward.$preds_with_assumed_extent$.getGlobalValue())) {
                    return (SubLObject)backward.NIL;
                }
                if (backward.NIL != subl_promotions.positive_integer_p(kb_indexing.num_predicate_extent_index(cycl_utilities.atomic_sentence_predicate(sentence), (SubLObject)backward.UNPROVIDED)) && backward.NIL != subl_promotions.positive_integer_p(kb_indexing.relevant_num_predicate_extent_index_with_cutoff(cycl_utilities.atomic_sentence_predicate(sentence), (SubLObject)backward.ONE_INTEGER))) {
                    return (SubLObject)backward.NIL;
                }
            }
            if (backward.NIL != non_asserted_asent_via_somewhere_cacheP(sentence)) {
                return (SubLObject)backward.T;
            }
            if (backward.NIL != non_asserted_asent_via_gaf_lookupP(sentence)) {
                return (SubLObject)backward.T;
            }
        }
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 36482L)
    public static SubLObject non_asserted_asent_via_somewhere_cacheP(final SubLObject sentence) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (backward.NIL != forts.fort_p(predicate) && backward.NIL != fort_types_interface.predicateP(predicate) && backward.NIL != somewhere_cache.somewhere_cached_pred_p(predicate)) {
            final SubLObject argnum = somewhere_cache.some_pred_assertion_somewhere_argnum(predicate);
            final SubLObject arg = cycl_utilities.formula_arg(sentence, argnum, (SubLObject)backward.UNPROVIDED);
            if (backward.NIL != forts.fort_p(arg) && backward.NIL == somewhere_cache.some_pred_assertion_somewhereP(predicate, arg, argnum, (SubLObject)backward.UNPROVIDED)) {
                return (SubLObject)backward.T;
            }
        }
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 37026L)
    public static SubLObject non_asserted_asent_via_gaf_lookupP(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL != cycl_utilities.expression_find_if((SubLObject)backward.$sym73$INDEXED_TERM_P, sentence, (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED) && backward.NIL == kb_indexing.asent_kb_lookup_in_any_mt(sentence, forward.$forward_inference_asserted_asent_fast_fail_cutoff$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 37253L)
    public static SubLObject semantically_valid_isa_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        SubLObject invalidP = (SubLObject)backward.NIL;
        SubLObject reason = (SubLObject)backward.NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        if (backward.NIL != Sequences.find(backward.$const74$isa, pos_lits, Symbols.symbol_function((SubLObject)backward.EQL), Symbols.symbol_function((SubLObject)backward.$sym68$ATOMIC_SENTENCE_PREDICATE), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED)) {
            SubLObject cdolist_list_var = pos_lits;
            SubLObject asent = (SubLObject)backward.NIL;
            asent = cdolist_list_var.first();
            while (backward.NIL != cdolist_list_var) {
                if (backward.$const74$isa.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)backward.UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)backward.UNPROVIDED);
                    if (backward.NIL != forts.fort_p(arg1) && backward.NIL != forts.fort_p(arg2) && backward.NIL == at_defns.quiet_has_type_memoizedP(arg1, arg2, mt, (SubLObject)backward.UNPROVIDED)) {
                        invalidP = (SubLObject)backward.T;
                        if (backward.NIL != justifyP) {
                            reason = (SubLObject)ConsesLow.list((SubLObject)backward.$kw64$TYPE, (SubLObject)backward.$kw75$SEMANTICALLY_INVALID_ISA_ASENT, (SubLObject)backward.$kw70$ASENT, asent);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
        }
        if (backward.NIL == justifyP) {
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP);
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP), (SubLObject)((backward.NIL != invalidP) ? reason : backward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 38244L)
    public static SubLObject semantically_valid_genls_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        SubLObject invalidP = (SubLObject)backward.NIL;
        SubLObject reason = (SubLObject)backward.NIL;
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        if (backward.NIL != Sequences.find(backward.$const76$genls, pos_lits, Symbols.symbol_function((SubLObject)backward.EQL), Symbols.symbol_function((SubLObject)backward.$sym68$ATOMIC_SENTENCE_PREDICATE), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED)) {
            SubLObject cdolist_list_var = pos_lits;
            SubLObject asent = (SubLObject)backward.NIL;
            asent = cdolist_list_var.first();
            while (backward.NIL != cdolist_list_var) {
                if (backward.$const76$genls.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)backward.UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)backward.UNPROVIDED);
                    if (backward.NIL != forts.fort_p(arg1) && backward.NIL != forts.fort_p(arg2) && backward.NIL == genls.genlsP(arg1, arg2, mt, (SubLObject)backward.UNPROVIDED)) {
                        invalidP = (SubLObject)backward.T;
                        if (backward.NIL != justifyP) {
                            reason = (SubLObject)ConsesLow.list((SubLObject)backward.$kw64$TYPE, (SubLObject)backward.$kw77$SEMANTICALLY_INVALID_GENLS_ASENT, (SubLObject)backward.$kw70$ASENT, asent);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
        }
        if (backward.NIL == justifyP) {
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP);
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(backward.NIL == invalidP), (SubLObject)((backward.NIL != invalidP) ? reason : backward.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 39261L)
    public static SubLObject semantically_valid_term_of_unit_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP) {
        if (mt == backward.UNPROVIDED) {
            mt = (SubLObject)backward.NIL;
        }
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        return syntactically_valid_term_of_unit_asents(dnf, justifyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 39528L)
    public static SubLObject syntactically_valid_term_of_unit_asents(final SubLObject dnf, SubLObject justifyP) {
        if (justifyP == backward.UNPROVIDED) {
            justifyP = (SubLObject)backward.NIL;
        }
        SubLObject cdolist_list_var = clauses.pos_lits(dnf);
        SubLObject asent = (SubLObject)backward.NIL;
        asent = cdolist_list_var.first();
        while (backward.NIL != cdolist_list_var) {
            if (backward.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, backward.$const78$termOfUnit) && backward.NIL == syntactically_valid_term_of_unit_asent(asent)) {
                if (backward.NIL != justifyP) {
                    return Values.values((SubLObject)backward.NIL, (SubLObject)ConsesLow.list((SubLObject)backward.$kw64$TYPE, (SubLObject)backward.$kw79$SYNTACTICALLY_INVALID_TERM_OF_UNIT, (SubLObject)backward.$kw70$ASENT, asent));
                }
                return (SubLObject)backward.NIL;
            }
            else {
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
        }
        return (SubLObject)backward.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 40154L)
    public static SubLObject valid_term_of_unit_arg1(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL != variables.variable_p(v_object) || backward.NIL != cycl_grammar.cycl_nat_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 40264L)
    public static SubLObject valid_term_of_unit_arg2(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL != variables.variable_p(v_object) || backward.NIL != narts_high.naut_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 40370L)
    public static SubLObject valid_term_of_unit_args(final SubLObject arg1, final SubLObject arg2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL != valid_term_of_unit_arg1(arg1) && backward.NIL != valid_term_of_unit_arg2(arg2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 40507L)
    public static SubLObject valid_term_of_unit_inter_args(final SubLObject arg1, final SubLObject arg2) {
        if (backward.NIL != el_utilities.possibly_nat_p(arg1) && backward.NIL != el_utilities.possibly_nat_p(arg2)) {
            final SubLObject arg1_functor = cycl_utilities.nat_functor(arg1);
            final SubLObject arg2_functor = cycl_utilities.nat_functor(arg2);
            if (backward.NIL != forts.fort_p(arg1_functor) && backward.NIL != forts.fort_p(arg2_functor) && !arg1_functor.eql(arg2_functor)) {
                return (SubLObject)backward.NIL;
            }
        }
        return (SubLObject)backward.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 40856L)
    public static SubLObject syntactically_valid_term_of_unit_asent(final SubLObject tou_asent) {
        if (backward.NIL != el_utilities.formula_arityE(tou_asent, (SubLObject)backward.TWO_INTEGER, (SubLObject)backward.UNPROVIDED)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(tou_asent, (SubLObject)backward.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(tou_asent, (SubLObject)backward.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(backward.NIL != valid_term_of_unit_args(arg1, arg2) && backward.NIL != valid_term_of_unit_inter_args(arg1, arg2));
        }
        return (SubLObject)backward.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 41344L)
    public static SubLObject literal_set_sense(final SubLObject literal_set) {
        return conses_high.assoc(literal_set, backward.$literal_set_sense_table$.getGlobalValue(), (SubLObject)backward.UNPROVIDED, (SubLObject)backward.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward.lisp", position = 41456L)
    public static SubLObject literal_set_without(final SubLObject literals, final SubLObject literal_num) {
        return list_utilities.remove_nth(literal_num, literals);
    }
    
    public static SubLObject declare_backward_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "inference_expand_new_children", "INFERENCE-EXPAND-NEW-CHILDREN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "add_to_inference_expand_new_children", "ADD-TO-INFERENCE-EXPAND-NEW-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "inference_expand_hl_module", "INFERENCE-EXPAND-HL-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "inference_expand_sense", "INFERENCE-EXPAND-SENSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "transformation_add_node", "TRANSFORMATION-ADD-NODE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "transformation_rule_dependent_lits", "TRANSFORMATION-RULE-DEPENDENT-LITS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_add_node", "REMOVAL-ADD-NODE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_add_node_funcall", "REMOVAL-ADD-NODE-FUNCALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_add_node_helper_remove_bad_supports", "REMOVAL-ADD-NODE-HELPER-REMOVE-BAD-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_add_node_helper_rewrite_dispreferred_terms", "REMOVAL-ADD-NODE-HELPER-REWRITE-DISPREFERRED-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_add_node_helper_dereference_indexicals", "REMOVAL-ADD-NODE-HELPER-DEREFERENCE-INDEXICALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "terms_not_used_in_support_quoted_context", "TERMS-NOT-USED-IN-SUPPORT-QUOTED-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "possibly_simplify_supports_to_single_deduced_assertion", "POSSIBLY-SIMPLIFY-SUPPORTS-TO-SINGLE-DEDUCED-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_add_node_helper_modify_supports", "REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_query_property_p", "REMOVAL-ASK-QUERY-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask", "REMOVAL-ASK", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "el_removal_ask", "EL-REMOVAL-ASK", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_bindings", "REMOVAL-ASK-BINDINGS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "el_removal_ask_bindings", "EL-REMOVAL-ASK-BINDINGS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_justifications", "REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "el_removal_ask_justifications", "EL-REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_template", "REMOVAL-ASK-TEMPLATE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "el_removal_ask_template", "EL-REMOVAL-ASK-TEMPLATE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "el_removal_ask_variable", "EL-REMOVAL-ASK-VARIABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_variable", "REMOVAL-ASK-VARIABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_hl_variable", "REMOVAL-ASK-HL-VARIABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_answer_count", "REMOVAL-ASK-ANSWER-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_add_node", "REMOVAL-ASK-ADD-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_int", "REMOVAL-ASK-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_tactic_specs", "REMOVAL-ASK-TACTIC-SPECS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_expand", "REMOVAL-ASK-EXPAND", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_compute_metric_values", "REMOVAL-ASK-COMPUTE-METRIC-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "note_removal_ask_done", "NOTE-REMOVAL-ASK-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "inference_hl_module_cost_too_expensive", "INFERENCE-HL-MODULE-COST-TOO-EXPENSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "closed_conjunctive_cycl_sentence_p", "CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "cycl_literal_or_conjunction_of_cycl_literals_p", "CYCL-LITERAL-OR-CONJUNCTION-OF-CYCL-LITERALS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "closed_conjunctive_removal_ask", "CLOSED-CONJUNCTIVE-REMOVAL-ASK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "removal_ask_literal", "REMOVAL-ASK-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_closed_asentsP", "SEMANTICALLY-VALID-CLOSED-ASENTS?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_closed_asentsP_int", "SEMANTICALLY-VALID-CLOSED-ASENTS?-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_asserted_sentence_asents", "SEMANTICALLY-VALID-ASSERTED-SENTENCE-ASENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_complete_extent_asserted_asents", "SEMANTICALLY-VALID-COMPLETE-EXTENT-ASSERTED-ASENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_invalid_asserted_sentence_asent", "SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "asent_only_has_pred_boundP", "ASENT-ONLY-HAS-PRED-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "non_asserted_asentP", "NON-ASSERTED-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "non_asserted_asent_via_somewhere_cacheP", "NON-ASSERTED-ASENT-VIA-SOMEWHERE-CACHE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "non_asserted_asent_via_gaf_lookupP", "NON-ASSERTED-ASENT-VIA-GAF-LOOKUP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_isa_asents", "SEMANTICALLY-VALID-ISA-ASENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_genls_asents", "SEMANTICALLY-VALID-GENLS-ASENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "semantically_valid_term_of_unit_asents", "SEMANTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "syntactically_valid_term_of_unit_asents", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "valid_term_of_unit_arg1", "VALID-TERM-OF-UNIT-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "valid_term_of_unit_arg2", "VALID-TERM-OF-UNIT-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "valid_term_of_unit_args", "VALID-TERM-OF-UNIT-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "valid_term_of_unit_inter_args", "VALID-TERM-OF-UNIT-INTER-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "syntactically_valid_term_of_unit_asent", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "literal_set_sense", "LITERAL-SET-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward", "literal_set_without", "LITERAL-SET-WITHOUT", 2, 0, false);
        return (SubLObject)backward.NIL;
    }
    
    public static SubLObject init_backward_file() {
        backward.$removal_add_node_method$ = SubLFiles.defparameter("*REMOVAL-ADD-NODE-METHOD*", (SubLObject)backward.NIL);
        backward.$transformation_add_node_method$ = SubLFiles.defparameter("*TRANSFORMATION-ADD-NODE-METHOD*", (SubLObject)backward.NIL);
        backward.$transformation_early_removal_threshold$ = SubLFiles.defparameter("*TRANSFORMATION-EARLY-REMOVAL-THRESHOLD*", (SubLObject)backward.EIGHT_INTEGER);
        backward.$inference_expand_new_children$ = SubLFiles.defparameter("*INFERENCE-EXPAND-NEW-CHILDREN*", (SubLObject)backward.NIL);
        backward.$inference_expand_hl_module$ = SubLFiles.defparameter("*INFERENCE-EXPAND-HL-MODULE*", (SubLObject)backward.NIL);
        backward.$inference_expand_sense$ = SubLFiles.defparameter("*INFERENCE-EXPAND-SENSE*", (SubLObject)backward.NIL);
        backward.$force_query_supports_in_forward_inferenceP$ = SubLFiles.defparameter("*FORCE-QUERY-SUPPORTS-IN-FORWARD-INFERENCE?*", (SubLObject)backward.NIL);
        backward.$force_forward_mt_combos_computation_in_forward_inferenceP$ = SubLFiles.defparameter("*FORCE-FORWARD-MT-COMBOS-COMPUTATION-IN-FORWARD-INFERENCE?*", (SubLObject)backward.NIL);
        backward.$debug_removal_add_node_helper_modify_supportsP$ = SubLFiles.defparameter("*DEBUG-REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS?*", (SubLObject)backward.NIL);
        backward.$removal_ask_query_properties$ = SubLFiles.deflexical("*REMOVAL-ASK-QUERY-PROPERTIES*", (SubLObject)backward.$list21);
        backward.$removal_ask_answers$ = SubLFiles.defparameter("*REMOVAL-ASK-ANSWERS*", (SubLObject)backward.NIL);
        backward.$removal_ask_max_number$ = SubLFiles.defparameter("*REMOVAL-ASK-MAX-NUMBER*", (SubLObject)backward.NIL);
        backward.$removal_ask_disallows_indeterminate_termsP$ = SubLFiles.defparameter("*REMOVAL-ASK-DISALLOWS-INDETERMINATE-TERMS?*", (SubLObject)backward.NIL);
        backward.$removal_ask_first_answer_elapsed_internal_real_time$ = SubLFiles.defparameter("*REMOVAL-ASK-FIRST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", (SubLObject)backward.NIL);
        backward.$removal_ask_last_answer_elapsed_internal_real_time$ = SubLFiles.defparameter("*REMOVAL-ASK-LAST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", (SubLObject)backward.NIL);
        backward.$removal_ask_start_internal_real_time$ = SubLFiles.defparameter("*REMOVAL-ASK-START-INTERNAL-REAL-TIME*", (SubLObject)backward.NIL);
        backward.$transformation_semantic_pruning_enabled$ = SubLFiles.defparameter("*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*", (SubLObject)backward.NIL);
        backward.$forward_inference_pruning_mode$ = SubLFiles.defvar("*FORWARD-INFERENCE-PRUNING-MODE*", (SubLObject)backward.$kw58$LEGACY);
        backward.$forward_asserted_sentence_pruning_enabledP$ = SubLFiles.defvar("*FORWARD-ASSERTED-SENTENCE-PRUNING-ENABLED?*", (SubLObject)backward.T);
        backward.$preds_with_assumed_extent$ = SubLFiles.defconstant("*PREDS-WITH-ASSUMED-EXTENT*", (SubLObject)backward.$list72);
        backward.$literal_set_sense_table$ = SubLFiles.deflexical("*LITERAL-SET-SENSE-TABLE*", (SubLObject)backward.$list80);
        return (SubLObject)backward.NIL;
    }
    
    public static SubLObject setup_backward_file() {
        access_macros.register_external_symbol((SubLObject)backward.$sym22$REMOVAL_ASK);
        utilities_macros.declare_control_parameter_internal((SubLObject)backward.$sym54$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_, (SubLObject)backward.$str55$Semantic_pruning_of_results_of_ba, (SubLObject)backward.$str56$This_controls_whether_or_not_the_, (SubLObject)backward.$list57);
        generic_testing.define_test_case_table_int((SubLObject)backward.$sym81$CLOSED_CONJUNCTIVE_REMOVAL_ASK, (SubLObject)ConsesLow.list(new SubLObject[] { backward.$kw82$TEST, backward.NIL, backward.$kw83$OWNER, backward.NIL, backward.$kw84$CLASSES, backward.NIL, backward.$kw85$KB, backward.$kw86$TINY, backward.$kw87$WORKING_, backward.T }), (SubLObject)backward.$list88);
        return (SubLObject)backward.NIL;
    }
    
    public void declareFunctions() {
        declare_backward_file();
    }
    
    public void initializeVariables() {
        init_backward_file();
    }
    
    public void runTopLevelForms() {
        setup_backward_file();
    }
    
    static {
        me = (SubLFile)new backward();
        backward.$removal_add_node_method$ = null;
        backward.$transformation_add_node_method$ = null;
        backward.$transformation_early_removal_threshold$ = null;
        backward.$inference_expand_new_children$ = null;
        backward.$inference_expand_hl_module$ = null;
        backward.$inference_expand_sense$ = null;
        backward.$force_query_supports_in_forward_inferenceP$ = null;
        backward.$force_forward_mt_combos_computation_in_forward_inferenceP$ = null;
        backward.$debug_removal_add_node_helper_modify_supportsP$ = null;
        backward.$removal_ask_query_properties$ = null;
        backward.$removal_ask_answers$ = null;
        backward.$removal_ask_max_number$ = null;
        backward.$removal_ask_disallows_indeterminate_termsP$ = null;
        backward.$removal_ask_first_answer_elapsed_internal_real_time$ = null;
        backward.$removal_ask_last_answer_elapsed_internal_real_time$ = null;
        backward.$removal_ask_start_internal_real_time$ = null;
        backward.$transformation_semantic_pruning_enabled$ = null;
        backward.$forward_inference_pruning_mode$ = null;
        backward.$forward_asserted_sentence_pruning_enabledP$ = null;
        backward.$preds_with_assumed_extent$ = null;
        backward.$literal_set_sense_table$ = null;
        $str0$The_legacy_harness_is_no_longer_s = SubLObjectFactory.makeString("The legacy harness is no longer supported.");
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");
        $sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = SubLObjectFactory.makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");
        $sym4$REMOVAL_ASK_ADD_NODE = SubLObjectFactory.makeSymbol("REMOVAL-ASK-ADD-NODE");
        $sym5$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $str6$Removing_invalid_support__S_from_ = SubLObjectFactory.makeString("Removing invalid support ~S from ~S result");
        $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = SubLObjectFactory.makeSymbol("SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?");
        $const8$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $kw9$EQUALITY = SubLObjectFactory.makeKeyword("EQUALITY");
        $sym10$HAS_PREFERRED_REWRITE_TERM_ = SubLObjectFactory.makeSymbol("HAS-PREFERRED-REWRITE-TERM?");
        $sym11$PREFERRED_REWRITE_TERM = SubLObjectFactory.makeSymbol("PREFERRED-REWRITE-TERM");
        $const12$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $list13 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")));
        $kw14$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const15$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $const16$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym17$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORED-SUPPORTS"));
        $kw19$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORED-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SUPPORTS"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));
        $sym22$REMOVAL_ASK = SubLObjectFactory.makeSymbol("REMOVAL-ASK");
        $kw23$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym24$CYCL_ATOMIC_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-SENTENCE-P");
        $sym25$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym26$REMOVAL_ASK_QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");
        $sym27$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym28$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $kw30$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw31$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw32$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw33$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $sym34$_ = SubLObjectFactory.makeSymbol("<");
        $kw35$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $kw36$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw37$REMOVAL_ASK_DONE = SubLObjectFactory.makeKeyword("REMOVAL-ASK-DONE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETENESS"));
        $kw39$ANSWER_COUNT = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $kw40$TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $kw41$TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $kw42$TOTAL_TIME = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $kw43$TIME_PER_ANSWER = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $kw45$COMPLETE_USER_TIME = SubLObjectFactory.makeKeyword("COMPLETE-USER-TIME");
        $kw46$COMPLETE_SYSTEM_TIME = SubLObjectFactory.makeKeyword("COMPLETE-SYSTEM-TIME");
        $kw47$COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $str48$removal_ask_cannot_handle_metric_ = SubLObjectFactory.makeString("removal-ask cannot handle metric ~s, using NIL instead");
        $kw49$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw50$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym51$CLOSED_CONJUNCTIVE_CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P");
        $sym52$CYCL_LITERAL_P = SubLObjectFactory.makeSymbol("CYCL-LITERAL-P");
        $kw53$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym54$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*");
        $str55$Semantic_pruning_of_results_of_ba = SubLObjectFactory.makeString("Semantic pruning of results of backchaining");
        $str56$This_controls_whether_or_not_the_ = SubLObjectFactory.makeString("This controls whether or not the intermediate results of backchaining\nare examined to see if they are provably unsatisfiable.  If so, these\nresults are pruned from the search.  This test takes time, but usually\nprovides substantial pruning of the search tree when backchaining.");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)backward.T, (SubLObject)SubLObjectFactory.makeString("Yes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)backward.NIL, (SubLObject)SubLObjectFactory.makeString("No")));
        $kw58$LEGACY = SubLObjectFactory.makeKeyword("LEGACY");
        $kw59$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw60$TRIVIAL = SubLObjectFactory.makeKeyword("TRIVIAL");
        $kw61$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $str62$Unexpected_pruning_mode____S = SubLObjectFactory.makeString("Unexpected pruning mode : ~S");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)backward.ONE_INTEGER);
        $kw64$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw65$SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY = SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-CLOSED-ASENT-VIA-QUERY");
        $kw66$POS_LIT = SubLObjectFactory.makeKeyword("POS-LIT");
        $const67$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $sym68$ATOMIC_SENTENCE_PREDICATE = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $kw69$SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT = SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT");
        $kw70$ASENT = SubLObjectFactory.makeKeyword("ASENT");
        $kw71$SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT = SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-COMPLETE-EXTENT-ASSERTED-ASENT");
        $list72 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $sym73$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $const74$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw75$SEMANTICALLY_INVALID_ISA_ASENT = SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-ISA-ASENT");
        $const76$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw77$SEMANTICALLY_INVALID_GENLS_ASENT = SubLObjectFactory.makeKeyword("SEMANTICALLY-INVALID-GENLS-ASENT");
        $const78$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw79$SYNTACTICALLY_INVALID_TERM_OF_UNIT = SubLObjectFactory.makeKeyword("SYNTACTICALLY-INVALID-TERM-OF-UNIT");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-POS"), (SubLObject)SubLObjectFactory.makeKeyword("POS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NO-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YES-POS"), (SubLObject)SubLObjectFactory.makeKeyword("POS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YES-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("NEG")));
        $sym81$CLOSED_CONJUNCTIVE_REMOVAL_ASK = SubLObjectFactory.makeSymbol("CLOSED-CONJUNCTIVE-REMOVAL-ASK");
        $kw82$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw83$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw84$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw85$KB = SubLObjectFactory.makeKeyword("KB");
        $kw86$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw87$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))))), (SubLObject)backward.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))))), (SubLObject)backward.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")))), (SubLObject)backward.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")))), (SubLObject)backward.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))))), (SubLObject)backward.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))))), (SubLObject)backward.T));
    }
}

/*

	Total time: 568 ms
	
*/