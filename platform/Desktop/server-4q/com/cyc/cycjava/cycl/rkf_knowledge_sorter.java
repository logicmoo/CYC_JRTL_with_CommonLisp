package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_knowledge_sorter extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_knowledge_sorter";
    public static final String myFingerPrint = "4920195eab695303b6a9e5f90775fd8801e92ac0d7f8aa2aa192b2fb59c00dab";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 859L)
    public static SubLSymbol $rkf_classification_other$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 939L)
    public static SubLSymbol $rkf_classification_other_singleton$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 2914L)
    private static SubLSymbol $rkf_sentence_classification_backchains$;
    private static final SubLObject $const0$UIANonClassifiedAssertion;
    private static final SubLSymbol $sym1$RKF_CLASSIFYING_ASK;
    private static final SubLSymbol $kw2$CLASSIFICATION;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$IGNORE;
    private static final SubLSymbol $sym5$RKF_CLASSIFYING_SENTENCE_ASK;
    private static final SubLSymbol $kw6$WHAT;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$RKF_CLASSIFY_FORT;
    private static final SubLSymbol $sym9$RKF_CLASSIFY_SENTENCE;
    private static final SubLSymbol $sym10$RKF_CLASSIFY_ASSERTION;
    private static final SubLSymbol $sym11$RKF_CLASSIFY_SENTENCE_PRECISE;
    private static final SubLSymbol $sym12$RKF_CLASSIFY_ASSERTION_PRECISE;
    private static final SubLSymbol $kw13$CLASSIFIER;
    private static final SubLObject $const14$uiaClassifyAssertionsAlong;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$TERM;
    private static final SubLObject $const17$nthInOrdering;
    private static final SubLSymbol $kw18$INDEX;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$THE_SET;
    private static final SubLObject $const21$baseSet;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$TYPE;
    private static final SubLObject $const24$assertedSentence;
    private static final SubLObject $const25$arg2Isa;
    private static final SubLList $list26;
    private static final SubLObject $const27$OrderingsOfTypeFn;
    private static final SubLSymbol $sym28$_ORDERING;
    private static final SubLList $list29;
    private static final SubLList $list30;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 1033L)
    public static SubLObject rkf_classified_as_otherP(final SubLObject result) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_knowledge_sorter.NIL != list_utilities.singletonP(result) && result.first().eql(rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 1184L)
    public static SubLObject rkf_classifying_ask_internal(final SubLObject fort, final SubLObject classifier, final SubLObject domain_mt) {
        return ask_utilities.ask_variable((SubLObject)rkf_knowledge_sorter.$kw2$CLASSIFICATION, (SubLObject)ConsesLow.listS(classifier, fort, (SubLObject)rkf_knowledge_sorter.$list3), domain_mt, (SubLObject)rkf_knowledge_sorter.NIL, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 1184L)
    public static SubLObject rkf_classifying_ask(final SubLObject fort, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_knowledge_sorter.NIL;
        if (rkf_knowledge_sorter.NIL == v_memoization_state) {
            return rkf_classifying_ask_internal(fort, classifier, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_knowledge_sorter.$sym1$RKF_CLASSIFYING_ASK, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        if (rkf_knowledge_sorter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_knowledge_sorter.$sym1$RKF_CLASSIFYING_ASK, (SubLObject)rkf_knowledge_sorter.THREE_INTEGER, (SubLObject)rkf_knowledge_sorter.NIL, (SubLObject)rkf_knowledge_sorter.EQL, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_knowledge_sorter.$sym1$RKF_CLASSIFYING_ASK, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(fort, classifier, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_knowledge_sorter.NIL;
            collision = cdolist_list_var.first();
            while (rkf_knowledge_sorter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (classifier.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_knowledge_sorter.NIL != cached_args && rkf_knowledge_sorter.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_classifying_ask_internal(fort, classifier, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fort, classifier, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 1435L)
    public static SubLObject rkf_classify_fort(final SubLObject fort, final SubLObject classifier, final SubLObject domain_mt) {
        SubLObject classification = (SubLObject)rkf_knowledge_sorter.NIL;
        classification = rkf_classifying_ask(fort, classifier, domain_mt);
        if (rkf_knowledge_sorter.NIL == classification) {
            classification = rkf_knowledge_sorter.$rkf_classification_other_singleton$.getGlobalValue();
        }
        return classification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 1730L)
    public static SubLObject rkf_classify_sentence(final SubLObject sentence, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject classification = dictionary.new_dictionary((SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(sentence, (SubLObject)rkf_knowledge_sorter.$kw4$IGNORE);
        SubLObject v_term = (SubLObject)rkf_knowledge_sorter.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_knowledge_sorter.NIL != cdolist_list_var) {
            final SubLObject classified = rkf_classify_fort(v_term, classifier, domain_mt);
            if (rkf_knowledge_sorter.NIL == rkf_classified_as_otherP(classified)) {
                SubLObject cdolist_list_var_$1 = classified;
                SubLObject v_class = (SubLObject)rkf_knowledge_sorter.NIL;
                v_class = cdolist_list_var_$1.first();
                while (rkf_knowledge_sorter.NIL != cdolist_list_var_$1) {
                    SubLObject count = dictionary.dictionary_lookup(classification, v_class, (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER);
                    count = Numbers.add(count, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER);
                    dictionary.dictionary_enter(classification, classified, count);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    v_class = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        final SubLObject max = (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER;
        SubLObject choice = rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(classification)); rkf_knowledge_sorter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject classified2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (max.numL(count2)) {
                choice = classified2;
            }
            else if (max.numE(count2)) {
                if (!choice.isList()) {
                    choice = (SubLObject)ConsesLow.list(choice);
                }
                choice = (SubLObject)ConsesLow.cons(classified2, choice);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (!choice.isList()) {
            choice = (SubLObject)ConsesLow.list(choice);
        }
        return choice;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 2654L)
    public static SubLObject rkf_classify_assertion(final SubLObject assertion, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLObject result = rkf_classify_sentence(uncanonicalizer.assertion_el_formula(assertion), classifier, domain_mt);
        return (rkf_knowledge_sorter.NIL == result) ? rkf_knowledge_sorter.$rkf_classification_other_singleton$.getGlobalValue() : result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 3053L)
    public static SubLObject rkf_classify_sentence_precise(final SubLObject sentence, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLObject backchains = rkf_knowledge_sorter.$rkf_sentence_classification_backchains$.getGlobalValue();
        final SubLObject result = rkf_classifying_sentence_ask(classifier, sentence, domain_mt, backchains);
        return (rkf_knowledge_sorter.NIL == result) ? rkf_knowledge_sorter.$rkf_classification_other_singleton$.getGlobalValue() : result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 3460L)
    public static SubLObject rkf_classify_assertion_precise(final SubLObject assertion, final SubLObject classifier, final SubLObject domain_mt) {
        final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        return rkf_classify_sentence_precise(sentence, classifier, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 3791L)
    public static SubLObject rkf_classifying_sentence_ask_internal(final SubLObject classifier, final SubLObject sentence, final SubLObject domain_mt, final SubLObject backchains) {
        return ask_utilities.ask_variable((SubLObject)rkf_knowledge_sorter.$kw6$WHAT, (SubLObject)ConsesLow.listS(classifier, sentence, (SubLObject)rkf_knowledge_sorter.$list7), domain_mt, backchains, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 3791L)
    public static SubLObject rkf_classifying_sentence_ask(final SubLObject classifier, final SubLObject sentence, final SubLObject domain_mt, final SubLObject backchains) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_knowledge_sorter.NIL;
        if (rkf_knowledge_sorter.NIL == v_memoization_state) {
            return rkf_classifying_sentence_ask_internal(classifier, sentence, domain_mt, backchains);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_knowledge_sorter.$sym5$RKF_CLASSIFYING_SENTENCE_ASK, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        if (rkf_knowledge_sorter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_knowledge_sorter.$sym5$RKF_CLASSIFYING_SENTENCE_ASK, (SubLObject)rkf_knowledge_sorter.FOUR_INTEGER, (SubLObject)rkf_knowledge_sorter.NIL, (SubLObject)rkf_knowledge_sorter.EQUALP, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_knowledge_sorter.$sym5$RKF_CLASSIFYING_SENTENCE_ASK, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(classifier, sentence, domain_mt, backchains);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_knowledge_sorter.NIL;
            collision = cdolist_list_var.first();
            while (rkf_knowledge_sorter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (classifier.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sentence.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (domain_mt.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (rkf_knowledge_sorter.NIL != cached_args && rkf_knowledge_sorter.NIL == cached_args.rest() && backchains.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_classifying_sentence_ask_internal(classifier, sentence, domain_mt, backchains)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(classifier, sentence, domain_mt, backchains));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 4005L)
    public static SubLObject rkf_classify_fort_set(final SubLObject v_forts, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(v_forts, classifier, domain_mt, (SubLObject)rkf_knowledge_sorter.$sym8$RKF_CLASSIFY_FORT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 4212L)
    public static SubLObject rkf_classify_sentence_set(final SubLObject sentences, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(sentences, classifier, domain_mt, (SubLObject)rkf_knowledge_sorter.$sym9$RKF_CLASSIFY_SENTENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 4396L)
    public static SubLObject rkf_classify_assertion_set(final SubLObject assertions, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(assertions, classifier, domain_mt, (SubLObject)rkf_knowledge_sorter.$sym10$RKF_CLASSIFY_ASSERTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 4585L)
    public static SubLObject rkf_classify_sentence_set_precise(final SubLObject sentences, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(sentences, classifier, domain_mt, (SubLObject)rkf_knowledge_sorter.$sym11$RKF_CLASSIFY_SENTENCE_PRECISE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 4784L)
    public static SubLObject rkf_classify_assertion_set_precise(final SubLObject sentences, final SubLObject classifier, final SubLObject domain_mt) {
        return rkf_classify_group_of_objects(sentences, classifier, domain_mt, (SubLObject)rkf_knowledge_sorter.$sym12$RKF_CLASSIFY_ASSERTION_PRECISE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 4984L)
    public static SubLObject rkf_classify_group_of_objects(final SubLObject objects, final SubLObject classifier, final SubLObject domain_mt, final SubLObject classify_method) {
        final SubLObject organization = dictionary.new_dictionary((SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)rkf_knowledge_sorter.NIL;
        v_object = cdolist_list_var.first();
        while (rkf_knowledge_sorter.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject classifications = cdolist_list_var_$2 = Functions.funcall(classify_method, v_object, classifier, domain_mt);
            SubLObject classification = (SubLObject)rkf_knowledge_sorter.NIL;
            classification = cdolist_list_var_$2.first();
            while (rkf_knowledge_sorter.NIL != cdolist_list_var_$2) {
                dictionary_utilities.dictionary_push(organization, classification, v_object);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                classification = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return organization;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 5379L)
    public static SubLObject rkf_partially_order_sequence(final SubLObject sequence, final SubLObject partial_order_expression) {
        final SubLObject order_formula = (rkf_knowledge_sorter.NIL != nart_handles.nart_p(partial_order_expression)) ? narts_high.nart_el_formula(partial_order_expression) : partial_order_expression;
        final SubLObject order_predicate = cycl_utilities.formula_arg1(order_formula, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        final SubLObject order_key = cycl_utilities.formula_arg2(order_formula, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        final SubLObject code_predicate = rkf_map_order_predicate_to_function(order_predicate);
        final SubLObject code_key = rkf_map_order_key_to_function(order_key);
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 6034L)
    public static SubLObject rkf_map_order_predicate_to_function(final SubLObject order_predicate) {
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 6159L)
    public static SubLObject rkf_map_order_key_to_function(final SubLObject order_key) {
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 6266L)
    public static SubLObject rkf_get_domain_classifier_for_assertions(final SubLObject domain_mt) {
        final SubLObject classifiers = ask_utilities.ask_variable((SubLObject)rkf_knowledge_sorter.$kw13$CLASSIFIER, (SubLObject)ConsesLow.listS(rkf_knowledge_sorter.$const14$uiaClassifyAssertionsAlong, domain_mt, (SubLObject)rkf_knowledge_sorter.$list15), domain_mt, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        return classifiers.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 6659L)
    public static SubLObject rkf_get_ordering_categories(final SubLObject ordering, final SubLObject mt) {
        final SubLObject cardinality = rkf_get_ordering_cardinality(ordering, mt);
        SubLObject ordered_categories = (SubLObject)rkf_knowledge_sorter.NIL;
        if (cardinality.isFixnum()) {
            ordered_categories = (SubLObject)ConsesLow.make_list(cardinality, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
            SubLObject i;
            SubLObject index;
            SubLObject v_term;
            for (i = (SubLObject)rkf_knowledge_sorter.NIL, i = (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER; i.numL(cardinality); i = Numbers.add(i, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER)) {
                index = Numbers.add(i, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER);
                v_term = rkf_get_nth_category_in_ordering(ordering, index, mt);
                ConsesLow.set_nth(i, ordered_categories, v_term);
            }
        }
        return ordered_categories;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 7267L)
    public static SubLObject rkf_get_nth_category_in_ordering(final SubLObject ordering, final SubLObject index, final SubLObject mt) {
        final SubLObject term_result_set = ask_utilities.ask_variable((SubLObject)rkf_knowledge_sorter.$kw16$TERM, (SubLObject)ConsesLow.list(rkf_knowledge_sorter.$const17$nthInOrdering, ordering, (SubLObject)rkf_knowledge_sorter.$kw16$TERM, index), mt, (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        return term_result_set.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 7612L)
    public static SubLObject rkf_get_position_of_category_in_ordering(final SubLObject ordering, final SubLObject category, final SubLObject mt) {
        final SubLObject term_result_set = ask_utilities.ask_variable((SubLObject)rkf_knowledge_sorter.$kw18$INDEX, (SubLObject)ConsesLow.listS(rkf_knowledge_sorter.$const17$nthInOrdering, ordering, category, (SubLObject)rkf_knowledge_sorter.$list19), mt, (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        return term_result_set.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 7978L)
    public static SubLObject rkf_get_ordering_cardinality(final SubLObject ordering, final SubLObject mt) {
        return Sequences.length(rkf_get_ordering_set_members(ordering, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 8214L)
    public static SubLObject rkf_get_ordering_set_members(final SubLObject ordering, final SubLObject mt) {
        final SubLObject the_set = rkf_get_ordering_set_expression(ordering, mt);
        return the_set.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 8454L)
    public static SubLObject rkf_get_ordering_set_expression(final SubLObject ordering, final SubLObject mt) {
        final SubLObject the_set = ask_utilities.ask_variable((SubLObject)rkf_knowledge_sorter.$kw20$THE_SET, (SubLObject)ConsesLow.listS(rkf_knowledge_sorter.$const21$baseSet, ordering, (SubLObject)rkf_knowledge_sorter.$list22), mt, (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        return the_set.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 8708L)
    public static SubLObject rkf_guess_ordering_from_classifier(final SubLObject classifier, final SubLObject mt) {
        final SubLObject order_types = backward.removal_ask_variable((SubLObject)rkf_knowledge_sorter.$kw23$TYPE, (SubLObject)ConsesLow.list(rkf_knowledge_sorter.$const24$assertedSentence, (SubLObject)ConsesLow.listS(rkf_knowledge_sorter.$const25$arg2Isa, classifier, (SubLObject)rkf_knowledge_sorter.$list26)), mt, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        final SubLObject order_type = order_types.first();
        if (rkf_knowledge_sorter.NIL != forts.fort_p(order_type)) {
            final SubLObject ordering_fn = narts_high.find_nart((SubLObject)ConsesLow.list(rkf_knowledge_sorter.$const27$OrderingsOfTypeFn, order_type));
            if (rkf_knowledge_sorter.NIL != nart_handles.nart_p(ordering_fn)) {
                final SubLObject orderings = isa.instances(ordering_fn, mt, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
                return orderings.first();
            }
        }
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 9351L)
    public static SubLObject rkf_guess_ordering_from_category(final SubLObject category, final SubLObject mt) {
        final SubLObject variable = (SubLObject)rkf_knowledge_sorter.$sym28$_ORDERING;
        final SubLObject v_bindings = rkf_query_utilities.rkf_query((SubLObject)ConsesLow.listS(rkf_knowledge_sorter.$const17$nthInOrdering, variable, category, (SubLObject)rkf_knowledge_sorter.$list29), mt, (SubLObject)rkf_knowledge_sorter.ZERO_INTEGER, (SubLObject)rkf_knowledge_sorter.ONE_INTEGER, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
        if (rkf_knowledge_sorter.NIL != v_bindings) {
            final SubLObject v_answer = v_bindings.first();
            SubLObject current;
            final SubLObject datum = current = v_answer;
            SubLObject variable_bindings = (SubLObject)rkf_knowledge_sorter.NIL;
            SubLObject justification = (SubLObject)rkf_knowledge_sorter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_knowledge_sorter.$list30);
            variable_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_knowledge_sorter.$list30);
            justification = current.first();
            current = current.rest();
            if (rkf_knowledge_sorter.NIL == current) {
                final SubLObject tuple = conses_high.assoc(variable, variable_bindings, (SubLObject)rkf_knowledge_sorter.UNPROVIDED, (SubLObject)rkf_knowledge_sorter.UNPROVIDED);
                return tuple.rest();
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_knowledge_sorter.$list30);
        }
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 9778L)
    public static SubLObject rkf_guess_ordering_categories_from_category(final SubLObject category, final SubLObject mt) {
        final SubLObject ordering = rkf_guess_ordering_categories_from_category(category, mt);
        if (rkf_knowledge_sorter.NIL != forts.fort_p(ordering)) {
            return rkf_get_ordering_categories(ordering, mt);
        }
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-knowledge-sorter.lisp", position = 10033L)
    public static SubLObject rkf_get_ordering_categories_from_classifier(final SubLObject classifier, final SubLObject mt) {
        final SubLObject ordering = rkf_guess_ordering_from_classifier(classifier, mt);
        if (rkf_knowledge_sorter.NIL != forts.fort_p(ordering)) {
            return rkf_get_ordering_categories(ordering, mt);
        }
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    public static SubLObject declare_rkf_knowledge_sorter_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classified_as_otherP", "RKF-CLASSIFIED-AS-OTHER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classifying_ask_internal", "RKF-CLASSIFYING-ASK-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classifying_ask", "RKF-CLASSIFYING-ASK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_fort", "RKF-CLASSIFY-FORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_sentence", "RKF-CLASSIFY-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_assertion", "RKF-CLASSIFY-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_sentence_precise", "RKF-CLASSIFY-SENTENCE-PRECISE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_assertion_precise", "RKF-CLASSIFY-ASSERTION-PRECISE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classifying_sentence_ask_internal", "RKF-CLASSIFYING-SENTENCE-ASK-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classifying_sentence_ask", "RKF-CLASSIFYING-SENTENCE-ASK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_fort_set", "RKF-CLASSIFY-FORT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_sentence_set", "RKF-CLASSIFY-SENTENCE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_assertion_set", "RKF-CLASSIFY-ASSERTION-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_sentence_set_precise", "RKF-CLASSIFY-SENTENCE-SET-PRECISE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_assertion_set_precise", "RKF-CLASSIFY-ASSERTION-SET-PRECISE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_classify_group_of_objects", "RKF-CLASSIFY-GROUP-OF-OBJECTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_partially_order_sequence", "RKF-PARTIALLY-ORDER-SEQUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_map_order_predicate_to_function", "RKF-MAP-ORDER-PREDICATE-TO-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_map_order_key_to_function", "RKF-MAP-ORDER-KEY-TO-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_domain_classifier_for_assertions", "RKF-GET-DOMAIN-CLASSIFIER-FOR-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_ordering_categories", "RKF-GET-ORDERING-CATEGORIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_nth_category_in_ordering", "RKF-GET-NTH-CATEGORY-IN-ORDERING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_position_of_category_in_ordering", "RKF-GET-POSITION-OF-CATEGORY-IN-ORDERING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_ordering_cardinality", "RKF-GET-ORDERING-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_ordering_set_members", "RKF-GET-ORDERING-SET-MEMBERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_ordering_set_expression", "RKF-GET-ORDERING-SET-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_guess_ordering_from_classifier", "RKF-GUESS-ORDERING-FROM-CLASSIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_guess_ordering_from_category", "RKF-GUESS-ORDERING-FROM-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_guess_ordering_categories_from_category", "RKF-GUESS-ORDERING-CATEGORIES-FROM-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_knowledge_sorter", "rkf_get_ordering_categories_from_classifier", "RKF-GET-ORDERING-CATEGORIES-FROM-CLASSIFIER", 2, 0, false);
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    public static SubLObject init_rkf_knowledge_sorter_file() {
        rkf_knowledge_sorter.$rkf_classification_other$ = SubLFiles.deflexical("*RKF-CLASSIFICATION-OTHER*", rkf_knowledge_sorter.$const0$UIANonClassifiedAssertion);
        rkf_knowledge_sorter.$rkf_classification_other_singleton$ = SubLFiles.deflexical("*RKF-CLASSIFICATION-OTHER-SINGLETON*", (SubLObject)ConsesLow.list(rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue()));
        rkf_knowledge_sorter.$rkf_sentence_classification_backchains$ = SubLFiles.deflexical("*RKF-SENTENCE-CLASSIFICATION-BACKCHAINS*", (SubLObject)rkf_knowledge_sorter.TWO_INTEGER);
        return (SubLObject)rkf_knowledge_sorter.NIL;
    }
    
    public static SubLObject setup_rkf_knowledge_sorter_file() {
        memoization_state.note_memoized_function((SubLObject)rkf_knowledge_sorter.$sym1$RKF_CLASSIFYING_ASK);
        memoization_state.note_memoized_function((SubLObject)rkf_knowledge_sorter.$sym5$RKF_CLASSIFYING_SENTENCE_ASK);
        return (SubLObject)rkf_knowledge_sorter.NIL;
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
        me = (SubLFile)new rkf_knowledge_sorter();
        rkf_knowledge_sorter.$rkf_classification_other$ = null;
        rkf_knowledge_sorter.$rkf_classification_other_singleton$ = null;
        rkf_knowledge_sorter.$rkf_sentence_classification_backchains$ = null;
        $const0$UIANonClassifiedAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UIANonClassifiedAssertion"));
        $sym1$RKF_CLASSIFYING_ASK = SubLObjectFactory.makeSymbol("RKF-CLASSIFYING-ASK");
        $kw2$CLASSIFICATION = SubLObjectFactory.makeKeyword("CLASSIFICATION");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASSIFICATION"));
        $kw4$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym5$RKF_CLASSIFYING_SENTENCE_ASK = SubLObjectFactory.makeSymbol("RKF-CLASSIFYING-SENTENCE-ASK");
        $kw6$WHAT = SubLObjectFactory.makeKeyword("WHAT");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHAT"));
        $sym8$RKF_CLASSIFY_FORT = SubLObjectFactory.makeSymbol("RKF-CLASSIFY-FORT");
        $sym9$RKF_CLASSIFY_SENTENCE = SubLObjectFactory.makeSymbol("RKF-CLASSIFY-SENTENCE");
        $sym10$RKF_CLASSIFY_ASSERTION = SubLObjectFactory.makeSymbol("RKF-CLASSIFY-ASSERTION");
        $sym11$RKF_CLASSIFY_SENTENCE_PRECISE = SubLObjectFactory.makeSymbol("RKF-CLASSIFY-SENTENCE-PRECISE");
        $sym12$RKF_CLASSIFY_ASSERTION_PRECISE = SubLObjectFactory.makeSymbol("RKF-CLASSIFY-ASSERTION-PRECISE");
        $kw13$CLASSIFIER = SubLObjectFactory.makeKeyword("CLASSIFIER");
        $const14$uiaClassifyAssertionsAlong = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uiaClassifyAssertionsAlong"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASSIFIER"));
        $kw16$TERM = SubLObjectFactory.makeKeyword("TERM");
        $const17$nthInOrdering = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthInOrdering"));
        $kw18$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"));
        $kw20$THE_SET = SubLObjectFactory.makeKeyword("THE-SET");
        $const21$baseSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseSet"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THE-SET"));
        $kw23$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $const24$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $const25$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"));
        $const27$OrderingsOfTypeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrderingsOfTypeFn"));
        $sym28$_ORDERING = SubLObjectFactory.makeSymbol("?ORDERING");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NUMBER"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
    }
}

/*

	Total time: 72 ms
	
*/