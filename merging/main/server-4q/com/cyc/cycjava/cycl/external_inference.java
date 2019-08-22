/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$external_inference_enabled$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class external_inference extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new external_inference();

 public static final String myName = "com.cyc.cycjava.cycl.external_inference";


    private static final SubLSymbol EXTERNAL_REMOVAL_SERVER_REQUIRED = makeSymbol("EXTERNAL-REMOVAL-SERVER-REQUIRED");

    private static final SubLSymbol EXTERNAL_REMOVAL_SERVER_COST = makeSymbol("EXTERNAL-REMOVAL-SERVER-COST");

    private static final SubLSymbol EXTERNAL_REMOVAL_SERVER_EXPAND = makeSymbol("EXTERNAL-REMOVAL-SERVER-EXPAND");

    // Definitions
    /**
     * Return T iff some local HL removal modules apply to LITERAL with SENSE in MT,
     * assuming external inference is not enabled.
     */
    @LispMethod(comment = "Return T iff some local HL removal modules apply to LITERAL with SENSE in MT,\r\nassuming external inference is not enabled.\nReturn T iff some local HL removal modules apply to LITERAL with SENSE in MT,\nassuming external inference is not enabled.")
    public static final SubLObject external_removal_server_required_alt(SubLObject literal, SubLObject sense, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $external_inference_enabled$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        $external_inference_enabled$.bind(NIL, thread);
                        v_answer = inference_utilities.some_literal_removal_options(literal, sense, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $external_inference_enabled$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    // Definitions
    @LispMethod(comment = "Return T iff some local HL removal modules apply to LITERAL with SENSE in MT,\r\nassuming external inference is not enabled.\nReturn T iff some local HL removal modules apply to LITERAL with SENSE in MT,\nassuming external inference is not enabled.")
    public static SubLObject external_removal_server_required(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $external_inference_enabled$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            $external_inference_enabled$.bind(NIL, thread);
            v_answer = inference_utilities.some_literal_removal_options(literal, sense, UNPROVIDED, UNPROVIDED);
        } finally {
            $external_inference_enabled$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    /**
     * Return the total cost of the options for local HL removal modules that
     * apply to LITERAL with SENSE in MT, assuming external inference is not enabled.
     */
    @LispMethod(comment = "Return the total cost of the options for local HL removal modules that\r\napply to LITERAL with SENSE in MT, assuming external inference is not enabled.\nReturn the total cost of the options for local HL removal modules that\napply to LITERAL with SENSE in MT, assuming external inference is not enabled.")
    public static final SubLObject external_removal_server_cost_alt(SubLObject literal, SubLObject sense, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $external_inference_enabled$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        $external_inference_enabled$.bind(NIL, thread);
                        v_answer = inference_utilities.literal_removal_cost(literal, sense, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $external_inference_enabled$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Return the total cost of the options for local HL removal modules that
     * apply to LITERAL with SENSE in MT, assuming external inference is not enabled.
     */
    @LispMethod(comment = "Return the total cost of the options for local HL removal modules that\r\napply to LITERAL with SENSE in MT, assuming external inference is not enabled.\nReturn the total cost of the options for local HL removal modules that\napply to LITERAL with SENSE in MT, assuming external inference is not enabled.")
    public static SubLObject external_removal_server_cost(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $external_inference_enabled$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            $external_inference_enabled$.bind(NIL, thread);
            v_answer = inference_utilities.literal_removal_cost(literal, sense, UNPROVIDED, UNPROVIDED);
        } finally {
            $external_inference_enabled$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    /**
     * Return a list of pairs of BINDINGS SUPPORTS which are the results
     * of using local HL removal modules for LITERAL with SENSE in MT.
     */
    @LispMethod(comment = "Return a list of pairs of BINDINGS SUPPORTS which are the results\r\nof using local HL removal modules for LITERAL with SENSE in MT.\nReturn a list of pairs of BINDINGS SUPPORTS which are the results\nof using local HL removal modules for LITERAL with SENSE in MT.")
    public static final SubLObject external_removal_server_expand_alt(SubLObject literal, SubLObject sense, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $external_inference_enabled$.currentBinding(thread);
                    try {
                        $external_inference_enabled$.bind(NIL, thread);
                        v_answer = backward.removal_ask(literal, mt, enumeration_types.sense_truth(sense), UNPROVIDED);
                    } finally {
                        $external_inference_enabled$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    @LispMethod(comment = "Return a list of pairs of BINDINGS SUPPORTS which are the results\r\nof using local HL removal modules for LITERAL with SENSE in MT.\nReturn a list of pairs of BINDINGS SUPPORTS which are the results\nof using local HL removal modules for LITERAL with SENSE in MT.")
    public static SubLObject external_removal_server_expand(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $external_inference_enabled$.currentBinding(thread);
        try {
            $external_inference_enabled$.bind(NIL, thread);
            v_answer = backward.removal_ask(literal, mt, enumeration_types.sense_truth(sense), UNPROVIDED);
        } finally {
            $external_inference_enabled$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }/**
     * Return a list of pairs of BINDINGS SUPPORTS which are the results
     * of using local HL removal modules for LITERAL with SENSE in MT.
     */


    /**
     * Return T iff some HL removal modules apply to LITERAL with SENSE in MT,
     * on the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.
     */
    @LispMethod(comment = "Return T iff some HL removal modules apply to LITERAL with SENSE in MT,\r\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.\nReturn T iff some HL removal modules apply to LITERAL with SENSE in MT,\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.")
    public static final SubLObject external_removal_client_required_alt(SubLObject channel, SubLObject literal, SubLObject sense, SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_REQUIRED, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }

    @LispMethod(comment = "Return T iff some HL removal modules apply to LITERAL with SENSE in MT,\r\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.\nReturn T iff some HL removal modules apply to LITERAL with SENSE in MT,\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.")
    public static SubLObject external_removal_client_required(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_REQUIRED, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }/**
     * Return T iff some HL removal modules apply to LITERAL with SENSE in MT,
     * on the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.
     */


    /**
     * Return the total cost of the options for HL removal modules that
     * apply to LITERAL with SENSE in MT, on the external Cyc image accessed via
     * the TCP CHANNEL to a CFASL API server.
     */
    @LispMethod(comment = "Return the total cost of the options for HL removal modules that\r\napply to LITERAL with SENSE in MT, on the external Cyc image accessed via\r\nthe TCP CHANNEL to a CFASL API server.\nReturn the total cost of the options for HL removal modules that\napply to LITERAL with SENSE in MT, on the external Cyc image accessed via\nthe TCP CHANNEL to a CFASL API server.")
    public static final SubLObject external_removal_client_cost_alt(SubLObject channel, SubLObject literal, SubLObject sense, SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_COST, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }

    @LispMethod(comment = "Return the total cost of the options for HL removal modules that\r\napply to LITERAL with SENSE in MT, on the external Cyc image accessed via\r\nthe TCP CHANNEL to a CFASL API server.\nReturn the total cost of the options for HL removal modules that\napply to LITERAL with SENSE in MT, on the external Cyc image accessed via\nthe TCP CHANNEL to a CFASL API server.")
    public static SubLObject external_removal_client_cost(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_COST, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }/**
     * Return the total cost of the options for HL removal modules that
     * apply to LITERAL with SENSE in MT, on the external Cyc image accessed via
     * the TCP CHANNEL to a CFASL API server.
     */


    /**
     * Return a list of pairs of BINDINGS SUPPORTS which are the results
     * of using HL removal modules for LITERAL with SENSE in MT
     * on the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.
     */
    @LispMethod(comment = "Return a list of pairs of BINDINGS SUPPORTS which are the results\r\nof using HL removal modules for LITERAL with SENSE in MT\r\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.\nReturn a list of pairs of BINDINGS SUPPORTS which are the results\nof using HL removal modules for LITERAL with SENSE in MT\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.")
    public static final SubLObject external_removal_client_expand_alt(SubLObject channel, SubLObject literal, SubLObject sense, SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_EXPAND, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }

    @LispMethod(comment = "Return a list of pairs of BINDINGS SUPPORTS which are the results\r\nof using HL removal modules for LITERAL with SENSE in MT\r\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.\nReturn a list of pairs of BINDINGS SUPPORTS which are the results\nof using HL removal modules for LITERAL with SENSE in MT\non the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.")
    public static SubLObject external_removal_client_expand(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_EXPAND, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }/**
     * Return a list of pairs of BINDINGS SUPPORTS which are the results
     * of using HL removal modules for LITERAL with SENSE in MT
     * on the external Cyc image accessed via the TCP CHANNEL to a CFASL API server.
     */


    public static SubLObject declare_external_inference_file() {
        declareFunction("external_removal_server_required", "EXTERNAL-REMOVAL-SERVER-REQUIRED", 3, 0, false);
        declareFunction("external_removal_server_cost", "EXTERNAL-REMOVAL-SERVER-COST", 3, 0, false);
        declareFunction("external_removal_server_expand", "EXTERNAL-REMOVAL-SERVER-EXPAND", 3, 0, false);
        declareFunction("external_removal_client_required", "EXTERNAL-REMOVAL-CLIENT-REQUIRED", 4, 0, false);
        declareFunction("external_removal_client_cost", "EXTERNAL-REMOVAL-CLIENT-COST", 4, 0, false);
        declareFunction("external_removal_client_expand", "EXTERNAL-REMOVAL-CLIENT-EXPAND", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_external_inference_file() {
        return NIL;
    }

    public static SubLObject setup_external_inference_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_external_inference_file();
    }

    @Override
    public void initializeVariables() {
        init_external_inference_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_external_inference_file();
    }

    
}

/**
 * Total time: 97 ms
 */
