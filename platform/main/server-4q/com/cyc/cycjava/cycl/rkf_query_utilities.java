/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-QUERY-UTILITIES
 * source file: /cyc/top/cycl/rkf-query-utilities.lisp
 * created:     2019/07/03 17:37:58
 */
public final class rkf_query_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_query_utilities();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_default_new_query_properties$ = makeSymbol("*RKF-DEFAULT-NEW-QUERY-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rkf_known_time_cutoff$ = makeSymbol("*RKF-KNOWN-TIME-CUTOFF*");

    static private final SubLString $str3$RKF_CHOOSE_QUERY_METHOD__This_is_ = makeString("RKF-CHOOSE-QUERY-METHOD: This is a legacy function and will go away; use RKF-DETERMINE-QUERY-TYPE instead.");

    private static final SubLSymbol RKF_TRUTH = makeSymbol("RKF-TRUTH");

    private static final SubLSymbol RKF_QUERY = makeSymbol("RKF-QUERY");

    static private final SubLString $str6$Unsupported_query_type__A_ = makeString("Unsupported query type ~A.");

    static private final SubLString $str8$__RKF_ASK_timed_out_after__S_seco = makeString("~&RKF-ASK timed out after ~S seconds on ~S in ~S.~%");

    private static final SubLSymbol $kw9$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    static private final SubLList $list14 = list(makeSymbol("BINDING"), makeSymbol("JUSTIFICATION"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    static private final SubLList $list20 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list21 = list(makeSymbol("PROS"), makeSymbol("CONS"));



    private static final SubLSymbol $kw25$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol RKF_KNOWN = makeSymbol("RKF-KNOWN");

    // Definitions
    /**
     * Classify formula into those where we want to check their truth, prove
     * them or just get the bindings back.
     */
    @LispMethod(comment = "Classify formula into those where we want to check their truth, prove\r\nthem or just get the bindings back.\nClassify formula into those where we want to check their truth, prove\nthem or just get the bindings back.")
    public static final SubLObject rkf_determine_query_type_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != closedP(formula, UNPROVIDED)) {
            return $TRUTH;
        } else {
            if (NIL != el_implication_p(formula)) {
                return $PROVE;
            } else {
                return $ASK;
            }
        }
    }

    // Definitions
    /**
     * Classify formula into those where we want to check their truth, prove
     * them or just get the bindings back.
     */
    @LispMethod(comment = "Classify formula into those where we want to check their truth, prove\r\nthem or just get the bindings back.\nClassify formula into those where we want to check their truth, prove\nthem or just get the bindings back.")
    public static SubLObject rkf_determine_query_type(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != closedP(formula, UNPROVIDED)) {
            return $TRUTH;
        }
        if (NIL != el_implication_p(formula)) {
            return $PROVE;
        }
        return $ASK;
    }

    public static final SubLObject rkf_choose_query_method_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        Errors.warn($str_alt3$RKF_CHOOSE_QUERY_METHOD__This_is_);
        {
            SubLObject type = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_determine_query_type(formula, mt);
            SubLObject pcase_var = type;
            if (pcase_var.eql($TRUTH)) {
                return RKF_TRUTH;
            } else {
                return RKF_QUERY;
            }
        }
    }

    public static SubLObject rkf_choose_query_method(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        Errors.warn($str3$RKF_CHOOSE_QUERY_METHOD__This_is_);
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = rkf_determine_query_type(formula, mt);
        if (pcase_var.eql($TRUTH)) {
            return RKF_TRUTH;
        }
        return RKF_QUERY;
    }

    /**
     * Figure out by formula analysis what the right query class, call that query, and return the
     * bindings and results.
     */
    @LispMethod(comment = "Figure out by formula analysis what the right query class, call that query, and return the\r\nbindings and results.\nFigure out by formula analysis what the right query class, call that query, and return the\nbindings and results.")
    public static final SubLObject rkf_generic_query_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject classification = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_determine_query_type(formula, mt);
                SubLObject pcase_var = classification;
                if (pcase_var.eql($TRUTH)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject pro = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_truth(formula, mt, backchain, number, time, depth);
                        SubLObject cons = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return values($TRUTH, pro, cons);
                    }
                } else {
                    if (pcase_var.eql($PROVE)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject results = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_prove(formula, mt, backchain, number, time, depth);
                            SubLObject status = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            return values($PROVE, results, status);
                        }
                    } else {
                        if (pcase_var.eql($ASK)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject results = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_ask(formula, mt, backchain, number, time, depth);
                                SubLObject status = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                return values($ASK, results, status);
                            }
                        } else {
                            Errors.error($str_alt6$Unsupported_query_type__A_, classification);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Figure out by formula analysis what the right query class, call that query, and return the
     * bindings and results.
     */
    @LispMethod(comment = "Figure out by formula analysis what the right query class, call that query, and return the\r\nbindings and results.\nFigure out by formula analysis what the right query class, call that query, and return the\nbindings and results.")
    public static SubLObject rkf_generic_query(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject classification = pcase_var = rkf_determine_query_type(formula, mt);
        if (pcase_var.eql($TRUTH)) {
            thread.resetMultipleValues();
            final SubLObject pro = rkf_truth(formula, mt, backchain, number, time, depth);
            final SubLObject cons = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values($TRUTH, pro, cons);
        }
        if (pcase_var.eql($PROVE)) {
            thread.resetMultipleValues();
            final SubLObject results = rkf_prove(formula, mt, backchain, number, time, depth);
            final SubLObject status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values($PROVE, results, status);
        }
        if (pcase_var.eql($ASK)) {
            thread.resetMultipleValues();
            final SubLObject results = rkf_ask(formula, mt, backchain, number, time, depth);
            final SubLObject status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values($ASK, results, status);
        }
        Errors.error($str6$Unsupported_query_type__A_, classification);
        return NIL;
    }

    public static final SubLObject rkf_query_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_determine_query_type(formula, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject status = NIL;
                if (type == $PROVE) {
                    thread.resetMultipleValues();
                    {
                        SubLObject res = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_prove(formula, mt, backchain, number, time, depth);
                        SubLObject stat = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = res;
                        status = stat;
                    }
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject res = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_ask(formula, mt, backchain, number, time, depth);
                        SubLObject stat = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = res;
                        status = stat;
                    }
                }
                return values(result, status);
            }
        }
    }

    public static SubLObject rkf_query(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = rkf_determine_query_type(formula, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject status = NIL;
        if (type == $PROVE) {
            thread.resetMultipleValues();
            final SubLObject res = rkf_prove(formula, mt, backchain, number, time, depth);
            final SubLObject stat = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = res;
            status = stat;
        } else {
            thread.resetMultipleValues();
            final SubLObject res = rkf_ask(formula, mt, backchain, number, time, depth);
            final SubLObject stat = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = res;
            status = stat;
        }
        return values(result, status);
    }

    public static final SubLObject rkf_ask_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject status = NIL;
                {
                    SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                    try {
                        $cache_inference_results$.bind(NIL, thread);
                        api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject ask_result = ask_utilities.ask_justified(formula, mt, backchain, number, time, depth);
                            SubLObject ask_status = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != number_utilities.positive_number_p(time)) && ($MAX_TIME == ask_status)) {
                                Errors.warn($str_alt8$__RKF_ASK_timed_out_after__S_seco, time, formula, mt);
                            }
                            result = ask_result;
                            status = ask_status;
                        }
                    } finally {
                        api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_1, thread);
                        $cache_inference_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, status);
            }
        }
    }

    public static SubLObject rkf_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject status = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject ask_result = ask_utilities.ask_justified(formula, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != number_utilities.positive_number_p(time)) && ($MAX_TIME == ask_status)) {
                Errors.warn($str8$__RKF_ASK_timed_out_after__S_seco, time, formula, mt);
            }
            result = ask_result;
            status = ask_status;
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return values(result, status);
    }

    public static final SubLObject rkf_prove_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject status = NIL;
                {
                    SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                    try {
                        $cache_inference_results$.bind(NIL, thread);
                        api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject ask_result = prove.prove_justified(formula, mt, backchain, number, time, depth);
                            SubLObject ask_status = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = ask_result;
                            status = ask_status;
                        }
                    } finally {
                        api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_1, thread);
                        $cache_inference_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, status);
            }
        }
    }

    public static SubLObject rkf_prove(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject status = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject ask_result = prove.prove_justified(formula, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = ask_result;
            status = ask_status;
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return values(result, status);
    }

    /**
     * Given a SENTENCE, an MT and a PLIST of PROPERTIES, run the query;
     * return RESULTS, HALT-REASON and INFERENCE.
     */
    @LispMethod(comment = "Given a SENTENCE, an MT and a PLIST of PROPERTIES, run the query;\r\nreturn RESULTS, HALT-REASON and INFERENCE.\nGiven a SENTENCE, an MT and a PLIST of PROPERTIES, run the query;\nreturn RESULTS, HALT-REASON and INFERENCE.")
    public static final SubLObject rkf_new_query_alt(SubLObject sentence, SubLObject rkf_mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject status = NIL;
                SubLObject inference = NIL;
                v_properties = list_utilities.merge_plist(v_properties, $rkf_default_new_query_properties$.getGlobalValue());
                thread.resetMultipleValues();
                {
                    SubLObject results = inference_kernel.new_cyc_query(sentence, rkf_mt, v_properties);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    SubLObject maybe_inference = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = results;
                    status = halt_reason;
                    inference = maybe_inference;
                }
                return values(result, status, inference);
            }
        }
    }

    /**
     * Given a SENTENCE, an MT and a PLIST of PROPERTIES, run the query;
     * return RESULTS, HALT-REASON and INFERENCE.
     */
    @LispMethod(comment = "Given a SENTENCE, an MT and a PLIST of PROPERTIES, run the query;\r\nreturn RESULTS, HALT-REASON and INFERENCE.\nGiven a SENTENCE, an MT and a PLIST of PROPERTIES, run the query;\nreturn RESULTS, HALT-REASON and INFERENCE.")
    public static SubLObject rkf_new_query(final SubLObject sentence, final SubLObject rkf_mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject status = NIL;
        SubLObject inference = NIL;
        v_properties = list_utilities.merge_plist(v_properties, $rkf_default_new_query_properties$.getGlobalValue());
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, rkf_mt, v_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject maybe_inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = results;
        status = halt_reason;
        inference = maybe_inference;
        return values(result, status, inference);
    }

    /**
     * Ask the Query-SPEC, optionally substituting into the query or overriding the Mt.
     */
    @LispMethod(comment = "Ask the Query-SPEC, optionally substituting into the query or overriding the Mt.")
    public static final SubLObject rkf_ask_new_cycl_query_specification_alt(SubLObject query_spec, SubLObject mt, SubLObject substitutions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        {
            SubLObject additional_properties = $rkf_default_new_query_properties$.getGlobalValue();
            return new_cycl_query_specification.new_cycl_query_specification_ask(query_spec, mt, substitutions, additional_properties);
        }
    }

    @LispMethod(comment = "Ask the Query-SPEC, optionally substituting into the query or overriding the Mt.")
    public static SubLObject rkf_ask_new_cycl_query_specification(final SubLObject query_spec, SubLObject mt, SubLObject substitutions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        final SubLObject additional_properties = $rkf_default_new_query_properties$.getGlobalValue();
        return new_cycl_query_specification.new_cycl_query_specification_ask(query_spec, mt, substitutions, additional_properties);
    }/**
     * Ask the Query-SPEC, optionally substituting into the query or overriding the Mt.
     */


    public static final SubLObject rkf_expand_justifications_alt(SubLObject results) {
        {
            SubLObject expanded_results = NIL;
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject datum = result;
                    SubLObject current = datum;
                    SubLObject binding = NIL;
                    SubLObject justification = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    binding = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    justification = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject new_justifications = hl_supports.hl_justification_expand(justification);
                            expanded_results = cons(list(binding, new_justifications), expanded_results);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt14);
                    }
                }
            }
            return nreverse(expanded_results);
        }
    }

    public static SubLObject rkf_expand_justifications(final SubLObject results) {
        SubLObject expanded_results = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject binding = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            binding = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject new_justifications = hl_supports.hl_justification_expand(justification);
                expanded_results = cons(list(binding, new_justifications), expanded_results);
            } else {
                cdestructuring_bind_error(datum, $list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(expanded_results);
    }

    public static final SubLObject rkf_extract_bindings_from_results_alt(SubLObject results) {
        {
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject datum = result;
                    SubLObject current = datum;
                    SubLObject binding = NIL;
                    SubLObject justification = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    binding = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    justification = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        v_bindings = cons(binding, v_bindings);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt14);
                    }
                }
            }
            return nreverse(v_bindings);
        }
    }

    public static SubLObject rkf_extract_bindings_from_results(final SubLObject results) {
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject binding = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            binding = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                v_bindings = cons(binding, v_bindings);
            } else {
                cdestructuring_bind_error(datum, $list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(v_bindings);
    }

    public static final SubLObject rkf_truth_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        return com.cyc.cycjava.cycl.rkf_query_utilities.rkf_truth_internal(formula, mt, backchain, number, time, depth);
    }

    public static SubLObject rkf_truth(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        return rkf_truth_internal(formula, mt, backchain, number, time, depth);
    }

    public static final SubLObject rkf_truth_inference_properties_alt(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        return list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, $kw9$CACHE_INFERENCE_RESULTS_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS, $RESULT_UNIQUENESS, $PROOF, $MAX_NUMBER, number, $MAX_TIME, time, $MAX_TRANSFORMATION_DEPTH, backchain, $MAX_PROOF_DEPTH, depth });
    }

    public static SubLObject rkf_truth_inference_properties(final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        return list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, $kw9$CACHE_INFERENCE_RESULTS_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS, $RESULT_UNIQUENESS, $PROOF, $MAX_NUMBER, number, $MAX_TIME, time, $MAX_TRANSFORMATION_DEPTH, backchain, $MAX_PROOF_DEPTH, depth });
    }

    /**
     *
     *
     * @return LISTP; a list of sorted lists of supports
     */
    @LispMethod(comment = "@return LISTP; a list of sorted lists of supports")
    public static final SubLObject rkf_truth_internal_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sorted_true_arguments = NIL;
                SubLObject sorted_false_arguments = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        $within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        {
                            SubLObject v_properties = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_truth_inference_properties(backchain, number, time, depth);
                            {
                                SubLObject cdolist_list_var = inference_kernel.new_cyc_query(formula, mt, v_properties);
                                SubLObject true_result = NIL;
                                for (true_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , true_result = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = true_result;
                                        SubLObject current = datum;
                                        SubLObject v_bindings = NIL;
                                        SubLObject supports = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt20);
                                        v_bindings = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt20);
                                        supports = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                                                {
                                                    SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                                                    if (NIL == member(item_var, sorted_true_arguments, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        sorted_true_arguments = cons(item_var, sorted_true_arguments);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt20);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = inference_kernel.new_cyc_query(cycl_utilities.negate(formula), mt, v_properties);
                                SubLObject false_result = NIL;
                                for (false_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , false_result = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = false_result;
                                        SubLObject current = datum;
                                        SubLObject v_bindings = NIL;
                                        SubLObject supports = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt20);
                                        v_bindings = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt20);
                                        supports = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                                                {
                                                    SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                                                    if (NIL == member(item_var, sorted_false_arguments, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        sorted_false_arguments = cons(item_var, sorted_false_arguments);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt20);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(nreverse(sorted_true_arguments), nreverse(sorted_false_arguments));
            }
        }
    }

    /**
     *
     *
     * @return LISTP; a list of sorted lists of supports
     */
    @LispMethod(comment = "@return LISTP; a list of sorted lists of supports")
    public static SubLObject rkf_truth_internal(final SubLObject formula, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sorted_true_arguments = NIL;
        SubLObject sorted_false_arguments = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            final SubLObject v_properties = rkf_truth_inference_properties(backchain, number, time, depth);
            SubLObject cdolist_list_var = inference_kernel.new_cyc_query(formula, mt, v_properties);
            SubLObject true_result = NIL;
            true_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = true_result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                        if (NIL == member(item_var, sorted_true_arguments, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            sorted_true_arguments = cons(item_var, sorted_true_arguments);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                true_result = cdolist_list_var.first();
            } 
            cdolist_list_var = inference_kernel.new_cyc_query(cycl_utilities.negate(formula), mt, v_properties);
            SubLObject false_result = NIL;
            false_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = false_result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                        if (NIL == member(item_var, sorted_false_arguments, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            sorted_false_arguments = cons(item_var, sorted_false_arguments);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                false_result = cdolist_list_var.first();
            } 
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return list(nreverse(sorted_true_arguments), nreverse(sorted_false_arguments));
    }

    /**
     *
     *
     * @return LISTP of lists of supports supporting FORMULA.
     */
    @LispMethod(comment = "@return LISTP of lists of supports supporting FORMULA.")
    public static final SubLObject rkf_justify_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return list(hl_supports.hl_justify(formula));
        } else {
            if (NIL != el_formula_p(formula)) {
                {
                    SubLObject datum = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_truth(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject current = datum;
                    SubLObject pros = NIL;
                    SubLObject cons = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    pros = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    cons = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return NIL != cons ? ((SubLObject) (NIL)) : pros;
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of lists of supports supporting FORMULA.
     */
    @LispMethod(comment = "@return LISTP of lists of supports supporting FORMULA.")
    public static SubLObject rkf_justify(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return list(hl_supports.hl_justify(formula));
        }
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        SubLObject current;
        final SubLObject datum = current = rkf_truth(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pros = NIL;
        SubLObject cons = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        pros = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        cons = current.first();
        current = current.rest();
        if (NIL == current) {
            return NIL != cons ? NIL : pros;
        }
        cdestructuring_bind_error(datum, $list21);
        return NIL;
    }

    /**
     * Return T iff FORMULA is not already known to be either true or false in MT.
     */
    @LispMethod(comment = "Return T iff FORMULA is not already known to be either true or false in MT.")
    public static final SubLObject rkf_unknown_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != cycl_utilities.formula_find($$TheResultOfParsing, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return makeBoolean(!(((NIL != rkf_contradiction_finder.rkf_rejected(formula, mt, UNPROVIDED, UNPROVIDED)) || (NIL != rkf_redundancy_detector.rkf_redundant(formula, mt, UNPROVIDED, UNPROVIDED))) || (NIL != com.cyc.cycjava.cycl.rkf_query_utilities.rkf_known(formula, mt, UNPROVIDED))));
    }

    @LispMethod(comment = "Return T iff FORMULA is not already known to be either true or false in MT.")
    public static SubLObject rkf_unknown(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != cycl_utilities.formula_find($$TheResultOfParsing, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return makeBoolean(((NIL == rkf_contradiction_finder.rkf_rejected(formula, mt, UNPROVIDED, UNPROVIDED)) && (NIL == rkf_redundancy_detector.rkf_redundant(formula, mt, UNPROVIDED, UNPROVIDED))) && (NIL == rkf_known(formula, mt, UNPROVIDED)));
    }/**
     * Return T iff FORMULA is not already known to be either true or false in MT.
     */


    public static final SubLObject rkf_known_inference_properties_alt(SubLObject problem_store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $ANSWER_LANGUAGE, $HL, $kw9$CACHE_INFERENCE_RESULTS_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $kw25$NEGATION_BY_FAILURE_, $negation_by_failure$.getDynamicValue(thread), $MAX_NUMBER, ONE_INTEGER, $MAX_TIME, $rkf_known_time_cutoff$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER });
        }
    }

    public static SubLObject rkf_known_inference_properties(final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $ANSWER_LANGUAGE, $HL, $kw9$CACHE_INFERENCE_RESULTS_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $kw25$NEGATION_BY_FAILURE_, $negation_by_failure$.getDynamicValue(thread), $MAX_NUMBER, ONE_INTEGER, $MAX_TIME, $rkf_known_time_cutoff$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER });
    }

    public static final SubLObject rkf_known_alt(SubLObject formula, SubLObject mt, SubLObject problem_store) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycl_utilities.formula_find($$TheResultOfParsing, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject known = NIL;
                SubLObject timed_outP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject results = inference_kernel.new_cyc_query(formula, mt, com.cyc.cycjava.cycl.rkf_query_utilities.rkf_known_inference_properties(problem_store));
                    SubLObject exit_condition = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    known = list_utilities.sublisp_boolean(results);
                    timed_outP = eq($MAX_TIME, exit_condition);
                }
                return values(known, timed_outP);
            }
        }
    }

    public static SubLObject rkf_known(final SubLObject formula, SubLObject mt, SubLObject problem_store) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.formula_find($$TheResultOfParsing, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject known = NIL;
        SubLObject timed_outP = NIL;
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(formula, mt, rkf_known_inference_properties(problem_store));
        final SubLObject exit_condition = thread.secondMultipleValue();
        thread.resetMultipleValues();
        known = list_utilities.sublisp_boolean(results);
        timed_outP = eq($MAX_TIME, exit_condition);
        return values(known, timed_outP);
    }

    /**
     * Load the Test Question with the id TQ-ID via mt RKF-MT and return
     * the NEW-CYCL-QUERY-SPECIFICATION-P.
     */
    @LispMethod(comment = "Load the Test Question with the id TQ-ID via mt RKF-MT and return\r\nthe NEW-CYCL-QUERY-SPECIFICATION-P.\nLoad the Test Question with the id TQ-ID via mt RKF-MT and return\nthe NEW-CYCL-QUERY-SPECIFICATION-P.")
    public static final SubLObject rkf_load_test_question_alt(SubLObject tq_id, SubLObject rkf_mt) {
        {
            SubLObject tq_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(tq_id, rkf_mt);
            return tq_spec;
        }
    }

    @LispMethod(comment = "Load the Test Question with the id TQ-ID via mt RKF-MT and return\r\nthe NEW-CYCL-QUERY-SPECIFICATION-P.\nLoad the Test Question with the id TQ-ID via mt RKF-MT and return\nthe NEW-CYCL-QUERY-SPECIFICATION-P.")
    public static SubLObject rkf_load_test_question(final SubLObject tq_id, final SubLObject rkf_mt) {
        final SubLObject tq_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(tq_id, rkf_mt);
        return tq_spec;
    }/**
     * Load the Test Question with the id TQ-ID via mt RKF-MT and return
     * the NEW-CYCL-QUERY-SPECIFICATION-P.
     */


    /**
     * Generate a test question that has the characteristics of TQ-ID, but
     * ask FORMULA instead.
     */
    @LispMethod(comment = "Generate a test question that has the characteristics of TQ-ID, but\r\nask FORMULA instead.\nGenerate a test question that has the characteristics of TQ-ID, but\nask FORMULA instead.")
    public static final SubLObject rkf_make_similar_test_question_alt(SubLObject formula, SubLObject tq_id, SubLObject rkf_mt) {
        {
            SubLObject tq_spec = com.cyc.cycjava.cycl.rkf_query_utilities.rkf_load_test_question(tq_id, rkf_mt);
            new_cycl_query_specification.reset_new_cycl_query_specification_formula(tq_spec, formula);
            new_cycl_query_specification.reset_new_cycl_query_specification_mt(tq_spec, rkf_mt);
            return tq_spec;
        }
    }

    @LispMethod(comment = "Generate a test question that has the characteristics of TQ-ID, but\r\nask FORMULA instead.\nGenerate a test question that has the characteristics of TQ-ID, but\nask FORMULA instead.")
    public static SubLObject rkf_make_similar_test_question(final SubLObject formula, final SubLObject tq_id, final SubLObject rkf_mt) {
        final SubLObject tq_spec = rkf_load_test_question(tq_id, rkf_mt);
        new_cycl_query_specification.reset_new_cycl_query_specification_formula(tq_spec, formula);
        new_cycl_query_specification.reset_new_cycl_query_specification_mt(tq_spec, rkf_mt);
        return tq_spec;
    }/**
     * Generate a test question that has the characteristics of TQ-ID, but
     * ask FORMULA instead.
     */


    public static SubLObject declare_rkf_query_utilities_file() {
        declareFunction("rkf_determine_query_type", "RKF-DETERMINE-QUERY-TYPE", 1, 1, false);
        declareFunction("rkf_choose_query_method", "RKF-CHOOSE-QUERY-METHOD", 1, 1, false);
        declareFunction("rkf_generic_query", "RKF-GENERIC-QUERY", 1, 5, false);
        declareFunction("rkf_query", "RKF-QUERY", 1, 5, false);
        declareFunction("rkf_ask", "RKF-ASK", 1, 5, false);
        declareFunction("rkf_prove", "RKF-PROVE", 1, 5, false);
        declareFunction("rkf_new_query", "RKF-NEW-QUERY", 2, 1, false);
        declareFunction("rkf_ask_new_cycl_query_specification", "RKF-ASK-NEW-CYCL-QUERY-SPECIFICATION", 1, 2, false);
        declareFunction("rkf_expand_justifications", "RKF-EXPAND-JUSTIFICATIONS", 1, 0, false);
        declareFunction("rkf_extract_bindings_from_results", "RKF-EXTRACT-BINDINGS-FROM-RESULTS", 1, 0, false);
        declareFunction("rkf_truth", "RKF-TRUTH", 1, 5, false);
        declareFunction("rkf_truth_inference_properties", "RKF-TRUTH-INFERENCE-PROPERTIES", 4, 0, false);
        declareFunction("rkf_truth_internal", "RKF-TRUTH-INTERNAL", 6, 0, false);
        declareFunction("rkf_justify", "RKF-JUSTIFY", 1, 1, false);
        declareFunction("rkf_unknown", "RKF-UNKNOWN", 1, 1, false);
        declareFunction("rkf_known_inference_properties", "RKF-KNOWN-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction("rkf_known", "RKF-KNOWN", 1, 2, false);
        declareFunction("rkf_load_test_question", "RKF-LOAD-TEST-QUESTION", 2, 0, false);
        declareFunction("rkf_make_similar_test_question", "RKF-MAKE-SIMILAR-TEST-QUESTION", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_query_utilities_file() {
        deflexical("*RKF-DEFAULT-NEW-QUERY-PROPERTIES*", list($kw9$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $RETURN, $BINDINGS_AND_SUPPORTS));
        defparameter("*RKF-KNOWN-TIME-CUTOFF*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_query_utilities_file() {
        register_external_symbol(RKF_KNOWN);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_query_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_query_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_query_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt3$RKF_CHOOSE_QUERY_METHOD__This_is_ = makeString("RKF-CHOOSE-QUERY-METHOD: This is a legacy function and will go away; use RKF-DETERMINE-QUERY-TYPE instead.");

    static private final SubLString $str_alt6$Unsupported_query_type__A_ = makeString("Unsupported query type ~A.");

    static private final SubLString $str_alt8$__RKF_ASK_timed_out_after__S_seco = makeString("~&RKF-ASK timed out after ~S seconds on ~S in ~S.~%");

    static private final SubLList $list_alt14 = list(makeSymbol("BINDING"), makeSymbol("JUSTIFICATION"));

    static private final SubLList $list_alt20 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt21 = list(makeSymbol("PROS"), makeSymbol("CONS"));
}

/**
 * Total time: 162 ms
 */
