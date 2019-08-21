package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.backward_results;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.backward_results.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class backward_results extends SubLTranslatedFile {
    public static final SubLFile me = new backward_results();

    public static final String myName = "com.cyc.cycjava.cycl.backward_results";

    public static final String myFingerPrint = "7de194988eca5038911999c80d9b181503da81fcb46454efbfc11a8c58df3c9b";

    // defparameter
    /**
     * The level of semantic validation performed for intermediate steps of
     * successful inferences. Can be one of :all :arg-type :minimal :none
     */
    public static final SubLSymbol $inference_intermediate_step_validation_level$ = makeSymbol("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*");

    // defparameter
    public static final SubLSymbol $inference_answer_template$ = makeSymbol("*INFERENCE-ANSWER-TEMPLATE*");



    public static final SubLList $list1 = list(makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS"));



    public static final SubLString $str3$Inference_rejected____S = makeString("Inference rejected : ~S");



    public static SubLObject reject_inference(final SubLObject reason) {
        note_inference_rejected(reason);
        return sublisp_throw($INFERENCE_REJECTED, T);
    }

    public static SubLObject note_inference_rejected(final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $inference_debugP$.getDynamicValue(thread)) {
            SubLObject type = NIL;
            destructuring_bind_must_consp(reason, reason, $list1);
            type = reason.first();
            SubLObject current = reason.rest();
            final SubLObject format_string = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, reason, $list1);
            final SubLObject format_args;
            current = format_args = current.rest();
            if (NIL != format_string) {
                apply(symbol_function(WARN), format_string, format_args);
            } else {
                Errors.warn($str3$Inference_rejected____S, type);
            }
        }
        return NIL;
    }

    public static SubLObject declare_backward_results_file() {
        declareFunction(me, "reject_inference", "REJECT-INFERENCE", 1, 0, false);
        declareFunction(me, "note_inference_rejected", "NOTE-INFERENCE-REJECTED", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_backward_results_file() {
        defparameter("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $NONE);
        defparameter("*INFERENCE-ANSWER-TEMPLATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_backward_results_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_backward_results_file();
    }

    @Override
    public void initializeVariables() {
        init_backward_results_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_backward_results_file();
    }

    static {








    }
}

/**
 * Total time: 74 ms
 */
