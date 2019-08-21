package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.external_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.external_inference.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class external_inference extends SubLTranslatedFile {
    public static final SubLFile me = new external_inference();

    public static final String myName = "com.cyc.cycjava.cycl.external_inference";

    public static final String myFingerPrint = "a86cd7495449d29255bb938d5ca34d60efd10ca488eaa03ff3decc62da6bc7aa";



    public static final SubLSymbol EXTERNAL_REMOVAL_SERVER_REQUIRED = makeSymbol("EXTERNAL-REMOVAL-SERVER-REQUIRED");



    public static final SubLSymbol EXTERNAL_REMOVAL_SERVER_COST = makeSymbol("EXTERNAL-REMOVAL-SERVER-COST");

    public static final SubLSymbol EXTERNAL_REMOVAL_SERVER_EXPAND = makeSymbol("EXTERNAL-REMOVAL-SERVER-EXPAND");

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
    }

    public static SubLObject external_removal_client_required(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_REQUIRED, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }

    public static SubLObject external_removal_client_cost(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_COST, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }

    public static SubLObject external_removal_client_expand(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval(list(EXTERNAL_REMOVAL_SERVER_EXPAND, list(QUOTE, literal), list(QUOTE, sense), list(QUOTE, mt)), channel);
    }

    public static SubLObject declare_external_inference_file() {
        declareFunction(me, "external_removal_server_required", "EXTERNAL-REMOVAL-SERVER-REQUIRED", 3, 0, false);
        declareFunction(me, "external_removal_server_cost", "EXTERNAL-REMOVAL-SERVER-COST", 3, 0, false);
        declareFunction(me, "external_removal_server_expand", "EXTERNAL-REMOVAL-SERVER-EXPAND", 3, 0, false);
        declareFunction(me, "external_removal_client_required", "EXTERNAL-REMOVAL-CLIENT-REQUIRED", 4, 0, false);
        declareFunction(me, "external_removal_client_cost", "EXTERNAL-REMOVAL-CLIENT-COST", 4, 0, false);
        declareFunction(me, "external_removal_client_expand", "EXTERNAL-REMOVAL-CLIENT-EXPAND", 4, 0, false);
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

    static {






    }
}

/**
 * Total time: 97 ms
 */
