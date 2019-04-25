package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class concept_filter extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.concept_filter";
    public static final String myFingerPrint = "e5b4bed4708e8c8c0b5db69ea2cf11d6746d194379157503815e1f3ee5e1a33e";
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 1247L)
    private static SubLSymbol $concept_filter_default_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 1405L)
    public static SubLSymbol $default_concept_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 1502L)
    private static SubLSymbol $default_concept_filter_specification$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 1569L)
    public static SubLSymbol $concept_filter_memoization_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2008L)
    private static SubLSymbol $concept_filter_specification_p_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3324L)
    private static SubLSymbol $concept_filter_all_isa_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3846L)
    private static SubLSymbol $specified_nodes_in_filter_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6682L)
    private static SubLSymbol $nodes_suppressed_from_filter_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6910L)
    private static SubLSymbol $organizing_nodes_for_filter_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7374L)
    private static SubLSymbol $filter_defn_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8169L)
    private static SubLSymbol $bad_for_taggingP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 11112L)
    private static SubLSymbol $decompose_concept_filter_spec_caching_state$;
    private static final SubLObject $const0$InferencePSC;
    private static final SubLObject $const1$TaxonomyOfEasilyUnderstandableCon;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$WITH_MEMOIZATION_STATE;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CONCEPT_FILTER_SPECIFICATION_P;
    private static final SubLObject $const7$ConceptFilterSpecificationFn;
    private static final SubLObject $const8$isa;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$_CONCEPT_FILTER_SPECIFICATION_P_CACHING_STATE_;
    private static final SubLInteger $int11$50;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$NODES_FOR_CONCEPT_FILTER_AFTER_ADDING;
    private static final SubLSymbol $sym14$NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING;
    private static final SubLSymbol $sym15$CONCEPT_FILTER_ALL_ISA;
    private static final SubLSymbol $sym16$NART_SUBSTITUTE;
    private static final SubLSymbol $sym17$_VAR0;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$_CONCEPT_FILTER_ALL_ISA_CACHING_STATE_;
    private static final SubLInteger $int20$500;
    private static final SubLSymbol $sym21$CLEAR_CONCEPT_FILTER_ALL_ISA;
    private static final SubLSymbol $sym22$SPECIFIED_NODES_IN_FILTER;
    private static final SubLSymbol $sym23$_X;
    private static final SubLObject $const24$nodeInSystem;
    private static final SubLList $list25;
    private static final SubLString $str26$collectionAndSpecsInConceptFilter;
    private static final SubLSymbol $kw27$GAF;
    private static final SubLSymbol $kw28$TRUE;
    private static final SubLSymbol $kw29$BREADTH;
    private static final SubLSymbol $kw30$QUEUE;
    private static final SubLSymbol $kw31$STACK;
    private static final SubLSymbol $sym32$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw33$ERROR;
    private static final SubLString $str34$_A_is_not_a__A;
    private static final SubLSymbol $sym35$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw36$CERROR;
    private static final SubLString $str37$continue_anyway;
    private static final SubLSymbol $kw38$WARN;
    private static final SubLString $str39$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const40$genls;
    private static final SubLString $str41$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str42$attempting_to_bind_direction_link;
    private static final SubLString $str43$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym44$_SPECIFIED_NODES_IN_FILTER_CACHING_STATE_;
    private static final SubLObject $const45$elementOf;
    private static final SubLObject $const46$TheSetOf;
    private static final SubLSymbol $sym47$NODES_SUPPRESSED_FROM_FILTER;
    private static final SubLSymbol $sym48$_NODE;
    private static final SubLObject $const49$suppressIndividualNode;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$_NODES_SUPPRESSED_FROM_FILTER_CACHING_STATE_;
    private static final SubLSymbol $sym52$CLEAR_NODES_SUPPRESSED_FROM_FILTER;
    private static final SubLSymbol $sym53$ORGANIZING_NODES_FOR_FILTER;
    private static final SubLObject $const54$classifyingNodeInFilter;
    private static final SubLSymbol $sym55$_ORGANIZING_NODES_FOR_FILTER_CACHING_STATE_;
    private static final SubLObject $const56$DecisionTreeConceptFilter;
    private static final SubLSymbol $sym57$FILTER_DEFN;
    private static final SubLSymbol $sym58$BAD_FOR_TAGGING_DEFN;
    private static final SubLObject $const59$PredicateTaxonomy;
    private static final SubLSymbol $sym60$PREDICATE_FILTER_TAGGING_DEFN;
    private static final SubLObject $const61$TheCycOntology;
    private static final SubLSymbol $sym62$IGNORE;
    private static final SubLSymbol $sym63$TERM_FAILS_CLASSIFICATION_TREE_FILTER_;
    private static final SubLSymbol $sym64$_FILTER_DEFN_CACHING_STATE_;
    private static final SubLSymbol $sym65$CONCEPT_TAGGING_IRRELEVANT_TERM_;
    private static final SubLSymbol $sym66$BAD_FOR_TAGGING_;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$_BAD_FOR_TAGGING__CACHING_STATE_;
    private static final SubLSymbol $sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$DECOMPOSE_CONCEPT_FILTER_SPEC;
    private static final SubLSymbol $sym72$_DECOMPOSE_CONCEPT_FILTER_SPEC_CACHING_STATE_;
    private static final SubLSymbol $sym73$_MT;
    private static final SubLObject $const74$conceptFilterSpecificationDefinin;
    private static final SubLList $list75;
    private static final SubLSymbol $kw76$PROBLEM_STORE;
    private static final SubLSymbol $sym77$_TRIGGER;
    private static final SubLObject $const78$conceptFilterSpecificationTrigger;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$_MODE;
    private static final SubLObject $const83$conceptFilterSpecificationMode;
    private static final SubLList $list84;
    private static final SubLObject $const85$ConceptAndInstancesFilterParamete;
    private static final SubLSymbol $sym86$_FILTER;
    private static final SubLObject $const87$conceptFilterSpecificationFilter;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$NEW_ADHOC_CONCEPT_FILTER_SPEC;
    private static final SubLSymbol $sym90$CYCL_TERM_P;
    private static final SubLSymbol $sym91$HLMT_P;
    private static final SubLObject $const92$ConceptFilterSpecificationWithMtF;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC;
    private static final SubLSymbol $sym95$ISA_COLLECTION_;
    private static final SubLSymbol $sym96$_TERM;
    private static final SubLObject $const97$ConceptOnlyFilterParameter;
    private static final SubLObject $const98$TriggerFromConcept;
    private static final SubLObject $const99$ConceptFilterSpecificatioFn;
    private static final SubLSymbol $sym100$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC;
    private static final SubLSymbol $sym101$VALID_CONCEPT_FILTER_NODES;
    private static final SubLSymbol $kw102$TEST;
    private static final SubLSymbol $kw103$OWNER;
    private static final SubLSymbol $kw104$CLASSES;
    private static final SubLSymbol $kw105$KB;
    private static final SubLSymbol $kw106$FULL;
    private static final SubLSymbol $kw107$WORKING_;
    private static final SubLList $list108;
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 971L)
    public static SubLObject clear_concept_filter_caches() {
        clear_concept_filter_specification_p();
        clear_concept_filter_all_isa();
        clear_specified_nodes_in_filter();
        clear_organizing_nodes_for_filter();
        clear_decompose_concept_filter_spec();
        clear_bad_for_taggingP();
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 1690L)
    public static SubLObject with_new_concept_filter_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)concept_filter.$sym2$CLET, (SubLObject)concept_filter.$list3, ConsesLow.append(body, (SubLObject)concept_filter.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 1856L)
    public static SubLObject with_concept_filter_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)concept_filter.$sym4$WITH_MEMOIZATION_STATE, (SubLObject)concept_filter.$list5, ConsesLow.append(body, (SubLObject)concept_filter.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2008L)
    public static SubLObject clear_concept_filter_specification_p() {
        final SubLObject cs = concept_filter.$concept_filter_specification_p_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2008L)
    public static SubLObject remove_concept_filter_specification_p(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$concept_filter_specification_p_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(obj), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2008L)
    public static SubLObject concept_filter_specification_p_internal(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(concept_filter.NIL != cycl_grammar.cycl_denotational_term_p(obj) && (concept_filter.NIL != el_utilities.el_formula_with_operator_p(obj, concept_filter.$const7$ConceptFilterSpecificationFn) || concept_filter.NIL != ask_utilities.query_boolean((SubLObject)ConsesLow.listS(concept_filter.$const8$isa, obj, (SubLObject)concept_filter.$list9), concept_filter.$const0$InferencePSC, (SubLObject)concept_filter.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2008L)
    public static SubLObject concept_filter_specification_p(final SubLObject obj) {
        SubLObject caching_state = concept_filter.$concept_filter_specification_p_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym6$CONCEPT_FILTER_SPECIFICATION_P, (SubLObject)concept_filter.$sym10$_CONCEPT_FILTER_SPECIFICATION_P_CACHING_STATE_, (SubLObject)concept_filter.$int11$50, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.ONE_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(concept_filter_specification_p_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)concept_filter.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2294L)
    public static SubLObject get_default_concept_filter_specification() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (concept_filter.NIL == concept_filter.$default_concept_filter_specification$.getDynamicValue(thread)) {
            concept_filter.$default_concept_filter_specification$.setDynamicValue((SubLObject)ConsesLow.listS(concept_filter.$const7$ConceptFilterSpecificationFn, concept_filter.$default_concept_filter$.getDynamicValue(thread), (SubLObject)concept_filter.$list12), thread);
        }
        return concept_filter.$default_concept_filter_specification$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2639L)
    public static SubLObject nodes_for_concept_filter_after_adding(final SubLObject argument, final SubLObject assertion) {
        clear_specified_nodes_in_filter();
        clear_organizing_nodes_for_filter();
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 2988L)
    public static SubLObject nodes_for_concept_filter_after_removing(final SubLObject argument, final SubLObject assertion) {
        clear_specified_nodes_in_filter();
        clear_organizing_nodes_for_filter();
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3324L)
    public static SubLObject clear_concept_filter_all_isa() {
        final SubLObject cs = concept_filter.$concept_filter_all_isa_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3324L)
    public static SubLObject remove_concept_filter_all_isa(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$concept_filter_all_isa_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3324L)
    public static SubLObject concept_filter_all_isa_internal(final SubLObject v_term, final SubLObject mt) {
        return (concept_filter.NIL != forts.fort_p(v_term)) ? set_utilities.construct_set_from_list(isa.all_isa(v_term, mt, (SubLObject)concept_filter.UNPROVIDED), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED) : set_utilities.construct_set_from_list(Mapping.mapcar((SubLObject)concept_filter.$sym16$NART_SUBSTITUTE, backward.removal_ask_variable((SubLObject)concept_filter.$sym17$_VAR0, (SubLObject)ConsesLow.listS(concept_filter.$const8$isa, v_term, (SubLObject)concept_filter.$list18), mt, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED)), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3324L)
    public static SubLObject concept_filter_all_isa(final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = concept_filter.$concept_filter_all_isa_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym15$CONCEPT_FILTER_ALL_ISA, (SubLObject)concept_filter.$sym19$_CONCEPT_FILTER_ALL_ISA_CACHING_STATE_, (SubLObject)concept_filter.$int20$500, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback((SubLObject)concept_filter.$sym21$CLEAR_CONCEPT_FILTER_ALL_ISA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(concept_filter_all_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3846L)
    public static SubLObject clear_specified_nodes_in_filter() {
        final SubLObject cs = concept_filter.$specified_nodes_in_filter_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3846L)
    public static SubLObject remove_specified_nodes_in_filter(final SubLObject filter, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$specified_nodes_in_filter_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(filter, mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3846L)
    public static SubLObject specified_nodes_in_filter_internal(final SubLObject filter, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_results = ask_utilities.query_variable((SubLObject)concept_filter.$sym23$_X, (SubLObject)ConsesLow.list(concept_filter.$const24$nodeInSystem, (SubLObject)concept_filter.$sym23$_X, filter), mt, (SubLObject)concept_filter.$list25);
        final SubLObject nodes = set_utilities.construct_set_from_list(query_results, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.UNPROVIDED);
        final SubLObject pred = constants_high.find_constant((SubLObject)concept_filter.$str26$collectionAndSpecsInConceptFilter);
        if (concept_filter.NIL != constant_handles.valid_constantP(pred, (SubLObject)concept_filter.UNPROVIDED)) {
            SubLObject collection = (SubLObject)concept_filter.NIL;
            final SubLObject pred_var = pred;
            if (concept_filter.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(filter, (SubLObject)concept_filter.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(filter, (SubLObject)concept_filter.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)concept_filter.NIL;
                final SubLObject token_var = (SubLObject)concept_filter.NIL;
                while (concept_filter.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (concept_filter.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)concept_filter.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)concept_filter.$kw27$GAF, (SubLObject)concept_filter.$kw28$TRUE, (SubLObject)concept_filter.NIL);
                            SubLObject done_var_$1 = (SubLObject)concept_filter.NIL;
                            final SubLObject token_var_$2 = (SubLObject)concept_filter.NIL;
                            while (concept_filter.NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                if (concept_filter.NIL != valid_$3) {
                                    collection = assertions_high.gaf_arg(assertion, (SubLObject)concept_filter.ONE_INTEGER);
                                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        SubLObject node_var = collection;
                                        final SubLObject deck_type = (SubLObject)concept_filter.$kw31$STACK;
                                        final SubLObject recur_deck = deck.create_deck(deck_type);
                                        final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject tv_var = (SubLObject)concept_filter.NIL;
                                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind((concept_filter.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((concept_filter.NIL != tv_var) ? concept_filter.$sym32$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                    if (concept_filter.NIL != tv_var && concept_filter.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && concept_filter.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var.eql((SubLObject)concept_filter.$kw33$ERROR)) {
                                                            sbhl_paranoia.sbhl_error((SubLObject)concept_filter.ONE_INTEGER, (SubLObject)concept_filter.$str34$_A_is_not_a__A, tv_var, (SubLObject)concept_filter.$sym35$SBHL_TRUE_TV_P, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
                                                        }
                                                        else if (pcase_var.eql((SubLObject)concept_filter.$kw36$CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror((SubLObject)concept_filter.ONE_INTEGER, (SubLObject)concept_filter.$str37$continue_anyway, (SubLObject)concept_filter.$str34$_A_is_not_a__A, tv_var, (SubLObject)concept_filter.$sym35$SBHL_TRUE_TV_P, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
                                                        }
                                                        else if (pcase_var.eql((SubLObject)concept_filter.$kw38$WARN)) {
                                                            Errors.warn((SubLObject)concept_filter.$str34$_A_is_not_a__A, tv_var, (SubLObject)concept_filter.$sym35$SBHL_TRUE_TV_P);
                                                        }
                                                        else {
                                                            Errors.warn((SubLObject)concept_filter.$str39$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror((SubLObject)concept_filter.$str37$continue_anyway, (SubLObject)concept_filter.$str34$_A_is_not_a__A, tv_var, (SubLObject)concept_filter.$sym35$SBHL_TRUE_TV_P);
                                                        }
                                                    }
                                                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(concept_filter.$const40$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(concept_filter.$const40$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(concept_filter.$const40$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)concept_filter.NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(concept_filter.$const40$genls), thread);
                                                        if (concept_filter.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || concept_filter.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)concept_filter.UNPROVIDED))) {
                                                            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(concept_filter.$const40$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)concept_filter.NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)concept_filter.UNPROVIDED);
                                                                while (concept_filter.NIL != node_var) {
                                                                    final SubLObject spec = node_var;
                                                                    set.set_add(spec, nodes);
                                                                    SubLObject cdolist_list_var;
                                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(concept_filter.$const40$genls));
                                                                    SubLObject module_var = (SubLObject)concept_filter.NIL;
                                                                    module_var = cdolist_list_var.first();
                                                                    while (concept_filter.NIL != cdolist_list_var) {
                                                                        final SubLObject _prev_bind_0_$8 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((concept_filter.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(concept_filter.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                                                            if (concept_filter.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)concept_filter.UNPROVIDED));
                                                                                if (concept_filter.NIL != d_link) {
                                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)concept_filter.UNPROVIDED));
                                                                                    if (concept_filter.NIL != mt_links) {
                                                                                        SubLObject iteration_state;
                                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); concept_filter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject mt_$15 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (concept_filter.NIL != mt_relevance_macros.relevant_mtP(mt_$15)) {
                                                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$15, thread);
                                                                                                    SubLObject iteration_state_$17;
                                                                                                    for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); concept_filter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (concept_filter.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                final SubLObject sol = link_nodes;
                                                                                                                if (concept_filter.NIL != set.set_p(sol)) {
                                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                    SubLObject basis_object;
                                                                                                                    SubLObject state;
                                                                                                                    SubLObject node_vars_link_node;
                                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)concept_filter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); concept_filter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                        if (concept_filter.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && concept_filter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)concept_filter.UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)concept_filter.UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                else if (sol.isList()) {
                                                                                                                    SubLObject csome_list_var = sol;
                                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)concept_filter.NIL;
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                    while (concept_filter.NIL != csome_list_var) {
                                                                                                                        if (concept_filter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)concept_filter.UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)concept_filter.UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                        }
                                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    Errors.error((SubLObject)concept_filter.$str41$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                }
                                                                                                            }
                                                                                                            finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$10, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$9, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    sbhl_paranoia.sbhl_error((SubLObject)concept_filter.FIVE_INTEGER, (SubLObject)concept_filter.$str42$attempting_to_bind_direction_link, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
                                                                                }
                                                                            }
                                                                            else if (concept_filter.NIL != obsolete.cnat_p(node, (SubLObject)concept_filter.UNPROVIDED)) {
                                                                                SubLObject cdolist_list_var_$19;
                                                                                final SubLObject new_list = cdolist_list_var_$19 = ((concept_filter.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)concept_filter.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)concept_filter.UNPROVIDED)));
                                                                                SubLObject generating_fn = (SubLObject)concept_filter.NIL;
                                                                                generating_fn = cdolist_list_var_$19.first();
                                                                                while (concept_filter.NIL != cdolist_list_var_$19) {
                                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                        final SubLObject sol2;
                                                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                                        if (concept_filter.NIL != set.set_p(sol2)) {
                                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                            SubLObject basis_object2;
                                                                                            SubLObject state2;
                                                                                            SubLObject node_vars_link_node3;
                                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)concept_filter.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); concept_filter.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                if (concept_filter.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && concept_filter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)concept_filter.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)concept_filter.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol2.isList()) {
                                                                                            SubLObject csome_list_var2 = sol2;
                                                                                            SubLObject node_vars_link_node4 = (SubLObject)concept_filter.NIL;
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                            while (concept_filter.NIL != csome_list_var2) {
                                                                                                if (concept_filter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)concept_filter.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)concept_filter.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                }
                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)concept_filter.$str41$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$11, thread);
                                                                                    }
                                                                                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                                                    generating_fn = cdolist_list_var_$19.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$8, thread);
                                                                        }
                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                        module_var = cdolist_list_var.first();
                                                                    }
                                                                    node_var = deck.deck_pop(recur_deck);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$8, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_warn((SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.$str43$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)concept_filter.UNPROVIDED)), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$5, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_filter.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(concept_filter.NIL == valid_$3);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_filter.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (concept_filter.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(concept_filter.NIL == valid);
                }
            }
        }
        return nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 3846L)
    public static SubLObject specified_nodes_in_filter(final SubLObject filter, final SubLObject mt) {
        SubLObject caching_state = concept_filter.$specified_nodes_in_filter_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym22$SPECIFIED_NODES_IN_FILTER, (SubLObject)concept_filter.$sym44$_SPECIFIED_NODES_IN_FILTER_CACHING_STATE_, (SubLObject)concept_filter.TWENTY_INTEGER, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (filter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(specified_nodes_in_filter_internal(filter, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(filter, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 4468L)
    public static SubLObject specified_nodes_in_filter_cached_p(final SubLObject filter, final SubLObject mt) {
        final SubLObject state = memoization_state.get_caching_state_for_globally_cached_function((SubLObject)concept_filter.$sym22$SPECIFIED_NODES_IN_FILTER, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
        final SubLObject args = (SubLObject)ConsesLow.list(filter, mt);
        return memoization_state.caching_state_multi_key_n_is_cached(state, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 4989L)
    public static SubLObject specified_node_in_filterP(final SubLObject v_term, SubLObject v_concept_filter, SubLObject mt) {
        if (v_concept_filter == concept_filter.UNPROVIDED) {
            v_concept_filter = concept_filter.$default_concept_filter$.getDynamicValue();
        }
        if (mt == concept_filter.UNPROVIDED) {
            mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        if (concept_filter.NIL != specified_nodes_in_filter_cached_p(v_concept_filter, mt) && concept_filter.NIL != set.set_memberP(v_term, specified_nodes_in_filter(v_concept_filter, mt))) {
            return (SubLObject)concept_filter.T;
        }
        if (concept_filter.NIL != query_for_individual_terms_from_filterP(v_concept_filter)) {
            return ask_utilities.query_boolean((SubLObject)ConsesLow.list(concept_filter.$const45$elementOf, v_term, v_concept_filter), mt, (SubLObject)concept_filter.UNPROVIDED);
        }
        if (concept_filter.NIL == kb_indexing_datastructures.indexed_term_p(v_term) && concept_filter.NIL == narts_high.find_nart(v_term)) {
            final SubLObject in_filterP = ask_utilities.query_boolean((SubLObject)ConsesLow.list(concept_filter.$const24$nodeInSystem, v_term, v_concept_filter), mt, (SubLObject)concept_filter.UNPROVIDED);
            if (concept_filter.NIL != in_filterP && concept_filter.NIL != narts_high.naut_p(v_term) && concept_filter.NIL != narts_high.find_nart(v_term)) {
                set.set_add(narts_high.find_nart(v_term), specified_nodes_in_filter(v_concept_filter, mt));
            }
            return in_filterP;
        }
        final SubLObject non_terminals = specified_nodes_in_filter(v_concept_filter, mt);
        return set.set_memberP(narts_high.nart_substitute(v_term), non_terminals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6077L)
    public static SubLObject query_for_individual_terms_from_filterP(final SubLObject filter) {
        return el_utilities.el_formula_with_operator_p(filter, concept_filter.$const46$TheSetOf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6275L)
    public static SubLObject node_suppressed_from_filterP(final SubLObject node, final SubLObject filter, final SubLObject mt) {
        if (concept_filter.NIL != complete_extent_should_be_queried_from_kbP(filter)) {
            return set.set_memberP(node, nodes_suppressed_from_filter(filter, mt));
        }
        if (concept_filter.NIL != filter_defn(filter, mt)) {
            return Functions.funcall(filter_defn(filter, mt), filter, narts_high.nart_substitute(node), mt);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6682L)
    public static SubLObject clear_nodes_suppressed_from_filter() {
        final SubLObject cs = concept_filter.$nodes_suppressed_from_filter_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6682L)
    public static SubLObject remove_nodes_suppressed_from_filter(final SubLObject filter, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$nodes_suppressed_from_filter_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(filter, mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6682L)
    public static SubLObject nodes_suppressed_from_filter_internal(final SubLObject filter, final SubLObject mt) {
        return set_utilities.construct_set_from_list(ask_utilities.query_variable((SubLObject)concept_filter.$sym48$_NODE, (SubLObject)ConsesLow.listS(concept_filter.$const49$suppressIndividualNode, filter, (SubLObject)concept_filter.$list50), mt, (SubLObject)concept_filter.UNPROVIDED), (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6682L)
    public static SubLObject nodes_suppressed_from_filter(final SubLObject filter, final SubLObject mt) {
        SubLObject caching_state = concept_filter.$nodes_suppressed_from_filter_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym47$NODES_SUPPRESSED_FROM_FILTER, (SubLObject)concept_filter.$sym51$_NODES_SUPPRESSED_FROM_FILTER_CACHING_STATE_, (SubLObject)concept_filter.NIL, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)concept_filter.$sym52$CLEAR_NODES_SUPPRESSED_FROM_FILTER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (filter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nodes_suppressed_from_filter_internal(filter, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(filter, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6910L)
    public static SubLObject clear_organizing_nodes_for_filter() {
        final SubLObject cs = concept_filter.$organizing_nodes_for_filter_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6910L)
    public static SubLObject remove_organizing_nodes_for_filter(final SubLObject filter, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$organizing_nodes_for_filter_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(filter, mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6910L)
    public static SubLObject organizing_nodes_for_filter_internal(final SubLObject filter, final SubLObject mt) {
        return set_utilities.construct_set_from_list(ask_utilities.query_variable((SubLObject)concept_filter.$sym23$_X, (SubLObject)ConsesLow.list(concept_filter.$const54$classifyingNodeInFilter, (SubLObject)concept_filter.$sym23$_X, filter), mt, (SubLObject)concept_filter.$list25), (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 6910L)
    public static SubLObject organizing_nodes_for_filter(final SubLObject filter, final SubLObject mt) {
        SubLObject caching_state = concept_filter.$organizing_nodes_for_filter_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym53$ORGANIZING_NODES_FOR_FILTER, (SubLObject)concept_filter.$sym55$_ORGANIZING_NODES_FOR_FILTER_CACHING_STATE_, (SubLObject)concept_filter.TWENTY_INTEGER, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (filter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(organizing_nodes_for_filter_internal(filter, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(filter, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7156L)
    public static SubLObject complete_extent_should_be_queried_from_kbP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(concept_filter.NIL == filter_defn(obj, concept_filter.$const0$InferencePSC));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7271L)
    public static SubLObject decision_tree_filterP(final SubLObject obj) {
        return isa.isa_in_any_mtP(obj, concept_filter.$const56$DecisionTreeConceptFilter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7374L)
    public static SubLObject clear_filter_defn() {
        final SubLObject cs = concept_filter.$filter_defn_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7374L)
    public static SubLObject remove_filter_defn(final SubLObject obj, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$filter_defn_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(obj, mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7374L)
    public static SubLObject filter_defn_internal(final SubLObject obj, final SubLObject mt) {
        if (obj.eql(concept_filter.$const1$TaxonomyOfEasilyUnderstandableCon)) {
            return (SubLObject)concept_filter.$sym58$BAD_FOR_TAGGING_DEFN;
        }
        if (obj.eql(concept_filter.$const59$PredicateTaxonomy)) {
            return (SubLObject)concept_filter.$sym60$PREDICATE_FILTER_TAGGING_DEFN;
        }
        if (obj.eql(concept_filter.$const61$TheCycOntology)) {
            return (SubLObject)concept_filter.$sym62$IGNORE;
        }
        if (concept_filter.NIL != decision_tree_filterP(obj)) {
            return (SubLObject)concept_filter.$sym63$TERM_FAILS_CLASSIFICATION_TREE_FILTER_;
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7374L)
    public static SubLObject filter_defn(final SubLObject obj, final SubLObject mt) {
        SubLObject caching_state = concept_filter.$filter_defn_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym57$FILTER_DEFN, (SubLObject)concept_filter.$sym64$_FILTER_DEFN_CACHING_STATE_, (SubLObject)concept_filter.NIL, (SubLObject)concept_filter.EQL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (obj.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(filter_defn_internal(obj, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(obj, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7825L)
    public static SubLObject concept_tagging_irrelevant_termP(final SubLObject v_object) {
        return bad_for_taggingP(v_object, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 7927L)
    public static SubLObject predicate_filter_tagging_defn(final SubLObject filter, final SubLObject v_term, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = (SubLObject)concept_filter.NIL;
        }
        return fort_types_interface.predicate_p(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8050L)
    public static SubLObject bad_for_tagging_defn(final SubLObject filter, final SubLObject v_term, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = (SubLObject)concept_filter.NIL;
        }
        return bad_for_taggingP(v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8169L)
    public static SubLObject clear_bad_for_taggingP() {
        final SubLObject cs = concept_filter.$bad_for_taggingP_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8169L)
    public static SubLObject remove_bad_for_taggingP(final SubLObject v_term, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = (SubLObject)concept_filter.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$bad_for_taggingP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8169L)
    public static SubLObject bad_for_taggingP_internal(final SubLObject v_term, final SubLObject mt) {
        if (concept_filter.NIL != cycl_grammar.cycl_nat_p(v_term)) {
            final SubLObject operator = cycl_utilities.formula_arg0(v_term);
            if (concept_filter.NIL != subl_promotions.memberP(operator, (SubLObject)concept_filter.$list67, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED)) {
                return (SubLObject)concept_filter.T;
            }
        }
        if (concept_filter.NIL != forts.fort_p(narts_high.nart_substitute(v_term))) {
            return rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8169L)
    public static SubLObject bad_for_taggingP(final SubLObject v_term, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = (SubLObject)concept_filter.NIL;
        }
        SubLObject caching_state = concept_filter.$bad_for_taggingP_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym66$BAD_FOR_TAGGING_, (SubLObject)concept_filter.$sym68$_BAD_FOR_TAGGING__CACHING_STATE_, (SubLObject)concept_filter.NIL, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(bad_for_taggingP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8598L)
    public static SubLObject organizing_node_for_filterP(final SubLObject v_term, SubLObject v_concept_filter, SubLObject mt) {
        if (v_concept_filter == concept_filter.UNPROVIDED) {
            v_concept_filter = concept_filter.$default_concept_filter$.getDynamicValue();
        }
        if (mt == concept_filter.UNPROVIDED) {
            mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        final SubLObject non_terminals = organizing_nodes_for_filter(v_concept_filter, mt);
        return set.set_memberP(narts_high.nart_substitute(v_term), non_terminals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 8960L)
    public static SubLObject valid_concept_filter_nodes(final SubLObject v_term, SubLObject concept_filter_spec) {
        if (concept_filter_spec == concept_filter.UNPROVIDED) {
            concept_filter_spec = get_default_concept_filter_specification();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_value = (SubLObject)concept_filter.NIL;
        final SubLObject local_state = concept_filter.$concept_filter_memoization_state$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return_value = valid_concept_filter_nodes_memoized(v_term, concept_filter_spec);
            }
            finally {
                final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_filter.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return return_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 9570L)
    public static SubLObject valid_concept_filter_nodes_memoized_internal(final SubLObject v_term, final SubLObject concept_filter_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_value = (SubLObject)concept_filter.NIL;
        SubLObject current;
        final SubLObject datum = current = decompose_concept_filter_spec(concept_filter_spec, (SubLObject)concept_filter.UNPROVIDED);
        SubLObject v_concept_filter = (SubLObject)concept_filter.NIL;
        SubLObject allow_specs = (SubLObject)concept_filter.NIL;
        SubLObject allow_instances = (SubLObject)concept_filter.NIL;
        SubLObject return_instances = (SubLObject)concept_filter.NIL;
        SubLObject mt = (SubLObject)concept_filter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_filter.$list70);
        v_concept_filter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_filter.$list70);
        allow_specs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_filter.$list70);
        allow_instances = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_filter.$list70);
        return_instances = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_filter.$list70);
        mt = current.first();
        current = current.rest();
        if (concept_filter.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)concept_filter.$list70);
            return (SubLObject)concept_filter.NIL;
        }
        if (concept_filter.NIL != complete_extent_should_be_queried_from_kbP(v_concept_filter)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (concept_filter.NIL != specified_node_in_filterP(v_term, v_concept_filter, mt)) {
                    return_value = (SubLObject)ConsesLow.list(v_term);
                }
                if (concept_filter.NIL == return_value && concept_filter.NIL != allow_specs && concept_filter.NIL != fort_types_interface.collection_p(v_term)) {
                    final SubLObject my_genls_in_filter = genls.min_genls_among(v_term, set.set_element_list(specified_nodes_in_filter(v_concept_filter, mt)), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
                    if (concept_filter.NIL != my_genls_in_filter) {
                        return_value = my_genls_in_filter;
                    }
                }
                if (concept_filter.NIL == return_value && concept_filter.NIL != allow_instances) {
                    final SubLObject term_isas = concept_filter_all_isa(v_term, mt);
                    final SubLObject specified_filter_terms = specified_nodes_in_filter(v_concept_filter, mt);
                    final SubLObject isas_in_filter = set_utilities.set_intersection((SubLObject)ConsesLow.list(specified_filter_terms, term_isas), (SubLObject)concept_filter.UNPROVIDED);
                    if (concept_filter.NIL != set.non_empty_set_p(isas_in_filter)) {
                        if (concept_filter.NIL != return_instances) {
                            return_value = (SubLObject)ConsesLow.list(v_term);
                        }
                        else {
                            return_value = genls.min_ceiling_cols(set.set_element_list(isas_in_filter), (SubLObject)concept_filter.NIL, mt, (SubLObject)concept_filter.UNPROVIDED);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return return_value;
        }
        if (concept_filter.NIL != node_suppressed_from_filterP(v_term, v_concept_filter, mt)) {
            return (SubLObject)concept_filter.NIL;
        }
        return (SubLObject)ConsesLow.list(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 9570L)
    public static SubLObject valid_concept_filter_nodes_memoized(final SubLObject v_term, final SubLObject concept_filter_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)concept_filter.NIL;
        if (concept_filter.NIL == v_memoization_state) {
            return valid_concept_filter_nodes_memoized_internal(v_term, concept_filter_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)concept_filter.$sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED, (SubLObject)concept_filter.UNPROVIDED);
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)concept_filter.$sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.NIL, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)concept_filter.$sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, concept_filter_spec);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && concept_filter_spec.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(valid_concept_filter_nodes_memoized_internal(v_term, concept_filter_spec)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, concept_filter_spec));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 11112L)
    public static SubLObject clear_decompose_concept_filter_spec() {
        final SubLObject cs = concept_filter.$decompose_concept_filter_spec_caching_state$.getGlobalValue();
        if (concept_filter.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)concept_filter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 11112L)
    public static SubLObject remove_decompose_concept_filter_spec(final SubLObject filter_spec, SubLObject default_mt) {
        if (default_mt == concept_filter.UNPROVIDED) {
            default_mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(concept_filter.$decompose_concept_filter_spec_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(filter_spec, default_mt), (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 11112L)
    public static SubLObject decompose_concept_filter_spec_internal(final SubLObject filter_spec, final SubLObject default_mt) {
        final SubLObject filter = (SubLObject)concept_filter.NIL;
        final SubLObject allow_specs = (SubLObject)concept_filter.NIL;
        final SubLObject allow_instances = (SubLObject)concept_filter.NIL;
        final SubLObject return_instances = (SubLObject)concept_filter.NIL;
        final SubLObject mt = (SubLObject)concept_filter.NIL;
        if (concept_filter.NIL == filter_spec) {
            return (SubLObject)ConsesLow.list(filter, allow_specs, allow_instances, return_instances, mt);
        }
        return decompose_concept_filter_spec_new(filter_spec, default_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 11112L)
    public static SubLObject decompose_concept_filter_spec(final SubLObject filter_spec, SubLObject default_mt) {
        if (default_mt == concept_filter.UNPROVIDED) {
            default_mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        SubLObject caching_state = concept_filter.$decompose_concept_filter_spec_caching_state$.getGlobalValue();
        if (concept_filter.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)concept_filter.$sym71$DECOMPOSE_CONCEPT_FILTER_SPEC, (SubLObject)concept_filter.$sym72$_DECOMPOSE_CONCEPT_FILTER_SPEC_CACHING_STATE_, (SubLObject)concept_filter.TEN_INTEGER, (SubLObject)concept_filter.EQUAL, (SubLObject)concept_filter.TWO_INTEGER, (SubLObject)concept_filter.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter_spec, default_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)concept_filter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)concept_filter.NIL;
            collision = cdolist_list_var.first();
            while (concept_filter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (filter_spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (concept_filter.NIL != cached_args && concept_filter.NIL == cached_args.rest() && default_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(decompose_concept_filter_spec_internal(filter_spec, default_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(filter_spec, default_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 11560L)
    public static SubLObject decompose_concept_filter_spec_new(final SubLObject filter_spec, final SubLObject default_mt) {
        SubLObject filter = (SubLObject)concept_filter.NIL;
        SubLObject allow_specs = (SubLObject)concept_filter.NIL;
        SubLObject allow_instances = (SubLObject)concept_filter.NIL;
        SubLObject return_instances = (SubLObject)concept_filter.NIL;
        SubLObject mt = (SubLObject)concept_filter.NIL;
        SubLObject store = (SubLObject)concept_filter.NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store((SubLObject)concept_filter.NIL);
            filter = concept_filter_specification_filter(filter_spec, store);
            mt = ask_utilities.query_variable((SubLObject)concept_filter.$sym73$_MT, (SubLObject)ConsesLow.listS(concept_filter.$const74$conceptFilterSpecificationDefinin, filter_spec, (SubLObject)concept_filter.$list75), concept_filter.$const0$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)concept_filter.$kw76$PROBLEM_STORE, store)).first();
            final SubLObject trigger = ask_utilities.query_variable((SubLObject)concept_filter.$sym77$_TRIGGER, (SubLObject)ConsesLow.listS(concept_filter.$const78$conceptFilterSpecificationTrigger, filter_spec, (SubLObject)concept_filter.$list79), concept_filter.$const0$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)concept_filter.$kw76$PROBLEM_STORE, store)).first();
            allow_specs = subl_promotions.memberP(trigger, (SubLObject)concept_filter.$list80, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
            allow_instances = subl_promotions.memberP(trigger, (SubLObject)concept_filter.$list81, (SubLObject)concept_filter.UNPROVIDED, (SubLObject)concept_filter.UNPROVIDED);
            final SubLObject mode = ask_utilities.query_variable((SubLObject)concept_filter.$sym82$_MODE, (SubLObject)ConsesLow.listS(concept_filter.$const83$conceptFilterSpecificationMode, filter_spec, (SubLObject)concept_filter.$list84), concept_filter.$const0$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)concept_filter.$kw76$PROBLEM_STORE, store)).first();
            return_instances = Equality.eql(mode, concept_filter.$const85$ConceptAndInstancesFilterParamete);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)concept_filter.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (concept_filter.NIL == mt) {
            mt = default_mt;
        }
        return (SubLObject)ConsesLow.list(filter, allow_specs, allow_instances, return_instances, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 12746L)
    public static SubLObject concept_filter_specification_filter(final SubLObject filter_spec, SubLObject store) {
        if (store == concept_filter.UNPROVIDED) {
            store = (SubLObject)concept_filter.NIL;
        }
        return ask_utilities.query_variable((SubLObject)concept_filter.$sym86$_FILTER, (SubLObject)ConsesLow.listS(concept_filter.$const87$conceptFilterSpecificationFilter, filter_spec, (SubLObject)concept_filter.$list88), concept_filter.$const0$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)concept_filter.$kw76$PROBLEM_STORE, store)).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 12981L)
    public static SubLObject new_adhoc_concept_filter_spec(final SubLObject v_set, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        enforceType(v_set, concept_filter.$sym90$CYCL_TERM_P);
        enforceType(mt, concept_filter.$sym91$HLMT_P);
        if (concept_filter.NIL != constant_handles.valid_constantP(concept_filter.$const92$ConceptFilterSpecificationWithMtF, (SubLObject)concept_filter.UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS(concept_filter.$const92$ConceptFilterSpecificationWithMtF, v_set, (SubLObject)concept_filter.$list93);
        }
        return (SubLObject)ConsesLow.listS(concept_filter.$const7$ConceptFilterSpecificationFn, v_set, (SubLObject)concept_filter.$list12);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 13642L)
    public static SubLObject new_adhoc_isa_concept_filter_spec(final SubLObject collection, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        enforceType(collection, concept_filter.$sym95$ISA_COLLECTION_);
        enforceType(mt, concept_filter.$sym91$HLMT_P);
        if (concept_filter.NIL != constant_handles.valid_constantP(concept_filter.$const92$ConceptFilterSpecificationWithMtF, (SubLObject)concept_filter.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(concept_filter.$const92$ConceptFilterSpecificationWithMtF, (SubLObject)ConsesLow.list(concept_filter.$const46$TheSetOf, (SubLObject)concept_filter.$sym96$_TERM, (SubLObject)ConsesLow.list(concept_filter.$const8$isa, (SubLObject)concept_filter.$sym96$_TERM, collection)), concept_filter.$const97$ConceptOnlyFilterParameter, concept_filter.$const98$TriggerFromConcept, mt);
        }
        return (SubLObject)ConsesLow.listS(concept_filter.$const99$ConceptFilterSpecificatioFn, (SubLObject)ConsesLow.list(concept_filter.$const46$TheSetOf, (SubLObject)concept_filter.$sym96$_TERM, (SubLObject)ConsesLow.list(concept_filter.$const8$isa, (SubLObject)concept_filter.$sym96$_TERM, collection)), (SubLObject)concept_filter.$list12);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-filter.lisp", position = 14412L)
    public static SubLObject new_adhoc_genls_concept_filter_spec(final SubLObject collection, SubLObject mt) {
        if (mt == concept_filter.UNPROVIDED) {
            mt = concept_filter.$concept_filter_default_mt$.getDynamicValue();
        }
        enforceType(collection, concept_filter.$sym95$ISA_COLLECTION_);
        enforceType(mt, concept_filter.$sym91$HLMT_P);
        if (concept_filter.NIL != constant_handles.valid_constantP(concept_filter.$const92$ConceptFilterSpecificationWithMtF, (SubLObject)concept_filter.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(concept_filter.$const92$ConceptFilterSpecificationWithMtF, (SubLObject)ConsesLow.list(concept_filter.$const46$TheSetOf, (SubLObject)concept_filter.$sym96$_TERM, (SubLObject)ConsesLow.list(concept_filter.$const40$genls, (SubLObject)concept_filter.$sym96$_TERM, collection)), concept_filter.$const97$ConceptOnlyFilterParameter, concept_filter.$const98$TriggerFromConcept, mt);
        }
        return (SubLObject)ConsesLow.listS(concept_filter.$const7$ConceptFilterSpecificationFn, (SubLObject)ConsesLow.list(concept_filter.$const46$TheSetOf, (SubLObject)concept_filter.$sym96$_TERM, (SubLObject)ConsesLow.list(concept_filter.$const40$genls, (SubLObject)concept_filter.$sym96$_TERM, collection)), (SubLObject)concept_filter.$list12);
    }
    
    public static SubLObject declare_concept_filter_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_concept_filter_caches", "CLEAR-CONCEPT-FILTER-CACHES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.concept_filter", "with_new_concept_filter_memoization_state", "WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.concept_filter", "with_concept_filter_memoization_state", "WITH-CONCEPT-FILTER-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_concept_filter_specification_p", "CLEAR-CONCEPT-FILTER-SPECIFICATION-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_concept_filter_specification_p", "REMOVE-CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "concept_filter_specification_p_internal", "CONCEPT-FILTER-SPECIFICATION-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "concept_filter_specification_p", "CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "get_default_concept_filter_specification", "GET-DEFAULT-CONCEPT-FILTER-SPECIFICATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "nodes_for_concept_filter_after_adding", "NODES-FOR-CONCEPT-FILTER-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "nodes_for_concept_filter_after_removing", "NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_concept_filter_all_isa", "CLEAR-CONCEPT-FILTER-ALL-ISA", 0, 0, false);
        new $clear_concept_filter_all_isa$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_concept_filter_all_isa", "REMOVE-CONCEPT-FILTER-ALL-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "concept_filter_all_isa_internal", "CONCEPT-FILTER-ALL-ISA-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "concept_filter_all_isa", "CONCEPT-FILTER-ALL-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_specified_nodes_in_filter", "CLEAR-SPECIFIED-NODES-IN-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_specified_nodes_in_filter", "REMOVE-SPECIFIED-NODES-IN-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "specified_nodes_in_filter_internal", "SPECIFIED-NODES-IN-FILTER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "specified_nodes_in_filter", "SPECIFIED-NODES-IN-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "specified_nodes_in_filter_cached_p", "SPECIFIED-NODES-IN-FILTER-CACHED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "specified_node_in_filterP", "SPECIFIED-NODE-IN-FILTER?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "query_for_individual_terms_from_filterP", "QUERY-FOR-INDIVIDUAL-TERMS-FROM-FILTER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "node_suppressed_from_filterP", "NODE-SUPPRESSED-FROM-FILTER?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_nodes_suppressed_from_filter", "CLEAR-NODES-SUPPRESSED-FROM-FILTER", 0, 0, false);
        new $clear_nodes_suppressed_from_filter$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_nodes_suppressed_from_filter", "REMOVE-NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "nodes_suppressed_from_filter_internal", "NODES-SUPPRESSED-FROM-FILTER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "nodes_suppressed_from_filter", "NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_organizing_nodes_for_filter", "CLEAR-ORGANIZING-NODES-FOR-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_organizing_nodes_for_filter", "REMOVE-ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "organizing_nodes_for_filter_internal", "ORGANIZING-NODES-FOR-FILTER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "organizing_nodes_for_filter", "ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "complete_extent_should_be_queried_from_kbP", "COMPLETE-EXTENT-SHOULD-BE-QUERIED-FROM-KB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "decision_tree_filterP", "DECISION-TREE-FILTER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_filter_defn", "CLEAR-FILTER-DEFN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_filter_defn", "REMOVE-FILTER-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "filter_defn_internal", "FILTER-DEFN-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "filter_defn", "FILTER-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "concept_tagging_irrelevant_termP", "CONCEPT-TAGGING-IRRELEVANT-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "predicate_filter_tagging_defn", "PREDICATE-FILTER-TAGGING-DEFN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "bad_for_tagging_defn", "BAD-FOR-TAGGING-DEFN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_bad_for_taggingP", "CLEAR-BAD-FOR-TAGGING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_bad_for_taggingP", "REMOVE-BAD-FOR-TAGGING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "bad_for_taggingP_internal", "BAD-FOR-TAGGING?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "bad_for_taggingP", "BAD-FOR-TAGGING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "organizing_node_for_filterP", "ORGANIZING-NODE-FOR-FILTER?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "valid_concept_filter_nodes", "VALID-CONCEPT-FILTER-NODES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "valid_concept_filter_nodes_memoized_internal", "VALID-CONCEPT-FILTER-NODES-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "valid_concept_filter_nodes_memoized", "VALID-CONCEPT-FILTER-NODES-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "clear_decompose_concept_filter_spec", "CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "remove_decompose_concept_filter_spec", "REMOVE-DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "decompose_concept_filter_spec_internal", "DECOMPOSE-CONCEPT-FILTER-SPEC-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "decompose_concept_filter_spec", "DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "decompose_concept_filter_spec_new", "DECOMPOSE-CONCEPT-FILTER-SPEC-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "concept_filter_specification_filter", "CONCEPT-FILTER-SPECIFICATION-FILTER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "new_adhoc_concept_filter_spec", "NEW-ADHOC-CONCEPT-FILTER-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "new_adhoc_isa_concept_filter_spec", "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_filter", "new_adhoc_genls_concept_filter_spec", "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC", 1, 1, false);
        return (SubLObject)concept_filter.NIL;
    }
    
    public static SubLObject init_concept_filter_file() {
        concept_filter.$concept_filter_default_mt$ = SubLFiles.defparameter("*CONCEPT-FILTER-DEFAULT-MT*", concept_filter.$const0$InferencePSC);
        concept_filter.$default_concept_filter$ = SubLFiles.defparameter("*DEFAULT-CONCEPT-FILTER*", concept_filter.$const1$TaxonomyOfEasilyUnderstandableCon);
        concept_filter.$default_concept_filter_specification$ = SubLFiles.defparameter("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*", (SubLObject)concept_filter.NIL);
        concept_filter.$concept_filter_memoization_state$ = SubLFiles.defparameter("*CONCEPT-FILTER-MEMOIZATION-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$concept_filter_specification_p_caching_state$ = SubLFiles.deflexical("*CONCEPT-FILTER-SPECIFICATION-P-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$concept_filter_all_isa_caching_state$ = SubLFiles.deflexical("*CONCEPT-FILTER-ALL-ISA-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$specified_nodes_in_filter_caching_state$ = SubLFiles.deflexical("*SPECIFIED-NODES-IN-FILTER-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$nodes_suppressed_from_filter_caching_state$ = SubLFiles.deflexical("*NODES-SUPPRESSED-FROM-FILTER-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$organizing_nodes_for_filter_caching_state$ = SubLFiles.deflexical("*ORGANIZING-NODES-FOR-FILTER-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$filter_defn_caching_state$ = SubLFiles.deflexical("*FILTER-DEFN-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$bad_for_taggingP_caching_state$ = SubLFiles.deflexical("*BAD-FOR-TAGGING?-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        concept_filter.$decompose_concept_filter_spec_caching_state$ = SubLFiles.deflexical("*DECOMPOSE-CONCEPT-FILTER-SPEC-CACHING-STATE*", (SubLObject)concept_filter.NIL);
        return (SubLObject)concept_filter.NIL;
    }
    
    public static SubLObject setup_concept_filter_file() {
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym6$CONCEPT_FILTER_SPECIFICATION_P);
        utilities_macros.register_kb_function((SubLObject)concept_filter.$sym13$NODES_FOR_CONCEPT_FILTER_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)concept_filter.$sym14$NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym15$CONCEPT_FILTER_ALL_ISA);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym22$SPECIFIED_NODES_IN_FILTER);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym47$NODES_SUPPRESSED_FROM_FILTER);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym53$ORGANIZING_NODES_FOR_FILTER);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym57$FILTER_DEFN);
        utilities_macros.register_kb_function((SubLObject)concept_filter.$sym65$CONCEPT_TAGGING_IRRELEVANT_TERM_);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym66$BAD_FOR_TAGGING_);
        memoization_state.note_memoized_function((SubLObject)concept_filter.$sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED);
        memoization_state.note_globally_cached_function((SubLObject)concept_filter.$sym71$DECOMPOSE_CONCEPT_FILTER_SPEC);
        access_macros.register_external_symbol((SubLObject)concept_filter.$sym89$NEW_ADHOC_CONCEPT_FILTER_SPEC);
        access_macros.register_external_symbol((SubLObject)concept_filter.$sym94$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC);
        access_macros.register_external_symbol((SubLObject)concept_filter.$sym100$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC);
        generic_testing.define_test_case_table_int((SubLObject)concept_filter.$sym101$VALID_CONCEPT_FILTER_NODES, (SubLObject)ConsesLow.list(new SubLObject[] { concept_filter.$kw102$TEST, concept_filter.EQUALP, concept_filter.$kw103$OWNER, concept_filter.NIL, concept_filter.$kw104$CLASSES, concept_filter.NIL, concept_filter.$kw105$KB, concept_filter.$kw106$FULL, concept_filter.$kw107$WORKING_, concept_filter.T }), (SubLObject)concept_filter.$list108);
        return (SubLObject)concept_filter.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_concept_filter_file();
    }
    
    @Override
	public void initializeVariables() {
        init_concept_filter_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_concept_filter_file();
    }
    
    static {
        me = (SubLFile)new concept_filter();
        concept_filter.$concept_filter_default_mt$ = null;
        concept_filter.$default_concept_filter$ = null;
        concept_filter.$default_concept_filter_specification$ = null;
        concept_filter.$concept_filter_memoization_state$ = null;
        concept_filter.$concept_filter_specification_p_caching_state$ = null;
        concept_filter.$concept_filter_all_isa_caching_state$ = null;
        concept_filter.$specified_nodes_in_filter_caching_state$ = null;
        concept_filter.$nodes_suppressed_from_filter_caching_state$ = null;
        concept_filter.$organizing_nodes_for_filter_caching_state$ = null;
        concept_filter.$filter_defn_caching_state$ = null;
        concept_filter.$bad_for_taggingP_caching_state$ = null;
        concept_filter.$decompose_concept_filter_spec_caching_state$ = null;
        $const0$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const1$TaxonomyOfEasilyUnderstandableCon = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts"));
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MEMOIZATION-STATE"))));
        $sym4$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"));
        $sym6$CONCEPT_FILTER_SPECIFICATION_P = SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECIFICATION-P");
        $const7$ConceptFilterSpecificationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn"));
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecification")));
        $sym10$_CONCEPT_FILTER_SPECIFICATION_P_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CONCEPT-FILTER-SPECIFICATION-P-CACHING-STATE*");
        $int11$50 = SubLObjectFactory.makeInteger(50);
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")));
        $sym13$NODES_FOR_CONCEPT_FILTER_AFTER_ADDING = SubLObjectFactory.makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-ADDING");
        $sym14$NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING = SubLObjectFactory.makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING");
        $sym15$CONCEPT_FILTER_ALL_ISA = SubLObjectFactory.makeSymbol("CONCEPT-FILTER-ALL-ISA");
        $sym16$NART_SUBSTITUTE = SubLObjectFactory.makeSymbol("NART-SUBSTITUTE");
        $sym17$_VAR0 = SubLObjectFactory.makeSymbol("?VAR0");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"));
        $sym19$_CONCEPT_FILTER_ALL_ISA_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CONCEPT-FILTER-ALL-ISA-CACHING-STATE*");
        $int20$500 = SubLObjectFactory.makeInteger(500);
        $sym21$CLEAR_CONCEPT_FILTER_ALL_ISA = SubLObjectFactory.makeSymbol("CLEAR-CONCEPT-FILTER-ALL-ISA");
        $sym22$SPECIFIED_NODES_IN_FILTER = SubLObjectFactory.makeSymbol("SPECIFIED-NODES-IN-FILTER");
        $sym23$_X = SubLObjectFactory.makeSymbol("?X");
        $const24$nodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nodeInSystem"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $str26$collectionAndSpecsInConceptFilter = SubLObjectFactory.makeString("collectionAndSpecsInConceptFilter");
        $kw27$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw28$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw29$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw30$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw31$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym32$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw33$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str34$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym35$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw36$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str37$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw38$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str39$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const40$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str41$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str42$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str43$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym44$_SPECIFIED_NODES_IN_FILTER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SPECIFIED-NODES-IN-FILTER-CACHING-STATE*");
        $const45$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $const46$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $sym47$NODES_SUPPRESSED_FROM_FILTER = SubLObjectFactory.makeSymbol("NODES-SUPPRESSED-FROM-FILTER");
        $sym48$_NODE = SubLObjectFactory.makeSymbol("?NODE");
        $const49$suppressIndividualNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suppressIndividualNode"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NODE"));
        $sym51$_NODES_SUPPRESSED_FROM_FILTER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NODES-SUPPRESSED-FROM-FILTER-CACHING-STATE*");
        $sym52$CLEAR_NODES_SUPPRESSED_FROM_FILTER = SubLObjectFactory.makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER");
        $sym53$ORGANIZING_NODES_FOR_FILTER = SubLObjectFactory.makeSymbol("ORGANIZING-NODES-FOR-FILTER");
        $const54$classifyingNodeInFilter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("classifyingNodeInFilter"));
        $sym55$_ORGANIZING_NODES_FOR_FILTER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ORGANIZING-NODES-FOR-FILTER-CACHING-STATE*");
        $const56$DecisionTreeConceptFilter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecisionTreeConceptFilter"));
        $sym57$FILTER_DEFN = SubLObjectFactory.makeSymbol("FILTER-DEFN");
        $sym58$BAD_FOR_TAGGING_DEFN = SubLObjectFactory.makeSymbol("BAD-FOR-TAGGING-DEFN");
        $const59$PredicateTaxonomy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicateTaxonomy"));
        $sym60$PREDICATE_FILTER_TAGGING_DEFN = SubLObjectFactory.makeSymbol("PREDICATE-FILTER-TAGGING-DEFN");
        $const61$TheCycOntology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCycOntology"));
        $sym62$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym63$TERM_FAILS_CLASSIFICATION_TREE_FILTER_ = SubLObjectFactory.makeSymbol("TERM-FAILS-CLASSIFICATION-TREE-FILTER?");
        $sym64$_FILTER_DEFN_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FILTER-DEFN-CACHING-STATE*");
        $sym65$CONCEPT_TAGGING_IRRELEVANT_TERM_ = SubLObjectFactory.makeSymbol("CONCEPT-TAGGING-IRRELEVANT-TERM?");
        $sym66$BAD_FOR_TAGGING_ = SubLObjectFactory.makeSymbol("BAD-FOR-TAGGING?");
        $list67 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThingDescribableAsFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")));
        $sym68$_BAD_FOR_TAGGING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*BAD-FOR-TAGGING?-CACHING-STATE*");
        $sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED = SubLObjectFactory.makeSymbol("VALID-CONCEPT-FILTER-NODES-MEMOIZED");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-INSTANCES"), (SubLObject)SubLObjectFactory.makeSymbol("RETURN-INSTANCES"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym71$DECOMPOSE_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("DECOMPOSE-CONCEPT-FILTER-SPEC");
        $sym72$_DECOMPOSE_CONCEPT_FILTER_SPEC_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DECOMPOSE-CONCEPT-FILTER-SPEC-CACHING-STATE*");
        $sym73$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const74$conceptFilterSpecificationDefinin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptFilterSpecificationDefiningMt"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $kw76$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $sym77$_TRIGGER = SubLObjectFactory.makeSymbol("?TRIGGER");
        $const78$conceptFilterSpecificationTrigger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptFilterSpecificationTrigger"));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TRIGGER"));
        $list80 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptOrSpec")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")));
        $list81 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptOrInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")));
        $sym82$_MODE = SubLObjectFactory.makeSymbol("?MODE");
        $const83$conceptFilterSpecificationMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptFilterSpecificationMode"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MODE"));
        $const85$ConceptAndInstancesFilterParamete = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter"));
        $sym86$_FILTER = SubLObjectFactory.makeSymbol("?FILTER");
        $const87$conceptFilterSpecificationFilter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptFilterSpecificationFilter"));
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FILTER"));
        $sym89$NEW_ADHOC_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("NEW-ADHOC-CONCEPT-FILTER-SPEC");
        $sym90$CYCL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-TERM-P");
        $sym91$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $const92$ConceptFilterSpecificationWithMtF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationWithMtFn"));
        $list93 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym94$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC");
        $sym95$ISA_COLLECTION_ = SubLObjectFactory.makeSymbol("ISA-COLLECTION?");
        $sym96$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const97$ConceptOnlyFilterParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter"));
        $const98$TriggerFromConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept"));
        $const99$ConceptFilterSpecificatioFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificatioFn"));
        $sym100$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC");
        $sym101$VALID_CONCEPT_FILTER_NODES = SubLObjectFactory.makeSymbol("VALID-CONCEPT-FILTER-NODES");
        $kw102$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw103$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw104$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw105$KB = SubLObjectFactory.makeKeyword("KB");
        $kw106$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw107$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Iran"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Iran")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RussiasOfferToEnrichUraniumForIran"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RussiasOfferToEnrichUraniumForIran")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Refusing-CommunicationAct"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Refusing-CommunicationAct")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchingAndDevelopingFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NuclearWeapon")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchingAndDevelopingFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NuclearWeapon"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)concept_filter.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyTangible"))), (SubLObject)concept_filter.NIL));
    }
    
    public static final class $clear_concept_filter_all_isa$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_concept_filter_all_isa$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CONCEPT-FILTER-ALL-ISA"));
        }
        
        @Override
		public SubLObject processItem() {
            return concept_filter.clear_concept_filter_all_isa();
        }
    }
    
    public static final class $clear_nodes_suppressed_from_filter$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_nodes_suppressed_from_filter$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-NODES-SUPPRESSED-FROM-FILTER"));
        }
        
        @Override
		public SubLObject processItem() {
            return concept_filter.clear_nodes_suppressed_from_filter();
        }
    }
}

/*

	Total time: 743 ms
	
*/