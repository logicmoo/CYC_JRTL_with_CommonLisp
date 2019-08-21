package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.rkf_knowledge_sorter;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.rkf_knowledge_sorter.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_knowledge_sorter extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_knowledge_sorter();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_knowledge_sorter";

    public static final String myFingerPrint = "4920195eab695303b6a9e5f90775fd8801e92ac0d7f8aa2aa192b2fb59c00dab";

    // deflexical
    // Definitions
    public static final SubLSymbol $rkf_classification_other$ = makeSymbol("*RKF-CLASSIFICATION-OTHER*");

    // deflexical
    public static final SubLSymbol $rkf_classification_other_singleton$ = makeSymbol("*RKF-CLASSIFICATION-OTHER-SINGLETON*");

    // deflexical
    // Dont forget to nuke any memoized state after changing this varibale.
    private static final SubLSymbol $rkf_sentence_classification_backchains$ = makeSymbol("*RKF-SENTENCE-CLASSIFICATION-BACKCHAINS*");

    private static final SubLObject $$UIANonClassifiedAssertion = reader_make_constant_shell(makeString("UIANonClassifiedAssertion"));

    public static final SubLSymbol RKF_CLASSIFYING_ASK = makeSymbol("RKF-CLASSIFYING-ASK");



    public static final SubLList $list3 = list(makeKeyword("CLASSIFICATION"));



    private static final SubLSymbol RKF_CLASSIFYING_SENTENCE_ASK = makeSymbol("RKF-CLASSIFYING-SENTENCE-ASK");



    private static final SubLList $list7 = list(makeKeyword("WHAT"));

    private static final SubLSymbol RKF_CLASSIFY_FORT = makeSymbol("RKF-CLASSIFY-FORT");

    private static final SubLSymbol RKF_CLASSIFY_SENTENCE = makeSymbol("RKF-CLASSIFY-SENTENCE");

    private static final SubLSymbol RKF_CLASSIFY_ASSERTION = makeSymbol("RKF-CLASSIFY-ASSERTION");

    private static final SubLSymbol RKF_CLASSIFY_SENTENCE_PRECISE = makeSymbol("RKF-CLASSIFY-SENTENCE-PRECISE");

    private static final SubLSymbol RKF_CLASSIFY_ASSERTION_PRECISE = makeSymbol("RKF-CLASSIFY-ASSERTION-PRECISE");



    private static final SubLObject $$uiaClassifyAssertionsAlong = reader_make_constant_shell(makeString("uiaClassifyAssertionsAlong"));

    private static final SubLList $list15 = list(makeKeyword("CLASSIFIER"));



    private static final SubLObject $$nthInOrdering = reader_make_constant_shell(makeString("nthInOrdering"));



    private static final SubLList $list19 = list(makeKeyword("INDEX"));



    private static final SubLObject $$baseSet = reader_make_constant_shell(makeString("baseSet"));

    private static final SubLList $list22 = list(makeKeyword("THE-SET"));



    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLList $list26 = list(makeKeyword("TYPE"));

    private static final SubLObject $$OrderingsOfTypeFn = reader_make_constant_shell(makeString("OrderingsOfTypeFn"));

    private static final SubLSymbol $sym28$_ORDERING = makeSymbol("?ORDERING");

    private static final SubLList $list29 = list(makeSymbol("?NUMBER"));

    public static final SubLList $list30 = list(makeSymbol("VARIABLE-BINDINGS"), makeSymbol("JUSTIFICATION"));

    public static SubLObject rkf_classified_as_otherP(final SubLObject result) {
        return makeBoolean((NIL != list_utilities.singletonP(result)) && result.first().eql($rkf_classification_other$.getGlobalValue()));
    }

    public static SubLObject rkf_classifying_ask_internal(final SubLObject fort, final SubLObject classifier, final SubLObject domain_mt) {
        return ask_utilities.ask_variable($CLASSIFICATION, listS(classifier, fort, $list3), domain_mt, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_classifying_ask(final SubLObject fort, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_classifying_ask_internal(fort, classifier, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_CLASSIFYING_ASK, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_CLASSIFYING_ASK, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_CLASSIFYING_ASK, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(fort, classifier, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (classifier.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_classifying_ask_internal(fort, classifier, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, classifier, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_classify_fort(final SubLObject fort, final SubLObject classifier, final SubLObject domain_mt) {
        SubLObject classification = NIL;
        classification = rkf_classifying_ask(fort, classifier, domain_mt);
        if (NIL == classification) {
            classification = $rkf_classification_other_singleton$.getGlobalValue();
        }
        return classification;
    }

    public static SubLObject rkf_classify_sentence(final SubLObject sentence, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject classification = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(sentence, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject classified = rkf_classify_fort(v_term, classifier, domain_mt);
            if (NIL == rkf_classified_as_otherP(classified)) {
                SubLObject cdolist_list_var_$1 = classified;
                SubLObject v_class = NIL;
                v_class = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    SubLObject count = dictionary.dictionary_lookup(classification, v_class, ZERO_INTEGER);
                    count = add(count, ONE_INTEGER);
                    dictionary.dictionary_enter(classification, classified, count);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    v_class = cdolist_list_var_$1.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject max = ZERO_INTEGER;
        SubLObject choice = $rkf_classification_other$.getGlobalValue();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(classification)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject classified2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (max.numL(count2)) {
                choice = classified2;
            } else
                if (max.numE(count2)) {
                    if (!choice.isList()) {
                        choice = list(choice);
                    }
                    choice = cons(classified2, choice);
                }

        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (!choice.isList()) {
            choice = list(choice);
        }
        return choice;
    }

    public static SubLObject rkf_classify_assertion(final SubLObject assertion, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLObject result = rkf_classify_sentence(uncanonicalizer.assertion_el_formula(assertion), classifier, domain_mt);
        return NIL == result ? $rkf_classification_other_singleton$.getGlobalValue() : result;
    }

    public static SubLObject rkf_classify_sentence_precise(final SubLObject sentence, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLObject backchains = $rkf_sentence_classification_backchains$.getGlobalValue();
        final SubLObject result = rkf_classifying_sentence_ask(classifier, sentence, domain_mt, backchains);
        return NIL == result ? $rkf_classification_other_singleton$.getGlobalValue() : result;
    }

    public static SubLObject rkf_classify_assertion_precise(final SubLObject assertion, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        return rkf_classify_sentence_precise(sentence, classifier, domain_mt);
    }

    public static SubLObject rkf_classifying_sentence_ask_internal(final SubLObject classifier, final SubLObject sentence, final SubLObject domain_mt, final SubLObject backchains) {
        return ask_utilities.ask_variable($WHAT, listS(classifier, sentence, $list7), domain_mt, backchains, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_classifying_sentence_ask(final SubLObject classifier, final SubLObject sentence, final SubLObject domain_mt, final SubLObject backchains) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_classifying_sentence_ask_internal(classifier, sentence, domain_mt, backchains);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_CLASSIFYING_SENTENCE_ASK, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_CLASSIFYING_SENTENCE_ASK, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_CLASSIFYING_SENTENCE_ASK, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(classifier, sentence, domain_mt, backchains);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (classifier.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sentence.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (domain_mt.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && backchains.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_classifying_sentence_ask_internal(classifier, sentence, domain_mt, backchains)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(classifier, sentence, domain_mt, backchains));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_classify_fort_set(final SubLObject v_forts, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(v_forts, classifier, domain_mt, RKF_CLASSIFY_FORT);
    }

    public static SubLObject rkf_classify_sentence_set(final SubLObject sentences, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(sentences, classifier, domain_mt, RKF_CLASSIFY_SENTENCE);
    }

    public static SubLObject rkf_classify_assertion_set(final SubLObject assertions, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(assertions, classifier, domain_mt, RKF_CLASSIFY_ASSERTION);
    }

    public static SubLObject rkf_classify_sentence_set_precise(final SubLObject sentences, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(sentences, classifier, domain_mt, RKF_CLASSIFY_SENTENCE_PRECISE);
    }

    public static SubLObject rkf_classify_assertion_set_precise(final SubLObject sentences, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(sentences, classifier, domain_mt, RKF_CLASSIFY_ASSERTION_PRECISE);
    }

    public static SubLObject rkf_classify_group_of_objects(final SubLObject objects, final SubLObject classifier, final SubLObject domain_mt, final SubLObject classify_method) {
        final SubLObject organization = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject classifications = cdolist_list_var_$2 = funcall(classify_method, v_object, classifier, domain_mt);
            SubLObject classification = NIL;
            classification = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                dictionary_utilities.dictionary_push(organization, classification, v_object);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                classification = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return organization;
    }

    public static SubLObject rkf_partially_order_sequence(final SubLObject sequence, final SubLObject partial_order_expression) {
        final SubLObject order_formula = (NIL != nart_handles.nart_p(partial_order_expression)) ? narts_high.nart_el_formula(partial_order_expression) : partial_order_expression;
        final SubLObject order_predicate = cycl_utilities.formula_arg1(order_formula, UNPROVIDED);
        final SubLObject order_key = cycl_utilities.formula_arg2(order_formula, UNPROVIDED);
        final SubLObject code_predicate = rkf_map_order_predicate_to_function(order_predicate);
        final SubLObject code_key = rkf_map_order_key_to_function(order_key);
        return sequence;
    }

    public static SubLObject rkf_map_order_predicate_to_function(final SubLObject order_predicate) {
        return NIL;
    }

    public static SubLObject rkf_map_order_key_to_function(final SubLObject order_key) {
        return NIL;
    }

    public static SubLObject rkf_get_domain_classifier_for_assertions(final SubLObject domain_mt) {
        final SubLObject classifiers = ask_utilities.ask_variable($CLASSIFIER, listS($$uiaClassifyAssertionsAlong, domain_mt, $list15), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return classifiers.first();
    }

    public static SubLObject rkf_get_ordering_categories(final SubLObject ordering, final SubLObject mt) {
        final SubLObject cardinality = rkf_get_ordering_cardinality(ordering, mt);
        SubLObject ordered_categories = NIL;
        if (cardinality.isFixnum()) {
            ordered_categories = make_list(cardinality, UNPROVIDED);
            SubLObject i;
            SubLObject index;
            SubLObject v_term;
            for (i = NIL, i = ZERO_INTEGER; i.numL(cardinality); i = add(i, ONE_INTEGER)) {
                index = add(i, ONE_INTEGER);
                v_term = rkf_get_nth_category_in_ordering(ordering, index, mt);
                set_nth(i, ordered_categories, v_term);
            }
        }
        return ordered_categories;
    }

    public static SubLObject rkf_get_nth_category_in_ordering(final SubLObject ordering, final SubLObject index, final SubLObject mt) {
        final SubLObject term_result_set = ask_utilities.ask_variable($TERM, list($$nthInOrdering, ordering, $TERM, index), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        return term_result_set.first();
    }

    public static SubLObject rkf_get_position_of_category_in_ordering(final SubLObject ordering, final SubLObject category, final SubLObject mt) {
        final SubLObject term_result_set = ask_utilities.ask_variable($INDEX, listS($$nthInOrdering, ordering, category, $list19), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        return term_result_set.first();
    }

    public static SubLObject rkf_get_ordering_cardinality(final SubLObject ordering, final SubLObject mt) {
        return length(rkf_get_ordering_set_members(ordering, mt));
    }

    public static SubLObject rkf_get_ordering_set_members(final SubLObject ordering, final SubLObject mt) {
        final SubLObject the_set = rkf_get_ordering_set_expression(ordering, mt);
        return the_set.rest();
    }

    public static SubLObject rkf_get_ordering_set_expression(final SubLObject ordering, final SubLObject mt) {
        final SubLObject the_set = ask_utilities.ask_variable($THE_SET, listS($$baseSet, ordering, $list22), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        return the_set.first();
    }

    public static SubLObject rkf_guess_ordering_from_classifier(final SubLObject classifier, final SubLObject mt) {
        final SubLObject order_types = backward.removal_ask_variable($TYPE, list($$assertedSentence, listS($$arg2Isa, classifier, $list26)), mt, UNPROVIDED, UNPROVIDED);
        final SubLObject order_type = order_types.first();
        if (NIL != forts.fort_p(order_type)) {
            final SubLObject ordering_fn = narts_high.find_nart(list($$OrderingsOfTypeFn, order_type));
            if (NIL != nart_handles.nart_p(ordering_fn)) {
                final SubLObject orderings = isa.instances(ordering_fn, mt, UNPROVIDED);
                return orderings.first();
            }
        }
        return NIL;
    }

    public static SubLObject rkf_guess_ordering_from_category(final SubLObject category, final SubLObject mt) {
        final SubLObject variable = $sym28$_ORDERING;
        final SubLObject v_bindings = rkf_query_utilities.rkf_query(listS($$nthInOrdering, variable, category, $list29), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            final SubLObject v_answer = v_bindings.first();
            SubLObject current;
            final SubLObject datum = current = v_answer;
            SubLObject variable_bindings = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list30);
            variable_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list30);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject tuple = assoc(variable, variable_bindings, UNPROVIDED, UNPROVIDED);
                return tuple.rest();
            }
            cdestructuring_bind_error(datum, $list30);
        }
        return NIL;
    }

    public static SubLObject rkf_guess_ordering_categories_from_category(final SubLObject category, final SubLObject mt) {
        final SubLObject ordering = rkf_guess_ordering_categories_from_category(category, mt);
        if (NIL != forts.fort_p(ordering)) {
            return rkf_get_ordering_categories(ordering, mt);
        }
        return NIL;
    }

    public static SubLObject rkf_get_ordering_categories_from_classifier(final SubLObject classifier, final SubLObject mt) {
        final SubLObject ordering = rkf_guess_ordering_from_classifier(classifier, mt);
        if (NIL != forts.fort_p(ordering)) {
            return rkf_get_ordering_categories(ordering, mt);
        }
        return NIL;
    }

    public static SubLObject declare_rkf_knowledge_sorter_file() {
        declareFunction(me, "rkf_classified_as_otherP", "RKF-CLASSIFIED-AS-OTHER?", 1, 0, false);
        declareFunction(me, "rkf_classifying_ask_internal", "RKF-CLASSIFYING-ASK-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_classifying_ask", "RKF-CLASSIFYING-ASK", 3, 0, false);
        declareFunction(me, "rkf_classify_fort", "RKF-CLASSIFY-FORT", 3, 0, false);
        declareFunction(me, "rkf_classify_sentence", "RKF-CLASSIFY-SENTENCE", 3, 0, false);
        declareFunction(me, "rkf_classify_assertion", "RKF-CLASSIFY-ASSERTION", 3, 0, false);
        declareFunction(me, "rkf_classify_sentence_precise", "RKF-CLASSIFY-SENTENCE-PRECISE", 3, 0, false);
        declareFunction(me, "rkf_classify_assertion_precise", "RKF-CLASSIFY-ASSERTION-PRECISE", 3, 0, false);
        declareFunction(me, "rkf_classifying_sentence_ask_internal", "RKF-CLASSIFYING-SENTENCE-ASK-INTERNAL", 4, 0, false);
        declareFunction(me, "rkf_classifying_sentence_ask", "RKF-CLASSIFYING-SENTENCE-ASK", 4, 0, false);
        declareFunction(me, "rkf_classify_fort_set", "RKF-CLASSIFY-FORT-SET", 3, 0, false);
        declareFunction(me, "rkf_classify_sentence_set", "RKF-CLASSIFY-SENTENCE-SET", 3, 0, false);
        declareFunction(me, "rkf_classify_assertion_set", "RKF-CLASSIFY-ASSERTION-SET", 3, 0, false);
        declareFunction(me, "rkf_classify_sentence_set_precise", "RKF-CLASSIFY-SENTENCE-SET-PRECISE", 3, 0, false);
        declareFunction(me, "rkf_classify_assertion_set_precise", "RKF-CLASSIFY-ASSERTION-SET-PRECISE", 3, 0, false);
        declareFunction(me, "rkf_classify_group_of_objects", "RKF-CLASSIFY-GROUP-OF-OBJECTS", 4, 0, false);
        declareFunction(me, "rkf_partially_order_sequence", "RKF-PARTIALLY-ORDER-SEQUENCE", 2, 0, false);
        declareFunction(me, "rkf_map_order_predicate_to_function", "RKF-MAP-ORDER-PREDICATE-TO-FUNCTION", 1, 0, false);
        declareFunction(me, "rkf_map_order_key_to_function", "RKF-MAP-ORDER-KEY-TO-FUNCTION", 1, 0, false);
        declareFunction(me, "rkf_get_domain_classifier_for_assertions", "RKF-GET-DOMAIN-CLASSIFIER-FOR-ASSERTIONS", 1, 0, false);
        declareFunction(me, "rkf_get_ordering_categories", "RKF-GET-ORDERING-CATEGORIES", 2, 0, false);
        declareFunction(me, "rkf_get_nth_category_in_ordering", "RKF-GET-NTH-CATEGORY-IN-ORDERING", 3, 0, false);
        declareFunction(me, "rkf_get_position_of_category_in_ordering", "RKF-GET-POSITION-OF-CATEGORY-IN-ORDERING", 3, 0, false);
        declareFunction(me, "rkf_get_ordering_cardinality", "RKF-GET-ORDERING-CARDINALITY", 2, 0, false);
        declareFunction(me, "rkf_get_ordering_set_members", "RKF-GET-ORDERING-SET-MEMBERS", 2, 0, false);
        declareFunction(me, "rkf_get_ordering_set_expression", "RKF-GET-ORDERING-SET-EXPRESSION", 2, 0, false);
        declareFunction(me, "rkf_guess_ordering_from_classifier", "RKF-GUESS-ORDERING-FROM-CLASSIFIER", 2, 0, false);
        declareFunction(me, "rkf_guess_ordering_from_category", "RKF-GUESS-ORDERING-FROM-CATEGORY", 2, 0, false);
        declareFunction(me, "rkf_guess_ordering_categories_from_category", "RKF-GUESS-ORDERING-CATEGORIES-FROM-CATEGORY", 2, 0, false);
        declareFunction(me, "rkf_get_ordering_categories_from_classifier", "RKF-GET-ORDERING-CATEGORIES-FROM-CLASSIFIER", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_knowledge_sorter_file() {
        deflexical("*RKF-CLASSIFICATION-OTHER*", $$UIANonClassifiedAssertion);
        deflexical("*RKF-CLASSIFICATION-OTHER-SINGLETON*", list($rkf_classification_other$.getGlobalValue()));
        deflexical("*RKF-SENTENCE-CLASSIFICATION-BACKCHAINS*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_rkf_knowledge_sorter_file() {
        memoization_state.note_memoized_function(RKF_CLASSIFYING_ASK);
        memoization_state.note_memoized_function(RKF_CLASSIFYING_SENTENCE_ASK);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_knowledge_sorter_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_knowledge_sorter_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_knowledge_sorter_file();
    }

    static {



































    }
}

/**
 * Total time: 72 ms
 */
