/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-WORD
 *  source file: /cyc/top/cycl/kbi-word.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_word extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_word() {
    }

    public static final SubLFile me = new kbi_word();


    // // Definitions
    public static final SubLObject diagnose_qua_nl_word(SubLObject word) {
        return kbi_utilities.diagnose_qua_sub_domains(word, $NL_WORD);
    }

    // defparameter
    public static final SubLSymbol $word_wXo_denotation_results$ = makeSymbol("*WORD-W/O-DENOTATION-RESULTS*");

    // defparameter
    public static final SubLSymbol $word_wXo_denotation_time$ = makeSymbol("*WORD-W/O-DENOTATION-TIME*");

    // defparameter
    public static final SubLSymbol $word_wXo_denotation_count$ = makeSymbol("*WORD-W/O-DENOTATION-COUNT*");

    /**
     * test NL-WORD fort for missing denotations
     */
    public static final SubLObject word_wXo_denotationP(SubLObject nl_word) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw7$WORD_W_O_DENOTATION)) && (NIL != kbi_utilities.kbi_applies_toP($kw7$WORD_W_O_DENOTATION, nl_word))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw7$WORD_W_O_DENOTATION);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_word_wXo_denotation_in_mts(nl_word);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw7$WORD_W_O_DENOTATION, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :WORD-W/O-DENOTATION applies to NL-WORD
     */
    public static final SubLObject why_word_wXo_denotationP(SubLObject nl_word, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw7$WORD_W_O_DENOTATION, nl_word)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_3 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_word_wXo_denotation_in_mts(nl_word);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw7$WORD_W_O_DENOTATION, nl_word, data);
                            } else {
                                return list($kw7$WORD_W_O_DENOTATION, nl_word);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_word_wXo_denotationP(nl_word, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject nl_wordP(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return isa.isa_anyP(v_object, $list_alt14, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject denotation_inducing_posP(SubLObject pos) {
        return subl_promotions.memberP(pos, $list_alt15, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbi_nl_why_word_wXo_denotationP(SubLObject word, SubLObject data) {
        {
            SubLObject nl_result = $str_alt16$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXposXdenote = NIL;
            for (mtXposXdenote = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXposXdenote = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXposXdenote;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject pos = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    pos = current.first();
                    current = current.rest();
                    {
                        SubLObject denote = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt17);
                        current = current.rest();
                        if (NIL == current) {
                            nl_result = cconcatenate(nl_result, NIL != denote ? ((SubLObject) (format(NIL, $str_alt18$___s_qua__s_has_denotation__s__in, new SubLObject[]{ word, pos, denote, mt }))) : format(NIL, $str_alt19$___s_qua__s_has_no_denotation__in, new SubLObject[]{ word, pos, mt }));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt17);
                        }
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_word_wXo_denotation_in_mts(SubLObject word) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding(thread);
                    try {
                        control_vars.$mapping_source$.bind(word, thread);
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
                            {
                                SubLObject _prev_bind_0_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject pred_var = $$posForms;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, NIL, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, NIL, pred_var);
                                                SubLObject done_var = doneP;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                    {
                                                                        SubLObject done_var_6 = doneP;
                                                                        SubLObject token_var_7 = NIL;
                                                                        while (NIL == done_var_6) {
                                                                            {
                                                                                SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                                SubLObject valid_8 = makeBoolean(token_var_7 != as);
                                                                                if (NIL != valid_8) {
                                                                                    {
                                                                                        SubLObject part_of_speech = assertions_high.gaf_arg2(as);
                                                                                        SubLObject mt = assertions_high.assertion_mt(as);
                                                                                        SubLObject denotations = kb_mapping_utilities.pred_arg_values(word, $$denotation, part_of_speech, ONE_INTEGER, TWO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED_SYM);
                                                                                        if ((NIL != denotation_inducing_posP(part_of_speech)) && (NIL == denotations)) {
                                                                                            kbi_utilities.add_kbi_result(list(mt, part_of_speech));
                                                                                        }
                                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                done_var_6 = makeBoolean((NIL == valid_8) || (NIL != doneP));
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        }
                    } finally {
                        control_vars.$mapping_source$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject declare_kbi_word_file() {
        declareFunction("diagnose_qua_nl_word", "DIAGNOSE-QUA-NL-WORD", 1, 0, false);
        declareFunction("word_wXo_denotationP", "WORD-W/O-DENOTATION?", 1, 0, false);
        declareFunction("why_word_wXo_denotationP", "WHY-WORD-W/O-DENOTATION?", 1, 1, false);
        declareFunction("nl_wordP", "NL-WORD?", 1, 1, false);
        declareFunction("denotation_inducing_posP", "DENOTATION-INDUCING-POS?", 1, 0, false);
        declareFunction("kbi_nl_why_word_wXo_denotationP", "KBI-NL-WHY-WORD-W/O-DENOTATION?", 2, 0, false);
        declareFunction("kbi_word_wXo_denotation_in_mts", "KBI-WORD-W/O-DENOTATION-IN-MTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_word_file() {
        defparameter("*WORD-W/O-DENOTATION-RESULTS*", NIL);
        defparameter("*WORD-W/O-DENOTATION-TIME*", ZERO_INTEGER);
        defparameter("*WORD-W/O-DENOTATION-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_word_file() {
                {
            SubLObject item_var = $sym1$_WORD_W_O_DENOTATION_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym1$_WORD_W_O_DENOTATION_RESULTS_, $str_alt2$violators_of_kbi_module__WORD_W_O);
        {
            SubLObject item_var = $sym3$_WORD_W_O_DENOTATION_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym3$_WORD_W_O_DENOTATION_TIME_, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym5$_WORD_W_O_DENOTATION_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym5$_WORD_W_O_DENOTATION_COUNT_, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw7$WORD_W_O_DENOTATION, $list_alt13);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $NL_WORD = makeKeyword("NL-WORD");

    static private final SubLSymbol $sym1$_WORD_W_O_DENOTATION_RESULTS_ = makeSymbol("*WORD-W/O-DENOTATION-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__WORD_W_O = makeString("violators of kbi module :WORD-W/O-DENOTATION");

    static private final SubLSymbol $sym3$_WORD_W_O_DENOTATION_TIME_ = makeSymbol("*WORD-W/O-DENOTATION-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :WORD-W/O-DENOTATION");

    static private final SubLSymbol $sym5$_WORD_W_O_DENOTATION_COUNT_ = makeSymbol("*WORD-W/O-DENOTATION-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :WORD-W/O-DENOTATION");

    public static final SubLSymbol $kw7$WORD_W_O_DENOTATION = makeKeyword("WORD-W/O-DENOTATION");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*WORD-W/O-DENOTATION-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*WORD-W/O-DENOTATION-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*WORD-W/O-DENOTATION-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("NL-WORD"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-WORD-W/O-DENOTATION-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("WORD-W/O-DENOTATION?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-WORD-W/O-DENOTATION?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-WORD-W/O-DENOTATION?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("NL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test NL-WORD fort for missing denotations") });

    static private final SubLList $list_alt14 = list(constant_handles.reader_make_constant_shell(makeString("EnglishWord")));

    static private final SubLList $list_alt15 = list(constant_handles.reader_make_constant_shell(makeString("CountNoun")), constant_handles.reader_make_constant_shell(makeString("AgentiveNoun")), constant_handles.reader_make_constant_shell(makeString("MassNoun")), constant_handles.reader_make_constant_shell(makeString("ProperCountNoun")), constant_handles.reader_make_constant_shell(makeString("ProperMassNoun")), constant_handles.reader_make_constant_shell(makeString("Verb")), constant_handles.reader_make_constant_shell(makeString("Adjective")), constant_handles.reader_make_constant_shell(makeString("Adverb")));

    static private final SubLString $str_alt16$ = makeString("");

    static private final SubLList $list_alt17 = list(makeSymbol("MT"), makeSymbol("POS"), makeSymbol("&OPTIONAL"), makeSymbol("DENOTE"));

    static private final SubLString $str_alt18$___s_qua__s_has_denotation__s__in = makeString("~%~s qua ~s has denotation ~s [in ~s]");

    static private final SubLString $str_alt19$___s_qua__s_has_no_denotation__in = makeString("~%~s qua ~s has no denotation [in ~s]");

    public static final SubLObject $$posForms = constant_handles.reader_make_constant_shell(makeString("posForms"));



    public static final SubLObject $$denotation = constant_handles.reader_make_constant_shell(makeString("denotation"));

    // // Initializers
    public void declareFunctions() {
        declare_kbi_word_file();
    }

    public void initializeVariables() {
        init_kbi_word_file();
    }

    public void runTopLevelForms() {
        setup_kbi_word_file();
    }
}

