/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
 * module:      EQUALITY-STORE
 * source file: /cyc/top/cycl/equality-store.lisp
 * created:     2019/07/03 17:37:36
 */
public final class equality_store extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new equality_store();

 public static final String myName = "com.cyc.cycjava.cycl.equality_store";




    public static final SubLSymbol $some_equality_assertions_somewhere_set$ = makeSymbol("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*");

    static private final SubLString $str3$Initializing_some_equality_assert = makeString("Initializing some equality assertions somewhere...");



    private static final SubLSymbol DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE = makeSymbol("DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE");



    private static final SubLSymbol $sym9$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = makeSymbol("SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?");

    // Definitions
    public static final SubLObject some_equality_assertionsP_alt(SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(obj)) {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.equality_store.some_equality_assertions_somewhereP(obj)) && ((NIL != kb_gp_mapping.some_spec_pred_value_in_relevant_mts(obj, $$equals, mt, ONE_INTEGER, $TRUE)) || (NIL != kb_gp_mapping.some_spec_pred_value_in_relevant_mts(obj, $$equals, mt, TWO_INTEGER, $TRUE))));
        }
        return NIL;
    }

    // Definitions
    public static SubLObject some_equality_assertionsP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(obj)) {
            return makeBoolean((NIL != some_equality_assertions_somewhereP(obj)) && ((NIL != kb_gp_mapping.some_spec_pred_value_in_relevant_mts(obj, $$equals, mt, ONE_INTEGER, $TRUE)) || (NIL != kb_gp_mapping.some_spec_pred_value_in_relevant_mts(obj, $$equals, mt, TWO_INTEGER, $TRUE))));
        }
        return NIL;
    }

    /**
     * Return T iff OBJ is known to have any equality assertions stated about it at all.
     */
    @LispMethod(comment = "Return T iff OBJ is known to have any equality assertions stated about it at all.")
    public static final SubLObject some_equality_assertions_somewhereP_alt(SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            if (NIL == set.set_p($some_equality_assertions_somewhere_set$.getGlobalValue())) {
                com.cyc.cycjava.cycl.equality_store.initialize_some_equality_assertions_somewhere_set();
            }
            return set.set_memberP(obj, $some_equality_assertions_somewhere_set$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Return T iff OBJ is known to have any equality assertions stated about it at all.
     */
    @LispMethod(comment = "Return T iff OBJ is known to have any equality assertions stated about it at all.")
    public static SubLObject some_equality_assertions_somewhereP(final SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            if (NIL == set.set_p($some_equality_assertions_somewhere_set$.getGlobalValue())) {
                initialize_some_equality_assertions_somewhere_set();
            }
            return set.set_memberP(obj, $some_equality_assertions_somewhere_set$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject clear_some_equality_assertions_somewhere_set_alt() {
        if (NIL != $some_equality_assertions_somewhere_set$.getGlobalValue()) {
            set.clear_set($some_equality_assertions_somewhere_set$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject clear_some_equality_assertions_somewhere_set() {
        if (NIL != $some_equality_assertions_somewhere_set$.getGlobalValue()) {
            set.clear_set($some_equality_assertions_somewhere_set$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject initialize_some_equality_assertions_somewhere_set_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != valid_constantP($$equals, UNPROVIDED)) {
                {
                    SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                    try {
                        $noting_progress_start_time$.bind(get_universal_time(), thread);
                        noting_progress_preamble($str_alt3$Initializing_some_equality_assert);
                        {
                            SubLObject estimated_size = multiply(TWO_INTEGER, kb_gp_mapping.num_spec_pred_index($$equals, UNPROVIDED));
                            $some_equality_assertions_somewhere_set$.setGlobalValue(set.new_set(EQL, estimated_size));
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    {
                                        SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$equals, UNPROVIDED, UNPROVIDED);
                                        SubLObject spec_pred = NIL;
                                        for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                                            {
                                                SubLObject pred_var = spec_pred;
                                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                        SubLObject done_var = NIL;
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
                                                                                SubLObject done_var_2 = NIL;
                                                                                SubLObject token_var_3 = NIL;
                                                                                while (NIL == done_var_2) {
                                                                                    {
                                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                                                                        SubLObject valid_4 = makeBoolean(token_var_3 != ass);
                                                                                        if (NIL != valid_4) {
                                                                                            com.cyc.cycjava.cycl.equality_store.cache_some_equality_assertions_somewhere(ass);
                                                                                        }
                                                                                        done_var_2 = makeBoolean(NIL == valid_4);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                        noting_progress_postamble();
                    } finally {
                        $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_some_equality_assertions_somewhere_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_constantP($$equals, UNPROVIDED)) {
            final SubLObject str = $str3$Initializing_some_equality_assert;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                final SubLObject estimated_size = multiply(TWO_INTEGER, kb_gp_mapping.num_spec_pred_index($$equals, UNPROVIDED));
                $some_equality_assertions_somewhere_set$.setGlobalValue(set.new_set(EQL, estimated_size));
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$equals, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_pred = NIL;
                    spec_pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject pred_var = spec_pred;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str_$3 = NIL;
                            final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$7 = $progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$8 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_5_$9 = $progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_6_$10 = $is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_7_$11 = $silent_progressP$.currentBinding(thread);
                            try {
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                $progress_count$.bind(ZERO_INTEGER, thread);
                                $is_noting_progressP$.bind(T, thread);
                                $silent_progressP$.bind(NIL != str_$3 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                noting_progress_preamble(str_$3);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        note_progress();
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            SubLObject done_var_$12 = NIL;
                                            final SubLObject token_var_$13 = NIL;
                                            while (NIL == done_var_$12) {
                                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                                final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(ass));
                                                if (NIL != valid_$14) {
                                                    cache_some_equality_assertions_somewhere(ass);
                                                }
                                                done_var_$12 = makeBoolean(NIL == valid_$14);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_7_$11, thread);
                                $is_noting_progressP$.rebind(_prev_bind_6_$10, thread);
                                $progress_count$.rebind(_prev_bind_5_$9, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$8, thread);
                                $progress_notification_count$.rebind(_prev_bind_3_$7, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$6, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        spec_pred = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * after-adding and after-removing for #$equals and its spec-preds
     */
    @LispMethod(comment = "after-adding and after-removing for #$equals and its spec-preds")
    public static final SubLObject decache_some_equality_assertions_somewhere_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                if (NIL != forts.fort_p(arg1)) {
                    com.cyc.cycjava.cycl.equality_store.recache_some_equality_assertions_somewhere(arg1);
                }
            }
            {
                SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                if (NIL != forts.fort_p(arg2)) {
                    com.cyc.cycjava.cycl.equality_store.recache_some_equality_assertions_somewhere(arg2);
                }
            }
        }
        return NIL;
    }

    /**
     * after-adding and after-removing for #$equals and its spec-preds
     */
    @LispMethod(comment = "after-adding and after-removing for #$equals and its spec-preds")
    public static SubLObject decache_some_equality_assertions_somewhere(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            if (NIL != forts.fort_p(arg1)) {
                recache_some_equality_assertions_somewhere(arg1);
            }
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            if (NIL != forts.fort_p(arg2)) {
                recache_some_equality_assertions_somewhere(arg2);
            }
        }
        return NIL;
    }

    public static final SubLObject cache_some_equality_assertions_somewhere_alt(SubLObject assertion) {
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.assertion_arguments(assertion))) {
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL != hlmt.valid_hlmt_p(mt, UNPROVIDED)) {
                    {
                        SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                        SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                        if (NIL != forts.valid_fortP(arg1)) {
                            set.set_add(arg1, $some_equality_assertions_somewhere_set$.getGlobalValue());
                        }
                        if (NIL != forts.valid_fortP(arg2)) {
                            set.set_add(arg2, $some_equality_assertions_somewhere_set$.getGlobalValue());
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cache_some_equality_assertions_somewhere(final SubLObject assertion) {
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.assertion_arguments(assertion))) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != hlmt.valid_hlmt_p(mt, UNPROVIDED)) {
                final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                if (NIL != forts.valid_fortP(arg1)) {
                    set.set_add(arg1, $some_equality_assertions_somewhere_set$.getGlobalValue());
                }
                if (NIL != forts.valid_fortP(arg2)) {
                    set.set_add(arg2, $some_equality_assertions_somewhere_set$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static final SubLObject recache_some_equality_assertions_somewhere_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $some_equality_assertions_somewhere_set$.getGlobalValue()) {
                com.cyc.cycjava.cycl.equality_store.initialize_some_equality_assertions_somewhere_set();
            }
            set.set_remove(fort, $some_equality_assertions_somewhere_set$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$equals, UNPROVIDED, UNPROVIDED);
                        SubLObject spec_pred = NIL;
                        for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                            {
                                SubLObject pred_var = spec_pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
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
                                                                SubLObject done_var_6 = NIL;
                                                                SubLObject token_var_7 = NIL;
                                                                while (NIL == done_var_6) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                        SubLObject valid_8 = makeBoolean(token_var_7 != ass);
                                                                        if (NIL != valid_8) {
                                                                            if (NIL != assertions_high.assertion_arguments(ass)) {
                                                                                com.cyc.cycjava.cycl.equality_store.cache_some_equality_assertions_somewhere(ass);
                                                                            }
                                                                        }
                                                                        done_var_6 = makeBoolean(NIL == valid_8);
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
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$equals, UNPROVIDED, UNPROVIDED);
                        SubLObject spec_pred = NIL;
                        for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                            {
                                SubLObject pred_var = spec_pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
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
                                                                SubLObject done_var_10 = NIL;
                                                                SubLObject token_var_11 = NIL;
                                                                while (NIL == done_var_10) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                        SubLObject valid_12 = makeBoolean(token_var_11 != ass);
                                                                        if (NIL != valid_12) {
                                                                            if (NIL != assertions_high.assertion_arguments(ass)) {
                                                                                com.cyc.cycjava.cycl.equality_store.cache_some_equality_assertions_somewhere(ass);
                                                                            }
                                                                        }
                                                                        done_var_10 = makeBoolean(NIL == valid_12);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject recache_some_equality_assertions_somewhere(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $some_equality_assertions_somewhere_set$.getGlobalValue()) {
            initialize_some_equality_assertions_somewhere_set();
        }
        set.set_remove(fort, $some_equality_assertions_somewhere_set$.getGlobalValue());
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$equals, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = spec_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$16 = NIL;
                                final SubLObject token_var_$17 = NIL;
                                while (NIL == done_var_$16) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                    final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(ass));
                                    if ((NIL != valid_$18) && (NIL != assertions_high.assertion_arguments(ass))) {
                                        cache_some_equality_assertions_somewhere(ass);
                                    }
                                    done_var_$16 = makeBoolean(NIL == valid_$18);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$equals, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = spec_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$17 = NIL;
                                final SubLObject token_var_$18 = NIL;
                                while (NIL == done_var_$17) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                    final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(ass));
                                    if ((NIL != valid_$19) && (NIL != assertions_high.assertion_arguments(ass))) {
                                        cache_some_equality_assertions_somewhere(ass);
                                    }
                                    done_var_$17 = makeBoolean(NIL == valid_$19);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Only works when OBJ is a fort.
     */
    @LispMethod(comment = "Only works when OBJ is a fort.")
    public static final SubLObject some_source_rewrite_of_assertionsP_alt(SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(obj)) {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.equality_store.some_source_rewrite_of_assertions_somewhereP(obj)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(obj, $$rewriteOf, mt, TWO_INTEGER, $TRUE)));
        }
        return NIL;
    }

    /**
     * Only works when OBJ is a fort.
     */
    @LispMethod(comment = "Only works when OBJ is a fort.")
    public static SubLObject some_source_rewrite_of_assertionsP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(obj)) {
            return makeBoolean((NIL != some_source_rewrite_of_assertions_somewhereP(obj)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(obj, $$rewriteOf, mt, TWO_INTEGER, $TRUE)));
        }
        return NIL;
    }/**
     * Only works when OBJ is a fort.
     */


    /**
     * Return T iff OBJ is known to have any true #$rewriteOf assertions stated about it
     * where OBJ is the source arg (the one from which the propagation would occur).
     * Only works when OBJ is a fort.
     */
    @LispMethod(comment = "Return T iff OBJ is known to have any true #$rewriteOf assertions stated about it\r\nwhere OBJ is the source arg (the one from which the propagation would occur).\r\nOnly works when OBJ is a fort.\nReturn T iff OBJ is known to have any true #$rewriteOf assertions stated about it\nwhere OBJ is the source arg (the one from which the propagation would occur).\nOnly works when OBJ is a fort.")
    public static final SubLObject some_source_rewrite_of_assertions_somewhereP_alt(SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            return somewhere_cache.some_pred_assertion_somewhereP($$rewriteOf, obj, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff OBJ is known to have any true #$rewriteOf assertions stated about it\r\nwhere OBJ is the source arg (the one from which the propagation would occur).\r\nOnly works when OBJ is a fort.\nReturn T iff OBJ is known to have any true #$rewriteOf assertions stated about it\nwhere OBJ is the source arg (the one from which the propagation would occur).\nOnly works when OBJ is a fort.")
    public static SubLObject some_source_rewrite_of_assertions_somewhereP(final SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            return somewhere_cache.some_pred_assertion_somewhereP($$rewriteOf, obj, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }/**
     * Return T iff OBJ is known to have any true #$rewriteOf assertions stated about it
     * where OBJ is the source arg (the one from which the propagation would occur).
     * Only works when OBJ is a fort.
     */


    public static SubLObject dispreferred_term_in_expressionP(final SubLObject expression) {
        return cycl_utilities.expression_find_if($sym9$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, expression, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_equality_store_file() {
        declareFunction("some_equality_assertionsP", "SOME-EQUALITY-ASSERTIONS?", 1, 1, false);
        declareFunction("some_equality_assertions_somewhereP", "SOME-EQUALITY-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction("clear_some_equality_assertions_somewhere_set", "CLEAR-SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET", 0, 0, false);
        declareFunction("initialize_some_equality_assertions_somewhere_set", "INITIALIZE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET", 0, 0, false);
        declareFunction("decache_some_equality_assertions_somewhere", "DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 2, 0, false);
        declareFunction("cache_some_equality_assertions_somewhere", "CACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 1, 0, false);
        declareFunction("recache_some_equality_assertions_somewhere", "RECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 1, 0, false);
        declareFunction("some_source_rewrite_of_assertionsP", "SOME-SOURCE-REWRITE-OF-ASSERTIONS?", 1, 1, false);
        declareFunction("some_source_rewrite_of_assertions_somewhereP", "SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction("dispreferred_term_in_expressionP", "DISPREFERRED-TERM-IN-EXPRESSION?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_equality_store_file_alt() {
        deflexical("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*", NIL != boundp($some_equality_assertions_somewhere_set$) ? ((SubLObject) ($some_equality_assertions_somewhere_set$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_equality_store_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*", SubLTrampolineFile.maybeDefault($some_equality_assertions_somewhere_set$, $some_equality_assertions_somewhere_set$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*", NIL != boundp($some_equality_assertions_somewhere_set$) ? ((SubLObject) ($some_equality_assertions_somewhere_set$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_equality_store_file_Previous() {
        deflexical("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*", SubLTrampolineFile.maybeDefault($some_equality_assertions_somewhere_set$, $some_equality_assertions_somewhere_set$, NIL));
        return NIL;
    }

    public static SubLObject setup_equality_store_file() {
        declare_defglobal($some_equality_assertions_somewhere_set$);
        register_kb_function(DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_equality_store_file();
    }

    @Override
    public void initializeVariables() {
        init_equality_store_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_equality_store_file();
    }

    

    static private final SubLString $str_alt3$Initializing_some_equality_assert = makeString("Initializing some equality assertions somewhere...");
}

/**
 * Total time: 261 ms
 */
