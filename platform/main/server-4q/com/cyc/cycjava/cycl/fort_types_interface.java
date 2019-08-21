package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.fort_types_interface.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class fort_types_interface extends SubLTranslatedFile {
    public static final SubLFile me = new fort_types_interface();

    public static final String myName = "com.cyc.cycjava.cycl.fort_types_interface";

    public static final String myFingerPrint = "26b5a6e7eb9687b4d3345468faa546fe536f7b7bc1798e4f1824b90cd03b0834";

    // deflexical
    private static final SubLSymbol $proprietary_constantP_caching_state$ = makeSymbol("*PROPRIETARY-CONSTANT?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $proprietary_termP_caching_state$ = makeSymbol("*PROPRIETARY-TERM?-CACHING-STATE*");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLObject $$FirstOrderCollection = reader_make_constant_shell(makeString("FirstOrderCollection"));

    private static final SubLObject $$SecondOrderCollection = reader_make_constant_shell(makeString("SecondOrderCollection"));

    private static final SubLObject $$ThirdOrderCollection = reader_make_constant_shell(makeString("ThirdOrderCollection"));

    private static final SubLObject $$FourthOrderCollection = reader_make_constant_shell(makeString("FourthOrderCollection"));







    private static final SubLSymbol $sym15$ISA_PREDICATE_ = makeSymbol("ISA-PREDICATE?");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLObject $$SententialRelation = reader_make_constant_shell(makeString("SententialRelation"));

    private static final SubLObject $$AntiSymmetricBinaryPredicate = reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate"));

    private static final SubLObject $$AntiTransitiveBinaryPredicate = reader_make_constant_shell(makeString("AntiTransitiveBinaryPredicate"));

    private static final SubLObject $$ArgTypeBinaryPredicate = reader_make_constant_shell(makeString("ArgTypeBinaryPredicate"));

    private static final SubLObject $$ArgQuotedIsaBinaryPredicate = reader_make_constant_shell(makeString("ArgQuotedIsaBinaryPredicate"));

    private static final SubLObject $$ArgFormatBinaryPredicate = reader_make_constant_shell(makeString("ArgFormatBinaryPredicate"));

    private static final SubLObject $$ArgTypeTernaryPredicate = reader_make_constant_shell(makeString("ArgTypeTernaryPredicate"));

    private static final SubLObject $$ArgQuotedIsaTernaryPredicate = reader_make_constant_shell(makeString("ArgQuotedIsaTernaryPredicate"));

    private static final SubLObject $$ArgFormatTernaryPredicate = reader_make_constant_shell(makeString("ArgFormatTernaryPredicate"));

    private static final SubLObject $$AsymmetricBinaryPredicate = reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));

    private static final SubLObject $$BookkeepingPredicate = reader_make_constant_shell(makeString("BookkeepingPredicate"));

    private static final SubLObject $$UnderspecifiedPredicate = reader_make_constant_shell(makeString("UnderspecifiedPredicate"));

    private static final SubLObject $$BroadMicrotheory = reader_make_constant_shell(makeString("BroadMicrotheory"));

    private static final SubLSymbol $sym30$COMMUTATIVE_RELATION_ = makeSymbol("COMMUTATIVE-RELATION?");

    private static final SubLList $list31 = list(makeSymbol("RELATION"));

    private static final SubLString $str32$Return_T_iff_RELATION_is_a_commut = makeString("Return T iff RELATION is a commutative relation.");

    private static final SubLList $list33 = list(makeSymbol("BOOLEANP"));

    private static final SubLObject $$CommutativeRelation = reader_make_constant_shell(makeString("CommutativeRelation"));

    private static final SubLObject $$CommutativePredicate = reader_make_constant_shell(makeString("CommutativePredicate"));

    private static final SubLObject $const36$DistributingMetaKnowledgePredicat = reader_make_constant_shell(makeString("DistributingMetaKnowledgePredicate"));

    private static final SubLObject $$ELRelation = reader_make_constant_shell(makeString("ELRelation"));

    private static final SubLObject $$EvaluatableFunction = reader_make_constant_shell(makeString("EvaluatableFunction"));

    private static final SubLObject $$EvaluatablePredicate = reader_make_constant_shell(makeString("EvaluatablePredicate"));

    private static final SubLObject $$ExistentialQuantifier = reader_make_constant_shell(makeString("ExistentialQuantifier"));

    private static final SubLObject $$IrreflexiveBinaryPredicate = reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));

    private static final SubLObject $$LogicalConnective = reader_make_constant_shell(makeString("LogicalConnective"));

    private static final SubLObject $$MicrotheoryDesignatingRelation = reader_make_constant_shell(makeString("MicrotheoryDesignatingRelation"));

    private static final SubLObject $$PartiallyCommutativeRelation = reader_make_constant_shell(makeString("PartiallyCommutativeRelation"));

    private static final SubLObject $$PartiallyCommutativePredicate = reader_make_constant_shell(makeString("PartiallyCommutativePredicate"));

    private static final SubLObject $$ProblemSolvingCntxt = reader_make_constant_shell(makeString("ProblemSolvingCntxt"));

    private static final SubLObject $$Quantifier = reader_make_constant_shell(makeString("Quantifier"));

    private static final SubLObject $$ReflexiveBinaryPredicate = reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));

    private static final SubLObject $$ReifiableFunction = reader_make_constant_shell(makeString("ReifiableFunction"));

    private static final SubLObject $$RuleMacroPredicate = reader_make_constant_shell(makeString("RuleMacroPredicate"));

    private static final SubLObject $$ScopingRelation = reader_make_constant_shell(makeString("ScopingRelation"));

    private static final SubLObject $$SiblingDisjointCollectionType = reader_make_constant_shell(makeString("SiblingDisjointCollectionType"));

    private static final SubLObject $$DisjointCollectionType = reader_make_constant_shell(makeString("DisjointCollectionType"));

    private static final SubLObject $$SkolemFunction = reader_make_constant_shell(makeString("SkolemFunction"));

    private static final SubLObject $$SymmetricBinaryPredicate = reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));

    private static final SubLObject $$TransitiveBinaryPredicate = reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    private static final SubLObject $$VariableArityRelation = reader_make_constant_shell(makeString("VariableArityRelation"));

    private static final SubLObject $$DocumentationPredicate = reader_make_constant_shell(makeString("DocumentationPredicate"));

    private static final SubLObject $$SKSIContentMicrotheory = reader_make_constant_shell(makeString("SKSIContentMicrotheory"));

    private static final SubLObject $$SKSIExternalTermDenotingFunction = reader_make_constant_shell(makeString("SKSIExternalTermDenotingFunction"));

    private static final SubLObject $$SKSISupportedComparisonPredicate = reader_make_constant_shell(makeString("SKSISupportedComparisonPredicate"));

    private static final SubLObject $$SKSISupportedFunction = reader_make_constant_shell(makeString("SKSISupportedFunction"));

    private static final SubLObject $$CSQLComparisonPredicate = reader_make_constant_shell(makeString("CSQLComparisonPredicate"));

    private static final SubLObject $$SKSISupportedConstant = reader_make_constant_shell(makeString("SKSISupportedConstant"));

    private static final SubLObject $$CSQLFunction = reader_make_constant_shell(makeString("CSQLFunction"));

    private static final SubLObject $$CSQLLogicalConnective = reader_make_constant_shell(makeString("CSQLLogicalConnective"));

    private static final SubLObject $$CSQLQuantifier = reader_make_constant_shell(makeString("CSQLQuantifier"));

    private static final SubLObject $$CSQLConstantFunction = reader_make_constant_shell(makeString("CSQLConstantFunction"));

    private static final SubLObject $$NLDefinitenessAttribute = reader_make_constant_shell(makeString("NLDefinitenessAttribute"));

    private static final SubLObject $$NLQuantAttribute = reader_make_constant_shell(makeString("NLQuantAttribute"));

    private static final SubLObject $$ExistentialQuantifier_Bounded = reader_make_constant_shell(makeString("ExistentialQuantifier-Bounded"));

    private static final SubLObject $const72$EvaluatableRelation_Contextualize = reader_make_constant_shell(makeString("EvaluatableRelation-Contextualized"));

    private static final SubLObject $$PublicConstant = reader_make_constant_shell(makeString("PublicConstant"));

    private static final SubLSymbol $sym74$PROPRIETARY_CONSTANT_ = makeSymbol("PROPRIETARY-CONSTANT?");

    private static final SubLObject $$ProprietaryConstant = reader_make_constant_shell(makeString("ProprietaryConstant"));

    private static final SubLSymbol $sym76$_PROPRIETARY_CONSTANT__CACHING_STATE_ = makeSymbol("*PROPRIETARY-CONSTANT?-CACHING-STATE*");

    private static final SubLSymbol $sym77$CLEAR_PROPRIETARY_CONSTANT_ = makeSymbol("CLEAR-PROPRIETARY-CONSTANT?");

    private static final SubLSymbol $sym78$PROPRIETARY_TERM_ = makeSymbol("PROPRIETARY-TERM?");

    private static final SubLObject $$ProprietaryTerm = reader_make_constant_shell(makeString("ProprietaryTerm"));

    private static final SubLSymbol $sym80$_PROPRIETARY_TERM__CACHING_STATE_ = makeSymbol("*PROPRIETARY-TERM?-CACHING-STATE*");

    private static final SubLSymbol $sym81$CLEAR_PROPRIETARY_TERM_ = makeSymbol("CLEAR-PROPRIETARY-TERM?");

    private static final SubLObject $$ObsoleteConstant = reader_make_constant_shell(makeString("ObsoleteConstant"));

    private static final SubLSymbol $sym83$CITY_IN_ANY_MT_ = makeSymbol("CITY-IN-ANY-MT?");

    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLSymbol $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_ = makeSymbol("GEOGRAPHICAL-REGION-IN-ANY-MT?");

    private static final SubLObject $$GeographicalRegion = reader_make_constant_shell(makeString("GeographicalRegion"));

    private static final SubLSymbol $sym87$COUNTRY_IN_ANY_MT_ = makeSymbol("COUNTRY-IN-ANY-MT?");

    private static final SubLObject $$Country = reader_make_constant_shell(makeString("Country"));

    public static SubLObject fort_types(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return sbhl_cache.sbhl_cached_relations_for_node($$isa, fort, mt);
    }

    public static SubLObject fort_has_typeP(final SubLObject fort, final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != forts.fort_p(fort)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
            final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                result = sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), fort, type, mt, UNPROVIDED);
            } finally {
                sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_5, thread);
                sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject fort_has_cached_typeP(final SubLObject fort, final SubLObject type) {
        return NIL != sbhl_paranoia.check_sbhl_cachesP() ? sbhl_cache.sbhl_cached_predicate_relation_p($$isa, fort, type, UNPROVIDED) : fort_has_typeP(fort, type, UNPROVIDED);
    }

    public static SubLObject fort_has_type_in_any_mtP(final SubLObject fort, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = fort_has_typeP(fort, type, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject definitional_fort_type(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return select_definitional_type(fort_types(fort, mt));
    }

    public static SubLObject select_definitional_type(final SubLObject types) {
        if (NIL != subl_promotions.memberP($$Collection, types, UNPROVIDED, UNPROVIDED)) {
            return $$Collection;
        }
        if (NIL != subl_promotions.memberP($$Function_Denotational, types, UNPROVIDED, UNPROVIDED)) {
            return $$Function_Denotational;
        }
        if (NIL != subl_promotions.memberP($$Predicate, types, UNPROVIDED, UNPROVIDED)) {
            return $$Predicate;
        }
        if (NIL != subl_promotions.memberP($$Microtheory, types, UNPROVIDED, UNPROVIDED)) {
            return $$Microtheory;
        }
        if (NIL == types) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject all_forts_of_type(final SubLObject type) {
        return sbhl_cache.sbhl_all_subnodes_for_cached_node($$isa, type);
    }

    public static SubLObject genericP(final SubLObject fort) {
        return makeBoolean((((NIL == collectionP(fort)) && (NIL == predicateP(fort))) && (NIL == mtP(fort))) && (NIL == functionP(fort)));
    }

    public static SubLObject collection_in_any_mtP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = fort_has_typeP(fort, $$Collection, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject collectionP(final SubLObject fort) {
        return collection_in_any_mtP(fort);
    }

    public static SubLObject collection_p(final SubLObject fort) {
        return collection_in_any_mtP(fort);
    }

    public static SubLObject collection_order(final SubLObject v_term) {
        if (NIL != narts_high.naut_p(v_term)) {
            return collection_order(genls.naut_genls(v_term, UNPROVIDED).first());
        }
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        if (NIL == collection_in_any_mtP(v_term)) {
            return ZERO_INTEGER;
        }
        if (NIL != isa.isa_in_any_mtP(v_term, $$FirstOrderCollection)) {
            return ONE_INTEGER;
        }
        if (NIL != isa.isa_in_any_mtP(v_term, $$SecondOrderCollection)) {
            return TWO_INTEGER;
        }
        if (NIL != isa.isa_in_any_mtP(v_term, $$ThirdOrderCollection)) {
            return THREE_INTEGER;
        }
        if (NIL != isa.isa_in_any_mtP(v_term, $$FourthOrderCollection)) {
            return FOUR_INTEGER;
        }
        return $MULTIORDINAL;
    }

    public static SubLObject random_collection() {
        SubLObject collection;
        for (collection = NIL; NIL == collection_p(collection); collection = forts.random_fort(UNPROVIDED)) {
        }
        return collection;
    }

    public static SubLObject list_of_collections_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(COLLECTION_P, v_object);
    }

    public static SubLObject isa_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return collectionP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Collection, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Collection, v_term, mt)));
    }

    public static SubLObject isa_collection_in_any_mtP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return collectionP(v_term);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = makeBoolean((NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Collection, v_term, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject predicate_in_any_mtP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = fort_has_typeP(fort, $$Predicate, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject predicateP(final SubLObject fort) {
        return predicate_in_any_mtP(fort);
    }

    public static SubLObject predicate_p(final SubLObject fort) {
        return predicate_in_any_mtP(fort);
    }

    public static SubLObject list_of_predicates_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(PREDICATE_P, v_object);
    }

    public static SubLObject isa_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return predicateP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Predicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Predicate, v_term, mt)));
    }

    public static SubLObject list_of_predicatesP(final SubLObject v_object) {
        return list_utilities.list_of_type_p($sym15$ISA_PREDICATE_, v_object);
    }

    public static SubLObject fixed_arity_predicate_p(final SubLObject fort) {
        return makeBoolean((NIL != predicate_p(fort)) && (NIL == variable_arity_relation_p(fort)));
    }

    public static SubLObject variable_arity_predicate_p(final SubLObject fort) {
        return makeBoolean((NIL != predicate_p(fort)) && (NIL != variable_arity_relation_p(fort)));
    }

    public static SubLObject function_in_any_mtP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = fort_has_typeP(fort, $$Function_Denotational, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject functorP(final SubLObject fort) {
        return non_predicate_functionP(fort);
    }

    public static SubLObject functor_p(final SubLObject fort) {
        return function_in_any_mtP(fort);
    }

    public static SubLObject non_predicate_functionP(final SubLObject fort) {
        return function_in_any_mtP(fort);
    }

    public static SubLObject functionP(final SubLObject fort) {
        return non_predicate_functionP(fort);
    }

    public static SubLObject isa_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return functionP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Function_Denotational, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Function_Denotational, v_term, mt)));
    }

    public static SubLObject fixed_arity_functor_p(final SubLObject fort) {
        return makeBoolean((NIL != functor_p(fort)) && (NIL == variable_arity_relation_p(fort)));
    }

    public static SubLObject variable_arity_functor_p(final SubLObject fort) {
        return makeBoolean((NIL != functor_p(fort)) && (NIL != variable_arity_relation_p(fort)));
    }

    public static SubLObject mt_in_any_mtP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mtP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            mtP = fort_has_typeP(fort, $$Microtheory, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mtP;
    }

    public static SubLObject mtP(final SubLObject fort) {
        return mt_in_any_mtP(fort);
    }

    public static SubLObject microtheory_p(final SubLObject fort) {
        return mt_in_any_mtP(fort);
    }

    public static SubLObject isa_mtP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return mtP(v_term);
        }
        if (NIL != hlmt.hlmt_naut_p(v_term)) {
            return hlmt.hlmtP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Microtheory, UNPROVIDED, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Microtheory, v_term, UNPROVIDED)));
    }

    public static SubLObject random_mt() {
        SubLObject mt;
        for (mt = NIL; NIL == microtheory_p(mt); mt = forts.random_fort(UNPROVIDED)) {
        }
        return mt;
    }

    public static SubLObject relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$Relation);
    }

    public static SubLObject isa_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Relation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Relation, v_term, mt)));
    }

    public static SubLObject sentential_relation_p(final SubLObject fort) {
        return makeBoolean((NIL != logical_connective_p(fort)) || (NIL != quantifier_p(fort)));
    }

    public static SubLObject isa_sentential_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return sentential_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SententialRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SententialRelation, v_term, mt)));
    }

    public static SubLObject anti_symmetric_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$AntiSymmetricBinaryPredicate);
    }

    public static SubLObject isa_anti_symmetric_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return anti_symmetric_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$AntiSymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AntiSymmetricBinaryPredicate, v_term, mt)));
    }

    public static SubLObject anti_transitive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$AntiTransitiveBinaryPredicate);
    }

    public static SubLObject isa_anti_transitive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return anti_transitive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$AntiTransitiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AntiTransitiveBinaryPredicate, v_term, mt)));
    }

    public static SubLObject arg_type_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ArgTypeBinaryPredicate);
    }

    public static SubLObject isa_arg_type_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return arg_type_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgTypeBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgTypeBinaryPredicate, v_term, mt)));
    }

    public static SubLObject isa_arg_quoted_isa_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgQuotedIsaBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgQuotedIsaBinaryPredicate, v_term, mt)));
    }

    public static SubLObject isa_arg_format_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgFormatBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgFormatBinaryPredicate, v_term, mt)));
    }

    public static SubLObject arg_type_ternary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ArgTypeTernaryPredicate);
    }

    public static SubLObject isa_arg_type_ternary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return arg_type_ternary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgTypeTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgTypeTernaryPredicate, v_term, mt)));
    }

    public static SubLObject isa_arg_quoted_isa_ternary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgQuotedIsaTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgQuotedIsaTernaryPredicate, v_term, mt)));
    }

    public static SubLObject isa_arg_format_ternary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgFormatTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgFormatTernaryPredicate, v_term, mt)));
    }

    public static SubLObject asymmetric_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$AsymmetricBinaryPredicate);
    }

    public static SubLObject isa_asymmetric_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return asymmetric_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$AsymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AsymmetricBinaryPredicate, v_term, mt)));
    }

    public static SubLObject bookkeeping_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$BookkeepingPredicate);
    }

    public static SubLObject isa_bookkeeping_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return bookkeeping_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$BookkeepingPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$BookkeepingPredicate, v_term, mt)));
    }

    public static SubLObject underspecified_predicate_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$UnderspecifiedPredicate, mt);
    }

    public static SubLObject isa_underspecified_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return underspecified_predicate_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$UnderspecifiedPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$UnderspecifiedPredicate, v_term, mt)));
    }

    public static SubLObject broad_microtheory_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$BroadMicrotheory);
    }

    public static SubLObject isa_broad_microtheoryP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return broad_microtheory_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$BroadMicrotheory, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$BroadMicrotheory, v_term, mt)));
    }

    public static SubLObject commutative_relationP(final SubLObject relation) {
        return commutative_relation_p(relation);
    }

    public static SubLObject commutative_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$CommutativeRelation);
    }

    public static SubLObject isa_commutative_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return commutative_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$CommutativeRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$CommutativeRelation, v_term, mt)));
    }

    public static SubLObject commutative_predicate_p(final SubLObject fort) {
        return makeBoolean((NIL != commutative_relation_p(fort)) && (NIL != predicate_p(fort)));
    }

    public static SubLObject isa_commutative_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return commutative_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$CommutativePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$CommutativePredicate, v_term, mt)));
    }

    public static SubLObject distributing_meta_knowledge_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $const36$DistributingMetaKnowledgePredicat);
    }

    public static SubLObject isa_distributing_meta_knowledge_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return distributing_meta_knowledge_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $const36$DistributingMetaKnowledgePredicat, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($const36$DistributingMetaKnowledgePredicat, v_term, mt)));
    }

    public static SubLObject forts_typed_distributing_meta_knowledge_predicate() {
        return all_forts_of_type($const36$DistributingMetaKnowledgePredicat);
    }

    public static SubLObject el_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ELRelation);
    }

    public static SubLObject isa_el_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return el_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ELRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ELRelation, v_term, mt)));
    }

    public static SubLObject evaluatable_function_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$EvaluatableFunction);
    }

    public static SubLObject isa_evaluatable_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return evaluatable_function_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$EvaluatableFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$EvaluatableFunction, v_term, mt)));
    }

    public static SubLObject evaluatable_predicate_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$EvaluatablePredicate, mt);
    }

    public static SubLObject isa_evaluatable_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return evaluatable_predicate_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$EvaluatablePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$EvaluatablePredicate, v_term, mt)));
    }

    public static SubLObject existential_quantifier_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ExistentialQuantifier);
    }

    public static SubLObject isa_existential_quantifierP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return existential_quantifier_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ExistentialQuantifier, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ExistentialQuantifier, v_term, mt)));
    }

    public static SubLObject irreflexive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$IrreflexiveBinaryPredicate);
    }

    public static SubLObject isa_irreflexive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return irreflexive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$IrreflexiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$IrreflexiveBinaryPredicate, v_term, mt)));
    }

    public static SubLObject logical_connective_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$LogicalConnective);
    }

    public static SubLObject isa_logical_connectiveP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return logical_connective_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$LogicalConnective, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$LogicalConnective, v_term, mt)));
    }

    public static SubLObject microtheory_designating_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$MicrotheoryDesignatingRelation);
    }

    public static SubLObject isa_microtheory_designating_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return microtheory_designating_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$MicrotheoryDesignatingRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$MicrotheoryDesignatingRelation, v_term, mt)));
    }

    public static SubLObject partially_commutative_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$PartiallyCommutativeRelation);
    }

    public static SubLObject isa_partially_commutative_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return partially_commutative_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$PartiallyCommutativeRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$PartiallyCommutativeRelation, v_term, mt)));
    }

    public static SubLObject partially_commutative_predicate_p(final SubLObject fort) {
        return isa.isaP(fort, $$PartiallyCommutativePredicate, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject isa_partially_commutative_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return partially_commutative_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$PartiallyCommutativePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$PartiallyCommutativePredicate, v_term, mt)));
    }

    public static SubLObject problem_solving_context_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ProblemSolvingCntxt);
    }

    public static SubLObject isa_problem_solving_contextP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return problem_solving_context_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ProblemSolvingCntxt, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ProblemSolvingCntxt, v_term, mt)));
    }

    public static SubLObject quantifier_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$Quantifier);
    }

    public static SubLObject isa_quantifierP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return quantifier_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Quantifier, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Quantifier, v_term, mt)));
    }

    public static SubLObject reflexive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ReflexiveBinaryPredicate);
    }

    public static SubLObject isa_reflexive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return reflexive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ReflexiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ReflexiveBinaryPredicate, v_term, mt)));
    }

    public static SubLObject reifiable_function_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ReifiableFunction);
    }

    public static SubLObject isa_reifiable_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return reifiable_function_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ReifiableFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ReifiableFunction, v_term, mt)));
    }

    public static SubLObject rule_macro_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$RuleMacroPredicate);
    }

    public static SubLObject isa_rule_macro_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return rule_macro_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$RuleMacroPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$RuleMacroPredicate, v_term, mt)));
    }

    public static SubLObject scoping_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ScopingRelation);
    }

    public static SubLObject isa_scoping_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return scoping_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ScopingRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ScopingRelation, v_term, mt)));
    }

    public static SubLObject sibling_disjoint_collection_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$SiblingDisjointCollectionType);
    }

    public static SubLObject isa_sibling_disjoint_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return sibling_disjoint_collection_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SiblingDisjointCollectionType, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SiblingDisjointCollectionType, v_term, mt)));
    }

    public static SubLObject forts_typed_sibling_disjoint_collection() {
        return all_forts_of_type($$SiblingDisjointCollectionType);
    }

    public static SubLObject disjoint_collection_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$DisjointCollectionType);
    }

    public static SubLObject skolem_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return at_defns.quiet_has_typeP(v_term, $$SkolemFunction, mt);
    }

    public static SubLObject skolem_function_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$SkolemFunction);
    }

    public static SubLObject skolem_fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != skolem_function_p(v_object)));
    }

    public static SubLObject isa_skolem_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return skolem_function_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SkolemFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SkolemFunction, v_term, mt)));
    }

    public static SubLObject symmetric_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$SymmetricBinaryPredicate);
    }

    public static SubLObject isa_symmetric_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return symmetric_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SymmetricBinaryPredicate, v_term, mt)));
    }

    public static SubLObject transitive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$TransitiveBinaryPredicate);
    }

    public static SubLObject isa_transitive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return transitive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$TransitiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$TransitiveBinaryPredicate, v_term, mt)));
    }

    public static SubLObject variable_arity_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$VariableArityRelation);
    }

    public static SubLObject isa_variable_arity_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return variable_arity_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$VariableArityRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$VariableArityRelation, v_term, mt)));
    }

    public static SubLObject documentation_predicate_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$DocumentationPredicate, mt);
    }

    public static SubLObject isa_documentation_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return documentation_predicate_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$DocumentationPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$DocumentationPredicate, v_term, mt)));
    }

    public static SubLObject sksi_content_microtheory_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$SKSIContentMicrotheory, mt);
    }

    public static SubLObject isa_sksi_content_microtheoryP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return sksi_content_microtheory_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SKSIContentMicrotheory, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SKSIContentMicrotheory, v_term, mt)));
    }

    public static SubLObject sksi_external_term_denoting_function_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$SKSIExternalTermDenotingFunction, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_sksi_external_term_denoting_functionP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return sksi_external_term_denoting_function_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$SKSIExternalTermDenotingFunction);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$SKSIExternalTermDenotingFunction, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject sksi_supported_comparison_predicate_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$SKSISupportedComparisonPredicate, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_sksi_supported_comparison_predicateP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return sksi_supported_comparison_predicate_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$SKSISupportedComparisonPredicate);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$SKSISupportedComparisonPredicate, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject sksi_supported_function_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$SKSISupportedFunction, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_sksi_supported_functionP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return sksi_supported_function_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$SKSISupportedFunction);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$SKSISupportedFunction, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject csql_comparison_predicate_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$CSQLComparisonPredicate, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_csql_comparison_predicateP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return csql_comparison_predicate_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$CSQLComparisonPredicate);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLComparisonPredicate, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject sksi_supported_constant_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$SKSISupportedConstant, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_sksi_supported_constantP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return sksi_supported_constant_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$SKSISupportedConstant);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$SKSISupportedConstant, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject csql_function_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$CSQLFunction, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_csql_functionP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return csql_function_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$CSQLFunction);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLFunction, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject csql_logical_connective_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$CSQLLogicalConnective, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_csql_logical_connectiveP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return csql_logical_connective_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$CSQLLogicalConnective);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLLogicalConnective, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject csql_quantifier_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$CSQLQuantifier, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_csql_quantifierP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return csql_quantifier_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$CSQLQuantifier);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLQuantifier, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject csql_constant_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(fort, $$CSQLConstantFunction, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject isa_csql_constantP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(v_term)) {
            return csql_constant_p(v_term);
        }
        SubLObject ans = isa.isa_in_any_mtP(v_term, $$CSQLConstantFunction);
        if (NIL != ans) {
            return ans;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLConstantFunction, v_term, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject nl_definiteness_attributeP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(v_object, $$NLDefinitenessAttribute, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject nl_quant_attributeP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(v_object, $$NLQuantAttribute, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject bounded_existential_quantifier_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = fort_has_typeP(v_object, $$ExistentialQuantifier_Bounded, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject evaluatable_relation_contextualized_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $const72$EvaluatableRelation_Contextualize);
    }

    public static SubLObject isa_evaluatable_relation_contextualizedP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return evaluatable_relation_contextualized_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $const72$EvaluatableRelation_Contextualize, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($const72$EvaluatableRelation_Contextualize, v_term, mt)));
    }

    public static SubLObject public_constantP(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$PublicConstant);
    }

    public static SubLObject non_public_constantP(final SubLObject fort) {
        return makeBoolean((NIL != constant_p(fort)) && (NIL == public_constantP(fort)));
    }

    public static SubLObject clear_proprietary_constantP() {
        final SubLObject cs = $proprietary_constantP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_proprietary_constantP(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($proprietary_constantP_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject proprietary_constantP_internal(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$ProprietaryConstant);
    }

    public static SubLObject proprietary_constantP(final SubLObject fort) {
        SubLObject caching_state = $proprietary_constantP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym74$PROPRIETARY_CONSTANT_, $sym76$_PROPRIETARY_CONSTANT__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_quoted_isa_dependent_cache_clear_callback($sym77$CLEAR_PROPRIETARY_CONSTANT_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(proprietary_constantP_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_proprietary_termP() {
        final SubLObject cs = $proprietary_termP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_proprietary_termP(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($proprietary_termP_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject proprietary_termP_internal(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$ProprietaryTerm);
    }

    public static SubLObject proprietary_termP(final SubLObject fort) {
        SubLObject caching_state = $proprietary_termP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym78$PROPRIETARY_TERM_, $sym80$_PROPRIETARY_TERM__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_quoted_isa_dependent_cache_clear_callback($sym81$CLEAR_PROPRIETARY_TERM_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(proprietary_termP_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject obsolete_constantP(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$ObsoleteConstant);
    }

    public static SubLObject city_in_any_mtP_internal(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa.isa_in_any_mtP(v_term, $$City)));
    }

    public static SubLObject city_in_any_mtP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return city_in_any_mtP_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym83$CITY_IN_ANY_MT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym83$CITY_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym83$CITY_IN_ANY_MT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(city_in_any_mtP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject geographical_region_in_any_mtP_internal(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa.isa_in_any_mtP(v_term, $$GeographicalRegion)));
    }

    public static SubLObject geographical_region_in_any_mtP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return geographical_region_in_any_mtP_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(geographical_region_in_any_mtP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject country_in_any_mtP_internal(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa.isa_in_any_mtP(v_term, $$Country)));
    }

    public static SubLObject country_in_any_mtP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return country_in_any_mtP_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym87$COUNTRY_IN_ANY_MT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym87$COUNTRY_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym87$COUNTRY_IN_ANY_MT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(country_in_any_mtP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_fort_types_interface_file() {
        declareFunction(me, "fort_types", "FORT-TYPES", 1, 1, false);
        declareFunction(me, "fort_has_typeP", "FORT-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "fort_has_cached_typeP", "FORT-HAS-CACHED-TYPE?", 2, 0, false);
        declareFunction(me, "fort_has_type_in_any_mtP", "FORT-HAS-TYPE-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "definitional_fort_type", "DEFINITIONAL-FORT-TYPE", 1, 1, false);
        declareFunction(me, "select_definitional_type", "SELECT-DEFINITIONAL-TYPE", 1, 0, false);
        declareFunction(me, "all_forts_of_type", "ALL-FORTS-OF-TYPE", 1, 0, false);
        declareFunction(me, "genericP", "GENERIC?", 1, 0, false);
        declareFunction(me, "collection_in_any_mtP", "COLLECTION-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "collectionP", "COLLECTION?", 1, 0, false);
        declareFunction(me, "collection_p", "COLLECTION-P", 1, 0, false);
        new fort_types_interface.$collection_p$UnaryFunction();
        declareFunction(me, "collection_order", "COLLECTION-ORDER", 1, 0, false);
        declareFunction(me, "random_collection", "RANDOM-COLLECTION", 0, 0, false);
        declareFunction(me, "list_of_collections_p", "LIST-OF-COLLECTIONS-P", 1, 0, false);
        declareFunction(me, "isa_collectionP", "ISA-COLLECTION?", 1, 1, false);
        declareFunction(me, "isa_collection_in_any_mtP", "ISA-COLLECTION-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "predicate_in_any_mtP", "PREDICATE-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "predicateP", "PREDICATE?", 1, 0, false);
        declareFunction(me, "predicate_p", "PREDICATE-P", 1, 0, false);
        new fort_types_interface.$predicate_p$UnaryFunction();
        declareFunction(me, "list_of_predicates_p", "LIST-OF-PREDICATES-P", 1, 0, false);
        declareFunction(me, "isa_predicateP", "ISA-PREDICATE?", 1, 1, false);
        declareFunction(me, "list_of_predicatesP", "LIST-OF-PREDICATES?", 1, 0, false);
        declareFunction(me, "fixed_arity_predicate_p", "FIXED-ARITY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "variable_arity_predicate_p", "VARIABLE-ARITY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "function_in_any_mtP", "FUNCTION-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "functorP", "FUNCTOR?", 1, 0, false);
        declareFunction(me, "functor_p", "FUNCTOR-P", 1, 0, false);
        declareFunction(me, "non_predicate_functionP", "NON-PREDICATE-FUNCTION?", 1, 0, false);
        declareFunction(me, "functionP", "FUNCTION?", 1, 0, false);
        declareFunction(me, "isa_functionP", "ISA-FUNCTION?", 1, 1, false);
        declareFunction(me, "fixed_arity_functor_p", "FIXED-ARITY-FUNCTOR-P", 1, 0, false);
        declareFunction(me, "variable_arity_functor_p", "VARIABLE-ARITY-FUNCTOR-P", 1, 0, false);
        declareFunction(me, "mt_in_any_mtP", "MT-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "mtP", "MT?", 1, 0, false);
        declareFunction(me, "microtheory_p", "MICROTHEORY-P", 1, 0, false);
        declareFunction(me, "isa_mtP", "ISA-MT?", 1, 1, false);
        declareFunction(me, "random_mt", "RANDOM-MT", 0, 0, false);
        declareFunction(me, "relation_p", "RELATION-P", 1, 0, false);
        declareFunction(me, "isa_relationP", "ISA-RELATION?", 1, 1, false);
        declareFunction(me, "sentential_relation_p", "SENTENTIAL-RELATION-P", 1, 0, false);
        declareFunction(me, "isa_sentential_relationP", "ISA-SENTENTIAL-RELATION?", 1, 1, false);
        declareFunction(me, "anti_symmetric_binary_predicate_p", "ANTI-SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_anti_symmetric_binary_predicateP", "ISA-ANTI-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "anti_transitive_binary_predicate_p", "ANTI-TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_anti_transitive_binary_predicateP", "ISA-ANTI-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "arg_type_binary_predicate_p", "ARG-TYPE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_arg_type_binary_predicateP", "ISA-ARG-TYPE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "isa_arg_quoted_isa_binary_predicateP", "ISA-ARG-QUOTED-ISA-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "isa_arg_format_binary_predicateP", "ISA-ARG-FORMAT-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "arg_type_ternary_predicate_p", "ARG-TYPE-TERNARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_arg_type_ternary_predicateP", "ISA-ARG-TYPE-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "isa_arg_quoted_isa_ternary_predicateP", "ISA-ARG-QUOTED-ISA-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "isa_arg_format_ternary_predicateP", "ISA-ARG-FORMAT-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "asymmetric_binary_predicate_p", "ASYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_asymmetric_binary_predicateP", "ISA-ASYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "bookkeeping_predicate_p", "BOOKKEEPING-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_bookkeeping_predicateP", "ISA-BOOKKEEPING-PREDICATE?", 1, 1, false);
        declareFunction(me, "underspecified_predicate_p", "UNDERSPECIFIED-PREDICATE-P", 1, 1, false);
        declareFunction(me, "isa_underspecified_predicateP", "ISA-UNDERSPECIFIED-PREDICATE?", 1, 1, false);
        declareFunction(me, "broad_microtheory_p", "BROAD-MICROTHEORY-P", 1, 0, false);
        declareFunction(me, "isa_broad_microtheoryP", "ISA-BROAD-MICROTHEORY?", 1, 1, false);
        declareFunction(me, "commutative_relationP", "COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction(me, "commutative_relation_p", "COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(me, "isa_commutative_relationP", "ISA-COMMUTATIVE-RELATION?", 1, 1, false);
        declareFunction(me, "commutative_predicate_p", "COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_commutative_predicateP", "ISA-COMMUTATIVE-PREDICATE?", 1, 1, false);
        declareFunction(me, "distributing_meta_knowledge_predicate_p", "DISTRIBUTING-META-KNOWLEDGE-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_distributing_meta_knowledge_predicateP", "ISA-DISTRIBUTING-META-KNOWLEDGE-PREDICATE?", 1, 1, false);
        declareFunction(me, "forts_typed_distributing_meta_knowledge_predicate", "FORTS-TYPED-DISTRIBUTING-META-KNOWLEDGE-PREDICATE", 0, 0, false);
        declareFunction(me, "el_relation_p", "EL-RELATION-P", 1, 0, false);
        declareFunction(me, "isa_el_relationP", "ISA-EL-RELATION?", 1, 1, false);
        declareFunction(me, "evaluatable_function_p", "EVALUATABLE-FUNCTION-P", 1, 0, false);
        declareFunction(me, "isa_evaluatable_functionP", "ISA-EVALUATABLE-FUNCTION?", 1, 1, false);
        declareFunction(me, "evaluatable_predicate_p", "EVALUATABLE-PREDICATE-P", 1, 1, false);
        declareFunction(me, "isa_evaluatable_predicateP", "ISA-EVALUATABLE-PREDICATE?", 1, 1, false);
        declareFunction(me, "existential_quantifier_p", "EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "isa_existential_quantifierP", "ISA-EXISTENTIAL-QUANTIFIER?", 1, 1, false);
        declareFunction(me, "irreflexive_binary_predicate_p", "IRREFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_irreflexive_binary_predicateP", "ISA-IRREFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "logical_connective_p", "LOGICAL-CONNECTIVE-P", 1, 0, false);
        declareFunction(me, "isa_logical_connectiveP", "ISA-LOGICAL-CONNECTIVE?", 1, 1, false);
        declareFunction(me, "microtheory_designating_relation_p", "MICROTHEORY-DESIGNATING-RELATION-P", 1, 0, false);
        declareFunction(me, "isa_microtheory_designating_relationP", "ISA-MICROTHEORY-DESIGNATING-RELATION?", 1, 1, false);
        declareFunction(me, "partially_commutative_relation_p", "PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(me, "isa_partially_commutative_relationP", "ISA-PARTIALLY-COMMUTATIVE-RELATION?", 1, 1, false);
        declareFunction(me, "partially_commutative_predicate_p", "PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_partially_commutative_predicateP", "ISA-PARTIALLY-COMMUTATIVE-PREDICATE?", 1, 1, false);
        declareFunction(me, "problem_solving_context_p", "PROBLEM-SOLVING-CONTEXT-P", 1, 0, false);
        declareFunction(me, "isa_problem_solving_contextP", "ISA-PROBLEM-SOLVING-CONTEXT?", 1, 1, false);
        declareFunction(me, "quantifier_p", "QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "isa_quantifierP", "ISA-QUANTIFIER?", 1, 1, false);
        declareFunction(me, "reflexive_binary_predicate_p", "REFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_reflexive_binary_predicateP", "ISA-REFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "reifiable_function_p", "REIFIABLE-FUNCTION-P", 1, 0, false);
        declareFunction(me, "isa_reifiable_functionP", "ISA-REIFIABLE-FUNCTION?", 1, 1, false);
        declareFunction(me, "rule_macro_predicate_p", "RULE-MACRO-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_rule_macro_predicateP", "ISA-RULE-MACRO-PREDICATE?", 1, 1, false);
        declareFunction(me, "scoping_relation_p", "SCOPING-RELATION-P", 1, 0, false);
        new fort_types_interface.$scoping_relation_p$UnaryFunction();
        declareFunction(me, "isa_scoping_relationP", "ISA-SCOPING-RELATION?", 1, 1, false);
        declareFunction(me, "sibling_disjoint_collection_p", "SIBLING-DISJOINT-COLLECTION-P", 1, 0, false);
        new fort_types_interface.$sibling_disjoint_collection_p$UnaryFunction();
        declareFunction(me, "isa_sibling_disjoint_collectionP", "ISA-SIBLING-DISJOINT-COLLECTION?", 1, 1, false);
        declareFunction(me, "forts_typed_sibling_disjoint_collection", "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION", 0, 0, false);
        declareFunction(me, "disjoint_collection_p", "DISJOINT-COLLECTION-P", 1, 0, false);
        declareFunction(me, "skolem_functionP", "SKOLEM-FUNCTION?", 1, 1, false);
        declareFunction(me, "skolem_function_p", "SKOLEM-FUNCTION-P", 1, 0, false);
        declareFunction(me, "skolem_fort_p", "SKOLEM-FORT-P", 1, 0, false);
        declareFunction(me, "isa_skolem_functionP", "ISA-SKOLEM-FUNCTION?", 1, 1, false);
        declareFunction(me, "symmetric_binary_predicate_p", "SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_symmetric_binary_predicateP", "ISA-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "transitive_binary_predicate_p", "TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_transitive_binary_predicateP", "ISA-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction(me, "variable_arity_relation_p", "VARIABLE-ARITY-RELATION-P", 1, 0, false);
        declareFunction(me, "isa_variable_arity_relationP", "ISA-VARIABLE-ARITY-RELATION?", 1, 1, false);
        declareFunction(me, "documentation_predicate_p", "DOCUMENTATION-PREDICATE-P", 1, 1, false);
        declareFunction(me, "isa_documentation_predicateP", "ISA-DOCUMENTATION-PREDICATE?", 1, 1, false);
        declareFunction(me, "sksi_content_microtheory_p", "SKSI-CONTENT-MICROTHEORY-P", 1, 1, false);
        declareFunction(me, "isa_sksi_content_microtheoryP", "ISA-SKSI-CONTENT-MICROTHEORY?", 1, 1, false);
        declareFunction(me, "sksi_external_term_denoting_function_p", "SKSI-EXTERNAL-TERM-DENOTING-FUNCTION-P", 1, 0, false);
        declareFunction(me, "isa_sksi_external_term_denoting_functionP", "ISA-SKSI-EXTERNAL-TERM-DENOTING-FUNCTION?", 1, 0, false);
        declareFunction(me, "sksi_supported_comparison_predicate_p", "SKSI-SUPPORTED-COMPARISON-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_sksi_supported_comparison_predicateP", "ISA-SKSI-SUPPORTED-COMPARISON-PREDICATE?", 1, 0, false);
        declareFunction(me, "sksi_supported_function_p", "SKSI-SUPPORTED-FUNCTION-P", 1, 0, false);
        declareFunction(me, "isa_sksi_supported_functionP", "ISA-SKSI-SUPPORTED-FUNCTION?", 1, 0, false);
        declareFunction(me, "csql_comparison_predicate_p", "CSQL-COMPARISON-PREDICATE-P", 1, 0, false);
        declareFunction(me, "isa_csql_comparison_predicateP", "ISA-CSQL-COMPARISON-PREDICATE?", 1, 0, false);
        declareFunction(me, "sksi_supported_constant_p", "SKSI-SUPPORTED-CONSTANT-P", 1, 0, false);
        declareFunction(me, "isa_sksi_supported_constantP", "ISA-SKSI-SUPPORTED-CONSTANT?", 1, 0, false);
        declareFunction(me, "csql_function_p", "CSQL-FUNCTION-P", 1, 0, false);
        declareFunction(me, "isa_csql_functionP", "ISA-CSQL-FUNCTION?", 1, 0, false);
        declareFunction(me, "csql_logical_connective_p", "CSQL-LOGICAL-CONNECTIVE-P", 1, 0, false);
        declareFunction(me, "isa_csql_logical_connectiveP", "ISA-CSQL-LOGICAL-CONNECTIVE?", 1, 0, false);
        declareFunction(me, "csql_quantifier_p", "CSQL-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "isa_csql_quantifierP", "ISA-CSQL-QUANTIFIER?", 1, 0, false);
        declareFunction(me, "csql_constant_p", "CSQL-CONSTANT-P", 1, 0, false);
        declareFunction(me, "isa_csql_constantP", "ISA-CSQL-CONSTANT?", 1, 0, false);
        declareFunction(me, "nl_definiteness_attributeP", "NL-DEFINITENESS-ATTRIBUTE?", 1, 0, false);
        declareFunction(me, "nl_quant_attributeP", "NL-QUANT-ATTRIBUTE?", 1, 0, false);
        declareFunction(me, "bounded_existential_quantifier_p", "BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "evaluatable_relation_contextualized_p", "EVALUATABLE-RELATION-CONTEXTUALIZED-P", 1, 0, false);
        declareFunction(me, "isa_evaluatable_relation_contextualizedP", "ISA-EVALUATABLE-RELATION-CONTEXTUALIZED?", 1, 1, false);
        declareFunction(me, "public_constantP", "PUBLIC-CONSTANT?", 1, 0, false);
        declareFunction(me, "non_public_constantP", "NON-PUBLIC-CONSTANT?", 1, 0, false);
        declareFunction(me, "clear_proprietary_constantP", "CLEAR-PROPRIETARY-CONSTANT?", 0, 0, false);
        declareFunction(me, "remove_proprietary_constantP", "REMOVE-PROPRIETARY-CONSTANT?", 1, 0, false);
        declareFunction(me, "proprietary_constantP_internal", "PROPRIETARY-CONSTANT?-INTERNAL", 1, 0, false);
        declareFunction(me, "proprietary_constantP", "PROPRIETARY-CONSTANT?", 1, 0, false);
        declareFunction(me, "clear_proprietary_termP", "CLEAR-PROPRIETARY-TERM?", 0, 0, false);
        declareFunction(me, "remove_proprietary_termP", "REMOVE-PROPRIETARY-TERM?", 1, 0, false);
        declareFunction(me, "proprietary_termP_internal", "PROPRIETARY-TERM?-INTERNAL", 1, 0, false);
        declareFunction(me, "proprietary_termP", "PROPRIETARY-TERM?", 1, 0, false);
        declareFunction(me, "obsolete_constantP", "OBSOLETE-CONSTANT?", 1, 0, false);
        declareFunction(me, "city_in_any_mtP_internal", "CITY-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction(me, "city_in_any_mtP", "CITY-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "geographical_region_in_any_mtP_internal", "GEOGRAPHICAL-REGION-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction(me, "geographical_region_in_any_mtP", "GEOGRAPHICAL-REGION-IN-ANY-MT?", 1, 0, false);
        declareFunction(me, "country_in_any_mtP_internal", "COUNTRY-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction(me, "country_in_any_mtP", "COUNTRY-IN-ANY-MT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_fort_types_interface_file() {
        deflexical("*PROPRIETARY-CONSTANT?-CACHING-STATE*", NIL);
        deflexical("*PROPRIETARY-TERM?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_fort_types_interface_file() {
        register_cyc_api_function($sym30$COMMUTATIVE_RELATION_, $list31, $str32$Return_T_iff_RELATION_is_a_commut, NIL, $list33);
        memoization_state.note_globally_cached_function($sym74$PROPRIETARY_CONSTANT_);
        memoization_state.note_globally_cached_function($sym78$PROPRIETARY_TERM_);
        memoization_state.note_memoized_function($sym83$CITY_IN_ANY_MT_);
        memoization_state.note_memoized_function($sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_);
        memoization_state.note_memoized_function($sym87$COUNTRY_IN_ANY_MT_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_fort_types_interface_file();
    }

    @Override
    public void initializeVariables() {
        init_fort_types_interface_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_fort_types_interface_file();
    }

    static {




























































































    }

    public static final class $collection_p$UnaryFunction extends UnaryFunction {
        public $collection_p$UnaryFunction() {
            super(extractFunctionNamed("COLLECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return collection_p(arg1);
        }
    }

    public static final class $predicate_p$UnaryFunction extends UnaryFunction {
        public $predicate_p$UnaryFunction() {
            super(extractFunctionNamed("PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return predicate_p(arg1);
        }
    }

    public static final class $scoping_relation_p$UnaryFunction extends UnaryFunction {
        public $scoping_relation_p$UnaryFunction() {
            super(extractFunctionNamed("SCOPING-RELATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return scoping_relation_p(arg1);
        }
    }

    public static final class $sibling_disjoint_collection_p$UnaryFunction extends UnaryFunction {
        public $sibling_disjoint_collection_p$UnaryFunction() {
            super(extractFunctionNamed("SIBLING-DISJOINT-COLLECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sibling_disjoint_collection_p(arg1);
        }
    }
}

/**
 * Total time: 450 ms
 */
