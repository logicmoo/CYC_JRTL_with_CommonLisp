/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXICON-AFTER-ADDINGS
 * source file: /cyc/top/cycl/lexicon-after-addings.lisp
 * created:     2019/07/03 17:38:15
 */
public final class lexicon_after_addings extends SubLTranslatedFile implements V12 {
    public static final SubLObject remove_term_string(SubLObject argument, SubLObject assertion) {
        com.cyc.cycjava.cycl.lexicon_after_addings.remove_proper_name_predicate(argument, assertion);
        return NIL;
    }

    public static final SubLObject remove_proper_name_predicate(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            {
                SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
                lexicon_utilities.clear_lexical_info_caches(v_term);
            }
            {
                SubLObject formula = assertions_high.assertion_formula(assertion);
                SubLObject v_core = (NIL != el_negation_p(formula)) ? ((SubLObject) (cycl_utilities.formula_arg1(formula, UNPROVIDED))) : formula;
                SubLObject string = cycl_utilities.formula_arg2(v_core, UNPROVIDED);
                if ((NIL != lexicon_initialized_p()) && string.isString()) {
                    pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject remove_pn_abbreviation(SubLObject argument, SubLObject assertion) {
        {
            SubLObject formula = assertions_high.assertion_formula(assertion);
            SubLObject v_core = (NIL != el_negation_p(formula)) ? ((SubLObject) (cycl_utilities.formula_arg1(formula, UNPROVIDED))) : formula;
            SubLObject string = cycl_utilities.formula_arg2(v_core, UNPROVIDED);
            if ((NIL != lexicon_initialized_p()) && string.isString()) {
                pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_lexicon_assertion(SubLObject argument, SubLObject assertion) {
        if (NIL != kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            return NIL;
        }
        {
            SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            return lexicon_utilities.clear_lexical_info_caches(v_term);
        }
    }

    public static final SubLObject remove_acronym(SubLObject argument, SubLObject assertion) {
        {
            SubLObject formula = assertions_high.assertion_formula(assertion);
            SubLObject v_core = (NIL != el_negation_p(formula)) ? ((SubLObject) (cycl_utilities.formula_arg1(formula, UNPROVIDED))) : formula;
            SubLObject string = cycl_utilities.formula_arg2(v_core, UNPROVIDED);
            if ((NIL != lexicon_initialized_p()) && string.isString()) {
                pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject add_term_string(SubLObject argument, SubLObject assertion) {
        com.cyc.cycjava.cycl.lexicon_after_addings.add_proper_name_predicate(argument, assertion);
        return NIL;
    }

    /**
     * Called when adding assertions using most #$StringIndexingSlots
     */
    @LispMethod(comment = "Called when adding assertions using most #$StringIndexingSlots")
    public static final SubLObject add_proper_name_predicate(SubLObject argument, SubLObject assertion) {
        {
            SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            lexicon_utilities.clear_lexical_info_caches(v_term);
        }
        {
            SubLObject formula = assertions_high.assertion_formula(assertion);
            if (NIL != el_negation_p(formula)) {
                com.cyc.cycjava.cycl.lexicon_after_addings.remove_proper_name_predicate(argument, assertion);
            } else {
                {
                    SubLObject string = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                    if ((NIL != lexicon_initialized_p()) && string.isString()) {
                        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Used only for #$abbreviationString-PN,
     * because that's the only abbreviation predicate mapping a fort to a string.
     */
    @LispMethod(comment = "Used only for #$abbreviationString-PN,\r\nbecause that\'s the only abbreviation predicate mapping a fort to a string.\nUsed only for #$abbreviationString-PN,\nbecause that\'s the only abbreviation predicate mapping a fort to a string.")
    public static final SubLObject add_pn_abbreviation(SubLObject argument, SubLObject assertion) {
        {
            SubLObject formula = assertions_high.assertion_formula(assertion);
            if (NIL != el_negation_p(formula)) {
                com.cyc.cycjava.cycl.lexicon_after_addings.remove_pn_abbreviation(argument, assertion);
            } else {
                {
                    SubLObject string = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                    if ((NIL != lexicon_initialized_p()) && string.isString()) {
                        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject add_cached_lexicon_assertion(SubLObject argument, SubLObject assertion) {
        {
            SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            return lexicon_utilities.clear_lexical_info_caches(v_term);
        }
    }

    /**
     * Called when adding assertions using #$acronymString
     */
    @LispMethod(comment = "Called when adding assertions using #$acronymString")
    public static final SubLObject add_acronym(SubLObject argument, SubLObject assertion) {
        {
            SubLObject formula = assertions_high.assertion_formula(assertion);
            if (NIL != el_negation_p(formula)) {
                com.cyc.cycjava.cycl.lexicon_after_addings.remove_acronym(argument, assertion);
            } else {
                {
                    SubLObject string = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                    if ((NIL != lexicon_initialized_p()) && string.isString()) {
                        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLFile me = new lexicon_after_addings();

 public static final String myName = "com.cyc.cycjava.cycl.lexicon_after_addings";


    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list1 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);



    private static final SubLString $str5$_A = makeString("~A");



    private static final SubLSymbol $sym7$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol ADD_LEXICON_PREDICATE = makeSymbol("ADD-LEXICON-PREDICATE");

    private static final SubLSymbol REMOVE_LEXICON_PREDICATE = makeSymbol("REMOVE-LEXICON-PREDICATE");

    private static final SubLSymbol ADD_SEMANTIC_ASSERTION = makeSymbol("ADD-SEMANTIC-ASSERTION");

    private static final SubLSymbol REMOVE_SEMANTIC_ASSERTION = makeSymbol("REMOVE-SEMANTIC-ASSERTION");

    private static final SubLSymbol ADD_INDEX_SUB_WORDS_FOR_ARG = makeSymbol("ADD-INDEX-SUB-WORDS-FOR-ARG");

    private static final SubLSymbol REMOVE_INDEX_SUB_WORDS_FOR_ARG = makeSymbol("REMOVE-INDEX-SUB-WORDS-FOR-ARG");

    private static final SubLSymbol ADD_SUB_WORD_INDEXED_ASSERTION = makeSymbol("ADD-SUB-WORD-INDEXED-ASSERTION");

    private static final SubLSymbol REMOVE_SUB_WORD_INDEXED_ASSERTION = makeSymbol("REMOVE-SUB-WORD-INDEXED-ASSERTION");

    private static final SubLSymbol ADD_GENERATION_ASSERTION = makeSymbol("ADD-GENERATION-ASSERTION");

    private static final SubLSymbol REMOVE_GENERATION_ASSERTION = makeSymbol("REMOVE-GENERATION-ASSERTION");

    private static final SubLSymbol ADD_PRAGMATIC_ASSERTION = makeSymbol("ADD-PRAGMATIC-ASSERTION");

    private static final SubLSymbol REMOVE_PRAGMATIC_ASSERTION = makeSymbol("REMOVE-PRAGMATIC-ASSERTION");

    private static final SubLSymbol ADD_DETERMINER_AGREEMENT = makeSymbol("ADD-DETERMINER-AGREEMENT");

    private static final SubLSymbol REMOVE_DETERMINER_AGREEMENT = makeSymbol("REMOVE-DETERMINER-AGREEMENT");

    private static final SubLSymbol ADD_SPEECH_PART_PREDS = makeSymbol("ADD-SPEECH-PART-PREDS");

    private static final SubLSymbol REMOVE_SPEECH_PART_PREDS = makeSymbol("REMOVE-SPEECH-PART-PREDS");

    private static final SubLSymbol ADD_REGULAR_SUFFIX = makeSymbol("ADD-REGULAR-SUFFIX");

    private static final SubLSymbol REMOVE_REGULAR_SUFFIX = makeSymbol("REMOVE-REGULAR-SUFFIX");

    private static final SubLSymbol ADD_DERIVATIONAL_AFFIX_BASE_POS = makeSymbol("ADD-DERIVATIONAL-AFFIX-BASE-POS");

    private static final SubLSymbol REMOVE_DERIVATIONAL_AFFIX_BASE_POS = makeSymbol("REMOVE-DERIVATIONAL-AFFIX-BASE-POS");

    private static final SubLSymbol ADD_DERIVATIONAL_AFFIX_RESULT_POS = makeSymbol("ADD-DERIVATIONAL-AFFIX-RESULT-POS");

    private static final SubLSymbol REMOVE_DERIVATIONAL_AFFIX_RESULT_POS = makeSymbol("REMOVE-DERIVATIONAL-AFFIX-RESULT-POS");

    private static final SubLSymbol ADD_AFFIX_SEMANTICS = makeSymbol("ADD-AFFIX-SEMANTICS");

    private static final SubLSymbol REMOVE_AFFIX_SEMANTICS = makeSymbol("REMOVE-AFFIX-SEMANTICS");

    private static final SubLSymbol ADD_AFFIX_STRING = makeSymbol("ADD-AFFIX-STRING");

    private static final SubLSymbol REMOVE_AFFIX_STRING = makeSymbol("REMOVE-AFFIX-STRING");

    private static final SubLSymbol ADD_BASIC_SPEECH_PART_PRED = makeSymbol("ADD-BASIC-SPEECH-PART-PRED");

    private static final SubLSymbol REMOVE_BASIC_SPEECH_PART_PRED = makeSymbol("REMOVE-BASIC-SPEECH-PART-PRED");

    // Definitions
    /**
     * Called when adding any SpeechPartPredicate GAF.
     */
    @LispMethod(comment = "Called when adding any SpeechPartPredicate GAF.")
    public static final SubLObject add_lexicon_predicate_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            if (assertions_high.gaf_arg0(assertion) == $$partOfSpeech) {
                lexicon_accessors.clear_closed_lexical_class_hash();
            }
        }
        np_parser.clear_npp_caches();
        nl_trie.augment_nl_trie_syntactic(assertion, UNPROVIDED);
        lexicon_accessors.clear_preds_of_stringXword();
        {
            SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(assertions_high.gaf_arg0(assertion));
            SubLObject denotations = lexicon_accessors.denots_of_wu(cycl_utilities.formula_arg(assertion, wu_arg, UNPROVIDED), UNPROVIDED);
            SubLObject cdolist_list_var = denotations;
            SubLObject denot = NIL;
            for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                if (NIL != isa.isaP(denot, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                    english_quantity_parser.add_english_units_for_measure(denot);
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Called when adding any SpeechPartPredicate GAF.
     */
    @LispMethod(comment = "Called when adding any SpeechPartPredicate GAF.")
    public static SubLObject add_lexicon_predicate(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject message_var = NIL;
        SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg0(assertion), $$partOfSpeech))) {
                            lexicon_accessors.clear_closed_lexical_class_hash();
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_trie.augment_nl_trie_syntactic(assertion, UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        lexicon_accessors.clear_preds_of_stringXword();
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        np_parser.clear_npp_caches();
                        final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(assertions_high.gaf_arg0(assertion));
                        SubLObject cdolist_list_var;
                        final SubLObject denotations = cdolist_list_var = lexicon_accessors.denots_of_wu(cycl_utilities.formula_arg(assertion, wu_arg, UNPROVIDED), UNPROVIDED);
                        SubLObject denot = NIL;
                        denot = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != isa.isaP(denot, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                                english_quantity_parser.add_english_units_for_measure(denot);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denot = cdolist_list_var.first();
                        } 
                        return NIL;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        return NIL;
    }

    /**
     * Called when removing any SpeechPartPredicate GAF.
     */
    @LispMethod(comment = "Called when removing any SpeechPartPredicate GAF.")
    public static final SubLObject remove_lexicon_predicate_alt(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            np_parser.clear_npp_caches();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                if (assertions_high.gaf_arg0(assertion) == $$partOfSpeech) {
                    lexicon_accessors.clear_closed_lexical_class_hash();
                }
            }
            nl_trie.prune_nl_trie_syntactic(assertion, UNPROVIDED);
            lexicon_accessors.clear_preds_of_stringXword();
            {
                SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(assertions_high.gaf_arg0(assertion));
                SubLObject denotations = lexicon_accessors.denots_of_wu(cycl_utilities.formula_arg(assertion, wu_arg, UNPROVIDED), UNPROVIDED);
                SubLObject cdolist_list_var = denotations;
                SubLObject denot = NIL;
                for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                    if (NIL != isa.isaP(denot, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                        english_quantity_parser.clear_english_units_of_measure(denot);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Called when removing any SpeechPartPredicate GAF.
     */
    @LispMethod(comment = "Called when removing any SpeechPartPredicate GAF.")
    public static SubLObject remove_lexicon_predicate(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            SubLObject message_var = NIL;
            SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg0(assertion), $$partOfSpeech))) {
                                lexicon_accessors.clear_closed_lexical_class_hash();
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            nl_trie.prune_nl_trie_syntactic(assertion, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            lexicon_accessors.clear_preds_of_stringXword();
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            np_parser.clear_npp_caches();
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(assertions_high.gaf_arg0(assertion));
                            SubLObject cdolist_list_var;
                            final SubLObject denotations = cdolist_list_var = lexicon_accessors.denots_of_wu(cycl_utilities.formula_arg(assertion, wu_arg, UNPROVIDED), UNPROVIDED);
                            SubLObject denot = NIL;
                            denot = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (NIL != isa.isaP(denot, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                                    english_quantity_parser.clear_english_units_of_measure(denot);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                denot = cdolist_list_var.first();
                            } 
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
        }
        return NIL;
    }

    /**
     * Called when adding any assertion involved a spec of NLSemanticPredicate
     */
    @LispMethod(comment = "Called when adding any assertion involved a spec of NLSemanticPredicate")
    public static final SubLObject add_semantic_assertion_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            lexicon_vars.clear_verb_frames();
            np_parser.clear_npp_caches();
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            {
                SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
                lexicon_utilities.clear_lexical_info_caches(v_term);
                if (NIL != isa.isaP(v_term, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                    english_quantity_parser.add_english_units_for_measure(v_term);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject ret_value = nl_trie.augment_nl_trie_semantic(assertion, UNPROVIDED);
                SubLObject strings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject cdolist_list_var = strings;
                    SubLObject string = NIL;
                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                        lexicon_subword_index.reset_nl_trie_subword_index_for_string(string);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Called when adding any assertion involved a spec of NLSemanticPredicate
     */
    @LispMethod(comment = "Called when adding any assertion involved a spec of NLSemanticPredicate")
    public static SubLObject add_semantic_assertion(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexicon_vars.clear_verb_frames();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
        SubLObject message_var = NIL;
        SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        lexicon_utilities.clear_lexical_info_caches(v_term);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        np_parser.clear_npp_caches();
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != isa.isaP(v_term, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                            english_quantity_parser.add_english_units_for_measure(v_term);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        final SubLObject _prev_bind_5 = lexicon_vars.$initialize_nl_trie_control_varsP$.currentBinding(thread);
        try {
            lexicon_vars.$initialize_nl_trie_control_varsP$.bind(NIL, thread);
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject ret_value = nl_trie.augment_nl_trie_semantic(assertion, UNPROVIDED);
                            final SubLObject strings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var = strings;
                            SubLObject string = NIL;
                            string = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject message_var_$2 = NIL;
                                final SubLObject was_appendingP_$3 = eval($append_stack_traces_to_error_messagesP$);
                                eval($list1);
                                try {
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                lexicon_subword_index.reset_nl_trie_subword_index_for_string(string, NIL);
                                            } catch (final Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        message_var_$2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP_$3));
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                                if (message_var_$2.isString()) {
                                    Errors.warn($str5$_A, message_var_$2);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                string = cdolist_list_var.first();
                            } 
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
        } finally {
            lexicon_vars.$initialize_nl_trie_control_varsP$.rebind(_prev_bind_5, thread);
        }
        return NIL;
    }

    private static final SubLSymbol ADD_PROPER_NAME_PREDICATE = makeSymbol("ADD-PROPER-NAME-PREDICATE");

    private static final SubLSymbol REMOVE_PROPER_NAME_PREDICATE = makeSymbol("REMOVE-PROPER-NAME-PREDICATE");

    private static final SubLSymbol ADD_CACHED_LEXICON_ASSERTION = makeSymbol("ADD-CACHED-LEXICON-ASSERTION");

    private static final SubLSymbol REMOVE_CACHED_LEXICON_ASSERTION = makeSymbol("REMOVE-CACHED-LEXICON-ASSERTION");

    private static final SubLSymbol ADD_ACRONYM = makeSymbol("ADD-ACRONYM");

    private static final SubLSymbol REMOVE_ACRONYM = makeSymbol("REMOVE-ACRONYM");

    private static final SubLSymbol ADD_PN_ABBREVIATION = makeSymbol("ADD-PN-ABBREVIATION");

    private static final SubLSymbol REMOVE_PN_ABBREVIATION = makeSymbol("REMOVE-PN-ABBREVIATION");

    private static final SubLSymbol ADD_TERM_STRING = makeSymbol("ADD-TERM-STRING");

    private static final SubLSymbol REMOVE_TERM_STRING = makeSymbol("REMOVE-TERM-STRING");

    /**
     * Called when removing any assertion involved a spec of NLSemanticPredicate
     */
    @LispMethod(comment = "Called when removing any assertion involved a spec of NLSemanticPredicate")
    public static final SubLObject remove_semantic_assertion_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
                np_parser.clear_npp_caches();
                pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
                    lexicon_utilities.clear_lexical_info_caches(v_term);
                    if (NIL != isa.isaP(v_term, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                        english_quantity_parser.clear_english_units_of_measure(UNPROVIDED);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject ret_value = nl_trie.prune_nl_trie_semantic(assertion, UNPROVIDED);
                    SubLObject strings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = strings;
                        SubLObject string = NIL;
                        for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                            lexicon_subword_index.reset_nl_trie_subword_index_for_string(string);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Called when removing any assertion involved a spec of NLSemanticPredicate
     */
    @LispMethod(comment = "Called when removing any assertion involved a spec of NLSemanticPredicate")
    public static SubLObject remove_semantic_assertion(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            SubLObject message_var = NIL;
            SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            lexicon_utilities.clear_lexical_info_caches(v_term);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            np_parser.clear_npp_caches();
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (NIL != isa.isaP(v_term, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                                english_quantity_parser.clear_english_units_of_measure(UNPROVIDED);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            SubLObject message_var2 = NIL;
            final SubLObject was_appendingP2 = eval($append_stack_traces_to_error_messagesP$);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_5 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            thread.resetMultipleValues();
                            final SubLObject ret_value = nl_trie.prune_nl_trie_semantic(assertion, UNPROVIDED);
                            final SubLObject strings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var = strings;
                            SubLObject string = NIL;
                            string = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject message_var_$7 = NIL;
                                final SubLObject was_appendingP_$8 = eval($append_stack_traces_to_error_messagesP$);
                                eval($list1);
                                try {
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                lexicon_subword_index.reset_nl_trie_subword_index_for_string(string, T);
                                            } catch (final Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        message_var_$7 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP_$8));
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                if (message_var_$7.isString()) {
                                    Errors.warn($str5$_A, message_var_$7);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                string = cdolist_list_var.first();
                            } 
                        } catch (final Throwable catch_var3) {
                            Errors.handleThrowable(catch_var3, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_5, thread);
                    }
                } catch (final Throwable ccatch_env_var3) {
                    message_var2 = Errors.handleThrowable(ccatch_env_var3, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP2));
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                }
            }
            if (message_var2.isString()) {
                Errors.warn($str5$_A, message_var2);
            }
        }
        return NIL;
    }

    public static SubLObject add_index_sub_words_for_arg(final SubLObject argument, final SubLObject assertion) {
        return NIL;
    }

    public static SubLObject remove_index_sub_words_for_arg(final SubLObject argument, final SubLObject assertion) {
        return NIL;
    }

    public static SubLObject add_sub_word_indexed_assertion(final SubLObject argument, final SubLObject assertion) {
        SubLObject cdolist_list_var = lexicon_subword_index.non_trie_subword_pred_args(assertions_high.gaf_arg0(assertion));
        SubLObject n = NIL;
        n = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = assertions_high.gaf_arg(assertion, n);
            if (NIL != cycl_string.cycl_string_p(string)) {
                lexicon_subword_index.reset_nl_trie_subword_index_for_string(string, NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            n = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject remove_sub_word_indexed_assertion(final SubLObject argument, final SubLObject assertion) {
        SubLObject cdolist_list_var = lexicon_subword_index.non_trie_subword_pred_args(assertions_high.gaf_arg0(assertion));
        SubLObject n = NIL;
        n = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = assertions_high.gaf_arg(assertion, n);
            if (NIL != cycl_string.cycl_string_p(string)) {
                lexicon_subword_index.reset_nl_trie_subword_index_for_string(string, T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            n = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Called when adding any assertion involved a spec of NLGenerationPredicate.
     */
    @LispMethod(comment = "Called when adding any assertion involved a spec of NLGenerationPredicate.")
    public static final SubLObject add_generation_assertion_alt(SubLObject argument, SubLObject assertion) {
        lexicon_vars.clear_verb_frames();
        np_parser.clear_npp_caches();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        {
            SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            lexicon_utilities.clear_lexical_info_caches(v_term);
        }
        return NIL;
    }

    /**
     * Called when adding any assertion involved a spec of NLGenerationPredicate.
     */
    @LispMethod(comment = "Called when adding any assertion involved a spec of NLGenerationPredicate.")
    public static SubLObject add_generation_assertion(final SubLObject argument, final SubLObject assertion) {
        lexicon_vars.clear_verb_frames();
        np_parser.clear_npp_caches();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
        lexicon_utilities.clear_lexical_info_caches(v_term);
        if ((NIL != assertion_utilities.meta_assertion_p(assertion)) && (NIL != fort_types_interface.isa_relationP(v_term, UNPROVIDED))) {
            pph_templates.reinitialize_gen_templates_for_reln(v_term, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Called when removing any assertion involved a spec of NLGenerationPredicate.
     */
    @LispMethod(comment = "Called when removing any assertion involved a spec of NLGenerationPredicate.")
    public static final SubLObject remove_generation_assertion_alt(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            np_parser.clear_npp_caches();
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            {
                SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
                lexicon_utilities.clear_lexical_info_caches(v_term);
            }
        }
        return NIL;
    }

    /**
     * Called when removing any assertion involved a spec of NLGenerationPredicate.
     */
    @LispMethod(comment = "Called when removing any assertion involved a spec of NLGenerationPredicate.")
    public static SubLObject remove_generation_assertion(final SubLObject argument, final SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            np_parser.clear_npp_caches();
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            lexicon_utilities.clear_lexical_info_caches(v_term);
            if ((NIL != assertion_utilities.meta_assertion_p(assertion)) && (NIL != fort_types_interface.isa_relationP(v_term, UNPROVIDED))) {
                pph_templates.reinitialize_gen_templates_for_reln(v_term, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Called when adding any assertion involving a NLPragmaticPredicate-New
     */
    @LispMethod(comment = "Called when adding any assertion involving a NLPragmaticPredicate-New")
    public static final SubLObject add_pragmatic_assertion_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject semantic_assertion = assertions_high.gaf_arg1(assertion);
            nl_trie.retriefy_semantic_assertion(semantic_assertion, UNPROVIDED);
        }
        np_parser.clear_npp_caches();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Called when adding any assertion involving a NLPragmaticPredicate-New
     */
    @LispMethod(comment = "Called when adding any assertion involving a NLPragmaticPredicate-New")
    public static SubLObject add_pragmatic_assertion(final SubLObject argument, final SubLObject assertion) {
        final SubLObject semantic_assertion = assertions_high.gaf_arg1(assertion);
        nl_trie.retriefy_semantic_assertion(semantic_assertion, UNPROVIDED);
        np_parser.clear_npp_caches();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Called when removing any assertion involving a NLPragmaticPredicate-New
     */
    @LispMethod(comment = "Called when removing any assertion involving a NLPragmaticPredicate-New")
    public static final SubLObject remove_pragmatic_assertion_alt(SubLObject argument, SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            {
                SubLObject semantic_assertion = assertions_high.gaf_arg1(assertion);
                nl_trie.retriefy_semantic_assertion(semantic_assertion, UNPROVIDED);
            }
            np_parser.clear_npp_caches();
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Called when removing any assertion involving a NLPragmaticPredicate-New
     */
    @LispMethod(comment = "Called when removing any assertion involving a NLPragmaticPredicate-New")
    public static SubLObject remove_pragmatic_assertion(final SubLObject argument, final SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            final SubLObject semantic_assertion = assertions_high.gaf_arg1(assertion);
            nl_trie.retriefy_semantic_assertion(semantic_assertion, UNPROVIDED);
            np_parser.clear_npp_caches();
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Called when adding #$determinerAgreement
     */
    @LispMethod(comment = "Called when adding #$determinerAgreement")
    public static final SubLObject add_determiner_agreement_alt(SubLObject argument, SubLObject assertion) {
        lexicon_accessors.clear_agr_of_det_string();
        return NIL;
    }

    /**
     * Called when adding #$determinerAgreement
     */
    @LispMethod(comment = "Called when adding #$determinerAgreement")
    public static SubLObject add_determiner_agreement(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_agr_of_det_string();
        return NIL;
    }

    /**
     * Called when removing #$determinerAgreement
     */
    @LispMethod(comment = "Called when removing #$determinerAgreement")
    public static final SubLObject remove_determiner_agreement_alt(SubLObject argument, SubLObject assertion) {
        lexicon_accessors.clear_agr_of_det_string();
        return NIL;
    }

    /**
     * Called when removing #$determinerAgreement
     */
    @LispMethod(comment = "Called when removing #$determinerAgreement")
    public static SubLObject remove_determiner_agreement(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_agr_of_det_string();
        return NIL;
    }

    /**
     * Called when adding #$speechPartPreds
     */
    @LispMethod(comment = "Called when adding #$speechPartPreds")
    public static final SubLObject add_speech_part_preds_alt(SubLObject argument, SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        lexicon_accessors.initialize_speech_part_caches();
        nl_trie.clear_nl_trie_closed_class_pos_preds();
        lexicon_utilities.clear_preds_of_pos();
        return NIL;
    }

    /**
     * Called when adding #$speechPartPreds
     */
    @LispMethod(comment = "Called when adding #$speechPartPreds")
    public static SubLObject add_speech_part_preds(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        lexicon_accessors.initialize_speech_part_caches();
        nl_trie.clear_nl_trie_closed_class_pos_preds();
        lexicon_utilities.clear_preds_of_pos();
        return NIL;
    }

    /**
     * Called when removing #$speechPartPreds
     */
    @LispMethod(comment = "Called when removing #$speechPartPreds")
    public static final SubLObject remove_speech_part_preds_alt(SubLObject argument, SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        lexicon_accessors.initialize_speech_part_caches();
        nl_trie.clear_nl_trie_closed_class_pos_preds();
        lexicon_utilities.clear_preds_of_pos();
        return NIL;
    }

    /**
     * Called when removing #$speechPartPreds
     */
    @LispMethod(comment = "Called when removing #$speechPartPreds")
    public static SubLObject remove_speech_part_preds(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        lexicon_accessors.initialize_speech_part_caches();
        nl_trie.clear_nl_trie_closed_class_pos_preds();
        lexicon_utilities.clear_preds_of_pos();
        return NIL;
    }

    /**
     * Called when adding #$regularSuffix
     */
    @LispMethod(comment = "Called when adding #$regularSuffix")
    public static final SubLObject add_regular_suffix_alt(SubLObject argument, SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        return NIL;
    }

    /**
     * Called when adding #$regularSuffix
     */
    @LispMethod(comment = "Called when adding #$regularSuffix")
    public static SubLObject add_regular_suffix(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        return NIL;
    }

    /**
     * Called when removing #$regularSuffix
     */
    @LispMethod(comment = "Called when removing #$regularSuffix")
    public static final SubLObject remove_regular_suffix_alt(SubLObject argument, SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        return NIL;
    }

    /**
     * Called when removing #$regularSuffix
     */
    @LispMethod(comment = "Called when removing #$regularSuffix")
    public static SubLObject remove_regular_suffix(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        return NIL;
    }

    /**
     * Called when adding #$derivationalAffixBasePOS
     */
    @LispMethod(comment = "Called when adding #$derivationalAffixBasePOS")
    public static final SubLObject add_derivational_affix_base_pos_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_base_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when adding #$derivationalAffixBasePOS
     */
    @LispMethod(comment = "Called when adding #$derivationalAffixBasePOS")
    public static SubLObject add_derivational_affix_base_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_base_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when removing #$derivationalAffixBasePOS
     */
    @LispMethod(comment = "Called when removing #$derivationalAffixBasePOS")
    public static final SubLObject remove_derivational_affix_base_pos_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_base_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when removing #$derivationalAffixBasePOS
     */
    @LispMethod(comment = "Called when removing #$derivationalAffixBasePOS")
    public static SubLObject remove_derivational_affix_base_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_base_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when adding #$derivationalAffixResultPOS
     */
    @LispMethod(comment = "Called when adding #$derivationalAffixResultPOS")
    public static final SubLObject add_derivational_affix_result_pos_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_result_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when adding #$derivationalAffixResultPOS
     */
    @LispMethod(comment = "Called when adding #$derivationalAffixResultPOS")
    public static SubLObject add_derivational_affix_result_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_result_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when removing #$derivationalAffixResultPOS
     */
    @LispMethod(comment = "Called when removing #$derivationalAffixResultPOS")
    public static final SubLObject remove_derivational_affix_result_pos_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_result_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when removing #$derivationalAffixResultPOS
     */
    @LispMethod(comment = "Called when removing #$derivationalAffixResultPOS")
    public static SubLObject remove_derivational_affix_result_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_result_poses_for_reified_affix();
        return NIL;
    }

    /**
     * Called when adding #$affixSemantics
     */
    @LispMethod(comment = "Called when adding #$affixSemantics")
    public static final SubLObject add_affix_semantics_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_sem_templates_for_reified_affix();
        return NIL;
    }

    /**
     * Called when adding #$affixSemantics
     */
    @LispMethod(comment = "Called when adding #$affixSemantics")
    public static SubLObject add_affix_semantics(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_sem_templates_for_reified_affix();
        return NIL;
    }

    /**
     * Called when removing #$affixSemantics
     */
    @LispMethod(comment = "Called when removing #$affixSemantics")
    public static final SubLObject remove_affix_semantics_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_sem_templates_for_reified_affix();
        return NIL;
    }

    /**
     * Called when removing #$affixSemantics
     */
    @LispMethod(comment = "Called when removing #$affixSemantics")
    public static SubLObject remove_affix_semantics(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_sem_templates_for_reified_affix();
        return NIL;
    }

    /**
     * Called when adding #$affixString
     */
    @LispMethod(comment = "Called when adding #$affixString")
    public static final SubLObject add_affix_string_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        return NIL;
    }

    /**
     * Called when adding #$affixString
     */
    @LispMethod(comment = "Called when adding #$affixString")
    public static SubLObject add_affix_string(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        return NIL;
    }

    /**
     * Called when removing #$affixString
     */
    @LispMethod(comment = "Called when removing #$affixString")
    public static final SubLObject remove_affix_string_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        return NIL;
    }

    /**
     * Called when removing #$affixString
     */
    @LispMethod(comment = "Called when removing #$affixString")
    public static SubLObject remove_affix_string(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        return NIL;
    }

    /**
     * Called when adding #$baseSpeechPartPred
     */
    @LispMethod(comment = "Called when adding #$baseSpeechPartPred")
    public static final SubLObject add_basic_speech_part_pred_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        morph_word.clear_mwp_base_pred_of_pos();
        return NIL;
    }

    /**
     * Called when adding #$baseSpeechPartPred
     */
    @LispMethod(comment = "Called when adding #$baseSpeechPartPred")
    public static SubLObject add_basic_speech_part_pred(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        morph_word.clear_mwp_base_pred_of_pos();
        return NIL;
    }

    /**
     * Called when removing #$baseSpeechPartPred
     */
    @LispMethod(comment = "Called when removing #$baseSpeechPartPred")
    public static final SubLObject remove_basic_speech_part_pred_alt(SubLObject argument, SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        morph_word.clear_mwp_base_pred_of_pos();
        return NIL;
    }

    /**
     * Called when removing #$baseSpeechPartPred
     */
    @LispMethod(comment = "Called when removing #$baseSpeechPartPred")
    public static SubLObject remove_basic_speech_part_pred(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        morph_word.clear_mwp_base_pred_of_pos();
        return NIL;
    }

    public static final SubLObject declare_lexicon_after_addings_file_alt() {
        declareFunction("add_lexicon_predicate", "ADD-LEXICON-PREDICATE", 2, 0, false);
        declareFunction("remove_lexicon_predicate", "REMOVE-LEXICON-PREDICATE", 2, 0, false);
        declareFunction("add_semantic_assertion", "ADD-SEMANTIC-ASSERTION", 2, 0, false);
        declareFunction("remove_semantic_assertion", "REMOVE-SEMANTIC-ASSERTION", 2, 0, false);
        declareFunction("add_generation_assertion", "ADD-GENERATION-ASSERTION", 2, 0, false);
        declareFunction("remove_generation_assertion", "REMOVE-GENERATION-ASSERTION", 2, 0, false);
        declareFunction("add_pragmatic_assertion", "ADD-PRAGMATIC-ASSERTION", 2, 0, false);
        declareFunction("remove_pragmatic_assertion", "REMOVE-PRAGMATIC-ASSERTION", 2, 0, false);
        declareFunction("add_proper_name_predicate", "ADD-PROPER-NAME-PREDICATE", 2, 0, false);
        declareFunction("remove_proper_name_predicate", "REMOVE-PROPER-NAME-PREDICATE", 2, 0, false);
        declareFunction("add_cached_lexicon_assertion", "ADD-CACHED-LEXICON-ASSERTION", 2, 0, false);
        declareFunction("remove_cached_lexicon_assertion", "REMOVE-CACHED-LEXICON-ASSERTION", 2, 0, false);
        declareFunction("add_acronym", "ADD-ACRONYM", 2, 0, false);
        declareFunction("remove_acronym", "REMOVE-ACRONYM", 2, 0, false);
        declareFunction("add_pn_abbreviation", "ADD-PN-ABBREVIATION", 2, 0, false);
        declareFunction("remove_pn_abbreviation", "REMOVE-PN-ABBREVIATION", 2, 0, false);
        declareFunction("add_term_string", "ADD-TERM-STRING", 2, 0, false);
        declareFunction("remove_term_string", "REMOVE-TERM-STRING", 2, 0, false);
        declareFunction("add_determiner_agreement", "ADD-DETERMINER-AGREEMENT", 2, 0, false);
        declareFunction("remove_determiner_agreement", "REMOVE-DETERMINER-AGREEMENT", 2, 0, false);
        declareFunction("add_speech_part_preds", "ADD-SPEECH-PART-PREDS", 2, 0, false);
        declareFunction("remove_speech_part_preds", "REMOVE-SPEECH-PART-PREDS", 2, 0, false);
        declareFunction("add_regular_suffix", "ADD-REGULAR-SUFFIX", 2, 0, false);
        declareFunction("remove_regular_suffix", "REMOVE-REGULAR-SUFFIX", 2, 0, false);
        declareFunction("add_derivational_affix_base_pos", "ADD-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        declareFunction("remove_derivational_affix_base_pos", "REMOVE-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        declareFunction("add_derivational_affix_result_pos", "ADD-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        declareFunction("remove_derivational_affix_result_pos", "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        declareFunction("add_affix_semantics", "ADD-AFFIX-SEMANTICS", 2, 0, false);
        declareFunction("remove_affix_semantics", "REMOVE-AFFIX-SEMANTICS", 2, 0, false);
        declareFunction("add_affix_string", "ADD-AFFIX-STRING", 2, 0, false);
        declareFunction("remove_affix_string", "REMOVE-AFFIX-STRING", 2, 0, false);
        declareFunction("add_basic_speech_part_pred", "ADD-BASIC-SPEECH-PART-PRED", 2, 0, false);
        declareFunction("remove_basic_speech_part_pred", "REMOVE-BASIC-SPEECH-PART-PRED", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_lexicon_after_addings_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("add_lexicon_predicate", "ADD-LEXICON-PREDICATE", 2, 0, false);
            declareFunction("remove_lexicon_predicate", "REMOVE-LEXICON-PREDICATE", 2, 0, false);
            declareFunction("add_semantic_assertion", "ADD-SEMANTIC-ASSERTION", 2, 0, false);
            declareFunction("remove_semantic_assertion", "REMOVE-SEMANTIC-ASSERTION", 2, 0, false);
            declareFunction("add_index_sub_words_for_arg", "ADD-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
            declareFunction("remove_index_sub_words_for_arg", "REMOVE-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
            declareFunction("add_sub_word_indexed_assertion", "ADD-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
            declareFunction("remove_sub_word_indexed_assertion", "REMOVE-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
            declareFunction("add_generation_assertion", "ADD-GENERATION-ASSERTION", 2, 0, false);
            declareFunction("remove_generation_assertion", "REMOVE-GENERATION-ASSERTION", 2, 0, false);
            declareFunction("add_pragmatic_assertion", "ADD-PRAGMATIC-ASSERTION", 2, 0, false);
            declareFunction("remove_pragmatic_assertion", "REMOVE-PRAGMATIC-ASSERTION", 2, 0, false);
            declareFunction("add_determiner_agreement", "ADD-DETERMINER-AGREEMENT", 2, 0, false);
            declareFunction("remove_determiner_agreement", "REMOVE-DETERMINER-AGREEMENT", 2, 0, false);
            declareFunction("add_speech_part_preds", "ADD-SPEECH-PART-PREDS", 2, 0, false);
            declareFunction("remove_speech_part_preds", "REMOVE-SPEECH-PART-PREDS", 2, 0, false);
            declareFunction("add_regular_suffix", "ADD-REGULAR-SUFFIX", 2, 0, false);
            declareFunction("remove_regular_suffix", "REMOVE-REGULAR-SUFFIX", 2, 0, false);
            declareFunction("add_derivational_affix_base_pos", "ADD-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
            declareFunction("remove_derivational_affix_base_pos", "REMOVE-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
            declareFunction("add_derivational_affix_result_pos", "ADD-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
            declareFunction("remove_derivational_affix_result_pos", "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
            declareFunction("add_affix_semantics", "ADD-AFFIX-SEMANTICS", 2, 0, false);
            declareFunction("remove_affix_semantics", "REMOVE-AFFIX-SEMANTICS", 2, 0, false);
            declareFunction("add_affix_string", "ADD-AFFIX-STRING", 2, 0, false);
            declareFunction("remove_affix_string", "REMOVE-AFFIX-STRING", 2, 0, false);
            declareFunction("add_basic_speech_part_pred", "ADD-BASIC-SPEECH-PART-PRED", 2, 0, false);
            declareFunction("remove_basic_speech_part_pred", "REMOVE-BASIC-SPEECH-PART-PRED", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("add_proper_name_predicate", "ADD-PROPER-NAME-PREDICATE", 2, 0, false);
            declareFunction("remove_proper_name_predicate", "REMOVE-PROPER-NAME-PREDICATE", 2, 0, false);
            declareFunction("add_cached_lexicon_assertion", "ADD-CACHED-LEXICON-ASSERTION", 2, 0, false);
            declareFunction("remove_cached_lexicon_assertion", "REMOVE-CACHED-LEXICON-ASSERTION", 2, 0, false);
            declareFunction("add_acronym", "ADD-ACRONYM", 2, 0, false);
            declareFunction("remove_acronym", "REMOVE-ACRONYM", 2, 0, false);
            declareFunction("add_pn_abbreviation", "ADD-PN-ABBREVIATION", 2, 0, false);
            declareFunction("remove_pn_abbreviation", "REMOVE-PN-ABBREVIATION", 2, 0, false);
            declareFunction("add_term_string", "ADD-TERM-STRING", 2, 0, false);
            declareFunction("remove_term_string", "REMOVE-TERM-STRING", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_lexicon_after_addings_file_Previous() {
        declareFunction("add_lexicon_predicate", "ADD-LEXICON-PREDICATE", 2, 0, false);
        declareFunction("remove_lexicon_predicate", "REMOVE-LEXICON-PREDICATE", 2, 0, false);
        declareFunction("add_semantic_assertion", "ADD-SEMANTIC-ASSERTION", 2, 0, false);
        declareFunction("remove_semantic_assertion", "REMOVE-SEMANTIC-ASSERTION", 2, 0, false);
        declareFunction("add_index_sub_words_for_arg", "ADD-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
        declareFunction("remove_index_sub_words_for_arg", "REMOVE-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
        declareFunction("add_sub_word_indexed_assertion", "ADD-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
        declareFunction("remove_sub_word_indexed_assertion", "REMOVE-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
        declareFunction("add_generation_assertion", "ADD-GENERATION-ASSERTION", 2, 0, false);
        declareFunction("remove_generation_assertion", "REMOVE-GENERATION-ASSERTION", 2, 0, false);
        declareFunction("add_pragmatic_assertion", "ADD-PRAGMATIC-ASSERTION", 2, 0, false);
        declareFunction("remove_pragmatic_assertion", "REMOVE-PRAGMATIC-ASSERTION", 2, 0, false);
        declareFunction("add_determiner_agreement", "ADD-DETERMINER-AGREEMENT", 2, 0, false);
        declareFunction("remove_determiner_agreement", "REMOVE-DETERMINER-AGREEMENT", 2, 0, false);
        declareFunction("add_speech_part_preds", "ADD-SPEECH-PART-PREDS", 2, 0, false);
        declareFunction("remove_speech_part_preds", "REMOVE-SPEECH-PART-PREDS", 2, 0, false);
        declareFunction("add_regular_suffix", "ADD-REGULAR-SUFFIX", 2, 0, false);
        declareFunction("remove_regular_suffix", "REMOVE-REGULAR-SUFFIX", 2, 0, false);
        declareFunction("add_derivational_affix_base_pos", "ADD-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        declareFunction("remove_derivational_affix_base_pos", "REMOVE-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        declareFunction("add_derivational_affix_result_pos", "ADD-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        declareFunction("remove_derivational_affix_result_pos", "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        declareFunction("add_affix_semantics", "ADD-AFFIX-SEMANTICS", 2, 0, false);
        declareFunction("remove_affix_semantics", "REMOVE-AFFIX-SEMANTICS", 2, 0, false);
        declareFunction("add_affix_string", "ADD-AFFIX-STRING", 2, 0, false);
        declareFunction("remove_affix_string", "REMOVE-AFFIX-STRING", 2, 0, false);
        declareFunction("add_basic_speech_part_pred", "ADD-BASIC-SPEECH-PART-PRED", 2, 0, false);
        declareFunction("remove_basic_speech_part_pred", "REMOVE-BASIC-SPEECH-PART-PRED", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_lexicon_after_addings_file() {
        return NIL;
    }

    public static final SubLObject setup_lexicon_after_addings_file_alt() {
        register_kb_function(ADD_LEXICON_PREDICATE);
        register_kb_function(REMOVE_LEXICON_PREDICATE);
        register_kb_function(ADD_SEMANTIC_ASSERTION);
        register_kb_function(REMOVE_SEMANTIC_ASSERTION);
        register_kb_function(ADD_GENERATION_ASSERTION);
        register_kb_function(REMOVE_GENERATION_ASSERTION);
        register_kb_function(ADD_PRAGMATIC_ASSERTION);
        register_kb_function(REMOVE_PRAGMATIC_ASSERTION);
        register_kb_function(ADD_PROPER_NAME_PREDICATE);
        register_kb_function(REMOVE_PROPER_NAME_PREDICATE);
        register_kb_function(ADD_CACHED_LEXICON_ASSERTION);
        register_kb_function(REMOVE_CACHED_LEXICON_ASSERTION);
        register_kb_function(ADD_ACRONYM);
        register_kb_function(REMOVE_ACRONYM);
        register_kb_function(ADD_PN_ABBREVIATION);
        register_kb_function(REMOVE_PN_ABBREVIATION);
        register_kb_function(ADD_TERM_STRING);
        register_kb_function(REMOVE_TERM_STRING);
        register_kb_function(ADD_DETERMINER_AGREEMENT);
        register_kb_function(REMOVE_DETERMINER_AGREEMENT);
        register_kb_function(ADD_SPEECH_PART_PREDS);
        register_kb_function(REMOVE_SPEECH_PART_PREDS);
        register_kb_function(ADD_REGULAR_SUFFIX);
        register_kb_function(REMOVE_REGULAR_SUFFIX);
        register_kb_function(ADD_DERIVATIONAL_AFFIX_BASE_POS);
        register_kb_function(REMOVE_DERIVATIONAL_AFFIX_BASE_POS);
        register_kb_function(ADD_DERIVATIONAL_AFFIX_RESULT_POS);
        register_kb_function(REMOVE_DERIVATIONAL_AFFIX_RESULT_POS);
        register_kb_function(ADD_AFFIX_SEMANTICS);
        register_kb_function(REMOVE_AFFIX_SEMANTICS);
        register_kb_function(ADD_AFFIX_STRING);
        register_kb_function(REMOVE_AFFIX_STRING);
        register_kb_function(ADD_BASIC_SPEECH_PART_PRED);
        register_kb_function(REMOVE_BASIC_SPEECH_PART_PRED);
        return NIL;
    }

    public static SubLObject setup_lexicon_after_addings_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(ADD_LEXICON_PREDICATE);
            register_kb_function(REMOVE_LEXICON_PREDICATE);
            register_kb_function(ADD_SEMANTIC_ASSERTION);
            register_kb_function(REMOVE_SEMANTIC_ASSERTION);
            register_kb_function(ADD_INDEX_SUB_WORDS_FOR_ARG);
            register_kb_function(REMOVE_INDEX_SUB_WORDS_FOR_ARG);
            register_kb_function(ADD_SUB_WORD_INDEXED_ASSERTION);
            register_kb_function(REMOVE_SUB_WORD_INDEXED_ASSERTION);
            register_kb_function(ADD_GENERATION_ASSERTION);
            register_kb_function(REMOVE_GENERATION_ASSERTION);
            register_kb_function(ADD_PRAGMATIC_ASSERTION);
            register_kb_function(REMOVE_PRAGMATIC_ASSERTION);
            register_kb_function(ADD_DETERMINER_AGREEMENT);
            register_kb_function(REMOVE_DETERMINER_AGREEMENT);
            register_kb_function(ADD_SPEECH_PART_PREDS);
            register_kb_function(REMOVE_SPEECH_PART_PREDS);
            register_kb_function(ADD_REGULAR_SUFFIX);
            register_kb_function(REMOVE_REGULAR_SUFFIX);
            register_kb_function(ADD_DERIVATIONAL_AFFIX_BASE_POS);
            register_kb_function(REMOVE_DERIVATIONAL_AFFIX_BASE_POS);
            register_kb_function(ADD_DERIVATIONAL_AFFIX_RESULT_POS);
            register_kb_function(REMOVE_DERIVATIONAL_AFFIX_RESULT_POS);
            register_kb_function(ADD_AFFIX_SEMANTICS);
            register_kb_function(REMOVE_AFFIX_SEMANTICS);
            register_kb_function(ADD_AFFIX_STRING);
            register_kb_function(REMOVE_AFFIX_STRING);
            register_kb_function(ADD_BASIC_SPEECH_PART_PRED);
            register_kb_function(REMOVE_BASIC_SPEECH_PART_PRED);
        }
        if (SubLFiles.USE_V2) {
            register_kb_function(ADD_PROPER_NAME_PREDICATE);
            register_kb_function(REMOVE_PROPER_NAME_PREDICATE);
            register_kb_function(ADD_CACHED_LEXICON_ASSERTION);
            register_kb_function(REMOVE_CACHED_LEXICON_ASSERTION);
            register_kb_function(ADD_ACRONYM);
            register_kb_function(REMOVE_ACRONYM);
            register_kb_function(ADD_PN_ABBREVIATION);
            register_kb_function(REMOVE_PN_ABBREVIATION);
            register_kb_function(ADD_TERM_STRING);
            register_kb_function(REMOVE_TERM_STRING);
        }
        return NIL;
    }

    public static SubLObject setup_lexicon_after_addings_file_Previous() {
        register_kb_function(ADD_LEXICON_PREDICATE);
        register_kb_function(REMOVE_LEXICON_PREDICATE);
        register_kb_function(ADD_SEMANTIC_ASSERTION);
        register_kb_function(REMOVE_SEMANTIC_ASSERTION);
        register_kb_function(ADD_INDEX_SUB_WORDS_FOR_ARG);
        register_kb_function(REMOVE_INDEX_SUB_WORDS_FOR_ARG);
        register_kb_function(ADD_SUB_WORD_INDEXED_ASSERTION);
        register_kb_function(REMOVE_SUB_WORD_INDEXED_ASSERTION);
        register_kb_function(ADD_GENERATION_ASSERTION);
        register_kb_function(REMOVE_GENERATION_ASSERTION);
        register_kb_function(ADD_PRAGMATIC_ASSERTION);
        register_kb_function(REMOVE_PRAGMATIC_ASSERTION);
        register_kb_function(ADD_DETERMINER_AGREEMENT);
        register_kb_function(REMOVE_DETERMINER_AGREEMENT);
        register_kb_function(ADD_SPEECH_PART_PREDS);
        register_kb_function(REMOVE_SPEECH_PART_PREDS);
        register_kb_function(ADD_REGULAR_SUFFIX);
        register_kb_function(REMOVE_REGULAR_SUFFIX);
        register_kb_function(ADD_DERIVATIONAL_AFFIX_BASE_POS);
        register_kb_function(REMOVE_DERIVATIONAL_AFFIX_BASE_POS);
        register_kb_function(ADD_DERIVATIONAL_AFFIX_RESULT_POS);
        register_kb_function(REMOVE_DERIVATIONAL_AFFIX_RESULT_POS);
        register_kb_function(ADD_AFFIX_SEMANTICS);
        register_kb_function(REMOVE_AFFIX_SEMANTICS);
        register_kb_function(ADD_AFFIX_STRING);
        register_kb_function(REMOVE_AFFIX_STRING);
        register_kb_function(ADD_BASIC_SPEECH_PART_PRED);
        register_kb_function(REMOVE_BASIC_SPEECH_PART_PRED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_after_addings_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_after_addings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_after_addings_file();
    }

    static {
    }
}

/**
 * Total time: 1011 ms
 */
