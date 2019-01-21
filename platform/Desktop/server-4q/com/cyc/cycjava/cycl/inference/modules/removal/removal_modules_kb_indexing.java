package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_kb_indexing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing";
    public static final String myFingerPrint = "1959364b4582ae9b9e9bf72f2a0ff961803c07a48542748f344b058668ce79aa";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 868L)
    private static SubLSymbol $default_removal_mt_cardinality_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 2131L)
    private static SubLSymbol $default_removal_mt_cardinality_for_term_cost$;
    private static final SubLObject $const0$mtCardinality;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_MT_CARDINALITY_GENERATE;
    private static final SubLList $list3;
    private static final SubLObject $const4$mtCardinalityForTerm;
    private static final SubLSymbol $sym5$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw6$REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE;
    private static final SubLList $list7;
    private static final SubLObject $const8$assertionCountForTermsInSet;
    private static final SubLSymbol $sym9$IMPLEMENTATION_ASSERTION_;
    private static final SubLObject $const10$quotedIsa;
    private static final SubLSymbol $kw11$REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 930L)
    public static SubLObject removal_mt_cardinality(final SubLObject mt) {
        if (removal_modules_kb_indexing.NIL != forts.fort_p(mt) && removal_modules_kb_indexing.NIL == kb_indexing.broad_mtP(mt)) {
            return kb_indexing.num_mt_index(mt);
        }
        return (SubLObject)removal_modules_kb_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 2202L)
    public static SubLObject removal_mt_cardinality_for_term(final SubLObject mt, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_kb_indexing.NIL;
        if (removal_modules_kb_indexing.NIL != forts.fort_p(mt) && removal_modules_kb_indexing.NIL != forts.fort_p(v_term)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_kb_indexing.$sym5$RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                result = kb_indexing.relevant_num_index(v_term);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 3493L)
    public static SubLObject removal_assertion_count_for_terms_set(final SubLObject term_set) {
        SubLObject result = (SubLObject)removal_modules_kb_indexing.NIL;
        if (removal_modules_kb_indexing.NIL != el_utilities.el_extensional_set_p(term_set)) {
            final SubLObject terms = el_utilities.el_extensional_set_elements(term_set);
            result = cardinality_estimates.terms_assertion_count(terms, (SubLObject)removal_modules_kb_indexing.NIL, (SubLObject)removal_modules_kb_indexing.$sym9$IMPLEMENTATION_ASSERTION_);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 3778L)
    public static SubLObject implementation_assertionP(final SubLObject a) {
        if (removal_modules_kb_indexing.NIL != assertions_high.gaf_assertionP(a)) {
            final SubLObject pred = assertions_high.gaf_predicate(a);
            if (pred.eql(removal_modules_kb_indexing.$const10$quotedIsa) || removal_modules_kb_indexing.NIL != fort_types_interface.distributing_meta_knowledge_predicate_p(pred) || removal_modules_kb_indexing.NIL != fort_types_interface.documentation_predicate_p(pred, (SubLObject)removal_modules_kb_indexing.UNPROVIDED)) {
                return (SubLObject)removal_modules_kb_indexing.T;
            }
        }
        return (SubLObject)removal_modules_kb_indexing.NIL;
    }
    
    public static SubLObject declare_removal_modules_kb_indexing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing", "removal_mt_cardinality", "REMOVAL-MT-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing", "removal_mt_cardinality_for_term", "REMOVAL-MT-CARDINALITY-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing", "removal_assertion_count_for_terms_set", "REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing", "implementation_assertionP", "IMPLEMENTATION-ASSERTION?", 1, 0, false);
        return (SubLObject)removal_modules_kb_indexing.NIL;
    }
    
    public static SubLObject init_removal_modules_kb_indexing_file() {
        removal_modules_kb_indexing.$default_removal_mt_cardinality_cost$ = SubLFiles.deflexical("*DEFAULT-REMOVAL-MT-CARDINALITY-COST*", (SubLObject)removal_modules_kb_indexing.ONE_INTEGER);
        removal_modules_kb_indexing.$default_removal_mt_cardinality_for_term_cost$ = SubLFiles.deflexical("*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*", (SubLObject)removal_modules_kb_indexing.ONE_INTEGER);
        return (SubLObject)removal_modules_kb_indexing.NIL;
    }
    
    public static SubLObject setup_removal_modules_kb_indexing_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_kb_indexing.$const0$mtCardinality);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_kb_indexing.$kw1$POS, removal_modules_kb_indexing.$const0$mtCardinality, (SubLObject)removal_modules_kb_indexing.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_kb_indexing.$kw2$REMOVAL_MT_CARDINALITY_GENERATE, (SubLObject)removal_modules_kb_indexing.$list3);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_kb_indexing.$const4$mtCardinalityForTerm);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_kb_indexing.$kw1$POS, removal_modules_kb_indexing.$const4$mtCardinalityForTerm, (SubLObject)removal_modules_kb_indexing.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_kb_indexing.$kw1$POS, removal_modules_kb_indexing.$const4$mtCardinalityForTerm, (SubLObject)removal_modules_kb_indexing.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_kb_indexing.$kw6$REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE, (SubLObject)removal_modules_kb_indexing.$list7);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_kb_indexing.$const8$assertionCountForTermsInSet);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_kb_indexing.$kw1$POS, removal_modules_kb_indexing.$const8$assertionCountForTermsInSet, (SubLObject)removal_modules_kb_indexing.TWO_INTEGER);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_kb_indexing.$sym9$IMPLEMENTATION_ASSERTION_);
        inference_modules.inference_removal_module((SubLObject)removal_modules_kb_indexing.$kw11$REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE, (SubLObject)removal_modules_kb_indexing.$list12);
        return (SubLObject)removal_modules_kb_indexing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_kb_indexing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_kb_indexing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_kb_indexing_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_kb_indexing();
        removal_modules_kb_indexing.$default_removal_mt_cardinality_cost$ = null;
        removal_modules_kb_indexing.$default_removal_mt_cardinality_for_term_cost$ = null;
        $const0$mtCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinality"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_MT_CARDINALITY_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-MT-CARDINALITY-GENERATE");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinality")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinality")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-MT-CARDINALITY-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MT-CARDINALITY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinality")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtCardinality <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtCardinality #$CyclistsMt ?COUNT)") });
        $const4$mtCardinalityForTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm"));
        $sym5$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw6$REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-MT-CARDINALITY-FOR-TERM-GENERATE");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("NA")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MT-CARDINALITY-FOR-TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtCardinalityForTerm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtCardinalityForTerm <fort> <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtCardinalityForTerm #$CyclistsMt #$Cyc ?COUNT)") });
        $const8$assertionCountForTermsInSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet"));
        $sym9$IMPLEMENTATION_ASSERTION_ = SubLObjectFactory.makeSymbol("IMPLEMENTATION-ASSERTION?");
        $const10$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $kw11$REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET-GENERATE");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_kb_indexing.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-SET"))), (SubLObject)SubLObjectFactory.makeKeyword("NA")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-SET")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionCountForTermsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-SET"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionCountForTermsInSet <not-fully-bound> <el-set>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa CyclistsMt (#$assertionCountForTermsInSet ?COUNT #$Cyc)") });
    }
}

/*

	Total time: 101 ms
	
*/