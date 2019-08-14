/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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


public final class backward_results extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new backward_results();

 public static final String myName = "com.cyc.cycjava.cycl.backward_results";


    // defparameter
    /**
     * The level of semantic validation performed for intermediate steps of
     * successful inferences. Can be one of :all :arg-type :minimal :none
     */
    @LispMethod(comment = "The level of semantic validation performed for intermediate steps of\r\nsuccessful inferences. Can be one of :all :arg-type :minimal :none\ndefparameter\nThe level of semantic validation performed for intermediate steps of\nsuccessful inferences. Can be one of :all :arg-type :minimal :none")
    public static final SubLSymbol $inference_intermediate_step_validation_level$ = makeSymbol("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $inference_answer_template$ = makeSymbol("*INFERENCE-ANSWER-TEMPLATE*");

    static private final SubLList $list1 = list(makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS"));

    static private final SubLString $str3$Inference_rejected____S = makeString("Inference rejected : ~S");

    // Definitions
    /**
     * Reject inference for REASON.
     * REASON has the form:  (type &optional format-string &rest format-args)
     */
    @LispMethod(comment = "Reject inference for REASON.\r\nREASON has the form:  (type &optional format-string &rest format-args)\nReject inference for REASON.\nREASON has the form:  (type &optional format-string &rest format-args)")
    public static final SubLObject reject_inference_alt(SubLObject reason) {
        com.cyc.cycjava.cycl.backward_results.note_inference_rejected(reason);
        return sublisp_throw($INFERENCE_REJECTED, T);
    }

    // Definitions
    /**
     * Reject inference for REASON.
     * REASON has the form:  (type &optional format-string &rest format-args)
     */
    @LispMethod(comment = "Reject inference for REASON.\r\nREASON has the form:  (type &optional format-string &rest format-args)\nReject inference for REASON.\nREASON has the form:  (type &optional format-string &rest format-args)")
    public static SubLObject reject_inference(final SubLObject reason) {
        note_inference_rejected(reason);
        return sublisp_throw($INFERENCE_REJECTED, T);
    }

    /**
     * Note that inference was rejected for REASON.
     * REASON has the form:  (type &optional format-string &rest format-args)
     */
    @LispMethod(comment = "Note that inference was rejected for REASON.\r\nREASON has the form:  (type &optional format-string &rest format-args)\nNote that inference was rejected for REASON.\nREASON has the form:  (type &optional format-string &rest format-args)")
    public static final SubLObject note_inference_rejected_alt(SubLObject reason) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                {
                    SubLObject datum = reason;
                    SubLObject current = datum;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    type = current.first();
                    current = current.rest();
                    {
                        SubLObject format_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt1);
                        current = current.rest();
                        {
                            SubLObject format_args = current;
                            if (NIL != format_string) {
                                apply(symbol_function(WARN), format_string, format_args);
                            } else {
                                Errors.warn($str_alt3$Inference_rejected____S, type);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Note that inference was rejected for REASON.
     * REASON has the form:  (type &optional format-string &rest format-args)
     */
    @LispMethod(comment = "Note that inference was rejected for REASON.\r\nREASON has the form:  (type &optional format-string &rest format-args)\nNote that inference was rejected for REASON.\nREASON has the form:  (type &optional format-string &rest format-args)")
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
        declareFunction("reject_inference", "REJECT-INFERENCE", 1, 0, false);
        declareFunction("note_inference_rejected", "NOTE-INFERENCE-REJECTED", 1, 0, false);
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

    static private final SubLList $list_alt1 = list(makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS"));

    static private final SubLString $str_alt3$Inference_rejected____S = makeString("Inference rejected : ~S");
}

/**
 * Total time: 74 ms
 */
