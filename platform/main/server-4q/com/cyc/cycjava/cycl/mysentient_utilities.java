/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-UTILITIES
 *  source file: /cyc/top/cycl/mysentient-utilities.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class mysentient_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_utilities() {
    }

    public static final SubLFile me = new mysentient_utilities();


    // // Definitions
    // deflexical
    private static final SubLSymbol $mysentient_reformulator_memoization$ = makeSymbol("*MYSENTIENT-REFORMULATOR-MEMOIZATION*");

    /**
     * Execute BODY using a global MySentient memoization state, creating it if reqiored.  The reformulator memoization will not be cleared.
     */
    public static final SubLObject with_mysentient_reformulator_memoization(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_REFORMULATOR_MEMOIZATION_STATE, $list_alt1, append(body, NIL));
        }
    }

    public static final SubLObject find_or_create_mysentient_reformulator_memoization() {
        return NIL != memoization_state.memoization_state_p($mysentient_reformulator_memoization$.getGlobalValue()) ? ((SubLObject) (values($mysentient_reformulator_memoization$.getGlobalValue(), $REUSED))) : values(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $NEW);
    }

    /**
     * By default, we dont do any logging unless they tell us to.
     */
    // defparameter
    public static final SubLSymbol $mysentient_logging_is_enabledP$ = makeSymbol("*MYSENTIENT-LOGGING-IS-ENABLED?*");

    /**
     * Logging records are accumulated here.
     */
    // defparameter
    public static final SubLSymbol $mysentient_log_records$ = makeSymbol("*MYSENTIENT-LOG-RECORDS*");

    /**
     * Enables MySentient logging from the top-level call.
     */
    public static final SubLObject with_mysentient_logging(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject log_records = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    log_records = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(CLET, $list_alt11, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, log_records, $list_alt13), $list_alt14));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt8);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject is_mysentient_logging_enabledP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($mysentient_logging_is_enabledP$.getDynamicValue(thread));
        }
    }

    public static final SubLObject myselog_info(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($INFO, message, get_universal_time());
    }

    public static final SubLObject myselog_debug(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($DEBUG, message, get_universal_time());
    }

    public static final SubLObject myselog_error(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($ERROR, message, get_universal_time());
    }

    public static final SubLObject myselog_fine(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($FINE, message, get_universal_time());
    }

    public static final SubLObject myselog_finer(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($FINER, message, get_universal_time());
    }

    public static final SubLObject myselog_finest(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($FINEST, message, get_universal_time());
    }

    public static final SubLObject myselog_warn(SubLObject message) {
        SubLTrampolineFile.checkType(message, STRINGP);
        return myselog_append($WARN, message, get_universal_time());
    }

    public static final SubLObject myselog_format_info(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_INFO, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject myselog_format_debug(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_DEBUG, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject myselog_format_error(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_ERROR, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject myselog_format_fine(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_FINE, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject myselog_format_finer(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_FINER, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject myselog_format_finest(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_FINEST, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject myselog_format_warn(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message_format = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            message_format = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(MYSELOG_WARN, listS(FORMAT_NIL, message_format, append(args, NIL)));
            }
        }
    }

    public static final SubLObject get_myselog_log_records() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $mysentient_logging_is_enabledP$.getDynamicValue(thread)) {
                return nreverse($mysentient_log_records$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject myselog_append(SubLObject category, SubLObject message, SubLObject timestamp) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(category, SYMBOLP);
            SubLTrampolineFile.checkType(message, STRINGP);
            SubLTrampolineFile.checkType(timestamp, NUMBERP);
            if (NIL != $mysentient_logging_is_enabledP$.getDynamicValue(thread)) {
                {
                    SubLObject record = myselog_construct_event_record(category, message, timestamp);
                    $mysentient_log_records$.setDynamicValue(cons(record, $mysentient_log_records$.getDynamicValue(thread)), thread);
                }
                return category;
            }
            return NIL;
        }
    }

    public static final SubLObject myselog_construct_event_record(SubLObject category, SubLObject message, SubLObject timestamp) {
        return list(category, message, convert_myselog_timestamp(timestamp));
    }

    // deflexical
    private static final SubLSymbol $apache_log4j_timestamp_epoque$ = makeSymbol("*APACHE-LOG4J-TIMESTAMP-EPOQUE*");

    public static final SubLObject convert_myselog_timestamp(SubLObject timestamp) {
        return subtract(timestamp, $apache_log4j_timestamp_epoque$.getGlobalValue());
    }

    public static final SubLObject myse_assert_now(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject successP = rkf_assertion_utilities.rkf_assert_now(formula, mt);
                SubLObject failure_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                myselog_fine(cconcatenate($str_alt37$Asserted_, new SubLObject[]{ format_nil.format_nil_a_no_copy(formula), $str_alt38$_in_, format_nil.format_nil_a_no_copy(mt), $str_alt39$___Result__, format_nil.format_nil_a_no_copy(successP) }));
                return values(successP, failure_reason);
            }
        }
    }

    public static final SubLObject myse_assert_wff_now(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject successP = rkf_assertion_utilities.rkf_assert_wff_now(formula, mt);
                SubLObject failure_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                myselog_fine(cconcatenate($str_alt40$Asserted__wff__, new SubLObject[]{ format_nil.format_nil_a_no_copy(formula), $str_alt38$_in_, format_nil.format_nil_a_no_copy(mt), $str_alt39$___Result__, format_nil.format_nil_a_no_copy(successP) }));
                return values(successP, failure_reason);
            }
        }
    }

    public static final SubLObject myse_assert_with_implicature_now(SubLObject formula, SubLObject mt, SubLObject now) {
        if (now == UNPROVIDED) {
            now = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(formula, mt, now);
                SubLObject failure_reason = thread.secondMultipleValue();
                SubLObject additions = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                myselog_fine(cconcatenate($str_alt41$Asserted__with_implicature__, new SubLObject[]{ format_nil.format_nil_a_no_copy(formula), $str_alt38$_in_, format_nil.format_nil_a_no_copy(mt), $str_alt42$___Successful___, format_nil.format_nil_a_no_copy(successP) }));
                if (NIL != successP) {
                    myselog_fine(cconcatenate($str_alt43$Also_added__, format_nil.format_nil_s_no_copy(additions)));
                } else {
                    myselog_fine(cconcatenate($str_alt44$Failure_reason__, format_nil.format_nil_s_no_copy(failure_reason)));
                }
                return successP;
            }
        }
    }

    public static final SubLObject myse_unassert(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = rkf_assertion_utilities.rkf_unassert(formula, mt);
            myselog_fine(cconcatenate($str_alt45$Unasserted_, new SubLObject[]{ format_nil.format_nil_a_no_copy(formula), $str_alt38$_in_, format_nil.format_nil_a_no_copy(mt), $str_alt46$_ }));
            return result;
        }
    }

    /**
     * By default, we don't track new constants.
     */
    // defparameter
    private static final SubLSymbol $mysentient_track_new_constantsP$ = makeSymbol("*MYSENTIENT-TRACK-NEW-CONSTANTS?*");

    /**
     * A list of newly-created constants is accumulated here.
     */
    // defparameter
    private static final SubLSymbol $mysentient_new_constants$ = makeSymbol("*MYSENTIENT-NEW-CONSTANTS*");

    /**
     * Enables MySentient tracking of CycL constant creation from the top-level call.
     */
    public static final SubLObject with_mysentient_tracking_of_new_constants(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject new_constants = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    new_constants = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt48, append(body, list(listS(CSETQ, new_constants, $list_alt49))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt47);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject myse_create(SubLObject preferred_phrase, SubLObject mt, SubLObject prefix, SubLObject suffix) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (prefix == UNPROVIDED) {
            prefix = $str_alt52$MyS_;
        }
        if (suffix == UNPROVIDED) {
            suffix = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == prefix) {
                prefix = $str_alt53$;
            }
            {
                SubLObject new_constant = rkf_term_utilities.rkf_create(preferred_phrase, mt, prefix, suffix, UNPROVIDED);
                myselog_fine(cconcatenate($str_alt54$Created_, new SubLObject[]{ format_nil.format_nil_s_no_copy(new_constant), $str_alt46$_ }));
                if (NIL != $mysentient_track_new_constantsP$.getDynamicValue(thread)) {
                    $mysentient_new_constants$.setDynamicValue(cons(new_constant, $mysentient_new_constants$.getDynamicValue(thread)), thread);
                }
                return new_constant;
            }
        }
    }

    /**
     * Just like @xref QUERY-VARIABLE but with MySe logging.
     */
    public static final SubLObject myse_query_variable(SubLObject variable_token, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            myselog_fine(cconcatenate($str_alt55$About_to_query_, new SubLObject[]{ format_nil.format_nil_s_no_copy(sentence), $str_alt38$_in_, format_nil.format_nil_s_no_copy(mt), $str_alt56$_with_properties_, format_nil.format_nil_s_no_copy(query_properties) }));
            thread.resetMultipleValues();
            {
                SubLObject results = ask_utilities.query_variable(variable_token, sentence, mt, query_properties);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                myselog_fine(cconcatenate($str_alt57$For_variable_, new SubLObject[]{ format_nil.format_nil_s_no_copy(variable_token), $str_alt58$__got_bindings_, format_nil.format_nil_s_no_copy(results), $str_alt59$_and_halt_reason_, format_nil.format_nil_s_no_copy(halt_reason) }));
                return values(results, halt_reason);
            }
        }
    }

    /**
     * Just like @xref QUERY-TEMPLATE but with MySe logging.
     */
    public static final SubLObject myse_query_template(SubLObject template, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            myselog_fine(cconcatenate($str_alt55$About_to_query_, new SubLObject[]{ format_nil.format_nil_s_no_copy(sentence), $str_alt38$_in_, format_nil.format_nil_s_no_copy(mt), $str_alt56$_with_properties_, format_nil.format_nil_s_no_copy(query_properties) }));
            thread.resetMultipleValues();
            {
                SubLObject results = ask_utilities.query_template(template, sentence, mt, query_properties);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                myselog_fine(cconcatenate($str_alt60$For_template_, new SubLObject[]{ format_nil.format_nil_s_no_copy(template), $str_alt61$__got_query_results_, format_nil.format_nil_s_no_copy(results), $str_alt59$_and_halt_reason_, format_nil.format_nil_s_no_copy(halt_reason) }));
                return values(results, halt_reason);
            }
        }
    }

    /**
     * Just like @xref CONTINUE-INFERENCE but with MySe logging.
     */
    public static final SubLObject myse_continue_inference(SubLObject inference, SubLObject query_dynamic_properties) {
        if (query_dynamic_properties == UNPROVIDED) {
            query_dynamic_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            myselog_info(cconcatenate($str_alt62$Dynamic_properties__, format_nil.format_nil_a_no_copy(query_dynamic_properties)));
            myselog_info(cconcatenate($str_alt63$Prepared_Inference__, format_nil.format_nil_a_no_copy(inference)));
            thread.resetMultipleValues();
            {
                SubLObject result = inference_kernel.continue_inference(inference, query_dynamic_properties);
                SubLObject halt_reason = thread.secondMultipleValue();
                SubLObject return_inference = thread.thirdMultipleValue();
                SubLObject metrics = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                myselog_info(cconcatenate($str_alt64$Inference_result__, format_nil.format_nil_s_no_copy(result)));
                myselog_info(cconcatenate($str_alt65$Halt_reason__, format_nil.format_nil_s_no_copy(halt_reason)));
                myselog_info(cconcatenate($str_alt66$Return_inference__, format_nil.format_nil_s_no_copy(return_inference)));
                myselog_info(cconcatenate($str_alt67$Metrics__, format_nil.format_nil_s_no_copy(metrics)));
                return values(result, halt_reason, return_inference, metrics);
            }
        }
    }

    /**
     * Indexical for the utterance peg in query specifications.
     */
    // deflexical
    public static final SubLSymbol $mysentient_utterance_peg_indexical$ = makeSymbol("*MYSENTIENT-UTTERANCE-PEG-INDEXICAL*");

    public static final SubLObject mysentient_query_sentence_from_query_spec_and_utterance_peg(SubLObject query_spec, SubLObject utterance_peg) {
        {
            SubLObject sentence = kb_query.kbq_sentence(query_spec);
            return mysentient_query_sentence_from_indexical_query_sentence_and_utterance_peg(sentence, utterance_peg);
        }
    }

    public static final SubLObject mysentient_query_sentence_from_indexical_query_sentence_and_utterance_peg(SubLObject indexical_query_sentence, SubLObject utterance_peg) {
        {
            SubLObject peg_expression = info_transfer_event_for_peg(utterance_peg);
            return cycl_utilities.expression_subst(peg_expression, $mysentient_utterance_peg_indexical$.getGlobalValue(), indexical_query_sentence, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject info_transfer_event_for_peg(SubLObject peg) {
        return el_utilities.make_unary_formula($$InfoTransferEventForPegFn, peg);
    }

    public static final SubLObject mysentient_query_properties_for_query_spec(SubLObject query_spec) {
        return inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec));
    }



    /**
     * NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P; What is the worst paraphase quality we should
     * tolerate before returning NIL instead of a string.
     */
    // deflexical
    public static final SubLSymbol $mysentient_pph_demerit_cutoff$ = makeSymbol("*MYSENTIENT-PPH-DEMERIT-CUTOFF*");

    /**
     * Execute BODY treating any paraphrase calls as appropriate for MySentient.
     */
    public static final SubLObject within_mysentient_paraphrase_context(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_MYSENTIENT_PARAPHRASE_PROBLEM_REPORTING, bq_cons(WITH_MYSENTIENT_PARAPHRASE_PARAMETERS, append(body, NIL)));
        }
    }

    /**
     * Execute BODY reporting any paraphrase problems as desired for MySentient purposes.
     */
    public static final SubLObject with_mysentient_paraphrase_problem_reporting(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject problem_dictionary = $sym75$PROBLEM_DICTIONARY;
            return listS(GATHERING_PPH_PROBLEMS, list(problem_dictionary), append(body, list(list(REPORT_MYSENTIENT_PARAPHRASE_PROBLEMS, problem_dictionary))));
        }
    }

    public static final SubLObject report_mysentient_paraphrase_problems(SubLObject problem_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == dictionary.dictionary_empty_p(problem_dictionary)) {
                myselog_warn($str_alt78$Found_paraphrase_problems_with_ju);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(problem_dictionary));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject reporter = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject pph_problems = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = pph_problems;
                                SubLObject pph_problem = NIL;
                                for (pph_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pph_problem = cdolist_list_var.first()) {
                                    myselog_warn(pph_phrase.pph_problem_string(reporter, pph_problem));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
            return problem_dictionary;
        }
    }

    /**
     * Execute BODY setting paraphrase parameters as desired for MySentient purposes.
     */
    public static final SubLObject with_mysentient_paraphrase_parameters(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_PPH_DEMERIT_CUTOFF, $list_alt80, list(OMITTING_PPH_SELECT_STRING_METHODS, $mysentient_select_string_methods_to_omit$, listS(CLET, $list_alt83, append(body, NIL))));
        }
    }

    /**
     *
     *
     * @param RESULTS;
     * 		A list of return values generated by some MySentient function,
     * 		each of which includes some generated NL string.
     * @param KEY;
     * 		A function to apply to each item in RESULTS to get its generated NL string.
     * @return 0; LISTP of items from RESULTS that passed the acceptability filter.
     * @return 1; LISTP of indices into RESULTS indicating the positions of filtered items.
     */
    public static final SubLObject filter_unacceptable_mysentient_nl_strings(SubLObject results, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(results, LISTP);
        SubLTrampolineFile.checkType(key, FUNCTION_SPEC_P);
        {
            SubLObject survivors = NIL;
            SubLObject filtered_indices = NIL;
            SubLObject list_var = NIL;
            SubLObject result = NIL;
            SubLObject i = NIL;
            for (list_var = results, result = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject generated_string = funcall(key, result);
                    if (NIL != mysentient_nl_generation_string_unacceptableP(generated_string)) {
                        filtered_indices = cons(i, filtered_indices);
                        mysentient_warn_about_unacceptable_string_filtering(generated_string, result);
                    } else {
                        survivors = cons(result, survivors);
                    }
                }
            }
            return values(nreverse(survivors), nreverse(filtered_indices));
        }
    }

    public static final SubLObject mysentient_warn_about_unacceptable_string_filtering(SubLObject string, SubLObject filtered_item) {
        myselog_warn(cconcatenate($str_alt86$Unacceptable_NL_string__, new SubLObject[]{ format_nil.format_nil_s_no_copy(string), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt87$_Filtering_, format_nil.format_nil_s_no_copy(filtered_item), $str_alt46$_, format_nil.$format_nil_percent$.getGlobalValue() }));
        return string;
    }

    /**
     * Is STRING a string that we never want to use as generated NL for MySentient?
     */
    public static final SubLObject mysentient_nl_generation_string_unacceptableP(SubLObject string) {
        if (NIL == string_utilities.non_empty_stringP(string)) {
            return T;
        } else
            if (NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }

    }

    // deflexical
    private static final SubLSymbol $mysentient_salient_question_mt$ = makeSymbol("*MYSENTIENT-SALIENT-QUESTION-MT*");

    public static final SubLObject do_mysentient_salient_questions_for_term(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt89);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt89);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt89);
                            if (NIL == member(current_1, $list_alt90, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt89);
                        }
                        {
                            SubLObject query_sentence_tail = property_list_member($QUERY_SENTENCE, current);
                            SubLObject query_sentence = (NIL != query_sentence_tail) ? ((SubLObject) (cadr(query_sentence_tail))) : IGNORE_ME1;
                            SubLObject gloss_tail = property_list_member($GLOSS, current);
                            SubLObject gloss = (NIL != gloss_tail) ? ((SubLObject) (cadr(gloss_tail))) : IGNORE_ME2;
                            SubLObject paraphrase_tail = property_list_member($PARAPHRASE, current);
                            SubLObject paraphrase = (NIL != paraphrase_tail) ? ((SubLObject) (cadr(paraphrase_tail))) : IGNORE_ME3;
                            SubLObject var_choices_pairs_tail = property_list_member($VAR_CHOICES_PAIRS, current);
                            SubLObject var_choices_pairs = (NIL != var_choices_pairs_tail) ? ((SubLObject) (cadr(var_choices_pairs_tail))) : IGNORE_ME4;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject question_spec = $sym100$QUESTION_SPEC;
                                SubLObject question_specs = $sym101$QUESTION_SPECS;
                                SubLObject arg_pos = $sym102$ARG_POS;
                                return list(CLET, list($list_alt103, $list_alt104, list(question_specs, listS(MYSENTIENT_SALIENT_DESCRIPTOR_QUESTIONS_FOR_TERM, v_term, $list_alt106))), list(DO_LIST, list(question_spec, question_specs), list(CDESTRUCTURING_BIND, list(query_sentence, var_choices_pairs), question_spec, listS(CLET, list(list(arg_pos, list(FIRST, list(ARG_POSITIONS_IF_BFS, $list_alt111, query_sentence))), list(gloss, list(FWHEN, arg_pos, list(MAKE_FET_GLOSS_FOR_ARG_POSITION, arg_pos, query_sentence))), list(paraphrase, list(GENERATE_QUESTION, query_sentence))), list(IGNORE, var_choices_pairs, gloss, paraphrase, query_sentence), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject mysentient_print_salient_questions_for_term(SubLObject v_term, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt116$______Term___S, v_term);
            {
                SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.currentBinding(thread);
                SubLObject _prev_bind_1 = rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.bind(ZERO_INTEGER, thread);
                    rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.bind(NIL, thread);
                    {
                        SubLObject question_specs = mysentient_clarification_manager_widgets.mysentient_salient_descriptor_questions_for_term(v_term, $mysentient_salient_question_mt$.getGlobalValue(), $int$999, ONE_INTEGER, $int$1800, NIL);
                        SubLObject cdolist_list_var = question_specs;
                        SubLObject question_spec = NIL;
                        for (question_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , question_spec = cdolist_list_var.first()) {
                            {
                                SubLObject datum = question_spec;
                                SubLObject current = datum;
                                SubLObject query_sentence = NIL;
                                SubLObject ignore_me4 = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt119);
                                query_sentence = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt119);
                                ignore_me4 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject arg_pos = cycl_utilities.arg_positions_if_bfs($sym120$EL_VAR_, query_sentence, UNPROVIDED).first();
                                        SubLObject gloss = (NIL != arg_pos) ? ((SubLObject) (formula_template_utilities.make_fet_gloss_for_arg_position(arg_pos, query_sentence, UNPROVIDED))) : NIL;
                                        SubLObject paraphrase = pph_question.generate_question(query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        format(stream, $str_alt121$____Question_CycL____S, query_sentence);
                                        if (gloss.isString()) {
                                            format(stream, $str_alt122$____Question_gloss____S, gloss);
                                        }
                                        format(stream, $str_alt123$____Question_paraphrase____S, paraphrase);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt119);
                                }
                            }
                        }
                    }
                } finally {
                    rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.rebind(_prev_bind_1, thread);
                    rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject mysentient_salient_questions_for_term(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                ans = cons(v_term, ans);
                {
                    SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.bind(ZERO_INTEGER, thread);
                        rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.bind(NIL, thread);
                        {
                            SubLObject question_specs = mysentient_clarification_manager_widgets.mysentient_salient_descriptor_questions_for_term(v_term, $mysentient_salient_question_mt$.getGlobalValue(), $int$999, ONE_INTEGER, $int$1800, NIL);
                            SubLObject cdolist_list_var = question_specs;
                            SubLObject question_spec = NIL;
                            for (question_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , question_spec = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = question_spec;
                                    SubLObject current = datum;
                                    SubLObject query_sentence = NIL;
                                    SubLObject ignore_me4 = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt119);
                                    query_sentence = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt119);
                                    ignore_me4 = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject arg_pos = cycl_utilities.arg_positions_if_bfs($sym120$EL_VAR_, query_sentence, UNPROVIDED).first();
                                            SubLObject gloss = (NIL != arg_pos) ? ((SubLObject) (formula_template_utilities.make_fet_gloss_for_arg_position(arg_pos, query_sentence, UNPROVIDED))) : NIL;
                                            SubLObject paraphrase = pph_question.generate_question(query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            ans = cons(list(query_sentence, gloss, paraphrase), ans);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt119);
                                    }
                                }
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_exclude_known_promptsP$.rebind(_prev_bind_1, thread);
                        rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    public static final SubLObject valid_mysentient_salient_paraphrased_question_p(SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != pattern_match.tree_matches_pattern(v_object, $list_alt125)));
    }

    /**
     *
     *
     * @return STRINGP; An NL summary of TERM.
     */
    public static final SubLObject myse_summary_sentence(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            {
                SubLObject summary_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(v_term, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p($mysentient_pph_demerit_cutoff$.getGlobalValue())))) {
                            {
                                SubLObject new_format_string = cconcatenate($str_alt128$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt129$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy($mysentient_pph_demerit_cutoff$.getGlobalValue()), new SubLObject[]{ $str_alt130$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                                pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                            }
                        }
                        {
                            SubLObject _prev_bind_0_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                            SubLObject _prev_bind_1 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                            SubLObject _prev_bind_2 = pph_vars.$pph_coerce_definite_descriptions_for_unlexified_termsP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_demerit_cutoff$.bind($mysentient_pph_demerit_cutoff$.getGlobalValue(), thread);
                                pph_vars.$select_string_methods_to_omit$.bind($mysentient_select_string_methods_to_omit$.getGlobalValue(), thread);
                                pph_vars.$pph_coerce_definite_descriptions_for_unlexified_termsP$.bind(T, thread);
                                if (NIL != summary_sentences) {
                                    ans = pph_document.pph_summarize_term(v_term, summary_sentences, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                pph_vars.$pph_coerce_definite_descriptions_for_unlexified_termsP$.rebind(_prev_bind_2, thread);
                                pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_1, thread);
                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }



    public static final SubLObject clear_myse_strategy_default_confidence() {
        {
            SubLObject cs = $myse_strategy_default_confidence_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_myse_strategy_default_confidence(SubLObject strategy, SubLObject session_mt, SubLObject default_confidence) {
        return memoization_state.caching_state_remove_function_results_with_args($myse_strategy_default_confidence_caching_state$.getGlobalValue(), list(strategy, session_mt, default_confidence), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject myse_strategy_default_confidence_internal(SubLObject strategy, SubLObject session_mt, SubLObject default_confidence) {
        {
            SubLObject asserted_default_confidence = ask_utilities.query_variable($sym133$_CONFIDENCE, listS($$calculatedStrategyConfidence, strategy, $list_alt135), session_mt, $list_alt136).first();
            return NIL != asserted_default_confidence ? ((SubLObject) (asserted_default_confidence)) : default_confidence;
        }
    }

    public static final SubLObject myse_strategy_default_confidence(SubLObject strategy, SubLObject session_mt, SubLObject default_confidence) {
        {
            SubLObject caching_state = $myse_strategy_default_confidence_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MYSE_STRATEGY_DEFAULT_CONFIDENCE, $myse_strategy_default_confidence_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(strategy, session_mt, default_confidence);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw138$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (strategy.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (session_mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && default_confidence.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(myse_strategy_default_confidence_internal(strategy, session_mt, default_confidence)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(strategy, session_mt, default_confidence));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Mt from which to perform the MySentient user profile related asks.
     */
    // deflexical
    public static final SubLSymbol $mysentient_user_profile_information_mt$ = makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*");

    public static final SubLObject mysentient_load_master_version_information(SubLObject master_version_file) {
        if (NIL == Filesys.probe_file(master_version_file)) {
            Errors.error($str_alt140$Invalid_master_version_file__A_, master_version_file);
        }
        {
            SubLObject version_information = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(master_version_file, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt142$Unable_to_open__S, master_version_file);
                }
                {
                    SubLObject infile = stream;
                    if (infile.isStream()) {
                        {
                            SubLObject line = NIL;
                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                if (length(line).isPositive() && (NIL != alphanumericp(Strings.sublisp_char(line, ZERO_INTEGER)))) {
                                    {
                                        SubLObject pieces = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject component_name = pieces.first();
                                        SubLObject version_tag = string_utilities.string_tokenize(second(pieces), $list_alt143, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        version_information = putf(version_information, make_keyword(component_name), Mapping.mapcar(PARSE_INTEGER, version_tag));
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return version_information;
        }
    }

    // deflexical
    private static final SubLSymbol $mysentient_master_version_information$ = makeSymbol("*MYSENTIENT-MASTER-VERSION-INFORMATION*");

    public static final SubLObject get_mysentient_master_version_information() {
        return $mysentient_master_version_information$.getGlobalValue();
    }

    public static final SubLObject initialize_mysentient_master_version_information(SubLObject filename) {
        $mysentient_master_version_information$.setGlobalValue(mysentient_load_master_version_information(filename));
        return get_mysentient_master_version_information();
    }

    public static final SubLObject mysentient_is_version_supportedP(SubLObject component, SubLObject version_tag) {
        SubLTrampolineFile.checkType(component, KEYWORDP);
        SubLTrampolineFile.checkType(version_tag, LISTP);
        {
            SubLObject version_information = get_mysentient_master_version_information();
            SubLObject server_version_tag = getf(version_information, component, UNPROVIDED);
            if (NIL == version_information) {
                return values($UNAVAILABLE, $str_alt148$Master_version_information_not_in);
            } else
                if (NIL == server_version_tag) {
                    return values($NOT_SUPPORTED, $$$Unknown_component);
                } else
                    if (NIL != mysentient_version_tagL(version_tag, server_version_tag)) {
                        return values($NOT_SUPPORTED, $$$Outdated_version);
                    } else
                        if (NIL != mysentient_version_tagL(server_version_tag, version_tag)) {
                            return values($SUPPORTED, $str_alt153$Newer_than_server_version_);
                        } else {
                            return values($SUPPORTED, $$$Exact_version_match);
                        }



        }
    }

    public static final SubLObject mysentient_are_versions_supportedP(SubLObject component_version_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(component_version_list, LISTP);
            {
                SubLObject evaluation = NIL;
                SubLObject decidedP = NIL;
                SubLObject decision = NIL;
                if (NIL == decidedP) {
                    {
                        SubLObject csome_list_var = component_version_list;
                        SubLObject component_version_tuple = NIL;
                        for (component_version_tuple = csome_list_var.first(); !((NIL != decidedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , component_version_tuple = csome_list_var.first()) {
                            {
                                SubLObject datum = component_version_tuple;
                                SubLObject current = datum;
                                SubLObject component = NIL;
                                SubLObject version_tag = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt156);
                                component = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt156);
                                version_tag = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject supported = mysentient_is_version_supportedP(component, version_tag);
                                        SubLObject message = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        evaluation = cons(list(component, supported, message), evaluation);
                                        {
                                            SubLObject pcase_var = supported;
                                            if (pcase_var.eql($UNAVAILABLE)) {
                                                decidedP = T;
                                                decision = $UNAVAILABLE;
                                            } else
                                                if (pcase_var.eql($NOT_SUPPORTED)) {
                                                    decidedP = T;
                                                    decision = $NOT_SUPPORTED;
                                                } else
                                                    if (pcase_var.eql($SUPPORTED)) {
                                                        decidedP = NIL;
                                                        decision = $SUPPORTED;
                                                    }


                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt156);
                                }
                            }
                        }
                    }
                }
                return values(decision, evaluation);
            }
        }
    }

    public static final SubLObject mysentient_version_tagL(SubLObject version_tag_a, SubLObject version_tag_b) {
        {
            SubLObject decidedP = NIL;
            SubLObject decision = NIL;
            if (NIL == decidedP) {
                {
                    SubLObject tag_a = NIL;
                    SubLObject tag_a_3 = NIL;
                    SubLObject tag_b = NIL;
                    SubLObject tag_b_4 = NIL;
                    for (tag_a = version_tag_a, tag_a_3 = tag_a.first(), tag_b = version_tag_b, tag_b_4 = tag_b.first(); !((NIL != decidedP) || ((NIL == tag_b) && (NIL == tag_a))); tag_a = tag_a.rest() , tag_a_3 = tag_a.first() , tag_b = tag_b.rest() , tag_b_4 = tag_b.first()) {
                        if (NIL == tag_a_3) {
                            tag_a_3 = ZERO_INTEGER;
                        } else {
                            SubLTrampolineFile.checkType(tag_a_3, FIXNUMP);
                        }
                        if (NIL == tag_b_4) {
                            tag_b_4 = ZERO_INTEGER;
                        } else {
                            SubLTrampolineFile.checkType(tag_b_4, FIXNUMP);
                        }
                        if (tag_a_3.numG(tag_b_4)) {
                            decidedP = T;
                            decision = NIL;
                        } else
                            if (tag_a_3.numL(tag_b_4)) {
                                decidedP = T;
                                decision = T;
                            } else
                                if (tag_a_3.numE(tag_b_4)) {
                                } else {
                                    Errors.error($str_alt158$Invalid_state_transition_in_MYSEN);
                                }


                    }
                }
            }
            return decision;
        }
    }

    public static final SubLObject mysentient_adjust_assertion_directions() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $const161$assertionDirectionForProjectBuild;
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_5 = NIL;
                                                            SubLObject token_var_6 = NIL;
                                                            while (NIL == done_var_5) {
                                                                {
                                                                    SubLObject direction_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != direction_assertion);
                                                                    if (NIL != valid_7) {
                                                                        {
                                                                            SubLObject assertion = assertions_high.gaf_arg1(direction_assertion);
                                                                            SubLObject direction = assertions_high.gaf_arg2(direction_assertion);
                                                                            SubLObject project = assertions_high.gaf_arg3(direction_assertion);
                                                                            SubLObject fi_direction = NIL;
                                                                            if (project == $$MySentientProject) {
                                                                                {
                                                                                    SubLObject pcase_var = direction;
                                                                                    if (pcase_var.eql($$Code_AssertionDirection)) {
                                                                                        fi_direction = $CODE;
                                                                                    } else
                                                                                        if (pcase_var.eql($$Backward_AssertionDirection)) {
                                                                                            fi_direction = $BACKWARD;
                                                                                        } else
                                                                                            if (pcase_var.eql($$Forward_AssertionDirection)) {
                                                                                                fi_direction = $FORWARD;
                                                                                            }


                                                                                }
                                                                                ke.ke_change_assertion_direction(assertion, fi_direction);
                                                                                count = add(count, ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject genls_hierarchy(SubLObject v_term, SubLObject reify_when_closed_nautP) {
        if (reify_when_closed_nautP == UNPROVIDED) {
            reify_when_closed_nautP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            v_term = (NIL != reify_when_closed_nautP) ? ((SubLObject) (cycl_utilities.reify_when_closed_naut(v_term))) : cycl_utilities.find_when_closed_naut(v_term);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == fort_types_interface.collectionP(v_term)) {
                    Errors.error($str_alt171$_A_must_be_a_collection, v_term);
                }
            }
            return genls_hierarchy_int(v_term, NIL);
        }
    }

    public static final SubLObject genls_hierarchy_int(SubLObject v_term, SubLObject used_terms) {
        if (v_term == $$Thing) {
            return list($$Thing);
        } else {
            {
                SubLObject sub_hierarchies = NIL;
                SubLObject cdolist_list_var = genls.genls(v_term, UNPROVIDED, UNPROVIDED);
                SubLObject genl = NIL;
                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                    if (NIL == list_utilities.member_eqP(genl, used_terms)) {
                        sub_hierarchies = cons(genls_hierarchy_int(genl, cons(v_term, used_terms)), sub_hierarchies);
                    }
                }
                return nconc(list(v_term), sub_hierarchies);
            }
        }
    }

    /**
     *
     *
     * @return NIL or stringp; non-NIL iff we found some problem generating
    SD questions for TERM. Return value describes the problem.
     */
    public static final SubLObject validate_mysentient_salient_questions_for_term(SubLObject v_term) {
        {
            SubLObject results = mysentient_salient_questions_for_term(v_term);
            SubLObject problem = validate_mysentient_salient_questions(results, v_term);
            return problem;
        }
    }

    /**
     *
     *
     * @param RESULTS
     * 		listp; SD questions for TERM.
     * @return NIL or stringp; non-NIL iff we found some problem in RESULTS.
    Return value describes the problem.
     */
    public static final SubLObject validate_mysentient_salient_questions(SubLObject results, SubLObject v_term) {
        {
            SubLObject problem = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject datum = results;
                                SubLObject current = datum;
                                SubLObject the_term = NIL;
                                SubLObject paraphrased_questions = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt174);
                                the_term = current.first();
                                current = current.rest();
                                paraphrased_questions = current;
                                if (!v_term.equal(the_term)) {
                                    problem = cconcatenate(format_nil.format_nil_s_no_copy(v_term), new SubLObject[]{ $str_alt175$_not_first_item_on, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt176$_, format_nil.format_nil_s_no_copy(paraphrased_questions), format_nil.$format_nil_percent$.getGlobalValue() });
                                } else
                                    if (!paraphrased_questions.isList()) {
                                        problem = cconcatenate($str_alt177$Got_non_list_, new SubLObject[]{ format_nil.format_nil_s_no_copy(paraphrased_questions), $str_alt178$_for_, format_nil.format_nil_s_no_copy(v_term) });
                                    } else
                                        if (NIL == paraphrased_questions) {
                                            problem = cconcatenate($str_alt179$Got_no_question_for_, format_nil.format_nil_s_no_copy(v_term));
                                        } else {
                                            if (NIL == problem) {
                                                {
                                                    SubLObject csome_list_var = paraphrased_questions;
                                                    SubLObject paraphrased_question = NIL;
                                                    for (paraphrased_question = csome_list_var.first(); !((NIL != problem) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , paraphrased_question = csome_list_var.first()) {
                                                        if (NIL == valid_mysentient_salient_paraphrased_question_p(paraphrased_question)) {
                                                            problem = cconcatenate($$$Got_bad_question_spec, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $str_alt176$_, format_nil.format_nil_s_no_copy(paraphrased_question), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt178$_for_, format_nil.format_nil_s_no_copy(v_term) });
                                                        }
                                                    }
                                                }
                                            }
                                        }


                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                problem = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            return problem;
        }
    }

    public static final SubLObject subloop_reserved_initialize_question_validation_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_question_validation_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject question_validation_test_case_p(SubLObject question_validation_test_case) {
        return classes.subloop_instanceof_class(question_validation_test_case, QUESTION_VALIDATION_TEST_CASE);
    }

    public static final SubLObject declare_mysentient_utilities_file() {
        declareMacro("with_mysentient_reformulator_memoization", "WITH-MYSENTIENT-REFORMULATOR-MEMOIZATION");
        declareFunction("find_or_create_mysentient_reformulator_memoization", "FIND-OR-CREATE-MYSENTIENT-REFORMULATOR-MEMOIZATION", 0, 0, false);
        declareMacro("with_mysentient_logging", "WITH-MYSENTIENT-LOGGING");
        declareFunction("is_mysentient_logging_enabledP", "IS-MYSENTIENT-LOGGING-ENABLED?", 0, 0, false);
        declareFunction("myselog_info", "MYSELOG-INFO", 1, 0, false);
        declareFunction("myselog_debug", "MYSELOG-DEBUG", 1, 0, false);
        declareFunction("myselog_error", "MYSELOG-ERROR", 1, 0, false);
        declareFunction("myselog_fine", "MYSELOG-FINE", 1, 0, false);
        declareFunction("myselog_finer", "MYSELOG-FINER", 1, 0, false);
        declareFunction("myselog_finest", "MYSELOG-FINEST", 1, 0, false);
        declareFunction("myselog_warn", "MYSELOG-WARN", 1, 0, false);
        declareMacro("myselog_format_info", "MYSELOG-FORMAT-INFO");
        declareMacro("myselog_format_debug", "MYSELOG-FORMAT-DEBUG");
        declareMacro("myselog_format_error", "MYSELOG-FORMAT-ERROR");
        declareMacro("myselog_format_fine", "MYSELOG-FORMAT-FINE");
        declareMacro("myselog_format_finer", "MYSELOG-FORMAT-FINER");
        declareMacro("myselog_format_finest", "MYSELOG-FORMAT-FINEST");
        declareMacro("myselog_format_warn", "MYSELOG-FORMAT-WARN");
        declareFunction("get_myselog_log_records", "GET-MYSELOG-LOG-RECORDS", 0, 0, false);
        declareFunction("myselog_append", "MYSELOG-APPEND", 3, 0, false);
        declareFunction("myselog_construct_event_record", "MYSELOG-CONSTRUCT-EVENT-RECORD", 3, 0, false);
        declareFunction("convert_myselog_timestamp", "CONVERT-MYSELOG-TIMESTAMP", 1, 0, false);
        declareFunction("myse_assert_now", "MYSE-ASSERT-NOW", 1, 1, false);
        declareFunction("myse_assert_wff_now", "MYSE-ASSERT-WFF-NOW", 1, 1, false);
        declareFunction("myse_assert_with_implicature_now", "MYSE-ASSERT-WITH-IMPLICATURE-NOW", 2, 1, false);
        declareFunction("myse_unassert", "MYSE-UNASSERT", 1, 1, false);
        declareMacro("with_mysentient_tracking_of_new_constants", "WITH-MYSENTIENT-TRACKING-OF-NEW-CONSTANTS");
        declareFunction("myse_create", "MYSE-CREATE", 1, 3, false);
        declareFunction("myse_query_variable", "MYSE-QUERY-VARIABLE", 2, 2, false);
        declareFunction("myse_query_template", "MYSE-QUERY-TEMPLATE", 2, 2, false);
        declareFunction("myse_continue_inference", "MYSE-CONTINUE-INFERENCE", 1, 1, false);
        declareFunction("mysentient_query_sentence_from_query_spec_and_utterance_peg", "MYSENTIENT-QUERY-SENTENCE-FROM-QUERY-SPEC-AND-UTTERANCE-PEG", 2, 0, false);
        declareFunction("mysentient_query_sentence_from_indexical_query_sentence_and_utterance_peg", "MYSENTIENT-QUERY-SENTENCE-FROM-INDEXICAL-QUERY-SENTENCE-AND-UTTERANCE-PEG", 2, 0, false);
        declareFunction("info_transfer_event_for_peg", "INFO-TRANSFER-EVENT-FOR-PEG", 1, 0, false);
        declareFunction("mysentient_query_properties_for_query_spec", "MYSENTIENT-QUERY-PROPERTIES-FOR-QUERY-SPEC", 1, 0, false);
        declareMacro("within_mysentient_paraphrase_context", "WITHIN-MYSENTIENT-PARAPHRASE-CONTEXT");
        declareMacro("with_mysentient_paraphrase_problem_reporting", "WITH-MYSENTIENT-PARAPHRASE-PROBLEM-REPORTING");
        declareFunction("report_mysentient_paraphrase_problems", "REPORT-MYSENTIENT-PARAPHRASE-PROBLEMS", 1, 0, false);
        declareMacro("with_mysentient_paraphrase_parameters", "WITH-MYSENTIENT-PARAPHRASE-PARAMETERS");
        declareFunction("filter_unacceptable_mysentient_nl_strings", "FILTER-UNACCEPTABLE-MYSENTIENT-NL-STRINGS", 1, 1, false);
        declareFunction("mysentient_warn_about_unacceptable_string_filtering", "MYSENTIENT-WARN-ABOUT-UNACCEPTABLE-STRING-FILTERING", 2, 0, false);
        declareFunction("mysentient_nl_generation_string_unacceptableP", "MYSENTIENT-NL-GENERATION-STRING-UNACCEPTABLE?", 1, 0, false);
        declareMacro("do_mysentient_salient_questions_for_term", "DO-MYSENTIENT-SALIENT-QUESTIONS-FOR-TERM");
        declareFunction("mysentient_print_salient_questions_for_term", "MYSENTIENT-PRINT-SALIENT-QUESTIONS-FOR-TERM", 2, 0, false);
        declareFunction("mysentient_salient_questions_for_term", "MYSENTIENT-SALIENT-QUESTIONS-FOR-TERM", 1, 0, false);
        declareFunction("valid_mysentient_salient_paraphrased_question_p", "VALID-MYSENTIENT-SALIENT-PARAPHRASED-QUESTION-P", 1, 0, false);
        declareFunction("myse_summary_sentence", "MYSE-SUMMARY-SENTENCE", 1, 0, false);
        declareFunction("clear_myse_strategy_default_confidence", "CLEAR-MYSE-STRATEGY-DEFAULT-CONFIDENCE", 0, 0, false);
        declareFunction("remove_myse_strategy_default_confidence", "REMOVE-MYSE-STRATEGY-DEFAULT-CONFIDENCE", 3, 0, false);
        declareFunction("myse_strategy_default_confidence_internal", "MYSE-STRATEGY-DEFAULT-CONFIDENCE-INTERNAL", 3, 0, false);
        declareFunction("myse_strategy_default_confidence", "MYSE-STRATEGY-DEFAULT-CONFIDENCE", 3, 0, false);
        declareFunction("mysentient_load_master_version_information", "MYSENTIENT-LOAD-MASTER-VERSION-INFORMATION", 1, 0, false);
        declareFunction("get_mysentient_master_version_information", "GET-MYSENTIENT-MASTER-VERSION-INFORMATION", 0, 0, false);
        declareFunction("initialize_mysentient_master_version_information", "INITIALIZE-MYSENTIENT-MASTER-VERSION-INFORMATION", 1, 0, false);
        declareFunction("mysentient_is_version_supportedP", "MYSENTIENT-IS-VERSION-SUPPORTED?", 2, 0, false);
        declareFunction("mysentient_are_versions_supportedP", "MYSENTIENT-ARE-VERSIONS-SUPPORTED?", 1, 0, false);
        declareFunction("mysentient_version_tagL", "MYSENTIENT-VERSION-TAG<", 2, 0, false);
        declareFunction("mysentient_adjust_assertion_directions", "MYSENTIENT-ADJUST-ASSERTION-DIRECTIONS", 0, 0, false);
        declareFunction("genls_hierarchy", "GENLS-HIERARCHY", 1, 1, false);
        declareFunction("genls_hierarchy_int", "GENLS-HIERARCHY-INT", 2, 0, false);
        declareFunction("validate_mysentient_salient_questions_for_term", "VALIDATE-MYSENTIENT-SALIENT-QUESTIONS-FOR-TERM", 1, 0, false);
        declareFunction("validate_mysentient_salient_questions", "VALIDATE-MYSENTIENT-SALIENT-QUESTIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_question_validation_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-VALIDATION-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_question_validation_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-VALIDATION-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("question_validation_test_case_p", "QUESTION-VALIDATION-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_utilities_file() {
        deflexical("*MYSENTIENT-REFORMULATOR-MEMOIZATION*", NIL);
        defparameter("*MYSENTIENT-LOGGING-IS-ENABLED?*", NIL);
        defparameter("*MYSENTIENT-LOG-RECORDS*", NIL);
        deflexical("*APACHE-LOG4J-TIMESTAMP-EPOQUE*", encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, $int$1970, ZERO_INTEGER));
        defparameter("*MYSENTIENT-TRACK-NEW-CONSTANTS?*", NIL);
        defparameter("*MYSENTIENT-NEW-CONSTANTS*", NIL);
        deflexical("*MYSENTIENT-UTTERANCE-PEG-INDEXICAL*", $$MySe_InfoTransferIndexical);
        deflexical("*MYSENTIENT-SELECT-STRING-METHODS-TO-OMIT*", $list_alt70);
        deflexical("*MYSENTIENT-PPH-DEMERIT-CUTOFF*", FOUR_INTEGER);
        deflexical("*MYSENTIENT-SALIENT-QUESTION-MT*", $$MySentientAuthoringMt);
        deflexical("*MYSE-STRATEGY-DEFAULT-CONFIDENCE-CACHING-STATE*", NIL);
        deflexical("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*", $$MySentientUserProfileGMt);
        deflexical("*MYSENTIENT-MASTER-VERSION-INFORMATION*", NIL);
        return NIL;
    }

    public static final SubLObject setup_mysentient_utilities_file() {
                utilities_macros.register_cyc_api_macro(WITH_MYSENTIENT_REFORMULATOR_MEMOIZATION, $list_alt3, $str_alt4$Execute_BODY_using_a_global_MySen);
        access_macros.register_macro_helper(FIND_OR_CREATE_MYSENTIENT_REFORMULATOR_MEMOIZATION, WITH_MYSENTIENT_REFORMULATOR_MEMOIZATION);
        utilities_macros.register_cyc_api_macro(WITH_MYSENTIENT_LOGGING, $list_alt8, $str_alt16$Enables_MySentient_logging_from_t);
        utilities_macros.register_cyc_api_macro(WITH_MYSENTIENT_TRACKING_OF_NEW_CONSTANTS, $list_alt47, $str_alt51$Enables_MySentient_tracking_of_Cy);
        utilities_macros.register_cyc_api_macro(WITHIN_MYSENTIENT_PARAPHRASE_CONTEXT, $list_alt3, $str_alt74$Execute_BODY_treating_any_paraphr);
        access_macros.register_macro_helper(WITH_MYSENTIENT_PARAPHRASE_PROBLEM_REPORTING, WITHIN_MYSENTIENT_PARAPHRASE_CONTEXT);
        access_macros.register_macro_helper(REPORT_MYSENTIENT_PARAPHRASE_PROBLEMS, WITH_MYSENTIENT_PARAPHRASE_PROBLEM_REPORTING);
        access_macros.register_macro_helper(WITH_MYSENTIENT_PARAPHRASE_PARAMETERS, WITHIN_MYSENTIENT_PARAPHRASE_CONTEXT);
        access_macros.register_external_symbol(MYSENTIENT_SALIENT_QUESTIONS_FOR_TERM);
        access_macros.register_external_symbol(MYSE_SUMMARY_SENTENCE);
        memoization_state.note_globally_cached_function(MYSE_STRATEGY_DEFAULT_CONFIDENCE);
        access_macros.register_external_symbol($sym145$MYSENTIENT_IS_VERSION_SUPPORTED_);
        access_macros.register_external_symbol($sym155$MYSENTIENT_ARE_VERSIONS_SUPPORTED_);
        sunit_external.define_test_category($$$Salient_Question_Verification, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(QUESTION_VALIDATION_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(QUESTION_VALIDATION_TEST_CASE);
        classes.subloop_new_class(QUESTION_VALIDATION_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt184);
        classes.class_set_implements_slot_listeners(QUESTION_VALIDATION_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(QUESTION_VALIDATION_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_QUESTION_VALIDATION_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(QUESTION_VALIDATION_TEST_CASE, $sym198$SUBLOOP_RESERVED_INITIALIZE_QUESTION_VALIDATION_TEST_CASE_INSTANC);
        subloop_reserved_initialize_question_validation_test_case_class(QUESTION_VALIDATION_TEST_CASE);
        sunit_macros.define_test_case_postamble(QUESTION_VALIDATION_TEST_CASE, $str_alt199$mysentient_utilities, $$$cycl, $list_alt201);
        sunit_macros.def_test_method_register(QUESTION_VALIDATION_TEST_CASE, VALIDATE);
        sunit_external.define_test_suite($$$MySentient_Utilities_Test_Suite, $list_alt201, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol WITH_REFORMULATOR_MEMOIZATION_STATE = makeSymbol("WITH-REFORMULATOR-MEMOIZATION-STATE");

    static private final SubLList $list_alt1 = list(list(makeSymbol("FIND-OR-CREATE-MYSENTIENT-REFORMULATOR-MEMOIZATION")));

    private static final SubLSymbol WITH_MYSENTIENT_REFORMULATOR_MEMOIZATION = makeSymbol("WITH-MYSENTIENT-REFORMULATOR-MEMOIZATION");

    static private final SubLList $list_alt3 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt4$Execute_BODY_using_a_global_MySen = makeString("Execute BODY using a global MySentient memoization state, creating it if reqiored.  The reformulator memoization will not be cleared.");

    private static final SubLSymbol FIND_OR_CREATE_MYSENTIENT_REFORMULATOR_MEMOIZATION = makeSymbol("FIND-OR-CREATE-MYSENTIENT-REFORMULATOR-MEMOIZATION");





    static private final SubLList $list_alt8 = list(list(makeSymbol("LOG-RECORDS")), makeSymbol("&BODY"), makeSymbol("BODY"));





    static private final SubLList $list_alt11 = list(list(makeSymbol("*MYSENTIENT-LOG-RECORDS*"), NIL), list(makeSymbol("*MYSENTIENT-LOGGING-IS-ENABLED?*"), T));



    static private final SubLList $list_alt13 = list(list(makeSymbol("GET-MYSELOG-LOG-RECORDS")));

    static private final SubLList $list_alt14 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("*MYSENTIENT-LOG-RECORDS*")), list(makeSymbol("WARN"), makeString("Logging recursion -- need to be more clever."))));

    private static final SubLSymbol WITH_MYSENTIENT_LOGGING = makeSymbol("WITH-MYSENTIENT-LOGGING");

    static private final SubLString $str_alt16$Enables_MySentient_logging_from_t = makeString("Enables MySentient logging from the top-level call.");












    static private final SubLList $list_alt25 = list(makeSymbol("MESSAGE-FORMAT"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol MYSELOG_INFO = makeSymbol("MYSELOG-INFO");



    private static final SubLSymbol MYSELOG_DEBUG = makeSymbol("MYSELOG-DEBUG");

    private static final SubLSymbol MYSELOG_ERROR = makeSymbol("MYSELOG-ERROR");

    private static final SubLSymbol MYSELOG_FINE = makeSymbol("MYSELOG-FINE");

    private static final SubLSymbol MYSELOG_FINER = makeSymbol("MYSELOG-FINER");

    private static final SubLSymbol MYSELOG_FINEST = makeSymbol("MYSELOG-FINEST");

    private static final SubLSymbol MYSELOG_WARN = makeSymbol("MYSELOG-WARN");





    public static final SubLInteger $int$1970 = makeInteger(1970);

    static private final SubLString $str_alt37$Asserted_ = makeString("Asserted ");

    static private final SubLString $str_alt38$_in_ = makeString(" in ");

    static private final SubLString $str_alt39$___Result__ = makeString(".  Result: ");

    static private final SubLString $str_alt40$Asserted__wff__ = makeString("Asserted (wff) ");

    static private final SubLString $str_alt41$Asserted__with_implicature__ = makeString("Asserted (with implicature) ");

    static private final SubLString $str_alt42$___Successful___ = makeString(".  Successful?: ");

    static private final SubLString $str_alt43$Also_added__ = makeString("Also added: ");

    static private final SubLString $str_alt44$Failure_reason__ = makeString("Failure reason: ");

    static private final SubLString $str_alt45$Unasserted_ = makeString("Unasserted ");

    static private final SubLString $str_alt46$_ = makeString(".");

    static private final SubLList $list_alt47 = list(list(makeSymbol("NEW-CONSTANTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("*MYSENTIENT-NEW-CONSTANTS*"), NIL), list(makeSymbol("*MYSENTIENT-TRACK-NEW-CONSTANTS?*"), T));

    static private final SubLList $list_alt49 = list(makeSymbol("*MYSENTIENT-NEW-CONSTANTS*"));

    private static final SubLSymbol WITH_MYSENTIENT_TRACKING_OF_NEW_CONSTANTS = makeSymbol("WITH-MYSENTIENT-TRACKING-OF-NEW-CONSTANTS");

    static private final SubLString $str_alt51$Enables_MySentient_tracking_of_Cy = makeString("Enables MySentient tracking of CycL constant creation from the top-level call.");

    static private final SubLString $str_alt52$MyS_ = makeString("MyS-");

    static private final SubLString $str_alt53$ = makeString("");

    static private final SubLString $str_alt54$Created_ = makeString("Created ");

    static private final SubLString $str_alt55$About_to_query_ = makeString("About to query ");

    static private final SubLString $str_alt56$_with_properties_ = makeString(" with properties ");

    static private final SubLString $str_alt57$For_variable_ = makeString("For variable ");

    static private final SubLString $str_alt58$__got_bindings_ = makeString(", got bindings ");

    static private final SubLString $str_alt59$_and_halt_reason_ = makeString(" and halt reason ");

    static private final SubLString $str_alt60$For_template_ = makeString("For template ");

    static private final SubLString $str_alt61$__got_query_results_ = makeString(", got query results ");

    static private final SubLString $str_alt62$Dynamic_properties__ = makeString("Dynamic properties: ");

    static private final SubLString $str_alt63$Prepared_Inference__ = makeString("Prepared Inference: ");

    static private final SubLString $str_alt64$Inference_result__ = makeString("Inference result: ");

    static private final SubLString $str_alt65$Halt_reason__ = makeString("Halt reason: ");

    static private final SubLString $str_alt66$Return_inference__ = makeString("Return inference: ");

    static private final SubLString $str_alt67$Metrics__ = makeString("Metrics: ");

    public static final SubLObject $$MySe_InfoTransferIndexical = constant_handles.reader_make_constant_shell(makeString("MySe-InfoTransferIndexical"));

    public static final SubLObject $$InfoTransferEventForPegFn = constant_handles.reader_make_constant_shell(makeString("InfoTransferEventForPegFn"));

    static private final SubLList $list_alt70 = list(makeSymbol("UNLEXIFIED-TERM-METHOD"), makeSymbol("COERCE-NAME-METHOD"));

    private static final SubLSymbol WITH_MYSENTIENT_PARAPHRASE_PROBLEM_REPORTING = makeSymbol("WITH-MYSENTIENT-PARAPHRASE-PROBLEM-REPORTING");

    private static final SubLSymbol WITH_MYSENTIENT_PARAPHRASE_PARAMETERS = makeSymbol("WITH-MYSENTIENT-PARAPHRASE-PARAMETERS");

    private static final SubLSymbol WITHIN_MYSENTIENT_PARAPHRASE_CONTEXT = makeSymbol("WITHIN-MYSENTIENT-PARAPHRASE-CONTEXT");

    static private final SubLString $str_alt74$Execute_BODY_treating_any_paraphr = makeString("Execute BODY treating any paraphrase calls as appropriate for MySentient.");

    static private final SubLSymbol $sym75$PROBLEM_DICTIONARY = makeUninternedSymbol("PROBLEM-DICTIONARY");

    private static final SubLSymbol GATHERING_PPH_PROBLEMS = makeSymbol("GATHERING-PPH-PROBLEMS");

    private static final SubLSymbol REPORT_MYSENTIENT_PARAPHRASE_PROBLEMS = makeSymbol("REPORT-MYSENTIENT-PARAPHRASE-PROBLEMS");

    static private final SubLString $str_alt78$Found_paraphrase_problems_with_ju = makeString("Found paraphrase problems with just-finished API call:");

    private static final SubLSymbol WITH_PPH_DEMERIT_CUTOFF = makeSymbol("WITH-PPH-DEMERIT-CUTOFF");

    static private final SubLList $list_alt80 = list(makeSymbol("*MYSENTIENT-PPH-DEMERIT-CUTOFF*"));

    private static final SubLSymbol OMITTING_PPH_SELECT_STRING_METHODS = makeSymbol("OMITTING-PPH-SELECT-STRING-METHODS");

    public static final SubLSymbol $mysentient_select_string_methods_to_omit$ = makeSymbol("*MYSENTIENT-SELECT-STRING-METHODS-TO-OMIT*");

    static private final SubLList $list_alt83 = list(list(makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*"), T));





    static private final SubLString $str_alt86$Unacceptable_NL_string__ = makeString("Unacceptable NL string: ");

    static private final SubLString $str_alt87$_Filtering_ = makeString(" Filtering ");

    public static final SubLObject $$MySentientAuthoringMt = constant_handles.reader_make_constant_shell(makeString("MySentientAuthoringMt"));

    static private final SubLList $list_alt89 = list(list(makeSymbol("TERM"), makeSymbol("&KEY"), list(makeSymbol("QUERY-SENTENCE"), list(QUOTE, makeSymbol("IGNORE-ME1"))), list(makeSymbol("GLOSS"), list(QUOTE, makeSymbol("IGNORE-ME2"))), list(makeSymbol("PARAPHRASE"), list(QUOTE, makeSymbol("IGNORE-ME3"))), list(makeSymbol("VAR-CHOICES-PAIRS"), list(QUOTE, makeSymbol("IGNORE-ME4")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt90 = list(makeKeyword("QUERY-SENTENCE"), makeKeyword("GLOSS"), makeKeyword("PARAPHRASE"), makeKeyword("VAR-CHOICES-PAIRS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol IGNORE_ME1 = makeSymbol("IGNORE-ME1");



    private static final SubLSymbol IGNORE_ME2 = makeSymbol("IGNORE-ME2");

    private static final SubLSymbol $PARAPHRASE = makeKeyword("PARAPHRASE");

    private static final SubLSymbol IGNORE_ME3 = makeSymbol("IGNORE-ME3");

    private static final SubLSymbol $VAR_CHOICES_PAIRS = makeKeyword("VAR-CHOICES-PAIRS");

    private static final SubLSymbol IGNORE_ME4 = makeSymbol("IGNORE-ME4");

    static private final SubLSymbol $sym100$QUESTION_SPEC = makeUninternedSymbol("QUESTION-SPEC");

    static private final SubLSymbol $sym101$QUESTION_SPECS = makeUninternedSymbol("QUESTION-SPECS");

    static private final SubLSymbol $sym102$ARG_POS = makeUninternedSymbol("ARG-POS");

    static private final SubLList $list_alt103 = list(makeSymbol("*RKF-SALIENT-DESCRIPTOR-TRANSFORMATION-CUTOFF*"), ZERO_INTEGER);

    static private final SubLList $list_alt104 = list(makeSymbol("*RKF-SD-EXCLUDE-KNOWN-PROMPTS?*"), NIL);

    private static final SubLSymbol MYSENTIENT_SALIENT_DESCRIPTOR_QUESTIONS_FOR_TERM = makeSymbol("MYSENTIENT-SALIENT-DESCRIPTOR-QUESTIONS-FOR-TERM");

    static private final SubLList $list_alt106 = list(makeSymbol("*MYSENTIENT-SALIENT-QUESTION-MT*"), makeInteger(999), ONE_INTEGER, makeInteger(1800), NIL);







    private static final SubLSymbol ARG_POSITIONS_IF_BFS = makeSymbol("ARG-POSITIONS-IF-BFS");

    static private final SubLList $list_alt111 = list(QUOTE, makeSymbol("EL-VAR?"));



    private static final SubLSymbol MAKE_FET_GLOSS_FOR_ARG_POSITION = makeSymbol("MAKE-FET-GLOSS-FOR-ARG-POSITION");

    private static final SubLSymbol GENERATE_QUESTION = makeSymbol("GENERATE-QUESTION");



    static private final SubLString $str_alt116$______Term___S = makeString("~%~%~%Term: ~S");

    public static final SubLInteger $int$999 = makeInteger(999);

    public static final SubLInteger $int$1800 = makeInteger(1800);

    static private final SubLList $list_alt119 = list(makeSymbol("QUERY-SENTENCE"), makeSymbol("IGNORE-ME4"));

    static private final SubLSymbol $sym120$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt121$____Question_CycL____S = makeString("~%~%Question CycL:~%~S");

    static private final SubLString $str_alt122$____Question_gloss____S = makeString("~%~%Question gloss:~%~S");

    static private final SubLString $str_alt123$____Question_paraphrase____S = makeString("~%~%Question paraphrase:~%~S");

    private static final SubLSymbol MYSENTIENT_SALIENT_QUESTIONS_FOR_TERM = makeSymbol("MYSENTIENT-SALIENT-QUESTIONS-FOR-TERM");

    static private final SubLList $list_alt125 = list(list($TEST, makeSymbol("EL-FORMULA-P")), list($TEST, makeSymbol("NON-EMPTY-STRING?")), list($TEST, makeSymbol("NON-EMPTY-STRING?")));

    private static final SubLSymbol MYSE_SUMMARY_SENTENCE = makeSymbol("MYSE-SUMMARY-SENTENCE");



    static private final SubLString $str_alt128$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt129$__ = makeString(") ");

    static private final SubLString $str_alt130$_is_not_a_ = makeString(" is not a ");



    private static final SubLSymbol MYSE_STRATEGY_DEFAULT_CONFIDENCE = makeSymbol("MYSE-STRATEGY-DEFAULT-CONFIDENCE");

    static private final SubLSymbol $sym133$_CONFIDENCE = makeSymbol("?CONFIDENCE");

    public static final SubLObject $$calculatedStrategyConfidence = constant_handles.reader_make_constant_shell(makeString("calculatedStrategyConfidence"));

    static private final SubLList $list_alt135 = list(makeSymbol("?CONFIDENCE"));

    static private final SubLList $list_alt136 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    public static final SubLSymbol $myse_strategy_default_confidence_caching_state$ = makeSymbol("*MYSE-STRATEGY-DEFAULT-CONFIDENCE-CACHING-STATE*");

    public static final SubLSymbol $kw138$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $$MySentientUserProfileGMt = constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileGMt"));

    static private final SubLString $str_alt140$Invalid_master_version_file__A_ = makeString("Invalid master version file ~A.");



    static private final SubLString $str_alt142$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt143 = list(CHAR_period);

    private static final SubLSymbol PARSE_INTEGER = makeSymbol("PARSE-INTEGER");

    static private final SubLSymbol $sym145$MYSENTIENT_IS_VERSION_SUPPORTED_ = makeSymbol("MYSENTIENT-IS-VERSION-SUPPORTED?");





    static private final SubLString $str_alt148$Master_version_information_not_in = makeString("Master version information not initialized.");

    private static final SubLSymbol $NOT_SUPPORTED = makeKeyword("NOT-SUPPORTED");

    static private final SubLString $$$Unknown_component = makeString("Unknown component");

    static private final SubLString $$$Outdated_version = makeString("Outdated version");



    static private final SubLString $str_alt153$Newer_than_server_version_ = makeString("Newer than server version.");

    static private final SubLString $$$Exact_version_match = makeString("Exact version match");

    static private final SubLSymbol $sym155$MYSENTIENT_ARE_VERSIONS_SUPPORTED_ = makeSymbol("MYSENTIENT-ARE-VERSIONS-SUPPORTED?");

    static private final SubLList $list_alt156 = list(makeSymbol("COMPONENT"), makeSymbol("VERSION-TAG"));



    static private final SubLString $str_alt158$Invalid_state_transition_in_MYSEN = makeString("Invalid state transition in MYSENTIENT-VERSION-TAG<");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $const161$assertionDirectionForProjectBuild = constant_handles.reader_make_constant_shell(makeString("assertionDirectionForProjectBuilds"));





    public static final SubLObject $$MySentientProject = constant_handles.reader_make_constant_shell(makeString("MySentientProject"));

    public static final SubLObject $$Code_AssertionDirection = constant_handles.reader_make_constant_shell(makeString("Code-AssertionDirection"));



    public static final SubLObject $$Backward_AssertionDirection = constant_handles.reader_make_constant_shell(makeString("Backward-AssertionDirection"));



    public static final SubLObject $$Forward_AssertionDirection = constant_handles.reader_make_constant_shell(makeString("Forward-AssertionDirection"));



    static private final SubLString $str_alt171$_A_must_be_a_collection = makeString("~A must be a collection");

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));



    static private final SubLList $list_alt174 = cons(makeSymbol("THE-TERM"), makeSymbol("PARAPHRASED-QUESTIONS"));

    static private final SubLString $str_alt175$_not_first_item_on = makeString(" not first item on");

    static private final SubLString $str_alt176$_ = makeString(" ");

    static private final SubLString $str_alt177$Got_non_list_ = makeString("Got non-list ");

    static private final SubLString $str_alt178$_for_ = makeString(" for ");

    static private final SubLString $str_alt179$Got_no_question_for_ = makeString("Got no question for ");

    static private final SubLString $$$Got_bad_question_spec = makeString("Got bad question spec");

    static private final SubLString $$$Salient_Question_Verification = makeString("Salient Question Verification");

    private static final SubLSymbol QUESTION_VALIDATION_TEST_CASE = makeSymbol("QUESTION-VALIDATION-TEST-CASE");



    static private final SubLList $list_alt184 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALIDATE"), NIL, makeKeyword("PROTECTED")));

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_VALIDATION_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-VALIDATION-TEST-CASE-CLASS");









    static private final SubLSymbol $sym198$SUBLOOP_RESERVED_INITIALIZE_QUESTION_VALIDATION_TEST_CASE_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-VALIDATION-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt199$mysentient_utilities = makeString("mysentient-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt201 = list(makeString("Salient Question Verification"));

    private static final SubLSymbol VALIDATE = makeSymbol("VALIDATE");

    static private final SubLString $$$MySentient_Utilities_Test_Suite = makeString("MySentient Utilities Test Suite");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_mysentient_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_mysentient_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mysentient_utilities_file();
    }
}

