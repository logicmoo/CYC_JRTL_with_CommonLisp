package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class external_inference extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.external_inference";
    public static final String myFingerPrint = "a86cd7495449d29255bb938d5ca34d60efd10ca488eaa03ff3decc62da6bc7aa";
    private static final SubLSymbol $sym0$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym1$EXTERNAL_REMOVAL_SERVER_REQUIRED;
    private static final SubLSymbol $sym2$QUOTE;
    private static final SubLSymbol $sym3$EXTERNAL_REMOVAL_SERVER_COST;
    private static final SubLSymbol $sym4$EXTERNAL_REMOVAL_SERVER_EXPAND;
    
    @SubLTranslatedFile.SubL(source = "cycl/external-inference.lisp", position = 1205L)
    public static SubLObject external_removal_server_required(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)external_inference.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$external_inference_enabled$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)external_inference.$sym0$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            control_vars.$external_inference_enabled$.bind((SubLObject)external_inference.NIL, thread);
            v_answer = inference_utilities.some_literal_removal_options(literal, sense, (SubLObject)external_inference.UNPROVIDED, (SubLObject)external_inference.UNPROVIDED);
        }
        finally {
            control_vars.$external_inference_enabled$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/external-inference.lisp", position = 1609L)
    public static SubLObject external_removal_server_cost(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)external_inference.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$external_inference_enabled$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)external_inference.$sym0$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            control_vars.$external_inference_enabled$.bind((SubLObject)external_inference.NIL, thread);
            v_answer = inference_utilities.literal_removal_cost(literal, sense, (SubLObject)external_inference.UNPROVIDED, (SubLObject)external_inference.UNPROVIDED);
        }
        finally {
            control_vars.$external_inference_enabled$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/external-inference.lisp", position = 1983L)
    public static SubLObject external_removal_server_expand(final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)external_inference.NIL;
        final SubLObject _prev_bind_0 = control_vars.$external_inference_enabled$.currentBinding(thread);
        try {
            control_vars.$external_inference_enabled$.bind((SubLObject)external_inference.NIL, thread);
            v_answer = backward.removal_ask(literal, mt, enumeration_types.sense_truth(sense), (SubLObject)external_inference.UNPROVIDED);
        }
        finally {
            control_vars.$external_inference_enabled$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/external-inference.lisp", position = 2333L)
    public static SubLObject external_removal_client_required(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval((SubLObject)ConsesLow.list((SubLObject)external_inference.$sym1$EXTERNAL_REMOVAL_SERVER_REQUIRED, (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, literal), (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, sense), (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, mt)), channel);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/external-inference.lisp", position = 2713L)
    public static SubLObject external_removal_client_cost(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval((SubLObject)ConsesLow.list((SubLObject)external_inference.$sym3$EXTERNAL_REMOVAL_SERVER_COST, (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, literal), (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, sense), (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, mt)), channel);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/external-inference.lisp", position = 3066L)
    public static SubLObject external_removal_client_expand(final SubLObject channel, final SubLObject literal, final SubLObject sense, final SubLObject mt) {
        return cfasl_kernel.cfasl_channel_eval((SubLObject)ConsesLow.list((SubLObject)external_inference.$sym4$EXTERNAL_REMOVAL_SERVER_EXPAND, (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, literal), (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, sense), (SubLObject)ConsesLow.list((SubLObject)external_inference.$sym2$QUOTE, mt)), channel);
    }
    
    public static SubLObject declare_external_inference_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.external_inference", "external_removal_server_required", "EXTERNAL-REMOVAL-SERVER-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.external_inference", "external_removal_server_cost", "EXTERNAL-REMOVAL-SERVER-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.external_inference", "external_removal_server_expand", "EXTERNAL-REMOVAL-SERVER-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.external_inference", "external_removal_client_required", "EXTERNAL-REMOVAL-CLIENT-REQUIRED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.external_inference", "external_removal_client_cost", "EXTERNAL-REMOVAL-CLIENT-COST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.external_inference", "external_removal_client_expand", "EXTERNAL-REMOVAL-CLIENT-EXPAND", 4, 0, false);
        return (SubLObject)external_inference.NIL;
    }
    
    public static SubLObject init_external_inference_file() {
        return (SubLObject)external_inference.NIL;
    }
    
    public static SubLObject setup_external_inference_file() {
        return (SubLObject)external_inference.NIL;
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
        me = (SubLFile)new external_inference();
        $sym0$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym1$EXTERNAL_REMOVAL_SERVER_REQUIRED = SubLObjectFactory.makeSymbol("EXTERNAL-REMOVAL-SERVER-REQUIRED");
        $sym2$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym3$EXTERNAL_REMOVAL_SERVER_COST = SubLObjectFactory.makeSymbol("EXTERNAL-REMOVAL-SERVER-COST");
        $sym4$EXTERNAL_REMOVAL_SERVER_EXPAND = SubLObjectFactory.makeSymbol("EXTERNAL-REMOVAL-SERVER-EXPAND");
    }
}

/*

	Total time: 97 ms
	
*/