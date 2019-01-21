package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_kb_estimates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_estimates";
    public static final String myFingerPrint = "61327860202280ad9b985f2ce37a9df245a017107e6311ca16de10c838a9ddef";
    private static final SubLObject $const0$termGeneralityEstimate;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$OPAQUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-estimates.lisp", position = 1693L)
    public static SubLObject removal_term_generality_estimate_pos(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_kb_estimates.UNPROVIDED) {
            sense = (SubLObject)removal_modules_kb_estimates.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_kb_estimates.UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_kb_estimates.UNPROVIDED);
        final SubLObject answer_num = cardinality_estimates.generality_estimate(v_term);
        final SubLObject v_bindings = unification_utilities.term_unify(answer_num, num, (SubLObject)removal_modules_kb_estimates.UNPROVIDED, (SubLObject)removal_modules_kb_estimates.UNPROVIDED);
        if (removal_modules_kb_estimates.NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_kb_estimates.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_kb_estimates.UNPROVIDED, (SubLObject)removal_modules_kb_estimates.UNPROVIDED), v_bindings, (SubLObject)removal_modules_kb_estimates.UNPROVIDED);
        }
        return (SubLObject)removal_modules_kb_estimates.NIL;
    }
    
    public static SubLObject declare_removal_modules_kb_estimates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_estimates", "removal_term_generality_estimate_pos", "REMOVAL-TERM-GENERALITY-ESTIMATE-POS", 1, 1, false);
        return (SubLObject)removal_modules_kb_estimates.NIL;
    }
    
    public static SubLObject init_removal_modules_kb_estimates_file() {
        return (SubLObject)removal_modules_kb_estimates.NIL;
    }
    
    public static SubLObject setup_removal_modules_kb_estimates_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_kb_estimates.$const0$termGeneralityEstimate);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_kb_estimates.$kw1$POS, removal_modules_kb_estimates.$const0$termGeneralityEstimate, (SubLObject)removal_modules_kb_estimates.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_kb_estimates.$kw2$REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK, (SubLObject)removal_modules_kb_estimates.$list3);
        return (SubLObject)removal_modules_kb_estimates.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_kb_estimates_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_kb_estimates_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_kb_estimates_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_kb_estimates();
        $const0$termGeneralityEstimate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termGeneralityEstimate"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_TERM_GENERALITY_ESTIMATE_POS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TERM-GENERALITY-ESTIMATE-POS-CHECK");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termGeneralityEstimate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termGeneralityEstimate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-GENERALITY-ESTIMATE-POS"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termGeneralityEstimate <TERM> ?GENERALITY-ESTIMATE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termGeneralityEstimate #$Dog ?NUM)") });
        $kw4$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
    }
}

/*

	Total time: 65 ms
	
*/