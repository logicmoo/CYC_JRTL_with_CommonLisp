/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-CONCEPTUALLY-RELATED
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-conceptually-related.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_conceptually_related extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_conceptually_related();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related";


    // defparameter
    // Definitions
    /**
     * An absolute upper bound on the generality-estimate of terms used to gather
     * conceptual relation. NIL means 'no limit'.
     */
    @LispMethod(comment = "An absolute upper bound on the generality-estimate of terms used to gather\r\nconceptual relation. NIL means \'no limit\'.\ndefparameter\nAn absolute upper bound on the generality-estimate of terms used to gather\nconceptual relation. NIL means \'no limit\'.")
    public static final SubLSymbol $conceptually_related_generality_threshold$ = makeSymbol("*CONCEPTUALLY-RELATED-GENERALITY-THRESHOLD*");

    // defparameter
    /**
     * An upper bound on the ratio allowed between the generality-estimate of terms
     * used to gather conceptual relation and the term used to start the search. NIL
     * means 'no limit'.
     */
    @LispMethod(comment = "An upper bound on the ratio allowed between the generality-estimate of terms\r\nused to gather conceptual relation and the term used to start the search. NIL\r\nmeans \'no limit\'.\ndefparameter\nAn upper bound on the ratio allowed between the generality-estimate of terms\nused to gather conceptual relation and the term used to start the search. NIL\nmeans \'no limit\'.")
    public static final SubLSymbol $conceptually_related_generality_ratio$ = makeSymbol("*CONCEPTUALLY-RELATED-GENERALITY-RATIO*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conceptually_related_answer$ = makeSymbol("*CONCEPTUALLY-RELATED-ANSWER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conceptually_related_answer_table$ = makeSymbol("*CONCEPTUALLY-RELATED-ANSWER-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conceptually_related_mapping_table$ = makeSymbol("*CONCEPTUALLY-RELATED-MAPPING-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conceptually_related_target$ = makeSymbol("*CONCEPTUALLY-RELATED-TARGET*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conceptually_related_start$ = makeSymbol("*CONCEPTUALLY-RELATED-START*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conceptually_related_start_generality$ = makeSymbol("*CONCEPTUALLY-RELATED-START-GENERALITY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_conceptually_related_cost$ = makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_all_conceptually_related_cost$ = makeSymbol("*DEFAULT-ALL-CONCEPTUALLY-RELATED-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_max_conceptually_related_to_cost$ = makeSymbol("*DEFAULT-MAX-CONCEPTUALLY-RELATED-TO-COST*");









    static private final SubLSymbol $sym10$HLMT_EQUAL_ = makeSymbol("HLMT-EQUAL?");

    static private final SubLSymbol $sym11$SPEC_MT_ = makeSymbol("SPEC-MT?");



    static private final SubLList $list15 = list(reader_make_constant_shell("conceptuallyRelated"));



    private static final SubLSymbol $REMOVAL_CONCEPTUALLY_RELATED = makeKeyword("REMOVAL-CONCEPTUALLY-RELATED");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCEPTUALLY-RELATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyRelated <fort> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyRelated #$Dog #$DogFood)") });



    private static final SubLSymbol $REMOVAL_ALL_CONCEPTUALLY_RELATED = makeKeyword("REMOVAL-ALL-CONCEPTUALLY-RELATED");

    static private final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), $FORT, makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-CONCEPTUALLY-RELATED-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-CONCEPTUALLY-RELATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyRelated <fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyRelated #$Dog ?WHAT)") });

    private static final SubLSymbol $REMOVAL_MAX_CONCEPTUALLY_RELATED_TO = makeKeyword("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO");

    static private final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), makeKeyword("VARIABLE"), $FORT), $COST, makeSymbol("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyRelated <variable> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyRelated ?WHAT #$DogFood)") });

    private static final SubLSymbol $MAX_CONCEPTUALLY_RELATED_TO_POS = makeKeyword("MAX-CONCEPTUALLY-RELATED-TO-POS");

    private static final SubLList $list29 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), makeKeyword("VARIABLE"), $FORT), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_CONCEPTUALLY_RELATED = makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED");

    private static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), $FORT, $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-CONCEPTUALLY-RELATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$conceptuallyRelated <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$conceptuallyRelated #$Dog #$Animal))") });

    public static final SubLObject new_conceptually_related_mapping_table_alt() {
        return make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_conceptually_related_mapping_table() {
        return make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject new_conceptually_related_answer_table_alt() {
        return make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_conceptually_related_answer_table() {
        return make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff SOURCE is conceptually related to TARGET in MT.
     *
     * @param CHECK-SUPERIORS-OF-SOURCE?
     * 		booleanp; If non-NIL, also check to see if any isa or genls of SOURCE is conceptually related to TARGET.
     */
    @LispMethod(comment = "Return T iff SOURCE is conceptually related to TARGET in MT.\r\n\r\n@param CHECK-SUPERIORS-OF-SOURCE?\r\n\t\tbooleanp; If non-NIL, also check to see if any isa or genls of SOURCE is conceptually related to TARGET.")
    public static final SubLObject conceptually_relatedP_alt(SubLObject source, SubLObject target, SubLObject mt, SubLObject check_superiors_of_sourceP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (check_superiors_of_sourceP == UNPROVIDED) {
            check_superiors_of_sourceP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(source, FORT_P);
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $conceptually_related_mapping_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $conceptually_related_target$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $conceptually_related_answer$.currentBinding(thread);
                    try {
                        $conceptually_related_mapping_table$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.new_conceptually_related_mapping_table(), thread);
                        $conceptually_related_target$.bind(target, thread);
                        $conceptually_related_answer$.bind(NIL, thread);
                        {
                            SubLObject catch_var = NIL;
                            try {
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_immediate_conceptually_related(source);
                                            if (NIL != check_superiors_of_sourceP) {
                                                {
                                                    SubLObject isa_col = NIL;
                                                    SubLObject pred_var = $$isa;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var);
                                                            SubLObject done_var = NIL;
                                                            SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                {
                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                    if (NIL != valid) {
                                                                        {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                {
                                                                                    SubLObject done_var_4 = NIL;
                                                                                    SubLObject token_var_5 = NIL;
                                                                                    while (NIL == done_var_4) {
                                                                                        {
                                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                                            SubLObject valid_6 = makeBoolean(token_var_5 != assertion);
                                                                                            if (NIL != valid_6) {
                                                                                                isa_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_7 = $conceptually_related_start$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_8 = $conceptually_related_start_generality$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $conceptually_related_start$.bind(isa_col, thread);
                                                                                                        $conceptually_related_start_generality$.bind(NIL, thread);
                                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_superior_conceptually_related(isa_col);
                                                                                                    } finally {
                                                                                                        $conceptually_related_start_generality$.rebind(_prev_bind_1_8, thread);
                                                                                                        $conceptually_related_start$.rebind(_prev_bind_0_7, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_4 = makeBoolean(NIL == valid_6);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = makeBoolean(NIL == valid);
                                                                }
                                                            } 
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_10 = $conceptually_related_start$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_11 = $conceptually_related_start_generality$.currentBinding(thread);
                                                    try {
                                                        $conceptually_related_start$.bind(source, thread);
                                                        $conceptually_related_start_generality$.bind(NIL, thread);
                                                        {
                                                            SubLObject genl_col = NIL;
                                                            SubLObject pred_var = $$genls;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var);
                                                                    SubLObject done_var = NIL;
                                                                    SubLObject token_var = NIL;
                                                                    while (NIL == done_var) {
                                                                        {
                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                            if (NIL != valid) {
                                                                                {
                                                                                    SubLObject final_index_iterator = NIL;
                                                                                    try {
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_12 = NIL;
                                                                                            SubLObject token_var_13 = NIL;
                                                                                            while (NIL == done_var_12) {
                                                                                                {
                                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                                                                                    SubLObject valid_14 = makeBoolean(token_var_13 != assertion);
                                                                                                    if (NIL != valid_14) {
                                                                                                        genl_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_superior_conceptually_related(genl_col);
                                                                                                    }
                                                                                                    done_var_12 = makeBoolean(NIL == valid_14);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = makeBoolean(NIL == valid);
                                                                        }
                                                                    } 
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $conceptually_related_start_generality$.rebind(_prev_bind_1_11, thread);
                                                        $conceptually_related_start$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_3, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_2, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                            }
                            v_answer = $conceptually_related_answer$.getDynamicValue(thread);
                        }
                    } finally {
                        $conceptually_related_answer$.rebind(_prev_bind_2, thread);
                        $conceptually_related_target$.rebind(_prev_bind_1, thread);
                        $conceptually_related_mapping_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Return T iff SOURCE is conceptually related to TARGET in MT.
     *
     * @param CHECK-SUPERIORS-OF-SOURCE?
     * 		booleanp; If non-NIL, also check to see if any isa or genls of SOURCE is conceptually related to TARGET.
     */
    @LispMethod(comment = "Return T iff SOURCE is conceptually related to TARGET in MT.\r\n\r\n@param CHECK-SUPERIORS-OF-SOURCE?\r\n\t\tbooleanp; If non-NIL, also check to see if any isa or genls of SOURCE is conceptually related to TARGET.")
    public static SubLObject conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt, SubLObject check_superiors_of_sourceP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (check_superiors_of_sourceP == UNPROVIDED) {
            check_superiors_of_sourceP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $conceptually_related_mapping_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $conceptually_related_target$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $conceptually_related_answer$.currentBinding(thread);
        try {
            $conceptually_related_mapping_table$.bind(new_conceptually_related_mapping_table(), thread);
            $conceptually_related_target$.bind(target, thread);
            $conceptually_related_answer$.bind(NIL, thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($MAPPING_DONE);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    check_immediate_conceptually_related(source);
                    if (NIL != check_superiors_of_sourceP) {
                        SubLObject isa_col = NIL;
                        final SubLObject pred_var = $$isa;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                            if (NIL != valid_$6) {
                                                isa_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                final SubLObject _prev_bind_0_$2 = $conceptually_related_start$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$3 = $conceptually_related_start_generality$.currentBinding(thread);
                                                try {
                                                    $conceptually_related_start$.bind(isa_col, thread);
                                                    $conceptually_related_start_generality$.bind(NIL, thread);
                                                    check_superior_conceptually_related(isa_col);
                                                } finally {
                                                    $conceptually_related_start_generality$.rebind(_prev_bind_1_$3, thread);
                                                    $conceptually_related_start$.rebind(_prev_bind_0_$2, thread);
                                                }
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                        final SubLObject _prev_bind_0_$4 = $conceptually_related_start$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = $conceptually_related_start_generality$.currentBinding(thread);
                        try {
                            $conceptually_related_start$.bind(source, thread);
                            $conceptually_related_start_generality$.bind(NIL, thread);
                            SubLObject genl_col = NIL;
                            final SubLObject pred_var2 = $$genls;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var2)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var2);
                                SubLObject done_var2 = NIL;
                                final SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$5 = NIL;
                                            final SubLObject token_var_$6 = NIL;
                                            while (NIL == done_var_$5) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                                if (NIL != valid_$7) {
                                                    genl_col = assertions_high.gaf_arg(assertion2, TWO_INTEGER);
                                                    check_superior_conceptually_related(genl_col);
                                                }
                                                done_var_$5 = makeBoolean(NIL == valid_$7);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                } 
                            }
                        } finally {
                            $conceptually_related_start_generality$.rebind(_prev_bind_1_$4, thread);
                            $conceptually_related_start$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            } finally {
                thread.throwStack.pop();
            }
            v_answer = $conceptually_related_answer$.getDynamicValue(thread);
        } finally {
            $conceptually_related_answer$.rebind(_prev_bind_3, thread);
            $conceptually_related_target$.rebind(_prev_bind_2, thread);
            $conceptually_related_mapping_table$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    /**
     * Return T iff TARGET is conceptually related to SOURCE in MT.
     * If non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.
     */
    @LispMethod(comment = "Return T iff TARGET is conceptually related to SOURCE in MT.\r\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.\nReturn T iff TARGET is conceptually related to SOURCE in MT.\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.")
    public static final SubLObject check_conceptually_related_limited_alt(SubLObject source, SubLObject threshold, SubLObject ratio, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(source, FORT_P);
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $conceptually_related_generality_threshold$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $conceptually_related_generality_ratio$.currentBinding(thread);
                    try {
                        $conceptually_related_generality_threshold$.bind(threshold, thread);
                        $conceptually_related_generality_ratio$.bind(ratio, thread);
                        v_answer = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.all_conceptually_related(source, mt);
                    } finally {
                        $conceptually_related_generality_ratio$.rebind(_prev_bind_1, thread);
                        $conceptually_related_generality_threshold$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Return T iff TARGET is conceptually related to SOURCE in MT.
     * If non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.
     */
    @LispMethod(comment = "Return T iff TARGET is conceptually related to SOURCE in MT.\r\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.\nReturn T iff TARGET is conceptually related to SOURCE in MT.\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.")
    public static SubLObject check_conceptually_related_limited(SubLObject source, final SubLObject threshold, final SubLObject ratio, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $conceptually_related_generality_threshold$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $conceptually_related_generality_ratio$.currentBinding(thread);
        try {
            $conceptually_related_generality_threshold$.bind(threshold, thread);
            $conceptually_related_generality_ratio$.bind(ratio, thread);
            v_answer = all_conceptually_related(source, mt);
        } finally {
            $conceptually_related_generality_ratio$.rebind(_prev_bind_2, thread);
            $conceptually_related_generality_threshold$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }/**
     * Return T iff TARGET is conceptually related to SOURCE in MT.
     * If non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.
     */


    public static final SubLObject check_conceptually_related_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_term.equal($conceptually_related_target$.getDynamicValue(thread))) {
                $conceptually_related_answer$.setDynamicValue(T, thread);
                mapping_finished();
            }
            return NIL;
        }
    }

    public static SubLObject check_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_term.equal($conceptually_related_target$.getDynamicValue(thread))) {
            $conceptually_related_answer$.setDynamicValue(T, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static final SubLObject check_immediate_conceptually_related_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), T);
                if (NIL != fort_p(v_term)) {
                    {
                        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                            pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                            {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_16 = NIL;
                                                                SubLObject token_var_17 = NIL;
                                                                while (NIL == done_var_16) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                                        SubLObject valid_18 = makeBoolean(token_var_17 != assertion);
                                                                        if (NIL != valid_18) {
                                                                            {
                                                                                SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_conceptually_related(related);
                                                                            }
                                                                        }
                                                                        done_var_16 = makeBoolean(NIL == valid_18);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                        {
                            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_20 = NIL;
                                                                    SubLObject token_var_21 = NIL;
                                                                    while (NIL == done_var_20) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_21);
                                                                            SubLObject valid_22 = makeBoolean(token_var_21 != assertion);
                                                                            if (NIL != valid_22) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_23 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                                                    try {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                                                        {
                                                                                            SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_conceptually_related(related);
                                                                                        }
                                                                                    } finally {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_23, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_20 = makeBoolean(NIL == valid_22);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_immediate_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), T);
            if (NIL != forts.fort_p(v_term)) {
                SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$16 = NIL;
                                    final SubLObject token_var_$17 = NIL;
                                    while (NIL == done_var_$16) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                        final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(assertion));
                                        if (NIL != valid_$18) {
                                            final SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                            check_conceptually_related(related);
                                        }
                                        done_var_$16 = makeBoolean(NIL == valid_$18);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
                if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                    _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$17 = NIL;
                                        final SubLObject token_var_$18 = NIL;
                                        while (NIL == done_var_$17) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                            final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                            if (NIL != valid_$19) {
                                                final SubLObject _prev_bind_0_$20 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                try {
                                                    kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                    final SubLObject related2 = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                                    check_conceptually_related(related2);
                                                } finally {
                                                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            done_var_$17 = makeBoolean(NIL == valid_$19);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject check_superior_conceptually_related_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(collection, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.conceptual_generality_acceptable(collection)) {
                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_immediate_conceptually_related(collection);
                    if (NIL != fort_p(collection)) {
                        {
                            SubLObject genl_col = NIL;
                            SubLObject pred_var = $$genls;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_25 = NIL;
                                                            SubLObject token_var_26 = NIL;
                                                            while (NIL == done_var_25) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                                    SubLObject valid_27 = makeBoolean(token_var_26 != assertion);
                                                                    if (NIL != valid_27) {
                                                                        genl_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.check_superior_conceptually_related(genl_col);
                                                                    }
                                                                    done_var_25 = makeBoolean(NIL == valid_27);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_superior_conceptually_related(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == gethash(collection, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) && (NIL != conceptual_generality_acceptable(collection))) {
            check_immediate_conceptually_related(collection);
            if (NIL != forts.fort_p(collection)) {
                SubLObject genl_col = NIL;
                final SubLObject pred_var = $$genls;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$25 = NIL;
                                final SubLObject token_var_$26 = NIL;
                                while (NIL == done_var_$25) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                    final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                    if (NIL != valid_$27) {
                                        genl_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        check_superior_conceptually_related(genl_col);
                                    }
                                    done_var_$25 = makeBoolean(NIL == valid_$27);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff COLLECTION is of acceptable generality
     */
    @LispMethod(comment = "Return T iff COLLECTION is of acceptable generality")
    public static final SubLObject conceptual_generality_acceptable_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $conceptually_related_generality_threshold$.getDynamicValue(thread)) || (NIL != $conceptually_related_generality_ratio$.getDynamicValue(thread)))) {
                return T;
            }
            if (NIL == fort_p(collection)) {
                return NIL;
            }
            {
                SubLObject generality = cardinality_estimates.generality_estimate(collection);
                if (NIL == $conceptually_related_start_generality$.getDynamicValue(thread)) {
                    $conceptually_related_start_generality$.setDynamicValue(cardinality_estimates.generality_estimate($conceptually_related_start$.getDynamicValue(thread)), thread);
                }
                if ((NIL != $conceptually_related_generality_threshold$.getDynamicValue(thread)) && generality.numLE($conceptually_related_generality_threshold$.getDynamicValue(thread))) {
                    return T;
                } else {
                    if (NIL == $conceptually_related_generality_ratio$.getDynamicValue(thread)) {
                        return T;
                    } else {
                        if ($conceptually_related_generality_ratio$.getDynamicValue(thread).numE(ZERO_INTEGER)) {
                            return NIL;
                        } else {
                            if ($conceptually_related_start_generality$.getDynamicValue(thread).numE(ZERO_INTEGER)) {
                                return NIL;
                            } else {
                                return numLE(generality, multiply($conceptually_related_generality_ratio$.getDynamicValue(thread), $conceptually_related_start_generality$.getDynamicValue(thread)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Return T iff COLLECTION is of acceptable generality")
    public static SubLObject conceptual_generality_acceptable(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $conceptually_related_generality_threshold$.getDynamicValue(thread)) && (NIL == $conceptually_related_generality_ratio$.getDynamicValue(thread))) {
            return T;
        }
        if (NIL == forts.fort_p(collection)) {
            return NIL;
        }
        final SubLObject generality = cardinality_estimates.generality_estimate(collection);
        if (NIL == $conceptually_related_start_generality$.getDynamicValue(thread)) {
            $conceptually_related_start_generality$.setDynamicValue(cardinality_estimates.generality_estimate($conceptually_related_start$.getDynamicValue(thread)), thread);
        }
        if ((NIL != $conceptually_related_generality_threshold$.getDynamicValue(thread)) && generality.numLE($conceptually_related_generality_threshold$.getDynamicValue(thread))) {
            return T;
        }
        if (NIL == $conceptually_related_generality_ratio$.getDynamicValue(thread)) {
            return T;
        }
        if ($conceptually_related_generality_ratio$.getDynamicValue(thread).numE(ZERO_INTEGER)) {
            return NIL;
        }
        if ($conceptually_related_start_generality$.getDynamicValue(thread).numE(ZERO_INTEGER)) {
            return NIL;
        }
        return numLE(generality, multiply($conceptually_related_generality_ratio$.getDynamicValue(thread), $conceptually_related_start_generality$.getDynamicValue(thread)));
    }/**
     * Return T iff COLLECTION is of acceptable generality
     */


    /**
     * Return a list of all terms conceptually related to SOURCE in MT.
     */
    @LispMethod(comment = "Return a list of all terms conceptually related to SOURCE in MT.")
    public static final SubLObject all_conceptually_related_alt(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(source, FORT_P);
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $conceptually_related_mapping_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $conceptually_related_answer_table$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $conceptually_related_answer$.currentBinding(thread);
                    try {
                        $conceptually_related_mapping_table$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.new_conceptually_related_mapping_table(), thread);
                        $conceptually_related_answer_table$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.new_conceptually_related_answer_table(), thread);
                        $conceptually_related_answer$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_28 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_30 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_immediate_conceptually_related(source);
                                    {
                                        SubLObject isa_col = NIL;
                                        SubLObject pred_var = $$isa;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                    {
                                                                        SubLObject done_var_31 = NIL;
                                                                        SubLObject token_var_32 = NIL;
                                                                        while (NIL == done_var_31) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                                                                                SubLObject valid_33 = makeBoolean(token_var_32 != assertion);
                                                                                if (NIL != valid_33) {
                                                                                    isa_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_34 = $conceptually_related_start$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_35 = $conceptually_related_start_generality$.currentBinding(thread);
                                                                                        try {
                                                                                            $conceptually_related_start$.bind(isa_col, thread);
                                                                                            $conceptually_related_start_generality$.bind(NIL, thread);
                                                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_superior_conceptually_related(isa_col);
                                                                                        } finally {
                                                                                            $conceptually_related_start_generality$.rebind(_prev_bind_1_35, thread);
                                                                                            $conceptually_related_start$.rebind(_prev_bind_0_34, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_31 = makeBoolean(NIL == valid_33);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_36, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_37 = $conceptually_related_start$.currentBinding(thread);
                                        SubLObject _prev_bind_1_38 = $conceptually_related_start_generality$.currentBinding(thread);
                                        try {
                                            $conceptually_related_start$.bind(source, thread);
                                            $conceptually_related_start_generality$.bind(NIL, thread);
                                            {
                                                SubLObject genl_col = NIL;
                                                SubLObject pred_var = $$genls;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var);
                                                        SubLObject done_var = NIL;
                                                        SubLObject token_var = NIL;
                                                        while (NIL == done_var) {
                                                            {
                                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject final_index_iterator = NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                            {
                                                                                SubLObject done_var_39 = NIL;
                                                                                SubLObject token_var_40 = NIL;
                                                                                while (NIL == done_var_39) {
                                                                                    {
                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_40);
                                                                                        SubLObject valid_41 = makeBoolean(token_var_40 != assertion);
                                                                                        if (NIL != valid_41) {
                                                                                            genl_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_superior_conceptually_related(genl_col);
                                                                                        }
                                                                                        done_var_39 = makeBoolean(NIL == valid_41);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        } finally {
                                            $conceptually_related_start_generality$.rebind(_prev_bind_1_38, thread);
                                            $conceptually_related_start$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_30, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_29, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_28, thread);
                                }
                            }
                            v_answer = nreverse($conceptually_related_answer$.getDynamicValue(thread));
                        }
                    } finally {
                        $conceptually_related_answer$.rebind(_prev_bind_2, thread);
                        $conceptually_related_answer_table$.rebind(_prev_bind_1, thread);
                        $conceptually_related_mapping_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Return a list of all terms conceptually related to SOURCE in MT.
     */
    @LispMethod(comment = "Return a list of all terms conceptually related to SOURCE in MT.")
    public static SubLObject all_conceptually_related(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $conceptually_related_mapping_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $conceptually_related_answer_table$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $conceptually_related_answer$.currentBinding(thread);
        try {
            $conceptually_related_mapping_table$.bind(new_conceptually_related_mapping_table(), thread);
            $conceptually_related_answer_table$.bind(new_conceptually_related_answer_table(), thread);
            $conceptually_related_answer$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$28 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$30 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                mark_immediate_conceptually_related(source);
                SubLObject isa_col = NIL;
                final SubLObject pred_var = $$isa;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$31 = NIL;
                                final SubLObject token_var_$32 = NIL;
                                while (NIL == done_var_$31) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                    final SubLObject valid_$33 = makeBoolean(!token_var_$32.eql(assertion));
                                    if (NIL != valid_$33) {
                                        isa_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        final SubLObject _prev_bind_0_$29 = $conceptually_related_start$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$30 = $conceptually_related_start_generality$.currentBinding(thread);
                                        try {
                                            $conceptually_related_start$.bind(isa_col, thread);
                                            $conceptually_related_start_generality$.bind(NIL, thread);
                                            mark_superior_conceptually_related(isa_col);
                                        } finally {
                                            $conceptually_related_start_generality$.rebind(_prev_bind_1_$30, thread);
                                            $conceptually_related_start$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    }
                                    done_var_$31 = makeBoolean(NIL == valid_$33);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                final SubLObject _prev_bind_0_$31 = $conceptually_related_start$.currentBinding(thread);
                final SubLObject _prev_bind_1_$31 = $conceptually_related_start_generality$.currentBinding(thread);
                try {
                    $conceptually_related_start$.bind(source, thread);
                    $conceptually_related_start_generality$.bind(NIL, thread);
                    SubLObject genl_col = NIL;
                    final SubLObject pred_var2 = $$genls;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$32 = NIL;
                                    final SubLObject token_var_$33 = NIL;
                                    while (NIL == done_var_$32) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$33);
                                        final SubLObject valid_$34 = makeBoolean(!token_var_$33.eql(assertion2));
                                        if (NIL != valid_$34) {
                                            genl_col = assertions_high.gaf_arg(assertion2, TWO_INTEGER);
                                            mark_superior_conceptually_related(genl_col);
                                        }
                                        done_var_$32 = makeBoolean(NIL == valid_$34);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                } finally {
                    $conceptually_related_start_generality$.rebind(_prev_bind_1_$31, thread);
                    $conceptually_related_start$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$30, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$29, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$28, thread);
            }
            v_answer = nreverse($conceptually_related_answer$.getDynamicValue(thread));
        } finally {
            $conceptually_related_answer$.rebind(_prev_bind_3, thread);
            $conceptually_related_answer_table$.rebind(_prev_bind_2, thread);
            $conceptually_related_mapping_table$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    /**
     * Return a list of all terms conceptually related to SOURCE in MT.
     * If non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.
     */
    @LispMethod(comment = "Return a list of all terms conceptually related to SOURCE in MT.\r\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.\nReturn a list of all terms conceptually related to SOURCE in MT.\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.")
    public static final SubLObject all_conceptually_related_limited_alt(SubLObject source, SubLObject threshold, SubLObject ratio, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(source, FORT_P);
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $conceptually_related_generality_threshold$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $conceptually_related_generality_ratio$.currentBinding(thread);
                    try {
                        $conceptually_related_generality_threshold$.bind(threshold, thread);
                        $conceptually_related_generality_ratio$.bind(ratio, thread);
                        v_answer = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.all_conceptually_related(source, mt);
                    } finally {
                        $conceptually_related_generality_ratio$.rebind(_prev_bind_1, thread);
                        $conceptually_related_generality_threshold$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    @LispMethod(comment = "Return a list of all terms conceptually related to SOURCE in MT.\r\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.\nReturn a list of all terms conceptually related to SOURCE in MT.\nIf non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.")
    public static SubLObject all_conceptually_related_limited(SubLObject source, final SubLObject threshold, final SubLObject ratio, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $conceptually_related_generality_threshold$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $conceptually_related_generality_ratio$.currentBinding(thread);
        try {
            $conceptually_related_generality_threshold$.bind(threshold, thread);
            $conceptually_related_generality_ratio$.bind(ratio, thread);
            v_answer = all_conceptually_related(source, mt);
        } finally {
            $conceptually_related_generality_ratio$.rebind(_prev_bind_2, thread);
            $conceptually_related_generality_threshold$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }/**
     * Return a list of all terms conceptually related to SOURCE in MT.
     * If non-nil, THRESHOLD and RATIO limit the generality of terms used in determining conceptual relation.
     */


    public static final SubLObject mark_conceptually_related_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(v_term, $conceptually_related_answer_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(v_term, $conceptually_related_answer_table$.getDynamicValue(thread), T);
                $conceptually_related_answer$.setDynamicValue(cons(v_term, $conceptually_related_answer$.getDynamicValue(thread)), thread);
            }
            return NIL;
        }
    }

    public static SubLObject mark_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash(v_term, $conceptually_related_answer_table$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(v_term, $conceptually_related_answer_table$.getDynamicValue(thread), T);
            $conceptually_related_answer$.setDynamicValue(cons(v_term, $conceptually_related_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject mark_immediate_conceptually_related_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), T);
                if (NIL != fort_p(v_term)) {
                    {
                        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                            pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                            {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_43 = NIL;
                                                                SubLObject token_var_44 = NIL;
                                                                while (NIL == done_var_43) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_44);
                                                                        SubLObject valid_45 = makeBoolean(token_var_44 != assertion);
                                                                        if (NIL != valid_45) {
                                                                            {
                                                                                SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_conceptually_related(related);
                                                                            }
                                                                        }
                                                                        done_var_43 = makeBoolean(NIL == valid_45);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                        {
                            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_47 = NIL;
                                                                    SubLObject token_var_48 = NIL;
                                                                    while (NIL == done_var_47) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_48);
                                                                            SubLObject valid_49 = makeBoolean(token_var_48 != assertion);
                                                                            if (NIL != valid_49) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_50 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                                                    try {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                                                        {
                                                                                            SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_conceptually_related(related);
                                                                                        }
                                                                                    } finally {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_50, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_47 = makeBoolean(NIL == valid_49);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_immediate_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(v_term, $conceptually_related_mapping_table$.getDynamicValue(thread), T);
            if (NIL != forts.fort_p(v_term)) {
                SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$43 = NIL;
                                    final SubLObject token_var_$44 = NIL;
                                    while (NIL == done_var_$43) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                        final SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(assertion));
                                        if (NIL != valid_$45) {
                                            final SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                            mark_conceptually_related(related);
                                        }
                                        done_var_$43 = makeBoolean(NIL == valid_$45);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
                if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                    _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(ONE_INTEGER), pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$44 = NIL;
                                        final SubLObject token_var_$45 = NIL;
                                        while (NIL == done_var_$44) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                            final SubLObject valid_$46 = makeBoolean(!token_var_$45.eql(assertion));
                                            if (NIL != valid_$46) {
                                                final SubLObject _prev_bind_0_$47 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                try {
                                                    kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                    final SubLObject related2 = kb_gp_mapping.dgaivgp_arg(assertion, TWO_INTEGER);
                                                    mark_conceptually_related(related2);
                                                } finally {
                                                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$47, thread);
                                                }
                                            }
                                            done_var_$44 = makeBoolean(NIL == valid_$46);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject mark_superior_conceptually_related_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(collection, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.conceptual_generality_acceptable(collection)) {
                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_immediate_conceptually_related(collection);
                    if (NIL != fort_p(collection)) {
                        {
                            SubLObject genl_col = NIL;
                            SubLObject pred_var = $$genls;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_52 = NIL;
                                                            SubLObject token_var_53 = NIL;
                                                            while (NIL == done_var_52) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_53);
                                                                    SubLObject valid_54 = makeBoolean(token_var_53 != assertion);
                                                                    if (NIL != valid_54) {
                                                                        genl_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.mark_superior_conceptually_related(genl_col);
                                                                    }
                                                                    done_var_52 = makeBoolean(NIL == valid_54);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_superior_conceptually_related(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == gethash(collection, $conceptually_related_mapping_table$.getDynamicValue(thread), UNPROVIDED)) && (NIL != conceptual_generality_acceptable(collection))) {
            mark_immediate_conceptually_related(collection);
            if (NIL != forts.fort_p(collection)) {
                SubLObject genl_col = NIL;
                final SubLObject pred_var = $$genls;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$52 = NIL;
                                final SubLObject token_var_$53 = NIL;
                                while (NIL == done_var_$52) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                    final SubLObject valid_$54 = makeBoolean(!token_var_$53.eql(assertion));
                                    if (NIL != valid_$54) {
                                        genl_col = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        mark_superior_conceptually_related(genl_col);
                                    }
                                    done_var_$52 = makeBoolean(NIL == valid_$54);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            }
        }
        return NIL;
    }

    /**
     * Return a list of the max terms which are conceptually related to TARGET in MT.
     */
    @LispMethod(comment = "Return a list of the max terms which are conceptually related to TARGET in MT.")
    public static final SubLObject max_conceptually_related_to_alt(SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(target, FORT_P);
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject _prev_bind_0_55 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_56 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                                pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, TWO_INTEGER, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, TWO_INTEGER, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_57 = NIL;
                                                                    SubLObject token_var_58 = NIL;
                                                                    while (NIL == done_var_57) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_58);
                                                                            SubLObject valid_59 = makeBoolean(token_var_58 != assertion);
                                                                            if (NIL != valid_59) {
                                                                                {
                                                                                    SubLObject related_to = kb_gp_mapping.dgaivgp_arg(assertion, ONE_INTEGER);
                                                                                    SubLObject item_var = related_to;
                                                                                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                        ans = cons(item_var, ans);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_57 = makeBoolean(NIL == valid_59);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1_56, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_55, thread);
                            }
                        }
                        if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                            {
                                SubLObject _prev_bind_0_61 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_62 = pred_relevance_macros.$pred$.currentBinding(thread);
                                try {
                                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                    pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                                    {
                                        SubLObject pred_var = NIL;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var);
                                                SubLObject done_var = NIL;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                    {
                                                                        SubLObject done_var_63 = NIL;
                                                                        SubLObject token_var_64 = NIL;
                                                                        while (NIL == done_var_63) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_64);
                                                                                SubLObject valid_65 = makeBoolean(token_var_64 != assertion);
                                                                                if (NIL != valid_65) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_66 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                                                        try {
                                                                                            kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                                                            {
                                                                                                SubLObject related_to = kb_gp_mapping.dgaivgp_arg(assertion, ONE_INTEGER);
                                                                                                SubLObject item_var = related_to;
                                                                                                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                    ans = cons(item_var, ans);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_66, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_63 = makeBoolean(NIL == valid_65);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                } finally {
                                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_62, thread);
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_61, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    @LispMethod(comment = "Return a list of the max terms which are conceptually related to TARGET in MT.")
    public static SubLObject max_conceptually_related_to(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(target) : "! forts.fort_p(target) " + ("forts.fort_p(target) " + "CommonSymbols.NIL != forts.fort_p(target) ") + target;
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject _prev_bind_0_$55 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$56 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, TWO_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$57 = NIL;
                                final SubLObject token_var_$58 = NIL;
                                while (NIL == done_var_$57) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$58);
                                    final SubLObject valid_$59 = makeBoolean(!token_var_$58.eql(assertion));
                                    if (NIL != valid_$59) {
                                        final SubLObject item_var;
                                        final SubLObject related_to = item_var = kb_gp_mapping.dgaivgp_arg(assertion, ONE_INTEGER);
                                        if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                    done_var_$57 = makeBoolean(NIL == valid_$59);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$56, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$55, thread);
            }
            if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                final SubLObject _prev_bind_0_$57 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$57 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$58 = NIL;
                                    final SubLObject token_var_$59 = NIL;
                                    while (NIL == done_var_$58) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                        final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(assertion));
                                        if (NIL != valid_$60) {
                                            final SubLObject _prev_bind_0_$58 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                final SubLObject item_var2;
                                                final SubLObject related_to2 = item_var2 = kb_gp_mapping.dgaivgp_arg(assertion, ONE_INTEGER);
                                                if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    ans = cons(item_var2, ans);
                                                }
                                            } finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$58, thread);
                                            }
                                        }
                                        done_var_$58 = makeBoolean(NIL == valid_$60);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$57, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$57, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ans);
    }/**
     * Return a list of the max terms which are conceptually related to TARGET in MT.
     */


    /**
     * Return T iff TARGET is known to not be conceptually related to SOURCE in MT.
     */
    @LispMethod(comment = "Return T iff TARGET is known to not be conceptually related to SOURCE in MT.")
    public static final SubLObject not_conceptually_relatedP_alt(SubLObject source, SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != fort_p(source)) && (NIL != fort_p(target))) {
                    {
                        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        try {
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            ans = makeBoolean((((NIL != genls.genlsP(source, target, mt, UNPROVIDED)) || (NIL != genls.genlsP(target, source, mt, UNPROVIDED))) || (NIL != isa.isaP(source, target, mt, UNPROVIDED))) || (NIL != isa.isaP(target, source, mt, UNPROVIDED)));
                        } finally {
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "Return T iff TARGET is known to not be conceptually related to SOURCE in MT.")
    public static SubLObject not_conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != forts.fort_p(source)) && (NIL != forts.fort_p(target))) {
            final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                ans = makeBoolean((((NIL != genls.genlsP(source, target, mt, UNPROVIDED)) || (NIL != genls.genlsP(target, source, mt, UNPROVIDED))) || (NIL != isa.isaP(source, target, mt, UNPROVIDED))) || (NIL != isa.isaP(target, source, mt, UNPROVIDED)));
            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }/**
     * Return T iff TARGET is known to not be conceptually related to SOURCE in MT.
     */


    /**
     *
     *
     * @return LISTP of maximal mts in which SOURCE is conceptually related to TARGET.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP of maximal mts in which SOURCE is conceptually related to TARGET.\r\n@unknown baxter")
    public static final SubLObject max_floor_mts_of_conceptually_related_paths_alt(SubLObject source, SubLObject target) {
        {
            SubLObject mts = NIL;
            SubLObject v_arguments = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.why_conceptually_relatedP_internal(source, target, $$InferencePSC, NIL);
            SubLObject cdolist_list_var = v_arguments;
            SubLObject argument = NIL;
            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_68 = hl_supports.max_floor_mts_of_justification(argument);
                    SubLObject mt = NIL;
                    for (mt = cdolist_list_var_68.first(); NIL != cdolist_list_var_68; cdolist_list_var_68 = cdolist_list_var_68.rest() , mt = cdolist_list_var_68.first()) {
                        {
                            SubLObject item_var = mt;
                            if (NIL == member(item_var, mts, symbol_function($sym10$HLMT_EQUAL_), symbol_function(IDENTITY))) {
                                mts = cons(item_var, mts);
                            }
                        }
                    }
                }
            }
            return list_utilities.remove_subsumed_items(mts, symbol_function($sym11$SPEC_MT_), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return LISTP of maximal mts in which SOURCE is conceptually related to TARGET.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP of maximal mts in which SOURCE is conceptually related to TARGET.\r\n@unknown baxter")
    public static SubLObject max_floor_mts_of_conceptually_related_paths(SubLObject source, final SubLObject target) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject v_arguments = cdolist_list_var = why_conceptually_relatedP_internal(source, target, $$InferencePSC, NIL);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$68 = hl_supports.max_floor_mts_of_justification(argument);
            SubLObject mt = NIL;
            mt = cdolist_list_var_$68.first();
            while (NIL != cdolist_list_var_$68) {
                final SubLObject item_var = mt;
                if (NIL == member(item_var, mts, symbol_function($sym10$HLMT_EQUAL_), symbol_function(IDENTITY))) {
                    mts = cons(item_var, mts);
                }
                cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                mt = cdolist_list_var_$68.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return list_utilities.remove_subsumed_items(mts, symbol_function($sym11$SPEC_MT_), UNPROVIDED);
    }

    /**
     * Return one argument for why SOURCE is conceptually related to TARGET in MT
     */
    @LispMethod(comment = "Return one argument for why SOURCE is conceptually related to TARGET in MT")
    public static final SubLObject why_conceptually_relatedP_alt(SubLObject source, SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(source, FORT_P);
        SubLTrampolineFile.checkType(target, FORT_P);
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.why_conceptually_relatedP_internal(source, target, mt, T).first();
    }

    @LispMethod(comment = "Return one argument for why SOURCE is conceptually related to TARGET in MT")
    public static SubLObject why_conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        assert NIL != forts.fort_p(target) : "! forts.fort_p(target) " + ("forts.fort_p(target) " + "CommonSymbols.NIL != forts.fort_p(target) ") + target;
        return why_conceptually_relatedP_internal(source, target, mt, T).first();
    }/**
     * Return one argument for why SOURCE is conceptually related to TARGET in MT
     */


    /**
     * Return list of arguments for why SOURCE is conceptually related to TARGET in MT
     */
    @LispMethod(comment = "Return list of arguments for why SOURCE is conceptually related to TARGET in MT")
    public static final SubLObject why_conceptually_relatedP_internal_alt(SubLObject source, SubLObject target, SubLObject mt, SubLObject one_is_enoughP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arguments = NIL;
                SubLObject doneP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject _prev_bind_0_69 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_70 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                                pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, TWO_INTEGER, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, TWO_INTEGER, pred_var);
                                            SubLObject done_var = doneP;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_71 = doneP;
                                                                    SubLObject token_var_72 = NIL;
                                                                    while (NIL == done_var_71) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_72);
                                                                            SubLObject valid_73 = makeBoolean(token_var_72 != ass);
                                                                            if (NIL != valid_73) {
                                                                                {
                                                                                    SubLObject predicate = assertions_high.gaf_predicate(ass);
                                                                                    SubLObject arg1 = assertions_high.gaf_arg1(ass);
                                                                                    SubLObject arg2 = assertions_high.gaf_arg2(ass);
                                                                                    SubLObject source_genl = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? ((SubLObject) (arg2)) : arg1;
                                                                                    SubLObject argument = NIL;
                                                                                    SubLObject found = NIL;
                                                                                    if (source == source_genl) {
                                                                                        found = T;
                                                                                        doneP = one_is_enoughP;
                                                                                    } else {
                                                                                        if (NIL != genls.genlsP(source, source_genl, UNPROVIDED, UNPROVIDED)) {
                                                                                            found = T;
                                                                                            doneP = one_is_enoughP;
                                                                                            {
                                                                                                SubLObject formula = list($$genls, source, source_genl);
                                                                                                argument = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                            }
                                                                                        } else {
                                                                                            if (NIL != isa.isaP(source, source_genl, UNPROVIDED, UNPROVIDED)) {
                                                                                                found = T;
                                                                                                doneP = one_is_enoughP;
                                                                                                {
                                                                                                    SubLObject formula = list($$isa, source, source_genl);
                                                                                                    argument = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (NIL != found) {
                                                                                        argument = cons(ass, argument);
                                                                                        if (predicate != $$conceptuallyRelated) {
                                                                                            if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                                                                                                {
                                                                                                    SubLObject formula = listS($$genlInverse, predicate, $list_alt15);
                                                                                                    argument = cons(arguments.make_hl_support($GENLPREDS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                }
                                                                                            } else {
                                                                                                {
                                                                                                    SubLObject formula = listS($$genlPreds, predicate, $list_alt15);
                                                                                                    argument = cons(arguments.make_hl_support($GENLPREDS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        v_arguments = cons(argument, v_arguments);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_71 = makeBoolean((NIL == valid_73) || (NIL != doneP));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1_70, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_69, thread);
                            }
                        }
                        if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                            {
                                SubLObject _prev_bind_0_75 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_76 = pred_relevance_macros.$pred$.currentBinding(thread);
                                try {
                                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                    pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                                    {
                                        SubLObject pred_var = NIL;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var);
                                                SubLObject done_var = doneP;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                    {
                                                                        SubLObject done_var_77 = doneP;
                                                                        SubLObject token_var_78 = NIL;
                                                                        while (NIL == done_var_77) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_78);
                                                                                SubLObject valid_79 = makeBoolean(token_var_78 != ass);
                                                                                if (NIL != valid_79) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_80 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                                                        try {
                                                                                            kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                                                            {
                                                                                                SubLObject predicate = assertions_high.gaf_predicate(ass);
                                                                                                SubLObject arg1 = assertions_high.gaf_arg1(ass);
                                                                                                SubLObject arg2 = assertions_high.gaf_arg2(ass);
                                                                                                SubLObject source_genl = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? ((SubLObject) (arg2)) : arg1;
                                                                                                SubLObject argument = NIL;
                                                                                                SubLObject found = NIL;
                                                                                                if (source == source_genl) {
                                                                                                    found = T;
                                                                                                    doneP = one_is_enoughP;
                                                                                                } else {
                                                                                                    if (NIL != genls.genlsP(source, source_genl, UNPROVIDED, UNPROVIDED)) {
                                                                                                        found = T;
                                                                                                        doneP = one_is_enoughP;
                                                                                                        {
                                                                                                            SubLObject formula = list($$genls, source, source_genl);
                                                                                                            argument = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != isa.isaP(source, source_genl, UNPROVIDED, UNPROVIDED)) {
                                                                                                            found = T;
                                                                                                            doneP = one_is_enoughP;
                                                                                                            {
                                                                                                                SubLObject formula = list($$isa, source, source_genl);
                                                                                                                argument = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != found) {
                                                                                                    argument = cons(ass, argument);
                                                                                                    if (predicate != $$conceptuallyRelated) {
                                                                                                        if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                                                                                                            {
                                                                                                                SubLObject formula = listS($$genlInverse, predicate, $list_alt15);
                                                                                                                argument = cons(arguments.make_hl_support($GENLPREDS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                            }
                                                                                                        } else {
                                                                                                            {
                                                                                                                SubLObject formula = listS($$genlPreds, predicate, $list_alt15);
                                                                                                                argument = cons(arguments.make_hl_support($GENLPREDS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    v_arguments = cons(argument, v_arguments);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_80, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_77 = makeBoolean((NIL == valid_79) || (NIL != doneP));
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_81, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                } finally {
                                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_76, thread);
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_75, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_arguments;
            }
        }
    }

    @LispMethod(comment = "Return list of arguments for why SOURCE is conceptually related to TARGET in MT")
    public static SubLObject why_conceptually_relatedP_internal(SubLObject source, final SubLObject target, final SubLObject mt, final SubLObject one_is_enoughP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arguments = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject _prev_bind_0_$69 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$70 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, TWO_INTEGER, pred_var);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$71 = doneP;
                                final SubLObject token_var_$72 = NIL;
                                while (NIL == done_var_$71) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                    final SubLObject valid_$73 = makeBoolean(!token_var_$72.eql(ass));
                                    if (NIL != valid_$73) {
                                        final SubLObject predicate = assertions_high.gaf_predicate(ass);
                                        final SubLObject arg1 = assertions_high.gaf_arg1(ass);
                                        final SubLObject arg2 = assertions_high.gaf_arg2(ass);
                                        final SubLObject source_genl = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arg2 : arg1;
                                        SubLObject argument = NIL;
                                        SubLObject found = NIL;
                                        if (source.eql(source_genl)) {
                                            found = T;
                                            doneP = one_is_enoughP;
                                        } else
                                            if (NIL != genls.genlsP(source, source_genl, UNPROVIDED, UNPROVIDED)) {
                                                found = T;
                                                doneP = one_is_enoughP;
                                                final SubLObject formula = list($$genls, source, source_genl);
                                                argument = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), argument);
                                            } else
                                                if (NIL != isa.isaP(source, source_genl, UNPROVIDED, UNPROVIDED)) {
                                                    found = T;
                                                    doneP = one_is_enoughP;
                                                    final SubLObject formula = list($$isa, source, source_genl);
                                                    argument = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), argument);
                                                }


                                        if (NIL != found) {
                                            argument = cons(ass, argument);
                                            if (!predicate.eql($$conceptuallyRelated)) {
                                                if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                                                    final SubLObject formula = listS($$genlInverse, predicate, $list15);
                                                    argument = cons(arguments.make_hl_support($GENLPREDS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                } else {
                                                    final SubLObject formula = listS($$genlPreds, predicate, $list15);
                                                    argument = cons(arguments.make_hl_support($GENLPREDS, formula, UNPROVIDED, UNPROVIDED), argument);
                                                }
                                            }
                                            v_arguments = cons(argument, v_arguments);
                                        }
                                    }
                                    done_var_$71 = makeBoolean((NIL == valid_$73) || (NIL != doneP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$70, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$69, thread);
            }
            if (NIL != kb_gp_mapping.dgaigp_binaryP($$conceptuallyRelated)) {
                final SubLObject _prev_bind_0_$71 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$71 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind($$conceptuallyRelated, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, arity.binary_arg_swap(TWO_INTEGER), pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$72 = doneP;
                                    final SubLObject token_var_$73 = NIL;
                                    while (NIL == done_var_$72) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                        final SubLObject valid_$74 = makeBoolean(!token_var_$73.eql(ass));
                                        if (NIL != valid_$74) {
                                            final SubLObject _prev_bind_0_$72 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                final SubLObject predicate2 = assertions_high.gaf_predicate(ass);
                                                final SubLObject arg3 = assertions_high.gaf_arg1(ass);
                                                final SubLObject arg4 = assertions_high.gaf_arg2(ass);
                                                final SubLObject source_genl2 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arg4 : arg3;
                                                SubLObject argument2 = NIL;
                                                SubLObject found2 = NIL;
                                                if (source.eql(source_genl2)) {
                                                    found2 = T;
                                                    doneP = one_is_enoughP;
                                                } else
                                                    if (NIL != genls.genlsP(source, source_genl2, UNPROVIDED, UNPROVIDED)) {
                                                        found2 = T;
                                                        doneP = one_is_enoughP;
                                                        final SubLObject formula2 = list($$genls, source, source_genl2);
                                                        argument2 = cons(arguments.make_hl_support($GENLS, formula2, UNPROVIDED, UNPROVIDED), argument2);
                                                    } else
                                                        if (NIL != isa.isaP(source, source_genl2, UNPROVIDED, UNPROVIDED)) {
                                                            found2 = T;
                                                            doneP = one_is_enoughP;
                                                            final SubLObject formula2 = list($$isa, source, source_genl2);
                                                            argument2 = cons(arguments.make_hl_support($ISA, formula2, UNPROVIDED, UNPROVIDED), argument2);
                                                        }


                                                if (NIL != found2) {
                                                    argument2 = cons(ass, argument2);
                                                    if (!predicate2.eql($$conceptuallyRelated)) {
                                                        if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                                                            final SubLObject formula2 = listS($$genlInverse, predicate2, $list15);
                                                            argument2 = cons(arguments.make_hl_support($GENLPREDS, formula2, UNPROVIDED, UNPROVIDED), argument2);
                                                        } else {
                                                            final SubLObject formula2 = listS($$genlPreds, predicate2, $list15);
                                                            argument2 = cons(arguments.make_hl_support($GENLPREDS, formula2, UNPROVIDED, UNPROVIDED), argument2);
                                                        }
                                                    }
                                                    v_arguments = cons(argument2, v_arguments);
                                                }
                                            } finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$72, thread);
                                            }
                                        }
                                        done_var_$72 = makeBoolean((NIL == valid_$74) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$71, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$71, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_arguments;
    }/**
     * Return list of arguments for why SOURCE is conceptually related to TARGET in MT
     */


    /**
     * Stub. Should provide return as a list of assertions and/or hl-supports.
     */
    @LispMethod(comment = "Stub. Should provide return as a list of assertions and/or hl-supports.")
    public static final SubLObject why_not_conceptually_relatedP_alt(SubLObject source, SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    @LispMethod(comment = "Stub. Should provide return as a list of assertions and/or hl-supports.")
    public static SubLObject why_not_conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }/**
     * Stub. Should provide return as a list of assertions and/or hl-supports.
     */


    public static final SubLObject removal_conceptually_related_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.conceptually_relatedP(source, target, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_conceptually_related_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != conceptually_relatedP(source, target, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_all_conceptually_related_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject variable = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject v_related_concepts = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.all_conceptually_related(source, UNPROVIDED);
                SubLObject cdolist_list_var = v_related_concepts;
                SubLObject related_concept = NIL;
                for (related_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , related_concept = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(variable, related_concept, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject formula = list($$conceptuallyRelated, source, related_concept);
                            backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_all_conceptually_related_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject variable = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject v_related_concepts = cdolist_list_var = all_conceptually_related(source, UNPROVIDED);
        SubLObject related_concept = NIL;
        related_concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, related_concept, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject formula = list($$conceptuallyRelated, source, related_concept);
            backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            related_concept = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_max_conceptually_related_to_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return max($default_max_conceptually_related_to_cost$.getDynamicValue(thread), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$conceptuallyRelated));
        }
    }

    public static SubLObject removal_max_conceptually_related_to_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return max($default_max_conceptually_related_to_cost$.getDynamicValue(thread), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$conceptuallyRelated));
    }

    public static final SubLObject removal_max_conceptually_related_to_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject variable = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject v_related_concepts = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.max_conceptually_related_to(target, UNPROVIDED);
                SubLObject cdolist_list_var = v_related_concepts;
                SubLObject related_concept = NIL;
                for (related_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , related_concept = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(variable, related_concept, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject formula = list($$conceptuallyRelated, related_concept, target);
                            backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_max_conceptually_related_to_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject v_related_concepts = cdolist_list_var = max_conceptually_related_to(target, UNPROVIDED);
        SubLObject related_concept = NIL;
        related_concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, related_concept, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject formula = list($$conceptuallyRelated, related_concept, target);
            backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            related_concept = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_not_conceptually_related_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.conceptually_relatedP(source, target, UNPROVIDED, UNPROVIDED))) {
                    backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related.not_conceptually_relatedP(source, target, UNPROVIDED)) {
                        backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_conceptually_related_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == conceptually_relatedP(source, target, UNPROVIDED, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != not_conceptually_relatedP(source, target, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($CONCEPTUALLY_RELATED, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject declare_removal_modules_conceptually_related_file() {
        declareFunction("new_conceptually_related_mapping_table", "NEW-CONCEPTUALLY-RELATED-MAPPING-TABLE", 0, 0, false);
        declareFunction("new_conceptually_related_answer_table", "NEW-CONCEPTUALLY-RELATED-ANSWER-TABLE", 0, 0, false);
        declareFunction("conceptually_relatedP", "CONCEPTUALLY-RELATED?", 2, 2, false);
        declareFunction("check_conceptually_related_limited", "CHECK-CONCEPTUALLY-RELATED-LIMITED", 3, 1, false);
        declareFunction("check_conceptually_related", "CHECK-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("check_immediate_conceptually_related", "CHECK-IMMEDIATE-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("check_superior_conceptually_related", "CHECK-SUPERIOR-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("conceptual_generality_acceptable", "CONCEPTUAL-GENERALITY-ACCEPTABLE", 1, 0, false);
        declareFunction("all_conceptually_related", "ALL-CONCEPTUALLY-RELATED", 1, 1, false);
        declareFunction("all_conceptually_related_limited", "ALL-CONCEPTUALLY-RELATED-LIMITED", 3, 1, false);
        declareFunction("mark_conceptually_related", "MARK-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("mark_immediate_conceptually_related", "MARK-IMMEDIATE-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("mark_superior_conceptually_related", "MARK-SUPERIOR-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("max_conceptually_related_to", "MAX-CONCEPTUALLY-RELATED-TO", 1, 1, false);
        declareFunction("not_conceptually_relatedP", "NOT-CONCEPTUALLY-RELATED?", 2, 1, false);
        declareFunction("max_floor_mts_of_conceptually_related_paths", "MAX-FLOOR-MTS-OF-CONCEPTUALLY-RELATED-PATHS", 2, 0, false);
        declareFunction("why_conceptually_relatedP", "WHY-CONCEPTUALLY-RELATED?", 2, 1, false);
        declareFunction("why_conceptually_relatedP_internal", "WHY-CONCEPTUALLY-RELATED?-INTERNAL", 4, 0, false);
        declareFunction("why_not_conceptually_relatedP", "WHY-NOT-CONCEPTUALLY-RELATED?", 2, 1, false);
        declareFunction("removal_conceptually_related_expand", "REMOVAL-CONCEPTUALLY-RELATED-EXPAND", 1, 1, false);
        declareFunction("removal_all_conceptually_related_expand", "REMOVAL-ALL-CONCEPTUALLY-RELATED-EXPAND", 1, 1, false);
        declareFunction("removal_max_conceptually_related_to_cost", "REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-COST", 1, 1, false);
        declareFunction("removal_max_conceptually_related_to_expand", "REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-EXPAND", 1, 1, false);
        declareFunction("removal_not_conceptually_related_expand", "REMOVAL-NOT-CONCEPTUALLY-RELATED-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_conceptually_related_file() {
        defparameter("*CONCEPTUALLY-RELATED-GENERALITY-THRESHOLD*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-GENERALITY-RATIO*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-ANSWER*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-ANSWER-TABLE*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-MAPPING-TABLE*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-TARGET*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-START*", NIL);
        defparameter("*CONCEPTUALLY-RELATED-START-GENERALITY*", NIL);
        defparameter("*DEFAULT-CONCEPTUALLY-RELATED-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-ALL-CONCEPTUALLY-RELATED-COST*", $int$40);
        defparameter("*DEFAULT-MAX-CONCEPTUALLY-RELATED-TO-COST*", TWENTY_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_conceptually_related_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$conceptuallyRelated);
        inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_RELATED, $list_alt20);
        inference_modules.inference_removal_module($REMOVAL_ALL_CONCEPTUALLY_RELATED, $list_alt23);
        inference_modules.inference_removal_module($REMOVAL_MAX_CONCEPTUALLY_RELATED_TO, $list_alt25);
        preference_modules.inference_preference_module($MAX_CONCEPTUALLY_RELATED_TO_POS, $list_alt27);
        inference_modules.inference_removal_module($REMOVAL_NOT_CONCEPTUALLY_RELATED, $list_alt30);
        return NIL;
    }

    public static SubLObject setup_removal_modules_conceptually_related_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$conceptuallyRelated);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$conceptuallyRelated);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$conceptuallyRelated);
            inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_RELATED, $list22);
            inference_modules.inference_removal_module($REMOVAL_ALL_CONCEPTUALLY_RELATED, $list25);
            inference_modules.inference_removal_module($REMOVAL_MAX_CONCEPTUALLY_RELATED_TO, $list27);
            preference_modules.inference_preference_module($MAX_CONCEPTUALLY_RELATED_TO_POS, $list29);
            inference_modules.inference_removal_module($REMOVAL_NOT_CONCEPTUALLY_RELATED, $list32);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_RELATED, $list_alt20);
            inference_modules.inference_removal_module($REMOVAL_ALL_CONCEPTUALLY_RELATED, $list_alt23);
            inference_modules.inference_removal_module($REMOVAL_MAX_CONCEPTUALLY_RELATED_TO, $list_alt25);
            preference_modules.inference_preference_module($MAX_CONCEPTUALLY_RELATED_TO_POS, $list_alt27);
            inference_modules.inference_removal_module($REMOVAL_NOT_CONCEPTUALLY_RELATED, $list_alt30);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_conceptually_related_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$conceptuallyRelated);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$conceptuallyRelated);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$conceptuallyRelated);
        inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_RELATED, $list22);
        inference_modules.inference_removal_module($REMOVAL_ALL_CONCEPTUALLY_RELATED, $list25);
        inference_modules.inference_removal_module($REMOVAL_MAX_CONCEPTUALLY_RELATED_TO, $list27);
        preference_modules.inference_preference_module($MAX_CONCEPTUALLY_RELATED_TO_POS, $list29);
        inference_modules.inference_removal_module($REMOVAL_NOT_CONCEPTUALLY_RELATED, $list32);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_conceptually_related_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_conceptually_related_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_conceptually_related_file();
    }

    

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("conceptuallyRelated"));

    static private final SubLList $list_alt20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCEPTUALLY-RELATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyRelated <fort> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyRelated #$Dog #$DogFood)") });

    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), $FORT, makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-CONCEPTUALLY-RELATED-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-CONCEPTUALLY-RELATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyRelated <fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyRelated #$Dog ?WHAT)") });

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), makeKeyword("VARIABLE"), $FORT), $COST, makeSymbol("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyRelated <variable> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyRelated ?WHAT #$DogFood)") });

    static private final SubLList $list_alt27 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), makeKeyword("VARIABLE"), $FORT), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    static private final SubLList $list_alt30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("conceptuallyRelated"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("conceptuallyRelated"), $FORT, $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-CONCEPTUALLY-RELATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$conceptuallyRelated <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$conceptuallyRelated #$Dog #$Animal))") });
}

/**
 * Total time: 813 ms
 */
