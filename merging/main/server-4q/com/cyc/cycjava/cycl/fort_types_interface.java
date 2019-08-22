/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.isa.isa_in_any_mtP;
import static com.cyc.cycjava.cycl.isa.quoted_isa_in_any_mtP;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FORT-TYPES-INTERFACE
 * source file: /cyc/top/cycl/fort-types-interface.lisp
 * created:     2019/07/03 17:37:28
 */
public final class fort_types_interface extends SubLTranslatedFile implements V12 {
    public static final SubLObject print_code_for_new_fort_type(SubLObject type) {
        format(T, $str_alt11$_a, com.cyc.cycjava.cycl.fort_types_interface.generate_code_for_new_fort_type(type));
        return type;
    }

    public static final SubLObject generate_code_for_new_fort_type(SubLObject type) {
        {
            SubLObject strings = string_utilities.relevant_substrings(constants_high.constant_name(type));
            SubLObject name = string_utilities.bunge(strings, CHAR_space);
            SubLObject subl_name = string_utilities.bunge(strings, CHAR_hyphen);
            return format(NIL, $str_alt12$______as___define_public__a_p__fo, new SubLObject[]{ name, subl_name, name, type, subl_name, name, subl_name, type, type, subl_name, name, type });
        }
    }

    public static final SubLFile me = new fort_types_interface();

 public static final String myName = "com.cyc.cycjava.cycl.fort_types_interface";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $proprietary_constantP_caching_state$ = makeSymbol("*PROPRIETARY-CONSTANT?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $proprietary_termP_caching_state$ = makeSymbol("*PROPRIETARY-TERM?-CACHING-STATE*");







    private static final SubLObject $$Function_Denotational = reader_make_constant_shell("Function-Denotational");













    private static final SubLSymbol $sym15$ISA_PREDICATE_ = makeSymbol("ISA-PREDICATE?");





























    private static final SubLSymbol $sym30$COMMUTATIVE_RELATION_ = makeSymbol("COMMUTATIVE-RELATION?");

    private static final SubLList $list31 = list(makeSymbol("RELATION"));

    private static final SubLString $str32$Return_T_iff_RELATION_is_a_commut = makeString("Return T iff RELATION is a commutative relation.");

    private static final SubLList $list33 = list(makeSymbol("BOOLEANP"));





    private static final SubLObject $const36$DistributingMetaKnowledgePredicat = reader_make_constant_shell("DistributingMetaKnowledgePredicate");





































































    private static final SubLObject $$ExistentialQuantifier_Bounded = reader_make_constant_shell("ExistentialQuantifier-Bounded");

    private static final SubLObject $const72$EvaluatableRelation_Contextualize = reader_make_constant_shell("EvaluatableRelation-Contextualized");



    private static final SubLSymbol $sym74$PROPRIETARY_CONSTANT_ = makeSymbol("PROPRIETARY-CONSTANT?");



    private static final SubLSymbol $sym76$_PROPRIETARY_CONSTANT__CACHING_STATE_ = makeSymbol("*PROPRIETARY-CONSTANT?-CACHING-STATE*");

    private static final SubLSymbol $sym77$CLEAR_PROPRIETARY_CONSTANT_ = makeSymbol("CLEAR-PROPRIETARY-CONSTANT?");

    private static final SubLSymbol $sym78$PROPRIETARY_TERM_ = makeSymbol("PROPRIETARY-TERM?");



    private static final SubLSymbol $sym80$_PROPRIETARY_TERM__CACHING_STATE_ = makeSymbol("*PROPRIETARY-TERM?-CACHING-STATE*");

    private static final SubLSymbol $sym81$CLEAR_PROPRIETARY_TERM_ = makeSymbol("CLEAR-PROPRIETARY-TERM?");



    private static final SubLSymbol $sym83$CITY_IN_ANY_MT_ = makeSymbol("CITY-IN-ANY-MT?");



    private static final SubLSymbol $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_ = makeSymbol("GEOGRAPHICAL-REGION-IN-ANY-MT?");



    private static final SubLSymbol $sym87$COUNTRY_IN_ANY_MT_ = makeSymbol("COUNTRY-IN-ANY-MT?");



    // Definitions
    /**
     * Accessor. @return listp; the cached types, s.t. (#$isa FORT TYPE):MT.
     */
    @LispMethod(comment = "Accessor. @return listp; the cached types, s.t. (#$isa FORT TYPE):MT.")
    public static final SubLObject fort_types_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return sbhl_cache.sbhl_cached_relations_for_node($$isa, fort, mt);
    }

    // Definitions
    /**
     * Accessor. @return listp; the cached types, s.t. (#$isa FORT TYPE):MT.
     */
    @LispMethod(comment = "Accessor. @return listp; the cached types, s.t. (#$isa FORT TYPE):MT.")
    public static SubLObject fort_types(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return sbhl_cache.sbhl_cached_relations_for_node($$isa, fort, mt);
    }

