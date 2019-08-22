/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-HALO
 *  source file: /cyc/top/cycl/removal-modules-halo.lisp
 *  created:     2019/07/03 17:37:47
 */
public final class removal_modules_halo extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_halo() {
    }

    public static final SubLFile me = new removal_modules_halo();


    // // Definitions
    // defvar
    private static final SubLSymbol $good_choice_among_sentences_backchains$ = makeSymbol("*GOOD-CHOICE-AMONG-SENTENCES-BACKCHAINS*");

    public static final SubLObject set_good_choice_among_sentences_backchains(SubLObject num) {
        SubLTrampolineFile.checkType(num, NON_NEGATIVE_INTEGER_P);
        $good_choice_among_sentences_backchains$.setDynamicValue(num);
        return num;
    }

    /**
     *
     *
     * @return listp			; a list of the good choices among SENTENCES
     */
    public static final SubLObject good_choices_among_sentences_choose(SubLObject sentences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject good_choice_numbers = NIL;
                SubLObject list_var = NIL;
                SubLObject sentence = NIL;
                SubLObject index = NIL;
                for (list_var = el_utilities.el_list_items(sentences), sentence = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (NIL != inference_good_choice_among_recursive_ask(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $good_choice_among_sentences_backchains$.getDynamicValue(thread))) {
                        {
                            SubLObject good_choice_number = number_utilities.f_1X(index);
                            good_choice_numbers = cons(good_choice_number, good_choice_numbers);
                        }
                    }
                }
                return nreverse(good_choice_numbers);
            }
        }
    }

    public static final SubLObject bad_choices_among_sentences_choose(SubLObject sentences) {
        return set_difference(list_utilities.num_list(quantities.cyc_list_length(sentences), ONE_INTEGER), good_choices_among_sentences_choose(sentences), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_good_choice_among_recursive_ask_internal(SubLObject sentence, SubLObject mt, SubLObject backchain) {
        return ask_utilities.inference_recursive_ask(sentence, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_good_choice_among_recursive_ask(SubLObject sentence, SubLObject mt, SubLObject backchain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return inference_good_choice_among_recursive_ask_internal(sentence, mt, backchain);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_GOOD_CHOICE_AMONG_RECURSIVE_ASK, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_GOOD_CHOICE_AMONG_RECURSIVE_ASK, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_GOOD_CHOICE_AMONG_RECURSIVE_ASK, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, backchain);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (sentence.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && backchain.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_good_choice_among_recursive_ask_internal(sentence, mt, backchain)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt, backchain));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject inference_good_choice_among_sentence_supports(SubLObject support_sentence, SubLObject support_mt) {
        {
            SubLObject supports = compute_good_choice_among_sentence_supports(support_sentence, support_mt);
            return values(supports.first(), supports.rest());
        }
    }

    /**
     *
     *
     * @return hl-justification-p
     */
    public static final SubLObject inference_good_choice_among_justifications(SubLObject sentence, SubLObject mt, SubLObject backchain) {
        {
            SubLObject supports = NIL;
            SubLObject bindings_and_justifications = inference_good_choice_among_recursive_ask(sentence, mt, backchain);
            SubLObject cdolist_list_var = bindings_and_justifications;
            SubLObject bindings_and_justification = NIL;
            for (bindings_and_justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_and_justification = cdolist_list_var.first()) {
                {
                    SubLObject justification = second(bindings_and_justification);
                    supports = append(supports, justification);
                }
            }
            return supports;
        }
    }

    public static final SubLObject compute_good_choice_among_sentence_supports(SubLObject support_sentence, SubLObject support_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject good_choice_among_sentences = el_utilities.unmake_binary_formula(support_sentence);
                SubLObject choice = thread.secondMultipleValue();
                SubLObject sentences = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if ($$goodChoiceAmongSentences != good_choice_among_sentences) {
                        Errors.error($str_alt12$unexpected___goodChoiceAmongSente, support_sentence);
                    }
                }
                {
                    SubLObject good_sentence = nth(choice, sentences);
                    return inference_good_choice_among_justifications(good_sentence, support_mt, ONE_INTEGER);
                }
            }
        }
    }

    public static final SubLObject inference_bad_choice_among_sentence_supports(SubLObject support_sentence, SubLObject support_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(support_sentence, EL_NEGATION_P);
            {
                SubLObject pos_sentence = cycl_utilities.sentence_arg1(support_sentence, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject good_choice_among_sentences = el_utilities.unmake_binary_formula(pos_sentence);
                    SubLObject choice = thread.secondMultipleValue();
                    SubLObject sentences = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if ($$goodChoiceAmongSentences != good_choice_among_sentences) {
                            Errors.error($str_alt12$unexpected___goodChoiceAmongSente, support_sentence);
                        }
                    }
                    {
                        SubLObject bad_sentence = nth(choice, sentences);
                        return removal_modules_true_sentence.make_unknown_sentence_support(bad_sentence);
                    }
                }
            }
        }
    }

    public static final SubLObject declare_removal_modules_halo_file() {
        declareFunction("set_good_choice_among_sentences_backchains", "SET-GOOD-CHOICE-AMONG-SENTENCES-BACKCHAINS", 1, 0, false);
        declareFunction("good_choices_among_sentences_choose", "GOOD-CHOICES-AMONG-SENTENCES-CHOOSE", 1, 0, false);
        declareFunction("bad_choices_among_sentences_choose", "BAD-CHOICES-AMONG-SENTENCES-CHOOSE", 1, 0, false);
        declareFunction("inference_good_choice_among_recursive_ask_internal", "INFERENCE-GOOD-CHOICE-AMONG-RECURSIVE-ASK-INTERNAL", 3, 0, false);
        declareFunction("inference_good_choice_among_recursive_ask", "INFERENCE-GOOD-CHOICE-AMONG-RECURSIVE-ASK", 3, 0, false);
        declareFunction("inference_good_choice_among_sentence_supports", "INFERENCE-GOOD-CHOICE-AMONG-SENTENCE-SUPPORTS", 2, 0, false);
        declareFunction("inference_good_choice_among_justifications", "INFERENCE-GOOD-CHOICE-AMONG-JUSTIFICATIONS", 3, 0, false);
        declareFunction("compute_good_choice_among_sentence_supports", "COMPUTE-GOOD-CHOICE-AMONG-SENTENCE-SUPPORTS", 2, 0, false);
        declareFunction("inference_bad_choice_among_sentence_supports", "INFERENCE-BAD-CHOICE-AMONG-SENTENCE-SUPPORTS", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_halo_file() {
        defvar("*GOOD-CHOICE-AMONG-SENTENCES-BACKCHAINS*", ONE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_halo_file() {
                inference_modules.inference_removal_module($GOOD_CHOICE_AMONG_SENTENCES_CHOOSE_POS, $list_alt1);
        inference_modules.inference_removal_module($GOOD_CHOICE_AMONG_SENTENCES_CHECK_POS, $list_alt3);
        inference_modules.inference_removal_module($GOOD_CHOICE_AMONG_SENTENCES_CHOOSE_NEG, $list_alt5);
        inference_modules.inference_removal_module($GOOD_CHOICE_AMONG_SENTENCES_CHECK_NEG, $list_alt7);
        memoization_state.note_memoized_function(INFERENCE_GOOD_CHOICE_AMONG_RECURSIVE_ASK);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $GOOD_CHOICE_AMONG_SENTENCES_CHOOSE_POS = makeKeyword("GOOD-CHOICE-AMONG-SENTENCES-CHOOSE-POS");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("VARIABLE"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SENTENCES"))), list(makeKeyword("VALUE"), makeSymbol("SENTENCES"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GOOD-CHOICES-AMONG-SENTENCES-CHOOSE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SENTENCES"))), makeKeyword("SUPPORT"), makeSymbol("INFERENCE-GOOD-CHOICE-AMONG-SENTENCE-SUPPORTS"), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$goodChoiceAmongSentences <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$goodChoiceAmongSentences ?CHOICE\n      (#$TheList\n        (#$isa #$Muffet #$Planet)\n        (#$isa #$Muffet #$Cat)\n        (#$isa #$Muffet #$Dog)\n        (#$isa #$Muffet #$Poodle)))") });

    private static final SubLSymbol $GOOD_CHOICE_AMONG_SENTENCES_CHECK_POS = makeKeyword("GOOD-CHOICE-AMONG-SENTENCES-CHECK-POS");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("INTEGER"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), list($BIND, makeSymbol("CHOICE-NUM")), list($BIND, makeSymbol("SENTENCES"))), list(list(makeKeyword("VALUE"), makeSymbol("CHOICE-NUM")), list(makeKeyword("VALUE"), makeSymbol("SENTENCES")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CHOICE-NUM"), makeSymbol("SENTENCES")), list($CALL, makeSymbol("MEMBER?"), list(makeKeyword("VALUE"), makeSymbol("CHOICE-NUM")), list($CALL, makeSymbol("GOOD-CHOICES-AMONG-SENTENCES-CHOOSE"), list(makeKeyword("VALUE"), makeSymbol("SENTENCES"))))), makeKeyword("SUPPORT"), makeSymbol("INFERENCE-GOOD-CHOICE-AMONG-SENTENCE-SUPPORTS"), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$goodChoiceAmongSentences <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$goodChoiceAmongSentences 4\n      (#$TheList\n        (#$isa #$Muffet #$Planet)\n        (#$isa #$Muffet #$Cat)\n        (#$isa #$Muffet #$Dog)\n        (#$isa #$Muffet #$Poodle)))") });

    private static final SubLSymbol $GOOD_CHOICE_AMONG_SENTENCES_CHOOSE_NEG = makeKeyword("GOOD-CHOICE-AMONG-SENTENCES-CHOOSE-NEG");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("VARIABLE"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SENTENCES"))), list(makeKeyword("VALUE"), makeSymbol("SENTENCES"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("BAD-CHOICES-AMONG-SENTENCES-CHOOSE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SENTENCES"))), makeKeyword("SUPPORT"), makeSymbol("INFERENCE-BAD-CHOICE-AMONG-SENTENCE-SUPPORTS"), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$goodChoiceAmongSentences <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$goodChoiceAmongSentences ?CHOICE\n        (#$TheList\n          (#$isa #$Muffet #$Planet)\n          (#$isa #$Muffet #$Cat)\n          (#$isa #$Muffet #$Dog)\n          (#$isa #$Muffet #$Poodle))))") });

    private static final SubLSymbol $GOOD_CHOICE_AMONG_SENTENCES_CHECK_NEG = makeKeyword("GOOD-CHOICE-AMONG-SENTENCES-CHECK-NEG");

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), makeKeyword("INTEGER"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences")), list($BIND, makeSymbol("CHOICE-NUM")), list($BIND, makeSymbol("SENTENCES"))), list(list(makeKeyword("VALUE"), makeSymbol("CHOICE-NUM")), list(makeKeyword("VALUE"), makeSymbol("SENTENCES")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CHOICE-NUM"), makeSymbol("SENTENCES")), list($CALL, makeSymbol("MEMBER?"), list(makeKeyword("VALUE"), makeSymbol("CHOICE-NUM")), list($CALL, makeSymbol("BAD-CHOICES-AMONG-SENTENCES-CHOOSE"), list(makeKeyword("VALUE"), makeSymbol("SENTENCES"))))), makeKeyword("SUPPORT"), makeSymbol("INFERENCE-BAD-CHOICE-AMONG-SENTENCE-SUPPORTS"), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$goodChoiceAmongSentences <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$goodChoiceAmongSentences 4\n      (#$TheList\n        (#$isa #$Muffet #$Planet)\n        (#$isa #$Muffet #$Cat)\n        (#$isa #$Muffet #$Dog)\n        (#$isa #$Muffet #$Poodle)))") });



    private static final SubLSymbol INFERENCE_GOOD_CHOICE_AMONG_RECURSIVE_ASK = makeSymbol("INFERENCE-GOOD-CHOICE-AMONG-RECURSIVE-ASK");

    public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $$goodChoiceAmongSentences = constant_handles.reader_make_constant_shell(makeString("goodChoiceAmongSentences"));

    static private final SubLString $str_alt12$unexpected___goodChoiceAmongSente = makeString("unexpected #$goodChoiceAmongSentences support sentence ~a");

    private static final SubLSymbol EL_NEGATION_P = makeSymbol("EL-NEGATION-P");

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_halo_file();
    }

    public void initializeVariables() {
        init_removal_modules_halo_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_halo_file();
    }
}

