package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class meta_removal_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules";
    public static final String myFingerPrint = "8db4160f1aa0e18e6a1e01a247e65f629b1bb22b92b9bde8515cbca63111add7";
    private static final SubLSymbol $kw0$TACTICAL;
    private static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
    private static final SubLList $list4;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 903L)
    public static SubLObject meta_removal_complete_pos_required() {
        final SubLObject problem = inference_worker.currently_active_problem();
        if (meta_removal_modules.NIL != problem) {
            return (SubLObject)SubLObjectFactory.makeBoolean(meta_removal_modules.NIL != inference_datastructures_problem.problem_has_possible_removal_tacticP(problem, (SubLObject)meta_removal_modules.$kw0$TACTICAL) && meta_removal_modules.NIL == inference_datastructures_problem.problem_has_complete_possible_removal_tacticP(problem, (SubLObject)meta_removal_modules.$kw0$TACTICAL));
        }
        return (SubLObject)meta_removal_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 1593L)
    public static SubLObject meta_removal_complete_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == meta_removal_modules.UNPROVIDED) {
            sense = (SubLObject)meta_removal_modules.NIL;
        }
        final SubLObject productivity = inference_datastructures_problem.problem_total_deductive_removal_productivity(inference_worker.currently_active_problem());
        return inference_datastructures_enumerated_types.cost_for_productivity(productivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 1890L)
    public static SubLObject meta_removal_completely_enumerable_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == meta_removal_modules.UNPROVIDED) {
            sense = (SubLObject)meta_removal_modules.NIL;
        }
        if (meta_removal_modules.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)meta_removal_modules.T)) {
            asent = el_utilities.designated_sentence(asent);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(meta_removal_modules.NIL != meta_removal_complete_pos_required() && meta_removal_modules.NIL != inference_completeness_utilities.inference_completely_enumerable_asentP(asent, mt_relevance_macros.inference_relevant_mt()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 2381L)
    public static SubLObject meta_removal_completely_decidable_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == meta_removal_modules.UNPROVIDED) {
            sense = (SubLObject)meta_removal_modules.NIL;
        }
        if (meta_removal_modules.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)meta_removal_modules.T)) {
            asent = el_utilities.designated_sentence(asent);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(meta_removal_modules.NIL != meta_removal_complete_pos_required() && meta_removal_modules.NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt()));
    }
    
    public static SubLObject declare_meta_removal_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules", "meta_removal_complete_pos_required", "META-REMOVAL-COMPLETE-POS-REQUIRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules", "meta_removal_complete_pos_cost", "META-REMOVAL-COMPLETE-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules", "meta_removal_completely_enumerable_pos_required", "META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules", "meta_removal_completely_decidable_pos_required", "META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED", 1, 1, false);
        return (SubLObject)meta_removal_modules.NIL;
    }
    
    public static SubLObject init_meta_removal_modules_file() {
        return (SubLObject)meta_removal_modules.NIL;
    }
    
    public static SubLObject setup_meta_removal_modules_file() {
        inference_modules.inference_meta_removal_module((SubLObject)meta_removal_modules.$kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS, (SubLObject)meta_removal_modules.$list2);
        inference_modules.inference_meta_removal_module((SubLObject)meta_removal_modules.$kw3$META_REMOVAL_COMPLETELY_DECIDABLE_POS, (SubLObject)meta_removal_modules.$list4);
        return (SubLObject)meta_removal_modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_meta_removal_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_meta_removal_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_meta_removal_modules_file();
    }
    
    static {
        me = (SubLFile)new meta_removal_modules();
        $kw0$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <not fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$borderingCountries #$Canada ?WHAT)\n    given other tactics to solve this and\n    (#$completeExtentEnumerable #$borderingCountries)") });
        $kw3$META_REMOVAL_COMPLETELY_DECIDABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> . <fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$borderingCountries #$Canada #$Mexico)\n    given other tactics to solve this and\n    (#$completeExtentDecidable #$borderingCountries)") });
    }
}

/*

	Total time: 20 ms
	
*/