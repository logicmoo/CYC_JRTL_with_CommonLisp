/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      BBN-STRENGTHENING
 *  source file: /cyc/top/cycl/bbn-strengthening.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class bbn_strengthening extends SubLTranslatedFile implements V02 {
    // // Constructor
    private bbn_strengthening() {
    }

    public static final SubLFile me = new bbn_strengthening();




    // defparameter
    private static final SubLSymbol $bbn_trace_element$ = makeSymbol("*BBN-TRACE-ELEMENT*");

    /**
     * Display warning iff *bbn-trace-level* is high enough
     */
    public static final SubLObject bbn_warn(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject arg1 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt0);
                current = current.rest();
                {
                    SubLObject arg2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt0);
                    current = current.rest();
                    {
                        SubLObject arg3 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt0);
                        current = current.rest();
                        if (NIL == current) {
                            SubLTrampolineFile.checkType(level, INTEGERP);
                            return list(PWHEN, list($sym3$__, $bbn_trace_level$, level), list(FORMAT, T, list(BUNGE, list(LIST, $str_alt8$____BBN____, format_str)), arg1, arg2, arg3));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $bbn_strengthening_mt$ = makeSymbol("*BBN-STRENGTHENING-MT*");

    // defparameter
    private static final SubLSymbol $bbn_verification_mt$ = makeSymbol("*BBN-VERIFICATION-MT*");

    // defparameter
    private static final SubLSymbol $bbn_bookkeeping_mt$ = makeSymbol("*BBN-BOOKKEEPING-MT*");



    // defparameter
    private static final SubLSymbol $bbn_unknown_pred$ = makeSymbol("*BBN-UNKNOWN-PRED*");

    // defparameter
    private static final SubLSymbol $bbn_equality_predicate$ = makeSymbol("*BBN-EQUALITY-PREDICATE*");

    // defparameter
    private static final SubLSymbol $bbn_explore_it_anywayP$ = makeSymbol("*BBN-EXPLORE-IT-ANYWAY?*");





    // defparameter
    private static final SubLSymbol $bbn_temporary_additions$ = makeSymbol("*BBN-TEMPORARY-ADDITIONS*");

    // defparameter
    private static final SubLSymbol $bbn_store_temporary_formulasP$ = makeSymbol("*BBN-STORE-TEMPORARY-FORMULAS?*");

    // defparameter
    private static final SubLSymbol $bbn_register_predicateP$ = makeSymbol("*BBN-REGISTER-PREDICATE?*");

    // defparameter
    private static final SubLSymbol $bbn_skip_unknown_relationsP$ = makeSymbol("*BBN-SKIP-UNKNOWN-RELATIONS?*");

    public static final SubLObject bbn_while_registering_predicates(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt15, append(body, NIL));
        }
    }

    public static final SubLObject bbn_while_storing_formulas(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt16, append(body, NIL));
        }
    }

    public static final SubLObject bbn_without_storing_formulas(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt17, append(body, NIL));
        }
    }





    // defparameter
    public static final SubLSymbol $bbn_do_metrics_by_hypothesisP$ = makeSymbol("*BBN-DO-METRICS-BY-HYPOTHESIS?*");

    public static final SubLObject with_bbn_log_file(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            filename = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(BBN_WARN, ZERO_INTEGER, $str_alt21$logging_to__A__, filename), list(CLET, list(list($bbn_log_file$, filename)), list(WITH_TEXT_FILE, listS(WTF, filename, $list_alt25), listS(CLET, $list_alt26, append(body, NIL)))));
            }
        }
    }

    public static final SubLObject with_bbn_log_default(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt27, listS(WITH_BBN_LOG_FILE, FN, append(body, NIL)));
        }
    }

    /**
     *
     *
     * @unknown bbn-strengthening-metrics.lisp appears to handle this for itself
     */
    public static final SubLObject bbn_force_output(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != stream) {
                return force_output(stream);
            }
            if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                force_output($bbn_log_stream$.getDynamicValue(thread));
            }
            force_output(UNPROVIDED);
            return NIL;
        }
    }



    // defparameter
    private static final SubLSymbol $bbn_abortP$ = makeSymbol("*BBN-ABORT?*");

    // defparameter
    private static final SubLSymbol $bbn_time_cinc$ = makeSymbol("*BBN-TIME-CINC*");

    public static final SubLObject with_bbn_time_limit(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject nature = NIL;
            SubLObject amt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            nature = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            amt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PCASE, nature, list($HOURS, listS(CLET, list(list($bbn_time_limit$, list(UNIVERSAL_TIME_SECONDS_FROM_NOW, listS($sym35$_, amt, $list_alt36)))), $list_alt37, append(body, NIL))), list($MINUTES, listS(CLET, list(list($bbn_time_limit$, list(UNIVERSAL_TIME_SECONDS_FROM_NOW, listS($sym35$_, amt, $list_alt39)))), $list_alt37, append(body, NIL))), list($SECONDS, listS(CLET, list(list($bbn_time_limit$, list(UNIVERSAL_TIME_SECONDS_FROM_NOW, amt))), $list_alt37, append(body, NIL))));
            }
        }
    }

    public static final SubLObject bbn_cinc_time_limit(SubLObject amt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!amt.isInteger()) {
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt41$can_only_add_an_integer_of_second), UNPROVIDED), new SubLObject[]{ NIL, NIL, NIL });
                }
                return NIL;
            }
            if ($bbn_time_cinc$.getDynamicValue(thread).isInteger()) {
                $bbn_time_limit$.setDynamicValue(add($bbn_time_limit$.getDynamicValue(thread), amt), thread);
            } else {
                $bbn_time_cinc$.setDynamicValue(amt, thread);
            }
            return $bbn_time_cinc$.getDynamicValue(thread);
        }
    }

    public static final SubLObject bbn_abort_asap() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $bbn_abortP$.setDynamicValue(T, thread);
            return $bbn_abortP$.getDynamicValue(thread);
        }
    }

    public static final SubLObject bbn_time_limit_exceededP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $bbn_time_cinc$.getDynamicValue(thread)) {
                if ($bbn_time_limit$.getDynamicValue(thread).isInteger()) {
                    $bbn_time_limit$.setDynamicValue(add($bbn_time_limit$.getDynamicValue(thread), $bbn_time_cinc$.getDynamicValue(thread)), thread);
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt42$New_time_limit__the_system_will_s), UNPROVIDED), new SubLObject[]{ pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date($bbn_time_limit$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL });
                    }
                }
                $bbn_time_cinc$.setDynamicValue(NIL, thread);
            }
            if (NIL != $bbn_abortP$.getDynamicValue(thread)) {
                $bbn_abortP$.setDynamicValue(NIL, thread);
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt43$Run_aborted_at__A__), UNPROVIDED), new SubLObject[]{ pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL });
                }
                if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                    format($bbn_log_stream$.getDynamicValue(thread), $str_alt44$__Run_aborted_at__A__, pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    bbn_force_output(UNPROVIDED);
                }
                return T;
            }
            if ((NIL != $bbn_time_limit$.getDynamicValue(thread)) && get_universal_time().numG($bbn_time_limit$.getDynamicValue(thread))) {
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt45$Time_limit_exceeded_at__A__), UNPROVIDED), new SubLObject[]{ pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL });
                }
                if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                    format($bbn_log_stream$.getDynamicValue(thread), $str_alt46$__Time_limit_exceeded_at__A__, pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    bbn_force_output(UNPROVIDED);
                }
                return T;
            }
            return NIL;
        }
    }

    public static final SubLObject within_bbn_document_context(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject doc = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            doc = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, list(list($bbn_most_relevant_document$, list(FWHEN, list(SCHEMA_OBJECT_FN_EXPRESSION_P, doc), doc))), list(PWHEN, listS(CAND, doc, $list_alt52), list(CLET, $list_alt53, listS(FORMAT, T, $str_alt54$___Beginning_BBN_document__A_at__, doc, $list_alt55), listS(FORMAT, $bbn_log_stream$, $str_alt54$___Beginning_BBN_document__A_at__, doc, $list_alt55))), list(WITH_BBN_METRICS_STORE_FOR_DOCUMENT, list(doc), bq_cons(PROGN, append(body, NIL))));
            }
        }
    }

    public static final SubLObject with_bbn_relevant_string(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject str = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    str = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, list(list($bbn_most_relevant_string$, str)), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt58);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject bbn_unknown_predicate_p(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(pred.eql($bbn_unknown_pred$.getDynamicValue(thread)) || (NIL != sksi_kb_accessors.schema_object_fn_expression_p(pred)));
        }
    }

    public static final SubLObject bbn_known_predicate_p(SubLObject pred) {
        return makeBoolean(!((NIL == pred) || (NIL != bbn_unknown_predicate_p(pred))));
    }

    public static final SubLObject bbn_reified_schema_term_p(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_sentence_is_trueP(list($$thereExists, $sym61$_SCHEMA, list($$reifiedAsForEfficiency, $sym61$_SCHEMA, v_term)), $bbn_bookkeeping_mt$.getDynamicValue(thread));
        }
    }

    public static final SubLObject bbn_clear_everything() {
        bbn_clear_cached_queries();
        return bbn_clear_temporary_formulas(UNPROVIDED);
    }

    public static final SubLObject bbn_clear_cached_queries() {
        clear_bbn_cached_entity_type_conversions();
        clear_bbn_ask_template_cached();
        clear_bbn_ask_variable_cached();
        clear_get_bbn_document_hypotheses();
        clear_bbn_content_mt_of();
        clear_bbn_deduce_entity_headstring();
        clear_get_bbn_term_references();
        return T;
    }



    public static final SubLObject clear_bbn_content_mt_of() {
        {
            SubLObject cs = $bbn_content_mt_of_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_bbn_content_mt_of(SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($bbn_content_mt_of_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_content_mt_of_internal(SubLObject mt) {
        {
            SubLObject content_mt = (NIL != bbn_isaP(mt, $$StructuredKnowledgeSource)) ? ((SubLObject) (list($$ContentMtFn, mt))) : mt;
            SubLObject content_nart = (NIL != constant_handles.constant_p(mt)) ? ((SubLObject) (NIL)) : narts_high.find_nart(content_mt);
            return NIL != content_nart ? ((SubLObject) (content_nart)) : content_mt;
        }
    }

    public static final SubLObject bbn_content_mt_of(SubLObject mt) {
        {
            SubLObject caching_state = $bbn_content_mt_of_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(BBN_CONTENT_MT_OF, $bbn_content_mt_of_caching_state$, NIL, EQUALP, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw67$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(bbn_content_mt_of_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $bbn_failed_randomizer_tolerance$ = makeSymbol("*BBN-FAILED-RANDOMIZER-TOLERANCE*");

    public static final SubLObject random_bbn_document(SubLObject max_hyp, SubLObject slowP, SubLObject tracker) {
        if (max_hyp == UNPROVIDED) {
            max_hyp = NIL;
        }
        if (slowP == UNPROVIDED) {
            slowP = NIL;
        }
        if (tracker == UNPROVIDED) {
            tracker = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (tracker.numG($bbn_failed_randomizer_tolerance$.getDynamicValue(thread))) {
                Errors.warn($str_alt68$Too_many___S__failed_attempts_to_, tracker, max_hyp);
                return NIL;
            }
            {
                SubLObject chosen = list_utilities.random_element(get_bbn_documents(makeBoolean(NIL == slowP)));
                SubLObject num_hyp = length(get_bbn_document_hypotheses(chosen));
                if (num_hyp.numE(ZERO_INTEGER) || (max_hyp.isNumber() && num_hyp.numG(max_hyp))) {
                    tracker = add(tracker, ONE_INTEGER);
                    return random_bbn_document(max_hyp, slowP, tracker);
                } else {
                    return chosen;
                }
            }
        }
    }

    /**
     *
     *
     * @param WHATEVER
     * 		; generate output if this is non-nil
     * @param STREAM
     * 		; same as @see format arg1
     * @param INSTRUCTIONS
     * 		; same as @see format arg2
     * @param ARGS
     * 		; the args to be processed during instructions, if any
     * @unknown if WHATEVER is a stringp, the arg3 and arg4 are 'indented' by WHATEVER
    e.g., if it's "  ", the output will being with 2 spaces
     */
    public static final SubLObject bbn_format_when(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject check_var = NIL;
            SubLObject stream = NIL;
            SubLObject instructions = NIL;
            SubLObject arg1 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            check_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt69);
            stream = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt69);
            instructions = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt69);
            arg1 = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, check_var, listS(CHECK_TYPE, instructions, $list_alt71), list(FORMAT, stream, list(CCONCATENATE, $str_alt73$_A, instructions), listS(FIF, list(STRINGP, check_var), check_var, $list_alt76), arg1));
            } else {
                cdestructuring_bind_error(datum, $list_alt69);
            }
        }
        return NIL;
    }

    public static final SubLObject bbn_right_comma_trim(SubLObject the_string) {
        return Strings.string_right_trim($str_alt77$__, the_string);
    }

    // defparameter
    private static final SubLSymbol $bbn_strengthenings_performed$ = makeSymbol("*BBN-STRENGTHENINGS-PERFORMED*");

    public static final SubLObject bbn_note_verification_performed(SubLObject basis, SubLObject from, SubLObject to) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt78$_A___S_____S__), UNPROVIDED), new SubLObject[]{ basis, from, to });
            }
            return T;
        }
    }

    public static final SubLObject bbn_note_strengthening_done(SubLObject with_func, SubLObject from, SubLObject to) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt78$_A___S_____S__), UNPROVIDED), new SubLObject[]{ with_func, from, to });
            }
            $bbn_strengthenings_performed$.setDynamicValue(add($bbn_strengthenings_performed$.getDynamicValue(thread), ONE_INTEGER), thread);
            return T;
        }
    }

    public static final SubLObject bbn_count_strengthenings_done() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $bbn_strengthenings_performed$.getDynamicValue(thread);
        }
    }

    public static final SubLObject bbn_while_counting_strengthenings(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject counter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    counter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt80, append(body, list(listS(CSETQ, counter, $list_alt82))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt79);
                    }
                }
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $bbn_strengthening_problem_store$ = makeSymbol("*BBN-STRENGTHENING-PROBLEM-STORE*");

    public static final SubLObject bbn_strengthening_problem_store_properties() {
        return NIL;
    }

    public static final SubLObject find_or_create_bbn_strengthening_problem_store() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p($bbn_strengthening_problem_store$.getDynamicValue(thread))) {
                return $bbn_strengthening_problem_store$.getDynamicValue(thread);
            } else {
                return inference_datastructures_problem_store.new_problem_store(bbn_strengthening_problem_store_properties());
            }
        }
    }

    public static final SubLObject bbn_strengthening_query_properties() {
        {
            SubLObject problem_store = find_or_create_bbn_strengthening_problem_store();
            return putf($list_alt83, $PROBLEM_STORE, problem_store);
        }
    }



    public static final SubLObject clear_bbn_ask_template_cached() {
        {
            SubLObject cs = $bbn_ask_template_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_bbn_ask_template_cached(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($bbn_ask_template_cached_caching_state$.getGlobalValue(), list(variable, sentence, mt, v_properties), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_ask_template_cached_internal(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        return bbn_ask_variable(variable, sentence, mt, v_properties);
    }

    public static final SubLObject bbn_ask_template_cached(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject caching_state = $bbn_ask_template_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(BBN_ASK_TEMPLATE_CACHED, $bbn_ask_template_cached_caching_state$, NIL, EQUAL, FOUR_INTEGER, $int$64);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(variable, sentence, mt, v_properties);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (variable.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (sentence.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(bbn_ask_template_cached_internal(variable, sentence, mt, v_properties)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(variable, sentence, mt, v_properties));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject bbn_ask_template_internal(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_properties = append(putf(putf(bbn_strengthening_query_properties(), $RETURN, list($TEMPLATE, template)), $BROWSABLE_, T), v_properties);
                SubLObject inference_suspend_status = NIL;
                SubLObject the_answer = NIL;
                SubLObject the_inference = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject the_answer_1 = inference_kernel.new_cyc_query(sentence, mt, query_properties);
                    SubLObject inference_suspend_status_2 = thread.secondMultipleValue();
                    SubLObject the_inference_3 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    the_answer = the_answer_1;
                    inference_suspend_status = inference_suspend_status_2;
                    the_inference = the_inference_3;
                }
                if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(inference_suspend_status)) {
                    bbn_strengthening_metrics.bbn_increment_strengthening_metric($ERRORS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject assertions_used = set.new_set(UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(inference_datastructures_inference.inference_new_answer_justifications(the_inference));
                    SubLObject justification = NIL;
                    for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_4 = inference_datastructures_inference.inference_answer_justification_supports(justification);
                            SubLObject support = NIL;
                            for (support = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , support = cdolist_list_var_4.first()) {
                                bbn_find_assertions_for_support(support, assertions_used, UNPROVIDED);
                            }
                        }
                    }
                    {
                        SubLObject assertions_used_count = set.set_size(assertions_used);
                        if (assertions_used_count.isPositive()) {
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($ASSERTIONS_USED, assertions_used_count, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                inference_datastructures_inference.destroy_inference(the_inference);
                return the_answer;
            }
        }
    }

    public static final SubLObject bbn_ask_template(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return bbn_ask_template_internal(template, sentence, mt, v_properties);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, BBN_ASK_TEMPLATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), BBN_ASK_TEMPLATE, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, BBN_ASK_TEMPLATE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(template, sentence, mt, v_properties);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (sentence.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(bbn_ask_template_internal(template, sentence, mt, v_properties)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, sentence, mt, v_properties));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject bbn_find_assertions_for_support(SubLObject support, SubLObject known_assertions, SubLObject seen) {
        if (known_assertions == UNPROVIDED) {
            known_assertions = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        if (seen == UNPROVIDED) {
            seen = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        set.set_add(support, seen);
        if (NIL != assertion_handles.assertion_p(support)) {
            set.set_add(support, known_assertions);
        } else
            if (NIL != arguments.hl_support_p(support)) {
                {
                    SubLObject meta_supports = hl_supports.hl_justify(support);
                    if (meta_supports.isList()) {
                        {
                            SubLObject cdolist_list_var = meta_supports;
                            SubLObject meta_support = NIL;
                            for (meta_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_support = cdolist_list_var.first()) {
                                if (NIL == set.set_memberP(meta_support, seen)) {
                                    set.set_add(meta_support, seen);
                                    bbn_find_assertions_for_support(meta_support, known_assertions, seen);
                                }
                            }
                        }
                    }
                }
            }

        return known_assertions;
    }



    public static final SubLObject clear_bbn_ask_variable_cached() {
        {
            SubLObject cs = $bbn_ask_variable_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_bbn_ask_variable_cached(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($bbn_ask_variable_cached_caching_state$.getGlobalValue(), list(variable, sentence, mt, v_properties), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_ask_variable_cached_internal(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        return bbn_ask_variable(variable, sentence, mt, v_properties);
    }

    public static final SubLObject bbn_ask_variable_cached(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject caching_state = $bbn_ask_variable_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(BBN_ASK_VARIABLE_CACHED, $bbn_ask_variable_cached_caching_state$, NIL, EQUALP, FOUR_INTEGER, $int$64);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(variable, sentence, mt, v_properties);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (variable.equalp(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (sentence.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equalp(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(bbn_ask_variable_cached_internal(variable, sentence, mt, v_properties)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(variable, sentence, mt, v_properties));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject bbn_ask_variable(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return bbn_ask_template(variable, sentence, mt, v_properties);
    }

    public static final SubLObject with_bbn_strengthening_problem_store_reuse(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt96, bq_cons(WITH_POSSIBLY_NEW_MEMOIZATION_STATE, append(body, NIL)));
        }
    }

    public static final SubLObject bbn_ask_variable_traced(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return bbn_ask_variable_cached_internal(variable, sentence, mt, v_properties);
    }

    public static final SubLObject bbn_ask_template_traced(SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return bbn_ask_template_cached_internal(variable, sentence, mt, v_properties);
    }

    // defparameter
    private static final SubLSymbol $bbn_sksi_ask$ = makeSymbol("*BBN-SKSI-ASK*");

    // defparameter
    private static final SubLSymbol $bbn_sksi_inquire$ = makeSymbol("*BBN-SKSI-INQUIRE*");

    // defparameter
    private static final SubLSymbol $bbn_sksi_demand_answers$ = makeSymbol("*BBN-SKSI-DEMAND-ANSWERS*");

    public static final SubLObject bbn_ask_template_sksi(SubLObject patience, SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $$BBN_KS;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = bbn_content_mt_of(mt);
                SubLObject the_answer = NIL;
                SubLObject naps = NIL;
                for (naps = ZERO_INTEGER; naps.numL(patience); naps = add(naps, ONE_INTEGER)) {
                    if (!naps.numE(ZERO_INTEGER)) {
                        if (naps.numG(THREE_INTEGER)) {
                            if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt99$query_for__A_taking_nap___A__), UNPROVIDED), new SubLObject[]{ variable, naps, NIL });
                            }
                        }
                        sleep(multiply(naps, add(naps, ONE_INTEGER)));
                    }
                    the_answer = bbn_ask_template(variable, sentence, content_mt, v_properties);
                    if (NIL != the_answer) {
                        return the_answer;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject bbn_ask_variable_sksi(SubLObject patience, SubLObject variable, SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $$BBN_KS;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return bbn_ask_template_sksi(patience, variable, sentence, mt, cons($PRODUCTIVITY_LIMIT, cons($POSITIVE_INFINITY, v_properties)));
    }

    /**
     *
     *
     * @param LISTP
     * 		of EL-FORMULA-P, or LISTP of same
     * @return EL-SENTENCE-ASSERTIBLE? ; all the individual formulas with an #$and at the front
     */
    public static final SubLObject bbn_compose_conjoined_query(SubLObject list_of_items) {
        if (NIL != list_utilities.proper_list_p(list_of_items)) {
            {
                SubLObject the_query = list($$and);
                SubLObject cdolist_list_var = list_of_items;
                SubLObject this_item = NIL;
                for (this_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_item = cdolist_list_var.first()) {
                    if (this_item.first().isList()) {
                        {
                            SubLObject cdolist_list_var_5 = this_item;
                            SubLObject this_formula = NIL;
                            for (this_formula = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , this_formula = cdolist_list_var_5.first()) {
                                the_query = cons(this_formula, the_query);
                            }
                        }
                    } else
                        if (NIL != el_utilities.el_formula_p(this_item)) {
                            the_query = cons(this_item, the_query);
                        }

                }
                return reverse(the_query);
            }
        }
        return NIL;
    }

    public static final SubLObject with_bbn_rewrite_backtracking(SubLObject raw_query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject revised_query = NIL;
                SubLObject cdolist_list_var = raw_query;
                SubLObject this_term = NIL;
                for (this_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_term = cdolist_list_var.first()) {
                    if (this_term.isList()) {
                        revised_query = cons(with_bbn_rewrite_backtracking(this_term), revised_query);
                    } else {
                        {
                            SubLObject rewrite = bbn_ask_variable($sym103$_REWRITE, list($bbn_equality_predicate$.getDynamicValue(thread), $sym103$_REWRITE, this_term), UNPROVIDED, UNPROVIDED).first();
                            revised_query = cons(NIL != rewrite ? ((SubLObject) (rewrite)) : this_term, revised_query);
                        }
                    }
                }
                return reverse(revised_query);
            }
        }
    }

    public static final SubLObject bbn_sentence_is_trueP(SubLObject the_query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if (NIL == the_query) {
            return NIL;
        }
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(the_query, mt, UNPROVIDED));
    }

    public static final SubLObject bbn_sentence_is_falseP(SubLObject the_query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        return equal(bbn_ask_variable($sym104$_TRUTH, listS($$sentenceTruth, the_query, $list_alt106), mt, UNPROVIDED), $list_alt107);
    }

    public static final SubLObject bbn_isaP(SubLObject ind, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(with_bbn_rewrite_backtracking(list($$isa, ind, col)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED));
        }
    }

    /**
     *
     *
     * @return KEYWORDP if individual IND is known to not be an instance of collection COL
    :simply-false = cyc can prove it's not true
    :contradictory-cardinality = col was (GroupOfCardinalityFn TYPE X), but IND is known
    to be a TYPE group of cardinality Y, and X != Y
     */
    public static final SubLObject bbn_isa_prohibitedP(SubLObject ind, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != bbn_sentence_is_trueP(with_bbn_rewrite_backtracking(list($$not, list($$isa, ind, col))), UNPROVIDED)) {
                return $SIMPLY_FALSE;
            }
            if (NIL == el_utilities.el_formula_p(col)) {
                return NIL;
            }
            {
                SubLObject argnum = ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(col, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject this_arg = NIL;
                for (this_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_arg = cdolist_list_var.first()) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == at_admitted.admitted_argumentP(this_arg, argnum, cycl_utilities.formula_arg0(col), $bbn_bookkeeping_mt$.getDynamicValue(thread))) {
                        return $BAD_ARGUMENT;
                    }
                }
            }
            if (NIL != el_utilities.el_binary_formula_p(col)) {
                {
                    SubLObject datum = col;
                    SubLObject current = datum;
                    SubLObject functor = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    functor = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    arg2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (functor.eql($$GroupOfCardinalityFn)) {
                            {
                                SubLObject known_cardinality = bbn_ask_variable($sym115$_X, with_bbn_rewrite_backtracking(list($$isa, ind, list($$GroupOfCardinalityFn, arg1, $sym115$_X))), $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED).first();
                                if ((NIL != known_cardinality) && (!known_cardinality.numE(arg2))) {
                                    return $CONTRADICTORY_CARDINALITY;
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt113);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return BOOLEANP ; return T iff the *strengthened* isa's on indiv are disjoint with col
     * @unknown it's not clear to me this is needed anymore, what with rewrite backtracking
    and no longer being forced to query in (descendents of) ContentMtFn's
     */
    public static final SubLObject bbn_isa_strongly_prohibitedP(SubLObject ind, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = bbn_ask_variable($sym118$_COL, list($$ist_Asserted, $bbn_strengthening_mt$.getDynamicValue(thread), listS($$isa, ind, $list_alt120)), UNPROVIDED, UNPROVIDED);
                SubLObject strong_col = NIL;
                for (strong_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strong_col = cdolist_list_var.first()) {
                    if (NIL != bbn_sentence_is_trueP(list($$disjointWith, col, strong_col), UNPROVIDED)) {
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject bbn_get_asserted_isas(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_set = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = cons(v_term, bbn_ask_variable($sym124$_CONSTANT, list($$ist_Asserted, $bbn_verification_mt$.getDynamicValue(thread), listS($$equals, v_term, $list_alt126)), UNPROVIDED, UNPROVIDED));
                SubLObject this_term = NIL;
                for (this_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_term = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_6 = bbn_ask_variable($sym118$_COL, list($$and, list($$ist_Asserted, $sym121$_MT, listS($$isa, this_term, $list_alt120)), listS($$genlMt, $bbn_strengthening_mt$.getDynamicValue(thread), $list_alt123)), $bbn_strengthening_mt$.getDynamicValue(thread), UNPROVIDED);
                        SubLObject this_col = NIL;
                        for (this_col = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , this_col = cdolist_list_var_6.first()) {
                            set.set_add(this_col, isa_set);
                        }
                    }
                }
                return set.set_element_list(isa_set);
            }
        }
    }

    public static final SubLObject bbn_isa_assertedP(SubLObject indiv, SubLObject col) {
        return subl_promotions.memberP(col, bbn_get_asserted_isas(indiv), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_equals_possiblyP(SubLObject v_term, SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(NIL == list_utilities.sublisp_boolean(bbn_ask_variable_cached($sym118$_COL, list($$and, list($$ist_Asserted, $bbn_verification_mt$.getDynamicValue(thread), listS($$isa, v_term, $list_alt120)), list($$not, listS($$isa, constant, $list_alt120))), UNPROVIDED, UNPROVIDED)));
        }
    }

    /**
     *
     *
     * @param stringp
     * 		; to do a modified #$termStrings query on
     * @return the results of a case-sensitive #$termStrings query, as two values,
    the second one being just those due to #$nicknames
     */
    public static final SubLObject bbn_find_term_strings(SubLObject string, SubLObject use_this) {
        if (use_this == UNPROVIDED) {
            use_this = $$termStrings;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject true_denots = NIL;
                SubLObject nicknames = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                    try {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
                        {
                            SubLObject cdolist_list_var = ask_utilities.ask_variable($sym130$_DENOT, list(use_this, $sym130$_DENOT, string), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject denot = NIL;
                            for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                if (NIL != bbn_sentence_is_trueP(list($$nicknames, denot, string), $bbn_lexical_mt$.getDynamicValue(thread))) {
                                    nicknames = cons(denot, nicknames);
                                } else {
                                    true_denots = cons(denot, true_denots);
                                }
                            }
                        }
                    } finally {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(true_denots, nicknames);
            }
        }
    }

    /**
     *
     *
     * @param a
     * 		list of #$Terms
     * @param a
     * 		string
     * @return the sublist of terms which appear in the arg2's @see bbn-find-term-strings
     */
    public static final SubLObject bbn_confirmed_term_strings(SubLObject terms, SubLObject the_string) {
        return intersection(terms, bbn_find_term_strings(the_string, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_find_term_phrases(SubLObject string, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $$nounStrings;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denots = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                    try {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
                        denots = ask_utilities.ask_variable($sym130$_DENOT, list($$termPhrases, $sym130$_DENOT, limit, string), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
                    }
                }
                return denots;
            }
        }
    }

    public static final SubLObject bbn_find_places_with_name(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject places = bbn_ask_variable_cached($sym133$_PLACE, list($$ist_Asserted, $sym121$_MT, list($$placeName_Standard, $sym133$_PLACE, name)), $bbn_lexical_mt$.getDynamicValue(thread), $list_alt135);
                SubLObject cdolist_list_var = bbn_ask_variable_cached($sym133$_PLACE, list($$or, list($$placeName_ShortForm, $sym133$_PLACE, name), list($$placeName_LocalLongForm, $sym133$_PLACE, name), list($$placeName_LocalShortForm, $sym133$_PLACE, name), list($$placeName_WithRegionAbbreviation, $sym133$_PLACE, name)), $bbn_lexical_mt$.getDynamicValue(thread), $list_alt135);
                SubLObject this_place = NIL;
                for (this_place = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_place = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(this_place, places, symbol_function(EQUALP), UNPROVIDED)) {
                        places = cons(this_place, places);
                    }
                }
                return places;
            }
        }
    }

    /**
     *
     *
     * @param a
     * 		list of #$Terms
     * @param a
     * 		string
     * @param an
     * 		optional arg2 for @see #$termPhrases
     * @return the sublist of terms which appear in the arg2's @see bbn-find-term-phrases
     */
    public static final SubLObject bbn_confirmed_term_phrases(SubLObject terms, SubLObject the_string, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = $$nounStrings;
        }
        return intersection(terms, bbn_find_term_phrases(the_string, limit), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_admitted_cde_termP(SubLObject the_term, SubLObject the_arg, SubLObject the_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(bbn_ask_variable_cached($sym118$_COL, list($$thereExists, $sym141$_ISA, listS($$and, list($$ist_Asserted, $sym121$_MT, listS($$isa, the_term, $list_alt120)), listS($$genlMt, $bbn_strengthening_mt$.getDynamicValue(thread), $list_alt123), listS($$argIsa, the_pred, the_arg, $list_alt143), $list_alt144)), $bbn_strengthening_mt$.getDynamicValue(thread), UNPROVIDED));
        }
    }

    public static final SubLObject bbn_admitted_generallyP(SubLObject the_col, SubLObject the_arg, SubLObject the_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(bbn_ask_variable_cached($sym118$_COL, list($$and, list($$ist_Asserted, $sym121$_MT, listS($$argIsa, the_pred, the_arg, $list_alt120)), list($$or, listS($$equals, the_col, $list_alt120), listS($$genls, the_col, $list_alt120))), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED));
        }
    }

    public static final SubLObject bbn_plausible_gafP(SubLObject candidate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.formula_arg0(candidate);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(candidate, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject this_arg = NIL;
                for (this_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_arg = cdolist_list_var.first()) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(this_arg)) {
                        if (NIL == bbn_admitted_cde_termP(this_arg, argnum, pred)) {
                            return NIL;
                        }
                    } else {
                        if (NIL == cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$admittedArgument, this_arg, argnum, pred), $bbn_strengthening_mt$.getDynamicValue(thread), UNPROVIDED))) {
                            return NIL;
                        }
                    }
                }
                return T;
            }
        }
    }

    public static final SubLObject do_bbn_documents_as_list(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt147);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    v_document = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt147);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt147);
                            if (NIL == member(current_7, $list_alt148, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt147);
                        }
                        {
                            SubLObject randomizeP_tail = property_list_member($kw150$RANDOMIZE_, current);
                            SubLObject randomizeP = (NIL != randomizeP_tail) ? ((SubLObject) (cadr(randomizeP_tail))) : T;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject documents = $sym151$DOCUMENTS;
                                return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, list(CLET, list(bq_cons(documents, $list_alt153)), list(PWHEN, randomizeP, list(CSETQ, documents, list(RANDOMIZE_LIST, documents))), listS(CDOLIST, list(v_document, documents), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject do_bbn_documents(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_document = NIL;
                    SubLObject doc_num = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt156);
                    v_document = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt156);
                    doc_num = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt156);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt156);
                            if (NIL == member(current_8, $list_alt157, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt156);
                        }
                        {
                            SubLObject every_tail = property_list_member($EVERY, current);
                            SubLObject every = (NIL != every_tail) ? ((SubLObject) (cadr(every_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject document_count = $sym159$DOCUMENT_COUNT;
                                return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, list(CLET, list(bq_cons(document_count, $list_alt160)), list(CDOTIMES, list(doc_num, document_count), list(PWHEN, list(COR, list(NULL, every), list(INTEGERP, list($sym164$_, doc_num, every))), list(CLET, list(list(v_document, list($sym165$BBN_DOCUMENT_NUMBER_HAS_TEXT_, doc_num))), listS(PWHEN, v_document, append(body, NIL)))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param SCHEMA-OBJECT-FN-EXPRESSION-P
     * 		; the document to check
     * @return BOOLEANP ; whether it does or not
     */
    public static final SubLObject bbn_document_has_textP(SubLObject this_doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(bbn_ask_variable_sksi($bbn_sksi_ask$.getDynamicValue(thread), $sym166$_TEXT, listS($$textOfWork, this_doc, $list_alt168), $list_alt169, UNPROVIDED));
        }
    }

    /**
     *
     *
     * @param INTEGERP;
     * 		the CDE-document-LS to check
     * @return SCHEMA-OBJECT-FN-EXPRESSION-P ; the doc's NAT, iff it has any text
     */
    public static final SubLObject bbn_document_number_has_textP(SubLObject i) {
        {
            SubLObject this_doc = list($$SchemaObjectFn, $$CDE_document_LS, i);
            if (NIL != bbn_document_has_textP(this_doc)) {
                return this_doc;
            }
        }
        return NIL;
    }

    public static final SubLObject count_bbn_documents() {
        return $int$4500;
    }

    public static final SubLObject get_bbn_documents(SubLObject fastP) {
        if (fastP == UNPROVIDED) {
            fastP = NIL;
        }
        return funcall(NIL != fastP ? ((SubLObject) (symbol_function(BBN_ASK_VARIABLE_CACHED))) : symbol_function(BBN_ASK_VARIABLE), $sym176$_DOCUMENT, $list_alt177, $list_alt169, $list_alt178);
    }

    public static final SubLObject do_bbn_document_hypotheses(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt179);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hypothesis = NIL;
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt179);
                    hypothesis = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt179);
                    v_document = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, listS(CDOLIST, list(hypothesis, list(GET_BBN_DOCUMENT_HYPOTHESES, v_document)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt179);
                    }
                }
            }
        }
        return NIL;
    }



    public static final SubLObject clear_get_bbn_document_hypotheses() {
        {
            SubLObject cs = $get_bbn_document_hypotheses_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_get_bbn_document_hypotheses(SubLObject v_document) {
        return memoization_state.caching_state_remove_function_results_with_args($get_bbn_document_hypotheses_caching_state$.getGlobalValue(), list(v_document), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_bbn_document_hypotheses_internal(SubLObject v_document) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym181$_HYPOTHESIS, list($$hypothesisAboutTextualPCW, $sym181$_HYPOTHESIS, v_document), $list_alt183, UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_document_hypotheses(SubLObject v_document) {
        {
            SubLObject caching_state = $get_bbn_document_hypotheses_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_BBN_DOCUMENT_HYPOTHESES, $get_bbn_document_hypotheses_caching_state$, NIL, EQUALP, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_document, $kw67$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(get_bbn_document_hypotheses_internal(v_document)));
                    memoization_state.caching_state_put(caching_state, v_document, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject count_bbn_document_hypotheses(SubLObject v_document) {
        return length(get_bbn_document_hypotheses(v_document));
    }

    public static final SubLObject do_bbn_hypothesis_entity_mentions(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt185);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject entity_mention = NIL;
                    SubLObject arg_num = NIL;
                    SubLObject hypothesis = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt185);
                    entity_mention = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt185);
                    arg_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt185);
                    hypothesis = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject pair = $sym186$PAIR;
                            return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, list(CDOLIST, list(pair, list(GET_BBN_HYPOTHESIS_ENTITY_MENTIONS, hypothesis)), listS(CDESTRUCTURING_BIND, list(entity_mention, arg_num), pair, list(IGNORE, arg_num), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt185);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject get_bbn_hypothesis_entity_mentions(SubLObject hypothesis, SubLObject strippedP, SubLObject attempts_remaining) {
        if (strippedP == UNPROVIDED) {
            strippedP = NIL;
        }
        if (attempts_remaining == UNPROVIDED) {
            attempts_remaining = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject args_and_nums = get_bbn_hypothesis_args(hypothesis);
                SubLObject answers = NIL;
                SubLObject database_silenceP = NIL;
                if (NIL == args_and_nums) {
                    return NIL;
                }
                if (NIL == database_silenceP) {
                    {
                        SubLObject csome_list_var = args_and_nums;
                        SubLObject this_one = NIL;
                        for (this_one = csome_list_var.first(); !((NIL != database_silenceP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , this_one = csome_list_var.first()) {
                            {
                                SubLObject datum = this_one;
                                SubLObject current = datum;
                                SubLObject hyp_arg = NIL;
                                SubLObject argnum = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt190);
                                hyp_arg = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt190);
                                argnum = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject entity_mention = bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym191$_EM, listS($$dependsOnEMHyp, hyp_arg, $list_alt193), $list_alt194, UNPROVIDED).first();
                                        if (NIL == entity_mention) {
                                            database_silenceP = T;
                                        } else
                                            if (NIL != strippedP) {
                                                answers = cons(entity_mention, answers);
                                            } else {
                                                answers = cons(list(entity_mention, argnum), answers);
                                            }

                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt190);
                                }
                            }
                        }
                    }
                }
                if (NIL == database_silenceP) {
                    return reverse(answers);
                } else
                    if (attempts_remaining.numL(ONE_INTEGER)) {
                        return NIL;
                    } else {
                        return get_bbn_hypothesis_entity_mentions(hypothesis, strippedP, subtract(attempts_remaining, ONE_INTEGER));
                    }

            }
        }
    }

    public static final SubLObject do_bbn_hypothesis_binary_sentences(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt195);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject binary_sentence = NIL;
                    SubLObject hypothesis = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt195);
                    binary_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt195);
                    hypothesis = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, listS(CDOLIST, list(binary_sentence, list(GET_BBN_HYPOTHESIS_BINARY_SENTENCES, hypothesis)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt195);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject get_bbn_hypothesis_binary_sentences(SubLObject hypothesis) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym197$_FORM, listS($$hypothesizedFormula, hypothesis, $list_alt199), $list_alt200, $list_alt201);
                SubLObject binaries = NIL;
                SubLObject cdolist_list_var = gafs;
                SubLObject this_gaf = NIL;
                for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                    if (NIL != el_utilities.el_binary_formula_p(this_gaf)) {
                        binaries = cons(this_gaf, binaries);
                    }
                }
                return reverse(binaries);
            }
        }
    }

    public static final SubLObject get_bbn_entity_mention_headstring(SubLObject entity_mention) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject head = bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym202$_HEADWORD_STRING, listS($$headwordStringForMention, list($$EntityMentionForHypothesisFn, entity_mention), $list_alt205), $list_alt206, UNPROVIDED).first();
                if (NIL == bbn_sentence_is_trueP(list($$thereExists, $sym207$_DIGIT, listS($$and, listS($$termStrings, head, $list_alt208), $list_alt209)), $bbn_lexical_mt$.getDynamicValue(thread))) {
                    return head;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject get_bbn_entity_mention_textstring(SubLObject entity_mention) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym202$_HEADWORD_STRING, listS($$originalPhrase, list($$EntityMentionForHypothesisFn, entity_mention), $list_alt205), $list_alt206, UNPROVIDED).first();
        }
    }

    /**
     * Wrapper function to string together the whole text and the headword of the mention,
     * e.g., "Egyptian police : police"
     */
    public static final SubLObject get_bbn_entity_mention_strings(SubLObject entity_mention) {
        return string_utilities.join_strings(list(get_bbn_entity_mention_textstring(entity_mention), get_bbn_entity_mention_headstring(entity_mention)), $str_alt211$___);
    }



    public static final SubLObject clear_bbn_deduce_entity_headstring() {
        {
            SubLObject cs = $bbn_deduce_entity_headstring_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_bbn_deduce_entity_headstring(SubLObject thingy) {
        return memoization_state.caching_state_remove_function_results_with_args($bbn_deduce_entity_headstring_caching_state$.getGlobalValue(), list(thingy), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_deduce_entity_headstring_internal(SubLObject thingy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (thingy.isString()) {
                return thingy;
            } else
                if (NIL != constant_handles.constant_p(thingy)) {
                    return ask_utilities.ask_variable($sym213$_STRING, listS($$termStrings, thingy, $list_alt214), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                } else
                    if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(thingy)) {
                        return get_bbn_entity_mention_headstring(thingy);
                    }


            return NIL;
        }
    }

    public static final SubLObject bbn_deduce_entity_headstring(SubLObject thingy) {
        {
            SubLObject caching_state = $bbn_deduce_entity_headstring_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(BBN_DEDUCE_ENTITY_HEADSTRING, $bbn_deduce_entity_headstring_caching_state$, NIL, EQUAL, ONE_INTEGER, EIGHT_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, thingy, $kw67$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(bbn_deduce_entity_headstring_internal(thingy)));
                    memoization_state.caching_state_put(caching_state, thingy, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject get_bbn_entity_mention_referents(SubLObject entity_mention) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym216$_REFERENT, listS($$hypothesizedReference, list($$EntityMentionForHypothesisFn, entity_mention), $list_alt218), $list_alt206, UNPROVIDED);
        }
    }



    public static final SubLObject clear_get_bbn_term_references() {
        {
            SubLObject cs = $get_bbn_term_references_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_get_bbn_term_references(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($get_bbn_term_references_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_bbn_term_references_internal(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject potentials = Mapping.mapcar(symbol_function(SECOND), bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym216$_REFERENT, list($$hypothesizedReference, $sym216$_REFERENT, v_term), $list_alt206, UNPROVIDED));
                SubLObject good = NIL;
                SubLObject cdolist_list_var = potentials;
                SubLObject em = NIL;
                for (em = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , em = cdolist_list_var.first()) {
                    if (NIL != bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym221$_HYP, list($$dependsOnEMHyp, $sym221$_HYP, em), $list_alt194, UNPROVIDED)) {
                        good = cons(em, good);
                    }
                }
                return good;
            }
        }
    }

    public static final SubLObject get_bbn_term_references(SubLObject v_term) {
        {
            SubLObject caching_state = $get_bbn_term_references_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_BBN_TERM_REFERENCES, $get_bbn_term_references_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$32);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw67$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(get_bbn_term_references_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject get_bbn_term_longest_string(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Sort.sort(bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym224$_THIS_STRING, listS($$termStrings, v_term, $list_alt225), $list_alt206, UNPROVIDED), symbol_function($sym226$_), symbol_function(LENGTH)).first();
        }
    }

    public static final SubLObject get_bbn_term_preferred_string(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym213$_STRING, listS($$preferredTermStrings, v_term, $list_alt214), $list_alt229, UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_term_all_strings(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym213$_STRING, listS($$termStrings, v_term, $list_alt214), $list_alt206, UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_reified_term_strings(SubLObject v_term, SubLObject splitP) {
        if (splitP == UNPROVIDED) {
            splitP = NIL;
        }
        {
            SubLObject strings = list(get_bbn_reified_term_primary_strings(v_term), get_bbn_reified_term_secondary_strings(v_term));
            return NIL != splitP ? ((SubLObject) (strings)) : list_utilities.flatten(strings);
        }
    }

    public static final SubLObject get_bbn_reified_term_primary_strings(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable($sym213$_STRING, listS($$bbnCoreStringAssertion, v_term, $list_alt214), $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_reified_term_secondary_strings(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable($sym213$_STRING, listS($$bbnOtherStringAssertions, v_term, $list_alt214), $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_schema_from_reified_term(SubLObject reified_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(reified_term)) {
                return reified_term;
            }
            return bbn_ask_variable($sym61$_SCHEMA, list($$reifiedAsForEfficiency, $sym61$_SCHEMA, reified_term), $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED).first();
        }
    }

    public static final SubLObject get_bbn_reified_term_from_schema(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable($sym232$_REIFIED, listS($$reifiedAsForEfficiency, v_term, $list_alt233), $bbn_bookkeeping_mt$.getDynamicValue(thread), $list_alt201).first();
        }
    }

    public static final SubLObject get_bbn_first_relevant_entity_mention_in_hypothesis(SubLObject v_term, SubLObject in_hyp) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_refs = get_bbn_term_references(get_bbn_schema_from_reified_term(v_term));
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                    try {
                        $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_9 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject cdolist_list_var = get_bbn_hypothesis_entity_mentions(in_hyp, UNPROVIDED, UNPROVIDED);
                                                SubLObject pair = NIL;
                                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = pair;
                                                        SubLObject current = datum;
                                                        SubLObject em = NIL;
                                                        SubLObject argnum = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt235);
                                                        em = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt235);
                                                        argnum = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL != subl_promotions.memberP(em, the_refs, symbol_function(EQUAL), UNPROVIDED)) {
                                                                v_answer = em;
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt235);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                        }
                    } finally {
                        $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject get_bbn_first_relevant_entity_mention_in_document(SubLObject v_term, SubLObject in_doc) {
        if (in_doc == UNPROVIDED) {
            in_doc = $bbn_most_relevant_document$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                    try {
                        $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_11 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject cdolist_list_var = get_bbn_document_hypotheses(in_doc);
                                                SubLObject hyp = NIL;
                                                for (hyp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hyp = cdolist_list_var.first()) {
                                                    if (NIL == v_answer) {
                                                        v_answer = get_bbn_first_relevant_entity_mention_in_hypothesis(v_term, hyp);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_11, thread);
                                }
                            }
                        }
                    } finally {
                        $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject get_bbn_term_headstring(SubLObject v_term) {
        return get_bbn_entity_mention_headstring(get_bbn_first_relevant_entity_mention_in_document(v_term, UNPROVIDED));
    }

    public static final SubLObject bbn_deduce_term_headstring(SubLObject thingy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (thingy.isString()) {
                return thingy;
            } else
                if (NIL != constant_handles.constant_p(thingy)) {
                    {
                        SubLObject orig_schema = get_bbn_schema_from_reified_term(thingy);
                        if (NIL != orig_schema) {
                            return get_bbn_term_headstring(orig_schema);
                        } else {
                            return ask_utilities.ask_variable($sym213$_STRING, listS($$termStrings, thingy, $list_alt214), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                        }
                    }
                } else
                    if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(thingy)) {
                        return get_bbn_term_headstring(thingy);
                    }


            return NIL;
        }
    }

    public static final SubLObject import_bbn_term_strings(SubLObject schema_term, SubLObject v_term, SubLObject with_sourcesP) {
        if (with_sourcesP == UNPROVIDED) {
            with_sourcesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject distinct_strings = ZERO_INTEGER;
                if (NIL != with_sourcesP) {
                    {
                        SubLObject cdolist_list_var = get_bbn_term_references(schema_term);
                        SubLObject this_em = NIL;
                        for (this_em = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_em = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_13 = bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym115$_X, list($$dependsOnEMHyp, $sym115$_X, this_em), $list_alt239, UNPROVIDED);
                                SubLObject hyp = NIL;
                                for (hyp = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , hyp = cdolist_list_var_13.first()) {
                                    if (cycl_utilities.formula_arg1(hyp, UNPROVIDED).eql($$CDE_hypothesis_LS)) {
                                        {
                                            SubLObject doc = bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym237$_DOC, listS($$hypothesisAboutTextualPCW, hyp, $list_alt238), $list_alt239, UNPROVIDED).first();
                                            SubLObject v_context = (NIL != doc) ? ((SubLObject) (doc)) : $bbn_most_relevant_document$.getDynamicValue(thread);
                                            {
                                                SubLObject _prev_bind_0 = $bbn_most_relevant_document$.currentBinding(thread);
                                                try {
                                                    $bbn_most_relevant_document$.bind(NIL != sksi_kb_accessors.schema_object_fn_expression_p(v_context) ? ((SubLObject) (v_context)) : NIL, thread);
                                                    if ((NIL != v_context) && (NIL != $bbn_log_stream$.getDynamicValue(thread))) {
                                                        {
                                                            SubLObject xyzdate = pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            format(T, $str_alt54$___Beginning_BBN_document__A_at__, v_context, xyzdate);
                                                            format($bbn_log_stream$.getDynamicValue(thread), $str_alt54$___Beginning_BBN_document__A_at__, v_context, xyzdate);
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_14 = bbn_strengthening_metrics.$bbn_metrics_store$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = $bbn_most_relevant_string$.currentBinding(thread);
                                                        try {
                                                            bbn_strengthening_metrics.$bbn_metrics_store$.bind(bbn_strengthening_metrics.new_bbn_metrics_store(v_context), thread);
                                                            $bbn_most_relevant_string$.bind(NIL, thread);
                                                            if (NIL != bbn_enter_bookkeeping_gaf(list($$bbnOtherStringAssertions, v_term, get_bbn_entity_mention_textstring(this_em)), UNPROVIDED)) {
                                                                distinct_strings = add(distinct_strings, ONE_INTEGER);
                                                            }
                                                        } finally {
                                                            $bbn_most_relevant_string$.rebind(_prev_bind_1, thread);
                                                            bbn_strengthening_metrics.$bbn_metrics_store$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                } finally {
                                                    $bbn_most_relevant_document$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = get_bbn_term_all_strings(schema_term);
                    SubLObject backup = NIL;
                    for (backup = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , backup = cdolist_list_var.first()) {
                        {
                            SubLObject _prev_bind_0 = $bbn_most_relevant_string$.currentBinding(thread);
                            try {
                                $bbn_most_relevant_string$.bind(NIL, thread);
                                if (NIL != bbn_enter_bookkeeping_gaf(list($$bbnOtherStringAssertions, v_term, backup), UNPROVIDED)) {
                                    distinct_strings = add(distinct_strings, ONE_INTEGER);
                                }
                            } finally {
                                $bbn_most_relevant_string$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return distinct_strings;
            }
        }
    }

    public static final SubLObject get_bbn_term_bbn_entity_types(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym240$_BBN_ENTITY_TYPE, listS($$isa_Hypothesized, v_term, $list_alt242), $list_alt229, UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_term_hyp_isas(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapped = NIL;
                SubLObject cdolist_list_var = Mapping.mapcar(BBN_MAP_ENTITY_TYPE_TO_COLLECTION, bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym240$_BBN_ENTITY_TYPE, listS($$isa_Hypothesized, v_term, $list_alt242), $list_alt229, UNPROVIDED));
                SubLObject mapping = NIL;
                for (mapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapping = cdolist_list_var.first()) {
                    if (NIL != mapping) {
                        mapped = cons(mapping, mapped);
                    }
                }
                return mapped;
            }
        }
    }



    public static final SubLObject clear_bbn_cached_entity_type_conversions() {
        return dictionary.clear_dictionary($bbn_cached_entity_type_conversions$.getGlobalValue());
    }

    public static final SubLObject bbn_map_entity_type_to_collection(SubLObject entity_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lookup = dictionary.dictionary_lookup($bbn_cached_entity_type_conversions$.getGlobalValue(), entity_type, UNPROVIDED);
                if (NIL == lookup) {
                    {
                        SubLObject entity_to_type = bbn_ask_variable_sksi($bbn_sksi_ask$.getDynamicValue(thread), $sym245$_CYCENTITY, list($$rewriteOf, $sym245$_CYCENTITY, entity_type), $list_alt246, UNPROVIDED).first();
                        SubLObject type_to_ours = (NIL != entity_to_type) ? ((SubLObject) (bbn_ask_variable_sksi($bbn_sksi_ask$.getDynamicValue(thread), $sym118$_COL, list($$rewriteOf, $sym118$_COL, entity_to_type), $list_alt247, UNPROVIDED).first())) : NIL;
                        lookup = type_to_ours;
                        dictionary.dictionary_enter($bbn_cached_entity_type_conversions$.getGlobalValue(), entity_type, lookup);
                    }
                }
                if (!lookup.eql($$Thing)) {
                    return lookup;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject get_bbn_entity_type_cyc_entities(SubLObject bbn_entity_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_ask$.getDynamicValue(thread), $sym249$_CYC_ENTITY, list($$rewriteOf, $sym249$_CYC_ENTITY, bbn_entity_type), $list_alt246, UNPROVIDED);
        }
    }

    public static final SubLObject get_cyc_entity_rewrites(SubLObject cyc_entity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_ask$.getDynamicValue(thread), $sym141$_ISA, list($$rewriteOf, $sym141$_ISA, cyc_entity), $list_alt247, UNPROVIDED);
        }
    }

    public static final SubLObject get_bbn_term_hyp_isas_to_gafs(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_gafs = NIL;
                SubLObject cdolist_list_var = bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym240$_BBN_ENTITY_TYPE, listS($$isa_Hypothesized, v_term, $list_alt242), $list_alt200, UNPROVIDED);
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    isa_gafs = cons(list($$isa, v_term, v_isa), isa_gafs);
                }
                return isa_gafs;
            }
        }
    }

    public static final SubLObject get_bbn_term_isas(SubLObject v_term) {
        {
            SubLObject isas = NIL;
            SubLObject cdolist_list_var = get_bbn_term_bbn_entity_types(v_term);
            SubLObject bbn_entity_type = NIL;
            for (bbn_entity_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bbn_entity_type = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_15 = get_bbn_entity_type_cyc_entities(bbn_entity_type);
                    SubLObject cyc_entity = NIL;
                    for (cyc_entity = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , cyc_entity = cdolist_list_var_15.first()) {
                        {
                            SubLObject cdolist_list_var_16 = get_cyc_entity_rewrites(cyc_entity);
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , v_isa = cdolist_list_var_16.first()) {
                                {
                                    SubLObject item_var = v_isa;
                                    if (NIL == member(item_var, isas, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        isas = cons(item_var, isas);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return isas;
        }
    }

    public static final SubLObject get_noun_wordforms_for_headstring(SubLObject headstring) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_template($list_alt250, list($$and, $list_alt251, list($$wordForms, $sym253$_WU, $sym197$_FORM, headstring)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject get_relational_noun_preds(SubLObject word, SubLObject pos_pred, SubLObject arg_num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable($sym254$_PRED, list($$thereExists, $sym255$_POS, list($$and, listS($$denotesArgInReln, word, $list_alt257), list($$speechPartPreds, $sym255$_POS, pos_pred))), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does HYPOTHESIS have an unknown predicate?
     */
    public static final SubLObject bbn_hypothesis_has_unknown_predicateP(SubLObject hypothesis) {
        {
            SubLObject ans = NIL;
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = get_bbn_hypothesis_binary_sentences(hypothesis);
                    SubLObject sentence = NIL;
                    for (sentence = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sentence = csome_list_var.first()) {
                        ans = bbn_unknown_predicate_p(cycl_utilities.formula_arg0(sentence));
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does DOCUMENT have a HYPOTHESIS with an unknown predicate?
     */
    public static final SubLObject bbn_document_has_unknown_predicateP(SubLObject v_document) {
        {
            SubLObject ans = NIL;
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = get_bbn_document_hypotheses(v_document);
                    SubLObject hyp = NIL;
                    for (hyp = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , hyp = csome_list_var.first()) {
                        ans = bbn_hypothesis_has_unknown_predicateP(hyp);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject get_bbn_hypothesis_relation_reference(SubLObject hypothesis) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_ask$.getDynamicValue(thread), $sym259$_RELATION_REFERENCE, listS($$dependsOnRMHyp, hypothesis, $list_alt261), $list_alt183, $list_alt201).first();
        }
    }

    public static final SubLObject get_bbn_relation_reference_hypothesis(SubLObject relation_reference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym181$_HYPOTHESIS, list($$dependsOnRMHyp, $sym181$_HYPOTHESIS, relation_reference), $list_alt183, $list_alt201).first();
        }
    }

    public static final SubLObject get_bbn_relation_reference_headstring(SubLObject relation_reference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym262$_HEAD_STRING, listS($$headwordStringForMention, list($$RelationMentionForHypothesisFn, relation_reference), $list_alt264), $list_alt265, $list_alt201).first();
        }
    }

    public static final SubLObject get_bbn_relation_reference_textstring(SubLObject relation_reference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != relation_reference) {
                return bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym213$_STRING, listS($$originalPhrase, list($$RelationMentionForHypothesisFn, relation_reference), $list_alt214), $list_alt265, $list_alt201).first();
            }
            return NIL;
        }
    }

    public static final SubLObject get_bbn_hypothesis_textstring(SubLObject hypothesis) {
        return get_bbn_relation_reference_textstring(get_bbn_hypothesis_relation_reference(hypothesis));
    }

    public static final SubLObject get_bbn_relation_reference_word_units(SubLObject relation_reference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_head = get_bbn_relation_reference_headstring(relation_reference);
                return bbn_ask_variable_cached($sym253$_WU, list($$wordForms, $sym253$_WU, $$verbStrings, the_head), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static final SubLObject verb_semtrans_assertions_for_string(SubLObject string) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXspeech_part(string, $$Verb, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject wu = NIL;
            for (wu = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , wu = cdolist_list_var.first()) {
                ans = append(ans, lexicon_accessors.semtrans_assertion_lookup(wu, $$Verb, UNPROVIDED));
            }
            return ans;
        }
    }

    public static final SubLObject do_bbn_hypothesis_args(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt195);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject binary_sentence = NIL;
                    SubLObject hypothesis = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt195);
                    binary_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt195);
                    hypothesis = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, listS(CDOLIST, list(binary_sentence, list(GET_BBN_HYPOTHESIS_ARGS, hypothesis)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt195);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject get_bbn_hypothesis_args(SubLObject hypothesis) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_args = NIL;
                SubLObject cdolist_list_var = bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym271$_HYP_ARG, listS($$dependsOnArgHyp, hypothesis, $list_alt273), $list_alt194, UNPROVIDED);
                SubLObject this_arg = NIL;
                for (this_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_arg = cdolist_list_var.first()) {
                    {
                        SubLObject the_num = bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym173$_N, listS($$argNumberForArgumentHypothesis, this_arg, $list_alt270), $list_alt194, UNPROVIDED);
                        if (NIL == the_num) {
                            return NIL;
                        }
                        the_args = cons(list(this_arg, the_num.first()), the_args);
                    }
                }
                return Sort.sort(the_args, symbol_function($sym274$_), symbol_function(SECOND));
            }
        }
    }



    public static final SubLObject semtrans_keyword_for_bbnargtype(SubLObject role_fn) {
        return list_utilities.alist_lookup($semtrans_keyword_bbnargtype_map$.getGlobalValue(), role_fn, symbol_function(EQUALP), NIL);
    }

    public static final SubLObject get_bbn_hypothesis_arg_roles(SubLObject hypothesis) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_roles = NIL;
                {
                    SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                    try {
                        $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_17 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject cdolist_list_var = get_bbn_hypothesis_args(hypothesis);
                                                SubLObject hyp_arg = NIL;
                                                for (hyp_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hyp_arg = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = hyp_arg;
                                                        SubLObject current = datum;
                                                        SubLObject the_arg = NIL;
                                                        SubLObject n = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt277);
                                                        the_arg = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt277);
                                                        n = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            {
                                                                SubLObject cdolist_list_var_18 = bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym278$_ROLE, listS($const279$grammaticalRoleForArgumentHypothe, the_arg, $list_alt280), $list_alt194, UNPROVIDED);
                                                                SubLObject this_role = NIL;
                                                                for (this_role = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , this_role = cdolist_list_var_18.first()) {
                                                                    the_roles = cons(this_role, the_roles);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt277);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_17, thread);
                                }
                            }
                        }
                    } finally {
                        $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != list_utilities.lengthE(the_roles, TWO_INTEGER, UNPROVIDED)) {
                    return reverse(the_roles);
                } else {
                    return list(NIL, NIL);
                }
            }
        }
    }

    public static final SubLObject get_bbn_hypothesis_arg_roles_mapped(SubLObject hypothesis) {
        return Mapping.mapcar(SEMTRANS_KEYWORD_FOR_BBNARGTYPE, get_bbn_hypothesis_arg_roles(hypothesis));
    }

    /**
     *
     *
     * @return LISTP; of (ENTITY-MENTION ROLE-MARKER) pairs.
     */
    public static final SubLObject get_bbn_relation_reference_dependents(SubLObject relation_reference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bbn_ask_template_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $list_alt282, listS($$grammaticalRoleWRTRelationMention, list($$RelationMentionForHypothesisFn, relation_reference), $list_alt284), $list_alt200, UNPROVIDED);
        }
    }



    public static final SubLObject semtrans_keyword_for_bbn_role_marker(SubLObject role_marker) {
        return list_utilities.alist_lookup($semtrans_keyword_bbn_role_marker_map$.getGlobalValue(), role_marker, symbol_function(EQL), NIL);
    }

    public static final SubLObject get_bbn_entity_mention_dependency(SubLObject entity_mention, SubLObject relation_reference) {
        {
            SubLObject cdolist_list_var = get_bbn_relation_reference_dependents(relation_reference);
            SubLObject this_dep = NIL;
            for (this_dep = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_dep = cdolist_list_var.first()) {
                if ((NIL != list_utilities.proper_list_p(this_dep)) && (NIL != list_utilities.lengthE(this_dep, TWO_INTEGER, UNPROVIDED))) {
                    {
                        SubLObject datum = this_dep;
                        SubLObject current = datum;
                        SubLObject the_entity = NIL;
                        SubLObject the_role = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt287);
                        the_entity = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt287);
                        the_role = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (the_entity.equalp(entity_mention)) {
                                return semtrans_keyword_for_bbn_role_marker(the_role);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt287);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param HYPOTHESIS
     * 		
     * @param EL-FORMULA-P
     * 		; the particular sentence we care about
     * @return LISTP of EL-FORMULA-P; possibly strengthened versions of the original,
    possibly add-on information. This function attempts to leverage #$verbSemTrans
    information for #$unknownReln-BBNRelnTypes. If a single sem-trans for the
    relation's strings is a match, return a list of all resulting gafs with
    the appropriate args plugged in for the keywords.
    Possibly (often?) returns NIL, i.e., no unambiguous match.
     */
    public static final SubLObject bbn_leverage_verb_sem_trans_for_unknown(SubLObject unknown_hyp, SubLObject unknown_gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_utilities.el_binary_formula_p(unknown_gaf)) {
                return NIL;
            }
            {
                SubLObject datum = unknown_gaf;
                SubLObject current = datum;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt288);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt288);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt288);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == bbn_unknown_predicate_p(pred)) {
                        return NIL;
                    }
                    {
                        SubLObject units = get_bbn_relation_reference_word_units(get_bbn_hypothesis_relation_reference(unknown_hyp));
                        if (NIL == units) {
                            return NIL;
                        }
                        {
                            SubLObject datum_20 = get_bbn_hypothesis_arg_roles_mapped(unknown_hyp);
                            SubLObject current_21 = datum_20;
                            SubLObject role1 = NIL;
                            SubLObject role2 = NIL;
                            destructuring_bind_must_consp(current_21, datum_20, $list_alt289);
                            role1 = current_21.first();
                            current_21 = current_21.rest();
                            destructuring_bind_must_consp(current_21, datum_20, $list_alt289);
                            role2 = current_21.first();
                            current_21 = current_21.rest();
                            if (NIL == current_21) {
                                if ((role1.eql($SUBJECT) && role2.eql($OBJECT)) || (role1.eql($ARG1) && role2.eql($ARG2))) {
                                    return bbn_leverage_verb_frame_for_unknown($$TransitiveNPFrame, units, arg1, $SUBJECT, arg2, $OBJECT);
                                } else
                                    if (role1.eql($SUBJECT) && role2.eql($OBLIQUE_OBJECT)) {
                                        {
                                            SubLObject cdolist_list_var = units;
                                            SubLObject this_wu = NIL;
                                            for (this_wu = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_wu = cdolist_list_var.first()) {
                                                {
                                                    SubLObject prep = bbn_ask_variable_cached($sym296$_PREP, listS($$prepCollocation, this_wu, $list_alt298), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED).first();
                                                    SubLObject gafs = (NIL != prep) ? ((SubLObject) (bbn_leverage_verb_frame_for_unknown(list($$PPCompFrameFn, $$DitransitivePPFrameType, prep), list(this_wu), arg1, role1, arg2, role2))) : NIL;
                                                    if (NIL != gafs) {
                                                        return gafs;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt301$can_t_leverage_verbSemTrans_for__), UNPROVIDED), new SubLObject[]{ units, list(role1, role2), NIL });
                                        }
                                    }

                            } else {
                                cdestructuring_bind_error(datum_20, $list_alt289);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt288);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject bbn_leverage_verb_frame_for_unknown(SubLObject frame, SubLObject tmp_units, SubLObject arg1, SubLObject role1, SubLObject arg2, SubLObject role2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word_units = cons($$TheList, tmp_units);
                SubLObject v_bindings = bbn_ask_variable_cached($sym303$_SEM_TRANS, list($$and, listS($$verbSemTrans, $sym253$_WU, $sym305$_WS, frame, $list_alt306), list($$memberOfList, $sym253$_WU, word_units), $list_alt308, listS($$termFormulas, role1, $list_alt310), listS($$termFormulas, role2, $list_alt310)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject substitutions = list(list(arg1, role1), list(arg2, role2));
                if (NIL != v_bindings) {
                    return bbn_sub_args_for_roles(v_bindings, substitutions, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-FORMULA-P
     * 		
     * @param LIST
     * 		of (TERM KEYWORDP) pairs
     * @param EVENT-P
     * 		; optional, a new action being created via semtrans
     * @return value 1 EL-FORMULA-P with each KEYWORDP replaced by the appropriate TERM
    or NIL if the formula is somehow impossible
    value 2 CONSTANT-P ; the :ACTION created, if any
     * @unknown if the same KEYWORDP is listed multiple times, only the first TERM will replace it
     */
    public static final SubLObject bbn_sub_args_for_roles(SubLObject input, SubLObject arg_role_pairs, SubLObject new_action) {
        if (new_action == UNPROVIDED) {
            new_action = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.list_of_list_p(input)) {
                {
                    SubLObject form_list = NIL;
                    SubLObject cdolist_list_var = input;
                    SubLObject this_form = NIL;
                    for (this_form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_form = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject form = bbn_sub_args_for_roles(this_form, arg_role_pairs, new_action);
                            SubLObject act = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != form) {
                                form_list = cons(form, form_list);
                                new_action = act;
                            }
                        }
                    }
                    return reverse(form_list);
                }
            }
            if (!((NIL != el_utilities.el_binary_formula_p(input)) || (NIL != el_utilities.el_logical_operator_formula_p(input)))) {
                return values(NIL, NIL);
            }
            {
                SubLObject workspace = input;
                {
                    SubLObject cdolist_list_var = arg_role_pairs;
                    SubLObject this_pair = NIL;
                    for (this_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_pair = cdolist_list_var.first()) {
                        {
                            SubLObject datum = this_pair;
                            SubLObject current = datum;
                            SubLObject arg = NIL;
                            SubLObject role = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt311);
                            arg = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt311);
                            role = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                workspace = bbn_ask_variable($sym312$_SUB, list($$evaluate, $sym312$_SUB, list($$SubstituteFormulaFn, arg, role, workspace)), UNPROVIDED, UNPROVIDED).first();
                            } else {
                                cdestructuring_bind_error(datum, $list_alt311);
                            }
                        }
                    }
                }
                if ((NIL != list_utilities.tree_find($ACTION, workspace, UNPROVIDED, UNPROVIDED)) && (NIL != el_utilities.el_logical_operator_formula_p(workspace))) {
                    {
                        SubLObject args = cycl_utilities.formula_args(workspace, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject this_gaf = NIL;
                        for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                            if (cycl_utilities.formula_arg0(this_gaf).eql($$isa)) {
                                {
                                    SubLObject isa_this = cycl_utilities.formula_arg2(this_gaf, UNPROVIDED);
                                    if (NIL == new_action) {
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind($bbn_strengthening_mt$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject base = subseq(string_utilities.fort_to_string(NIL != constant_handles.constant_p(isa_this) ? ((SubLObject) (isa_this)) : cycl_utilities.formula_arg0(isa_this)), TWO_INTEGER, UNPROVIDED);
                                                    SubLObject initial_name = constant_completion_high.uniquify_constant_name(base);
                                                    new_action = fi.fi_create_int(initial_name, UNPROVIDED);
                                                    if (NIL != constant_handles.constant_p(new_action)) {
                                                        {
                                                            SubLObject term_id = constants_high.constant_internal_id(new_action);
                                                            SubLObject final_name = format(NIL, $str_alt317$_A__A__A, new SubLObject[]{ $str_alt318$BBN_CDE, base, term_id });
                                                            fi.fi_rename_int(new_action, final_name);
                                                        }
                                                    }
                                                    if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                                                        format($bbn_log_stream$.getDynamicValue(thread), $str_alt319$Constant___A___, new_action);
                                                    }
                                                    bbn_enter_spontaneous_gaf(list($$nameString, new_action, string_utilities.bunge(list($$$some, pph_main.generate_phrase(isa_this, list($$simpleNounStrings), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED)), UNPROVIDED);
                                                }
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    bbn_enter_spontaneous_gaf(list($$isa, new_action, isa_this), UNPROVIDED);
                                }
                            }
                        }
                    }
                    workspace = list_utilities.tree_substitute(workspace, $ACTION, new_action);
                }
                if (NIL != el_utilities.el_logical_operator_formula_p(workspace)) {
                    workspace = workspace.rest();
                }
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt323$unknown_verb_workspace_is__S__), UNPROVIDED), new SubLObject[]{ workspace, NIL, NIL });
                }
                if (NIL != list_utilities.tree_find_if(symbol_function(KEYWORDP), workspace, UNPROVIDED)) {
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt325$throwing_away_unknown_keyword____), UNPROVIDED), new SubLObject[]{ workspace, NIL, NIL });
                    }
                    return values(NIL, NIL);
                } else
                    if (NIL != list_utilities.list_of_list_p(workspace)) {
                        {
                            SubLObject cdolist_list_var = workspace;
                            SubLObject this_gaf = NIL;
                            for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                                if (NIL == bbn_plausible_gafP(this_gaf)) {
                                    return values(NIL, NIL);
                                }
                            }
                        }
                        Mapping.mapcar(BBN_ENTER_SPONTANEOUS_GAF, workspace);
                    }

                return values(workspace, new_action);
            }
        }
    }

    public static final SubLObject bbn_group_coercion_during_arg_substitution(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject save_arg0 = cycl_utilities.formula_arg0(gaf);
                SubLObject save_args = cycl_utilities.formula_args(gaf, UNPROVIDED);
                SubLObject coerced_args = NIL;
                SubLObject args = cycl_utilities.formula_args(gaf, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject this_arg = NIL;
                for (this_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_arg = cdolist_list_var.first()) {
                    if ((NIL != constant_handles.constant_p(this_arg)) || (NIL != sksi_kb_accessors.schema_object_fn_expression_p(this_arg))) {
                        coerced_args = cons(this_arg, coerced_args);
                    } else
                        if (NIL == genls.any_specP($$Group, kb_accessors.result_genl(cycl_utilities.formula_arg0(this_arg), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                            coerced_args = cons(this_arg, coerced_args);
                        } else {
                            coerced_args = cons(cycl_utilities.formula_arg1(this_arg, UNPROVIDED), coerced_args);
                        }

                }
                coerced_args = reverse(coerced_args);
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt328$testing__S_and__S), UNPROVIDED), new SubLObject[]{ save_arg0, second(coerced_args), NIL });
                }
                if (save_arg0.eql($$relationInstanceExists) && (!second(save_args).equal(second(coerced_args)))) {
                    return coerced_args;
                } else {
                    return cons(save_arg0, coerced_args);
                }
            }
        }
    }

    /**
     *
     *
     * @param EL-FORMULA-P
     * 		; (#$isa <WHATEVER> <COL>)
     * @param HLMT-P
     * 		; defaults to *bbn-strengthening-mt*
     * @return the values from @see bbn-store-temporary-formula,
    or NIL if the isa was already provably true
     * @unknown the code will use the hlmt's #$ContentMtFn, if such exists
     */
    public static final SubLObject bbn_enter_isa_verification(SubLObject this_isa, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_verification_mt$.getDynamicValue();
        }
        if (cycl_utilities.formula_arg0(this_isa).eql($$isa)) {
            return makeBoolean((NIL != bbn_sentence_is_trueP(this_isa, mt)) || (NIL != bbn_store_temporary_formula(this_isa, mt)));
        }
        return NIL;
    }

    /**
     *
     *
     * @param HYPOTHESIS
     * 		; whose formula is being strengthened
     * @param EL-BINARY-FORMULA-P
     * 		; the gaf we're adding
     * @param HLMT-P
     * 		; where the gaf goes
     * @param EL-BINARY-FORMULA-P
     * 		; the old version which gets deleted
     * @param HLMT-P
     * 		; where the to-be-deleted gaf is found - if null, look everywhere
     * @param BOOLEANP
     * 		; wipe out the old gaf if T - obviously discouraged
     * @return value1: the result of @see bbn-store-temporary-formula
    value2: the result of @see bbn-clear-temporary-formula, when applicable
     */
    public static final SubLObject bbn_enter_strengthened_hypothesis(SubLObject for_hyp, SubLObject strong_gaf, SubLObject strong_mt, SubLObject weak_gaf, SubLObject weak_mt, SubLObject cull_the_weakP) {
        if (cull_the_weakP == UNPROVIDED) {
            cull_the_weakP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_utilities.el_binary_formula_p(strong_gaf)) {
                {
                    SubLObject clearedP = (NIL != cull_the_weakP) ? ((SubLObject) (bbn_clear_temporary_formula(weak_gaf, weak_mt))) : NIL;
                    SubLObject verbose_gaf = list($$hypothesizedFormulaStrengthenedTo, for_hyp, weak_gaf, strong_gaf);
                    SubLObject addedP = NIL;
                    {
                        SubLObject _prev_bind_0 = $bbn_register_predicateP$.currentBinding(thread);
                        try {
                            $bbn_register_predicateP$.bind(T, thread);
                            addedP = bbn_store_temporary_formula(strong_gaf, strong_mt);
                        } finally {
                            $bbn_register_predicateP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    bbn_store_temporary_formula(verbose_gaf, strong_mt);
                    return values(addedP, clearedP);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown intended for cases where one would expect to have no interest in storing
    gafs involving the #$predicate into the database
     */
    public static final SubLObject bbn_enter_bookkeeping_gaf(SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_verification_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $bbn_register_predicateP$.currentBinding(thread);
                    try {
                        $bbn_register_predicateP$.bind(NIL, thread);
                        v_answer = bbn_enter_spontaneous_gaf(gaf, mt);
                    } finally {
                        $bbn_register_predicateP$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     *
     *
     * @param EL-FORMULA-P
     * 		; the gaf we're adding
     * @param HLMT-P
     * 		; where the gaf goes
     * @return the result of @see bbn-store-temporary-formula
     * @unknown do nothing if the gaf is already known in the mt
     */
    public static final SubLObject bbn_enter_spontaneous_gaf(SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        if ((NIL != el_utilities.el_formula_p(gaf)) && (NIL == bbn_sentence_is_trueP(gaf, mt))) {
            return bbn_store_temporary_formula(gaf, mt);
        }
        return NIL;
    }

    /**
     *
     *
     * @param EL-FORMULA-P
     * 		; the gaf being produced
     * @param STRINGP
     * 		; a format-string to be passed to @see bbn-note-strengthening-done
     * @param THING
     * 		; the arg1 for bbn-note-strengthening-done
     * @param THING
     * 		; the arg2 for bbn-note-strengthening-done
     * @param MT
     * 		; optional
     * @return if (bbn-enter-spontaneous-gaf FORMULA MT) is successful,
    bbn-note-strengthening-done using the other args
     */
    public static final SubLObject bbn_enter_strengthening_gaf(SubLObject formula, SubLObject fmt, SubLObject arg1, SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        {
            SubLObject v_answer = bbn_enter_spontaneous_gaf(formula, mt);
            if (NIL != v_answer) {
                bbn_note_strengthening_done(fmt, arg1, arg2);
            }
            return v_answer;
        }
    }

    public static final SubLObject bbn_strengthen_with_motivation(SubLObject constant, SubLObject just, SubLObject details, SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entered = NIL;
                if (just.isString()) {
                    {
                        SubLObject _prev_bind_0 = $bbn_most_relevant_string$.currentBinding(thread);
                        try {
                            $bbn_most_relevant_string$.bind(just, thread);
                            entered = bbn_enter_spontaneous_gaf(gaf, mt);
                            if (NIL != entered) {
                                bbn_note_strengthening_done(details, constant, gaf);
                            }
                        } finally {
                            $bbn_most_relevant_string$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    entered = bbn_enter_spontaneous_gaf(gaf, mt);
                }
                return entered;
            }
        }
    }

    /**
     *
     *
     * @param EL-FORMULA-P
     * 		; the gaf headed for the KB
     * @param MT
     * 		; optional, defaults to @see *bbn-strengthening-mt*
     * @return ultimately, the results of bbn-enter-spontaneous-gaf FORMULA MT
     * @unknown this function assumes FORMULA is (#$isa TERM COL) but this is not enforced
     * @unknown whatever the formula's arg2 is, any #$isas on the TERM which conflict with it
    will be unasserted and tagged with #$hypothesizedIsaCoercedInto
     * @unknown the normal use of this function is to replace one (or more) of a term's #$isas
    with a group fn of that isa, or some related collection?
     */
    public static final SubLObject bbn_enter_coerced_isa(SubLObject isa_gaf, SubLObject new_mt) {
        if (new_mt == UNPROVIDED) {
            new_mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = isa_gaf;
                SubLObject current = datum;
                SubLObject pred = NIL;
                SubLObject constant = NIL;
                SubLObject new_col = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt331);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt331);
                constant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt331);
                new_col = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject cdolist_list_var = bbn_ask_template($list_alt336, list($$ist_Asserted, $sym121$_MT, listS($$isa, constant, $list_alt120)), UNPROVIDED, UNPROVIDED);
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject datum_22 = pair;
                                SubLObject current_23 = datum_22;
                                SubLObject old_col = NIL;
                                SubLObject old_mt = NIL;
                                destructuring_bind_must_consp(current_23, datum_22, $list_alt332);
                                old_col = current_23.first();
                                current_23 = current_23.rest();
                                destructuring_bind_must_consp(current_23, datum_22, $list_alt332);
                                old_mt = current_23.first();
                                current_23 = current_23.rest();
                                if (NIL == current_23) {
                                    if (NIL != bbn_sentence_is_trueP(list($$disjointWith, old_col, new_col), UNPROVIDED)) {
                                        set.set_remove(pair, $bbn_temporary_additions$.getDynamicValue(thread));
                                        {
                                            SubLObject _prev_bind_0 = rewrite_of_propagation.$enable_rewrite_of_propagationP$.currentBinding(thread);
                                            try {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.bind(T, thread);
                                                fi.fi_unassert_int(list($$isa, constant, old_col), old_mt);
                                            } finally {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                                            format($bbn_log_stream$.getDynamicValue(thread), $str_alt333$Delete___In_Mt___A___f___S___Ente, old_mt, list($$isa, constant, old_col));
                                        }
                                        bbn_enter_strengthening_gaf(list($$hypothesizedIsaCoercedInto, constant, old_col, new_col), $str_alt335$__isa_overridden, constant, old_col, UNPROVIDED);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_22, $list_alt332);
                                }
                            }
                        }
                    }
                    return bbn_enter_strengthening_gaf(isa_gaf, $str_alt337$__isa_coercion_performed, constant, new_col, new_mt);
                } else {
                    cdestructuring_bind_error(datum, $list_alt331);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-FORMULA-P
     * 		; to be inserted into...
     * @param HLMT-P
     * 		; defaults to *bbn-strengthening-mt*
     * @return (list <the formula> <the hlmt>) iff stored successfully
     * @unknown the code will use the hlmt's #$ContentMtFn, if such exists
     * @unknown if adding it would be redundant, print a warning but don't error
     */
    public static final SubLObject bbn_store_temporary_formula(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $bbn_strengthening_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject into_mt = (NIL != bbn_content_mt_of(mt)) ? ((SubLObject) (bbn_content_mt_of(mt))) : mt;
                SubLObject canon_mt = hlmt_czer.canonicalize_hlmt(into_mt);
                SubLObject the_pair = list(formula, into_mt);
                SubLObject the_operator = cycl_utilities.formula_arg0(formula);
                if (NIL != $bbn_register_predicateP$.getDynamicValue(thread)) {
                    {
                        SubLObject isa_mapping = list($$isa, the_operator, $$BBNRelationTypePredicate);
                        if (((!the_operator.eql($$isa)) && (NIL != pph_utilities.pph_isaP(the_operator, $$BinaryPredicate, UNPROVIDED))) && (NIL == bbn_sentence_is_trueP(isa_mapping, $$CycCanonicalGUIDMappingMt))) {
                            bbn_store_temporary_formula(isa_mapping, $$CycCanonicalGUIDMappingMt);
                        }
                    }
                }
                if (NIL != set.set_memberP(the_pair, $bbn_temporary_additions$.getDynamicValue(thread))) {
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt341$_S_is_already_present_in__S__), UNPROVIDED), new SubLObject[]{ formula, into_mt, NIL });
                    }
                } else
                    if (NIL != bbn_assert_possibly_with_metrics(formula, canon_mt, $MONOTONIC, UNPROVIDED)) {
                        if (!the_operator.equal($$reifiedAsForEfficiency)) {
                            if (NIL != $bbn_most_relevant_string$.getDynamicValue(thread)) {
                                bbn_assert_possibly_with_metrics(list($$sourceOfTerm, list($$ist, canon_mt, formula), $bbn_most_relevant_string$.getDynamicValue(thread)), canon_mt, $MONOTONIC, UNPROVIDED);
                            }
                            if (NIL != $bbn_most_relevant_document$.getDynamicValue(thread)) {
                                bbn_assert_possibly_with_metrics(list($$sourceOfTerm, list($$ist, canon_mt, formula), $bbn_most_relevant_document$.getDynamicValue(thread)), canon_mt, $MONOTONIC, UNPROVIDED);
                            }
                        }
                        if (the_operator.eql($bbn_equality_predicate$.getDynamicValue(thread))) {
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_ENTITIES_STRENGTHENED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != $bbn_store_temporary_formulasP$.getDynamicValue(thread)) {
                            set.set_add(the_pair, $bbn_temporary_additions$.getDynamicValue(thread));
                        }
                    } else {
                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt346$failed_to_add__S_to__S__), UNPROVIDED), new SubLObject[]{ formula, into_mt, NIL });
                        }
                        return NIL;
                    }

                return the_pair;
            }
        }
    }

    public static final SubLObject bbn_assert_possibly_with_metrics(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pass_back = NIL;
                {
                    SubLObject _prev_bind_0 = rewrite_of_propagation.$enable_rewrite_of_propagationP$.currentBinding(thread);
                    try {
                        rewrite_of_propagation.$enable_rewrite_of_propagationP$.bind(T, thread);
                        pass_back = fi.fi_assert_int(formula, mt, strength, UNPROVIDED);
                    } finally {
                        rewrite_of_propagation.$enable_rewrite_of_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != $bbn_log_stream$.getDynamicValue(thread)) && (NIL != pass_back)) {
                    if (mt.eql($bbn_strengthening_mt$.getDynamicValue(thread))) {
                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt347$Asserted__S_in__A__), UNPROVIDED), new SubLObject[]{ formula, mt, NIL });
                        }
                    }
                    format($bbn_log_stream$.getDynamicValue(thread), $str_alt348$In_Mt___A___Truth_Value___A___, mt, Strings.string_downcase(format(NIL, $str_alt349$_S, strength), UNPROVIDED, UNPROVIDED));
                    if (NIL != direction) {
                        format($bbn_log_stream$.getDynamicValue(thread), $str_alt350$Direction___A___, direction);
                    }
                    format($bbn_log_stream$.getDynamicValue(thread), $str_alt351$f___S___, formula);
                    bbn_force_output(UNPROVIDED);
                } else {
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt352$Asserted__A_in__A__), UNPROVIDED), new SubLObject[]{ formula, mt, NIL });
                    }
                }
                return pass_back;
            }
        }
    }

    public static final SubLObject bbn_list_temporary_formulas() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return format(T, $str_alt356$_S__, set.set_element_list($bbn_temporary_additions$.getDynamicValue(thread)));
        }
    }

    public static final SubLObject bbn_clear_temporary_formulas(SubLObject just_this_mt) {
        if (just_this_mt == UNPROVIDED) {
            just_this_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removed = NIL;
                SubLObject set_contents_var = set.do_set_internal($bbn_temporary_additions$.getDynamicValue(thread));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject this_pair = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, this_pair)) {
                            {
                                SubLObject datum = this_pair;
                                SubLObject current = datum;
                                SubLObject the_formula = NIL;
                                SubLObject the_mt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt357);
                                the_formula = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt357);
                                the_mt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == just_this_mt) || the_mt.equalp(just_this_mt)) {
                                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt358$unasserting__S_from__S__), UNPROVIDED), new SubLObject[]{ the_formula, the_mt, NIL });
                                        }
                                        {
                                            SubLObject _prev_bind_0 = rewrite_of_propagation.$enable_rewrite_of_propagationP$.currentBinding(thread);
                                            try {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.bind(T, thread);
                                                if (NIL != fi.fi_unassert_int(the_formula, the_mt)) {
                                                    set.set_remove(this_pair, $bbn_temporary_additions$.getDynamicValue(thread));
                                                    removed = cons(this_pair, removed);
                                                }
                                            } finally {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt357);
                                }
                            }
                        }
                    }
                }
                return removed;
            }
        }
    }

    public static final SubLObject bbn_clear_temporary_formulas_mentioning(SubLObject constant, SubLObject just_this_mt) {
        if (just_this_mt == UNPROVIDED) {
            just_this_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removed = NIL;
                SubLObject set_contents_var = set.do_set_internal($bbn_temporary_additions$.getDynamicValue(thread));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject this_pair = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, this_pair)) {
                            {
                                SubLObject datum = this_pair;
                                SubLObject current = datum;
                                SubLObject the_formula = NIL;
                                SubLObject the_mt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt357);
                                the_formula = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt357);
                                the_mt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL != list_utilities.tree_find(constant, the_formula, UNPROVIDED, UNPROVIDED)) && ((NIL == just_this_mt) || the_mt.equalp(just_this_mt))) {
                                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt358$unasserting__S_from__S__), UNPROVIDED), new SubLObject[]{ the_formula, the_mt, NIL });
                                        }
                                        {
                                            SubLObject _prev_bind_0 = rewrite_of_propagation.$enable_rewrite_of_propagationP$.currentBinding(thread);
                                            try {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.bind(T, thread);
                                                if (NIL != fi.fi_unassert_int(the_formula, the_mt)) {
                                                    set.set_remove(this_pair, $bbn_temporary_additions$.getDynamicValue(thread));
                                                    removed = cons(this_pair, removed);
                                                }
                                            } finally {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt357);
                                }
                            }
                        }
                    }
                }
                return removed;
            }
        }
    }

    public static final SubLObject bbn_clear_temporary_formula(SubLObject kill_formula, SubLObject just_this_mt) {
        if (just_this_mt == UNPROVIDED) {
            just_this_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removed = NIL;
                SubLObject set_contents_var = set.do_set_internal($bbn_temporary_additions$.getDynamicValue(thread));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject this_pair = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, this_pair)) {
                            {
                                SubLObject datum = this_pair;
                                SubLObject current = datum;
                                SubLObject the_formula = NIL;
                                SubLObject the_mt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt357);
                                the_formula = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt357);
                                the_mt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (the_formula.equalp(kill_formula) && ((NIL == just_this_mt) || the_mt.equalp(just_this_mt))) {
                                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt358$unasserting__S_from__S__), UNPROVIDED), new SubLObject[]{ the_formula, the_mt, NIL });
                                        }
                                        {
                                            SubLObject _prev_bind_0 = rewrite_of_propagation.$enable_rewrite_of_propagationP$.currentBinding(thread);
                                            try {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.bind(T, thread);
                                                if (NIL != fi.fi_unassert_int(the_formula, the_mt)) {
                                                    removed = cons(this_pair, removed);
                                                }
                                            } finally {
                                                rewrite_of_propagation.$enable_rewrite_of_propagationP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt357);
                                }
                            }
                        }
                    }
                }
                return removed;
            }
        }
    }

    public static final SubLObject bbn_clear_doppelgangers(SubLObject just_this) {
        if (just_this == UNPROVIDED) {
            just_this = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kb_mapping.gather_predicate_extent_index($$reifiedAsForEfficiency, $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    {
                        SubLObject doppel = cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED);
                        if ((NIL == just_this) || just_this.equal(doppel)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    {
                                        SubLObject n = NIL;
                                        for (n = ZERO_INTEGER; n.numL(FOUR_INTEGER); n = add(n, ONE_INTEGER)) {
                                            if (n.numG(ZERO_INTEGER)) {
                                                {
                                                    SubLObject cdolist_list_var_24 = kb_mapping.gather_gaf_arg_index(doppel, n, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject innerass = NIL;
                                                    for (innerass = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , innerass = cdolist_list_var_24.first()) {
                                                        fi.fi_unassert_int(assertions_high.assertion_formula(innerass), assertions_high.assertion_mt(innerass));
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
                            fi.fi_unassert_int(assertions_high.assertion_formula(ass), assertions_high.assertion_mt(ass));
                        }
                    }
                }
            }
            return T;
        }
    }

    public static final SubLObject bbn_scour_inappropriate_bottom_up_isas(SubLObject the_gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nuked_anyP = NIL;
                SubLObject datum = the_gaf;
                SubLObject current = datum;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt288);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt288);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt288);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject cdolist_list_var = bbn_ask_variable_traced($sym361$_ALL_COL, list($$and, list($$interestingSentence, $sym361$_ALL_COL, list($$ist, $sym363$_INTEREST_MT, listS($$relationAllExists, pred, $list_alt365))), list($$ist, $bbn_strengthening_mt$.getDynamicValue(thread), listS($$isa, arg1, $list_alt366)), $list_alt367, list($$not, listS($$isa, arg2, $list_alt368))), UNPROVIDED, UNPROVIDED);
                        SubLObject counter_ex = NIL;
                        for (counter_ex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , counter_ex = cdolist_list_var.first()) {
                            if (NIL != bbn_clear_temporary_formula(list($$isa, arg2, counter_ex), $bbn_strengthening_mt$.getDynamicValue(thread))) {
                                nuked_anyP = T;
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = bbn_ask_variable_traced($sym361$_ALL_COL, list($$and, list($$genlInverse, $sym254$_PRED, pred), $list_alt370, list($$ist, $bbn_strengthening_mt$.getDynamicValue(thread), listS($$isa, arg2, $list_alt366)), $list_alt367, list($$not, listS($$isa, arg1, $list_alt368))), UNPROVIDED, UNPROVIDED);
                        SubLObject counter_ex = NIL;
                        for (counter_ex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , counter_ex = cdolist_list_var.first()) {
                            if (NIL != bbn_clear_temporary_formula(list($$isa, arg1, counter_ex), $bbn_strengthening_mt$.getDynamicValue(thread))) {
                                nuked_anyP = T;
                            }
                        }
                    }
                    return nuked_anyP;
                } else {
                    cdestructuring_bind_error(datum, $list_alt288);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-BINARY-FORMULA-P
     * 		; the (current version of the) gaf to be strengthened
     * @param FUNCTION
     * 		; to be called
     * @param BOOLEANP
     * 		; optional, if T then pass the whole gaf to the function, not its pieces
     * @return EL-BINARY-FORMULA-P ; the result of calling the function on the gaf, plus,
    if the gaf was changed, the result of calling
     * @see bbn-strengthen-binary-gaf on the new gaf
     */
    public static final SubLObject bbn_call_strengthener(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject orig_item = NIL;
            SubLObject the_func = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt371);
            orig_item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt371);
            the_func = current.first();
            current = current.rest();
            {
                SubLObject preserveP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt371);
                current = current.rest();
                if (NIL == current) {
                    return list(CLET, list($list_alt372, list(USE_THIS_GAF, orig_item)), list(BBN_WARN, ONE_INTEGER, $str_alt374$calling__A_on__S__, the_func, orig_item), list(PIF, preserveP, list(CSETQ, THE_ANSWER, listS(FUNCALL, the_func, $list_alt378)), list(CDESTRUCTURING_BIND, $list_alt288, USE_THIS_GAF, list(CSETQ, THE_ANSWER, listS(FUNCALL, the_func, $list_alt288)))), list(PWHEN, THE_ANSWER, listS(CSETQ, orig_item, $list_alt379)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt371);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param BBN-DOCUMENT
     * 		; to be strengthened
     * @param BOOLEANP
     * 		or STRINGP ; generate output if T, indented after the arg if stringp
     * @return INTEGERP ; the number of hypotheses which were strengthened
     * @unknown the nature of the return value assumes anything useful which is to be done with
    strengthened hypotheses is to be done in this function, or something it calls,
    and therefore the calling function doesn't care what work got done, just how much.
    I have no idea whether this assumption is legitimate
     */
    public static final SubLObject bbn_strengthen_document(SubLObject the_doc, SubLObject with_outputP) {
        if (with_outputP == UNPROVIDED) {
            with_outputP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (the_doc.isNumber()) {
                the_doc = list($$SchemaObjectFn, $$CDE_document_LS, the_doc);
            }
            if (!((NIL != bbn_document_has_textP(the_doc)) && (NIL != get_bbn_document_hypotheses(the_doc)))) {
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt380$_S_had_no_text__skipping__), UNPROVIDED), new SubLObject[]{ the_doc, NIL, NIL });
                }
                return values(NIL, NIL);
            }
            {
                SubLObject ctr = ZERO_INTEGER;
                SubLObject time = NIL;
                if (NIL != with_outputP) {
                    SubLTrampolineFile.checkType($str_alt381$DOC____S__, STRINGP);
                    format(T, cconcatenate($str_alt73$_A, $str_alt381$DOC____S__), with_outputP.isString() ? ((SubLObject) (with_outputP)) : $str_alt382$, the_doc);
                }
                {
                    SubLObject _prev_bind_0 = $bbn_most_relevant_document$.currentBinding(thread);
                    try {
                        $bbn_most_relevant_document$.bind(NIL != sksi_kb_accessors.schema_object_fn_expression_p(the_doc) ? ((SubLObject) (the_doc)) : NIL, thread);
                        if ((NIL != the_doc) && (NIL != $bbn_log_stream$.getDynamicValue(thread))) {
                            {
                                SubLObject xyzdate = pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                format(T, $str_alt54$___Beginning_BBN_document__A_at__, the_doc, xyzdate);
                                format($bbn_log_stream$.getDynamicValue(thread), $str_alt54$___Beginning_BBN_document__A_at__, the_doc, xyzdate);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_25 = bbn_strengthening_metrics.$bbn_metrics_store$.currentBinding(thread);
                            try {
                                bbn_strengthening_metrics.$bbn_metrics_store$.bind(bbn_strengthening_metrics.new_bbn_metrics_store(the_doc), thread);
                                {
                                    SubLObject time_var = get_internal_real_time();
                                    {
                                        SubLObject _prev_bind_0_26 = $bbn_strengthenings_performed$.currentBinding(thread);
                                        try {
                                            $bbn_strengthenings_performed$.bind(ZERO_INTEGER, thread);
                                            {
                                                SubLObject _prev_bind_0_27 = $bbn_strengthening_problem_store$.currentBinding(thread);
                                                try {
                                                    $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                                                    {
                                                        SubLObject state = memoization_state.possibly_new_memoization_state();
                                                        SubLObject local_state = state;
                                                        {
                                                            SubLObject _prev_bind_0_28 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                                {
                                                                    SubLObject original_memoization_process = NIL;
                                                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                        {
                                                                            SubLObject current_proc = current_process();
                                                                            if (NIL == original_memoization_process) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                            } else {
                                                                                if (original_memoization_process != current_proc) {
                                                                                    Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        {
                                                                            SubLObject cdolist_list_var = get_bbn_document_hypotheses(the_doc);
                                                                            SubLObject the_hyp = NIL;
                                                                            for (the_hyp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , the_hyp = cdolist_list_var.first()) {
                                                                                bbn_strengthen_hypothesis(the_hyp, NIL != with_outputP ? ((SubLObject) ($str_alt383$__)) : NIL);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $bbn_strengthening_problem_store$.rebind(_prev_bind_0_27, thread);
                                                }
                                            }
                                            ctr = bbn_count_strengthenings_done();
                                        } finally {
                                            $bbn_strengthenings_performed$.rebind(_prev_bind_0_26, thread);
                                        }
                                    }
                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    bbn_strengthening_metrics.bbn_maybe_output_current_metrics(time);
                                }
                            } finally {
                                bbn_strengthening_metrics.$bbn_metrics_store$.rebind(_prev_bind_0_25, thread);
                            }
                        }
                    } finally {
                        $bbn_most_relevant_document$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject time_nat = list($$SecondsDuration, ceiling(time, UNPROVIDED));
                    bbn_enter_bookkeeping_gaf(list($$productivityMetricsForBBNDocument, the_doc, ctr, time_nat), UNPROVIDED);
                }
                if (NIL != with_outputP) {
                    format(T, $str_alt386$Total_of__A_strengthenings_in__A_, new SubLObject[]{ ctr, the_doc, time });
                }
                return values(ctr, time);
            }
        }
    }

    public static final SubLObject bbn_strengthen_all_documents(SubLObject with_outputP) {
        if (with_outputP == UNPROVIDED) {
            with_outputP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject number_of_strengthenings = bbn_strengthen_documents(ONE_INTEGER, with_outputP);
                SubLObject number_of_documents = thread.secondMultipleValue();
                SubLObject seconds = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(number_of_strengthenings, seconds);
            }
        }
    }

    public static final SubLObject bbn_strengthen_n_documents(SubLObject this_many, SubLObject outputP, SubLObject start) {
        if (outputP == UNPROVIDED) {
            outputP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(this_many, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(start, NON_NEGATIVE_INTEGER_P);
            if (NIL == start) {
                start = ZERO_INTEGER;
            }
            {
                SubLObject tot_ctr = ZERO_INTEGER;
                SubLObject tot_time = ZERO_INTEGER;
                SubLObject x = NIL;
                for (x = ZERO_INTEGER; x.numL(this_many); x = add(x, ONE_INTEGER)) {
                    if (NIL == bbn_time_limit_exceededP()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject ctr = bbn_strengthen_document(list($$SchemaObjectFn, $$CDE_document_LS, add(x, start)), outputP);
                            SubLObject time = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != ctr) {
                                tot_ctr = add(tot_ctr, ctr);
                            }
                            if (NIL != time) {
                                tot_time = add(tot_time, time);
                            }
                        }
                    }
                }
                format(T, $str_alt389$Grand_total_of__A_strengthenings_, tot_ctr, tot_time);
                return values(tot_ctr, tot_time);
            }
        }
    }

    public static final SubLObject bbn_strengthen_documents(SubLObject every, SubLObject pedantic_outputP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject work_done = ZERO_INTEGER;
                SubLObject docs_done = ZERO_INTEGER;
                SubLObject clock = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                    try {
                        $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_30 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject document_count = count_bbn_documents();
                                                SubLObject n = NIL;
                                                for (n = ZERO_INTEGER; n.numL(document_count); n = add(n, ONE_INTEGER)) {
                                                    if ((NIL == every) || divide(n, every).isInteger()) {
                                                        {
                                                            SubLObject doc = bbn_document_number_has_textP(n);
                                                            if (NIL != doc) {
                                                                if (NIL == bbn_time_limit_exceededP()) {
                                                                    Storage.gc_ephemeral();
                                                                    docs_done = add(docs_done, ONE_INTEGER);
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject ctr = bbn_strengthen_document(doc, pedantic_outputP);
                                                                        SubLObject time = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != ctr) {
                                                                            work_done = add(work_done, ctr);
                                                                        }
                                                                        if (NIL != time) {
                                                                            clock = add(clock, time);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_30, thread);
                                }
                            }
                        }
                    } finally {
                        $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                format(T, $str_alt390$Total_of__A_strengthenings_over__, new SubLObject[]{ work_done, docs_done, clock });
                return values(work_done, docs_done, clock);
            }
        }
    }

    /**
     *
     *
     * @param STRINGP
     * 		;  filename for the logfile
     * @param KEYWORDP
     * 		;  :hours  :minutes   :seconds
     * @param POSITIVE-INTEGER-P
     * 		;  number of h/m/s
     * @param DO-SHAMIL-DOCS?
     * 		;  stop at hypothesis if nil, do all of their docs if T
     * @unknown this iterates over the shamil hypotheses, then starts an end-to-end run, dumping
    all the output into the filename.
     * @return values X Y ; i.e., the loop performed X strengthenings in Y minutes
     */
    public static final SubLObject bbn_strengthen_at_ctc(SubLObject filename, SubLObject time_unit, SubLObject time, SubLObject do_shamil_docsP) {
        if (do_shamil_docsP == UNPROVIDED) {
            do_shamil_docsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strengthenings = ZERO_INTEGER;
                SubLObject time_spent = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $bbn_store_temporary_formulasP$.currentBinding(thread);
                    try {
                        $bbn_store_temporary_formulasP$.bind(NIL, thread);
                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt21$logging_to__A__), UNPROVIDED), new SubLObject[]{ filename, NIL, NIL });
                        }
                        {
                            SubLObject _prev_bind_0_32 = $bbn_log_file$.currentBinding(thread);
                            try {
                                $bbn_log_file$.bind(filename, thread);
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = compatibility.open_text(filename, $OUTPUT, NIL);
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt392$Unable_to_open__S, filename);
                                        }
                                        {
                                            SubLObject wtf = stream;
                                            {
                                                SubLObject _prev_bind_0_33 = $bbn_log_stream$.currentBinding(thread);
                                                try {
                                                    $bbn_log_stream$.bind(wtf, thread);
                                                    {
                                                        SubLObject pcase_var = time_unit;
                                                        if (pcase_var.eql($HOURS)) {
                                                            {
                                                                SubLObject _prev_bind_0_34 = $bbn_time_limit$.currentBinding(thread);
                                                                try {
                                                                    $bbn_time_limit$.bind(numeric_date_utilities.universal_time_seconds_from_now(multiply(time, $int$3600), UNPROVIDED), thread);
                                                                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                                                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt394$The_system_will_start_no_hypothes), UNPROVIDED), new SubLObject[]{ pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date($bbn_time_limit$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL });
                                                                    }
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject ctr = bbn_strengthen_shamil_basayev(do_shamil_docsP);
                                                                        SubLObject sec = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != ctr) {
                                                                            strengthenings = add(strengthenings, ctr);
                                                                        }
                                                                        if (NIL != sec) {
                                                                            time_spent = add(time_spent, sec);
                                                                        }
                                                                    }
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject ctr = bbn_strengthen_all_documents(UNPROVIDED);
                                                                        SubLObject sec = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != ctr) {
                                                                            strengthenings = add(strengthenings, ctr);
                                                                        }
                                                                        if (NIL != sec) {
                                                                            time_spent = add(time_spent, sec);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    $bbn_time_limit$.rebind(_prev_bind_0_34, thread);
                                                                }
                                                            }
                                                        } else
                                                            if (pcase_var.eql($MINUTES)) {
                                                                {
                                                                    SubLObject _prev_bind_0_35 = $bbn_time_limit$.currentBinding(thread);
                                                                    try {
                                                                        $bbn_time_limit$.bind(numeric_date_utilities.universal_time_seconds_from_now(multiply(time, $int$60), UNPROVIDED), thread);
                                                                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                                                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt394$The_system_will_start_no_hypothes), UNPROVIDED), new SubLObject[]{ pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date($bbn_time_limit$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL });
                                                                        }
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject ctr = bbn_strengthen_shamil_basayev(do_shamil_docsP);
                                                                            SubLObject sec = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != ctr) {
                                                                                strengthenings = add(strengthenings, ctr);
                                                                            }
                                                                            if (NIL != sec) {
                                                                                time_spent = add(time_spent, sec);
                                                                            }
                                                                        }
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject ctr = bbn_strengthen_all_documents(UNPROVIDED);
                                                                            SubLObject sec = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != ctr) {
                                                                                strengthenings = add(strengthenings, ctr);
                                                                            }
                                                                            if (NIL != sec) {
                                                                                time_spent = add(time_spent, sec);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        $bbn_time_limit$.rebind(_prev_bind_0_35, thread);
                                                                    }
                                                                }
                                                            } else
                                                                if (pcase_var.eql($SECONDS)) {
                                                                    {
                                                                        SubLObject _prev_bind_0_36 = $bbn_time_limit$.currentBinding(thread);
                                                                        try {
                                                                            $bbn_time_limit$.bind(numeric_date_utilities.universal_time_seconds_from_now(time, UNPROVIDED), thread);
                                                                            if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                                                                format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt394$The_system_will_start_no_hypothes), UNPROVIDED), new SubLObject[]{ pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date($bbn_time_limit$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, NIL });
                                                                            }
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject ctr = bbn_strengthen_shamil_basayev(do_shamil_docsP);
                                                                                SubLObject sec = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != ctr) {
                                                                                    strengthenings = add(strengthenings, ctr);
                                                                                }
                                                                                if (NIL != sec) {
                                                                                    time_spent = add(time_spent, sec);
                                                                                }
                                                                            }
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject ctr = bbn_strengthen_all_documents(UNPROVIDED);
                                                                                SubLObject sec = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != ctr) {
                                                                                    strengthenings = add(strengthenings, ctr);
                                                                                }
                                                                                if (NIL != sec) {
                                                                                    time_spent = add(time_spent, sec);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            $bbn_time_limit$.rebind(_prev_bind_0_36, thread);
                                                                        }
                                                                    }
                                                                }


                                                    }
                                                } finally {
                                                    $bbn_log_stream$.rebind(_prev_bind_0_33, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream.isStream()) {
                                                    close(stream, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $bbn_log_file$.rebind(_prev_bind_0_32, thread);
                            }
                        }
                    } finally {
                        $bbn_store_temporary_formulasP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(strengthenings, ceiling(divide(time_spent, $int$60), UNPROVIDED));
            }
        }
    }

    /**
     *
     *
     * @param STRINGP
     * 		;  filename for the logfile
     * @param KEYWORDP
     * 		;  :hours  :minutes   :seconds
     * @param POSITIVE-INTEGER-P
     * 		;  number of h/m/s
     * @unknown this iterates over the shamil documents, then starts an end-to-end run, dumping
    all the output into the filename.
     * @return values X Y ; i.e., the loop performed X strengthenings in Y minutes
     */
    public static final SubLObject bbn_strengthen_at_ctc_full(SubLObject filename, SubLObject time_unit, SubLObject time) {
        return bbn_strengthen_at_ctc(filename, time_unit, time, T);
    }

    /**
     *
     *
     * @unknown to run the code just on the documents relevant to SB
     * @param BOOLEANP;
     * 		if non-nil, strengthen the full documents instead of
     * 		just the relevant hypotheses
     * @unknown this does pick up other people, e.g., Shamil Burayev
     */
    public static final SubLObject bbn_strengthen_shamil_basayev(SubLObject whole_docsP) {
        if (whole_docsP == UNPROVIDED) {
            whole_docsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject work_done = ZERO_INTEGER;
                SubLObject time = ZERO_INTEGER;
                SubLObject docs_covered = set.new_set(symbol_function(EQUALP), UNPROVIDED);
                SubLObject shamil_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject shamil_progress = ZERO_INTEGER;
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt396$Gathering_hypotheses_pertaining_t), UNPROVIDED), new SubLObject[]{ NIL, NIL, NIL });
                }
                {
                    SubLObject cdolist_list_var = bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym398$_ENTITY_MENTION, $list_alt399, $list_alt206, UNPROVIDED);
                    SubLObject em_nat = NIL;
                    for (em_nat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , em_nat = cdolist_list_var.first()) {
                        {
                            SubLObject entity_ref = cycl_utilities.formula_arg1(em_nat, UNPROVIDED);
                            SubLObject cdolist_list_var_38 = bbn_ask_variable_sksi($bbn_sksi_inquire$.getDynamicValue(thread), $sym221$_HYP, list($$dependsOnEMHyp, $sym221$_HYP, entity_ref), $list_alt194, UNPROVIDED);
                            SubLObject hyp = NIL;
                            for (hyp = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , hyp = cdolist_list_var_38.first()) {
                                if (cycl_utilities.formula_arg1(hyp, UNPROVIDED).eql($$CDE_hypothesis_LS)) {
                                    format(T, $str_alt397$checked__A__got__A__, entity_ref, hyp);
                                    force_output(UNPROVIDED);
                                    set.set_add(hyp, shamil_set);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject set_contents_var = set.do_set_internal(shamil_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject hyp = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, hyp)) {
                                if (NIL == bbn_time_limit_exceededP()) {
                                    {
                                        SubLObject docs = bbn_ask_variable_sksi($bbn_sksi_demand_answers$.getDynamicValue(thread), $sym237$_DOC, listS($$hypothesisAboutTextualPCW, hyp, $list_alt238), $list_alt183, UNPROVIDED);
                                        if (NIL != whole_docsP) {
                                            {
                                                SubLObject cdolist_list_var = docs;
                                                SubLObject doc = NIL;
                                                for (doc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , doc = cdolist_list_var.first()) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject ctr = bbn_strengthen_document(doc, UNPROVIDED);
                                                        SubLObject sec = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != ctr) {
                                                            set.set_add(doc, docs_covered);
                                                            work_done = add(work_done, ctr);
                                                        }
                                                        if (NIL != sec) {
                                                            time = add(time, sec);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject _prev_bind_0 = bbn_strengthening_metrics.$bbn_metrics_store$.currentBinding(thread);
                                                try {
                                                    bbn_strengthening_metrics.$bbn_metrics_store$.bind(bbn_strengthening_metrics.new_bbn_metrics_store(hyp), thread);
                                                    {
                                                        SubLObject start_time = get_universal_time();
                                                        SubLObject already_done = bbn_count_strengthenings_done();
                                                        {
                                                            SubLObject _prev_bind_0_39 = $bbn_most_relevant_document$.currentBinding(thread);
                                                            try {
                                                                $bbn_most_relevant_document$.bind(docs.first(), thread);
                                                                bbn_strengthen_hypothesis(hyp, UNPROVIDED);
                                                                time = add(time, subtract(get_universal_time(), start_time));
                                                                work_done = add(work_done, subtract(bbn_count_strengthenings_done(), already_done));
                                                                bbn_strengthening_metrics.bbn_maybe_output_current_metrics(time);
                                                            } finally {
                                                                $bbn_most_relevant_document$.rebind(_prev_bind_0_39, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    bbn_strengthening_metrics.$bbn_metrics_store$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                                shamil_progress = add(shamil_progress, ONE_INTEGER);
                                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt400$_A_of__A_Shamil_hypotheses_comple), UNPROVIDED), new SubLObject[]{ shamil_progress, set.set_size(shamil_set), NIL });
                                }
                                if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                                    format($bbn_log_stream$.getDynamicValue(thread), $str_alt401$___A_of__A_Shamil_hypotheses_comp, shamil_progress, set.set_size(shamil_set));
                                }
                            }
                        }
                    }
                }
                format(T, $str_alt402$A_total_of__A_strengthenings_perf, work_done, time);
                if (NIL != docs_covered) {
                    format(T, $str_alt403$____A__, set.set_element_list(docs_covered));
                }
                return values(work_done, time);
            }
        }
    }

    public static final SubLObject bbn_strengthen_relation_reference(SubLObject relation_reference, SubLObject outputP) {
        if (outputP == UNPROVIDED) {
            outputP = NIL;
        }
        return bbn_strengthen_hypothesis(get_bbn_relation_reference_hypothesis(relation_reference), outputP);
    }

    /**
     *
     *
     * @param BBN-HYPOTHESIS
     * 		; to be strengthened
     * @param BOOLEANP
     * 		or STRINGP ; generate output if T, indented after the arg if stringp
     * @return value1: EL-BINARY-FORMULA-P ; possibly-strengthened version of the hyp's binary-sentence
    value2: whether the args are flipped
     * @unknown The nature of the return value brazenly assumes that a hyp never has multiple gafs
     */
    public static final SubLObject bbn_strengthen_hypothesis(SubLObject the_hyp, SubLObject with_outputP) {
        if (with_outputP == UNPROVIDED) {
            with_outputP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != bbn_time_limit_exceededP()) {
                return NIL;
            }
            if (the_hyp.isInteger()) {
                the_hyp = list($$SchemaObjectFn, $$CDE_hypothesis_LS, the_hyp);
            }
            clear_bbn_deduce_entity_headstring();
            {
                SubLObject raw_gaf = get_bbn_hypothesis_binary_sentences(the_hyp).first();
                SubLObject final_gaf = NIL;
                if (NIL == raw_gaf) {
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt404$rejecting_non_binary_hypothesis__), UNPROVIDED), new SubLObject[]{ the_hyp, NIL, NIL });
                    }
                    if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                        format($bbn_log_stream$.getDynamicValue(thread), $str_alt405$___Never_mind____no_binary_hypoth);
                    }
                    return NIL;
                }
                {
                    SubLObject _prev_bind_0 = $bbn_most_relevant_string$.currentBinding(thread);
                    try {
                        $bbn_most_relevant_string$.bind(get_bbn_hypothesis_textstring(the_hyp), thread);
                        {
                            SubLObject xyzdate = pph_main.generate_phrase(date_utilities.universal_time_to_cycl_date(get_universal_time()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                                format(T, $str_alt406$___Beginning_hypothesis__A_at__A_, the_hyp, xyzdate);
                                format($bbn_log_stream$.getDynamicValue(thread), $str_alt406$___Beginning_hypothesis__A_at__A_, the_hyp, xyzdate);
                            } else
                                if (NIL != with_outputP) {
                                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt407$Beginning_hypothesis__A_at__A__), UNPROVIDED), new SubLObject[]{ the_hyp, xyzdate, NIL });
                                    }
                                }

                            if ((NIL != $bbn_log_stream$.getDynamicValue(thread)) || (NIL != with_outputP)) {
                                pprint_bbn_hypothesis(the_hyp, UNPROVIDED);
                            }
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_INVESTIGATED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject raw_pred = cycl_utilities.formula_arg0(raw_gaf);
                                SubLObject reified_gaf = NIL;
                                {
                                    SubLObject hack_gaf = list(raw_pred);
                                    SubLObject args = cycl_utilities.formula_args(raw_gaf, $IGNORE);
                                    SubLObject cdolist_list_var = args;
                                    SubLObject this_term_ls = NIL;
                                    for (this_term_ls = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_term_ls = cdolist_list_var.first()) {
                                        hack_gaf = cons(bbn_explore_term(this_term_ls, UNPROVIDED), hack_gaf);
                                    }
                                    reified_gaf = reverse(hack_gaf);
                                    bbn_scour_inappropriate_bottom_up_isas(reified_gaf);
                                }
                                if (NIL != bbn_unknown_predicate_p(raw_pred)) {
                                    if (NIL != $bbn_skip_unknown_relationsP$.getDynamicValue(thread)) {
                                        reified_gaf = NIL;
                                    } else {
                                        {
                                            SubLObject tmp_gaf = bbn_leverage_verb_sem_trans_for_unknown(the_hyp, reified_gaf);
                                            if (NIL != el_utilities.el_logical_operator_formula_p(tmp_gaf)) {
                                                tmp_gaf = tmp_gaf.rest();
                                                reified_gaf = tmp_gaf;
                                            } else
                                                if (NIL != list_utilities.list_of_list_p(tmp_gaf)) {
                                                    {
                                                        SubLObject cdolist_list_var = tmp_gaf;
                                                        SubLObject this_branch = NIL;
                                                        for (this_branch = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_branch = cdolist_list_var.first()) {
                                                            if (NIL == list_utilities.tree_find_if(symbol_function(KEYWORDP), this_branch, UNPROVIDED)) {
                                                                reified_gaf = cons(this_branch, reified_gaf);
                                                            }
                                                        }
                                                    }
                                                } else
                                                    if (NIL != el_utilities.el_formula_p(tmp_gaf)) {
                                                        reified_gaf = tmp_gaf;
                                                    } else {
                                                        reified_gaf = NIL;
                                                    }


                                            if (NIL != bbn_unknown_predicate_p(cycl_utilities.formula_arg0(reified_gaf))) {
                                                reified_gaf = NIL;
                                            }
                                            if (NIL != reified_gaf) {
                                                bbn_strengthening_metrics.bbn_increment_strengthening_metric($UNKNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                bbn_note_strengthening_done($$$resolved_unknown_predicate, raw_pred, reified_gaf);
                                            }
                                        }
                                    }
                                }
                                if (NIL != reified_gaf) {
                                    if ((NIL != $bbn_trace_element$.getDynamicValue(thread)) && (NIL != list_utilities.tree_find($bbn_trace_element$.getDynamicValue(thread), reified_gaf, UNPROVIDED, UNPROVIDED))) {
                                        Errors.sublisp_break($str_alt411$__entry_gaf___S__, new SubLObject[]{ bbn_quasi_gaf_with_headwords(raw_gaf, the_hyp) });
                                    } else {
                                        if (NIL != with_outputP) {
                                            SubLTrampolineFile.checkType($str_alt411$__entry_gaf___S__, STRINGP);
                                            format(T, cconcatenate($str_alt73$_A, $str_alt411$__entry_gaf___S__), with_outputP.isString() ? ((SubLObject) (with_outputP)) : $str_alt382$, reified_gaf);
                                        }
                                    }
                                    if (NIL != bbn_unknown_predicate_p(cycl_utilities.formula_arg0(reified_gaf))) {
                                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_REJECTED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg0(reified_gaf))) {
                                            final_gaf = bbn_verify_and_strengthen_gaf(the_hyp, reified_gaf, with_outputP, UNPROVIDED);
                                        } else
                                            if (NIL != list_utilities.list_of_list_p(reified_gaf)) {
                                                {
                                                    SubLObject whoopsP = NIL;
                                                    SubLObject tmp_gaf = NIL;
                                                    SubLObject cdolist_list_var = reified_gaf;
                                                    SubLObject this_gaf = NIL;
                                                    for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                                                        tmp_gaf = bbn_verify_and_strengthen_gaf(the_hyp, this_gaf, with_outputP, UNPROVIDED);
                                                        if (NIL != tmp_gaf) {
                                                            final_gaf = cons(tmp_gaf, final_gaf);
                                                        } else {
                                                            whoopsP = T;
                                                            if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                                                format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt413$rejected_sub_hypothesis__S__), UNPROVIDED), new SubLObject[]{ this_gaf, NIL, NIL });
                                                            }
                                                        }
                                                    }
                                                    if (NIL == whoopsP) {
                                                        final_gaf = reverse(final_gaf);
                                                    }
                                                }
                                            }


                                }
                            }
                        }
                    } finally {
                        $bbn_most_relevant_string$.rebind(_prev_bind_0, thread);
                    }
                }
                return final_gaf;
            }
        }
    }

    /**
     *
     *
     * @unknown verification has been (mostly?) moved to @see bbn-explore-term
     */
    public static final SubLObject bbn_verify_and_strengthen_gaf(SubLObject for_hyp, SubLObject workspace, SubLObject with_outputP, SubLObject via_unkP) {
        if (via_unkP == UNPROVIDED) {
            via_unkP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.list_of_list_p(workspace)) {
                {
                    SubLObject working_gafs = NIL;
                    SubLObject cdolist_list_var = workspace;
                    SubLObject this_gaf = NIL;
                    for (this_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_gaf = cdolist_list_var.first()) {
                        working_gafs = cons(bbn_verify_and_strengthen_gaf(NIL, this_gaf, with_outputP, T), working_gafs);
                    }
                    return reverse(working_gafs);
                }
            }
            {
                SubLObject working_gaf = workspace;
                SubLObject new_gaf = bbn_strengthen_binary_gaf(working_gaf, UNPROVIDED);
                while (!new_gaf.equalp(working_gaf)) {
                    working_gaf = new_gaf;
                    new_gaf = bbn_strengthen_binary_gaf(working_gaf, UNPROVIDED);
                } 
                if (!new_gaf.equalp(workspace)) {
                    bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_STRENGTHENED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != for_hyp) {
                        bbn_enter_strengthened_hypothesis(for_hyp, new_gaf, $bbn_strengthening_mt$.getDynamicValue(thread), workspace, $bbn_strengthening_mt$.getDynamicValue(thread), UNPROVIDED);
                        bbn_note_strengthening_done($$$exploring_predicates, workspace, format(NIL, $str_alt416$___S, new_gaf));
                    } else {
                        bbn_clear_temporary_formula(workspace, UNPROVIDED);
                        bbn_enter_strengthening_gaf(new_gaf, $$$on_spontaneous_gaf, workspace, format(NIL, $str_alt418$___A, new_gaf), UNPROVIDED);
                    }
                } else
                    if (NIL != bbn_sentence_is_falseP(new_gaf, UNPROVIDED)) {
                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_REJECTED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL == via_unkP) {
                            bbn_enter_spontaneous_gaf(new_gaf, $bbn_bookkeeping_mt$.getDynamicValue(thread));
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_ACCEPTED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }


                {
                    SubLObject args = cycl_utilities.formula_args(new_gaf, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject this_arg = NIL;
                    for (this_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_arg = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_40 = bbn_ask_variable($sym421$_INDIV, list($$ist_Asserted, $bbn_strengthening_mt$.getDynamicValue(thread), list($bbn_equality_predicate$.getDynamicValue(thread), $sym421$_INDIV, this_arg)), UNPROVIDED, UNPROVIDED);
                            SubLObject same_as = NIL;
                            for (same_as = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , same_as = cdolist_list_var_40.first()) {
                                bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_STRENGTHENED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                bbn_enter_strengthening_gaf(list_utilities.tree_substitute(new_gaf, this_arg, same_as), $$$term_to_constant_substitution, this_arg, same_as, UNPROVIDED);
                            }
                        }
                    }
                }
                if (NIL != el_utilities.el_binary_formula_p(working_gaf)) {
                    {
                        SubLObject cdolist_list_var = bbn_inversions_of_strengthened_hypothesis(working_gaf);
                        SubLObject inverted_gaf = NIL;
                        for (inverted_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inverted_gaf = cdolist_list_var.first()) {
                            {
                                SubLObject new_inversion = bbn_strengthen_binary_gaf(inverted_gaf, UNPROVIDED);
                                if (!new_inversion.equalp(inverted_gaf)) {
                                    bbn_enter_strengthening_gaf(new_gaf, $$$inverted_proposal, cycl_utilities.formula_arg0(working_gaf), new_inversion, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return working_gaf;
            }
        }
    }

    public static final SubLObject bbn_inversions_of_strengthened_hypothesis(SubLObject orig_gaf) {
        {
            SubLObject datum = orig_gaf;
            SubLObject current = datum;
            SubLObject was_pred = NIL;
            SubLObject was_arg1 = NIL;
            SubLObject was_arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt423);
            was_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt423);
            was_arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt423);
            was_arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject inv_list = NIL;
                    SubLObject cdolist_list_var = bbn_ask_variable_cached($sym425$_INV, list($$thereExists, $sym121$_MT, list($$and, list($$ist_Asserted, $sym121$_MT, listS($$genlInverse, was_pred, $list_alt426)), list($$different, $sym425$_INV, was_pred))), UNPROVIDED, UNPROVIDED);
                    SubLObject inverse_pred = NIL;
                    for (inverse_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inverse_pred = cdolist_list_var.first()) {
                        {
                            SubLObject gaf_with_terms = list(inverse_pred, was_arg2, was_arg1);
                            SubLObject gaf_with_entities = (NIL != bbn_useful_speculated_gafP(gaf_with_terms)) ? ((SubLObject) (gaf_with_terms)) : NIL;
                            if (NIL != gaf_with_entities) {
                                bbn_enter_strengthening_gaf(gaf_with_terms, $$$trivial_inversion, was_pred, inverse_pred, UNPROVIDED);
                                inv_list = cons(gaf_with_terms, inv_list);
                            }
                        }
                    }
                    return inv_list;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt423);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param EL-BINARY-FORMULA-P
     * 		
     * @return BOOLEANP ; T if the gaf is 'useful', i.e., not already known to be true,
    and passes our idiosyncratic, if presently small, battery of tests
     */
    public static final SubLObject bbn_useful_speculated_gafP(SubLObject spec_gaf) {
        if (NIL != bbn_sentence_is_trueP(spec_gaf, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject datum = spec_gaf;
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt288);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == bbn_admitted_cde_termP(arg1, ONE_INTEGER, pred)) || (NIL == bbn_admitted_cde_termP(arg2, TWO_INTEGER, pred))) {
                    return NIL;
                }
                if (NIL != bbn_sentence_is_trueP(list($$and, listS($$relationAllExists, pred, $list_alt428), listS($$isa, arg1, $list_alt429), list($$not, listS($$isa, arg2, $list_alt430))), UNPROVIDED)) {
                    return NIL;
                }
                if (NIL != bbn_sentence_is_trueP(list($$and, listS($$relationExistsAll, pred, $list_alt428), listS($$isa, arg2, $list_alt430), list($$not, listS($$isa, arg1, $list_alt429))), UNPROVIDED)) {
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt288);
            }
        }
        return T;
    }

    /**
     *
     *
     * @param EL-BINARY-FORMULA-P
     * 		; the gaf to strengthen
     * @param FUNCTION
     * 		; to call before doing anything else. highly optional
     * @return EL-BINARY-FORMULA-P ; possibly strengthened
     * @unknown this is consciously boneheaded, since I don't know how whether it's worth
    the time to make it particularly clever
     * @unknown in the BBN context, this won't do anything with a hypothesis-binary-sentence
    unless you convert its args to entity-mentions first
     */
    public static final SubLObject bbn_strengthen_binary_gaf(SubLObject binary_gaf, SubLObject prioritzed_func) {
        if (prioritzed_func == UNPROVIDED) {
            prioritzed_func = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_utilities.el_binary_formula_p(binary_gaf)) {
                if (NIL != prioritzed_func) {
                    {
                        SubLObject the_answer = NIL;
                        SubLObject use_this_gaf = binary_gaf;
                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ prioritzed_func, binary_gaf, NIL });
                        }
                        {
                            SubLObject datum = use_this_gaf;
                            SubLObject current = datum;
                            SubLObject pred = NIL;
                            SubLObject arg1 = NIL;
                            SubLObject arg2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt288);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt288);
                            arg1 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt288);
                            arg2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                the_answer = funcall(prioritzed_func, pred, arg1, arg2);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt288);
                            }
                        }
                        if (NIL != the_answer) {
                            binary_gaf = the_answer;
                        }
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_TYPED_GENL_PREDS, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_TYPED_GENL_PREDS, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ BBN_STRENGTHEN_ARGS_USING_HEADS, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(BBN_STRENGTHEN_ARGS_USING_HEADS, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_RELATION_EXISTS_ALL, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_RELATION_EXISTS_ALL, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_GENITIVE_SEM_TRANS, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_GENITIVE_SEM_TRANS, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_RELATIONAL_SPECPREDS, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_RELATIONAL_SPECPREDS, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_ARG2_ACTS_IN_CAPACITY, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_ARG2_ACTS_IN_CAPACITY, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_ARG1_REPRESENTATION, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_ARG1_REPRESENTATION, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_RELATIONAL_COMPOUNDING, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_RELATIONAL_COMPOUNDING, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ STRENGTHEN_VIA_ARG2_IS_SUBORG_VIA_FUNCTION, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(STRENGTHEN_VIA_ARG2_IS_SUBORG_VIA_FUNCTION, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ BBN_GENERATE_GOVERNMENT_TYPE, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(BBN_GENERATE_GOVERNMENT_TYPE, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                {
                    SubLObject the_answer = NIL;
                    SubLObject use_this_gaf = binary_gaf;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt374$calling__A_on__S__), UNPROVIDED), new SubLObject[]{ BBN_OWNS_TO_ASSETS_HACK, binary_gaf, NIL });
                    }
                    {
                        SubLObject datum = use_this_gaf;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt288);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            the_answer = funcall(BBN_OWNS_TO_ASSETS_HACK, pred, arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt288);
                        }
                    }
                    if (NIL != the_answer) {
                        binary_gaf = the_answer;
                    }
                }
                return binary_gaf;
            }
            return NIL;
        }
    }

    public static final SubLObject bbn_strengthen_args_using_heads(SubLObject the_pred, SubLObject arg1, SubLObject arg2) {
        return makeBoolean((NIL != bbn_strengthen_collection_using_head(arg1)) && (NIL != bbn_strengthen_collection_using_head(arg2)));
    }

    /**
     * Given an entity mention and its supposed nearestIsa, use its headstring
     * to strengthen the collection, possibly to a GroupFn
     *
     * @return EL-BINARY-FORMULA-P ; (#$isa ,the-term ,strongest-col-found)
     */
    public static final SubLObject bbn_strengthen_collection_using_head(SubLObject term_reified) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_schema = get_bbn_schema_from_reified_term(term_reified);
                SubLObject headstring = get_bbn_term_headstring(term_schema);
                SubLObject denots = (NIL != headstring) ? ((SubLObject) (bbn_find_term_phrases(headstring, UNPROVIDED))) : NIL;
                SubLObject asserted = (NIL != headstring) ? ((SubLObject) (bbn_get_asserted_isas(term_reified))) : NIL;
                SubLObject strong_col = NIL;
                if (NIL != headstring) {
                    {
                        SubLObject cdolist_list_var = denots;
                        SubLObject this_denot = NIL;
                        for (this_denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_denot = cdolist_list_var.first()) {
                            if (NIL != bbn_sentence_is_trueP(list($$and, list($$thereExists, $sym118$_COL, list($$and, list($$memberOfList, $sym118$_COL, asserted), list($$or, list($$or, listS($$equals, this_denot, $list_alt120), listS($$genls, this_denot, $list_alt120))))), list($$or, listS($$quotedIsa, this_denot, $list_alt444), list($$not, list($$thereExists, $sym445$_FUNC, list($$and, $list_alt446, listS($$natFunction, this_denot, $list_alt448)))))), $bbn_lexical_mt$.getDynamicValue(thread))) {
                                if ((NIL == strong_col) || (NIL != bbn_sentence_is_trueP(list($$genls, this_denot, strong_col), UNPROVIDED))) {
                                    strong_col = this_denot;
                                } else
                                    if (NIL != bbn_isa_prohibitedP(term_reified, this_denot)) {
                                    } else
                                        if (NIL != bbn_sentence_is_trueP(list($$genls, strong_col, this_denot), UNPROVIDED)) {
                                        } else
                                            if (!strong_col.eql(this_denot)) {
                                                return NIL;
                                            }



                            }
                        }
                    }
                    if (NIL != strong_col) {
                        if ((NIL != bbn_confirmed_term_phrases(list(strong_col), headstring, $$plural_Generic)) && (NIL == bbn_confirmed_term_phrases(list(strong_col), headstring, $$nonPlural_Generic))) {
                            strong_col = list($$GroupFn, strong_col);
                        }
                        if (NIL == bbn_isaP(term_reified, strong_col)) {
                            {
                                SubLObject cdolist_list_var = asserted;
                                SubLObject asserted_isa = NIL;
                                for (asserted_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asserted_isa = cdolist_list_var.first()) {
                                    if ((NIL != bbn_strengthening_metrics.serif_entity_type_p(asserted_isa)) && (NIL != genls.genl_in_any_mtP(strong_col, asserted_isa))) {
                                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_ENTITIES_STRENGTHENED, ONE_INTEGER, asserted_isa, UNPROVIDED);
                                    }
                                }
                            }
                            return bbn_enter_coerced_isa(list($$isa, term_reified, strong_col), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject bbn_extrapolate_quants_of_col(SubLObject full_string, SubLObject of_what) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != string_utilities.substringP($str_alt451$_of_, full_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return bbn_ask_template_cached($list_alt452, list($$and, list($$evaluate, $sym453$_OF_THESE, list($$ConcatenateStringsFn, $str_alt451$_of_, of_what)), list($$evaluate, $sym455$_QUANT_STRING, listS($$StringPostremoveFn, full_string, $list_alt457)), list($$different, $sym455$_QUANT_STRING, full_string), $list_alt458, $list_alt459, $list_alt460, list($$termStrings, $sym130$_DENOT, of_what)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return bbn_ask_template_cached($list_alt452, list($$and, list($$evaluate, $sym461$_WITH_SPACE, list($$ConcatenateStringsFn, $str_alt462$_, of_what)), list($$evaluate, $sym455$_QUANT_STRING, listS($$StringPostremoveFn, full_string, $list_alt463)), list($$different, $sym455$_QUANT_STRING, full_string), $list_alt458, $list_alt464, list($$termStrings, $sym130$_DENOT, of_what)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return (#$assets ARG1 ARG2) if deemed appropriate
    This is a hack to capture (owns X Y) + (positive-pred X Y) => (assets X Y),
    where presently #$headquarters is the only positive-pred. Basically I got tired
    of figuring out how to do this in a principled way in the KB
     */
    public static final SubLObject bbn_owns_to_assets_hack(SubLObject weak_pred, SubLObject arg1, SubLObject arg2) {
        if (weak_pred.eql($$owns)) {
            if (NIL != bbn_sentence_is_trueP(list($$headquarters, arg1, arg2), UNPROVIDED)) {
                return list($$assets, arg1, arg2);
            }
            if (NIL != bbn_isaP(arg2, $$DurableGood)) {
                return list($$assets, arg1, arg2);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return (#$governmentType <ARG2> <APPROPRIATE-TYPE>) based on analyzing arg2's
    strings wrt arg1's. E.g., if arg1 is "Kazakhstan 's parliament", and
    arg2 is "Kazakhstan", then a #$ParliamentaryGovernment gaf seems reasonable
     */
    public static final SubLObject bbn_generate_government_type(SubLObject the_pred, SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = bbn_ask_variable_traced($sym469$_GOVT, list($$and, listS($$genlPreds, the_pred, $list_alt471), listS($$isa, arg2, $list_alt472), listS($$bbnOtherStringAssertions, arg2, $list_alt473), $list_alt474, $list_alt475, $list_alt476, listS($$bbnOtherStringAssertions, arg1, $list_alt477)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != list_utilities.singletonP(v_bindings)) {
                    {
                        SubLObject gov_type = v_bindings.first();
                        SubLObject gov_gaf = list($$governmentType, arg2, gov_type);
                        if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(the_pred)) {
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, the_pred, UNPROVIDED);
                        }
                        bbn_enter_strengthening_gaf(gov_gaf, $$$government_type_established, arg2, gov_type, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param ANYTHING
     * 		; return nil for anything but '(#$InstanceNamedFn ??STRING ?COL)
     * @return COL ; the arg2 of the param, if appropriate
     */
    public static final SubLObject bbn_col_of_named_instance(SubLObject candidate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_kb_utilities.instance_named_fn_expression_p(candidate)) {
                {
                    SubLObject pattern = $list_alt481;
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(candidate, pattern);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                                return col;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-BINARY-FORMULA-P
     * 		; assumed to be a hypothesis' binary sentence
     * @return LISTP ; (PRED ENTITY1 ITS-STRINGS ENTITY2 ITS-STRINGS)
    where ITS-STRINGS is the entity's @see get-bbn-entity-mention-strings
     */
    public static final SubLObject bbn_quasi_gaf_with_headwords(SubLObject the_gaf, SubLObject hyp_of_pred) {
        if (hyp_of_pred == UNPROVIDED) {
            hyp_of_pred = NIL;
        }
        SubLTrampolineFile.checkType(the_gaf, EL_BINARY_FORMULA_P);
        {
            SubLObject datum = the_gaf;
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt288);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(pred, NIL != hyp_of_pred ? ((SubLObject) (get_bbn_relation_reference_headstring(get_bbn_hypothesis_relation_reference(hyp_of_pred)))) : $str_alt484$head_, arg1, get_bbn_term_preferred_string(arg1), arg2, get_bbn_term_preferred_string(arg2));
            } else {
                cdestructuring_bind_error(datum, $list_alt288);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param BINARY-PREDICATE-P
     * 		; to be possibly strengthened
     * @param ARG1
     * 		
     * @param ARG2
     * 		
     * @return EL-BINARY-FORMULA-P ; with a possibly-strengthened predicate
     * @unknown iff exactly one typedGenlPreds can be taken advantage of, do so
     */
    public static final SubLObject strengthen_via_typed_genl_preds(SubLObject weak_pred, SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = bbn_ask_variable_traced($sym485$_STRONG, listS($$and, new SubLObject[]{ list($$ist_Asserted, $sym486$_ANYWHERE, list($$typedGenlPreds, $sym485$_STRONG, weak_pred)), $list_alt488, listS($$isa, arg1, $list_alt429), $list_alt489, listS($$isa, arg2, $list_alt430), list($$not, list($$thereExists, $sym115$_X, listS($$equivPredsWRTTypes, weak_pred, $list_alt491))), $list_alt492 }), $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != list_utilities.singletonP(v_bindings)) {
                    {
                        SubLObject strong_pred = v_bindings.first();
                        if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                        }
                        bbn_note_strengthening_done($$$typedGenlPreds, weak_pred, strong_pred);
                        return list(strong_pred, arg1, arg2);
                    }
                }
            }
            {
                SubLObject v_bindings = bbn_ask_variable_traced($sym485$_STRONG, list($$and, listS($$genlPredsWRTTypes, weak_pred, $list_alt495), list($$not, listS($$equivPredsWRTTypes, weak_pred, $list_alt495)), listS($$isa, arg1, $list_alt496), listS($$isa, arg2, $list_alt497)), UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(v_bindings)) {
                    {
                        SubLObject strong_pred = v_bindings.first();
                        if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                            bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                        }
                        bbn_note_strengthening_done($$$genlPredsWRTTypes, weak_pred, strong_pred);
                        return list(strong_pred, arg1, arg2);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return EL-BINARY-FORMULA-P ; using strong-pred, if we can find exactly one
    such that (genlPreds strong-pred weak-pred) and (relationAllExists strong-pred arg1 arg2)
    hold
     */
    public static final SubLObject strengthen_via_relation_exists_all(SubLObject weak_pred, SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strong_pred = NIL;
                SubLObject cdolist_list_var = bbn_ask_template_traced($list_alt500, list($$and, list($$ist_Asserted, $sym486$_ANYWHERE, listS($$isa, arg2, $list_alt430)), $list_alt501, list($$different, $sym485$_STRONG, weak_pred), list($$genlPreds, $sym485$_STRONG, weak_pred)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject binding = NIL;
                        SubLObject col = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt499);
                        binding = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt499);
                        col = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != bbn_isaP(arg1, col)) {
                                if (NIL == strong_pred) {
                                    strong_pred = binding;
                                } else
                                    if (!binding.eql(strong_pred)) {
                                        return NIL;
                                    }

                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt499);
                        }
                    }
                }
                if (NIL != strong_pred) {
                    if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                    }
                    bbn_note_strengthening_done($str_alt502$via_relation_exists_all, weak_pred, strong_pred);
                    return list(strong_pred, arg1, arg2);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return EL-BINARY-FORMULA-P ; using strong-pred, if we can find exactly one
    such that (genlPreds strong-pred weak-pred) and (relationAllExists strong-pred arg1 arg2)
    hold
     */
    public static final SubLObject strengthen_via_relation_all_exists(SubLObject weak_pred, SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strong_pred = NIL;
                SubLObject cdolist_list_var = bbn_ask_variable_traced($sym485$_STRONG, list($$and, list($$genlPreds, $sym485$_STRONG, weak_pred), list($$different, $sym485$_STRONG, weak_pred), $list_alt503, listS($$isa, arg1, $list_alt429), listS($$isa, arg2, $list_alt430)), $bbn_bookkeeping_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    if (NIL == strong_pred) {
                        strong_pred = binding;
                    } else
                        if (!binding.eql(strong_pred)) {
                            return NIL;
                        }

                }
                if (NIL != strong_pred) {
                    if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                    }
                    bbn_note_strengthening_done($str_alt504$via_relation_all_exists, weak_pred, strong_pred);
                    return list(strong_pred, arg1, arg2);
                }
            }
            return NIL;
        }
    }

    /**
     * Given a #$BinaryPredicate and an args, if arg2's full string is the compound
     * of the two args' head strings, and a suitable nounSemTrans is found, exploit it.
     *
     * @return EL-BINARY-FORMULA-P
     * @unknown handle determiners, etc
     */
    public static final SubLObject strengthen_via_genitive_sem_trans(SubLObject weak_pred, SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1_strings = cons($$TheList, get_bbn_reified_term_strings(arg1, UNPROVIDED));
                SubLObject arg2_strings = cons($$TheList, get_bbn_reified_term_strings(arg2, UNPROVIDED));
                SubLObject possible_matches = bbn_ask_variable_traced($sym505$_HEAD, list($$thereExists, $sym506$_OF_SOMETHING, list($$thereExists, $sym507$_OF_THIS, listS($$and, list($$memberOfList, $sym508$_X_OF_Y, arg2_strings), list($$memberOfList, $sym507$_OF_THIS, arg1_strings), $list_alt509))), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject cdolist_list_var = possible_matches;
                SubLObject match = NIL;
                for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_41 = bbn_ask_variable_traced($sym511$_NEW_TRANS, list($$and, list($$wordForms, $sym253$_WU, $$nounStrings, match), $list_alt512, list($$evaluate, $sym511$_NEW_TRANS, list($$SubstituteFormulaFn, arg1, $POSSESSOR, listS($$SubstituteFormulaFn, arg2, $list_alt514)))), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                        SubLObject trans = NIL;
                        for (trans = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , trans = cdolist_list_var_41.first()) {
                            if (NIL != bbn_useful_speculated_gafP(trans)) {
                                {
                                    SubLObject strong_pred = cycl_utilities.formula_arg0(trans);
                                    if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                                    }
                                    if (NIL != genl_predicates.not_genl_predicateP(strong_pred, weak_pred, $bbn_strengthening_mt$.getDynamicValue(thread), UNPROVIDED)) {
                                        bbn_enter_strengthening_gaf(trans, $$$x_of_y_nounSemTrans, weak_pred, strong_pred, UNPROVIDED);
                                    }
                                    return trans;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Given a #$BinaryPredicate a focal #$Individual, and an ignored arg:
     * 1. Collect all the #$nearestSpecPreds of the predicate which have an arg2 denotation.
     * (If everyone's playing nicely, this is all such preds which are #$RelationalNounSlots.)
     * 2. Given those denotations, find all the collections they denote.
     * 3. Return a (possibly null) list of those spec-preds for which the focal individual
     * is an instance of the denotation's collection(s).
     * Example: #$hasWorkers (#$InstanceNamedFn "fred" #$PublicOfficial)
     * 1a. #$employees is a nearest spec-pred of #$hasWorkers.
     * 1b. #$Employee-TheWord denotes its arg2
     * 2.  #$Employee-TheWord also denotes #$Employee
     * 3.  #$PublicOfficial is a spec of #$Employee
     * ... therefore, we strengthen #$hasWorkers to #$employees in this case
     *
     * @see note 1 for strengthen-via-arg2-acts-in-capacity, which also applies here
     */
    public static final SubLObject strengthen_via_relational_specpreds(SubLObject weak_pred, SubLObject arg1, SubLObject focal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strong_pred = NIL;
                SubLObject headstring = bbn_deduce_term_headstring(focal);
                {
                    SubLObject cdolist_list_var = get_denots_via_nearest_relational_specpreds(weak_pred, UNPROVIDED);
                    SubLObject this_answer = NIL;
                    for (this_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_answer = cdolist_list_var.first()) {
                        {
                            SubLObject datum = this_answer;
                            SubLObject current = datum;
                            SubLObject this_pred = NIL;
                            SubLObject the_col = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt515);
                            this_pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt515);
                            the_col = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject supposed_isa = list($$isa, focal, the_col);
                                    if (NIL != bbn_sentence_is_trueP(supposed_isa, UNPROVIDED)) {
                                        if (NIL == bbn_admitted_cde_termP(arg1, ONE_INTEGER, strong_pred)) {
                                        } else
                                            if (NIL == strong_pred) {
                                                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt516$focal_qualifies______isa__S__S___), UNPROVIDED), new SubLObject[]{ focal, the_col, NIL });
                                                }
                                                strong_pred = this_pred;
                                            } else
                                                if (!strong_pred.eql(this_pred)) {
                                                    return NIL;
                                                }


                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt515);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = get_units_via_nearest_relational_specpreds(weak_pred, UNPROVIDED);
                    SubLObject this_wu = NIL;
                    for (this_wu = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_wu = cdolist_list_var.first()) {
                        {
                            SubLObject datum = this_wu;
                            SubLObject current = datum;
                            SubLObject this_pred = NIL;
                            SubLObject the_wu = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt517);
                            this_pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt517);
                            the_wu = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$termStrings, this_pred, headstring), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED))) {
                                    if (NIL == strong_pred) {
                                        if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt518$units_____termStrings__S__S___), UNPROVIDED), new SubLObject[]{ this_pred, headstring, NIL });
                                        }
                                        strong_pred = this_pred;
                                    } else
                                        if (!strong_pred.eql(this_pred)) {
                                            return NIL;
                                        }

                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt517);
                            }
                        }
                    }
                }
                if (NIL != strong_pred) {
                    if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                        bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                    }
                    bbn_note_strengthening_done($str_alt519$relational_specpreds, weak_pred, strong_pred);
                    return list(strong_pred, arg1, focal);
                }
            }
            return NIL;
        }
    }

    /**
     * Given a #$BinaryPredicate and optionally a #$SpeechPartPredicate, find all the
     * immediate spec-preds which have any #$denotesArgInReln for their arg2's, provided
     * (<SPEECH-PART-PRED> <THE-DENOTATION> ?STRING) has any bindings. Return just a list
     * of those relations.
     *
     * @unknown I would combine this and @xref get-denots-via-nearest-relational-specpreds
    if these functions weren't going to become KB rules eventually
     */
    public static final SubLObject get_units_via_nearest_relational_specpreds(SubLObject pred, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = $$singular;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(pred)) {
                return bbn_ask_template_cached($list_alt521, list($$and, list($$nearestGenlPreds, $sym523$_RELN, pred), $list_alt524, list($$speechPartPreds, $sym255$_POS, pos_pred)), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Given a #$BinaryPredicate and optionally a #$SpeechPartPredicate, find all the
     * immediate spec-preds which have any #$denotesArgInReln for their arg2's, provided
     * (<SPEECH-PART-PRED> <THE-DENOTATION> ?STRING) has any bindings. Return a list
     * of those predicates, along with the collections which are denoted by those arg2s'
     * denotations.
     *
     * @unknown get-strings-via-nearest-relational-specpreds
     */
    public static final SubLObject get_denots_via_nearest_relational_specpreds(SubLObject pred, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = $$singular;
        }
        if (NIL != forts.fort_p(pred)) {
            {
                SubLObject answers = NIL;
                SubLObject cdolist_list_var = bbn_ask_template_cached($list_alt526, list($$thereExists, $sym305$_WS, list($$thereExists, $sym253$_WU, list($$thereExists, $sym255$_POS, listS($$and, list($$nearestGenlPreds, $sym523$_RELN, pred), $list_alt524, list($$speechPartPreds, $sym255$_POS, pos_pred), $list_alt527)))), UNPROVIDED, UNPROVIDED);
                SubLObject this_binding = NIL;
                for (this_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_binding = cdolist_list_var.first()) {
                    {
                        SubLObject datum = this_binding;
                        SubLObject current = datum;
                        SubLObject this_reln = NIL;
                        SubLObject this_denot = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt525);
                        this_reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt525);
                        this_denot = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != bbn_admitted_generallyP(this_denot, TWO_INTEGER, this_reln)) {
                                answers = cons(this_binding, answers);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt525);
                        }
                    }
                }
                return reverse(answers);
            }
        }
        return NIL;
    }

    /**
     * Given the typical sorts of things we find in a hypothesis' binary formula,
     * leverage English compounding to look for a stronger predicate. Specifically,
     * investigate the compound formed by [MOD HEAD], where MOD is arg1's headword-string
     * and HEAD is arg2's. If this compound is found to denote the arg2 of exactly 1
     * specialization of weak-pred, return the modified gaf.
     */
    public static final SubLObject strengthen_via_relational_compounding(SubLObject weak_pred, SubLObject arg1, SubLObject arg2) {
        {
            SubLObject strong_pred = NIL;
            SubLObject string1 = bbn_deduce_term_headstring(arg1);
            SubLObject string2 = bbn_deduce_term_headstring(arg2);
            if (!(string1.isString() && string2.isString())) {
                return NIL;
            }
            return NIL;
        }
    }

    /**
     * Given a #$BinaryPredicate, a focal #$Individual, and a possibly-supervising #$Individual:
     * 1. Determine if (<PREDICATE> <SUPERVISING?> <FOCAL>) w.r.t. some ?CAPACITY (a collection).
     * ... in the long run, we need #$hasAgentsInCapacity for this.  there are similar
     * predicates in the KB, but they're too specific about the capacity played
     * (e.g., #$representsAgentToAgent) or don't go so far as to say 'X serves _for Y_
     * in this capacity (e.g., #$actsInCapacity)
     * ... @todo #$positionOfPersonInOrganization might be what I'm looking for
     * ... but for purposes of BBN strengthening, in all the cases I've found where we try
     * to strengthen (#$hasAgents <WHATEVER> (#$InstanceNamedFn ??STRING ?COL)),
     * the fact that the instance servers <WHATEVER> w.r.t. being a ?COL is what
     * caused the connection to be asserted at all, so I'm making the capacity
     * 2. Find all of <PREDICATE>'s immediate spec-preds which can be strengthened from it
     * on the basis of ?CAPACITY
     * ... this is also hacked up for BBN at the moment
     * 3. If there is only 1 such spec-pred, return it.
     */
    public static final SubLObject strengthen_via_arg2_acts_in_capacity(SubLObject weak_pred, SubLObject supervisory, SubLObject capacity) {
        {
            SubLObject strong_pred = NIL;
            if ((NIL != forts.fort_p(weak_pred)) && (NIL != forts.fort_p(supervisory))) {
                {
                    SubLObject cdolist_list_var = bbn_ask_variable_cached($sym485$_STRONG, listS($$and, new SubLObject[]{ list($$ist_Asserted, $sym121$_MT, listS($$isa, capacity, $list_alt534)), $list_alt535, list($$nearestGenlPreds, $sym485$_STRONG, weak_pred), $list_alt536, listS($$isa, supervisory, $list_alt537), $list_alt538 }), UNPROVIDED, UNPROVIDED);
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        if (NIL == bbn_genlpreds_wrt_capacityP(binding, weak_pred, capacity)) {
                        } else
                            if (NIL == strong_pred) {
                                strong_pred = binding;
                            } else
                                if (!binding.eql(strong_pred)) {
                                    return NIL;
                                }


                    }
                }
            }
            if (NIL != strong_pred) {
                if (NIL != bbn_strengthening_metrics.serif_relationship_type_p(weak_pred)) {
                    bbn_strengthening_metrics.bbn_increment_strengthening_metric($KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED, ONE_INTEGER, weak_pred, UNPROVIDED);
                }
                bbn_note_strengthening_done($str_alt539$arg2_acts_in_capacity, weak_pred, strong_pred);
                return list(strong_pred, supervisory, capacity);
            }
        }
        return NIL;
    }

    /**
     * This is a hack until we get #$genlPredsWRTCapacity or something into the KB.
     *
     * @param #$Collection
     * 		
     * @param #$BinaryPredicate
     * 		
     * @param #$BinaryPredicate
     * 		
     * @return T if we'd expect a (genlPredsWRTCapacity STRONG WEAK CAP) or its ilk in the KB
     */
    public static final SubLObject bbn_genlpreds_wrt_capacityP(SubLObject strong_pred, SubLObject weak_pred, SubLObject capacity) {
        if (((NIL != isa.isaP(capacity, $$PersonTypeByOccupation, UNPROVIDED, UNPROVIDED)) && weak_pred.eql($$hasAgents)) && strong_pred.eql($$hasWorkers)) {
            return T;
        }
        return NIL;
    }

    /**
     * The core idea here is, if agent X represents focal in some EVT-TYPE,
     * and we can link the relationship between focal and arg2 as resulting from some EVT-TYPE,
     * then we strengthen the relationship to agent X. For example, the USA doesn't
     * hire people, its GovernmentFn does, so we can strengthen (employees USA <WHOEVER>)
     * to (GovernmentFn USA).
     * For this to work you need to assert this in (ContentMtFn BBN-KS):
     * (#$representsAgentInEventType (#$GovernmentFn #$UnitedStatesOfAmerica) #$UnitedStatesOfAmerica #$EmployeeHiring)
     */
    public static final SubLObject strengthen_via_arg1_representation(SubLObject the_pred, SubLObject focal, SubLObject arg2) {
        {
            SubLObject strong_indiv = NIL;
            if ((NIL != forts.fort_p(the_pred)) && (NIL != forts.fort_p(focal))) {
                {
                    SubLObject cdolist_list_var = bbn_ask_variable_cached($sym445$_FUNC, listS($$and, listS($$representsAgentInEventType, $sym544$_OF_TERM, focal, $list_alt545), $list_alt546, list($$natArgument, $sym544$_OF_TERM, ONE_INTEGER, focal), list($$ist, $bbn_lexical_mt$, listS($$denotesArgInReln, $sym549$_WORD, $sym255$_POS, the_pred, $list_alt550)), $list_alt551), UNPROVIDED, UNPROVIDED);
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        if (NIL == strong_indiv) {
                            strong_indiv = list(binding, focal);
                        } else
                            if (!strong_indiv.eql(list(binding, focal))) {
                                return NIL;
                            }

                    }
                }
            }
            if (NIL != strong_indiv) {
                bbn_strengthening_metrics.bbn_increment_strengthening_metric($HYPOTHESES_STRENGTHENED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                bbn_note_strengthening_done($str_alt552$arg1_representation, focal, strong_indiv);
                return list(the_pred, strong_indiv, arg2);
            }
        }
        return NIL;
    }

    public static final SubLObject bbn_document_strengthen_entity_mentions(SubLObject v_document) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject strengthened = ZERO_INTEGER;
                SubLObject time = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                    try {
                        $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_42 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject cdolist_list_var = get_bbn_document_hypotheses(v_document);
                                                SubLObject hypothesis = NIL;
                                                for (hypothesis = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hypothesis = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject _prev_bind_0_43 = $bbn_strengthening_problem_store$.currentBinding(thread);
                                                        try {
                                                            $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                                                            {
                                                                SubLObject state_44 = memoization_state.possibly_new_memoization_state();
                                                                SubLObject local_state_45 = state_44;
                                                                {
                                                                    SubLObject _prev_bind_0_46 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                    try {
                                                                        memoization_state.$memoization_state$.bind(local_state_45, thread);
                                                                        {
                                                                            SubLObject original_memoization_process_47 = NIL;
                                                                            if ((NIL != local_state_45) && (NIL == memoization_state.memoization_state_lock(local_state_45))) {
                                                                                original_memoization_process_47 = memoization_state.memoization_state_get_current_process_internal(local_state_45);
                                                                                {
                                                                                    SubLObject current_proc = current_process();
                                                                                    if (NIL == original_memoization_process_47) {
                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state_45, current_proc);
                                                                                    } else {
                                                                                        if (original_memoization_process_47 != current_proc) {
                                                                                            Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            try {
                                                                                {
                                                                                    SubLObject cdolist_list_var_48 = get_bbn_hypothesis_entity_mentions(hypothesis, UNPROVIDED, UNPROVIDED);
                                                                                    SubLObject pair = NIL;
                                                                                    for (pair = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest() , pair = cdolist_list_var_48.first()) {
                                                                                        {
                                                                                            SubLObject datum = pair;
                                                                                            SubLObject current = datum;
                                                                                            SubLObject entity_mention = NIL;
                                                                                            SubLObject arg_num = NIL;
                                                                                            destructuring_bind_must_consp(current, datum, $list_alt553);
                                                                                            entity_mention = current.first();
                                                                                            current = current.rest();
                                                                                            destructuring_bind_must_consp(current, datum, $list_alt553);
                                                                                            arg_num = current.first();
                                                                                            current = current.rest();
                                                                                            if (NIL == current) {
                                                                                                total = add(total, ONE_INTEGER);
                                                                                                {
                                                                                                    SubLObject strengthenedP = bbn_entity_mention_strengthen(entity_mention);
                                                                                                    if (NIL != strengthenedP) {
                                                                                                        strengthened = add(strengthened, ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum, $list_alt553);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if ((NIL != local_state_45) && (NIL == original_memoization_process_47)) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state_45, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_49, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_46, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $bbn_strengthening_problem_store$.rebind(_prev_bind_0_43, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_42, thread);
                                }
                            }
                        }
                    } finally {
                        $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                format(T, $str_alt554$__Strengthened__S_of__S_entity_me, new SubLObject[]{ strengthened, total, time });
            }
            return v_document;
        }
    }

    public static final SubLObject bbn_entity_mention_strengthen(SubLObject entity_mention) {
        {
            SubLObject cycl_referents = bbn_entity_mention_cycl_referents(entity_mention);
            SubLObject best_cycl_referent = choose_best_cycl_referent(cycl_referents);
            SubLObject strengthenedP = NIL;
            if (NIL != best_cycl_referent) {
                record_bbn_entity_mention_strengthening(entity_mention, best_cycl_referent);
                strengthenedP = T;
            }
            return strengthenedP;
        }
    }

    public static final SubLObject choose_best_cycl_referent(SubLObject cycl_referents) {
        if (NIL != list_utilities.singletonP(cycl_referents)) {
            return cycl_referents.first();
        } else {
            return NIL;
        }
    }

    public static final SubLObject record_bbn_entity_mention_strengthening(SubLObject entity_mention, SubLObject cycl_referent) {
        format(T, $str_alt555$___S___S__, entity_mention, cycl_referent);
        return entity_mention;
    }

    /**
     *
     *
     * @return LISTP; of CycL terms that ENTITY-MENTION might denote.
     */
    public static final SubLObject bbn_entity_mention_cycl_referents(SubLObject entity_mention) {
        {
            SubLObject cycl_referents = NIL;
            SubLObject headstring = get_bbn_entity_mention_headstring(entity_mention);
            if (headstring.isString()) {
                {
                    SubLObject cdolist_list_var = get_bbn_entity_mention_referents(entity_mention);
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_51 = get_bbn_term_isas(v_term);
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var_51.first(); NIL != cdolist_list_var_51; cdolist_list_var_51 = cdolist_list_var_51.rest() , v_isa = cdolist_list_var_51.first()) {
                                {
                                    SubLObject cdolist_list_var_52 = lexicon_accessors.typed_denots_of_string(headstring, v_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject cycl_referent = NIL;
                                    for (cycl_referent = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , cycl_referent = cdolist_list_var_52.first()) {
                                        {
                                            SubLObject item_var = cycl_referent;
                                            if (NIL == member(item_var, cycl_referents, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                cycl_referents = cons(item_var, cycl_referents);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return cycl_referents;
        }
    }

    /**
     * See if we can find a unique function such that:
     * 1) the function is unary
     * 2) hyp-super is a possible arg of the function (judging by the head)
     * 3) the function's resultIsa can be an arg2 of the-pred
     */
    public static final SubLObject strengthen_via_arg2_is_suborg_via_function(SubLObject the_pred, SubLObject hyp_super, SubLObject hyp_sub) {
        if (NIL == forts.fort_p(hyp_super)) {
            return NIL;
        }
        {
            SubLObject sub_found = NIL;
            SubLObject headstring = bbn_deduce_term_headstring(hyp_sub);
            if (headstring.isString()) {
                {
                    SubLObject cdolist_list_var = bbn_confirmed_term_strings(bbn_ask_variable($sym445$_FUNC, list($$and, $list_alt556, list($$equals, $sym557$_ORG, list($sym445$_FUNC, hyp_super)), list($$admittedArgument, $sym557$_ORG, TWO_INTEGER, the_pred)), $$RelationParaphraseMt, UNPROVIDED), headstring);
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        if (NIL != binding) {
                            {
                                SubLObject the_nart = list(binding, hyp_super);
                                if (NIL == sub_found) {
                                    sub_found = the_nart;
                                } else
                                    if (!the_nart.equalp(sub_found)) {
                                        return NIL;
                                    }

                            }
                        }
                    }
                }
                if (NIL != sub_found) {
                    bbn_note_strengthening_done($str_alt559$arg2_isa_suborg_via_function, hyp_sub, sub_found);
                    return list(the_pred, hyp_super, sub_found);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject pprint_bbn_document(SubLObject the_doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.non_negative_integer_p(the_doc)) {
                the_doc = list($$SchemaObjectFn, $$CDE_document_LS, the_doc);
            }
            if (the_doc.eql($RANDOM)) {
                the_doc = random_bbn_document(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                try {
                    $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                    {
                        SubLObject state = memoization_state.possibly_new_memoization_state();
                        SubLObject local_state = state;
                        {
                            SubLObject _prev_bind_0_53 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    SubLObject original_memoization_process = NIL;
                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                        {
                                            SubLObject current_proc = current_process();
                                            if (NIL == original_memoization_process) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                            } else {
                                                if (original_memoization_process != current_proc) {
                                                    Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        {
                                            SubLObject cdolist_list_var = get_bbn_document_hypotheses(the_doc);
                                            SubLObject this_hyp = NIL;
                                            for (this_hyp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_hyp = cdolist_list_var.first()) {
                                                pprint_bbn_hypothesis(this_hyp, the_doc);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_53, thread);
                            }
                        }
                    }
                } finally {
                    $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
            return the_doc;
        }
    }

    public static final SubLObject pprint_bbn_hypothesis(SubLObject the_hyp, SubLObject the_doc) {
        if (the_doc == UNPROVIDED) {
            the_doc = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.non_negative_integer_p(the_hyp)) {
                the_hyp = list($$SchemaObjectFn, $$CDE_hypothesis_LS, the_hyp);
            }
            {
                SubLObject the_gaf = get_bbn_hypothesis_binary_sentences(the_hyp).first();
                SubLObject the_reln = (NIL != the_gaf) ? ((SubLObject) (get_bbn_hypothesis_relation_reference(the_hyp))) : NIL;
                SubLObject headstring = (NIL != bbn_unknown_predicate_p(the_reln)) ? ((SubLObject) (get_bbn_relation_reference_headstring(the_reln))) : NIL;
                SubLObject the_roles = (NIL != headstring) ? ((SubLObject) (get_bbn_hypothesis_arg_roles_mapped(the_hyp))) : NIL;
                format(T, $str_alt561$HYP__S__, the_hyp);
                format(T, $str_alt356$_S__, get_bbn_hypothesis_textstring(the_hyp));
                if (NIL != the_doc) {
                    format(T, $str_alt562$__in__S___, the_hyp, the_doc);
                }
                if (NIL == the_gaf) {
                    format(T, $str_alt563$______no_binary_sentences______);
                    return NIL;
                }
                if (NIL != headstring) {
                    format(T, $str_alt564$_____A___S___A__, new SubLObject[]{ cycl_utilities.formula_arg0(the_gaf), headstring, the_roles });
                } else {
                    format(T, $str_alt565$_____A__, cycl_utilities.formula_arg0(the_gaf));
                }
                format(T, $str_alt566$__entities_mentioned___);
                {
                    SubLObject _prev_bind_0 = $bbn_strengthening_problem_store$.currentBinding(thread);
                    try {
                        $bbn_strengthening_problem_store$.bind(find_or_create_bbn_strengthening_problem_store(), thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_55 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt234$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject cdolist_list_var = get_bbn_hypothesis_entity_mentions(the_hyp, UNPROVIDED, UNPROVIDED);
                                                SubLObject pair = NIL;
                                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = pair;
                                                        SubLObject current = datum;
                                                        SubLObject this_ent = NIL;
                                                        SubLObject this_arg = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt567);
                                                        this_ent = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt567);
                                                        this_arg = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            format(T, $str_alt568$_____A___S___S__, new SubLObject[]{ this_arg, this_ent, get_bbn_entity_mention_headstring(this_ent) });
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt567);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_55, thread);
                                }
                            }
                        }
                    } finally {
                        $bbn_strengthening_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                format(T, $str_alt569$__binary_sentences___);
                {
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(the_gaf, UNPROVIDED);
                    SubLObject the_term = NIL;
                    for (the_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , the_term = cdolist_list_var.first()) {
                        format(T, $str_alt570$_________S__S__, the_term, get_bbn_term_longest_string(the_term));
                    }
                }
                return the_hyp;
            }
        }
    }

    public static final SubLObject do_bbn_terms(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt571);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_term = NIL;
                    SubLObject term_num = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt571);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt571);
                    term_num = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_57 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt571);
                            current_57 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt571);
                            if (NIL == member(current_57, $list_alt157, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_57 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt571);
                        }
                        {
                            SubLObject every_tail = property_list_member($EVERY, current);
                            SubLObject every = (NIL != every_tail) ? ((SubLObject) (cadr(every_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject term_count = $sym572$TERM_COUNT;
                                return list(WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE, list(CLET, list(bq_cons(term_count, $list_alt573)), list(CDOTIMES, list(term_num, term_count), list(PWHEN, list(COR, list(NULL, every), list(INTEGERP, list($sym164$_, term_num, every))), listS(CLET, list(list(v_term, list(LIST, $$SchemaObjectFn, $$CDE_term_LS, term_num))), append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown for lack of a decent query
     */
    public static final SubLObject count_bbn_terms() {
        return $int$500000;
    }

    /**
     *
     *
     * @param (SchemaObjectFn
     * 		CDE-term-LS X)
     * @param COLLECTION-P
     * 		
     * @return a constant corresponding to a CDE-term-LS, which #$isa the collection,
    or NIL if the collection is #$Thing
     */
    public static final SubLObject bbn_reify_schema_term(SubLObject v_term, SubLObject as_col) {
        if (as_col == UNPROVIDED) {
            as_col = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == as_col) || as_col.eql($$Thing)) {
                as_col = get_bbn_term_hyp_isas(v_term).first();
            }
            if (NIL == constant_handles.constant_p(as_col)) {
                if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt576$Can_t_reify_schema_based_on__A__), UNPROVIDED), new SubLObject[]{ as_col, NIL, NIL });
                }
                return NIL;
            }
            if (NIL != forts.fort_p(narts_high.nart_substitute(v_term))) {
                return v_term;
            }
            {
                SubLObject term_name = format(NIL, $str_alt577$BBN_CDE_Reified_Term__A, cycl_utilities.formula_arg2(v_term, UNPROVIDED));
                SubLObject the_constant = constants_high.find_constant(term_name);
                if (NIL == the_constant) {
                    the_constant = fi.fi_create_int(term_name, UNPROVIDED);
                    if (NIL != $bbn_log_stream$.getDynamicValue(thread)) {
                        format($bbn_log_stream$.getDynamicValue(thread), $str_alt319$Constant___A___, term_name);
                    }
                }
                if (NIL == constant_handles.constant_p(the_constant)) {
                    return NIL;
                }
                {
                    SubLObject isa_gaf = list($$isa, the_constant, as_col);
                    if (NIL == bbn_sentence_is_trueP(isa_gaf, $$UniversalVocabularyMt)) {
                        if (NIL != bbn_sentence_is_falseP(isa_gaf, UNPROVIDED)) {
                            if ($bbn_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                                format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt579$_S_is_known_to_not_be_a__S), UNPROVIDED), new SubLObject[]{ the_constant, as_col, NIL });
                            }
                        } else {
                            bbn_enter_spontaneous_gaf(isa_gaf, $$UniversalVocabularyMt);
                        }
                    }
                }
                bbn_enter_bookkeeping_gaf(list($$reifiedAsForEfficiency, v_term, the_constant), $bbn_verification_mt$.getDynamicValue(thread));
                {
                    SubLObject cdolist_list_var = get_bbn_term_preferred_string(v_term);
                    SubLObject this_string = NIL;
                    for (this_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_string = cdolist_list_var.first()) {
                        bbn_enter_bookkeeping_gaf(list($$bbnCoreStringAssertion, the_constant, this_string), UNPROVIDED);
                    }
                }
                if (NIL == get_bbn_reified_term_secondary_strings(v_term)) {
                    import_bbn_term_strings(v_term, the_constant, NIL);
                }
                return the_constant;
            }
        }
    }

    /**
     *
     *
     * @param (SchemaObjectFn
     * 		CDE-term_LS X) ; or just the X, in which case the nat gets constructed
     * @param COLLECTION
     * 		; optional - consider this term to be this isa, regardless of what BBN-KS says.
     * @unknown the optional arg is mostly for debugging purposes when the BBN-KS spigot is turned off
     * @return the doppelganger found or created, if any
     */
    public static final SubLObject bbn_explore_term(SubLObject v_term, SubLObject as_col) {
        if (as_col == UNPROVIDED) {
            as_col = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_term.isNumber()) {
                v_term = list($$SchemaObjectFn, $$CDE_term_LS, v_term);
            }
            if (NIL == sksi_kb_accessors.schema_object_fn_expression_p(v_term)) {
                return NIL;
            }
            {
                SubLObject reified_version = (NIL != $bbn_explore_it_anywayP$.getDynamicValue(thread)) ? ((SubLObject) (NIL)) : get_bbn_reified_term_from_schema(v_term);
                if (NIL != reified_version) {
                    return reified_version;
                }
                if (NIL != bbn_time_limit_exceededP()) {
                    return NIL;
                }
                sksi_sks_manager.register_sksi_removal_modules_for_skses($list_alt580);
                bbn_strengthening_metrics.bbn_increment_strengthening_metric($ENTITIES_INVESTIGATED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                reified_version = (NIL != as_col) ? ((SubLObject) (bbn_reify_schema_term(v_term, as_col))) : bbn_reify_schema_term(v_term, UNPROVIDED);
                if (NIL == reified_version) {
                    return NIL;
                }
                {
                    SubLObject term_string = bbn_ask_variable($sym213$_STRING, listS($$and, listS($$isa, reified_version, $list_alt582), list($$memberOfList, $sym213$_STRING, list($$TheList, get_bbn_reified_term_strings(reified_version, UNPROVIDED))), $list_alt583), $bbn_lexical_mt$.getDynamicValue(thread), $list_alt201).first();
                    if (NIL != term_string) {
                        {
                            SubLObject _prev_bind_0 = $bbn_most_relevant_string$.currentBinding(thread);
                            try {
                                $bbn_most_relevant_string$.bind(term_string, thread);
                                bbn_enter_coerced_isa(list($$isa, reified_version, $$Business), UNPROVIDED);
                            } finally {
                                $bbn_most_relevant_string$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                if (NIL != bbn_isaP(reified_version, $$Person)) {
                    bbn_explore_genders_from_pronouns(reified_version);
                }
                {
                    SubLObject cdolist_list_var = get_bbn_reified_term_strings(reified_version, $SPLIT);
                    SubLObject strings = NIL;
                    for (strings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strings = cdolist_list_var.first()) {
                        bbn_explore_strings_via_constraints(reified_version, strings);
                    }
                }
                return reified_version;
            }
        }
    }

    public static final SubLObject bbn_explore_quantity(SubLObject nbar_strings, SubLObject constant, SubLObject the_quantity, SubLObject the_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_gaf = NIL;
                SubLObject quant_gaf = NIL;
                SubLObject parses = bbn_ask_template_traced($list_alt587, list($$thereExists, $sym588$_WRT_RESULT, listS($$and, new SubLObject[]{ list($$ist_Asserted, $sym588$_WRT_RESULT, listS($$resultIsa, cycl_utilities.formula_arg0(the_quantity), $list_alt590)), $list_alt591, listS($$admittedArgument, the_quantity, $list_alt592), $list_alt593, $list_alt594, list($$termPhrases, $sym130$_DENOT, $$MassNoun, string_utilities.bunge(nbar_strings, UNPROVIDED)), $list_alt596 })), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != list_utilities.singletonP(parses)) {
                    {
                        SubLObject datum = parses.first();
                        SubLObject current = datum;
                        SubLObject denot = NIL;
                        SubLObject pred = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt597);
                        denot = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt597);
                        pred = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject _prev_bind_0 = $bbn_most_relevant_string$.currentBinding(thread);
                                try {
                                    $bbn_most_relevant_string$.bind(the_answer, thread);
                                    isa_gaf = bbn_enter_coerced_isa(list($$isa, constant, denot), UNPROVIDED);
                                    quant_gaf = bbn_enter_strengthening_gaf(list(pred, constant, the_quantity), $$$quantity_parse, constant, the_quantity, UNPROVIDED);
                                } finally {
                                    $bbn_most_relevant_string$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt597);
                        }
                    }
                }
                if ((NIL != quant_gaf) || (NIL != isa_gaf)) {
                    bbn_enter_spontaneous_gaf(list($$termStrings, constant, string_utilities.bunge(nbar_strings, UNPROVIDED)), $bbn_lexical_mt$.getDynamicValue(thread));
                }
                return values(quant_gaf, isa_gaf);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $bbn_assertion_filter$ = makeSymbol("*BBN-ASSERTION-FILTER*");

    // defparameter
    private static final SubLSymbol $bbn_lexical_assertion_filter$ = makeSymbol("*BBN-LEXICAL-ASSERTION-FILTER*");

    /**
     *
     *
     * @param CONSTANT-P
     * 		; presumably a doppelganger
     * @param LISTP
     * 		of STRING ; to be parsed
     * @return the results of @see constrained-parse-of-strings-for-term
     * @unknown forces all resulting gafs to go into *bbn-strengthening-mt*
    exception: #$nameString and its specs go into *bbn-lexical-mt*
     */
    public static final SubLObject bbn_explore_strings_via_constraints(SubLObject constant, SubLObject strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sksi_sks_manager.deregister_sksi_removal_modules_for_skses($list_alt580);
            constrained_parsing.initialize_constrained_parsing(UNPROVIDED, UNPROVIDED);
            if (NIL == $bbn_assertion_filter$.getDynamicValue(thread)) {
                $bbn_assertion_filter$.setDynamicValue(constrained_parsing.new_parsing_arbitrary_filter($ASSERTINTOMT, $$Relation, $bbn_strengthening_mt$.getDynamicValue(thread)), thread);
            }
            if (NIL == $bbn_lexical_assertion_filter$.getDynamicValue(thread)) {
                $bbn_lexical_assertion_filter$.setDynamicValue(constrained_parsing.new_parsing_arbitrary_filter($ASSERTINTOMT, $$nameString, $bbn_lexical_mt$.getDynamicValue(thread)), thread);
            }
            constrained_parsing.frontload_parsing_constraint($bbn_assertion_filter$.getDynamicValue(thread));
            constrained_parsing.frontload_parsing_constraint($bbn_lexical_assertion_filter$.getDynamicValue(thread));
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = constrained_parsing.$constrained_parsing_tracking_stringsP$.currentBinding(thread);
                    try {
                        constrained_parsing.$constrained_parsing_tracking_stringsP$.bind(T, thread);
                        v_answer = constrained_parsing.constrained_parse_of_strings_for_term(constant, strings);
                    } finally {
                        constrained_parsing.$constrained_parsing_tracking_stringsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * establish constant as either male or female from termstrings, if possible.
     *
     * @return MaleHuman or FemaleHuman, if established
     */
    public static final SubLObject bbn_explore_genders_from_pronouns(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == bbn_sentence_is_trueP(listS($$isa, constant, $list_alt601), UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject genders = bbn_ask_variable_cached($sym602$_GENDER, list($$thereExists, $sym603$_NART, list($$thereExists, $sym213$_STRING, listS($$and, list($$ist, $$BBN_CDE_BookkeepingMt, listS($$bbnOtherStringAssertions, constant, $list_alt214)), $list_alt604))), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != list_utilities.lengthE(genders, TWO_INTEGER, UNPROVIDED)) {
                    bbn_enter_strengthening_gaf(list($$hypothesizedGendersConflict, constant, $$MaleHuman, $$FemaleHuman), $str_alt608$term_strings_disagree_about_gende, constant, get_bbn_reified_term_secondary_strings(constant), $bbn_bookkeeping_mt$.getDynamicValue(thread));
                } else
                    if (genders.first().eql($$Feminine_NLAttr)) {
                        bbn_enter_strengthening_gaf(list($$isa, constant, $$FemaleHuman), $$$gender_determined, constant, $$FemaleHuman, UNPROVIDED);
                        return $$FemaleHuman;
                    } else
                        if (genders.first().eql($$Masculine_NLAttr)) {
                            bbn_enter_strengthening_gaf(list($$isa, constant, $$MaleHuman), $$$gender_determined, constant, $$MaleHuman, UNPROVIDED);
                            return $$MaleHuman;
                        }


            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return BOOLEANP ; whether we added name info to the constant equating term
    search the term strings looking for 'TITLE X', assume the last name is X,
    then also look for an 'Y X' and assume Y is the given name
     */
    public static final SubLObject bbn_explore_names_for_person(SubLObject words, SubLObject constant, SubLObject title) {
        if (title == UNPROVIDED) {
            title = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == bbn_ask_variable($sym612$_NAME, listS($$preferredNameString, constant, $list_alt614), $bbn_lexical_mt$.getDynamicValue(thread), UNPROVIDED)) {
                {
                    SubLObject name_extent_known = string_utilities.bunge(words, UNPROVIDED);
                    SubLObject titles = (NIL != title) ? ((SubLObject) (ask_utilities.ask_variable($sym615$_TITLE, listS($$and, list($$termStrings, $sym615$_TITLE, title), $list_alt616), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                    SubLObject proven = NIL;
                    if ($bbn_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        format(T, string_utilities.bunge(list($str_alt8$____BBN____, $str_alt617$name_extent_known_is__S__), UNPROVIDED), new SubLObject[]{ name_extent_known, NIL, NIL });
                    }
                    if (NIL != titles) {
                        {
                            SubLObject cdolist_list_var = bbn_find_term_strings(name_extent_known, UNPROVIDED);
                            SubLObject possible_match = NIL;
                            for (possible_match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possible_match = cdolist_list_var.first()) {
                                if (NIL != bbn_sentence_is_trueP(list($$thereExists, $sym118$_COL, list($$and, list($$memberOfList, $sym118$_COL, bq_cons($$TheList, titles)), listS($$isa, possible_match, $list_alt120))), UNPROVIDED)) {
                                    proven = cons(possible_match, proven);
                                }
                            }
                        }
                        if (NIL != list_utilities.singletonP(proven)) {
                            {
                                SubLObject who = proven.first();
                                if (!who.eql(constant)) {
                                    {
                                        SubLObject equals_gaf = list($bbn_equality_predicate$.getDynamicValue(thread), who, constant);
                                        SubLObject bunged = string_utilities.bunge(title, name_extent_known);
                                        bbn_note_strengthening_done($str_alt618$via_name_title, constant, who);
                                        bbn_strengthen_with_motivation(constant, bunged, $$$title_established, equals_gaf, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = bbn_ask_template_cached($list_alt622, list($$and, $list_alt623, listS($sym254$_PRED, who, $list_alt214)), UNPROVIDED, UNPROVIDED);
                                            SubLObject this_lex = NIL;
                                            for (this_lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_lex = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = this_lex;
                                                    SubLObject current = datum;
                                                    SubLObject pred = NIL;
                                                    SubLObject string = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt620);
                                                    pred = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt620);
                                                    string = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        bbn_enter_strengthening_gaf(list(pred, constant, string), $$$titlist_relationship_determined, constant, pred, $bbn_lexical_mt$.getDynamicValue(thread));
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt620);
                                                    }
                                                }
                                            }
                                        }
                                        return who;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == bbn_sentence_is_trueP(list($$termStrings, constant, name_extent_known), UNPROVIDED)) {
                        {
                            SubLObject name_with_space = format(NIL, $str_alt624$__A, name_extent_known);
                            SubLObject name_with_title = (NIL != title) ? ((SubLObject) (format(NIL, $str_alt625$_A_A, title, name_extent_known))) : NIL;
                            SubLObject cdolist_list_var = get_bbn_reified_term_secondary_strings(constant);
                            SubLObject possibly_name = NIL;
                            for (possibly_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possibly_name = cdolist_list_var.first()) {
                                if ((((NIL == Strings.stringE(possibly_name, name_extent_known, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != title)) && (NIL == Strings.stringE(possibly_name, name_with_title, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != string_utilities.substringP(name_extent_known, possibly_name, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    {
                                        SubLObject given_name = bbn_ask_variable_cached($sym626$_GIVEN, list($$and, list($$evaluate, $sym626$_GIVEN, list($$StringPostremoveFn, possibly_name, name_with_space)), list($$different, $sym626$_GIVEN, possibly_name)), UNPROVIDED, UNPROVIDED);
                                        if (NIL != list_utilities.singletonP(given_name)) {
                                            given_name = given_name.first();
                                            bbn_enter_spontaneous_gaf(list($$familyName, constant, name_extent_known), $bbn_lexical_mt$.getDynamicValue(thread));
                                            bbn_enter_spontaneous_gaf(list($$givenNames, constant, given_name), $bbn_lexical_mt$.getDynamicValue(thread));
                                            return T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_bbn_strengthening_file() {
        declareMacro("bbn_warn", "BBN-WARN");
        declareMacro("bbn_while_registering_predicates", "BBN-WHILE-REGISTERING-PREDICATES");
        declareMacro("bbn_while_storing_formulas", "BBN-WHILE-STORING-FORMULAS");
        declareMacro("bbn_without_storing_formulas", "BBN-WITHOUT-STORING-FORMULAS");
        declareMacro("with_bbn_log_file", "WITH-BBN-LOG-FILE");
        declareMacro("with_bbn_log_default", "WITH-BBN-LOG-DEFAULT");
        declareFunction("bbn_force_output", "BBN-FORCE-OUTPUT", 0, 1, false);
        declareMacro("with_bbn_time_limit", "WITH-BBN-TIME-LIMIT");
        declareFunction("bbn_cinc_time_limit", "BBN-CINC-TIME-LIMIT", 1, 0, false);
        declareFunction("bbn_abort_asap", "BBN-ABORT-ASAP", 0, 0, false);
        declareFunction("bbn_time_limit_exceededP", "BBN-TIME-LIMIT-EXCEEDED?", 0, 0, false);
        declareMacro("within_bbn_document_context", "WITHIN-BBN-DOCUMENT-CONTEXT");
        declareMacro("with_bbn_relevant_string", "WITH-BBN-RELEVANT-STRING");
        declareFunction("bbn_unknown_predicate_p", "BBN-UNKNOWN-PREDICATE-P", 1, 0, false);
        declareFunction("bbn_known_predicate_p", "BBN-KNOWN-PREDICATE-P", 1, 0, false);
        declareFunction("bbn_reified_schema_term_p", "BBN-REIFIED-SCHEMA-TERM-P", 1, 0, false);
        declareFunction("bbn_clear_everything", "BBN-CLEAR-EVERYTHING", 0, 0, false);
        declareFunction("bbn_clear_cached_queries", "BBN-CLEAR-CACHED-QUERIES", 0, 0, false);
        declareFunction("clear_bbn_content_mt_of", "CLEAR-BBN-CONTENT-MT-OF", 0, 0, false);
        declareFunction("remove_bbn_content_mt_of", "REMOVE-BBN-CONTENT-MT-OF", 1, 0, false);
        declareFunction("bbn_content_mt_of_internal", "BBN-CONTENT-MT-OF-INTERNAL", 1, 0, false);
        declareFunction("bbn_content_mt_of", "BBN-CONTENT-MT-OF", 1, 0, false);
        declareFunction("random_bbn_document", "RANDOM-BBN-DOCUMENT", 0, 3, false);
        declareMacro("bbn_format_when", "BBN-FORMAT-WHEN");
        declareFunction("bbn_right_comma_trim", "BBN-RIGHT-COMMA-TRIM", 1, 0, false);
        declareFunction("bbn_note_verification_performed", "BBN-NOTE-VERIFICATION-PERFORMED", 3, 0, false);
        declareFunction("bbn_note_strengthening_done", "BBN-NOTE-STRENGTHENING-DONE", 3, 0, false);
        declareFunction("bbn_count_strengthenings_done", "BBN-COUNT-STRENGTHENINGS-DONE", 0, 0, false);
        declareMacro("bbn_while_counting_strengthenings", "BBN-WHILE-COUNTING-STRENGTHENINGS");
        declareFunction("bbn_strengthening_problem_store_properties", "BBN-STRENGTHENING-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction("find_or_create_bbn_strengthening_problem_store", "FIND-OR-CREATE-BBN-STRENGTHENING-PROBLEM-STORE", 0, 0, false);
        declareFunction("bbn_strengthening_query_properties", "BBN-STRENGTHENING-QUERY-PROPERTIES", 0, 0, false);
        declareFunction("clear_bbn_ask_template_cached", "CLEAR-BBN-ASK-TEMPLATE-CACHED", 0, 0, false);
        declareFunction("remove_bbn_ask_template_cached", "REMOVE-BBN-ASK-TEMPLATE-CACHED", 2, 2, false);
        declareFunction("bbn_ask_template_cached_internal", "BBN-ASK-TEMPLATE-CACHED-INTERNAL", 4, 0, false);
        declareFunction("bbn_ask_template_cached", "BBN-ASK-TEMPLATE-CACHED", 2, 2, false);
        declareFunction("bbn_ask_template_internal", "BBN-ASK-TEMPLATE-INTERNAL", 2, 2, false);
        declareFunction("bbn_ask_template", "BBN-ASK-TEMPLATE", 2, 2, false);
        declareFunction("bbn_find_assertions_for_support", "BBN-FIND-ASSERTIONS-FOR-SUPPORT", 1, 2, false);
        declareFunction("clear_bbn_ask_variable_cached", "CLEAR-BBN-ASK-VARIABLE-CACHED", 0, 0, false);
        declareFunction("remove_bbn_ask_variable_cached", "REMOVE-BBN-ASK-VARIABLE-CACHED", 2, 2, false);
        declareFunction("bbn_ask_variable_cached_internal", "BBN-ASK-VARIABLE-CACHED-INTERNAL", 4, 0, false);
        declareFunction("bbn_ask_variable_cached", "BBN-ASK-VARIABLE-CACHED", 2, 2, false);
        declareFunction("bbn_ask_variable", "BBN-ASK-VARIABLE", 2, 2, false);
        declareMacro("with_bbn_strengthening_problem_store_reuse", "WITH-BBN-STRENGTHENING-PROBLEM-STORE-REUSE");
        declareFunction("bbn_ask_variable_traced", "BBN-ASK-VARIABLE-TRACED", 2, 2, false);
        declareFunction("bbn_ask_template_traced", "BBN-ASK-TEMPLATE-TRACED", 2, 2, false);
        declareFunction("bbn_ask_template_sksi", "BBN-ASK-TEMPLATE-SKSI", 3, 2, false);
        declareFunction("bbn_ask_variable_sksi", "BBN-ASK-VARIABLE-SKSI", 3, 2, false);
        declareFunction("bbn_compose_conjoined_query", "BBN-COMPOSE-CONJOINED-QUERY", 1, 0, false);
        declareFunction("with_bbn_rewrite_backtracking", "WITH-BBN-REWRITE-BACKTRACKING", 1, 0, false);
        declareFunction("bbn_sentence_is_trueP", "BBN-SENTENCE-IS-TRUE?", 1, 1, false);
        declareFunction("bbn_sentence_is_falseP", "BBN-SENTENCE-IS-FALSE?", 1, 1, false);
        declareFunction("bbn_isaP", "BBN-ISA?", 2, 0, false);
        declareFunction("bbn_isa_prohibitedP", "BBN-ISA-PROHIBITED?", 2, 0, false);
        declareFunction("bbn_isa_strongly_prohibitedP", "BBN-ISA-STRONGLY-PROHIBITED?", 2, 0, false);
        declareFunction("bbn_get_asserted_isas", "BBN-GET-ASSERTED-ISAS", 1, 0, false);
        declareFunction("bbn_isa_assertedP", "BBN-ISA-ASSERTED?", 2, 0, false);
        declareFunction("bbn_equals_possiblyP", "BBN-EQUALS-POSSIBLY?", 2, 0, false);
        declareFunction("bbn_find_term_strings", "BBN-FIND-TERM-STRINGS", 1, 1, false);
        declareFunction("bbn_confirmed_term_strings", "BBN-CONFIRMED-TERM-STRINGS", 2, 0, false);
        declareFunction("bbn_find_term_phrases", "BBN-FIND-TERM-PHRASES", 1, 1, false);
        declareFunction("bbn_find_places_with_name", "BBN-FIND-PLACES-WITH-NAME", 1, 0, false);
        declareFunction("bbn_confirmed_term_phrases", "BBN-CONFIRMED-TERM-PHRASES", 2, 1, false);
        declareFunction("bbn_admitted_cde_termP", "BBN-ADMITTED-CDE-TERM?", 3, 0, false);
        declareFunction("bbn_admitted_generallyP", "BBN-ADMITTED-GENERALLY?", 3, 0, false);
        declareFunction("bbn_plausible_gafP", "BBN-PLAUSIBLE-GAF?", 1, 0, false);
        declareMacro("do_bbn_documents_as_list", "DO-BBN-DOCUMENTS-AS-LIST");
        declareMacro("do_bbn_documents", "DO-BBN-DOCUMENTS");
        declareFunction("bbn_document_has_textP", "BBN-DOCUMENT-HAS-TEXT?", 1, 0, false);
        declareFunction("bbn_document_number_has_textP", "BBN-DOCUMENT-NUMBER-HAS-TEXT?", 1, 0, false);
        declareFunction("count_bbn_documents", "COUNT-BBN-DOCUMENTS", 0, 0, false);
        declareFunction("get_bbn_documents", "GET-BBN-DOCUMENTS", 0, 1, false);
        declareMacro("do_bbn_document_hypotheses", "DO-BBN-DOCUMENT-HYPOTHESES");
        declareFunction("clear_get_bbn_document_hypotheses", "CLEAR-GET-BBN-DOCUMENT-HYPOTHESES", 0, 0, false);
        declareFunction("remove_get_bbn_document_hypotheses", "REMOVE-GET-BBN-DOCUMENT-HYPOTHESES", 1, 0, false);
        declareFunction("get_bbn_document_hypotheses_internal", "GET-BBN-DOCUMENT-HYPOTHESES-INTERNAL", 1, 0, false);
        declareFunction("get_bbn_document_hypotheses", "GET-BBN-DOCUMENT-HYPOTHESES", 1, 0, false);
        declareFunction("count_bbn_document_hypotheses", "COUNT-BBN-DOCUMENT-HYPOTHESES", 1, 0, false);
        declareMacro("do_bbn_hypothesis_entity_mentions", "DO-BBN-HYPOTHESIS-ENTITY-MENTIONS");
        declareFunction("get_bbn_hypothesis_entity_mentions", "GET-BBN-HYPOTHESIS-ENTITY-MENTIONS", 1, 2, false);
        declareMacro("do_bbn_hypothesis_binary_sentences", "DO-BBN-HYPOTHESIS-BINARY-SENTENCES");
        declareFunction("get_bbn_hypothesis_binary_sentences", "GET-BBN-HYPOTHESIS-BINARY-SENTENCES", 1, 0, false);
        declareFunction("get_bbn_entity_mention_headstring", "GET-BBN-ENTITY-MENTION-HEADSTRING", 1, 0, false);
        declareFunction("get_bbn_entity_mention_textstring", "GET-BBN-ENTITY-MENTION-TEXTSTRING", 1, 0, false);
        declareFunction("get_bbn_entity_mention_strings", "GET-BBN-ENTITY-MENTION-STRINGS", 1, 0, false);
        declareFunction("clear_bbn_deduce_entity_headstring", "CLEAR-BBN-DEDUCE-ENTITY-HEADSTRING", 0, 0, false);
        declareFunction("remove_bbn_deduce_entity_headstring", "REMOVE-BBN-DEDUCE-ENTITY-HEADSTRING", 1, 0, false);
        declareFunction("bbn_deduce_entity_headstring_internal", "BBN-DEDUCE-ENTITY-HEADSTRING-INTERNAL", 1, 0, false);
        declareFunction("bbn_deduce_entity_headstring", "BBN-DEDUCE-ENTITY-HEADSTRING", 1, 0, false);
        declareFunction("get_bbn_entity_mention_referents", "GET-BBN-ENTITY-MENTION-REFERENTS", 1, 0, false);
        declareFunction("clear_get_bbn_term_references", "CLEAR-GET-BBN-TERM-REFERENCES", 0, 0, false);
        declareFunction("remove_get_bbn_term_references", "REMOVE-GET-BBN-TERM-REFERENCES", 1, 0, false);
        declareFunction("get_bbn_term_references_internal", "GET-BBN-TERM-REFERENCES-INTERNAL", 1, 0, false);
        declareFunction("get_bbn_term_references", "GET-BBN-TERM-REFERENCES", 1, 0, false);
        declareFunction("get_bbn_term_longest_string", "GET-BBN-TERM-LONGEST-STRING", 1, 0, false);
        declareFunction("get_bbn_term_preferred_string", "GET-BBN-TERM-PREFERRED-STRING", 1, 0, false);
        declareFunction("get_bbn_term_all_strings", "GET-BBN-TERM-ALL-STRINGS", 1, 0, false);
        declareFunction("get_bbn_reified_term_strings", "GET-BBN-REIFIED-TERM-STRINGS", 1, 1, false);
        declareFunction("get_bbn_reified_term_primary_strings", "GET-BBN-REIFIED-TERM-PRIMARY-STRINGS", 1, 0, false);
        declareFunction("get_bbn_reified_term_secondary_strings", "GET-BBN-REIFIED-TERM-SECONDARY-STRINGS", 1, 0, false);
        declareFunction("get_bbn_schema_from_reified_term", "GET-BBN-SCHEMA-FROM-REIFIED-TERM", 1, 0, false);
        declareFunction("get_bbn_reified_term_from_schema", "GET-BBN-REIFIED-TERM-FROM-SCHEMA", 1, 0, false);
        declareFunction("get_bbn_first_relevant_entity_mention_in_hypothesis", "GET-BBN-FIRST-RELEVANT-ENTITY-MENTION-IN-HYPOTHESIS", 2, 0, false);
        declareFunction("get_bbn_first_relevant_entity_mention_in_document", "GET-BBN-FIRST-RELEVANT-ENTITY-MENTION-IN-DOCUMENT", 1, 1, false);
        declareFunction("get_bbn_term_headstring", "GET-BBN-TERM-HEADSTRING", 1, 0, false);
        declareFunction("bbn_deduce_term_headstring", "BBN-DEDUCE-TERM-HEADSTRING", 1, 0, false);
        declareFunction("import_bbn_term_strings", "IMPORT-BBN-TERM-STRINGS", 2, 1, false);
        declareFunction("get_bbn_term_bbn_entity_types", "GET-BBN-TERM-BBN-ENTITY-TYPES", 1, 0, false);
        declareFunction("get_bbn_term_hyp_isas", "GET-BBN-TERM-HYP-ISAS", 1, 0, false);
        declareFunction("clear_bbn_cached_entity_type_conversions", "CLEAR-BBN-CACHED-ENTITY-TYPE-CONVERSIONS", 0, 0, false);
        declareFunction("bbn_map_entity_type_to_collection", "BBN-MAP-ENTITY-TYPE-TO-COLLECTION", 1, 0, false);
        declareFunction("get_bbn_entity_type_cyc_entities", "GET-BBN-ENTITY-TYPE-CYC-ENTITIES", 1, 0, false);
        declareFunction("get_cyc_entity_rewrites", "GET-CYC-ENTITY-REWRITES", 1, 0, false);
        declareFunction("get_bbn_term_hyp_isas_to_gafs", "GET-BBN-TERM-HYP-ISAS-TO-GAFS", 1, 0, false);
        declareFunction("get_bbn_term_isas", "GET-BBN-TERM-ISAS", 1, 0, false);
        declareFunction("get_noun_wordforms_for_headstring", "GET-NOUN-WORDFORMS-FOR-HEADSTRING", 1, 0, false);
        declareFunction("get_relational_noun_preds", "GET-RELATIONAL-NOUN-PREDS", 3, 0, false);
        declareFunction("bbn_hypothesis_has_unknown_predicateP", "BBN-HYPOTHESIS-HAS-UNKNOWN-PREDICATE?", 1, 0, false);
        declareFunction("bbn_document_has_unknown_predicateP", "BBN-DOCUMENT-HAS-UNKNOWN-PREDICATE?", 1, 0, false);
        declareFunction("get_bbn_hypothesis_relation_reference", "GET-BBN-HYPOTHESIS-RELATION-REFERENCE", 1, 0, false);
        declareFunction("get_bbn_relation_reference_hypothesis", "GET-BBN-RELATION-REFERENCE-HYPOTHESIS", 1, 0, false);
        declareFunction("get_bbn_relation_reference_headstring", "GET-BBN-RELATION-REFERENCE-HEADSTRING", 1, 0, false);
        declareFunction("get_bbn_relation_reference_textstring", "GET-BBN-RELATION-REFERENCE-TEXTSTRING", 1, 0, false);
        declareFunction("get_bbn_hypothesis_textstring", "GET-BBN-HYPOTHESIS-TEXTSTRING", 1, 0, false);
        declareFunction("get_bbn_relation_reference_word_units", "GET-BBN-RELATION-REFERENCE-WORD-UNITS", 1, 0, false);
        declareFunction("verb_semtrans_assertions_for_string", "VERB-SEMTRANS-ASSERTIONS-FOR-STRING", 1, 0, false);
        declareMacro("do_bbn_hypothesis_args", "DO-BBN-HYPOTHESIS-ARGS");
        declareFunction("get_bbn_hypothesis_args", "GET-BBN-HYPOTHESIS-ARGS", 1, 0, false);
        declareFunction("semtrans_keyword_for_bbnargtype", "SEMTRANS-KEYWORD-FOR-BBNARGTYPE", 1, 0, false);
        declareFunction("get_bbn_hypothesis_arg_roles", "GET-BBN-HYPOTHESIS-ARG-ROLES", 1, 0, false);
        declareFunction("get_bbn_hypothesis_arg_roles_mapped", "GET-BBN-HYPOTHESIS-ARG-ROLES-MAPPED", 1, 0, false);
        declareFunction("get_bbn_relation_reference_dependents", "GET-BBN-RELATION-REFERENCE-DEPENDENTS", 1, 0, false);
        declareFunction("semtrans_keyword_for_bbn_role_marker", "SEMTRANS-KEYWORD-FOR-BBN-ROLE-MARKER", 1, 0, false);
        declareFunction("get_bbn_entity_mention_dependency", "GET-BBN-ENTITY-MENTION-DEPENDENCY", 2, 0, false);
        declareFunction("bbn_leverage_verb_sem_trans_for_unknown", "BBN-LEVERAGE-VERB-SEM-TRANS-FOR-UNKNOWN", 2, 0, false);
        declareFunction("bbn_leverage_verb_frame_for_unknown", "BBN-LEVERAGE-VERB-FRAME-FOR-UNKNOWN", 6, 0, false);
        declareFunction("bbn_sub_args_for_roles", "BBN-SUB-ARGS-FOR-ROLES", 2, 1, false);
        declareFunction("bbn_group_coercion_during_arg_substitution", "BBN-GROUP-COERCION-DURING-ARG-SUBSTITUTION", 1, 0, false);
        declareFunction("bbn_enter_isa_verification", "BBN-ENTER-ISA-VERIFICATION", 1, 1, false);
        declareFunction("bbn_enter_strengthened_hypothesis", "BBN-ENTER-STRENGTHENED-HYPOTHESIS", 5, 1, false);
        declareFunction("bbn_enter_bookkeeping_gaf", "BBN-ENTER-BOOKKEEPING-GAF", 1, 1, false);
        declareFunction("bbn_enter_spontaneous_gaf", "BBN-ENTER-SPONTANEOUS-GAF", 1, 1, false);
        declareFunction("bbn_enter_strengthening_gaf", "BBN-ENTER-STRENGTHENING-GAF", 4, 1, false);
        declareFunction("bbn_strengthen_with_motivation", "BBN-STRENGTHEN-WITH-MOTIVATION", 4, 1, false);
        declareFunction("bbn_enter_coerced_isa", "BBN-ENTER-COERCED-ISA", 1, 1, false);
        declareFunction("bbn_store_temporary_formula", "BBN-STORE-TEMPORARY-FORMULA", 1, 1, false);
        declareFunction("bbn_assert_possibly_with_metrics", "BBN-ASSERT-POSSIBLY-WITH-METRICS", 3, 1, false);
        declareFunction("bbn_list_temporary_formulas", "BBN-LIST-TEMPORARY-FORMULAS", 0, 0, false);
        declareFunction("bbn_clear_temporary_formulas", "BBN-CLEAR-TEMPORARY-FORMULAS", 0, 1, false);
        declareFunction("bbn_clear_temporary_formulas_mentioning", "BBN-CLEAR-TEMPORARY-FORMULAS-MENTIONING", 1, 1, false);
        declareFunction("bbn_clear_temporary_formula", "BBN-CLEAR-TEMPORARY-FORMULA", 1, 1, false);
        declareFunction("bbn_clear_doppelgangers", "BBN-CLEAR-DOPPELGANGERS", 0, 1, false);
        declareFunction("bbn_scour_inappropriate_bottom_up_isas", "BBN-SCOUR-INAPPROPRIATE-BOTTOM-UP-ISAS", 1, 0, false);
        declareMacro("bbn_call_strengthener", "BBN-CALL-STRENGTHENER");
        declareFunction("bbn_strengthen_document", "BBN-STRENGTHEN-DOCUMENT", 1, 1, false);
        declareFunction("bbn_strengthen_all_documents", "BBN-STRENGTHEN-ALL-DOCUMENTS", 0, 1, false);
        declareFunction("bbn_strengthen_n_documents", "BBN-STRENGTHEN-N-DOCUMENTS", 1, 2, false);
        declareFunction("bbn_strengthen_documents", "BBN-STRENGTHEN-DOCUMENTS", 2, 0, false);
        declareFunction("bbn_strengthen_at_ctc", "BBN-STRENGTHEN-AT-CTC", 3, 1, false);
        declareFunction("bbn_strengthen_at_ctc_full", "BBN-STRENGTHEN-AT-CTC-FULL", 3, 0, false);
        declareFunction("bbn_strengthen_shamil_basayev", "BBN-STRENGTHEN-SHAMIL-BASAYEV", 0, 1, false);
        declareFunction("bbn_strengthen_relation_reference", "BBN-STRENGTHEN-RELATION-REFERENCE", 1, 1, false);
        declareFunction("bbn_strengthen_hypothesis", "BBN-STRENGTHEN-HYPOTHESIS", 1, 1, false);
        declareFunction("bbn_verify_and_strengthen_gaf", "BBN-VERIFY-AND-STRENGTHEN-GAF", 3, 1, false);
        declareFunction("bbn_inversions_of_strengthened_hypothesis", "BBN-INVERSIONS-OF-STRENGTHENED-HYPOTHESIS", 1, 0, false);
        declareFunction("bbn_useful_speculated_gafP", "BBN-USEFUL-SPECULATED-GAF?", 1, 0, false);
        declareFunction("bbn_strengthen_binary_gaf", "BBN-STRENGTHEN-BINARY-GAF", 1, 1, false);
        declareFunction("bbn_strengthen_args_using_heads", "BBN-STRENGTHEN-ARGS-USING-HEADS", 3, 0, false);
        declareFunction("bbn_strengthen_collection_using_head", "BBN-STRENGTHEN-COLLECTION-USING-HEAD", 1, 0, false);
        declareFunction("bbn_extrapolate_quants_of_col", "BBN-EXTRAPOLATE-QUANTS-OF-COL", 2, 0, false);
        declareFunction("bbn_owns_to_assets_hack", "BBN-OWNS-TO-ASSETS-HACK", 3, 0, false);
        declareFunction("bbn_generate_government_type", "BBN-GENERATE-GOVERNMENT-TYPE", 3, 0, false);
        declareFunction("bbn_col_of_named_instance", "BBN-COL-OF-NAMED-INSTANCE", 1, 0, false);
        declareFunction("bbn_quasi_gaf_with_headwords", "BBN-QUASI-GAF-WITH-HEADWORDS", 1, 1, false);
        declareFunction("strengthen_via_typed_genl_preds", "STRENGTHEN-VIA-TYPED-GENL-PREDS", 3, 0, false);
        declareFunction("strengthen_via_relation_exists_all", "STRENGTHEN-VIA-RELATION-EXISTS-ALL", 3, 0, false);
        declareFunction("strengthen_via_relation_all_exists", "STRENGTHEN-VIA-RELATION-ALL-EXISTS", 3, 0, false);
        declareFunction("strengthen_via_genitive_sem_trans", "STRENGTHEN-VIA-GENITIVE-SEM-TRANS", 3, 0, false);
        declareFunction("strengthen_via_relational_specpreds", "STRENGTHEN-VIA-RELATIONAL-SPECPREDS", 3, 0, false);
        declareFunction("get_units_via_nearest_relational_specpreds", "GET-UNITS-VIA-NEAREST-RELATIONAL-SPECPREDS", 1, 1, false);
        declareFunction("get_denots_via_nearest_relational_specpreds", "GET-DENOTS-VIA-NEAREST-RELATIONAL-SPECPREDS", 1, 1, false);
        declareFunction("strengthen_via_relational_compounding", "STRENGTHEN-VIA-RELATIONAL-COMPOUNDING", 3, 0, false);
        declareFunction("strengthen_via_arg2_acts_in_capacity", "STRENGTHEN-VIA-ARG2-ACTS-IN-CAPACITY", 3, 0, false);
        declareFunction("bbn_genlpreds_wrt_capacityP", "BBN-GENLPREDS-WRT-CAPACITY?", 3, 0, false);
        declareFunction("strengthen_via_arg1_representation", "STRENGTHEN-VIA-ARG1-REPRESENTATION", 3, 0, false);
        declareFunction("bbn_document_strengthen_entity_mentions", "BBN-DOCUMENT-STRENGTHEN-ENTITY-MENTIONS", 1, 0, false);
        declareFunction("bbn_entity_mention_strengthen", "BBN-ENTITY-MENTION-STRENGTHEN", 1, 0, false);
        declareFunction("choose_best_cycl_referent", "CHOOSE-BEST-CYCL-REFERENT", 1, 0, false);
        declareFunction("record_bbn_entity_mention_strengthening", "RECORD-BBN-ENTITY-MENTION-STRENGTHENING", 2, 0, false);
        declareFunction("bbn_entity_mention_cycl_referents", "BBN-ENTITY-MENTION-CYCL-REFERENTS", 1, 0, false);
        declareFunction("strengthen_via_arg2_is_suborg_via_function", "STRENGTHEN-VIA-ARG2-IS-SUBORG-VIA-FUNCTION", 3, 0, false);
        declareFunction("pprint_bbn_document", "PPRINT-BBN-DOCUMENT", 1, 0, false);
        declareFunction("pprint_bbn_hypothesis", "PPRINT-BBN-HYPOTHESIS", 1, 1, false);
        declareMacro("do_bbn_terms", "DO-BBN-TERMS");
        declareFunction("count_bbn_terms", "COUNT-BBN-TERMS", 0, 0, false);
        declareFunction("bbn_reify_schema_term", "BBN-REIFY-SCHEMA-TERM", 1, 1, false);
        declareFunction("bbn_explore_term", "BBN-EXPLORE-TERM", 1, 1, false);
        declareFunction("bbn_explore_quantity", "BBN-EXPLORE-QUANTITY", 4, 0, false);
        declareFunction("bbn_explore_strings_via_constraints", "BBN-EXPLORE-STRINGS-VIA-CONSTRAINTS", 2, 0, false);
        declareFunction("bbn_explore_genders_from_pronouns", "BBN-EXPLORE-GENDERS-FROM-PRONOUNS", 1, 0, false);
        declareFunction("bbn_explore_names_for_person", "BBN-EXPLORE-NAMES-FOR-PERSON", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_bbn_strengthening_file() {
        defparameter("*BBN-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*BBN-TRACE-ELEMENT*", NIL);
        defparameter("*BBN-STRENGTHENING-MT*", $$BBN_CDE_StrengthenedMt);
        defparameter("*BBN-VERIFICATION-MT*", $$BBN_CDE_BookkeepingMt);
        defparameter("*BBN-BOOKKEEPING-MT*", $$BBN_CDE_BookkeepingMt);
        defparameter("*BBN-LEXICAL-MT*", $$EnglishMt);
        defparameter("*BBN-UNKNOWN-PRED*", $$unknownReln_BBNRelnType);
        defparameter("*BBN-EQUALITY-PREDICATE*", $$rewriteOf);
        defparameter("*BBN-EXPLORE-IT-ANYWAY?*", NIL);
        defparameter("*BBN-MOST-RELEVANT-STRING*", NIL);
        defparameter("*BBN-MOST-RELEVANT-DOCUMENT*", NIL);
        defparameter("*BBN-TEMPORARY-ADDITIONS*", set.new_set(symbol_function(EQUALP), UNPROVIDED));
        defparameter("*BBN-STORE-TEMPORARY-FORMULAS?*", NIL);
        defparameter("*BBN-REGISTER-PREDICATE?*", NIL);
        defparameter("*BBN-SKIP-UNKNOWN-RELATIONS?*", NIL);
        defparameter("*BBN-LOG-FILE*", NIL);
        defparameter("*BBN-LOG-STREAM*", NIL);
        defparameter("*BBN-DO-METRICS-BY-HYPOTHESIS?*", NIL);
        defparameter("*BBN-TIME-LIMIT*", NIL);
        defparameter("*BBN-ABORT?*", NIL);
        defparameter("*BBN-TIME-CINC*", NIL);
        deflexical("*BBN-CONTENT-MT-OF-CACHING-STATE*", NIL);
        defparameter("*BBN-FAILED-RANDOMIZER-TOLERANCE*", TEN_INTEGER);
        defparameter("*BBN-STRENGTHENINGS-PERFORMED*", ZERO_INTEGER);
        defparameter("*BBN-STRENGTHENING-PROBLEM-STORE*", NIL);
        deflexical("*BBN-ASK-TEMPLATE-CACHED-CACHING-STATE*", NIL);
        deflexical("*BBN-ASK-VARIABLE-CACHED-CACHING-STATE*", NIL);
        defparameter("*BBN-SKSI-ASK*", ONE_INTEGER);
        defparameter("*BBN-SKSI-INQUIRE*", TWO_INTEGER);
        defparameter("*BBN-SKSI-DEMAND-ANSWERS*", FOUR_INTEGER);
        deflexical("*GET-BBN-DOCUMENT-HYPOTHESES-CACHING-STATE*", NIL);
        deflexical("*BBN-DEDUCE-ENTITY-HEADSTRING-CACHING-STATE*", NIL);
        deflexical("*GET-BBN-TERM-REFERENCES-CACHING-STATE*", NIL);
        deflexical("*BBN-CACHED-ENTITY-TYPE-CONVERSIONS*", NIL != boundp($bbn_cached_entity_type_conversions$) ? ((SubLObject) ($bbn_cached_entity_type_conversions$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        deflexical("*SEMTRANS-KEYWORD-BBNARGTYPE-MAP*", NIL != boundp($semtrans_keyword_bbnargtype_map$) ? ((SubLObject) ($semtrans_keyword_bbnargtype_map$.getGlobalValue())) : $list_alt276);
        deflexical("*SEMTRANS-KEYWORD-BBN-ROLE-MARKER-MAP*", NIL != boundp($semtrans_keyword_bbn_role_marker_map$) ? ((SubLObject) ($semtrans_keyword_bbn_role_marker_map$.getGlobalValue())) : $list_alt286);
        defparameter("*BBN-ASSERTION-FILTER*", NIL);
        defparameter("*BBN-LEXICAL-ASSERTION-FILTER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_bbn_strengthening_file() {
                memoization_state.note_globally_cached_function(BBN_CONTENT_MT_OF);
        memoization_state.note_globally_cached_function(BBN_ASK_TEMPLATE_CACHED);
        memoization_state.note_memoized_function(BBN_ASK_TEMPLATE);
        memoization_state.note_globally_cached_function(BBN_ASK_VARIABLE_CACHED);
        memoization_state.note_globally_cached_function(GET_BBN_DOCUMENT_HYPOTHESES);
        memoization_state.note_globally_cached_function(BBN_DEDUCE_ENTITY_HEADSTRING);
        memoization_state.note_globally_cached_function(GET_BBN_TERM_REFERENCES);
        subl_macro_promotions.declare_defglobal($bbn_cached_entity_type_conversions$);
        subl_macro_promotions.declare_defglobal($semtrans_keyword_bbnargtype_map$);
        subl_macro_promotions.declare_defglobal($semtrans_keyword_bbn_role_marker_map$);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&OPTIONAL"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"));





    static private final SubLSymbol $sym3$__ = makeSymbol(">=");

    public static final SubLSymbol $bbn_trace_level$ = makeSymbol("*BBN-TRACE-LEVEL*");







    static private final SubLString $str_alt8$____BBN____ = makeString("*** BBN ***");

    public static final SubLObject $$BBN_CDE_StrengthenedMt = constant_handles.reader_make_constant_shell(makeString("BBN-CDE-StrengthenedMt"));

    public static final SubLObject $$BBN_CDE_BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BBN-CDE-BookkeepingMt"));

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    public static final SubLObject $$unknownReln_BBNRelnType = constant_handles.reader_make_constant_shell(makeString("unknownReln-BBNRelnType"));

    public static final SubLObject $$rewriteOf = constant_handles.reader_make_constant_shell(makeString("rewriteOf"));



    static private final SubLList $list_alt15 = list(list(makeSymbol("*BBN-REGISTER-PREDICATE?*"), T));

    static private final SubLList $list_alt16 = list(list(makeSymbol("*BBN-STORE-TEMPORARY-FORMULAS?*"), T));

    static private final SubLList $list_alt17 = list(list(makeSymbol("*BBN-STORE-TEMPORARY-FORMULAS?*"), NIL));

    static private final SubLList $list_alt18 = list(makeSymbol("FILENAME"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol BBN_WARN = makeSymbol("BBN-WARN");

    static private final SubLString $str_alt21$logging_to__A__ = makeString("logging to ~A~%");

    public static final SubLSymbol $bbn_log_file$ = makeSymbol("*BBN-LOG-FILE*");



    private static final SubLSymbol WTF = makeSymbol("WTF");

    static private final SubLList $list_alt25 = list(makeKeyword("OUTPUT"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("*BBN-LOG-STREAM*"), makeSymbol("WTF")));

    static private final SubLList $list_alt27 = list(list(makeSymbol("FN"), list(makeSymbol("FORMAT"), NIL, makeString("/cyc/projects/adept/strengthening-logs/~A-~A.ke"), list(makeSymbol("FIRST"), list(makeSymbol("SPLIT-STRING"), list(makeSymbol("GET-MACHINE-NAME")), makeString("."))), list(makeSymbol("GET-UNIVERSAL-TIME")))));

    private static final SubLSymbol WITH_BBN_LOG_FILE = makeSymbol("WITH-BBN-LOG-FILE");



    static private final SubLList $list_alt30 = list(makeSymbol("NATURE"), makeSymbol("AMT"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $HOURS = makeKeyword("HOURS");

    public static final SubLSymbol $bbn_time_limit$ = makeSymbol("*BBN-TIME-LIMIT*");

    private static final SubLSymbol UNIVERSAL_TIME_SECONDS_FROM_NOW = makeSymbol("UNIVERSAL-TIME-SECONDS-FROM-NOW");

    static private final SubLSymbol $sym35$_ = makeSymbol("*");

    static private final SubLList $list_alt36 = list(makeInteger(3600));

    static private final SubLList $list_alt37 = list(makeSymbol("BBN-WARN"), ZERO_INTEGER, makeString("The system will start no hypotheses after ~A.~%"), list(makeSymbol("GENERATE-PHRASE"), list(makeSymbol("UNIVERSAL-TIME-TO-CYCL-DATE"), makeSymbol("*BBN-TIME-LIMIT*"))));

    private static final SubLSymbol $MINUTES = makeKeyword("MINUTES");

    static private final SubLList $list_alt39 = list(makeInteger(60));

    private static final SubLSymbol $SECONDS = makeKeyword("SECONDS");

    static private final SubLString $str_alt41$can_only_add_an_integer_of_second = makeString("can only add an integer of seconds (negative integers will make the run end sooner");

    static private final SubLString $str_alt42$New_time_limit__the_system_will_s = makeString("New time limit: the system will start no hypotheses after ~A.~%");

    static private final SubLString $str_alt43$Run_aborted_at__A__ = makeString("Run aborted at ~A~%");

    static private final SubLString $str_alt44$__Run_aborted_at__A__ = makeString(";;Run aborted at ~A~%");

    static private final SubLString $str_alt45$Time_limit_exceeded_at__A__ = makeString("Time limit exceeded at ~A~%");

    static private final SubLString $str_alt46$__Time_limit_exceeded_at__A__ = makeString(";;Time limit exceeded at ~A~%");

    static private final SubLList $list_alt47 = list(makeSymbol("DOC"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $bbn_most_relevant_document$ = makeSymbol("*BBN-MOST-RELEVANT-DOCUMENT*");



    private static final SubLSymbol SCHEMA_OBJECT_FN_EXPRESSION_P = makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P");



    static private final SubLList $list_alt52 = list(makeSymbol("*BBN-LOG-STREAM*"));

    static private final SubLList $list_alt53 = list(list(makeSymbol("XYZDATE"), list(makeSymbol("GENERATE-PHRASE"), list(makeSymbol("UNIVERSAL-TIME-TO-CYCL-DATE"), list(makeSymbol("GET-UNIVERSAL-TIME"))))));

    static private final SubLString $str_alt54$___Beginning_BBN_document__A_at__ = makeString(";; Beginning BBN document ~A at ~A.~%");

    static private final SubLList $list_alt55 = list(makeSymbol("XYZDATE"));

    public static final SubLSymbol $bbn_log_stream$ = makeSymbol("*BBN-LOG-STREAM*");

    private static final SubLSymbol WITH_BBN_METRICS_STORE_FOR_DOCUMENT = makeSymbol("WITH-BBN-METRICS-STORE-FOR-DOCUMENT");

    static private final SubLList $list_alt58 = list(list(makeSymbol("STR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $bbn_most_relevant_string$ = makeSymbol("*BBN-MOST-RELEVANT-STRING*");

    public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

    static private final SubLSymbol $sym61$_SCHEMA = makeSymbol("?SCHEMA");

    public static final SubLObject $$reifiedAsForEfficiency = constant_handles.reader_make_constant_shell(makeString("reifiedAsForEfficiency"));

    private static final SubLSymbol BBN_CONTENT_MT_OF = makeSymbol("BBN-CONTENT-MT-OF");

    public static final SubLObject $$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell(makeString("StructuredKnowledgeSource"));

    public static final SubLObject $$ContentMtFn = constant_handles.reader_make_constant_shell(makeString("ContentMtFn"));

    public static final SubLSymbol $bbn_content_mt_of_caching_state$ = makeSymbol("*BBN-CONTENT-MT-OF-CACHING-STATE*");

    public static final SubLSymbol $kw67$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt68$Too_many___S__failed_attempts_to_ = makeString("Too many (~S) failed attempts to retrieve a doc with fewer than ~A hypotheses");

    static private final SubLList $list_alt69 = list(makeSymbol("CHECK-VAR"), makeSymbol("STREAM"), makeSymbol("INSTRUCTIONS"), makeSymbol("ARG1"));



    static private final SubLList $list_alt71 = list(makeSymbol("STRINGP"));



    static private final SubLString $str_alt73$_A = makeString("~A");





    static private final SubLList $list_alt76 = list(makeString(""));

    static private final SubLString $str_alt77$__ = makeString(" ,");

    static private final SubLString $str_alt78$_A___S_____S__ = makeString("~A~%~S -> ~S~%");

    static private final SubLList $list_alt79 = list(list(makeSymbol("COUNTER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt80 = list(list(makeSymbol("*BBN-STRENGTHENINGS-PERFORMED*"), ZERO_INTEGER));



    static private final SubLList $list_alt82 = list(list(makeSymbol("BBN-COUNT-STRENGTHENINGS-DONE")));

    static private final SubLList $list_alt83 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(100000));



    private static final SubLSymbol BBN_ASK_TEMPLATE_CACHED = makeSymbol("BBN-ASK-TEMPLATE-CACHED");

    public static final SubLSymbol $bbn_ask_template_cached_caching_state$ = makeSymbol("*BBN-ASK-TEMPLATE-CACHED-CACHING-STATE*");



    private static final SubLSymbol BBN_ASK_TEMPLATE = makeSymbol("BBN-ASK-TEMPLATE");









    private static final SubLSymbol $ASSERTIONS_USED = makeKeyword("ASSERTIONS-USED");

    private static final SubLSymbol BBN_ASK_VARIABLE_CACHED = makeSymbol("BBN-ASK-VARIABLE-CACHED");

    public static final SubLSymbol $bbn_ask_variable_cached_caching_state$ = makeSymbol("*BBN-ASK-VARIABLE-CACHED-CACHING-STATE*");

    static private final SubLList $list_alt96 = list(list(makeSymbol("*BBN-STRENGTHENING-PROBLEM-STORE*"), list(makeSymbol("FIND-OR-CREATE-BBN-STRENGTHENING-PROBLEM-STORE"))));

    private static final SubLSymbol WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");

    public static final SubLObject $$BBN_KS = constant_handles.reader_make_constant_shell(makeString("BBN-KS"));

    static private final SubLString $str_alt99$query_for__A_taking_nap___A__ = makeString("query for ~A taking nap #~A~%");





    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLSymbol $sym103$_REWRITE = makeSymbol("?REWRITE");

    static private final SubLSymbol $sym104$_TRUTH = makeSymbol("?TRUTH");

    public static final SubLObject $$sentenceTruth = constant_handles.reader_make_constant_shell(makeString("sentenceTruth"));

    static private final SubLList $list_alt106 = list(makeSymbol("?TRUTH"));

    static private final SubLList $list_alt107 = list(constant_handles.reader_make_constant_shell(makeString("False")));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol $SIMPLY_FALSE = makeKeyword("SIMPLY-FALSE");



    private static final SubLSymbol $BAD_ARGUMENT = makeKeyword("BAD-ARGUMENT");

    static private final SubLList $list_alt113 = list(makeSymbol("FUNCTOR"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    public static final SubLObject $$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell(makeString("GroupOfCardinalityFn"));

    static private final SubLSymbol $sym115$_X = makeSymbol("?X");

    private static final SubLSymbol $CONTRADICTORY_CARDINALITY = makeKeyword("CONTRADICTORY-CARDINALITY");

    public static final SubLObject $$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));

    static private final SubLSymbol $sym118$_COL = makeSymbol("?COL");

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

    static private final SubLList $list_alt120 = list(makeSymbol("?COL"));

    static private final SubLSymbol $sym121$_MT = makeSymbol("?MT");

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    static private final SubLList $list_alt123 = list(makeSymbol("?MT"));

    static private final SubLSymbol $sym124$_CONSTANT = makeSymbol("?CONSTANT");

    public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

    static private final SubLList $list_alt126 = list(makeSymbol("?CONSTANT"));

    public static final SubLObject $$termStrings = constant_handles.reader_make_constant_shell(makeString("termStrings"));



    public static final SubLObject $$nicknames = constant_handles.reader_make_constant_shell(makeString("nicknames"));

    static private final SubLSymbol $sym130$_DENOT = makeSymbol("?DENOT");

    public static final SubLObject $$nounStrings = constant_handles.reader_make_constant_shell(makeString("nounStrings"));

    public static final SubLObject $$termPhrases = constant_handles.reader_make_constant_shell(makeString("termPhrases"));

    static private final SubLSymbol $sym133$_PLACE = makeSymbol("?PLACE");

    public static final SubLObject $$placeName_Standard = constant_handles.reader_make_constant_shell(makeString("placeName-Standard"));

    static private final SubLList $list_alt135 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000));

    public static final SubLObject $$or = constant_handles.reader_make_constant_shell(makeString("or"));

    public static final SubLObject $$placeName_ShortForm = constant_handles.reader_make_constant_shell(makeString("placeName-ShortForm"));

    public static final SubLObject $$placeName_LocalLongForm = constant_handles.reader_make_constant_shell(makeString("placeName-LocalLongForm"));

    public static final SubLObject $$placeName_LocalShortForm = constant_handles.reader_make_constant_shell(makeString("placeName-LocalShortForm"));

    public static final SubLObject $$placeName_WithRegionAbbreviation = constant_handles.reader_make_constant_shell(makeString("placeName-WithRegionAbbreviation"));

    static private final SubLSymbol $sym141$_ISA = makeSymbol("?ISA");

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));

    static private final SubLList $list_alt143 = list(makeSymbol("?ISA"));

    static private final SubLList $list_alt144 = list(list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?ISA"), makeSymbol("?COL")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?COL"), makeSymbol("?ISA"))));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$admittedArgument = constant_handles.reader_make_constant_shell(makeString("admittedArgument"));

    static private final SubLList $list_alt147 = list(list(makeSymbol("DOCUMENT"), makeSymbol("&KEY"), list(makeSymbol("RANDOMIZE?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt148 = list(makeKeyword("RANDOMIZE?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $kw150$RANDOMIZE_ = makeKeyword("RANDOMIZE?");

    static private final SubLSymbol $sym151$DOCUMENTS = makeUninternedSymbol("DOCUMENTS");

    private static final SubLSymbol WITH_BBN_STRENGTHENING_PROBLEM_STORE_REUSE = makeSymbol("WITH-BBN-STRENGTHENING-PROBLEM-STORE-REUSE");

    static private final SubLList $list_alt153 = list(list(makeSymbol("GET-BBN-DOCUMENTS")));

    private static final SubLSymbol RANDOMIZE_LIST = makeSymbol("RANDOMIZE-LIST");



    static private final SubLList $list_alt156 = list(list(makeSymbol("DOCUMENT"), makeSymbol("DOC-NUM"), makeSymbol("&KEY"), makeSymbol("EVERY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt157 = list(makeKeyword("EVERY"));



    static private final SubLSymbol $sym159$DOCUMENT_COUNT = makeUninternedSymbol("DOCUMENT-COUNT");

    static private final SubLList $list_alt160 = list(list(makeSymbol("COUNT-BBN-DOCUMENTS")));







    static private final SubLSymbol $sym164$_ = makeSymbol("/");

    static private final SubLSymbol $sym165$BBN_DOCUMENT_NUMBER_HAS_TEXT_ = makeSymbol("BBN-DOCUMENT-NUMBER-HAS-TEXT?");

    static private final SubLSymbol $sym166$_TEXT = makeSymbol("?TEXT");

    public static final SubLObject $$textOfWork = constant_handles.reader_make_constant_shell(makeString("textOfWork"));

    static private final SubLList $list_alt168 = list(makeSymbol("?TEXT"));

    static private final SubLList $list_alt169 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-document-KS")));

    public static final SubLObject $$SchemaObjectFn = constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn"));

    public static final SubLObject $$CDE_document_LS = constant_handles.reader_make_constant_shell(makeString("CDE-document-LS"));

    public static final SubLInteger $int$4500 = makeInteger(4500);

    static private final SubLSymbol $sym173$_N = makeSymbol("?N");

    static private final SubLList $list_alt174 = list(constant_handles.reader_make_constant_shell(makeString("extentCardinality")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?DOC"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?DOC"), constant_handles.reader_make_constant_shell(makeString("TextualPCW"))), list(constant_handles.reader_make_constant_shell(makeString("argN")), constant_handles.reader_make_constant_shell(makeString("CDE-document-LS")), ONE_INTEGER, makeSymbol("?DOC")))), makeSymbol("?N"));

    private static final SubLSymbol BBN_ASK_VARIABLE = makeSymbol("BBN-ASK-VARIABLE");

    static private final SubLSymbol $sym176$_DOCUMENT = makeSymbol("?DOCUMENT");

    static private final SubLList $list_alt177 = list(constant_handles.reader_make_constant_shell(makeString("instantiationOfWork")), makeSymbol("?SOURCE-FILE"), makeSymbol("?DOCUMENT"));

    static private final SubLList $list_alt178 = list(makeKeyword("MAX-TIME"), makeInteger(60));

    static private final SubLList $list_alt179 = list(list(makeSymbol("HYPOTHESIS"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GET_BBN_DOCUMENT_HYPOTHESES = makeSymbol("GET-BBN-DOCUMENT-HYPOTHESES");

    static private final SubLSymbol $sym181$_HYPOTHESIS = makeSymbol("?HYPOTHESIS");

    public static final SubLObject $$hypothesisAboutTextualPCW = constant_handles.reader_make_constant_shell(makeString("hypothesisAboutTextualPCW"));

    static private final SubLList $list_alt183 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-hypothesis-KS")));

    public static final SubLSymbol $get_bbn_document_hypotheses_caching_state$ = makeSymbol("*GET-BBN-DOCUMENT-HYPOTHESES-CACHING-STATE*");

    static private final SubLList $list_alt185 = list(list(makeSymbol("ENTITY-MENTION"), makeSymbol("ARG-NUM"), makeSymbol("HYPOTHESIS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym186$PAIR = makeUninternedSymbol("PAIR");

    private static final SubLSymbol GET_BBN_HYPOTHESIS_ENTITY_MENTIONS = makeSymbol("GET-BBN-HYPOTHESIS-ENTITY-MENTIONS");





    static private final SubLList $list_alt190 = list(makeSymbol("HYP-ARG"), makeSymbol("ARGNUM"));

    static private final SubLSymbol $sym191$_EM = makeSymbol("?EM");

    public static final SubLObject $$dependsOnEMHyp = constant_handles.reader_make_constant_shell(makeString("dependsOnEMHyp"));

    static private final SubLList $list_alt193 = list(makeSymbol("?EM"));

    static private final SubLList $list_alt194 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-hypothesis_arg-KS")));

    static private final SubLList $list_alt195 = list(list(makeSymbol("BINARY-SENTENCE"), makeSymbol("HYPOTHESIS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GET_BBN_HYPOTHESIS_BINARY_SENTENCES = makeSymbol("GET-BBN-HYPOTHESIS-BINARY-SENTENCES");

    static private final SubLSymbol $sym197$_FORM = makeSymbol("?FORM");

    public static final SubLObject $$hypothesizedFormula = constant_handles.reader_make_constant_shell(makeString("hypothesizedFormula"));

    static private final SubLList $list_alt199 = list(makeSymbol("?FORM"));

    static private final SubLList $list_alt200 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-hp2-KS")));

    static private final SubLList $list_alt201 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLSymbol $sym202$_HEADWORD_STRING = makeSymbol("?HEADWORD-STRING");

    public static final SubLObject $$headwordStringForMention = constant_handles.reader_make_constant_shell(makeString("headwordStringForMention"));

    public static final SubLObject $$EntityMentionForHypothesisFn = constant_handles.reader_make_constant_shell(makeString("EntityMentionForHypothesisFn"));

    static private final SubLList $list_alt205 = list(makeSymbol("?HEADWORD-STRING"));

    static private final SubLList $list_alt206 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-entity_ref-KS")));

    static private final SubLSymbol $sym207$_DIGIT = makeSymbol("?DIGIT");

    static private final SubLList $list_alt208 = list(makeSymbol("?DIGIT"));

    static private final SubLList $list_alt209 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?DIGIT"), constant_handles.reader_make_constant_shell(makeString("ArabicNumeral"))));

    public static final SubLObject $$originalPhrase = constant_handles.reader_make_constant_shell(makeString("originalPhrase"));

    static private final SubLString $str_alt211$___ = makeString(" : ");

    private static final SubLSymbol BBN_DEDUCE_ENTITY_HEADSTRING = makeSymbol("BBN-DEDUCE-ENTITY-HEADSTRING");

    static private final SubLSymbol $sym213$_STRING = makeSymbol("?STRING");

    static private final SubLList $list_alt214 = list(makeSymbol("?STRING"));

    public static final SubLSymbol $bbn_deduce_entity_headstring_caching_state$ = makeSymbol("*BBN-DEDUCE-ENTITY-HEADSTRING-CACHING-STATE*");

    static private final SubLSymbol $sym216$_REFERENT = makeSymbol("?REFERENT");

    public static final SubLObject $$hypothesizedReference = constant_handles.reader_make_constant_shell(makeString("hypothesizedReference"));

    static private final SubLList $list_alt218 = list(makeSymbol("?REFERENT"));

    private static final SubLSymbol GET_BBN_TERM_REFERENCES = makeSymbol("GET-BBN-TERM-REFERENCES");



    static private final SubLSymbol $sym221$_HYP = makeSymbol("?HYP");

    public static final SubLSymbol $get_bbn_term_references_caching_state$ = makeSymbol("*GET-BBN-TERM-REFERENCES-CACHING-STATE*");



    static private final SubLSymbol $sym224$_THIS_STRING = makeSymbol("?THIS-STRING");

    static private final SubLList $list_alt225 = list(makeSymbol("?THIS-STRING"));

    static private final SubLSymbol $sym226$_ = makeSymbol(">");



    public static final SubLObject $$preferredTermStrings = constant_handles.reader_make_constant_shell(makeString("preferredTermStrings"));

    static private final SubLList $list_alt229 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-term-KS")));

    public static final SubLObject $$bbnCoreStringAssertion = constant_handles.reader_make_constant_shell(makeString("bbnCoreStringAssertion"));

    public static final SubLObject $$bbnOtherStringAssertions = constant_handles.reader_make_constant_shell(makeString("bbnOtherStringAssertions"));

    static private final SubLSymbol $sym232$_REIFIED = makeSymbol("?REIFIED");

    static private final SubLList $list_alt233 = list(makeSymbol("?REIFIED"));

    static private final SubLString $str_alt234$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt235 = list(makeSymbol("EM"), makeSymbol("ARGNUM"));

    public static final SubLObject $$CDE_hypothesis_LS = constant_handles.reader_make_constant_shell(makeString("CDE-hypothesis-LS"));

    static private final SubLSymbol $sym237$_DOC = makeSymbol("?DOC");

    static private final SubLList $list_alt238 = list(makeSymbol("?DOC"));

    static private final SubLList $list_alt239 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-KS")));

    static private final SubLSymbol $sym240$_BBN_ENTITY_TYPE = makeSymbol("?BBN-ENTITY-TYPE");

    public static final SubLObject $$isa_Hypothesized = constant_handles.reader_make_constant_shell(makeString("isa-Hypothesized"));

    static private final SubLList $list_alt242 = list(makeSymbol("?BBN-ENTITY-TYPE"));

    private static final SubLSymbol BBN_MAP_ENTITY_TYPE_TO_COLLECTION = makeSymbol("BBN-MAP-ENTITY-TYPE-TO-COLLECTION");

    public static final SubLSymbol $bbn_cached_entity_type_conversions$ = makeSymbol("*BBN-CACHED-ENTITY-TYPE-CONVERSIONS*");

    static private final SubLSymbol $sym245$_CYCENTITY = makeSymbol("?CYCENTITY");

    static private final SubLList $list_alt246 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-bbnentitytypes-KS")));

    static private final SubLList $list_alt247 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-cycentities-KS")));

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

    static private final SubLSymbol $sym249$_CYC_ENTITY = makeSymbol("?CYC-ENTITY");

    static private final SubLList $list_alt250 = list(makeSymbol("?WU"), makeSymbol("?FORM"));

    static private final SubLList $list_alt251 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?FORM"), constant_handles.reader_make_constant_shell(makeString("nounStrings")));

    public static final SubLObject $$wordForms = constant_handles.reader_make_constant_shell(makeString("wordForms"));

    static private final SubLSymbol $sym253$_WU = makeSymbol("?WU");

    static private final SubLSymbol $sym254$_PRED = makeSymbol("?PRED");

    static private final SubLSymbol $sym255$_POS = makeSymbol("?POS");

    public static final SubLObject $$denotesArgInReln = constant_handles.reader_make_constant_shell(makeString("denotesArgInReln"));

    static private final SubLList $list_alt257 = list(makeSymbol("?POS"), makeSymbol("?PRED"), makeSymbol("?ARG-NUM"));

    public static final SubLObject $$speechPartPreds = constant_handles.reader_make_constant_shell(makeString("speechPartPreds"));

    static private final SubLSymbol $sym259$_RELATION_REFERENCE = makeSymbol("?RELATION-REFERENCE");

    public static final SubLObject $$dependsOnRMHyp = constant_handles.reader_make_constant_shell(makeString("dependsOnRMHyp"));

    static private final SubLList $list_alt261 = list(makeSymbol("?RELATION-REFERENCE"));

    static private final SubLSymbol $sym262$_HEAD_STRING = makeSymbol("?HEAD-STRING");

    public static final SubLObject $$RelationMentionForHypothesisFn = constant_handles.reader_make_constant_shell(makeString("RelationMentionForHypothesisFn"));

    static private final SubLList $list_alt264 = list(makeSymbol("?HEAD-STRING"));

    static private final SubLList $list_alt265 = list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("BBN-relation_ref-KS")));

    public static final SubLObject $$verbStrings = constant_handles.reader_make_constant_shell(makeString("verbStrings"));

    public static final SubLObject $$Verb = constant_handles.reader_make_constant_shell(makeString("Verb"));

    private static final SubLSymbol GET_BBN_HYPOTHESIS_ARGS = makeSymbol("GET-BBN-HYPOTHESIS-ARGS");

    public static final SubLObject $$argNumberForArgumentHypothesis = constant_handles.reader_make_constant_shell(makeString("argNumberForArgumentHypothesis"));

    static private final SubLList $list_alt270 = list(makeSymbol("?N"));

    static private final SubLSymbol $sym271$_HYP_ARG = makeSymbol("?HYP-ARG");

    public static final SubLObject $$dependsOnArgHyp = constant_handles.reader_make_constant_shell(makeString("dependsOnArgHyp"));

    static private final SubLList $list_alt273 = list(makeSymbol("?HYP-ARG"));

    static private final SubLSymbol $sym274$_ = makeSymbol("<");

    public static final SubLSymbol $semtrans_keyword_bbnargtype_map$ = makeSymbol("*SEMTRANS-KEYWORD-BBNARGTYPE-MAP*");

    static private final SubLList $list_alt276 = list(new SubLObject[]{ cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), ONE_INTEGER), makeKeyword("SUBJECT")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), TWO_INTEGER), makeKeyword("OBJECT")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), THREE_INTEGER), makeKeyword("ARG1")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), FOUR_INTEGER), makeKeyword("ARG2")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), FIVE_INTEGER), makeString("in")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), SIX_INTEGER), makeString("of")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), SEVEN_INTEGER), makeString("on")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), EIGHT_INTEGER), makeString("for")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), NINE_INTEGER), makeString("from")), cons(list(constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell(makeString("CDE-bbnargtype-LS")), TEN_INTEGER), makeKeyword("OBJECT")) });

    static private final SubLList $list_alt277 = list(makeSymbol("THE-ARG"), makeSymbol("N"));

    static private final SubLSymbol $sym278$_ROLE = makeSymbol("?ROLE");

    public static final SubLObject $const279$grammaticalRoleForArgumentHypothe = constant_handles.reader_make_constant_shell(makeString("grammaticalRoleForArgumentHypothesis"));

    static private final SubLList $list_alt280 = list(makeSymbol("?ROLE"));

    private static final SubLSymbol SEMTRANS_KEYWORD_FOR_BBNARGTYPE = makeSymbol("SEMTRANS-KEYWORD-FOR-BBNARGTYPE");

    static private final SubLList $list_alt282 = list(makeSymbol("?ENTITY-MENTION"), makeSymbol("?ROLE"));

    public static final SubLObject $$grammaticalRoleWRTRelationMention = constant_handles.reader_make_constant_shell(makeString("grammaticalRoleWRTRelationMention"));

    static private final SubLList $list_alt284 = list(list(constant_handles.reader_make_constant_shell(makeString("EntityMentionForHypothesisFn")), makeSymbol("?ENTITY-MENTION")), makeSymbol("?ROLE"));

    public static final SubLSymbol $semtrans_keyword_bbn_role_marker_map$ = makeSymbol("*SEMTRANS-KEYWORD-BBN-ROLE-MARKER-MAP*");

    static private final SubLList $list_alt286 = list(cons(constant_handles.reader_make_constant_shell(makeString("SubjectRoleMarker")), makeKeyword("SUBJECT")), cons(constant_handles.reader_make_constant_shell(makeString("DirectObjectRoleMarker")), makeKeyword("OBJECT")), cons(constant_handles.reader_make_constant_shell(makeString("IndirectObjectRoleMarker")), makeKeyword("OBLIQUE-OBJECT")));

    static private final SubLList $list_alt287 = list(makeSymbol("THE-ENTITY"), makeSymbol("THE-ROLE"));

    static private final SubLList $list_alt288 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt289 = list(makeSymbol("ROLE1"), makeSymbol("ROLE2"));









    public static final SubLObject $$TransitiveNPFrame = constant_handles.reader_make_constant_shell(makeString("TransitiveNPFrame"));



    static private final SubLSymbol $sym296$_PREP = makeSymbol("?PREP");

    public static final SubLObject $$prepCollocation = constant_handles.reader_make_constant_shell(makeString("prepCollocation"));

    static private final SubLList $list_alt298 = list(constant_handles.reader_make_constant_shell(makeString("Verb")), makeSymbol("?PREP"));

    public static final SubLObject $$PPCompFrameFn = constant_handles.reader_make_constant_shell(makeString("PPCompFrameFn"));

    public static final SubLObject $$DitransitivePPFrameType = constant_handles.reader_make_constant_shell(makeString("DitransitivePPFrameType"));

    static private final SubLString $str_alt301$can_t_leverage_verbSemTrans_for__ = makeString("can't leverage verbSemTrans for ~S with roles ~S~%");

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    static private final SubLSymbol $sym303$_SEM_TRANS = makeSymbol("?SEM-TRANS");

    public static final SubLObject $$verbSemTrans = constant_handles.reader_make_constant_shell(makeString("verbSemTrans"));

    static private final SubLSymbol $sym305$_WS = makeSymbol("?WS");

    static private final SubLList $list_alt306 = list(makeSymbol("?SEM-TRANS"));

    public static final SubLObject $$memberOfList = constant_handles.reader_make_constant_shell(makeString("memberOfList"));

    static private final SubLList $list_alt308 = list(constant_handles.reader_make_constant_shell(makeString("evaluate")), makeSymbol("?ARGS"), list(constant_handles.reader_make_constant_shell(makeString("FormulaArgListFn")), makeSymbol("?SEM-TRANS")));

    public static final SubLObject $$termFormulas = constant_handles.reader_make_constant_shell(makeString("termFormulas"));

    static private final SubLList $list_alt310 = list(makeSymbol("?ARGS"));

    static private final SubLList $list_alt311 = list(makeSymbol("ARG"), makeSymbol("ROLE"));

    static private final SubLSymbol $sym312$_SUB = makeSymbol("?SUB");

    public static final SubLObject $$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));

    public static final SubLObject $$SubstituteFormulaFn = constant_handles.reader_make_constant_shell(makeString("SubstituteFormulaFn"));





    static private final SubLString $str_alt317$_A__A__A = makeString("~A-~A-~A");

    static private final SubLString $str_alt318$BBN_CDE = makeString("BBN-CDE");

    static private final SubLString $str_alt319$Constant___A___ = makeString("Constant: ~A.~%");

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    static private final SubLString $$$some = makeString("some");

    public static final SubLObject $$simpleNounStrings = constant_handles.reader_make_constant_shell(makeString("simpleNounStrings"));

    static private final SubLString $str_alt323$unknown_verb_workspace_is__S__ = makeString("unknown-verb workspace is ~S~%");



    static private final SubLString $str_alt325$throwing_away_unknown_keyword____ = makeString("throwing away unknown keyword:~%~S~%");

    private static final SubLSymbol BBN_ENTER_SPONTANEOUS_GAF = makeSymbol("BBN-ENTER-SPONTANEOUS-GAF");

    public static final SubLObject $$Group = constant_handles.reader_make_constant_shell(makeString("Group"));

    static private final SubLString $str_alt328$testing__S_and__S = makeString("testing ~S and ~S");

    public static final SubLObject $$relationInstanceExists = constant_handles.reader_make_constant_shell(makeString("relationInstanceExists"));

    public static final SubLObject $$hypothesizedFormulaStrengthenedTo = constant_handles.reader_make_constant_shell(makeString("hypothesizedFormulaStrengthenedTo"));

    static private final SubLList $list_alt331 = list(makeSymbol("PRED"), makeSymbol("CONSTANT"), makeSymbol("NEW-COL"));

    static private final SubLList $list_alt332 = list(makeSymbol("OLD-COL"), makeSymbol("OLD-MT"));

    static private final SubLString $str_alt333$Delete___In_Mt___A___f___S___Ente = makeString("Delete.~%In Mt: ~A.~%f: ~S.~%Enter.~%");

    public static final SubLObject $$hypothesizedIsaCoercedInto = constant_handles.reader_make_constant_shell(makeString("hypothesizedIsaCoercedInto"));

    static private final SubLString $str_alt335$__isa_overridden = makeString("#$isa overridden");

    static private final SubLList $list_alt336 = list(makeSymbol("?COL"), makeSymbol("?MT"));

    static private final SubLString $str_alt337$__isa_coercion_performed = makeString("#$isa coercion performed");

    public static final SubLObject $$BBNRelationTypePredicate = constant_handles.reader_make_constant_shell(makeString("BBNRelationTypePredicate"));

    public static final SubLObject $$BinaryPredicate = constant_handles.reader_make_constant_shell(makeString("BinaryPredicate"));

    public static final SubLObject $$CycCanonicalGUIDMappingMt = constant_handles.reader_make_constant_shell(makeString("CycCanonicalGUIDMappingMt"));

    static private final SubLString $str_alt341$_S_is_already_present_in__S__ = makeString("~S is already present in ~S~%");



    public static final SubLObject $$sourceOfTerm = constant_handles.reader_make_constant_shell(makeString("sourceOfTerm"));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol $KNOWN_SERIF_ENTITIES_STRENGTHENED = makeKeyword("KNOWN-SERIF-ENTITIES-STRENGTHENED");

    static private final SubLString $str_alt346$failed_to_add__S_to__S__ = makeString("failed to add ~S to ~S~%");

    static private final SubLString $str_alt347$Asserted__S_in__A__ = makeString("Asserted ~S in ~A~%");

    static private final SubLString $str_alt348$In_Mt___A___Truth_Value___A___ = makeString("In Mt: ~A.~%Truth Value: ~A.~%");

    static private final SubLString $str_alt349$_S = makeString("~S");

    static private final SubLString $str_alt350$Direction___A___ = makeString("Direction: ~A.~%");

    static private final SubLString $str_alt351$f___S___ = makeString("f: ~S.~%");

    static private final SubLString $str_alt352$Asserted__A_in__A__ = makeString("Asserted ~A in ~A~%");

    static private final SubLList $list_alt353 = list(constant_handles.reader_make_constant_shell(makeString("ActorSlot")));

    public static final SubLObject $$GroupFn = constant_handles.reader_make_constant_shell(makeString("GroupFn"));

    public static final SubLObject $$GeopoliticalEntity = constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntity"));

    static private final SubLString $str_alt356$_S__ = makeString("~S~%");

    static private final SubLList $list_alt357 = list(makeSymbol("THE-FORMULA"), makeSymbol("THE-MT"));

    static private final SubLString $str_alt358$unasserting__S_from__S__ = makeString("unasserting ~S from ~S~%");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLSymbol $sym361$_ALL_COL = makeSymbol("?ALL-COL");

    public static final SubLObject $$interestingSentence = constant_handles.reader_make_constant_shell(makeString("interestingSentence"));

    static private final SubLSymbol $sym363$_INTEREST_MT = makeSymbol("?INTEREST-MT");

    public static final SubLObject $$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));

    static private final SubLList $list_alt365 = list(makeSymbol("?ALL-COL"), makeSymbol("?DEP-COL"));

    static private final SubLList $list_alt366 = list(makeSymbol("?ALL-COL"));

    static private final SubLList $list_alt367 = list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?DEP-COL"), constant_handles.reader_make_constant_shell(makeString("False")));

    static private final SubLList $list_alt368 = list(makeSymbol("?DEP-COL"));

    public static final SubLObject $$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));

    static private final SubLList $list_alt370 = list(constant_handles.reader_make_constant_shell(makeString("interestingSentence")), makeSymbol("?ALL-COL"), list(constant_handles.reader_make_constant_shell(makeString("ist")), makeSymbol("?INTEREST-MT"), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?PRED"), makeSymbol("?ALL-COL"), makeSymbol("?DEP-COL"))));

    static private final SubLList $list_alt371 = list(makeSymbol("ORIG-ITEM"), makeSymbol("THE-FUNC"), makeSymbol("&OPTIONAL"), makeSymbol("PRESERVE?"));

    static private final SubLList $list_alt372 = list(makeSymbol("THE-ANSWER"), NIL);

    private static final SubLSymbol USE_THIS_GAF = makeSymbol("USE-THIS-GAF");

    static private final SubLString $str_alt374$calling__A_on__S__ = makeString("calling ~A on ~S~%");



    private static final SubLSymbol THE_ANSWER = makeSymbol("THE-ANSWER");



    static private final SubLList $list_alt378 = list(makeSymbol("USE-THIS-GAF"));

    static private final SubLList $list_alt379 = list(makeSymbol("THE-ANSWER"));

    static private final SubLString $str_alt380$_S_had_no_text__skipping__ = makeString("~S had no text, skipping~%");

    static private final SubLString $str_alt381$DOC____S__ = makeString("DOC : ~S~%");

    static private final SubLString $str_alt382$ = makeString("");

    static private final SubLString $str_alt383$__ = makeString("  ");

    public static final SubLObject $$SecondsDuration = constant_handles.reader_make_constant_shell(makeString("SecondsDuration"));

    public static final SubLObject $$productivityMetricsForBBNDocument = constant_handles.reader_make_constant_shell(makeString("productivityMetricsForBBNDocument"));

    static private final SubLString $str_alt386$Total_of__A_strengthenings_in__A_ = makeString("Total of ~A strengthenings in ~A in ~A seconds~%");





    static private final SubLString $str_alt389$Grand_total_of__A_strengthenings_ = makeString("Grand total of ~A strengthenings in ~A seconds~%");

    static private final SubLString $str_alt390$Total_of__A_strengthenings_over__ = makeString("Total of ~A strengthenings over ~A documents in ~A seconds~%");



    static private final SubLString $str_alt392$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLInteger $int$3600 = makeInteger(3600);

    static private final SubLString $str_alt394$The_system_will_start_no_hypothes = makeString("The system will start no hypotheses after ~A.~%");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt396$Gathering_hypotheses_pertaining_t = makeString("Gathering hypotheses pertaining to Shamil Basayev...");

    static private final SubLString $str_alt397$checked__A__got__A__ = makeString("checked ~A, got ~A~%");

    static private final SubLSymbol $sym398$_ENTITY_MENTION = makeSymbol("?ENTITY-MENTION");

    static private final SubLList $list_alt399 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("hypothesizedReference")), makeSymbol("?ENTITY-MENTION"), makeSymbol("?TERM")), list(constant_handles.reader_make_constant_shell(makeString("originalPhrase")), makeSymbol("?ENTITY-MENTION"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("?TERM"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("substring")), makeString("Basayev"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("substring")), makeString("Shamil"), makeSymbol("?STRING"))));

    static private final SubLString $str_alt400$_A_of__A_Shamil_hypotheses_comple = makeString("~A of ~A Shamil hypotheses completed~%");

    static private final SubLString $str_alt401$___A_of__A_Shamil_hypotheses_comp = makeString(";;~A of ~A Shamil hypotheses completed~%");

    static private final SubLString $str_alt402$A_total_of__A_strengthenings_perf = makeString("A total of ~A strengthenings performed in ~A seconds~%");

    static private final SubLString $str_alt403$____A__ = makeString("   ~A~%");

    static private final SubLString $str_alt404$rejecting_non_binary_hypothesis__ = makeString("rejecting non-binary hypothesis ~A~%");

    static private final SubLString $str_alt405$___Never_mind____no_binary_hypoth = makeString(";; Never mind... no binary hypotheses.~%");

    static private final SubLString $str_alt406$___Beginning_hypothesis__A_at__A_ = makeString(";; Beginning hypothesis ~A at ~A.~%");

    static private final SubLString $str_alt407$Beginning_hypothesis__A_at__A__ = makeString("Beginning hypothesis ~A at ~A~%");

    private static final SubLSymbol $HYPOTHESES_INVESTIGATED = makeKeyword("HYPOTHESES-INVESTIGATED");

    private static final SubLSymbol $UNKNOWN_SERIF_RELATIONSHIPS_STRENGTHENED = makeKeyword("UNKNOWN-SERIF-RELATIONSHIPS-STRENGTHENED");

    static private final SubLString $$$resolved_unknown_predicate = makeString("resolved unknown predicate");

    static private final SubLString $str_alt411$__entry_gaf___S__ = makeString("  entry gaf: ~S~%");

    private static final SubLSymbol $HYPOTHESES_REJECTED = makeKeyword("HYPOTHESES-REJECTED");

    static private final SubLString $str_alt413$rejected_sub_hypothesis__S__ = makeString("rejected sub-hypothesis ~S~%");

    private static final SubLSymbol $HYPOTHESES_STRENGTHENED = makeKeyword("HYPOTHESES-STRENGTHENED");

    static private final SubLString $$$exploring_predicates = makeString("exploring predicates");

    static private final SubLString $str_alt416$___S = makeString("~%~S");

    static private final SubLString $$$on_spontaneous_gaf = makeString("on spontaneous gaf");

    static private final SubLString $str_alt418$___A = makeString("~%~A");

    private static final SubLSymbol $HYPOTHESES_ACCEPTED = makeKeyword("HYPOTHESES-ACCEPTED");

    static private final SubLString $$$term_to_constant_substitution = makeString("term to constant substitution");

    static private final SubLSymbol $sym421$_INDIV = makeSymbol("?INDIV");

    static private final SubLString $$$inverted_proposal = makeString("inverted proposal");

    static private final SubLList $list_alt423 = list(makeSymbol("WAS-PRED"), makeSymbol("WAS-ARG1"), makeSymbol("WAS-ARG2"));

    static private final SubLString $$$trivial_inversion = makeString("trivial inversion");

    static private final SubLSymbol $sym425$_INV = makeSymbol("?INV");

    static private final SubLList $list_alt426 = list(makeSymbol("?INV"));

    public static final SubLObject $$different = constant_handles.reader_make_constant_shell(makeString("different"));

    static private final SubLList $list_alt428 = list(makeSymbol("?COL1"), makeSymbol("?COL2"));

    static private final SubLList $list_alt429 = list(makeSymbol("?COL1"));

    static private final SubLList $list_alt430 = list(makeSymbol("?COL2"));

    public static final SubLObject $$relationExistsAll = constant_handles.reader_make_constant_shell(makeString("relationExistsAll"));

    private static final SubLSymbol STRENGTHEN_VIA_TYPED_GENL_PREDS = makeSymbol("STRENGTHEN-VIA-TYPED-GENL-PREDS");

    private static final SubLSymbol BBN_STRENGTHEN_ARGS_USING_HEADS = makeSymbol("BBN-STRENGTHEN-ARGS-USING-HEADS");

    private static final SubLSymbol STRENGTHEN_VIA_RELATION_EXISTS_ALL = makeSymbol("STRENGTHEN-VIA-RELATION-EXISTS-ALL");

    private static final SubLSymbol STRENGTHEN_VIA_GENITIVE_SEM_TRANS = makeSymbol("STRENGTHEN-VIA-GENITIVE-SEM-TRANS");

    private static final SubLSymbol STRENGTHEN_VIA_RELATIONAL_SPECPREDS = makeSymbol("STRENGTHEN-VIA-RELATIONAL-SPECPREDS");

    private static final SubLSymbol STRENGTHEN_VIA_ARG2_ACTS_IN_CAPACITY = makeSymbol("STRENGTHEN-VIA-ARG2-ACTS-IN-CAPACITY");

    private static final SubLSymbol STRENGTHEN_VIA_ARG1_REPRESENTATION = makeSymbol("STRENGTHEN-VIA-ARG1-REPRESENTATION");

    private static final SubLSymbol STRENGTHEN_VIA_RELATIONAL_COMPOUNDING = makeSymbol("STRENGTHEN-VIA-RELATIONAL-COMPOUNDING");

    private static final SubLSymbol STRENGTHEN_VIA_ARG2_IS_SUBORG_VIA_FUNCTION = makeSymbol("STRENGTHEN-VIA-ARG2-IS-SUBORG-VIA-FUNCTION");

    private static final SubLSymbol BBN_GENERATE_GOVERNMENT_TYPE = makeSymbol("BBN-GENERATE-GOVERNMENT-TYPE");

    private static final SubLSymbol BBN_OWNS_TO_ASSETS_HACK = makeSymbol("BBN-OWNS-TO-ASSETS-HACK");

    public static final SubLObject $$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));

    static private final SubLList $list_alt444 = list(constant_handles.reader_make_constant_shell(makeString("CycLConstant")));

    static private final SubLSymbol $sym445$_FUNC = makeSymbol("?FUNC");

    static private final SubLList $list_alt446 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell(makeString("SubcollectionDenotingFunction")));

    public static final SubLObject $$natFunction = constant_handles.reader_make_constant_shell(makeString("natFunction"));

    static private final SubLList $list_alt448 = list(makeSymbol("?FUNC"));

    public static final SubLObject $$plural_Generic = constant_handles.reader_make_constant_shell(makeString("plural-Generic"));

    public static final SubLObject $$nonPlural_Generic = constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic"));

    static private final SubLString $str_alt451$_of_ = makeString(" of ");

    static private final SubLList $list_alt452 = list(makeSymbol("?DENOT"), makeSymbol("?QUANT"));

    static private final SubLSymbol $sym453$_OF_THESE = makeSymbol("?OF-THESE");

    public static final SubLObject $$ConcatenateStringsFn = constant_handles.reader_make_constant_shell(makeString("ConcatenateStringsFn"));

    static private final SubLSymbol $sym455$_QUANT_STRING = makeSymbol("?QUANT-STRING");

    public static final SubLObject $$StringPostremoveFn = constant_handles.reader_make_constant_shell(makeString("StringPostremoveFn"));

    static private final SubLList $list_alt457 = list(makeSymbol("?OF-THESE"));

    static private final SubLList $list_alt458 = list(constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("?QUANT"), makeSymbol("?QUANT-STRING"));

    static private final SubLList $list_alt459 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?QUANT"), constant_handles.reader_make_constant_shell(makeString("PositiveIntegerExtent")));

    static private final SubLList $list_alt460 = list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?QUANT"), constant_handles.reader_make_constant_shell(makeString("PositiveInteger"))));

    static private final SubLSymbol $sym461$_WITH_SPACE = makeSymbol("?WITH-SPACE");

    static private final SubLString $str_alt462$_ = makeString(" ");

    static private final SubLList $list_alt463 = list(makeSymbol("?WITH-SPACE"));

    static private final SubLList $list_alt464 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?QUANT"), constant_handles.reader_make_constant_shell(makeString("PositiveInteger")));

    public static final SubLObject $$owns = constant_handles.reader_make_constant_shell(makeString("owns"));

    public static final SubLObject $$headquarters = constant_handles.reader_make_constant_shell(makeString("headquarters"));

    public static final SubLObject $$assets = constant_handles.reader_make_constant_shell(makeString("assets"));

    public static final SubLObject $$DurableGood = constant_handles.reader_make_constant_shell(makeString("DurableGood"));

    static private final SubLSymbol $sym469$_GOVT = makeSymbol("?GOVT");

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    static private final SubLList $list_alt471 = list(constant_handles.reader_make_constant_shell(makeString("basedInRegion")));

    static private final SubLList $list_alt472 = list(constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntity")));

    static private final SubLList $list_alt473 = list(makeSymbol("?ARG2-STRING"));

    static private final SubLList $list_alt474 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?GOVT"), constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntityBySystemOfGovernment")));

    static private final SubLList $list_alt475 = list(constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("?GOVT"), makeSymbol("?GOVT-STRING"));

    static private final SubLList $list_alt476 = list(constant_handles.reader_make_constant_shell(makeString("evaluate")), makeSymbol("?POSSESSIVE"), list(constant_handles.reader_make_constant_shell(makeString("ConcatenateStringsFn")), makeSymbol("?ARG2-STRING"), makeString(" 's "), makeSymbol("?GOVT-STRING")));

    static private final SubLList $list_alt477 = list(makeSymbol("?POSSESSIVE"));

    public static final SubLObject $$governmentType = constant_handles.reader_make_constant_shell(makeString("governmentType"));

    private static final SubLSymbol $KNOWN_SERIF_RELATIONSHIPS_STRENGTHENED = makeKeyword("KNOWN-SERIF-RELATIONSHIPS-STRENGTHENED");

    static private final SubLString $$$government_type_established = makeString("government type established");

    static private final SubLList $list_alt481 = list(constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn")), list($TEST, makeSymbol("STRINGP")), list($BIND, makeSymbol("COL")));



    private static final SubLSymbol EL_BINARY_FORMULA_P = makeSymbol("EL-BINARY-FORMULA-P");

    static private final SubLString $str_alt484$head_ = makeString("head?");

    static private final SubLSymbol $sym485$_STRONG = makeSymbol("?STRONG");

    static private final SubLSymbol $sym486$_ANYWHERE = makeSymbol("?ANYWHERE");

    public static final SubLObject $$typedGenlPreds = constant_handles.reader_make_constant_shell(makeString("typedGenlPreds"));

    static private final SubLList $list_alt488 = list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?MT1"), list(constant_handles.reader_make_constant_shell(makeString("arg1Isa")), makeSymbol("?STRONG"), makeSymbol("?COL1")));

    static private final SubLList $list_alt489 = list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?MT2"), list(constant_handles.reader_make_constant_shell(makeString("arg2Isa")), makeSymbol("?STRONG"), makeSymbol("?COL2")));

    public static final SubLObject $$equivPredsWRTTypes = constant_handles.reader_make_constant_shell(makeString("equivPredsWRTTypes"));

    static private final SubLList $list_alt491 = list(makeSymbol("?STRONG"), makeSymbol("?X"), makeSymbol("?Y"));

    static private final SubLList $list_alt492 = list(list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?STRONG"), constant_handles.reader_make_constant_shell(makeString("isa-Hypothesized")))));

    static private final SubLString $$$typedGenlPreds = makeString("typedGenlPreds");

    public static final SubLObject $$genlPredsWRTTypes = constant_handles.reader_make_constant_shell(makeString("genlPredsWRTTypes"));

    static private final SubLList $list_alt495 = list(makeSymbol("?STRONG"), makeSymbol("?A1"), makeSymbol("?A2"));

    static private final SubLList $list_alt496 = list(makeSymbol("?A1"));

    static private final SubLList $list_alt497 = list(makeSymbol("?A2"));

    static private final SubLString $$$genlPredsWRTTypes = makeString("genlPredsWRTTypes");

    static private final SubLList $list_alt499 = list(makeSymbol("BINDING"), makeSymbol("COL"));

    static private final SubLList $list_alt500 = list(makeSymbol("?STRONG"), makeSymbol("?COL1"));

    static private final SubLList $list_alt501 = list(constant_handles.reader_make_constant_shell(makeString("relationExistsAll")), makeSymbol("?STRONG"), makeSymbol("?COL1"), makeSymbol("?COL2"));

    static private final SubLString $str_alt502$via_relation_exists_all = makeString("via-relation-exists-all");

    static private final SubLList $list_alt503 = list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?STRONG"), makeSymbol("?COL1"), makeSymbol("?COL2"));

    static private final SubLString $str_alt504$via_relation_all_exists = makeString("via-relation-all-exists");

    static private final SubLSymbol $sym505$_HEAD = makeSymbol("?HEAD");

    static private final SubLSymbol $sym506$_OF_SOMETHING = makeSymbol("?OF-SOMETHING");

    static private final SubLSymbol $sym507$_OF_THIS = makeSymbol("?OF-THIS");

    static private final SubLSymbol $sym508$_X_OF_Y = makeSymbol("?X-OF-Y");

    static private final SubLList $list_alt509 = list(list(constant_handles.reader_make_constant_shell(makeString("evaluate")), makeSymbol("?HEAD"), list(constant_handles.reader_make_constant_shell(makeString("StringPostremoveFn")), makeSymbol("?X-OF-Y"), list(constant_handles.reader_make_constant_shell(makeString("ConcatenateStringsFn")), makeString(" of "), makeSymbol("?OF-THIS")))), list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?HEAD"), makeSymbol("?X-OF-Y")));

    static private final SubLString $$$x_of_y_nounSemTrans = makeString("x of y nounSemTrans");

    static private final SubLSymbol $sym511$_NEW_TRANS = makeSymbol("?NEW-TRANS");

    static private final SubLList $list_alt512 = list(constant_handles.reader_make_constant_shell(makeString("nounSemTrans")), makeSymbol("?WU"), makeSymbol("?WS"), constant_handles.reader_make_constant_shell(makeString("GenitiveFrame")), makeSymbol("?TRANS"));



    static private final SubLList $list_alt514 = list($NOUN, makeSymbol("?TRANS"));

    static private final SubLList $list_alt515 = list(makeSymbol("THIS-PRED"), makeSymbol("THE-COL"));

    static private final SubLString $str_alt516$focal_qualifies______isa__S__S___ = makeString("focal qualifies : (#$isa ~S ~S)~%");

    static private final SubLList $list_alt517 = list(makeSymbol("THIS-PRED"), makeSymbol("THE-WU"));

    static private final SubLString $str_alt518$units_____termStrings__S__S___ = makeString("units: (#$termStrings ~S ~S)~%");

    static private final SubLString $str_alt519$relational_specpreds = makeString("relational-specpreds");

    public static final SubLObject $$singular = constant_handles.reader_make_constant_shell(makeString("singular"));

    static private final SubLList $list_alt521 = list(makeSymbol("?RELN"), makeSymbol("?WU"));

    public static final SubLObject $$nearestGenlPreds = constant_handles.reader_make_constant_shell(makeString("nearestGenlPreds"));

    static private final SubLSymbol $sym523$_RELN = makeSymbol("?RELN");

    static private final SubLList $list_alt524 = list(constant_handles.reader_make_constant_shell(makeString("denotesArgInReln")), makeSymbol("?WU"), makeSymbol("?POS"), makeSymbol("?RELN"), TWO_INTEGER);

    static private final SubLList $list_alt525 = list(makeSymbol("THIS-RELN"), makeSymbol("THIS-DENOT"));

    static private final SubLList $list_alt526 = list(makeSymbol("?RELN"), makeSymbol("?DENOT"));

    static private final SubLList $list_alt527 = list(list(constant_handles.reader_make_constant_shell(makeString("denotation")), makeSymbol("?WU"), makeSymbol("?POS"), makeSymbol("?WS"), makeSymbol("?DENOT")), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell(makeString("Individual")))));

    public static final SubLObject $$multiWordStringDenotesArgInReln = constant_handles.reader_make_constant_shell(makeString("multiWordStringDenotesArgInReln"));

    static private final SubLList $list_alt529 = list(makeSymbol("?HEAD"), makeSymbol("?NOUN"), makeSymbol("?PRED"), TWO_INTEGER);

    static private final SubLList $list_alt530 = list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?NOUN"), constant_handles.reader_make_constant_shell(makeString("Noun")));

    static private final SubLSymbol $sym531$_POS_PRED = makeSymbol("?POS-PRED");

    static private final SubLList $list_alt532 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?POS-PRED"), constant_handles.reader_make_constant_shell(makeString("SpeechPartPredicate")));

    static private final SubLString $str_alt533$relational_compounding = makeString("relational-compounding");

    static private final SubLList $list_alt534 = list(makeSymbol("?CAPACITY"));

    static private final SubLList $list_alt535 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CAPACITY"), constant_handles.reader_make_constant_shell(makeString("SecondOrderCollection")));

    static private final SubLList $list_alt536 = list(constant_handles.reader_make_constant_shell(makeString("arg1Isa")), makeSymbol("?STRONG"), makeSymbol("?ARG1"));

    static private final SubLList $list_alt537 = list(makeSymbol("?ARG1"));

    static private final SubLList $list_alt538 = list(list(constant_handles.reader_make_constant_shell(makeString("arg2Isa")), makeSymbol("?STRONG"), makeSymbol("?ARG2")), list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("typeGenls")), makeSymbol("?CAPACITY"), makeSymbol("?TYPE"))), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?TYPE"), makeSymbol("?ARG2")));

    static private final SubLString $str_alt539$arg2_acts_in_capacity = makeString("arg2-acts-in-capacity");

    public static final SubLObject $$PersonTypeByOccupation = constant_handles.reader_make_constant_shell(makeString("PersonTypeByOccupation"));

    public static final SubLObject $$hasAgents = constant_handles.reader_make_constant_shell(makeString("hasAgents"));

    public static final SubLObject $$hasWorkers = constant_handles.reader_make_constant_shell(makeString("hasWorkers"));

    public static final SubLObject $$representsAgentInEventType = constant_handles.reader_make_constant_shell(makeString("representsAgentInEventType"));

    static private final SubLSymbol $sym544$_OF_TERM = makeSymbol("?OF-TERM");

    static private final SubLList $list_alt545 = list(makeSymbol("?EVT-TYPE"));

    static private final SubLList $list_alt546 = list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeSymbol("?OF-TERM"), constant_handles.reader_make_constant_shell(makeString("CycLConstant"))));

    public static final SubLObject $$natArgument = constant_handles.reader_make_constant_shell(makeString("natArgument"));

    public static final SubLSymbol $bbn_lexical_mt$ = makeSymbol("*BBN-LEXICAL-MT*");

    static private final SubLSymbol $sym549$_WORD = makeSymbol("?WORD");

    static private final SubLList $list_alt550 = list(TWO_INTEGER);

    static private final SubLList $list_alt551 = list(list(constant_handles.reader_make_constant_shell(makeString("ist")), makeSymbol("*BBN-LEXICAL-MT*"), list(constant_handles.reader_make_constant_shell(makeString("denotation")), makeSymbol("?WORD"), makeSymbol("?POS"), makeSymbol("??WS"), makeSymbol("?DENOT"))), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?PRED"), makeSymbol("?AGR"), makeSymbol("?DENOT")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?AGR"), constant_handles.reader_make_constant_shell(makeString("Agreement"))), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("outputs")), makeSymbol("?EVT-TYPE"), makeSymbol("?AGR")));

    static private final SubLString $str_alt552$arg1_representation = makeString("arg1-representation");

    static private final SubLList $list_alt553 = list(makeSymbol("ENTITY-MENTION"), makeSymbol("ARG-NUM"));

    static private final SubLString $str_alt554$__Strengthened__S_of__S_entity_me = makeString("~&Strengthened ~S of ~S entity mentions in ~S seconds.~%");

    static private final SubLString $str_alt555$___S___S__ = makeString("~&~S: ~S~%");

    static private final SubLList $list_alt556 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell(makeString("UnaryFunction")));

    static private final SubLSymbol $sym557$_ORG = makeSymbol("?ORG");

    public static final SubLObject $$RelationParaphraseMt = constant_handles.reader_make_constant_shell(makeString("RelationParaphraseMt"));

    static private final SubLString $str_alt559$arg2_isa_suborg_via_function = makeString("arg2-isa-suborg-via-function");



    static private final SubLString $str_alt561$HYP__S__ = makeString("HYP ~S~%");

    static private final SubLString $str_alt562$__in__S___ = makeString("  in ~S:~%");

    static private final SubLString $str_alt563$______no_binary_sentences______ = makeString("  !!! no binary sentences !!!~%");

    static private final SubLString $str_alt564$_____A___S___A__ = makeString("    ~A  ~S  ~A~%");

    static private final SubLString $str_alt565$_____A__ = makeString("    ~A~%");

    static private final SubLString $str_alt566$__entities_mentioned___ = makeString("  entities mentioned:~%");

    static private final SubLList $list_alt567 = list(makeSymbol("THIS-ENT"), makeSymbol("THIS-ARG"));

    static private final SubLString $str_alt568$_____A___S___S__ = makeString("    ~A: ~S  ~S~%");

    static private final SubLString $str_alt569$__binary_sentences___ = makeString("  binary sentences:~%");

    static private final SubLString $str_alt570$_________S__S__ = makeString("      : ~S ~S~%");

    static private final SubLList $list_alt571 = list(list(makeSymbol("TERM"), makeSymbol("TERM-NUM"), makeSymbol("&KEY"), makeSymbol("EVERY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym572$TERM_COUNT = makeUninternedSymbol("TERM-COUNT");

    static private final SubLList $list_alt573 = list(list(makeSymbol("COUNT-BBN-TERMS")));

    public static final SubLObject $$CDE_term_LS = constant_handles.reader_make_constant_shell(makeString("CDE-term-LS"));

    public static final SubLInteger $int$500000 = makeInteger(500000);

    static private final SubLString $str_alt576$Can_t_reify_schema_based_on__A__ = makeString("Can't reify schema based on ~A~%");

    static private final SubLString $str_alt577$BBN_CDE_Reified_Term__A = makeString("BBN-CDE-Reified-Term-~A");

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    static private final SubLString $str_alt579$_S_is_known_to_not_be_a__S = makeString("~S is known to not be a ~S");

    static private final SubLList $list_alt580 = list(constant_handles.reader_make_constant_shell(makeString("BBN-KS")));

    private static final SubLSymbol $ENTITIES_INVESTIGATED = makeKeyword("ENTITIES-INVESTIGATED");

    static private final SubLList $list_alt582 = list(constant_handles.reader_make_constant_shell(makeString("Organization")));

    static private final SubLList $list_alt583 = list(list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("substring")), makeString(" & Co"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("substring")), makeString(" Company"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("substring")), makeString(" Plc"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("substring")), makeString(" Ltd"), makeSymbol("?STRING"))));

    public static final SubLObject $$Business = constant_handles.reader_make_constant_shell(makeString("Business"));

    public static final SubLObject $$Person = constant_handles.reader_make_constant_shell(makeString("Person"));



    static private final SubLList $list_alt587 = list(makeSymbol("?DENOT"), makeSymbol("?PRED"));

    static private final SubLSymbol $sym588$_WRT_RESULT = makeSymbol("?WRT-RESULT");

    public static final SubLObject $$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));

    static private final SubLList $list_alt590 = list(makeSymbol("?RESULT"));

    static private final SubLList $list_alt591 = list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?RESULT"), constant_handles.reader_make_constant_shell(makeString("ScalarInterval"))));

    static private final SubLList $list_alt592 = list(TWO_INTEGER, makeSymbol("?PRED"));

    static private final SubLList $list_alt593 = list(constant_handles.reader_make_constant_shell(makeString("arity")), makeSymbol("?PRED"), TWO_INTEGER);

    static private final SubLList $list_alt594 = list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?WRT-ARG2"), list(constant_handles.reader_make_constant_shell(makeString("arg2Isa")), makeSymbol("?PRED"), makeSymbol("?RESULT")));

    public static final SubLObject $$MassNoun = constant_handles.reader_make_constant_shell(makeString("MassNoun"));

    static private final SubLList $list_alt596 = list(list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?WRT-ARG1"), list(constant_handles.reader_make_constant_shell(makeString("arg1Isa")), makeSymbol("?PRED"), makeSymbol("?ARG1"))), list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?DENOT"), makeSymbol("?ARG1")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?DENOT"), makeSymbol("?ARG1"))));

    static private final SubLList $list_alt597 = list(makeSymbol("DENOT"), makeSymbol("PRED"));

    static private final SubLString $$$quantity_parse = makeString("quantity parse");



    public static final SubLObject $$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));

    static private final SubLList $list_alt601 = list(constant_handles.reader_make_constant_shell(makeString("Person")));

    static private final SubLSymbol $sym602$_GENDER = makeSymbol("?GENDER");

    static private final SubLSymbol $sym603$_NART = makeSymbol("?NART");

    static private final SubLList $list_alt604 = list(list(constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("?NART"), makeSymbol("?STRING")), list(constant_handles.reader_make_constant_shell(makeString("natFunction")), makeSymbol("?NART"), constant_handles.reader_make_constant_shell(makeString("PronounFn"))), list(constant_handles.reader_make_constant_shell(makeString("natArgument")), makeSymbol("?NART"), THREE_INTEGER, makeSymbol("?GENDER")), list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?GENDER"), constant_handles.reader_make_constant_shell(makeString("Feminine-NLAttr"))), list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?GENDER"), constant_handles.reader_make_constant_shell(makeString("Masculine-NLAttr")))));

    public static final SubLObject $$hypothesizedGendersConflict = constant_handles.reader_make_constant_shell(makeString("hypothesizedGendersConflict"));

    public static final SubLObject $$MaleHuman = constant_handles.reader_make_constant_shell(makeString("MaleHuman"));

    public static final SubLObject $$FemaleHuman = constant_handles.reader_make_constant_shell(makeString("FemaleHuman"));

    static private final SubLString $str_alt608$term_strings_disagree_about_gende = makeString("term strings disagree about gender");

    public static final SubLObject $$Feminine_NLAttr = constant_handles.reader_make_constant_shell(makeString("Feminine-NLAttr"));

    static private final SubLString $$$gender_determined = makeString("gender determined");

    public static final SubLObject $$Masculine_NLAttr = constant_handles.reader_make_constant_shell(makeString("Masculine-NLAttr"));

    static private final SubLSymbol $sym612$_NAME = makeSymbol("?NAME");

    public static final SubLObject $$preferredNameString = constant_handles.reader_make_constant_shell(makeString("preferredNameString"));

    static private final SubLList $list_alt614 = list(makeSymbol("?NAME"));

    static private final SubLSymbol $sym615$_TITLE = makeSymbol("?TITLE");

    static private final SubLList $list_alt616 = list(list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TITLE"), constant_handles.reader_make_constant_shell(makeString("PersonTypeByPositionInOrg"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TITLE"), constant_handles.reader_make_constant_shell(makeString("PersonTypeByOccupation")))));

    static private final SubLString $str_alt617$name_extent_known_is__S__ = makeString("name extent known is ~S~%");

    static private final SubLString $str_alt618$via_name_title = makeString("via name&title");

    static private final SubLString $$$title_established = makeString("title established");

    static private final SubLList $list_alt620 = list(makeSymbol("PRED"), makeSymbol("STRING"));

    static private final SubLString $$$titlist_relationship_determined = makeString("titlist relationship determined");

    static private final SubLList $list_alt622 = list(makeSymbol("?PRED"), makeSymbol("?STRING"));

    static private final SubLList $list_alt623 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?PRED"), constant_handles.reader_make_constant_shell(makeString("nameString")));

    static private final SubLString $str_alt624$__A = makeString(" ~A");

    static private final SubLString $str_alt625$_A_A = makeString("~A~A");

    static private final SubLSymbol $sym626$_GIVEN = makeSymbol("?GIVEN");

    public static final SubLObject $$familyName = constant_handles.reader_make_constant_shell(makeString("familyName"));

    public static final SubLObject $$givenNames = constant_handles.reader_make_constant_shell(makeString("givenNames"));

    // // Initializers
    public void declareFunctions() {
        declare_bbn_strengthening_file();
    }

    public void initializeVariables() {
        init_bbn_strengthening_file();
    }

    public void runTopLevelForms() {
        setup_bbn_strengthening_file();
    }
}

