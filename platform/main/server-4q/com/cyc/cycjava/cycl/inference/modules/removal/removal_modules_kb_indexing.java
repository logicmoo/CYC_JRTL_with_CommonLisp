package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_kb_indexing extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_kb_indexing();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing";

    public static final String myFingerPrint = "1959364b4582ae9b9e9bf72f2a0ff961803c07a48542748f344b058668ce79aa";

    // deflexical
    // Definitions
    private static final SubLSymbol $default_removal_mt_cardinality_cost$ = makeSymbol("*DEFAULT-REMOVAL-MT-CARDINALITY-COST*");

    // deflexical
    private static final SubLSymbol $default_removal_mt_cardinality_for_term_cost$ = makeSymbol("*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*");

    private static final SubLObject $$mtCardinality = reader_make_constant_shell(makeString("mtCardinality"));



    private static final SubLSymbol $REMOVAL_MT_CARDINALITY_GENERATE = makeKeyword("REMOVAL-MT-CARDINALITY-GENERATE");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtCardinality")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtCardinality")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-MT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtCardinality")), list(makeKeyword("BIND"), makeSymbol("MT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MT-CARDINALITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("mtCardinality")), list(makeKeyword("VALUE"), makeSymbol("MT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$mtCardinality <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtCardinality #$CyclistsMt ?COUNT)") });

    private static final SubLObject $$mtCardinalityForTerm = reader_make_constant_shell(makeString("mtCardinalityForTerm"));



    private static final SubLSymbol $REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE = makeKeyword("REMOVAL-MT-CARDINALITY-FOR-TERM-GENERATE");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtCardinalityForTerm")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtCardinalityForTerm")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtCardinalityForTerm")), list(makeKeyword("BIND"), makeSymbol("MT")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), makeKeyword("NA")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MT-CARDINALITY-FOR-TERM"), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("mtCardinalityForTerm")), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$mtCardinalityForTerm <fort> <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtCardinalityForTerm #$CyclistsMt #$Cyc ?COUNT)") });

    private static final SubLObject $$assertionCountForTermsInSet = reader_make_constant_shell(makeString("assertionCountForTermsInSet"));

    private static final SubLSymbol $sym9$IMPLEMENTATION_ASSERTION_ = makeSymbol("IMPLEMENTATION-ASSERTION?");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLSymbol $REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE = makeKeyword("REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET-GENERATE");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionCountForTermsInSet")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionCountForTermsInSet")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionCountForTermsInSet")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TERM-SET"))), makeKeyword("NA")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET"), list(makeKeyword("VALUE"), makeSymbol("TERM-SET")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionCountForTermsInSet")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TERM-SET"))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionCountForTermsInSet <not-fully-bound> <el-set>)"), makeKeyword("EXAMPLE"), makeString("(#$isa CyclistsMt (#$assertionCountForTermsInSet ?COUNT #$Cyc)") });

    public static SubLObject removal_mt_cardinality(final SubLObject mt) {
        if ((NIL != forts.fort_p(mt)) && (NIL == kb_indexing.broad_mtP(mt))) {
            return kb_indexing.num_mt_index(mt);
        }
        return NIL;
    }

    public static SubLObject removal_mt_cardinality_for_term(final SubLObject mt, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((NIL != forts.fort_p(mt)) && (NIL != forts.fort_p(v_term))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                result = kb_indexing.relevant_num_index(v_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject removal_assertion_count_for_terms_set(final SubLObject term_set) {
        SubLObject result = NIL;
        if (NIL != el_extensional_set_p(term_set)) {
            final SubLObject terms = el_extensional_set_elements(term_set);
            result = cardinality_estimates.terms_assertion_count(terms, NIL, $sym9$IMPLEMENTATION_ASSERTION_);
        }
        return result;
    }

    public static SubLObject implementation_assertionP(final SubLObject a) {
        if (NIL != assertions_high.gaf_assertionP(a)) {
            final SubLObject pred = assertions_high.gaf_predicate(a);
            if ((pred.eql($$quotedIsa) || (NIL != fort_types_interface.distributing_meta_knowledge_predicate_p(pred))) || (NIL != fort_types_interface.documentation_predicate_p(pred, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_kb_indexing_file() {
        declareFunction(me, "removal_mt_cardinality", "REMOVAL-MT-CARDINALITY", 1, 0, false);
        declareFunction(me, "removal_mt_cardinality_for_term", "REMOVAL-MT-CARDINALITY-FOR-TERM", 2, 0, false);
        declareFunction(me, "removal_assertion_count_for_terms_set", "REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET", 1, 0, false);
        declareFunction(me, "implementation_assertionP", "IMPLEMENTATION-ASSERTION?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_kb_indexing_file() {
        deflexical("*DEFAULT-REMOVAL-MT-CARDINALITY-COST*", ONE_INTEGER);
        deflexical("*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_kb_indexing_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$mtCardinality);
        preference_modules.doomed_unless_arg_bindable($POS, $$mtCardinality, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MT_CARDINALITY_GENERATE, $list3);
        inference_modules.register_solely_specific_removal_module_predicate($$mtCardinalityForTerm);
        preference_modules.doomed_unless_arg_bindable($POS, $$mtCardinalityForTerm, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$mtCardinalityForTerm, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE, $list7);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionCountForTermsInSet);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionCountForTermsInSet, TWO_INTEGER);
        note_funcall_helper_function($sym9$IMPLEMENTATION_ASSERTION_);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE, $list12);
        return NIL;
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
















    }
}

/**
 * Total time: 101 ms
 */
