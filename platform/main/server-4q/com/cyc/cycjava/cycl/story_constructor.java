/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      STORY-CONSTRUCTOR
 *  source file: /cyc/top/cycl/story-constructor.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class story_constructor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private story_constructor() {
    }

    public static final SubLFile me = new story_constructor();


    // // Definitions
    public static final SubLObject get_story_sentences_wrt_reference_set(SubLObject v_term, SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
                SubLObject v_properties = story_properties_of_term(v_term, mt, reference_set);
                SubLObject classification_min = TWO_INTEGER;
                SubLObject classification_max = multiply($float$0_9, typicality_reference_set.typicality_reference_set_cardinality(reference_set));
                SubLObject classifying_properties = NIL;
                SubLObject elaborating_properties = NIL;
                SubLObject progress_message = format(NIL, $str_alt1$Classifying_story_sentences_for__, v_term);
                SubLObject more_specifics = dictionary.new_dictionary(symbol_function(EQUAL), set.set_size(v_properties));
                SubLObject set_var = v_properties;
                utilities_macros.$progress_note$.setDynamicValue(progress_message, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(set.set_size(set_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject set_contents_var = set.do_set_internal(set_var);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject property = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, property)) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (!((NIL != subl_promotions.memberP(property, classifying_properties, symbol_function(EQUAL), UNPROVIDED)) || (NIL != member(property, elaborating_properties, symbol_function(EQUAL), UNPROVIDED)))) {
                                            {
                                                SubLObject prevalence = typicality_reference_set.property_prevalence(property, reference_set);
                                                SubLObject more_general_properties = properties.more_general_properties(property, mt, more_specifics);
                                                if ((!prevalence.isNumber()) || prevalence.numL(classification_min)) {
                                                    {
                                                        SubLObject more_general_foundP = NIL;
                                                        SubLObject most_specific_foundP = NIL;
                                                        if (NIL == most_specific_foundP) {
                                                            {
                                                                SubLObject csome_list_var = more_general_properties;
                                                                SubLObject more_general = NIL;
                                                                for (more_general = csome_list_var.first(); !((NIL != most_specific_foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , more_general = csome_list_var.first()) {
                                                                    {
                                                                        SubLObject more_general_prevalence = typicality_reference_set.property_prevalence(more_general, reference_set);
                                                                        if (more_general_prevalence.numGE(classification_min)) {
                                                                            more_general_foundP = T;
                                                                            prevalence = more_general_prevalence;
                                                                        } else
                                                                            if (more_general_prevalence.isZero()) {
                                                                                most_specific_foundP = T;
                                                                            }

                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL != more_general_foundP) {
                                                            classifying_properties = add_classifying_property(classifying_properties, prevalence, property, more_general_properties, more_specifics);
                                                        } else {
                                                            elaborating_properties = cons(property, elaborating_properties);
                                                        }
                                                    }
                                                } else
                                                    if (prevalence.numLE(classification_max)) {
                                                        classifying_properties = add_classifying_property(classifying_properties, prevalence, property, more_general_properties, more_specifics);
                                                    }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                classifying_properties = Mapping.mapcar(symbol_function(FIRST), Sort.sort(classifying_properties, MORE_GENERAL_PROPERTY_PAIR_P, UNPROVIDED));
                return values(properties.properties_to_sentences(classifying_properties, v_term), properties.properties_to_sentences(elaborating_properties, v_term));
            }
        }
    }

    public static final SubLObject more_general_property_pair_p(SubLObject pair1, SubLObject pair2) {
        return numG(second(pair1), second(pair2));
    }

    public static final SubLObject add_classifying_property(SubLObject classifying_properties, SubLObject prevalence, SubLObject property, SubLObject more_general_properties, SubLObject more_specifics) {
        {
            SubLObject cdolist_list_var = more_general_properties;
            SubLObject more_general = NIL;
            for (more_general = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_general = cdolist_list_var.first()) {
                {
                    SubLObject found_more_general = find(more_general, classifying_properties, symbol_function(EQUAL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                    if (NIL != found_more_general) {
                        {
                            SubLObject more_general_prevalence = second(found_more_general);
                            classifying_properties = delete(found_more_general, classifying_properties, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            prevalence = more_general_prevalence;
                        }
                    }
                }
            }
        }
        {
            SubLObject more_specific_properties = dictionary.dictionary_lookup(more_specifics, property, UNPROVIDED);
            SubLObject found_more_specific = NIL;
            if (NIL != more_specific_properties) {
                if (NIL == found_more_specific) {
                    {
                        SubLObject csome_list_var = more_specific_properties;
                        SubLObject more_specific = NIL;
                        for (more_specific = csome_list_var.first(); !((NIL != found_more_specific) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , more_specific = csome_list_var.first()) {
                            found_more_specific = find(more_specific, classifying_properties, symbol_function(EQUAL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                            if (NIL != found_more_specific) {
                                prevalence = second(found_more_specific);
                            }
                        }
                    }
                }
            }
            if (NIL == found_more_specific) {
                classifying_properties = cons(list(property, prevalence), classifying_properties);
            }
        }
        return classifying_properties;
    }

    public static final SubLObject clear_story_constructor_caches() {
        clear_story_properties_of_term();
        clear_ok_terms_for_story();
        clear_property_plist();
        clear_story_term_paraphrase();
        clear_html_story_term_description();
        return $CLEARED;
    }



    public static final SubLObject clear_story_properties_of_term() {
        {
            SubLObject cs = $story_properties_of_term_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_story_properties_of_term(SubLObject v_term, SubLObject mt, SubLObject reference_set) {
        if (reference_set == UNPROVIDED) {
            reference_set = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($story_properties_of_term_caching_state$.getGlobalValue(), list(v_term, mt, reference_set), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return SET-P; describing interesting properties of TERM in MT.
    If REFERENCE-SET is specified, include properties typical of elements in
    REFERENCE-SET that TERM does *not* have.
     */
    public static final SubLObject story_properties_of_term_internal(SubLObject v_term, SubLObject mt, SubLObject reference_set) {
        {
            SubLObject positive_properties = properties.asserted_gaf_properties_of_term_denot(v_term, mt);
            SubLObject negative_properties = (NIL != reference_set) ? ((SubLObject) (typicality_reference_set.notable_missing_properties(v_term, reference_set))) : NIL;
            SubLObject ans = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(positive_properties);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject property = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, property)) {
                        if (NIL == typicality_reference_set.dont_use_property_for_typicalityP(property, mt)) {
                            set.set_add(property, ans);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = negative_properties;
                SubLObject property = NIL;
                for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                    if (NIL == typicality_reference_set.dont_use_property_for_typicalityP(property, mt)) {
                        set.set_add(property, ans);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject story_properties_of_term(SubLObject v_term, SubLObject mt, SubLObject reference_set) {
        if (reference_set == UNPROVIDED) {
            reference_set = NIL;
        }
        {
            SubLObject caching_state = $story_properties_of_term_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(STORY_PROPERTIES_OF_TERM, $story_properties_of_term_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, mt, reference_set);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && reference_set.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(story_properties_of_term_internal(v_term, mt, reference_set)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt, reference_set));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     *
     *
     * @return LISTP; describing interesting properties of TERM wrt REFERENCE-SET.
     */
    public static final SubLObject term_property_plists(SubLObject v_term, SubLObject reference_set, SubLObject include_negative_propertiesP) {
        if (include_negative_propertiesP == UNPROVIDED) {
            include_negative_propertiesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plists = NIL;
                SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
                thread.resetMultipleValues();
                {
                    SubLObject _prev_bind_0 = properties.$property_types_problem_store$.currentBinding(thread);
                    try {
                        properties.$property_types_problem_store$.bind(properties.find_or_create_property_types_problem_store(), thread);
                        {
                            SubLObject reusedP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0_1 = typicality_reference_set.$typicality_problem_store$.currentBinding(thread);
                                    try {
                                        typicality_reference_set.$typicality_problem_store$.bind(typicality_reference_set.find_or_create_typicality_problem_store(), thread);
                                        {
                                            SubLObject reusedP_2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            try {
                                                {
                                                    SubLObject set_contents_var = set.do_set_internal(story_properties_of_term(v_term, mt, NIL != include_negative_propertiesP ? ((SubLObject) (reference_set)) : NIL));
                                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                    SubLObject state = NIL;
                                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                        {
                                                            SubLObject property_formula = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, property_formula)) {
                                                                if (!((NIL == properties.unknown_property_p(property_formula)) && (NIL != typicality_reference_set.arbitrary_reference_set_member_has_propertyP(reference_set, property_formula)))) {
                                                                    plists = cons(property_plist(property_formula, reference_set, UNPROVIDED, UNPROVIDED), plists);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL == reusedP_2) {
                                                            inference_datastructures_problem_store.destroy_problem_store(typicality_reference_set.$typicality_problem_store$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        typicality_reference_set.$typicality_problem_store$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL == reusedP) {
                                            inference_datastructures_problem_store.destroy_problem_store(properties.$property_types_problem_store$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        properties.$property_types_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return prune_property_plists(plists);
            }
        }
    }

    public static final SubLObject prune_property_plists(SubLObject plists) {
        {
            SubLObject cdolist_list_var = plists;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                {
                    SubLObject property = getf(plist, $FORMULA, UNPROVIDED);
                    SubLObject cdolist_list_var_5 = plists;
                    SubLObject other_plist = NIL;
                    for (other_plist = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , other_plist = cdolist_list_var_5.first()) {
                        {
                            SubLObject cdolist_list_var_6 = getf(other_plist, $MORE_GENERAL_PROPERTIES, UNPROVIDED);
                            SubLObject more_general_plist = NIL;
                            for (more_general_plist = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , more_general_plist = cdolist_list_var_6.first()) {
                                if (property.equal(getf(more_general_plist, $FORMULA, UNPROVIDED))) {
                                    return prune_property_plists(remove(plist, plists, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                }
                            }
                        }
                    }
                }
            }
        }
        return plists;
    }



    public static final SubLObject clear_property_plist() {
        {
            SubLObject cs = $property_plist_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_property_plist(SubLObject property, SubLObject reference_set, SubLObject prevalence_onlyP, SubLObject property_types) {
        if (prevalence_onlyP == UNPROVIDED) {
            prevalence_onlyP = NIL;
        }
        if (property_types == UNPROVIDED) {
            property_types = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($property_plist_caching_state$.getGlobalValue(), list(property, reference_set, prevalence_onlyP, property_types), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject property_plist_internal(SubLObject property, SubLObject reference_set, SubLObject prevalence_onlyP, SubLObject property_types) {
        {
            SubLObject prevalence = typicality_reference_set.property_prevalence(property, reference_set);
            SubLObject highest_prevalence = prevalence;
            SubLObject plist = list($FORMULA, property, $PREVALENCE, prevalence);
            SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
            if (NIL == prevalence_onlyP) {
                {
                    SubLObject types = (NIL != property_types) ? ((SubLObject) (property_types)) : properties.property_types(property, mt);
                    SubLObject more_general_properties = NIL;
                    SubLObject set_cardinality = typicality_reference_set.typicality_reference_set_cardinality(reference_set);
                    SubLObject univeralP = NIL;
                    plist = putf(plist, $TYPES, types);
                    if (NIL == univeralP) {
                        {
                            SubLObject csome_list_var = properties.more_general_properties(property, mt, UNPROVIDED);
                            SubLObject more_general = NIL;
                            for (more_general = csome_list_var.first(); !((NIL != univeralP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , more_general = csome_list_var.first()) {
                                if (!((NIL != typicality_reference_set.dont_use_property_for_typicalityP(more_general, mt)) || ((NIL == properties.unknown_property_p(more_general)) && (NIL != typicality_reference_set.arbitrary_reference_set_member_has_propertyP(reference_set, more_general))))) {
                                    {
                                        SubLObject more_general_prevalence = typicality_reference_set.property_prevalence(more_general, reference_set);
                                        univeralP = makeBoolean(more_general_prevalence.eql(set_cardinality) && (NIL != typicality_reference_set.arbitrary_reference_set_member_has_propertyP(reference_set, more_general)));
                                        more_general_properties = cons(property_plist(more_general, reference_set, T, UNPROVIDED), more_general_properties);
                                        if (NIL != univeralP) {
                                        } else
                                            if (more_general_prevalence.numL(prevalence)) {
                                                typicality_reference_set.assert_prevalence(more_general, reference_set, prevalence);
                                            } else
                                                if (more_general_prevalence.numLE(highest_prevalence)) {
                                                } else {
                                                    highest_prevalence = more_general_prevalence;
                                                }


                                    }
                                }
                            }
                        }
                    }
                    plist = putf(plist, $MORE_GENERAL_PROPERTIES, more_general_properties);
                }
            }
            return plist;
        }
    }

    public static final SubLObject property_plist(SubLObject property, SubLObject reference_set, SubLObject prevalence_onlyP, SubLObject property_types) {
        if (prevalence_onlyP == UNPROVIDED) {
            prevalence_onlyP = NIL;
        }
        if (property_types == UNPROVIDED) {
            property_types = NIL;
        }
        {
            SubLObject caching_state = $property_plist_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PROPERTY_PLIST, $property_plist_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(property, reference_set, prevalence_onlyP, property_types);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (property.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (reference_set.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (prevalence_onlyP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && property_types.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(property_plist_internal(property, reference_set, prevalence_onlyP, property_types)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(property, reference_set, prevalence_onlyP, property_types));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject property_plist_min_prevalence(SubLObject plist) {
        return getf(plist, $PREVALENCE, ZERO_INTEGER);
    }

    public static final SubLObject property_plist_property(SubLObject plist) {
        return getf(plist, $FORMULA, UNPROVIDED);
    }

    public static final SubLObject property_plist_property_types(SubLObject plist) {
        return getf(plist, $TYPES, UNPROVIDED);
    }

    public static final SubLObject property_plist_max_prevalence(SubLObject plist) {
        {
            SubLObject ans = getf(plist, $PREVALENCE, ZERO_INTEGER);
            SubLObject cdolist_list_var = getf(plist, $MORE_GENERAL_PROPERTIES, UNPROVIDED);
            SubLObject more_general = NIL;
            for (more_general = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_general = cdolist_list_var.first()) {
                {
                    SubLObject more_general_prevalence = property_plist_min_prevalence(more_general);
                    if (more_general_prevalence.numG(ans)) {
                        ans = more_general_prevalence;
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject property_plist_most_prevalent_property(SubLObject plist) {
        {
            SubLObject max_prevalence = property_plist_min_prevalence(plist);
            SubLObject property = property_plist_property(plist);
            SubLObject cdolist_list_var = getf(plist, $MORE_GENERAL_PROPERTIES, UNPROVIDED);
            SubLObject more_general = NIL;
            for (more_general = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_general = cdolist_list_var.first()) {
                {
                    SubLObject more_general_prevalence = property_plist_min_prevalence(more_general);
                    if (more_general_prevalence.numGE(max_prevalence)) {
                        max_prevalence = more_general_prevalence;
                        property = property_plist_property(more_general);
                    }
                }
            }
            return property;
        }
    }

    public static final SubLObject property_plist_more_general_property_plists(SubLObject plist) {
        return getf(plist, $MORE_GENERAL_PROPERTIES, UNPROVIDED);
    }

    public static final SubLObject genl_property_plistP(SubLObject spec_plist, SubLObject genl_plist) {
        if (NIL != list_utilities.tree_find(property_plist_property(genl_plist), property_plist_more_general_property_plists(spec_plist), symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static final SubLObject html_show_story_sentences(SubLObject v_term, SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject classifying_sentences = get_story_sentences_wrt_reference_set(v_term, reference_set);
                SubLObject elaborating_sentences = thread.secondMultipleValue();
                thread.resetMultipleValues();
                html_utilities.html_princ_strong($str_alt14$Classifying_Sentences_);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = classifying_sentences;
                            SubLObject classifying_sentence = NIL;
                            for (classifying_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , classifying_sentence = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_form(classifying_sentence, ZERO_INTEGER, T);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                html_utilities.html_princ_strong($str_alt15$Elaborating_Sentences_);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = elaborating_sentences;
                            SubLObject elaborating_sentence = NIL;
                            for (elaborating_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elaborating_sentence = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_form(elaborating_sentence, ZERO_INTEGER, T);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            return v_term;
        }
    }

    public static final SubLObject html_show_story_sentences2(SubLObject v_term, SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plists = term_property_plists(v_term, reference_set, UNPROVIDED);
                SubLObject set_size = typicality_reference_set.typicality_reference_set_cardinality(reference_set);
                SubLObject classified = NIL;
                SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Classified_Properties);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Type);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Property);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject node_var = $const20$TypicalityReferenceSetPropertyTyp;
                            {
                                SubLObject _prev_bind_0_14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_15 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_16 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject mt_var = mt;
                                                    {
                                                        SubLObject _prev_bind_0_17 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                            {
                                                                SubLObject tv_var = NIL;
                                                                {
                                                                    SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_20 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                        if (NIL != tv_var) {
                                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                    {
                                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                        if (pcase_var.eql($ERROR)) {
                                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else
                                                                                            if (pcase_var.eql($CERROR)) {
                                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            } else
                                                                                                if (pcase_var.eql($WARN)) {
                                                                                                    Errors.warn($str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                } else {
                                                                                                    Errors.warn($str_alt32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                    Errors.cerror($$$continue_anyway, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                }


                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject _prev_bind_0_21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_23 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_2_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_15, UNPROVIDED);
                                                                                            while (NIL != node_var_15) {
                                                                                                {
                                                                                                    SubLObject tt_node_var = node_var_15;
                                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                                    SubLObject module_var = NIL;
                                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                {
                                                                                                                    SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                        {
                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != d_link) {
                                                                                                                                {
                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject mt_29 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_29)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_30 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_29, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject iteration_state_31 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_31)) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_31);
                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                            SubLObject cdolist_list_var_33 = new_list;
                                                                                                                                                                                            SubLObject type = NIL;
                                                                                                                                                                                            for (type = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , type = cdolist_list_var_33.first()) {
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                                    if (NIL != forts.fort_p(type)) {
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject type_plists = NIL;
                                                                                                                                                                                                            SubLObject cdolist_list_var_34 = plists;
                                                                                                                                                                                                            SubLObject plist = NIL;
                                                                                                                                                                                                            for (plist = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , plist = cdolist_list_var_34.first()) {
                                                                                                                                                                                                                if (NIL != subl_promotions.memberP(type, property_plist_property_types(plist), UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                                                                    classified = cons(plist, classified);
                                                                                                                                                                                                                    type_plists = cons(plist, type_plists);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (NIL != type_plists) {
                                                                                                                                                                                                                html_show_story_type_and_plists_row(type, type_plists, set_size);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_32, thread);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            iteration_state_31 = dictionary_contents.do_dictionary_contents_next(iteration_state_31);
                                                                                                                                                                        }
                                                                                                                                                                    } 
                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_31);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_30, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                            {
                                                                                                                                SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                                SubLObject instance_tuple = NIL;
                                                                                                                                for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                                    {
                                                                                                                                        SubLObject datum = instance_tuple;
                                                                                                                                        SubLObject current = datum;
                                                                                                                                        SubLObject link_node = NIL;
                                                                                                                                        SubLObject mt_35 = NIL;
                                                                                                                                        SubLObject tv = NIL;
                                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt34);
                                                                                                                                        link_node = current.first();
                                                                                                                                        current = current.rest();
                                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt34);
                                                                                                                                        mt_35 = current.first();
                                                                                                                                        current = current.rest();
                                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt34);
                                                                                                                                        tv = current.first();
                                                                                                                                        current = current.rest();
                                                                                                                                        if (NIL == current) {
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_35)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_36 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_35, thread);
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject link_nodes = list(link_node);
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_38 = new_list;
                                                                                                                                                                        SubLObject type = NIL;
                                                                                                                                                                        for (type = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , type = cdolist_list_var_38.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                if (NIL != forts.fort_p(type)) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject type_plists = NIL;
                                                                                                                                                                                        SubLObject cdolist_list_var_39 = plists;
                                                                                                                                                                                        SubLObject plist = NIL;
                                                                                                                                                                                        for (plist = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , plist = cdolist_list_var_39.first()) {
                                                                                                                                                                                            if (NIL != subl_promotions.memberP(type, property_plist_property_types(plist), UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                                                classified = cons(plist, classified);
                                                                                                                                                                                                type_plists = cons(plist, type_plists);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        if (NIL != type_plists) {
                                                                                                                                                                                            html_show_story_type_and_plists_row(type, type_plists, set_size);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_37, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_36, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            cdestructuring_bind_error(datum, $list_alt34);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                SubLObject cdolist_list_var_40 = new_list;
                                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                                for (generating_fn = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , generating_fn = cdolist_list_var_40.first()) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_42 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject cdolist_list_var_43 = new_list_42;
                                                                                                                                                SubLObject type = NIL;
                                                                                                                                                for (type = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , type = cdolist_list_var_43.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                        if (NIL != forts.fort_p(type)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject type_plists = NIL;
                                                                                                                                                                SubLObject cdolist_list_var_44 = plists;
                                                                                                                                                                SubLObject plist = NIL;
                                                                                                                                                                for (plist = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , plist = cdolist_list_var_44.first()) {
                                                                                                                                                                    if (NIL != subl_promotions.memberP(type, property_plist_property_types(plist), UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                        classified = cons(plist, classified);
                                                                                                                                                                        type_plists = cons(plist, type_plists);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (NIL != type_plists) {
                                                                                                                                                                    html_show_story_type_and_plists_row(type, type_plists, set_size);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_41, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }

                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_28, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_27, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                {
                                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                                    SubLObject module_var = NIL;
                                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_45 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                {
                                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_15);
                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                        {
                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != d_link) {
                                                                                                                                {
                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject mt_47 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_47)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_47, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject iteration_state_49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_49)) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_49);
                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                            SubLObject cdolist_list_var_51 = new_list;
                                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_51.first(); NIL != cdolist_list_var_51; cdolist_list_var_51 = cdolist_list_var_51.rest() , node_vars_link_node = cdolist_list_var_51.first()) {
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_50, thread);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            iteration_state_49 = dictionary_contents.do_dictionary_contents_next(iteration_state_49);
                                                                                                                                                                        }
                                                                                                                                                                    } 
                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_49);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_48, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                SubLObject cdolist_list_var_52 = new_list;
                                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                                for (generating_fn = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , generating_fn = cdolist_list_var_52.first()) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_53 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_54 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject cdolist_list_var_55 = new_list_54;
                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                for (node_vars_link_node = cdolist_list_var_55.first(); NIL != cdolist_list_var_55; cdolist_list_var_55 = cdolist_list_var_55.rest() , node_vars_link_node = cdolist_list_var_55.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_53, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }

                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_46, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_45, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                node_var_15 = deck.deck_pop(recur_deck);
                                                                                            } 
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_26, thread);
                                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_25, thread);
                                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_24, thread);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt35$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_23, thread);
                                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_22, thread);
                                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_21, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_20, thread);
                                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_19, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_18, thread);
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_16, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                        }
                        {
                            SubLObject unclassified = set_difference(plists, classified, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL != unclassified) {
                                html_show_story_type_and_plists_row($$$Other, unclassified, set_size);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                {
                    SubLObject sorted_plists = Sort.sort(copy_list(plists), symbol_function($sym37$_), PROPERTY_PLIST_MAX_PREVALENCE);
                    SubLObject cutoff = divide(typicality_reference_set.typicality_reference_set_cardinality(reference_set), TWO_INTEGER);
                    SubLObject stopP = NIL;
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ONE_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong($$$Least_Typical_Properties);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Prevalence);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Property);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            if (NIL == stopP) {
                                {
                                    SubLObject csome_list_var = sorted_plists;
                                    SubLObject plist = NIL;
                                    for (plist = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , plist = csome_list_var.first()) {
                                        {
                                            SubLObject max_prevalence = property_plist_max_prevalence(plist);
                                            if (max_prevalence.numG(cutoff)) {
                                                stopP = T;
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(max_prevalence);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_form(property_plist_most_prevalent_property(plist), ZERO_INTEGER, T);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                {
                    SubLObject sorted_plists = Sort.sort(copy_list(plists), symbol_function($sym41$_), PROPERTY_PLIST_MIN_PREVALENCE);
                    SubLObject cutoff = divide(typicality_reference_set.typicality_reference_set_cardinality(reference_set), TWO_INTEGER);
                    SubLObject stopP = NIL;
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ONE_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong($$$Most_Typical_Properties);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Prevalence);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Property);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            if (NIL == stopP) {
                                {
                                    SubLObject csome_list_var = sorted_plists;
                                    SubLObject plist = NIL;
                                    for (plist = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , plist = csome_list_var.first()) {
                                        {
                                            SubLObject min_prevalence = property_plist_min_prevalence(plist);
                                            if (min_prevalence.numL(cutoff)) {
                                                stopP = T;
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(min_prevalence);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_form(getf(plist, $FORMULA, UNPROVIDED), ZERO_INTEGER, T);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            return v_term;
        }
    }

    public static final SubLObject html_show_story_type_and_plists_row(SubLObject type, SubLObject plists, SubLObject set_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ_strong(type);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != plists) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = plists;
                                            SubLObject plist = NIL;
                                            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                                                {
                                                    SubLObject property = property_plist_property(plist);
                                                    SubLObject min_prevalence = property_plist_min_prevalence(plist);
                                                    SubLObject max_prevalence = property_plist_max_prevalence(plist);
                                                    SubLObject color = property_plist_display_color(plist, set_size);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject color_val = color;
                                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                        if (NIL != color_val) {
                                                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(property, ZERO_INTEGER, T);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(min_prevalence);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(max_prevalence);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } else {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt44$None_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return type;
        }
    }

    public static final SubLObject html_show_story_pair(SubLObject reference_set, SubLObject term1, SubLObject term2) {
        if (term1 == UNPROVIDED) {
            term1 = NIL;
        }
        if (term2 == UNPROVIDED) {
            term2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reference_set_members = typicality_reference_set.typicality_reference_set_members(reference_set);
                SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
                if (NIL == term1) {
                    while (NIL == story_term_okP(term1, mt, UNPROVIDED)) {
                        term1 = list_utilities.random_element(reference_set_members);
                    } 
                }
                if (NIL == term2) {
                    while (NIL == story_term_okP(term2, mt, UNPROVIDED)) {
                        term2 = list_utilities.random_element(remove(term1, reference_set_members, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } 
                }
            }
            {
                SubLObject include_negative_propertiesP = NIL;
                SubLObject plists1 = term_property_plists(term1, reference_set, include_negative_propertiesP);
                SubLObject plists2 = term_property_plists(term2, reference_set, include_negative_propertiesP);
                SubLObject merged_plists = story_pair_merge_plists(plists1, plists2, reference_set);
                SubLObject set_size = typicality_reference_set.typicality_reference_set_cardinality(reference_set);
                SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
                thread.resetMultipleValues();
                {
                    SubLObject classified = html_classify_merged_story_plists(merged_plists, mt);
                    SubLObject unclassified = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    html_story_identify_reference_set_and_terms(reference_set, term1, term2, classified);
                    html_story_show_classified_properties(classified, unclassified, set_size);
                }
                html_story_show_least_typical_properties(merged_plists, reference_set);
                html_story_show_most_typical_properties(merged_plists, reference_set);
            }
            return reference_set;
        }
    }

    public static final SubLObject html_story_identify_reference_set_and_terms(SubLObject reference_set, SubLObject term1, SubLObject term2, SubLObject classified) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject set_size = typicality_reference_set.typicality_reference_set_cardinality(reference_set);
                SubLObject term1_description = html_story_term_description($TERM1, classified, set_size);
                SubLObject term2_description = html_story_term_description($TERM2, classified, set_size);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($str_alt48$Reference_Set__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), pph_main.generate_phrase(reference_set, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($str_alt49$Definitional_Property_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(html_property_paraphrase(typicality_reference_set.typicality_reference_set_domain_property(reference_set), UNPROVIDED));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($str_alt50$Term_1_Description__);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(term1_description);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($str_alt51$Term_2_Description__);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(term2_description);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return reference_set;
        }
    }

    /**
     * Show classified properties table (2 columns).
     */
    public static final SubLObject html_story_show_classified_properties(SubLObject classified, SubLObject unclassified, SubLObject set_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ONE_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ_strong($$$Classified_Properties);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(classified));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject type_plists = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                html_show_pair_type_and_plists_row(type, type_plists, set_size);
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    if (NIL == set.empty_set_p(unclassified)) {
                        html_show_pair_type_and_plists_row($$$Unclassified, set.set_element_list(unclassified), set_size);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return classified;
        }
    }

    public static final SubLObject html_story_show_least_typical_properties(SubLObject merged_plists, SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sorted_plists = Sort.sort(copy_list(merged_plists), symbol_function($sym37$_), PROPERTY_PLIST_MAX_PREVALENCE);
                SubLObject cutoff = divide(typicality_reference_set.typicality_reference_set_cardinality(reference_set), TWO_INTEGER);
                SubLObject stopP = NIL;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Least_Typical_Properties);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Prevalence);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Property);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL == stopP) {
                            {
                                SubLObject csome_list_var = sorted_plists;
                                SubLObject plist = NIL;
                                for (plist = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , plist = csome_list_var.first()) {
                                    {
                                        SubLObject max_prevalence = property_plist_max_prevalence(plist);
                                        if (max_prevalence.numG(cutoff)) {
                                            stopP = T;
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(max_prevalence);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_form(property_plist_most_prevalent_property(plist), ZERO_INTEGER, T);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return reference_set;
        }
    }

    public static final SubLObject html_story_show_most_typical_properties(SubLObject merged_plists, SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sorted_plists = Sort.sort(copy_list(merged_plists), symbol_function($sym41$_), PROPERTY_PLIST_MIN_PREVALENCE);
                SubLObject cutoff = divide(typicality_reference_set.typicality_reference_set_cardinality(reference_set), TWO_INTEGER);
                SubLObject stopP = NIL;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Most_Typical_Properties);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Prevalence);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Property);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL == stopP) {
                            {
                                SubLObject csome_list_var = sorted_plists;
                                SubLObject plist = NIL;
                                for (plist = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , plist = csome_list_var.first()) {
                                    {
                                        SubLObject min_prevalence = property_plist_min_prevalence(plist);
                                        if (min_prevalence.numL(cutoff)) {
                                            stopP = T;
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(min_prevalence);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_form(getf(plist, $FORMULA, UNPROVIDED), ZERO_INTEGER, T);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return reference_set;
        }
    }

    /**
     *
     *
     * @return 0; DICTIONARY-P; TYPE -> PLISTS.
     * @return 1; SET-P; of unclassified plists.
     */
    public static final SubLObject html_classify_merged_story_plists(SubLObject merged_plists, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unclassified = set_utilities.construct_set_from_list(merged_plists, symbol_function(EQUAL), UNPROVIDED);
                SubLObject classified = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject node_var = $const20$TypicalityReferenceSetPropertyTyp;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject node_var_109 = node_var;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_110 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject mt_var = mt;
                                        {
                                            SubLObject _prev_bind_0_111 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1_112 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_113 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_114 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }


                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_115 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_116 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_117 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_118 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_119 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_120 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_109, UNPROVIDED);
                                                                                while (NIL != node_var_109) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_109;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_121 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_122 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt_123 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_123)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_124 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_123, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_125 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_125)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_125);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_126 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_127 = new_list;
                                                                                                                                                                                SubLObject type = NIL;
                                                                                                                                                                                for (type = cdolist_list_var_127.first(); NIL != cdolist_list_var_127; cdolist_list_var_127 = cdolist_list_var_127.rest() , type = cdolist_list_var_127.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != forts.fort_p(type)) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject type_plists = NIL;
                                                                                                                                                                                                SubLObject cdolist_list_var_128 = merged_plists;
                                                                                                                                                                                                SubLObject plist = NIL;
                                                                                                                                                                                                for (plist = cdolist_list_var_128.first(); NIL != cdolist_list_var_128; cdolist_list_var_128 = cdolist_list_var_128.rest() , plist = cdolist_list_var_128.first()) {
                                                                                                                                                                                                    if (NIL != subl_promotions.memberP(type, property_plist_property_types(plist), UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                                                        set.set_remove(plist, unclassified);
                                                                                                                                                                                                        type_plists = cons(plist, type_plists);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                if (NIL != type_plists) {
                                                                                                                                                                                                    dictionary.dictionary_enter(classified, type, type_plists);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_126, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_125 = dictionary_contents.do_dictionary_contents_next(iteration_state_125);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_125);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_124, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                {
                                                                                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                    SubLObject instance_tuple = NIL;
                                                                                                                    for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject datum = instance_tuple;
                                                                                                                            SubLObject current = datum;
                                                                                                                            SubLObject link_node = NIL;
                                                                                                                            SubLObject mt_129 = NIL;
                                                                                                                            SubLObject tv = NIL;
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt34);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt34);
                                                                                                                            mt_129 = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt34);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_129)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_130 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_129, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_131 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_132 = new_list;
                                                                                                                                                            SubLObject type = NIL;
                                                                                                                                                            for (type = cdolist_list_var_132.first(); NIL != cdolist_list_var_132; cdolist_list_var_132 = cdolist_list_var_132.rest() , type = cdolist_list_var_132.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    if (NIL != forts.fort_p(type)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject type_plists = NIL;
                                                                                                                                                                            SubLObject cdolist_list_var_133 = merged_plists;
                                                                                                                                                                            SubLObject plist = NIL;
                                                                                                                                                                            for (plist = cdolist_list_var_133.first(); NIL != cdolist_list_var_133; cdolist_list_var_133 = cdolist_list_var_133.rest() , plist = cdolist_list_var_133.first()) {
                                                                                                                                                                                if (NIL != subl_promotions.memberP(type, property_plist_property_types(plist), UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                                    set.set_remove(plist, unclassified);
                                                                                                                                                                                    type_plists = cons(plist, type_plists);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            if (NIL != type_plists) {
                                                                                                                                                                                dictionary.dictionary_enter(classified, type, type_plists);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_131, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_130, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt34);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_134 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_134.first(); NIL != cdolist_list_var_134; cdolist_list_var_134 = cdolist_list_var_134.rest() , generating_fn = cdolist_list_var_134.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_135 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_136 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_137 = new_list_136;
                                                                                                                                    SubLObject type = NIL;
                                                                                                                                    for (type = cdolist_list_var_137.first(); NIL != cdolist_list_var_137; cdolist_list_var_137 = cdolist_list_var_137.rest() , type = cdolist_list_var_137.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(type, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            if (NIL != forts.fort_p(type)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject type_plists = NIL;
                                                                                                                                                    SubLObject cdolist_list_var_138 = merged_plists;
                                                                                                                                                    SubLObject plist = NIL;
                                                                                                                                                    for (plist = cdolist_list_var_138.first(); NIL != cdolist_list_var_138; cdolist_list_var_138 = cdolist_list_var_138.rest() , plist = cdolist_list_var_138.first()) {
                                                                                                                                                        if (NIL != subl_promotions.memberP(type, property_plist_property_types(plist), UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                            set.set_remove(plist, unclassified);
                                                                                                                                                            type_plists = cons(plist, type_plists);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (NIL != type_plists) {
                                                                                                                                                        dictionary.dictionary_enter(classified, type, type_plists);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_135, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }

                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_122, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_121, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_139 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_140 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_109);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt_141 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_141)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_142 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_141, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_143 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_143)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_143);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_144 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_145 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_145.first(); NIL != cdolist_list_var_145; cdolist_list_var_145 = cdolist_list_var_145.rest() , node_vars_link_node = cdolist_list_var_145.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_144, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_143 = dictionary_contents.do_dictionary_contents_next(iteration_state_143);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_143);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_142, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_146 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_146.first(); NIL != cdolist_list_var_146; cdolist_list_var_146 = cdolist_list_var_146.rest() , generating_fn = cdolist_list_var_146.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_147 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_148 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_149 = new_list_148;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_149.first(); NIL != cdolist_list_var_149; cdolist_list_var_149 = cdolist_list_var_149.rest() , node_vars_link_node = cdolist_list_var_149.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_147, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }

                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_140, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_139, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_109 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_120, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_119, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_118, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt35$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_117, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_116, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_115, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_114, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_113, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_112, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_111, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_110, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(classified, unclassified);
            }
        }
    }



    public static final SubLObject clear_story_term_paraphrase() {
        {
            SubLObject cs = $story_term_paraphrase_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_story_term_paraphrase(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($story_term_paraphrase_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject story_term_paraphrase_internal(SubLObject v_term) {
        return pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject story_term_paraphrase(SubLObject v_term) {
        {
            SubLObject caching_state = $story_term_paraphrase_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(STORY_TERM_PARAPHRASE, $story_term_paraphrase_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw7$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(story_term_paraphrase_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }



    public static final SubLObject clear_html_story_term_description() {
        {
            SubLObject cs = $html_story_term_description_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_html_story_term_description(SubLObject term_identifier, SubLObject classified, SubLObject set_size) {
        return memoization_state.caching_state_remove_function_results_with_args($html_story_term_description_caching_state$.getGlobalValue(), list(term_identifier, classified, set_size), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_story_term_description_internal(SubLObject term_identifier, SubLObject classified, SubLObject set_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject description_properties = NIL;
                SubLObject description = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(classified));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject type_plists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = remove_subsumed_plists(type_plists);
                            SubLObject plist = NIL;
                            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                                if (NIL != pair_plist_mentions_term_identifier_p(plist, term_identifier)) {
                                    {
                                        SubLObject property = property_plist_property(plist);
                                        SubLObject min_prevalence = property_plist_min_prevalence(plist);
                                        SubLObject max_prevalence = property_plist_max_prevalence(plist);
                                        if (max_prevalence.numL(set_size) && max_prevalence.numG(min_prevalence)) {
                                            description_properties = cons(reformulate_property_for_paraphrase(property), description_properties);
                                        }
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                            try {
                                html_macros.$html_stream$.bind(stream, thread);
                                if (NIL != description_properties) {
                                    {
                                        SubLObject _prev_bind_0_150 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = pph_vars.$pph_use_bulleted_lists_min_level$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = pph_vars.$constant_link_function$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                            pph_vars.$pph_use_bulleted_lists_min_level$.bind(ZERO_INTEGER, thread);
                                            pph_vars.$constant_link_function$.bind($NONE, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), html_property_paraphrase(simplifier.conjoin(description_properties, UNPROVIDED), $HTML));
                                        } finally {
                                            pph_vars.$constant_link_function$.rebind(_prev_bind_2, thread);
                                            pph_vars.$pph_use_bulleted_lists_min_level$.rebind(_prev_bind_1, thread);
                                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_150, thread);
                                        }
                                    }
                                } else {
                                    html_utilities.html_princ($str_alt58$No_interesting_properties_);
                                }
                            } finally {
                                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                        description = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return description;
            }
        }
    }

    public static final SubLObject html_story_term_description(SubLObject term_identifier, SubLObject classified, SubLObject set_size) {
        {
            SubLObject caching_state = $html_story_term_description_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(HTML_STORY_TERM_DESCRIPTION, $html_story_term_description_caching_state$, NIL, EQUALP, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(term_identifier, classified, set_size);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (term_identifier.equalp(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (classified.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && set_size.equalp(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(html_story_term_description_internal(term_identifier, classified, set_size)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(term_identifier, classified, set_size));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     *
     *
     * @return LISTP of members of REFERENCE-SET suitable for telling a story about.
     */
    public static final SubLObject ok_reference_set_terms_for_story(SubLObject reference_set) {
        {
            SubLObject reference_set_members = typicality_reference_set.typicality_reference_set_members(reference_set);
            SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
            SubLObject ok_members = NIL;
            SubLObject cdolist_list_var = reference_set_members;
            SubLObject member = NIL;
            for (member = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , member = cdolist_list_var.first()) {
                if (NIL != story_term_okP(member, mt, UNPROVIDED)) {
                    ok_members = cons(member, ok_members);
                }
            }
            return ok_members;
        }
    }



    public static final SubLObject clear_ok_terms_for_story() {
        {
            SubLObject cs = $ok_terms_for_story_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_ok_terms_for_story(SubLObject reference_set) {
        return memoization_state.caching_state_remove_function_results_with_args($ok_terms_for_story_caching_state$.getGlobalValue(), list(reference_set), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP of terms suitable for telling a story wrt REFERENCE-SET about.
     */
    public static final SubLObject ok_terms_for_story_internal(SubLObject reference_set) {
        {
            SubLObject domain_property = typicality_reference_set.typicality_reference_set_domain_property(reference_set);
            SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
            SubLObject all_terms = properties.property_extent(domain_property, mt, UNPROVIDED);
            SubLObject ok_terms = NIL;
            SubLObject cdolist_list_var = all_terms;
            SubLObject member = NIL;
            for (member = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , member = cdolist_list_var.first()) {
                if (NIL != story_term_okP(member, mt, UNPROVIDED)) {
                    ok_terms = cons(member, ok_terms);
                }
            }
            return ok_terms;
        }
    }

    public static final SubLObject ok_terms_for_story(SubLObject reference_set) {
        {
            SubLObject caching_state = $ok_terms_for_story_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(OK_TERMS_FOR_STORY, $ok_terms_for_story_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, reference_set, $kw7$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(ok_terms_for_story_internal(reference_set)));
                    memoization_state.caching_state_put(caching_state, reference_set, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject story_term_okP(SubLObject story_term, SubLObject mt, SubLObject gaf_count_min) {
        if (mt == UNPROVIDED) {
            mt = $$TKB_SME_AssertionsMt;
        }
        if (gaf_count_min == UNPROVIDED) {
            gaf_count_min = TEN_INTEGER;
        }
        return funcall(makeSymbol("TYPICALITY-TERM-SUFFICIENTLY-ONTOLOGIZED?"), story_term, mt, gaf_count_min);
    }

    /**
     * Combine PLISTS1 and PLISTS2 into a single list of plists, annotating
     * each with :TERM1 if found on PLISTS1, and :TERM2 if found on PLISTS2.
     */
    public static final SubLObject story_pair_merge_plists(SubLObject plists1, SubLObject plists2, SubLObject reference_set) {
        {
            SubLObject merged_plists = NIL;
            {
                SubLObject cdolist_list_var = plists1;
                SubLObject plist = NIL;
                for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                    merged_plists = cons(putf(copy_list(plist), $TERM1, T), merged_plists);
                }
            }
            {
                SubLObject cdolist_list_var = plists2;
                SubLObject plist = NIL;
                for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                    {
                        SubLObject matcher = find_matching_story_plist(plist, merged_plists);
                        if (NIL != matcher) {
                            matcher = putf(matcher, $TERM2, T);
                        } else {
                            merged_plists = cons(putf(copy_list(plist), $TERM2, T), merged_plists);
                        }
                    }
                }
            }
            {
                SubLObject shared_plists = shared_story_plists(merged_plists, reference_set);
                merged_plists = append(merged_plists, shared_plists);
            }
            return merged_plists;
        }
    }

    public static final SubLObject shared_story_plists(SubLObject merged_plists, SubLObject reference_set) {
        {
            SubLObject shared_plists = NIL;
            SubLObject cdolist_list_var = merged_plists;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                {
                    SubLObject type = classify_pair_plist(plist);
                    if ($BOTH != type) {
                        {
                            SubLObject shared_plist = shared_story_plist(plist, merged_plists, shared_plists, reference_set);
                            if (NIL != shared_plist) {
                                shared_plists = cons(shared_plist, shared_plists);
                            }
                        }
                    }
                }
            }
            return shared_plists;
        }
    }

    public static final SubLObject shared_story_plist(SubLObject plist, SubLObject merged_plists, SubLObject shared_plists, SubLObject reference_set) {
        {
            SubLObject type = classify_pair_plist(plist);
            SubLObject more_general_plists = property_plist_more_general_property_plists(plist);
            SubLObject property_types = property_plist_property_types(plist);
            SubLObject shared_plist = NIL;
            more_general_plists = Sort.sort(more_general_plists, symbol_function($sym37$_), PROPERTY_PLIST_MIN_PREVALENCE);
            if (NIL == shared_plist) {
                {
                    SubLObject csome_list_var = more_general_plists;
                    SubLObject more_general_plist = NIL;
                    for (more_general_plist = csome_list_var.first(); !((NIL != shared_plist) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , more_general_plist = csome_list_var.first()) {
                        {
                            SubLObject more_general_property = property_plist_property(more_general_plist);
                            SubLObject other_type = (type == $TERM1) ? ((SubLObject) ($TERM2)) : $TERM1;
                            SubLObject sharedP = NIL;
                            if (NIL == subl_promotions.memberP(more_general_property, shared_plists, symbol_function(EQUAL), PROPERTY_PLIST_PROPERTY)) {
                                if (NIL == sharedP) {
                                    {
                                        SubLObject csome_list_var_151 = merged_plists;
                                        SubLObject other_plist = NIL;
                                        for (other_plist = csome_list_var_151.first(); !((NIL != sharedP) || (NIL == csome_list_var_151)); csome_list_var_151 = csome_list_var_151.rest() , other_plist = csome_list_var_151.first()) {
                                            if ((other_type == classify_pair_plist(other_plist)) && (NIL != list_utilities.tree_find(more_general_property, other_plist, symbol_function(EQUAL), UNPROVIDED))) {
                                                sharedP = T;
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != sharedP) {
                                shared_plist = property_plist(more_general_property, reference_set, NIL, property_types);
                                shared_plist = putf(shared_plist, $TERM1, T);
                                shared_plist = putf(shared_plist, $TERM2, T);
                            }
                        }
                    }
                }
            }
            return shared_plist;
        }
    }

    public static final SubLObject property_plist_has_property_p(SubLObject plist, SubLObject property) {
        {
            SubLObject ans = equal(property, property_plist_property(plist));
            SubLObject more_general_plists = property_plist_more_general_property_plists(plist);
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = more_general_plists;
                    SubLObject more_general_plist = NIL;
                    for (more_general_plist = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , more_general_plist = csome_list_var.first()) {
                        ans = property_plist_has_property_p(more_general_plist, property);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject find_matching_story_plist(SubLObject plist, SubLObject merged_plists) {
        return find(property_plist_property(plist), merged_plists, symbol_function(EQUAL), PROPERTY_PLIST_PROPERTY, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_show_pair_type_and_plists_row(SubLObject type, SubLObject plists, SubLObject set_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str_alt65$I_know_the_following_);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), properties.property_type_string(type));
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ($str_alt66$_information_about_the_story_term);
                            html_utilities.html_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ZERO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = $list_alt68;
                                        SubLObject type_154 = NIL;
                                        for (type_154 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_154 = cdolist_list_var.first()) {
                                            {
                                                SubLObject classified_plists = list_utilities.find_all(type_154, plists, symbol_function(EQ), CLASSIFY_PAIR_PLIST);
                                                classified_plists = remove_subsumed_plists(classified_plists);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_show_property_classification(type_154);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_show_pair_plists(classified_plists, set_size, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return type;
        }
    }

    public static final SubLObject html_show_property_classification(SubLObject classification) {
        {
            SubLObject pcase_var = classification;
            if (pcase_var.eql($TERM1)) {
                html_utilities.html_princ_strong($str_alt69$Just_Term_1_);
            } else
                if (pcase_var.eql($TERM2)) {
                    html_utilities.html_princ_strong($str_alt70$Just_Term_2_);
                } else
                    if (pcase_var.eql($BOTH)) {
                        html_utilities.html_princ_strong($str_alt71$Shared_Properties_);
                    }


        }
        return classification;
    }

    public static final SubLObject html_show_pair_type_and_plists_row_tabular(SubLObject type, SubLObject plists, SubLObject set_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), pph_main.generate_phrase(type, $ANY, NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), $HTML, UNPROVIDED, UNPROVIDED));
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != plists) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ONE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = $list_alt73;
                                            SubLObject type_162 = NIL;
                                            for (type_162 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_162 = cdolist_list_var.first()) {
                                                {
                                                    SubLObject classified_plists = list_utilities.find_all(type_162, plists, symbol_function(EQ), CLASSIFY_PAIR_PLIST);
                                                    classified_plists = remove_subsumed_plists(classified_plists);
                                                    if (NIL != classified_plists) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_show_property_classification(type_162);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_166 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_show_pair_plists(classified_plists, set_size, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_166, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } else {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt44$None_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return type;
        }
    }

    public static final SubLObject remove_subsumed_plists(SubLObject plists) {
        return list_utilities.remove_subsumed_items(plists, $sym74$GENL_PROPERTY_PLIST_, UNPROVIDED);
    }

    public static final SubLObject html_show_pair_plists(SubLObject plists, SubLObject set_size, SubLObject show_prevalence_infoP) {
        if (show_prevalence_infoP == UNPROVIDED) {
            show_prevalence_infoP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == plists) {
                {
                    SubLObject color_val = html_macros.$html_color_dark_grey$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_val));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str_alt75$Nothing_noteworthy_known_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            } else {
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = plists;
                            SubLObject plist = NIL;
                            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                                {
                                    SubLObject property = property_plist_property(plist);
                                    SubLObject min_prevalence = property_plist_min_prevalence(plist);
                                    SubLObject max_prevalence = property_plist_max_prevalence(plist);
                                    SubLObject color = property_plist_display_color(plist, set_size);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject color_val = color;
                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                        if (NIL != color_val) {
                                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), html_property_paraphrase(property, UNPROVIDED));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (NIL != show_prevalence_infoP) {
                                                        html_utilities.html_princ(min_prevalence);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    if (max_prevalence.numL(set_size) && max_prevalence.numG(min_prevalence)) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_173 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt76$_A_because___A, max_prevalence.numL(divide(set_size, THREE_INTEGER)) ? ((SubLObject) ($$$Unusual)) : $$$Noteworthy, html_property_paraphrase(property_plist_most_prevalent_property(plist), UNPROVIDED));
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_173, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_174 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != show_prevalence_infoP) {
                                                            html_utilities.html_princ(max_prevalence);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_174, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject html_property_paraphrase(SubLObject property, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject property_to_paraphrase = reformulate_property_for_paraphrase(property);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                    try {
                        pph_vars.$pph_term_paraphrase_map$.bind($list_alt80, thread);
                        ans = pph_main.generate_text(property_to_paraphrase, $list_alt81, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), mode, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject reformulate_property_for_paraphrase(SubLObject property) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reformulated = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt82);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                            SubLObject trans_pred = list_utilities.alist_lookup_without_values(v_bindings, TRANS_PRED, UNPROVIDED, UNPROVIDED);
                            SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    {
                                        SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses(bin_pred, TWO_INTEGER, UNPROVIDED);
                                        if (NIL != subl_promotions.memberP(trans_pred, valid_trans_preds, UNPROVIDED, UNPROVIDED)) {
                                            reformulated = list(bin_pred, $TERM, value);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                if (NIL == reformulated) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt89);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                                SubLObject trans_pred = list_utilities.alist_lookup_without_values(v_bindings, TRANS_PRED, UNPROVIDED, UNPROVIDED);
                                SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        {
                                            SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses(bin_pred, TWO_INTEGER, UNPROVIDED);
                                            if (NIL != subl_promotions.memberP(trans_pred, valid_trans_preds, UNPROVIDED, UNPROVIDED)) {
                                                reformulated = list(bin_pred, $TERM, value);
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == reformulated) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt90);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                                SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                                SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                                reformulated = list($$relationInstanceExistsCount, bin_pred, $TERM, collection, list($$IntervalMinFn, value));
                            }
                        }
                    }
                }
                if (NIL == reformulated) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt94);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                                SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                                SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                                reformulated = list($$relationInstanceExistsCount, bin_pred, $TERM, collection, list($$IntervalMaxFn, value));
                            }
                        }
                    }
                }
                if (NIL == reformulated) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt96);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                                SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                                SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, TERN_PRED, UNPROVIDED, UNPROVIDED);
                                reformulated = list(tern_pred, $TERM, collection, list($$IntervalMaxFn, value));
                            }
                        }
                    }
                }
                if (NIL == reformulated) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt98);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                                SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                                SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, TERN_PRED, UNPROVIDED, UNPROVIDED);
                                reformulated = list(tern_pred, $TERM, collection, list($$IntervalMaxFn, value));
                            }
                        }
                    }
                }
                if (NIL == reformulated) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list_alt99);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                                SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                                SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                                reformulated = list($$relationInstanceExistsCount, bin_pred, $TERM, collection, list($$IntervalMaxFn, value));
                            }
                        }
                    }
                }
                return NIL != reformulated ? ((SubLObject) (reformulated)) : property;
            }
        }
    }

    public static final SubLObject classify_pair_plist(SubLObject plist) {
        {
            SubLObject term1P = pair_plist_mentions_term_identifier_p(plist, $TERM1);
            SubLObject term2P = pair_plist_mentions_term_identifier_p(plist, $TERM2);
            if ((NIL != term1P) && (NIL != term2P)) {
                return $BOTH;
            } else
                if (NIL != term1P) {
                    return $TERM1;
                } else
                    if (NIL != term2P) {
                        return $TERM2;
                    } else {
                        return $NEITHER;
                    }


        }
    }

    public static final SubLObject pair_plist_mentions_term_identifier_p(SubLObject plist, SubLObject term_identifier) {
        return list_utilities.sublisp_boolean(getf(plist, term_identifier, NIL));
    }

    public static final SubLObject property_plist_display_color(SubLObject plist, SubLObject set_size) {
        if (NIL == subl_promotions.positive_integer_p(set_size)) {
            return $$$black;
        }
        {
            SubLObject max_prevalence = property_plist_max_prevalence(plist);
            SubLObject degrees = THREE_INTEGER;
            SubLObject normalized_prevalence = integerDivide(multiply(max_prevalence, degrees), set_size);
            SubLObject pcase_var = normalized_prevalence;
            if (pcase_var.eql(ZERO_INTEGER)) {
                return $$$red;
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    return $$$green;
                } else
                    if (pcase_var.eql(TWO_INTEGER) || pcase_var.eql(THREE_INTEGER)) {
                        return $$$black;
                    } else {
                        return $$$black;
                    }


        }
    }

    public static final SubLObject html_show_story_type_and_properties_row(SubLObject type, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_175 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ_strong(type);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_175, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != v_properties) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_176 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_177 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = v_properties;
                                            SubLObject property = NIL;
                                            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_178 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_179 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_form(property, ZERO_INTEGER, T);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_179, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_178, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_177, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_176, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } else {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_180 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt44$None_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_180, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return type;
        }
    }

    public static final SubLObject declare_story_constructor_file() {
        declareFunction("get_story_sentences_wrt_reference_set", "GET-STORY-SENTENCES-WRT-REFERENCE-SET", 2, 0, false);
        declareFunction("more_general_property_pair_p", "MORE-GENERAL-PROPERTY-PAIR-P", 2, 0, false);
        declareFunction("add_classifying_property", "ADD-CLASSIFYING-PROPERTY", 5, 0, false);
        declareFunction("clear_story_constructor_caches", "CLEAR-STORY-CONSTRUCTOR-CACHES", 0, 0, false);
        declareFunction("clear_story_properties_of_term", "CLEAR-STORY-PROPERTIES-OF-TERM", 0, 0, false);
        declareFunction("remove_story_properties_of_term", "REMOVE-STORY-PROPERTIES-OF-TERM", 2, 1, false);
        declareFunction("story_properties_of_term_internal", "STORY-PROPERTIES-OF-TERM-INTERNAL", 3, 0, false);
        declareFunction("story_properties_of_term", "STORY-PROPERTIES-OF-TERM", 2, 1, false);
        declareFunction("term_property_plists", "TERM-PROPERTY-PLISTS", 2, 1, false);
        declareFunction("prune_property_plists", "PRUNE-PROPERTY-PLISTS", 1, 0, false);
        declareFunction("clear_property_plist", "CLEAR-PROPERTY-PLIST", 0, 0, false);
        declareFunction("remove_property_plist", "REMOVE-PROPERTY-PLIST", 2, 2, false);
        declareFunction("property_plist_internal", "PROPERTY-PLIST-INTERNAL", 4, 0, false);
        declareFunction("property_plist", "PROPERTY-PLIST", 2, 2, false);
        declareFunction("property_plist_min_prevalence", "PROPERTY-PLIST-MIN-PREVALENCE", 1, 0, false);
        declareFunction("property_plist_property", "PROPERTY-PLIST-PROPERTY", 1, 0, false);
        declareFunction("property_plist_property_types", "PROPERTY-PLIST-PROPERTY-TYPES", 1, 0, false);
        declareFunction("property_plist_max_prevalence", "PROPERTY-PLIST-MAX-PREVALENCE", 1, 0, false);
        declareFunction("property_plist_most_prevalent_property", "PROPERTY-PLIST-MOST-PREVALENT-PROPERTY", 1, 0, false);
        declareFunction("property_plist_more_general_property_plists", "PROPERTY-PLIST-MORE-GENERAL-PROPERTY-PLISTS", 1, 0, false);
        declareFunction("genl_property_plistP", "GENL-PROPERTY-PLIST?", 2, 0, false);
        declareFunction("html_show_story_sentences", "HTML-SHOW-STORY-SENTENCES", 2, 0, false);
        declareFunction("html_show_story_sentences2", "HTML-SHOW-STORY-SENTENCES2", 2, 0, false);
        declareFunction("html_show_story_type_and_plists_row", "HTML-SHOW-STORY-TYPE-AND-PLISTS-ROW", 3, 0, false);
        declareFunction("html_show_story_pair", "HTML-SHOW-STORY-PAIR", 1, 2, false);
        declareFunction("html_story_identify_reference_set_and_terms", "HTML-STORY-IDENTIFY-REFERENCE-SET-AND-TERMS", 4, 0, false);
        declareFunction("html_story_show_classified_properties", "HTML-STORY-SHOW-CLASSIFIED-PROPERTIES", 3, 0, false);
        declareFunction("html_story_show_least_typical_properties", "HTML-STORY-SHOW-LEAST-TYPICAL-PROPERTIES", 2, 0, false);
        declareFunction("html_story_show_most_typical_properties", "HTML-STORY-SHOW-MOST-TYPICAL-PROPERTIES", 2, 0, false);
        declareFunction("html_classify_merged_story_plists", "HTML-CLASSIFY-MERGED-STORY-PLISTS", 2, 0, false);
        declareFunction("clear_story_term_paraphrase", "CLEAR-STORY-TERM-PARAPHRASE", 0, 0, false);
        declareFunction("remove_story_term_paraphrase", "REMOVE-STORY-TERM-PARAPHRASE", 1, 0, false);
        declareFunction("story_term_paraphrase_internal", "STORY-TERM-PARAPHRASE-INTERNAL", 1, 0, false);
        declareFunction("story_term_paraphrase", "STORY-TERM-PARAPHRASE", 1, 0, false);
        declareFunction("clear_html_story_term_description", "CLEAR-HTML-STORY-TERM-DESCRIPTION", 0, 0, false);
        declareFunction("remove_html_story_term_description", "REMOVE-HTML-STORY-TERM-DESCRIPTION", 3, 0, false);
        declareFunction("html_story_term_description_internal", "HTML-STORY-TERM-DESCRIPTION-INTERNAL", 3, 0, false);
        declareFunction("html_story_term_description", "HTML-STORY-TERM-DESCRIPTION", 3, 0, false);
        declareFunction("ok_reference_set_terms_for_story", "OK-REFERENCE-SET-TERMS-FOR-STORY", 1, 0, false);
        declareFunction("clear_ok_terms_for_story", "CLEAR-OK-TERMS-FOR-STORY", 0, 0, false);
        declareFunction("remove_ok_terms_for_story", "REMOVE-OK-TERMS-FOR-STORY", 1, 0, false);
        declareFunction("ok_terms_for_story_internal", "OK-TERMS-FOR-STORY-INTERNAL", 1, 0, false);
        declareFunction("ok_terms_for_story", "OK-TERMS-FOR-STORY", 1, 0, false);
        declareFunction("story_term_okP", "STORY-TERM-OK?", 1, 2, false);
        declareFunction("story_pair_merge_plists", "STORY-PAIR-MERGE-PLISTS", 3, 0, false);
        declareFunction("shared_story_plists", "SHARED-STORY-PLISTS", 2, 0, false);
        declareFunction("shared_story_plist", "SHARED-STORY-PLIST", 4, 0, false);
        declareFunction("property_plist_has_property_p", "PROPERTY-PLIST-HAS-PROPERTY-P", 2, 0, false);
        declareFunction("find_matching_story_plist", "FIND-MATCHING-STORY-PLIST", 2, 0, false);
        declareFunction("html_show_pair_type_and_plists_row", "HTML-SHOW-PAIR-TYPE-AND-PLISTS-ROW", 3, 0, false);
        declareFunction("html_show_property_classification", "HTML-SHOW-PROPERTY-CLASSIFICATION", 1, 0, false);
        declareFunction("html_show_pair_type_and_plists_row_tabular", "HTML-SHOW-PAIR-TYPE-AND-PLISTS-ROW-TABULAR", 3, 0, false);
        declareFunction("remove_subsumed_plists", "REMOVE-SUBSUMED-PLISTS", 1, 0, false);
        declareFunction("html_show_pair_plists", "HTML-SHOW-PAIR-PLISTS", 2, 1, false);
        declareFunction("html_property_paraphrase", "HTML-PROPERTY-PARAPHRASE", 1, 1, false);
        declareFunction("reformulate_property_for_paraphrase", "REFORMULATE-PROPERTY-FOR-PARAPHRASE", 1, 0, false);
        declareFunction("classify_pair_plist", "CLASSIFY-PAIR-PLIST", 1, 0, false);
        declareFunction("pair_plist_mentions_term_identifier_p", "PAIR-PLIST-MENTIONS-TERM-IDENTIFIER-P", 2, 0, false);
        declareFunction("property_plist_display_color", "PROPERTY-PLIST-DISPLAY-COLOR", 2, 0, false);
        declareFunction("html_show_story_type_and_properties_row", "HTML-SHOW-STORY-TYPE-AND-PROPERTIES-ROW", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_story_constructor_file() {
        deflexical("*STORY-PROPERTIES-OF-TERM-CACHING-STATE*", NIL);
        deflexical("*PROPERTY-PLIST-CACHING-STATE*", NIL);
        deflexical("*STORY-TERM-PARAPHRASE-CACHING-STATE*", NIL);
        deflexical("*HTML-STORY-TERM-DESCRIPTION-CACHING-STATE*", NIL);
        deflexical("*OK-TERMS-FOR-STORY-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_story_constructor_file() {
                memoization_state.note_globally_cached_function(STORY_PROPERTIES_OF_TERM);
        memoization_state.note_globally_cached_function(PROPERTY_PLIST);
        memoization_state.note_globally_cached_function(STORY_TERM_PARAPHRASE);
        memoization_state.note_globally_cached_function(HTML_STORY_TERM_DESCRIPTION);
        memoization_state.note_globally_cached_function(OK_TERMS_FOR_STORY);
        return NIL;
    }

    // // Internal Constants
    public static final SubLFloat $float$0_9 = makeDouble(0.9);

    static private final SubLString $str_alt1$Classifying_story_sentences_for__ = makeString("Classifying story sentences for ~S...");



    private static final SubLSymbol MORE_GENERAL_PROPERTY_PAIR_P = makeSymbol("MORE-GENERAL-PROPERTY-PAIR-P");



    private static final SubLSymbol STORY_PROPERTIES_OF_TERM = makeSymbol("STORY-PROPERTIES-OF-TERM");

    public static final SubLSymbol $story_properties_of_term_caching_state$ = makeSymbol("*STORY-PROPERTIES-OF-TERM-CACHING-STATE*");

    public static final SubLSymbol $kw7$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    private static final SubLSymbol $MORE_GENERAL_PROPERTIES = makeKeyword("MORE-GENERAL-PROPERTIES");

    private static final SubLSymbol PROPERTY_PLIST = makeSymbol("PROPERTY-PLIST");

    private static final SubLSymbol $PREVALENCE = makeKeyword("PREVALENCE");



    public static final SubLSymbol $property_plist_caching_state$ = makeSymbol("*PROPERTY-PLIST-CACHING-STATE*");

    static private final SubLString $str_alt14$Classifying_Sentences_ = makeString("Classifying Sentences:");

    static private final SubLString $str_alt15$Elaborating_Sentences_ = makeString("Elaborating Sentences:");



    static private final SubLString $$$Classified_Properties = makeString("Classified Properties");

    static private final SubLString $$$Type = makeString("Type");

    static private final SubLString $$$Property = makeString("Property");

    public static final SubLObject $const20$TypicalityReferenceSetPropertyTyp = constant_handles.reader_make_constant_shell(makeString("TypicalityReferenceSetPropertyType"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));











    static private final SubLString $str_alt27$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt32$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt33$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt34 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt35$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $$$Other = makeString("Other");

    static private final SubLSymbol $sym37$_ = makeSymbol("<");

    private static final SubLSymbol PROPERTY_PLIST_MAX_PREVALENCE = makeSymbol("PROPERTY-PLIST-MAX-PREVALENCE");

    static private final SubLString $$$Least_Typical_Properties = makeString("Least Typical Properties");

    static private final SubLString $$$Prevalence = makeString("Prevalence");

    static private final SubLSymbol $sym41$_ = makeSymbol(">");

    private static final SubLSymbol PROPERTY_PLIST_MIN_PREVALENCE = makeSymbol("PROPERTY-PLIST-MIN-PREVALENCE");

    static private final SubLString $$$Most_Typical_Properties = makeString("Most Typical Properties");

    static private final SubLString $str_alt44$None_ = makeString("None.");







    static private final SubLString $str_alt48$Reference_Set__ = makeString("Reference Set: ");

    static private final SubLString $str_alt49$Definitional_Property_ = makeString("Definitional Property:");

    static private final SubLString $str_alt50$Term_1_Description__ = makeString("Term 1 Description: ");

    static private final SubLString $str_alt51$Term_2_Description__ = makeString("Term 2 Description: ");

    static private final SubLString $$$Unclassified = makeString("Unclassified");

    private static final SubLSymbol STORY_TERM_PARAPHRASE = makeSymbol("STORY-TERM-PARAPHRASE");

    public static final SubLSymbol $story_term_paraphrase_caching_state$ = makeSymbol("*STORY-TERM-PARAPHRASE-CACHING-STATE*");

    private static final SubLSymbol HTML_STORY_TERM_DESCRIPTION = makeSymbol("HTML-STORY-TERM-DESCRIPTION");





    static private final SubLString $str_alt58$No_interesting_properties_ = makeString("No interesting properties.");

    public static final SubLSymbol $html_story_term_description_caching_state$ = makeSymbol("*HTML-STORY-TERM-DESCRIPTION-CACHING-STATE*");

    private static final SubLSymbol OK_TERMS_FOR_STORY = makeSymbol("OK-TERMS-FOR-STORY");

    public static final SubLSymbol $ok_terms_for_story_caching_state$ = makeSymbol("*OK-TERMS-FOR-STORY-CACHING-STATE*");

    public static final SubLObject $$TKB_SME_AssertionsMt = constant_handles.reader_make_constant_shell(makeString("TKB-SME-AssertionsMt"));



    private static final SubLSymbol PROPERTY_PLIST_PROPERTY = makeSymbol("PROPERTY-PLIST-PROPERTY");

    static private final SubLString $str_alt65$I_know_the_following_ = makeString("I know the following ");

    static private final SubLString $str_alt66$_information_about_the_story_term = makeString(" information about the story terms:");

    private static final SubLSymbol CLASSIFY_PAIR_PLIST = makeSymbol("CLASSIFY-PAIR-PLIST");

    static private final SubLList $list_alt68 = list($BOTH, makeKeyword("TERM1"), makeKeyword("TERM2"));

    static private final SubLString $str_alt69$Just_Term_1_ = makeString("Just Term 1:");

    static private final SubLString $str_alt70$Just_Term_2_ = makeString("Just Term 2:");

    static private final SubLString $str_alt71$Shared_Properties_ = makeString("Shared Properties:");



    static private final SubLList $list_alt73 = list($BOTH, makeKeyword("TERM1"), makeKeyword("TERM2"), makeKeyword("NEITHER"));

    static private final SubLSymbol $sym74$GENL_PROPERTY_PLIST_ = makeSymbol("GENL-PROPERTY-PLIST?");

    static private final SubLString $str_alt75$Nothing_noteworthy_known_ = makeString("Nothing noteworthy known.");

    static private final SubLString $str_alt76$_A_because___A = makeString("~A because: ~A");

    static private final SubLString $$$Unusual = makeString("Unusual");

    static private final SubLString $$$Noteworthy = makeString("Noteworthy");



    static private final SubLList $list_alt80 = list(cons($TERM, makeString("the attack")));

    static private final SubLList $list_alt81 = list(constant_handles.reader_make_constant_shell(makeString("pastTense-Generic")), constant_handles.reader_make_constant_shell(makeString("tensed")));

    static private final SubLList $list_alt82 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(list($BIND, makeSymbol("BIN-PRED")), $TERM, list($TEST, makeSymbol("EL-VAR?"))), list(list($BIND, makeSymbol("TRANS-PRED")), list($BIND, makeSymbol("VALUE")), makeKeyword("ANYTHING"))));









    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));



    static private final SubLList $list_alt89 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(list($BIND, makeSymbol("TRANS-PRED")), list($BIND, makeSymbol("VALUE")), makeKeyword("ANYTHING")), list(list($BIND, makeSymbol("BIN-PRED")), $TERM, list($TEST, makeSymbol("EL-VAR?")))));

    static private final SubLList $list_alt90 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list($TEST, makeSymbol("EL-VAR?")), list($BIND, makeSymbol("VALUE"))), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsCount")), list($BIND, makeSymbol("BIN-PRED")), $TERM, list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));



    public static final SubLObject $$relationInstanceExistsCount = constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsCount"));

    public static final SubLObject $$IntervalMinFn = constant_handles.reader_make_constant_shell(makeString("IntervalMinFn"));

    static private final SubLList $list_alt94 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list($BIND, makeSymbol("VALUE")), list($TEST, makeSymbol("EL-VAR?"))), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsCount")), list($BIND, makeSymbol("BIN-PRED")), $TERM, list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));

    public static final SubLObject $$IntervalMaxFn = constant_handles.reader_make_constant_shell(makeString("IntervalMaxFn"));

    static private final SubLList $list_alt96 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list($BIND, makeSymbol("VALUE")), list($TEST, makeSymbol("EL-VAR?"))), list(list($BIND, makeSymbol("TERN-PRED")), $TERM, list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));



    static private final SubLList $list_alt98 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(list($BIND, makeSymbol("TERN-PRED")), $TERM, list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list($BIND, makeSymbol("VALUE")), list($TEST, makeSymbol("EL-VAR?")))));

    static private final SubLList $list_alt99 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsCount")), list($BIND, makeSymbol("BIN-PRED")), $TERM, list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list($BIND, makeSymbol("VALUE")), list($TEST, makeSymbol("EL-VAR?")))));



    static private final SubLString $$$black = makeString("black");

    static private final SubLString $$$red = makeString("red");

    static private final SubLString $$$green = makeString("green");

    // // Initializers
    public void declareFunctions() {
        declare_story_constructor_file();
    }

    public void initializeVariables() {
        init_story_constructor_file();
    }

    public void runTopLevelForms() {
        setup_story_constructor_file();
    }
}