    /**
     * Accessor.  @return booleanp; Whether the (#$isa FORT TYPE):MT relation cached?
     */
    @LispMethod(comment = "Accessor.  @return booleanp; Whether the (#$isa FORT TYPE):MT relation cached?")
    public static final SubLObject fort_has_typeP_alt(SubLObject fort, SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != forts.fort_p(fort)) {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                            SubLObject _prev_bind_5 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                                result = sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$isa), fort, type, mt, UNPROVIDED);
                            } finally {
                                sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Accessor.  @return booleanp; Whether the (#$isa FORT TYPE):MT relation cached?
     */
    @LispMethod(comment = "Accessor.  @return booleanp; Whether the (#$isa FORT TYPE):MT relation cached?")
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

    public static final SubLObject fort_has_type_in_any_mtP_alt(SubLObject fort, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, type, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    /**
     * Accessor. returns the definitional fort type collection for FORT within MT, if any.
     */
    @LispMethod(comment = "Accessor. returns the definitional fort type collection for FORT within MT, if any.")
    public static final SubLObject definitional_fort_type_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        return com.cyc.cycjava.cycl.fort_types_interface.select_definitional_type(com.cyc.cycjava.cycl.fort_types_interface.fort_types(fort, mt));
    }

    /**
     * Accessor. returns the definitional fort type collection for FORT within MT, if any.
     */
    @LispMethod(comment = "Accessor. returns the definitional fort type collection for FORT within MT, if any.")
    public static SubLObject definitional_fort_type(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return select_definitional_type(fort_types(fort, mt));
    }

    /**
     * Accessor. implements a priority among definitional fort types
     */
    @LispMethod(comment = "Accessor. implements a priority among definitional fort types")
    public static final SubLObject select_definitional_type_alt(SubLObject types) {
        if (NIL != subl_promotions.memberP($$Collection, types, UNPROVIDED, UNPROVIDED)) {
            return $$Collection;
        } else {
            if (NIL != subl_promotions.memberP($$Function_Denotational, types, UNPROVIDED, UNPROVIDED)) {
                return $$Function_Denotational;
            } else {
                if (NIL != subl_promotions.memberP($$Predicate, types, UNPROVIDED, UNPROVIDED)) {
                    return $$Predicate;
                } else {
                    if (NIL != subl_promotions.memberP($$Microtheory, types, UNPROVIDED, UNPROVIDED)) {
                        return $$Microtheory;
                    } else {
                        if (NIL == types) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Accessor. implements a priority among definitional fort types
     */
    @LispMethod(comment = "Accessor. implements a priority among definitional fort types")
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

    public static final SubLObject all_forts_of_type_alt(SubLObject type) {
        return sbhl_cache.sbhl_all_subnodes_for_cached_node($$isa, type);
    }

    public static SubLObject all_forts_of_type(final SubLObject type) {
        return sbhl_cache.sbhl_all_subnodes_for_cached_node($$isa, type);
    }

    /**
     * is FORT not typed as any definitional type; @see *fort-definitional-types*.
     */
    @LispMethod(comment = "is FORT not typed as any definitional type; @see *fort-definitional-types*.")
    public static final SubLObject genericP_alt(SubLObject fort) {
        return makeBoolean((((NIL == com.cyc.cycjava.cycl.fort_types_interface.collectionP(fort)) && (NIL == com.cyc.cycjava.cycl.fort_types_interface.predicateP(fort))) && (NIL == com.cyc.cycjava.cycl.fort_types_interface.mtP(fort))) && (NIL == com.cyc.cycjava.cycl.fort_types_interface.functionP(fort)));
    }

    /**
     * is FORT not typed as any definitional type; @see *fort-definitional-types*.
     */
    @LispMethod(comment = "is FORT not typed as any definitional type; @see *fort-definitional-types*.")
    public static SubLObject genericP(final SubLObject fort) {
        return makeBoolean((((NIL == collectionP(fort)) && (NIL == predicateP(fort))) && (NIL == mtP(fort))) && (NIL == functionP(fort)));
    }

    /**
     * is FORT a collection in any mt?
     */
    @LispMethod(comment = "is FORT a collection in any mt?")
    public static final SubLObject collection_in_any_mtP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$Collection, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * is FORT a collection in any mt?
     */
    @LispMethod(comment = "is FORT a collection in any mt?")
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

    /**
     * is FORT a collection?
     */
    @LispMethod(comment = "is FORT a collection?")
    public static final SubLObject collectionP_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.collection_in_any_mtP(fort);
    }

    /**
     * is FORT a collection?
     */
    @LispMethod(comment = "is FORT a collection?")
    public static SubLObject collectionP(final SubLObject fort) {
        return collection_in_any_mtP(fort);
    }

    /**
     * is FORT a collection?
     */
    @LispMethod(comment = "is FORT a collection?")
    public static final SubLObject collection_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.collection_in_any_mtP(fort);
    }

    /**
     * is FORT a collection?
     */
    @LispMethod(comment = "is FORT a collection?")
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

    /**
     * Return a randomly chosen collection.
     */
    @LispMethod(comment = "Return a randomly chosen collection.")
    public static final SubLObject random_collection_alt() {
        {
            SubLObject collection = NIL;
            while (NIL == com.cyc.cycjava.cycl.fort_types_interface.collection_p(collection)) {
                collection = forts.random_fort();
            } 
            return collection;
        }
    }

    /**
     * Return a randomly chosen collection.
     */
    @LispMethod(comment = "Return a randomly chosen collection.")
    public static SubLObject random_collection() {
        SubLObject collection;
        for (collection = NIL; NIL == collection_p(collection); collection = forts.random_fort(UNPROVIDED)) {
        }
        return collection;
    }

    public static final SubLObject list_of_collections_p_alt(SubLObject v_object) {
        return list_utilities.list_of_type_p(COLLECTION_P, v_object);
    }

    public static SubLObject list_of_collections_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(COLLECTION_P, v_object);
    }

    /**
     * is TERM a collection?
     */
    @LispMethod(comment = "is TERM a collection?")
    public static final SubLObject isa_collectionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.collectionP(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$Collection, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Collection, v_term, mt)));
        }
    }

    /**
     * is TERM a collection?
     */
    @LispMethod(comment = "is TERM a collection?")
    public static SubLObject isa_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return collectionP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Collection, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Collection, v_term, mt)));
    }

    /**
     * is TERM a collection in any mt?
     */
    @LispMethod(comment = "is TERM a collection in any mt?")
    public static final SubLObject isa_collection_in_any_mtP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.collectionP(v_term);
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = makeBoolean((NIL != isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Collection, v_term, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * is TERM a collection in any mt?
     */
    @LispMethod(comment = "is TERM a collection in any mt?")
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

    /**
     * is FORT a predicate in any mt?
     */
    @LispMethod(comment = "is FORT a predicate in any mt?")
    public static final SubLObject predicate_in_any_mtP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$Predicate, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * is FORT a predicate in any mt?
     */
    @LispMethod(comment = "is FORT a predicate in any mt?")
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

    /**
     * is FORT a predicate?
     */
    @LispMethod(comment = "is FORT a predicate?")
    public static final SubLObject predicateP_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.predicate_in_any_mtP(fort);
    }

    /**
     * is FORT a predicate?
     */
    @LispMethod(comment = "is FORT a predicate?")
    public static SubLObject predicateP(final SubLObject fort) {
        return predicate_in_any_mtP(fort);
    }

    /**
     * is FORT a predicate?
     */
    @LispMethod(comment = "is FORT a predicate?")
    public static final SubLObject predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.predicate_in_any_mtP(fort);
    }

    /**
     * is FORT a predicate?
     */
    @LispMethod(comment = "is FORT a predicate?")
    public static SubLObject predicate_p(final SubLObject fort) {
        return predicate_in_any_mtP(fort);
    }

    public static final SubLObject list_of_predicates_p_alt(SubLObject v_object) {
        return list_utilities.list_of_type_p(PREDICATE_P, v_object);
    }

    public static SubLObject list_of_predicates_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(PREDICATE_P, v_object);
    }

    /**
     * is TERM a predicate?
     */
    @LispMethod(comment = "is TERM a predicate?")
    public static final SubLObject isa_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.predicateP(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$Predicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Predicate, v_term, mt)));
        }
    }

    /**
     * is TERM a predicate?
     */
    @LispMethod(comment = "is TERM a predicate?")
    public static SubLObject isa_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return predicateP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Predicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Predicate, v_term, mt)));
    }

    public static final SubLObject list_of_predicatesP_alt(SubLObject v_object) {
        return list_utilities.list_of_type_p($sym10$ISA_PREDICATE_, v_object);
    }

    public static SubLObject list_of_predicatesP(final SubLObject v_object) {
        return list_utilities.list_of_type_p($sym15$ISA_PREDICATE_, v_object);
    }

    public static final SubLObject fixed_arity_predicate_p_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.fort_types_interface.predicate_p(fort)) && (NIL == com.cyc.cycjava.cycl.fort_types_interface.variable_arity_relation_p(fort)));
    }

    public static SubLObject fixed_arity_predicate_p(final SubLObject fort) {
        return makeBoolean((NIL != predicate_p(fort)) && (NIL == variable_arity_relation_p(fort)));
    }

    public static final SubLObject variable_arity_predicate_p_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.fort_types_interface.predicate_p(fort)) && (NIL != com.cyc.cycjava.cycl.fort_types_interface.variable_arity_relation_p(fort)));
    }

    public static SubLObject variable_arity_predicate_p(final SubLObject fort) {
        return makeBoolean((NIL != predicate_p(fort)) && (NIL != variable_arity_relation_p(fort)));
    }

    /**
     * Is FORT in the @xref *forts-typed-function-denotational*
     */
    @LispMethod(comment = "Is FORT in the @xref *forts-typed-function-denotational*")
    public static final SubLObject function_in_any_mtP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$Function_Denotational, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Is FORT in the @xref *forts-typed-function-denotational*
     */
    @LispMethod(comment = "Is FORT in the @xref *forts-typed-function-denotational*")
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

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static final SubLObject functorP_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.non_predicate_functionP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static SubLObject functorP(final SubLObject fort) {
        return non_predicate_functionP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static final SubLObject functor_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.function_in_any_mtP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static SubLObject functor_p(final SubLObject fort) {
        return function_in_any_mtP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static final SubLObject non_predicate_functionP_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.function_in_any_mtP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static SubLObject non_predicate_functionP(final SubLObject fort) {
        return function_in_any_mtP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static final SubLObject functionP_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.non_predicate_functionP(fort);
    }

    /**
     * is FORT a non-predicate function?
     */
    @LispMethod(comment = "is FORT a non-predicate function?")
    public static SubLObject functionP(final SubLObject fort) {
        return non_predicate_functionP(fort);
    }

    /**
     * is TERM a function?
     */
    @LispMethod(comment = "is TERM a function?")
    public static final SubLObject isa_functionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.functionP(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$Function_Denotational, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Function_Denotational, v_term, mt)));
        }
    }

    /**
     * is TERM a function?
     */
    @LispMethod(comment = "is TERM a function?")
    public static SubLObject isa_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return functionP(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Function_Denotational, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Function_Denotational, v_term, mt)));
    }

    public static final SubLObject fixed_arity_functor_p_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.fort_types_interface.functor_p(fort)) && (NIL == com.cyc.cycjava.cycl.fort_types_interface.variable_arity_relation_p(fort)));
    }

    public static SubLObject fixed_arity_functor_p(final SubLObject fort) {
        return makeBoolean((NIL != functor_p(fort)) && (NIL == variable_arity_relation_p(fort)));
    }

    public static final SubLObject variable_arity_functor_p_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.fort_types_interface.functor_p(fort)) && (NIL != com.cyc.cycjava.cycl.fort_types_interface.variable_arity_relation_p(fort)));
    }

    public static SubLObject variable_arity_functor_p(final SubLObject fort) {
        return makeBoolean((NIL != functor_p(fort)) && (NIL != variable_arity_relation_p(fort)));
    }

    /**
     *
     *
     * @return boolean; t iff FORT is a microtheory in any mt.
     * @unknown Currently (2/00) we assume that microtheories must be defined as such in the *mt-mt*.
     */
    @LispMethod(comment = "@return boolean; t iff FORT is a microtheory in any mt.\r\n@unknown Currently (2/00) we assume that microtheories must be defined as such in the *mt-mt*.")
    public static final SubLObject mt_in_any_mtP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mtP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        mtP = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$Microtheory, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return mtP;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff FORT is a microtheory in any mt.
     * @unknown Currently (2/00) we assume that microtheories must be defined as such in the *mt-mt*.
     */
    @LispMethod(comment = "@return boolean; t iff FORT is a microtheory in any mt.\r\n@unknown Currently (2/00) we assume that microtheories must be defined as such in the *mt-mt*.")
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

    /**
     * is FORT a microtheory?
     */
    @LispMethod(comment = "is FORT a microtheory?")
    public static final SubLObject mtP_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.mt_in_any_mtP(fort);
    }

    /**
     * is FORT a microtheory?
     */
    @LispMethod(comment = "is FORT a microtheory?")
    public static SubLObject mtP(final SubLObject fort) {
        return mt_in_any_mtP(fort);
    }

    /**
     * is FORT a microtheory?
     */
    @LispMethod(comment = "is FORT a microtheory?")
    public static final SubLObject microtheory_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.mt_in_any_mtP(fort);
    }

    /**
     * is FORT a microtheory?
     */
    @LispMethod(comment = "is FORT a microtheory?")
    public static SubLObject microtheory_p(final SubLObject fort) {
        return mt_in_any_mtP(fort);
    }

    /**
     * is TERM a microtheory?
     */
    @LispMethod(comment = "is TERM a microtheory?")
    public static final SubLObject isa_mtP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.mtP(v_term);
        } else {
            if (NIL != hlmt.hlmt_naut_p(v_term)) {
                return hlmt.hlmtP(v_term);
            } else {
                return makeBoolean((NIL != isaP(v_term, $$Microtheory, UNPROVIDED, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Microtheory, v_term, UNPROVIDED)));
            }
        }
    }

    /**
     * is TERM a microtheory?
     */
    @LispMethod(comment = "is TERM a microtheory?")
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

    /**
     * Return a randomly chosen monadic microtheory.
     */
    @LispMethod(comment = "Return a randomly chosen monadic microtheory.")
    public static final SubLObject random_mt_alt() {
        {
            SubLObject mt = NIL;
            while (NIL == com.cyc.cycjava.cycl.fort_types_interface.microtheory_p(mt)) {
                mt = forts.random_fort();
            } 
            return mt;
        }
    }

    /**
     * Return a randomly chosen monadic microtheory.
     */
    @LispMethod(comment = "Return a randomly chosen monadic microtheory.")
    public static SubLObject random_mt() {
        SubLObject mt;
        for (mt = NIL; NIL == microtheory_p(mt); mt = forts.random_fort(UNPROVIDED)) {
        }
        return mt;
    }

    /**
     * is FORT a relation?
     */
    @LispMethod(comment = "is FORT a relation?")
    public static final SubLObject relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$Relation);
    }

    /**
     * is FORT a relation?
     */
    @LispMethod(comment = "is FORT a relation?")
    public static SubLObject relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$Relation);
    }

    /**
     * is TERM a relation?
     */
    @LispMethod(comment = "is TERM a relation?")
    public static final SubLObject isa_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$Relation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Relation, v_term, mt)));
        }
    }

    /**
     * is TERM a relation?
     */
    @LispMethod(comment = "is TERM a relation?")
    public static SubLObject isa_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Relation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Relation, v_term, mt)));
    }

    /**
     * is FORT a sentential relation?
     */
    @LispMethod(comment = "is FORT a sentential relation?")
    public static final SubLObject sentential_relation_p_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.fort_types_interface.logical_connective_p(fort)) || (NIL != com.cyc.cycjava.cycl.fort_types_interface.quantifier_p(fort)));
    }

    /**
     * is FORT a sentential relation?
     */
    @LispMethod(comment = "is FORT a sentential relation?")
    public static SubLObject sentential_relation_p(final SubLObject fort) {
        return makeBoolean((NIL != logical_connective_p(fort)) || (NIL != quantifier_p(fort)));
    }

    /**
     * is TERM a sentential relation?
     */
    @LispMethod(comment = "is TERM a sentential relation?")
    public static final SubLObject isa_sentential_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.sentential_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$SententialRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SententialRelation, v_term, mt)));
        }
    }

    /**
     * is TERM a sentential relation?
     */
    @LispMethod(comment = "is TERM a sentential relation?")
    public static SubLObject isa_sentential_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return sentential_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SententialRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SententialRelation, v_term, mt)));
    }

    /**
     * is FORT a anti symmetric binary predicate?
     */
    @LispMethod(comment = "is FORT a anti symmetric binary predicate?")
    public static final SubLObject anti_symmetric_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$AntiSymmetricBinaryPredicate);
    }

    /**
     * is FORT a anti symmetric binary predicate?
     */
    @LispMethod(comment = "is FORT a anti symmetric binary predicate?")
    public static SubLObject anti_symmetric_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$AntiSymmetricBinaryPredicate);
    }

    /**
     * is TERM a anti symmetric binary predicate?
     */
    @LispMethod(comment = "is TERM a anti symmetric binary predicate?")
    public static final SubLObject isa_anti_symmetric_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.anti_symmetric_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$AntiSymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AntiSymmetricBinaryPredicate, v_term, mt)));
        }
    }

    /**
     * is TERM a anti symmetric binary predicate?
     */
    @LispMethod(comment = "is TERM a anti symmetric binary predicate?")
    public static SubLObject isa_anti_symmetric_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return anti_symmetric_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$AntiSymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AntiSymmetricBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a anti transitive binary predicate?
     */
    @LispMethod(comment = "is FORT a anti transitive binary predicate?")
    public static final SubLObject anti_transitive_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$AntiTransitiveBinaryPredicate);
    }

    /**
     * is FORT a anti transitive binary predicate?
     */
    @LispMethod(comment = "is FORT a anti transitive binary predicate?")
    public static SubLObject anti_transitive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$AntiTransitiveBinaryPredicate);
    }

    /**
     * is TERM a anti transitive binary predicate?
     */
    @LispMethod(comment = "is TERM a anti transitive binary predicate?")
    public static final SubLObject isa_anti_transitive_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.anti_transitive_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$AntiTransitiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AntiTransitiveBinaryPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a anti transitive binary predicate?")
    public static SubLObject isa_anti_transitive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return anti_transitive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$AntiTransitiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AntiTransitiveBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT an arg type binary predicate?
     */
    @LispMethod(comment = "is FORT an arg type binary predicate?")
    public static final SubLObject arg_type_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ArgTypeBinaryPredicate);
    }

    @LispMethod(comment = "is FORT an arg type binary predicate?")
    public static SubLObject arg_type_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ArgTypeBinaryPredicate);
    }

    /**
     * is TERM an arg type binary predicate?
     */
    @LispMethod(comment = "is TERM an arg type binary predicate?")
    public static final SubLObject isa_arg_type_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.arg_type_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ArgTypeBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgTypeBinaryPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM an arg type binary predicate?")
    public static SubLObject isa_arg_type_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return arg_type_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgTypeBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgTypeBinaryPredicate, v_term, mt)));
    }

    /**
     * is TERM a arg type binary predicate?
     */
    @LispMethod(comment = "is TERM a arg type binary predicate?")
    public static final SubLObject isa_arg_quoted_isa_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isaP(v_term, $$ArgQuotedIsaBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgQuotedIsaBinaryPredicate, v_term, mt)));
    }

    @LispMethod(comment = "is TERM a arg type binary predicate?")
    public static SubLObject isa_arg_quoted_isa_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgQuotedIsaBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgQuotedIsaBinaryPredicate, v_term, mt)));
    }

    /**
     * is TERM a arg type binary predicate?
     */
    @LispMethod(comment = "is TERM a arg type binary predicate?")
    public static final SubLObject isa_arg_format_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isaP(v_term, $$ArgFormatBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgFormatBinaryPredicate, v_term, mt)));
    }

    @LispMethod(comment = "is TERM a arg type binary predicate?")
    public static SubLObject isa_arg_format_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgFormatBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgFormatBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a arg type ternary predicate?
     */
    @LispMethod(comment = "is FORT a arg type ternary predicate?")
    public static final SubLObject arg_type_ternary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ArgTypeTernaryPredicate);
    }

    @LispMethod(comment = "is FORT a arg type ternary predicate?")
    public static SubLObject arg_type_ternary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ArgTypeTernaryPredicate);
    }

    /**
     * is TERM a arg type ternary predicate?
     */
    @LispMethod(comment = "is TERM a arg type ternary predicate?")
    public static final SubLObject isa_arg_type_ternary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.arg_type_ternary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ArgTypeTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgTypeTernaryPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a arg type ternary predicate?")
    public static SubLObject isa_arg_type_ternary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return arg_type_ternary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgTypeTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgTypeTernaryPredicate, v_term, mt)));
    }

    /**
     * is TERM a arg type ternary predicate?
     */
    @LispMethod(comment = "is TERM a arg type ternary predicate?")
    public static final SubLObject isa_arg_quoted_isa_ternary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isaP(v_term, $$ArgQuotedIsaTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgQuotedIsaTernaryPredicate, v_term, mt)));
    }

    @LispMethod(comment = "is TERM a arg type ternary predicate?")
    public static SubLObject isa_arg_quoted_isa_ternary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgQuotedIsaTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgQuotedIsaTernaryPredicate, v_term, mt)));
    }

    /**
     * is TERM a arg format ternary predicate?
     */
    @LispMethod(comment = "is TERM a arg format ternary predicate?")
    public static final SubLObject isa_arg_format_ternary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isaP(v_term, $$ArgFormatTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgFormatTernaryPredicate, v_term, mt)));
    }

    @LispMethod(comment = "is TERM a arg format ternary predicate?")
    public static SubLObject isa_arg_format_ternary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ArgFormatTernaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ArgFormatTernaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a asymmetric binary predicate?
     */
    @LispMethod(comment = "is FORT a asymmetric binary predicate?")
    public static final SubLObject asymmetric_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$AsymmetricBinaryPredicate);
    }

    @LispMethod(comment = "is FORT a asymmetric binary predicate?")
    public static SubLObject asymmetric_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$AsymmetricBinaryPredicate);
    }

    /**
     * is TERM a asymmetric binary predicate?
     */
    @LispMethod(comment = "is TERM a asymmetric binary predicate?")
    public static final SubLObject isa_asymmetric_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.asymmetric_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$AsymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AsymmetricBinaryPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a asymmetric binary predicate?")
    public static SubLObject isa_asymmetric_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return asymmetric_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$AsymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$AsymmetricBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a bookkeeping predicate?
     */
    @LispMethod(comment = "is FORT a bookkeeping predicate?")
    public static final SubLObject bookkeeping_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$BookkeepingPredicate);
    }

    @LispMethod(comment = "is FORT a bookkeeping predicate?")
    public static SubLObject bookkeeping_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$BookkeepingPredicate);
    }

    /**
     * is TERM a bookkeeping predicate?
     */
    @LispMethod(comment = "is TERM a bookkeeping predicate?")
    public static final SubLObject isa_bookkeeping_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.bookkeeping_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$BookkeepingPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$BookkeepingPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a bookkeeping predicate?")
    public static SubLObject isa_bookkeeping_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return bookkeeping_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$BookkeepingPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$BookkeepingPredicate, v_term, mt)));
    }

    /**
     * is FORT a underspecified predicate?
     */
    @LispMethod(comment = "is FORT a underspecified predicate?")
    public static final SubLObject underspecified_predicate_p_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$UnderspecifiedPredicate, mt);
    }

    @LispMethod(comment = "is FORT a underspecified predicate?")
    public static SubLObject underspecified_predicate_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$UnderspecifiedPredicate, mt);
    }

    /**
     * is TERM a underspecified predicate?
     */
    @LispMethod(comment = "is TERM a underspecified predicate?")
    public static final SubLObject isa_underspecified_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.underspecified_predicate_p(v_term, mt);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$UnderspecifiedPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$UnderspecifiedPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a underspecified predicate?")
    public static SubLObject isa_underspecified_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return underspecified_predicate_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$UnderspecifiedPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$UnderspecifiedPredicate, v_term, mt)));
    }

    /**
     * is FORT a broad microtheory?
     */
    @LispMethod(comment = "is FORT a broad microtheory?")
    public static final SubLObject broad_microtheory_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$BroadMicrotheory);
    }

    @LispMethod(comment = "is FORT a broad microtheory?")
    public static SubLObject broad_microtheory_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$BroadMicrotheory);
    }

    /**
     * is TERM a broad microtheory?
     */
    @LispMethod(comment = "is TERM a broad microtheory?")
    public static final SubLObject isa_broad_microtheoryP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.broad_microtheory_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$BroadMicrotheory, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$BroadMicrotheory, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a broad microtheory?")
    public static SubLObject isa_broad_microtheoryP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return broad_microtheory_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$BroadMicrotheory, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$BroadMicrotheory, v_term, mt)));
    }

    /**
     * Return T iff RELATION is a commutative relation.
     */
    @LispMethod(comment = "Return T iff RELATION is a commutative relation.")
    public static final SubLObject commutative_relationP_alt(SubLObject relation) {
        return com.cyc.cycjava.cycl.fort_types_interface.commutative_relation_p(relation);
    }

    @LispMethod(comment = "Return T iff RELATION is a commutative relation.")
    public static SubLObject commutative_relationP(final SubLObject relation) {
        return commutative_relation_p(relation);
    }

    /**
     * is FORT a commutative relation?
     */
    @LispMethod(comment = "is FORT a commutative relation?")
    public static final SubLObject commutative_relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$CommutativeRelation);
    }

    @LispMethod(comment = "is FORT a commutative relation?")
    public static SubLObject commutative_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$CommutativeRelation);
    }

    /**
     * is TERM a commutative relation?
     */
    @LispMethod(comment = "is TERM a commutative relation?")
    public static final SubLObject isa_commutative_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.commutative_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$CommutativeRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$CommutativeRelation, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a commutative relation?")
    public static SubLObject isa_commutative_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return commutative_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$CommutativeRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$CommutativeRelation, v_term, mt)));
    }

    /**
     * is FORT a commutative predicate?
     */
    @LispMethod(comment = "is FORT a commutative predicate?")
    public static final SubLObject commutative_predicate_p_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.fort_types_interface.commutative_relation_p(fort)) && (NIL != com.cyc.cycjava.cycl.fort_types_interface.predicate_p(fort)));
    }

    @LispMethod(comment = "is FORT a commutative predicate?")
    public static SubLObject commutative_predicate_p(final SubLObject fort) {
        return makeBoolean((NIL != commutative_relation_p(fort)) && (NIL != predicate_p(fort)));
    }

    /**
     * is TERM a commutative predicate?
     */
    @LispMethod(comment = "is TERM a commutative predicate?")
    public static final SubLObject isa_commutative_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.commutative_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$CommutativePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$CommutativePredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a commutative predicate?")
    public static SubLObject isa_commutative_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return commutative_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$CommutativePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$CommutativePredicate, v_term, mt)));
    }

    /**
     * is FORT a distributing meta knowledge predicate?
     */
    @LispMethod(comment = "is FORT a distributing meta knowledge predicate?")
    public static final SubLObject distributing_meta_knowledge_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $const33$DistributingMetaKnowledgePredicat);
    }

    @LispMethod(comment = "is FORT a distributing meta knowledge predicate?")
    public static SubLObject distributing_meta_knowledge_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $const36$DistributingMetaKnowledgePredicat);
    }

    /**
     * is TERM a distributing meta knowledge predicate?
     */
    @LispMethod(comment = "is TERM a distributing meta knowledge predicate?")
    public static final SubLObject isa_distributing_meta_knowledge_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.distributing_meta_knowledge_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $const33$DistributingMetaKnowledgePredicat, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($const33$DistributingMetaKnowledgePredicat, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a distributing meta knowledge predicate?")
    public static SubLObject isa_distributing_meta_knowledge_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return distributing_meta_knowledge_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $const36$DistributingMetaKnowledgePredicat, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($const36$DistributingMetaKnowledgePredicat, v_term, mt)));
    }

    /**
     *
     *
     * @return listp; all forts in the distributing meta knowledge predicate cache
     */
    @LispMethod(comment = "@return listp; all forts in the distributing meta knowledge predicate cache")
    public static final SubLObject forts_typed_distributing_meta_knowledge_predicate_alt() {
        return com.cyc.cycjava.cycl.fort_types_interface.all_forts_of_type($const33$DistributingMetaKnowledgePredicat);
    }

    /**
     *
     *
     * @return listp; all forts in the distributing meta knowledge predicate cache
     */
    @LispMethod(comment = "@return listp; all forts in the distributing meta knowledge predicate cache")
    public static SubLObject forts_typed_distributing_meta_knowledge_predicate() {
        return all_forts_of_type($const36$DistributingMetaKnowledgePredicat);
    }

    /**
     * is FORT an EL relation?
     */
    @LispMethod(comment = "is FORT an EL relation?")
    public static final SubLObject el_relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ELRelation);
    }

    @LispMethod(comment = "is FORT an EL relation?")
    public static SubLObject el_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ELRelation);
    }

    /**
     * is TERM an EL relation?
     */
    @LispMethod(comment = "is TERM an EL relation?")
    public static final SubLObject isa_el_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.el_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ELRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ELRelation, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM an EL relation?")
    public static SubLObject isa_el_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return el_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ELRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ELRelation, v_term, mt)));
    }

    /**
     * is FORT a evaluatable function?
     */
    @LispMethod(comment = "is FORT a evaluatable function?")
    public static final SubLObject evaluatable_function_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$EvaluatableFunction);
    }

    @LispMethod(comment = "is FORT a evaluatable function?")
    public static SubLObject evaluatable_function_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$EvaluatableFunction);
    }

    /**
     * is TERM a evaluatable function?
     */
    @LispMethod(comment = "is TERM a evaluatable function?")
    public static final SubLObject isa_evaluatable_functionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.evaluatable_function_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$EvaluatableFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$EvaluatableFunction, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a evaluatable function?")
    public static SubLObject isa_evaluatable_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return evaluatable_function_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$EvaluatableFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$EvaluatableFunction, v_term, mt)));
    }

    /**
     * is FORT a evaluatable predicate?
     */
    @LispMethod(comment = "is FORT a evaluatable predicate?")
    public static final SubLObject evaluatable_predicate_p_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$EvaluatablePredicate, mt);
    }

    @LispMethod(comment = "is FORT a evaluatable predicate?")
    public static SubLObject evaluatable_predicate_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$EvaluatablePredicate, mt);
    }

    /**
     * is TERM a evaluatable predicate?
     */
    @LispMethod(comment = "is TERM a evaluatable predicate?")
    public static final SubLObject isa_evaluatable_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.evaluatable_predicate_p(v_term, mt);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$EvaluatablePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$EvaluatablePredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a evaluatable predicate?")
    public static SubLObject isa_evaluatable_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return evaluatable_predicate_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$EvaluatablePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$EvaluatablePredicate, v_term, mt)));
    }

    /**
     * is FORT a existential quantifier?
     */
    @LispMethod(comment = "is FORT a existential quantifier?")
    public static final SubLObject existential_quantifier_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ExistentialQuantifier);
    }

    @LispMethod(comment = "is FORT a existential quantifier?")
    public static SubLObject existential_quantifier_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ExistentialQuantifier);
    }

    /**
     * is TERM a existential quantifier?
     */
    @LispMethod(comment = "is TERM a existential quantifier?")
    public static final SubLObject isa_existential_quantifierP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.existential_quantifier_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ExistentialQuantifier, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ExistentialQuantifier, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a existential quantifier?")
    public static SubLObject isa_existential_quantifierP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return existential_quantifier_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ExistentialQuantifier, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ExistentialQuantifier, v_term, mt)));
    }

    /**
     * is FORT a irreflexive binary predicate?
     */
    @LispMethod(comment = "is FORT a irreflexive binary predicate?")
    public static final SubLObject irreflexive_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$IrreflexiveBinaryPredicate);
    }

    @LispMethod(comment = "is FORT a irreflexive binary predicate?")
    public static SubLObject irreflexive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$IrreflexiveBinaryPredicate);
    }

    /**
     * is TERM a irreflexive binary predicate?
     */
    @LispMethod(comment = "is TERM a irreflexive binary predicate?")
    public static final SubLObject isa_irreflexive_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.irreflexive_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$IrreflexiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$IrreflexiveBinaryPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a irreflexive binary predicate?")
    public static SubLObject isa_irreflexive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return irreflexive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$IrreflexiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$IrreflexiveBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a logical connective?
     */
    @LispMethod(comment = "is FORT a logical connective?")
    public static final SubLObject logical_connective_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$LogicalConnective);
    }

    @LispMethod(comment = "is FORT a logical connective?")
    public static SubLObject logical_connective_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$LogicalConnective);
    }

    /**
     * is TERM a logical connective?
     */
    @LispMethod(comment = "is TERM a logical connective?")
    public static final SubLObject isa_logical_connectiveP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.logical_connective_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$LogicalConnective, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$LogicalConnective, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a logical connective?")
    public static SubLObject isa_logical_connectiveP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return logical_connective_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$LogicalConnective, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$LogicalConnective, v_term, mt)));
    }

    /**
     * is FORT a microtheory designating relation?
     */
    @LispMethod(comment = "is FORT a microtheory designating relation?")
    public static final SubLObject microtheory_designating_relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$MicrotheoryDesignatingRelation);
    }

    @LispMethod(comment = "is FORT a microtheory designating relation?")
    public static SubLObject microtheory_designating_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$MicrotheoryDesignatingRelation);
    }

    /**
     * is TERM a microtheory designating relation?
     */
    @LispMethod(comment = "is TERM a microtheory designating relation?")
    public static final SubLObject isa_microtheory_designating_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.microtheory_designating_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$MicrotheoryDesignatingRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$MicrotheoryDesignatingRelation, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a microtheory designating relation?")
    public static SubLObject isa_microtheory_designating_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return microtheory_designating_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$MicrotheoryDesignatingRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$MicrotheoryDesignatingRelation, v_term, mt)));
    }

    /**
     * is FORT a partially commutative relation?
     */
    @LispMethod(comment = "is FORT a partially commutative relation?")
    public static final SubLObject partially_commutative_relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$PartiallyCommutativeRelation);
    }

    @LispMethod(comment = "is FORT a partially commutative relation?")
    public static SubLObject partially_commutative_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$PartiallyCommutativeRelation);
    }

    /**
     * is TERM a partially commutative relation?
     */
    @LispMethod(comment = "is TERM a partially commutative relation?")
    public static final SubLObject isa_partially_commutative_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.partially_commutative_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$PartiallyCommutativeRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$PartiallyCommutativeRelation, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a partially commutative relation?")
    public static SubLObject isa_partially_commutative_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return partially_commutative_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$PartiallyCommutativeRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$PartiallyCommutativeRelation, v_term, mt)));
    }

    /**
     * is FORT a partially commutative predicate?
     */
    @LispMethod(comment = "is FORT a partially commutative predicate?")
    public static final SubLObject partially_commutative_predicate_p_alt(SubLObject fort) {
        return isaP(fort, $$PartiallyCommutativePredicate, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
    }

    @LispMethod(comment = "is FORT a partially commutative predicate?")
    public static SubLObject partially_commutative_predicate_p(final SubLObject fort) {
        return isa.isaP(fort, $$PartiallyCommutativePredicate, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * is TERM a partially commutative predicate?
     */
    @LispMethod(comment = "is TERM a partially commutative predicate?")
    public static final SubLObject isa_partially_commutative_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.partially_commutative_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$PartiallyCommutativePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$PartiallyCommutativePredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a partially commutative predicate?")
    public static SubLObject isa_partially_commutative_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return partially_commutative_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$PartiallyCommutativePredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$PartiallyCommutativePredicate, v_term, mt)));
    }

    /**
     * is FORT a problem solving context?
     */
    @LispMethod(comment = "is FORT a problem solving context?")
    public static final SubLObject problem_solving_context_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ProblemSolvingCntxt);
    }

    @LispMethod(comment = "is FORT a problem solving context?")
    public static SubLObject problem_solving_context_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ProblemSolvingCntxt);
    }

    /**
     * is TERM a problem solving context?
     */
    @LispMethod(comment = "is TERM a problem solving context?")
    public static final SubLObject isa_problem_solving_contextP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.problem_solving_context_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ProblemSolvingCntxt, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ProblemSolvingCntxt, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a problem solving context?")
    public static SubLObject isa_problem_solving_contextP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return problem_solving_context_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ProblemSolvingCntxt, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ProblemSolvingCntxt, v_term, mt)));
    }

    /**
     * is FORT a quantifier?
     */
    @LispMethod(comment = "is FORT a quantifier?")
    public static final SubLObject quantifier_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$Quantifier);
    }

    @LispMethod(comment = "is FORT a quantifier?")
    public static SubLObject quantifier_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$Quantifier);
    }

    /**
     * is TERM a quantifier?
     */
    @LispMethod(comment = "is TERM a quantifier?")
    public static final SubLObject isa_quantifierP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.quantifier_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$Quantifier, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Quantifier, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a quantifier?")
    public static SubLObject isa_quantifierP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return quantifier_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$Quantifier, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$Quantifier, v_term, mt)));
    }

    /**
     * is FORT a reflexive binary predicate?
     */
    @LispMethod(comment = "is FORT a reflexive binary predicate?")
    public static final SubLObject reflexive_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ReflexiveBinaryPredicate);
    }

    @LispMethod(comment = "is FORT a reflexive binary predicate?")
    public static SubLObject reflexive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ReflexiveBinaryPredicate);
    }

    /**
     * is TERM a reflexive binary predicate?
     */
    @LispMethod(comment = "is TERM a reflexive binary predicate?")
    public static final SubLObject isa_reflexive_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.reflexive_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ReflexiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ReflexiveBinaryPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a reflexive binary predicate?")
    public static SubLObject isa_reflexive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return reflexive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ReflexiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ReflexiveBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a reifiable function?
     */
    @LispMethod(comment = "is FORT a reifiable function?")
    public static final SubLObject reifiable_function_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ReifiableFunction);
    }

    @LispMethod(comment = "is FORT a reifiable function?")
    public static SubLObject reifiable_function_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ReifiableFunction);
    }

    /**
     * is TERM a reifiable function?
     */
    @LispMethod(comment = "is TERM a reifiable function?")
    public static final SubLObject isa_reifiable_functionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.reifiable_function_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ReifiableFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ReifiableFunction, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a reifiable function?")
    public static SubLObject isa_reifiable_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return reifiable_function_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ReifiableFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ReifiableFunction, v_term, mt)));
    }

    /**
     * is FORT a rule macro predicate?
     */
    @LispMethod(comment = "is FORT a rule macro predicate?")
    public static final SubLObject rule_macro_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$RuleMacroPredicate);
    }

    @LispMethod(comment = "is FORT a rule macro predicate?")
    public static SubLObject rule_macro_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$RuleMacroPredicate);
    }

    /**
     * is TERM a rule macro predicate?
     */
    @LispMethod(comment = "is TERM a rule macro predicate?")
    public static final SubLObject isa_rule_macro_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.rule_macro_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$RuleMacroPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$RuleMacroPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a rule macro predicate?")
    public static SubLObject isa_rule_macro_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return rule_macro_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$RuleMacroPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$RuleMacroPredicate, v_term, mt)));
    }

    /**
     * is FORT a scoping relation?
     */
    @LispMethod(comment = "is FORT a scoping relation?")
    public static final SubLObject scoping_relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$ScopingRelation);
    }

    @LispMethod(comment = "is FORT a scoping relation?")
    public static SubLObject scoping_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$ScopingRelation);
    }

    /**
     * is TERM a scoping relation?
     */
    @LispMethod(comment = "is TERM a scoping relation?")
    public static final SubLObject isa_scoping_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.scoping_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$ScopingRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ScopingRelation, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a scoping relation?")
    public static SubLObject isa_scoping_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return scoping_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$ScopingRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$ScopingRelation, v_term, mt)));
    }

    /**
     * is FORT a sibling disjoint collection?
     */
    @LispMethod(comment = "is FORT a sibling disjoint collection?")
    public static final SubLObject sibling_disjoint_collection_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$SiblingDisjointCollectionType);
    }

    @LispMethod(comment = "is FORT a sibling disjoint collection?")
    public static SubLObject sibling_disjoint_collection_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$SiblingDisjointCollectionType);
    }

    /**
     * is TERM a sibling disjoint collection?
     */
    @LispMethod(comment = "is TERM a sibling disjoint collection?")
    public static final SubLObject isa_sibling_disjoint_collectionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.sibling_disjoint_collection_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$SiblingDisjointCollectionType, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SiblingDisjointCollectionType, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a sibling disjoint collection?")
    public static SubLObject isa_sibling_disjoint_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return sibling_disjoint_collection_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SiblingDisjointCollectionType, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SiblingDisjointCollectionType, v_term, mt)));
    }

    /**
     *
     *
     * @return listp; all forts in the sibling disjoint collection cache
     */
    @LispMethod(comment = "@return listp; all forts in the sibling disjoint collection cache")
    public static final SubLObject forts_typed_sibling_disjoint_collection_alt() {
        return com.cyc.cycjava.cycl.fort_types_interface.all_forts_of_type($$SiblingDisjointCollectionType);
    }

    /**
     *
     *
     * @return listp; all forts in the sibling disjoint collection cache
     */
    @LispMethod(comment = "@return listp; all forts in the sibling disjoint collection cache")
    public static SubLObject forts_typed_sibling_disjoint_collection() {
        return all_forts_of_type($$SiblingDisjointCollectionType);
    }

    public static SubLObject disjoint_collection_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$DisjointCollectionType);
    }

    /**
     * works on more than just forts
     */
    @LispMethod(comment = "works on more than just forts")
    public static final SubLObject skolem_functionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return at_defns.quiet_has_typeP(v_term, $$SkolemFunction, mt);
    }

    @LispMethod(comment = "works on more than just forts")
    public static SubLObject skolem_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return at_defns.quiet_has_typeP(v_term, $$SkolemFunction, mt);
    }

    /**
     * is FORT a skolem function?
     */
    @LispMethod(comment = "is FORT a skolem function?")
    public static final SubLObject skolem_function_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$SkolemFunction);
    }

    @LispMethod(comment = "is FORT a skolem function?")
    public static SubLObject skolem_function_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$SkolemFunction);
    }

    public static final SubLObject skolem_fort_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != com.cyc.cycjava.cycl.fort_types_interface.skolem_function_p(v_object)));
    }

    public static SubLObject skolem_fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != skolem_function_p(v_object)));
    }

    /**
     * is TERM a skolem function?
     */
    @LispMethod(comment = "is TERM a skolem function?")
    public static final SubLObject isa_skolem_functionP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.skolem_function_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$SkolemFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SkolemFunction, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a skolem function?")
    public static SubLObject isa_skolem_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return skolem_function_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SkolemFunction, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SkolemFunction, v_term, mt)));
    }

    /**
     * is FORT a symmetric binary predicate?
     */
    @LispMethod(comment = "is FORT a symmetric binary predicate?")
    public static final SubLObject symmetric_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$SymmetricBinaryPredicate);
    }

    /**
     * is FORT a symmetric binary predicate?
     */
    @LispMethod(comment = "is FORT a symmetric binary predicate?")
    public static SubLObject symmetric_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$SymmetricBinaryPredicate);
    }

    /**
     * is TERM a symmetric binary predicate?
     */
    @LispMethod(comment = "is TERM a symmetric binary predicate?")
    public static final SubLObject isa_symmetric_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.symmetric_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$SymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SymmetricBinaryPredicate, v_term, mt)));
        }
    }

    /**
     * is TERM a symmetric binary predicate?
     */
    @LispMethod(comment = "is TERM a symmetric binary predicate?")
    public static SubLObject isa_symmetric_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return symmetric_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SymmetricBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SymmetricBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a transitive binary predicate?
     */
    @LispMethod(comment = "is FORT a transitive binary predicate?")
    public static final SubLObject transitive_binary_predicate_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$TransitiveBinaryPredicate);
    }

    @LispMethod(comment = "is FORT a transitive binary predicate?")
    public static SubLObject transitive_binary_predicate_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$TransitiveBinaryPredicate);
    }/**
     * is FORT a transitive binary predicate?
     */


    /**
     * is TERM a transitive binary predicate?
     */
    @LispMethod(comment = "is TERM a transitive binary predicate?")
    public static final SubLObject isa_transitive_binary_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.transitive_binary_predicate_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$TransitiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$TransitiveBinaryPredicate, v_term, mt)));
        }
    }

    /**
     * is TERM a transitive binary predicate?
     */
    @LispMethod(comment = "is TERM a transitive binary predicate?")
    public static SubLObject isa_transitive_binary_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return transitive_binary_predicate_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$TransitiveBinaryPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$TransitiveBinaryPredicate, v_term, mt)));
    }

    /**
     * is FORT a variable arity relation?
     */
    @LispMethod(comment = "is FORT a variable arity relation?")
    public static final SubLObject variable_arity_relation_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $$VariableArityRelation);
    }

    @LispMethod(comment = "is FORT a variable arity relation?")
    public static SubLObject variable_arity_relation_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $$VariableArityRelation);
    }/**
     * is FORT a variable arity relation?
     */


    /**
     * is TERM a variable arity relation?
     */
    @LispMethod(comment = "is TERM a variable arity relation?")
    public static final SubLObject isa_variable_arity_relationP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.variable_arity_relation_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$VariableArityRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$VariableArityRelation, v_term, mt)));
        }
    }

    /**
     * is TERM a variable arity relation?
     */
    @LispMethod(comment = "is TERM a variable arity relation?")
    public static SubLObject isa_variable_arity_relationP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return variable_arity_relation_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$VariableArityRelation, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$VariableArityRelation, v_term, mt)));
    }

    /**
     * is FORT a documentation predicate?
     */
    @LispMethod(comment = "is FORT a documentation predicate?")
    public static final SubLObject documentation_predicate_p_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$DocumentationPredicate, mt);
    }

    @LispMethod(comment = "is FORT a documentation predicate?")
    public static SubLObject documentation_predicate_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$DocumentationPredicate, mt);
    }/**
     * is FORT a documentation predicate?
     */


    /**
     * is TERM a documentation predicate?
     */
    @LispMethod(comment = "is TERM a documentation predicate?")
    public static final SubLObject isa_documentation_predicateP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.documentation_predicate_p(v_term, mt);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$DocumentationPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$DocumentationPredicate, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a documentation predicate?")
    public static SubLObject isa_documentation_predicateP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return documentation_predicate_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$DocumentationPredicate, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$DocumentationPredicate, v_term, mt)));
    }/**
     * is TERM a documentation predicate?
     */


    /**
     * is FORT an SKSI content microtheory?
     */
    @LispMethod(comment = "is FORT an SKSI content microtheory?")
    public static final SubLObject sksi_content_microtheory_p_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$SKSIContentMicrotheory, mt);
    }

    @LispMethod(comment = "is FORT an SKSI content microtheory?")
    public static SubLObject sksi_content_microtheory_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fort_has_typeP(fort, $$SKSIContentMicrotheory, mt);
    }/**
     * is FORT an SKSI content microtheory?
     */


    /**
     * is TERM an SKSI content microtheory?
     */
    @LispMethod(comment = "is TERM an SKSI content microtheory?")
    public static final SubLObject isa_sksi_content_microtheoryP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.sksi_content_microtheory_p(v_term, mt);
        } else {
            return makeBoolean((NIL != isaP(v_term, $$SKSIContentMicrotheory, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SKSIContentMicrotheory, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM an SKSI content microtheory?")
    public static SubLObject isa_sksi_content_microtheoryP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return sksi_content_microtheory_p(v_term, mt);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $$SKSIContentMicrotheory, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($$SKSIContentMicrotheory, v_term, mt)));
    }/**
     * is TERM an SKSI content microtheory?
     */


    /**
     * is FORT an SKSI external term denoting function?
     */
    @LispMethod(comment = "is FORT an SKSI external term denoting function?")
    public static final SubLObject sksi_external_term_denoting_function_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$SKSIExternalTermDenotingFunction, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * is FORT an SKSI external term denoting function?
     */
    @LispMethod(comment = "is FORT an SKSI external term denoting function?")
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

    /**
     * is TERM an SKSI external term denoting function?
     */
    @LispMethod(comment = "is TERM an SKSI external term denoting function?")
    public static final SubLObject isa_sksi_external_term_denoting_functionP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.sksi_external_term_denoting_function_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$SKSIExternalTermDenotingFunction);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$SKSIExternalTermDenotingFunction, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    /**
     * is TERM an SKSI external term denoting function?
     */
    @LispMethod(comment = "is TERM an SKSI external term denoting function?")
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

    /**
     * is FORT an SKSI supported comparison predicate?
     */
    @LispMethod(comment = "is FORT an SKSI supported comparison predicate?")
    public static final SubLObject sksi_supported_comparison_predicate_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$SKSISupportedComparisonPredicate, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT an SKSI supported comparison predicate?")
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
    }/**
     * is FORT an SKSI supported comparison predicate?
     */


    /**
     * is TERM an SKSI supported comparison predicate?
     */
    @LispMethod(comment = "is TERM an SKSI supported comparison predicate?")
    public static final SubLObject isa_sksi_supported_comparison_predicateP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.sksi_supported_comparison_predicate_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$SKSISupportedComparisonPredicate);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$SKSISupportedComparisonPredicate, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM an SKSI supported comparison predicate?")
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
    }/**
     * is TERM an SKSI supported comparison predicate?
     */


    /**
     * is FORT an SKSI supported function?
     */
    @LispMethod(comment = "is FORT an SKSI supported function?")
    public static final SubLObject sksi_supported_function_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$SKSISupportedFunction, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT an SKSI supported function?")
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
    }/**
     * is FORT an SKSI supported function?
     */


    /**
     * is TERM an SKSI supported function?
     */
    @LispMethod(comment = "is TERM an SKSI supported function?")
    public static final SubLObject isa_sksi_supported_functionP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.sksi_supported_function_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$SKSISupportedFunction);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$SKSISupportedFunction, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM an SKSI supported function?")
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
    }/**
     * is TERM an SKSI supported function?
     */


    /**
     * is FORT a CSQL comparison predicate?
     */
    @LispMethod(comment = "is FORT a CSQL comparison predicate?")
    public static final SubLObject csql_comparison_predicate_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$CSQLComparisonPredicate, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT a CSQL comparison predicate?")
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
    }/**
     * is FORT a CSQL comparison predicate?
     */


    /**
     * is TERM a CSQL comparison predicate?
     */
    @LispMethod(comment = "is TERM a CSQL comparison predicate?")
    public static final SubLObject isa_csql_comparison_predicateP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.csql_comparison_predicate_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$CSQLComparisonPredicate);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLComparisonPredicate, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM a CSQL comparison predicate?")
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
    }/**
     * is TERM a CSQL comparison predicate?
     */


    /**
     * is FORT an SKSI supported constant?
     */
    @LispMethod(comment = "is FORT an SKSI supported constant?")
    public static final SubLObject sksi_supported_constant_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$SKSISupportedConstant, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT an SKSI supported constant?")
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
    }/**
     * is FORT an SKSI supported constant?
     */


    /**
     * is TERM an SKSI supported constant?
     */
    @LispMethod(comment = "is TERM an SKSI supported constant?")
    public static final SubLObject isa_sksi_supported_constantP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.sksi_supported_constant_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$SKSISupportedConstant);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$SKSISupportedConstant, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM an SKSI supported constant?")
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
    }/**
     * is TERM an SKSI supported constant?
     */


    /**
     * is FORT a CSQL function?
     */
    @LispMethod(comment = "is FORT a CSQL function?")
    public static final SubLObject csql_function_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$CSQLFunction, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT a CSQL function?")
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
    }/**
     * is FORT a CSQL function?
     */


    /**
     * is TERM a CSQL function?
     */
    @LispMethod(comment = "is TERM a CSQL function?")
    public static final SubLObject isa_csql_functionP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.csql_function_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$CSQLFunction);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLFunction, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM a CSQL function?")
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
    }/**
     * is TERM a CSQL function?
     */


    /**
     * is FORT a CSQL logical connective?
     */
    @LispMethod(comment = "is FORT a CSQL logical connective?")
    public static final SubLObject csql_logical_connective_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$CSQLLogicalConnective, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT a CSQL logical connective?")
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
    }/**
     * is FORT a CSQL logical connective?
     */


    /**
     * is TERM a CSQL logical connective?
     */
    @LispMethod(comment = "is TERM a CSQL logical connective?")
    public static final SubLObject isa_csql_logical_connectiveP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.csql_logical_connective_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$CSQLLogicalConnective);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLLogicalConnective, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM a CSQL logical connective?")
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
    }/**
     * is TERM a CSQL logical connective?
     */


    /**
     * is FORT a CSQL quantifier?
     */
    @LispMethod(comment = "is FORT a CSQL quantifier?")
    public static final SubLObject csql_quantifier_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$CSQLQuantifier, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT a CSQL quantifier?")
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
    }/**
     * is FORT a CSQL quantifier?
     */


    /**
     * is TERM a CSQL quantifier?
     */
    @LispMethod(comment = "is TERM a CSQL quantifier?")
    public static final SubLObject isa_csql_quantifierP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.csql_quantifier_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$CSQLQuantifier);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLQuantifier, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM a CSQL quantifier?")
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
    }/**
     * is TERM a CSQL quantifier?
     */


    /**
     * is FORT a CSQL constant function?
     */
    @LispMethod(comment = "is FORT a CSQL constant function?")
    public static final SubLObject csql_constant_p_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(fort, $$CSQLConstantFunction, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "is FORT a CSQL constant function?")
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
    }/**
     * is FORT a CSQL constant function?
     */


    /**
     * is TERM a CSQL constant?
     */
    @LispMethod(comment = "is TERM a CSQL constant?")
    public static final SubLObject isa_csql_constantP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(v_term)) {
                return com.cyc.cycjava.cycl.fort_types_interface.csql_constant_p(v_term);
            } else {
                {
                    SubLObject ans = isa_in_any_mtP(v_term, $$CSQLConstantFunction);
                    if (NIL != ans) {
                        return ans;
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = at_defns.quiet_sufficient_defns_admitP($$CSQLConstantFunction, v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
        }
    }

    @LispMethod(comment = "is TERM a CSQL constant?")
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
    }/**
     * is TERM a CSQL constant?
     */


    public static final SubLObject nl_definiteness_attributeP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(v_object, $$NLDefinitenessAttribute, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
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

    public static final SubLObject nl_quant_attributeP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(v_object, $$NLQuantAttribute, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
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

    public static final SubLObject bounded_existential_quantifier_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.fort_types_interface.fort_has_typeP(v_object, $$ExistentialQuantifier_Bounded, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
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

    /**
     * is FORT a contextualized evaluatable relation?
     */
    @LispMethod(comment = "is FORT a contextualized evaluatable relation?")
    public static final SubLObject evaluatable_relation_contextualized_p_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.fort_types_interface.fort_has_type_in_any_mtP(fort, $const68$EvaluatableRelation_Contextualize);
    }

    @LispMethod(comment = "is FORT a contextualized evaluatable relation?")
    public static SubLObject evaluatable_relation_contextualized_p(final SubLObject fort) {
        return fort_has_type_in_any_mtP(fort, $const72$EvaluatableRelation_Contextualize);
    }/**
     * is FORT a contextualized evaluatable relation?
     */


    /**
     * is TERM a contextualized evaluatable relation?
     */
    @LispMethod(comment = "is TERM a contextualized evaluatable relation?")
    public static final SubLObject isa_evaluatable_relation_contextualizedP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.fort_types_interface.evaluatable_relation_contextualized_p(v_term);
        } else {
            return makeBoolean((NIL != isaP(v_term, $const68$EvaluatableRelation_Contextualize, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($const68$EvaluatableRelation_Contextualize, v_term, mt)));
        }
    }

    @LispMethod(comment = "is TERM a contextualized evaluatable relation?")
    public static SubLObject isa_evaluatable_relation_contextualizedP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return evaluatable_relation_contextualized_p(v_term);
        }
        return makeBoolean((NIL != isa.isaP(v_term, $const72$EvaluatableRelation_Contextualize, mt, UNPROVIDED)) || (NIL != at_defns.quiet_sufficient_defns_admitP($const72$EvaluatableRelation_Contextualize, v_term, mt)));
    }/**
     * is TERM a contextualized evaluatable relation?
     */


    /**
     * Wrapper for quoted-isa-in-any-mt?.
     *
     * @return boolean.
     */
    @LispMethod(comment = "Wrapper for quoted-isa-in-any-mt?.\r\n\r\n@return boolean.")
    public static final SubLObject public_constantP_alt(SubLObject fort) {
        return quoted_isa_in_any_mtP(fort, $$PublicConstant);
    }

    @LispMethod(comment = "Wrapper for quoted-isa-in-any-mt?.\r\n\r\n@return boolean.")
    public static SubLObject public_constantP(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$PublicConstant);
    }/**
     * Wrapper for quoted-isa-in-any-mt?.
     *
     * @return boolean.
     */


    /**
     * Wrapper for quoted-isa-in-any-mt?.
     *
     * @return boolean.
     */
    @LispMethod(comment = "Wrapper for quoted-isa-in-any-mt?.\r\n\r\n@return boolean.")
    public static final SubLObject non_public_constantP_alt(SubLObject fort) {
        return makeBoolean((NIL != constant_p(fort)) && (NIL == com.cyc.cycjava.cycl.fort_types_interface.public_constantP(fort)));
    }

    @LispMethod(comment = "Wrapper for quoted-isa-in-any-mt?.\r\n\r\n@return boolean.")
    public static SubLObject non_public_constantP(final SubLObject fort) {
        return makeBoolean((NIL != constant_p(fort)) && (NIL == public_constantP(fort)));
    }/**
     * Wrapper for quoted-isa-in-any-mt?.
     *
     * @return boolean.
     */


    public static final SubLObject clear_proprietary_constantP_alt() {
        {
            SubLObject cs = $proprietary_constantP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_proprietary_constantP() {
        final SubLObject cs = $proprietary_constantP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_proprietary_constantP_alt(SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($proprietary_constantP_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_proprietary_constantP(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($proprietary_constantP_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Wrapper for quoted-isa-in-any-mt?.
     *
     * @return boolean.
     */
    @LispMethod(comment = "Wrapper for quoted-isa-in-any-mt?.\r\n\r\n@return boolean.")
    public static final SubLObject proprietary_constantP_internal_alt(SubLObject fort) {
        return quoted_isa_in_any_mtP(fort, $$ProprietaryConstant);
    }

    @LispMethod(comment = "Wrapper for quoted-isa-in-any-mt?.\r\n\r\n@return boolean.")
    public static SubLObject proprietary_constantP_internal(final SubLObject fort) {
        return isa.quoted_isa_in_any_mtP(fort, $$ProprietaryConstant);
    }/**
     * Wrapper for quoted-isa-in-any-mt?.
     *
     * @return boolean.
     */


    public static final SubLObject proprietary_constantP_alt(SubLObject fort) {
        {
            SubLObject caching_state = $proprietary_constantP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym70$PROPRIETARY_CONSTANT_, $sym72$_PROPRIETARY_CONSTANT__CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_quoted_isa_dependent_cache_clear_callback($sym73$CLEAR_PROPRIETARY_CONSTANT_);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw74$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw74$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.fort_types_interface.proprietary_constantP_internal(fort)));
                    memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    public static final SubLObject city_in_any_mtP_internal_alt(SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa_in_any_mtP(v_term, $$City)));
    }

    public static SubLObject city_in_any_mtP_internal(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa.isa_in_any_mtP(v_term, $$City)));
    }

    public static final SubLObject city_in_any_mtP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.fort_types_interface.city_in_any_mtP_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym75$CITY_IN_ANY_MT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym75$CITY_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym75$CITY_IN_ANY_MT_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw74$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw74$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.fort_types_interface.city_in_any_mtP_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
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

    public static final SubLObject geographical_region_in_any_mtP_internal_alt(SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa_in_any_mtP(v_term, $$GeographicalRegion)));
    }

    public static SubLObject geographical_region_in_any_mtP_internal(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa.isa_in_any_mtP(v_term, $$GeographicalRegion)));
    }

    public static final SubLObject geographical_region_in_any_mtP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.fort_types_interface.geographical_region_in_any_mtP_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym77$GEOGRAPHICAL_REGION_IN_ANY_MT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym77$GEOGRAPHICAL_REGION_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym77$GEOGRAPHICAL_REGION_IN_ANY_MT_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw74$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw74$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.fort_types_interface.geographical_region_in_any_mtP_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
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

    public static final SubLObject country_in_any_mtP_internal_alt(SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa_in_any_mtP(v_term, $$Country)));
    }

    public static SubLObject country_in_any_mtP_internal(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL != isa.isa_in_any_mtP(v_term, $$Country)));
    }

    public static final SubLObject country_in_any_mtP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.fort_types_interface.country_in_any_mtP_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym79$COUNTRY_IN_ANY_MT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym79$COUNTRY_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym79$COUNTRY_IN_ANY_MT_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw74$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw74$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.fort_types_interface.country_in_any_mtP_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
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

    public static final SubLObject declare_fort_types_interface_file_alt() {
        declareFunction("fort_types", "FORT-TYPES", 1, 1, false);
        declareFunction("fort_has_typeP", "FORT-HAS-TYPE?", 2, 1, false);
        declareFunction("fort_has_type_in_any_mtP", "FORT-HAS-TYPE-IN-ANY-MT?", 2, 0, false);
        declareFunction("definitional_fort_type", "DEFINITIONAL-FORT-TYPE", 1, 1, false);
        declareFunction("select_definitional_type", "SELECT-DEFINITIONAL-TYPE", 1, 0, false);
        declareFunction("all_forts_of_type", "ALL-FORTS-OF-TYPE", 1, 0, false);
        declareFunction("genericP", "GENERIC?", 1, 0, false);
        declareFunction("collection_in_any_mtP", "COLLECTION-IN-ANY-MT?", 1, 0, false);
        declareFunction("collectionP", "COLLECTION?", 1, 0, false);
        declareFunction("collection_p", "COLLECTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.fort_types_interface.$collection_p$UnaryFunction();
        declareFunction("random_collection", "RANDOM-COLLECTION", 0, 0, false);
        declareFunction("list_of_collections_p", "LIST-OF-COLLECTIONS-P", 1, 0, false);
        declareFunction("isa_collectionP", "ISA-COLLECTION?", 1, 1, false);
        declareFunction("isa_collection_in_any_mtP", "ISA-COLLECTION-IN-ANY-MT?", 1, 0, false);
        declareFunction("predicate_in_any_mtP", "PREDICATE-IN-ANY-MT?", 1, 0, false);
        declareFunction("predicateP", "PREDICATE?", 1, 0, false);
        declareFunction("predicate_p", "PREDICATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.fort_types_interface.$predicate_p$UnaryFunction();
        declareFunction("list_of_predicates_p", "LIST-OF-PREDICATES-P", 1, 0, false);
        declareFunction("isa_predicateP", "ISA-PREDICATE?", 1, 1, false);
        declareFunction("list_of_predicatesP", "LIST-OF-PREDICATES?", 1, 0, false);
        declareFunction("fixed_arity_predicate_p", "FIXED-ARITY-PREDICATE-P", 1, 0, false);
        declareFunction("variable_arity_predicate_p", "VARIABLE-ARITY-PREDICATE-P", 1, 0, false);
        declareFunction("function_in_any_mtP", "FUNCTION-IN-ANY-MT?", 1, 0, false);
        declareFunction("functorP", "FUNCTOR?", 1, 0, false);
        declareFunction("functor_p", "FUNCTOR-P", 1, 0, false);
        declareFunction("non_predicate_functionP", "NON-PREDICATE-FUNCTION?", 1, 0, false);
        declareFunction("functionP", "FUNCTION?", 1, 0, false);
        declareFunction("isa_functionP", "ISA-FUNCTION?", 1, 1, false);
        declareFunction("fixed_arity_functor_p", "FIXED-ARITY-FUNCTOR-P", 1, 0, false);
        declareFunction("variable_arity_functor_p", "VARIABLE-ARITY-FUNCTOR-P", 1, 0, false);
        declareFunction("mt_in_any_mtP", "MT-IN-ANY-MT?", 1, 0, false);
        declareFunction("mtP", "MT?", 1, 0, false);
        declareFunction("microtheory_p", "MICROTHEORY-P", 1, 0, false);
        declareFunction("isa_mtP", "ISA-MT?", 1, 1, false);
        declareFunction("random_mt", "RANDOM-MT", 0, 0, false);
        declareFunction("print_code_for_new_fort_type", "PRINT-CODE-FOR-NEW-FORT-TYPE", 1, 0, false);
        declareFunction("generate_code_for_new_fort_type", "GENERATE-CODE-FOR-NEW-FORT-TYPE", 1, 0, false);
        declareFunction("relation_p", "RELATION-P", 1, 0, false);
        declareFunction("isa_relationP", "ISA-RELATION?", 1, 1, false);
        declareFunction("sentential_relation_p", "SENTENTIAL-RELATION-P", 1, 0, false);
        declareFunction("isa_sentential_relationP", "ISA-SENTENTIAL-RELATION?", 1, 1, false);
        declareFunction("anti_symmetric_binary_predicate_p", "ANTI-SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_anti_symmetric_binary_predicateP", "ISA-ANTI-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("anti_transitive_binary_predicate_p", "ANTI-TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_anti_transitive_binary_predicateP", "ISA-ANTI-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("arg_type_binary_predicate_p", "ARG-TYPE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_arg_type_binary_predicateP", "ISA-ARG-TYPE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_quoted_isa_binary_predicateP", "ISA-ARG-QUOTED-ISA-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_format_binary_predicateP", "ISA-ARG-FORMAT-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("arg_type_ternary_predicate_p", "ARG-TYPE-TERNARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_arg_type_ternary_predicateP", "ISA-ARG-TYPE-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_quoted_isa_ternary_predicateP", "ISA-ARG-QUOTED-ISA-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_format_ternary_predicateP", "ISA-ARG-FORMAT-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction("asymmetric_binary_predicate_p", "ASYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_asymmetric_binary_predicateP", "ISA-ASYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("bookkeeping_predicate_p", "BOOKKEEPING-PREDICATE-P", 1, 0, false);
        declareFunction("isa_bookkeeping_predicateP", "ISA-BOOKKEEPING-PREDICATE?", 1, 1, false);
        declareFunction("underspecified_predicate_p", "UNDERSPECIFIED-PREDICATE-P", 1, 1, false);
        declareFunction("isa_underspecified_predicateP", "ISA-UNDERSPECIFIED-PREDICATE?", 1, 1, false);
        declareFunction("broad_microtheory_p", "BROAD-MICROTHEORY-P", 1, 0, false);
        declareFunction("isa_broad_microtheoryP", "ISA-BROAD-MICROTHEORY?", 1, 1, false);
        declareFunction("commutative_relationP", "COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction("commutative_relation_p", "COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction("isa_commutative_relationP", "ISA-COMMUTATIVE-RELATION?", 1, 1, false);
        declareFunction("commutative_predicate_p", "COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction("isa_commutative_predicateP", "ISA-COMMUTATIVE-PREDICATE?", 1, 1, false);
        declareFunction("distributing_meta_knowledge_predicate_p", "DISTRIBUTING-META-KNOWLEDGE-PREDICATE-P", 1, 0, false);
        declareFunction("isa_distributing_meta_knowledge_predicateP", "ISA-DISTRIBUTING-META-KNOWLEDGE-PREDICATE?", 1, 1, false);
        declareFunction("forts_typed_distributing_meta_knowledge_predicate", "FORTS-TYPED-DISTRIBUTING-META-KNOWLEDGE-PREDICATE", 0, 0, false);
        declareFunction("el_relation_p", "EL-RELATION-P", 1, 0, false);
        declareFunction("isa_el_relationP", "ISA-EL-RELATION?", 1, 1, false);
        declareFunction("evaluatable_function_p", "EVALUATABLE-FUNCTION-P", 1, 0, false);
        declareFunction("isa_evaluatable_functionP", "ISA-EVALUATABLE-FUNCTION?", 1, 1, false);
        declareFunction("evaluatable_predicate_p", "EVALUATABLE-PREDICATE-P", 1, 1, false);
        declareFunction("isa_evaluatable_predicateP", "ISA-EVALUATABLE-PREDICATE?", 1, 1, false);
        declareFunction("existential_quantifier_p", "EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction("isa_existential_quantifierP", "ISA-EXISTENTIAL-QUANTIFIER?", 1, 1, false);
        declareFunction("irreflexive_binary_predicate_p", "IRREFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_irreflexive_binary_predicateP", "ISA-IRREFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("logical_connective_p", "LOGICAL-CONNECTIVE-P", 1, 0, false);
        declareFunction("isa_logical_connectiveP", "ISA-LOGICAL-CONNECTIVE?", 1, 1, false);
        declareFunction("microtheory_designating_relation_p", "MICROTHEORY-DESIGNATING-RELATION-P", 1, 0, false);
        declareFunction("isa_microtheory_designating_relationP", "ISA-MICROTHEORY-DESIGNATING-RELATION?", 1, 1, false);
        declareFunction("partially_commutative_relation_p", "PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction("isa_partially_commutative_relationP", "ISA-PARTIALLY-COMMUTATIVE-RELATION?", 1, 1, false);
        declareFunction("partially_commutative_predicate_p", "PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction("isa_partially_commutative_predicateP", "ISA-PARTIALLY-COMMUTATIVE-PREDICATE?", 1, 1, false);
        declareFunction("problem_solving_context_p", "PROBLEM-SOLVING-CONTEXT-P", 1, 0, false);
        declareFunction("isa_problem_solving_contextP", "ISA-PROBLEM-SOLVING-CONTEXT?", 1, 1, false);
        declareFunction("quantifier_p", "QUANTIFIER-P", 1, 0, false);
        declareFunction("isa_quantifierP", "ISA-QUANTIFIER?", 1, 1, false);
        declareFunction("reflexive_binary_predicate_p", "REFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_reflexive_binary_predicateP", "ISA-REFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("reifiable_function_p", "REIFIABLE-FUNCTION-P", 1, 0, false);
        declareFunction("isa_reifiable_functionP", "ISA-REIFIABLE-FUNCTION?", 1, 1, false);
        declareFunction("rule_macro_predicate_p", "RULE-MACRO-PREDICATE-P", 1, 0, false);
        declareFunction("isa_rule_macro_predicateP", "ISA-RULE-MACRO-PREDICATE?", 1, 1, false);
        declareFunction("scoping_relation_p", "SCOPING-RELATION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.fort_types_interface.$scoping_relation_p$UnaryFunction();
        declareFunction("isa_scoping_relationP", "ISA-SCOPING-RELATION?", 1, 1, false);
        declareFunction("sibling_disjoint_collection_p", "SIBLING-DISJOINT-COLLECTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.fort_types_interface.$sibling_disjoint_collection_p$UnaryFunction();
        declareFunction("isa_sibling_disjoint_collectionP", "ISA-SIBLING-DISJOINT-COLLECTION?", 1, 1, false);
        declareFunction("forts_typed_sibling_disjoint_collection", "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION", 0, 0, false);
        declareFunction("skolem_functionP", "SKOLEM-FUNCTION?", 1, 1, false);
        declareFunction("skolem_function_p", "SKOLEM-FUNCTION-P", 1, 0, false);
        declareFunction("skolem_fort_p", "SKOLEM-FORT-P", 1, 0, false);
        declareFunction("isa_skolem_functionP", "ISA-SKOLEM-FUNCTION?", 1, 1, false);
        declareFunction("symmetric_binary_predicate_p", "SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_symmetric_binary_predicateP", "ISA-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("transitive_binary_predicate_p", "TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_transitive_binary_predicateP", "ISA-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("variable_arity_relation_p", "VARIABLE-ARITY-RELATION-P", 1, 0, false);
        declareFunction("isa_variable_arity_relationP", "ISA-VARIABLE-ARITY-RELATION?", 1, 1, false);
        declareFunction("documentation_predicate_p", "DOCUMENTATION-PREDICATE-P", 1, 1, false);
        declareFunction("isa_documentation_predicateP", "ISA-DOCUMENTATION-PREDICATE?", 1, 1, false);
        declareFunction("sksi_content_microtheory_p", "SKSI-CONTENT-MICROTHEORY-P", 1, 1, false);
        declareFunction("isa_sksi_content_microtheoryP", "ISA-SKSI-CONTENT-MICROTHEORY?", 1, 1, false);
        declareFunction("sksi_external_term_denoting_function_p", "SKSI-EXTERNAL-TERM-DENOTING-FUNCTION-P", 1, 0, false);
        declareFunction("isa_sksi_external_term_denoting_functionP", "ISA-SKSI-EXTERNAL-TERM-DENOTING-FUNCTION?", 1, 0, false);
        declareFunction("sksi_supported_comparison_predicate_p", "SKSI-SUPPORTED-COMPARISON-PREDICATE-P", 1, 0, false);
        declareFunction("isa_sksi_supported_comparison_predicateP", "ISA-SKSI-SUPPORTED-COMPARISON-PREDICATE?", 1, 0, false);
        declareFunction("sksi_supported_function_p", "SKSI-SUPPORTED-FUNCTION-P", 1, 0, false);
        declareFunction("isa_sksi_supported_functionP", "ISA-SKSI-SUPPORTED-FUNCTION?", 1, 0, false);
        declareFunction("csql_comparison_predicate_p", "CSQL-COMPARISON-PREDICATE-P", 1, 0, false);
        declareFunction("isa_csql_comparison_predicateP", "ISA-CSQL-COMPARISON-PREDICATE?", 1, 0, false);
        declareFunction("sksi_supported_constant_p", "SKSI-SUPPORTED-CONSTANT-P", 1, 0, false);
        declareFunction("isa_sksi_supported_constantP", "ISA-SKSI-SUPPORTED-CONSTANT?", 1, 0, false);
        declareFunction("csql_function_p", "CSQL-FUNCTION-P", 1, 0, false);
        declareFunction("isa_csql_functionP", "ISA-CSQL-FUNCTION?", 1, 0, false);
        declareFunction("csql_logical_connective_p", "CSQL-LOGICAL-CONNECTIVE-P", 1, 0, false);
        declareFunction("isa_csql_logical_connectiveP", "ISA-CSQL-LOGICAL-CONNECTIVE?", 1, 0, false);
        declareFunction("csql_quantifier_p", "CSQL-QUANTIFIER-P", 1, 0, false);
        declareFunction("isa_csql_quantifierP", "ISA-CSQL-QUANTIFIER?", 1, 0, false);
        declareFunction("csql_constant_p", "CSQL-CONSTANT-P", 1, 0, false);
        declareFunction("isa_csql_constantP", "ISA-CSQL-CONSTANT?", 1, 0, false);
        declareFunction("nl_definiteness_attributeP", "NL-DEFINITENESS-ATTRIBUTE?", 1, 0, false);
        declareFunction("nl_quant_attributeP", "NL-QUANT-ATTRIBUTE?", 1, 0, false);
        declareFunction("bounded_existential_quantifier_p", "BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction("evaluatable_relation_contextualized_p", "EVALUATABLE-RELATION-CONTEXTUALIZED-P", 1, 0, false);
        declareFunction("isa_evaluatable_relation_contextualizedP", "ISA-EVALUATABLE-RELATION-CONTEXTUALIZED?", 1, 1, false);
        declareFunction("public_constantP", "PUBLIC-CONSTANT?", 1, 0, false);
        declareFunction("non_public_constantP", "NON-PUBLIC-CONSTANT?", 1, 0, false);
        declareFunction("clear_proprietary_constantP", "CLEAR-PROPRIETARY-CONSTANT?", 0, 0, false);
        declareFunction("remove_proprietary_constantP", "REMOVE-PROPRIETARY-CONSTANT?", 1, 0, false);
        declareFunction("proprietary_constantP_internal", "PROPRIETARY-CONSTANT?-INTERNAL", 1, 0, false);
        declareFunction("proprietary_constantP", "PROPRIETARY-CONSTANT?", 1, 0, false);
        declareFunction("city_in_any_mtP_internal", "CITY-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction("city_in_any_mtP", "CITY-IN-ANY-MT?", 1, 0, false);
        declareFunction("geographical_region_in_any_mtP_internal", "GEOGRAPHICAL-REGION-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction("geographical_region_in_any_mtP", "GEOGRAPHICAL-REGION-IN-ANY-MT?", 1, 0, false);
        declareFunction("country_in_any_mtP_internal", "COUNTRY-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction("country_in_any_mtP", "COUNTRY-IN-ANY-MT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_fort_types_interface_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("fort_types", "FORT-TYPES", 1, 1, false);
            declareFunction("fort_has_typeP", "FORT-HAS-TYPE?", 2, 1, false);
            declareFunction("fort_has_cached_typeP", "FORT-HAS-CACHED-TYPE?", 2, 0, false);
            declareFunction("fort_has_type_in_any_mtP", "FORT-HAS-TYPE-IN-ANY-MT?", 2, 0, false);
            declareFunction("definitional_fort_type", "DEFINITIONAL-FORT-TYPE", 1, 1, false);
            declareFunction("select_definitional_type", "SELECT-DEFINITIONAL-TYPE", 1, 0, false);
            declareFunction("all_forts_of_type", "ALL-FORTS-OF-TYPE", 1, 0, false);
            declareFunction("genericP", "GENERIC?", 1, 0, false);
            declareFunction("collection_in_any_mtP", "COLLECTION-IN-ANY-MT?", 1, 0, false);
            declareFunction("collectionP", "COLLECTION?", 1, 0, false);
            declareFunction("collection_p", "COLLECTION-P", 1, 0, false);
            new fort_types_interface.$collection_p$UnaryFunction();
            declareFunction("collection_order", "COLLECTION-ORDER", 1, 0, false);
            declareFunction("random_collection", "RANDOM-COLLECTION", 0, 0, false);
            declareFunction("list_of_collections_p", "LIST-OF-COLLECTIONS-P", 1, 0, false);
            declareFunction("isa_collectionP", "ISA-COLLECTION?", 1, 1, false);
            declareFunction("isa_collection_in_any_mtP", "ISA-COLLECTION-IN-ANY-MT?", 1, 0, false);
            declareFunction("predicate_in_any_mtP", "PREDICATE-IN-ANY-MT?", 1, 0, false);
            declareFunction("predicateP", "PREDICATE?", 1, 0, false);
            declareFunction("predicate_p", "PREDICATE-P", 1, 0, false);
            new fort_types_interface.$predicate_p$UnaryFunction();
            declareFunction("list_of_predicates_p", "LIST-OF-PREDICATES-P", 1, 0, false);
            declareFunction("isa_predicateP", "ISA-PREDICATE?", 1, 1, false);
            declareFunction("list_of_predicatesP", "LIST-OF-PREDICATES?", 1, 0, false);
            declareFunction("fixed_arity_predicate_p", "FIXED-ARITY-PREDICATE-P", 1, 0, false);
            declareFunction("variable_arity_predicate_p", "VARIABLE-ARITY-PREDICATE-P", 1, 0, false);
            declareFunction("function_in_any_mtP", "FUNCTION-IN-ANY-MT?", 1, 0, false);
            declareFunction("functorP", "FUNCTOR?", 1, 0, false);
            declareFunction("functor_p", "FUNCTOR-P", 1, 0, false);
            declareFunction("non_predicate_functionP", "NON-PREDICATE-FUNCTION?", 1, 0, false);
            declareFunction("functionP", "FUNCTION?", 1, 0, false);
            declareFunction("isa_functionP", "ISA-FUNCTION?", 1, 1, false);
            declareFunction("fixed_arity_functor_p", "FIXED-ARITY-FUNCTOR-P", 1, 0, false);
            declareFunction("variable_arity_functor_p", "VARIABLE-ARITY-FUNCTOR-P", 1, 0, false);
            declareFunction("mt_in_any_mtP", "MT-IN-ANY-MT?", 1, 0, false);
            declareFunction("mtP", "MT?", 1, 0, false);
            declareFunction("microtheory_p", "MICROTHEORY-P", 1, 0, false);
            declareFunction("isa_mtP", "ISA-MT?", 1, 1, false);
            declareFunction("random_mt", "RANDOM-MT", 0, 0, false);
            declareFunction("relation_p", "RELATION-P", 1, 0, false);
            declareFunction("isa_relationP", "ISA-RELATION?", 1, 1, false);
            declareFunction("sentential_relation_p", "SENTENTIAL-RELATION-P", 1, 0, false);
            declareFunction("isa_sentential_relationP", "ISA-SENTENTIAL-RELATION?", 1, 1, false);
            declareFunction("anti_symmetric_binary_predicate_p", "ANTI-SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_anti_symmetric_binary_predicateP", "ISA-ANTI-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("anti_transitive_binary_predicate_p", "ANTI-TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_anti_transitive_binary_predicateP", "ISA-ANTI-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("arg_type_binary_predicate_p", "ARG-TYPE-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_arg_type_binary_predicateP", "ISA-ARG-TYPE-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("isa_arg_quoted_isa_binary_predicateP", "ISA-ARG-QUOTED-ISA-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("isa_arg_format_binary_predicateP", "ISA-ARG-FORMAT-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("arg_type_ternary_predicate_p", "ARG-TYPE-TERNARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_arg_type_ternary_predicateP", "ISA-ARG-TYPE-TERNARY-PREDICATE?", 1, 1, false);
            declareFunction("isa_arg_quoted_isa_ternary_predicateP", "ISA-ARG-QUOTED-ISA-TERNARY-PREDICATE?", 1, 1, false);
            declareFunction("isa_arg_format_ternary_predicateP", "ISA-ARG-FORMAT-TERNARY-PREDICATE?", 1, 1, false);
            declareFunction("asymmetric_binary_predicate_p", "ASYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_asymmetric_binary_predicateP", "ISA-ASYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("bookkeeping_predicate_p", "BOOKKEEPING-PREDICATE-P", 1, 0, false);
            declareFunction("isa_bookkeeping_predicateP", "ISA-BOOKKEEPING-PREDICATE?", 1, 1, false);
            declareFunction("underspecified_predicate_p", "UNDERSPECIFIED-PREDICATE-P", 1, 1, false);
            declareFunction("isa_underspecified_predicateP", "ISA-UNDERSPECIFIED-PREDICATE?", 1, 1, false);
            declareFunction("broad_microtheory_p", "BROAD-MICROTHEORY-P", 1, 0, false);
            declareFunction("isa_broad_microtheoryP", "ISA-BROAD-MICROTHEORY?", 1, 1, false);
            declareFunction("commutative_relationP", "COMMUTATIVE-RELATION?", 1, 0, false);
            declareFunction("commutative_relation_p", "COMMUTATIVE-RELATION-P", 1, 0, false);
            declareFunction("isa_commutative_relationP", "ISA-COMMUTATIVE-RELATION?", 1, 1, false);
            declareFunction("commutative_predicate_p", "COMMUTATIVE-PREDICATE-P", 1, 0, false);
            declareFunction("isa_commutative_predicateP", "ISA-COMMUTATIVE-PREDICATE?", 1, 1, false);
            declareFunction("distributing_meta_knowledge_predicate_p", "DISTRIBUTING-META-KNOWLEDGE-PREDICATE-P", 1, 0, false);
            declareFunction("isa_distributing_meta_knowledge_predicateP", "ISA-DISTRIBUTING-META-KNOWLEDGE-PREDICATE?", 1, 1, false);
            declareFunction("forts_typed_distributing_meta_knowledge_predicate", "FORTS-TYPED-DISTRIBUTING-META-KNOWLEDGE-PREDICATE", 0, 0, false);
            declareFunction("el_relation_p", "EL-RELATION-P", 1, 0, false);
            declareFunction("isa_el_relationP", "ISA-EL-RELATION?", 1, 1, false);
            declareFunction("evaluatable_function_p", "EVALUATABLE-FUNCTION-P", 1, 0, false);
            declareFunction("isa_evaluatable_functionP", "ISA-EVALUATABLE-FUNCTION?", 1, 1, false);
            declareFunction("evaluatable_predicate_p", "EVALUATABLE-PREDICATE-P", 1, 1, false);
            declareFunction("isa_evaluatable_predicateP", "ISA-EVALUATABLE-PREDICATE?", 1, 1, false);
            declareFunction("existential_quantifier_p", "EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
            declareFunction("isa_existential_quantifierP", "ISA-EXISTENTIAL-QUANTIFIER?", 1, 1, false);
            declareFunction("irreflexive_binary_predicate_p", "IRREFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_irreflexive_binary_predicateP", "ISA-IRREFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("logical_connective_p", "LOGICAL-CONNECTIVE-P", 1, 0, false);
            declareFunction("isa_logical_connectiveP", "ISA-LOGICAL-CONNECTIVE?", 1, 1, false);
            declareFunction("microtheory_designating_relation_p", "MICROTHEORY-DESIGNATING-RELATION-P", 1, 0, false);
            declareFunction("isa_microtheory_designating_relationP", "ISA-MICROTHEORY-DESIGNATING-RELATION?", 1, 1, false);
            declareFunction("partially_commutative_relation_p", "PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
            declareFunction("isa_partially_commutative_relationP", "ISA-PARTIALLY-COMMUTATIVE-RELATION?", 1, 1, false);
            declareFunction("partially_commutative_predicate_p", "PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
            declareFunction("isa_partially_commutative_predicateP", "ISA-PARTIALLY-COMMUTATIVE-PREDICATE?", 1, 1, false);
            declareFunction("problem_solving_context_p", "PROBLEM-SOLVING-CONTEXT-P", 1, 0, false);
            declareFunction("isa_problem_solving_contextP", "ISA-PROBLEM-SOLVING-CONTEXT?", 1, 1, false);
            declareFunction("quantifier_p", "QUANTIFIER-P", 1, 0, false);
            declareFunction("isa_quantifierP", "ISA-QUANTIFIER?", 1, 1, false);
            declareFunction("reflexive_binary_predicate_p", "REFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_reflexive_binary_predicateP", "ISA-REFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("reifiable_function_p", "REIFIABLE-FUNCTION-P", 1, 0, false);
            declareFunction("isa_reifiable_functionP", "ISA-REIFIABLE-FUNCTION?", 1, 1, false);
            declareFunction("rule_macro_predicate_p", "RULE-MACRO-PREDICATE-P", 1, 0, false);
            declareFunction("isa_rule_macro_predicateP", "ISA-RULE-MACRO-PREDICATE?", 1, 1, false);
            declareFunction("scoping_relation_p", "SCOPING-RELATION-P", 1, 0, false);
            new fort_types_interface.$scoping_relation_p$UnaryFunction();
            declareFunction("isa_scoping_relationP", "ISA-SCOPING-RELATION?", 1, 1, false);
            declareFunction("sibling_disjoint_collection_p", "SIBLING-DISJOINT-COLLECTION-P", 1, 0, false);
            new fort_types_interface.$sibling_disjoint_collection_p$UnaryFunction();
            declareFunction("isa_sibling_disjoint_collectionP", "ISA-SIBLING-DISJOINT-COLLECTION?", 1, 1, false);
            declareFunction("forts_typed_sibling_disjoint_collection", "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION", 0, 0, false);
            declareFunction("disjoint_collection_p", "DISJOINT-COLLECTION-P", 1, 0, false);
            declareFunction("skolem_functionP", "SKOLEM-FUNCTION?", 1, 1, false);
            declareFunction("skolem_function_p", "SKOLEM-FUNCTION-P", 1, 0, false);
            declareFunction("skolem_fort_p", "SKOLEM-FORT-P", 1, 0, false);
            declareFunction("isa_skolem_functionP", "ISA-SKOLEM-FUNCTION?", 1, 1, false);
            declareFunction("symmetric_binary_predicate_p", "SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_symmetric_binary_predicateP", "ISA-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("transitive_binary_predicate_p", "TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
            declareFunction("isa_transitive_binary_predicateP", "ISA-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
            declareFunction("variable_arity_relation_p", "VARIABLE-ARITY-RELATION-P", 1, 0, false);
            declareFunction("isa_variable_arity_relationP", "ISA-VARIABLE-ARITY-RELATION?", 1, 1, false);
            declareFunction("documentation_predicate_p", "DOCUMENTATION-PREDICATE-P", 1, 1, false);
            declareFunction("isa_documentation_predicateP", "ISA-DOCUMENTATION-PREDICATE?", 1, 1, false);
            declareFunction("sksi_content_microtheory_p", "SKSI-CONTENT-MICROTHEORY-P", 1, 1, false);
            declareFunction("isa_sksi_content_microtheoryP", "ISA-SKSI-CONTENT-MICROTHEORY?", 1, 1, false);
            declareFunction("sksi_external_term_denoting_function_p", "SKSI-EXTERNAL-TERM-DENOTING-FUNCTION-P", 1, 0, false);
            declareFunction("isa_sksi_external_term_denoting_functionP", "ISA-SKSI-EXTERNAL-TERM-DENOTING-FUNCTION?", 1, 0, false);
            declareFunction("sksi_supported_comparison_predicate_p", "SKSI-SUPPORTED-COMPARISON-PREDICATE-P", 1, 0, false);
            declareFunction("isa_sksi_supported_comparison_predicateP", "ISA-SKSI-SUPPORTED-COMPARISON-PREDICATE?", 1, 0, false);
            declareFunction("sksi_supported_function_p", "SKSI-SUPPORTED-FUNCTION-P", 1, 0, false);
            declareFunction("isa_sksi_supported_functionP", "ISA-SKSI-SUPPORTED-FUNCTION?", 1, 0, false);
            declareFunction("csql_comparison_predicate_p", "CSQL-COMPARISON-PREDICATE-P", 1, 0, false);
            declareFunction("isa_csql_comparison_predicateP", "ISA-CSQL-COMPARISON-PREDICATE?", 1, 0, false);
            declareFunction("sksi_supported_constant_p", "SKSI-SUPPORTED-CONSTANT-P", 1, 0, false);
            declareFunction("isa_sksi_supported_constantP", "ISA-SKSI-SUPPORTED-CONSTANT?", 1, 0, false);
            declareFunction("csql_function_p", "CSQL-FUNCTION-P", 1, 0, false);
            declareFunction("isa_csql_functionP", "ISA-CSQL-FUNCTION?", 1, 0, false);
            declareFunction("csql_logical_connective_p", "CSQL-LOGICAL-CONNECTIVE-P", 1, 0, false);
            declareFunction("isa_csql_logical_connectiveP", "ISA-CSQL-LOGICAL-CONNECTIVE?", 1, 0, false);
            declareFunction("csql_quantifier_p", "CSQL-QUANTIFIER-P", 1, 0, false);
            declareFunction("isa_csql_quantifierP", "ISA-CSQL-QUANTIFIER?", 1, 0, false);
            declareFunction("csql_constant_p", "CSQL-CONSTANT-P", 1, 0, false);
            declareFunction("isa_csql_constantP", "ISA-CSQL-CONSTANT?", 1, 0, false);
            declareFunction("nl_definiteness_attributeP", "NL-DEFINITENESS-ATTRIBUTE?", 1, 0, false);
            declareFunction("nl_quant_attributeP", "NL-QUANT-ATTRIBUTE?", 1, 0, false);
            declareFunction("bounded_existential_quantifier_p", "BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
            declareFunction("evaluatable_relation_contextualized_p", "EVALUATABLE-RELATION-CONTEXTUALIZED-P", 1, 0, false);
            declareFunction("isa_evaluatable_relation_contextualizedP", "ISA-EVALUATABLE-RELATION-CONTEXTUALIZED?", 1, 1, false);
            declareFunction("public_constantP", "PUBLIC-CONSTANT?", 1, 0, false);
            declareFunction("non_public_constantP", "NON-PUBLIC-CONSTANT?", 1, 0, false);
            declareFunction("clear_proprietary_constantP", "CLEAR-PROPRIETARY-CONSTANT?", 0, 0, false);
            declareFunction("remove_proprietary_constantP", "REMOVE-PROPRIETARY-CONSTANT?", 1, 0, false);
            declareFunction("proprietary_constantP_internal", "PROPRIETARY-CONSTANT?-INTERNAL", 1, 0, false);
            declareFunction("proprietary_constantP", "PROPRIETARY-CONSTANT?", 1, 0, false);
            declareFunction("clear_proprietary_termP", "CLEAR-PROPRIETARY-TERM?", 0, 0, false);
            declareFunction("remove_proprietary_termP", "REMOVE-PROPRIETARY-TERM?", 1, 0, false);
            declareFunction("proprietary_termP_internal", "PROPRIETARY-TERM?-INTERNAL", 1, 0, false);
            declareFunction("proprietary_termP", "PROPRIETARY-TERM?", 1, 0, false);
            declareFunction("obsolete_constantP", "OBSOLETE-CONSTANT?", 1, 0, false);
            declareFunction("city_in_any_mtP_internal", "CITY-IN-ANY-MT?-INTERNAL", 1, 0, false);
            declareFunction("city_in_any_mtP", "CITY-IN-ANY-MT?", 1, 0, false);
            declareFunction("geographical_region_in_any_mtP_internal", "GEOGRAPHICAL-REGION-IN-ANY-MT?-INTERNAL", 1, 0, false);
            declareFunction("geographical_region_in_any_mtP", "GEOGRAPHICAL-REGION-IN-ANY-MT?", 1, 0, false);
            declareFunction("country_in_any_mtP_internal", "COUNTRY-IN-ANY-MT?-INTERNAL", 1, 0, false);
            declareFunction("country_in_any_mtP", "COUNTRY-IN-ANY-MT?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("print_code_for_new_fort_type", "PRINT-CODE-FOR-NEW-FORT-TYPE", 1, 0, false);
            declareFunction("generate_code_for_new_fort_type", "GENERATE-CODE-FOR-NEW-FORT-TYPE", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_fort_types_interface_file_Previous() {
        declareFunction("fort_types", "FORT-TYPES", 1, 1, false);
        declareFunction("fort_has_typeP", "FORT-HAS-TYPE?", 2, 1, false);
        declareFunction("fort_has_cached_typeP", "FORT-HAS-CACHED-TYPE?", 2, 0, false);
        declareFunction("fort_has_type_in_any_mtP", "FORT-HAS-TYPE-IN-ANY-MT?", 2, 0, false);
        declareFunction("definitional_fort_type", "DEFINITIONAL-FORT-TYPE", 1, 1, false);
        declareFunction("select_definitional_type", "SELECT-DEFINITIONAL-TYPE", 1, 0, false);
        declareFunction("all_forts_of_type", "ALL-FORTS-OF-TYPE", 1, 0, false);
        declareFunction("genericP", "GENERIC?", 1, 0, false);
        declareFunction("collection_in_any_mtP", "COLLECTION-IN-ANY-MT?", 1, 0, false);
        declareFunction("collectionP", "COLLECTION?", 1, 0, false);
        declareFunction("collection_p", "COLLECTION-P", 1, 0, false);
        new fort_types_interface.$collection_p$UnaryFunction();
        declareFunction("collection_order", "COLLECTION-ORDER", 1, 0, false);
        declareFunction("random_collection", "RANDOM-COLLECTION", 0, 0, false);
        declareFunction("list_of_collections_p", "LIST-OF-COLLECTIONS-P", 1, 0, false);
        declareFunction("isa_collectionP", "ISA-COLLECTION?", 1, 1, false);
        declareFunction("isa_collection_in_any_mtP", "ISA-COLLECTION-IN-ANY-MT?", 1, 0, false);
        declareFunction("predicate_in_any_mtP", "PREDICATE-IN-ANY-MT?", 1, 0, false);
        declareFunction("predicateP", "PREDICATE?", 1, 0, false);
        declareFunction("predicate_p", "PREDICATE-P", 1, 0, false);
        new fort_types_interface.$predicate_p$UnaryFunction();
        declareFunction("list_of_predicates_p", "LIST-OF-PREDICATES-P", 1, 0, false);
        declareFunction("isa_predicateP", "ISA-PREDICATE?", 1, 1, false);
        declareFunction("list_of_predicatesP", "LIST-OF-PREDICATES?", 1, 0, false);
        declareFunction("fixed_arity_predicate_p", "FIXED-ARITY-PREDICATE-P", 1, 0, false);
        declareFunction("variable_arity_predicate_p", "VARIABLE-ARITY-PREDICATE-P", 1, 0, false);
        declareFunction("function_in_any_mtP", "FUNCTION-IN-ANY-MT?", 1, 0, false);
        declareFunction("functorP", "FUNCTOR?", 1, 0, false);
        declareFunction("functor_p", "FUNCTOR-P", 1, 0, false);
        declareFunction("non_predicate_functionP", "NON-PREDICATE-FUNCTION?", 1, 0, false);
        declareFunction("functionP", "FUNCTION?", 1, 0, false);
        declareFunction("isa_functionP", "ISA-FUNCTION?", 1, 1, false);
        declareFunction("fixed_arity_functor_p", "FIXED-ARITY-FUNCTOR-P", 1, 0, false);
        declareFunction("variable_arity_functor_p", "VARIABLE-ARITY-FUNCTOR-P", 1, 0, false);
        declareFunction("mt_in_any_mtP", "MT-IN-ANY-MT?", 1, 0, false);
        declareFunction("mtP", "MT?", 1, 0, false);
        declareFunction("microtheory_p", "MICROTHEORY-P", 1, 0, false);
        declareFunction("isa_mtP", "ISA-MT?", 1, 1, false);
        declareFunction("random_mt", "RANDOM-MT", 0, 0, false);
        declareFunction("relation_p", "RELATION-P", 1, 0, false);
        declareFunction("isa_relationP", "ISA-RELATION?", 1, 1, false);
        declareFunction("sentential_relation_p", "SENTENTIAL-RELATION-P", 1, 0, false);
        declareFunction("isa_sentential_relationP", "ISA-SENTENTIAL-RELATION?", 1, 1, false);
        declareFunction("anti_symmetric_binary_predicate_p", "ANTI-SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_anti_symmetric_binary_predicateP", "ISA-ANTI-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("anti_transitive_binary_predicate_p", "ANTI-TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_anti_transitive_binary_predicateP", "ISA-ANTI-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("arg_type_binary_predicate_p", "ARG-TYPE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_arg_type_binary_predicateP", "ISA-ARG-TYPE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_quoted_isa_binary_predicateP", "ISA-ARG-QUOTED-ISA-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_format_binary_predicateP", "ISA-ARG-FORMAT-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("arg_type_ternary_predicate_p", "ARG-TYPE-TERNARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_arg_type_ternary_predicateP", "ISA-ARG-TYPE-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_quoted_isa_ternary_predicateP", "ISA-ARG-QUOTED-ISA-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction("isa_arg_format_ternary_predicateP", "ISA-ARG-FORMAT-TERNARY-PREDICATE?", 1, 1, false);
        declareFunction("asymmetric_binary_predicate_p", "ASYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_asymmetric_binary_predicateP", "ISA-ASYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("bookkeeping_predicate_p", "BOOKKEEPING-PREDICATE-P", 1, 0, false);
        declareFunction("isa_bookkeeping_predicateP", "ISA-BOOKKEEPING-PREDICATE?", 1, 1, false);
        declareFunction("underspecified_predicate_p", "UNDERSPECIFIED-PREDICATE-P", 1, 1, false);
        declareFunction("isa_underspecified_predicateP", "ISA-UNDERSPECIFIED-PREDICATE?", 1, 1, false);
        declareFunction("broad_microtheory_p", "BROAD-MICROTHEORY-P", 1, 0, false);
        declareFunction("isa_broad_microtheoryP", "ISA-BROAD-MICROTHEORY?", 1, 1, false);
        declareFunction("commutative_relationP", "COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction("commutative_relation_p", "COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction("isa_commutative_relationP", "ISA-COMMUTATIVE-RELATION?", 1, 1, false);
        declareFunction("commutative_predicate_p", "COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction("isa_commutative_predicateP", "ISA-COMMUTATIVE-PREDICATE?", 1, 1, false);
        declareFunction("distributing_meta_knowledge_predicate_p", "DISTRIBUTING-META-KNOWLEDGE-PREDICATE-P", 1, 0, false);
        declareFunction("isa_distributing_meta_knowledge_predicateP", "ISA-DISTRIBUTING-META-KNOWLEDGE-PREDICATE?", 1, 1, false);
        declareFunction("forts_typed_distributing_meta_knowledge_predicate", "FORTS-TYPED-DISTRIBUTING-META-KNOWLEDGE-PREDICATE", 0, 0, false);
        declareFunction("el_relation_p", "EL-RELATION-P", 1, 0, false);
        declareFunction("isa_el_relationP", "ISA-EL-RELATION?", 1, 1, false);
        declareFunction("evaluatable_function_p", "EVALUATABLE-FUNCTION-P", 1, 0, false);
        declareFunction("isa_evaluatable_functionP", "ISA-EVALUATABLE-FUNCTION?", 1, 1, false);
        declareFunction("evaluatable_predicate_p", "EVALUATABLE-PREDICATE-P", 1, 1, false);
        declareFunction("isa_evaluatable_predicateP", "ISA-EVALUATABLE-PREDICATE?", 1, 1, false);
        declareFunction("existential_quantifier_p", "EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction("isa_existential_quantifierP", "ISA-EXISTENTIAL-QUANTIFIER?", 1, 1, false);
        declareFunction("irreflexive_binary_predicate_p", "IRREFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_irreflexive_binary_predicateP", "ISA-IRREFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("logical_connective_p", "LOGICAL-CONNECTIVE-P", 1, 0, false);
        declareFunction("isa_logical_connectiveP", "ISA-LOGICAL-CONNECTIVE?", 1, 1, false);
        declareFunction("microtheory_designating_relation_p", "MICROTHEORY-DESIGNATING-RELATION-P", 1, 0, false);
        declareFunction("isa_microtheory_designating_relationP", "ISA-MICROTHEORY-DESIGNATING-RELATION?", 1, 1, false);
        declareFunction("partially_commutative_relation_p", "PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction("isa_partially_commutative_relationP", "ISA-PARTIALLY-COMMUTATIVE-RELATION?", 1, 1, false);
        declareFunction("partially_commutative_predicate_p", "PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction("isa_partially_commutative_predicateP", "ISA-PARTIALLY-COMMUTATIVE-PREDICATE?", 1, 1, false);
        declareFunction("problem_solving_context_p", "PROBLEM-SOLVING-CONTEXT-P", 1, 0, false);
        declareFunction("isa_problem_solving_contextP", "ISA-PROBLEM-SOLVING-CONTEXT?", 1, 1, false);
        declareFunction("quantifier_p", "QUANTIFIER-P", 1, 0, false);
        declareFunction("isa_quantifierP", "ISA-QUANTIFIER?", 1, 1, false);
        declareFunction("reflexive_binary_predicate_p", "REFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_reflexive_binary_predicateP", "ISA-REFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("reifiable_function_p", "REIFIABLE-FUNCTION-P", 1, 0, false);
        declareFunction("isa_reifiable_functionP", "ISA-REIFIABLE-FUNCTION?", 1, 1, false);
        declareFunction("rule_macro_predicate_p", "RULE-MACRO-PREDICATE-P", 1, 0, false);
        declareFunction("isa_rule_macro_predicateP", "ISA-RULE-MACRO-PREDICATE?", 1, 1, false);
        declareFunction("scoping_relation_p", "SCOPING-RELATION-P", 1, 0, false);
        new fort_types_interface.$scoping_relation_p$UnaryFunction();
        declareFunction("isa_scoping_relationP", "ISA-SCOPING-RELATION?", 1, 1, false);
        declareFunction("sibling_disjoint_collection_p", "SIBLING-DISJOINT-COLLECTION-P", 1, 0, false);
        new fort_types_interface.$sibling_disjoint_collection_p$UnaryFunction();
        declareFunction("isa_sibling_disjoint_collectionP", "ISA-SIBLING-DISJOINT-COLLECTION?", 1, 1, false);
        declareFunction("forts_typed_sibling_disjoint_collection", "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION", 0, 0, false);
        declareFunction("disjoint_collection_p", "DISJOINT-COLLECTION-P", 1, 0, false);
        declareFunction("skolem_functionP", "SKOLEM-FUNCTION?", 1, 1, false);
        declareFunction("skolem_function_p", "SKOLEM-FUNCTION-P", 1, 0, false);
        declareFunction("skolem_fort_p", "SKOLEM-FORT-P", 1, 0, false);
        declareFunction("isa_skolem_functionP", "ISA-SKOLEM-FUNCTION?", 1, 1, false);
        declareFunction("symmetric_binary_predicate_p", "SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_symmetric_binary_predicateP", "ISA-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("transitive_binary_predicate_p", "TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
        declareFunction("isa_transitive_binary_predicateP", "ISA-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
        declareFunction("variable_arity_relation_p", "VARIABLE-ARITY-RELATION-P", 1, 0, false);
        declareFunction("isa_variable_arity_relationP", "ISA-VARIABLE-ARITY-RELATION?", 1, 1, false);
        declareFunction("documentation_predicate_p", "DOCUMENTATION-PREDICATE-P", 1, 1, false);
        declareFunction("isa_documentation_predicateP", "ISA-DOCUMENTATION-PREDICATE?", 1, 1, false);
        declareFunction("sksi_content_microtheory_p", "SKSI-CONTENT-MICROTHEORY-P", 1, 1, false);
        declareFunction("isa_sksi_content_microtheoryP", "ISA-SKSI-CONTENT-MICROTHEORY?", 1, 1, false);
        declareFunction("sksi_external_term_denoting_function_p", "SKSI-EXTERNAL-TERM-DENOTING-FUNCTION-P", 1, 0, false);
        declareFunction("isa_sksi_external_term_denoting_functionP", "ISA-SKSI-EXTERNAL-TERM-DENOTING-FUNCTION?", 1, 0, false);
        declareFunction("sksi_supported_comparison_predicate_p", "SKSI-SUPPORTED-COMPARISON-PREDICATE-P", 1, 0, false);
        declareFunction("isa_sksi_supported_comparison_predicateP", "ISA-SKSI-SUPPORTED-COMPARISON-PREDICATE?", 1, 0, false);
        declareFunction("sksi_supported_function_p", "SKSI-SUPPORTED-FUNCTION-P", 1, 0, false);
        declareFunction("isa_sksi_supported_functionP", "ISA-SKSI-SUPPORTED-FUNCTION?", 1, 0, false);
        declareFunction("csql_comparison_predicate_p", "CSQL-COMPARISON-PREDICATE-P", 1, 0, false);
        declareFunction("isa_csql_comparison_predicateP", "ISA-CSQL-COMPARISON-PREDICATE?", 1, 0, false);
        declareFunction("sksi_supported_constant_p", "SKSI-SUPPORTED-CONSTANT-P", 1, 0, false);
        declareFunction("isa_sksi_supported_constantP", "ISA-SKSI-SUPPORTED-CONSTANT?", 1, 0, false);
        declareFunction("csql_function_p", "CSQL-FUNCTION-P", 1, 0, false);
        declareFunction("isa_csql_functionP", "ISA-CSQL-FUNCTION?", 1, 0, false);
        declareFunction("csql_logical_connective_p", "CSQL-LOGICAL-CONNECTIVE-P", 1, 0, false);
        declareFunction("isa_csql_logical_connectiveP", "ISA-CSQL-LOGICAL-CONNECTIVE?", 1, 0, false);
        declareFunction("csql_quantifier_p", "CSQL-QUANTIFIER-P", 1, 0, false);
        declareFunction("isa_csql_quantifierP", "ISA-CSQL-QUANTIFIER?", 1, 0, false);
        declareFunction("csql_constant_p", "CSQL-CONSTANT-P", 1, 0, false);
        declareFunction("isa_csql_constantP", "ISA-CSQL-CONSTANT?", 1, 0, false);
        declareFunction("nl_definiteness_attributeP", "NL-DEFINITENESS-ATTRIBUTE?", 1, 0, false);
        declareFunction("nl_quant_attributeP", "NL-QUANT-ATTRIBUTE?", 1, 0, false);
        declareFunction("bounded_existential_quantifier_p", "BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction("evaluatable_relation_contextualized_p", "EVALUATABLE-RELATION-CONTEXTUALIZED-P", 1, 0, false);
        declareFunction("isa_evaluatable_relation_contextualizedP", "ISA-EVALUATABLE-RELATION-CONTEXTUALIZED?", 1, 1, false);
        declareFunction("public_constantP", "PUBLIC-CONSTANT?", 1, 0, false);
        declareFunction("non_public_constantP", "NON-PUBLIC-CONSTANT?", 1, 0, false);
        declareFunction("clear_proprietary_constantP", "CLEAR-PROPRIETARY-CONSTANT?", 0, 0, false);
        declareFunction("remove_proprietary_constantP", "REMOVE-PROPRIETARY-CONSTANT?", 1, 0, false);
        declareFunction("proprietary_constantP_internal", "PROPRIETARY-CONSTANT?-INTERNAL", 1, 0, false);
        declareFunction("proprietary_constantP", "PROPRIETARY-CONSTANT?", 1, 0, false);
        declareFunction("clear_proprietary_termP", "CLEAR-PROPRIETARY-TERM?", 0, 0, false);
        declareFunction("remove_proprietary_termP", "REMOVE-PROPRIETARY-TERM?", 1, 0, false);
        declareFunction("proprietary_termP_internal", "PROPRIETARY-TERM?-INTERNAL", 1, 0, false);
        declareFunction("proprietary_termP", "PROPRIETARY-TERM?", 1, 0, false);
        declareFunction("obsolete_constantP", "OBSOLETE-CONSTANT?", 1, 0, false);
        declareFunction("city_in_any_mtP_internal", "CITY-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction("city_in_any_mtP", "CITY-IN-ANY-MT?", 1, 0, false);
        declareFunction("geographical_region_in_any_mtP_internal", "GEOGRAPHICAL-REGION-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction("geographical_region_in_any_mtP", "GEOGRAPHICAL-REGION-IN-ANY-MT?", 1, 0, false);
        declareFunction("country_in_any_mtP_internal", "COUNTRY-IN-ANY-MT?-INTERNAL", 1, 0, false);
        declareFunction("country_in_any_mtP", "COUNTRY-IN-ANY-MT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_fort_types_interface_file() {
        deflexical("*PROPRIETARY-CONSTANT?-CACHING-STATE*", NIL);
        deflexical("*PROPRIETARY-TERM?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_fort_types_interface_file_alt() {
        register_cyc_api_function($sym27$COMMUTATIVE_RELATION_, $list_alt28, $str_alt29$Return_T_iff_RELATION_is_a_commut, NIL, $list_alt30);
        memoization_state.note_globally_cached_function($sym70$PROPRIETARY_CONSTANT_);
        memoization_state.note_memoized_function($sym75$CITY_IN_ANY_MT_);
        memoization_state.note_memoized_function($sym77$GEOGRAPHICAL_REGION_IN_ANY_MT_);
        memoization_state.note_memoized_function($sym79$COUNTRY_IN_ANY_MT_);
        return NIL;
    }

    public static SubLObject setup_fort_types_interface_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function($sym30$COMMUTATIVE_RELATION_, $list31, $str32$Return_T_iff_RELATION_is_a_commut, NIL, $list33);
            memoization_state.note_globally_cached_function($sym74$PROPRIETARY_CONSTANT_);
            memoization_state.note_globally_cached_function($sym78$PROPRIETARY_TERM_);
            memoization_state.note_memoized_function($sym83$CITY_IN_ANY_MT_);
            memoization_state.note_memoized_function($sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_);
            memoization_state.note_memoized_function($sym87$COUNTRY_IN_ANY_MT_);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function($sym27$COMMUTATIVE_RELATION_, $list_alt28, $str_alt29$Return_T_iff_RELATION_is_a_commut, NIL, $list_alt30);
            memoization_state.note_globally_cached_function($sym70$PROPRIETARY_CONSTANT_);
            memoization_state.note_memoized_function($sym75$CITY_IN_ANY_MT_);
            memoization_state.note_memoized_function($sym77$GEOGRAPHICAL_REGION_IN_ANY_MT_);
            memoization_state.note_memoized_function($sym79$COUNTRY_IN_ANY_MT_);
        }
        return NIL;
    }

    public static SubLObject setup_fort_types_interface_file_Previous() {
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

    static private final SubLSymbol $sym10$ISA_PREDICATE_ = makeSymbol("ISA-PREDICATE?");

    static private final SubLString $str_alt11$_a = makeString("~a");

    static private final SubLString $str_alt12$______as___define_public__a_p__fo = makeString("\n\n;; ~as\n\n(define-public ~a-p (fort &optional mt)\n  \"is FORT a ~a?\"\n  (ret (fort-has-type? fort ~a mt)))\n\n(define-public isa-~a? (term &optional mt)\n  \"is TERM a ~a?\"\n  (pif (fort-p term)\n       (ret (~a-p term mt))\n       (ret (cor (isa? term ~a mt)\n\t\t (quiet-sufficient-defns-admit? ~a term mt)))))\n\n");

    static private final SubLSymbol $sym27$COMMUTATIVE_RELATION_ = makeSymbol("COMMUTATIVE-RELATION?");

    static private final SubLList $list_alt28 = list(makeSymbol("RELATION"));

    static private final SubLString $str_alt29$Return_T_iff_RELATION_is_a_commut = makeString("Return T iff RELATION is a commutative relation.");

    static private final SubLList $list_alt30 = list(makeSymbol("BOOLEANP"));

    public static final SubLObject $const33$DistributingMetaKnowledgePredicat = reader_make_constant_shell("DistributingMetaKnowledgePredicate");

    public static final SubLObject $const68$EvaluatableRelation_Contextualize = reader_make_constant_shell("EvaluatableRelation-Contextualized");

    static private final SubLSymbol $sym70$PROPRIETARY_CONSTANT_ = makeSymbol("PROPRIETARY-CONSTANT?");

    static private final SubLSymbol $sym72$_PROPRIETARY_CONSTANT__CACHING_STATE_ = makeSymbol("*PROPRIETARY-CONSTANT?-CACHING-STATE*");

    static private final SubLSymbol $sym73$CLEAR_PROPRIETARY_CONSTANT_ = makeSymbol("CLEAR-PROPRIETARY-CONSTANT?");

    public static final SubLSymbol $kw74$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym75$CITY_IN_ANY_MT_ = makeSymbol("CITY-IN-ANY-MT?");

    static private final SubLSymbol $sym77$GEOGRAPHICAL_REGION_IN_ANY_MT_ = makeSymbol("GEOGRAPHICAL-REGION-IN-ANY-MT?");

    static private final SubLSymbol $sym79$COUNTRY_IN_ANY_MT_ = makeSymbol("COUNTRY-IN-ANY-MT?");
}

/**
 * Total time: 450 ms
 */
