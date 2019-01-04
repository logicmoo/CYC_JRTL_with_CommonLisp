package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_semantically_related extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related";
    public static final String myFingerPrint = "6fe3a210f5a7a0ab00b0170463d13c0bb0d86fb347662d4d5a84a73bef8fbff3";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 3595L)
    private static SubLSymbol $default_mutually_coherent_cost$;
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLObject $const1$or;
    private static final SubLObject $const2$geographicalSubRegions;
    private static final SubLObject $const3$geopoliticalSubdivision;
    private static final SubLObject $const4$genls;
    private static final SubLSymbol $kw5$GENLS;
    private static final SubLObject $const6$isa;
    private static final SubLSymbol $kw7$ISA;
    private static final SubLSymbol $kw8$OPAQUE;
    private static final SubLObject $const9$mutuallyCoherent;
    private static final SubLSymbol $kw10$POS;
    private static final SubLSymbol $kw11$REMOVAL_MUTUALLY_COHERENT;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 828L)
    public static SubLObject mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == removal_modules_semantically_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_semantically_related.NIL;
        }
        assert removal_modules_semantically_related.NIL != forts.fort_p(source) : source;
        if (removal_modules_semantically_related.NIL != subl_promotions.positive_integer_p(virtual_indexing.num_overlap_index((SubLObject)ConsesLow.list(source, target), mt))) {
            return (SubLObject)removal_modules_semantically_related.T;
        }
        if (removal_modules_semantically_related.NIL != genls.hierarchical_collectionsP(source, target, mt)) {
            return (SubLObject)removal_modules_semantically_related.T;
        }
        if (removal_modules_semantically_related.NIL != isa.isaP(source, target, mt, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
            return (SubLObject)removal_modules_semantically_related.T;
        }
        if (removal_modules_semantically_related.NIL != isa.isaP(target, source, mt, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
            return (SubLObject)removal_modules_semantically_related.T;
        }
        if (removal_modules_semantically_related.NIL != ask_utilities.query_boolean((SubLObject)ConsesLow.list(removal_modules_semantically_related.$const1$or, (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const2$geographicalSubRegions, source, target), (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const2$geographicalSubRegions, target, source), (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const3$geopoliticalSubdivision, target, source), (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const3$geopoliticalSubdivision, source, target)), mt, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
            return (SubLObject)removal_modules_semantically_related.T;
        }
        return (SubLObject)removal_modules_semantically_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 1862L)
    public static SubLObject why_mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == removal_modules_semantically_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_semantically_related.NIL;
        }
        assert removal_modules_semantically_related.NIL != forts.fort_p(source) : source;
        assert removal_modules_semantically_related.NIL != forts.fort_p(target) : target;
        return why_mutually_coherentP_internal(source, target, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 2228L)
    public static SubLObject why_mutually_coherentP_internal(SubLObject source, final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arguments = (SubLObject)removal_modules_semantically_related.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (removal_modules_semantically_related.NIL != subl_promotions.positive_integer_p(virtual_indexing.num_overlap_index((SubLObject)ConsesLow.list(source, target), (SubLObject)removal_modules_semantically_related.UNPROVIDED))) {
                v_arguments = (SubLObject)ConsesLow.cons(virtual_indexing.gather_overlap_index((SubLObject)ConsesLow.list(source, target), mt).first(), v_arguments);
            }
            else if (removal_modules_semantically_related.NIL != genls.genlP(source, target, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
                final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const4$genls, source, target);
                v_arguments = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_semantically_related.$kw5$GENLS, formula, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED), v_arguments);
            }
            else if (removal_modules_semantically_related.NIL != genls.genlP(target, source, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
                final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const4$genls, target, source);
                v_arguments = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_semantically_related.$kw5$GENLS, formula, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED), v_arguments);
            }
            else if (removal_modules_semantically_related.NIL != isa.isaP(source, target, mt, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
                final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const6$isa, source, target);
                v_arguments = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_semantically_related.$kw7$ISA, formula, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED), v_arguments);
            }
            else if (removal_modules_semantically_related.NIL != isa.isaP(target, source, mt, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
                final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const6$isa, target, source);
                v_arguments = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_semantically_related.$kw7$ISA, formula, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED), v_arguments);
            }
            else {
                v_arguments = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_semantically_related.$kw8$OPAQUE, (SubLObject)ConsesLow.list(removal_modules_semantically_related.$const9$mutuallyCoherent, source, target), mt, (SubLObject)removal_modules_semantically_related.UNPROVIDED), v_arguments);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_arguments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 3759L)
    public static SubLObject removal_mutually_coherent_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_semantically_related.UNPROVIDED) {
            sense = (SubLObject)removal_modules_semantically_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_semantically_related.UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_semantically_related.UNPROVIDED);
        if (removal_modules_semantically_related.NIL != mutually_coherentP(source, target, (SubLObject)removal_modules_semantically_related.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_semantically_related.$kw8$OPAQUE, asent, (SubLObject)removal_modules_semantically_related.UNPROVIDED, (SubLObject)removal_modules_semantically_related.UNPROVIDED), (SubLObject)removal_modules_semantically_related.NIL, why_mutually_coherentP_internal(source, target, mt_relevance_macros.$mt$.getDynamicValue(thread)));
        }
        return (SubLObject)removal_modules_semantically_related.NIL;
    }
    
    public static SubLObject declare_removal_modules_semantically_related_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related", "mutually_coherentP", "MUTUALLY-COHERENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related", "why_mutually_coherentP", "WHY-MUTUALLY-COHERENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related", "why_mutually_coherentP_internal", "WHY-MUTUALLY-COHERENT?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related", "removal_mutually_coherent_expand", "REMOVAL-MUTUALLY-COHERENT-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_semantically_related.NIL;
    }
    
    public static SubLObject init_removal_modules_semantically_related_file() {
        removal_modules_semantically_related.$default_mutually_coherent_cost$ = SubLFiles.defparameter("*DEFAULT-MUTUALLY-COHERENT-COST*", (SubLObject)removal_modules_semantically_related.ONE_INTEGER);
        return (SubLObject)removal_modules_semantically_related.NIL;
    }
    
    public static SubLObject setup_removal_modules_semantically_related_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_semantically_related.$const9$mutuallyCoherent);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_semantically_related.$kw10$POS, removal_modules_semantically_related.$const9$mutuallyCoherent);
        inference_modules.inference_removal_module((SubLObject)removal_modules_semantically_related.$kw11$REMOVAL_MUTUALLY_COHERENT, (SubLObject)removal_modules_semantically_related.$list12);
        return (SubLObject)removal_modules_semantically_related.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_semantically_related_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_semantically_related_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_semantically_related_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_semantically_related();
        removal_modules_semantically_related.$default_mutually_coherent_cost$ = null;
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const1$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const2$geographicalSubRegions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions"));
        $const3$geopoliticalSubdivision = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision"));
        $const4$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw5$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const6$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw7$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw8$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const9$mutuallyCoherent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mutuallyCoherent"));
        $kw10$POS = SubLObjectFactory.makeKeyword("POS");
        $kw11$REMOVAL_MUTUALLY_COHERENT = SubLObjectFactory.makeKeyword("REMOVAL-MUTUALLY-COHERENT");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mutuallyCoherent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mutuallyCoherent")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MUTUALLY-COHERENT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MUTUALLY-COHERENT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mutuallyCoherent <fort> <fully bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mutuallyCoherent #$BillClinton HilaryClinton)") });
    }
}

/*

	Total time: 104 ms
	
*/