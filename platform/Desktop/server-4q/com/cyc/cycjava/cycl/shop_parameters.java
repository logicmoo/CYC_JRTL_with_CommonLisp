package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_parameters extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_parameters";
    public static final String myFingerPrint = "cc968fa3ad4f9da2aad3677e6e78d4f58c042f880bb7c57e8615598fb3b6531c";
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 806L)
    public static SubLSymbol $shop_heuristics$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 1027L)
    public static SubLSymbol $shop_default_depth_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 1291L)
    public static SubLSymbol $shop_default_time_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 1509L)
    public static SubLSymbol $shop_default_number_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 1730L)
    public static SubLSymbol $shop_use_real_canonicalization$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 1975L)
    public static SubLSymbol $shop_inference_intermediate_step_validation_level$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 2194L)
    public static SubLSymbol $shop_method_cycle_checking_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 2307L)
    public static SubLSymbol $shop_use_multibindingsP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 2438L)
    public static SubLSymbol $shop_hypothesize_modeP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 2590L)
    public static SubLSymbol $shop_use_mt_world_statesP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 2802L)
    public static SubLSymbol $shop_infer_complete_preconditionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 2988L)
    public static SubLSymbol $shop_use_inference_supportsP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 3170L)
    public static SubLSymbol $shop_use_shop_askP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 3297L)
    public static SubLSymbol $shop_object_indexingP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 3471L)
    public static SubLSymbol $shop_use_precondition_for_methodP$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 3637L)
    public static SubLSymbol $shop_ask_plan_state$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 3873L)
    public static SubLSymbol $shop_ask_dynamic_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 4052L)
    public static SubLSymbol $shop_ask_multibinding$;
    private static final SubLInteger $int0$500;
    private static final SubLSymbol $kw1$NONE;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-parameters.lisp", position = 4194L)
    public static SubLObject shop_ask_dynamic_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(pred, shop_parameters.$shop_ask_dynamic_predicates$.getDynamicValue(thread));
    }
    
    public static SubLObject declare_shop_parameters_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_parameters", "shop_ask_dynamic_predicateP", "SHOP-ASK-DYNAMIC-PREDICATE?", 1, 0, false);
        return (SubLObject)shop_parameters.NIL;
    }
    
    public static SubLObject init_shop_parameters_file() {
        shop_parameters.$shop_heuristics$ = SubLFiles.deflexical("*SHOP-HEURISTICS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)shop_parameters.EQ), (SubLObject)shop_parameters.TEN_INTEGER));
        shop_parameters.$shop_default_depth_limit$ = SubLFiles.defparameter("*SHOP-DEFAULT-DEPTH-LIMIT*", (SubLObject)shop_parameters.$int0$500);
        shop_parameters.$shop_default_time_limit$ = SubLFiles.defparameter("*SHOP-DEFAULT-TIME-LIMIT*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_default_number_limit$ = SubLFiles.defparameter("*SHOP-DEFAULT-NUMBER-LIMIT*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_use_real_canonicalization$ = SubLFiles.defparameter("*SHOP-USE-REAL-CANONICALIZATION*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_inference_intermediate_step_validation_level$ = SubLFiles.defparameter("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", (SubLObject)shop_parameters.$kw1$NONE);
        shop_parameters.$shop_method_cycle_checking_enabledP$ = SubLFiles.defparameter("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*", (SubLObject)shop_parameters.T);
        shop_parameters.$shop_use_multibindingsP$ = SubLFiles.defparameter("*SHOP-USE-MULTIBINDINGS?*", (SubLObject)shop_parameters.T);
        shop_parameters.$shop_hypothesize_modeP$ = SubLFiles.defparameter("*SHOP-HYPOTHESIZE-MODE?*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_use_mt_world_statesP$ = SubLFiles.defparameter("*SHOP-USE-MT-WORLD-STATES?*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_infer_complete_preconditionsP$ = SubLFiles.defparameter("*SHOP-INFER-COMPLETE-PRECONDITIONS?*", (SubLObject)shop_parameters.T);
        shop_parameters.$shop_use_inference_supportsP$ = SubLFiles.defparameter("*SHOP-USE-INFERENCE-SUPPORTS?*", (SubLObject)shop_parameters.T);
        shop_parameters.$shop_use_shop_askP$ = SubLFiles.defparameter("*SHOP-USE-SHOP-ASK?*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_object_indexingP$ = SubLFiles.defparameter("*SHOP-OBJECT-INDEXING?*", (SubLObject)shop_parameters.T);
        shop_parameters.$shop_use_precondition_for_methodP$ = SubLFiles.defparameter("*SHOP-USE-PRECONDITION-FOR-METHOD?*", (SubLObject)shop_parameters.T);
        shop_parameters.$shop_ask_plan_state$ = SubLFiles.defparameter("*SHOP-ASK-PLAN-STATE*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_ask_dynamic_predicates$ = SubLFiles.defparameter("*SHOP-ASK-DYNAMIC-PREDICATES*", (SubLObject)shop_parameters.NIL);
        shop_parameters.$shop_ask_multibinding$ = SubLFiles.defparameter("*SHOP-ASK-MULTIBINDING*", (SubLObject)shop_parameters.NIL);
        return (SubLObject)shop_parameters.NIL;
    }
    
    public static SubLObject setup_shop_parameters_file() {
        return (SubLObject)shop_parameters.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_parameters_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_parameters_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_parameters_file();
    }
    
    static {
        me = (SubLFile)new shop_parameters();
        shop_parameters.$shop_heuristics$ = null;
        shop_parameters.$shop_default_depth_limit$ = null;
        shop_parameters.$shop_default_time_limit$ = null;
        shop_parameters.$shop_default_number_limit$ = null;
        shop_parameters.$shop_use_real_canonicalization$ = null;
        shop_parameters.$shop_inference_intermediate_step_validation_level$ = null;
        shop_parameters.$shop_method_cycle_checking_enabledP$ = null;
        shop_parameters.$shop_use_multibindingsP$ = null;
        shop_parameters.$shop_hypothesize_modeP$ = null;
        shop_parameters.$shop_use_mt_world_statesP$ = null;
        shop_parameters.$shop_infer_complete_preconditionsP$ = null;
        shop_parameters.$shop_use_inference_supportsP$ = null;
        shop_parameters.$shop_use_shop_askP$ = null;
        shop_parameters.$shop_object_indexingP$ = null;
        shop_parameters.$shop_use_precondition_for_methodP$ = null;
        shop_parameters.$shop_ask_plan_state$ = null;
        shop_parameters.$shop_ask_dynamic_predicates$ = null;
        shop_parameters.$shop_ask_multibinding$ = null;
        $int0$500 = SubLObjectFactory.makeInteger(500);
        $kw1$NONE = SubLObjectFactory.makeKeyword("NONE");
    }
}

/*

	Total time: 70 ms
	
*/