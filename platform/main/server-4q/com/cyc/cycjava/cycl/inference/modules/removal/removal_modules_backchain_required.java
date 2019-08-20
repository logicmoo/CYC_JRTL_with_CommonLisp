package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_backchain_required extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "e9e37d94e86f18fc1a4fbb9b47417f403e5c2c7e4ed9eea66be6e604a9db4414";
    private static SubLSymbol $BACKCHAIN_REQUIRED_POS;
    private static SubLList $list1;
    private static SubLSymbol $BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_BACKCHAIN_REQUIRED_PRUNE;
    private static SubLList $list5;
    private static SubLSymbol $sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED;
    private static SubLSymbol $sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 1800L)
    public static SubLObject current_problem_store_transformation_allowedP(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        SubLObject store = inference_worker.currently_active_problem_store();
        return makeBoolean(NIL != store && NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2000L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP(SubLObject asent) {
        return inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_asentP(asent, mt_relevance_macros.current_mt_relevance_mt());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2700L)
    public static SubLObject removal_backchain_required_prune_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == inference_worker_transformation.inference_backchain_forbidden_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2900L)
    public static SubLObject inference_backchain_required_asent_in_relevant_mtP(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject declare_removal_modules_backchain_required_file() {
        declareFunction("current_problem_store_transformation_allowedP", "CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 0, 1, false);
        new $current_problem_store_transformation_allowedP$ZeroArityFunction();
        new $current_problem_store_transformation_allowedP$UnaryFunction();
        declareFunction("inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?", 1, 0, false);
        declareFunction("removal_backchain_required_prune_required", "REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED", 1, 1, false);
        declareFunction("inference_backchain_required_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?", 1, 1, false);
        new $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction();
        new $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction();
        return NIL;
    }

    public static SubLObject init_removal_modules_backchain_required_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_backchain_required_file() {
        preference_modules.inference_preference_module($BACKCHAIN_REQUIRED_POS, $list1);
        preference_modules.inference_preference_module($BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY, $list3);
        inference_modules.inference_removal_module($REMOVAL_BACKCHAIN_REQUIRED_PRUNE, $list5);
        utilities_macros.note_funcall_helper_function($sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED);
        utilities_macros.note_funcall_helper_function($sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_backchain_required_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_backchain_required_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_backchain_required_file();
    }

    static {
        me = new removal_modules_backchain_required();
        $BACKCHAIN_REQUIRED_POS = makeKeyword("BACKCHAIN-REQUIRED-POS");
        $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"));
        $BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY = makeKeyword("BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-DELAY");
        $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")),
                list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED"),
                makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString("(<fort> . <whatever>)\n    in all cases where <fort> is #$backchainRequired should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$sentenceTruth (#$isa ?X #$Integer))") });
        $sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED = makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED");
        $sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_ = makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?");
    }

    public static class $current_problem_store_transformation_allowedP$ZeroArityFunction extends ZeroArityFunction {
        public $current_problem_store_transformation_allowedP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"));
        }

        @Override
        public SubLObject processItem() {
            return current_problem_store_transformation_allowedP($current_problem_store_transformation_allowedP$ZeroArityFunction.UNPROVIDED);
        }
    }

    public static class $current_problem_store_transformation_allowedP$UnaryFunction extends UnaryFunction {
        public $current_problem_store_transformation_allowedP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return current_problem_store_transformation_allowedP(arg1);
        }
    }

    public static class $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction extends UnaryFunction {
        public $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_backchain_required_asent_in_relevant_mtP(arg1, $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction extends BinaryFunction {
        public $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return inference_backchain_required_asent_in_relevant_mtP(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 122 ms
 *
 */