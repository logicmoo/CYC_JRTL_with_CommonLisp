package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_domain_examples extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_domain_examples";
    public static final String myFingerPrint = "9d305d8f794bfb83efad96c7540fc6b8576832d80266ae0f2d681dde667e5a1f";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
    private static SubLSymbol $rkf_min_arg_n_isa_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
    private static SubLSymbol $rkf_min_arg_n_genl_caching_state$;
    private static final SubLSymbol $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED;
    private static final SubLObject $const1$keSalientSpecPredicate;
    private static final SubLSymbol $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED;
    private static final SubLSymbol $kw3$NODE;
    private static final SubLSymbol $kw4$PREDICATE;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$SENTENCE;
    private static final SubLObject $const7$domainExamplePredSentences;
    private static final SubLList $list8;
    private static final SubLObject $const9$examplePredSentences;
    private static final SubLSymbol $kw10$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym11$IGNORE_ERRORS_HANDLER;
    private static final SubLObject $const12$argIsa;
    private static final SubLObject $const13$argGenl;
    private static final SubLObject $const14$SomeExampleFn;
    private static final SubLObject $const15$SomeExampleSpecFn;
    private static final SubLSymbol $sym16$RKF_GENERIC_EXAMPLE_P;
    private static final SubLSymbol $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED;
    private static final SubLSymbol $sym18$MIN_ARITY_MEMOIZED;
    private static final SubLString $str19$_;
    private static final SubLSymbol $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED;
    private static final SubLSymbol $kw21$ASCENDING;
    private static final SubLObject $const22$Collection;
    private static final SubLSymbol $sym23$_;
    private static final SubLSymbol $sym24$GENERALITY_ESTIMATE;
    private static final SubLSymbol $sym25$RELEVANT_MT_IS_GENL_MT;
    private static final SubLString $str26$identifying__S_matches;
    private static final SubLString $str27$cdolist;
    private static final SubLSymbol $kw28$GAF;
    private static final SubLSymbol $kw29$TRUE;
    private static final SubLString $str30$identifying_matches;
    private static final SubLSymbol $sym31$LISTP;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$THIRD;
    private static final SubLSymbol $sym34$SECOND;
    private static final SubLSymbol $sym35$RELATION_GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym36$FIRST;
    private static final SubLSymbol $sym37$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym38$FOURTH;
    private static final SubLList $list39;
    private static final SubLString $str40$organizing_matches;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$RELATION_GENERALITY_ESTIMATE;
    private static final SubLString $str46$categorizing_predicates;
    private static final SubLString $str47$sorting_predicates;
    private static final SubLObject $const48$Relation;
    private static final SubLString $str49$Other_predicates;
    private static final SubLObject $const50$TypeTypeTernaryRuleMacroPredicate;
    private static final SubLObject $const51$TypeInstanceTernaryRuleMacroPredi;
    private static final SubLObject $const52$InstanceTypeTernaryRuleMacroPredi;
    private static final SubLSymbol $sym53$RKF_MIN_ARG_N_ISA;
    private static final SubLSymbol $sym54$_RKF_MIN_ARG_N_ISA_CACHING_STATE_;
    private static final SubLSymbol $sym55$RKF_MIN_ARG_N_GENL;
    private static final SubLSymbol $sym56$_RKF_MIN_ARG_N_GENL_CACHING_STATE_;
    private static final SubLSymbol $sym57$_;
    private static final SubLSymbol $sym58$NUM_PREDICATE_EXTENT_INDEX;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 940L)
    public static SubLObject rkf_salient_spec_predicateP(final SubLObject predicate, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL != forts.fort_p(predicate) && rkf_domain_examples.NIL != fort_types_interface.predicateP(predicate) && rkf_domain_examples.NIL == forts.invalid_fortP(predicate) && rkf_domain_examples.NIL != rkf_salient_spec_predicate_memoized(predicate, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1367L)
    public static SubLObject rkf_salient_spec_predicate_memoized_internal(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_salient_spec_predicate_internal(predicate, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1367L)
    public static SubLObject rkf_salient_spec_predicate_memoized(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_domain_examples.NIL;
        if (rkf_domain_examples.NIL == v_memoization_state) {
            return rkf_salient_spec_predicate_memoized_internal(predicate, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_domain_examples.$sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_domain_examples.$sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, (SubLObject)rkf_domain_examples.TWO_INTEGER, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQUAL, (SubLObject)rkf_domain_examples.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_domain_examples.$sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_domain_examples.NIL;
            collision = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_domain_examples.NIL != cached_args && rkf_domain_examples.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_salient_spec_predicate_memoized_internal(predicate, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1528L)
    public static SubLObject rkf_salient_spec_predicate_internal(final SubLObject predicate, final SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.list(rkf_domain_examples.$const1$keSalientSpecPredicate, predicate), domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1685L)
    public static SubLObject rkf_build_spec_predicate_graph(final SubLObject predicates, final SubLObject domain_mt) {
        return rkf_build_spec_predicate_graph_memoized(predicates, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 2334L)
    public static SubLObject rkf_build_spec_predicate_graph_memoized_internal(final SubLObject predicates, final SubLObject domain_mt) {
        return rkf_build_spec_predicate_graph_internal(predicates, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 2334L)
    public static SubLObject rkf_build_spec_predicate_graph_memoized(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_domain_examples.NIL;
        if (rkf_domain_examples.NIL == v_memoization_state) {
            return rkf_build_spec_predicate_graph_memoized_internal(predicates, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_domain_examples.$sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_domain_examples.$sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, (SubLObject)rkf_domain_examples.TWO_INTEGER, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQUAL, (SubLObject)rkf_domain_examples.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_domain_examples.$sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicates, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_domain_examples.NIL;
            collision = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicates.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_domain_examples.NIL != cached_args && rkf_domain_examples.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_build_spec_predicate_graph_memoized_internal(predicates, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicates, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 2505L)
    public static SubLObject rkf_build_spec_predicate_graph_internal(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLObject v_graph = dictionary.new_dictionary((SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        SubLObject orphans = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
        predicate = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            rkf_add_to_spec_predicate_graph(v_graph, predicate);
            if (rkf_domain_examples.NIL != rkf_salient_spec_predicateP(predicate, domain_mt)) {
                final SubLObject superiors = genl_predicates.min_genl_predicates(predicate, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED);
                if (rkf_domain_examples.NIL == superiors) {
                    orphans = (SubLObject)ConsesLow.cons(predicate, orphans);
                }
                else {
                    SubLObject cdolist_list_var_$1 = superiors;
                    SubLObject superior = (SubLObject)rkf_domain_examples.NIL;
                    superior = cdolist_list_var_$1.first();
                    while (rkf_domain_examples.NIL != cdolist_list_var_$1) {
                        rkf_extend_spec_predicate_graph_entry(v_graph, superior, predicate);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        superior = cdolist_list_var_$1.first();
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return Values.values(v_graph, orphans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 3103L)
    public static SubLObject rkf_interpret_spec_predicate_graph(final SubLObject predicates, final SubLObject v_graph, final SubLObject orphans, final SubLObject domain_mt) {
        SubLObject result = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
        predicate = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            if (rkf_domain_examples.NIL == rkf_salient_spec_predicateP(predicate, domain_mt)) {
                result = (SubLObject)ConsesLow.cons(rkf_obtain_spec_predicate_sub_graph(v_graph, predicate), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        cdolist_list_var = Sequences.nreverse(orphans);
        SubLObject orphan = (SubLObject)rkf_domain_examples.NIL;
        orphan = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(rkf_obtain_spec_predicate_sub_graph(v_graph, orphan), result);
            cdolist_list_var = cdolist_list_var.rest();
            orphan = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 3915L)
    public static SubLObject rkf_add_to_spec_predicate_graph(final SubLObject v_graph, final SubLObject predicate) {
        if (rkf_domain_examples.NIL == dictionary.dictionary_lookup(v_graph, predicate, (SubLObject)rkf_domain_examples.NIL)) {
            dictionary.dictionary_enter(v_graph, predicate, set.new_set((SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED));
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 4099L)
    public static SubLObject rkf_extend_spec_predicate_graph_entry(final SubLObject v_graph, final SubLObject superior, final SubLObject inferior) {
        rkf_add_to_spec_predicate_graph(v_graph, superior);
        final SubLObject subgraph = dictionary.dictionary_lookup(v_graph, superior, (SubLObject)rkf_domain_examples.UNPROVIDED);
        set.set_add(inferior, subgraph);
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 4336L)
    public static SubLObject rkf_obtain_spec_predicate_sub_graph(final SubLObject v_graph, final SubLObject predicate) {
        final SubLObject subgraph = dictionary.dictionary_lookup(v_graph, predicate, (SubLObject)rkf_domain_examples.UNPROVIDED);
        SubLObject sub_graph_expanded = (SubLObject)rkf_domain_examples.NIL;
        if (rkf_domain_examples.NIL != set.set_emptyP(subgraph)) {
            return (SubLObject)ConsesLow.list((SubLObject)rkf_domain_examples.$kw3$NODE, predicate);
        }
        final SubLObject set_contents_var = set.do_set_internal(subgraph);
        SubLObject basis_object;
        SubLObject state;
        SubLObject pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_domain_examples.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_domain_examples.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            pred = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_domain_examples.NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                sub_graph_expanded = (SubLObject)ConsesLow.cons(rkf_obtain_spec_predicate_sub_graph(v_graph, pred), sub_graph_expanded);
            }
        }
        return (SubLObject)ConsesLow.list((SubLObject)rkf_domain_examples.$kw3$NODE, predicate, sub_graph_expanded);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 4721L)
    public static SubLObject rkf_count_spec_predicate_sub_graphs(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)rkf_domain_examples.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_graph)); rkf_domain_examples.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subgraph = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_domain_examples.NIL == set.set_emptyP(subgraph)) {
                count = Numbers.add(count, (SubLObject)rkf_domain_examples.ONE_INTEGER);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 5097L)
    public static SubLObject rkf_domain_example_predicates(final SubLObject topic, final SubLObject domain_mt) {
        return rkf_domain_example_predicates_internal(topic, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 5368L)
    public static SubLObject rkf_predicate_example_sentence(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_all_predicate_example_sentences(predicate, domain_mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 5589L)
    public static SubLObject rkf_all_predicate_example_sentences(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject examples = rkf_all_predicate_specific_example_sentences(predicate, domain_mt);
        if (rkf_domain_examples.NIL == examples) {
            final SubLObject generic_example = rkf_predicate_generic_example_sentence(predicate, domain_mt);
            if (rkf_domain_examples.NIL != generic_example) {
                examples = (SubLObject)ConsesLow.list(generic_example);
            }
        }
        return examples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6043L)
    public static SubLObject rkf_all_predicate_specific_example_sentences(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_all_predicate_example_sentences_internal(predicate, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6330L)
    public static SubLObject rkf_predicate_specific_example_sentence(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_all_predicate_specific_example_sentences(predicate, domain_mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6597L)
    public static SubLObject rkf_predicate_generic_example_sentence(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_predicate_generic_example_sentence_internal(predicate, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6855L)
    public static SubLObject rkf_domain_example_predicates_internal(final SubLObject topic, final SubLObject domain_mt) {
        final SubLObject predicates = backward.removal_ask_variable((SubLObject)rkf_domain_examples.$kw4$PREDICATE, (SubLObject)rkf_domain_examples.$list5, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        SubLObject v_answer = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
        predicate = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            if (rkf_domain_examples.NIL != fort_types_interface.predicateP(predicate)) {
                v_answer = (SubLObject)ConsesLow.cons(predicate, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 7299L)
    public static SubLObject rkf_all_predicate_example_sentences_internal(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject candidate_sentences = backward.removal_ask_variable((SubLObject)rkf_domain_examples.$kw6$SENTENCE, (SubLObject)ConsesLow.listS(rkf_domain_examples.$const7$domainExamplePredSentences, predicate, (SubLObject)rkf_domain_examples.$list8), domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (rkf_domain_examples.NIL == candidate_sentences) {
            candidate_sentences = backward.removal_ask_variable((SubLObject)rkf_domain_examples.$kw6$SENTENCE, (SubLObject)ConsesLow.listS(rkf_domain_examples.$const9$examplePredSentences, predicate, (SubLObject)rkf_domain_examples.$list8), domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        }
        SubLObject example_sentences = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cdolist_list_var = candidate_sentences;
        SubLObject candidate_sentence = (SubLObject)rkf_domain_examples.NIL;
        candidate_sentence = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            if (predicate.eql(cycl_utilities.formula_operator(candidate_sentence))) {
                example_sentences = (SubLObject)ConsesLow.cons(candidate_sentence, example_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(example_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 8021L)
    public static SubLObject rkf_predicate_generic_example_sentence_internal(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = (SubLObject)rkf_domain_examples.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_domain_examples.NIL;
        try {
            thread.throwStack.push(rkf_domain_examples.$kw10$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym11$IGNORE_ERRORS_HANDLER), thread);
                try {
                    template = rkf_predicate_creator.generic_relation_template(predicate);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_domain_examples.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_domain_examples.$kw10$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (rkf_domain_examples.NIL != template) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject arg;
            SubLObject collection;
            SubLObject constraint;
            SubLObject replacement;
            SubLObject pcase_var;
            for (cdotimes_end_var = el_utilities.formula_arity(template, (SubLObject)rkf_domain_examples.UNPROVIDED), i = (SubLObject)rkf_domain_examples.NIL, i = (SubLObject)rkf_domain_examples.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)rkf_domain_examples.ONE_INTEGER)) {
                arg = Numbers.add(i, (SubLObject)rkf_domain_examples.ONE_INTEGER);
                thread.resetMultipleValues();
                collection = relation_most_restricted_arg_constraint_memoized(predicate, arg, domain_mt);
                constraint = thread.secondMultipleValue();
                thread.resetMultipleValues();
                replacement = (SubLObject)rkf_domain_examples.NIL;
                pcase_var = constraint;
                if (pcase_var.eql(rkf_domain_examples.$const12$argIsa)) {
                    replacement = rkf_generic_example_for_collection(collection);
                }
                else if (pcase_var.eql(rkf_domain_examples.$const13$argGenl)) {
                    replacement = rkf_generic_spec_for_collection(collection);
                }
                ConsesLow.set_nth(arg, template, replacement);
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 8821L)
    public static SubLObject rkf_generic_example_for_collection(final SubLObject collection) {
        if (rkf_domain_examples.NIL != el_utilities.specs_fn_naut_p(collection)) {
            return rkf_generic_spec_for_collection(el_utilities.specs_fn_arg(collection));
        }
        return el_utilities.make_unary_formula(rkf_domain_examples.$const14$SomeExampleFn, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9068L)
    public static SubLObject rkf_generic_spec_for_collection(final SubLObject collection) {
        return el_utilities.make_unary_formula(rkf_domain_examples.$const15$SomeExampleSpecFn, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9193L)
    public static SubLObject rkf_generic_example_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL != narts_high.naut_p(v_object) && (cycl_utilities.nat_functor(v_object).eql(rkf_domain_examples.$const14$SomeExampleFn) || cycl_utilities.nat_functor(v_object).eql(rkf_domain_examples.$const15$SomeExampleSpecFn)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9379L)
    public static SubLObject rkf_generic_example_instance_level_p(final SubLObject generic_example) {
        assert rkf_domain_examples.NIL != rkf_generic_example_p(generic_example) : generic_example;
        return Equality.eq(cycl_utilities.nat_functor(generic_example), rkf_domain_examples.$const14$SomeExampleFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9566L)
    public static SubLObject relation_most_restricted_arg_constraint_memoized_internal(final SubLObject predicate, final SubLObject argnum, SubLObject domain_mt) {
        if (domain_mt == rkf_domain_examples.UNPROVIDED) {
            domain_mt = (SubLObject)rkf_domain_examples.NIL;
        }
        return relationship_generality_estimates.relation_most_restricted_arg_constraint(predicate, argnum, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9566L)
    public static SubLObject relation_most_restricted_arg_constraint_memoized(final SubLObject predicate, final SubLObject argnum, SubLObject domain_mt) {
        if (domain_mt == rkf_domain_examples.UNPROVIDED) {
            domain_mt = (SubLObject)rkf_domain_examples.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_domain_examples.NIL;
        if (rkf_domain_examples.NIL == v_memoization_state) {
            return relation_most_restricted_arg_constraint_memoized_internal(predicate, argnum, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_domain_examples.$sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_domain_examples.$sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, (SubLObject)rkf_domain_examples.THREE_INTEGER, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQL, (SubLObject)rkf_domain_examples.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_domain_examples.$sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_domain_examples.NIL;
            collision = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_domain_examples.NIL != cached_args && rkf_domain_examples.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relation_most_restricted_arg_constraint_memoized_internal(predicate, argnum, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, argnum, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9855L)
    public static SubLObject min_arity_memoized_internal(final SubLObject relation) {
        return arity.min_arity(relation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9855L)
    public static SubLObject min_arity_memoized(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_domain_examples.NIL;
        if (rkf_domain_examples.NIL == v_memoization_state) {
            return min_arity_memoized_internal(relation);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_domain_examples.$sym18$MIN_ARITY_MEMOIZED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_domain_examples.$sym18$MIN_ARITY_MEMOIZED, (SubLObject)rkf_domain_examples.ONE_INTEGER, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQL, (SubLObject)rkf_domain_examples.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_domain_examples.$sym18$MIN_ARITY_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(min_arity_memoized_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)rkf_domain_examples.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9949L)
    public static SubLObject rkf_predicate_indicators(final SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt) {
        if (generation_mt == rkf_domain_examples.UNPROVIDED) {
            generation_mt = (SubLObject)rkf_domain_examples.NIL;
        }
        if (domain_mt == rkf_domain_examples.UNPROVIDED) {
            domain_mt = (SubLObject)rkf_domain_examples.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = (SubLObject)rkf_domain_examples.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_domain_examples.NIL;
        try {
            thread.throwStack.push(rkf_domain_examples.$kw10$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym11$IGNORE_ERRORS_HANDLER), thread);
                try {
                    template = rkf_predicate_creator.generic_relation_template(predicate);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_domain_examples.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_domain_examples.$kw10$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (rkf_domain_examples.NIL != template) {
            SubLObject generic_phrase = rkf_sentence_communicator.rkf_sentence_phrase(template, generation_mt, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED);
            SubLObject cdolist_list_var = cycl_utilities.formula_args(template, (SubLObject)rkf_domain_examples.UNPROVIDED);
            SubLObject generic_arg = (SubLObject)rkf_domain_examples.NIL;
            generic_arg = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                final SubLObject term_phrase = rkf_concept_communicator.rkf_term_phrase(generic_arg, generation_mt, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
                generic_phrase = string_utilities.string_substitute((SubLObject)rkf_domain_examples.$str19$_, term_phrase, generic_phrase, (SubLObject)rkf_domain_examples.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                generic_arg = cdolist_list_var.first();
            }
            final SubLObject tokens = rkf_concept_harvester.rkf_ch_raw_tokenization(generic_phrase);
            return tokens;
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 10880L)
    public static SubLObject rkf_predicate_indicators_match_score(final SubLObject phrase, final SubLObject indicators) {
        final SubLObject phrase_tokens = rkf_ch_raw_tokenization_memoized(phrase);
        SubLObject score = (SubLObject)rkf_domain_examples.ZERO_INTEGER;
        SubLObject cdolist_list_var = phrase_tokens;
        SubLObject phrase_token = (SubLObject)rkf_domain_examples.NIL;
        phrase_token = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            if (rkf_domain_examples.NIL != Sequences.find(phrase_token, indicators, Symbols.symbol_function((SubLObject)rkf_domain_examples.EQUALP), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED)) {
                score = Numbers.add(score, (SubLObject)rkf_domain_examples.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase_token = cdolist_list_var.first();
        }
        return score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 11165L)
    public static SubLObject rkf_ch_raw_tokenization_memoized_internal(final SubLObject string) {
        return rkf_concept_harvester.rkf_ch_raw_tokenization(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 11165L)
    public static SubLObject rkf_ch_raw_tokenization_memoized(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_domain_examples.NIL;
        if (rkf_domain_examples.NIL == v_memoization_state) {
            return rkf_ch_raw_tokenization_memoized_internal(string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_domain_examples.$sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_domain_examples.$sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED, (SubLObject)rkf_domain_examples.ONE_INTEGER, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQUAL, (SubLObject)rkf_domain_examples.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_domain_examples.$sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_ch_raw_tokenization_memoized_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_domain_examples.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 11285L)
    public static SubLObject rkf_predicate_suggestor_matches(final SubLObject v_term, final SubLObject domain_mt, SubLObject horizon) {
        if (horizon == rkf_domain_examples.UNPROVIDED) {
            horizon = (SubLObject)rkf_domain_examples.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = cardinality_estimates.sort_by_generality_estimate(isa.all_isa(v_term, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED), (SubLObject)rkf_domain_examples.$kw21$ASCENDING);
        SubLObject all_genls = (SubLObject)((rkf_domain_examples.NIL != subl_promotions.memberP(rkf_domain_examples.$const22$Collection, all_isa, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED)) ? cardinality_estimates.sort_by_generality_estimate(genls.all_genls(v_term, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED), (SubLObject)rkf_domain_examples.$kw21$ASCENDING) : rkf_domain_examples.NIL);
        if (rkf_domain_examples.NIL != horizon) {
            final SubLObject horizon_generality = cardinality_estimates.generality_estimate(horizon);
            all_isa = Sequences.delete(horizon_generality, all_isa, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym24$GENERALITY_ESTIMATE), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
            all_genls = Sequences.delete(horizon_generality, all_genls, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym24$GENERALITY_ESTIMATE), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        }
        SubLObject matches = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_domain_examples.$sym25$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(domain_mt, thread);
            if (rkf_domain_examples.NIL != all_isa) {
                final SubLObject constraint = rkf_domain_examples.$const12$argIsa;
                final SubLObject message = PrintLow.format((SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.$str26$identifying__S_matches, constraint);
                final SubLObject list_var = all_isa;
                final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((rkf_domain_examples.NIL != message) ? message : rkf_domain_examples.$str27$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject collection = (SubLObject)rkf_domain_examples.NIL;
                        collection = csome_list_var.first();
                        while (rkf_domain_examples.NIL != csome_list_var) {
                            if (rkf_domain_examples.NIL != forts.fort_p(collection)) {
                                final SubLObject pred_var = constraint;
                                if (rkf_domain_examples.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)rkf_domain_examples.THREE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)rkf_domain_examples.THREE_INTEGER, pred_var);
                                    SubLObject done_var = (SubLObject)rkf_domain_examples.NIL;
                                    final SubLObject token_var = (SubLObject)rkf_domain_examples.NIL;
                                    while (rkf_domain_examples.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (rkf_domain_examples.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)rkf_domain_examples.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_domain_examples.$kw28$GAF, (SubLObject)rkf_domain_examples.$kw29$TRUE, (SubLObject)rkf_domain_examples.NIL);
                                                SubLObject done_var_$4 = (SubLObject)rkf_domain_examples.NIL;
                                                final SubLObject token_var_$5 = (SubLObject)rkf_domain_examples.NIL;
                                                while (rkf_domain_examples.NIL == done_var_$4) {
                                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(ass));
                                                    if (rkf_domain_examples.NIL != valid_$6) {
                                                        final SubLObject predicate = assertions_high.gaf_arg(ass, (SubLObject)rkf_domain_examples.ONE_INTEGER);
                                                        final SubLObject argnum = assertions_high.gaf_arg(ass, (SubLObject)rkf_domain_examples.TWO_INTEGER);
                                                        if (rkf_domain_examples.NIL != fort_types_interface.predicateP(predicate) && rkf_domain_examples.NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject collection_$7 = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                            final SubLObject constraint_$8 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, argnum, constraint_$8, collection_$7), matches);
                                                        }
                                                    }
                                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL == valid_$6);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (rkf_domain_examples.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL == valid);
                                    }
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            collection = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$3, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$2, thread);
                }
            }
            if (rkf_domain_examples.NIL != all_genls) {
                final SubLObject constraint = rkf_domain_examples.$const13$argGenl;
                final SubLObject message = PrintLow.format((SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.$str26$identifying__S_matches, constraint);
                final SubLObject list_var = all_genls;
                final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((rkf_domain_examples.NIL != message) ? message : rkf_domain_examples.$str27$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject collection = (SubLObject)rkf_domain_examples.NIL;
                        collection = csome_list_var.first();
                        while (rkf_domain_examples.NIL != csome_list_var) {
                            if (rkf_domain_examples.NIL != forts.fort_p(collection)) {
                                final SubLObject pred_var = constraint;
                                if (rkf_domain_examples.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)rkf_domain_examples.THREE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)rkf_domain_examples.THREE_INTEGER, pred_var);
                                    SubLObject done_var = (SubLObject)rkf_domain_examples.NIL;
                                    final SubLObject token_var = (SubLObject)rkf_domain_examples.NIL;
                                    while (rkf_domain_examples.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (rkf_domain_examples.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)rkf_domain_examples.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_domain_examples.$kw28$GAF, (SubLObject)rkf_domain_examples.$kw29$TRUE, (SubLObject)rkf_domain_examples.NIL);
                                                SubLObject done_var_$5 = (SubLObject)rkf_domain_examples.NIL;
                                                final SubLObject token_var_$6 = (SubLObject)rkf_domain_examples.NIL;
                                                while (rkf_domain_examples.NIL == done_var_$5) {
                                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(ass));
                                                    if (rkf_domain_examples.NIL != valid_$7) {
                                                        final SubLObject predicate = assertions_high.gaf_arg(ass, (SubLObject)rkf_domain_examples.ONE_INTEGER);
                                                        final SubLObject argnum = assertions_high.gaf_arg(ass, (SubLObject)rkf_domain_examples.TWO_INTEGER);
                                                        if (rkf_domain_examples.NIL != fort_types_interface.predicateP(predicate) && rkf_domain_examples.NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject collection_$8 = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                            final SubLObject constraint_$9 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, argnum, constraint_$9, collection_$8), matches);
                                                        }
                                                    }
                                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL == valid_$7);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    if (rkf_domain_examples.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL == valid);
                                    }
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            collection = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$4, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        matches = list_utilities.fast_delete_duplicates(matches, Symbols.symbol_function((SubLObject)rkf_domain_examples.EQUAL), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 13908L)
    public static SubLObject rkf_predicate_selector_matches(final SubLObject v_term, final SubLObject domain_mt, final SubLObject predicates, SubLObject horizon) {
        if (horizon == rkf_domain_examples.UNPROVIDED) {
            horizon = (SubLObject)rkf_domain_examples.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject horizon_generality_estimate = (SubLObject)((rkf_domain_examples.NIL != horizon) ? cardinality_estimates.generality_estimate(horizon) : rkf_domain_examples.NIL);
        SubLObject matches = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str30$identifying_matches, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(predicates), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
                predicate = csome_list_var.first();
                while (rkf_domain_examples.NIL != csome_list_var) {
                    final SubLObject v_arity = min_arity_memoized(predicate);
                    if (rkf_domain_examples.NIL != v_arity) {
                        SubLObject i;
                        SubLObject argnum;
                        SubLObject collection;
                        SubLObject constraint;
                        for (i = (SubLObject)rkf_domain_examples.NIL, i = (SubLObject)rkf_domain_examples.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rkf_domain_examples.ONE_INTEGER)) {
                            argnum = Numbers.add((SubLObject)rkf_domain_examples.ONE_INTEGER, i);
                            if (rkf_domain_examples.NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                thread.resetMultipleValues();
                                collection = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                constraint = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (rkf_domain_examples.NIL == horizon_generality_estimate || !cardinality_estimates.generality_estimate(collection).numG(horizon_generality_estimate)) {
                                    matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, argnum, constraint, collection), matches);
                                }
                            }
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 15134L)
    public static SubLObject rkf_organize_predicate_matches_by_collection(SubLObject matches) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_domain_examples.NIL != Types.listp(matches) : matches;
        matches = list_utilities.sort_via_position(matches, (SubLObject)rkf_domain_examples.$list32, Symbols.symbol_function((SubLObject)rkf_domain_examples.EQL), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym33$THIRD));
        matches = Sort.stable_sort(matches, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym34$SECOND));
        matches = Sort.stable_sort(matches, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym35$RELATION_GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym36$FIRST));
        matches = Sort.stable_sort(matches, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym37$GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym38$FOURTH));
        SubLObject last_match = (SubLObject)rkf_domain_examples.$list39;
        SubLObject args = (SubLObject)rkf_domain_examples.NIL;
        SubLObject preds = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cols = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject list_var = matches;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str40$organizing_matches, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject this_match = (SubLObject)rkf_domain_examples.NIL;
                this_match = csome_list_var.first();
                while (rkf_domain_examples.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = last_match;
                    SubLObject last_pred = (SubLObject)rkf_domain_examples.NIL;
                    SubLObject last_arg = (SubLObject)rkf_domain_examples.NIL;
                    SubLObject last_constraint = (SubLObject)rkf_domain_examples.NIL;
                    SubLObject last_col = (SubLObject)rkf_domain_examples.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_domain_examples.$list41);
                    last_pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_domain_examples.$list41);
                    last_arg = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_domain_examples.$list41);
                    last_constraint = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_domain_examples.$list41);
                    last_col = current.first();
                    current = current.rest();
                    if (rkf_domain_examples.NIL == current) {
                        SubLObject current_$22;
                        final SubLObject datum_$21 = current_$22 = this_match;
                        SubLObject this_pred = (SubLObject)rkf_domain_examples.NIL;
                        SubLObject this_arg = (SubLObject)rkf_domain_examples.NIL;
                        SubLObject this_constraint = (SubLObject)rkf_domain_examples.NIL;
                        SubLObject this_col = (SubLObject)rkf_domain_examples.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)rkf_domain_examples.$list42);
                        this_pred = current_$22.first();
                        current_$22 = current_$22.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)rkf_domain_examples.$list42);
                        this_arg = current_$22.first();
                        current_$22 = current_$22.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)rkf_domain_examples.$list42);
                        this_constraint = current_$22.first();
                        current_$22 = current_$22.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)rkf_domain_examples.$list42);
                        this_col = current_$22.first();
                        current_$22 = current_$22.rest();
                        if (rkf_domain_examples.NIL == current_$22) {
                            if (last_col.equal(this_col)) {
                                if (last_pred.equal(this_pred)) {
                                    args = (SubLObject)ConsesLow.cons(this_arg, args);
                                }
                                else {
                                    args = Sequences.nreverse(args);
                                    preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(last_pred, args), preds);
                                    args = (SubLObject)rkf_domain_examples.NIL;
                                    args = (SubLObject)ConsesLow.cons(this_arg, args);
                                }
                            }
                            else {
                                args = Sequences.nreverse(args);
                                preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(last_pred, args), preds);
                                args = (SubLObject)rkf_domain_examples.NIL;
                                preds = Sequences.nreverse(preds);
                                cols = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(last_col, preds), cols);
                                preds = (SubLObject)rkf_domain_examples.NIL;
                                args = (SubLObject)ConsesLow.cons(this_arg, args);
                            }
                            last_match = this_match;
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$21, (SubLObject)rkf_domain_examples.$list42);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_domain_examples.$list41);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    this_match = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject current2;
        final SubLObject datum2 = current2 = last_match;
        SubLObject last_pred2 = (SubLObject)rkf_domain_examples.NIL;
        SubLObject last_arg2 = (SubLObject)rkf_domain_examples.NIL;
        SubLObject last_constraint2 = (SubLObject)rkf_domain_examples.NIL;
        SubLObject last_col2 = (SubLObject)rkf_domain_examples.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rkf_domain_examples.$list41);
        last_pred2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rkf_domain_examples.$list41);
        last_arg2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rkf_domain_examples.$list41);
        last_constraint2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rkf_domain_examples.$list41);
        last_col2 = current2.first();
        current2 = current2.rest();
        if (rkf_domain_examples.NIL == current2) {
            args = Sequences.nreverse(args);
            preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(last_pred2, args), preds);
            args = (SubLObject)rkf_domain_examples.NIL;
            preds = Sequences.nreverse(preds);
            cols = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(last_col2, preds), cols);
            preds = (SubLObject)rkf_domain_examples.NIL;
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)rkf_domain_examples.$list41);
        }
        cols = Sequences.nreverse(cols);
        return cols.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 17573L)
    public static SubLObject rkf_organize_predicate_matches_by_mt(final SubLObject matches) {
        SubLObject predicates = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cdolist_list_var = matches;
        SubLObject match = (SubLObject)rkf_domain_examples.NIL;
        match = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            predicates = (SubLObject)ConsesLow.cons(match.first(), predicates);
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        }
        predicates = list_utilities.fast_delete_duplicates(predicates, Symbols.symbol_function((SubLObject)rkf_domain_examples.EQUAL), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        return rkf_organize_predicates_by_mt(predicates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 17848L)
    public static SubLObject rkf_organize_predicates_by_specificity_to_term(final SubLObject predicates, final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject matches = rkf_predicate_selector_matches(v_term, domain_mt, predicates, (SubLObject)rkf_domain_examples.UNPROVIDED);
        final SubLObject match_sections = rkf_organize_predicate_matches_by_collection(matches);
        SubLObject v_answer = (SubLObject)rkf_domain_examples.NIL;
        SubLObject cdolist_list_var = match_sections;
        SubLObject match_section = (SubLObject)rkf_domain_examples.NIL;
        match_section = cdolist_list_var.first();
        while (rkf_domain_examples.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = match_section;
            SubLObject collection = (SubLObject)rkf_domain_examples.NIL;
            SubLObject match_predicate_sections = (SubLObject)rkf_domain_examples.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_domain_examples.$list43);
            collection = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_domain_examples.$list43);
            match_predicate_sections = current.first();
            current = current.rest();
            if (rkf_domain_examples.NIL == current) {
                SubLObject predicates_$24 = (SubLObject)rkf_domain_examples.NIL;
                SubLObject cdolist_list_var_$25 = match_predicate_sections;
                SubLObject match_predicate_section = (SubLObject)rkf_domain_examples.NIL;
                match_predicate_section = cdolist_list_var_$25.first();
                while (rkf_domain_examples.NIL != cdolist_list_var_$25) {
                    SubLObject current_$27;
                    final SubLObject datum_$26 = current_$27 = match_predicate_section;
                    SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
                    SubLObject argnum_list = (SubLObject)rkf_domain_examples.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$27, datum_$26, (SubLObject)rkf_domain_examples.$list44);
                    predicate = current_$27.first();
                    current_$27 = current_$27.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$27, datum_$26, (SubLObject)rkf_domain_examples.$list44);
                    argnum_list = current_$27.first();
                    current_$27 = current_$27.rest();
                    if (rkf_domain_examples.NIL == current_$27) {
                        predicates_$24 = (SubLObject)ConsesLow.cons(predicate, predicates_$24);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$26, (SubLObject)rkf_domain_examples.$list44);
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    match_predicate_section = cdolist_list_var_$25.first();
                }
                predicates_$24 = list_utilities.fast_delete_duplicates(predicates_$24, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
                predicates_$24 = Sort.sort(predicates_$24, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym45$RELATION_GENERALITY_ESTIMATE));
                v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, predicates_$24), v_answer);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_domain_examples.$list43);
            }
            cdolist_list_var = cdolist_list_var.rest();
            match_section = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 19083L)
    public static SubLObject rkf_organize_predicates_by_specificity_of_args(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_table = Hashtables.make_hash_table(Sequences.length(predicates), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str46$categorizing_predicates, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(predicates), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
                predicate = csome_list_var.first();
                while (rkf_domain_examples.NIL != csome_list_var) {
                    final SubLObject argnum = relationship_generality_estimates.relation_most_restricted_arg(predicate);
                    thread.resetMultipleValues();
                    final SubLObject collection = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                    final SubLObject constraint = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    Hashtables.sethash(collection, answer_table, (SubLObject)ConsesLow.cons(predicate, Hashtables.gethash(collection, answer_table, (SubLObject)rkf_domain_examples.NIL)));
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject v_answer = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject table_var = answer_table;
        final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str47$sorting_predicates, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject collection2 = (SubLObject)rkf_domain_examples.NIL;
                SubLObject predicates_$29 = (SubLObject)rkf_domain_examples.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        collection2 = Hashtables.getEntryKey(cdohash_entry);
                        predicates_$29 = Hashtables.getEntryValue(cdohash_entry);
                        predicates_$29 = Sort.sort(predicates_$29, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym45$RELATION_GENERALITY_ESTIMATE));
                        v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection2, predicates_$29), v_answer);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_12, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_11, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_10, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_9, thread);
        }
        v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym37$GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym36$FIRST));
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 20185L)
    public static SubLObject rkf_organize_predicates_by_mt(final SubLObject predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_table = Hashtables.make_hash_table(Sequences.length(predicates), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str46$categorizing_predicates, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(predicates), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
                predicate = csome_list_var.first();
                while (rkf_domain_examples.NIL != csome_list_var) {
                    final SubLObject defining_mt = rkf_relation_defining_mts(predicate).first();
                    Hashtables.sethash(defining_mt, answer_table, (SubLObject)ConsesLow.cons(predicate, Hashtables.gethash(defining_mt, answer_table, (SubLObject)rkf_domain_examples.NIL)));
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject v_answer = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject table_var = answer_table;
        final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str47$sorting_predicates, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject defining_mt = (SubLObject)rkf_domain_examples.NIL;
                SubLObject predicates_$32 = (SubLObject)rkf_domain_examples.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        defining_mt = Hashtables.getEntryKey(cdohash_entry);
                        predicates_$32 = Hashtables.getEntryValue(cdohash_entry);
                        predicates_$32 = Sort.sort(predicates_$32, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym45$RELATION_GENERALITY_ESTIMATE));
                        v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(defining_mt, predicates_$32), v_answer);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_12, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_11, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_10, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_9, thread);
        }
        v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym37$GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym36$FIRST));
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 21115L)
    public static SubLObject rkf_relation_defining_mts(final SubLObject relation) {
        return isa.max_floor_mts_of_isa_paths(relation, rkf_domain_examples.$const48$Relation, (SubLObject)rkf_domain_examples.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 21227L)
    public static SubLObject rkf_organize_predicates_by_similarity(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_table = Hashtables.make_hash_table(Sequences.length(predicates), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
        SubLObject self_tops = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str46$categorizing_predicates, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(predicates), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = (SubLObject)rkf_domain_examples.NIL;
                predicate = csome_list_var.first();
                while (rkf_domain_examples.NIL != csome_list_var) {
                    final SubLObject genl_pred = rkf_ontology_utilities.rkf_predicate_tops(predicate, domain_mt).first();
                    if (predicate.eql(genl_pred)) {
                        self_tops = (SubLObject)ConsesLow.cons(predicate, self_tops);
                    }
                    else {
                        Hashtables.sethash(genl_pred, answer_table, (SubLObject)ConsesLow.cons(predicate, Hashtables.gethash(genl_pred, answer_table, (SubLObject)rkf_domain_examples.NIL)));
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject v_answer = (SubLObject)rkf_domain_examples.NIL;
        final SubLObject table_var = answer_table;
        final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rkf_domain_examples.$str47$sorting_predicates, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_domain_examples.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_domain_examples.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_domain_examples.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject genl_pred = (SubLObject)rkf_domain_examples.NIL;
                SubLObject predicates_$35 = (SubLObject)rkf_domain_examples.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        genl_pred = Hashtables.getEntryKey(cdohash_entry);
                        predicates_$35 = Hashtables.getEntryValue(cdohash_entry);
                        predicates_$35 = Sort.sort(predicates_$35, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym45$RELATION_GENERALITY_ESTIMATE));
                        v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(genl_pred, predicates_$35), v_answer);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rkf_domain_examples.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_domain_examples.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_12, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_11, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_10, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_9, thread);
        }
        v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym35$RELATION_GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym36$FIRST));
        self_tops = Sort.sort(self_tops, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym23$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym45$RELATION_GENERALITY_ESTIMATE));
        final SubLObject section_key = (SubLObject)rkf_domain_examples.$str49$Other_predicates;
        final SubLObject self_top_section = (SubLObject)ConsesLow.list(section_key, self_tops);
        ConsesLow.rplacd(conses_high.last(v_answer, (SubLObject)rkf_domain_examples.UNPROVIDED), (SubLObject)ConsesLow.list(self_top_section));
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 22687L)
    public static SubLObject rkf_sentence_has_variations(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        if (rkf_domain_examples.NIL != forts.fort_p(predicate) && rkf_domain_examples.NIL != fort_types_interface.predicateP(predicate) && rkf_domain_examples.NIL != arity.binaryP(predicate)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rkf_domain_examples.NIL != rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.ONE_INTEGER, domain_mt) || rkf_domain_examples.NIL != rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.TWO_INTEGER, domain_mt));
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 23373L)
    public static SubLObject rkf_sentence_variations(final SubLObject sentence, final SubLObject domain_mt) {
        return rkf_sentence_variations_internal(sentence, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 23563L)
    public static SubLObject rkf_sentence_variations_internal(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject variations = ConsesLow.nconc(rkf_sentence_variations_type_type(sentence, domain_mt), rkf_sentence_variations_type_instance(sentence, domain_mt), rkf_sentence_variations_instance_type(sentence, domain_mt));
        return variations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 23888L)
    public static SubLObject rkf_sentence_variations_type_type(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        final SubLObject arg_1_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.ONE_INTEGER, domain_mt);
        final SubLObject arg_2_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.TWO_INTEGER, domain_mt);
        if (rkf_domain_examples.NIL != arg_1_variation && rkf_domain_examples.NIL != arg_2_variation) {
            final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances(rkf_domain_examples.$const50$TypeTypeTernaryRuleMacroPredicate, domain_mt);
            SubLObject variations = (SubLObject)rkf_domain_examples.NIL;
            SubLObject cdolist_list_var = rule_macro_predicates;
            SubLObject rule_macro_predicate = (SubLObject)rkf_domain_examples.NIL;
            rule_macro_predicate = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                final SubLObject variation = el_utilities.make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                variations = (SubLObject)ConsesLow.cons(variation, variations);
                cdolist_list_var = cdolist_list_var.rest();
                rule_macro_predicate = cdolist_list_var.first();
            }
            variations = Sequences.nreverse(variations);
            return variations;
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 24711L)
    public static SubLObject rkf_sentence_variations_type_instance(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        final SubLObject arg_1_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.ONE_INTEGER, domain_mt);
        final SubLObject arg_2_variation = rkf_example_instance_variation_for_arg(cycl_utilities.sentence_arg2(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.TWO_INTEGER, domain_mt);
        if (rkf_domain_examples.NIL != arg_1_variation && rkf_domain_examples.NIL != arg_2_variation) {
            final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances(rkf_domain_examples.$const51$TypeInstanceTernaryRuleMacroPredi, domain_mt);
            SubLObject variations = (SubLObject)rkf_domain_examples.NIL;
            SubLObject cdolist_list_var = rule_macro_predicates;
            SubLObject rule_macro_predicate = (SubLObject)rkf_domain_examples.NIL;
            rule_macro_predicate = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                final SubLObject variation = el_utilities.make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                variations = (SubLObject)ConsesLow.cons(variation, variations);
                cdolist_list_var = cdolist_list_var.rest();
                rule_macro_predicate = cdolist_list_var.first();
            }
            variations = Sequences.nreverse(variations);
            return variations;
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 25546L)
    public static SubLObject rkf_sentence_variations_instance_type(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        final SubLObject arg_1_variation = rkf_example_instance_variation_for_arg(cycl_utilities.sentence_arg1(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.ONE_INTEGER, domain_mt);
        final SubLObject arg_2_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, (SubLObject)rkf_domain_examples.UNPROVIDED), predicate, (SubLObject)rkf_domain_examples.TWO_INTEGER, domain_mt);
        if (rkf_domain_examples.NIL != arg_1_variation && rkf_domain_examples.NIL != arg_2_variation) {
            final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances(rkf_domain_examples.$const52$InstanceTypeTernaryRuleMacroPredi, domain_mt);
            SubLObject variations = (SubLObject)rkf_domain_examples.NIL;
            SubLObject cdolist_list_var = rule_macro_predicates;
            SubLObject rule_macro_predicate = (SubLObject)rkf_domain_examples.NIL;
            rule_macro_predicate = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                final SubLObject variation = el_utilities.make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                variations = (SubLObject)ConsesLow.cons(variation, variations);
                cdolist_list_var = cdolist_list_var.rest();
                rule_macro_predicate = cdolist_list_var.first();
            }
            variations = Sequences.nreverse(variations);
            return variations;
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26381L)
    public static SubLObject rkf_example_instance_variation_for_arg(final SubLObject example, final SubLObject predicate, final SubLObject arg, final SubLObject domain_mt) {
        return example;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26569L)
    public static SubLObject rkf_example_type_variation_for_arg(final SubLObject example, final SubLObject predicate, final SubLObject arg, final SubLObject domain_mt) {
        if (rkf_domain_examples.NIL != isa.isa_in_any_mtP(example, rkf_domain_examples.$const22$Collection)) {
            return (SubLObject)rkf_domain_examples.NIL;
        }
        final SubLObject min_isas = rkf_ontology_utilities.rkf_min_isa(example, domain_mt);
        return min_isas.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
    public static SubLObject clear_rkf_min_arg_n_isa() {
        final SubLObject cs = rkf_domain_examples.$rkf_min_arg_n_isa_caching_state$.getGlobalValue();
        if (rkf_domain_examples.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
    public static SubLObject remove_rkf_min_arg_n_isa(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_domain_examples.$rkf_min_arg_n_isa_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, n, domain_mt), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
    public static SubLObject rkf_min_arg_n_isa_internal(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject constraints = kb_accessors.min_argn_isa(relation, n, domain_mt);
        constraints = cardinality_estimates.sort_by_generality_estimate(constraints, (SubLObject)rkf_domain_examples.$kw21$ASCENDING);
        return constraints.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
    public static SubLObject rkf_min_arg_n_isa(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject caching_state = rkf_domain_examples.$rkf_min_arg_n_isa_caching_state$.getGlobalValue();
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_domain_examples.$sym53$RKF_MIN_ARG_N_ISA, (SubLObject)rkf_domain_examples.$sym54$_RKF_MIN_ARG_N_ISA_CACHING_STATE_, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQL, (SubLObject)rkf_domain_examples.THREE_INTEGER, (SubLObject)rkf_domain_examples.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, n, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_domain_examples.NIL;
            collision = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (n.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_domain_examples.NIL != cached_args && rkf_domain_examples.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_min_arg_n_isa_internal(relation, n, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, n, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
    public static SubLObject clear_rkf_min_arg_n_genl() {
        final SubLObject cs = rkf_domain_examples.$rkf_min_arg_n_genl_caching_state$.getGlobalValue();
        if (rkf_domain_examples.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
    public static SubLObject remove_rkf_min_arg_n_genl(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_domain_examples.$rkf_min_arg_n_genl_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation, n, domain_mt), (SubLObject)rkf_domain_examples.UNPROVIDED, (SubLObject)rkf_domain_examples.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
    public static SubLObject rkf_min_arg_n_genl_internal(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject constraints = kb_accessors.min_argn_genl(relation, n, domain_mt);
        constraints = cardinality_estimates.sort_by_generality_estimate(constraints, (SubLObject)rkf_domain_examples.$kw21$ASCENDING);
        return constraints.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
    public static SubLObject rkf_min_arg_n_genl(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject caching_state = rkf_domain_examples.$rkf_min_arg_n_genl_caching_state$.getGlobalValue();
        if (rkf_domain_examples.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_domain_examples.$sym55$RKF_MIN_ARG_N_GENL, (SubLObject)rkf_domain_examples.$sym56$_RKF_MIN_ARG_N_GENL_CACHING_STATE_, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.EQL, (SubLObject)rkf_domain_examples.THREE_INTEGER, (SubLObject)rkf_domain_examples.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, n, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_domain_examples.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_domain_examples.NIL;
            collision = cdolist_list_var.first();
            while (rkf_domain_examples.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (relation.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (n.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_domain_examples.NIL != cached_args && rkf_domain_examples.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_min_arg_n_genl_internal(relation, n, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(relation, n, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27506L)
    public static SubLObject rkf_rule_macro_type_instances(final SubLObject rule_macro_type, final SubLObject domain_mt) {
        SubLObject predicates = isa.all_fort_instances(rule_macro_type, domain_mt, (SubLObject)rkf_domain_examples.UNPROVIDED);
        predicates = rkf_relevance_utilities.rkf_filter_irrelevant_terms(predicates, domain_mt);
        predicates = Sort.sort(predicates, Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym57$_), Symbols.symbol_function((SubLObject)rkf_domain_examples.$sym58$NUM_PREDICATE_EXTENT_INDEX));
        return predicates;
    }
    
    public static SubLObject declare_rkf_domain_examples_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_salient_spec_predicateP", "RKF-SALIENT-SPEC-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_salient_spec_predicate_memoized_internal", "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_salient_spec_predicate_memoized", "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_salient_spec_predicate_internal", "RKF-SALIENT-SPEC-PREDICATE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_build_spec_predicate_graph", "RKF-BUILD-SPEC-PREDICATE-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_build_spec_predicate_graph_memoized_internal", "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_build_spec_predicate_graph_memoized", "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_build_spec_predicate_graph_internal", "RKF-BUILD-SPEC-PREDICATE-GRAPH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_interpret_spec_predicate_graph", "RKF-INTERPRET-SPEC-PREDICATE-GRAPH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_add_to_spec_predicate_graph", "RKF-ADD-TO-SPEC-PREDICATE-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_extend_spec_predicate_graph_entry", "RKF-EXTEND-SPEC-PREDICATE-GRAPH-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_obtain_spec_predicate_sub_graph", "RKF-OBTAIN-SPEC-PREDICATE-SUB-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_count_spec_predicate_sub_graphs", "RKF-COUNT-SPEC-PREDICATE-SUB-GRAPHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_domain_example_predicates", "RKF-DOMAIN-EXAMPLE-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_example_sentence", "RKF-PREDICATE-EXAMPLE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_all_predicate_example_sentences", "RKF-ALL-PREDICATE-EXAMPLE-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_all_predicate_specific_example_sentences", "RKF-ALL-PREDICATE-SPECIFIC-EXAMPLE-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_specific_example_sentence", "RKF-PREDICATE-SPECIFIC-EXAMPLE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_generic_example_sentence", "RKF-PREDICATE-GENERIC-EXAMPLE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_domain_example_predicates_internal", "RKF-DOMAIN-EXAMPLE-PREDICATES-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_all_predicate_example_sentences_internal", "RKF-ALL-PREDICATE-EXAMPLE-SENTENCES-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_generic_example_sentence_internal", "RKF-PREDICATE-GENERIC-EXAMPLE-SENTENCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_generic_example_for_collection", "RKF-GENERIC-EXAMPLE-FOR-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_generic_spec_for_collection", "RKF-GENERIC-SPEC-FOR-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_generic_example_p", "RKF-GENERIC-EXAMPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_generic_example_instance_level_p", "RKF-GENERIC-EXAMPLE-INSTANCE-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "relation_most_restricted_arg_constraint_memoized_internal", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "relation_most_restricted_arg_constraint_memoized", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "min_arity_memoized_internal", "MIN-ARITY-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "min_arity_memoized", "MIN-ARITY-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_indicators", "RKF-PREDICATE-INDICATORS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_indicators_match_score", "RKF-PREDICATE-INDICATORS-MATCH-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_ch_raw_tokenization_memoized_internal", "RKF-CH-RAW-TOKENIZATION-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_ch_raw_tokenization_memoized", "RKF-CH-RAW-TOKENIZATION-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_suggestor_matches", "RKF-PREDICATE-SUGGESTOR-MATCHES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_predicate_selector_matches", "RKF-PREDICATE-SELECTOR-MATCHES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_organize_predicate_matches_by_collection", "RKF-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_organize_predicate_matches_by_mt", "RKF-ORGANIZE-PREDICATE-MATCHES-BY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_organize_predicates_by_specificity_to_term", "RKF-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_organize_predicates_by_specificity_of_args", "RKF-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_organize_predicates_by_mt", "RKF-ORGANIZE-PREDICATES-BY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_relation_defining_mts", "RKF-RELATION-DEFINING-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_organize_predicates_by_similarity", "RKF-ORGANIZE-PREDICATES-BY-SIMILARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_sentence_has_variations", "RKF-SENTENCE-HAS-VARIATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_sentence_variations", "RKF-SENTENCE-VARIATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_sentence_variations_internal", "RKF-SENTENCE-VARIATIONS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_sentence_variations_type_type", "RKF-SENTENCE-VARIATIONS-TYPE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_sentence_variations_type_instance", "RKF-SENTENCE-VARIATIONS-TYPE-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_sentence_variations_instance_type", "RKF-SENTENCE-VARIATIONS-INSTANCE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_example_instance_variation_for_arg", "RKF-EXAMPLE-INSTANCE-VARIATION-FOR-ARG", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_example_type_variation_for_arg", "RKF-EXAMPLE-TYPE-VARIATION-FOR-ARG", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "clear_rkf_min_arg_n_isa", "CLEAR-RKF-MIN-ARG-N-ISA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "remove_rkf_min_arg_n_isa", "REMOVE-RKF-MIN-ARG-N-ISA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_min_arg_n_isa_internal", "RKF-MIN-ARG-N-ISA-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_min_arg_n_isa", "RKF-MIN-ARG-N-ISA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "clear_rkf_min_arg_n_genl", "CLEAR-RKF-MIN-ARG-N-GENL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "remove_rkf_min_arg_n_genl", "REMOVE-RKF-MIN-ARG-N-GENL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_min_arg_n_genl_internal", "RKF-MIN-ARG-N-GENL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_min_arg_n_genl", "RKF-MIN-ARG-N-GENL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_domain_examples", "rkf_rule_macro_type_instances", "RKF-RULE-MACRO-TYPE-INSTANCES", 2, 0, false);
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    public static SubLObject init_rkf_domain_examples_file() {
        rkf_domain_examples.$rkf_min_arg_n_isa_caching_state$ = SubLFiles.deflexical("*RKF-MIN-ARG-N-ISA-CACHING-STATE*", (SubLObject)rkf_domain_examples.NIL);
        rkf_domain_examples.$rkf_min_arg_n_genl_caching_state$ = SubLFiles.deflexical("*RKF-MIN-ARG-N-GENL-CACHING-STATE*", (SubLObject)rkf_domain_examples.NIL);
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    public static SubLObject setup_rkf_domain_examples_file() {
        memoization_state.note_memoized_function((SubLObject)rkf_domain_examples.$sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_domain_examples.$sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_domain_examples.$sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_domain_examples.$sym18$MIN_ARITY_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_domain_examples.$sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED);
        memoization_state.note_globally_cached_function((SubLObject)rkf_domain_examples.$sym53$RKF_MIN_ARG_N_ISA);
        memoization_state.note_globally_cached_function((SubLObject)rkf_domain_examples.$sym55$RKF_MIN_ARG_N_GENL);
        return (SubLObject)rkf_domain_examples.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_domain_examples_file();
    }
    
    public void initializeVariables() {
        init_rkf_domain_examples_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_domain_examples_file();
    }
    
    static {
        me = (SubLFile)new rkf_domain_examples();
        rkf_domain_examples.$rkf_min_arg_n_isa_caching_state$ = null;
        rkf_domain_examples.$rkf_min_arg_n_genl_caching_state$ = null;
        $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED = SubLObjectFactory.makeSymbol("RKF-SALIENT-SPEC-PREDICATE-MEMOIZED");
        $const1$keSalientSpecPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keSalientSpecPredicate"));
        $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED = SubLObjectFactory.makeSymbol("RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED");
        $kw3$NODE = SubLObjectFactory.makeKeyword("NODE");
        $kw4$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $list5 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keSalientPredicate")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"));
        $kw6$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $const7$domainExamplePredSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("domainExamplePredSentences"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"));
        $const9$examplePredSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("examplePredSentences"));
        $kw10$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym11$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $const12$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const13$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $const14$SomeExampleFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleFn"));
        $const15$SomeExampleSpecFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleSpecFn"));
        $sym16$RKF_GENERIC_EXAMPLE_P = SubLObjectFactory.makeSymbol("RKF-GENERIC-EXAMPLE-P");
        $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED = SubLObjectFactory.makeSymbol("RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED");
        $sym18$MIN_ARITY_MEMOIZED = SubLObjectFactory.makeSymbol("MIN-ARITY-MEMOIZED");
        $str19$_ = SubLObjectFactory.makeString(" ");
        $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED = SubLObjectFactory.makeSymbol("RKF-CH-RAW-TOKENIZATION-MEMOIZED");
        $kw21$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $const22$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym23$_ = SubLObjectFactory.makeSymbol("<");
        $sym24$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $sym25$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str26$identifying__S_matches = SubLObjectFactory.makeString("identifying ~S matches");
        $str27$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw28$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw29$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str30$identifying_matches = SubLObjectFactory.makeString("identifying matches");
        $sym31$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")));
        $sym33$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $sym34$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym35$RELATION_GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("RELATION-GENERALITY-ESTIMATE<");
        $sym36$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym37$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym38$FOURTH = SubLObjectFactory.makeSymbol("FOURTH");
        $list39 = ConsesLow.list((SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.NIL, (SubLObject)rkf_domain_examples.NIL);
        $str40$organizing_matches = SubLObjectFactory.makeString("organizing matches");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-COL"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-COL"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH-PREDICATE-SECTIONS"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-LIST"));
        $sym45$RELATION_GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("RELATION-GENERALITY-ESTIMATE");
        $str46$categorizing_predicates = SubLObjectFactory.makeString("categorizing predicates");
        $str47$sorting_predicates = SubLObjectFactory.makeString("sorting predicates");
        $const48$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $str49$Other_predicates = SubLObjectFactory.makeString("Other predicates");
        $const50$TypeTypeTernaryRuleMacroPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeTypeTernaryRuleMacroPredicate"));
        $const51$TypeInstanceTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeInstanceTernaryRuleMacroPredicate"));
        $const52$InstanceTypeTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceTypeTernaryRuleMacroPredicate"));
        $sym53$RKF_MIN_ARG_N_ISA = SubLObjectFactory.makeSymbol("RKF-MIN-ARG-N-ISA");
        $sym54$_RKF_MIN_ARG_N_ISA_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-MIN-ARG-N-ISA-CACHING-STATE*");
        $sym55$RKF_MIN_ARG_N_GENL = SubLObjectFactory.makeSymbol("RKF-MIN-ARG-N-GENL");
        $sym56$_RKF_MIN_ARG_N_GENL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-MIN-ARG-N-GENL-CACHING-STATE*");
        $sym57$_ = SubLObjectFactory.makeSymbol(">");
        $sym58$NUM_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
    }
}

/*

	Total time: 730 ms
	
*/