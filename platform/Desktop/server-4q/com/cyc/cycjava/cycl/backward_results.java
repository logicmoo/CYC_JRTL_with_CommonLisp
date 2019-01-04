package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class backward_results extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.backward_results";
    public static final String myFingerPrint = "7de194988eca5038911999c80d9b181503da81fcb46454efbfc11a8c58df3c9b";
    @SubLTranslatedFile.SubL(source = "cycl/backward-results.lisp", position = 1554L)
    public static SubLSymbol $inference_intermediate_step_validation_level$;
    @SubLTranslatedFile.SubL(source = "cycl/backward-results.lisp", position = 1780L)
    public static SubLSymbol $inference_answer_template$;
    private static final SubLSymbol $kw0$INFERENCE_REJECTED;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$WARN;
    private static final SubLString $str3$Inference_rejected____S;
    private static final SubLSymbol $kw4$NONE;
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-results.lisp", position = 753L)
    public static SubLObject reject_inference(final SubLObject reason) {
        note_inference_rejected(reason);
        return Dynamic.sublisp_throw((SubLObject)backward_results.$kw0$INFERENCE_REJECTED, (SubLObject)backward_results.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/backward-results.lisp", position = 977L)
    public static SubLObject note_inference_rejected(final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (backward_results.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
            SubLObject type = (SubLObject)backward_results.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(reason, reason, (SubLObject)backward_results.$list1);
            type = reason.first();
            SubLObject current = reason.rest();
            final SubLObject format_string = (SubLObject)(current.isCons() ? current.first() : backward_results.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, reason, (SubLObject)backward_results.$list1);
            final SubLObject format_args;
            current = (format_args = current.rest());
            if (backward_results.NIL != format_string) {
                Functions.apply(Symbols.symbol_function((SubLObject)backward_results.$sym2$WARN), format_string, format_args);
            }
            else {
                Errors.warn((SubLObject)backward_results.$str3$Inference_rejected____S, type);
            }
        }
        return (SubLObject)backward_results.NIL;
    }
    
    public static SubLObject declare_backward_results_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_results", "reject_inference", "REJECT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.backward_results", "note_inference_rejected", "NOTE-INFERENCE-REJECTED", 1, 0, false);
        return (SubLObject)backward_results.NIL;
    }
    
    public static SubLObject init_backward_results_file() {
        backward_results.$inference_intermediate_step_validation_level$ = SubLFiles.defparameter("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", (SubLObject)backward_results.$kw4$NONE);
        backward_results.$inference_answer_template$ = SubLFiles.defparameter("*INFERENCE-ANSWER-TEMPLATE*", (SubLObject)backward_results.NIL);
        return (SubLObject)backward_results.NIL;
    }
    
    public static SubLObject setup_backward_results_file() {
        return (SubLObject)backward_results.NIL;
    }
    
    public void declareFunctions() {
        declare_backward_results_file();
    }
    
    public void initializeVariables() {
        init_backward_results_file();
    }
    
    public void runTopLevelForms() {
        setup_backward_results_file();
    }
    
    static {
        me = (SubLFile)new backward_results();
        backward_results.$inference_intermediate_step_validation_level$ = null;
        backward_results.$inference_answer_template$ = null;
        $kw0$INFERENCE_REJECTED = SubLObjectFactory.makeKeyword("INFERENCE-REJECTED");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-ARGS"));
        $sym2$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str3$Inference_rejected____S = SubLObjectFactory.makeString("Inference rejected : ~S");
        $kw4$NONE = SubLObjectFactory.makeKeyword("NONE");
    }
}

/*

	Total time: 74 ms
	
*/