/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DEEP-INFERENCE-GENERATOR
 * source file: /cyc/top/cycl/inference/deep-inference-generator.lisp
 * created:     2019/07/03 17:37:43
 */
public final class deep_inference_generator extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new deep_inference_generator();

 public static final String myName = "com.cyc.cycjava.cycl.inference.deep_inference_generator";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $deep_inference_recursion_stack$ = makeSymbol("*DEEP-INFERENCE-RECURSION-STACK*");

    // deflexical
    // Don't even consider rules in any of these mts.
    /**
     * Don't even consider rules in any of these mts.
     */
    @LispMethod(comment = "Don\'t even consider rules in any of these mts.\ndeflexical")
    private static final SubLSymbol $totally_uninteresting_haystack_mts$ = makeSymbol("*TOTALLY-UNINTERESTING-HAYSTACK-MTS*");

    // deflexical
    /**
     * Any haystack of size 2 or greater that uses rules exclusively from a single
     * one of these mts will be uninteresting. However, if it uses rules from a
     * combination of them, or from some of these mts and some other mts, then it
     * might actually be interesting.
     */
    @LispMethod(comment = "Any haystack of size 2 or greater that uses rules exclusively from a single\r\none of these mts will be uninteresting. However, if it uses rules from a\r\ncombination of them, or from some of these mts and some other mts, then it\r\nmight actually be interesting.\ndeflexical\nAny haystack of size 2 or greater that uses rules exclusively from a single\none of these mts will be uninteresting. However, if it uses rules from a\ncombination of them, or from some of these mts and some other mts, then it\nmight actually be interesting.")
    private static final SubLSymbol $somewhat_uninteresting_haystack_mts$ = makeSymbol("*SOMEWHAT-UNINTERESTING-HAYSTACK-MTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $straw_seeking_query_properties$ = makeSymbol("*STRAW-SEEKING-QUERY-PROPERTIES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $deep_inference_gaf_table$ = makeSymbol("*DEEP-INFERENCE-GAF-TABLE*");

    private static final SubLInteger $int$212 = makeInteger(212);

    static private final SubLString $$$Looking_for_deeply_deduced_gafs = makeString("Looking for deeply deduced gafs");

    static private final SubLList $list6 = list(reader_make_constant_shell("KleinTest2Mt"), reader_make_constant_shell("TMSLoopMt"), reader_make_constant_shell("EasyTMSLoopMt"));

    static private final SubLList $list7 = list(reader_make_constant_shell("DeonticReasoning-LogicMt"), reader_make_constant_shell("ReasoningWithTense-LogicMt"), reader_make_constant_shell("ReasoningWithTense-LogicMt-LinearTime"), reader_make_constant_shell("NecessityMt"), reader_make_constant_shell("ReasoningWithMultiFuture-LogicMt"));

    static private final SubLSymbol $sym8$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    static private final SubLList $list13 = cons(makeSymbol("RULE-HL-VAR"), makeSymbol("HAYSTACK-VAR"));

    private static final SubLSymbol NONSTANDARD_TRANSFORMATION_ASENT_P = makeSymbol("NONSTANDARD-TRANSFORMATION-ASENT-P");

    static private final SubLList $list15 = list(makeSymbol("HYPOTHETICAL-BINDINGS"), makeSymbol("ABDUCED-SUPPORTS"), makeSymbol("RULES"));

    private static final SubLSymbol STANDARD_TRANSFORMATION_ASENT_P = makeSymbol("STANDARD-TRANSFORMATION-ASENT-P");

    private static final SubLSymbol HL_SUPPORT_SENTENCE = makeSymbol("HL-SUPPORT-SENTENCE");

    private static final SubLSymbol ABDUCED_TERM_P = makeSymbol("ABDUCED-TERM-P");

    private static final SubLSymbol ABDUCED_TERM_TO_RANDOM_VARIABLE = makeSymbol("ABDUCED-TERM-TO-RANDOM-VARIABLE");

    static private final SubLList $list20 = list(new SubLObject[]{ makeKeyword("ABDUCTION-ALLOWED?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("BROWSABLE?"), T, makeKeyword("CONDITIONAL-SENTENCE?"), T, makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"), makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS") });

    private static final SubLSymbol MAKE_ISA_X_THING_ASENT = makeSymbol("MAKE-ISA-X-THING-ASENT");

    static private final SubLList $list22 = list(makeSymbol("RESULT"), makeSymbol("HYPOTHETICAL-BINDINGS"));

    static private final SubLSymbol $sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_ = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-USES-AT-LEAST-ONE-RULE?");

    private static final SubLSymbol ABDUCTION_SUPPORT_P = makeSymbol("ABDUCTION-SUPPORT-P");

    static private final SubLList $list25 = list(makeSymbol("HYPOTHETICAL-BINDINGS"), makeSymbol("ABDUCED-SUPPORTS"), makeSymbol("NEW-RULES"));

    static private final SubLList $list26 = list(makeSymbol("HAYSTACK-IST-SENTENCE"), makeSymbol("HAYSTACK-RULES"));

    static private final SubLString $$$Failed_to_remove_conjunct = makeString("Failed to remove conjunct");

    static private final SubLList $list28 = list(makeSymbol("IST-SENTENCE"), makeSymbol("RULES"));

    private static final SubLSymbol $kw29$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$0_95 = makeDouble(0.95);

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");





    static private final SubLList $list38 = list(reader_make_constant_shell("Thing"));

    static private final SubLString $str39$_VAR = makeString("?VAR");

    public static final SubLSymbol $abduced_term_to_random_variable_caching_state$ = makeSymbol("*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*");

    private static final SubLSymbol $sym41$ISA_VAR_FORT_LIT_ = makeSymbol("ISA-VAR-FORT-LIT?");

    /**
     *
     *
     * @return 0 el-sentence-p; an #$ist query that ought to be provable with N transformations.
     * @return 1 list of rule-assertion?; an ordered list of rules that can be used to prove the query.
     */
    @LispMethod(comment = "@return 0 el-sentence-p; an #$ist query that ought to be provable with N transformations.\r\n@return 1 list of rule-assertion?; an ordered list of rules that can be used to prove the query.")
    public static final SubLObject generate_deep_inference_alt(SubLObject n) {
        if (n.isZero()) {
            {
                SubLObject gaf = assertions_high.random_gaf();
                return uncanonicalizer.assertion_el_ist_formula(gaf);
            }
        }
        com.cyc.cycjava.cycl.inference.deep_inference_generator.initialize_deep_inference_gaf_table(UNPROVIDED);
        {
            SubLObject gaf = hash_table_utilities.random_hash_table_key_with_value($deep_inference_gaf_table$.getGlobalValue(), n, UNPROVIDED);
            if (NIL != gaf) {
                return uncanonicalizer.assertion_el_ist_formula(gaf);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 el-sentence-p; an #$ist query that ought to be provable with N transformations.
     * @return 1 list of rule-assertion?; an ordered list of rules that can be used to prove the query.
     */
    @LispMethod(comment = "@return 0 el-sentence-p; an #$ist query that ought to be provable with N transformations.\r\n@return 1 list of rule-assertion?; an ordered list of rules that can be used to prove the query.")
    public static SubLObject generate_deep_inference(final SubLObject n) {
        if (n.isZero()) {
            final SubLObject gaf = assertions_high.random_gaf();
            return uncanonicalizer.assertion_el_ist_formula(gaf);
        }
        initialize_deep_inference_gaf_table(UNPROVIDED);
        final SubLObject gaf = hash_table_utilities.random_hash_table_key_with_value($deep_inference_gaf_table$.getGlobalValue(), n, UNPROVIDED);
        if (NIL != gaf) {
            return uncanonicalizer.assertion_el_ist_formula(gaf);
        }
        return NIL;
    }

    /**
     *
     *
     * @param RECOMPUTE?;
     * 		whether to recompute the whole thing if it already exists
     */
    @LispMethod(comment = "@param RECOMPUTE?;\r\n\t\twhether to recompute the whole thing if it already exists")
    public static final SubLObject initialize_deep_inference_gaf_table_alt(SubLObject recomputeP) {
        if (recomputeP == UNPROVIDED) {
            recomputeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($deep_inference_gaf_table$.getGlobalValue().isHashtable() && (NIL == recomputeP)) {
                return $deep_inference_gaf_table$.getGlobalValue();
            }
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Looking_for_deeply_deduced_gafs, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$Looking_for_deeply_deduced_gafs);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (((NIL != assertions_high.gaf_assertionP(ass)) && (NIL != assertions_high.deduced_assertionP(ass))) && (NIL == assertions_high.asserted_assertionP(ass))) {
                                            {
                                                SubLObject _prev_bind_0_1 = $deep_inference_recursion_stack$.currentBinding(thread);
                                                try {
                                                    $deep_inference_recursion_stack$.bind(NIL, thread);
                                                    {
                                                        SubLObject depth = com.cyc.cycjava.cycl.inference.deep_inference_generator.assertion_provability_depth(ass);
                                                        if (depth.isPositive()) {
                                                            sethash(ass, $deep_inference_gaf_table$.getGlobalValue(), depth);
                                                        }
                                                    }
                                                } finally {
                                                    $deep_inference_recursion_stack$.rebind(_prev_bind_0_1, thread);
                                                }
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $deep_inference_gaf_table$.getGlobalValue();
        }
    }

    /**
     *
     *
     * @param RECOMPUTE?;
     * 		whether to recompute the whole thing if it already exists
     */
    @LispMethod(comment = "@param RECOMPUTE?;\r\n\t\twhether to recompute the whole thing if it already exists")
    public static SubLObject initialize_deep_inference_gaf_table(SubLObject recomputeP) {
        if (recomputeP == UNPROVIDED) {
            recomputeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($deep_inference_gaf_table$.getGlobalValue().isHashtable() && (NIL == recomputeP)) {
            return $deep_inference_gaf_table$.getGlobalValue();
        }
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Looking_for_deeply_deduced_gafs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject _prev_bind_0_$3;
                        SubLObject depth;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (((NIL != assertions_high.gaf_assertionP(ass)) && (NIL != assertions_high.deduced_assertionP(ass))) && (NIL == assertions_high.asserted_assertionP(ass))) {
                                    _prev_bind_0_$3 = $deep_inference_recursion_stack$.currentBinding(thread);
                                    try {
                                        $deep_inference_recursion_stack$.bind(NIL, thread);
                                        depth = assertion_provability_depth(ass);
                                        if (depth.isPositive()) {
                                            sethash(ass, $deep_inference_gaf_table$.getGlobalValue(), depth);
                                        }
                                    } finally {
                                        $deep_inference_recursion_stack$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$3);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index_next_id(idx_$3);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (((NIL != assertions_high.gaf_assertionP(ass2)) && (NIL != assertions_high.deduced_assertionP(ass2))) && (NIL == assertions_high.asserted_assertionP(ass2))) {
                                    final SubLObject _prev_bind_0_$4 = $deep_inference_recursion_stack$.currentBinding(thread);
                                    try {
                                        $deep_inference_recursion_stack$.bind(NIL, thread);
                                        final SubLObject depth2 = assertion_provability_depth(ass2);
                                        if (depth2.isPositive()) {
                                            sethash(ass2, $deep_inference_gaf_table$.getGlobalValue(), depth2);
                                        }
                                    } finally {
                                        $deep_inference_recursion_stack$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return $deep_inference_gaf_table$.getGlobalValue();
    }

    /**
     *
     *
     * @return integerp; the number of backward rules via which ASSERTION was derived
     */
    @LispMethod(comment = "@return integerp; the number of backward rules via which ASSERTION was derived")
    public static final SubLObject assertion_provability_depth_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(assertion, $deep_inference_recursion_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                return ZERO_INTEGER;
            }
            {
                SubLObject depth = NIL;
                {
                    SubLObject _prev_bind_0 = $deep_inference_recursion_stack$.currentBinding(thread);
                    try {
                        $deep_inference_recursion_stack$.bind(cons(assertion, $deep_inference_recursion_stack$.getDynamicValue(thread)), thread);
                        if (NIL != assertions_high.asserted_assertionP(assertion)) {
                            depth = ZERO_INTEGER;
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.inference.deep_inference_generator.backward_rule_required_for_assertionP(assertion)) {
                                depth = ZERO_INTEGER;
                            } else {
                                {
                                    SubLObject max_support_depth = ZERO_INTEGER;
                                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                    SubLObject argument = NIL;
                                    for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                        if (NIL != deduction_handles.deduction_p(argument)) {
                                            {
                                                SubLObject cdolist_list_var_2 = deductions_high.deduction_supports(argument);
                                                SubLObject support = NIL;
                                                for (support = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , support = cdolist_list_var_2.first()) {
                                                    if (NIL != assertions_high.gaf_assertionP(support)) {
                                                        {
                                                            SubLObject recursive_depth = com.cyc.cycjava.cycl.inference.deep_inference_generator.assertion_provability_depth(support);
                                                            if (recursive_depth.numG(max_support_depth)) {
                                                                max_support_depth = recursive_depth;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    depth = number_utilities.f_1X(max_support_depth);
                                }
                            }
                        }
                    } finally {
                        $deep_inference_recursion_stack$.rebind(_prev_bind_0, thread);
                    }
                }
                return depth;
            }
        }
    }

    /**
     *
     *
     * @return integerp; the number of backward rules via which ASSERTION was derived
     */
    @LispMethod(comment = "@return integerp; the number of backward rules via which ASSERTION was derived")
    public static SubLObject assertion_provability_depth(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(assertion, $deep_inference_recursion_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        SubLObject depth = NIL;
        final SubLObject _prev_bind_0 = $deep_inference_recursion_stack$.currentBinding(thread);
        try {
            $deep_inference_recursion_stack$.bind(cons(assertion, $deep_inference_recursion_stack$.getDynamicValue(thread)), thread);
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                depth = ZERO_INTEGER;
            } else
                if (NIL == backward_rule_required_for_assertionP(assertion)) {
                    depth = ZERO_INTEGER;
                } else {
                    SubLObject max_support_depth = ZERO_INTEGER;
                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                    SubLObject argument = NIL;
                    argument = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != deduction_handles.deduction_p(argument)) {
                            SubLObject cdolist_list_var_$7 = deductions_high.deduction_supports(argument);
                            SubLObject support = NIL;
                            support = cdolist_list_var_$7.first();
                            while (NIL != cdolist_list_var_$7) {
                                if (NIL != assertions_high.gaf_assertionP(support)) {
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

        } finally {
            $deep_inference_recursion_stack$.rebind(_prev_bind_0, thread);
        }
        return depth;
    }

    /**
     *
     *
     * @return booleanp; whether a backward rule was required to deduce ASSERTION.
     */
    @LispMethod(comment = "@return booleanp; whether a backward rule was required to deduce ASSERTION.")
    public static final SubLObject backward_rule_required_for_assertionP_alt(SubLObject assertion) {
        {
            SubLObject deducible_via_backward_ruleP = NIL;
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject argument = NIL;
            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                if ((NIL != deduction_handles.deduction_p(argument)) && (NIL != com.cyc.cycjava.cycl.inference.deep_inference_generator.backward_rule_deductionP(argument))) {
                    deducible_via_backward_ruleP = T;
                } else {
                    return NIL;
                }
            }
            return deducible_via_backward_ruleP;
        }
    }

    /**
     *
     *
     * @return booleanp; whether a backward rule was required to deduce ASSERTION.
     */
    @LispMethod(comment = "@return booleanp; whether a backward rule was required to deduce ASSERTION.")
    public static SubLObject backward_rule_required_for_assertionP(final SubLObject assertion) {
        SubLObject deducible_via_backward_ruleP = NIL;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == deduction_handles.deduction_p(argument)) || (NIL == backward_rule_deductionP(argument))) {
                return NIL;
            }
            deducible_via_backward_ruleP = T;
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return deducible_via_backward_ruleP;
    }

    /**
     *
     *
     * @return booleanp; whether all of DEDUCTION's rule supports are backward, and it has at least one.
     */
    @LispMethod(comment = "@return booleanp; whether all of DEDUCTION\'s rule supports are backward, and it has at least one.")
    public static final SubLObject backward_rule_deductionP_alt(SubLObject deduction) {
        {
            SubLObject backward_requiredP = NIL;
            SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL != assertions_high.backward_ruleP(support)) {
                    backward_requiredP = T;
                } else {
                    if (NIL != assertions_high.forward_ruleP(support)) {
                        return NIL;
                    }
                }
            }
            return backward_requiredP;
        }
    }

    /**
     *
     *
     * @return booleanp; whether all of DEDUCTION's rule supports are backward, and it has at least one.
     */
    @LispMethod(comment = "@return booleanp; whether all of DEDUCTION\'s rule supports are backward, and it has at least one.")
    public static SubLObject backward_rule_deductionP(final SubLObject deduction) {
        SubLObject backward_requiredP = NIL;
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.backward_ruleP(support)) {
                backward_requiredP = T;
            } else
                if (NIL != assertions_high.forward_ruleP(support)) {
                    return NIL;
                }

            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return backward_requiredP;
    }

    public static final SubLObject haystack_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.doubletonP(v_object)) && (NIL != ist_sentence_p(v_object.first()))) && second(v_object).isCons()) && (NIL != list_utilities.every_in_list($sym8$RULE_ASSERTION_, second(v_object), UNPROVIDED)));
    }

    public static SubLObject haystack_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.doubletonP(v_object)) && (NIL != ist_sentence_p(v_object.first(), UNPROVIDED))) && second(v_object).isCons()) && (NIL != list_utilities.every_in_list($sym8$RULE_ASSERTION_, second(v_object), UNPROVIDED)));
    }

    public static final SubLObject interesting_haystack_p_alt(SubLObject haystack) {
        {
            SubLObject mts = Mapping.mapcar(ASSERTION_MT, com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_rules(haystack));
            if (NIL != list_utilities.intersectP(mts, $totally_uninteresting_haystack_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            if (com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_size(haystack).numGE(TWO_INTEGER)) {
                if (NIL != list_utilities.singletonP(remove_duplicates(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    if (NIL != subl_promotions.memberP(mts.first(), $somewhat_uninteresting_haystack_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject interesting_haystack_p(final SubLObject haystack) {
        final SubLObject mts = Mapping.mapcar(ASSERTION_MT, haystack_rules(haystack));
        if (NIL != list_utilities.intersectP(mts, $totally_uninteresting_haystack_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if ((haystack_size(haystack).numGE(TWO_INTEGER) && (NIL != list_utilities.singletonP(remove_duplicates(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != subl_promotions.memberP(mts.first(), $somewhat_uninteresting_haystack_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject haystack_query_alt(SubLObject haystack) {
        return haystack.first();
    }

    public static SubLObject haystack_query(final SubLObject haystack) {
        return haystack.first();
    }

    public static final SubLObject haystack_rules_alt(SubLObject haystack) {
        return second(haystack);
    }

    public static SubLObject haystack_rules(final SubLObject haystack) {
        return second(haystack);
    }

    public static final SubLObject haystack_size_alt(SubLObject haystack) {
        return length(com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_rules(haystack));
    }

    public static SubLObject haystack_size(final SubLObject haystack) {
        return length(haystack_rules(haystack));
    }

    /**
     * A list of the form (HYPOTHETICAL-BINDINGS ABDUCED-SUPPORTS RULES)
     */
    @LispMethod(comment = "A list of the form (HYPOTHETICAL-BINDINGS ABDUCED-SUPPORTS RULES)")
    public static final SubLObject straw_p_alt(SubLObject v_object) {
        return list_utilities.tripleP(v_object);
    }

    /**
     * A list of the form (HYPOTHETICAL-BINDINGS ABDUCED-SUPPORTS RULES)
     */
    @LispMethod(comment = "A list of the form (HYPOTHETICAL-BINDINGS ABDUCED-SUPPORTS RULES)")
    public static SubLObject straw_p(final SubLObject v_object) {
        return list_utilities.tripleP(v_object);
    }

    public static final SubLObject generate_haystack_alt(SubLObject n) {
        SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
        {
            SubLObject haystack = NIL;
            while (NIL == haystack) {
                haystack = com.cyc.cycjava.cycl.inference.deep_inference_generator.generate_haystack_int(n);
            } 
            return com.cyc.cycjava.cycl.inference.deep_inference_generator.fix_haystack_variables(com.cyc.cycjava.cycl.inference.deep_inference_generator.collapse_haystack(haystack));
        }
    }

    public static SubLObject generate_haystack(final SubLObject n) {
        assert NIL != subl_promotions.positive_integer_p(n) : "! subl_promotions.positive_integer_p(n) " + ("subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) ") + n;
        SubLObject haystack;
        for (haystack = NIL; NIL == haystack; haystack = generate_haystack_int(n)) {
        }
        return fix_haystack_variables(collapse_haystack(haystack));
    }

    /**
     * Determines the right mt for HAYSTACK
     */
    @LispMethod(comment = "Determines the right mt for HAYSTACK")
    public static final SubLObject collapse_haystack_alt(SubLObject haystack) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_rules(haystack);
            SubLObject rule_mts = Mapping.mapcar(ASSERTION_MT, rules);
            SubLObject mts = genl_mts.max_floor_mts(rule_mts, UNPROVIDED, UNPROVIDED);
            SubLObject mt = NIL;
            if (NIL != list_utilities.singletonP(mts)) {
                mt = mts.first();
            } else {
                mt = $$InferencePSC;
            }
            {
                SubLObject old_ist_sentence = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_query(haystack);
                SubLObject sentence = designated_sentence(old_ist_sentence);
                SubLObject new_ist_sentence = make_ist_sentence(mt, sentence);
                SubLObject new_haystack = list(new_ist_sentence, rules);
                return new_haystack;
            }
        }
    }

    /**
     * Determines the right mt for HAYSTACK
     */
    @LispMethod(comment = "Determines the right mt for HAYSTACK")
    public static SubLObject collapse_haystack(final SubLObject haystack) {
        final SubLObject rules = haystack_rules(haystack);
        final SubLObject rule_mts = Mapping.mapcar(ASSERTION_MT, rules);
        final SubLObject mts = genl_mts.max_floor_mts(rule_mts, UNPROVIDED, UNPROVIDED);
        SubLObject mt = NIL;
        if (NIL != list_utilities.singletonP(mts)) {
            mt = mts.first();
        } else {
            mt = $$InferencePSC;
        }
        final SubLObject old_ist_sentence = haystack_query(haystack);
        final SubLObject sentence = designated_sentence(old_ist_sentence);
        final SubLObject new_ist_sentence = make_ist_sentence(mt, sentence);
        final SubLObject new_haystack = list(new_ist_sentence, rules);
        return new_haystack;
    }

    public static final SubLObject fix_haystack_variables_alt(SubLObject haystack) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ist_query = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_query(haystack);
                SubLObject implication = designated_sentence(ist_query);
                SubLObject antecedent = cycl_utilities.sentence_arg1(implication, UNPROVIDED);
                SubLObject rules = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_rules(haystack);
                SubLObject variable_map = NIL;
                SubLObject args = cycl_utilities.formula_args(antecedent, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject conjunct = NIL;
                for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_3 = rules;
                        SubLObject rule = NIL;
                        for (rule = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , rule = cdolist_list_var_3.first()) {
                            {
                                SubLObject cdolist_list_var_4 = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                                SubLObject rule_asent = NIL;
                                for (rule_asent = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , rule_asent = cdolist_list_var_4.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject hl_bindings = unification.unify(conjunct, rule_asent, UNPROVIDED, UNPROVIDED);
                                        SubLObject hl_justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != hl_bindings) {
                                            {
                                                SubLObject cdolist_list_var_5 = hl_bindings;
                                                SubLObject hl_binding = NIL;
                                                for (hl_binding = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , hl_binding = cdolist_list_var_5.first()) {
                                                    {
                                                        SubLObject datum = hl_binding;
                                                        SubLObject current = datum;
                                                        SubLObject rule_hl_var = NIL;
                                                        SubLObject haystack_var = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                                        rule_hl_var = current.first();
                                                        current = current.rest();
                                                        haystack_var = current;
                                                        if ((NIL != cycl_grammar.hl_variable_p(rule_hl_var)) && (NIL != cycl_grammar.el_variable_p(haystack_var))) {
                                                            if (NIL == list_utilities.alist_lookup(variable_map, haystack_var, UNPROVIDED, UNPROVIDED)) {
                                                                {
                                                                    SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el(rule, rule_hl_var);
                                                                    if (NIL == list_utilities.alist_reverse_lookup(variable_map, rule_el_var, UNPROVIDED, UNPROVIDED)) {
                                                                        {
                                                                            SubLObject el_binding = bindings.make_variable_binding(haystack_var, rule_el_var);
                                                                            variable_map = cons(el_binding, variable_map);
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
                                }
                            }
                            {
                                SubLObject cdolist_list_var_6 = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                                SubLObject rule_asent = NIL;
                                for (rule_asent = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , rule_asent = cdolist_list_var_6.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject hl_bindings = unification.unify(conjunct, rule_asent, UNPROVIDED, UNPROVIDED);
                                        SubLObject hl_justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != hl_bindings) {
                                            {
                                                SubLObject cdolist_list_var_7 = hl_bindings;
                                                SubLObject hl_binding = NIL;
                                                for (hl_binding = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , hl_binding = cdolist_list_var_7.first()) {
                                                    {
                                                        SubLObject datum = hl_binding;
                                                        SubLObject current = datum;
                                                        SubLObject rule_hl_var = NIL;
                                                        SubLObject haystack_var = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                                        rule_hl_var = current.first();
                                                        current = current.rest();
                                                        haystack_var = current;
                                                        if ((NIL != cycl_grammar.hl_variable_p(rule_hl_var)) && (NIL != cycl_grammar.el_variable_p(haystack_var))) {
                                                            if (NIL == list_utilities.alist_lookup(variable_map, haystack_var, UNPROVIDED, UNPROVIDED)) {
                                                                {
                                                                    SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el(rule, rule_hl_var);
                                                                    if (NIL == list_utilities.alist_reverse_lookup(variable_map, rule_el_var, UNPROVIDED, UNPROVIDED)) {
                                                                        {
                                                                            SubLObject el_binding = bindings.make_variable_binding(haystack_var, rule_el_var);
                                                                            variable_map = cons(el_binding, variable_map);
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
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject new_query = cycl_utilities.expression_sublis(variable_map, ist_query, UNPROVIDED, UNPROVIDED);
                    SubLObject new_haystack = list(new_query, rules);
                    return new_haystack;
                }
            }
        }
    }

    public static SubLObject fix_haystack_variables(final SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_query = haystack_query(haystack);
        final SubLObject implication = designated_sentence(ist_query);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(implication, UNPROVIDED);
        final SubLObject rules = haystack_rules(haystack);
        SubLObject variable_map = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(antecedent, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = rules;
            SubLObject rule = NIL;
            rule = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                SubLObject cdolist_list_var_$9 = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                SubLObject rule_asent = NIL;
                rule_asent = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    thread.resetMultipleValues();
                    final SubLObject hl_bindings = unification.unify(conjunct, rule_asent, UNPROVIDED, UNPROVIDED);
                    final SubLObject hl_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != hl_bindings) {
                        SubLObject cdolist_list_var_$10 = hl_bindings;
                        SubLObject hl_binding = NIL;
                        hl_binding = cdolist_list_var_$10.first();
                        while (NIL != cdolist_list_var_$10) {
                            SubLObject current;
                            final SubLObject datum = current = hl_binding;
                            SubLObject rule_hl_var = NIL;
                            SubLObject haystack_var = NIL;
                            destructuring_bind_must_consp(current, datum, $list13);
                            rule_hl_var = current.first();
                            current = haystack_var = current.rest();
                            if (((NIL != cycl_grammar.hl_variable_p(rule_hl_var)) && (NIL != cycl_grammar.el_variable_p(haystack_var))) && (NIL == list_utilities.alist_lookup(variable_map, haystack_var, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el(rule, rule_hl_var);
                                if (NIL == list_utilities.alist_reverse_lookup(variable_map, rule_el_var, UNPROVIDED, UNPROVIDED)) {
                                    final SubLObject el_binding = bindings.make_variable_binding(haystack_var, rule_el_var);
                                    variable_map = cons(el_binding, variable_map);
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
                rule_asent = NIL;
                rule_asent = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    thread.resetMultipleValues();
                    final SubLObject hl_bindings = unification.unify(conjunct, rule_asent, UNPROVIDED, UNPROVIDED);
                    final SubLObject hl_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != hl_bindings) {
                        SubLObject cdolist_list_var_$12 = hl_bindings;
                        SubLObject hl_binding = NIL;
                        hl_binding = cdolist_list_var_$12.first();
                        while (NIL != cdolist_list_var_$12) {
                            SubLObject current;
                            final SubLObject datum = current = hl_binding;
                            SubLObject rule_hl_var = NIL;
                            SubLObject haystack_var = NIL;
                            destructuring_bind_must_consp(current, datum, $list13);
                            rule_hl_var = current.first();
                            current = haystack_var = current.rest();
                            if (((NIL != cycl_grammar.hl_variable_p(rule_hl_var)) && (NIL != cycl_grammar.el_variable_p(haystack_var))) && (NIL == list_utilities.alist_lookup(variable_map, haystack_var, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el(rule, rule_hl_var);
                                if (NIL == list_utilities.alist_reverse_lookup(variable_map, rule_el_var, UNPROVIDED, UNPROVIDED)) {
                                    final SubLObject el_binding = bindings.make_variable_binding(haystack_var, rule_el_var);
                                    variable_map = cons(el_binding, variable_map);
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
        final SubLObject new_query = cycl_utilities.expression_sublis(variable_map, ist_query, UNPROVIDED, UNPROVIDED);
        final SubLObject new_haystack = list(new_query, rules);
        return new_haystack;
    }

    public static final SubLObject generate_haystack_int_alt(SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
            {
                SubLObject frustration = ZERO_INTEGER;
                SubLObject haystack = NIL;
                SubLObject straw = NIL;
                while (!n.numE(com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_size(haystack))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject new_haystack = com.cyc.cycjava.cycl.inference.deep_inference_generator.grow_haystack(haystack, straw);
                        SubLObject new_straw = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != new_haystack) {
                            if (NIL != com.cyc.cycjava.cycl.inference.deep_inference_generator.interesting_haystack_p(new_haystack)) {
                                frustration = ZERO_INTEGER;
                                haystack = new_haystack;
                                straw = new_straw;
                            } else {
                                haystack = NIL;
                                straw = NIL;
                            }
                        } else {
                            frustration = add(frustration, ONE_INTEGER);
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.inference.deep_inference_generator.abort_haystackP(haystack, frustration)) {
                        haystack = NIL;
                        straw = NIL;
                    }
                } 
                return haystack;
            }
        }
    }

    public static SubLObject generate_haystack_int(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(n) : "! subl_promotions.positive_integer_p(n) " + ("subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) ") + n;
        SubLObject frustration = ZERO_INTEGER;
        SubLObject haystack = NIL;
        SubLObject straw = NIL;
        while (!n.numE(haystack_size(haystack))) {
            thread.resetMultipleValues();
            final SubLObject new_haystack = grow_haystack(haystack, straw);
            final SubLObject new_straw = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != new_haystack) {
                if (NIL != interesting_haystack_p(new_haystack)) {
                    frustration = ZERO_INTEGER;
                    haystack = new_haystack;
                    straw = new_straw;
                } else {
                    haystack = NIL;
                    straw = NIL;
                }
            } else {
                frustration = add(frustration, ONE_INTEGER);
            }
            if (NIL != abort_haystackP(haystack, frustration)) {
                haystack = NIL;
                straw = NIL;
            }
        } 
        return haystack;
    }

    /**
     * We try 5*size times to grow HAYSTACK, then give up.
     * It's proportional to the size because we have more sunk cost in a bigger haystack.
     */
    @LispMethod(comment = "We try 5*size times to grow HAYSTACK, then give up.\r\nIt\'s proportional to the size because we have more sunk cost in a bigger haystack.\nWe try 5*size times to grow HAYSTACK, then give up.\nIt\'s proportional to the size because we have more sunk cost in a bigger haystack.")
    public static final SubLObject abort_haystackP_alt(SubLObject haystack, SubLObject frustration) {
        return numG(frustration, multiply(FIVE_INTEGER, com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_size(haystack)));
    }

    /**
     * We try 5*size times to grow HAYSTACK, then give up.
     * It's proportional to the size because we have more sunk cost in a bigger haystack.
     */
    @LispMethod(comment = "We try 5*size times to grow HAYSTACK, then give up.\r\nIt\'s proportional to the size because we have more sunk cost in a bigger haystack.\nWe try 5*size times to grow HAYSTACK, then give up.\nIt\'s proportional to the size because we have more sunk cost in a bigger haystack.")
    public static SubLObject abort_haystackP(final SubLObject haystack, final SubLObject frustration) {
        return numG(frustration, multiply(FIVE_INTEGER, haystack_size(haystack)));
    }

    /**
     * Grows HAYSTACK by one straw, heading in the direction of NEEDLE.
     *
     * @param HAYSTACK
     * 		nil or haystack-p
     * @param STRAW
     * 		nil or straw-p
     */
    @LispMethod(comment = "Grows HAYSTACK by one straw, heading in the direction of NEEDLE.\r\n\r\n@param HAYSTACK\r\n\t\tnil or haystack-p\r\n@param STRAW\r\n\t\tnil or straw-p")
    public static final SubLObject grow_haystack_alt(SubLObject haystack, SubLObject straw) {
        {
            SubLObject needle = com.cyc.cycjava.cycl.inference.deep_inference_generator.choose_next_needle(straw);
            if (NIL != needle) {
                {
                    SubLObject next_straw = com.cyc.cycjava.cycl.inference.deep_inference_generator.generate_straw_from_needle(needle);
                    if (NIL != next_straw) {
                        haystack = com.cyc.cycjava.cycl.inference.deep_inference_generator.add_straw_to_haystack(haystack, needle, next_straw);
                        if (NIL != com.cyc.cycjava.cycl.inference.deep_inference_generator.verify_haystack(haystack, UNPROVIDED)) {
                            return values(haystack, next_straw);
                        }
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    /**
     * Grows HAYSTACK by one straw, heading in the direction of NEEDLE.
     *
     * @param HAYSTACK
     * 		nil or haystack-p
     * @param STRAW
     * 		nil or straw-p
     */
    @LispMethod(comment = "Grows HAYSTACK by one straw, heading in the direction of NEEDLE.\r\n\r\n@param HAYSTACK\r\n\t\tnil or haystack-p\r\n@param STRAW\r\n\t\tnil or straw-p")
    public static SubLObject grow_haystack(SubLObject haystack, final SubLObject straw) {
        final SubLObject needle = choose_next_needle(straw);
        if (NIL != needle) {
            final SubLObject next_straw = generate_straw_from_needle(needle);
            if (NIL != next_straw) {
                haystack = add_straw_to_haystack(haystack, needle, next_straw);
                if (NIL != verify_haystack(haystack, UNPROVIDED)) {
                    return values(haystack, next_straw);
                }
            }
        }
        return values(NIL, NIL);
    }

    public static final SubLObject choose_random_needle_alt() {
        {
            SubLObject needle = NIL;
            while (NIL == needle) {
                {
                    SubLObject rule = assertions_high.random_rule();
                    SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    neg_lits = remove_if(NONSTANDARD_TRANSFORMATION_ASENT_P, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != neg_lits) {
                        {
                            SubLObject neg_lit = cycl_utilities.hl_to_el(list_utilities.random_element(neg_lits));
                            needle = make_ist_sentence($$InferencePSC, neg_lit);
                        }
                    }
                }
            } 
            return needle;
        }
    }

    public static SubLObject choose_random_needle() {
        SubLObject needle;
        SubLObject neg_lit = null;
        for (needle = NIL; NIL == needle; needle = make_ist_sentence($$InferencePSC, neg_lit)) {
            final SubLObject rule = assertions_high.random_rule();
            SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(rule));
            neg_lits = remove_if(NONSTANDARD_TRANSFORMATION_ASENT_P, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != neg_lits) {
                neg_lit = cycl_utilities.hl_to_el(list_utilities.random_element(neg_lits));
            }
        }
        return needle;
    }

    /**
     * Starting from STRAW, finds a new needle.
     * If STRAW is nil, chooses a random needle.
     */
    @LispMethod(comment = "Starting from STRAW, finds a new needle.\r\nIf STRAW is nil, chooses a random needle.\nStarting from STRAW, finds a new needle.\nIf STRAW is nil, chooses a random needle.")
    public static final SubLObject choose_next_needle_alt(SubLObject straw) {
        if (NIL == straw) {
            return com.cyc.cycjava.cycl.inference.deep_inference_generator.choose_random_needle();
        }
        {
            SubLObject datum = straw;
            SubLObject current = datum;
            SubLObject hypothetical_bindings = NIL;
            SubLObject abduced_supports = NIL;
            SubLObject rules = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            hypothetical_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt15);
            abduced_supports = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt15);
            rules = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject support_sentences = list_utilities.remove_if_not(STANDARD_TRANSFORMATION_ASENT_P, Mapping.mapcar(HL_SUPPORT_SENTENCE, abduced_supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject asent = list_utilities.random_element(support_sentences);
                    if (NIL != asent) {
                        asent = bindings.apply_bindings_backwards(hypothetical_bindings, asent);
                        asent = cycl_utilities.expression_transform(asent, ABDUCED_TERM_P, ABDUCED_TERM_TO_RANDOM_VARIABLE, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject next_needle = make_ist_sentence($$InferencePSC, asent);
                            return next_needle;
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt15);
            }
        }
        return NIL;
    }

    /**
     * Starting from STRAW, finds a new needle.
     * If STRAW is nil, chooses a random needle.
     */
    @LispMethod(comment = "Starting from STRAW, finds a new needle.\r\nIf STRAW is nil, chooses a random needle.\nStarting from STRAW, finds a new needle.\nIf STRAW is nil, chooses a random needle.")
    public static SubLObject choose_next_needle(final SubLObject straw) {
        if (NIL == straw) {
            return choose_random_needle();
        }
        SubLObject hypothetical_bindings = NIL;
        SubLObject abduced_supports = NIL;
        SubLObject rules = NIL;
        destructuring_bind_must_consp(straw, straw, $list15);
        hypothetical_bindings = straw.first();
        SubLObject current = straw.rest();
        destructuring_bind_must_consp(current, straw, $list15);
        abduced_supports = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, straw, $list15);
        rules = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject support_sentences = list_utilities.remove_if_not(STANDARD_TRANSFORMATION_ASENT_P, Mapping.mapcar(HL_SUPPORT_SENTENCE, abduced_supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject asent = list_utilities.random_element(support_sentences);
            if (NIL != asent) {
                asent = bindings.apply_bindings_backwards(hypothetical_bindings, asent);
                asent = cycl_utilities.expression_transform(asent, ABDUCED_TERM_P, ABDUCED_TERM_TO_RANDOM_VARIABLE, UNPROVIDED, UNPROVIDED);
                final SubLObject next_needle = make_ist_sentence($$InferencePSC, asent);
                return next_needle;
            }
        } else {
            cdestructuring_bind_error(straw, $list15);
        }
        return NIL;
    }

    /**
     * Given NEEDLE, finds a straw leading to it.
     */
    @LispMethod(comment = "Given NEEDLE, finds a straw leading to it.")
    public static final SubLObject generate_straw_from_needle_alt(SubLObject needle) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vars = sentence_free_variables(needle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject neg_lits = Mapping.mapcar(MAKE_ISA_X_THING_ASENT, vars);
                SubLObject consequent = designated_sentence(needle);
                SubLObject mt = $$InferencePSC;
                SubLObject query = make_implication(make_conjunction(neg_lits), consequent);
                SubLObject straw = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject bindings_and_hypothetical_bindings = inference_kernel.new_cyc_query(query, mt, $straw_seeking_query_properties$.getGlobalValue());
                    SubLObject halt_reason = thread.secondMultipleValue();
                    SubLObject inference = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != bindings_and_hypothetical_bindings) {
                        {
                            SubLObject datum = bindings_and_hypothetical_bindings;
                            SubLObject current = datum;
                            SubLObject result = NIL;
                            SubLObject hypothetical_bindings = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt22);
                            result = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt22);
                            hypothetical_bindings = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != result) {
                                    {
                                        SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, ZERO_INTEGER);
                                        SubLObject rule_justifications = list_utilities.remove_if_not($sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_, inference_datastructures_inference.inference_answer_justifications(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL != rule_justifications) {
                                            {
                                                SubLObject justification = list_utilities.random_element(rule_justifications);
                                                SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                                                SubLObject rules = list_utilities.remove_if_not($sym8$RULE_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject abduced_supports = list_utilities.remove_if_not(ABDUCTION_SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                straw = list(hypothetical_bindings, abduced_supports, rules);
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt22);
                            }
                        }
                    }
                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                }
                return straw;
            }
        }
    }

    /**
     * Given NEEDLE, finds a straw leading to it.
     */
    @LispMethod(comment = "Given NEEDLE, finds a straw leading to it.")
    public static SubLObject generate_straw_from_needle(final SubLObject needle) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vars = sentence_free_variables(needle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject neg_lits = Mapping.mapcar(MAKE_ISA_X_THING_ASENT, vars);
        final SubLObject consequent = designated_sentence(needle);
        final SubLObject mt = $$InferencePSC;
        final SubLObject query = make_implication(make_conjunction(neg_lits), consequent);
        SubLObject straw = NIL;
        thread.resetMultipleValues();
        final SubLObject bindings_and_hypothetical_bindings = inference_kernel.new_cyc_query(query, mt, $straw_seeking_query_properties$.getGlobalValue());
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != bindings_and_hypothetical_bindings) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_hypothetical_bindings;
            SubLObject result = NIL;
            SubLObject hypothetical_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list22);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list22);
            hypothetical_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != result) {
                    final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, ZERO_INTEGER);
                    final SubLObject rule_justifications = list_utilities.remove_if_not($sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_, inference_datastructures_inference.inference_answer_justifications(v_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != rule_justifications) {
                        final SubLObject justification = list_utilities.random_element(rule_justifications);
                        final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                        final SubLObject rules = list_utilities.remove_if_not($sym8$RULE_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject abduced_supports = list_utilities.remove_if_not(ABDUCTION_SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        straw = list(hypothetical_bindings, abduced_supports, rules);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list22);
            }
        }
        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
        return straw;
    }

    /**
     *
     *
     * @param HAYSTACK
     * 		nil or haystack-p
     */
    @LispMethod(comment = "@param HAYSTACK\r\n\t\tnil or haystack-p")
    public static final SubLObject add_straw_to_haystack_alt(SubLObject haystack, SubLObject new_needle, SubLObject new_straw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = new_straw;
                SubLObject current = datum;
                SubLObject hypothetical_bindings = NIL;
                SubLObject abduced_supports = NIL;
                SubLObject new_rules = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt25);
                hypothetical_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt25);
                abduced_supports = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt25);
                new_rules = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject new_conjuncts = Mapping.mapcar(HL_SUPPORT_SENTENCE, abduced_supports);
                        new_conjuncts = bindings.apply_bindings_backwards(hypothetical_bindings, new_conjuncts);
                        new_conjuncts = cycl_utilities.expression_transform(new_conjuncts, ABDUCED_TERM_P, ABDUCED_TERM_TO_RANDOM_VARIABLE, UNPROVIDED, UNPROVIDED);
                        if (NIL == haystack) {
                            {
                                SubLObject consequent = designated_sentence(new_needle);
                                SubLObject mt = $$InferencePSC;
                                SubLObject implication = make_implication(make_conjunction(new_conjuncts), consequent);
                                return list(make_ist_sentence(mt, implication), new_rules);
                            }
                        } else {
                            {
                                SubLObject datum_8 = haystack;
                                SubLObject current_9 = datum_8;
                                SubLObject haystack_ist_sentence = NIL;
                                SubLObject haystack_rules = NIL;
                                destructuring_bind_must_consp(current_9, datum_8, $list_alt26);
                                haystack_ist_sentence = current_9.first();
                                current_9 = current_9.rest();
                                destructuring_bind_must_consp(current_9, datum_8, $list_alt26);
                                haystack_rules = current_9.first();
                                current_9 = current_9.rest();
                                if (NIL == current_9) {
                                    {
                                        SubLObject haystack_mt = designated_mt(haystack_ist_sentence);
                                        SubLObject haystack_implication = designated_sentence(haystack_ist_sentence);
                                        SubLObject haystack_consequent = cycl_utilities.formula_arg2(haystack_implication, UNPROVIDED);
                                        SubLObject haystack_antecedent = cycl_utilities.formula_arg1(haystack_implication, UNPROVIDED);
                                        SubLObject haystack_conjuncts = cycl_utilities.formula_args(haystack_antecedent, UNPROVIDED);
                                        SubLObject new_asent = designated_sentence(new_needle);
                                        SubLObject reduced_conjuncts = remove(new_asent, haystack_conjuncts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (haystack_conjuncts.equal(reduced_conjuncts)) {
                                                Errors.error($$$Failed_to_remove_conjunct);
                                            }
                                        }
                                        {
                                            SubLObject expanded_conjuncts = append(reduced_conjuncts, new_conjuncts);
                                            SubLObject expanded_implication = make_implication(simplifier.conjoin(expanded_conjuncts, UNPROVIDED), haystack_consequent);
                                            return list(make_ist_sentence(haystack_mt, expanded_implication), append(haystack_rules, new_rules));
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_8, $list_alt26);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt25);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param HAYSTACK
     * 		nil or haystack-p
     */
    @LispMethod(comment = "@param HAYSTACK\r\n\t\tnil or haystack-p")
    public static SubLObject add_straw_to_haystack(final SubLObject haystack, final SubLObject new_needle, final SubLObject new_straw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_bindings = NIL;
        SubLObject abduced_supports = NIL;
        SubLObject new_rules = NIL;
        destructuring_bind_must_consp(new_straw, new_straw, $list25);
        hypothetical_bindings = new_straw.first();
        SubLObject current = new_straw.rest();
        destructuring_bind_must_consp(current, new_straw, $list25);
        abduced_supports = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, new_straw, $list25);
        new_rules = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject new_conjuncts = Mapping.mapcar(HL_SUPPORT_SENTENCE, abduced_supports);
            new_conjuncts = bindings.apply_bindings_backwards(hypothetical_bindings, new_conjuncts);
            new_conjuncts = cycl_utilities.expression_transform(new_conjuncts, ABDUCED_TERM_P, ABDUCED_TERM_TO_RANDOM_VARIABLE, UNPROVIDED, UNPROVIDED);
            if (NIL == haystack) {
                final SubLObject consequent = designated_sentence(new_needle);
                final SubLObject mt = $$InferencePSC;
                final SubLObject implication = make_implication(make_conjunction(new_conjuncts), consequent);
                return list(make_ist_sentence(mt, implication), new_rules);
            }
            SubLObject haystack_ist_sentence = NIL;
            SubLObject haystack_rules = NIL;
            destructuring_bind_must_consp(haystack, haystack, $list26);
            haystack_ist_sentence = haystack.first();
            SubLObject current_$14 = haystack.rest();
            destructuring_bind_must_consp(current_$14, haystack, $list26);
            haystack_rules = current_$14.first();
            current_$14 = current_$14.rest();
            if (NIL == current_$14) {
                final SubLObject haystack_mt = designated_mt(haystack_ist_sentence);
                final SubLObject haystack_implication = designated_sentence(haystack_ist_sentence);
                final SubLObject haystack_consequent = cycl_utilities.formula_arg2(haystack_implication, UNPROVIDED);
                final SubLObject haystack_antecedent = cycl_utilities.formula_arg1(haystack_implication, UNPROVIDED);
                final SubLObject haystack_conjuncts = cycl_utilities.formula_args(haystack_antecedent, UNPROVIDED);
                final SubLObject new_asent = designated_sentence(new_needle);
                final SubLObject reduced_conjuncts = remove(new_asent, haystack_conjuncts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && haystack_conjuncts.equal(reduced_conjuncts)) {
                    Errors.error($$$Failed_to_remove_conjunct);
                }
                final SubLObject expanded_conjuncts = append(reduced_conjuncts, new_conjuncts);
                final SubLObject expanded_implication = make_implication(simplifier.conjoin(expanded_conjuncts, UNPROVIDED), haystack_consequent);
                return list(make_ist_sentence(haystack_mt, expanded_implication), append(haystack_rules, new_rules));
            }
            cdestructuring_bind_error(haystack, $list26);
        } else {
            cdestructuring_bind_error(new_straw, $list25);
        }
        return NIL;
    }

    public static final SubLObject verify_haystack_alt(SubLObject haystack, SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
        if (NIL == haystack) {
            return NIL;
        }
        if (NIL != n) {
            if (NIL == list_utilities.lengthE(com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_rules(haystack), n, UNPROVIDED)) {
                return NIL;
            }
        }
        {
            SubLObject verifiedP = NIL;
            SubLObject datum = haystack;
            SubLObject current = datum;
            SubLObject ist_sentence = NIL;
            SubLObject rules = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            ist_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt28);
            rules = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject n_10 = length(rules);
                    verifiedP = makeBoolean(((NIL == inference_kernel.new_cyc_query(ist_sentence, NIL, list($kw29$CONDITIONAL_SENTENCE_, T, $MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_(n_10), $ALLOWED_RULES, rules))) && (NIL == inference_kernel.new_cyc_query(ist_sentence, NIL, list($kw29$CONDITIONAL_SENTENCE_, T, $MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_(n_10))))) && (NIL != com.cyc.cycjava.cycl.inference.deep_inference_generator.look_for_needle_in_haystack(haystack, T)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
            return verifiedP;
        }
    }

    public static SubLObject verify_haystack(final SubLObject haystack, SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
        if (NIL == haystack) {
            return NIL;
        }
        if ((NIL != n) && (NIL == list_utilities.lengthE(haystack_rules(haystack), n, UNPROVIDED))) {
            return NIL;
        }
        SubLObject verifiedP = NIL;
        SubLObject ist_sentence = NIL;
        SubLObject rules = NIL;
        destructuring_bind_must_consp(haystack, haystack, $list28);
        ist_sentence = haystack.first();
        SubLObject current = haystack.rest();
        destructuring_bind_must_consp(current, haystack, $list28);
        rules = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject n_$15 = length(rules);
            verifiedP = makeBoolean(((NIL == inference_kernel.new_cyc_query(ist_sentence, NIL, list($kw29$CONDITIONAL_SENTENCE_, T, $MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_(n_$15), $ALLOWED_RULES, rules))) && (NIL == inference_kernel.new_cyc_query(ist_sentence, NIL, list($kw29$CONDITIONAL_SENTENCE_, T, $MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_(n_$15))))) && (NIL != look_for_needle_in_haystack(haystack, T)));
        } else {
            cdestructuring_bind_error(haystack, $list28);
        }
        return verifiedP;
    }

    public static final SubLObject look_for_needle_in_haystack_alt(SubLObject haystack, SubLObject cheatP) {
        if (cheatP == UNPROVIDED) {
            cheatP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
            {
                SubLObject datum = haystack;
                SubLObject current = datum;
                SubLObject ist_sentence = NIL;
                SubLObject rules = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt28);
                ist_sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt28);
                rules = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject n = length(rules);
                        SubLObject query_properties = list($kw29$CONDITIONAL_SENTENCE_, T, $MAX_TRANSFORMATION_DEPTH, n, $PROBABLY_APPROXIMATELY_DONE, $float$0_95, $RETURN, $BINDINGS_AND_SUPPORTS);
                        SubLObject time = NIL;
                        SubLObject result = NIL;
                        SubLObject halt_reason = NIL;
                        if (NIL != cheatP) {
                            query_properties = putf(query_properties, $ALLOWED_RULES, rules);
                        }
                        {
                            SubLObject time_var = get_internal_real_time();
                            thread.resetMultipleValues();
                            {
                                SubLObject result_11 = inference_kernel.new_cyc_query(ist_sentence, NIL, query_properties);
                                SubLObject halt_reason_12 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                result = result_11;
                                halt_reason = halt_reason_12;
                            }
                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        }
                        return values(NIL != result ? ((SubLObject) (time)) : NIL, halt_reason);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt28);
                }
            }
            return NIL;
        }
    }

    public static SubLObject look_for_needle_in_haystack(final SubLObject haystack, SubLObject cheatP) {
        if (cheatP == UNPROVIDED) {
            cheatP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
        SubLObject ist_sentence = NIL;
        SubLObject rules = NIL;
        destructuring_bind_must_consp(haystack, haystack, $list28);
        ist_sentence = haystack.first();
        SubLObject current = haystack.rest();
        destructuring_bind_must_consp(current, haystack, $list28);
        rules = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject n = length(rules);
            SubLObject query_properties = list($kw29$CONDITIONAL_SENTENCE_, T, $MAX_TRANSFORMATION_DEPTH, n, $PROBABLY_APPROXIMATELY_DONE, $float$0_95, $RETURN, $BINDINGS_AND_SUPPORTS);
            SubLObject time = NIL;
            SubLObject result = NIL;
            SubLObject halt_reason = NIL;
            if (NIL != cheatP) {
                query_properties = putf(query_properties, $ALLOWED_RULES, rules);
            }
            final SubLObject time_var = get_internal_real_time();
            thread.resetMultipleValues();
            final SubLObject result_$16 = inference_kernel.new_cyc_query(ist_sentence, NIL, query_properties);
            final SubLObject halt_reason_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$16;
            halt_reason = halt_reason_$17;
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            return values(NIL != result ? time : NIL, halt_reason);
        }
        cdestructuring_bind_error(haystack, $list28);
        return NIL;
    }

    public static final SubLObject nonstandard_transformation_asent_p_alt(SubLObject asent) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.deep_inference_generator.standard_transformation_asent_p(asent));
    }

    public static SubLObject nonstandard_transformation_asent_p(final SubLObject asent) {
        return makeBoolean(NIL == standard_transformation_asent_p(asent));
    }

    public static final SubLObject standard_transformation_asent_p_alt(SubLObject asent) {
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            return makeBoolean((((NIL != forts.fort_p(pred)) && (NIL != hl_supports.non_hl_predicate_p(pred))) && (NIL == kb_accessors.backchain_forbiddenP(pred, $$UniversalVocabularyMt))) && (NIL == relation_evaluation.evaluatable_predicateP(pred, $$UniversalVocabularyMt)));
        }
    }

    public static SubLObject standard_transformation_asent_p(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((((NIL != forts.fort_p(pred)) && (NIL != hl_supports.non_hl_predicate_p(pred))) && (NIL == kb_accessors.backchain_forbiddenP(pred, $$UniversalVocabularyMt))) && (NIL == relation_evaluation.evaluatable_predicateP(pred, $$UniversalVocabularyMt)));
    }

    public static final SubLObject make_isa_x_thing_asent_alt(SubLObject x) {
        return listS($$isa, x, $list_alt38);
    }

    public static SubLObject make_isa_x_thing_asent(final SubLObject x) {
        return listS($$isa, x, $list38);
    }

    public static final SubLObject inference_answer_justification_uses_at_least_one_ruleP_alt(SubLObject justification) {
        return list_utilities.sublisp_boolean(find_if($sym8$RULE_ASSERTION_, inference_datastructures_inference.inference_answer_justification_supports(justification), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject inference_answer_justification_uses_at_least_one_ruleP(final SubLObject justification) {
        return list_utilities.sublisp_boolean(find_if($sym8$RULE_ASSERTION_, inference_datastructures_inference.inference_answer_justification_supports(justification), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject clear_abduced_term_to_random_variable_alt() {
        {
            SubLObject cs = $abduced_term_to_random_variable_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_abduced_term_to_random_variable() {
        final SubLObject cs = $abduced_term_to_random_variable_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_abduced_term_to_random_variable_alt(SubLObject abduced_term) {
        return memoization_state.caching_state_remove_function_results_with_args($abduced_term_to_random_variable_caching_state$.getGlobalValue(), list(abduced_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_abduced_term_to_random_variable(final SubLObject abduced_term) {
        return memoization_state.caching_state_remove_function_results_with_args($abduced_term_to_random_variable_caching_state$.getGlobalValue(), list(abduced_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject abduced_term_to_random_variable_internal_alt(SubLObject abduced_term) {
        return cycl_variables.make_el_var(cconcatenate($str_alt39$_VAR, string_utilities.str(random.random($most_positive_fixnum$.getGlobalValue()))));
    }

    public static SubLObject abduced_term_to_random_variable_internal(final SubLObject abduced_term) {
        return cycl_variables.make_el_var(cconcatenate($str39$_VAR, string_utilities.str(random.random($most_positive_fixnum$.getGlobalValue()))));
    }

    public static final SubLObject abduced_term_to_random_variable_alt(SubLObject abduced_term) {
        {
            SubLObject caching_state = $abduced_term_to_random_variable_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ABDUCED_TERM_TO_RANDOM_VARIABLE, $abduced_term_to_random_variable_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, abduced_term, $kw41$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw41$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.deep_inference_generator.abduced_term_to_random_variable_internal(abduced_term)));
                    memoization_state.caching_state_put(caching_state, abduced_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject abduced_term_to_random_variable(final SubLObject abduced_term) {
        SubLObject caching_state = $abduced_term_to_random_variable_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ABDUCED_TERM_TO_RANDOM_VARIABLE, $abduced_term_to_random_variable_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, abduced_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(abduced_term_to_random_variable_internal(abduced_term)));
            memoization_state.caching_state_put(caching_state, abduced_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Keeps trying to find a good instantiation of some haystack in HAYSTACKS
     * until it succeeds.
     */
    @LispMethod(comment = "Keeps trying to find a good instantiation of some haystack in HAYSTACKS\r\nuntil it succeeds.\nKeeps trying to find a good instantiation of some haystack in HAYSTACKS\nuntil it succeeds.")
    public static final SubLObject find_good_instantiated_haystack_alt(SubLObject haystacks) {
        {
            SubLObject instantiated_haystack = NIL;
            while (NIL == instantiated_haystack) {
                {
                    SubLObject haystack = list_utilities.random_element(haystacks);
                    instantiated_haystack = com.cyc.cycjava.cycl.inference.deep_inference_generator.instantiate_haystack_if_good(haystack);
                }
            } 
            return instantiated_haystack;
        }
    }

    @LispMethod(comment = "Keeps trying to find a good instantiation of some haystack in HAYSTACKS\r\nuntil it succeeds.\nKeeps trying to find a good instantiation of some haystack in HAYSTACKS\nuntil it succeeds.")
    public static SubLObject find_good_instantiated_haystack(final SubLObject haystacks) {
        SubLObject instantiated_haystack;
        SubLObject haystack;
        for (instantiated_haystack = NIL; NIL == instantiated_haystack; instantiated_haystack = instantiate_haystack_if_good(haystack)) {
            haystack = list_utilities.random_element(haystacks);
        }
        return instantiated_haystack;
    }/**
     * Keeps trying to find a good instantiation of some haystack in HAYSTACKS
     * until it succeeds.
     */


    public static final SubLObject instantiate_haystack_if_good_alt(SubLObject haystack) {
        {
            SubLObject instantiated_haystack = com.cyc.cycjava.cycl.inference.deep_inference_generator.instantiate_haystack(haystack);
            if ((NIL != com.cyc.cycjava.cycl.inference.deep_inference_generator.look_for_needle_in_haystack(instantiated_haystack, T)) && (NIL == com.cyc.cycjava.cycl.inference.deep_inference_generator.look_for_needle_in_haystack(instantiated_haystack, NIL))) {
                return instantiated_haystack;
            }
        }
        return NIL;
    }

    public static SubLObject instantiate_haystack_if_good(final SubLObject haystack) {
        final SubLObject instantiated_haystack = instantiate_haystack(haystack);
        if ((NIL != look_for_needle_in_haystack(instantiated_haystack, T)) && (NIL == look_for_needle_in_haystack(instantiated_haystack, NIL))) {
            return instantiated_haystack;
        }
        return NIL;
    }

    /**
     * Attempts to find existing terms to bind HAYSTACK's variables to,
     * because otherwise the focus of the hypothetical terms will allow
     * a disingenuously focused inference path.
     */
    @LispMethod(comment = "Attempts to find existing terms to bind HAYSTACK\'s variables to,\r\nbecause otherwise the focus of the hypothetical terms will allow\r\na disingenuously focused inference path.\nAttempts to find existing terms to bind HAYSTACK\'s variables to,\nbecause otherwise the focus of the hypothetical terms will allow\na disingenuously focused inference path.")
    public static final SubLObject instantiate_haystack_alt(SubLObject haystack) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ist_query = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_query(haystack);
                SubLObject mt = designated_mt(ist_query);
                SubLObject implication = designated_sentence(ist_query);
                SubLObject antecedent = cycl_utilities.sentence_arg1(implication, UNPROVIDED);
                SubLObject isa_lits = list_utilities.remove_if_not($sym42$ISA_VAR_FORT_LIT_, cycl_utilities.formula_args(antecedent, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject isa_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject cdolist_list_var = isa_lits;
                SubLObject isa_lit = NIL;
                for (isa_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_lit = cdolist_list_var.first()) {
                    {
                        SubLObject var = cycl_utilities.formula_arg1(isa_lit, UNPROVIDED);
                        SubLObject col = cycl_utilities.formula_arg2(isa_lit, UNPROVIDED);
                        dictionary_utilities.dictionary_push(isa_dict, var, col);
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(isa_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cols = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = com.cyc.cycjava.cycl.inference.deep_inference_generator.instantiate_haystack_var(cols, mt);
                                if (NIL != v_term) {
                                    haystack = cycl_utilities.expression_subst(v_term, var, haystack, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return haystack;
            }
        }
    }

    @LispMethod(comment = "Attempts to find existing terms to bind HAYSTACK\'s variables to,\r\nbecause otherwise the focus of the hypothetical terms will allow\r\na disingenuously focused inference path.\nAttempts to find existing terms to bind HAYSTACK\'s variables to,\nbecause otherwise the focus of the hypothetical terms will allow\na disingenuously focused inference path.")
    public static SubLObject instantiate_haystack(SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_query = haystack_query(haystack);
        final SubLObject mt = designated_mt(ist_query);
        final SubLObject implication = designated_sentence(ist_query);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(implication, UNPROVIDED);
        final SubLObject isa_lits = list_utilities.remove_if_not($sym41$ISA_VAR_FORT_LIT_, cycl_utilities.formula_args(antecedent, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject isa_dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = isa_lits;
        SubLObject isa_lit = NIL;
        isa_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = cycl_utilities.formula_arg1(isa_lit, UNPROVIDED);
            final SubLObject col = cycl_utilities.formula_arg2(isa_lit, UNPROVIDED);
            dictionary_utilities.dictionary_push(isa_dict, var, col);
            cdolist_list_var = cdolist_list_var.rest();
            isa_lit = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(isa_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cols = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject v_term = instantiate_haystack_var(cols, mt);
            if (NIL != v_term) {
                haystack = cycl_utilities.expression_subst(v_term, var2, haystack, UNPROVIDED, UNPROVIDED);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return haystack;
    }/**
     * Attempts to find existing terms to bind HAYSTACK's variables to,
     * because otherwise the focus of the hypothetical terms will allow
     * a disingenuously focused inference path.
     */


    /**
     * Tries to find a term that is an instance of all of COLS in MT.
     */
    @LispMethod(comment = "Tries to find a term that is an instance of all of COLS in MT.")
    public static final SubLObject instantiate_haystack_var_alt(SubLObject cols, SubLObject mt) {
        return list_utilities.random_element(isa.union_all_instances(cols, mt, UNPROVIDED));
    }

    @LispMethod(comment = "Tries to find a term that is an instance of all of COLS in MT.")
    public static SubLObject instantiate_haystack_var(final SubLObject cols, final SubLObject mt) {
        return list_utilities.random_element(isa.union_all_instances(cols, mt, UNPROVIDED));
    }/**
     * Tries to find a term that is an instance of all of COLS in MT.
     */


    /**
     * This is used to tweak answerable haystacks, so that they become unanswerable.
     * A crippled haystack should be unanswerable in proof-checker mode,
     * and should PAD out in exploratory mode.
     */
    @LispMethod(comment = "This is used to tweak answerable haystacks, so that they become unanswerable.\r\nA crippled haystack should be unanswerable in proof-checker mode,\r\nand should PAD out in exploratory mode.\nThis is used to tweak answerable haystacks, so that they become unanswerable.\nA crippled haystack should be unanswerable in proof-checker mode,\nand should PAD out in exploratory mode.")
    public static final SubLObject cripple_haystack_alt(SubLObject haystack) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject crippled_haystack = NIL;
                while (NIL == crippled_haystack) {
                    {
                        SubLObject potentially_crippled_haystack = com.cyc.cycjava.cycl.inference.deep_inference_generator.potentially_cripple_haystack(haystack);
                        if (NIL != potentially_crippled_haystack) {
                            if (NIL == com.cyc.cycjava.cycl.inference.deep_inference_generator.look_for_needle_in_haystack(potentially_crippled_haystack, T)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject time = com.cyc.cycjava.cycl.inference.deep_inference_generator.look_for_needle_in_haystack(potentially_crippled_haystack, NIL);
                                    SubLObject halt_reason = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == time) {
                                        if ($PROBABLY_APPROXIMATELY_DONE == halt_reason) {
                                            crippled_haystack = potentially_crippled_haystack;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
                return crippled_haystack;
            }
        }
    }

    @LispMethod(comment = "This is used to tweak answerable haystacks, so that they become unanswerable.\r\nA crippled haystack should be unanswerable in proof-checker mode,\r\nand should PAD out in exploratory mode.\nThis is used to tweak answerable haystacks, so that they become unanswerable.\nA crippled haystack should be unanswerable in proof-checker mode,\nand should PAD out in exploratory mode.")
    public static SubLObject cripple_haystack(final SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject crippled_haystack = NIL;
        while (NIL == crippled_haystack) {
            final SubLObject potentially_crippled_haystack = potentially_cripple_haystack(haystack);
            if ((NIL != potentially_crippled_haystack) && (NIL == look_for_needle_in_haystack(potentially_crippled_haystack, T))) {
                thread.resetMultipleValues();
                final SubLObject time = look_for_needle_in_haystack(potentially_crippled_haystack, NIL);
                final SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != time) || ($PROBABLY_APPROXIMATELY_DONE != halt_reason)) {
                    continue;
                }
                crippled_haystack = potentially_crippled_haystack;
            }
        } 
        return crippled_haystack;
    }/**
     * This is used to tweak answerable haystacks, so that they become unanswerable.
     * A crippled haystack should be unanswerable in proof-checker mode,
     * and should PAD out in exploratory mode.
     */


    /**
     * This is used to tweak answerable haystacks, so that they might become unanswerable.
     */
    @LispMethod(comment = "This is used to tweak answerable haystacks, so that they might become unanswerable.")
    public static final SubLObject potentially_cripple_haystack_alt(SubLObject haystack) {
        {
            SubLObject ist_query = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_query(haystack);
            SubLObject rules = com.cyc.cycjava.cycl.inference.deep_inference_generator.haystack_rules(haystack);
            SubLObject mt = designated_mt(ist_query);
            SubLObject implication = designated_sentence(ist_query);
            SubLObject antecedent = cycl_utilities.sentence_arg1(implication, UNPROVIDED);
            SubLObject consequent = cycl_utilities.sentence_arg2(implication, UNPROVIDED);
            SubLObject conjuncts = cycl_utilities.formula_args(antecedent, UNPROVIDED);
            if (NIL == list_utilities.singletonP(conjuncts)) {
                {
                    SubLObject crippled_conjuncts = remove(list_utilities.random_element(conjuncts), conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject crippled_antecedent = simplifier.conjoin(crippled_conjuncts, UNPROVIDED);
                    SubLObject crippled_implication = make_implication(crippled_antecedent, consequent);
                    SubLObject crippled_ist_query = make_ist_sentence(mt, crippled_implication);
                    return list(crippled_ist_query, rules);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "This is used to tweak answerable haystacks, so that they might become unanswerable.")
    public static SubLObject potentially_cripple_haystack(final SubLObject haystack) {
        final SubLObject ist_query = haystack_query(haystack);
        final SubLObject rules = haystack_rules(haystack);
        final SubLObject mt = designated_mt(ist_query);
        final SubLObject implication = designated_sentence(ist_query);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(implication, UNPROVIDED);
        final SubLObject consequent = cycl_utilities.sentence_arg2(implication, UNPROVIDED);
        final SubLObject conjuncts = cycl_utilities.formula_args(antecedent, UNPROVIDED);
        if (NIL == list_utilities.singletonP(conjuncts)) {
            final SubLObject crippled_conjuncts = remove(list_utilities.random_element(conjuncts), conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject crippled_antecedent = simplifier.conjoin(crippled_conjuncts, UNPROVIDED);
            final SubLObject crippled_implication = make_implication(crippled_antecedent, consequent);
            final SubLObject crippled_ist_query = make_ist_sentence(mt, crippled_implication);
            return list(crippled_ist_query, rules);
        }
        return NIL;
    }/**
     * This is used to tweak answerable haystacks, so that they might become unanswerable.
     */


    public static SubLObject declare_deep_inference_generator_file() {
        declareFunction("generate_deep_inference", "GENERATE-DEEP-INFERENCE", 1, 0, false);
        declareFunction("initialize_deep_inference_gaf_table", "INITIALIZE-DEEP-INFERENCE-GAF-TABLE", 0, 1, false);
        declareFunction("assertion_provability_depth", "ASSERTION-PROVABILITY-DEPTH", 1, 0, false);
        declareFunction("backward_rule_required_for_assertionP", "BACKWARD-RULE-REQUIRED-FOR-ASSERTION?", 1, 0, false);
        declareFunction("backward_rule_deductionP", "BACKWARD-RULE-DEDUCTION?", 1, 0, false);
        declareFunction("haystack_p", "HAYSTACK-P", 1, 0, false);
        declareFunction("interesting_haystack_p", "INTERESTING-HAYSTACK-P", 1, 0, false);
        declareFunction("haystack_query", "HAYSTACK-QUERY", 1, 0, false);
        declareFunction("haystack_rules", "HAYSTACK-RULES", 1, 0, false);
        declareFunction("haystack_size", "HAYSTACK-SIZE", 1, 0, false);
        declareFunction("straw_p", "STRAW-P", 1, 0, false);
        declareFunction("generate_haystack", "GENERATE-HAYSTACK", 1, 0, false);
        declareFunction("collapse_haystack", "COLLAPSE-HAYSTACK", 1, 0, false);
        declareFunction("fix_haystack_variables", "FIX-HAYSTACK-VARIABLES", 1, 0, false);
        declareFunction("generate_haystack_int", "GENERATE-HAYSTACK-INT", 1, 0, false);
        declareFunction("abort_haystackP", "ABORT-HAYSTACK?", 2, 0, false);
        declareFunction("grow_haystack", "GROW-HAYSTACK", 2, 0, false);
        declareFunction("choose_random_needle", "CHOOSE-RANDOM-NEEDLE", 0, 0, false);
        declareFunction("choose_next_needle", "CHOOSE-NEXT-NEEDLE", 1, 0, false);
        declareFunction("generate_straw_from_needle", "GENERATE-STRAW-FROM-NEEDLE", 1, 0, false);
        declareFunction("add_straw_to_haystack", "ADD-STRAW-TO-HAYSTACK", 3, 0, false);
        declareFunction("verify_haystack", "VERIFY-HAYSTACK", 1, 1, false);
        declareFunction("look_for_needle_in_haystack", "LOOK-FOR-NEEDLE-IN-HAYSTACK", 1, 1, false);
        declareFunction("nonstandard_transformation_asent_p", "NONSTANDARD-TRANSFORMATION-ASENT-P", 1, 0, false);
        declareFunction("standard_transformation_asent_p", "STANDARD-TRANSFORMATION-ASENT-P", 1, 0, false);
        declareFunction("make_isa_x_thing_asent", "MAKE-ISA-X-THING-ASENT", 1, 0, false);
        declareFunction("inference_answer_justification_uses_at_least_one_ruleP", "INFERENCE-ANSWER-JUSTIFICATION-USES-AT-LEAST-ONE-RULE?", 1, 0, false);
        declareFunction("clear_abduced_term_to_random_variable", "CLEAR-ABDUCED-TERM-TO-RANDOM-VARIABLE", 0, 0, false);
        declareFunction("remove_abduced_term_to_random_variable", "REMOVE-ABDUCED-TERM-TO-RANDOM-VARIABLE", 1, 0, false);
        declareFunction("abduced_term_to_random_variable_internal", "ABDUCED-TERM-TO-RANDOM-VARIABLE-INTERNAL", 1, 0, false);
        declareFunction("abduced_term_to_random_variable", "ABDUCED-TERM-TO-RANDOM-VARIABLE", 1, 0, false);
        declareFunction("find_good_instantiated_haystack", "FIND-GOOD-INSTANTIATED-HAYSTACK", 1, 0, false);
        declareFunction("instantiate_haystack_if_good", "INSTANTIATE-HAYSTACK-IF-GOOD", 1, 0, false);
        declareFunction("instantiate_haystack", "INSTANTIATE-HAYSTACK", 1, 0, false);
        declareFunction("instantiate_haystack_var", "INSTANTIATE-HAYSTACK-VAR", 2, 0, false);
        declareFunction("cripple_haystack", "CRIPPLE-HAYSTACK", 1, 0, false);
        declareFunction("potentially_cripple_haystack", "POTENTIALLY-CRIPPLE-HAYSTACK", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_deep_inference_generator_file_alt() {
        deflexical("*DEEP-INFERENCE-GAF-TABLE*", NIL != boundp($deep_inference_gaf_table$) ? ((SubLObject) ($deep_inference_gaf_table$.getGlobalValue())) : make_hash_table($int$212, UNPROVIDED, UNPROVIDED));
        defparameter("*DEEP-INFERENCE-RECURSION-STACK*", $UNINITIALIZED);
        deflexical("*TOTALLY-UNINTERESTING-HAYSTACK-MTS*", $list_alt6);
        deflexical("*SOMEWHAT-UNINTERESTING-HAYSTACK-MTS*", $list_alt7);
        deflexical("*STRAW-SEEKING-QUERY-PROPERTIES*", $list_alt20);
        deflexical("*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_deep_inference_generator_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*DEEP-INFERENCE-GAF-TABLE*", SubLTrampolineFile.maybeDefault($deep_inference_gaf_table$, $deep_inference_gaf_table$, () -> make_hash_table($int$212, UNPROVIDED, UNPROVIDED)));
            defparameter("*DEEP-INFERENCE-RECURSION-STACK*", $UNINITIALIZED);
            deflexical("*TOTALLY-UNINTERESTING-HAYSTACK-MTS*", $list6);
            deflexical("*SOMEWHAT-UNINTERESTING-HAYSTACK-MTS*", $list7);
            deflexical("*STRAW-SEEKING-QUERY-PROPERTIES*", $list20);
            deflexical("*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*DEEP-INFERENCE-GAF-TABLE*", NIL != boundp($deep_inference_gaf_table$) ? ((SubLObject) ($deep_inference_gaf_table$.getGlobalValue())) : make_hash_table($int$212, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_deep_inference_generator_file_Previous() {
        deflexical("*DEEP-INFERENCE-GAF-TABLE*", SubLTrampolineFile.maybeDefault($deep_inference_gaf_table$, $deep_inference_gaf_table$, () -> make_hash_table($int$212, UNPROVIDED, UNPROVIDED)));
        defparameter("*DEEP-INFERENCE-RECURSION-STACK*", $UNINITIALIZED);
        deflexical("*TOTALLY-UNINTERESTING-HAYSTACK-MTS*", $list6);
        deflexical("*SOMEWHAT-UNINTERESTING-HAYSTACK-MTS*", $list7);
        deflexical("*STRAW-SEEKING-QUERY-PROPERTIES*", $list20);
        deflexical("*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_deep_inference_generator_file() {
        declare_defglobal($deep_inference_gaf_table$);
        memoization_state.note_globally_cached_function(ABDUCED_TERM_TO_RANDOM_VARIABLE);
        return NIL;
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

    

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("KleinTest2Mt"), reader_make_constant_shell("TMSLoopMt"), reader_make_constant_shell("EasyTMSLoopMt"));

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("DeonticReasoning-LogicMt"), reader_make_constant_shell("ReasoningWithTense-LogicMt"), reader_make_constant_shell("ReasoningWithTense-LogicMt-LinearTime"), reader_make_constant_shell("NecessityMt"), reader_make_constant_shell("ReasoningWithMultiFuture-LogicMt"));

    static private final SubLList $list_alt13 = cons(makeSymbol("RULE-HL-VAR"), makeSymbol("HAYSTACK-VAR"));

    static private final SubLList $list_alt15 = list(makeSymbol("HYPOTHETICAL-BINDINGS"), makeSymbol("ABDUCED-SUPPORTS"), makeSymbol("RULES"));

    static private final SubLList $list_alt20 = list(new SubLObject[]{ makeKeyword("ABDUCTION-ALLOWED?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("BROWSABLE?"), T, makeKeyword("CONDITIONAL-SENTENCE?"), T, makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"), makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS") });

    static private final SubLList $list_alt22 = list(makeSymbol("RESULT"), makeSymbol("HYPOTHETICAL-BINDINGS"));

    static private final SubLList $list_alt25 = list(makeSymbol("HYPOTHETICAL-BINDINGS"), makeSymbol("ABDUCED-SUPPORTS"), makeSymbol("NEW-RULES"));

    static private final SubLList $list_alt26 = list(makeSymbol("HAYSTACK-IST-SENTENCE"), makeSymbol("HAYSTACK-RULES"));

    static private final SubLList $list_alt28 = list(makeSymbol("IST-SENTENCE"), makeSymbol("RULES"));

    static private final SubLList $list_alt38 = list(reader_make_constant_shell("Thing"));

    static private final SubLString $str_alt39$_VAR = makeString("?VAR");

    public static final SubLSymbol $kw41$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym42$ISA_VAR_FORT_LIT_ = makeSymbol("ISA-VAR-FORT-LIT?");
}

/**
 * Total time: 235 ms
 */
