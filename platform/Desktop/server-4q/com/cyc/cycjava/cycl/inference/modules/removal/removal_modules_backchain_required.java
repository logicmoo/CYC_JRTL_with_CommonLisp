package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_backchain_required extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_backchain_required";
    public static final String myFingerPrint = "e9e37d94e86f18fc1a4fbb9b47417f403e5c2c7e4ed9eea66be6e604a9db4414";
    private static final SubLSymbol $kw0$BACKCHAIN_REQUIRED_POS;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_BACKCHAIN_REQUIRED_PRUNE;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED;
    private static final SubLSymbol $sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 1859L)
    public static SubLObject current_problem_store_transformation_allowedP(SubLObject dummy) {
        if (dummy == removal_modules_backchain_required.UNPROVIDED) {
            dummy = (SubLObject)removal_modules_backchain_required.NIL;
        }
        final SubLObject store = inference_worker.currently_active_problem_store();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_backchain_required.NIL != store && removal_modules_backchain_required.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2079L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP(final SubLObject asent) {
        return inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_asentP(asent, mt_relevance_macros.current_mt_relevance_mt());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2779L)
    public static SubLObject removal_backchain_required_prune_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_backchain_required.UNPROVIDED) {
            sense = (SubLObject)removal_modules_backchain_required.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_backchain_required.NIL == inference_worker_transformation.inference_backchain_forbidden_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2953L)
    public static SubLObject inference_backchain_required_asent_in_relevant_mtP(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_backchain_required.UNPROVIDED) {
            sense = (SubLObject)removal_modules_backchain_required.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    public static SubLObject declare_removal_modules_backchain_required_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_backchain_required", "current_problem_store_transformation_allowedP", "CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 0, 1, false);
        new $current_problem_store_transformation_allowedP$ZeroArityFunction();
        new $current_problem_store_transformation_allowedP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_backchain_required", "inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_backchain_required", "removal_backchain_required_prune_required", "REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_backchain_required", "inference_backchain_required_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?", 1, 1, false);
        new $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction();
        new $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction();
        return (SubLObject)removal_modules_backchain_required.NIL;
    }
    
    public static SubLObject init_removal_modules_backchain_required_file() {
        return (SubLObject)removal_modules_backchain_required.NIL;
    }
    
    public static SubLObject setup_removal_modules_backchain_required_file() {
        preference_modules.inference_preference_module((SubLObject)removal_modules_backchain_required.$kw0$BACKCHAIN_REQUIRED_POS, (SubLObject)removal_modules_backchain_required.$list1);
        preference_modules.inference_preference_module((SubLObject)removal_modules_backchain_required.$kw2$BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY, (SubLObject)removal_modules_backchain_required.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_backchain_required.$kw4$REMOVAL_BACKCHAIN_REQUIRED_PRUNE, (SubLObject)removal_modules_backchain_required.$list5);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_backchain_required.$sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_backchain_required.$sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_);
        return (SubLObject)removal_modules_backchain_required.NIL;
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
        me = (SubLFile)new removal_modules_backchain_required();
        $kw0$BACKCHAIN_REQUIRED_POS = SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED-POS");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $kw2$BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY = SubLObjectFactory.makeKeyword("BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-DELAY");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw4$REMOVAL_BACKCHAIN_REQUIRED_PRUNE = SubLObjectFactory.makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_backchain_required.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <whatever>)\n    in all cases where <fort> is #$backchainRequired should immediately fail."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sentenceTruth (#$isa ?X #$Integer))") });
        $sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED");
        $sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_ = SubLObjectFactory.makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?");
    }
    
    public static final class $current_problem_store_transformation_allowedP$ZeroArityFunction extends ZeroArityFunction
    {
        public $current_problem_store_transformation_allowedP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"));
        }
        
        @Override
		public SubLObject processItem() {
            return removal_modules_backchain_required.current_problem_store_transformation_allowedP((SubLObject)$current_problem_store_transformation_allowedP$ZeroArityFunction.UNPROVIDED);
        }
    }
    
    public static final class $current_problem_store_transformation_allowedP$UnaryFunction extends UnaryFunction
    {
        public $current_problem_store_transformation_allowedP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_backchain_required.current_problem_store_transformation_allowedP(arg1);
        }
    }
    
    public static final class $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction extends UnaryFunction
    {
        public $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_backchain_required.inference_backchain_required_asent_in_relevant_mtP(arg1, (SubLObject)$inference_backchain_required_asent_in_relevant_mtP$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction extends BinaryFunction
    {
        public $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_backchain_required.inference_backchain_required_asent_in_relevant_mtP(arg1, arg2);
        }
    }
}

/*

	Total time: 122 ms
	
*/