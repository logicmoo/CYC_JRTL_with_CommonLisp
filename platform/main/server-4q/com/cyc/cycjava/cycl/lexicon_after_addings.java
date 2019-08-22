package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lexicon_after_addings extends SubLTranslatedFile {
    public static final SubLFile me = new lexicon_after_addings();

    public static final String myName = "com.cyc.cycjava.cycl.lexicon_after_addings";

    public static final String myFingerPrint = "bab348f90c9e8f754ca44276a611a04696a8f503edf46574623ae0986f128894";

    private static final SubLSymbol $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list1 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);



    private static final SubLObject $$partOfSpeech = reader_make_constant_shell(makeString("partOfSpeech"));



    private static final SubLString $str5$_A = makeString("~A");

    private static final SubLObject $$UnitOfMeasure = reader_make_constant_shell(makeString("UnitOfMeasure"));

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

    public static final SubLSymbol ADD_DETERMINER_AGREEMENT = makeSymbol("ADD-DETERMINER-AGREEMENT");

    public static final SubLSymbol REMOVE_DETERMINER_AGREEMENT = makeSymbol("REMOVE-DETERMINER-AGREEMENT");

    public static final SubLSymbol ADD_SPEECH_PART_PREDS = makeSymbol("ADD-SPEECH-PART-PREDS");

    public static final SubLSymbol REMOVE_SPEECH_PART_PREDS = makeSymbol("REMOVE-SPEECH-PART-PREDS");

    public static final SubLSymbol ADD_REGULAR_SUFFIX = makeSymbol("ADD-REGULAR-SUFFIX");

    public static final SubLSymbol REMOVE_REGULAR_SUFFIX = makeSymbol("REMOVE-REGULAR-SUFFIX");

    public static final SubLSymbol ADD_DERIVATIONAL_AFFIX_BASE_POS = makeSymbol("ADD-DERIVATIONAL-AFFIX-BASE-POS");

    public static final SubLSymbol REMOVE_DERIVATIONAL_AFFIX_BASE_POS = makeSymbol("REMOVE-DERIVATIONAL-AFFIX-BASE-POS");

    public static final SubLSymbol ADD_DERIVATIONAL_AFFIX_RESULT_POS = makeSymbol("ADD-DERIVATIONAL-AFFIX-RESULT-POS");

    public static final SubLSymbol REMOVE_DERIVATIONAL_AFFIX_RESULT_POS = makeSymbol("REMOVE-DERIVATIONAL-AFFIX-RESULT-POS");

    public static final SubLSymbol ADD_AFFIX_SEMANTICS = makeSymbol("ADD-AFFIX-SEMANTICS");

    public static final SubLSymbol REMOVE_AFFIX_SEMANTICS = makeSymbol("REMOVE-AFFIX-SEMANTICS");

    public static final SubLSymbol ADD_AFFIX_STRING = makeSymbol("ADD-AFFIX-STRING");

    public static final SubLSymbol REMOVE_AFFIX_STRING = makeSymbol("REMOVE-AFFIX-STRING");

    public static final SubLSymbol ADD_BASIC_SPEECH_PART_PRED = makeSymbol("ADD-BASIC-SPEECH-PART-PRED");

    public static final SubLSymbol REMOVE_BASIC_SPEECH_PART_PRED = makeSymbol("REMOVE-BASIC-SPEECH-PART-PRED");

    public static SubLObject add_lexicon_predicate(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject message_var = NIL;
        SubLObject was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
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

    public static SubLObject remove_lexicon_predicate(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            SubLObject message_var = NIL;
            SubLObject was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
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

    public static SubLObject add_semantic_assertion(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexicon_vars.clear_verb_frames();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
        SubLObject message_var = NIL;
        SubLObject was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str5$_A, message_var);
        }
        message_var = NIL;
        was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
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
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                                final SubLObject was_appendingP_$3 = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                                        eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP_$3));
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
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

    public static SubLObject remove_semantic_assertion(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
            final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
            SubLObject message_var = NIL;
            SubLObject was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            message_var = NIL;
            was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            SubLObject message_var2 = NIL;
            final SubLObject was_appendingP2 = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                                final SubLObject was_appendingP_$8 = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
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
                                        eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP_$8));
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
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2));
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

    public static SubLObject add_pragmatic_assertion(final SubLObject argument, final SubLObject assertion) {
        final SubLObject semantic_assertion = assertions_high.gaf_arg1(assertion);
        nl_trie.retriefy_semantic_assertion(semantic_assertion, UNPROVIDED);
        np_parser.clear_npp_caches();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject remove_pragmatic_assertion(final SubLObject argument, final SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            final SubLObject semantic_assertion = assertions_high.gaf_arg1(assertion);
            nl_trie.retriefy_semantic_assertion(semantic_assertion, UNPROVIDED);
            np_parser.clear_npp_caches();
            pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject add_determiner_agreement(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_agr_of_det_string();
        return NIL;
    }

    public static SubLObject remove_determiner_agreement(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_agr_of_det_string();
        return NIL;
    }

    public static SubLObject add_speech_part_preds(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        lexicon_accessors.initialize_speech_part_caches();
        nl_trie.clear_nl_trie_closed_class_pos_preds();
        lexicon_utilities.clear_preds_of_pos();
        return NIL;
    }

    public static SubLObject remove_speech_part_preds(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        lexicon_accessors.initialize_speech_part_caches();
        nl_trie.clear_nl_trie_closed_class_pos_preds();
        lexicon_utilities.clear_preds_of_pos();
        return NIL;
    }

    public static SubLObject add_regular_suffix(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        return NIL;
    }

    public static SubLObject remove_regular_suffix(final SubLObject argument, final SubLObject assertion) {
        lexicon_accessors.clear_derived_preds();
        return NIL;
    }

    public static SubLObject add_derivational_affix_base_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_base_poses_for_reified_affix();
        return NIL;
    }

    public static SubLObject remove_derivational_affix_base_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_base_poses_for_reified_affix();
        return NIL;
    }

    public static SubLObject add_derivational_affix_result_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_result_poses_for_reified_affix();
        return NIL;
    }

    public static SubLObject remove_derivational_affix_result_pos(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_result_poses_for_reified_affix();
        return NIL;
    }

    public static SubLObject add_affix_semantics(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_sem_templates_for_reified_affix();
        return NIL;
    }

    public static SubLObject remove_affix_semantics(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        mwp_rule.clear_mwp_sem_templates_for_reified_affix();
        return NIL;
    }

    public static SubLObject add_affix_string(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        return NIL;
    }

    public static SubLObject remove_affix_string(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        return NIL;
    }

    public static SubLObject add_basic_speech_part_pred(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        morph_word.clear_mwp_base_pred_of_pos();
        return NIL;
    }

    public static SubLObject remove_basic_speech_part_pred(final SubLObject argument, final SubLObject assertion) {
        morphological_word_parser.note_mwp_needs_reinitialization();
        morph_word.clear_mwp_base_pred_of_pos();
        return NIL;
    }

    public static SubLObject declare_lexicon_after_addings_file() {
        declareFunction(me, "add_lexicon_predicate", "ADD-LEXICON-PREDICATE", 2, 0, false);
        declareFunction(me, "remove_lexicon_predicate", "REMOVE-LEXICON-PREDICATE", 2, 0, false);
        declareFunction(me, "add_semantic_assertion", "ADD-SEMANTIC-ASSERTION", 2, 0, false);
        declareFunction(me, "remove_semantic_assertion", "REMOVE-SEMANTIC-ASSERTION", 2, 0, false);
        declareFunction(me, "add_index_sub_words_for_arg", "ADD-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
        declareFunction(me, "remove_index_sub_words_for_arg", "REMOVE-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false);
        declareFunction(me, "add_sub_word_indexed_assertion", "ADD-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
        declareFunction(me, "remove_sub_word_indexed_assertion", "REMOVE-SUB-WORD-INDEXED-ASSERTION", 2, 0, false);
        declareFunction(me, "add_generation_assertion", "ADD-GENERATION-ASSERTION", 2, 0, false);
        declareFunction(me, "remove_generation_assertion", "REMOVE-GENERATION-ASSERTION", 2, 0, false);
        declareFunction(me, "add_pragmatic_assertion", "ADD-PRAGMATIC-ASSERTION", 2, 0, false);
        declareFunction(me, "remove_pragmatic_assertion", "REMOVE-PRAGMATIC-ASSERTION", 2, 0, false);
        declareFunction(me, "add_determiner_agreement", "ADD-DETERMINER-AGREEMENT", 2, 0, false);
        declareFunction(me, "remove_determiner_agreement", "REMOVE-DETERMINER-AGREEMENT", 2, 0, false);
        declareFunction(me, "add_speech_part_preds", "ADD-SPEECH-PART-PREDS", 2, 0, false);
        declareFunction(me, "remove_speech_part_preds", "REMOVE-SPEECH-PART-PREDS", 2, 0, false);
        declareFunction(me, "add_regular_suffix", "ADD-REGULAR-SUFFIX", 2, 0, false);
        declareFunction(me, "remove_regular_suffix", "REMOVE-REGULAR-SUFFIX", 2, 0, false);
        declareFunction(me, "add_derivational_affix_base_pos", "ADD-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        declareFunction(me, "remove_derivational_affix_base_pos", "REMOVE-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false);
        declareFunction(me, "add_derivational_affix_result_pos", "ADD-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        declareFunction(me, "remove_derivational_affix_result_pos", "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false);
        declareFunction(me, "add_affix_semantics", "ADD-AFFIX-SEMANTICS", 2, 0, false);
        declareFunction(me, "remove_affix_semantics", "REMOVE-AFFIX-SEMANTICS", 2, 0, false);
        declareFunction(me, "add_affix_string", "ADD-AFFIX-STRING", 2, 0, false);
        declareFunction(me, "remove_affix_string", "REMOVE-AFFIX-STRING", 2, 0, false);
        declareFunction(me, "add_basic_speech_part_pred", "ADD-BASIC-SPEECH-PART-PRED", 2, 0, false);
        declareFunction(me, "remove_basic_speech_part_pred", "REMOVE-BASIC-SPEECH-PART-PRED", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_lexicon_after_addings_file() {
        return NIL;
    }

    public static SubLObject setup_lexicon_after_addings_file() {
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

    
}

/**
 * Total time: 1011 ms
 */
