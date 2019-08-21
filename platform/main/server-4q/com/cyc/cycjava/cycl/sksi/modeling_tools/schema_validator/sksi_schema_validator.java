package com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator;


import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.sksi_schema_validator;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.sksi_schema_validator.*;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_schema_validator extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_schema_validator();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.sksi_schema_validator";

    public static final String myFingerPrint = "d7611a81e524b2eeda1c9a722515e3658e5ea37069ca65128aa23e12d4a214e2";

    // deflexical
    // Definitions
    /**
     * the list of Cyc predicates to be used to gather any KE constraints on a given
     * term
     */
    private static final SubLSymbol $sksi_relevant_salient_descriptor_predicates$ = makeSymbol("*SKSI-RELEVANT-SALIENT-DESCRIPTOR-PREDICATES*");

    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("keRequirement")));

    public static final SubLString $str1$__Validating_the_knowledge_source = makeString("~%Validating the knowledge source ~A ... ~%");

    private static final SubLObject $$StructuredKnowledgeSource_Complex = reader_make_constant_shell(makeString("StructuredKnowledgeSource-Complex"));

    private static final SubLString $str3$Validating_the_physical_schemata_ = makeString("Validating the physical schemata...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    public static final SubLString $str5$Validating_the_sub_knowledge_sour = makeString("Validating the sub knowledge sources...");

    public static final SubLString $str6$__Validating_the_physical_schema_ = makeString("~%Validating the physical schema ~A ... ~%");

    public static final SubLString $str7$Validating_the_logical_schemata__ = makeString("Validating the logical schemata...");

    public static final SubLString $str8$Validating_the_physical_fields___ = makeString("Validating the physical fields...");

    public static final SubLString $str9$__Validating_the_logical_schema__ = makeString("~%Validating the logical schema ~A ... ~%");

    public static final SubLString $str10$Validating_the_meaning_sentences_ = makeString("Validating the meaning sentences...");

    public static final SubLString $str11$Validating_the_logical_fields___ = makeString("Validating the logical fields...");

    public static final SubLSymbol SKSI_LOGICAL_FIELD_VALIDATOR = makeSymbol("SKSI-LOGICAL-FIELD-VALIDATOR");

    private static final SubLString $str13$__The_predicate__A_is_not_a_valid = makeString("~%The predicate ~A is not a valid meaning sentence predicate (probably because it is #$backchainRequired in the content mt ~A).");

    private static final SubLString $str14$__The_following_meaning_sentence_ = makeString("~%The following meaning sentence for the logical schema ~A is not well-formed in the content mt ~A:~% ~a ~% ~s~%~%");

    private static final SubLSymbol $sym15$_FORMULA = makeSymbol("?FORMULA");

    private static final SubLString $str16$__Validating_the_requirements_for = makeString("~%Validating the requirements for ~A ... ~%");

    private static final SubLString $str17$__The_following_requirement_is_no = makeString("~%The following requirement is not satisfied for ~s:~%~s~%");

    private static final SubLList $list18 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    public static SubLObject sksi_structured_knowledge_source_validator(final SubLObject sks, final SubLObject meta_mt, SubLObject validate_sub_ksesP) {
        if (validate_sub_ksesP == UNPROVIDED) {
            validate_sub_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str1$__Validating_the_knowledge_source, sks);
        SubLObject all_requirements_satisfiedP = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                all_requirements_satisfiedP = sksi_structured_knowledge_source_validator_int(sks, meta_mt, validate_sub_ksesP);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return all_requirements_satisfiedP;
    }

    public static SubLObject sksi_structured_knowledge_source_validator_int(final SubLObject sks, final SubLObject meta_mt, final SubLObject validate_sub_ksesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_requirements_satisfiedP = sksi_term_validator(sks, meta_mt);
        SubLObject sub_kses_to_be_validatedP = NIL;
        SubLObject content_mt = NIL;
        SubLObject sub_kses = NIL;
        SubLObject physical_schemata = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(meta_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(meta_mt), thread);
            sub_kses_to_be_validatedP = makeBoolean((NIL != validate_sub_ksesP) && (NIL != isa.isaP(sks, $$StructuredKnowledgeSource_Complex, UNPROVIDED, UNPROVIDED)));
            content_mt = sksi_kb_accessors.sk_source_content_mt(sks);
            physical_schemata = sksi_kb_accessors.sk_source_physical_schemata(sks);
            if (NIL != sub_kses_to_be_validatedP) {
                sub_kses = sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sks, meta_mt);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject list_var = physical_schemata;
        SubLObject _prev_bind_3 = $progress_note$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_5 = $progress_total$.currentBinding(thread);
        SubLObject _prev_bind_6 = $progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str3$Validating_the_physical_schemata_, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject physical_schema = NIL;
                physical_schema = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject ps_satisfies_all_requirementsP = sksi_physical_schema_validator(physical_schema, meta_mt, content_mt);
                    if (NIL == ps_satisfies_all_requirementsP) {
                        all_requirements_satisfiedP = ps_satisfies_all_requirementsP;
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    physical_schema = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_10, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
            $last_percent_progress_index$.rebind(_prev_bind_7, thread);
            $progress_sofar$.rebind(_prev_bind_6, thread);
            $progress_total$.rebind(_prev_bind_5, thread);
            $progress_start_time$.rebind(_prev_bind_4, thread);
            $progress_note$.rebind(_prev_bind_3, thread);
        }
        if (NIL != sub_kses_to_be_validatedP) {
            list_var = sub_kses;
            _prev_bind_3 = $progress_note$.currentBinding(thread);
            _prev_bind_4 = $progress_start_time$.currentBinding(thread);
            _prev_bind_5 = $progress_total$.currentBinding(thread);
            _prev_bind_6 = $progress_sofar$.currentBinding(thread);
            _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str5$Validating_the_sub_knowledge_sour, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject sub_ks = NIL;
                    sub_ks = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject sub_ks_satisfies_all_requirementsP = sksi_structured_knowledge_source_validator_int(sub_ks, meta_mt, validate_sub_ksesP);
                        if (NIL == sub_ks_satisfies_all_requirementsP) {
                            all_requirements_satisfiedP = sub_ks_satisfies_all_requirementsP;
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        sub_ks = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_10, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
                $last_percent_progress_index$.rebind(_prev_bind_7, thread);
                $progress_sofar$.rebind(_prev_bind_6, thread);
                $progress_total$.rebind(_prev_bind_5, thread);
                $progress_start_time$.rebind(_prev_bind_4, thread);
                $progress_note$.rebind(_prev_bind_3, thread);
            }
        }
        return all_requirements_satisfiedP;
    }

    public static SubLObject sksi_physical_schema_validator(final SubLObject physical_schema, final SubLObject meta_mt, SubLObject content_mt) {
        if (content_mt == UNPROVIDED) {
            content_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str6$__Validating_the_physical_schema_, physical_schema);
        SubLObject all_requirements_satisfiedP = sksi_term_validator(physical_schema, meta_mt);
        SubLObject logical_schemata = NIL;
        SubLObject physical_fields = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(meta_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(meta_mt), thread);
            logical_schemata = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
            physical_fields = sksi_kb_accessors.physical_schema_fields(physical_schema);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject list_var = logical_schemata;
        SubLObject _prev_bind_3 = $progress_note$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_5 = $progress_total$.currentBinding(thread);
        SubLObject _prev_bind_6 = $progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str7$Validating_the_logical_schemata__, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject logical_schema = NIL;
                logical_schema = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject ls_satisfies_all_requirementsP = sksi_logical_schema_validator(logical_schema, meta_mt, content_mt);
                    if (NIL == ls_satisfies_all_requirementsP) {
                        all_requirements_satisfiedP = ls_satisfies_all_requirementsP;
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    logical_schema = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_10, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
            $last_percent_progress_index$.rebind(_prev_bind_7, thread);
            $progress_sofar$.rebind(_prev_bind_6, thread);
            $progress_total$.rebind(_prev_bind_5, thread);
            $progress_start_time$.rebind(_prev_bind_4, thread);
            $progress_note$.rebind(_prev_bind_3, thread);
        }
        list_var = physical_fields;
        _prev_bind_3 = $progress_note$.currentBinding(thread);
        _prev_bind_4 = $progress_start_time$.currentBinding(thread);
        _prev_bind_5 = $progress_total$.currentBinding(thread);
        _prev_bind_6 = $progress_sofar$.currentBinding(thread);
        _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str8$Validating_the_physical_fields___, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject physical_field = NIL;
                physical_field = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject pf_satisfies_all_requirementsP = sksi_physical_field_validator(physical_field, meta_mt);
                    if (NIL == pf_satisfies_all_requirementsP) {
                        all_requirements_satisfiedP = pf_satisfies_all_requirementsP;
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    physical_field = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_10, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
            $last_percent_progress_index$.rebind(_prev_bind_7, thread);
            $progress_sofar$.rebind(_prev_bind_6, thread);
            $progress_total$.rebind(_prev_bind_5, thread);
            $progress_start_time$.rebind(_prev_bind_4, thread);
            $progress_note$.rebind(_prev_bind_3, thread);
        }
        return all_requirements_satisfiedP;
    }

    public static SubLObject sksi_physical_field_validator(final SubLObject physical_field, final SubLObject meta_mt) {
        return sksi_term_validator(physical_field, meta_mt);
    }

    public static SubLObject sksi_logical_schema_validator(final SubLObject logical_schema, final SubLObject meta_mt, SubLObject content_mt) {
        if (content_mt == UNPROVIDED) {
            content_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str9$__Validating_the_logical_schema__, logical_schema);
        SubLObject all_requirements_satisfiedP = sksi_term_validator(logical_schema, meta_mt);
        final SubLObject validate_meaning_sentencesP = hlmt.hlmt_p(content_mt);
        SubLObject meaning_sentences = NIL;
        SubLObject logical_fields = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(meta_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(meta_mt), thread);
            if (NIL != validate_meaning_sentencesP) {
                meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            logical_fields = sksi_kb_accessors.logical_schema_fields(logical_schema);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != validate_meaning_sentencesP) {
            final SubLObject list_var = meaning_sentences;
            final SubLObject _prev_bind_3 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str10$Validating_the_meaning_sentences_, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject meaning_sentence = NIL;
                    meaning_sentence = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject meaning_sentence_pred_validP = sksi_meaning_sentence_pred_validP(cycl_utilities.formula_operator(meaning_sentence), content_mt);
                        final SubLObject meaning_sentence_wffP = sksi_meaning_sentence_wffP(meaning_sentence, content_mt, logical_schema);
                        if ((NIL == meaning_sentence_pred_validP) || (NIL == meaning_sentence_wffP)) {
                            all_requirements_satisfiedP = NIL;
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        meaning_sentence = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_10, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
                $last_percent_progress_index$.rebind(_prev_bind_7, thread);
                $progress_sofar$.rebind(_prev_bind_6, thread);
                $progress_total$.rebind(_prev_bind_5, thread);
                $progress_start_time$.rebind(_prev_bind_4, thread);
                $progress_note$.rebind(_prev_bind_3, thread);
            }
        }
        final SubLObject list_var = logical_fields;
        final SubLObject _prev_bind_3 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str11$Validating_the_logical_fields___, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject logical_field = NIL;
                logical_field = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject ls_satisfies_all_requirementsP = sksi_logical_field_validator(logical_field, meta_mt);
                    if (NIL == ls_satisfies_all_requirementsP) {
                        all_requirements_satisfiedP = ls_satisfies_all_requirementsP;
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    logical_field = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_10, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
            $last_percent_progress_index$.rebind(_prev_bind_7, thread);
            $progress_sofar$.rebind(_prev_bind_6, thread);
            $progress_total$.rebind(_prev_bind_5, thread);
            $progress_start_time$.rebind(_prev_bind_4, thread);
            $progress_note$.rebind(_prev_bind_3, thread);
        }
        return all_requirements_satisfiedP;
    }

    public static SubLObject sksi_logical_field_validator_internal(final SubLObject logical_field, final SubLObject meta_mt) {
        return sksi_term_validator(logical_field, meta_mt);
    }

    public static SubLObject sksi_logical_field_validator(final SubLObject logical_field, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_logical_field_validator_internal(logical_field, meta_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_LOGICAL_FIELD_VALIDATOR, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_LOGICAL_FIELD_VALIDATOR, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_LOGICAL_FIELD_VALIDATOR, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_field, meta_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_field.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && meta_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_logical_field_validator_internal(logical_field, meta_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_field, meta_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sksi_meaning_sentence_pred_validP(final SubLObject pred, final SubLObject content_mt) {
        final SubLObject validP = sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p(pred, content_mt);
        if (NIL == validP) {
            format(T, $str13$__The_predicate__A_is_not_a_valid, pred, content_mt);
        }
        return validP;
    }

    public static SubLObject sksi_meaning_sentence_wffP(final SubLObject meaning_sentence, final SubLObject content_mt, final SubLObject logical_schema) {
        return T;
    }

    public static SubLObject sksi_term_validator(final SubLObject v_term, final SubLObject meta_mt) {
        final SubLObject term_requirements = sksi_term_salient_descriptor_formulas(v_term, $sksi_relevant_salient_descriptor_predicates$.getGlobalValue(), meta_mt);
        return sksi_verify_salient_descriptor_formulas(v_term, term_requirements, meta_mt);
    }

    public static SubLObject sksi_term_salient_descriptor_formulas(final SubLObject v_term, final SubLObject pred_list, final SubLObject meta_mt) {
        final SubLObject formula_var = $sym15$_FORMULA;
        SubLObject all_sd_formulas = NIL;
        SubLObject cdolist_list_var = pred_list;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject ask_formula = make_binary_formula(pred, v_term, formula_var);
            final SubLObject sd_formulas = ask_utilities.ask_variable(formula_var, ask_formula, meta_mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            all_sd_formulas = append(sd_formulas, all_sd_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        all_sd_formulas = list_utilities.fast_delete_duplicates(all_sd_formulas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return all_sd_formulas;
    }

    public static SubLObject sksi_verify_salient_descriptor_formulas(final SubLObject v_term, final SubLObject requirements, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str16$__Validating_the_requirements_for, v_term);
        SubLObject all_requirements_satisfiedP = T;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(requirements), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = requirements;
                SubLObject requirement = NIL;
                requirement = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject satisfiedP = sksi_verify_salient_descriptor_formula(requirement, meta_mt);
                    if (NIL == satisfiedP) {
                        format(T, $str17$__The_following_requirement_is_no, v_term, requirement);
                        all_requirements_satisfiedP = satisfiedP;
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    requirement = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return all_requirements_satisfiedP;
    }

    public static SubLObject sksi_verify_salient_descriptor_formula(final SubLObject formula, final SubLObject mt) {
        final SubLObject verification_result = inference_kernel.new_cyc_query(formula, mt, $list18);
        return verification_result;
    }

    public static SubLObject declare_sksi_schema_validator_file() {
        declareFunction(me, "sksi_structured_knowledge_source_validator", "SKSI-STRUCTURED-KNOWLEDGE-SOURCE-VALIDATOR", 2, 1, false);
        declareFunction(me, "sksi_structured_knowledge_source_validator_int", "SKSI-STRUCTURED-KNOWLEDGE-SOURCE-VALIDATOR-INT", 3, 0, false);
        declareFunction(me, "sksi_physical_schema_validator", "SKSI-PHYSICAL-SCHEMA-VALIDATOR", 2, 1, false);
        declareFunction(me, "sksi_physical_field_validator", "SKSI-PHYSICAL-FIELD-VALIDATOR", 2, 0, false);
        declareFunction(me, "sksi_logical_schema_validator", "SKSI-LOGICAL-SCHEMA-VALIDATOR", 2, 1, false);
        declareFunction(me, "sksi_logical_field_validator_internal", "SKSI-LOGICAL-FIELD-VALIDATOR-INTERNAL", 2, 0, false);
        declareFunction(me, "sksi_logical_field_validator", "SKSI-LOGICAL-FIELD-VALIDATOR", 2, 0, false);
        declareFunction(me, "sksi_meaning_sentence_pred_validP", "SKSI-MEANING-SENTENCE-PRED-VALID?", 2, 0, false);
        declareFunction(me, "sksi_meaning_sentence_wffP", "SKSI-MEANING-SENTENCE-WFF?", 3, 0, false);
        declareFunction(me, "sksi_term_validator", "SKSI-TERM-VALIDATOR", 2, 0, false);
        declareFunction(me, "sksi_term_salient_descriptor_formulas", "SKSI-TERM-SALIENT-DESCRIPTOR-FORMULAS", 3, 0, false);
        declareFunction(me, "sksi_verify_salient_descriptor_formulas", "SKSI-VERIFY-SALIENT-DESCRIPTOR-FORMULAS", 3, 0, false);
        declareFunction(me, "sksi_verify_salient_descriptor_formula", "SKSI-VERIFY-SALIENT-DESCRIPTOR-FORMULA", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_schema_validator_file() {
        deflexical("*SKSI-RELEVANT-SALIENT-DESCRIPTOR-PREDICATES*", $list0);
        return NIL;
    }

    public static SubLObject setup_sksi_schema_validator_file() {
        memoization_state.note_memoized_function(SKSI_LOGICAL_FIELD_VALIDATOR);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_schema_validator_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_schema_validator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_schema_validator_file();
    }

    static {





















    }
}

/**
 * Total time: 313 ms
 */
