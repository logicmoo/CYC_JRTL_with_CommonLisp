package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deep_inference_generator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.deep_inference_generator";
    public static final String myFingerPrint = "e1ca6d41c15299b591eaf557e72e97eee0346e9dcf4abdda37a5e4d4ca4cdd0f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 935L)
    private static SubLSymbol $deep_inference_gaf_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 1190L)
    private static SubLSymbol $deep_inference_recursion_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 4997L)
    private static SubLSymbol $totally_uninteresting_haystack_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 5278L)
    private static SubLSymbol $somewhat_uninteresting_haystack_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 11382L)
    private static SubLSymbol $straw_seeking_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
    private static SubLSymbol $abduced_term_to_random_variable_caching_state$;
    private static final SubLSymbol $sym0$_DEEP_INFERENCE_GAF_TABLE_;
    private static final SubLInteger $int1$212;
    private static final SubLSymbol $kw2$UNINITIALIZED;
    private static final SubLString $str3$Looking_for_deeply_deduced_gafs;
    private static final SubLSymbol $sym4$STRINGP;
    private static final SubLSymbol $kw5$SKIP;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$RULE_ASSERTION_;
    private static final SubLSymbol $sym9$ASSERTION_MT;
    private static final SubLSymbol $sym10$POSITIVE_INTEGER_P;
    private static final SubLObject $const11$InferencePSC;
    private static final SubLSymbol $kw12$IGNORE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$NONSTANDARD_TRANSFORMATION_ASENT_P;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$STANDARD_TRANSFORMATION_ASENT_P;
    private static final SubLSymbol $sym17$HL_SUPPORT_SENTENCE;
    private static final SubLSymbol $sym18$ABDUCED_TERM_P;
    private static final SubLSymbol $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$MAKE_ISA_X_THING_ASENT;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_;
    private static final SubLSymbol $sym24$ABDUCTION_SUPPORT_P;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLString $str27$Failed_to_remove_conjunct;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw30$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw31$ALLOWED_RULES;
    private static final SubLSymbol $kw32$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLFloat $float33$0_95;
    private static final SubLSymbol $kw34$RETURN;
    private static final SubLSymbol $kw35$BINDINGS_AND_SUPPORTS;
    private static final SubLObject $const36$UniversalVocabularyMt;
    private static final SubLObject $const37$isa;
    private static final SubLList $list38;
    private static final SubLString $str39$_VAR;
    private static final SubLSymbol $sym40$_ABDUCED_TERM_TO_RANDOM_VARIABLE_CACHING_STATE_;
    private static final SubLSymbol $sym41$ISA_VAR_FORT_LIT_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 1262L)
    public static SubLObject generate_deep_inference(final SubLObject n) {
        if (n.isZero()) {
            final SubLObject gaf = assertions_high.random_gaf();
            return uncanonicalizer.assertion_el_ist_formula(gaf);
        }
        initialize_deep_inference_gaf_table((SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject gaf = hash_table_utilities.random_hash_table_key_with_value(deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue(), n, (SubLObject)deep_inference_generator.UNPROVIDED);
        if (deep_inference_generator.NIL != gaf) {
            return uncanonicalizer.assertion_el_ist_formula(gaf);
        }
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 2585L)
    public static SubLObject initialize_deep_inference_gaf_table(SubLObject recomputeP) {
        if (recomputeP == deep_inference_generator.UNPROVIDED) {
            recomputeP = (SubLObject)deep_inference_generator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue().isHashtable() && deep_inference_generator.NIL == recomputeP) {
            return deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue();
        }
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)deep_inference_generator.$str3$Looking_for_deeply_deduced_gafs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)deep_inference_generator.ZERO_INTEGER;
        assert deep_inference_generator.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)deep_inference_generator.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)deep_inference_generator.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)deep_inference_generator.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (deep_inference_generator.NIL == id_index.id_index_objects_empty_p(idx_$1, (SubLObject)deep_inference_generator.$kw5$SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (deep_inference_generator.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)deep_inference_generator.$kw5$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = (SubLObject)deep_inference_generator.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject _prev_bind_0_$3;
                        SubLObject depth;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)deep_inference_generator.NIL, v_iteration = (SubLObject)deep_inference_generator.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)deep_inference_generator.ONE_INTEGER)) {
                            a_id = ((deep_inference_generator.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)deep_inference_generator.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (deep_inference_generator.NIL == id_index.id_index_tombstone_p(a_handle) || deep_inference_generator.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deep_inference_generator.$kw5$SKIP)) {
                                if (deep_inference_generator.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)deep_inference_generator.$kw5$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (deep_inference_generator.NIL != assertions_high.gaf_assertionP(ass) && deep_inference_generator.NIL != assertions_high.deduced_assertionP(ass) && deep_inference_generator.NIL == assertions_high.asserted_assertionP(ass)) {
                                    _prev_bind_0_$3 = deep_inference_generator.$deep_inference_recursion_stack$.currentBinding(thread);
                                    try {
                                        deep_inference_generator.$deep_inference_recursion_stack$.bind((SubLObject)deep_inference_generator.NIL, thread);
                                        depth = assertion_provability_depth(ass);
                                        if (depth.isPositive()) {
                                            Hashtables.sethash(ass, deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue(), depth);
                                        }
                                    }
                                    finally {
                                        deep_inference_generator.$deep_inference_recursion_stack$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)deep_inference_generator.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if (deep_inference_generator.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3) || deep_inference_generator.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deep_inference_generator.$kw5$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$3);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$3);
                        final SubLObject v_default = (SubLObject)((deep_inference_generator.NIL != id_index.id_index_skip_tombstones_p((SubLObject)deep_inference_generator.$kw5$SKIP)) ? deep_inference_generator.NIL : deep_inference_generator.$kw5$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (deep_inference_generator.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deep_inference_generator.$kw5$SKIP) || deep_inference_generator.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (deep_inference_generator.NIL != assertions_high.gaf_assertionP(ass2) && deep_inference_generator.NIL != assertions_high.deduced_assertionP(ass2) && deep_inference_generator.NIL == assertions_high.asserted_assertionP(ass2)) {
                                    final SubLObject _prev_bind_0_$4 = deep_inference_generator.$deep_inference_recursion_stack$.currentBinding(thread);
                                    try {
                                        deep_inference_generator.$deep_inference_recursion_stack$.bind((SubLObject)deep_inference_generator.NIL, thread);
                                        final SubLObject depth2 = assertion_provability_depth(ass2);
                                        if (depth2.isPositive()) {
                                            Hashtables.sethash(ass2, deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue(), depth2);
                                        }
                                    }
                                    finally {
                                        deep_inference_generator.$deep_inference_recursion_stack$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)deep_inference_generator.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)deep_inference_generator.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)deep_inference_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 3245L)
    public static SubLObject assertion_provability_depth(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (deep_inference_generator.NIL != subl_promotions.memberP(assertion, deep_inference_generator.$deep_inference_recursion_stack$.getDynamicValue(thread), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
            return (SubLObject)deep_inference_generator.ZERO_INTEGER;
        }
        SubLObject depth = (SubLObject)deep_inference_generator.NIL;
        final SubLObject _prev_bind_0 = deep_inference_generator.$deep_inference_recursion_stack$.currentBinding(thread);
        try {
            deep_inference_generator.$deep_inference_recursion_stack$.bind((SubLObject)ConsesLow.cons(assertion, deep_inference_generator.$deep_inference_recursion_stack$.getDynamicValue(thread)), thread);
            if (deep_inference_generator.NIL != assertions_high.asserted_assertionP(assertion)) {
                depth = (SubLObject)deep_inference_generator.ZERO_INTEGER;
            }
            else if (deep_inference_generator.NIL == backward_rule_required_for_assertionP(assertion)) {
                depth = (SubLObject)deep_inference_generator.ZERO_INTEGER;
            }
            else {
                SubLObject max_support_depth = (SubLObject)deep_inference_generator.ZERO_INTEGER;
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                SubLObject argument = (SubLObject)deep_inference_generator.NIL;
                argument = cdolist_list_var.first();
                while (deep_inference_generator.NIL != cdolist_list_var) {
                    if (deep_inference_generator.NIL != deduction_handles.deduction_p(argument)) {
                        SubLObject cdolist_list_var_$7 = deductions_high.deduction_supports(argument);
                        SubLObject support = (SubLObject)deep_inference_generator.NIL;
                        support = cdolist_list_var_$7.first();
                        while (deep_inference_generator.NIL != cdolist_list_var_$7) {
                            if (deep_inference_generator.NIL != assertions_high.gaf_assertionP(support)) {
                                final SubLObject recursive_depth = assertion_provability_depth(support);
                                if (recursive_depth.numG(max_support_depth)) {
                                    max_support_depth = recursive_depth;
                                }
                            }
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            support = cdolist_list_var_$7.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    argument = cdolist_list_var.first();
                }
                depth = number_utilities.f_1X(max_support_depth);
            }
        }
        finally {
            deep_inference_generator.$deep_inference_recursion_stack$.rebind(_prev_bind_0, thread);
        }
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 4179L)
    public static SubLObject backward_rule_required_for_assertionP(final SubLObject assertion) {
        SubLObject deducible_via_backward_ruleP = (SubLObject)deep_inference_generator.NIL;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = (SubLObject)deep_inference_generator.NIL;
        argument = cdolist_list_var.first();
        while (deep_inference_generator.NIL != cdolist_list_var) {
            if (deep_inference_generator.NIL == deduction_handles.deduction_p(argument) || deep_inference_generator.NIL == backward_rule_deductionP(argument)) {
                return (SubLObject)deep_inference_generator.NIL;
            }
            deducible_via_backward_ruleP = (SubLObject)deep_inference_generator.T;
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return deducible_via_backward_ruleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 4601L)
    public static SubLObject backward_rule_deductionP(final SubLObject deduction) {
        SubLObject backward_requiredP = (SubLObject)deep_inference_generator.NIL;
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = (SubLObject)deep_inference_generator.NIL;
        support = cdolist_list_var.first();
        while (deep_inference_generator.NIL != cdolist_list_var) {
            if (deep_inference_generator.NIL != assertions_high.backward_ruleP(support)) {
                backward_requiredP = (SubLObject)deep_inference_generator.T;
            }
            else if (deep_inference_generator.NIL != assertions_high.forward_ruleP(support)) {
                return (SubLObject)deep_inference_generator.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return backward_requiredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 5755L)
    public static SubLObject haystack_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(deep_inference_generator.NIL != list_utilities.doubletonP(v_object) && deep_inference_generator.NIL != el_utilities.ist_sentence_p(v_object.first(), (SubLObject)deep_inference_generator.UNPROVIDED) && conses_high.second(v_object).isCons() && deep_inference_generator.NIL != list_utilities.every_in_list((SubLObject)deep_inference_generator.$sym8$RULE_ASSERTION_, conses_high.second(v_object), (SubLObject)deep_inference_generator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 5950L)
    public static SubLObject interesting_haystack_p(final SubLObject haystack) {
        final SubLObject mts = Mapping.mapcar((SubLObject)deep_inference_generator.$sym9$ASSERTION_MT, haystack_rules(haystack));
        if (deep_inference_generator.NIL != list_utilities.intersectP(mts, deep_inference_generator.$totally_uninteresting_haystack_mts$.getGlobalValue(), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
            return (SubLObject)deep_inference_generator.NIL;
        }
        if (haystack_size(haystack).numGE((SubLObject)deep_inference_generator.TWO_INTEGER) && deep_inference_generator.NIL != list_utilities.singletonP(Sequences.remove_duplicates(mts, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) && deep_inference_generator.NIL != subl_promotions.memberP(mts.first(), deep_inference_generator.$somewhat_uninteresting_haystack_mts$.getGlobalValue(), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
            return (SubLObject)deep_inference_generator.NIL;
        }
        return (SubLObject)deep_inference_generator.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6414L)
    public static SubLObject haystack_query(final SubLObject haystack) {
        return haystack.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6482L)
    public static SubLObject haystack_rules(final SubLObject haystack) {
        return conses_high.second(haystack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6551L)
    public static SubLObject haystack_size(final SubLObject haystack) {
        return Sequences.length(haystack_rules(haystack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6636L)
    public static SubLObject straw_p(final SubLObject v_object) {
        return list_utilities.tripleP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6765L)
    public static SubLObject generate_haystack(final SubLObject n) {
        assert deep_inference_generator.NIL != subl_promotions.positive_integer_p(n) : n;
        SubLObject haystack;
        for (haystack = (SubLObject)deep_inference_generator.NIL; deep_inference_generator.NIL == haystack; haystack = generate_haystack_int(n)) {}
        return fix_haystack_variables(collapse_haystack(haystack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6994L)
    public static SubLObject collapse_haystack(final SubLObject haystack) {
        final SubLObject rules = haystack_rules(haystack);
        final SubLObject rule_mts = Mapping.mapcar((SubLObject)deep_inference_generator.$sym9$ASSERTION_MT, rules);
        final SubLObject mts = genl_mts.max_floor_mts(rule_mts, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
        SubLObject mt = (SubLObject)deep_inference_generator.NIL;
        if (deep_inference_generator.NIL != list_utilities.singletonP(mts)) {
            mt = mts.first();
        }
        else {
            mt = deep_inference_generator.$const11$InferencePSC;
        }
        final SubLObject old_ist_sentence = haystack_query(haystack);
        final SubLObject sentence = el_utilities.designated_sentence(old_ist_sentence);
        final SubLObject new_ist_sentence = el_utilities.make_ist_sentence(mt, sentence);
        final SubLObject new_haystack = (SubLObject)ConsesLow.list(new_ist_sentence, rules);
        return new_haystack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 7528L)
    public static SubLObject fix_haystack_variables(final SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_query = haystack_query(haystack);
        final SubLObject implication = el_utilities.designated_sentence(ist_query);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(implication, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject rules = haystack_rules(haystack);
        SubLObject variable_map = (SubLObject)deep_inference_generator.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(antecedent, (SubLObject)deep_inference_generator.$kw12$IGNORE);
        SubLObject conjunct = (SubLObject)deep_inference_generator.NIL;
        conjunct = cdolist_list_var.first();
        while (deep_inference_generator.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = rules;
            SubLObject rule = (SubLObject)deep_inference_generator.NIL;
            rule = cdolist_list_var_$8.first();
            while (deep_inference_generator.NIL != cdolist_list_var_$8) {
                SubLObject cdolist_list_var_$9 = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                SubLObject rule_asent = (SubLObject)deep_inference_generator.NIL;
                rule_asent = cdolist_list_var_$9.first();
                while (deep_inference_generator.NIL != cdolist_list_var_$9) {
                    thread.resetMultipleValues();
                    final SubLObject hl_bindings = unification.unify(conjunct, rule_asent, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                    final SubLObject hl_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (deep_inference_generator.NIL != hl_bindings) {
                        SubLObject cdolist_list_var_$10 = hl_bindings;
                        SubLObject hl_binding = (SubLObject)deep_inference_generator.NIL;
                        hl_binding = cdolist_list_var_$10.first();
                        while (deep_inference_generator.NIL != cdolist_list_var_$10) {
                            SubLObject current;
                            final SubLObject datum = current = hl_binding;
                            SubLObject rule_hl_var = (SubLObject)deep_inference_generator.NIL;
                            SubLObject haystack_var = (SubLObject)deep_inference_generator.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deep_inference_generator.$list13);
                            rule_hl_var = current.first();
                            current = (haystack_var = current.rest());
                            if (deep_inference_generator.NIL != cycl_grammar.hl_variable_p(rule_hl_var) && deep_inference_generator.NIL != cycl_grammar.el_variable_p(haystack_var) && deep_inference_generator.NIL == list_utilities.alist_lookup(variable_map, haystack_var, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
                                final SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el(rule, rule_hl_var);
                                if (deep_inference_generator.NIL == list_utilities.alist_reverse_lookup(variable_map, rule_el_var, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
                                    final SubLObject el_binding = bindings.make_variable_binding(haystack_var, rule_el_var);
                                    variable_map = (SubLObject)ConsesLow.cons(el_binding, variable_map);
                                }
                            }
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            hl_binding = cdolist_list_var_$10.first();
                        }
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    rule_asent = cdolist_list_var_$9.first();
                }
                SubLObject cdolist_list_var_$11 = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                rule_asent = (SubLObject)deep_inference_generator.NIL;
                rule_asent = cdolist_list_var_$11.first();
                while (deep_inference_generator.NIL != cdolist_list_var_$11) {
                    thread.resetMultipleValues();
                    final SubLObject hl_bindings = unification.unify(conjunct, rule_asent, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                    final SubLObject hl_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (deep_inference_generator.NIL != hl_bindings) {
                        SubLObject cdolist_list_var_$12 = hl_bindings;
                        SubLObject hl_binding = (SubLObject)deep_inference_generator.NIL;
                        hl_binding = cdolist_list_var_$12.first();
                        while (deep_inference_generator.NIL != cdolist_list_var_$12) {
                            SubLObject current;
                            final SubLObject datum = current = hl_binding;
                            SubLObject rule_hl_var = (SubLObject)deep_inference_generator.NIL;
                            SubLObject haystack_var = (SubLObject)deep_inference_generator.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deep_inference_generator.$list13);
                            rule_hl_var = current.first();
                            current = (haystack_var = current.rest());
                            if (deep_inference_generator.NIL != cycl_grammar.hl_variable_p(rule_hl_var) && deep_inference_generator.NIL != cycl_grammar.el_variable_p(haystack_var) && deep_inference_generator.NIL == list_utilities.alist_lookup(variable_map, haystack_var, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
                                final SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el(rule, rule_hl_var);
                                if (deep_inference_generator.NIL == list_utilities.alist_reverse_lookup(variable_map, rule_el_var, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED)) {
                                    final SubLObject el_binding = bindings.make_variable_binding(haystack_var, rule_el_var);
                                    variable_map = (SubLObject)ConsesLow.cons(el_binding, variable_map);
                                }
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            hl_binding = cdolist_list_var_$12.first();
                        }
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    rule_asent = cdolist_list_var_$11.first();
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                rule = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        final SubLObject new_query = cycl_utilities.expression_sublis(variable_map, ist_query, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject new_haystack = (SubLObject)ConsesLow.list(new_query, rules);
        return new_haystack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 8697L)
    public static SubLObject generate_haystack_int(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert deep_inference_generator.NIL != subl_promotions.positive_integer_p(n) : n;
        SubLObject frustration = (SubLObject)deep_inference_generator.ZERO_INTEGER;
        SubLObject haystack = (SubLObject)deep_inference_generator.NIL;
        SubLObject straw = (SubLObject)deep_inference_generator.NIL;
        while (!n.numE(haystack_size(haystack))) {
            thread.resetMultipleValues();
            final SubLObject new_haystack = grow_haystack(haystack, straw);
            final SubLObject new_straw = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (deep_inference_generator.NIL != new_haystack) {
                if (deep_inference_generator.NIL != interesting_haystack_p(new_haystack)) {
                    frustration = (SubLObject)deep_inference_generator.ZERO_INTEGER;
                    haystack = new_haystack;
                    straw = new_straw;
                }
                else {
                    haystack = (SubLObject)deep_inference_generator.NIL;
                    straw = (SubLObject)deep_inference_generator.NIL;
                }
            }
            else {
                frustration = Numbers.add(frustration, (SubLObject)deep_inference_generator.ONE_INTEGER);
            }
            if (deep_inference_generator.NIL != abort_haystackP(haystack, frustration)) {
                haystack = (SubLObject)deep_inference_generator.NIL;
                straw = (SubLObject)deep_inference_generator.NIL;
            }
        }
        return haystack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 9453L)
    public static SubLObject abort_haystackP(final SubLObject haystack, final SubLObject frustration) {
        return Numbers.numG(frustration, Numbers.multiply((SubLObject)deep_inference_generator.FIVE_INTEGER, haystack_size(haystack)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 9707L)
    public static SubLObject grow_haystack(SubLObject haystack, final SubLObject straw) {
        final SubLObject needle = choose_next_needle(straw);
        if (deep_inference_generator.NIL != needle) {
            final SubLObject next_straw = generate_straw_from_needle(needle);
            if (deep_inference_generator.NIL != next_straw) {
                haystack = add_straw_to_haystack(haystack, needle, next_straw);
                if (deep_inference_generator.NIL != verify_haystack(haystack, (SubLObject)deep_inference_generator.UNPROVIDED)) {
                    return Values.values(haystack, next_straw);
                }
            }
        }
        return Values.values((SubLObject)deep_inference_generator.NIL, (SubLObject)deep_inference_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 10217L)
    public static SubLObject choose_random_needle() {
        SubLObject needle;
        SubLObject neg_lit = null;
        for (needle = (SubLObject)deep_inference_generator.NIL; deep_inference_generator.NIL == needle; needle = el_utilities.make_ist_sentence(deep_inference_generator.$const11$InferencePSC, neg_lit)) {
            final SubLObject rule = assertions_high.random_rule();
            SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(rule));
            neg_lits = Sequences.remove_if((SubLObject)deep_inference_generator.$sym14$NONSTANDARD_TRANSFORMATION_ASENT_P, neg_lits, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
            if (deep_inference_generator.NIL != neg_lits) {
                neg_lit = cycl_utilities.hl_to_el(list_utilities.random_element(neg_lits));
            }
        }
        return needle;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 10617L)
    public static SubLObject choose_next_needle(final SubLObject straw) {
        if (deep_inference_generator.NIL == straw) {
            return choose_random_needle();
        }
        SubLObject hypothetical_bindings = (SubLObject)deep_inference_generator.NIL;
        SubLObject abduced_supports = (SubLObject)deep_inference_generator.NIL;
        SubLObject rules = (SubLObject)deep_inference_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(straw, straw, (SubLObject)deep_inference_generator.$list15);
        hypothetical_bindings = straw.first();
        SubLObject current = straw.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, straw, (SubLObject)deep_inference_generator.$list15);
        abduced_supports = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, straw, (SubLObject)deep_inference_generator.$list15);
        rules = current.first();
        current = current.rest();
        if (deep_inference_generator.NIL == current) {
            final SubLObject support_sentences = list_utilities.remove_if_not((SubLObject)deep_inference_generator.$sym16$STANDARD_TRANSFORMATION_ASENT_P, Mapping.mapcar((SubLObject)deep_inference_generator.$sym17$HL_SUPPORT_SENTENCE, abduced_supports), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
            SubLObject asent = list_utilities.random_element(support_sentences);
            if (deep_inference_generator.NIL != asent) {
                asent = bindings.apply_bindings_backwards(hypothetical_bindings, asent);
                asent = cycl_utilities.expression_transform(asent, (SubLObject)deep_inference_generator.$sym18$ABDUCED_TERM_P, (SubLObject)deep_inference_generator.$sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                final SubLObject next_needle = el_utilities.make_ist_sentence(deep_inference_generator.$const11$InferencePSC, asent);
                return next_needle;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(straw, (SubLObject)deep_inference_generator.$list15);
        }
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 11682L)
    public static SubLObject generate_straw_from_needle(final SubLObject needle) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vars = el_utilities.sentence_free_variables(needle, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject neg_lits = Mapping.mapcar((SubLObject)deep_inference_generator.$sym21$MAKE_ISA_X_THING_ASENT, vars);
        final SubLObject consequent = el_utilities.designated_sentence(needle);
        final SubLObject mt = deep_inference_generator.$const11$InferencePSC;
        final SubLObject query = el_utilities.make_implication(el_utilities.make_conjunction(neg_lits), consequent);
        SubLObject straw = (SubLObject)deep_inference_generator.NIL;
        thread.resetMultipleValues();
        final SubLObject bindings_and_hypothetical_bindings = inference_kernel.new_cyc_query(query, mt, deep_inference_generator.$straw_seeking_query_properties$.getGlobalValue());
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (deep_inference_generator.NIL != bindings_and_hypothetical_bindings) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_hypothetical_bindings;
            SubLObject result = (SubLObject)deep_inference_generator.NIL;
            SubLObject hypothetical_bindings = (SubLObject)deep_inference_generator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deep_inference_generator.$list22);
            result = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deep_inference_generator.$list22);
            hypothetical_bindings = current.first();
            current = current.rest();
            if (deep_inference_generator.NIL == current) {
                if (deep_inference_generator.NIL != result) {
                    final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, (SubLObject)deep_inference_generator.ZERO_INTEGER);
                    final SubLObject rule_justifications = list_utilities.remove_if_not((SubLObject)deep_inference_generator.$sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_, inference_datastructures_inference.inference_answer_justifications(v_answer), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                    if (deep_inference_generator.NIL != rule_justifications) {
                        final SubLObject justification = list_utilities.random_element(rule_justifications);
                        final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                        final SubLObject rules = list_utilities.remove_if_not((SubLObject)deep_inference_generator.$sym8$RULE_ASSERTION_, supports, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                        final SubLObject abduced_supports = list_utilities.remove_if_not((SubLObject)deep_inference_generator.$sym24$ABDUCTION_SUPPORT_P, supports, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                        straw = (SubLObject)ConsesLow.list(hypothetical_bindings, abduced_supports, rules);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deep_inference_generator.$list22);
            }
        }
        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
        return straw;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 13026L)
    public static SubLObject add_straw_to_haystack(final SubLObject haystack, final SubLObject new_needle, final SubLObject new_straw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_bindings = (SubLObject)deep_inference_generator.NIL;
        SubLObject abduced_supports = (SubLObject)deep_inference_generator.NIL;
        SubLObject new_rules = (SubLObject)deep_inference_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(new_straw, new_straw, (SubLObject)deep_inference_generator.$list25);
        hypothetical_bindings = new_straw.first();
        SubLObject current = new_straw.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, new_straw, (SubLObject)deep_inference_generator.$list25);
        abduced_supports = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, new_straw, (SubLObject)deep_inference_generator.$list25);
        new_rules = current.first();
        current = current.rest();
        if (deep_inference_generator.NIL == current) {
            SubLObject new_conjuncts = Mapping.mapcar((SubLObject)deep_inference_generator.$sym17$HL_SUPPORT_SENTENCE, abduced_supports);
            new_conjuncts = bindings.apply_bindings_backwards(hypothetical_bindings, new_conjuncts);
            new_conjuncts = cycl_utilities.expression_transform(new_conjuncts, (SubLObject)deep_inference_generator.$sym18$ABDUCED_TERM_P, (SubLObject)deep_inference_generator.$sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
            if (deep_inference_generator.NIL == haystack) {
                final SubLObject consequent = el_utilities.designated_sentence(new_needle);
                final SubLObject mt = deep_inference_generator.$const11$InferencePSC;
                final SubLObject implication = el_utilities.make_implication(el_utilities.make_conjunction(new_conjuncts), consequent);
                return (SubLObject)ConsesLow.list(el_utilities.make_ist_sentence(mt, implication), new_rules);
            }
            SubLObject haystack_ist_sentence = (SubLObject)deep_inference_generator.NIL;
            SubLObject haystack_rules = (SubLObject)deep_inference_generator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(haystack, haystack, (SubLObject)deep_inference_generator.$list26);
            haystack_ist_sentence = haystack.first();
            SubLObject current_$14 = haystack.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$14, haystack, (SubLObject)deep_inference_generator.$list26);
            haystack_rules = current_$14.first();
            current_$14 = current_$14.rest();
            if (deep_inference_generator.NIL == current_$14) {
                final SubLObject haystack_mt = el_utilities.designated_mt(haystack_ist_sentence);
                final SubLObject haystack_implication = el_utilities.designated_sentence(haystack_ist_sentence);
                final SubLObject haystack_consequent = cycl_utilities.formula_arg2(haystack_implication, (SubLObject)deep_inference_generator.UNPROVIDED);
                final SubLObject haystack_antecedent = cycl_utilities.formula_arg1(haystack_implication, (SubLObject)deep_inference_generator.UNPROVIDED);
                final SubLObject haystack_conjuncts = cycl_utilities.formula_args(haystack_antecedent, (SubLObject)deep_inference_generator.UNPROVIDED);
                final SubLObject new_asent = el_utilities.designated_sentence(new_needle);
                final SubLObject reduced_conjuncts = Sequences.remove(new_asent, haystack_conjuncts, Symbols.symbol_function((SubLObject)deep_inference_generator.EQUAL), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
                if (deep_inference_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && haystack_conjuncts.equal(reduced_conjuncts)) {
                    Errors.error((SubLObject)deep_inference_generator.$str27$Failed_to_remove_conjunct);
                }
                final SubLObject expanded_conjuncts = ConsesLow.append(reduced_conjuncts, new_conjuncts);
                final SubLObject expanded_implication = el_utilities.make_implication(simplifier.conjoin(expanded_conjuncts, (SubLObject)deep_inference_generator.UNPROVIDED), haystack_consequent);
                return (SubLObject)ConsesLow.list(el_utilities.make_ist_sentence(haystack_mt, expanded_implication), ConsesLow.append(haystack_rules, new_rules));
            }
            cdestructuring_bind.cdestructuring_bind_error(haystack, (SubLObject)deep_inference_generator.$list26);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(new_straw, (SubLObject)deep_inference_generator.$list25);
        }
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 14803L)
    public static SubLObject verify_haystack(final SubLObject haystack, SubLObject n) {
        if (n == deep_inference_generator.UNPROVIDED) {
            n = (SubLObject)deep_inference_generator.NIL;
        }
        inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
        if (deep_inference_generator.NIL == haystack) {
            return (SubLObject)deep_inference_generator.NIL;
        }
        if (deep_inference_generator.NIL != n && deep_inference_generator.NIL == list_utilities.lengthE(haystack_rules(haystack), n, (SubLObject)deep_inference_generator.UNPROVIDED)) {
            return (SubLObject)deep_inference_generator.NIL;
        }
        SubLObject verifiedP = (SubLObject)deep_inference_generator.NIL;
        SubLObject ist_sentence = (SubLObject)deep_inference_generator.NIL;
        SubLObject rules = (SubLObject)deep_inference_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(haystack, haystack, (SubLObject)deep_inference_generator.$list28);
        ist_sentence = haystack.first();
        SubLObject current = haystack.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, haystack, (SubLObject)deep_inference_generator.$list28);
        rules = current.first();
        current = current.rest();
        if (deep_inference_generator.NIL == current) {
            final SubLObject n_$15 = Sequences.length(rules);
            verifiedP = (SubLObject)SubLObjectFactory.makeBoolean(deep_inference_generator.NIL == inference_kernel.new_cyc_query(ist_sentence, (SubLObject)deep_inference_generator.NIL, (SubLObject)ConsesLow.list((SubLObject)deep_inference_generator.$kw29$CONDITIONAL_SENTENCE_, (SubLObject)deep_inference_generator.T, (SubLObject)deep_inference_generator.$kw30$MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_(n_$15), (SubLObject)deep_inference_generator.$kw31$ALLOWED_RULES, rules)) && deep_inference_generator.NIL == inference_kernel.new_cyc_query(ist_sentence, (SubLObject)deep_inference_generator.NIL, (SubLObject)ConsesLow.list((SubLObject)deep_inference_generator.$kw29$CONDITIONAL_SENTENCE_, (SubLObject)deep_inference_generator.T, (SubLObject)deep_inference_generator.$kw30$MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_(n_$15))) && deep_inference_generator.NIL != look_for_needle_in_haystack(haystack, (SubLObject)deep_inference_generator.T));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(haystack, (SubLObject)deep_inference_generator.$list28);
        }
        return verifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 15520L)
    public static SubLObject look_for_needle_in_haystack(final SubLObject haystack, SubLObject cheatP) {
        if (cheatP == deep_inference_generator.UNPROVIDED) {
            cheatP = (SubLObject)deep_inference_generator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
        SubLObject ist_sentence = (SubLObject)deep_inference_generator.NIL;
        SubLObject rules = (SubLObject)deep_inference_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(haystack, haystack, (SubLObject)deep_inference_generator.$list28);
        ist_sentence = haystack.first();
        SubLObject current = haystack.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, haystack, (SubLObject)deep_inference_generator.$list28);
        rules = current.first();
        current = current.rest();
        if (deep_inference_generator.NIL == current) {
            final SubLObject n = Sequences.length(rules);
            SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)deep_inference_generator.$kw29$CONDITIONAL_SENTENCE_, (SubLObject)deep_inference_generator.T, (SubLObject)deep_inference_generator.$kw30$MAX_TRANSFORMATION_DEPTH, n, (SubLObject)deep_inference_generator.$kw32$PROBABLY_APPROXIMATELY_DONE, (SubLObject)deep_inference_generator.$float33$0_95, (SubLObject)deep_inference_generator.$kw34$RETURN, (SubLObject)deep_inference_generator.$kw35$BINDINGS_AND_SUPPORTS);
            SubLObject time = (SubLObject)deep_inference_generator.NIL;
            SubLObject result = (SubLObject)deep_inference_generator.NIL;
            SubLObject halt_reason = (SubLObject)deep_inference_generator.NIL;
            if (deep_inference_generator.NIL != cheatP) {
                query_properties = conses_high.putf(query_properties, (SubLObject)deep_inference_generator.$kw31$ALLOWED_RULES, rules);
            }
            final SubLObject time_var = Time.get_internal_real_time();
            thread.resetMultipleValues();
            final SubLObject result_$16 = inference_kernel.new_cyc_query(ist_sentence, (SubLObject)deep_inference_generator.NIL, query_properties);
            final SubLObject halt_reason_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$16;
            halt_reason = halt_reason_$17;
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            return Values.values((SubLObject)((deep_inference_generator.NIL != result) ? time : deep_inference_generator.NIL), halt_reason);
        }
        cdestructuring_bind.cdestructuring_bind_error(haystack, (SubLObject)deep_inference_generator.$list28);
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16223L)
    public static SubLObject nonstandard_transformation_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(deep_inference_generator.NIL == standard_transformation_asent_p(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16373L)
    public static SubLObject standard_transformation_asent_p(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean(deep_inference_generator.NIL != forts.fort_p(pred) && deep_inference_generator.NIL != hl_supports.non_hl_predicate_p(pred) && deep_inference_generator.NIL == kb_accessors.backchain_forbiddenP(pred, deep_inference_generator.$const36$UniversalVocabularyMt) && deep_inference_generator.NIL == relation_evaluation.evaluatable_predicateP(pred, deep_inference_generator.$const36$UniversalVocabularyMt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16706L)
    public static SubLObject make_isa_x_thing_asent(final SubLObject x) {
        return (SubLObject)ConsesLow.listS(deep_inference_generator.$const37$isa, x, (SubLObject)deep_inference_generator.$list38);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16779L)
    public static SubLObject inference_answer_justification_uses_at_least_one_ruleP(final SubLObject justification) {
        return list_utilities.sublisp_boolean(Sequences.find_if((SubLObject)deep_inference_generator.$sym8$RULE_ASSERTION_, inference_datastructures_inference.inference_answer_justification_supports(justification), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
    public static SubLObject clear_abduced_term_to_random_variable() {
        final SubLObject cs = deep_inference_generator.$abduced_term_to_random_variable_caching_state$.getGlobalValue();
        if (deep_inference_generator.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
    public static SubLObject remove_abduced_term_to_random_variable(final SubLObject abduced_term) {
        return memoization_state.caching_state_remove_function_results_with_args(deep_inference_generator.$abduced_term_to_random_variable_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(abduced_term), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
    public static SubLObject abduced_term_to_random_variable_internal(final SubLObject abduced_term) {
        return cycl_variables.make_el_var(Sequences.cconcatenate((SubLObject)deep_inference_generator.$str39$_VAR, string_utilities.str(random.random(Numbers.$most_positive_fixnum$.getGlobalValue()))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
    public static SubLObject abduced_term_to_random_variable(final SubLObject abduced_term) {
        SubLObject caching_state = deep_inference_generator.$abduced_term_to_random_variable_caching_state$.getGlobalValue();
        if (deep_inference_generator.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)deep_inference_generator.$sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE, (SubLObject)deep_inference_generator.$sym40$_ABDUCED_TERM_TO_RANDOM_VARIABLE_CACHING_STATE_, (SubLObject)deep_inference_generator.NIL, (SubLObject)deep_inference_generator.EQUAL, (SubLObject)deep_inference_generator.ONE_INTEGER, (SubLObject)deep_inference_generator.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, abduced_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(abduced_term_to_random_variable_internal(abduced_term)));
            memoization_state.caching_state_put(caching_state, abduced_term, results, (SubLObject)deep_inference_generator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 17161L)
    public static SubLObject find_good_instantiated_haystack(final SubLObject haystacks) {
        SubLObject instantiated_haystack;
        SubLObject haystack;
        for (instantiated_haystack = (SubLObject)deep_inference_generator.NIL; deep_inference_generator.NIL == instantiated_haystack; instantiated_haystack = instantiate_haystack_if_good(haystack)) {
            haystack = list_utilities.random_element(haystacks);
        }
        return instantiated_haystack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 17616L)
    public static SubLObject instantiate_haystack_if_good(final SubLObject haystack) {
        final SubLObject instantiated_haystack = instantiate_haystack(haystack);
        if (deep_inference_generator.NIL != look_for_needle_in_haystack(instantiated_haystack, (SubLObject)deep_inference_generator.T) && deep_inference_generator.NIL == look_for_needle_in_haystack(instantiated_haystack, (SubLObject)deep_inference_generator.NIL)) {
            return instantiated_haystack;
        }
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 17913L)
    public static SubLObject instantiate_haystack(SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_query = haystack_query(haystack);
        final SubLObject mt = el_utilities.designated_mt(ist_query);
        final SubLObject implication = el_utilities.designated_sentence(ist_query);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(implication, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject isa_lits = list_utilities.remove_if_not((SubLObject)deep_inference_generator.$sym41$ISA_VAR_FORT_LIT_, cycl_utilities.formula_args(antecedent, (SubLObject)deep_inference_generator.UNPROVIDED), (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject isa_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)deep_inference_generator.EQL), (SubLObject)deep_inference_generator.UNPROVIDED);
        SubLObject cdolist_list_var = isa_lits;
        SubLObject isa_lit = (SubLObject)deep_inference_generator.NIL;
        isa_lit = cdolist_list_var.first();
        while (deep_inference_generator.NIL != cdolist_list_var) {
            final SubLObject var = cycl_utilities.formula_arg1(isa_lit, (SubLObject)deep_inference_generator.UNPROVIDED);
            final SubLObject col = cycl_utilities.formula_arg2(isa_lit, (SubLObject)deep_inference_generator.UNPROVIDED);
            dictionary_utilities.dictionary_push(isa_dict, var, col);
            cdolist_list_var = cdolist_list_var.rest();
            isa_lit = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(isa_dict)); deep_inference_generator.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cols = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject v_term = instantiate_haystack_var(cols, mt);
            if (deep_inference_generator.NIL != v_term) {
                haystack = cycl_utilities.expression_subst(v_term, var2, haystack, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return haystack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 18779L)
    public static SubLObject instantiate_haystack_var(final SubLObject cols, final SubLObject mt) {
        return list_utilities.random_element(isa.union_all_instances(cols, mt, (SubLObject)deep_inference_generator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 18954L)
    public static SubLObject cripple_haystack(final SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject crippled_haystack = (SubLObject)deep_inference_generator.NIL;
        while (deep_inference_generator.NIL == crippled_haystack) {
            final SubLObject potentially_crippled_haystack = potentially_cripple_haystack(haystack);
            if (deep_inference_generator.NIL != potentially_crippled_haystack && deep_inference_generator.NIL == look_for_needle_in_haystack(potentially_crippled_haystack, (SubLObject)deep_inference_generator.T)) {
                thread.resetMultipleValues();
                final SubLObject time = look_for_needle_in_haystack(potentially_crippled_haystack, (SubLObject)deep_inference_generator.NIL);
                final SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (deep_inference_generator.NIL != time || deep_inference_generator.$kw32$PROBABLY_APPROXIMATELY_DONE != halt_reason) {
                    continue;
                }
                crippled_haystack = potentially_crippled_haystack;
            }
        }
        return crippled_haystack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 19791L)
    public static SubLObject potentially_cripple_haystack(final SubLObject haystack) {
        final SubLObject ist_query = haystack_query(haystack);
        final SubLObject rules = haystack_rules(haystack);
        final SubLObject mt = el_utilities.designated_mt(ist_query);
        final SubLObject implication = el_utilities.designated_sentence(ist_query);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(implication, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject consequent = cycl_utilities.sentence_arg2(implication, (SubLObject)deep_inference_generator.UNPROVIDED);
        final SubLObject conjuncts = cycl_utilities.formula_args(antecedent, (SubLObject)deep_inference_generator.UNPROVIDED);
        if (deep_inference_generator.NIL == list_utilities.singletonP(conjuncts)) {
            final SubLObject crippled_conjuncts = Sequences.remove(list_utilities.random_element(conjuncts), conjuncts, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED);
            final SubLObject crippled_antecedent = simplifier.conjoin(crippled_conjuncts, (SubLObject)deep_inference_generator.UNPROVIDED);
            final SubLObject crippled_implication = el_utilities.make_implication(crippled_antecedent, consequent);
            final SubLObject crippled_ist_query = el_utilities.make_ist_sentence(mt, crippled_implication);
            return (SubLObject)ConsesLow.list(crippled_ist_query, rules);
        }
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    public static SubLObject declare_deep_inference_generator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "generate_deep_inference", "GENERATE-DEEP-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "initialize_deep_inference_gaf_table", "INITIALIZE-DEEP-INFERENCE-GAF-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "assertion_provability_depth", "ASSERTION-PROVABILITY-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "backward_rule_required_for_assertionP", "BACKWARD-RULE-REQUIRED-FOR-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "backward_rule_deductionP", "BACKWARD-RULE-DEDUCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "haystack_p", "HAYSTACK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "interesting_haystack_p", "INTERESTING-HAYSTACK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "haystack_query", "HAYSTACK-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "haystack_rules", "HAYSTACK-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "haystack_size", "HAYSTACK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "straw_p", "STRAW-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "generate_haystack", "GENERATE-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "collapse_haystack", "COLLAPSE-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "fix_haystack_variables", "FIX-HAYSTACK-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "generate_haystack_int", "GENERATE-HAYSTACK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "abort_haystackP", "ABORT-HAYSTACK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "grow_haystack", "GROW-HAYSTACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "choose_random_needle", "CHOOSE-RANDOM-NEEDLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "choose_next_needle", "CHOOSE-NEXT-NEEDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "generate_straw_from_needle", "GENERATE-STRAW-FROM-NEEDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "add_straw_to_haystack", "ADD-STRAW-TO-HAYSTACK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "verify_haystack", "VERIFY-HAYSTACK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "look_for_needle_in_haystack", "LOOK-FOR-NEEDLE-IN-HAYSTACK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "nonstandard_transformation_asent_p", "NONSTANDARD-TRANSFORMATION-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "standard_transformation_asent_p", "STANDARD-TRANSFORMATION-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "make_isa_x_thing_asent", "MAKE-ISA-X-THING-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "inference_answer_justification_uses_at_least_one_ruleP", "INFERENCE-ANSWER-JUSTIFICATION-USES-AT-LEAST-ONE-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "clear_abduced_term_to_random_variable", "CLEAR-ABDUCED-TERM-TO-RANDOM-VARIABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "remove_abduced_term_to_random_variable", "REMOVE-ABDUCED-TERM-TO-RANDOM-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "abduced_term_to_random_variable_internal", "ABDUCED-TERM-TO-RANDOM-VARIABLE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "abduced_term_to_random_variable", "ABDUCED-TERM-TO-RANDOM-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "find_good_instantiated_haystack", "FIND-GOOD-INSTANTIATED-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "instantiate_haystack_if_good", "INSTANTIATE-HAYSTACK-IF-GOOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "instantiate_haystack", "INSTANTIATE-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "instantiate_haystack_var", "INSTANTIATE-HAYSTACK-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "cripple_haystack", "CRIPPLE-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.deep_inference_generator", "potentially_cripple_haystack", "POTENTIALLY-CRIPPLE-HAYSTACK", 1, 0, false);
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    public static SubLObject init_deep_inference_generator_file() {
        deep_inference_generator.$deep_inference_gaf_table$ = SubLFiles.deflexical("*DEEP-INFERENCE-GAF-TABLE*", (deep_inference_generator.NIL != Symbols.boundp((SubLObject)deep_inference_generator.$sym0$_DEEP_INFERENCE_GAF_TABLE_)) ? deep_inference_generator.$deep_inference_gaf_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)deep_inference_generator.$int1$212, (SubLObject)deep_inference_generator.UNPROVIDED, (SubLObject)deep_inference_generator.UNPROVIDED));
        deep_inference_generator.$deep_inference_recursion_stack$ = SubLFiles.defparameter("*DEEP-INFERENCE-RECURSION-STACK*", (SubLObject)deep_inference_generator.$kw2$UNINITIALIZED);
        deep_inference_generator.$totally_uninteresting_haystack_mts$ = SubLFiles.deflexical("*TOTALLY-UNINTERESTING-HAYSTACK-MTS*", (SubLObject)deep_inference_generator.$list6);
        deep_inference_generator.$somewhat_uninteresting_haystack_mts$ = SubLFiles.deflexical("*SOMEWHAT-UNINTERESTING-HAYSTACK-MTS*", (SubLObject)deep_inference_generator.$list7);
        deep_inference_generator.$straw_seeking_query_properties$ = SubLFiles.deflexical("*STRAW-SEEKING-QUERY-PROPERTIES*", (SubLObject)deep_inference_generator.$list20);
        deep_inference_generator.$abduced_term_to_random_variable_caching_state$ = SubLFiles.deflexical("*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*", (SubLObject)deep_inference_generator.NIL);
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    public static SubLObject setup_deep_inference_generator_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)deep_inference_generator.$sym0$_DEEP_INFERENCE_GAF_TABLE_);
        memoization_state.note_globally_cached_function((SubLObject)deep_inference_generator.$sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE);
        return (SubLObject)deep_inference_generator.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_deep_inference_generator_file();
    }
    
    @Override
	public void initializeVariables() {
        init_deep_inference_generator_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_deep_inference_generator_file();
    }
    
    static {
        me = (SubLFile)new deep_inference_generator();
        deep_inference_generator.$deep_inference_gaf_table$ = null;
        deep_inference_generator.$deep_inference_recursion_stack$ = null;
        deep_inference_generator.$totally_uninteresting_haystack_mts$ = null;
        deep_inference_generator.$somewhat_uninteresting_haystack_mts$ = null;
        deep_inference_generator.$straw_seeking_query_properties$ = null;
        deep_inference_generator.$abduced_term_to_random_variable_caching_state$ = null;
        $sym0$_DEEP_INFERENCE_GAF_TABLE_ = SubLObjectFactory.makeSymbol("*DEEP-INFERENCE-GAF-TABLE*");
        $int1$212 = SubLObjectFactory.makeInteger(212);
        $kw2$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str3$Looking_for_deeply_deduced_gafs = SubLObjectFactory.makeString("Looking for deeply deduced gafs");
        $sym4$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw5$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KleinTest2Mt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TMSLoopMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EasyTMSLoopMt")));
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DeonticReasoning-LogicMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReasoningWithTense-LogicMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReasoningWithTense-LogicMt-LinearTime")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NecessityMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReasoningWithMultiFuture-LogicMt")));
        $sym8$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym9$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym10$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $const11$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw12$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list13 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RULE-HL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HAYSTACK-VAR"));
        $sym14$NONSTANDARD_TRANSFORMATION_ASENT_P = SubLObjectFactory.makeSymbol("NONSTANDARD-TRANSFORMATION-ASENT-P");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HYPOTHETICAL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ABDUCED-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("RULES"));
        $sym16$STANDARD_TRANSFORMATION_ASENT_P = SubLObjectFactory.makeSymbol("STANDARD-TRANSFORMATION-ASENT-P");
        $sym17$HL_SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("HL-SUPPORT-SENTENCE");
        $sym18$ABDUCED_TERM_P = SubLObjectFactory.makeSymbol("ABDUCED-TERM-P");
        $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE = SubLObjectFactory.makeSymbol("ABDUCED-TERM-TO-RANDOM-VARIABLE");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), deep_inference_generator.T, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), deep_inference_generator.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeKeyword("BROWSABLE?"), deep_inference_generator.T, SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?"), deep_inference_generator.T, SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), SubLObjectFactory.makeKeyword("PROOF"), SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS") });
        $sym21$MAKE_ISA_X_THING_ASENT = SubLObjectFactory.makeSymbol("MAKE-ISA-X-THING-ASENT");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("HYPOTHETICAL-BINDINGS"));
        $sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-USES-AT-LEAST-ONE-RULE?");
        $sym24$ABDUCTION_SUPPORT_P = SubLObjectFactory.makeSymbol("ABDUCTION-SUPPORT-P");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HYPOTHETICAL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ABDUCED-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RULES"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HAYSTACK-IST-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("HAYSTACK-RULES"));
        $str27$Failed_to_remove_conjunct = SubLObjectFactory.makeString("Failed to remove conjunct");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RULES"));
        $kw29$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw30$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw31$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $kw32$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float33$0_95 = (SubLFloat)SubLObjectFactory.makeDouble(0.95);
        $kw34$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw35$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $const36$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const37$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list38 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $str39$_VAR = SubLObjectFactory.makeString("?VAR");
        $sym40$_ABDUCED_TERM_TO_RANDOM_VARIABLE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*");
        $sym41$ISA_VAR_FORT_LIT_ = SubLObjectFactory.makeSymbol("ISA-VAR-FORT-LIT?");
    }
}

/*

	Total time: 235 ms
	
*/