/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.mt_relevance_macros;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-BACKCHAIN-REQUIRED
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-backchain-required.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_backchain_required extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_backchain_required();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_backchain_required";


    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $BACKCHAIN_REQUIRED_POS = makeKeyword("BACKCHAIN-REQUIRED-POS");

    static private final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"));

    private static final SubLSymbol $BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY = makeKeyword("BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-DELAY");

    static private final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($TEST, makeSymbol("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")), cons($FORT, makeKeyword("ANYTHING")), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>)\n    in all cases where <fort> is #$backchainRequired should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$sentenceTruth (#$isa ?X #$Integer))") });

    private static final SubLSymbol REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED = makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED");

    static private final SubLSymbol $sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_ = makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?");

    // Definitions
    public static final SubLObject current_problem_store_transformation_allowedP_alt(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        {
            SubLObject store = inference_worker.currently_active_problem_store();
            return makeBoolean((NIL != store) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store)));
        }
    }

    // Definitions
    public static SubLObject current_problem_store_transformation_allowedP(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        final SubLObject store = inference_worker.currently_active_problem_store();
        return makeBoolean((NIL != store) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store)));
    }

    public static final SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP_alt(SubLObject asent) {
        return inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_asentP(asent, mt_relevance_macros.current_mt_relevance_mt());
    }

    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP(final SubLObject asent) {
        return inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_asentP(asent, mt_relevance_macros.current_mt_relevance_mt());
    }

    public static final SubLObject removal_backchain_required_prune_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(NIL == inference_worker_transformation.inference_backchain_forbidden_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread)));
        }
    }

    public static SubLObject removal_backchain_required_prune_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == inference_worker_transformation.inference_backchain_forbidden_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }

    /**
     * A version of @xref inference-backchain-required-asent? that assumes *mt*
     */
    @LispMethod(comment = "A version of @xref inference-backchain-required-asent? that assumes *mt*")
    public static final SubLObject inference_backchain_required_asent_in_relevant_mtP_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "A version of @xref inference-backchain-required-asent? that assumes *mt*")
    public static SubLObject inference_backchain_required_asent_in_relevant_mtP(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject declare_removal_modules_backchain_required_file() {
        declareFunction("current_problem_store_transformation_allowedP", "CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 0, 1, false);
        new removal_modules_backchain_required.$current_problem_store_transformation_allowedP$ZeroArityFunction();
        new removal_modules_backchain_required.$current_problem_store_transformation_allowedP$UnaryFunction();
        declareFunction("inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?", 1, 0, false);
        declareFunction("removal_backchain_required_prune_required", "REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED", 1, 1, false);
        declareFunction("inference_backchain_required_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?", 1, 1, false);
        new removal_modules_backchain_required.$inference_backchain_required_asent_in_relevant_mtP$UnaryFunction();
        new removal_modules_backchain_required.$inference_backchain_required_asent_in_relevant_mtP$BinaryFunction();
        return NIL;
    }

    public static SubLObject init_removal_modules_backchain_required_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_backchain_required_file() {
        preference_modules.inference_preference_module($BACKCHAIN_REQUIRED_POS, $list1);
        preference_modules.inference_preference_module($BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY, $list3);
        inference_modules.inference_removal_module($REMOVAL_BACKCHAIN_REQUIRED_PRUNE, $list5);
        note_funcall_helper_function(REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED);
        note_funcall_helper_function($sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_);
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
    }

    static private final SubLList $list_alt1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"));

    public static final class $current_problem_store_transformation_allowedP$ZeroArityFunction extends ZeroArityFunction {
        public $current_problem_store_transformation_allowedP$ZeroArityFunction() {
            super(extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"));
        }

        @Override
        public SubLObject processItem() {
            return current_problem_store_transformation_allowedP(removal_modules_backchain_required.$current_problem_store_transformation_allowedP$ZeroArityFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($TEST, makeSymbol("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")), cons($FORT, makeKeyword("ANYTHING")), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    public static final class $current_problem_store_transformation_allowedP$UnaryFunction extends UnaryFunction {
        public $current_problem_store_transformation_allowedP$UnaryFunction() {
            super(extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return current_problem_store_transformation_allowedP(arg1);
        }
    }

    public static final class $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction extends UnaryFunction {
        public $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_backchain_required_asent_in_relevant_mtP(arg1, removal_modules_backchain_required.$inference_backchain_required_asent_in_relevant_mtP$UnaryFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($TEST, makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>)\n    in all cases where <fort> is #$backchainRequired should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$sentenceTruth (#$isa ?X #$Integer))") });

    public static final class $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction extends BinaryFunction {
        public $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction() {
            super(extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_backchain_required_asent_in_relevant_mtP(arg1, arg2);
        }
    }
}

/**
 * Total time: 122 ms
 */
