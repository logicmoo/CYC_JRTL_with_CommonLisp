/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OBJECT-SIMILARITY
 * source file: /cyc/top/cycl/object-similarity.lisp
 * created:     2019/07/03 17:37:49
 */
public final class object_similarity extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new object_similarity();

 public static final String myName = "com.cyc.cycjava.cycl.object_similarity";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $object_similarity_unknown_bound$ = makeSymbol("*OBJECT-SIMILARITY-UNKNOWN-BOUND*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $object_similarity_no_common_assertions_base$ = makeSymbol("*OBJECT-SIMILARITY-NO-COMMON-ASSERTIONS-BASE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $object_similarity_common_assertions_common_base$ = makeSymbol("*OBJECT-SIMILARITY-COMMON-ASSERTIONS-COMMON-BASE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $object_similarity_common_assertions_uncommon_base$ = makeSymbol("*OBJECT-SIMILARITY-COMMON-ASSERTIONS-UNCOMMON-BASE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $object_similarity_core_mt_weight$ = makeSymbol("*OBJECT-SIMILARITY-CORE-MT-WEIGHT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("VARIABLE"), makeSymbol("JUSTIFICATION"), makeSymbol("PROPERTIES"));

    static private final SubLSymbol $sym2$OBJECT_SIMILARITY_JUSTIFY_ = makeSymbol("OBJECT-SIMILARITY-JUSTIFY?");

    private static final SubLFloat $float$0_2 = makeDouble(0.2);

    static private final SubLString $str7$Similarity__s_out_of_bounds_ = makeString("Similarity ~s out of bounds.");

    private static final SubLList $list12 = list(makeSymbol("ASSERTION"), makeSymbol("JUSTIFICATION"));

    private static final SubLSymbol $sym13$JUSTIFICATION_PAIRS_EQUAL_ = makeSymbol("JUSTIFICATION-PAIRS-EQUAL?");

    private static final SubLString $str16$Unknown_truth_value__s = makeString("Unknown truth value ~s");

    private static final SubLSymbol $sym17$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_ = makeSymbol("OBJECT-SIMILARITY-ASSERTION-SUBSUMES?");

    private static final SubLSymbol $sym18$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING?");

    private static final SubLFloat $float$1_2 = makeDouble(1.2);

    private static final SubLList $list21 = list(list(makeSymbol("ASSERTION")), makeSymbol("JUSTIFICATION"));

    static private final SubLList $list22 = list(makeSymbol("JUST11"), makeSymbol("JUST12"));

    static private final SubLList $list23 = list(makeSymbol("JUST21"), makeSymbol("JUST22"));

    private static final SubLSymbol $sym24$JUSTIFICATIONS_EQUAL_ = makeSymbol("JUSTIFICATIONS-EQUAL?");

    private static final SubLList $list25 = list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL);

    private static final SubLSymbol $kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_ = makeKeyword("DESTROY-PROBLEM-STORE-ON-COMPLETION?");

    private static final SubLSymbol $kw29$CONSIDER_META_ASSERTIONS_ = makeKeyword("CONSIDER-META-ASSERTIONS?");

    private static final SubLList $list31 = list(reader_make_constant_shell("quotedIsa"));

    private static final SubLList $list32 = list(makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("CONTINUABLE?"), NIL);

    // Definitions
    public static final SubLObject possibly_set_similarity_justification_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject justification = NIL;
            SubLObject v_properties = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            justification = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, list($sym2$OBJECT_SIMILARITY_JUSTIFY_, v_properties), list(CSETQ, variable, justification));
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject possibly_set_similarity_justification(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject justification = NIL;
        SubLObject v_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        justification = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_properties = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list($sym2$OBJECT_SIMILARITY_JUSTIFY_, v_properties), list(CSETQ, variable, justification));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static final SubLObject objects_probably_equalP_alt(SubLObject obj1, SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject keyword = com.cyc.cycjava.cycl.object_similarity.qualitative_object_similarity(obj1, obj2, mt, v_properties);
                SubLObject doneP = thread.secondMultipleValue();
                SubLObject justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject equalP = makeBoolean(($EQUAL == keyword) || ($PROBABLY_EQUAL == keyword));
                    return values(equalP, doneP, justification);
                }
            }
        }
    }

    public static SubLObject objects_probably_equalP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject keyword = qualitative_object_similarity(obj1, obj2, mt, v_properties);
        final SubLObject doneP = thread.secondMultipleValue();
        final SubLObject justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject equalP = makeBoolean(($EQUAL == keyword) || ($PROBABLY_EQUAL == keyword));
        return values(equalP, doneP, justification);
    }

    public static final SubLObject qualitative_object_similarity_alt(SubLObject obj1, SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject keyword = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject v_similarity = com.cyc.cycjava.cycl.object_similarity.object_similarity(obj1, obj2, mt, v_properties);
                    SubLObject doneP = thread.secondMultipleValue();
                    SubLObject justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (MINUS_ONE_INTEGER.numG(v_similarity) || ONE_INTEGER.numL(v_similarity)) {
                        Errors.error($str_alt7$Similarity__s_out_of_bounds_, v_similarity);
                    } else {
                        if (MINUS_ONE_INTEGER.numE(v_similarity)) {
                            keyword = $DIFFERENT;
                        } else {
                            if (ONE_INTEGER.numE(v_similarity)) {
                                keyword = $EQUAL;
                            } else {
                                if (minus($object_similarity_unknown_bound$.getDynamicValue(thread)).numG(v_similarity)) {
                                    keyword = $PROBABLY_DIFFERENT;
                                } else {
                                    if ($object_similarity_unknown_bound$.getDynamicValue(thread).numL(v_similarity)) {
                                        keyword = $PROBABLY_EQUAL;
                                    } else {
                                        keyword = $UNKNOWN;
                                    }
                                }
                            }
                        }
                    }
                    return values(keyword, doneP, justification);
                }
            }
        }
    }

    public static SubLObject qualitative_object_similarity(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keyword = NIL;
        thread.resetMultipleValues();
        final SubLObject v_similarity = object_similarity(obj1, obj2, mt, v_properties);
        final SubLObject doneP = thread.secondMultipleValue();
        final SubLObject justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (MINUS_ONE_INTEGER.numG(v_similarity) || ONE_INTEGER.numL(v_similarity)) {
            Errors.error($str7$Similarity__s_out_of_bounds_, v_similarity);
        } else
            if (MINUS_ONE_INTEGER.numE(v_similarity)) {
                keyword = $DIFFERENT;
            } else
                if (ONE_INTEGER.numE(v_similarity)) {
                    keyword = $EQUAL;
                } else
                    if (minus($object_similarity_unknown_bound$.getDynamicValue(thread)).numG(v_similarity)) {
                        keyword = $PROBABLY_DIFFERENT;
                    } else
                        if ($object_similarity_unknown_bound$.getDynamicValue(thread).numL(v_similarity)) {
                            keyword = $PROBABLY_EQUAL;
                        } else {
                            keyword = $UNKNOWN;
                        }




        return values(keyword, doneP, justification);
    }

    /**
     *
     *
     * @return 0 numberp; -1 for provably different, 1 for provably equal, 0 for unknown,
    negative for probably different, positive for probably equal.
     * @return 1 booleanp; whether the algorithm ran to quiescence.
    This is an any-time algorithm, so it will produce an answer even if interrupted
    or it runs out of time or resources.
     * @return 2 doubleton?; a pair of the form (justification-p justification-p).
    The first element is a list of supports for why the objects might be equal
    (note that this is not a justification in the strict logical sense),
    and the second element is a list of supports for why the objects might be different.
     */
    @LispMethod(comment = "@return 0 numberp; -1 for provably different, 1 for provably equal, 0 for unknown,\r\nnegative for probably different, positive for probably equal.\r\n@return 1 booleanp; whether the algorithm ran to quiescence.\r\nThis is an any-time algorithm, so it will produce an answer even if interrupted\r\nor it runs out of time or resources.\r\n@return 2 doubleton?; a pair of the form (justification-p justification-p).\r\nThe first element is a list of supports for why the objects might be equal\r\n(note that this is not a justification in the strict logical sense),\r\nand the second element is a list of supports for why the objects might be different.")
    public static final SubLObject object_similarity_alt(SubLObject obj1, SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(obj1, FORT_P);
            SubLTrampolineFile.checkType(obj2, FORT_P);
            {
                SubLObject v_similarity = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject equals_justification = NIL;
                SubLObject different_justification = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != equals.asserted_differentP(obj1, obj2)) {
                            v_similarity = MINUS_ONE_INTEGER;
                            if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_justifyP(v_properties)) {
                                different_justification = equals.why_asserted_different(obj1, obj2);
                            }
                            doneP = T;
                        } else {
                            if (NIL != equals.equalsP(obj1, obj2, UNPROVIDED, UNPROVIDED)) {
                                v_similarity = ONE_INTEGER;
                                if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_justifyP(v_properties)) {
                                    equals_justification = equals.why_equals(obj1, obj2, UNPROVIDED, UNPROVIDED);
                                }
                                doneP = T;
                            } else {
                                if (NIL != disjoint_with.instances_of_disjoint_collectionsP(obj1, obj2, UNPROVIDED, UNPROVIDED)) {
                                    v_similarity = MINUS_ONE_INTEGER;
                                    if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_justifyP(v_properties)) {
                                        different_justification = disjoint_with.why_instances_of_disjoint_collections(obj1, obj2, UNPROVIDED, UNPROVIDED);
                                    }
                                    doneP = T;
                                } else {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_similarity_1 = com.cyc.cycjava.cycl.object_similarity.object_similarity_int(obj1, obj2, mt, v_properties);
                                        SubLObject doneP_2 = thread.secondMultipleValue();
                                        SubLObject equals_justification_3 = thread.thirdMultipleValue();
                                        SubLObject different_justification_4 = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        v_similarity = v_similarity_1;
                                        doneP = doneP_2;
                                        equals_justification = equals_justification_3;
                                        different_justification = different_justification_4;
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(v_similarity, doneP, list(equals_justification, different_justification));
            }
        }
    }

    /**
     *
     *
     * @return 0 numberp; -1 for provably different, 1 for provably equal, 0 for unknown,
    negative for probably different, positive for probably equal.
     * @return 1 booleanp; whether the algorithm ran to quiescence.
    This is an any-time algorithm, so it will produce an answer even if interrupted
    or it runs out of time or resources.
     * @return 2 doubleton?; a pair of the form (justification-p justification-p).
    The first element is a list of supports for why the objects might be equal
    (note that this is not a justification in the strict logical sense),
    and the second element is a list of supports for why the objects might be different.
     */
    @LispMethod(comment = "@return 0 numberp; -1 for provably different, 1 for provably equal, 0 for unknown,\r\nnegative for probably different, positive for probably equal.\r\n@return 1 booleanp; whether the algorithm ran to quiescence.\r\nThis is an any-time algorithm, so it will produce an answer even if interrupted\r\nor it runs out of time or resources.\r\n@return 2 doubleton?; a pair of the form (justification-p justification-p).\r\nThe first element is a list of supports for why the objects might be equal\r\n(note that this is not a justification in the strict logical sense),\r\nand the second element is a list of supports for why the objects might be different.")
    public static SubLObject object_similarity(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(obj1) : "! forts.fort_p(obj1) " + ("forts.fort_p(obj1) " + "CommonSymbols.NIL != forts.fort_p(obj1) ") + obj1;
        assert NIL != forts.fort_p(obj2) : "! forts.fort_p(obj2) " + ("forts.fort_p(obj2) " + "CommonSymbols.NIL != forts.fort_p(obj2) ") + obj2;
        SubLObject v_similarity = ZERO_INTEGER;
        SubLObject doneP = NIL;
        SubLObject equals_justification = NIL;
        SubLObject different_justification = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != equals.asserted_differentP(obj1, obj2)) {
                v_similarity = MINUS_ONE_INTEGER;
                if (NIL != object_similarity_justifyP(v_properties)) {
                    different_justification = equals.why_asserted_different(obj1, obj2);
                }
                doneP = T;
            } else
                if (NIL != equals.equalsP(obj1, obj2, UNPROVIDED, UNPROVIDED)) {
                    v_similarity = ONE_INTEGER;
                    if (NIL != object_similarity_justifyP(v_properties)) {
                        equals_justification = equals.why_equals(obj1, obj2, UNPROVIDED, UNPROVIDED);
                    }
                    doneP = T;
                } else
                    if (NIL != disjoint_with.instances_of_disjoint_collectionsP(obj1, obj2, UNPROVIDED, UNPROVIDED)) {
                        v_similarity = MINUS_ONE_INTEGER;
                        if (NIL != object_similarity_justifyP(v_properties)) {
                            different_justification = disjoint_with.why_instances_of_disjoint_collections(obj1, obj2, UNPROVIDED, UNPROVIDED);
                        }
                        doneP = T;
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject v_similarity_$1 = object_similarity_int(obj1, obj2, mt, v_properties);
                        final SubLObject doneP_$2 = thread.secondMultipleValue();
                        final SubLObject equals_justification_$3 = thread.thirdMultipleValue();
                        final SubLObject different_justification_$4 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        v_similarity = v_similarity_$1;
                        doneP = doneP_$2;
                        equals_justification = equals_justification_$3;
                        different_justification = different_justification_$4;
                    }


        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(v_similarity, doneP, list(equals_justification, different_justification));
    }

    public static final SubLObject object_similarity_int_alt(SubLObject obj1, SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_similarity = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject equals_justification = NIL;
                SubLObject different_justification = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt12$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                v_properties = com.cyc.cycjava.cycl.object_similarity.object_similarity_process_properties(v_properties);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject common_assertions = com.cyc.cycjava.cycl.object_similarity.object_similarity_categorize_assertions(obj1, obj2, mt, v_properties);
                                            SubLObject conflicting_assertions = thread.secondMultipleValue();
                                            SubLObject obj1_assertions = thread.thirdMultipleValue();
                                            SubLObject obj2_assertions = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != conflicting_assertions) {
                                                v_similarity = MINUS_ONE_INTEGER;
                                                {
                                                    SubLObject datum = conflicting_assertions;
                                                    SubLObject current = datum;
                                                    SubLObject assertion = NIL;
                                                    SubLObject justification = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt13);
                                                    assertion = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt13);
                                                    justification = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_justifyP(v_properties)) {
                                                            different_justification = cons(assertion, justification);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt13);
                                                    }
                                                }
                                                doneP = T;
                                            } else {
                                                if (NIL == common_assertions) {
                                                    v_similarity = com.cyc.cycjava.cycl.object_similarity.object_similarity_no_common_assertions(obj1, obj2, obj1_assertions, obj2_assertions);
                                                    doneP = T;
                                                } else {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_similarity_6 = com.cyc.cycjava.cycl.object_similarity.object_similarity_common_assertions(obj1, obj2, common_assertions, obj1_assertions, obj2_assertions, v_properties);
                                                        SubLObject equals_justification_7 = thread.secondMultipleValue();
                                                        SubLObject different_justification_8 = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        v_similarity = v_similarity_6;
                                                        equals_justification = equals_justification_7;
                                                        different_justification = different_justification_8;
                                                    }
                                                    doneP = T;
                                                }
                                            }
                                        }
                                        if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_destroy_problem_store_on_completionP(v_properties)) {
                                            inference_datastructures_problem_store.destroy_problem_store(com.cyc.cycjava.cycl.object_similarity.object_similarity_problem_store(v_properties));
                                        }
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(v_similarity, doneP, equals_justification, different_justification);
            }
        }
    }

    public static SubLObject object_similarity_int(final SubLObject obj1, final SubLObject obj2, final SubLObject mt, SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_similarity = ZERO_INTEGER;
        SubLObject doneP = NIL;
        SubLObject equals_justification = NIL;
        SubLObject different_justification = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                v_properties = object_similarity_process_properties(v_properties);
                thread.resetMultipleValues();
                final SubLObject common_assertions = object_similarity_categorize_assertions(obj1, obj2, mt, v_properties);
                final SubLObject conflicting_assertions = thread.secondMultipleValue();
                final SubLObject obj1_assertions = thread.thirdMultipleValue();
                final SubLObject obj2_assertions = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != conflicting_assertions) {
                    v_similarity = MINUS_ONE_INTEGER;
                    SubLObject current;
                    final SubLObject datum = current = conflicting_assertions;
                    SubLObject assertion = NIL;
                    SubLObject justification = NIL;
                    destructuring_bind_must_consp(current, datum, $list12);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list12);
                    justification = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != object_similarity_justifyP(v_properties)) {
                            different_justification = cons(assertion, justification);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list12);
                    }
                    doneP = T;
                } else
                    if (NIL == common_assertions) {
                        v_similarity = object_similarity_no_common_assertions(obj1, obj2, obj1_assertions, obj2_assertions);
                        doneP = T;
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject v_similarity_$5 = object_similarity_common_assertions(obj1, obj2, common_assertions, obj1_assertions, obj2_assertions, v_properties);
                        final SubLObject equals_justification_$6 = thread.secondMultipleValue();
                        final SubLObject different_justification_$7 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        v_similarity = v_similarity_$5;
                        equals_justification = equals_justification_$6;
                        different_justification = different_justification_$7;
                        doneP = T;
                    }

                if (NIL != object_similarity_destroy_problem_store_on_completionP(v_properties)) {
                    inference_datastructures_problem_store.destroy_problem_store(object_similarity_problem_store(v_properties));
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(v_similarity, doneP, equals_justification, different_justification);
    }

    /**
     *
     *
     * @return 0 listp ; a list of pairs (assertion justification), where assertion is true
    of both OBJ1 and OBJ2 and justification explains why
     * @return 1 listp ; a pair (assertion justification), where assertion is true of either
    OBJ1 or OBJ2 and false of the other and justification explains why
     * @return 2 listp ; a list of assertions true of OBJ1 but not OBJ2
     * @return 3 listp ; a list of assertions true of OBJ2 but not OBJ1
     */
    @LispMethod(comment = "@return 0 listp ; a list of pairs (assertion justification), where assertion is true\r\nof both OBJ1 and OBJ2 and justification explains why\r\n@return 1 listp ; a pair (assertion justification), where assertion is true of either\r\nOBJ1 or OBJ2 and false of the other and justification explains why\r\n@return 2 listp ; a list of assertions true of OBJ1 but not OBJ2\r\n@return 3 listp ; a list of assertions true of OBJ2 but not OBJ1")
    public static final SubLObject object_similarity_categorize_assertions_alt(SubLObject obj1, SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject obj1_common_assertions = com.cyc.cycjava.cycl.object_similarity.object_similarity_categorize_assertions_int(obj1, obj2, mt, v_properties);
                SubLObject obj1_conflicting_assertions = thread.secondMultipleValue();
                SubLObject obj1_assertions = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != obj1_conflicting_assertions) {
                    return values(NIL, obj1_conflicting_assertions, NIL, NIL);
                }
                thread.resetMultipleValues();
                {
                    SubLObject obj2_common_assertions = com.cyc.cycjava.cycl.object_similarity.object_similarity_categorize_assertions_int(obj2, obj1, mt, v_properties);
                    SubLObject obj2_conflicting_assertions = thread.secondMultipleValue();
                    SubLObject obj2_assertions = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != obj2_conflicting_assertions) {
                        return values(NIL, obj2_conflicting_assertions, NIL, NIL);
                    }
                    {
                        SubLObject common_assertions = delete_duplicates(append(obj1_common_assertions, obj2_common_assertions), $sym14$JUSTIFICATION_PAIRS_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return values(common_assertions, NIL, obj1_assertions, obj2_assertions);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 listp ; a list of pairs (assertion justification), where assertion is true
    of both OBJ1 and OBJ2 and justification explains why
     * @return 1 listp ; a pair (assertion justification), where assertion is true of either
    OBJ1 or OBJ2 and false of the other and justification explains why
     * @return 2 listp ; a list of assertions true of OBJ1 but not OBJ2
     * @return 3 listp ; a list of assertions true of OBJ2 but not OBJ1
     */
    @LispMethod(comment = "@return 0 listp ; a list of pairs (assertion justification), where assertion is true\r\nof both OBJ1 and OBJ2 and justification explains why\r\n@return 1 listp ; a pair (assertion justification), where assertion is true of either\r\nOBJ1 or OBJ2 and false of the other and justification explains why\r\n@return 2 listp ; a list of assertions true of OBJ1 but not OBJ2\r\n@return 3 listp ; a list of assertions true of OBJ2 but not OBJ1")
    public static SubLObject object_similarity_categorize_assertions(final SubLObject obj1, final SubLObject obj2, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject obj1_common_assertions = object_similarity_categorize_assertions_int(obj1, obj2, mt, v_properties);
        final SubLObject obj1_conflicting_assertions = thread.secondMultipleValue();
        final SubLObject obj1_assertions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != obj1_conflicting_assertions) {
            return values(NIL, obj1_conflicting_assertions, NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject obj2_common_assertions = object_similarity_categorize_assertions_int(obj2, obj1, mt, v_properties);
        final SubLObject obj2_conflicting_assertions = thread.secondMultipleValue();
        final SubLObject obj2_assertions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != obj2_conflicting_assertions) {
            return values(NIL, obj2_conflicting_assertions, NIL, NIL);
        }
        final SubLObject common_assertions = delete_duplicates(append(obj1_common_assertions, obj2_common_assertions), $sym13$JUSTIFICATION_PAIRS_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(common_assertions, NIL, obj1_assertions, obj2_assertions);
    }

    public static final SubLObject object_similarity_categorize_assertions_int_alt(SubLObject focal_obj, SubLObject other_obj, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_focal_obj = cycl_utilities.hl_to_el(focal_obj);
                SubLObject el_other_obj = cycl_utilities.hl_to_el(other_obj);
                SubLObject common_assertions = NIL;
                SubLObject conflicting_assertions = NIL;
                SubLObject focal_assertions = NIL;
                if (NIL == conflicting_assertions) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.object_similarity.gather_relevant_term_assertions(focal_obj, v_properties);
                        SubLObject focal_assertion = NIL;
                        for (focal_assertion = csome_list_var.first(); !((NIL != conflicting_assertions) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , focal_assertion = csome_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject truth = com.cyc.cycjava.cycl.object_similarity.object_similarity_categorize_assertion(focal_assertion, el_focal_obj, el_other_obj, mt, v_properties);
                                SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject pcase_var = truth;
                                    if (pcase_var.eql($TRUE)) {
                                        common_assertions = cons(list(list(focal_assertion), justification), common_assertions);
                                    } else {
                                        if (pcase_var.eql($FALSE)) {
                                            conflicting_assertions = list(focal_assertion, justification);
                                        } else {
                                            if (pcase_var.eql($UNKNOWN)) {
                                                focal_assertions = cons(focal_assertion, focal_assertions);
                                            } else {
                                                Errors.error($str_alt17$Unknown_truth_value__s, truth);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(common_assertions, conflicting_assertions, focal_assertions);
            }
        }
    }

    public static SubLObject object_similarity_categorize_assertions_int(final SubLObject focal_obj, final SubLObject other_obj, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_focal_obj = cycl_utilities.hl_to_el(focal_obj);
        final SubLObject el_other_obj = cycl_utilities.hl_to_el(other_obj);
        SubLObject common_assertions = NIL;
        SubLObject conflicting_assertions = NIL;
        SubLObject focal_assertions = NIL;
        if (NIL == conflicting_assertions) {
            SubLObject csome_list_var = gather_relevant_term_assertions(focal_obj, v_properties);
            SubLObject focal_assertion = NIL;
            focal_assertion = csome_list_var.first();
            while ((NIL == conflicting_assertions) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject truth = object_similarity_categorize_assertion(focal_assertion, el_focal_obj, el_other_obj, mt, v_properties);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pcase_var = truth;
                if (pcase_var.eql($TRUE)) {
                    common_assertions = cons(list(list(focal_assertion), justification), common_assertions);
                } else
                    if (pcase_var.eql($FALSE)) {
                        conflicting_assertions = list(focal_assertion, justification);
                    } else
                        if (pcase_var.eql($UNKNOWN)) {
                            focal_assertions = cons(focal_assertion, focal_assertions);
                        } else {
                            Errors.error($str16$Unknown_truth_value__s, truth);
                        }


                csome_list_var = csome_list_var.rest();
                focal_assertion = csome_list_var.first();
            } 
        }
        return values(common_assertions, conflicting_assertions, focal_assertions);
    }

    /**
     *
     *
     * @return 0 truth-p ; truth value of ASSERTION when FOCAL-OBJ is replaced with OTHER-OBJ
     * @return 1 justification-p
     */
    @LispMethod(comment = "@return 0 truth-p ; truth value of ASSERTION when FOCAL-OBJ is replaced with OTHER-OBJ\r\n@return 1 justification-p")
    public static final SubLObject object_similarity_categorize_assertion_alt(SubLObject assertion, SubLObject focal_obj, SubLObject other_obj, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_sentence = cycl_utilities.hl_to_el(assertions_high.assertion_formula(assertion));
                SubLObject query_sentence = cycl_utilities.expression_subst(other_obj, focal_obj, el_sentence, symbol_function(EQUAL), UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject negP = com.cyc.cycjava.cycl.object_similarity.object_similarity_query(cycl_utilities.negate(query_sentence), mt, v_properties);
                    SubLObject neg_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject posP = com.cyc.cycjava.cycl.object_similarity.object_similarity_query(query_sentence, mt, v_properties);
                        SubLObject pos_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != negP) && (NIL != posP)) {
                            return values($UNKNOWN, union(neg_justification, pos_justification, symbol_function(EQUAL), UNPROVIDED));
                        } else {
                            if (NIL != negP) {
                                return values($FALSE, neg_justification);
                            } else {
                                if (NIL != posP) {
                                    return values($TRUE, pos_justification);
                                } else {
                                    return values($UNKNOWN, NIL);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 truth-p ; truth value of ASSERTION when FOCAL-OBJ is replaced with OTHER-OBJ
     * @return 1 justification-p
     */
    @LispMethod(comment = "@return 0 truth-p ; truth value of ASSERTION when FOCAL-OBJ is replaced with OTHER-OBJ\r\n@return 1 justification-p")
    public static SubLObject object_similarity_categorize_assertion(final SubLObject assertion, final SubLObject focal_obj, final SubLObject other_obj, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_sentence = cycl_utilities.hl_to_el(assertions_high.assertion_formula(assertion));
        final SubLObject query_sentence = cycl_utilities.expression_subst(other_obj, focal_obj, el_sentence, symbol_function(EQUAL), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject negP = object_similarity_query(cycl_utilities.negate(query_sentence), mt, v_properties);
        final SubLObject neg_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject posP = object_similarity_query(query_sentence, mt, v_properties);
        final SubLObject pos_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != negP) && (NIL != posP)) {
            return values($UNKNOWN, union(neg_justification, pos_justification, symbol_function(EQUAL), UNPROVIDED));
        }
        if (NIL != negP) {
            return values($FALSE, neg_justification);
        }
        if (NIL != posP) {
            return values($TRUE, pos_justification);
        }
        return values($UNKNOWN, NIL);
    }

    public static final SubLObject gather_relevant_term_assertions_alt(SubLObject v_term, SubLObject v_properties) {
        {
            SubLObject assertions = NIL;
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                        {
                                            SubLObject done_var_9 = NIL;
                                            SubLObject token_var_10 = NIL;
                                            while (NIL == done_var_9) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                    SubLObject valid_11 = makeBoolean(token_var_10 != assertion);
                                                    if (NIL != valid_11) {
                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                            if (NIL == com.cyc.cycjava.cycl.object_similarity.object_similarity_irrelevant_assertionP(assertion, v_term, v_properties)) {
                                                                assertions = cons(assertion, assertions);
                                                            }
                                                        }
                                                    }
                                                    done_var_9 = makeBoolean(NIL == valid_11);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            assertions = list_utilities.delete_subsumed_items(assertions, $sym18$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_, UNPROVIDED);
            return assertions;
        }
    }

    public static SubLObject gather_relevant_term_assertions(final SubLObject v_term, final SubLObject v_properties) {
        SubLObject assertions = NIL;
        if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var_$9 = NIL;
                        final SubLObject token_var_$10 = NIL;
                        while (NIL == done_var_$9) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                            if (((NIL != valid_$11) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) && (NIL == object_similarity_irrelevant_assertionP(assertion, v_term, v_properties))) {
                                assertions = cons(assertion, assertions);
                            }
                            done_var_$9 = makeBoolean(NIL == valid_$11);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        assertions = list_utilities.delete_subsumed_items(assertions, $sym17$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_, UNPROVIDED);
        return assertions;
    }

    public static final SubLObject object_similarity_irrelevant_assertionP_alt(SubLObject assertion, SubLObject v_term, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == assertions_high.gaf_assertionP(assertion)) {
                return T;
            } else {
                if (NIL != function_terms.tou_assertionP(assertion)) {
                    return T;
                } else {
                    if ((NIL == com.cyc.cycjava.cycl.object_similarity.object_similarity_consider_meta_assertionsP(v_properties)) && (NIL != assertions_high.meta_assertionP(assertion))) {
                        return T;
                    } else {
                        if (NIL != list_utilities.member_eqP(assertions_high.gaf_predicate(assertion), com.cyc.cycjava.cycl.object_similarity.object_similarity_irrelevant_predicates(v_properties))) {
                            return T;
                        } else {
                            {
                                SubLObject irrelevantP = NIL;
                                {
                                    SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                                    try {
                                        cycl_utilities.$opaque_arg_function$.bind($sym19$OPAQUE_ARG_WRT_QUOTING_, thread);
                                        irrelevantP = makeBoolean(NIL == cycl_utilities.expression_find(v_term, assertion, T, UNPROVIDED, UNPROVIDED));
                                    } finally {
                                        cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                return irrelevantP;
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject object_similarity_irrelevant_assertionP(final SubLObject assertion, final SubLObject v_term, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == assertions_high.gaf_assertionP(assertion)) {
            return T;
        }
        if (NIL != function_terms.tou_assertionP(assertion)) {
            return T;
        }
        if ((NIL == object_similarity_consider_meta_assertionsP(v_properties)) && (NIL != assertions_high.meta_assertionP(assertion))) {
            return T;
        }
        if (NIL != list_utilities.member_eqP(assertions_high.gaf_predicate(assertion), object_similarity_irrelevant_predicates(v_properties))) {
            return T;
        }
        SubLObject irrelevantP = NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind($sym18$OPAQUE_ARG_WRT_QUOTING_, thread);
            irrelevantP = makeBoolean(NIL == cycl_utilities.expression_find(v_term, assertion, T, UNPROVIDED, UNPROVIDED));
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return irrelevantP;
    }

    public static final SubLObject object_similarity_assertion_subsumesP_alt(SubLObject assertion1, SubLObject assertion2) {
        return makeBoolean((assertion1 == assertion2) || (assertions_high.assertion_formula(assertion1).equal(assertions_high.assertion_formula(assertion2)) && (NIL != genl_mts.genl_mtP(assertions_high.assertion_mt(assertion1), assertions_high.assertion_mt(assertion2), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject object_similarity_assertion_subsumesP(final SubLObject assertion1, final SubLObject assertion2) {
        return makeBoolean(assertion1.eql(assertion2) || (assertions_high.assertion_formula(assertion1).equal(assertions_high.assertion_formula(assertion2)) && (NIL != genl_mts.genl_mtP(assertions_high.assertion_mt(assertion1), assertions_high.assertion_mt(assertion2), UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject object_similarity_query_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_properties = com.cyc.cycjava.cycl.object_similarity.object_similarity_query_properties(sentence, v_properties);
                thread.resetMultipleValues();
                {
                    SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    SubLObject inference = thread.thirdMultipleValue();
                    SubLObject metrics = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != results) {
                        {
                            SubLObject result = results.first();
                            SubLObject justification = second(result);
                            return values(T, justification);
                        }
                    } else {
                        return values(NIL, NIL);
                    }
                }
            }
        }
    }

    public static SubLObject object_similarity_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = object_similarity_query_properties(sentence, v_properties);
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != results) {
            final SubLObject result = results.first();
            final SubLObject justification = second(result);
            return values(T, justification);
        }
        return values(NIL, NIL);
    }

    public static final SubLObject object_similarity_no_common_assertions_alt(SubLObject obj1, SubLObject obj2, SubLObject obj1_assertions, SubLObject obj2_assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.object_similarity.object_similarity_from_uncommon_assertions(obj1_assertions, obj2_assertions, $object_similarity_no_common_assertions_base$.getDynamicValue(thread));
        }
    }

    public static SubLObject object_similarity_no_common_assertions(final SubLObject obj1, final SubLObject obj2, final SubLObject obj1_assertions, final SubLObject obj2_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return object_similarity_from_uncommon_assertions(obj1_assertions, obj2_assertions, $object_similarity_no_common_assertions_base$.getDynamicValue(thread));
    }

    public static final SubLObject object_similarity_from_uncommon_assertions_alt(SubLObject obj1_assertions, SubLObject obj2_assertions, SubLObject base) {
        SubLTrampolineFile.checkType(base, NUMBERP);
        {
            SubLObject count1 = length(obj1_assertions);
            SubLObject count2 = length(obj2_assertions);
            return add(MINUS_ONE_INTEGER, expt(base, minus(min(count1, count2))));
        }
    }

    public static SubLObject object_similarity_from_uncommon_assertions(final SubLObject obj1_assertions, final SubLObject obj2_assertions, final SubLObject base) {
        assert NIL != numberp(base) : "! numberp(base) " + ("Types.numberp(base) " + "CommonSymbols.NIL != Types.numberp(base) ") + base;
        final SubLObject count1 = length(obj1_assertions);
        final SubLObject count2 = length(obj2_assertions);
        return add(MINUS_ONE_INTEGER, expt(base, minus(min(count1, count2))));
    }

    public static final SubLObject object_similarity_common_assertions_alt(SubLObject obj1, SubLObject obj2, SubLObject common_assertions, SubLObject obj1_assertions, SubLObject obj2_assertions, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_similarity = ZERO_INTEGER;
                SubLObject equals_justification = NIL;
                SubLObject different_justification = NIL;
                v_similarity = add(v_similarity, com.cyc.cycjava.cycl.object_similarity.object_similarity_from_common_assertions(common_assertions, $object_similarity_common_assertions_common_base$.getDynamicValue(thread)));
                if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_justifyP(v_properties)) {
                    equals_justification = common_assertions;
                }
                v_similarity = add(v_similarity, com.cyc.cycjava.cycl.object_similarity.object_similarity_from_uncommon_assertions(obj1_assertions, obj2_assertions, $object_similarity_common_assertions_uncommon_base$.getDynamicValue(thread)));
                if (NIL != com.cyc.cycjava.cycl.object_similarity.object_similarity_justifyP(v_properties)) {
                    different_justification = append(obj1_assertions, obj2_assertions);
                }
                return values(v_similarity, equals_justification, different_justification);
            }
        }
    }

    public static SubLObject object_similarity_common_assertions(final SubLObject obj1, final SubLObject obj2, final SubLObject common_assertions, final SubLObject obj1_assertions, final SubLObject obj2_assertions, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_similarity = ZERO_INTEGER;
        SubLObject equals_justification = NIL;
        SubLObject different_justification = NIL;
        v_similarity = add(v_similarity, object_similarity_from_common_assertions(common_assertions, $object_similarity_common_assertions_common_base$.getDynamicValue(thread)));
        if (NIL != object_similarity_justifyP(v_properties)) {
            equals_justification = common_assertions;
        }
        v_similarity = add(v_similarity, object_similarity_from_uncommon_assertions(obj1_assertions, obj2_assertions, $object_similarity_common_assertions_uncommon_base$.getDynamicValue(thread)));
        if (NIL != object_similarity_justifyP(v_properties)) {
            different_justification = append(obj1_assertions, obj2_assertions);
        }
        return values(v_similarity, equals_justification, different_justification);
    }

    public static final SubLObject object_similarity_from_common_assertions_alt(SubLObject common_assertions, SubLObject base) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_weight = ZERO_INTEGER;
                SubLObject cdolist_list_var = common_assertions;
                SubLObject common_assertion = NIL;
                for (common_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_assertion = cdolist_list_var.first()) {
                    {
                        SubLObject datum = common_assertion;
                        SubLObject current = datum;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        {
                            SubLObject temp = current.rest();
                            current = current.first();
                            {
                                SubLObject assertion = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt22);
                                assertion = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp;
                                    {
                                        SubLObject justification = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt22);
                                        justification = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject mt = assertions_high.assertion_mt(assertion);
                                                SubLObject weight = (NIL != mt_vars.core_microtheory_p(mt)) ? ((SubLObject) ($object_similarity_core_mt_weight$.getDynamicValue(thread))) : ONE_INTEGER;
                                                total_weight = add(total_weight, weight);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt22);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt22);
                                }
                            }
                        }
                    }
                }
                return subtract(ONE_INTEGER, expt(base, minus(total_weight)));
            }
        }
    }

    public static SubLObject object_similarity_from_common_assertions(final SubLObject common_assertions, final SubLObject base) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_weight = ZERO_INTEGER;
        SubLObject cdolist_list_var = common_assertions;
        SubLObject common_assertion = NIL;
        common_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = common_assertion;
            destructuring_bind_must_consp(current, datum, $list21);
            final SubLObject temp = current.rest();
            current = current.first();
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list21);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                current = temp;
                SubLObject justification = NIL;
                destructuring_bind_must_consp(current, datum, $list21);
                justification = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject weight = (NIL != mt_vars.core_microtheory_p(mt)) ? $object_similarity_core_mt_weight$.getDynamicValue(thread) : ONE_INTEGER;
                    total_weight = add(total_weight, weight);
                } else {
                    cdestructuring_bind_error(datum, $list21);
                }
            } else {
                cdestructuring_bind_error(datum, $list21);
            }
            cdolist_list_var = cdolist_list_var.rest();
            common_assertion = cdolist_list_var.first();
        } 
        return subtract(ONE_INTEGER, expt(base, minus(total_weight)));
    }

    public static final SubLObject justification_pairs_equalP_alt(SubLObject just_pair1, SubLObject just_pair2) {
        {
            SubLObject datum = just_pair1;
            SubLObject current = datum;
            SubLObject just11 = NIL;
            SubLObject just12 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            just11 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            just12 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_12 = just_pair2;
                    SubLObject current_13 = datum_12;
                    SubLObject just21 = NIL;
                    SubLObject just22 = NIL;
                    destructuring_bind_must_consp(current_13, datum_12, $list_alt24);
                    just21 = current_13.first();
                    current_13 = current_13.rest();
                    destructuring_bind_must_consp(current_13, datum_12, $list_alt24);
                    just22 = current_13.first();
                    current_13 = current_13.rest();
                    if (NIL == current_13) {
                        if (((NIL != list_utilities.sets_equalP(just11, just21, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(just12, just22, symbol_function(EQUAL)))) || ((NIL != list_utilities.sets_equalP(just11, just22, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(just12, just21, symbol_function(EQUAL))))) {
                            return T;
                        }
                        {
                            SubLObject expand11 = hl_supports.hl_justification_expand(just11);
                            SubLObject expand12 = hl_supports.hl_justification_expand(just12);
                            SubLObject expand21 = hl_supports.hl_justification_expand(just21);
                            SubLObject expand22 = hl_supports.hl_justification_expand(just22);
                            return makeBoolean(((NIL != list_utilities.sets_equalP(expand11, expand21, UNPROVIDED)) && (NIL != list_utilities.sets_equalP(expand12, expand22, UNPROVIDED))) || ((NIL != list_utilities.sets_equalP(expand11, expand22, UNPROVIDED)) && (NIL != list_utilities.sets_equalP(expand12, expand21, UNPROVIDED))));
                        }
                    } else {
                        cdestructuring_bind_error(datum_12, $list_alt24);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject justification_pairs_equalP(final SubLObject just_pair1, final SubLObject just_pair2) {
        SubLObject just11 = NIL;
        SubLObject just12 = NIL;
        destructuring_bind_must_consp(just_pair1, just_pair1, $list22);
        just11 = just_pair1.first();
        SubLObject current = just_pair1.rest();
        destructuring_bind_must_consp(current, just_pair1, $list22);
        just12 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject just13 = NIL;
            SubLObject just14 = NIL;
            destructuring_bind_must_consp(just_pair2, just_pair2, $list23);
            just13 = just_pair2.first();
            SubLObject current_$13 = just_pair2.rest();
            destructuring_bind_must_consp(current_$13, just_pair2, $list23);
            just14 = current_$13.first();
            current_$13 = current_$13.rest();
            if (NIL == current_$13) {
                if (((NIL != list_utilities.sets_equalP(just11, just13, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(just12, just14, symbol_function(EQUAL)))) || ((NIL != list_utilities.sets_equalP(just11, just14, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(just12, just13, symbol_function(EQUAL))))) {
                    return T;
                }
                final SubLObject expand11 = hl_supports.hl_justification_expand(just11);
                final SubLObject expand12 = hl_supports.hl_justification_expand(just12);
                final SubLObject expand13 = hl_supports.hl_justification_expand(just13);
                final SubLObject expand14 = hl_supports.hl_justification_expand(just14);
                return makeBoolean(((NIL != list_utilities.sets_equalP(expand11, expand13, UNPROVIDED)) && (NIL != list_utilities.sets_equalP(expand12, expand14, UNPROVIDED))) || ((NIL != list_utilities.sets_equalP(expand11, expand14, UNPROVIDED)) && (NIL != list_utilities.sets_equalP(expand12, expand13, UNPROVIDED))));
            } else {
                cdestructuring_bind_error(just_pair2, $list23);
            }
        } else {
            cdestructuring_bind_error(just_pair1, $list22);
        }
        return NIL;
    }

    public static final SubLObject justifications_equalP_internal_alt(SubLObject just1, SubLObject just2) {
        if (NIL != list_utilities.sets_equalP(just1, just2, symbol_function(EQUAL))) {
            return T;
        } else {
            {
                SubLObject expanded_just1 = hl_supports.hl_justification_expand(just1);
                SubLObject expanded_just2 = hl_supports.hl_justification_expand(just2);
                return list_utilities.sets_equalP(expanded_just1, expanded_just2, symbol_function(EQUAL));
            }
        }
    }

    public static SubLObject justifications_equalP_internal(final SubLObject just1, final SubLObject just2) {
        if (NIL != list_utilities.sets_equalP(just1, just2, symbol_function(EQUAL))) {
            return T;
        }
        final SubLObject expanded_just1 = hl_supports.hl_justification_expand(just1);
        final SubLObject expanded_just2 = hl_supports.hl_justification_expand(just2);
        return list_utilities.sets_equalP(expanded_just1, expanded_just2, symbol_function(EQUAL));
    }

    public static final SubLObject justifications_equalP_alt(SubLObject just1, SubLObject just2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.object_similarity.justifications_equalP_internal(just1, just2);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym25$JUSTIFICATIONS_EQUAL_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym25$JUSTIFICATIONS_EQUAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym25$JUSTIFICATIONS_EQUAL_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(just1, just2);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw26$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (just1.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && just2.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.object_similarity.justifications_equalP_internal(just1, just2)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(just1, just2));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject justifications_equalP(final SubLObject just1, final SubLObject just2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return justifications_equalP_internal(just1, just2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym24$JUSTIFICATIONS_EQUAL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym24$JUSTIFICATIONS_EQUAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym24$JUSTIFICATIONS_EQUAL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(just1, just2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (just1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && just2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(justifications_equalP_internal(just1, just2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(just1, just2));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject object_similarity_process_properties_alt(SubLObject v_properties) {
        {
            SubLObject problem_store = com.cyc.cycjava.cycl.object_similarity.object_similarity_problem_store(v_properties);
            if (NIL == inference_datastructures_problem_store.problem_store_p(problem_store)) {
                {
                    SubLObject inference = inference_macros.current_controlling_inference();
                    if (NIL != inference_datastructures_inference.inference_p(inference)) {
                        problem_store = inference_datastructures_inference.inference_problem_store(inference);
                    } else {
                        problem_store = inference_datastructures_problem_store.new_problem_store($list_alt27);
                        v_properties = putf(v_properties, $kw28$DESTROY_PROBLEM_STORE_ON_COMPLETION_, T);
                    }
                }
                v_properties = putf(v_properties, $PROBLEM_STORE, problem_store);
            }
            return v_properties;
        }
    }

    public static SubLObject object_similarity_process_properties(SubLObject v_properties) {
        SubLObject problem_store = object_similarity_problem_store(v_properties);
        if (NIL == inference_datastructures_problem_store.problem_store_p(problem_store)) {
            final SubLObject inference = inference_macros.current_controlling_inference();
            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                problem_store = inference_datastructures_inference.inference_problem_store(inference);
            } else {
                problem_store = inference_datastructures_problem_store.new_problem_store($list25);
                v_properties = putf(v_properties, $kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_, T);
            }
            v_properties = putf(v_properties, $PROBLEM_STORE, problem_store);
        }
        return v_properties;
    }

    public static final SubLObject object_similarity_justifyP_alt(SubLObject v_properties) {
        return getf(v_properties, $JUSTIFY_, UNPROVIDED);
    }

    public static SubLObject object_similarity_justifyP(final SubLObject v_properties) {
        return getf(v_properties, $JUSTIFY_, UNPROVIDED);
    }

    public static final SubLObject object_similarity_problem_store_alt(SubLObject v_properties) {
        return getf(v_properties, $PROBLEM_STORE, UNPROVIDED);
    }

    public static SubLObject object_similarity_problem_store(final SubLObject v_properties) {
        return getf(v_properties, $PROBLEM_STORE, UNPROVIDED);
    }

    public static final SubLObject object_similarity_destroy_problem_store_on_completionP_alt(SubLObject v_properties) {
        return getf(v_properties, $kw28$DESTROY_PROBLEM_STORE_ON_COMPLETION_, UNPROVIDED);
    }

    public static SubLObject object_similarity_destroy_problem_store_on_completionP(final SubLObject v_properties) {
        return getf(v_properties, $kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_, UNPROVIDED);
    }

    public static final SubLObject object_similarity_consider_meta_assertionsP_alt(SubLObject v_properties) {
        return getf(v_properties, $kw31$CONSIDER_META_ASSERTIONS_, UNPROVIDED);
    }

    public static SubLObject object_similarity_consider_meta_assertionsP(final SubLObject v_properties) {
        return getf(v_properties, $kw29$CONSIDER_META_ASSERTIONS_, UNPROVIDED);
    }

    public static final SubLObject object_similarity_irrelevant_predicates_alt(SubLObject v_properties) {
        return getf(v_properties, $IRRELEVANT_PREDICATES, $list_alt33);
    }

    public static SubLObject object_similarity_irrelevant_predicates(final SubLObject v_properties) {
        return getf(v_properties, $IRRELEVANT_PREDICATES, $list31);
    }

    public static final SubLObject object_similarity_query_properties_alt(SubLObject query_sentence, SubLObject v_properties) {
        {
            SubLObject problem_store = com.cyc.cycjava.cycl.object_similarity.object_similarity_problem_store(v_properties);
            SubLObject query_properties = listS($PROBLEM_STORE, problem_store, $list_alt34);
            return query_properties;
        }
    }

    public static SubLObject object_similarity_query_properties(final SubLObject query_sentence, final SubLObject v_properties) {
        final SubLObject problem_store = object_similarity_problem_store(v_properties);
        final SubLObject query_properties = listS($PROBLEM_STORE, problem_store, $list32);
        return query_properties;
    }

    public static SubLObject declare_object_similarity_file() {
        declareMacro("possibly_set_similarity_justification", "POSSIBLY-SET-SIMILARITY-JUSTIFICATION");
        declareFunction("objects_probably_equalP", "OBJECTS-PROBABLY-EQUAL?", 2, 2, false);
        declareFunction("qualitative_object_similarity", "QUALITATIVE-OBJECT-SIMILARITY", 2, 2, false);
        declareFunction("object_similarity", "OBJECT-SIMILARITY", 2, 2, false);
        declareFunction("object_similarity_int", "OBJECT-SIMILARITY-INT", 4, 0, false);
        declareFunction("object_similarity_categorize_assertions", "OBJECT-SIMILARITY-CATEGORIZE-ASSERTIONS", 4, 0, false);
        declareFunction("object_similarity_categorize_assertions_int", "OBJECT-SIMILARITY-CATEGORIZE-ASSERTIONS-INT", 4, 0, false);
        declareFunction("object_similarity_categorize_assertion", "OBJECT-SIMILARITY-CATEGORIZE-ASSERTION", 5, 0, false);
        declareFunction("gather_relevant_term_assertions", "GATHER-RELEVANT-TERM-ASSERTIONS", 2, 0, false);
        declareFunction("object_similarity_irrelevant_assertionP", "OBJECT-SIMILARITY-IRRELEVANT-ASSERTION?", 3, 0, false);
        declareFunction("object_similarity_assertion_subsumesP", "OBJECT-SIMILARITY-ASSERTION-SUBSUMES?", 2, 0, false);
        declareFunction("object_similarity_query", "OBJECT-SIMILARITY-QUERY", 3, 0, false);
        declareFunction("object_similarity_no_common_assertions", "OBJECT-SIMILARITY-NO-COMMON-ASSERTIONS", 4, 0, false);
        declareFunction("object_similarity_from_uncommon_assertions", "OBJECT-SIMILARITY-FROM-UNCOMMON-ASSERTIONS", 3, 0, false);
        declareFunction("object_similarity_common_assertions", "OBJECT-SIMILARITY-COMMON-ASSERTIONS", 6, 0, false);
        declareFunction("object_similarity_from_common_assertions", "OBJECT-SIMILARITY-FROM-COMMON-ASSERTIONS", 2, 0, false);
        declareFunction("justification_pairs_equalP", "JUSTIFICATION-PAIRS-EQUAL?", 2, 0, false);
        declareFunction("justifications_equalP_internal", "JUSTIFICATIONS-EQUAL?-INTERNAL", 2, 0, false);
        declareFunction("justifications_equalP", "JUSTIFICATIONS-EQUAL?", 2, 0, false);
        declareFunction("object_similarity_process_properties", "OBJECT-SIMILARITY-PROCESS-PROPERTIES", 1, 0, false);
        declareFunction("object_similarity_justifyP", "OBJECT-SIMILARITY-JUSTIFY?", 1, 0, false);
        declareFunction("object_similarity_problem_store", "OBJECT-SIMILARITY-PROBLEM-STORE", 1, 0, false);
        declareFunction("object_similarity_destroy_problem_store_on_completionP", "OBJECT-SIMILARITY-DESTROY-PROBLEM-STORE-ON-COMPLETION?", 1, 0, false);
        declareFunction("object_similarity_consider_meta_assertionsP", "OBJECT-SIMILARITY-CONSIDER-META-ASSERTIONS?", 1, 0, false);
        declareFunction("object_similarity_irrelevant_predicates", "OBJECT-SIMILARITY-IRRELEVANT-PREDICATES", 1, 0, false);
        declareFunction("object_similarity_query_properties", "OBJECT-SIMILARITY-QUERY-PROPERTIES", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_object_similarity_file() {
        defparameter("*OBJECT-SIMILARITY-UNKNOWN-BOUND*", $float$0_2);
        defparameter("*OBJECT-SIMILARITY-NO-COMMON-ASSERTIONS-BASE*", $float$1_2);
        defparameter("*OBJECT-SIMILARITY-COMMON-ASSERTIONS-COMMON-BASE*", $float$1_2);
        defparameter("*OBJECT-SIMILARITY-COMMON-ASSERTIONS-UNCOMMON-BASE*", $float$1_2);
        defparameter("*OBJECT-SIMILARITY-CORE-MT-WEIGHT*", $float$0_2);
        return NIL;
    }

    public static final SubLObject setup_object_similarity_file_alt() {
        memoization_state.note_memoized_function($sym25$JUSTIFICATIONS_EQUAL_);
        return NIL;
    }

    public static SubLObject setup_object_similarity_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function($sym24$JUSTIFICATIONS_EQUAL_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym25$JUSTIFICATIONS_EQUAL_);
        }
        return NIL;
    }

    public static SubLObject setup_object_similarity_file_Previous() {
        memoization_state.note_memoized_function($sym24$JUSTIFICATIONS_EQUAL_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_object_similarity_file();
    }

    @Override
    public void initializeVariables() {
        init_object_similarity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_object_similarity_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("VARIABLE"), makeSymbol("JUSTIFICATION"), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt7$Similarity__s_out_of_bounds_ = makeString("Similarity ~s out of bounds.");

    static private final SubLString $str_alt12$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt13 = list(makeSymbol("ASSERTION"), makeSymbol("JUSTIFICATION"));

    static private final SubLSymbol $sym14$JUSTIFICATION_PAIRS_EQUAL_ = makeSymbol("JUSTIFICATION-PAIRS-EQUAL?");

    static private final SubLString $str_alt17$Unknown_truth_value__s = makeString("Unknown truth value ~s");

    static private final SubLSymbol $sym18$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_ = makeSymbol("OBJECT-SIMILARITY-ASSERTION-SUBSUMES?");

    static private final SubLSymbol $sym19$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING?");

    static private final SubLList $list_alt22 = list(list(makeSymbol("ASSERTION")), makeSymbol("JUSTIFICATION"));

    static private final SubLList $list_alt23 = list(makeSymbol("JUST11"), makeSymbol("JUST12"));

    static private final SubLList $list_alt24 = list(makeSymbol("JUST21"), makeSymbol("JUST22"));

    static private final SubLSymbol $sym25$JUSTIFICATIONS_EQUAL_ = makeSymbol("JUSTIFICATIONS-EQUAL?");

    public static final SubLSymbol $kw26$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt27 = list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL);

    public static final SubLSymbol $kw28$DESTROY_PROBLEM_STORE_ON_COMPLETION_ = makeKeyword("DESTROY-PROBLEM-STORE-ON-COMPLETION?");

    public static final SubLSymbol $kw31$CONSIDER_META_ASSERTIONS_ = makeKeyword("CONSIDER-META-ASSERTIONS?");

    static private final SubLList $list_alt33 = list(reader_make_constant_shell("quotedIsa"));

    static private final SubLList $list_alt34 = list(makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("CONTINUABLE?"), NIL);
}

/**
 * Total time: 333 ms
 */
